import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
	private int anInt5116 = -1;

	@OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
	private int anInt5121 = -1;

	@OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
	public final int anInt5120;

	@OriginalMember(owner = "client!aaa", name = "F", descriptor = "I")
	public final int anInt5125;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!ac;IIII)V")
	public Class2_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt5120 = arg4;
		this.anInt5125 = arg3;
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glTexImage2Dub(super.anInt8317, 0, super.anInt8326, arg3, arg4, 0, Static266.method4780(super.anInt8326), 5121, (byte[]) null, 0);
		this.method6976(true);
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!ac;IIIIZ[BIZ)V")
	public Class2_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5125 = arg3;
		this.anInt5120 = arg4;
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
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8317 != 34037) {
			Static263.method4644(arg3, arg1, arg6, arg4, arg2, arg7);
			this.method6977(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8317, 0, super.anInt8326, this.anInt5125, this.anInt5120, 0, arg7, 5121, arg6, 0);
			this.method6977(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6976(true);
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!ac;IIIII)V")
	public Class2_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt5120 = arg5;
		this.anInt5125 = arg4;
		@Pc(28) int local28 = super.aClass5_Sub1_32.anInt250 - arg5 - arg3;
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glCopyTexImage2D(super.anInt8317, 0, super.anInt8326, arg2, local28, arg4, arg5, 0);
		this.method6976(true);
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!ac;IIIIZ[FI)V")
	public Class2_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5125 = arg3;
		this.anInt5120 = arg4;
		super.aClass5_Sub1_32.method352(this);
		if (arg5 && super.anInt8317 != 34037) {
			Static6.method444(arg3, arg1, arg7, arg2, arg6, arg4);
			this.method6977(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8317, 0, super.anInt8326, this.anInt5125, this.anInt5120, 0, arg7, 5126, arg6, 0);
			this.method6977(false);
		}
		this.method6976(true);
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!ac;IIIIZ[IIIZ)V")
	public Class2_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5120 = arg4;
		this.anInt5125 = arg3;
		if (arg9) {
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
		super.aClass5_Sub1_32.method352(this);
		if (super.anInt8317 != 34037 && arg5 && arg7 == 0) {
			Static574.method8010(super.anInt8326, super.aClass5_Sub1_32.anInt396, super.anInt8317, this.anInt5125, this.anInt5120, arg6);
			this.method6977(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt8317, 0, super.anInt8326, this.anInt5125, this.anInt5120, 0, 32993, super.aClass5_Sub1_32.anInt396, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method6977(false);
		}
		this.method6976(true);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIZI[BIBIII)V")
	public final void method4200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(9) int arg4) {
		if (arg2) {
			@Pc(18) int local18 = Static275.method8431(6406);
			@Pc(22) int local22 = local18 * arg0;
			@Pc(26) int local26 = arg0 * local18;
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
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8317, 0, 0, 0, arg0, arg4, 6406, 5121, arg3, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I[IIIZIIII)V")
	public final void method4201(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg3 == 0) {
			arg3 = arg4;
		}
		@Pc(23) int[] local23 = new int[arg0 * arg4];
		for (@Pc(25) int local25 = 0; local25 < arg0; local25++) {
			@Pc(31) int local31 = arg4 * local25;
			@Pc(42) int local42 = (arg0 - local25 - 1) * arg3;
			for (@Pc(44) int local44 = 0; local44 < arg4; local44++) {
				local23[local31++] = arg1[local42++];
			}
		}
		super.aClass5_Sub1_32.method352(this);
		if (arg4 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt8317, 0, arg5, this.anInt5120 - arg2 - arg0, arg4, arg0, 32993, super.aClass5_Sub1_32.anInt396, local23, 0);
		if (arg3 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIIII)V")
	public final void method4202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass5_Sub1_32.anInt250 - arg3 - arg5;
		super.aClass5_Sub1_32.method352(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8317, 0, arg1, this.anInt5120 - arg2 - arg5, arg4, local12, arg0, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZII)V")
	public final void method4204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt8317, super.anInt8325, 0);
		this.anInt5116 = arg1;
		this.anInt5121 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZIZ)V")
	public final void method4205(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt8317 == 3553) {
			super.aClass5_Sub1_32.method352(this);
			OpenGL.glTexParameteri(super.anInt8317, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8317, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	@Override
	public final void method6971() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5121, this.anInt5116, super.anInt8317, 0, 0);
		this.anInt5121 = -1;
		this.anInt5116 = -1;
	}
}
