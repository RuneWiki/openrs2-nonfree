import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class196_Sub2 extends Class196 implements Interface6 {

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
	private final int anInt6961;

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
	private final int anInt6960;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!dda;Lclient!fca;IIZ[BII)V")
	public Class196_Sub2(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static53.aClass42_4, arg3 * arg2, arg4);
		this.anInt6961 = arg3;
		this.anInt6960 = arg2;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8280(arg2, arg3, arg5, super.anInt10110);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10110, 0, this.method8276(), arg2, arg3, 0, Static445.method6846(super.aClass97_56), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!dda;Lclient!fca;Lclient!bv;II)V")
	public Class196_Sub2(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt6961 = arg4;
		this.anInt6960 = arg3;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glTexImage2Dub(super.anInt10110, 0, this.method8276(), arg3, arg4, 0, Static445.method6846(super.aClass97_56), Static346.method5590(super.aClass42_20), null, 0);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!dda;Lclient!fca;IIZ[FII)V")
	public Class196_Sub2(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static53.aClass42_8, arg3 * arg2, arg4);
		this.anInt6960 = arg2;
		this.anInt6961 = arg3;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10110, 0, this.method8276(), arg2, arg3, 0, Static445.method6846(super.aClass97_56), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8279(arg3, arg5, super.anInt10110, arg2);
		}
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!dda;IIZ[III)V")
	public Class196_Sub2(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static7.aClass97_5, Static53.aClass42_4, arg1 * arg2, arg3);
		this.anInt6960 = arg1;
		this.anInt6961 = arg2;
		super.aClass44_Sub2_Sub1_12.method4265(this);
		if (arg3 && arg6 == 0) {
			this.method8278(arg1, arg2, super.anInt10110, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10110, 0, 6408, this.anInt6960, this.anInt6961, 0, 32993, super.aClass44_Sub2_Sub1_12.anInt2122, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8281(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glTexParameteri(super.anInt10110, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10110, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)I")
	@Override
	public int method8284() {
		return this.anInt6960;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8283() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIIIIILclient!fca;[B)V")
	@Override
	public void method8286(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(7) Class97 arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt10110, 0, 0, 0, arg2, arg1, Static445.method6846(arg3), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IF)F")
	@Override
	public float method8282(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6960;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method8287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt10110, 0, arg1, arg4, arg2, arg0, 32993, super.aClass44_Sub2_Sub1_12.anInt2122, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I")
	@Override
	public int method8288() {
		return this.anInt6961;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(FI)F")
	@Override
	public float method8285(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6961;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([FZIIIIILclient!fca;I)V")
	public void method5787(@OriginalArg(0) float[] arg0, @OriginalArg(6) int arg1, @OriginalArg(7) Class97 arg2, @OriginalArg(8) int arg3) {
		super.aClass44_Sub2_Sub1_12.method4265(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10110, 0, 0, 0, arg1, arg3, Static445.method6846(arg2), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
