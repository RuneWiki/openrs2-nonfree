import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class61_Sub3 extends Class61 implements Interface20 {

	@OriginalMember(owner = "client!nba", name = "S", descriptor = "I")
	private final int anInt5866;

	@OriginalMember(owner = "client!nba", name = "E", descriptor = "I")
	private final int anInt5852;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!mc;Lclient!nl;IIZ[BII)V")
	public Class61_Sub3(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static108.aClass82_8, arg3 * arg2, arg4);
		this.anInt5866 = arg3;
		this.anInt5852 = arg2;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method5541(arg5, arg2, arg3, super.anInt6559);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt6559, 0, this.method5535(), arg2, arg3, 0, Static564.method7708(super.aClass214_12), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!mc;IIZ[III)V")
	public Class61_Sub3(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static255.aClass214_8, Static108.aClass82_8, arg1 * arg2, arg3);
		this.anInt5866 = arg2;
		this.anInt5852 = arg1;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		if (arg3 && arg6 == 0) {
			this.method5542(arg4, arg1, arg2, super.anInt6559);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt6559, 0, 6408, this.anInt5852, this.anInt5866, 0, 32993, super.aClass121_Sub2_Sub1_5.anInt5463, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!mc;Lclient!nl;IIZ[FII)V")
	public Class61_Sub3(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static108.aClass82_12, arg3 * arg2, arg4);
		this.anInt5852 = arg2;
		this.anInt5866 = arg3;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt6559, 0, this.method5535(), arg2, arg3, 0, Static564.method7708(super.aClass214_12), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method5536(arg2, arg5, super.anInt6559, arg3);
		}
	}

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lclient!mc;Lclient!nl;Lclient!eea;II)V")
	public Class61_Sub3(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt5866 = arg4;
		this.anInt5852 = arg3;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glTexImage2Dub(super.anInt6559, 0, this.method5535(), arg3, arg4, 0, Static564.method7708(super.aClass214_12), Static414.method6081(super.aClass82_17), null, 0);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!nl;IB[BIIIII)V")
	@Override
	public void method7532(@OriginalArg(0) Class214 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg4);
		OpenGL.glTexSubImage2Dub(super.anInt6559, 0, 0, 0, arg3, arg1, Static564.method7708(arg0), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method7529(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt6559, 0, arg4, arg1, arg5, arg3, 32993, super.aClass121_Sub2_Sub1_5.anInt5463, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IF)F")
	@Override
	public float method7534(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5852;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7531(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glTexParameteri(super.anInt6559, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt6559, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(FI)F")
	@Override
	public float method7533(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt5866;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([FIIIIIILclient!nl;Z)V")
	public void method5032(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class214 arg3) {
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt6559, 0, 0, 0, arg1, arg2, Static564.method7708(arg3), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)I")
	@Override
	public int method7530() {
		return this.anInt5866;
	}

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "(I)I")
	@Override
	public int method7536() {
		return this.anInt5852;
	}

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7535() {
		return true;
	}
}
