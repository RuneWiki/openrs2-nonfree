import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!wv", name = "E", descriptor = "I")
	private int anInt3912 = -1;

	@OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
	private int anInt3913 = -1;

	@OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
	public final int anInt3916;

	@OriginalMember(owner = "client!wv", name = "D", descriptor = "I")
	public final int anInt3911;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!nq;IIIII)V")
	protected Class137_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt3916 = arg5;
		this.anInt3911 = arg4;
		@Pc(28) int local28 = super.aClass167_Sub1_43.anInt4815 - arg5 - arg3;
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glCopyTexImage2D(super.anInt7136, 0, super.anInt7134, arg2, local28, arg4, arg5, 0);
		this.method5783(true);
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!nq;IIII)V")
	public Class137_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt3911 = arg3;
		this.anInt3916 = arg4;
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glTexImage2Dub(super.anInt7136, 0, super.anInt7134, arg3, arg4, 0, Static29.method4785(super.anInt7134), 5121, null, 0);
		this.method5783(true);
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!nq;IIIIZ[IZ)V")
	public Class137_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3916 = arg4;
		this.anInt3911 = arg3;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass167_Sub1_43.method4028(this);
		if (arg5 && super.anInt7136 != 34037) {
			Static359.method5018(super.anInt7136, this.anInt3911, super.anInt7134, super.aClass167_Sub1_43.anInt4900, this.anInt3916, arg6);
			this.method5786(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7136, 0, super.anInt7134, this.anInt3911, this.anInt3916, 0, 32993, super.aClass167_Sub1_43.anInt4900, arg6, 0);
			this.method5786(false);
		}
		this.method5783(true);
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!nq;IIIIZ[BIZ)V")
	public Class137_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3911 = arg3;
		this.anInt3916 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7136 != 34037) {
			Static307.method4638(arg3, arg4, arg2, arg7, arg1, arg6);
			this.method5786(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7136, 0, super.anInt7134, this.anInt3911, this.anInt3916, 0, arg7, 5121, arg6, 0);
			this.method5786(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5783(true);
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!nq;IIIIZ[FI)V")
	public Class137_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3916 = arg4;
		this.anInt3911 = arg3;
		super.aClass167_Sub1_43.method4028(this);
		if (arg5 && super.anInt7136 != 34037) {
			Static443.method6067(arg3, arg7, arg6, arg2, arg4, arg1);
			this.method5786(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7136, 0, super.anInt7134, this.anInt3911, this.anInt3916, 0, arg7, 5126, arg6, 0);
			this.method5786(false);
		}
		this.method5783(true);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BZZ)V")
	public final void method3346(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7136 == 3553) {
			super.aClass167_Sub1_43.method4028(this);
			OpenGL.glTexParameteri(super.anInt7136, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7136, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)V")
	public final void method3347(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt7136, super.anInt7144, 0);
		this.anInt3912 = arg1;
		this.anInt3913 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZZI[IIII)V")
	protected final void method3348(@OriginalArg(5) int[] arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int arg2) {
		@Pc(33) int[] local33 = new int[arg2 * arg1];
		for (@Pc(35) int local35 = 0; local35 < arg1; local35++) {
			@Pc(41) int local41 = local35 * arg2;
			@Pc(51) int local51 = arg2 * (arg1 - local35 - 1);
			for (@Pc(53) int local53 = 0; local53 < arg2; local53++) {
				local33[local41++] = arg0[local51++];
			}
		}
		super.aClass167_Sub1_43.method4028(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt7136, 0, 0, 0, arg2, arg1, 32993, super.aClass167_Sub1_43.anInt4900, local33, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
	public final void method3349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = super.aClass167_Sub1_43.anInt4815 - arg2;
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7136, 0, arg1, this.anInt3916 - arg2 - arg3, 0, local11, arg5, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5778() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3913, this.anInt3912, super.anInt7136, 0, 0);
		this.anInt3913 = -1;
		this.anInt3912 = -1;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III[BIIIIIZ)V")
	public final void method3350(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3, @OriginalArg(9) boolean arg4) {
		if (arg4) {
			@Pc(18) int local18 = Static358.method5008(6406);
			@Pc(22) int local22 = arg2 * local18;
			@Pc(26) int local26 = arg2 * local18;
			@Pc(31) byte[] local31 = new byte[arg0 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(50) int local50 = (arg0 - local33 - 1) * local26;
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg1[local50++];
				}
			}
			arg1 = local31;
		}
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7136, 0, 0, 0, arg2, arg0, 6406, 5121, arg1, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
