import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class136_Sub1 extends Class136 implements Interface26 {

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "I")
	private final int anInt4112;

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
	private final int anInt4103;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!eea;Lclient!kca;IIZ[FII)V")
	public Class136_Sub1(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static545.aClass324_16, arg3 * arg2, arg4);
		this.anInt4112 = arg3;
		this.anInt4103 = arg2;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8495, 0, this.method7146(), arg2, arg3, 0, Static253.method4172(super.aClass187_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7148(arg3, arg5, super.anInt8495, arg2);
		}
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!eea;IIZ[III)V")
	public Class136_Sub1(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static524.aClass187_15, Static545.aClass324_12, arg1 * arg2, arg3);
		this.anInt4103 = arg1;
		this.anInt4112 = arg2;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		if (arg3 && arg6 == 0) {
			this.method7145(arg1, arg4, arg2, super.anInt8495);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8495, 0, 6408, this.anInt4103, this.anInt4112, 0, 32993, super.aClass87_Sub1_Sub1_9.anInt2786, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!eea;Lclient!kca;Lclient!ti;II)V")
	public Class136_Sub1(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class324 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt4112 = arg4;
		this.anInt4103 = arg3;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glTexImage2Dub(super.anInt8495, 0, this.method7146(), arg3, arg4, 0, Static253.method4172(super.aClass187_14), Static642.method8578(super.aClass324_8), null, 0);
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!eea;Lclient!kca;IIZ[BII)V")
	public Class136_Sub1(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static545.aClass324_12, arg2 * arg3, arg4);
		this.anInt4103 = arg2;
		this.anInt4112 = arg3;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7140(super.anInt8495, arg5, arg3, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8495, 0, this.method7146(), arg2, arg3, 0, Static253.method4172(super.aClass187_14), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([IIIBIII)V")
	@Override
	public void method8052(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt4112 * this.anInt4103];
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glGetTexImagei(super.anInt8495, 0, 32993, 5121, local12, 0);
		for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
			Static649.method4862(local12, (arg2 - local33 - 1) * this.anInt4103, arg0, arg1 * local33, arg1);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IF)F")
	@Override
	public float method8056(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt4103;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[FILclient!kca;IIIII)V")
	public void method3388(@OriginalArg(1) float[] arg0, @OriginalArg(3) Class187 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8495, 0, 0, 0, arg2, arg3, Static253.method4172(arg1), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)I")
	@Override
	public int method8054() {
		return this.anInt4112;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method8053(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glTexParameteri(super.anInt8495, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8495, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8050() {
		return true;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)I")
	@Override
	public int method8055() {
		return this.anInt4103;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(FI)F")
	@Override
	public float method8049(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt4112;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIILclient!kca;Z[BI)V")
	@Override
	public void method8051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class187 arg3, @OriginalArg(7) byte[] arg4) {
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt8495, 0, 0, 0, arg1, arg2, Static253.method4172(arg3), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIZII[II)V")
	@Override
	public void method8057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt8495, 0, arg1, arg2, arg4, arg0, 32993, super.aClass87_Sub1_Sub1_9.anInt2786, arg5, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
