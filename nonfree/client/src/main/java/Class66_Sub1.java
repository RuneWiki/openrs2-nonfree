import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!km", name = "A", descriptor = "I")
	private int anInt1944 = -1;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "I")
	private int anInt1940 = -1;

	@OriginalMember(owner = "client!km", name = "D", descriptor = "I")
	public final int anInt1947;

	@OriginalMember(owner = "client!km", name = "v", descriptor = "I")
	public final int anInt1939;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!qfa;IIII)V")
	public Class66_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt1947 = arg4;
		this.anInt1939 = arg3;
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glTexImage2Dub(super.anInt8223, 0, super.anInt8228, arg3, arg4, 0, Static679.method9322(super.anInt8228), 5121, (byte[]) null, 0);
		this.method6848(true);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!qfa;IIIIZ[BIZ)V")
	public Class66_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1947 = arg4;
		this.anInt1939 = arg3;
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
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8223 != 34037) {
			Static20.method9252(arg2, arg7, arg4, arg3, arg1, arg6);
			this.method6850(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8223, 0, super.anInt8228, this.anInt1939, this.anInt1947, 0, arg7, 5121, arg6, 0);
			this.method6850(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6848(true);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!qfa;IIIIZ[FI)V")
	public Class66_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1947 = arg4;
		this.anInt1939 = arg3;
		super.aClass137_Sub3_36.method7090(this);
		if (arg5 && super.anInt8223 != 34037) {
			Static476.method6898(arg6, arg4, arg2, arg1, arg3, arg7);
			this.method6850(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8223, 0, super.anInt8228, this.anInt1939, this.anInt1947, 0, arg7, 5126, arg6, 0);
			this.method6850(false);
		}
		this.method6848(true);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!qfa;IIIII)V")
	public Class66_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt1939 = arg4;
		this.anInt1947 = arg5;
		@Pc(30) int local30 = super.aClass137_Sub3_36.anInt8349 - arg3 - arg5;
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glCopyTexImage2D(super.anInt8223, 0, super.anInt8228, arg2, local30, arg4, arg5, 0);
		this.method6848(true);
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!qfa;IIIIZ[IIIZ)V")
	public Class66_Sub1(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1939 = arg3;
		this.anInt1947 = arg4;
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
		super.aClass137_Sub3_36.method7090(this);
		if (super.anInt8223 != 34037 && arg5 && arg7 == 0) {
			Static27.method612(this.anInt1947, super.anInt8223, this.anInt1939, super.aClass137_Sub3_36.anInt8556, arg6, super.anInt8228);
			this.method6850(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt8223, 0, super.anInt8228, this.anInt1939, this.anInt1947, 0, 32993, super.aClass137_Sub3_36.anInt8556, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method6850(false);
		}
		this.method6848(true);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	@Override
	public final void method6844() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1944, this.anInt1940, super.anInt8223, 0, 0);
		this.anInt1944 = -1;
		this.anInt1940 = -1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIBI)V")
	public final void method1667(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt8223, super.anInt8224, 0);
		this.anInt1944 = arg1;
		this.anInt1940 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[BIIZIIIIB)V")
	public final void method1668(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (arg2) {
			@Pc(26) int local26 = Static25.method477(6406);
			@Pc(30) int local30 = local26 * arg1;
			@Pc(34) int local34 = arg1 * local26;
			@Pc(39) byte[] local39 = new byte[local30 * arg3];
			for (@Pc(41) int local41 = 0; local41 < arg3; local41++) {
				@Pc(47) int local47 = local30 * local41;
				@Pc(58) int local58 = (arg3 - local41 - 1) * local34;
				for (@Pc(60) int local60 = 0; local60 < local30; local60++) {
					local39[local47++] = arg0[local58++];
				}
			}
			arg0 = local39;
		}
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8223, 0, 0, 0, arg1, arg3, 6406, 5121, arg0, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZZI)V")
	public final void method1669(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt8223 == 3553) {
			super.aClass137_Sub3_36.method7090(this);
			OpenGL.glTexParameteri(super.anInt8223, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8223, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[IIIIIIIZ)V")
	public final void method1670(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == 0) {
			arg0 = arg4;
		}
		@Pc(19) int[] local19 = new int[arg3 * arg4];
		for (@Pc(21) int local21 = 0; local21 < arg3; local21++) {
			@Pc(27) int local27 = arg4 * local21;
			@Pc(39) int local39 = arg0 * (arg3 - local21 - 1);
			for (@Pc(41) int local41 = 0; local41 < arg4; local41++) {
				local19[local27++] = arg1[local39++];
			}
		}
		super.aClass137_Sub3_36.method7090(this);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt8223, 0, arg2, this.anInt1947 - arg3 - arg5, arg4, arg3, 32993, super.aClass137_Sub3_36.anInt8556, local19, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIBII)V")
	public final void method1671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass137_Sub3_36.anInt8349 - arg3 - arg5;
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8223, 0, arg4, this.anInt1947 - arg2 - arg3, arg0, local13, arg1, arg3);
		OpenGL.glFlush();
	}
}
