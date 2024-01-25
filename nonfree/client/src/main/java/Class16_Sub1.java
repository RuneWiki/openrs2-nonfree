import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!waa", name = "F", descriptor = "I")
	private int anInt351 = -1;

	@OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
	private int anInt353 = -1;

	@OriginalMember(owner = "client!waa", name = "y", descriptor = "I")
	public final int anInt345;

	@OriginalMember(owner = "client!waa", name = "E", descriptor = "I")
	public final int anInt350;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!en;IIIIZ[BIZ)V")
	public Class16_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt345 = arg3;
		this.anInt350 = arg4;
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
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9862 != 34037) {
			Static493.method6863(arg7, arg4, arg3, arg6, arg1, arg2);
			this.method7844(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9862, 0, super.anInt9852, this.anInt345, this.anInt350, 0, arg7, 5121, arg6, 0);
			this.method7844(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7843(true);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!en;IIIIZ[FI)V")
	public Class16_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt350 = arg4;
		this.anInt345 = arg3;
		super.aClass90_Sub1_43.method2126(this);
		if (arg5 && super.anInt9862 != 34037) {
			Static71.method987(arg4, arg7, arg2, arg6, arg1, arg3);
			this.method7844(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9862, 0, super.anInt9852, this.anInt345, this.anInt350, 0, arg7, 5126, arg6, 0);
			this.method7844(false);
		}
		this.method7843(true);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!en;IIIIZ[IZ)V")
	public Class16_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt345 = arg3;
		this.anInt350 = arg4;
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
		super.aClass90_Sub1_43.method2126(this);
		if (arg5 && super.anInt9862 != 34037) {
			Static74.method1033(super.aClass90_Sub1_43.anInt2454, this.anInt350, arg6, super.anInt9862, this.anInt345, super.anInt9852);
			this.method7844(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt9862, 0, super.anInt9852, this.anInt345, this.anInt350, 0, 32993, super.aClass90_Sub1_43.anInt2454, arg6, 0);
			this.method7844(false);
		}
		this.method7843(true);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!en;IIIII)V")
	protected Class16_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt345 = arg4;
		this.anInt350 = arg5;
		@Pc(28) int local28 = super.aClass90_Sub1_43.anInt2266 - arg3 - arg5;
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glCopyTexImage2D(super.anInt9862, 0, super.anInt9852, arg2, local28, arg4, arg5, 0);
		this.method7843(true);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!en;IIII)V")
	public Class16_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt350 = arg4;
		this.anInt345 = arg3;
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glTexImage2Dub(super.anInt9862, 0, super.anInt9852, arg3, arg4, 0, Static122.method1910(super.anInt9852), 5121, null, 0);
		this.method7843(true);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I[BZIIIIIII)V")
	public final void method299(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(8) int arg4) {
		if (arg2) {
			@Pc(18) int local18 = Static440.method6243(6406);
			@Pc(22) int local22 = arg0 * local18;
			@Pc(26) int local26 = arg0 * local18;
			@Pc(31) byte[] local31 = new byte[local22 * arg3];
			for (@Pc(33) int local33 = 0; local33 < arg3; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(51) int local51 = (arg3 - local33 - 1) * local26;
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg1[local51++];
				}
			}
			arg1 = local31;
		}
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9862, 0, 0, 0, arg0, arg3, 6406, 5121, arg1, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIBI)V")
	public final void method300(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt9862, super.anInt9857, 0);
		this.anInt353 = arg1;
		this.anInt351 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	@Override
	public final void method7838() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt351, this.anInt353, super.anInt9862, 0, 0);
		this.anInt351 = -1;
		this.anInt353 = -1;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZIIIIIBI[I)V")
	protected final void method302(@OriginalArg(4) int arg0, @OriginalArg(7) int arg1, @OriginalArg(8) int[] arg2) {
		@Pc(23) int[] local23 = new int[arg1 * arg0];
		for (@Pc(25) int local25 = 0; local25 < arg0; local25++) {
			@Pc(31) int local31 = arg1 * local25;
			@Pc(42) int local42 = arg1 * (arg0 - local25 - 1);
			for (@Pc(44) int local44 = 0; local44 < arg1; local44++) {
				local23[local31++] = arg2[local42++];
			}
		}
		super.aClass90_Sub1_43.method2126(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt9862, 0, 0, 0, arg1, arg0, 32993, super.aClass90_Sub1_43.anInt2454, local23, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZZI)V")
	public final void method303(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt9862 == 3553) {
			super.aClass90_Sub1_43.method2126(this);
			OpenGL.glTexParameteri(super.anInt9862, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9862, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIII)V")
	public final void method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass90_Sub1_43.anInt2266 - arg0 - arg1;
		super.aClass90_Sub1_43.method2126(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9862, 0, arg4, this.anInt350 - arg5 - arg1, arg2, local13, arg3, arg1);
		OpenGL.glFlush();
	}
}
