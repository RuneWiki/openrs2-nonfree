import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public class Class28_Sub3 extends Class28 {

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt1336 = -1;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public final int anInt1334;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public final int anInt1335;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ge;IIII)V")
	public Class28_Sub3(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt1334 = arg3;
		this.anInt1335 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		this.aClass81_Sub1_26.method2022(this);
		local20.glTexImage2D(this.anInt4318, 0, this.anInt4319, arg3, arg4, 0, Static199.method4120(this.anInt4319), this.aClass81_Sub1_26.anInt1832, null);
		this.method4124(true);
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ge;IIIIZ[IZ)V")
	public Class28_Sub3(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1334 = arg3;
		this.anInt1335 = arg4;
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
		this.aClass81_Sub1_26.method2022(this);
		if (arg5 && this.anInt4318 != 34037) {
			Static199.method4121(local20, this.anInt4318, this.anInt4319, this.anInt1334, this.anInt1335, this.aClass81_Sub1_26.anInt1832, arg6);
			this.method4123(true);
		} else {
			local20.glTexImage2D(this.anInt4318, 0, this.anInt4319, this.anInt1334, this.anInt1335, 0, 32993, this.aClass81_Sub1_26.anInt1832, IntBuffer.wrap(arg6));
			this.method4123(false);
		}
		this.method4124(true);
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ge;IIIIZ[FI)V")
	public Class28_Sub3(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1334 = arg3;
		this.anInt1335 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		this.aClass81_Sub1_26.method2022(this);
		if (arg5 && this.anInt4318 != 34037) {
			Static199.method4115(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method4123(true);
		} else {
			local20.glTexImage2D(this.anInt4318, 0, this.anInt4319, this.anInt1334, this.anInt1335, 0, arg7, 5126, FloatBuffer.wrap(arg6));
			this.method4123(false);
		}
		this.method4124(true);
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ge;IIIII)V")
	protected Class28_Sub3(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt1334 = arg4;
		this.anInt1335 = arg5;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		@Pc(29) int local29 = this.aClass81_Sub1_26.method1955().method2744() - arg3 - arg5;
		this.aClass81_Sub1_26.method2022(this);
		local20.glCopyTexImage2D(this.anInt4318, 0, this.anInt4319, arg2, local29, arg4, arg5, 0);
		this.method4124(true);
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ge;IIIIZ[BIZ)V")
	public Class28_Sub3(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1334 = arg3;
		this.anInt1335 = arg4;
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
		this.aClass81_Sub1_26.method2022(this);
		local20.glPixelStorei(3317, 1);
		if (arg5 && this.anInt4318 != 34037) {
			Static199.method4118(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method4123(true);
		} else {
			local20.glTexImage2D(this.anInt4318, 0, this.anInt4319, this.anInt1334, this.anInt1335, 0, arg7, 5121, ByteBuffer.wrap(arg6));
			this.method4123(false);
		}
		local20.glPixelStorei(3317, 4);
		this.method4124(true);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII[IIIZ)V")
	protected final void method1253(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(6) int arg3) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_26.anOpengl1;
		@Pc(10) int[] local10 = new int[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(19) int local19 = local12 * arg0;
			@Pc(29) int local29 = (arg1 - local12 - 1) * arg3;
			for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
				local10[local19++] = arg2[local29++];
			}
		}
		this.aClass81_Sub1_26.method2022(this);
		if (this.anInt1334 != arg3) {
			local3.glPixelStorei(3314, arg3);
		}
		local3.glTexSubImage2D(this.anInt4318, 0, 0, 0, arg0, arg1, 32993, this.aClass81_Sub1_26.anInt1832, IntBuffer.wrap(local10, 0, local10.length));
		if (this.anInt1334 != arg3) {
			local3.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII[BIIIZ)V")
	public final void method1254(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(8) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_26.anOpengl1;
		@Pc(8) int local8 = Static199.method4125(6406) * arg0;
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
		this.aClass81_Sub1_26.method2022(this);
		local3.glPixelStorei(3317, 1);
		if (local8 != local8) {
			local3.glPixelStorei(3314, local8);
		}
		local3.glTexSubImage2D(this.anInt4318, 0, 0, 0, arg0, arg1, 6406, 5121, ByteBuffer.wrap(arg2, 0, arg2.length));
		if (local8 != local8) {
			local3.glPixelStorei(3314, 0);
		}
		local3.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII)V")
	public final void method1255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.aClass81_Sub1_26.method1955().method2744() - arg3;
		this.aClass81_Sub1_26.method2022(this);
		this.aClass81_Sub1_26.anOpengl1.glCopyTexSubImage2D(this.anInt4318, 0, arg0, this.anInt1335 - arg1 - arg3, 0, local8, arg2, arg3);
		this.aClass81_Sub1_26.anOpengl1.glFlush();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public final void method1256(@OriginalArg(0) int arg0) {
		this.aClass81_Sub1_26.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, this.anInt4318, this.anInt4317, 0);
		this.anInt1336 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
	@Override
	public final void method4114() {
		this.aClass81_Sub1_26.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt1336, this.anInt4318, 0, 0);
		this.anInt1336 = -1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)V")
	public final void method1257(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_26.anOpengl1;
		if (this.anInt4318 == 3553) {
			this.aClass81_Sub1_26.method2022(this);
			local3.glTexParameteri(this.anInt4318, 10242, arg0 ? 10497 : 33071);
			local3.glTexParameteri(this.anInt4318, 10243, arg1 ? 10497 : 33071);
		}
	}
}
