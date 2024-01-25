import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	private int anInt366 = -1;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public final int anInt365;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public final int anInt367;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!po;IIIIZ[BIZ)V")
	public Class11_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt365 = arg3;
		this.anInt367 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(35) int local35 = local28 * arg3;
				@Pc(43) int local43 = (arg4 - local28 - 1) * arg3;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					local26[local35++] = arg6[local43++];
				}
			}
			arg6 = local26;
		}
		this.aClass59_Sub1_30.method4296(this);
		local20.glPixelStorei(3317, 1);
		if (arg5 && this.anInt3902 != 34037) {
			Static89.method3572(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method3576(true);
		} else {
			local20.glTexImage2D(this.anInt3902, 0, this.anInt3900, this.anInt365, this.anInt367, 0, arg7, 5121, ByteBuffer.wrap(arg6));
			this.method3576(false);
		}
		local20.glPixelStorei(3317, 4);
		this.method3575(true);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!po;IIIIZ[FI)V")
	public Class11_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt365 = arg3;
		this.anInt367 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		this.aClass59_Sub1_30.method4296(this);
		if (arg5 && this.anInt3902 != 34037) {
			Static89.method3571(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method3576(true);
		} else {
			local20.glTexImage2D(this.anInt3902, 0, this.anInt3900, this.anInt365, this.anInt367, 0, arg7, 5126, FloatBuffer.wrap(arg6));
			this.method3576(false);
		}
		this.method3575(true);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!po;IIIII)V")
	protected Class11_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt365 = arg4;
		this.anInt367 = arg5;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		@Pc(29) int local29 = this.aClass59_Sub1_30.method4290().method4264() - arg3 - arg5;
		this.aClass59_Sub1_30.method4296(this);
		local20.glCopyTexImage2D(this.anInt3902, 0, this.anInt3900, arg2, local29, arg4, arg5, 0);
		this.method3575(true);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!po;IIII)V")
	public Class11_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt365 = arg3;
		this.anInt367 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		this.aClass59_Sub1_30.method4296(this);
		local20.glTexImage2D(this.anInt3902, 0, this.anInt3900, arg3, arg4, 0, Static89.method3574(this.anInt3900), this.aClass59_Sub1_30.anInt4791, null);
		this.method3575(true);
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!po;IIIIZ[IZ)V")
	public Class11_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt365 = arg3;
		this.anInt367 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		if (arg7) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(35) int local35 = local28 * arg3;
				@Pc(43) int local43 = (arg4 - local28 - 1) * arg3;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					local26[local35++] = arg6[local43++];
				}
			}
			arg6 = local26;
		}
		this.aClass59_Sub1_30.method4296(this);
		if (arg5 && this.anInt3902 != 34037) {
			Static89.method3582(local20, this.anInt3902, this.anInt3900, this.anInt365, this.anInt367, this.aClass59_Sub1_30.anInt4791, arg6);
			this.method3576(true);
		} else {
			local20.glTexImage2D(this.anInt3902, 0, this.anInt3900, this.anInt365, this.anInt367, 0, 32993, this.aClass59_Sub1_30.anInt4791, IntBuffer.wrap(arg6));
			this.method3576(false);
		}
		this.method3575(true);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIII)V")
	public final void method385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.aClass59_Sub1_30.method4290().method4264() - arg3;
		this.aClass59_Sub1_30.method4296(this);
		this.aClass59_Sub1_30.anOpengl2.glCopyTexSubImage2D(this.anInt3902, 0, arg0, this.anInt367 - arg1 - arg3, 0, local8, arg2, arg3);
		this.aClass59_Sub1_30.anOpengl2.glFlush();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public final void method386(@OriginalArg(0) int arg0) {
		this.aClass59_Sub1_30.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, this.anInt3902, this.anInt3901, 0);
		this.anInt366 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)V")
	public final void method387(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_30.anOpengl2;
		if (this.anInt3902 == 3553) {
			this.aClass59_Sub1_30.method4296(this);
			local3.glTexParameteri(this.anInt3902, 10242, arg0 ? 10497 : 33071);
			local3.glTexParameteri(this.anInt3902, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	@Override
	public final void method5524() {
		this.aClass59_Sub1_30.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt366, this.anInt3902, 0, 0);
		this.anInt366 = -1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII[BIIIZ)V")
	public final void method388(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(8) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_30.anOpengl2;
		@Pc(8) int local8 = Static89.method3570(6406) * arg0;
		if (arg4) {
			@Pc(19) byte[] local19 = new byte[local8 * arg1];
			for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
				@Pc(28) int local28 = local21 * local8;
				@Pc(38) int local38 = (arg1 - local21 - 1) * local8;
				for (@Pc(40) int local40 = 0; local40 < local8; local40++) {
					local19[local28++] = arg2[local38++];
				}
			}
			arg2 = local19;
		}
		this.aClass59_Sub1_30.method4296(this);
		local3.glPixelStorei(3317, 1);
		if (local8 != local8) {
			local3.glPixelStorei(3314, local8);
		}
		local3.glTexSubImage2D(this.anInt3902, 0, 0, 0, arg0, arg1, 6406, 5121, ByteBuffer.wrap(arg2, 0, arg2.length));
		if (local8 != local8) {
			local3.glPixelStorei(3314, 0);
		}
		local3.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII[IIIZ)V")
	protected final void method389(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(6) int arg3) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_30.anOpengl2;
		@Pc(10) int[] local10 = new int[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(19) int local19 = local12 * arg0;
			@Pc(29) int local29 = (arg1 - local12 - 1) * arg3;
			for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
				local10[local19++] = arg2[local29++];
			}
		}
		this.aClass59_Sub1_30.method4296(this);
		if (this.anInt365 != arg3) {
			local3.glPixelStorei(3314, arg3);
		}
		local3.glTexSubImage2D(this.anInt3902, 0, 0, 0, arg0, arg1, 32993, this.aClass59_Sub1_30.anInt4791, IntBuffer.wrap(local10, 0, local10.length));
		if (this.anInt365 != arg3) {
			local3.glPixelStorei(3314, 0);
		}
	}
}
