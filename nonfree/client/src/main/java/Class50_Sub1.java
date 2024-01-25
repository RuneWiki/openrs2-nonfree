import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	private int anInt1661 = -1;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	private int anInt1663 = -1;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public final int anInt1665;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	public final int anInt1664;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!er;IIIIZ[BIZ)V")
	public Class50_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1665 = arg4;
		this.anInt1664 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7830 != 34037) {
			Static352.method5070(arg2, arg6, arg1, arg3, arg7, arg4);
			this.method6151(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7830, 0, super.anInt7828, this.anInt1664, this.anInt1665, 0, arg7, 5121, arg6, 0);
			this.method6151(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6153(true);
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!er;IIII)V")
	public Class50_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt1664 = arg3;
		this.anInt1665 = arg4;
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glTexImage2Dub(super.anInt7830, 0, super.anInt7828, arg3, arg4, 0, Static393.method5568(super.anInt7828), 5121, null, 0);
		this.method6153(true);
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!er;IIIII)V")
	public Class50_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt1664 = arg4;
		this.anInt1665 = arg5;
		@Pc(28) int local28 = super.aClass31_Sub2_37.anInt3063 - arg5 - arg3;
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glCopyTexImage2D(super.anInt7830, 0, super.anInt7828, arg2, local28, arg4, arg5, 0);
		this.method6153(true);
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!er;IIIIZ[IIIZ)V")
	public Class50_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1664 = arg3;
		this.anInt1665 = arg4;
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
		super.aClass31_Sub2_37.method2535(this);
		if (super.anInt7830 != 34037 && arg5 && arg7 == 0) {
			Static188.method3314(arg6, this.anInt1664, super.anInt7828, this.anInt1665, super.anInt7830, super.aClass31_Sub2_37.anInt3152);
			this.method6151(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt7830, 0, super.anInt7828, this.anInt1664, this.anInt1665, 0, 32993, super.aClass31_Sub2_37.anInt3152, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method6151(false);
		}
		this.method6153(true);
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!er;IIIIZ[FI)V")
	public Class50_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt1664 = arg3;
		this.anInt1665 = arg4;
		super.aClass31_Sub2_37.method2535(this);
		if (arg5 && super.anInt7830 != 34037) {
			Static565.method7702(arg4, arg7, arg3, arg1, arg2, arg6);
			this.method6151(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7830, 0, super.anInt7828, this.anInt1664, this.anInt1665, 0, arg7, 5126, arg6, 0);
			this.method6151(false);
		}
		this.method6153(true);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI[IIIIIIB)V")
	protected final void method1501(@OriginalArg(2) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		@Pc(25) int[] local25 = new int[arg1 * arg2];
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			@Pc(33) int local33 = local27 * arg1;
			@Pc(43) int local43 = (arg2 - local27 - 1) * arg1;
			for (@Pc(45) int local45 = 0; local45 < arg1; local45++) {
				local25[local33++] = arg0[local43++];
			}
		}
		super.aClass31_Sub2_37.method2535(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt7830, 0, 0, 0, arg1, arg2, 32993, super.aClass31_Sub2_37.anInt3152, local25, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZIIII[BI)V")
	public final void method1504(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg1) {
			@Pc(15) int local15 = Static341.method4969(6406);
			@Pc(19) int local19 = local15 * arg2;
			@Pc(23) int local23 = local15 * arg2;
			@Pc(28) byte[] local28 = new byte[local19 * arg0];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(36) int local36 = local19 * local30;
				@Pc(47) int local47 = local23 * (arg0 - local30 - 1);
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg4[local47++];
				}
			}
			arg4 = local28;
		}
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7830, 0, 0, 0, arg2, arg0, 6406, 5121, arg4, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZ)V")
	public final void method1506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt7830, super.anInt7832, 0);
		this.anInt1661 = arg0;
		this.anInt1663 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	@Override
	public final void method6150() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1661, this.anInt1663, super.anInt7830, 0, 0);
		this.anInt1661 = -1;
		this.anInt1663 = -1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZZB)V")
	public final void method1507(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt7830 == 3553) {
			super.aClass31_Sub2_37.method2535(this);
			OpenGL.glTexParameteri(super.anInt7830, 10242, arg1 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7830, 10243, arg0 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII)V")
	public final void method1508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass31_Sub2_37.anInt3063 - arg3 - arg0;
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7830, 0, arg4, this.anInt1665 - arg1 - arg3, arg5, local12, arg2, arg3);
		OpenGL.glFlush();
	}
}
