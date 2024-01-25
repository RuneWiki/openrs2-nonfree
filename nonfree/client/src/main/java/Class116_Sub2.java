import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public class Class116_Sub2 extends Class116 {

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
	private int anInt7878 = -1;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
	private int anInt7875 = -1;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
	public final int anInt7871;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
	public final int anInt7876;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!pc;IIIIZ[FI)V")
	public Class116_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7871 = arg3;
		this.anInt7876 = arg4;
		super.aClass33_Sub3_36.method6340(this);
		if (arg5 && super.anInt9736 != 34037) {
			Static108.method2082(arg6, arg2, arg7, arg4, arg3, arg1);
			this.method8344(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9736, 0, super.anInt9737, this.anInt7871, this.anInt7876, 0, arg7, 5126, arg6, 0);
			this.method8344(false);
		}
		this.method8346(true);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!pc;IIII)V")
	public Class116_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt7876 = arg4;
		this.anInt7871 = arg3;
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glTexImage2Dub(super.anInt9736, 0, super.anInt9737, arg3, arg4, 0, Static310.method4319(super.anInt9737), 5121, (byte[]) null, 0);
		this.method8346(true);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!pc;IIIIZ[IIIZ)V")
	public Class116_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt7871 = arg3;
		this.anInt7876 = arg4;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass33_Sub3_36.method6340(this);
		if (super.anInt9736 != 34037 && arg5 && arg7 == 0) {
			Static458.method6400(arg6, super.aClass33_Sub3_36.anInt7281, this.anInt7876, this.anInt7871, super.anInt9737, super.anInt9736);
			this.method8344(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9736, 0, super.anInt9737, this.anInt7871, this.anInt7876, 0, 32993, super.aClass33_Sub3_36.anInt7281, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method8344(false);
		}
		this.method8346(true);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!pc;IIIII)V")
	public Class116_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt7871 = arg4;
		this.anInt7876 = arg5;
		@Pc(28) int local28 = super.aClass33_Sub3_36.anInt7088 - arg3 - arg5;
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glCopyTexImage2D(super.anInt9736, 0, super.anInt9737, arg2, local28, arg4, arg5, 0);
		this.method8346(true);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!pc;IIIIZ[BIZ)V")
	public Class116_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt7871 = arg3;
		this.anInt7876 = arg4;
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
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9736 != 34037) {
			Static384.method4982(arg4, arg6, arg7, arg1, arg2, arg3);
			this.method8344(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9736, 0, super.anInt9737, this.anInt7871, this.anInt7876, 0, arg7, 5121, arg6, 0);
			this.method8344(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method8346(true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB)V")
	public final void method6833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt9736, super.anInt9729, 0);
		this.anInt7878 = arg0;
		this.anInt7875 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZI[IIIII)V")
	public final void method6835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5) {
		if (arg2 == 0) {
			arg2 = arg1;
		}
		@Pc(17) int[] local17 = new int[arg1 * arg5];
		for (@Pc(19) int local19 = 0; local19 < arg5; local19++) {
			@Pc(25) int local25 = local19 * arg1;
			@Pc(36) int local36 = (arg5 - local19 - 1) * arg2;
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				local17[local25++] = arg3[local36++];
			}
		}
		super.aClass33_Sub3_36.method6340(this);
		if (arg2 != arg1) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt9736, 0, arg0, this.anInt7876 - arg4 - arg5, arg1, arg5, 32993, super.aClass33_Sub3_36.anInt7281, local17, 0);
		if (arg2 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZI[BIBIIII)V")
	public final void method6836(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(9) int arg4) {
		if (arg1) {
			@Pc(18) int local18 = Static415.method5231(6406);
			@Pc(22) int local22 = arg4 * local18;
			@Pc(26) int local26 = local18 * arg4;
			@Pc(31) byte[] local31 = new byte[local22 * arg3];
			for (@Pc(33) int local33 = 0; local33 < arg3; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(51) int local51 = local26 * (arg3 - local33 - 1);
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg2[local51++];
				}
			}
			arg2 = local31;
		}
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9736, 0, 0, 0, arg4, arg3, 6406, 5121, arg2, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	@Override
	public final void method8676() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7875, this.anInt7878, super.anInt9736, 0, 0);
		this.anInt7878 = -1;
		this.anInt7875 = -1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBIIII)V")
	public final void method6837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass33_Sub3_36.anInt7088 - arg0 - arg4;
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9736, 0, arg5, this.anInt7876 - arg2 - arg4, arg1, local13, arg3, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIZ)V")
	public final void method6838(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9736 == 3553) {
			super.aClass33_Sub3_36.method6340(this);
			OpenGL.glTexParameteri(super.anInt9736, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9736, 10243, arg0 ? 10497 : 33071);
		}
	}
}
