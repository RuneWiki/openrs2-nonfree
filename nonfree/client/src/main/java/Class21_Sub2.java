import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
	private int anInt4192 = -1;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
	private int anInt4197 = -1;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
	public final int anInt4199;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
	public final int anInt4198;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!qg;IIIII)V")
	protected Class21_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt4199 = arg4;
		this.anInt4198 = arg5;
		@Pc(30) int local30 = super.aClass121_Sub2_24.anInt5900 - arg5 - arg3;
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glCopyTexImage2D(super.anInt4557, 0, super.anInt4549, arg2, local30, arg4, arg5, 0);
		this.method3755(true);
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!qg;IIII)V")
	public Class21_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt4199 = arg3;
		this.anInt4198 = arg4;
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glTexImage2Dub(super.anInt4557, 0, super.anInt4549, arg3, arg4, 0, Static422.method1666(super.anInt4549), 5121, null, 0);
		this.method3755(true);
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!qg;IIIIZ[BIZ)V")
	public Class21_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4199 = arg3;
		this.anInt4198 = arg4;
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
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt4557 != 34037) {
			Static213.method3197(arg7, arg3, arg4, arg2, arg1, arg6);
			this.method3756(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt4557, 0, super.anInt4549, this.anInt4199, this.anInt4198, 0, arg7, 5121, arg6, 0);
			this.method3756(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method3755(true);
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!qg;IIIIZ[IZ)V")
	public Class21_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4199 = arg3;
		this.anInt4198 = arg4;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass121_Sub2_24.method4681(this);
		if (arg5 && super.anInt4557 != 34037) {
			Static286.method3915(this.anInt4198, super.anInt4557, super.aClass121_Sub2_24.anInt5963, this.anInt4199, arg6, super.anInt4549);
			this.method3756(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt4557, 0, super.anInt4549, this.anInt4199, this.anInt4198, 0, 32993, super.aClass121_Sub2_24.anInt5963, arg6, 0);
			this.method3756(false);
		}
		this.method3755(true);
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!qg;IIIIZ[FI)V")
	public Class21_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4198 = arg4;
		this.anInt4199 = arg3;
		super.aClass121_Sub2_24.method4681(this);
		if (arg5 && super.anInt4557 != 34037) {
			Static61.method920(arg3, arg4, arg7, arg2, arg1, arg6);
			this.method3756(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt4557, 0, super.anInt4549, this.anInt4199, this.anInt4198, 0, arg7, 5126, arg6, 0);
			this.method3756(false);
		}
		this.method3755(true);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIBII)V")
	public final void method3484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = super.aClass121_Sub2_24.anInt5900 - arg0;
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glCopyTexSubImage2D(super.anInt4557, 0, arg4, this.anInt4198 - arg0 - arg1, 0, local11, arg5, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)V")
	public final void method3485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt4557, super.anInt4556, 0);
		this.anInt4192 = arg1;
		this.anInt4197 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ[BIIIZIII)V")
	public final void method3486(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(9) int arg4) {
		if (arg0) {
			@Pc(15) int local15 = Static415.method5634(6406);
			@Pc(19) int local19 = arg4 * local15;
			@Pc(23) int local23 = arg4 * local15;
			@Pc(28) byte[] local28 = new byte[arg3 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(48) int local48 = (arg3 - local30 - 1) * local23;
				for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
					local28[local36++] = arg1[local48++];
				}
			}
			arg1 = local28;
		}
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt4557, 0, 0, 0, arg4, arg3, 6406, 5121, arg1, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZIZ)V")
	public final void method3487(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt4557 == 3553) {
			super.aClass121_Sub2_24.method4681(this);
			OpenGL.glTexParameteri(super.anInt4557, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt4557, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[IIZIIIII)V")
	protected final void method3488(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(31) int[] local31 = new int[arg0 * arg2];
		for (@Pc(33) int local33 = 0; local33 < arg2; local33++) {
			@Pc(39) int local39 = local33 * arg0;
			@Pc(50) int local50 = (arg2 - local33 - 1) * arg0;
			for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
				local31[local39++] = arg1[local50++];
			}
		}
		super.aClass121_Sub2_24.method4681(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt4557, 0, 0, 0, arg0, arg2, 32993, super.aClass121_Sub2_24.anInt5963, local31, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
	@Override
	public final void method3747() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4192, this.anInt4197, super.anInt4557, 0, 0);
		this.anInt4192 = -1;
		this.anInt4197 = -1;
	}
}
