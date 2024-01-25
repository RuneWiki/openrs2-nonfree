import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public class Class59_Sub3 extends Class59 {

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	private int anInt7483 = -1;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
	private int anInt7481 = -1;

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
	public final int anInt7488;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
	public final int anInt7486;

	static {
		new Class55("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!vd;IIIII)V")
	protected Class59_Sub3(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt7488 = arg5;
		this.anInt7486 = arg4;
		@Pc(29) int local29 = super.aClass51_Sub2_43.anInt6830 - arg3 - arg5;
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glCopyTexImage2D(super.anInt7465, 0, super.anInt7474, arg2, local29, arg4, arg5, 0);
		this.method5760(true);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!vd;IIIIZ[FI)V")
	public Class59_Sub3(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt7486 = arg3;
		this.anInt7488 = arg4;
		super.aClass51_Sub2_43.method5364(this);
		if (arg5 && super.anInt7465 != 34037) {
			Static226.method3126(arg6, arg7, arg4, arg1, arg3, arg2);
			this.method5757(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7465, 0, super.anInt7474, this.anInt7486, this.anInt7488, 0, arg7, 5126, arg6, 0);
			this.method5757(false);
		}
		this.method5760(true);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!vd;IIII)V")
	public Class59_Sub3(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt7486 = arg3;
		this.anInt7488 = arg4;
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glTexImage2Dub(super.anInt7465, 0, super.anInt7474, arg3, arg4, 0, Static110.method1907(super.anInt7474), 5121, null, 0);
		this.method5760(true);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!vd;IIIIZ[IZ)V")
	public Class59_Sub3(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7486 = arg3;
		this.anInt7488 = arg4;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass51_Sub2_43.method5364(this);
		if (arg5 && super.anInt7465 != 34037) {
			Static342.method4438(this.anInt7486, super.anInt7465, super.anInt7474, arg6, this.anInt7488, super.aClass51_Sub2_43.anInt6955);
			this.method5757(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7465, 0, super.anInt7474, this.anInt7486, this.anInt7488, 0, 32993, super.aClass51_Sub2_43.anInt6955, arg6, 0);
			this.method5757(false);
		}
		this.method5760(true);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!vd;IIIIZ[BIZ)V")
	public Class59_Sub3(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt7486 = arg3;
		this.anInt7488 = arg4;
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
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7465 != 34037) {
			Static436.method5610(arg6, arg7, arg2, arg1, arg3, arg4);
			this.method5757(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7465, 0, super.anInt7474, this.anInt7486, this.anInt7488, 0, arg7, 5121, arg6, 0);
			this.method5757(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5760(true);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[IIIIIBZ)V")
	protected final void method5764(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(20) int[] local20 = new int[arg2 * arg0];
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			@Pc(28) int local28 = arg2 * local22;
			@Pc(39) int local39 = arg2 * (arg0 - local22 - 1);
			for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
				local20[local28++] = arg1[local39++];
			}
		}
		super.aClass51_Sub2_43.method5364(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt7465, 0, 0, 0, arg2, arg0, 32993, super.aClass51_Sub2_43.anInt6955, local20, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III[BIIIIZI)V")
	public final void method5765(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(8) boolean arg3, @OriginalArg(9) int arg4) {
		if (arg3) {
			@Pc(18) int local18 = Static31.method416(6406);
			@Pc(22) int local22 = arg2 * local18;
			@Pc(26) int local26 = arg2 * local18;
			@Pc(31) byte[] local31 = new byte[arg4 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg4; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(50) int local50 = (arg4 - local33 - 1) * local26;
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg1[local50++];
				}
			}
			arg1 = local31;
		}
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7465, 0, 0, 0, arg2, arg4, 6406, 5121, arg1, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIBII)V")
	public final void method5766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20 = super.aClass51_Sub2_43.anInt6830 - arg5;
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7465, 0, arg3, this.anInt7488 - arg5 - arg0, 0, local20, arg1, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	@Override
	public final void method5755() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7481, this.anInt7483, super.anInt7465, 0, 0);
		this.anInt7483 = -1;
		this.anInt7481 = -1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
	public final void method5768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt7465, super.anInt7472, 0);
		this.anInt7481 = arg0;
		this.anInt7483 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZB)V")
	public final void method5770(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt7465 == 3553) {
			super.aClass51_Sub2_43.method5364(this);
			OpenGL.glTexParameteri(super.anInt7465, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7465, 10243, arg0 ? 10497 : 33071);
		}
	}
}
