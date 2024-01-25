import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class135_Sub4 extends Class135 implements Interface5 {

	@OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
	private final int anInt9463;

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
	private final int anInt9456;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ag;Lclient!aq;IIZ[BII)V")
	public Class135_Sub4(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static489.aClass289_13, arg2 * arg3, arg4);
		this.anInt9463 = arg2;
		this.anInt9456 = arg3;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7960(arg2, arg5, super.anInt9452, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9452, 0, this.method7963(), arg2, arg3, 0, Static456.method6571(super.aClass16_22), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ag;Lclient!aq;IIZ[FII)V")
	public Class135_Sub4(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static489.aClass289_17, arg2 * arg3, arg4);
		this.anInt9463 = arg2;
		this.anInt9456 = arg3;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9452, 0, this.method7963(), arg2, arg3, 0, Static456.method6571(super.aClass16_22), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7957(arg3, arg5, arg2, super.anInt9452);
		}
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ag;IIZ[III)V")
	public Class135_Sub4(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static72.aClass16_3, Static489.aClass289_13, arg2 * arg1, arg3);
		this.anInt9463 = arg1;
		this.anInt9456 = arg2;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		if (arg3 && arg6 == 0) {
			this.method7965(arg1, arg4, super.anInt9452, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9452, 0, 6408, this.anInt9463, this.anInt9456, 0, 32993, super.aClass9_Sub1_Sub1_10.anInt661, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ag;Lclient!aq;Lclient!ui;II)V")
	public Class135_Sub4(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class289 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt9456 = arg4;
		this.anInt9463 = arg3;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glTexImage2Dub(super.anInt9452, 0, this.method7963(), arg3, arg4, 0, Static456.method6571(super.aClass16_22), Static120.method2684(super.aClass289_20), null, 0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II[BIIILclient!aq;IB)V")
	@Override
	public void method7973(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class16 arg3, @OriginalArg(7) int arg4) {
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Dub(super.anInt9452, 0, 0, 0, arg4, arg0, Static456.method6571(arg3), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glTexParameteri(super.anInt9452, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9452, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)I")
	@Override
	public int method7974() {
		return this.anInt9456;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(FI)F")
	@Override
	public float method7970(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9463;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7969() {
		return true;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(FB)F")
	@Override
	public float method7972(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9456;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III[IIIIZ)V")
	@Override
	public void method7968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Di(super.anInt9452, 0, arg4, arg1, arg5, arg0, 32993, super.aClass9_Sub1_Sub1_10.anInt661, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)I")
	@Override
	public int method7971() {
		return this.anInt9463;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIILclient!aq;ZI[FII)V")
	public void method7976(@OriginalArg(3) Class16 arg0, @OriginalArg(6) float[] arg1, @OriginalArg(7) int arg2, @OriginalArg(8) int arg3) {
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9452, 0, 0, 0, arg2, arg3, Static456.method6571(arg0), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
