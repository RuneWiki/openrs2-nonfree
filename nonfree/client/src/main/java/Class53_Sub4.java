import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class53_Sub4 extends Class53 implements Interface20 {

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
	private final int anInt5181;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
	private final int anInt5180;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!om;Lclient!lw;IIZ[BII)V")
	public Class53_Sub4(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static20.aClass19_4, arg3 * arg2, arg4);
		this.anInt5181 = arg2;
		this.anInt5180 = arg3;
		super.aClass133_Sub1_Sub2_9.method6153(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method4633(arg2, super.anInt5166, arg3, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt5166, 0, this.method4634(), arg2, arg3, 0, Static117.method1781(super.aClass223_11), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!om;IIZ[III)V")
	public Class53_Sub4(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static576.aClass223_16, Static20.aClass19_4, arg2 * arg1, arg3);
		this.anInt5181 = arg1;
		this.anInt5180 = arg2;
		super.aClass133_Sub1_Sub2_9.method6153(this);
		if (arg3 && arg6 == 0) {
			this.method4630(arg4, arg1, arg2, super.anInt5166);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt5166, 0, 6408, this.anInt5181, this.anInt5180, 0, 32993, super.aClass133_Sub1_Sub2_9.anInt7107, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!om;Lclient!lw;Lclient!al;II)V")
	public Class53_Sub4(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt5180 = arg4;
		this.anInt5181 = arg3;
		super.aClass133_Sub1_Sub2_9.method6153(this);
		OpenGL.glTexImage2Dub(super.anInt5166, 0, this.method4634(), arg3, arg4, 0, Static117.method1781(super.aClass223_11), Static204.method3553(super.aClass19_16), null, 0);
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!om;Lclient!lw;IIZ[FII)V")
	public Class53_Sub4(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static20.aClass19_8, arg3 * arg2, arg4);
		this.anInt5181 = arg2;
		this.anInt5180 = arg3;
		super.aClass133_Sub1_Sub2_9.method6153(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt5166, 0, this.method4634(), arg2, arg3, 0, Static117.method1781(super.aClass223_11), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method4627(arg3, super.anInt5166, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method4639(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass133_Sub1_Sub2_9.method6153(this);
		OpenGL.glTexParameteri(super.anInt5166, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt5166, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IF)F")
	@Override
	public float method4640(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5181;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)I")
	@Override
	public int method4637() {
		return this.anInt5181;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)I")
	@Override
	public int method4636() {
		return this.anInt5180;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[IIIIIII)V")
	@Override
	public void method4635(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass133_Sub1_Sub2_9.method6153(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt5166, 0, arg4, arg5, arg2, arg3, 32993, super.aClass133_Sub1_Sub2_9.anInt7107, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([FLclient!lw;IIIIZII)V")
	public void method4644(@OriginalArg(0) float[] arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		super.aClass133_Sub1_Sub2_9.method6153(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt5166, 0, 0, 0, arg3, arg2, Static117.method1781(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBII[III)V")
	@Override
	public void method4643(@OriginalArg(0) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(5) int arg2) {
		@Pc(16) int[] local16 = new int[this.anInt5180 * this.anInt5181];
		super.aClass133_Sub1_Sub2_9.method6153(this);
		OpenGL.glGetTexImagei(super.anInt5166, 0, 32993, 5121, local16, 0);
		for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
			Static652.method4549(local16, (arg2 - local31 - 1) * this.anInt5181, arg1, local31 * arg0, arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!lw;IIIIII[B)V")
	@Override
	public void method4638(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass133_Sub1_Sub2_9.method6153(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt5166, 0, 0, 0, arg3, arg2, Static117.method1781(arg1), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4642() {
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(IF)F")
	@Override
	public float method4641(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5180;
	}
}
