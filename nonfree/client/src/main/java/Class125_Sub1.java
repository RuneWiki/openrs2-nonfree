import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
	private int anInt10856 = -1;

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
	private int anInt10864 = -1;

	@OriginalMember(owner = "client!fu", name = "x", descriptor = "I")
	public final int anInt10858;

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "I")
	public final int anInt10867;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!aq;IIIIZ[BIZ)V")
	public Class125_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt10858 = arg4;
		this.anInt10867 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt10843 != 34037) {
			Static639.method8420(arg7, arg6, arg2, arg4, arg1, arg3);
			this.method9213(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt10843, 0, super.anInt10853, this.anInt10867, this.anInt10858, 0, arg7, 5121, arg6, 0);
			this.method9213(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method9217(true);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!aq;IIII)V")
	public Class125_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt10858 = arg4;
		this.anInt10867 = arg3;
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glTexImage2Dub(super.anInt10843, 0, super.anInt10853, arg3, arg4, 0, Static156.method2537(super.anInt10853), 5121, (byte[]) null, 0);
		this.method9217(true);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!aq;IIIIZ[IIIZ)V")
	public Class125_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt10867 = arg3;
		this.anInt10858 = arg4;
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
		super.aClass22_Sub1_41.method955(this);
		if (super.anInt10843 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
			Static321.method4688(this.anInt10858, this.anInt10867, super.anInt10853, super.anInt10843, arg6, super.aClass22_Sub1_41.anInt1038);
			this.method9213(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt10843, 0, super.anInt10853, this.anInt10867, this.anInt10858, 0, 32993, super.aClass22_Sub1_41.anInt1038, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method9213(false);
		}
		this.method9217(true);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!aq;IIIII)V")
	public Class125_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt10858 = arg5;
		this.anInt10867 = arg4;
		@Pc(29) int local29 = super.aClass22_Sub1_41.anInt833 - arg3 - arg5;
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glCopyTexImage2D(super.anInt10843, 0, super.anInt10853, arg2, local29, arg4, arg5, 0);
		this.method9217(true);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!aq;IIIIZ[FI)V")
	public Class125_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt10858 = arg4;
		this.anInt10867 = arg3;
		super.aClass22_Sub1_41.method955(this);
		if (arg5 && super.anInt10843 != 34037) {
			Static431.method5713(arg1, arg7, arg2, arg6, arg3, arg4);
			this.method9213(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt10843, 0, super.anInt10853, this.anInt10867, this.anInt10858, 0, arg7, 5126, arg6, 0);
			this.method9213(false);
		}
		this.method9217(true);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIII)V")
	public final void method9218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = super.aClass22_Sub1_41.anInt833 - arg4 - arg3;
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glCopyTexSubImage2D(super.anInt10843, 0, arg1, this.anInt10858 - arg3 - arg5, arg2, local18, arg0, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZII)V")
	public final void method9219(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt10843, super.anInt10846, 0);
		this.anInt10856 = arg1;
		this.anInt10864 = arg0;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIZI[BIIII)V")
	public final void method9222(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(8) int arg3, @OriginalArg(9) int arg4) {
		if (arg1) {
			@Pc(15) int local15 = Static717.method9503(6406);
			@Pc(19) int local19 = local15 * arg4;
			@Pc(23) int local23 = arg4 * local15;
			@Pc(28) byte[] local28 = new byte[local19 * arg0];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(36) int local36 = local30 * local19;
				@Pc(46) int local46 = (arg0 - local30 - 1) * local23;
				for (@Pc(48) int local48 = 0; local48 < local19; local48++) {
					local28[local36++] = arg2[local46++];
				}
			}
			arg2 = local28;
		}
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10843, 0, 0, 0, arg4, arg0, 6406, 5121, arg2, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "([IIZIIBIII)V")
	public final void method9223(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		if (arg1 == 0) {
			arg1 = arg3;
		}
		@Pc(30) int[] local30 = new int[arg4 * arg3];
		for (@Pc(32) int local32 = 0; local32 < arg4; local32++) {
			@Pc(38) int local38 = arg3 * local32;
			@Pc(49) int local49 = arg1 * (arg4 - local32 - 1);
			for (@Pc(51) int local51 = 0; local51 < arg3; local51++) {
				local30[local38++] = arg0[local49++];
			}
		}
		super.aClass22_Sub1_41.method955(this);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt10843, 0, arg2, this.anInt10858 - arg4 - arg5, arg3, arg4, 32993, super.aClass22_Sub1_41.anInt1038, local30, 0);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	@Override
	public final void method9208() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt10864, this.anInt10856, super.anInt10843, 0, 0);
		this.anInt10864 = -1;
		this.anInt10856 = -1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZZZ)V")
	public final void method9224(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt10843 == 3553) {
			super.aClass22_Sub1_41.method955(this);
			OpenGL.glTexParameteri(super.anInt10843, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt10843, 10243, arg0 ? 10497 : 33071);
		}
	}
}
