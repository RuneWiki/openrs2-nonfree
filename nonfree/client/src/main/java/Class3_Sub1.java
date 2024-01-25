import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!aaa", name = "F", descriptor = "I")
	private int anInt2076 = -1;

	@OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
	private int anInt2077 = -1;

	@OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
	public final int anInt2066;

	@OriginalMember(owner = "client!aaa", name = "y", descriptor = "I")
	public final int anInt2069;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!uca;IIIIZ[IIIZ)V")
	public Class3_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt2066 = arg3;
		this.anInt2069 = arg4;
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
		super.aClass162_Sub3_33.method6911(this);
		if (super.anInt6726 != 34037 && arg5 && arg7 == 0) {
			Static306.method4398(super.aClass162_Sub3_33.anInt8702, this.anInt2066, arg6, this.anInt2069, super.anInt6725, super.anInt6726);
			this.method5568(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt6726, 0, super.anInt6725, this.anInt2066, this.anInt2069, 0, 32993, super.aClass162_Sub3_33.anInt8702, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method5568(false);
		}
		this.method5571(true);
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!uca;IIII)V")
	public Class3_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt2066 = arg3;
		this.anInt2069 = arg4;
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glTexImage2Dub(super.anInt6726, 0, super.anInt6725, arg3, arg4, 0, Static472.method6125(super.anInt6725), 5121, null, 0);
		this.method5571(true);
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!uca;IIIII)V")
	public Class3_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt2069 = arg5;
		this.anInt2066 = arg4;
		@Pc(30) int local30 = super.aClass162_Sub3_33.anInt8634 - arg3 - arg5;
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glCopyTexImage2D(super.anInt6726, 0, super.anInt6725, arg2, local30, arg4, arg5, 0);
		this.method5571(true);
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!uca;IIIIZ[FI)V")
	public Class3_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt2069 = arg4;
		this.anInt2066 = arg3;
		super.aClass162_Sub3_33.method6911(this);
		if (arg5 && super.anInt6726 != 34037) {
			Static543.method7108(arg7, arg1, arg6, arg4, arg2, arg3);
			this.method5568(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6726, 0, super.anInt6725, this.anInt2066, this.anInt2069, 0, arg7, 5126, arg6, 0);
			this.method5568(false);
		}
		this.method5571(true);
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!uca;IIIIZ[BIZ)V")
	public Class3_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt2066 = arg3;
		this.anInt2069 = arg4;
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
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6726 != 34037) {
			Static383.method5316(arg7, arg3, arg4, arg2, arg6, arg1);
			this.method5568(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6726, 0, super.anInt6725, this.anInt2066, this.anInt2069, 0, arg7, 5121, arg6, 0);
			this.method5568(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5571(true);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZ[IIIBIII)V")
	protected final void method1716(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(16) int[] local16 = new int[arg1 * arg2];
		for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
			@Pc(24) int local24 = local18 * arg1;
			@Pc(35) int local35 = (arg2 - local18 - 1) * arg1;
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				local16[local24++] = arg0[local35++];
			}
		}
		super.aClass162_Sub3_33.method6911(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt6726, 0, 0, 0, arg1, arg2, 32993, super.aClass162_Sub3_33.anInt8702, local16, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIII)V")
	public final void method1717(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt6726, super.anInt6724, 0);
		this.anInt2076 = arg1;
		this.anInt2077 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	@Override
	public final void method5566() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2077, this.anInt2076, super.anInt6726, 0, 0);
		this.anInt2077 = -1;
		this.anInt2076 = -1;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIII[BIIZI)V")
	public final void method1719(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) boolean arg4) {
		if (arg4) {
			@Pc(15) int local15 = Static224.method2730(6406);
			@Pc(19) int local19 = local15 * arg0;
			@Pc(23) int local23 = arg0 * local15;
			@Pc(28) byte[] local28 = new byte[arg1 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				@Pc(36) int local36 = local30 * local19;
				@Pc(48) int local48 = local23 * (arg1 - local30 - 1);
				for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
					local28[local36++] = arg2[local48++];
				}
			}
			arg2 = local28;
		}
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6726, 0, 0, 0, arg0, arg1, 6406, 5121, arg2, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZZ)V")
	public final void method1720(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt6726 == 3553) {
			super.aClass162_Sub3_33.method6911(this);
			OpenGL.glTexParameteri(super.anInt6726, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6726, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIIBI)V")
	public final void method1721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = super.aClass162_Sub3_33.anInt8634 - arg3 - arg2;
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6726, 0, arg0, this.anInt2069 - arg3 - arg4, arg1, local13, arg5, arg3);
		OpenGL.glFlush();
	}
}
