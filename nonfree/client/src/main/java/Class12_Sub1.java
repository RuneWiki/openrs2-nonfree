import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class12_Sub1 extends Class12 implements Interface6 {

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
	private final int anInt403;

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
	private final int anInt414;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!el;Lclient!nh;IIZ[BII)V")
	public Class12_Sub1(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static239.aClass161_12, arg3 * arg2, arg4);
		this.anInt403 = arg3;
		this.anInt414 = arg2;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7598(arg3, super.anInt9288, arg5, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9288, 0, this.method7591(), arg2, arg3, 0, Static255.method4299(super.aClass219_15), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!el;Lclient!nh;IIZ[FII)V")
	public Class12_Sub1(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static239.aClass161_16, arg3 * arg2, arg4);
		this.anInt403 = arg3;
		this.anInt414 = arg2;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9288, 0, this.method7591(), arg2, arg3, 0, Static255.method4299(super.aClass219_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7597(arg5, super.anInt9288, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!el;Lclient!nh;Lclient!jr;II)V")
	public Class12_Sub1(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt403 = arg4;
		this.anInt414 = arg3;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glTexImage2Dub(super.anInt9288, 0, this.method7591(), arg3, arg4, 0, Static255.method4299(super.aClass219_15), Static148.method2863(super.aClass161_20), null, 0);
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!el;IIZ[III)V")
	public Class12_Sub1(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static122.aClass219_7, Static239.aClass161_12, arg2 * arg1, arg3);
		this.anInt414 = arg1;
		this.anInt403 = arg2;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		if (arg3 && arg6 == 0) {
			this.method7596(arg1, super.anInt9288, arg4, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9288, 0, 6408, this.anInt414, this.anInt403, 0, 32993, super.aClass14_Sub2_Sub1_10.anInt2779, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III[FILclient!nh;III)V")
	public void method321(@OriginalArg(0) int arg0, @OriginalArg(3) float[] arg1, @OriginalArg(5) Class219 arg2, @OriginalArg(7) int arg3) {
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9288, 0, 0, 0, arg3, arg0, Static255.method4299(arg2), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method7606(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glTexParameteri(super.anInt9288, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9288, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(FI)F")
	@Override
	public float method7600(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt403;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BF)F")
	@Override
	public float method7604(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt414;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I")
	@Override
	public int method7599() {
		return this.anInt403;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIZIILclient!nh;I[B)V")
	@Override
	public void method7602(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class219 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt9288, 0, 0, 0, arg0, arg1, Static255.method4299(arg2), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I")
	@Override
	public int method7605() {
		return this.anInt414;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7601() {
		return true;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method7603(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3314, arg4);
		OpenGL.glTexSubImage2Di(super.anInt9288, 0, arg5, arg3, arg2, arg1, 32993, super.aClass14_Sub2_Sub1_10.anInt2779, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
