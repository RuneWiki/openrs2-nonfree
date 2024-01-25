import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
	private int anInt579 = -1;

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
	private int anInt582 = -1;

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
	public final int anInt578;

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
	public final int anInt570;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!qj;IIIIZ[BIZ)V")
	public Class23_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt578 = arg4;
		this.anInt570 = arg3;
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
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9352 != 34037) {
			Static535.method7309(arg1, arg3, arg7, arg6, arg4, arg2);
			this.method7782(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9352, 0, super.anInt9354, this.anInt570, this.anInt578, 0, arg7, 5121, arg6, 0);
			this.method7782(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7783(true);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!qj;IIII)V")
	public Class23_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt570 = arg3;
		this.anInt578 = arg4;
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glTexImage2Dub(super.anInt9352, 0, super.anInt9354, arg3, arg4, 0, Static123.method1797(super.anInt9354), 5121, null, 0);
		this.method7783(true);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!qj;IIIIZ[IZ)V")
	public Class23_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt578 = arg4;
		this.anInt570 = arg3;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass100_Sub3_42.method6277(this);
		if (arg5 && super.anInt9352 != 34037) {
			Static474.method6724(super.anInt9352, super.anInt9354, this.anInt570, this.anInt578, arg6, super.aClass100_Sub3_42.anInt7706);
			this.method7782(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt9352, 0, super.anInt9354, this.anInt570, this.anInt578, 0, 32993, super.aClass100_Sub3_42.anInt7706, arg6, 0);
			this.method7782(false);
		}
		this.method7783(true);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!qj;IIIIZ[FI)V")
	public Class23_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt578 = arg4;
		this.anInt570 = arg3;
		super.aClass100_Sub3_42.method6277(this);
		if (arg5 && super.anInt9352 != 34037) {
			Static5.method157(arg4, arg6, arg3, arg7, arg2, arg1);
			this.method7782(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9352, 0, super.anInt9354, this.anInt570, this.anInt578, 0, arg7, 5126, arg6, 0);
			this.method7782(false);
		}
		this.method7783(true);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!qj;IIIII)V")
	public Class23_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt570 = arg4;
		this.anInt578 = arg5;
		@Pc(28) int local28 = super.aClass100_Sub3_42.anInt7521 - arg3 - arg5;
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glCopyTexImage2D(super.anInt9352, 0, super.anInt9354, arg2, local28, arg4, arg5, 0);
		this.method7783(true);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIZIII[BI)V")
	public final void method371(@OriginalArg(1) int arg0, @OriginalArg(4) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(8) byte[] arg3, @OriginalArg(9) int arg4) {
		if (arg1) {
			@Pc(18) int local18 = Static288.method4279(6406);
			@Pc(22) int local22 = local18 * arg4;
			@Pc(26) int local26 = local18 * arg4;
			@Pc(31) byte[] local31 = new byte[local22 * arg2];
			for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(51) int local51 = local26 * (arg2 - local33 - 1);
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg3[local51++];
				}
			}
			arg3 = local31;
		}
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9352, 0, 0, 0, arg4, arg2, 6406, 5121, arg3, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBIIIII)V")
	public final void method372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = super.aClass100_Sub3_42.anInt7521 - arg5 - arg1;
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9352, 0, arg0, this.anInt578 - arg5 - arg3, arg2, local16, arg4, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	@Override
	public final void method7774() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt582, this.anInt579, super.anInt9352, 0, 0);
		this.anInt579 = -1;
		this.anInt582 = -1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIZII[II)V")
	protected final void method373(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int[] arg2) {
		@Pc(23) int[] local23 = new int[arg1 * arg0];
		for (@Pc(25) int local25 = 0; local25 < arg1; local25++) {
			@Pc(31) int local31 = local25 * arg0;
			@Pc(42) int local42 = (arg1 - local25 - 1) * arg0;
			for (@Pc(44) int local44 = 0; local44 < arg0; local44++) {
				local23[local31++] = arg2[local42++];
			}
		}
		super.aClass100_Sub3_42.method6277(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt9352, 0, 0, 0, arg0, arg1, 32993, super.aClass100_Sub3_42.anInt7706, local23, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIB)V")
	public final void method375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt9352, super.anInt9359, 0);
		this.anInt582 = arg0;
		this.anInt579 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZBZ)V")
	public final void method377(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9352 == 3553) {
			super.aClass100_Sub3_42.method6277(this);
			OpenGL.glTexParameteri(super.anInt9352, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9352, 10243, arg0 ? 10497 : 33071);
		}
	}
}
