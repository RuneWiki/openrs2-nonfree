import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class203_Sub1 extends Class203 implements Interface27 {

	@OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
	private final int anInt6097;

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
	private final int anInt6089;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!jc;II[III)V")
	public Class203_Sub1(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static435.aClass339_15, Static120.aClass89_7, arg1 * arg2, false);
		this.anInt6097 = arg1;
		this.anInt6089 = arg2;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9085, 0, 6408, this.anInt6097, this.anInt6089, 0, 32993, super.aClass65_Sub2_Sub2_10.anInt5364, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!jc;Lclient!tn;II[BII)V")
	public Class203_Sub1(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static120.aClass89_7, arg2 * arg3, false);
		this.anInt6097 = arg2;
		this.anInt6089 = arg3;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9085, 0, this.method7709(), arg2, arg3, 0, Static111.method4956(super.aClass339_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!jc;Lclient!tn;II[FII)V")
	public Class203_Sub1(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static120.aClass89_11, arg2 * arg3, false);
		this.anInt6089 = arg3;
		this.anInt6097 = arg2;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9085, 0, this.method7709(), arg2, arg3, 0, Static111.method4956(super.aClass339_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!jc;Lclient!tn;Lclient!ds;II)V")
	public Class203_Sub1(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt6089 = arg4;
		this.anInt6097 = arg3;
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glTexImage2Dub(super.anInt9085, 0, this.method7709(), arg3, arg4, 0, Static111.method4956(super.aClass339_14), Static439.method6408(super.aClass89_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z[IIIIIII)V")
	@Override
	public void method5620(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass65_Sub2_Sub2_10.method4426(this);
		if (arg5 == 0) {
			arg5 = arg4;
		}
		if (arg4 != arg5) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt9085, 0, arg1, arg3, arg4, arg2, 32993, super.aClass65_Sub2_Sub2_10.anInt5364, arg0, 0);
		if (arg5 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZF)F")
	@Override
	public float method5622(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!tn;IIBI[BII)V")
	@Override
	public void method5621(@OriginalArg(1) Class339 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4) {
		super.aClass65_Sub2_Sub2_10.method4426(this);
		if (arg1 == 0) {
			arg1 = arg4;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9085, 0, 0, 0, arg4, arg2, Static111.method4956(arg0), 5121, arg3, 0);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
	@Override
	public int method5619() {
		return this.anInt6097;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IF)F")
	@Override
	public float method5617(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method5618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5624() {
		return false;
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)I")
	@Override
	public int method5625() {
		return this.anInt6089;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method5623(@OriginalArg(0) int[] arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt6097 * this.anInt6089];
		super.aClass65_Sub2_Sub2_10.method4426(this);
		OpenGL.glGetTexImagei(super.anInt9085, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
			Static686.method4967(local12, this.anInt6097 * (arg1 - local27 - 1), arg0, arg2 * local27, arg2);
		}
	}
}
