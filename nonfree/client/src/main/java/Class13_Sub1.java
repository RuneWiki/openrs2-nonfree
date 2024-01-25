import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
	private int anInt1236 = -1;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
	private int anInt1233 = -1;

	@OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
	public final int anInt1238;

	@OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
	public final int anInt1239;

	static {
		new Class84("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!ht;IIIII)V")
	protected Class13_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt1238 = arg4;
		this.anInt1239 = arg5;
		@Pc(29) int local29 = super.aClass109_Sub1_22.anInt2808 - arg5 - arg3;
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glCopyTexImage2D(super.anInt3207, 0, super.anInt3197, arg2, local29, arg4, arg5, 0);
		this.method2745(true);
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!ht;IIIIZ[BIZ)V")
	public Class13_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1238 = arg3;
		this.anInt1239 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt3207 != 34037) {
			Static270.method3941(arg2, arg7, arg1, arg6, arg3, arg4);
			this.method2747(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt3207, 0, super.anInt3197, this.anInt1238, this.anInt1239, 0, arg7, 5121, arg6, 0);
			this.method2747(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method2745(true);
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!ht;IIIIZ[IZ)V")
	public Class13_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1238 = arg3;
		this.anInt1239 = arg4;
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
		super.aClass109_Sub1_22.method2578(this);
		if (arg5 && super.anInt3207 != 34037) {
			Static148.method2221(super.aClass109_Sub1_22.anInt3010, super.anInt3197, super.anInt3207, this.anInt1238, arg6, this.anInt1239);
			this.method2747(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt3207, 0, super.anInt3197, this.anInt1238, this.anInt1239, 0, 32993, super.aClass109_Sub1_22.anInt3010, arg6, 0);
			this.method2747(false);
		}
		this.method2745(true);
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!ht;IIII)V")
	public Class13_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt1239 = arg4;
		this.anInt1238 = arg3;
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glTexImage2Dub(super.anInt3207, 0, super.anInt3197, arg3, arg4, 0, Static315.method4741(super.anInt3197), 5121, null, 0);
		this.method2745(true);
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!ht;IIIIZ[FI)V")
	public Class13_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1238 = arg3;
		this.anInt1239 = arg4;
		super.aClass109_Sub1_22.method2578(this);
		if (arg5 && super.anInt3207 != 34037) {
			Static452.method6063(arg4, arg2, arg7, arg1, arg6, arg3);
			this.method2747(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt3207, 0, super.anInt3197, this.anInt1238, this.anInt1239, 0, arg7, 5126, arg6, 0);
			this.method2747(false);
		}
		this.method2745(true);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "([BZIIIIZIII)V")
	public final void method1050(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) boolean arg3, @OriginalArg(8) int arg4) {
		if (arg3) {
			@Pc(24) int local24 = Static368.method5070(6406);
			@Pc(28) int local28 = arg4 * local24;
			@Pc(32) int local32 = arg4 * local24;
			@Pc(37) byte[] local37 = new byte[local28 * arg2];
			for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
				@Pc(45) int local45 = local28 * local39;
				@Pc(56) int local56 = local32 * (arg2 - local39 - 1);
				for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
					local37[local45++] = arg0[local56++];
				}
			}
			arg0 = local37;
		}
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt3207, 0, 0, 0, arg4, arg2, 6406, 5121, arg0, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZIIIBIII[I)V")
	protected final void method1051(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(8) int[] arg2) {
		@Pc(20) int[] local20 = new int[arg0 * arg1];
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			@Pc(28) int local28 = local22 * arg1;
			@Pc(39) int local39 = arg1 * (arg0 - local22 - 1);
			for (@Pc(41) int local41 = 0; local41 < arg1; local41++) {
				local20[local28++] = arg2[local39++];
			}
		}
		super.aClass109_Sub1_22.method2578(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt3207, 0, 0, 0, arg1, arg0, 32993, super.aClass109_Sub1_22.anInt3010, local20, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIZI)V")
	public final void method1052(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt3207, super.anInt3202, 0);
		this.anInt1236 = arg1;
		this.anInt1233 = arg0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZZB)V")
	public final void method1055(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt3207 == 3553) {
			super.aClass109_Sub1_22.method2578(this);
			OpenGL.glTexParameteri(super.anInt3207, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt3207, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIII)V")
	public final void method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = super.aClass109_Sub1_22.anInt2808 - arg5;
		super.aClass109_Sub1_22.method2578(this);
		OpenGL.glCopyTexSubImage2D(super.anInt3207, 0, arg0, this.anInt1239 - arg5 - arg1, 0, local16, arg4, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	@Override
	public final void method4467() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1236, this.anInt1233, super.anInt3207, 0, 0);
		this.anInt1236 = -1;
		this.anInt1233 = -1;
	}
}
