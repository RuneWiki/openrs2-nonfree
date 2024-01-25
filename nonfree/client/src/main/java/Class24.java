import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public abstract class Class24 implements Interface2 {

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
	private int anInt9753;

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer4;

	@OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
	private int anInt9757;

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
	private int anInt9749 = 0;

	@OriginalMember(owner = "client!bca", name = "s", descriptor = "I")
	private int anInt9760 = -1;

	@OriginalMember(owner = "client!bca", name = "k", descriptor = "Lclient!nv;")
	protected final Class33_Sub2_Sub1 aClass33_Sub2_Sub1_11;

	@OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
	private final int anInt9758;

	@OriginalMember(owner = "client!bca", name = "l", descriptor = "Z")
	private final boolean aBoolean762;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!nv;IZ)V")
	protected Class24(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aClass33_Sub2_Sub1_11 = arg0;
		this.anInt9758 = arg1;
		this.aBoolean762 = arg2;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!jaggl/MapBuffer;ZI)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method8354(@OriginalArg(0) MapBuffer arg0) {
		if (this.anInt9749 == 0) {
			this.method8357();
			if (this.anInt9760 <= 0) {
				this.anInt9749 = 2;
				return this.aNativeHeapBuffer4;
			}
			OpenGL.glBindBufferARB(this.anInt9758, this.anInt9760);
			OpenGL.glBufferDataARBub(this.anInt9758, this.anInt9757, (byte[]) null, 0, this.aBoolean762 ? 35040 : 35044);
			if (this.anInt9753 <= this.aClass33_Sub2_Sub1_11.lb.a) {
				this.anInt9749 = 1;
				return this.aClass33_Sub2_Sub1_11.lb;
			}
			if (!arg0.a() && arg0.a(this.anInt9758, this.anInt9753, 35001)) {
				this.anInt9749 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V")
	public final void method8355() {
		if (this.aClass33_Sub2_Sub1_11.aBoolean504) {
			OpenGL.glBindBufferARB(this.anInt9758, this.anInt9760);
		}
	}

	@OriginalMember(owner = "client!bca", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8358();
		super.finalize();
	}

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "(I)V")
	private void method8357() {
		if (this.anInt9760 >= 0) {
			return;
		}
		if (this.aClass33_Sub2_Sub1_11.aBoolean504) {
			OpenGL.glGenBuffersARB(1, Static395.anIntArray211, 0);
			this.anInt9760 = Static395.anIntArray211[0];
			OpenGL.glBindBufferARB(this.anInt9758, this.anInt9760);
		} else {
			this.anInt9760 = 0;
		}
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)V")
	public void method8358() {
		if (this.anInt9760 > 0) {
			this.aClass33_Sub2_Sub1_11.method5752(this.anInt9753, this.anInt9760);
			this.anInt9760 = -1;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILclient!jaclib/memory/Source;)Z")
	protected final boolean method8359(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1) {
		if (arg0 > this.anInt9757) {
			this.method8357();
			if (this.anInt9760 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9758, this.anInt9760);
			OpenGL.glBufferDataARBa(this.anInt9758, arg0, arg1.getAddress(), this.aBoolean762 ? 35040 : 35044);
			this.aClass33_Sub2_Sub1_11.anInt9640 += arg0 - this.anInt9753;
			this.anInt9757 = arg0;
		} else if (this.anInt9760 > 0) {
			OpenGL.glBindBufferARB(this.anInt9758, this.anInt9760);
			OpenGL.glBufferSubDataARBa(this.anInt9758, 0, this.anInt9753, arg1.getAddress());
			this.aClass33_Sub2_Sub1_11.anInt9640 += arg0 - this.anInt9753;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9753 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V")
	public void method8360(@OriginalArg(1) int arg0) {
		if (arg0 > this.anInt9757) {
			this.method8357();
			if (this.anInt9760 <= 0) {
				this.aNativeHeapBuffer4 = this.aClass33_Sub2_Sub1_11.method8192(arg0, false);
			} else {
				OpenGL.glBindBufferARB(this.anInt9758, this.anInt9760);
				OpenGL.glBufferDataARBub(this.anInt9758, arg0, (byte[]) null, 0, this.aBoolean762 ? 35040 : 35044);
				this.aClass33_Sub2_Sub1_11.anInt9640 += arg0 - this.anInt9757;
			}
			this.anInt9757 = arg0;
		}
		this.anInt9753 = arg0;
	}

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)J")
	public final long method8361() {
		return this.anInt9760 == 0 ? this.aNativeHeapBuffer4.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLclient!jaggl/MapBuffer;)Z")
	protected final boolean method8362(@OriginalArg(1) MapBuffer arg0) {
		@Pc(11) boolean local11 = true;
		if (this.anInt9749 != 0) {
			if (this.anInt9760 > 0) {
				OpenGL.glBindBufferARB(this.anInt9758, this.anInt9760);
				if (this.anInt9749 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9758, 0, this.anInt9757, this.aClass33_Sub2_Sub1_11.lb.getAddress());
				} else {
					local11 = arg0.b();
				}
			}
			this.anInt9749 = 0;
		}
		return local11;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)I")
	@Override
	public int method8353() {
		return this.anInt9753;
	}
}
