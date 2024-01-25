import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public class Class92_Sub4 extends Class92 {

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	private int anInt3882 = -1;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public final int anInt3881;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public final int anInt3880;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!hd;IIIII)V")
	protected Class92_Sub4(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt3881 = arg4;
		this.anInt3880 = arg5;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		@Pc(29) int local29 = this.aClass89_Sub1_30.method2452().method2391() - arg3 - arg5;
		this.aClass89_Sub1_30.method2445(this);
		local20.glCopyTexImage2D(this.anInt3876, 0, this.anInt3877, arg2, local29, arg4, arg5, 0);
		this.method3517(true);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!hd;IIIIZ[BIZ)V")
	public Class92_Sub4(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3881 = arg3;
		this.anInt3880 = arg4;
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
		this.aClass89_Sub1_30.method2445(this);
		local20.glPixelStorei(3317, 1);
		if (arg5 && this.anInt3876 != 34037) {
			Static332.method3528(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method3516(true);
		} else {
			local20.glTexImage2D(this.anInt3876, 0, this.anInt3877, this.anInt3881, this.anInt3880, 0, arg7, 5121, ByteBuffer.wrap(arg6));
			this.method3516(false);
		}
		local20.glPixelStorei(3317, 4);
		this.method3517(true);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!hd;IIIIZ[IZ)V")
	public Class92_Sub4(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3881 = arg3;
		this.anInt3880 = arg4;
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
		this.aClass89_Sub1_30.method2445(this);
		if (arg5 && this.anInt3876 != 34037) {
			Static332.method3520(local20, this.anInt3876, this.anInt3877, this.anInt3881, this.anInt3880, this.aClass89_Sub1_30.anInt2640, arg6);
			this.method3516(true);
		} else {
			local20.glTexImage2D(this.anInt3876, 0, this.anInt3877, this.anInt3881, this.anInt3880, 0, 32993, this.aClass89_Sub1_30.anInt2640, IntBuffer.wrap(arg6));
			this.method3516(false);
		}
		this.method3517(true);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!hd;IIII)V")
	public Class92_Sub4(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt3881 = arg3;
		this.anInt3880 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		this.aClass89_Sub1_30.method2445(this);
		local20.glTexImage2D(this.anInt3876, 0, this.anInt3877, arg3, arg4, 0, Static332.method3518(this.anInt3877), this.aClass89_Sub1_30.anInt2640, null);
		this.method3517(true);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!hd;IIIIZ[FI)V")
	public Class92_Sub4(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3881 = arg3;
		this.anInt3880 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		this.aClass89_Sub1_30.method2445(this);
		if (arg5 && this.anInt3876 != 34037) {
			Static332.method3521(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method3516(true);
		} else {
			local20.glTexImage2D(this.anInt3876, 0, this.anInt3877, this.anInt3881, this.anInt3880, 0, arg7, 5126, FloatBuffer.wrap(arg6));
			this.method3516(false);
		}
		this.method3517(true);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII[IIIZ)V")
	protected final void method3529(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(6) int arg3) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_30.anOpengl2;
		@Pc(10) int[] local10 = new int[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(19) int local19 = local12 * arg0;
			@Pc(29) int local29 = (arg1 - local12 - 1) * arg3;
			for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
				local10[local19++] = arg2[local29++];
			}
		}
		this.aClass89_Sub1_30.method2445(this);
		if (this.anInt3881 != arg3) {
			local3.glPixelStorei(3314, arg3);
		}
		local3.glTexSubImage2D(this.anInt3876, 0, 0, 0, arg0, arg1, 32993, this.aClass89_Sub1_30.anInt2640, IntBuffer.wrap(local10, 0, local10.length));
		if (this.anInt3881 != arg3) {
			local3.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
	public final void method3530(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_30.anOpengl2;
		if (this.anInt3876 == 3553) {
			this.aClass89_Sub1_30.method2445(this);
			local3.glTexParameteri(this.anInt3876, 10242, arg0 ? 10497 : 33071);
			local3.glTexParameteri(this.anInt3876, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII[BIIIZ)V")
	public final void method3531(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(8) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_30.anOpengl2;
		@Pc(8) int local8 = Static332.method3524(6406) * arg0;
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
		this.aClass89_Sub1_30.method2445(this);
		local3.glPixelStorei(3317, 1);
		if (local8 != local8) {
			local3.glPixelStorei(3314, local8);
		}
		local3.glTexSubImage2D(this.anInt3876, 0, 0, 0, arg0, arg1, 6406, 5121, ByteBuffer.wrap(arg2, 0, arg2.length));
		if (local8 != local8) {
			local3.glPixelStorei(3314, 0);
		}
		local3.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
	@Override
	public final void method4829() {
		this.aClass89_Sub1_30.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt3882, this.anInt3876, 0, 0);
		this.anInt3882 = -1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIII)V")
	public final void method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.aClass89_Sub1_30.method2452().method2391() - arg3;
		this.aClass89_Sub1_30.method2445(this);
		this.aClass89_Sub1_30.anOpengl2.glCopyTexSubImage2D(this.anInt3876, 0, arg0, this.anInt3880 - arg1 - arg3, 0, local8, arg2, arg3);
		this.aClass89_Sub1_30.anOpengl2.glFlush();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public final void method3533(@OriginalArg(0) int arg0) {
		this.aClass89_Sub1_30.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, this.anInt3876, this.anInt3878, 0);
		this.anInt3882 = arg0;
	}
}
