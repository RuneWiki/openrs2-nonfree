import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	private int anInt5165 = -1;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
	private int anInt5175 = -1;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
	public final int anInt5174;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
	public final int anInt5173;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!bv;IIIIZ[FI)V")
	public Class1_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5174 = arg3;
		this.anInt5173 = arg4;
		super.aClass30_Sub1_36.method916(this);
		if (arg5 && super.anInt5564 != 34037) {
			Static41.method739(arg4, arg3, arg1, arg6, arg2, arg7);
			this.method4276(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt5564, 0, super.anInt5551, this.anInt5174, this.anInt5173, 0, arg7, 5126, arg6, 0);
			this.method4276(false);
		}
		this.method4273(true);
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!bv;IIIIZ[BIZ)V")
	public Class1_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5174 = arg3;
		this.anInt5173 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * arg3;
				@Pc(45) int local45 = (arg4 - local30 - 1) * arg3;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt5564 != 34037) {
			Static261.method3569(arg4, arg7, arg6, arg3, arg2, arg1);
			this.method4276(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt5564, 0, super.anInt5551, this.anInt5174, this.anInt5173, 0, arg7, 5121, arg6, 0);
			this.method4276(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4273(true);
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!bv;IIIIZ[IZ)V")
	public Class1_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5174 = arg3;
		this.anInt5173 = arg4;
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
		super.aClass30_Sub1_36.method916(this);
		if (arg5 && super.anInt5564 != 34037) {
			Static453.method5620(super.anInt5551, super.anInt5564, super.aClass30_Sub1_36.bf, this.anInt5174, arg6, this.anInt5173);
			this.method4276(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt5564, 0, super.anInt5551, this.anInt5174, this.anInt5173, 0, 32993, super.aClass30_Sub1_36.bf, arg6, 0);
			this.method4276(false);
		}
		this.method4273(true);
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!bv;IIII)V")
	public Class1_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt5173 = arg4;
		this.anInt5174 = arg3;
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glTexImage2Dub(super.anInt5564, 0, super.anInt5551, arg3, arg4, 0, Static4.method121(super.anInt5551), 5121, null, 0);
		this.method4273(true);
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!bv;IIIII)V")
	protected Class1_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt5173 = arg5;
		this.anInt5174 = arg4;
		@Pc(29) int local29 = super.aClass30_Sub1_36.anInt1138 - arg5 - arg3;
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glCopyTexImage2D(super.anInt5564, 0, super.anInt5551, arg2, local29, arg4, arg5, 0);
		this.method4273(true);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZZ)V")
	public final void method3964(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt5564 == 3553) {
			super.aClass30_Sub1_36.method916(this);
			OpenGL.glTexParameteri(super.anInt5564, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt5564, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
	public final void method3965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt5564, super.anInt5557, 0);
		this.anInt5165 = arg0;
		this.anInt5175 = arg1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
	public final void method3966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = super.aClass30_Sub1_36.anInt1138 - arg1;
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glCopyTexSubImage2D(super.anInt5564, 0, arg2, this.anInt5173 - arg1 - arg3, 0, local19, arg4, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	@Override
	public final void method4264() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5175, this.anInt5165, super.anInt5564, 0, 0);
		this.anInt5165 = -1;
		this.anInt5175 = -1;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZI[IIIBI)V")
	protected final void method3968(@OriginalArg(1) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(22) int[] local22 = new int[arg0 * arg2];
		for (@Pc(24) int local24 = 0; local24 < arg0; local24++) {
			@Pc(30) int local30 = arg2 * local24;
			@Pc(41) int local41 = arg2 * (arg0 - local24 - 1);
			for (@Pc(43) int local43 = 0; local43 < arg2; local43++) {
				local22[local30++] = arg1[local41++];
			}
		}
		super.aClass30_Sub1_36.method916(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt5564, 0, 0, 0, arg2, arg0, 32993, super.aClass30_Sub1_36.bf, local22, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIIIIIZZI)V")
	public final void method3969(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(7) boolean arg3, @OriginalArg(9) int arg4) {
		if (arg3) {
			@Pc(24) int local24 = Static21.method450(6406);
			@Pc(28) int local28 = local24 * arg2;
			@Pc(32) int local32 = arg2 * local24;
			@Pc(37) byte[] local37 = new byte[arg4 * local28];
			for (@Pc(39) int local39 = 0; local39 < arg4; local39++) {
				@Pc(45) int local45 = local28 * local39;
				@Pc(56) int local56 = local32 * (arg4 - local39 - 1);
				for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
					local37[local45++] = arg0[local56++];
				}
			}
			arg0 = local37;
		}
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt5564, 0, 0, 0, arg2, arg4, 6406, 5121, arg0, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
