import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public abstract class Class115 implements Interface10 {

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
	private int anInt6881;

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
	private int anInt6894;

	@OriginalMember(owner = "client!vu", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	private int anInt6876 = -1;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
	private int anInt6885 = 0;

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
	private final int anInt6891;

	@OriginalMember(owner = "client!vu", name = "w", descriptor = "Z")
	private final boolean aBoolean528;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "Lclient!tba;")
	protected final Class78_Sub1_Sub2 aClass78_Sub1_Sub2_8;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!tba;IZ)V")
	protected Class115(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.anInt6891 = arg1;
		this.aBoolean528 = arg2;
		this.aClass78_Sub1_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method5558(@OriginalArg(1) MapBuffer arg0) {
		@Pc(5) boolean local5 = true;
		if (this.anInt6885 != 0) {
			if (this.anInt6876 > 0) {
				OpenGL.glBindBufferARB(this.anInt6891, this.anInt6876);
				if (this.anInt6885 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt6891, 0, this.anInt6881, this.aClass78_Sub1_Sub2_8.aNativeHeapBuffer8.getAddress());
				} else {
					local5 = arg0.a();
				}
			}
			this.anInt6885 = 0;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5601();
		super.finalize();
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(Z)V")
	public final void method5560() {
		if (this.aClass78_Sub1_Sub2_8.aBoolean655) {
			OpenGL.glBindBufferARB(this.anInt6891, this.anInt6876);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!jaclib/memory/Source;I)Z")
	protected final boolean method5562(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt6881) {
			this.method5565();
			if (this.anInt6876 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt6891, this.anInt6876);
			OpenGL.glBufferDataARBa(this.anInt6891, arg0, arg1.getAddress(), this.aBoolean528 ? 35040 : 35044);
			this.aClass78_Sub1_Sub2_8.anInt8557 += arg0 - this.anInt6894;
			this.anInt6881 = arg0;
		} else if (this.anInt6876 > 0) {
			OpenGL.glBindBufferARB(this.anInt6891, this.anInt6876);
			OpenGL.glBufferSubDataARBa(this.anInt6891, 0, this.anInt6894, arg1.getAddress());
			this.aClass78_Sub1_Sub2_8.anInt8557 += arg0 - this.anInt6894;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt6894 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;IZ)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method5563(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt6885 == 0) {
			this.method5565();
			if (this.anInt6876 <= 0) {
				this.anInt6885 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt6891, this.anInt6876);
			OpenGL.glBufferDataARBub(this.anInt6891, this.anInt6881, null, 0, this.aBoolean528 ? 35040 : 35044);
			if (this.anInt6894 <= this.aClass78_Sub1_Sub2_8.aNativeHeapBuffer8.c) {
				this.anInt6885 = 1;
				return this.aClass78_Sub1_Sub2_8.aNativeHeapBuffer8;
			}
			if (!arg0.b() && arg0.a(this.anInt6891, this.anInt6894, 35001)) {
				this.anInt6885 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)V")
	public void method5600(@OriginalArg(0) int arg0) {
		if (this.anInt6881 < arg0) {
			this.method5565();
			if (this.anInt6876 <= 0) {
				this.aNativeHeapBuffer7 = this.aClass78_Sub1_Sub2_8.method6891(false, arg0);
			} else {
				OpenGL.glBindBufferARB(this.anInt6891, this.anInt6876);
				OpenGL.glBufferDataARBub(this.anInt6891, arg0, null, 0, this.aBoolean528 ? 35040 : 35044);
				this.aClass78_Sub1_Sub2_8.anInt8557 += arg0 - this.anInt6881;
			}
			this.anInt6881 = arg0;
		}
		this.anInt6894 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)V")
	private void method5565() {
		if (this.anInt6876 >= 0) {
			return;
		}
		if (this.aClass78_Sub1_Sub2_8.aBoolean655) {
			OpenGL.glGenBuffersARB(1, Static122.anIntArray96, 0);
			this.anInt6876 = Static122.anIntArray96[0];
			OpenGL.glBindBufferARB(this.anInt6891, this.anInt6876);
		} else {
			this.anInt6876 = 0;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
	public void method5601() {
		if (this.anInt6876 > 0) {
			this.aClass78_Sub1_Sub2_8.method6988(this.anInt6894, this.anInt6876);
			this.anInt6876 = -1;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)J")
	public final long method5568() {
		return this.anInt6876 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)I")
	@Override
	public int method5598() {
		return this.anInt6894;
	}
}
