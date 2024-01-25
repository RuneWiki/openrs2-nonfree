import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
	private int anInt200 = -1;

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
	private int anInt206 = -1;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
	public final int anInt199;

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
	public final int anInt208;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!da;IIIIZ[IZ)V")
	public Class4_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt199 = arg3;
		this.anInt208 = arg4;
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
		super.aClass50_Sub1_32.method1295(this);
		if (arg5 && super.anInt5771 != 34037) {
			Static162.method2705(super.anInt5763, this.anInt199, super.aClass50_Sub1_32.anInt1412, super.anInt5771, arg6, this.anInt208);
			this.method4581(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5771, 0, super.anInt5763, this.anInt199, this.anInt208, 0, 32993, super.aClass50_Sub1_32.anInt1412, arg6, 0);
			this.method4581(false);
		}
		this.method4580(true);
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!da;IIIII)V")
	protected Class4_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt208 = arg5;
		this.anInt199 = arg4;
		@Pc(30) int local30 = super.aClass50_Sub1_32.anInt1334 - arg3 - arg5;
		super.aClass50_Sub1_32.method1295(this);
		OpenGL.glCopyTexImage2D(super.anInt5771, 0, super.anInt5763, arg2, local30, arg4, arg5, 0);
		this.method4580(true);
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!da;IIIIZ[FI)V")
	public Class4_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt199 = arg3;
		this.anInt208 = arg4;
		super.aClass50_Sub1_32.method1295(this);
		if (arg5 && super.anInt5771 != 34037) {
			Static321.method4393(arg3, arg2, arg1, arg7, arg6, arg4);
			this.method4581(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5771, 0, super.anInt5763, this.anInt199, this.anInt208, 0, arg7, 5126, arg6, 0);
			this.method4581(false);
		}
		this.method4580(true);
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!da;IIIIZ[BIZ)V")
	public Class4_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt208 = arg4;
		this.anInt199 = arg3;
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
		super.aClass50_Sub1_32.method1295(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5771 != 34037) {
			Static53.method914(arg4, arg2, arg6, arg1, arg7, arg3);
			this.method4581(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5771, 0, super.anInt5763, this.anInt199, this.anInt208, 0, arg7, 5121, arg6, 0);
			this.method4581(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4580(true);
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!da;IIII)V")
	public Class4_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt208 = arg4;
		this.anInt199 = arg3;
		super.aClass50_Sub1_32.method1295(this);
		OpenGL.glTexImage2Dub(super.anInt5771, 0, super.anInt5763, arg3, arg4, 0, Static245.method3581(super.anInt5763), 5121, null, 0);
		this.method4580(true);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIZ)V")
	public final void method153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt5771, super.anInt5758, 0);
		this.anInt206 = arg0;
		this.anInt200 = arg1;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZZ)V")
	public final void method154(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5771 == 3553) {
			super.aClass50_Sub1_32.method1295(this);
			OpenGL.glTexParameteri(super.anInt5771, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5771, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZIIII[BII)V")
	public final void method156(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) byte[] arg4) {
		if (arg1) {
			@Pc(15) int local15 = Static254.method3688(6406);
			@Pc(19) int local19 = local15 * arg0;
			@Pc(23) int local23 = local15 * arg0;
			@Pc(28) byte[] local28 = new byte[local19 * arg3];
			for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(47) int local47 = (arg3 - local30 - 1) * local23;
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg4[local47++];
				}
			}
			arg4 = local28;
		}
		super.aClass50_Sub1_32.method1295(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5771, 0, 0, 0, arg0, arg3, 6406, 5121, arg4, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[IIIZIIIZ)V")
	protected final void method157(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(7) int arg2) {
		@Pc(33) int[] local33 = new int[arg0 * arg2];
		for (@Pc(35) int local35 = 0; local35 < arg0; local35++) {
			@Pc(41) int local41 = local35 * arg2;
			@Pc(52) int local52 = (arg0 - local35 - 1) * arg2;
			for (@Pc(54) int local54 = 0; local54 < arg2; local54++) {
				local33[local41++] = arg1[local52++];
			}
		}
		super.aClass50_Sub1_32.method1295(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt5771, 0, 0, 0, arg2, arg0, 32993, super.aClass50_Sub1_32.anInt1412, local33, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	@Override
	public final void method5899() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt206, this.anInt200, super.anInt5771, 0, 0);
		this.anInt200 = -1;
		this.anInt206 = -1;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)V")
	public final void method158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12 = super.aClass50_Sub1_32.anInt1334 - arg2;
		super.aClass50_Sub1_32.method1295(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5771, 0, arg0, this.anInt208 - arg1 - arg2, 0, local12, arg3, arg2);
		OpenGL.glFlush();
	}
}
