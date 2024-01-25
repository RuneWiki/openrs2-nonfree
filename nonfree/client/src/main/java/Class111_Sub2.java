import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class111_Sub2 extends Class111 implements Interface24 {

	@OriginalMember(owner = "client!ica", name = "J", descriptor = "I")
	private final int anInt4392;

	@OriginalMember(owner = "client!ica", name = "C", descriptor = "I")
	private final int anInt4387;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!mba;Lclient!kca;Lclient!wq;II)V")
	public Class111_Sub2(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class376 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt4392 = arg3;
		this.anInt4387 = arg4;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glTexImage2Dub(super.anInt5057, 0, this.method4561(), arg3, arg4, 0, Static419.method6584(super.aClass182_10), Static562.method8095(super.aClass376_8), null, 0);
	}

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!mba;Lclient!kca;IIZ[BII)V")
	public Class111_Sub2(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static637.aClass376_16, arg3 * arg2, arg4);
		this.anInt4392 = arg2;
		this.anInt4387 = arg3;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method4560(super.anInt5057, arg2, arg5, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt5057, 0, this.method4561(), arg2, arg3, 0, Static419.method6584(super.aClass182_10), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!mba;Lclient!kca;IIZ[FII)V")
	public Class111_Sub2(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static637.aClass376_20, arg2 * arg3, arg4);
		this.anInt4392 = arg2;
		this.anInt4387 = arg3;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt5057, 0, this.method4561(), arg2, arg3, 0, Static419.method6584(super.aClass182_10), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method4565(arg3, super.anInt5057, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!mba;IIZ[III)V")
	public Class111_Sub2(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static502.aClass182_14, Static637.aClass376_16, arg1 * arg2, arg3);
		this.anInt4387 = arg2;
		this.anInt4392 = arg1;
		super.aClass5_Sub1_Sub2_6.method5609(this);
		if (arg3 && arg6 == 0) {
			this.method4562(arg1, super.anInt5057, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt5057, 0, 6408, this.anInt4392, this.anInt4387, 0, 32993, super.aClass5_Sub1_Sub2_6.anInt6638, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FI)F")
	@Override
	public float method7482(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4387;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)I")
	@Override
	public int method7478() {
		return this.anInt4387;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!kca;[BIIIIIII)V")
	@Override
	public void method7480(@OriginalArg(0) Class182 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt5057, 0, 0, 0, arg4, arg2, Static419.method6584(arg0), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
	@Override
	public int method7483() {
		return this.anInt4392;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([IIIIBIII)V")
	@Override
	public void method7477(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Di(super.anInt5057, 0, arg5, arg3, arg1, arg4, 32993, super.aClass5_Sub1_Sub2_6.anInt6638, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([IIIIIII)V")
	@Override
	public void method7479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt4392 * this.anInt4387];
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glGetTexImagei(super.anInt5057, 0, 32993, 5121, local12, 0);
		for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
			Static653.method6859(local12, (arg2 - local41 - 1) * this.anInt4392, arg0, arg1 * local41, arg1);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BF)F")
	@Override
	public float method7476(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt4392;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7475(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glTexParameteri(super.anInt5057, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt5057, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return true;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIILclient!kca;IB[FI)V")
	public void method3891(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class182 arg2, @OriginalArg(7) float[] arg3) {
		super.aClass5_Sub1_Sub2_6.method5609(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt5057, 0, 0, 0, arg0, arg1, Static419.method6584(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
