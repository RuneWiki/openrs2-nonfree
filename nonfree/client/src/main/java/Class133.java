import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public abstract class Class133 implements Interface18 {

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
	private int anInt4122;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
	private int anInt4134;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
	private int anInt4121 = 0;

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
	private int anInt4126 = -1;

	@OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
	private final int anInt4132;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Lclient!dga;")
	protected final Class75_Sub1_Sub1 aClass75_Sub1_Sub1_8;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "Z")
	private final boolean aBoolean333;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!dga;IZ)V")
	protected Class133(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt4132 = arg1;
		this.aClass75_Sub1_Sub1_8 = arg0;
		this.aBoolean333 = arg2;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)V")
	private void method3790() {
		if (this.anInt4126 >= 0) {
			return;
		}
		if (this.aClass75_Sub1_Sub1_8.aBoolean167) {
			OpenGL.glGenBuffersARB(1, Static213.anIntArray216, 0);
			this.anInt4126 = Static213.anIntArray216[0];
			OpenGL.glBindBufferARB(this.anInt4132, this.anInt4126);
		} else {
			this.anInt4126 = 0;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!jaclib/memory/Source;B)Z")
	protected final boolean method3791(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt4134) {
			this.method3790();
			if (this.anInt4126 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt4132, this.anInt4126);
			OpenGL.glBufferDataARBa(this.anInt4132, arg0, arg1.getAddress(), this.aBoolean333 ? 35040 : 35044);
			this.aClass75_Sub1_Sub1_8.anInt7649 += arg0 - this.anInt4122;
			this.anInt4134 = arg0;
		} else if (this.anInt4126 > 0) {
			OpenGL.glBindBufferARB(this.anInt4132, this.anInt4126);
			OpenGL.glBufferSubDataARBa(this.anInt4132, 0, this.anInt4122, arg1.getAddress());
			this.aClass75_Sub1_Sub1_8.anInt7649 += arg0 - this.anInt4122;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt4122 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V")
	public final void method3792() {
		if (this.aClass75_Sub1_Sub1_8.aBoolean167) {
			OpenGL.glBindBufferARB(this.anInt4132, this.anInt4126);
		}
	}

	@OriginalMember(owner = "client!rp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8675();
		super.finalize();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V")
	public void method8675() {
		if (this.anInt4126 > 0) {
			this.aClass75_Sub1_Sub1_8.method1956(this.anInt4126, this.anInt4122);
			this.anInt4126 = -1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)J")
	public final long method3795() {
		return this.anInt4126 == 0 ? this.aNativeHeapBuffer5.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public void method8679(@OriginalArg(0) int arg0) {
		if (this.anInt4134 < arg0) {
			this.method3790();
			if (this.anInt4126 > 0) {
				OpenGL.glBindBufferARB(this.anInt4132, this.anInt4126);
				OpenGL.glBufferDataARBub(this.anInt4132, arg0, (byte[]) null, 0, this.aBoolean333 ? 35040 : 35044);
				this.aClass75_Sub1_Sub1_8.anInt7649 += arg0 - this.anInt4134;
			} else {
				this.aNativeHeapBuffer5 = this.aClass75_Sub1_Sub1_8.method6822(false, arg0);
			}
			this.anInt4134 = arg0;
		}
		this.anInt4122 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method3797(@OriginalArg(0) MapBuffer arg0) {
		@Pc(13) boolean local13 = true;
		if (this.anInt4121 != 0) {
			if (this.anInt4126 > 0) {
				OpenGL.glBindBufferARB(this.anInt4132, this.anInt4126);
				if (this.anInt4121 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt4132, 0, this.anInt4134, this.aClass75_Sub1_Sub1_8.aNativeHeapBuffer8.getAddress());
				} else {
					local13 = arg0.a();
				}
			}
			this.anInt4121 = 0;
		}
		return local13;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
	@Override
	public int method8674() {
		return this.anInt4122;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;BZ)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method3798(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt4121 == 0) {
			this.method3790();
			if (this.anInt4126 <= 0) {
				this.anInt4121 = 2;
				return this.aNativeHeapBuffer5;
			}
			OpenGL.glBindBufferARB(this.anInt4132, this.anInt4126);
			OpenGL.glBufferDataARBub(this.anInt4132, this.anInt4134, (byte[]) null, 0, this.aBoolean333 ? 35040 : 35044);
			if (this.aClass75_Sub1_Sub1_8.aNativeHeapBuffer8.d >= this.anInt4122) {
				this.anInt4121 = 1;
				return this.aClass75_Sub1_Sub1_8.aNativeHeapBuffer8;
			}
			if (!arg0.b() && arg0.a(this.anInt4132, this.anInt4122, 35001)) {
				this.anInt4121 = 2;
				return arg0;
			}
		}
		return null;
	}
}
