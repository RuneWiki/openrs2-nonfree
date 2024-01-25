import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class149_Sub3 extends Class149 implements Interface5 {

	@OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
	private final int anInt7381;

	@OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
	private final int anInt7372;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!tba;Lclient!pn;Lclient!jg;II)V")
	public Class149_Sub3(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt7381 = arg3;
		this.anInt7372 = arg4;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glTexImage2Dub(super.anInt9000, 0, this.method7302(), arg3, arg4, 0, Static267.method3896(super.aClass271_13), Static430.method6139(super.aClass172_20), null, 0);
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!tba;II[III)V")
	public Class149_Sub3(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static429.aClass271_12, Static243.aClass172_9, arg1 * arg2, false);
		this.anInt7381 = arg1;
		this.anInt7372 = arg2;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9000, 0, 6408, this.anInt7381, this.anInt7372, 0, 32993, super.aClass78_Sub1_Sub2_11.anInt8681, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!tba;Lclient!pn;II[FII)V")
	public Class149_Sub3(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static243.aClass172_13, arg3 * arg2, false);
		this.anInt7372 = arg3;
		this.anInt7381 = arg2;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9000, 0, this.method7302(), arg2, arg3, 0, Static267.method3896(super.aClass271_13), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!tba;Lclient!pn;II[BII)V")
	public Class149_Sub3(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static243.aClass172_9, arg3 * arg2, false);
		this.anInt7381 = arg2;
		this.anInt7372 = arg3;
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9000, 0, this.method7302(), arg2, arg3, 0, Static267.method3896(super.aClass271_13), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method7318(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 == 0) {
			arg5 = arg4;
		}
		super.aClass78_Sub1_Sub2_11.method6931(this);
		if (arg4 != arg5) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt9000, 0, arg3, arg2, arg4, arg0, 32993, super.aClass78_Sub1_Sub2_11.anInt8681, arg1, 0);
		if (arg5 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BF)F")
	@Override
	public float method7315(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIIZILclient!pn;I[B)V")
	@Override
	public void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) Class271 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg0 == 0) {
			arg0 = arg1;
		}
		super.aClass78_Sub1_Sub2_11.method6931(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg1) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9000, 0, 0, 0, arg1, arg3, Static267.method3896(arg2), 5121, arg4, 0);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7314(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(BF)F")
	@Override
	public float method7316(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)I")
	@Override
	public int method7313() {
		return this.anInt7381;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7312() {
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)I")
	@Override
	public int method7317() {
		return this.anInt7372;
	}
}
