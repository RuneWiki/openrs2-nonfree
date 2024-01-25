import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class55_Sub3 extends Class55 implements Interface4 {

	@OriginalMember(owner = "client!pca", name = "K", descriptor = "I")
	private final int anInt7669;

	@OriginalMember(owner = "client!pca", name = "J", descriptor = "I")
	private final int anInt7672;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!mba;Lclient!pm;Lclient!hk;II)V")
	public Class55_Sub3(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt7669 = arg3;
		this.anInt7672 = arg4;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glTexImage2Dub(super.anInt8840, 0, this.method7823(), arg3, arg4, 0, Static685.method9235(super.aClass295_13), Static438.method6362(super.aClass158_18), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!mba;Lclient!pm;IIZ[FII)V")
	public Class55_Sub3(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static243.aClass158_14, arg3 * arg2, arg4);
		this.anInt7672 = arg3;
		this.anInt7669 = arg2;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method7817(arg2, super.anInt8840, arg5, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8840, 0, this.method7823(), arg2, arg3, 0, Static685.method9235(super.aClass295_13), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!mba;Lclient!pm;IIZ[BII)V")
	public Class55_Sub3(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static243.aClass158_10, arg2 * arg3, arg4);
		this.anInt7672 = arg3;
		this.anInt7669 = arg2;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method7818(arg2, arg3, arg5, super.anInt8840);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8840, 0, this.method7823(), arg2, arg3, 0, Static685.method9235(super.aClass295_13), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!mba;IIZ[III)V")
	public Class55_Sub3(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static165.aClass295_6, Static243.aClass158_10, arg2 * arg1, arg3);
		this.anInt7672 = arg2;
		this.anInt7669 = arg1;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method7821(arg1, arg2, super.anInt8840, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8840, 0, 6408, this.anInt7669, this.anInt7672, 0, 32993, super.aClass145_Sub1_Sub1_10.anInt6414, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!pm;IIIII[FII)V")
	public void method6862(@OriginalArg(0) Class295 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) float[] arg3) {
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8840, 0, 0, 0, arg1, arg2, Static685.method9235(arg0), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IF)F")
	@Override
	public float method6857(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt7672;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I[BILclient!pm;IIIIB)V")
	@Override
	public void method6854(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class295 arg3, @OriginalArg(5) int arg4) {
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt8840, 0, 0, 0, arg2, arg4, Static685.method9235(arg3), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6860() {
		return true;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6853(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glTexParameteri(super.anInt8840, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8840, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(FI)F")
	@Override
	public float method6856(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt7669;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)I")
	@Override
	public int method6852() {
		return this.anInt7672;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method6855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Di(super.anInt8840, 0, arg0, arg1, arg5, arg4, 32993, super.aClass145_Sub1_Sub1_10.anInt6414, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)I")
	@Override
	public int method6858() {
		return this.anInt7669;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method6859(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt7672 * this.anInt7669];
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glGetTexImagei(super.anInt8840, 0, 32993, 5121, local12, 0);
		for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
			Static728.method273(local12, this.anInt7669 * (arg0 - local32 - 1), arg1, arg2 * local32, arg2);
		}
	}
}
