import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class93_Sub2 extends Class93 implements Interface7 {

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
	private final int anInt4601;

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
	private final int anInt4598;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pa;Lclient!sw;II[FII)V")
	public Class93_Sub2(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static246.aClass152_14, arg2 * arg3, false);
		this.anInt4601 = arg2;
		this.anInt4598 = arg3;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9318, 0, this.method8144(), arg2, arg3, 0, Static282.method4524(super.aClass327_16), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pa;Lclient!sw;Lclient!ig;II)V")
	public Class93_Sub2(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt4601 = arg3;
		this.anInt4598 = arg4;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glTexImage2Dub(super.anInt9318, 0, this.method8144(), arg3, arg4, 0, Static282.method4524(super.aClass327_16), Static31.method747(super.aClass152_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pa;Lclient!sw;II[BII)V")
	public Class93_Sub2(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static246.aClass152_10, arg3 * arg2, false);
		this.anInt4598 = arg3;
		this.anInt4601 = arg2;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9318, 0, this.method8144(), arg2, arg3, 0, Static282.method4524(super.aClass327_16), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!pa;II[III)V")
	public Class93_Sub2(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static419.aClass327_2, Static246.aClass152_10, arg1 * arg2, false);
		this.anInt4598 = arg2;
		this.anInt4601 = arg1;
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9318, 0, 6408, this.anInt4601, this.anInt4598, 0, 32993, super.aClass13_Sub1_Sub1_11.anInt7382, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I")
	@Override
	public int method5803() {
		return this.anInt4598;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5802() {
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBI[IIIII)V")
	@Override
	public void method5801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 == 0) {
			arg3 = arg1;
		}
		super.aClass13_Sub1_Sub1_11.method7530(this);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt9318, 0, arg5, arg0, arg1, arg4, 32993, super.aClass13_Sub1_Sub1_11.anInt7382, arg2, 0);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IF)F")
	@Override
	public float method5804(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!sw;IIII[BIII)V")
	@Override
	public void method5807(@OriginalArg(0) Class327 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		super.aClass13_Sub1_Sub1_11.method7530(this);
		if (arg3 == 0) {
			arg3 = arg1;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9318, 0, 0, 0, arg1, arg4, Static282.method4524(arg0), 5121, arg2, 0);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IF)F")
	@Override
	public float method5808(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method5805(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method5809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt4601 * this.anInt4598];
		super.aClass13_Sub1_Sub1_11.method7530(this);
		OpenGL.glGetTexImagei(super.anInt9318, 0, 32993, 5121, local12, 0);
		for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
			Static684.method5326(local12, (arg0 - local31 - 1) * this.anInt4601, arg2, arg1 * local31, arg1);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)I")
	@Override
	public int method5806() {
		return this.anInt4601;
	}
}
