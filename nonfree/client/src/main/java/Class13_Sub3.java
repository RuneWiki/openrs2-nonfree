import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class13_Sub3 extends Class13 implements Interface16 {

	@OriginalMember(owner = "client!jt", name = "M", descriptor = "I")
	private final int anInt5283;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
	private final int anInt5288;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!vaa;Lclient!sca;Lclient!hu;II)V")
	public Class13_Sub3(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt5283 = arg4;
		this.anInt5288 = arg3;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glTexImage2Dub(super.anInt5293, 0, this.method4743(), arg3, arg4, 0, Static82.method1790(super.aClass335_8), Static619.method7938(super.aClass167_14), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!vaa;Lclient!sca;II[BII)V")
	public Class13_Sub3(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static259.aClass167_7, arg3 * arg2, false);
		this.anInt5288 = arg2;
		this.anInt5283 = arg3;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt5293, 0, this.method4743(), arg2, arg3, 0, Static82.method1790(super.aClass335_8), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!vaa;II[III)V")
	public Class13_Sub3(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static646.aClass335_14, Static259.aClass167_7, arg2 * arg1, false);
		this.anInt5288 = arg1;
		this.anInt5283 = arg2;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt5293, 0, 6408, this.anInt5288, this.anInt5283, 0, 32993, super.aClass22_Sub2_Sub2_8.anInt10582, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!vaa;Lclient!sca;II[FII)V")
	public Class13_Sub3(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static259.aClass167_11, arg2 * arg3, false);
		this.anInt5283 = arg3;
		this.anInt5288 = arg2;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt5293, 0, this.method4743(), arg2, arg3, 0, Static82.method1790(super.aClass335_8), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method8248(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method8249(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt5283 * this.anInt5288];
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glGetTexImagei(super.anInt5293, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
			Static732.method6321(local12, this.anInt5288 * (arg1 - local27 - 1), arg0, local27 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)I")
	@Override
	public int method8245() {
		return this.anInt5283;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IF)F")
	@Override
	public float method8250(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZIIII[III)V")
	@Override
	public void method8242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 == 0) {
			arg5 = arg2;
		}
		super.aClass22_Sub2_Sub2_8.method8976(this);
		if (arg2 != arg5) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt5293, 0, arg1, arg4, arg2, arg0, 32993, super.aClass22_Sub2_Sub2_8.anInt10582, arg3, 0);
		if (arg5 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(FI)F")
	@Override
	public float method8247(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)I")
	@Override
	public int method8246() {
		return this.anInt5288;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIILclient!sca;I[BI)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class335 arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) int arg4) {
		if (arg0 == 0) {
			arg0 = arg4;
		}
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5293, 0, 0, 0, arg4, arg1, Static82.method1790(arg2), 5121, arg3, 0);
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8244() {
		return false;
	}
}
