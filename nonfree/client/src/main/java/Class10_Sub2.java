import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!rba", name = "x", descriptor = "I")
	private int anInt3353 = -1;

	@OriginalMember(owner = "client!rba", name = "E", descriptor = "I")
	private int anInt3358 = -1;

	@OriginalMember(owner = "client!rba", name = "t", descriptor = "I")
	public final int anInt3349;

	@OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
	public final int anInt3354;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!lf;IIIIZ[BIZ)V")
	public Class10_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3349 = arg3;
		this.anInt3354 = arg4;
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
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7252 != 34037) {
			Static118.method7898(arg2, arg4, arg7, arg3, arg1, arg6);
			this.method6093(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7252, 0, super.anInt7248, this.anInt3349, this.anInt3354, 0, arg7, 5121, arg6, 0);
			this.method6093(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6097(true);
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!lf;IIII)V")
	public Class10_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt3349 = arg3;
		this.anInt3354 = arg4;
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glTexImage2Dub(super.anInt7252, 0, super.anInt7248, arg3, arg4, 0, Static618.method8347(super.anInt7248), 5121, (byte[]) null, 0);
		this.method6097(true);
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!lf;IIIII)V")
	public Class10_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt3354 = arg5;
		this.anInt3349 = arg4;
		@Pc(28) int local28 = super.aClass95_Sub3_30.anInt5669 - arg5 - arg3;
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glCopyTexImage2D(super.anInt7252, 0, super.anInt7248, arg2, local28, arg4, arg5, 0);
		this.method6097(true);
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!lf;IIIIZ[IIIZ)V")
	public Class10_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3354 = arg4;
		this.anInt3349 = arg3;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass95_Sub3_30.method4864(this);
		if (super.anInt7252 != 34037 && arg5 && arg7 == 0) {
			Static591.method7804(arg6, super.anInt7248, this.anInt3354, super.anInt7252, this.anInt3349, super.aClass95_Sub3_30.anInt5792);
			this.method6093(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt7252, 0, super.anInt7248, this.anInt3349, this.anInt3354, 0, 32993, super.aClass95_Sub3_30.anInt5792, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method6093(false);
		}
		this.method6097(true);
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!lf;IIIIZ[FI)V")
	public Class10_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3354 = arg4;
		this.anInt3349 = arg3;
		super.aClass95_Sub3_30.method4864(this);
		if (arg5 && super.anInt7252 != 34037) {
			Static612.method8294(arg6, arg4, arg7, arg1, arg2, arg3);
			this.method6093(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7252, 0, super.anInt7248, this.anInt3349, this.anInt3354, 0, arg7, 5126, arg6, 0);
			this.method6093(false);
		}
		this.method6097(true);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	@Override
	public final void method6091() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3353, this.anInt3358, super.anInt7252, 0, 0);
		this.anInt3358 = -1;
		this.anInt3353 = -1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIIIB)V")
	public final void method2855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = super.aClass95_Sub3_30.anInt5669 - arg4 - arg1;
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7252, 0, arg3, this.anInt3354 - arg4 - arg2, arg5, local23, arg0, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIZ)V")
	public final void method2857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt7252, super.anInt7244, 0);
		this.anInt3353 = arg1;
		this.anInt3358 = arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "([BIIIIIZZII)V")
	public final void method2858(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(7) boolean arg2, @OriginalArg(8) int arg3, @OriginalArg(9) int arg4) {
		if (arg2) {
			@Pc(15) int local15 = Static571.method7502(6406);
			@Pc(19) int local19 = local15 * arg4;
			@Pc(23) int local23 = arg4 * local15;
			@Pc(28) byte[] local28 = new byte[arg3 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
				@Pc(36) int local36 = local30 * local19;
				@Pc(47) int local47 = (arg3 - local30 - 1) * local23;
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg0[local47++];
				}
			}
			arg0 = local28;
		}
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7252, 0, 0, 0, arg4, arg3, 6406, 5121, arg0, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BZZ)V")
	public final void method2859(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7252 == 3553) {
			super.aClass95_Sub3_30.method4864(this);
			OpenGL.glTexParameteri(super.anInt7252, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7252, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIZIII[I)V")
	public final void method2860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int[] arg5) {
		if (arg3 == 0) {
			arg3 = arg0;
		}
		@Pc(27) int[] local27 = new int[arg0 * arg4];
		for (@Pc(29) int local29 = 0; local29 < arg4; local29++) {
			@Pc(35) int local35 = arg0 * local29;
			@Pc(47) int local47 = arg3 * (arg4 - local29 - 1);
			for (@Pc(49) int local49 = 0; local49 < arg0; local49++) {
				local27[local35++] = arg5[local47++];
			}
		}
		super.aClass95_Sub3_30.method4864(this);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt7252, 0, arg1, this.anInt3354 - arg2 - arg4, arg0, arg4, 32993, super.aClass95_Sub3_30.anInt5792, local27, 0);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
