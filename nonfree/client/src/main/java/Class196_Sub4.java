import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class196_Sub4 extends Class196 implements Interface6 {

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
	private final int anInt10137;

	@OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
	private final int anInt10134;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!dda;Lclient!fca;II[FII)V")
	public Class196_Sub4(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static53.aClass42_8, arg2 * arg3, false);
		this.anInt10137 = arg3;
		this.anInt10134 = arg2;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10110, 0, this.method8276(), arg2, arg3, 0, Static445.method6846(super.aClass97_56), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!dda;Lclient!fca;Lclient!bv;II)V")
	public Class196_Sub4(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt10134 = arg3;
		this.anInt10137 = arg4;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glTexImage2Dub(super.anInt10110, 0, this.method8276(), arg3, arg4, 0, Static445.method6846(super.aClass97_56), Static346.method5590(super.aClass42_20), null, 0);
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!dda;Lclient!fca;II[BII)V")
	public Class196_Sub4(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static53.aClass42_4, arg3 * arg2, false);
		this.anInt10137 = arg3;
		this.anInt10134 = arg2;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10110, 0, this.method8276(), arg2, arg3, 0, Static445.method6846(super.aClass97_56), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!dda;II[III)V")
	public Class196_Sub4(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static7.aClass97_5, Static53.aClass42_4, arg1 * arg2, false);
		this.anInt10137 = arg2;
		this.anInt10134 = arg1;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10110, 0, 6408, this.anInt10134, this.anInt10137, 0, 32993, super.aClass44_Sub2_Sub1_12.anInt2122, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IF)F")
	@Override
	public float method8282(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I")
	@Override
	public int method8288() {
		return this.anInt10137;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method8287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		super.aClass44_Sub2_Sub1_12.method4265(this);
		if (arg5 == 0) {
			arg5 = arg2;
		}
		if (arg5 != arg2) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt10110, 0, arg1, arg4, arg2, arg0, 32993, super.aClass44_Sub2_Sub1_12.anInt2122, arg3, 0);
		if (arg2 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8281(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8283() {
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZIIIIIILclient!fca;[B)V")
	@Override
	public void method8286(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) Class97 arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass44_Sub2_Sub1_12.method4265(this);
		if (arg0 == 0) {
			arg0 = arg2;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10110, 0, 0, 0, arg2, arg1, Static445.method6846(arg3), 5121, arg4, 0);
		if (arg0 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(FI)F")
	@Override
	public float method8285(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I")
	@Override
	public int method8284() {
		return this.anInt10134;
	}
}
