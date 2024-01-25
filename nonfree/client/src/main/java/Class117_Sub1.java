import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class117_Sub1 extends Class117 implements Interface21 {

	@OriginalMember(owner = "client!li", name = "A", descriptor = "I")
	private final int anInt6322;

	@OriginalMember(owner = "client!li", name = "H", descriptor = "I")
	private final int anInt6328;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!ko;Lclient!vea;IIZ[BII)V")
	public Class117_Sub1(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static47.aClass36_5, arg2 * arg3, arg4);
		this.anInt6322 = arg3;
		this.anInt6328 = arg2;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method9023(arg2, arg5, arg3, super.anInt10830);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10830, 0, this.method9026(), arg2, arg3, 0, Static1.method8561(super.aClass363_16), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!ko;IIZ[III)V")
	public Class117_Sub1(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static238.aClass363_4, Static47.aClass36_5, arg2 * arg1, arg3);
		this.anInt6328 = arg1;
		this.anInt6322 = arg2;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		if (arg3 && arg6 == 0) {
			this.method9027(arg1, super.anInt10830, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10830, 0, 6408, this.anInt6328, this.anInt6322, 0, 32993, super.aClass137_Sub1_Sub1_12.anInt5950, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!ko;Lclient!vea;IIZ[FII)V")
	public Class117_Sub1(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static47.aClass36_9, arg2 * arg3, arg4);
		this.anInt6328 = arg2;
		this.anInt6322 = arg3;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10830, 0, this.method9026(), arg2, arg3, 0, Static1.method8561(super.aClass363_16), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method9029(super.anInt10830, arg3, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!ko;Lclient!vea;Lclient!bja;II)V")
	public Class117_Sub1(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt6322 = arg4;
		this.anInt6328 = arg3;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glTexImage2Dub(super.anInt10830, 0, this.method9026(), arg3, arg4, 0, Static1.method8561(super.aClass363_16), Static243.method3625(super.aClass36_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIBI[III)V")
	@Override
	public void method9036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt10830, 0, arg3, arg2, arg0, arg5, 32993, super.aClass137_Sub1_Sub1_12.anInt5950, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!vea;IIII[BI)V")
	@Override
	public void method9039(@OriginalArg(0) int arg0, @OriginalArg(2) Class363 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) byte[] arg4) {
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt10830, 0, 0, 0, arg0, arg2, Static1.method8561(arg1), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)I")
	@Override
	public int method9034() {
		return this.anInt6322;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!vea;I[FIIIIII)V")
	public void method5252(@OriginalArg(0) Class363 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10830, 0, 0, 0, arg1, arg3, Static1.method8561(arg0), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method9033(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glTexParameteri(super.anInt10830, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10830, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
	@Override
	public int method9038() {
		return this.anInt6328;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(FI)F")
	@Override
	public float method9037(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6328;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIBI[III)V")
	@Override
	public void method9035(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt6328 * this.anInt6322];
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glGetTexImagei(super.anInt10830, 0, 32993, 5121, local12, 0);
		for (@Pc(35) int local35 = 0; local35 < arg2; local35++) {
			Static681.method2482(local12, (arg2 - local35 - 1) * this.anInt6328, arg1, local35 * arg0, arg0);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(FI)F")
	@Override
	public float method9032(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6322;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9040() {
		return true;
	}
}
