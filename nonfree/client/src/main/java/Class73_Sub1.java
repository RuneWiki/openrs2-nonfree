import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
	private int anInt2331 = -1;

	@OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
	private int anInt2343 = -1;

	@OriginalMember(owner = "client!ku", name = "J", descriptor = "I")
	public final int anInt2339;

	@OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
	public final int anInt2337;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!uq;IIII)V")
	public Class73_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt2339 = arg4;
		this.anInt2337 = arg3;
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glTexImage2Dub(super.anInt7616, 0, super.anInt7624, arg3, arg4, 0, Static463.method6529(super.anInt7624), 5121, null, 0);
		this.method6348(true);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!uq;IIIII)V")
	protected Class73_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt2339 = arg5;
		this.anInt2337 = arg4;
		@Pc(30) int local30 = super.aClass122_Sub3_35.anInt8238 - arg3 - arg5;
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glCopyTexImage2D(super.anInt7616, 0, super.anInt7624, arg2, local30, arg4, arg5, 0);
		this.method6348(true);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!uq;IIIIZ[IZ)V")
	public Class73_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2337 = arg3;
		this.anInt2339 = arg4;
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
		super.aClass122_Sub3_35.method6850(this);
		if (arg5 && super.anInt7616 != 34037) {
			Static158.method2476(super.anInt7616, this.anInt2339, arg6, super.aClass122_Sub3_35.anInt8431, super.anInt7624, this.anInt2337);
			this.method6352(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt7616, 0, super.anInt7624, this.anInt2337, this.anInt2339, 0, 32993, super.aClass122_Sub3_35.anInt8431, arg6, 0);
			this.method6352(false);
		}
		this.method6348(true);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!uq;IIIIZ[BIZ)V")
	public Class73_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2339 = arg4;
		this.anInt2337 = arg3;
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
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt7616 != 34037) {
			Static515.method7046(arg7, arg6, arg1, arg4, arg3, arg2);
			this.method6352(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt7616, 0, super.anInt7624, this.anInt2337, this.anInt2339, 0, arg7, 5121, arg6, 0);
			this.method6352(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method6348(true);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!uq;IIIIZ[FI)V")
	public Class73_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt2339 = arg4;
		this.anInt2337 = arg3;
		super.aClass122_Sub3_35.method6850(this);
		if (arg5 && super.anInt7616 != 34037) {
			Static25.method573(arg6, arg3, arg7, arg2, arg1, arg4);
			this.method6352(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt7616, 0, super.anInt7624, this.anInt2337, this.anInt2339, 0, arg7, 5126, arg6, 0);
			this.method6352(false);
		}
		this.method6348(true);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZZ)V")
	public final void method1954(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt7616 == 3553) {
			super.aClass122_Sub3_35.method6850(this);
			OpenGL.glTexParameteri(super.anInt7616, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt7616, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	@Override
	public final void method6345() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2343, this.anInt2331, super.anInt7616, 0, 0);
		this.anInt2331 = -1;
		this.anInt2343 = -1;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIIIII)V")
	public final void method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass122_Sub3_35.anInt8238 - arg3 - arg5;
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glCopyTexSubImage2D(super.anInt7616, 0, arg0, this.anInt2339 - arg2 - arg5, arg4, local12, arg1, arg5);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIB)V")
	public final void method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt7616, super.anInt7632, 0);
		this.anInt2343 = arg1;
		this.anInt2331 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[IIBZIII)V")
	protected final void method1958(@OriginalArg(2) int[] arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int arg2) {
		@Pc(25) int[] local25 = new int[arg2 * arg1];
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			@Pc(33) int local33 = local27 * arg1;
			@Pc(44) int local44 = arg1 * (arg2 - local27 - 1);
			for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
				local25[local33++] = arg0[local44++];
			}
		}
		super.aClass122_Sub3_35.method6850(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt7616, 0, 0, 0, arg1, arg2, 32993, super.aClass122_Sub3_35.anInt8431, local25, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZIB[BIIIIII)V")
	public final void method1960(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (arg0) {
			@Pc(18) int local18 = Static228.method3981(6406);
			@Pc(22) int local22 = arg4 * local18;
			@Pc(26) int local26 = arg4 * local18;
			@Pc(31) byte[] local31 = new byte[arg1 * local22];
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(49) int local49 = local26 * (arg1 - local33 - 1);
				for (@Pc(51) int local51 = 0; local51 < local22; local51++) {
					local31[local39++] = arg2[local49++];
				}
			}
			arg2 = local31;
		}
		super.aClass122_Sub3_35.method6850(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7616, 0, 0, 0, arg4, arg1, 6406, 5121, arg2, 0);
		if (arg4 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
