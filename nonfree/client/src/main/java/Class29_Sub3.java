import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!kia", name = "s", descriptor = "I")
	private int anInt9584 = -1;

	@OriginalMember(owner = "client!kia", name = "A", descriptor = "I")
	private int anInt9589 = -1;

	@OriginalMember(owner = "client!kia", name = "C", descriptor = "I")
	public final int anInt9586;

	@OriginalMember(owner = "client!kia", name = "u", descriptor = "I")
	public final int anInt9587;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!vf;IIIIZ[BIZ)V")
	public Class29_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt9586 = arg3;
		this.anInt9587 = arg4;
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
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9567 != 34037) {
			Static633.method8798(arg2, arg1, arg4, arg7, arg3, arg6);
			this.method8171(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9567, 0, super.anInt9574, this.anInt9586, this.anInt9587, 0, arg7, 5121, arg6, 0);
			this.method8171(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method8164(true);
	}

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!vf;IIIII)V")
	public Class29_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt9587 = arg5;
		this.anInt9586 = arg4;
		@Pc(29) int local29 = super.aClass100_Sub3_41.anInt10175 - arg3 - arg5;
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glCopyTexImage2D(super.anInt9567, 0, super.anInt9574, arg2, local29, arg4, arg5, 0);
		this.method8164(true);
	}

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!vf;IIIIZ[IIIZ)V")
	public Class29_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt9586 = arg3;
		this.anInt9587 = arg4;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass100_Sub3_41.method8743(this);
		if (super.anInt9567 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
			Static591.method8146(this.anInt9587, arg6, super.anInt9567, super.aClass100_Sub3_41.anInt10284, super.anInt9574, this.anInt9586);
			this.method8171(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9567, 0, super.anInt9574, this.anInt9586, this.anInt9587, 0, 32993, super.aClass100_Sub3_41.anInt10284, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method8171(false);
		}
		this.method8164(true);
	}

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!vf;IIIIZ[FI)V")
	public Class29_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt9586 = arg3;
		this.anInt9587 = arg4;
		super.aClass100_Sub3_41.method8743(this);
		if (arg5 && super.anInt9567 != 34037) {
			Static665.method4487(arg2, arg4, arg7, arg3, arg6, arg1);
			this.method8171(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9567, 0, super.anInt9574, this.anInt9586, this.anInt9587, 0, arg7, 5126, arg6, 0);
			this.method8171(false);
		}
		this.method8164(true);
	}

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!vf;IIII)V")
	public Class29_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt9586 = arg3;
		this.anInt9587 = arg4;
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glTexImage2Dub(super.anInt9567, 0, super.anInt9574, arg3, arg4, 0, Static271.method4452(super.anInt9574), 5121, (byte[]) null, 0);
		this.method8164(true);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIBIIII)V")
	public final void method8172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass100_Sub3_41.anInt10175 - arg4 - arg2;
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9567, 0, arg0, this.anInt9587 - arg2 - arg3, arg1, local12, arg5, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(II[BZIIIIII)V")
	public final void method8173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(9) int arg4) {
		if (arg3) {
			@Pc(18) int local18 = Static453.method6398(6406);
			@Pc(22) int local22 = local18 * arg0;
			@Pc(26) int local26 = arg0 * local18;
			@Pc(31) byte[] local31 = new byte[local22 * arg4];
			for (@Pc(33) int local33 = 0; local33 < arg4; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(49) int local49 = local26 * (arg4 - local33 - 1);
				for (@Pc(51) int local51 = 0; local51 < local22; local51++) {
					local31[local39++] = arg2[local49++];
				}
			}
			arg2 = local31;
		}
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9567, 0, 0, 0, arg0, arg4, 6406, 5121, arg2, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZIZ)V")
	public final void method8174(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9567 == 3553) {
			super.aClass100_Sub3_41.method8743(this);
			OpenGL.glTexParameteri(super.anInt9567, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9567, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I[IIZIBIII)V")
	public final void method8175(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg5 == 0) {
			arg5 = arg3;
		}
		@Pc(21) int[] local21 = new int[arg3 * arg2];
		for (@Pc(23) int local23 = 0; local23 < arg2; local23++) {
			@Pc(29) int local29 = arg3 * local23;
			@Pc(40) int local40 = (arg2 - local23 - 1) * arg5;
			for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
				local21[local29++] = arg0[local40++];
			}
		}
		super.aClass100_Sub3_41.method8743(this);
		if (arg3 != arg5) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt9567, 0, arg1, this.anInt9587 - arg4 - arg2, arg3, arg2, 32993, super.aClass100_Sub3_41.anInt10284, local21, 0);
		if (arg5 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIII)V")
	public final void method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt9567, super.anInt9573, 0);
		this.anInt9584 = arg0;
		this.anInt9589 = arg1;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V")
	@Override
	public final void method8162() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt9584, this.anInt9589, super.anInt9567, 0, 0);
		this.anInt9589 = -1;
		this.anInt9584 = -1;
	}
}
