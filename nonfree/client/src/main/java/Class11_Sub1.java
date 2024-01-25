import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
	private int anInt571 = -1;

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
	private int anInt574 = -1;

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
	public final int anInt564;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
	public final int anInt569;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ad;IIII)V")
	public Class11_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt564 = arg4;
		this.anInt569 = arg3;
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glTexImage2Dub(super.anInt8884, 0, super.anInt8889, arg3, arg4, 0, Static212.method3886(super.anInt8889), 5121, null, 0);
		this.method7303(true);
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ad;IIIIZ[IZ)V")
	public Class11_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt569 = arg3;
		this.anInt564 = arg4;
		if (arg7) {
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
		super.aClass5_Sub1_43.method423(this);
		if (arg5 && super.anInt8884 != 34037) {
			Static58.method1165(super.anInt8884, super.aClass5_Sub1_43.anInt418, this.anInt564, super.anInt8889, this.anInt569, arg6);
			this.method7298(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt8884, 0, super.anInt8889, this.anInt569, this.anInt564, 0, 32993, super.aClass5_Sub1_43.anInt418, arg6, 0);
			this.method7298(false);
		}
		this.method7303(true);
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ad;IIIIZ[BIZ)V")
	public Class11_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt569 = arg3;
		this.anInt564 = arg4;
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
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt8884 != 34037) {
			Static252.method4322(arg4, arg3, arg7, arg1, arg6, arg2);
			this.method7298(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt8884, 0, super.anInt8889, this.anInt569, this.anInt564, 0, arg7, 5121, arg6, 0);
			this.method7298(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7303(true);
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ad;IIIIZ[FI)V")
	public Class11_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt564 = arg4;
		this.anInt569 = arg3;
		super.aClass5_Sub1_43.method423(this);
		if (arg5 && super.anInt8884 != 34037) {
			Static264.method4640(arg7, arg3, arg6, arg2, arg1, arg4);
			this.method7298(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt8884, 0, super.anInt8889, this.anInt569, this.anInt564, 0, arg7, 5126, arg6, 0);
			this.method7298(false);
		}
		this.method7303(true);
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ad;IIIII)V")
	protected Class11_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt569 = arg4;
		this.anInt564 = arg5;
		@Pc(30) int local30 = super.aClass5_Sub1_43.anInt256 - arg5 - arg3;
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glCopyTexImage2D(super.anInt8884, 0, super.anInt8889, arg2, local30, arg4, arg5, 0);
		this.method7303(true);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZIZ)V")
	public final void method605(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt8884 == 3553) {
			super.aClass5_Sub1_43.method423(this);
			OpenGL.glTexParameteri(super.anInt8884, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt8884, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIBZI[I)V")
	protected final void method607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(8) int[] arg2) {
		@Pc(23) int[] local23 = new int[arg0 * arg1];
		for (@Pc(25) int local25 = 0; local25 < arg1; local25++) {
			@Pc(31) int local31 = arg0 * local25;
			@Pc(43) int local43 = (arg1 - local25 - 1) * arg0;
			for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
				local23[local31++] = arg2[local43++];
			}
		}
		super.aClass5_Sub1_43.method423(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt8884, 0, 0, 0, arg0, arg1, 32993, super.aClass5_Sub1_43.anInt418, local23, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	@Override
	public final void method7295() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt571, this.anInt574, super.anInt8884, 0, 0);
		this.anInt574 = -1;
		this.anInt571 = -1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBII)V")
	public final void method608(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt8884, super.anInt8881, 0);
		this.anInt571 = arg1;
		this.anInt574 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII[BIIZII)V")
	public final void method610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(7) boolean arg3, @OriginalArg(9) int arg4) {
		if (arg3) {
			@Pc(15) int local15 = Static56.method1148(6406);
			@Pc(19) int local19 = local15 * arg1;
			@Pc(23) int local23 = arg1 * local15;
			@Pc(28) byte[] local28 = new byte[arg0 * local19];
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				@Pc(36) int local36 = local30 * local19;
				@Pc(46) int local46 = local23 * (arg0 - local30 - 1);
				for (@Pc(48) int local48 = 0; local48 < local19; local48++) {
					local28[local36++] = arg2[local46++];
				}
			}
			arg2 = local28;
		}
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8884, 0, 0, 0, arg1, arg0, 6406, 5121, arg2, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIII)V")
	public final void method611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = super.aClass5_Sub1_43.anInt256 - arg2 - arg1;
		super.aClass5_Sub1_43.method423(this);
		OpenGL.glCopyTexSubImage2D(super.anInt8884, 0, arg4, this.anInt564 - arg2 - arg0, arg5, local11, arg3, arg2);
		OpenGL.glFlush();
	}
}
