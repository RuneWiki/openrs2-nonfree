import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
	private int anInt840 = -1;

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
	private int anInt843 = -1;

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
	public final int anInt847;

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
	public final int anInt838;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!kv;IIIIZ[BIZ)V")
	public Class44_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt847 = arg3;
		this.anInt838 = arg4;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7892 != 34037) {
			Static650.method8558(arg4, arg6, arg3, arg1, arg7, arg2);
			this.method6705(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7892, 0, super.anInt7885, this.anInt847, this.anInt838, 0, arg7, 5121, arg6, 0);
			this.method6705(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6706(true);
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!kv;IIII)V")
	public Class44_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt847 = arg3;
		this.anInt838 = arg4;
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glTexImage2Dub(super.anInt7892, 0, super.anInt7885, arg3, arg4, 0, Static423.method6426(super.anInt7885), 5121, (byte[]) null, 0);
		this.method6706(true);
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!kv;IIIIZ[FI)V")
	public Class44_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt847 = arg3;
		this.anInt838 = arg4;
		super.aClass143_Sub2_32.method4945(this);
		if (arg5 && super.anInt7892 != 34037) {
			Static140.method2100(arg7, arg6, arg1, arg2, arg3, arg4);
			this.method6705(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7892, 0, super.anInt7885, this.anInt847, this.anInt838, 0, arg7, 5126, arg6, 0);
			this.method6705(false);
		}
		this.method6706(true);
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!kv;IIIII)V")
	public Class44_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt838 = arg5;
		this.anInt847 = arg4;
		@Pc(29) int local29 = super.aClass143_Sub2_32.anInt5737 - arg3 - arg5;
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glCopyTexImage2D(super.anInt7892, 0, super.anInt7885, arg2, local29, arg4, arg5, 0);
		this.method6706(true);
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!kv;IIIIZ[IIIZ)V")
	public Class44_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt838 = arg4;
		this.anInt847 = arg3;
		if (arg9) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass143_Sub2_32.method4945(this);
		if (super.anInt7892 != 34037 && arg5 && arg7 == 0) {
			Static98.method1637(arg6, super.anInt7892, this.anInt838, this.anInt847, super.anInt7885, super.aClass143_Sub2_32.anInt5857);
			this.method6705(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt7892, 0, super.anInt7885, this.anInt847, this.anInt838, 0, 32993, super.aClass143_Sub2_32.anInt5857, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method6705(false);
		}
		this.method6706(true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZIZ)V")
	public final void method794(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7892 == 3553) {
			super.aClass143_Sub2_32.method4945(this);
			OpenGL.glTexParameteri(super.anInt7892, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7892, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIBI)V")
	public final void method795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = super.aClass143_Sub2_32.anInt5737 - arg5 - arg0;
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7892, 0, arg2, this.anInt838 - arg1 - arg5, arg3, local19, arg4, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II[IZIIIII)V")
	public final void method796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg0 == 0) {
			arg0 = arg1;
		}
		@Pc(17) int[] local17 = new int[arg4 * arg1];
		for (@Pc(19) int local19 = 0; local19 < arg4; local19++) {
			@Pc(24) int local24 = arg1 * local19;
			@Pc(34) int local34 = (arg4 - local19 - 1) * arg0;
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				local17[local24++] = arg2[local34++];
			}
		}
		super.aClass143_Sub2_32.method4945(this);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt7892, 0, arg3, this.anInt838 - arg4 - arg5, arg1, arg4, 32993, super.aClass143_Sub2_32.anInt5857, local17, 0);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
	@Override
	public final void method6695() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt840, this.anInt843, super.anInt7892, 0, 0);
		this.anInt840 = -1;
		this.anInt843 = -1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBII)V")
	public final void method797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt7892, super.anInt7886, 0);
		this.anInt840 = arg0;
		this.anInt843 = arg1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BIIIIII[BIZ)V")
	public final void method798(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) byte[] arg2, @OriginalArg(8) int arg3, @OriginalArg(9) boolean arg4) {
		if (arg4) {
			@Pc(13) int local13 = Static135.method2040(6406);
			@Pc(17) int local17 = arg1 * local13;
			@Pc(21) int local21 = local13 * arg1;
			@Pc(26) byte[] local26 = new byte[local17 * arg3];
			for (@Pc(28) int local28 = 0; local28 < arg3; local28++) {
				@Pc(33) int local33 = local28 * local17;
				@Pc(44) int local44 = (arg3 - local28 - 1) * local21;
				for (@Pc(46) int local46 = 0; local46 < local17; local46++) {
					local26[local33++] = arg2[local44++];
				}
			}
			arg2 = local26;
		}
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7892, 0, 0, 0, arg1, arg3, 6406, 5121, arg2, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
