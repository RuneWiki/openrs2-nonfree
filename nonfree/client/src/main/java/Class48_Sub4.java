import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class48_Sub4 extends Class48 implements Interface25 {

	@OriginalMember(owner = "client!su", name = "I", descriptor = "I")
	private final int anInt8889;

	@OriginalMember(owner = "client!su", name = "F", descriptor = "I")
	private final int anInt8886;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!laa;Lclient!qda;Lclient!ns;II)V")
	public Class48_Sub4(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt8889 = arg4;
		this.anInt8886 = arg3;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glTexImage2Dub(super.anInt8874, 0, this.method7616(), arg3, arg4, 0, Static350.method5350(super.aClass281_18), Static602.method8407(super.aClass247_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!laa;Lclient!qda;II[BII)V")
	public Class48_Sub4(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static385.aClass247_14, arg2 * arg3, false);
		this.anInt8886 = arg2;
		this.anInt8889 = arg3;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8874, 0, this.method7616(), arg2, arg3, 0, Static350.method5350(super.aClass281_18), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!laa;Lclient!qda;II[FII)V")
	public Class48_Sub4(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static385.aClass247_18, arg2 * arg3, false);
		this.anInt8886 = arg2;
		this.anInt8889 = arg3;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8874, 0, this.method7616(), arg2, arg3, 0, Static350.method5350(super.aClass281_18), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!laa;II[III)V")
	public Class48_Sub4(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static208.aClass281_10, Static385.aClass247_14, arg1 * arg2, false);
		this.anInt8889 = arg2;
		this.anInt8886 = arg1;
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8874, 0, 6408, this.anInt8886, this.anInt8889, 0, 32993, super.aClass126_Sub2_Sub1_12.anInt5452, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7630(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)I")
	@Override
	public int method7626() {
		return this.anInt8889;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII[IIB)V")
	@Override
	public void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		super.aClass126_Sub2_Sub1_12.method5449(this);
		if (arg1 == 0) {
			arg1 = arg3;
		}
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt8874, 0, arg2, arg0, arg3, arg5, 32993, super.aClass126_Sub2_Sub1_12.anInt5452, arg4, 0);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method7629(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(18) int[] local18 = new int[this.anInt8889 * this.anInt8886];
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glGetTexImagei(super.anInt8874, 0, 32993, 5121, local18, 0);
		for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
			Static655.method4105(local18, this.anInt8886 * (arg0 - local33 - 1), arg1, arg2 * local33, arg2);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILclient!qda;IBIIII[B)V")
	@Override
	public void method7628(@OriginalArg(0) int arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg0 == 0) {
			arg0 = arg2;
		}
		super.aClass126_Sub2_Sub1_12.method5449(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8874, 0, 0, 0, arg2, arg3, Static350.method5350(arg1), 5121, arg4, 0);
		if (arg2 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IF)F")
	@Override
	public float method7624(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7627() {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)I")
	@Override
	public int method7623() {
		return this.anInt8886;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(FI)F")
	@Override
	public float method7631(@OriginalArg(0) float arg0) {
		return arg0;
	}
}
