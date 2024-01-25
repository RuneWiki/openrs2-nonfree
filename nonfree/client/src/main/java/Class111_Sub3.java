import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class111_Sub3 extends Class111 implements Interface24 {

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
	private final int anInt4502;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
	private final int anInt4496;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!mba;II[III)V")
	public Class111_Sub3(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static502.aClass182_14, Static637.aClass376_16, arg2 * arg1, false);
		this.anInt4502 = arg1;
		this.anInt4496 = arg2;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt5057, 0, 6408, this.anInt4502, this.anInt4496, 0, 32993, super.aClass5_Sub1_Sub2_6.anInt6638, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!mba;Lclient!kca;II[BII)V")
	public Class111_Sub3(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static637.aClass376_16, arg2 * arg3, false);
		this.anInt4502 = arg2;
		this.anInt4496 = arg3;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt5057, 0, this.method4561(), arg2, arg3, 0, Static419.method6584(super.aClass182_10), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!mba;Lclient!kca;Lclient!wq;II)V")
	public Class111_Sub3(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class376 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt4496 = arg4;
		this.anInt4502 = arg3;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glTexImage2Dub(super.anInt5057, 0, this.method4561(), arg3, arg4, 0, Static419.method6584(super.aClass182_10), Static562.method8095(super.aClass376_8), null, 0);
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!mba;Lclient!kca;II[FII)V")
	public Class111_Sub3(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static637.aClass376_20, arg3 * arg2, false);
		this.anInt4496 = arg3;
		this.anInt4502 = arg2;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt5057, 0, this.method4561(), arg2, arg3, 0, Static419.method6584(super.aClass182_10), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)I")
	@Override
	public int method7478() {
		return this.anInt4496;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!kca;[BIIIIIII)V")
	@Override
	public void method7480(@OriginalArg(0) Class182 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			arg3 = arg4;
		}
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5057, 0, 0, 0, arg4, arg2, Static419.method6584(arg0), 5121, arg1, 0);
		if (arg4 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
	@Override
	public int method7483() {
		return this.anInt4502;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BF)F")
	@Override
	public float method7476(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIBIII)V")
	@Override
	public void method7477(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass5_Sub1_Sub2_6.method5609(this);
		if (arg2 == 0) {
			arg2 = arg1;
		}
		if (arg1 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt5057, 0, arg5, arg3, arg1, arg4, 32993, super.aClass5_Sub1_Sub2_6.anInt6638, arg0, 0);
		if (arg2 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(FI)F")
	@Override
	public float method7482(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7475(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method7479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int[] local20 = new int[this.anInt4502 * this.anInt4496];
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glGetTexImagei(super.anInt5057, 0, 32993, 5121, local20, 0);
		for (@Pc(35) int local35 = 0; local35 < arg2; local35++) {
			Static653.method6859(local20, (arg2 - local35 - 1) * this.anInt4502, arg0, arg1 * local35, arg1);
		}
	}
}
