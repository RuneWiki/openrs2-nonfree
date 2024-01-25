import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public abstract class Class40 implements Interface19 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	private int anInt1420;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
	private int anInt1421;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	private int anInt1415 = 0;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	private int anInt1422 = -1;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Lclient!md;")
	protected final Class144_Sub1_Sub2 aClass144_Sub1_Sub2_5;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	private final int anInt1425;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "Z")
	private final boolean aBoolean102;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!md;IZ)V")
	protected Class40(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass144_Sub1_Sub2_5 = arg0;
		this.anInt1425 = arg1;
		this.aBoolean102 = arg2;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V")
	public final void method1385() {
		if (this.aClass144_Sub1_Sub2_5.aBoolean467) {
			OpenGL.glBindBufferARB(this.anInt1425, this.anInt1422);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	public void method5084(@OriginalArg(1) int arg0) {
		if (this.anInt1420 < arg0) {
			this.method1387();
			if (this.anInt1422 > 0) {
				OpenGL.glBindBufferARB(this.anInt1425, this.anInt1422);
				OpenGL.glBufferDataARBub(this.anInt1425, arg0, (byte[]) null, 0, this.aBoolean102 ? 35040 : 35044);
				this.aClass144_Sub1_Sub2_5.anInt6491 += arg0 - this.anInt1420;
			} else {
				this.aNativeHeapBuffer3 = this.aClass144_Sub1_Sub2_5.method5647(false, arg0);
			}
			this.anInt1420 = arg0;
		}
		this.anInt1421 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	private void method1387() {
		if (this.anInt1422 >= 0) {
			return;
		}
		if (this.aClass144_Sub1_Sub2_5.aBoolean467) {
			OpenGL.glGenBuffersARB(1, Static422.anIntArray373, 0);
			this.anInt1422 = Static422.anIntArray373[0];
			OpenGL.glBindBufferARB(this.anInt1425, this.anInt1422);
		} else {
			this.anInt1422 = 0;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)J")
	public final long method1388() {
		return this.anInt1422 == 0 ? this.aNativeHeapBuffer3.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;B)Z")
	protected final boolean method1390(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt1415 != 0) {
			if (this.anInt1422 > 0) {
				OpenGL.glBindBufferARB(this.anInt1425, this.anInt1422);
				if (this.anInt1415 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt1425, 0, this.anInt1420, this.aClass144_Sub1_Sub2_5.aNativeHeapBuffer6.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt1415 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;Z)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method1391(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt1415 == 0) {
			this.method1387();
			if (this.anInt1422 <= 0) {
				this.anInt1415 = 2;
				return this.aNativeHeapBuffer3;
			}
			OpenGL.glBindBufferARB(this.anInt1425, this.anInt1422);
			OpenGL.glBufferDataARBub(this.anInt1425, this.anInt1420, (byte[]) null, 0, this.aBoolean102 ? 35040 : 35044);
			if (this.anInt1421 <= this.aClass144_Sub1_Sub2_5.aNativeHeapBuffer6.b) {
				this.anInt1415 = 1;
				return this.aClass144_Sub1_Sub2_5.aNativeHeapBuffer6;
			}
			if (!arg0.a() && arg0.a(this.anInt1425, this.anInt1421, 35001)) {
				this.anInt1415 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method1392(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt1420) {
			this.method1387();
			if (this.anInt1422 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt1425, this.anInt1422);
			OpenGL.glBufferDataARBa(this.anInt1425, arg0, arg1.getAddress(), this.aBoolean102 ? 35040 : 35044);
			this.aClass144_Sub1_Sub2_5.anInt6491 += arg0 - this.anInt1421;
			this.anInt1420 = arg0;
		} else if (this.anInt1422 > 0) {
			OpenGL.glBindBufferARB(this.anInt1425, this.anInt1422);
			OpenGL.glBufferSubDataARBa(this.anInt1425, 0, this.anInt1421, arg1.getAddress());
			this.aClass144_Sub1_Sub2_5.anInt6491 += arg0 - this.anInt1421;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt1421 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public void method5842() {
		if (this.anInt1422 > 0) {
			this.aClass144_Sub1_Sub2_5.method5784(this.anInt1422, this.anInt1421);
			this.anInt1422 = -1;
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
	@Override
	public int method5839() {
		return this.anInt1421;
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5842();
		super.finalize();
	}
}
