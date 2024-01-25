import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public class Class81_Sub4 extends Class81 {

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
	private int anInt5613 = -1;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	public final int anInt5614;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
	public final int anInt5612;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!cg;IIII)V")
	public Class81_Sub4(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt5614 = arg3;
		this.anInt5612 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		this.aClass37_Sub1_34.method767(this);
		local20.glTexImage2D(this.anInt5610, 0, this.anInt5609, arg3, arg4, 0, Static259.method4743(this.anInt5609), 5121, null);
		this.method4737(true);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!cg;IIIIZ[FI)V")
	public Class81_Sub4(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5614 = arg3;
		this.anInt5612 = arg4;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		this.aClass37_Sub1_34.method767(this);
		if (arg5 && this.anInt5610 != 34037) {
			Static259.method4733(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method4742(true);
		} else {
			local20.glTexImage2D(this.anInt5610, 0, this.anInt5609, this.anInt5614, this.anInt5612, 0, arg7, 5126, FloatBuffer.wrap(arg6));
			this.method4742(false);
		}
		this.method4737(true);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!cg;IIIIZ[BIZ)V")
	public Class81_Sub4(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5614 = arg3;
		this.anInt5612 = arg4;
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
		this.aClass37_Sub1_34.method767(this);
		local20.glPixelStorei(3317, 1);
		if (arg5 && this.anInt5610 != 34037) {
			Static259.method4741(local20, arg1, arg2, arg3, arg4, arg7, arg6);
			this.method4742(true);
		} else {
			local20.glTexImage2D(this.anInt5610, 0, this.anInt5609, this.anInt5614, this.anInt5612, 0, arg7, 5121, ByteBuffer.wrap(arg6));
			this.method4742(false);
		}
		local20.glPixelStorei(3317, 4);
		this.method4737(true);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!cg;IIIIZ[IZ)V")
	public Class81_Sub4(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5614 = arg3;
		this.anInt5612 = arg4;
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
		this.aClass37_Sub1_34.method767(this);
		if (arg5 && this.anInt5610 != 34037) {
			Static259.method4734(local20, this.anInt5610, this.anInt5609, this.anInt5614, this.anInt5612, this.aClass37_Sub1_34.anInt670, arg6);
			this.method4742(true);
		} else {
			local20.glTexImage2D(this.anInt5610, 0, this.anInt5609, this.anInt5614, this.anInt5612, 0, 32993, this.aClass37_Sub1_34.anInt670, IntBuffer.wrap(arg6));
			this.method4742(false);
		}
		this.method4737(true);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!cg;IIIII)V")
	protected Class81_Sub4(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt5614 = arg4;
		this.anInt5612 = arg5;
		@Pc(20) opengl local20 = arg0.anOpengl1;
		@Pc(29) int local29 = this.aClass37_Sub1_34.method775().method729() - arg3 - arg5;
		this.aClass37_Sub1_34.method767(this);
		local20.glCopyTexImage2D(this.anInt5610, 0, this.anInt5609, arg2, local29, arg4, arg5, 0);
		this.method4737(true);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZZ)V")
	public final void method4745(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_34.anOpengl1;
		if (this.anInt5610 == 3553) {
			this.aClass37_Sub1_34.method767(this);
			local3.glTexParameteri(this.anInt5610, 10242, arg0 ? 10497 : 33071);
			local3.glTexParameteri(this.anInt5610, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII[BIIIZ)V")
	public final void method4746(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(8) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_34.anOpengl1;
		if (arg4) {
			@Pc(12) int local12 = Static259.method4744(6406);
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
		this.aClass37_Sub1_34.method767(this);
		local3.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			local3.glPixelStorei(3314, arg0);
		}
		local3.glTexSubImage2D(this.anInt5610, 0, 0, 0, arg0, arg1, 6406, 5121, ByteBuffer.wrap(arg2, 0, arg2.length));
		if (arg0 != arg0) {
			local3.glPixelStorei(3314, 0);
		}
		local3.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIII)V")
	public final void method4747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.aClass37_Sub1_34.method775().method729() - arg3;
		this.aClass37_Sub1_34.method767(this);
		this.aClass37_Sub1_34.anOpengl1.glCopyTexSubImage2D(this.anInt5610, 0, arg0, this.anInt5612 - arg1 - arg3, 0, local8, arg2, arg3);
		this.aClass37_Sub1_34.anOpengl1.glFlush();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII[IIIZ)V")
	protected final void method4748(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_34.anOpengl1;
		@Pc(14) int[] local14 = new int[arg0 * arg1];
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			@Pc(23) int local23 = local16 * arg0;
			@Pc(33) int local33 = (arg1 - local16 - 1) * arg0;
			for (@Pc(35) int local35 = 0; local35 < arg0; local35++) {
				local14[local23++] = arg2[local33++];
			}
		}
		this.aClass37_Sub1_34.method767(this);
		if (arg0 != arg0) {
			local3.glPixelStorei(3314, arg0);
		}
		local3.glTexSubImage2D(this.anInt5610, 0, 0, 0, arg0, arg1, 32993, this.aClass37_Sub1_34.anInt670, IntBuffer.wrap(local14, 0, local14.length));
		if (arg0 != arg0) {
			local3.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "()V")
	@Override
	public final void method5338() {
		this.aClass37_Sub1_34.anOpengl1.glFramebufferTexture2DEXT(36160, this.anInt5613, this.anInt5610, 0, 0);
		this.anInt5613 = -1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public final void method4749(@OriginalArg(0) int arg0) {
		this.aClass37_Sub1_34.anOpengl1.glFramebufferTexture2DEXT(36160, arg0, this.anInt5610, this.anInt5608, 0);
		this.anInt5613 = arg0;
	}
}
