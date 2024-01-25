import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!il", name = "A", descriptor = "I")
	private int anInt1101 = -1;

	@OriginalMember(owner = "client!il", name = "x", descriptor = "I")
	private int anInt1099 = -1;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "I")
	public final int anInt1104;

	@OriginalMember(owner = "client!il", name = "z", descriptor = "I")
	public final int anInt1100;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!kfa;IIII)V")
	public Class3_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt1104 = arg4;
		this.anInt1100 = arg3;
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glTexImage2Dub(super.anInt3442, 0, super.anInt3443, arg3, arg4, 0, Static246.method3937(super.anInt3443), 5121, null, 0);
		this.method2739(true);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!kfa;IIIIZ[FI)V")
	public Class3_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1104 = arg4;
		this.anInt1100 = arg3;
		super.aClass7_Sub2_19.method4313(this);
		if (arg5 && super.anInt3442 != 34037) {
			Static404.method6137(arg1, arg6, arg4, arg3, arg7, arg2);
			this.method2749(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt3442, 0, super.anInt3443, this.anInt1100, this.anInt1104, 0, arg7, 5126, arg6, 0);
			this.method2749(false);
		}
		this.method2739(true);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!kfa;IIIIZ[IIIZ)V")
	public Class3_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1104 = arg4;
		this.anInt1100 = arg3;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass7_Sub2_19.method4313(this);
		if (super.anInt3442 != 34037 && arg5 && arg7 == 0) {
			Static172.method2864(this.anInt1100, super.anInt3443, arg6, super.anInt3442, this.anInt1104, super.aClass7_Sub2_19.anInt5615);
			this.method2749(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt3442, 0, super.anInt3443, this.anInt1100, this.anInt1104, 0, 32993, super.aClass7_Sub2_19.anInt5615, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method2749(false);
		}
		this.method2739(true);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!kfa;IIIII)V")
	public Class3_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt1100 = arg4;
		this.anInt1104 = arg5;
		@Pc(29) int local29 = super.aClass7_Sub2_19.anInt5447 - arg5 - arg3;
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glCopyTexImage2D(super.anInt3442, 0, super.anInt3443, arg2, local29, arg4, arg5, 0);
		this.method2739(true);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!kfa;IIIIZ[BIZ)V")
	public Class3_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1104 = arg4;
		this.anInt1100 = arg3;
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
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt3442 != 34037) {
			Static271.method4403(arg2, arg1, arg3, arg7, arg4, arg6);
			this.method2749(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt3442, 0, super.anInt3443, this.anInt1100, this.anInt1104, 0, arg7, 5121, arg6, 0);
			this.method2749(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method2739(true);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)V")
	public final void method950(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt3442, super.anInt3444, 0);
		this.anInt1099 = arg1;
		this.anInt1101 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIZIII[I)V")
	protected final void method951(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(8) int[] arg2) {
		@Pc(24) int[] local24 = new int[arg0 * arg1];
		for (@Pc(26) int local26 = 0; local26 < arg0; local26++) {
			@Pc(32) int local32 = arg1 * local26;
			@Pc(43) int local43 = arg1 * (arg0 - local26 - 1);
			for (@Pc(45) int local45 = 0; local45 < arg1; local45++) {
				local24[local32++] = arg2[local43++];
			}
		}
		super.aClass7_Sub2_19.method4313(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt3442, 0, 0, 0, arg1, arg0, 32993, super.aClass7_Sub2_19.anInt5615, local24, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BZZ)V")
	public final void method953(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt3442 == 3553) {
			super.aClass7_Sub2_19.method4313(this);
			OpenGL.glTexParameteri(super.anInt3442, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt3442, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIBIIII)V")
	public final void method955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass7_Sub2_19.anInt5447 - arg2 - arg1;
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glCopyTexSubImage2D(super.anInt3442, 0, arg0, this.anInt1104 - arg1 - arg3, arg4, local12, arg5, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ[BIIIIIII)V")
	public final void method958(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(9) int arg4) {
		if (arg1) {
			@Pc(18) int local18 = Static305.method4825(6406);
			@Pc(22) int local22 = local18 * arg0;
			@Pc(26) int local26 = local18 * arg0;
			@Pc(31) byte[] local31 = new byte[local22 * arg3];
			for (@Pc(33) int local33 = 0; local33 < arg3; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(51) int local51 = (arg3 - local33 - 1) * local26;
				for (@Pc(53) int local53 = 0; local53 < local22; local53++) {
					local31[local39++] = arg2[local51++];
				}
			}
			arg2 = local31;
		}
		super.aClass7_Sub2_19.method4313(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt3442, 0, 0, 0, arg0, arg3, 6406, 5121, arg2, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	@Override
	public final void method4191() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1099, this.anInt1101, super.anInt3442, 0, 0);
		this.anInt1101 = -1;
		this.anInt1099 = -1;
	}
}
