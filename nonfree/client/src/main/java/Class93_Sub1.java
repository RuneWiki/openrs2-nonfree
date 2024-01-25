import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class93_Sub1 extends Class93 implements Interface7 {

	@OriginalMember(owner = "client!en", name = "I", descriptor = "I")
	private final int anInt2863;

	@OriginalMember(owner = "client!en", name = "A", descriptor = "I")
	private final int anInt2857;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!pa;Lclient!sw;IIZ[BII)V")
	public Class93_Sub1(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static246.aClass152_10, arg3 * arg2, arg4);
		this.anInt2863 = arg2;
		this.anInt2857 = arg3;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8146(arg5, arg2, arg3, super.anInt9318);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9318, 0, this.method8144(), arg2, arg3, 0, Static282.method4524(super.aClass327_16), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!pa;IIZ[III)V")
	public Class93_Sub1(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static419.aClass327_2, Static246.aClass152_10, arg1 * arg2, arg3);
		this.anInt2863 = arg1;
		this.anInt2857 = arg2;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		if (arg3 && arg6 == 0) {
			this.method8150(arg4, super.anInt9318, arg1, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9318, 0, 6408, this.anInt2863, this.anInt2857, 0, 32993, super.aClass13_Sub1_Sub1_11.anInt7382, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!pa;Lclient!sw;IIZ[FII)V")
	public Class93_Sub1(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static246.aClass152_14, arg2 * arg3, arg4);
		this.anInt2863 = arg2;
		this.anInt2857 = arg3;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9318, 0, this.method8144(), arg2, arg3, 0, Static282.method4524(super.aClass327_16), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8147(arg3, arg2, arg5, super.anInt9318);
		}
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!pa;Lclient!sw;Lclient!ig;II)V")
	public Class93_Sub1(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt2857 = arg4;
		this.anInt2863 = arg3;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glTexImage2Dub(super.anInt9318, 0, this.method8144(), arg3, arg4, 0, Static282.method4524(super.aClass327_16), Static31.method747(super.aClass152_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method5809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt2863 * this.anInt2857];
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glGetTexImagei(super.anInt9318, 0, 32993, 5121, local12, 0);
		for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
			Static684.method5326(local12, this.anInt2863 * (arg0 - local34 - 1), arg2, local34 * arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)I")
	@Override
	public int method5803() {
		return this.anInt2857;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5802() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!sw;IIII[BIII)V")
	@Override
	public void method5807(@OriginalArg(0) Class327 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt9318, 0, 0, 0, arg1, arg4, Static282.method4524(arg0), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(IF)F")
	@Override
	public float method5808(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt2857;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI[IIIII)V")
	@Override
	public void method5801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt9318, 0, arg5, arg0, arg1, arg4, 32993, super.aClass13_Sub1_Sub1_11.anInt7382, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	@Override
	public int method5806() {
		return this.anInt2863;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IF)F")
	@Override
	public float method5804(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt2863;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method5805(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glTexParameteri(super.anInt9318, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9318, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[FIILclient!sw;IIII)V")
	public void method2604(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class327 arg2, @OriginalArg(7) int arg3) {
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9318, 0, 0, 0, arg3, arg1, Static282.method4524(arg2), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
