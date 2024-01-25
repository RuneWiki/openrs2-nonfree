import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public abstract class Class122 implements Interface16 {

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	private int anInt8284;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
	private int anInt8286;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
	private int anInt8292 = 0;

	@OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
	private int anInt8298 = -1;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "Z")
	private final boolean aBoolean602;

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "Lclient!qba;")
	private final Class39_Sub2_Sub2 aClass39_Sub2_Sub2_9;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
	private final int anInt8283;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!qba;IZ)V")
	protected Class122(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean602 = arg2;
		this.aClass39_Sub2_Sub2_9 = arg0;
		this.anInt8283 = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)J")
	public final long method6942() {
		return this.anInt8298 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(Z)V")
	public final void method6943() {
		if (this.aClass39_Sub2_Sub2_9.aBoolean555) {
			OpenGL.glBindBufferARB(this.anInt8283, this.anInt8298);
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(B)V")
	private void method6944() {
		if (this.anInt8298 >= 0) {
			return;
		}
		if (this.aClass39_Sub2_Sub2_9.aBoolean555) {
			OpenGL.glGenBuffersARB(1, Static263.anIntArray439, 0);
			this.anInt8298 = Static263.anIntArray439[0];
			OpenGL.glBindBufferARB(this.anInt8283, this.anInt8298);
		} else {
			this.anInt8298 = 0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)I")
	@Override
	public int method6941() {
		return this.anInt8284;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V")
	public void method6949(@OriginalArg(1) int arg0) {
		if (this.anInt8286 < arg0) {
			this.method6944();
			if (this.anInt8298 > 0) {
				OpenGL.glBindBufferARB(this.anInt8283, this.anInt8298);
				OpenGL.glBufferDataARBub(this.anInt8283, arg0, null, 0, this.aBoolean602 ? 35040 : 35044);
				this.aClass39_Sub2_Sub2_9.anInt7272 += arg0 - this.anInt8286;
			} else {
				this.aNativeHeapBuffer8 = this.aClass39_Sub2_Sub2_9.method6115(arg0, false);
			}
			this.anInt8286 = arg0;
		}
		this.anInt8284 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!jaclib/memory/Source;B)Z")
	protected final boolean method6951(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 <= this.anInt8286) {
			if (this.anInt8298 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8283, this.anInt8298);
			OpenGL.glBufferSubDataARBa(this.anInt8283, 0, this.anInt8284, arg1.getAddress());
			this.aClass39_Sub2_Sub2_9.anInt7272 += arg0 - this.anInt8284;
		} else {
			this.method6944();
			if (this.anInt8298 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt8283, this.anInt8298);
			OpenGL.glBufferDataARBa(this.anInt8283, arg0, arg1.getAddress(), this.aBoolean602 ? 35040 : 35044);
			this.aClass39_Sub2_Sub2_9.anInt7272 += arg0 - this.anInt8284;
			this.anInt8286 = arg0;
		}
		this.anInt8284 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	public Buffer method6952() {
		if (this.anInt8292 == 0) {
			this.method6944();
			if (this.anInt8298 <= 0) {
				this.anInt8292 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt8283, this.anInt8298);
			OpenGL.glBufferDataARBub(this.anInt8283, this.anInt8286, null, 0, this.aBoolean602 ? 35040 : 35044);
			if (this.aClass39_Sub2_Sub2_9.aNativeHeapBuffer7.c >= this.anInt8284) {
				this.anInt8292 = 1;
				return this.aClass39_Sub2_Sub2_9.aNativeHeapBuffer7;
			}
			@Pc(55) MapBuffer local55 = this.aClass39_Sub2_Sub2_9.aMapBuffer1;
			if (!local55.a() && local55.a(this.anInt8283, this.anInt8284, 35001)) {
				this.anInt8292 = 2;
				return local55;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ht", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6953();
		super.finalize();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
	public void method6953() {
		if (this.anInt8298 > 0) {
			this.aClass39_Sub2_Sub2_9.method6225(this.anInt8298, this.anInt8284);
			this.anInt8298 = -1;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Z")
	public boolean method6954() {
		@Pc(13) boolean local13 = true;
		if (this.anInt8292 != 0) {
			if (this.anInt8298 > 0) {
				OpenGL.glBindBufferARB(this.anInt8283, this.anInt8298);
				if (this.anInt8292 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt8283, 0, this.anInt8286, this.aClass39_Sub2_Sub2_9.aNativeHeapBuffer7.getAddress());
				} else {
					local13 = this.aClass39_Sub2_Sub2_9.aMapBuffer1.b();
				}
			}
			this.anInt8292 = 0;
		}
		return local13;
	}
}
