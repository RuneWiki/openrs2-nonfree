import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	private int anInt1843 = -1;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public final int anInt1844;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	public final int anInt1842;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!se;IIIII)V")
	protected Class66_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt1844 = arg4;
		this.anInt1842 = arg5;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		@Pc(29) int local29 = this.aClass122_Sub2_35.method4858().method4806() - arg3 - arg5;
		this.aClass122_Sub2_35.method4864(this);
		local20.glCopyTexImage2D(this.anInt4752, 0, this.anInt4753, arg2, local29, arg4, arg5, 0);
		this.method4044(true);
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!se;IIII)V")
	public Class66_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt1844 = arg3;
		this.anInt1842 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		this.aClass122_Sub2_35.method4864(this);
		local20.glTexImage2D(this.anInt4752, 0, this.anInt4753, arg3, arg4, 0, Static101.method4039(this.anInt4753), this.aClass122_Sub2_35.anInt5642, null);
		this.method4044(true);
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!se;IIIIZ[IZ)V")
	public Class66_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1844 = arg3;
		this.anInt1842 = arg4;
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
		this.aClass122_Sub2_35.method4864(this);
		if (arg5 && this.anInt4752 != 34037) {
			Static101.method4043(local20, this.anInt4752, this.anInt4753, this.anInt1844, this.anInt1842, this.aClass122_Sub2_35.anInt5642, arg6);
			this.method4047(true);
		} else {
			local20.glTexImage2D(this.anInt4752, 0, this.anInt4753, this.anInt1844, this.anInt1842, 0, 32993, this.aClass122_Sub2_35.anInt5642, IntBuffer.wrap(arg6));
			this.method4047(false);
		}
		this.method4044(true);
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!se;IIIIZ[FI)V")
	public Class66_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1844 = arg3;
		this.anInt1842 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl2;
		this.aClass122_Sub2_35.method4864(this);
		if (arg5 && this.anInt4752 != 34037) {
			Static101.method4049(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method4047(true);
		} else {
			local20.glTexImage2D(this.anInt4752, 0, this.anInt4753, this.anInt1844, this.anInt1842, 0, arg7, 5126, FloatBuffer.wrap(arg6));
			this.method4047(false);
		}
		this.method4044(true);
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!se;IIIIZ[BIZ)V")
	public Class66_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1844 = arg3;
		this.anInt1842 = arg4;
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
		this.aClass122_Sub2_35.method4864(this);
		local20.glPixelStorei(3317, 1);
		if (arg5 && this.anInt4752 != 34037) {
			Static101.method4048(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method4047(true);
		} else {
			local20.glTexImage2D(this.anInt4752, 0, this.anInt4753, this.anInt1844, this.anInt1842, 0, arg7, 5121, ByteBuffer.wrap(arg6));
			this.method4047(false);
		}
		local20.glPixelStorei(3317, 4);
		this.method4044(true);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII[BIIIZ)V")
	public final void method1513(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(8) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_35.anOpengl2;
		@Pc(8) int local8 = Static101.method4046(6406) * arg0;
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
		this.aClass122_Sub2_35.method4864(this);
		local3.glPixelStorei(3317, 1);
		if (local8 != local8) {
			local3.glPixelStorei(3314, local8);
		}
		local3.glTexSubImage2D(this.anInt4752, 0, 0, 0, arg0, arg1, 6406, 5121, ByteBuffer.wrap(arg2, 0, arg2.length));
		if (local8 != local8) {
			local3.glPixelStorei(3314, 0);
		}
		local3.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public final void method1514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.aClass122_Sub2_35.method4858().method4806() - arg3;
		this.aClass122_Sub2_35.method4864(this);
		this.aClass122_Sub2_35.anOpengl2.glCopyTexSubImage2D(this.anInt4752, 0, arg0, this.anInt1842 - arg1 - arg3, 0, local8, arg2, arg3);
		this.aClass122_Sub2_35.anOpengl2.glFlush();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public final void method1515(@OriginalArg(0) int arg0) {
		this.aClass122_Sub2_35.anOpengl2.glFramebufferTexture2DEXT(36160, arg0, this.anInt4752, this.anInt4751, 0);
		this.anInt1843 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZ)V")
	public final void method1516(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_35.anOpengl2;
		if (this.anInt4752 == 3553) {
			this.aClass122_Sub2_35.method4864(this);
			local3.glTexParameteri(this.anInt4752, 10242, arg0 ? 10497 : 33071);
			local3.glTexParameteri(this.anInt4752, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII[IIIZ)V")
	protected final void method1517(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(6) int arg3) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_35.anOpengl2;
		@Pc(10) int[] local10 = new int[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(19) int local19 = local12 * arg0;
			@Pc(29) int local29 = (arg1 - local12 - 1) * arg3;
			for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
				local10[local19++] = arg2[local29++];
			}
		}
		this.aClass122_Sub2_35.method4864(this);
		if (this.anInt1844 != arg3) {
			local3.glPixelStorei(3314, arg3);
		}
		local3.glTexSubImage2D(this.anInt4752, 0, 0, 0, arg0, arg1, 32993, this.aClass122_Sub2_35.anInt5642, IntBuffer.wrap(local10, 0, local10.length));
		if (this.anInt1844 != arg3) {
			local3.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	@Override
	public final void method4037() {
		this.aClass122_Sub2_35.anOpengl2.glFramebufferTexture2DEXT(36160, this.anInt1843, this.anInt4752, 0, 0);
		this.anInt1843 = -1;
	}
}
