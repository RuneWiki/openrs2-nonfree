import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
	private int anInt4494 = -1;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
	private int anInt4502 = -1;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
	public final int anInt4497;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
	public final int anInt4496;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ug;IIIIZ[BIZ)V")
	public Class65_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4497 = arg3;
		this.anInt4496 = arg4;
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
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5976 != 34037) {
			Static28.method5899(arg3, arg4, arg2, arg6, arg1, arg7);
			this.method4763(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5976, 0, super.anInt5981, this.anInt4497, this.anInt4496, 0, arg7, 5121, arg6, 0);
			this.method4763(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4771(true);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ug;IIIIZ[FI)V")
	public Class65_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4497 = arg3;
		this.anInt4496 = arg4;
		super.aClass135_Sub2_32.method5458(this);
		if (arg5 && super.anInt5976 != 34037) {
			Static192.method2791(arg4, arg6, arg7, arg2, arg3, arg1);
			this.method4763(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5976, 0, super.anInt5981, this.anInt4497, this.anInt4496, 0, arg7, 5126, arg6, 0);
			this.method4763(false);
		}
		this.method4771(true);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ug;IIIIZ[IZ)V")
	public Class65_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4497 = arg3;
		this.anInt4496 = arg4;
		if (arg7) {
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
		super.aClass135_Sub2_32.method5458(this);
		if (arg5 && super.anInt5976 != 34037) {
			Static3.method33(this.anInt4497, super.aClass135_Sub2_32.anInt6800, super.anInt5981, this.anInt4496, super.anInt5976, arg6);
			this.method4763(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5976, 0, super.anInt5981, this.anInt4497, this.anInt4496, 0, 32993, super.aClass135_Sub2_32.anInt6800, arg6, 0);
			this.method4763(false);
		}
		this.method4771(true);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ug;IIII)V")
	public Class65_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt4497 = arg3;
		this.anInt4496 = arg4;
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glTexImage2Dub(super.anInt5976, 0, super.anInt5981, arg3, arg4, 0, Static444.method5922(super.anInt5981), 5121, null, 0);
		this.method4771(true);
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ug;IIIII)V")
	protected Class65_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt4496 = arg5;
		this.anInt4497 = arg4;
		@Pc(29) int local29 = super.aClass135_Sub2_32.anInt6646 - arg3 - arg5;
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glCopyTexImage2D(super.anInt5976, 0, super.anInt5981, arg2, local29, arg4, arg5, 0);
		this.method4771(true);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[BIIIZIIBI)V")
	public final void method3586(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			@Pc(18) int local18 = Static172.method2393(6406);
			@Pc(22) int local22 = arg2 * local18;
			@Pc(26) int local26 = arg2 * local18;
			@Pc(31) byte[] local31 = new byte[arg0 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(51) int local51 = local26 * (arg0 - local33 - 1);
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg1[local51++];
				}
			}
			arg1 = local31;
		}
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5976, 0, 0, 0, arg2, arg0, 6406, 5121, arg1, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
	public final void method3587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt5976, super.anInt5972, 0);
		this.anInt4502 = arg0;
		this.anInt4494 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII)V")
	public final void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12 = super.aClass135_Sub2_32.anInt6646 - arg1;
		super.aClass135_Sub2_32.method5458(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5976, 0, arg4, this.anInt4496 - arg1 - arg2, 0, local12, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIZ)V")
	public final void method3589(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5976 == 3553) {
			super.aClass135_Sub2_32.method5458(this);
			OpenGL.glTexParameteri(super.anInt5976, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5976, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[IIIIZII)V")
	protected final void method3593(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(5) int arg2) {
		@Pc(21) int[] local21 = new int[arg2 * arg0];
		for (@Pc(23) int local23 = 0; local23 < arg0; local23++) {
			@Pc(29) int local29 = local23 * arg2;
			@Pc(39) int local39 = arg2 * (arg0 - local23 - 1);
			for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
				local21[local29++] = arg1[local39++];
			}
		}
		super.aClass135_Sub2_32.method5458(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt5976, 0, 0, 0, arg2, arg0, 32993, super.aClass135_Sub2_32.anInt6800, local21, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	@Override
	public final void method4759() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4502, this.anInt4494, super.anInt5976, 0, 0);
		this.anInt4494 = -1;
		this.anInt4502 = -1;
	}
}
