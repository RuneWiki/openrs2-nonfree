import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class48_Sub1 extends Class48 implements Interface25 {

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
	private final int anInt1025;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
	private final int anInt1020;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!laa;Lclient!qda;IIZ[BII)V")
	public Class48_Sub1(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static385.aClass247_14, arg2 * arg3, arg4);
		this.anInt1025 = arg3;
		this.anInt1020 = arg2;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7617(arg5, arg3, super.anInt8874, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8874, 0, this.method7616(), arg2, arg3, 0, Static350.method5350(super.aClass281_18), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!laa;Lclient!qda;IIZ[FII)V")
	public Class48_Sub1(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static385.aClass247_18, arg3 * arg2, arg4);
		this.anInt1025 = arg3;
		this.anInt1020 = arg2;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8874, 0, this.method7616(), arg2, arg3, 0, Static350.method5350(super.aClass281_18), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7621(arg3, super.anInt8874, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!laa;IIZ[III)V")
	public Class48_Sub1(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static208.aClass281_10, Static385.aClass247_14, arg2 * arg1, arg3);
		this.anInt1025 = arg2;
		this.anInt1020 = arg1;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		if (arg3 && arg6 == 0) {
			this.method7622(arg4, super.anInt8874, arg2, arg1);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8874, 0, 6408, this.anInt1020, this.anInt1025, 0, 32993, super.aClass126_Sub2_Sub1_12.anInt5452, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!laa;Lclient!qda;Lclient!ns;II)V")
	public Class48_Sub1(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt1020 = arg3;
		this.anInt1025 = arg4;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glTexImage2Dub(super.anInt8874, 0, this.method7616(), arg3, arg4, 0, Static350.method5350(super.aClass281_18), Static602.method8407(super.aClass247_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[FLclient!qda;IIIIII)V")
	public void method1071(@OriginalArg(1) float[] arg0, @OriginalArg(2) Class281 arg1, @OriginalArg(3) int arg2, @OriginalArg(7) int arg3) {
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8874, 0, 0, 0, arg3, arg2, Static350.method5350(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!qda;IBIIII[B)V")
	@Override
	public void method7628(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt8874, 0, 0, 0, arg2, arg3, Static350.method5350(arg1), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)I")
	@Override
	public int method7626() {
		return this.anInt1025;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII[IIB)V")
	@Override
	public void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt8874, 0, arg2, arg0, arg3, arg5, 32993, super.aClass126_Sub2_Sub1_12.anInt5452, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I")
	@Override
	public int method7623() {
		return this.anInt1020;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(FI)F")
	@Override
	public float method7631(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1025;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method7629(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt1025 * this.anInt1020];
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glGetTexImagei(super.anInt8874, 0, 32993, 5121, local12, 0);
		for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
			Static655.method4105(local12, (arg0 - local33 - 1) * this.anInt1020, arg1, arg2 * local33, arg2);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7627() {
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7630(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glTexParameteri(super.anInt8874, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8874, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IF)F")
	@Override
	public float method7624(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1020;
	}
}
