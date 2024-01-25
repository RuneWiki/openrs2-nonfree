import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public class Class76_Sub3 extends Class76 {

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
	private int anInt7365 = -1;

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
	private int anInt7371 = -1;

	@OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
	public final int anInt7370;

	@OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
	public final int anInt7369;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!kw;IIIIZ[BIZ)V")
	public Class76_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7370 = arg3;
		this.anInt7369 = arg4;
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
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9197 != 34037) {
			Static190.method3239(arg1, arg4, arg6, arg2, arg7, arg3);
			this.method7928(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9197, 0, super.anInt9207, this.anInt7370, this.anInt7369, 0, arg7, 5121, arg6, 0);
			this.method7928(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7930(true);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!kw;IIIIZ[FI)V")
	public Class76_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7369 = arg4;
		this.anInt7370 = arg3;
		super.aClass5_Sub2_36.method4997(this);
		if (arg5 && super.anInt9197 != 34037) {
			Static464.method7047(arg1, arg6, arg3, arg7, arg4, arg2);
			this.method7928(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9197, 0, super.anInt9207, this.anInt7370, this.anInt7369, 0, arg7, 5126, arg6, 0);
			this.method7928(false);
		}
		this.method7930(true);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!kw;IIII)V")
	public Class76_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt7370 = arg3;
		this.anInt7369 = arg4;
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glTexImage2Dub(super.anInt9197, 0, super.anInt9207, arg3, arg4, 0, Static140.method2607(super.anInt9207), 5121, null, 0);
		this.method7930(true);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!kw;IIIII)V")
	public Class76_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt7370 = arg4;
		this.anInt7369 = arg5;
		@Pc(28) int local28 = super.aClass5_Sub2_36.anInt5457 - arg5 - arg3;
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glCopyTexImage2D(super.anInt9197, 0, super.anInt9207, arg2, local28, arg4, arg5, 0);
		this.method7930(true);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!kw;IIIIZ[IIIZ)V")
	public Class76_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt7369 = arg4;
		this.anInt7370 = arg3;
		if (arg9) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass5_Sub2_36.method4997(this);
		if (super.anInt9197 != 34037 && arg5 && arg7 == 0) {
			Static32.method6777(super.aClass5_Sub2_36.anInt5660, arg6, super.anInt9207, this.anInt7370, this.anInt7369, super.anInt9197);
			this.method7928(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt9197, 0, super.anInt9207, this.anInt7370, this.anInt7369, 0, 32993, super.aClass5_Sub2_36.anInt5660, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method7928(false);
		}
		this.method7930(true);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIIIIIIIZI)V")
	public final void method6408(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) boolean arg4) {
		if (arg4) {
			@Pc(18) int local18 = Static445.method6913(6406);
			@Pc(22) int local22 = local18 * arg1;
			@Pc(26) int local26 = arg1 * local18;
			@Pc(31) byte[] local31 = new byte[local22 * arg3];
			for (@Pc(33) int local33 = 0; local33 < arg3; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(50) int local50 = (arg3 - local33 - 1) * local26;
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg0[local50++];
				}
			}
			arg0 = local31;
		}
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9197, 0, 0, 0, arg1, arg3, 6406, 5121, arg0, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V")
	public final void method6410(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt9197, super.anInt9205, 0);
		this.anInt7365 = arg0;
		this.anInt7371 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZIBIIII[II)V")
	protected final void method6411(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int[] arg2) {
		@Pc(27) int[] local27 = new int[arg0 * arg1];
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(35) int local35 = arg0 * local29;
			@Pc(47) int local47 = (arg1 - local29 - 1) * arg0;
			for (@Pc(49) int local49 = 0; local49 < arg0; local49++) {
				local27[local35++] = arg2[local47++];
			}
		}
		super.aClass5_Sub2_36.method4997(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt9197, 0, 0, 0, arg0, arg1, 32993, super.aClass5_Sub2_36.anInt5660, local27, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZB)V")
	public final void method6412(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt9197 == 3553) {
			super.aClass5_Sub2_36.method4997(this);
			OpenGL.glTexParameteri(super.anInt9197, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9197, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	@Override
	public final void method7922() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7365, this.anInt7371, super.anInt9197, 0, 0);
		this.anInt7365 = -1;
		this.anInt7371 = -1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V")
	public final void method6413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = super.aClass5_Sub2_36.anInt5457 - arg0 - arg2;
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9197, 0, arg3, this.anInt7369 - arg1 - arg2, arg4, local16, arg5, arg2);
		OpenGL.glFlush();
	}
}
