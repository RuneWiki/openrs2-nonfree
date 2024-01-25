import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class188_Sub2 extends Class188 implements Interface11 {

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	private final int anInt6030;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
	private final int anInt6033;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!kd;Lclient!wu;IIZ[FII)V")
	public Class188_Sub2(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static42.aClass35_8, arg2 * arg3, arg4);
		this.anInt6030 = arg3;
		this.anInt6033 = arg2;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9239, 0, this.method7377(), arg2, arg3, 0, Static280.method4043(super.aClass366_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7379(arg2, arg5, arg3, super.anInt9239);
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!kd;Lclient!wu;IIZ[BII)V")
	public Class188_Sub2(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static42.aClass35_4, arg3 * arg2, arg4);
		this.anInt6030 = arg3;
		this.anInt6033 = arg2;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7382(arg2, arg5, arg3, super.anInt9239);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9239, 0, this.method7377(), arg2, arg3, 0, Static280.method4043(super.aClass366_14), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!kd;IIZ[III)V")
	public Class188_Sub2(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static225.aClass366_3, Static42.aClass35_4, arg1 * arg2, arg3);
		this.anInt6030 = arg2;
		this.anInt6033 = arg1;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		if (arg3 && arg6 == 0) {
			this.method7384(arg4, super.anInt9239, arg1, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9239, 0, 6408, this.anInt6033, this.anInt6030, 0, 32993, super.aClass162_Sub1_Sub2_12.anInt4711, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!kd;Lclient!wu;Lclient!bk;II)V")
	public Class188_Sub2(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt6033 = arg3;
		this.anInt6030 = arg4;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glTexImage2Dub(super.anInt9239, 0, this.method7377(), arg3, arg4, 0, Static280.method4043(super.aClass366_14), Static582.method7549(super.aClass35_19), null, 0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7643() {
		return true;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method7639(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glTexParameteri(super.anInt9239, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9239, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FI)F")
	@Override
	public float method7636(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6030;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)I")
	@Override
	public int method7642() {
		return this.anInt6030;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IF)F")
	@Override
	public float method7640(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6033;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)I")
	@Override
	public int method7638() {
		return this.anInt6033;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII[BLclient!wu;I)V")
	@Override
	public void method7641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class366 arg4) {
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Dub(super.anInt9239, 0, 0, 0, arg1, arg0, Static280.method4043(arg4), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method7637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt9239, 0, arg1, arg4, arg5, arg3, 32993, super.aClass162_Sub1_Sub2_12.anInt4711, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII[FIILclient!wu;)V")
	public void method5070(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) float[] arg2, @OriginalArg(8) Class366 arg3) {
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9239, 0, 0, 0, arg0, arg1, Static280.method4043(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
