import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class135_Sub1 extends Class135 implements Interface5 {

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
	private final int anInt6182;

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
	private final int anInt6176;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ag;Lclient!aq;II[FII)V")
	public Class135_Sub1(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static489.aClass289_17, arg2 * arg3, false);
		this.anInt6182 = arg3;
		this.anInt6176 = arg2;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9452, 0, this.method7963(), arg2, arg3, 0, Static456.method6571(super.aClass16_22), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ag;Lclient!aq;II[BII)V")
	public Class135_Sub1(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static489.aClass289_13, arg3 * arg2, false);
		this.anInt6176 = arg2;
		this.anInt6182 = arg3;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9452, 0, this.method7963(), arg2, arg3, 0, Static456.method6571(super.aClass16_22), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ag;Lclient!aq;Lclient!ui;II)V")
	public Class135_Sub1(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class289 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt6176 = arg3;
		this.anInt6182 = arg4;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glTexImage2Dub(super.anInt9452, 0, this.method7963(), arg3, arg4, 0, Static456.method6571(super.aClass16_22), Static120.method2684(super.aClass289_20), null, 0);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ag;II[III)V")
	public Class135_Sub1(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static72.aClass16_3, Static489.aClass289_13, arg1 * arg2, false);
		this.anInt6182 = arg2;
		this.anInt6176 = arg1;
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9452, 0, 6408, this.anInt6176, this.anInt6182, 0, 32993, super.aClass9_Sub1_Sub1_10.anInt661, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7969() {
		return false;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method7967(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)I")
	@Override
	public int method7971() {
		return this.anInt6176;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III[IIIIZ)V")
	@Override
	public void method7968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 == 0) {
			arg2 = arg5;
		}
		super.aClass9_Sub1_Sub1_10.method7712(this);
		if (arg2 != arg5) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt9452, 0, arg4, arg1, arg5, arg0, 32993, super.aClass9_Sub1_Sub1_10.anInt661, arg3, 0);
		if (arg2 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(FI)F")
	@Override
	public float method7970(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(FB)F")
	@Override
	public float method7972(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[BIIILclient!aq;IB)V")
	@Override
	public void method7973(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class16 arg3, @OriginalArg(7) int arg4) {
		if (arg2 == 0) {
			arg2 = arg4;
		}
		super.aClass9_Sub1_Sub1_10.method7712(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9452, 0, 0, 0, arg4, arg0, Static456.method6571(arg3), 5121, arg1, 0);
		if (arg4 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	@Override
	public int method7974() {
		return this.anInt6182;
	}
}
