import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class149_Sub4 extends Class149 implements Interface5 {

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
	private final int anInt9017;

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
	private final int anInt9018;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!tba;Lclient!pn;IIZ[BII)V")
	public Class149_Sub4(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static243.aClass172_9, arg2 * arg3, arg4);
		this.anInt9017 = arg3;
		this.anInt9018 = arg2;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7303(arg2, arg5, arg3, super.anInt9000);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9000, 0, this.method7302(), arg2, arg3, 0, Static267.method3896(super.aClass271_13), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!tba;IIZ[III)V")
	public Class149_Sub4(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static429.aClass271_12, Static243.aClass172_9, arg2 * arg1, arg3);
		this.anInt9018 = arg1;
		this.anInt9017 = arg2;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		if (arg3 && arg6 == 0) {
			this.method7304(super.anInt9000, arg2, arg1, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9000, 0, 6408, this.anInt9018, this.anInt9017, 0, 32993, super.aClass78_Sub1_Sub2_11.anInt8681, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!tba;Lclient!pn;Lclient!jg;II)V")
	public Class149_Sub4(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt9018 = arg3;
		this.anInt9017 = arg4;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glTexImage2Dub(super.anInt9000, 0, this.method7302(), arg3, arg4, 0, Static267.method3896(super.aClass271_13), Static430.method6139(super.aClass172_20), null, 0);
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!tba;Lclient!pn;IIZ[FII)V")
	public Class149_Sub4(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static243.aClass172_13, arg3 * arg2, arg4);
		this.anInt9017 = arg3;
		this.anInt9018 = arg2;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9000, 0, this.method7302(), arg2, arg3, 0, Static267.method3896(super.aClass271_13), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7308(arg5, arg3, arg2, super.anInt9000);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BF)F")
	@Override
	public float method7315(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9018;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIZILclient!pn;I[B)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) Class271 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt9000, 0, 0, 0, arg1, arg3, Static267.method3896(arg2), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)I")
	@Override
	public int method7317() {
		return this.anInt9017;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)I")
	@Override
	public int method7313() {
		return this.anInt9018;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(BF)F")
	@Override
	public float method7316(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9017;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7312() {
		return true;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method7318(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt9000, 0, arg3, arg2, arg4, arg0, 32993, super.aClass78_Sub1_Sub2_11.anInt8681, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7314(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glTexParameteri(super.anInt9000, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9000, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII[FLclient!pn;)V")
	public void method7321(@OriginalArg(2) int arg0, @OriginalArg(6) int arg1, @OriginalArg(7) float[] arg2, @OriginalArg(8) Class271 arg3) {
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9000, 0, 0, 0, arg1, arg0, Static267.method3896(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
