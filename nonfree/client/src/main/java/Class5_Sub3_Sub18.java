import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class5_Sub3_Sub18 extends Class5_Sub3 implements Interface26 {

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
	private int anInt8730 = -1;

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
	private int anInt8734 = -1;

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "I")
	public final int anInt8735;

	@OriginalMember(owner = "client!ru", name = "B", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_33;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
	public final int anInt8729;

	@OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
	private final int anInt8737;

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
	private int anInt8732;

	@OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
	private final int anInt8736;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!ck;III)V")
	public Class5_Sub3_Sub18(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8735 = arg2;
		this.aClass65_Sub1_33 = arg0;
		this.anInt8729 = arg3;
		this.anInt8737 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static607.anIntArray458, 0);
		this.anInt8732 = Static607.anIntArray458[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt8732);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt8737, this.anInt8735, this.anInt8729);
		this.anInt8736 = this.anInt8735 * this.anInt8729 * this.aClass65_Sub1_33.method1257(this.anInt8737);
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!ck;IIII)V")
	public Class5_Sub3_Sub18(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8729 = arg3;
		this.aClass65_Sub1_33 = arg0;
		this.anInt8735 = arg2;
		this.anInt8737 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static607.anIntArray458, 0);
		this.anInt8732 = Static607.anIntArray458[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt8732);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt8737, this.anInt8735, this.anInt8729);
		this.anInt8736 = this.anInt8735 * this.anInt8729 * this.aClass65_Sub1_33.method1257(this.anInt8737);
	}

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(B)V")
	public void method7434() {
		if (this.anInt8732 > 0) {
			this.aClass65_Sub1_33.method1239(this.anInt8736, this.anInt8732);
			this.anInt8732 = 0;
		}
	}

	@OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method7434();
		super.finalize();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZII)V")
	public void method7435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt8732);
		this.anInt8730 = arg1;
		this.anInt8734 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
	@Override
	public void method7433() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt8734, this.anInt8730, 36161, 0);
		this.anInt8730 = -1;
		this.anInt8734 = -1;
	}
}
