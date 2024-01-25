import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
	private int anInt6591 = -1;

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
	private int anInt6594 = -1;

	@OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
	public final int anInt6588;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
	public final int anInt6587;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!jj;IIIIZ[IZ)V")
	public Class4_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6588 = arg4;
		this.anInt6587 = arg3;
		if (arg7) {
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
		super.aClass62_Sub3_28.method4007(this);
		if (arg5 && super.anInt6708 != 34037) {
			Static212.method3445(super.anInt6708, super.anInt6703, arg6, this.anInt6587, this.anInt6588, super.aClass62_Sub3_28.anInt4631);
			this.method5499(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt6708, 0, super.anInt6703, this.anInt6587, this.anInt6588, 0, 32993, super.aClass62_Sub3_28.anInt4631, arg6, 0);
			this.method5499(false);
		}
		this.method5502(true);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!jj;IIIIZ[FI)V")
	public Class4_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt6587 = arg3;
		this.anInt6588 = arg4;
		super.aClass62_Sub3_28.method4007(this);
		if (arg5 && super.anInt6708 != 34037) {
			Static173.method3025(arg1, arg7, arg6, arg4, arg3, arg2);
			this.method5499(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6708, 0, super.anInt6703, this.anInt6587, this.anInt6588, 0, arg7, 5126, arg6, 0);
			this.method5499(false);
		}
		this.method5502(true);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!jj;IIIII)V")
	protected Class4_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt6587 = arg4;
		this.anInt6588 = arg5;
		@Pc(30) int local30 = super.aClass62_Sub3_28.anInt4485 - arg5 - arg3;
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glCopyTexImage2D(super.anInt6708, 0, super.anInt6703, arg2, local30, arg4, arg5, 0);
		this.method5502(true);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!jj;IIII)V")
	public Class4_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt6588 = arg4;
		this.anInt6587 = arg3;
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glTexImage2Dub(super.anInt6708, 0, super.anInt6703, arg3, arg4, 0, Static366.method5588(super.anInt6703), 5121, null, 0);
		this.method5502(true);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!jj;IIIIZ[BIZ)V")
	public Class4_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt6588 = arg4;
		this.anInt6587 = arg3;
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
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6708 != 34037) {
			Static294.method6014(arg7, arg6, arg1, arg3, arg2, arg4);
			this.method5499(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6708, 0, super.anInt6703, this.anInt6587, this.anInt6588, 0, arg7, 5121, arg6, 0);
			this.method5499(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5502(true);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIB)V")
	public final void method5462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt6708, super.anInt6694, 0);
		this.anInt6594 = arg1;
		this.anInt6591 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([BIIBZIIIII)V")
	public final void method5465(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (arg2) {
			@Pc(18) int local18 = Static541.method7392(6406);
			@Pc(22) int local22 = arg1 * local18;
			@Pc(26) int local26 = local18 * arg1;
			@Pc(31) byte[] local31 = new byte[arg3 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg3; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = (arg3 - local33 - 1) * local26;
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg0[local50++];
				}
			}
			arg0 = local31;
		}
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6708, 0, 0, 0, arg1, arg3, 6406, 5121, arg0, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public final void method5490() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6594, this.anInt6591, super.anInt6708, 0, 0);
		this.anInt6591 = -1;
		this.anInt6594 = -1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIIII)V")
	public final void method5466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass62_Sub3_28.anInt4485 - arg4 - arg1;
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6708, 0, arg3, this.anInt6588 - arg1 - arg5, arg2, local12, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZZ)V")
	public final void method5467(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt6708 == 3553) {
			super.aClass62_Sub3_28.method4007(this);
			OpenGL.glTexParameteri(super.anInt6708, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6708, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II[IIIIIIZ)V")
	protected final void method5468(@OriginalArg(2) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2) {
		@Pc(24) int[] local24 = new int[arg1 * arg2];
		for (@Pc(26) int local26 = 0; local26 < arg2; local26++) {
			@Pc(32) int local32 = local26 * arg1;
			@Pc(42) int local42 = arg1 * (arg2 - local26 - 1);
			for (@Pc(44) int local44 = 0; local44 < arg1; local44++) {
				local24[local32++] = arg0[local42++];
			}
		}
		super.aClass62_Sub3_28.method4007(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt6708, 0, 0, 0, arg1, arg2, 32993, super.aClass62_Sub3_28.anInt4631, local24, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
