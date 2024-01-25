import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class203_Sub2 extends Class203 implements Interface27 {

	@OriginalMember(owner = "client!me", name = "F", descriptor = "I")
	private final int anInt6658;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	private final int anInt6653;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!jc;IIZ[III)V")
	public Class203_Sub2(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static435.aClass339_15, Static120.aClass89_7, arg1 * arg2, arg3);
		this.anInt6658 = arg1;
		this.anInt6653 = arg2;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		if (arg3 && arg6 == 0) {
			this.method7705(arg2, super.anInt9085, arg1, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9085, 0, 6408, this.anInt6658, this.anInt6653, 0, 32993, super.aClass65_Sub2_Sub2_10.anInt5364, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!jc;Lclient!tn;Lclient!ds;II)V")
	public Class203_Sub2(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt6658 = arg3;
		this.anInt6653 = arg4;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glTexImage2Dub(super.anInt9085, 0, this.method7709(), arg3, arg4, 0, Static111.method4956(super.aClass339_14), Static439.method6408(super.aClass89_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!jc;Lclient!tn;IIZ[FII)V")
	public Class203_Sub2(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static120.aClass89_11, arg3 * arg2, arg4);
		this.anInt6653 = arg3;
		this.anInt6658 = arg2;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9085, 0, this.method7709(), arg2, arg3, 0, Static111.method4956(super.aClass339_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7710(arg3, arg5, super.anInt9085, arg2);
		}
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!jc;Lclient!tn;IIZ[BII)V")
	public Class203_Sub2(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static120.aClass89_7, arg2 * arg3, arg4);
		this.anInt6658 = arg2;
		this.anInt6653 = arg3;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7711(arg5, arg3, arg2, super.anInt9085);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9085, 0, this.method7709(), arg2, arg3, 0, Static111.method4956(super.aClass339_14), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5624() {
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
	@Override
	public int method5619() {
		return this.anInt6658;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!tn;IIBI[BII)V")
	@Override
	public void method5621(@OriginalArg(1) Class339 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4) {
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Dub(super.anInt9085, 0, 0, 0, arg4, arg2, Static111.method4956(arg0), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z[IIIIIII)V")
	@Override
	public void method5620(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt9085, 0, arg1, arg3, arg4, arg2, 32993, super.aClass65_Sub2_Sub2_10.anInt5364, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZF)F")
	@Override
	public float method5622(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6658;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method5618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glTexParameteri(super.anInt9085, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9085, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IF)F")
	@Override
	public float method5617(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6653;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method5623(@OriginalArg(0) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt6653 * this.anInt6658];
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glGetTexImagei(super.anInt9085, 0, 32993, 5121, local12, 0);
		for (@Pc(35) int local35 = 0; local35 < arg1; local35++) {
			Static686.method4967(local12, (arg1 - local35 - 1) * this.anInt6658, arg0, arg2 * local35, arg2);
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	@Override
	public int method5625() {
		return this.anInt6653;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([FLclient!tn;IIIIIII)V")
	public void method5554(@OriginalArg(0) float[] arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(7) int arg3) {
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9085, 0, 0, 0, arg2, arg3, Static111.method4956(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
