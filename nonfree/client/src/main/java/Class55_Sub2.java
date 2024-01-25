import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class55_Sub2 extends Class55 implements Interface4 {

	@OriginalMember(owner = "client!lja", name = "H", descriptor = "I")
	private final int anInt5868;

	@OriginalMember(owner = "client!lja", name = "y", descriptor = "I")
	private final int anInt5869;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lclient!mba;Lclient!pm;II[BII)V")
	public Class55_Sub2(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static243.aClass158_10, arg2 * arg3, false);
		this.anInt5868 = arg2;
		this.anInt5869 = arg3;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8840, 0, this.method7823(), arg2, arg3, 0, Static685.method9235(super.aClass295_13), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lclient!mba;Lclient!pm;Lclient!hk;II)V")
	public Class55_Sub2(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt5868 = arg3;
		this.anInt5869 = arg4;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glTexImage2Dub(super.anInt8840, 0, this.method7823(), arg3, arg4, 0, Static685.method9235(super.aClass295_13), Static438.method6362(super.aClass158_18), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lclient!mba;II[III)V")
	public Class55_Sub2(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static165.aClass295_6, Static243.aClass158_10, arg2 * arg1, false);
		this.anInt5869 = arg2;
		this.anInt5868 = arg1;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8840, 0, 6408, this.anInt5868, this.anInt5869, 0, 32993, super.aClass145_Sub1_Sub1_10.anInt6414, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lclient!mba;Lclient!pm;II[FII)V")
	public Class55_Sub2(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static243.aClass158_14, arg3 * arg2, false);
		this.anInt5868 = arg2;
		this.anInt5869 = arg3;
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8840, 0, this.method7823(), arg2, arg3, 0, Static685.method9235(super.aClass295_13), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Z)I")
	@Override
	public int method6852() {
		return this.anInt5869;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(FI)F")
	@Override
	public float method6856(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6860() {
		return false;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IF)F")
	@Override
	public float method6857(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(I[BILclient!pm;IIIIB)V")
	@Override
	public void method6854(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class295 arg3, @OriginalArg(5) int arg4) {
		super.aClass145_Sub1_Sub1_10.method9754(this);
		if (arg0 == 0) {
			arg0 = arg2;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg2) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8840, 0, 0, 0, arg2, arg4, Static685.method9235(arg3), 5121, arg1, 0);
		if (arg2 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)I")
	@Override
	public int method6858() {
		return this.anInt5868;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6853(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method6859(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(5) int arg2) {
		@Pc(22) int[] local22 = new int[this.anInt5869 * this.anInt5868];
		super.aClass145_Sub1_Sub1_10.method9754(this);
		OpenGL.glGetTexImagei(super.anInt8840, 0, 32993, 5121, local22, 0);
		for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
			Static728.method273(local22, (arg0 - local37 - 1) * this.anInt5868, arg1, arg2 * local37, arg2);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method6855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass145_Sub1_Sub1_10.method9754(this);
		if (arg2 == 0) {
			arg2 = arg5;
		}
		if (arg2 != arg5) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt8840, 0, arg0, arg1, arg5, arg4, 32993, super.aClass145_Sub1_Sub1_10.anInt6414, arg3, 0);
		if (arg2 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
