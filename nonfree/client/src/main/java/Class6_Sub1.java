import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!af", name = "H", descriptor = "I")
	private int anInt5465 = -1;

	@OriginalMember(owner = "client!af", name = "J", descriptor = "I")
	private int anInt5467 = -1;

	@OriginalMember(owner = "client!af", name = "I", descriptor = "I")
	public final int anInt5466;

	@OriginalMember(owner = "client!af", name = "A", descriptor = "I")
	public final int anInt5458;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!fd;IIIIZ[FI)V")
	public Class6_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5466 = arg3;
		this.anInt5458 = arg4;
		super.aClass19_Sub2_31.method1905(this);
		if (arg5 && super.anInt5441 != 34037) {
			Static250.method3634(arg2, arg1, arg6, arg7, arg3, arg4);
			this.method4185(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5441, 0, super.anInt5443, this.anInt5466, this.anInt5458, 0, arg7, 5126, arg6, 0);
			this.method4185(false);
		}
		this.method4181(true);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!fd;IIIIZ[BIZ)V")
	public Class6_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5466 = arg3;
		this.anInt5458 = arg4;
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
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5441 != 34037) {
			Static51.method840(arg3, arg2, arg4, arg6, arg7, arg1);
			this.method4185(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5441, 0, super.anInt5443, this.anInt5466, this.anInt5458, 0, arg7, 5121, arg6, 0);
			this.method4185(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4181(true);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!fd;IIII)V")
	public Class6_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt5458 = arg4;
		this.anInt5466 = arg3;
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glTexImage2Dub(super.anInt5441, 0, super.anInt5443, arg3, arg4, 0, Static304.method4122(super.anInt5443), 5121, null, 0);
		this.method4181(true);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!fd;IIIIZ[IZ)V")
	public Class6_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5466 = arg3;
		this.anInt5458 = arg4;
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
		super.aClass19_Sub2_31.method1905(this);
		if (arg5 && super.anInt5441 != 34037) {
			Static37.method665(arg6, super.anInt5443, this.anInt5458, this.anInt5466, super.aClass19_Sub2_31.anInt2307, super.anInt5441);
			this.method4185(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5441, 0, super.anInt5443, this.anInt5466, this.anInt5458, 0, 32993, super.aClass19_Sub2_31.anInt2307, arg6, 0);
			this.method4185(false);
		}
		this.method4181(true);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!fd;IIIII)V")
	protected Class6_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt5466 = arg4;
		this.anInt5458 = arg5;
		@Pc(30) int local30 = super.aClass19_Sub2_31.anInt2138 - arg3 - arg5;
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glCopyTexImage2D(super.anInt5441, 0, super.anInt5443, arg2, local30, arg4, arg5, 0);
		this.method4181(true);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BIIIIIZI)V")
	public final void method4191(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(8) boolean arg4) {
		if (arg4) {
			@Pc(23) int local23 = Static9.method92(6406);
			@Pc(27) int local27 = local23 * arg0;
			@Pc(31) int local31 = local23 * arg0;
			@Pc(36) byte[] local36 = new byte[local27 * arg2];
			for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
				@Pc(44) int local44 = local38 * local27;
				@Pc(55) int local55 = (arg2 - local38 - 1) * local31;
				for (@Pc(57) int local57 = 0; local57 < local27; local57++) {
					local36[local44++] = arg1[local55++];
				}
			}
			arg1 = local36;
		}
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5441, 0, 0, 0, arg0, arg2, 6406, 5121, arg1, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	@Override
	public final void method4178() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5465, this.anInt5467, super.anInt5441, 0, 0);
		this.anInt5465 = -1;
		this.anInt5467 = -1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IBIIIII)V")
	public final void method4193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass19_Sub2_31.anInt2138 - arg4;
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5441, 0, arg2, this.anInt5458 - arg3 - arg4, 0, local12, arg5, arg4);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
	public final void method4195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt5441, super.anInt5449, 0);
		this.anInt5467 = arg0;
		this.anInt5465 = arg1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZZ)V")
	public final void method4196(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5441 == 3553) {
			super.aClass19_Sub2_31.method1905(this);
			OpenGL.glTexParameteri(super.anInt5441, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5441, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIII[IIBII)V")
	protected final void method4197(@OriginalArg(1) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(8) int arg2) {
		@Pc(19) int[] local19 = new int[arg0 * arg2];
		for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
			@Pc(27) int local27 = local21 * arg2;
			@Pc(39) int local39 = arg2 * (arg0 - local21 - 1);
			for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
				local19[local27++] = arg1[local39++];
			}
		}
		super.aClass19_Sub2_31.method1905(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt5441, 0, 0, 0, arg2, arg0, 32993, super.aClass19_Sub2_31.anInt2307, local19, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
