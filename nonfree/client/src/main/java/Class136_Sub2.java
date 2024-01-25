import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class136_Sub2 extends Class136 implements Interface26 {

	@OriginalMember(owner = "client!nha", name = "C", descriptor = "I")
	private final int anInt6777;

	@OriginalMember(owner = "client!nha", name = "A", descriptor = "I")
	private final int anInt6775;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!eea;II[III)V")
	public Class136_Sub2(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static524.aClass187_15, Static545.aClass324_12, arg2 * arg1, false);
		this.anInt6777 = arg2;
		this.anInt6775 = arg1;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8495, 0, 6408, this.anInt6775, this.anInt6777, 0, 32993, super.aClass87_Sub1_Sub1_9.anInt2786, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!eea;Lclient!kca;Lclient!ti;II)V")
	public Class136_Sub2(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class324 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt6777 = arg4;
		this.anInt6775 = arg3;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glTexImage2Dub(super.anInt8495, 0, this.method7146(), arg3, arg4, 0, Static253.method4172(super.aClass187_14), Static642.method8578(super.aClass324_8), null, 0);
	}

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!eea;Lclient!kca;II[FII)V")
	public Class136_Sub2(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static545.aClass324_16, arg3 * arg2, false);
		this.anInt6777 = arg3;
		this.anInt6775 = arg2;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8495, 0, this.method7146(), arg2, arg3, 0, Static253.method4172(super.aClass187_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!eea;Lclient!kca;II[BII)V")
	public Class136_Sub2(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static545.aClass324_12, arg3 * arg2, false);
		this.anInt6775 = arg2;
		this.anInt6777 = arg3;
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8495, 0, this.method7146(), arg2, arg3, 0, Static253.method4172(super.aClass187_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "([IIIBIII)V")
	@Override
	public void method8052(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		@Pc(25) int[] local25 = new int[this.anInt6775 * this.anInt6777];
		super.aClass87_Sub1_Sub1_9.method5079(this);
		OpenGL.glGetTexImagei(super.anInt8495, 0, 32993, 5121, local25, 0);
		for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
			Static649.method4862(local25, this.anInt6775 * (arg2 - local40 - 1), arg0, arg1 * local40, arg1);
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIIILclient!kca;Z[BI)V")
	@Override
	public void method8051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class187 arg3, @OriginalArg(7) byte[] arg4) {
		super.aClass87_Sub1_Sub1_9.method5079(this);
		if (arg0 == 0) {
			arg0 = arg1;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg1) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8495, 0, 0, 0, arg1, arg2, Static253.method4172(arg3), 5121, arg4, 0);
		if (arg0 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IF)F")
	@Override
	public float method8056(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIZII[II)V")
	@Override
	public void method8057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		super.aClass87_Sub1_Sub1_9.method5079(this);
		if (arg3 == 0) {
			arg3 = arg4;
		}
		if (arg3 != arg4) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt8495, 0, arg1, arg2, arg4, arg0, 32993, super.aClass87_Sub1_Sub1_9.anInt2786, arg5, 0);
		if (arg3 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8050() {
		return false;
	}

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "(I)I")
	@Override
	public int method8055() {
		return this.anInt6775;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(FI)F")
	@Override
	public float method8049(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method8053(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)I")
	@Override
	public int method8054() {
		return this.anInt6777;
	}
}
