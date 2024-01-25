import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public abstract class Class28 implements Interface15 {

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	private int anInt7124;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	private int anInt7129;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	private int anInt7121 = 0;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	private int anInt7128 = -1;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "Lclient!bga;")
	protected final Class20_Sub2_Sub2 aClass20_Sub2_Sub2_8;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	private final int anInt7134;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Z")
	private final boolean aBoolean519;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!bga;IZ)V")
	protected Class28(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass20_Sub2_Sub2_8 = arg0;
		this.anInt7134 = arg1;
		this.aBoolean519 = arg2;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;Z)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method6070(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt7121 == 0) {
			this.method6078();
			if (this.anInt7128 <= 0) {
				this.anInt7121 = 2;
				return this.aNativeHeapBuffer8;
			}
			OpenGL.glBindBufferARB(this.anInt7134, this.anInt7128);
			OpenGL.glBufferDataARBub(this.anInt7134, this.anInt7124, null, 0, this.aBoolean519 ? 35040 : 35044);
			if (this.anInt7129 <= this.aClass20_Sub2_Sub2_8.aNativeHeapBuffer5.b) {
				this.anInt7121 = 1;
				return this.aClass20_Sub2_Sub2_8.aNativeHeapBuffer5;
			}
			if (!arg0.a() && arg0.a(this.anInt7134, this.anInt7129, 35001)) {
				this.anInt7121 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method6071(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1) {
		if (arg1 > this.anInt7124) {
			this.method6078();
			if (this.anInt7128 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt7134, this.anInt7128);
			OpenGL.glBufferDataARBa(this.anInt7134, arg1, arg0.getAddress(), this.aBoolean519 ? 35040 : 35044);
			this.aClass20_Sub2_Sub2_8.anInt1524 += arg1 - this.anInt7129;
			this.anInt7124 = arg1;
		} else if (this.anInt7128 > 0) {
			OpenGL.glBindBufferARB(this.anInt7134, this.anInt7128);
			OpenGL.glBufferSubDataARBa(this.anInt7134, 0, this.anInt7129, arg0.getAddress());
			this.aClass20_Sub2_Sub2_8.anInt1524 += arg1 - this.anInt7129;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt7129 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public void method6475() {
		if (this.anInt7128 > 0) {
			this.aClass20_Sub2_Sub2_8.method1589(this.anInt7129, this.anInt7128);
			this.anInt7128 = -1;
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)J")
	public final long method6073() {
		return this.anInt7128 == 0 ? this.aNativeHeapBuffer8.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;I)Z")
	protected final boolean method6074(@OriginalArg(0) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt7121 != 0) {
			if (this.anInt7128 > 0) {
				OpenGL.glBindBufferARB(this.anInt7134, this.anInt7128);
				if (this.anInt7121 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt7134, 0, this.anInt7124, this.aClass20_Sub2_Sub2_8.aNativeHeapBuffer5.getAddress());
				} else {
					local5 = arg0.b();
				}
			}
			this.anInt7121 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public void method6476(@OriginalArg(1) int arg0) {
		if (this.anInt7124 < arg0) {
			this.method6078();
			if (this.anInt7128 <= 0) {
				this.aNativeHeapBuffer8 = this.aClass20_Sub2_Sub2_8.method1503(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt7134, this.anInt7128);
				OpenGL.glBufferDataARBub(this.anInt7134, arg0, null, 0, this.aBoolean519 ? 35040 : 35044);
				this.aClass20_Sub2_Sub2_8.anInt1524 += arg0 - this.anInt7124;
			}
			this.anInt7124 = arg0;
		}
		this.anInt7129 = arg0;
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
	public final void method6077() {
		if (this.aClass20_Sub2_Sub2_8.aBoolean140) {
			OpenGL.glBindBufferARB(this.anInt7134, this.anInt7128);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I")
	@Override
	public int method6473() {
		return this.anInt7129;
	}

	@OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6475();
		super.finalize();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
	private void method6078() {
		if (this.anInt7128 >= 0) {
			return;
		}
		if (this.aClass20_Sub2_Sub2_8.aBoolean140) {
			OpenGL.glGenBuffersARB(1, Static568.anIntArray657, 0);
			this.anInt7128 = Static568.anIntArray657[0];
			OpenGL.glBindBufferARB(this.anInt7134, this.anInt7128);
		} else {
			this.anInt7128 = 0;
		}
	}
}
