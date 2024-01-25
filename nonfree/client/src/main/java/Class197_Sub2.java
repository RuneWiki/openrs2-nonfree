import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class197_Sub2 extends Class197 implements Interface27 {

	@OriginalMember(owner = "client!saa", name = "D", descriptor = "I")
	private final int anInt8301;

	@OriginalMember(owner = "client!saa", name = "G", descriptor = "I")
	private final int anInt8303;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!tk;IIZ[III)V")
	public Class197_Sub2(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static78.aClass104_3, Static638.aClass381_15, arg1 * arg2, arg3);
		this.anInt8301 = arg2;
		this.anInt8303 = arg1;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		if (arg3 && arg6 == 0) {
			this.method8819(arg1, super.anInt10370, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10370, 0, 6408, this.anInt8303, this.anInt8301, 0, 32993, super.aClass13_Sub3_Sub1_12.anInt9186, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!tk;Lclient!et;IIZ[FII)V")
	public Class197_Sub2(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static638.aClass381_19, arg3 * arg2, arg4);
		this.anInt8303 = arg2;
		this.anInt8301 = arg3;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10370, 0, this.method8826(), arg2, arg3, 0, Static626.method8676(super.aClass104_19), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8829(super.anInt10370, arg2, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!tk;Lclient!et;IIZ[BII)V")
	public Class197_Sub2(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static638.aClass381_15, arg3 * arg2, arg4);
		this.anInt8303 = arg2;
		this.anInt8301 = arg3;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8823(super.anInt10370, arg3, arg2, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10370, 0, this.method8826(), arg2, arg3, 0, Static626.method8676(super.aClass104_19), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!tk;Lclient!et;Lclient!wha;II)V")
	public Class197_Sub2(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class381 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt8303 = arg3;
		this.anInt8301 = arg4;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glTexImage2Dub(super.anInt10370, 0, this.method8826(), arg3, arg4, 0, Static626.method8676(super.aClass104_19), Static17.method512(super.aClass381_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)I")
	@Override
	public int method7128() {
		return this.anInt8303;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(FI)F")
	@Override
	public float method7133(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8301;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method7134(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glTexParameteri(super.anInt10370, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10370, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)I")
	@Override
	public int method7130() {
		return this.anInt8301;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IF)F")
	@Override
	public float method7127(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8303;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I[FILclient!et;BIIII)V")
	public void method7139(@OriginalArg(1) float[] arg0, @OriginalArg(3) Class104 arg1, @OriginalArg(5) int arg2, @OriginalArg(8) int arg3) {
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10370, 0, 0, 0, arg2, arg3, Static626.method8676(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ILclient!et;III[BIII)V")
	@Override
	public void method7129(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Dub(super.anInt10370, 0, 0, 0, arg4, arg0, Static626.method8676(arg1), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt10370, 0, arg0, arg2, arg4, arg5, 32993, super.aClass13_Sub3_Sub1_12.anInt9186, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7135() {
		return true;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method7132(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt8301 * this.anInt8303];
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glGetTexImagei(super.anInt10370, 0, 32993, 5121, local12, 0);
		for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
			Static650.method2270(local12, (arg2 - local41 - 1) * this.anInt8303, arg1, arg0 * local41, arg0);
		}
	}
}
