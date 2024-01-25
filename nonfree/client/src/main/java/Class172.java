import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public abstract class Class172 implements Interface13 {

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	private int anInt7654;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
	private int anInt7658;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
	private int anInt7657 = -1;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
	private int anInt7660 = 0;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	private final int anInt7651;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Z")
	private final boolean aBoolean544;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Lclient!om;")
	protected final Class133_Sub1_Sub2 aClass133_Sub1_Sub2_12;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!om;IZ)V")
	protected Class172(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt7651 = arg1;
		this.aBoolean544 = arg2;
		this.aClass133_Sub1_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)J")
	public final long method6759() {
		return this.anInt7657 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
	@Override
	public int method6758() {
		return this.anInt7658;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;Z)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method6761(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt7660 == 0) {
			this.method6766();
			if (this.anInt7657 <= 0) {
				this.anInt7660 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt7651, this.anInt7657);
			OpenGL.glBufferDataARBub(this.anInt7651, this.anInt7654, null, 0, this.aBoolean544 ? 35040 : 35044);
			if (this.aClass133_Sub1_Sub2_12.aNativeHeapBuffer7.c >= this.anInt7658) {
				this.anInt7660 = 1;
				return this.aClass133_Sub1_Sub2_12.aNativeHeapBuffer7;
			}
			if (!arg0.b() && arg0.a(this.anInt7651, this.anInt7658, 35001)) {
				this.anInt7660 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method6762(@OriginalArg(1) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt7660 != 0) {
			if (this.anInt7657 > 0) {
				OpenGL.glBindBufferARB(this.anInt7651, this.anInt7657);
				if (this.anInt7660 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7651, 0, this.anInt7654, this.aClass133_Sub1_Sub2_12.aNativeHeapBuffer7.getAddress());
				} else {
					local5 = arg0.a();
				}
			}
			this.anInt7660 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!jaclib/memory/Source;)Z")
	protected final boolean method6763(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 > this.anInt7654) {
			this.method6766();
			if (this.anInt7657 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7651, this.anInt7657);
			OpenGL.glBufferDataARBa(this.anInt7651, arg0, arg1.getAddress(), this.aBoolean544 ? 35040 : 35044);
			this.aClass133_Sub1_Sub2_12.anInt6969 += arg0 - this.anInt7658;
			this.anInt7654 = arg0;
		} else if (this.anInt7657 > 0) {
			OpenGL.glBindBufferARB(this.anInt7651, this.anInt7657);
			OpenGL.glBufferSubDataARBa(this.anInt7651, 0, this.anInt7658, arg1.getAddress());
			this.aClass133_Sub1_Sub2_12.anInt6969 += arg0 - this.anInt7658;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt7658 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
	public void method6764(@OriginalArg(1) int arg0) {
		if (this.anInt7654 < arg0) {
			this.method6766();
			if (this.anInt7657 > 0) {
				OpenGL.glBindBufferARB(this.anInt7651, this.anInt7657);
				OpenGL.glBufferDataARBub(this.anInt7651, arg0, null, 0, this.aBoolean544 ? 35040 : 35044);
				this.aClass133_Sub1_Sub2_12.anInt6969 += arg0 - this.anInt7654;
			} else {
				this.aNativeHeapBuffer8 = this.aClass133_Sub1_Sub2_12.method6280(false, arg0);
			}
			this.anInt7654 = arg0;
		}
		this.anInt7658 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public void method6765() {
		if (this.anInt7657 > 0) {
			this.aClass133_Sub1_Sub2_12.method6289(this.anInt7657, this.anInt7658);
			this.anInt7657 = -1;
		}
	}

	@OriginalMember(owner = "client!wr", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6765();
		super.finalize();
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
	private void method6766() {
		if (this.anInt7657 >= 0) {
			return;
		}
		if (this.aClass133_Sub1_Sub2_12.aBoolean506) {
			OpenGL.glGenBuffersARB(1, Static359.anIntArray333, 0);
			this.anInt7657 = Static359.anIntArray333[0];
			OpenGL.glBindBufferARB(this.anInt7651, this.anInt7657);
		} else {
			this.anInt7657 = 0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V")
	public final void method6767() {
		if (this.aClass133_Sub1_Sub2_12.aBoolean506) {
			OpenGL.glBindBufferARB(this.anInt7651, this.anInt7657);
		}
	}
}
