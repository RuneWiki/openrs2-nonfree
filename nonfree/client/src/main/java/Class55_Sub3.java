import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public class Class55_Sub3 extends Class55 {

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
	private int anInt6493 = -1;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
	private int anInt6494 = -1;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
	public final int anInt6491;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
	public final int anInt6487;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ef;IIIIZ[IZ)V")
	public Class55_Sub3(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6491 = arg4;
		this.anInt6487 = arg3;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass49_Sub2_42.method1646(this);
		if (arg5 && super.anInt7037 != 34037) {
			Static167.method2727(super.aClass49_Sub2_42.anInt2043, arg6, this.anInt6491, super.anInt7037, super.anInt7029, this.anInt6487);
			this.method5560(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7037, 0, super.anInt7029, this.anInt6487, this.anInt6491, 0, 32993, super.aClass49_Sub2_42.anInt2043, arg6, 0);
			this.method5560(false);
		}
		this.method5553(true);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ef;IIIII)V")
	protected Class55_Sub3(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt6487 = arg4;
		this.anInt6491 = arg5;
		@Pc(30) int local30 = super.aClass49_Sub2_42.anInt1823 - arg5 - arg3;
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glCopyTexImage2D(super.anInt7037, 0, super.anInt7029, arg2, local30, arg4, arg5, 0);
		this.method5553(true);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ef;IIII)V")
	public Class55_Sub3(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt6491 = arg4;
		this.anInt6487 = arg3;
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glTexImage2Dub(super.anInt7037, 0, super.anInt7029, arg3, arg4, 0, Static192.method3007(super.anInt7029), 5121, null, 0);
		this.method5553(true);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ef;IIIIZ[BIZ)V")
	public Class55_Sub3(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt6487 = arg3;
		this.anInt6491 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7037 != 34037) {
			Static162.method2644(arg3, arg1, arg4, arg6, arg7, arg2);
			this.method5560(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7037, 0, super.anInt7029, this.anInt6487, this.anInt6491, 0, arg7, 5121, arg6, 0);
			this.method5560(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5553(true);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ef;IIIIZ[FI)V")
	public Class55_Sub3(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6487 = arg3;
		this.anInt6491 = arg4;
		super.aClass49_Sub2_42.method1646(this);
		if (arg5 && super.anInt7037 != 34037) {
			Static396.method5221(arg3, arg4, arg7, arg2, arg1, arg6);
			this.method5560(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7037, 0, super.anInt7029, this.anInt6487, this.anInt6491, 0, arg7, 5126, arg6, 0);
			this.method5560(false);
		}
		this.method5553(true);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZZ)V")
	public final void method5116(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7037 == 3553) {
			super.aClass49_Sub2_42.method1646(this);
			OpenGL.glTexParameteri(super.anInt7037, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7037, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
	public final void method5118(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt7037, super.anInt7034, 0);
		this.anInt6494 = arg1;
		this.anInt6493 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V")
	public final void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass49_Sub2_42.anInt1823 - arg3;
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7037, 0, arg2, this.anInt6491 - arg1 - arg3, 0, local13, arg4, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIZI[BI)V")
	public final void method5121(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) boolean arg3, @OriginalArg(8) byte[] arg4) {
		if (arg3) {
			@Pc(18) int local18 = Static157.method2555(6406);
			@Pc(22) int local22 = arg2 * local18;
			@Pc(26) int local26 = arg2 * local18;
			@Pc(31) byte[] local31 = new byte[local22 * arg0];
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = local26 * (arg0 - local33 - 1);
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg4[local50++];
				}
			}
			arg4 = local31;
		}
		super.aClass49_Sub2_42.method1646(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7037, 0, 0, 0, arg2, arg0, 6406, 5121, arg4, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	@Override
	public final void method5551() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6494, this.anInt6493, super.anInt7037, 0, 0);
		this.anInt6494 = -1;
		this.anInt6493 = -1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIIIII[III)V")
	protected final void method5122(@OriginalArg(4) int arg0, @OriginalArg(6) int[] arg1, @OriginalArg(7) int arg2) {
		@Pc(19) int[] local19 = new int[arg0 * arg2];
		for (@Pc(21) int local21 = 0; local21 < arg2; local21++) {
			@Pc(27) int local27 = arg0 * local21;
			@Pc(38) int local38 = arg0 * (arg2 - local21 - 1);
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				local19[local27++] = arg1[local38++];
			}
		}
		super.aClass49_Sub2_42.method1646(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt7037, 0, 0, 0, arg0, arg2, 32993, super.aClass49_Sub2_42.anInt2043, local19, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
