import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!uk", name = "C", descriptor = "I")
	private int anInt3014 = -1;

	@OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
	private int anInt3016 = -1;

	@OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
	public final int anInt3021;

	@OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
	public final int anInt3019;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!bt;IIII)V")
	public Class62_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt3021 = arg4;
		this.anInt3019 = arg3;
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glTexImage2Dub(super.anInt6644, 0, super.anInt6634, arg3, arg4, 0, Static311.method4741(super.anInt6634), 5121, null, 0);
		this.method5349(true);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!bt;IIIII)V")
	protected Class62_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt3019 = arg4;
		this.anInt3021 = arg5;
		@Pc(30) int local30 = super.aClass30_Sub1_40.anInt801 - arg3 - arg5;
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glCopyTexImage2D(super.anInt6644, 0, super.anInt6634, arg2, local30, arg4, arg5, 0);
		this.method5349(true);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!bt;IIIIZ[BIZ)V")
	public Class62_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt3021 = arg4;
		this.anInt3019 = arg3;
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
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6644 != 34037) {
			Static141.method6329(arg2, arg7, arg4, arg3, arg6, arg1);
			this.method5358(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6644, 0, super.anInt6634, this.anInt3019, this.anInt3021, 0, arg7, 5121, arg6, 0);
			this.method5358(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5349(true);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!bt;IIIIZ[IZ)V")
	public Class62_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3019 = arg3;
		this.anInt3021 = arg4;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass30_Sub1_40.method730(this);
		if (arg5 && super.anInt6644 != 34037) {
			Static94.method1835(arg6, super.anInt6644, super.aClass30_Sub1_40.anInt864, this.anInt3019, this.anInt3021, super.anInt6634);
			this.method5358(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt6644, 0, super.anInt6634, this.anInt3019, this.anInt3021, 0, 32993, super.aClass30_Sub1_40.anInt864, arg6, 0);
			this.method5358(false);
		}
		this.method5349(true);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!bt;IIIIZ[FI)V")
	public Class62_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3021 = arg4;
		this.anInt3019 = arg3;
		super.aClass30_Sub1_40.method730(this);
		if (arg5 && super.anInt6644 != 34037) {
			Static386.method6042(arg2, arg1, arg7, arg3, arg6, arg4);
			this.method5358(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6644, 0, super.anInt6634, this.anInt3019, this.anInt3021, 0, arg7, 5126, arg6, 0);
			this.method5358(false);
		}
		this.method5349(true);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZB)V")
	public final void method2681(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt6644 == 3553) {
			super.aClass30_Sub1_40.method730(this);
			OpenGL.glTexParameteri(super.anInt6644, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6644, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZIIIII[II)V")
	protected final void method2682(@OriginalArg(5) int arg0, @OriginalArg(7) int[] arg1, @OriginalArg(8) int arg2) {
		@Pc(19) int[] local19 = new int[arg2 * arg0];
		for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
			@Pc(27) int local27 = arg2 * local21;
			@Pc(37) int local37 = arg2 * (arg0 - local21 - 1);
			for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
				local19[local27++] = arg1[local37++];
			}
		}
		super.aClass30_Sub1_40.method730(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt6644, 0, 0, 0, arg2, arg0, 32993, super.aClass30_Sub1_40.anInt864, local19, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIB)V")
	public final void method2684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19 = super.aClass30_Sub1_40.anInt801 - arg0;
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6644, 0, arg3, this.anInt3021 - arg4 - arg0, 0, local19, arg2, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5348() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3016, this.anInt3014, super.anInt6644, 0, 0);
		this.anInt3014 = -1;
		this.anInt3016 = -1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIZI[B)V")
	public final void method2687(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(7) boolean arg2, @OriginalArg(8) int arg3, @OriginalArg(9) byte[] arg4) {
		if (arg2) {
			@Pc(24) int local24 = Static302.method4667(6406);
			@Pc(28) int local28 = arg0 * local24;
			@Pc(32) int local32 = arg0 * local24;
			@Pc(37) byte[] local37 = new byte[local28 * arg3];
			for (@Pc(39) int local39 = 0; local39 < arg3; local39++) {
				@Pc(45) int local45 = local28 * local39;
				@Pc(56) int local56 = local32 * (arg3 - local39 - 1);
				for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
					local37[local45++] = arg4[local56++];
				}
			}
			arg4 = local37;
		}
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6644, 0, 0, 0, arg0, arg3, 6406, 5121, arg4, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIB)V")
	public final void method2689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt6644, super.anInt6638, 0);
		this.anInt3014 = arg0;
		this.anInt3016 = arg1;
	}
}
