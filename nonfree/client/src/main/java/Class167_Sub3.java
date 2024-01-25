import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public class Class167_Sub3 extends Class167 {

	@OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
	private int anInt8731 = -1;

	@OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
	private int anInt8737 = -1;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
	public final int anInt8740;

	@OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
	public final int anInt8729;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!rs;IIIII)V")
	public Class167_Sub3(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt8740 = arg4;
		this.anInt8729 = arg5;
		@Pc(29) int local29 = super.aClass133_Sub3_34.anInt8481 - arg3 - arg5;
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glCopyTexImage2D(super.anInt9270, 0, super.anInt9261, arg2, local29, arg4, arg5, 0);
		this.method8013(true);
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!rs;IIIIZ[BIZ)V")
	public Class167_Sub3(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt8740 = arg3;
		this.anInt8729 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9270 != 34037) {
			Static283.method4495(arg1, arg4, arg2, arg7, arg3, arg6);
			this.method8012(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9270, 0, super.anInt9261, this.anInt8740, this.anInt8729, 0, arg7, 5121, arg6, 0);
			this.method8012(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method8013(true);
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!rs;IIIIZ[IIIZ)V")
	public Class167_Sub3(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt8729 = arg4;
		this.anInt8740 = arg3;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass133_Sub3_34.method7375(this);
		if (super.anInt9270 != 34037 && arg5 && arg7 == 0) {
			Static113.method1741(arg6, this.anInt8729, super.anInt9261, this.anInt8740, super.aClass133_Sub3_34.anInt8566, super.anInt9270);
			this.method8012(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9270, 0, super.anInt9261, this.anInt8740, this.anInt8729, 0, 32993, super.aClass133_Sub3_34.anInt8566, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method8012(false);
		}
		this.method8013(true);
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!rs;IIIIZ[FI)V")
	public Class167_Sub3(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt8740 = arg3;
		this.anInt8729 = arg4;
		super.aClass133_Sub3_34.method7375(this);
		if (arg5 && super.anInt9270 != 34037) {
			Static259.method4251(arg7, arg4, arg1, arg3, arg6, arg2);
			this.method8012(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9270, 0, super.anInt9261, this.anInt8740, this.anInt8729, 0, arg7, 5126, arg6, 0);
			this.method8012(false);
		}
		this.method8013(true);
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!rs;IIII)V")
	public Class167_Sub3(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt8729 = arg4;
		this.anInt8740 = arg3;
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glTexImage2Dub(super.anInt9270, 0, super.anInt9261, arg3, arg4, 0, Static48.method834(super.anInt9261), 5121, null, 0);
		this.method8013(true);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BIIIIIIZ[BI)V")
	public final void method7520(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) boolean arg3, @OriginalArg(8) byte[] arg4) {
		if (arg3) {
			@Pc(18) int local18 = Static646.method9053(6406);
			@Pc(22) int local22 = local18 * arg0;
			@Pc(26) int local26 = arg0 * local18;
			@Pc(31) byte[] local31 = new byte[local22 * arg1];
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = local26 * (arg1 - local33 - 1);
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg4[local50++];
				}
			}
			arg4 = local31;
		}
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9270, 0, 0, 0, arg0, arg1, 6406, 5121, arg4, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII[IIIZI)V")
	public final void method7522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5) {
		if (arg4 == 0) {
			arg4 = arg1;
		}
		@Pc(31) int[] local31 = new int[arg1 * arg5];
		for (@Pc(33) int local33 = 0; local33 < arg5; local33++) {
			@Pc(39) int local39 = arg1 * local33;
			@Pc(50) int local50 = arg4 * (arg5 - local33 - 1);
			for (@Pc(52) int local52 = 0; local52 < arg1; local52++) {
				local31[local39++] = arg3[local50++];
			}
		}
		super.aClass133_Sub3_34.method7375(this);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Di(super.anInt9270, 0, arg2, this.anInt8729 - arg0 - arg5, arg1, arg5, 32993, super.aClass133_Sub3_34.anInt8566, local31, 0);
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZII)V")
	public final void method7523(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt9270, super.anInt9272, 0);
		this.anInt8731 = arg0;
		this.anInt8737 = arg1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZZI)V")
	public final void method7524(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt9270 == 3553) {
			super.aClass133_Sub3_34.method7375(this);
			OpenGL.glTexParameteri(super.anInt9270, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9270, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	@Override
	public final void method8000() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt8731, this.anInt8737, super.anInt9270, 0, 0);
		this.anInt8737 = -1;
		this.anInt8731 = -1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIIIIII)V")
	public final void method7525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass133_Sub3_34.anInt8481 - arg1 - arg5;
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9270, 0, arg2, this.anInt8729 - arg3 - arg1, arg4, local13, arg0, arg1);
		OpenGL.glFlush();
	}
}
