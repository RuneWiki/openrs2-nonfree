import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class7_Sub4_Sub11 extends Class7_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
	private int anInt4672 = -1;

	@OriginalMember(owner = "client!nt", name = "D", descriptor = "I")
	private int anInt4676 = -1;

	@OriginalMember(owner = "client!nt", name = "J", descriptor = "I")
	public final int anInt4680;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
	private final int anInt4667;

	@OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
	public final int anInt4673;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_31;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
	private int anInt4668;

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
	private final int anInt4670;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!vd;III)V")
	public Class7_Sub4_Sub11(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4680 = arg3;
		this.anInt4667 = arg1;
		this.anInt4673 = arg2;
		this.aClass51_Sub2_31 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static368.anIntArray542, 0);
		this.anInt4668 = Static368.anIntArray542[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4668);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt4667, this.anInt4673, this.anInt4680);
		this.anInt4670 = this.anInt4680 * this.anInt4673 * this.aClass51_Sub2_31.method5387(this.anInt4667);
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!vd;IIII)V")
	public Class7_Sub4_Sub11(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4667 = arg1;
		this.anInt4680 = arg3;
		this.aClass51_Sub2_31 = arg0;
		this.anInt4673 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static368.anIntArray542, 0);
		this.anInt4668 = Static368.anIntArray542[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4668);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt4667, this.anInt4673, this.anInt4680);
		this.anInt4670 = this.anInt4673 * this.anInt4680 * this.aClass51_Sub2_31.method5387(this.anInt4667);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBI)V")
	public void method3707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt4668);
		this.anInt4672 = arg0;
		this.anInt4676 = arg1;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	@Override
	public void method5755() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt4672, this.anInt4676, 36161, 0);
		this.anInt4672 = -1;
		this.anInt4676 = -1;
	}

	@OriginalMember(owner = "client!nt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3712();
		super.finalize();
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)V")
	public void method3712() {
		if (this.anInt4668 > 0) {
			this.aClass51_Sub2_31.method5435(this.anInt4670, this.anInt4668);
			this.anInt4668 = 0;
		}
	}
}
