import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class188_Sub3 extends Class188 implements Interface11 {

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
	private final int anInt9120;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
	private final int anInt9125;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!kd;Lclient!wu;II[FII)V")
	public Class188_Sub3(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static42.aClass35_8, arg3 * arg2, false);
		this.anInt9120 = arg3;
		this.anInt9125 = arg2;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9239, 0, this.method7377(), arg2, arg3, 0, Static280.method4043(super.aClass366_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!kd;Lclient!wu;II[BII)V")
	public Class188_Sub3(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static42.aClass35_4, arg2 * arg3, false);
		this.anInt9120 = arg3;
		this.anInt9125 = arg2;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9239, 0, this.method7377(), arg2, arg3, 0, Static280.method4043(super.aClass366_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!kd;II[III)V")
	public Class188_Sub3(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static225.aClass366_3, Static42.aClass35_4, arg1 * arg2, false);
		this.anInt9125 = arg1;
		this.anInt9120 = arg2;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9239, 0, 6408, this.anInt9125, this.anInt9120, 0, 32993, super.aClass162_Sub1_Sub2_12.anInt4711, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!kd;Lclient!wu;Lclient!bk;II)V")
	public Class188_Sub3(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt9125 = arg3;
		this.anInt9120 = arg4;
		super.aClass162_Sub1_Sub2_12.method3865(this);
		OpenGL.glTexImage2Dub(super.anInt9239, 0, this.method7377(), arg3, arg4, 0, Static280.method4043(super.aClass366_14), Static582.method7549(super.aClass35_19), null, 0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IF)F")
	@Override
	public float method7640(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method7637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		super.aClass162_Sub1_Sub2_12.method3865(this);
		if (arg0 == 0) {
			arg0 = arg5;
		}
		if (arg5 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt9239, 0, arg1, arg4, arg5, arg3, 32993, super.aClass162_Sub1_Sub2_12.anInt4711, arg2, 0);
		if (arg5 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method7639(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	@Override
	public int method7642() {
		return this.anInt9120;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII[BLclient!wu;I)V")
	@Override
	public void method7641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) Class366 arg4) {
		super.aClass162_Sub1_Sub2_12.method3865(this);
		if (arg2 == 0) {
			arg2 = arg1;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9239, 0, 0, 0, arg1, arg0, Static280.method4043(arg4), 5121, arg3, 0);
		if (arg2 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(FI)F")
	@Override
	public float method7636(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7643() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)I")
	@Override
	public int method7638() {
		return this.anInt9125;
	}
}
