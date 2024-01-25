import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public class Class88_Sub2 extends Class88 {

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	private int anInt6210 = -1;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	private int anInt6212 = -1;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	public final int anInt6213;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "I")
	public final int anInt6216;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!oea;IIIII)V")
	public Class88_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt6213 = arg5;
		this.anInt6216 = arg4;
		@Pc(30) int local30 = super.aClass87_Sub2_32.anInt7352 - arg5 - arg3;
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glCopyTexImage2D(super.anInt8317, 0, super.anInt8313, arg2, local30, arg4, arg5, 0);
		this.method6981(true);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!oea;IIII)V")
	public Class88_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt6213 = arg4;
		this.anInt6216 = arg3;
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glTexImage2Dub(super.anInt8317, 0, super.anInt8313, arg3, arg4, 0, Static471.method6784(super.anInt8313), 5121, null, 0);
		this.method6981(true);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!oea;IIIIZ[IIIZ)V")
	public Class88_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6213 = arg4;
		this.anInt6216 = arg3;
		if (arg9) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = arg3 * (arg4 - local28 - 1);
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass87_Sub2_32.method6167(this);
		if (super.anInt8317 != 34037 && arg5 && arg7 == 0) {
			Static93.method1625(this.anInt6213, super.aClass87_Sub2_32.anInt7396, arg6, super.anInt8317, this.anInt6216, super.anInt8313);
			this.method6986(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt8317, 0, super.anInt8313, this.anInt6216, this.anInt6213, 0, 32993, super.aClass87_Sub2_32.anInt7396, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method6986(false);
		}
		this.method6981(true);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!oea;IIIIZ[BIZ)V")
	public Class88_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6216 = arg3;
		this.anInt6213 = arg4;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8317 != 34037) {
			Static47.method940(arg7, arg2, arg4, arg3, arg1, arg6);
			this.method6986(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8317, 0, super.anInt8313, this.anInt6216, this.anInt6213, 0, arg7, 5121, arg6, 0);
			this.method6986(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6981(true);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!oea;IIIIZ[FI)V")
	public Class88_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6213 = arg4;
		this.anInt6216 = arg3;
		super.aClass87_Sub2_32.method6167(this);
		if (arg5 && super.anInt8317 != 34037) {
			Static217.method3742(arg6, arg4, arg3, arg2, arg1, arg7);
			this.method6986(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8317, 0, super.anInt8313, this.anInt6216, this.anInt6213, 0, arg7, 5126, arg6, 0);
			this.method6986(false);
		}
		this.method6981(true);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
	public final void method5200(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt8317, super.anInt8318, 0);
		this.anInt6212 = arg0;
		this.anInt6210 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIZIIII[BI)V")
	public final void method5201(@OriginalArg(3) boolean arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2, @OriginalArg(8) byte[] arg3, @OriginalArg(9) int arg4) {
		if (arg0) {
			@Pc(18) int local18 = Static131.method2560(6406);
			@Pc(22) int local22 = local18 * arg1;
			@Pc(26) int local26 = local18 * arg1;
			@Pc(31) byte[] local31 = new byte[local22 * arg4];
			for (@Pc(33) int local33 = 0; local33 < arg4; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(51) int local51 = local26 * (arg4 - local33 - 1);
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg3[local51++];
				}
			}
			arg3 = local31;
		}
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8317, 0, 0, 0, arg1, arg4, 6406, 5121, arg3, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BZZ)V")
	public final void method5202(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt8317 == 3553) {
			super.aClass87_Sub2_32.method6167(this);
			OpenGL.glTexParameteri(super.anInt8317, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8317, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBIIZIII[I)V")
	protected final void method5203(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(8) int[] arg2) {
		@Pc(14) int[] local14 = new int[arg1 * arg0];
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			@Pc(21) int local21 = local16 * arg0;
			@Pc(32) int local32 = (arg1 - local16 - 1) * arg0;
			for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
				local14[local21++] = arg2[local32++];
			}
		}
		super.aClass87_Sub2_32.method6167(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt8317, 0, 0, 0, arg0, arg1, 32993, super.aClass87_Sub2_32.anInt7396, local14, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	@Override
	public final void method6980() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6210, this.anInt6212, super.anInt8317, 0, 0);
		this.anInt6212 = -1;
		this.anInt6210 = -1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIII)V")
	public final void method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = super.aClass87_Sub2_32.anInt7352 - arg5 - arg1;
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8317, 0, arg2, this.anInt6213 - arg3 - arg5, arg4, local11, arg0, arg5);
		OpenGL.glFlush();
	}
}
