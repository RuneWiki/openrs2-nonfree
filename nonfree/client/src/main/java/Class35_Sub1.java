import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
	private int anInt799 = -1;

	@OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
	private int anInt804 = -1;

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
	public final int anInt798;

	@OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
	public final int anInt800;

	@OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
	public final int anInt801;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!pea;IIII[BI)V")
	public Class35_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt798 = arg2;
		this.anInt800 = arg3;
		this.anInt801 = arg4;
		super.aClass121_Sub3_31.method5713(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6267, 0, super.anInt6269, this.anInt798, this.anInt800, this.anInt801, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5329(true);
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!pea;IIII)V")
	public Class35_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt800 = arg3;
		this.anInt798 = arg2;
		this.anInt801 = arg4;
		super.aClass121_Sub3_31.method5713(this);
		OpenGL.glTexImage3Dub(super.anInt6267, 0, super.anInt6269, this.anInt798, this.anInt800, this.anInt801, 0, Static436.method6280(super.anInt6269), 5121, null, 0);
		this.method5329(true);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	@Override
	public void method5323() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt799, this.anInt804, super.anInt6267, 0, 0, 0);
		this.anInt804 = -1;
		this.anInt799 = -1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIIII)V")
	public void method649(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass121_Sub3_31.method5713(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6267, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
