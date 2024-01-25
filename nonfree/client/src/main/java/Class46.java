import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public abstract class Class46 implements Interface12 {

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
	private int anInt10200;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
	private int anInt10201;

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
	private int anInt10202 = 0;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
	private int anInt10207 = -1;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "Z")
	private final boolean aBoolean702;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "Lclient!ad;")
	protected final Class7_Sub1_Sub1 aClass7_Sub1_Sub1_12;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
	private final int anInt10194;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!ad;IZ)V")
	protected Class46(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean702 = arg2;
		this.aClass7_Sub1_Sub1_12 = arg0;
		this.anInt10194 = arg1;
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)J")
	public final long method7924() {
		return this.anInt10207 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public void method7925() {
		if (this.anInt10207 > 0) {
			this.aClass7_Sub1_Sub1_12.method636(this.anInt10207, this.anInt10200);
			this.anInt10207 = -1;
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
	public final void method7926() {
		if (this.aClass7_Sub1_Sub1_12.aBoolean74) {
			OpenGL.glBindBufferARB(this.anInt10194, this.anInt10207);
		}
	}

	@OriginalMember(owner = "client!bw", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7925();
		super.finalize();
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V")
	private void method7928() {
		if (this.anInt10207 >= 0) {
			return;
		}
		if (this.aClass7_Sub1_Sub1_12.aBoolean74) {
			OpenGL.glGenBuffersARB(1, Static440.anIntArray489, 0);
			this.anInt10207 = Static440.anIntArray489[0];
			OpenGL.glBindBufferARB(this.anInt10194, this.anInt10207);
		} else {
			this.anInt10207 = 0;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BILclient!jaclib/memory/Source;)Z")
	protected final boolean method7930(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 > this.anInt10201) {
			this.method7928();
			if (this.anInt10207 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt10194, this.anInt10207);
			OpenGL.glBufferDataARBa(this.anInt10194, arg0, arg1.getAddress(), this.aBoolean702 ? 35040 : 35044);
			this.aClass7_Sub1_Sub1_12.anInt7339 += arg0 - this.anInt10200;
			this.anInt10201 = arg0;
		} else if (this.anInt10207 > 0) {
			OpenGL.glBindBufferARB(this.anInt10194, this.anInt10207);
			OpenGL.glBufferSubDataARBa(this.anInt10194, 0, this.anInt10200, arg1.getAddress());
			this.aClass7_Sub1_Sub1_12.anInt7339 += arg0 - this.anInt10200;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt10200 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZZ)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method7931(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt10202 == 0) {
			this.method7928();
			if (this.anInt10207 <= 0) {
				this.anInt10202 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt10194, this.anInt10207);
			OpenGL.glBufferDataARBub(this.anInt10194, this.anInt10201, null, 0, this.aBoolean702 ? 35040 : 35044);
			if (this.aClass7_Sub1_Sub1_12.aNativeHeapBuffer5.b >= this.anInt10200) {
				this.anInt10202 = 1;
				return this.aClass7_Sub1_Sub1_12.aNativeHeapBuffer5;
			}
			if (!arg0.b() && arg0.a(this.anInt10194, this.anInt10200, 35001)) {
				this.anInt10202 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	public void method7932(@OriginalArg(1) int arg0) {
		if (this.anInt10201 < arg0) {
			this.method7928();
			if (this.anInt10207 > 0) {
				OpenGL.glBindBufferARB(this.anInt10194, this.anInt10207);
				OpenGL.glBufferDataARBub(this.anInt10194, arg0, null, 0, this.aBoolean702 ? 35040 : 35044);
				this.aClass7_Sub1_Sub1_12.anInt7339 += arg0 - this.anInt10201;
			} else {
				this.aNativeHeapBuffer8 = this.aClass7_Sub1_Sub1_12.method5725(arg0, false);
			}
			this.anInt10201 = arg0;
		}
		this.anInt10200 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method7933(@OriginalArg(0) MapBuffer arg0) {
		@Pc(10) boolean local10 = true;
		if (this.anInt10202 != 0) {
			if (this.anInt10207 > 0) {
				OpenGL.glBindBufferARB(this.anInt10194, this.anInt10207);
				if (this.anInt10202 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt10194, 0, this.anInt10201, this.aClass7_Sub1_Sub1_12.aNativeHeapBuffer5.getAddress());
				} else {
					local10 = arg0.a();
				}
			}
			this.anInt10202 = 0;
		}
		return local10;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
	@Override
	public int method7923() {
		return this.anInt10200;
	}
}
