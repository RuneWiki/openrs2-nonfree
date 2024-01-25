import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	private int anInt5159 = -1;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	public final int anInt5158;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public final int anInt5157;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mi;IIIIZ[BIZ)V")
	public Class30_Sub3(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5158 = arg3;
		this.anInt5157 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl1;
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
		this.aClass155_Sub1_35.method3585(this);
		local20.glPixelStorei(3317, 1);
		if (arg5 && this.anInt5155 != 34037) {
			Static31.method4605(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method4610(true);
		} else {
			local20.glTexImage2D(this.anInt5155, 0, this.anInt5154, this.anInt5158, this.anInt5157, 0, arg7, 5121, ByteBuffer.wrap(arg6));
			this.method4610(false);
		}
		local20.glPixelStorei(3317, 4);
		this.method4607(true);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mi;IIIII)V")
	protected Class30_Sub3(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt5158 = arg4;
		this.anInt5157 = arg5;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		@Pc(29) int local29 = this.aClass155_Sub1_35.method3629().method3562() - arg3 - arg5;
		this.aClass155_Sub1_35.method3585(this);
		local20.glCopyTexImage2D(this.anInt5155, 0, this.anInt5154, arg2, local29, arg4, arg5, 0);
		this.method4607(true);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mi;IIIIZ[IZ)V")
	public Class30_Sub3(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5158 = arg3;
		this.anInt5157 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl1;
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
		this.aClass155_Sub1_35.method3585(this);
		if (arg5 && this.anInt5155 != 34037) {
			Static31.method4611(local20, this.anInt5155, this.anInt5154, this.anInt5158, this.anInt5157, this.aClass155_Sub1_35.anInt3876, arg6);
			this.method4610(true);
		} else {
			local20.glTexImage2D(this.anInt5155, 0, this.anInt5154, this.anInt5158, this.anInt5157, 0, 32993, this.aClass155_Sub1_35.anInt3876, IntBuffer.wrap(arg6));
			this.method4610(false);
		}
		this.method4607(true);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mi;IIIIZ[FI)V")
	public Class30_Sub3(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5158 = arg3;
		this.anInt5157 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		this.aClass155_Sub1_35.method3585(this);
		if (arg5 && this.anInt5155 != 34037) {
			Static31.method4603(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method4610(true);
		} else {
			local20.glTexImage2D(this.anInt5155, 0, this.anInt5154, this.anInt5158, this.anInt5157, 0, arg7, 5126, FloatBuffer.wrap(arg6));
			this.method4610(false);
		}
		this.method4607(true);
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!mi;IIII)V")
	public Class30_Sub3(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt5158 = arg3;
		this.anInt5157 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		this.aClass155_Sub1_35.method3585(this);
		local20.glTexImage2D(this.anInt5155, 0, this.anInt5154, arg3, arg4, 0, Static31.method4601(this.anInt5154), 5121, null);
		this.method4607(true);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZZ)V")
	public final void method4613(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) opengl local3 = this.aClass155_Sub1_35.anOpengl1;
		if (this.anInt5155 == 3553) {
			this.aClass155_Sub1_35.method3585(this);
			local3.glTexParameteri(this.anInt5155, 10242, arg0 ? 10497 : 33071);
			local3.glTexParameteri(this.anInt5155, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIII)V")
	public final void method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.aClass155_Sub1_35.method3629().method3562() - arg3;
		this.aClass155_Sub1_35.method3585(this);
		this.aClass155_Sub1_35.anOpengl1.glCopyTexSubImage2D(this.anInt5155, 0, arg0, this.anInt5157 - arg1 - arg3, 0, local8, arg2, arg3);
		this.aClass155_Sub1_35.anOpengl1.glFlush();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
	@Override
	public final void method4599() {
		this.aClass155_Sub1_35.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt5159, this.anInt5155, 0, 0);
		this.anInt5159 = -1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII[BIIIZ)V")
	public final void method4615(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(8) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass155_Sub1_35.anOpengl1;
		if (arg4) {
			@Pc(12) int local12 = Static31.method4606(6406);
			@Pc(16) int local16 = local12 * arg0;
			@Pc(20) int local20 = local12 * arg0;
			@Pc(25) byte[] local25 = new byte[local16 * arg1];
			for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
				@Pc(34) int local34 = local27 * local16;
				@Pc(44) int local44 = (arg1 - local27 - 1) * local20;
				for (@Pc(46) int local46 = 0; local46 < local16; local46++) {
					local25[local34++] = arg2[local44++];
				}
			}
			arg2 = local25;
		}
		this.aClass155_Sub1_35.method3585(this);
		local3.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			local3.glPixelStorei(3314, arg0);
		}
		local3.glTexSubImage2D(this.anInt5155, 0, 0, 0, arg0, arg1, 6406, 5121, ByteBuffer.wrap(arg2, 0, arg2.length));
		if (arg0 != arg0) {
			local3.glPixelStorei(3314, 0);
		}
		local3.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public final void method4616(@OriginalArg(0) int arg0) {
		this.aClass155_Sub1_35.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, this.anInt5155, this.anInt5156, 0);
		this.anInt5159 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII[IIIZ)V")
	protected final void method4617(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2) {
		@Pc(3) opengl local3 = this.aClass155_Sub1_35.anOpengl1;
		@Pc(14) int[] local14 = new int[arg0 * arg1];
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			@Pc(23) int local23 = local16 * arg0;
			@Pc(33) int local33 = (arg1 - local16 - 1) * arg0;
			for (@Pc(35) int local35 = 0; local35 < arg0; local35++) {
				local14[local23++] = arg2[local33++];
			}
		}
		this.aClass155_Sub1_35.method3585(this);
		if (arg0 != arg0) {
			local3.glPixelStorei(3314, arg0);
		}
		local3.glTexSubImage2D(this.anInt5155, 0, 0, 0, arg0, arg1, 32993, this.aClass155_Sub1_35.anInt3876, IntBuffer.wrap(local14, 0, local14.length));
		if (arg0 != arg0) {
			local3.glPixelStorei(3314, 0);
		}
	}
}
