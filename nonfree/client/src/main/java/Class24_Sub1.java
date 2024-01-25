import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!g", name = "y", descriptor = "I")
	private int anInt981 = -1;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	private int anInt978 = -1;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public final int anInt983;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "I")
	public final int anInt986;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!vj;IIIIZ[FI)V")
	public Class24_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt983 = arg4;
		this.anInt986 = arg3;
		super.aClass45_Sub3_16.method7475(this);
		if (arg5 && super.anInt3100 != 34037) {
			Static208.method3388(arg7, arg6, arg4, arg3, arg1, arg2);
			this.method2793(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt3100, 0, super.anInt3110, this.anInt986, this.anInt983, 0, arg7, 5126, arg6, 0);
			this.method2793(false);
		}
		this.method2802(true);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!vj;IIIIZ[BIZ)V")
	public Class24_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt986 = arg3;
		this.anInt983 = arg4;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = (arg4 - local30 - 1) * arg3;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt3100 != 34037) {
			Static492.method6662(arg7, arg2, arg4, arg3, arg1, arg6);
			this.method2793(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt3100, 0, super.anInt3110, this.anInt986, this.anInt983, 0, arg7, 5121, arg6, 0);
			this.method2793(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method2802(true);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class24_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt983 = arg4;
		this.anInt986 = arg3;
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glTexImage2Dub(super.anInt3100, 0, super.anInt3110, arg3, arg4, 0, Static430.method6073(super.anInt3110), 5121, null, 0);
		this.method2802(true);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!vj;IIIII)V")
	public Class24_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt986 = arg4;
		this.anInt983 = arg5;
		@Pc(30) int local30 = super.aClass45_Sub3_16.anInt9000 - arg5 - arg3;
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glCopyTexImage2D(super.anInt3100, 0, super.anInt3110, arg2, local30, arg4, arg5, 0);
		this.method2802(true);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!vj;IIIIZ[IZ)V")
	public Class24_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt983 = arg4;
		this.anInt986 = arg3;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass45_Sub3_16.method7475(this);
		if (arg5 && super.anInt3100 != 34037) {
			Static297.method4422(arg6, this.anInt986, super.aClass45_Sub3_16.anInt9069, this.anInt983, super.anInt3110, super.anInt3100);
			this.method2793(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt3100, 0, super.anInt3110, this.anInt986, this.anInt983, 0, 32993, super.aClass45_Sub3_16.anInt9069, arg6, 0);
			this.method2793(false);
		}
		this.method2802(true);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIB)V")
	public final void method821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt3100, super.anInt3107, 0);
		this.anInt978 = arg1;
		this.anInt981 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)V")
	public final void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass45_Sub3_16.anInt9000 - arg3 - arg1;
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glCopyTexSubImage2D(super.anInt3100, 0, arg4, this.anInt983 - arg1 - arg2, arg0, local12, arg5, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIBZII[II)V")
	protected final void method823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(7) int[] arg2) {
		@Pc(16) int[] local16 = new int[arg0 * arg1];
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(24) int local24 = arg1 * local18;
			@Pc(35) int local35 = arg1 * (arg0 - local18 - 1);
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				local16[local24++] = arg2[local35++];
			}
		}
		super.aClass45_Sub3_16.method7475(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt3100, 0, 0, 0, arg1, arg0, 32993, super.aClass45_Sub3_16.anInt9069, local16, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZZ)V")
	public final void method824(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt3100 == 3553) {
			super.aClass45_Sub3_16.method7475(this);
			OpenGL.glTexParameteri(super.anInt3100, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt3100, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIIII[BIIII)V")
	public final void method825(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(9) int arg4) {
		if (arg0) {
			@Pc(18) int local18 = Static367.method5385(6406);
			@Pc(22) int local22 = local18 * arg2;
			@Pc(26) int local26 = local18 * arg2;
			@Pc(31) byte[] local31 = new byte[local22 * arg1];
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				@Pc(39) int local39 = local33 * local22;
				@Pc(49) int local49 = local26 * (arg1 - local33 - 1);
				for (@Pc(51) int local51 = 0; local51 < local22; local51++) {
					local31[local39++] = arg3[local49++];
				}
			}
			arg3 = local31;
		}
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt3100, 0, 0, 0, arg2, arg1, 6406, 5121, arg3, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	@Override
	public final void method2792() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt978, this.anInt981, super.anInt3100, 0, 0);
		this.anInt981 = -1;
		this.anInt978 = -1;
	}
}
