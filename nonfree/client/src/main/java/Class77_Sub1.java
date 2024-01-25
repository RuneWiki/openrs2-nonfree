import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!saa", name = "L", descriptor = "[I")
	public static final int[] anIntArray109 = new int[120];

	@OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
	private int anInt2391 = -1;

	@OriginalMember(owner = "client!saa", name = "F", descriptor = "I")
	private int anInt2393 = -1;

	@OriginalMember(owner = "client!saa", name = "B", descriptor = "I")
	public final int anInt2390;

	@OriginalMember(owner = "client!saa", name = "E", descriptor = "I")
	public final int anInt2392;

	static {
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 120; local31++) {
			@Pc(36) int local36 = local31 + 1;
			@Pc(49) int local49 = (int) ((double) local36 + Math.pow(2.0D, (double) local36 / 7.0D) * 300.0D);
			local29 += local49;
			anIntArray109[local31] = local29 / 4;
		}
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!kga;IIIIZ[BIZ)V")
	public Class77_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2390 = arg3;
		this.anInt2392 = arg4;
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
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8662 != 34037) {
			Static479.method7196(arg6, arg7, arg4, arg2, arg3, arg1);
			this.method7073(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8662, 0, super.anInt8673, this.anInt2390, this.anInt2392, 0, arg7, 5121, arg6, 0);
			this.method7073(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7076(true);
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!kga;IIIIZ[FI)V")
	public Class77_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt2390 = arg3;
		this.anInt2392 = arg4;
		super.aClass44_Sub3_36.method4605(this);
		if (arg5 && super.anInt8662 != 34037) {
			Static153.method2846(arg4, arg3, arg6, arg1, arg2, arg7);
			this.method7073(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8662, 0, super.anInt8673, this.anInt2390, this.anInt2392, 0, arg7, 5126, arg6, 0);
			this.method7073(false);
		}
		this.method7076(true);
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!kga;IIIIZ[IZ)V")
	public Class77_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt2390 = arg3;
		this.anInt2392 = arg4;
		if (arg7) {
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
		super.aClass44_Sub3_36.method4605(this);
		if (arg5 && super.anInt8662 != 34037) {
			Static495.method7350(super.anInt8662, this.anInt2390, super.aClass44_Sub3_36.anInt5484, super.anInt8673, this.anInt2392, arg6);
			this.method7073(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt8662, 0, super.anInt8673, this.anInt2390, this.anInt2392, 0, 32993, super.aClass44_Sub3_36.anInt5484, arg6, 0);
			this.method7073(false);
		}
		this.method7076(true);
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!kga;IIIII)V")
	public Class77_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt2390 = arg4;
		this.anInt2392 = arg5;
		@Pc(30) int local30 = super.aClass44_Sub3_36.anInt5285 - arg5 - arg3;
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glCopyTexImage2D(super.anInt8662, 0, super.anInt8673, arg2, local30, arg4, arg5, 0);
		this.method7076(true);
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!kga;IIII)V")
	public Class77_Sub1(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt2392 = arg4;
		this.anInt2390 = arg3;
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glTexImage2Dub(super.anInt8662, 0, super.anInt8673, arg3, arg4, 0, Static296.method5095(super.anInt8673), 5121, null, 0);
		this.method7076(true);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII)V")
	public final void method2265(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt8662, super.anInt8675, 0);
		this.anInt2393 = arg1;
		this.anInt2391 = arg0;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZZI)V")
	public final void method2266(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt8662 == 3553) {
			super.aClass44_Sub3_36.method4605(this);
			OpenGL.glTexParameteri(super.anInt8662, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8662, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIZZIII[BI)V")
	public final void method2267(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(8) byte[] arg3, @OriginalArg(9) int arg4) {
		if (arg1) {
			@Pc(22) int local22 = Static242.method3879(6406);
			@Pc(26) int local26 = arg2 * local22;
			@Pc(30) int local30 = arg2 * local22;
			@Pc(35) byte[] local35 = new byte[local26 * arg0];
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				@Pc(43) int local43 = local26 * local37;
				@Pc(54) int local54 = local30 * (arg0 - local37 - 1);
				for (@Pc(56) int local56 = 0; local56 < local26; local56++) {
					local35[local43++] = arg3[local54++];
				}
			}
			arg3 = local35;
		}
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8662, 0, 0, 0, arg2, arg0, 6406, 5121, arg3, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I[IIIZIIIB)V")
	protected final void method2268(@OriginalArg(1) int[] arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int arg2) {
		@Pc(16) int[] local16 = new int[arg2 * arg1];
		for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
			@Pc(24) int local24 = local18 * arg1;
			@Pc(35) int local35 = arg1 * (arg2 - local18 - 1);
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				local16[local24++] = arg0[local35++];
			}
		}
		super.aClass44_Sub3_36.method4605(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt8662, 0, 0, 0, arg1, arg2, 32993, super.aClass44_Sub3_36.anInt5484, local16, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
	@Override
	public final void method7064() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2393, this.anInt2391, super.anInt8662, 0, 0);
		this.anInt2393 = -1;
		this.anInt2391 = -1;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIII)V")
	public final void method2272(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass44_Sub3_36.anInt5285 - arg5 - arg0;
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8662, 0, arg3, this.anInt2392 - arg1 - arg0, arg4, local13, arg2, arg0);
		OpenGL.glFlush();
	}
}
