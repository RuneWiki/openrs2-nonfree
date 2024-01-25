import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
	private int anInt4452 = -1;

	@OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
	private int anInt4455 = -1;

	@OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
	public final int anInt4460;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "I")
	public final int anInt4459;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!pq;IIIIZ[IIIZ)V")
	public Class53_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4460 = arg3;
		this.anInt4459 = arg4;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass132_Sub3_40.method6759(this);
		if (super.anInt9817 != 34037 && arg5 && arg7 == 0) {
			Static424.method6296(this.anInt4460, arg6, super.anInt9821, this.anInt4459, super.anInt9817, super.aClass132_Sub3_40.anInt7918);
			this.method8293(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9817, 0, super.anInt9821, this.anInt4460, this.anInt4459, 0, 32993, super.aClass132_Sub3_40.anInt7918, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method8293(false);
		}
		this.method8287(true);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!pq;IIII)V")
	public Class53_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt4459 = arg4;
		this.anInt4460 = arg3;
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glTexImage2Dub(super.anInt9817, 0, super.anInt9821, arg3, arg4, 0, Static628.method8638(super.anInt9821), 5121, (byte[]) null, 0);
		this.method8287(true);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!pq;IIIII)V")
	public Class53_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt4459 = arg5;
		this.anInt4460 = arg4;
		@Pc(28) int local28 = super.aClass132_Sub3_40.anInt7710 - arg3 - arg5;
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glCopyTexImage2D(super.anInt9817, 0, super.anInt9821, arg2, local28, arg4, arg5, 0);
		this.method8287(true);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!pq;IIIIZ[BIZ)V")
	public Class53_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4459 = arg4;
		this.anInt4460 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9817 != 34037) {
			Static412.method6207(arg1, arg4, arg7, arg2, arg6, arg3);
			this.method8293(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9817, 0, super.anInt9821, this.anInt4460, this.anInt4459, 0, arg7, 5121, arg6, 0);
			this.method8293(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method8287(true);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!pq;IIIIZ[FI)V")
	public Class53_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4460 = arg3;
		this.anInt4459 = arg4;
		super.aClass132_Sub3_40.method6759(this);
		if (arg5 && super.anInt9817 != 34037) {
			Static209.method3092(arg2, arg7, arg1, arg4, arg3, arg6);
			this.method8293(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9817, 0, super.anInt9821, this.anInt4460, this.anInt4459, 0, arg7, 5126, arg6, 0);
			this.method8293(false);
		}
		this.method8287(true);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZII[IIIIZI)V")
	public final void method3727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5) {
		if (arg1 == 0) {
			arg1 = arg3;
		}
		@Pc(24) int[] local24 = new int[arg4 * arg3];
		for (@Pc(26) int local26 = 0; local26 < arg4; local26++) {
			@Pc(32) int local32 = arg3 * local26;
			@Pc(42) int local42 = (arg4 - local26 - 1) * arg1;
			for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
				local24[local32++] = arg2[local42++];
			}
		}
		super.aClass132_Sub3_40.method6759(this);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt9817, 0, arg0, this.anInt4459 - arg4 - arg5, arg3, arg4, 32993, super.aClass132_Sub3_40.anInt7918, local24, 0);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZII)V")
	public final void method3729(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt9817, super.anInt9819, 0);
		this.anInt4452 = arg0;
		this.anInt4455 = arg1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIZ)V")
	public final void method3730(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9817 == 3553) {
			super.aClass132_Sub3_40.method6759(this);
			OpenGL.glTexParameteri(super.anInt9817, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9817, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	@Override
	public final void method8284() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4455, this.anInt4452, super.anInt9817, 0, 0);
		this.anInt4452 = -1;
		this.anInt4455 = -1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIII)V")
	public final void method3732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = super.aClass132_Sub3_40.anInt7710 - arg2 - arg5;
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9817, 0, arg3, this.anInt4459 - arg2 - arg0, arg1, local17, arg4, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI[BIIIIIII)V")
	public final void method3733(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(9) int arg4) {
		if (arg0) {
			@Pc(30) int local30 = Static545.method7723(6406);
			@Pc(34) int local34 = local30 * arg3;
			@Pc(38) int local38 = local30 * arg3;
			@Pc(43) byte[] local43 = new byte[arg1 * local34];
			for (@Pc(45) int local45 = 0; local45 < arg1; local45++) {
				@Pc(51) int local51 = local45 * local34;
				@Pc(61) int local61 = (arg1 - local45 - 1) * local38;
				for (@Pc(63) int local63 = 0; local63 < local34; local63++) {
					local43[local51++] = arg2[local61++];
				}
			}
			arg2 = local43;
		}
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9817, 0, 0, 0, arg3, arg1, 6406, 5121, arg2, 0);
		if (arg3 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
