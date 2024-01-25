import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
	private int anInt4461 = -1;

	@OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
	private int anInt4463 = -1;

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
	public final int anInt4460;

	@OriginalMember(owner = "client!aw", name = "x", descriptor = "I")
	public final int anInt4455;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!wh;IIIIZ[FI)V")
	public Class3_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4460 = arg3;
		this.anInt4455 = arg4;
		super.aClass100_Sub3_34.method8925(this);
		if (arg5 && super.anInt6738 != 34037) {
			Static311.method5225(arg1, arg6, arg2, arg7, arg4, arg3);
			this.method5773(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt6738, 0, super.anInt6737, this.anInt4460, this.anInt4455, 0, arg7, 5126, arg6, 0);
			this.method5773(false);
		}
		this.method5781(true);
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!wh;IIIIZ[BIZ)V")
	public Class3_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4460 = arg3;
		this.anInt4455 = arg4;
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
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt6738 != 34037) {
			Static312.method5226(arg3, arg2, arg6, arg1, arg7, arg4);
			this.method5773(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt6738, 0, super.anInt6737, this.anInt4460, this.anInt4455, 0, arg7, 5121, arg6, 0);
			this.method5773(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method5781(true);
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!wh;IIIIZ[IIIZ)V")
	public Class3_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4460 = arg3;
		this.anInt4455 = arg4;
		if (arg9) {
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
		super.aClass100_Sub3_34.method8925(this);
		if (super.anInt6738 != 34037 && arg5 && arg7 == 0) {
			Static566.method8122(arg6, this.anInt4460, this.anInt4455, super.anInt6737, super.anInt6738, super.aClass100_Sub3_34.anInt10618);
			this.method5773(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt6738, 0, super.anInt6737, this.anInt4460, this.anInt4455, 0, 32993, super.aClass100_Sub3_34.anInt10618, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method5773(false);
		}
		this.method5781(true);
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!wh;IIIII)V")
	public Class3_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt4455 = arg5;
		this.anInt4460 = arg4;
		@Pc(30) int local30 = super.aClass100_Sub3_34.anInt10436 - arg5 - arg3;
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glCopyTexImage2D(super.anInt6738, 0, super.anInt6737, arg2, local30, arg4, arg5, 0);
		this.method5781(true);
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!wh;IIII)V")
	public Class3_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt4460 = arg3;
		this.anInt4455 = arg4;
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glTexImage2Dub(super.anInt6738, 0, super.anInt6737, arg3, arg4, 0, Static59.method1052(super.anInt6737), 5121, (byte[]) null, 0);
		this.method5781(true);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	@Override
	public final void method5769() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4461, this.anInt4463, super.anInt6738, 0, 0);
		this.anInt4463 = -1;
		this.anInt4461 = -1;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(IIII)V")
	public final void method3899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt6738, super.anInt6739, 0);
		this.anInt4461 = arg1;
		this.anInt4463 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIII)V")
	public final void method3901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass100_Sub3_34.anInt10436 - arg0 - arg4;
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glCopyTexSubImage2D(super.anInt6738, 0, arg3, this.anInt4455 - arg0 - arg2, arg5, local12, arg1, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III[IZIIII)V")
	public final void method3902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5) {
		if (arg1 == 0) {
			arg1 = arg0;
		}
		@Pc(19) int[] local19 = new int[arg4 * arg0];
		for (@Pc(21) int local21 = 0; local21 < arg4; local21++) {
			@Pc(27) int local27 = arg0 * local21;
			@Pc(39) int local39 = arg1 * (arg4 - local21 - 1);
			for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
				local19[local27++] = arg3[local39++];
			}
		}
		super.aClass100_Sub3_34.method8925(this);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt6738, 0, arg2, this.anInt4455 - arg4 - arg5, arg0, arg4, 32993, super.aClass100_Sub3_34.anInt10618, local19, 0);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II[BIIIIZII)V")
	public final void method3903(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean arg4) {
		if (arg4) {
			@Pc(16) int local16 = Static628.method8719(6406);
			@Pc(20) int local20 = local16 * arg0;
			@Pc(24) int local24 = arg0 * local16;
			@Pc(29) byte[] local29 = new byte[local20 * arg2];
			for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
				@Pc(37) int local37 = local31 * local20;
				@Pc(48) int local48 = (arg2 - local31 - 1) * local24;
				for (@Pc(50) int local50 = 0; local50 < local20; local50++) {
					local29[local37++] = arg1[local48++];
				}
			}
			arg1 = local29;
		}
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6738, 0, 0, 0, arg0, arg2, 6406, 5121, arg1, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZIZ)V")
	public final void method3904(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt6738 == 3553) {
			super.aClass100_Sub3_34.method8925(this);
			OpenGL.glTexParameteri(super.anInt6738, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt6738, 10243, arg1 ? 10497 : 33071);
		}
	}
}
