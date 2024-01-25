import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	private int anInt7344 = -1;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
	private int anInt7343 = -1;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
	public final int anInt7338;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
	public final int anInt7341;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!od;IIIIZ[BIZ)V")
	public Class5_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7338 = arg3;
		this.anInt7341 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7321 != 34037) {
			Static14.method212(arg4, arg7, arg1, arg2, arg3, arg6);
			this.method5539(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7321, 0, super.anInt7332, this.anInt7338, this.anInt7341, 0, arg7, 5121, arg6, 0);
			this.method5539(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5540(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!od;IIIIZ[FI)V")
	public Class5_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7341 = arg4;
		this.anInt7338 = arg3;
		super.aClass128_Sub2_43.method3691(this);
		if (arg5 && super.anInt7321 != 34037) {
			Static322.method5621(arg4, arg2, arg3, arg1, arg7, arg6);
			this.method5539(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7321, 0, super.anInt7332, this.anInt7338, this.anInt7341, 0, arg7, 5126, arg6, 0);
			this.method5539(false);
		}
		this.method5540(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!od;IIII)V")
	public Class5_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt7341 = arg4;
		this.anInt7338 = arg3;
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glTexImage2Dub(super.anInt7321, 0, super.anInt7332, arg3, arg4, 0, Static217.method2879(super.anInt7332), 5121, null, 0);
		this.method5540(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!od;IIIIZ[IZ)V")
	public Class5_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7338 = arg3;
		this.anInt7341 = arg4;
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
		super.aClass128_Sub2_43.method3691(this);
		if (arg5 && super.anInt7321 != 34037) {
			Static216.method2876(super.anInt7321, arg6, this.anInt7338, super.aClass128_Sub2_43.anInt4641, this.anInt7341, super.anInt7332);
			this.method5539(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7321, 0, super.anInt7332, this.anInt7338, this.anInt7341, 0, 32993, super.aClass128_Sub2_43.anInt4641, arg6, 0);
			this.method5539(false);
		}
		this.method5540(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!od;IIIII)V")
	protected Class5_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt7338 = arg4;
		this.anInt7341 = arg5;
		@Pc(30) int local30 = super.aClass128_Sub2_43.anInt4562 - arg5 - arg3;
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glCopyTexImage2D(super.anInt7321, 0, super.anInt7332, arg2, local30, arg4, arg5, 0);
		this.method5540(true);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I[BIIIBIIIZ)V")
	public final void method5541(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(9) boolean arg4) {
		if (arg4) {
			@Pc(18) int local18 = Static165.method4637(6406);
			@Pc(22) int local22 = local18 * arg2;
			@Pc(26) int local26 = local18 * arg2;
			@Pc(31) byte[] local31 = new byte[local22 * arg1];
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = local26 * (arg1 - local33 - 1);
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg0[local50++];
				}
			}
			arg0 = local31;
		}
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7321, 0, 0, 0, arg2, arg1, 6406, 5121, arg0, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIB)V")
	public final void method5542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt7321, super.anInt7327, 0);
		this.anInt7344 = arg0;
		this.anInt7343 = arg1;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V")
	public final void method5543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = super.aClass128_Sub2_43.anInt4562 - arg5;
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7321, 0, arg0, this.anInt7341 - arg5 - arg4, 0, local22, arg3, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	@Override
	public final void method5532() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7343, this.anInt7344, super.anInt7321, 0, 0);
		this.anInt7343 = -1;
		this.anInt7344 = -1;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZIII[III)V")
	protected final void method5545(@OriginalArg(1) int arg0, @OriginalArg(6) int[] arg1, @OriginalArg(8) int arg2) {
		@Pc(19) int[] local19 = new int[arg0 * arg2];
		for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
			@Pc(27) int local27 = local21 * arg2;
			@Pc(39) int local39 = (arg0 - local21 - 1) * arg2;
			for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
				local19[local27++] = arg1[local39++];
			}
		}
		super.aClass128_Sub2_43.method3691(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt7321, 0, 0, 0, arg2, arg0, 32993, super.aClass128_Sub2_43.anInt4641, local19, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZIZ)V")
	public final void method5547(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7321 == 3553) {
			super.aClass128_Sub2_43.method3691(this);
			OpenGL.glTexParameteri(super.anInt7321, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7321, 10243, arg1 ? 10497 : 33071);
		}
	}
}
