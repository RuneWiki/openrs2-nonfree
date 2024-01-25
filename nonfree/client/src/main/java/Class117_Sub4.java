import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class117_Sub4 extends Class117 implements Interface21 {

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	private final int anInt10842;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "I")
	private final int anInt10846;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ko;Lclient!vea;Lclient!bja;II)V")
	public Class117_Sub4(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt10842 = arg4;
		this.anInt10846 = arg3;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glTexImage2Dub(super.anInt10830, 0, this.method9026(), arg3, arg4, 0, Static1.method8561(super.aClass363_16), Static243.method3625(super.aClass36_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ko;Lclient!vea;II[FII)V")
	public Class117_Sub4(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static47.aClass36_9, arg2 * arg3, false);
		this.anInt10842 = arg3;
		this.anInt10846 = arg2;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10830, 0, this.method9026(), arg2, arg3, 0, Static1.method8561(super.aClass363_16), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ko;II[III)V")
	public Class117_Sub4(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static238.aClass363_4, Static47.aClass36_5, arg1 * arg2, false);
		this.anInt10842 = arg2;
		this.anInt10846 = arg1;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10830, 0, 6408, this.anInt10846, this.anInt10842, 0, 32993, super.aClass137_Sub1_Sub1_12.anInt5950, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!ko;Lclient!vea;II[BII)V")
	public Class117_Sub4(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static47.aClass36_5, arg2 * arg3, false);
		this.anInt10846 = arg2;
		this.anInt10842 = arg3;
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10830, 0, this.method9026(), arg2, arg3, 0, Static1.method8561(super.aClass363_16), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)I")
	@Override
	public int method9034() {
		return this.anInt10842;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9040() {
		return false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBI[III)V")
	@Override
	public void method9035(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt10846 * this.anInt10842];
		super.aClass137_Sub1_Sub1_12.method8007(this);
		OpenGL.glGetTexImagei(super.anInt10830, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			Static681.method2482(local12, this.anInt10846 * (arg2 - local27 - 1), arg1, arg0 * local27, arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)I")
	@Override
	public int method9038() {
		return this.anInt10846;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIBI[III)V")
	@Override
	public void method9036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		super.aClass137_Sub1_Sub1_12.method8007(this);
		if (arg1 == 0) {
			arg1 = arg0;
		}
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt10830, 0, arg3, arg2, arg0, arg5, 32993, super.aClass137_Sub1_Sub1_12.anInt5950, arg4, 0);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method9033(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(FI)F")
	@Override
	public float method9032(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!vea;IIII[BI)V")
	@Override
	public void method9039(@OriginalArg(0) int arg0, @OriginalArg(2) Class363 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) byte[] arg4) {
		super.aClass137_Sub1_Sub1_12.method8007(this);
		if (arg3 == 0) {
			arg3 = arg0;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10830, 0, 0, 0, arg0, arg2, Static1.method8561(arg1), 5121, arg4, 0);
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(FI)F")
	@Override
	public float method9037(@OriginalArg(0) float arg0) {
		return arg0;
	}
}
