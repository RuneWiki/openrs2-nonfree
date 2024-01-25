import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
	private int anInt5004 = -1;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
	private int anInt5011 = -1;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
	public final int anInt5003;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
	public final int anInt5007;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!kd;IIIIZ[BIZ)V")
	public Class3_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5003 = arg3;
		this.anInt5007 = arg4;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(41) int local41 = (arg4 - local28 - 1) * arg3;
				for (@Pc(43) int local43 = 0; local43 < arg3; local43++) {
					local26[local33++] = arg6[local41++];
				}
			}
			arg6 = local26;
		}
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt4987 != 34037) {
			Static300.method5749(arg4, arg1, arg3, arg2, arg7, arg6);
			this.method4149(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt4987, 0, super.anInt4993, this.anInt5003, this.anInt5007, 0, arg7, 5121, arg6, 0);
			this.method4149(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method4146(true);
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!kd;IIIIZ[FI)V")
	public Class3_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt5007 = arg4;
		this.anInt5003 = arg3;
		super.aClass39_Sub2_29.method3203(this);
		if (arg5 && super.anInt4987 != 34037) {
			Static359.method4938(arg3, arg4, arg7, arg1, arg2, arg6);
			this.method4149(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt4987, 0, super.anInt4993, this.anInt5003, this.anInt5007, 0, arg7, 5126, arg6, 0);
			this.method4149(false);
		}
		this.method4146(true);
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!kd;IIIIZ[IZ)V")
	public Class3_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt5007 = arg4;
		this.anInt5003 = arg3;
		if (arg7) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = arg3 * (arg4 - local28 - 1);
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass39_Sub2_29.method3203(this);
		if (arg5 && super.anInt4987 != 34037) {
			Static458.method6014(arg6, super.aClass39_Sub2_29.anInt3791, this.anInt5003, super.anInt4987, this.anInt5007, super.anInt4993);
			this.method4149(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt4987, 0, super.anInt4993, this.anInt5003, this.anInt5007, 0, 32993, super.aClass39_Sub2_29.anInt3791, arg6, 0);
			this.method4149(false);
		}
		this.method4146(true);
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!kd;IIII)V")
	public Class3_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt5003 = arg3;
		this.anInt5007 = arg4;
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glTexImage2Dub(super.anInt4987, 0, super.anInt4993, arg3, arg4, 0, Static105.method1877(super.anInt4993), 5121, null, 0);
		this.method4146(true);
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!kd;IIIII)V")
	protected Class3_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt5003 = arg4;
		this.anInt5007 = arg5;
		@Pc(29) int local29 = super.aClass39_Sub2_29.anInt3750 - arg3 - arg5;
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glCopyTexImage2D(super.anInt4987, 0, super.anInt4993, arg2, local29, arg4, arg5, 0);
		this.method4146(true);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	@Override
	public final void method4145() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5011, this.anInt5004, super.anInt4987, 0, 0);
		this.anInt5011 = -1;
		this.anInt5004 = -1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[IIIZIIII)V")
	protected final void method4157(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int[] local19 = new int[arg1 * arg2];
		for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
			@Pc(27) int local27 = local21 * arg2;
			@Pc(37) int local37 = (arg1 - local21 - 1) * arg2;
			for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
				local19[local27++] = arg0[local37++];
			}
		}
		super.aClass39_Sub2_29.method3203(this);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Di(super.anInt4987, 0, 0, 0, arg2, arg1, 32993, super.aClass39_Sub2_29.anInt3791, local19, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BIIZIIIIII)V")
	public final void method4158(@OriginalArg(0) byte[] arg0, @OriginalArg(3) boolean arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		if (arg1) {
			@Pc(13) int local13 = Static57.method1234(6406);
			@Pc(17) int local17 = arg2 * local13;
			@Pc(21) int local21 = local13 * arg2;
			@Pc(26) byte[] local26 = new byte[local17 * arg4];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local17 * local28;
				@Pc(44) int local44 = local21 * (arg4 - local28 - 1);
				for (@Pc(46) int local46 = 0; local46 < local17; local46++) {
					local26[local33++] = arg0[local44++];
				}
			}
			arg0 = local26;
		}
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt4987, 0, 0, 0, arg2, arg4, 6406, 5121, arg0, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII)V")
	public final void method4159(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt4987, super.anInt4986, 0);
		this.anInt5011 = arg1;
		this.anInt5004 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZIIIIII)V")
	public final void method4161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = super.aClass39_Sub2_29.anInt3750 - arg3;
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glCopyTexSubImage2D(super.anInt4987, 0, arg4, this.anInt5007 - arg3 - arg0, 0, local12, arg2, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZZI)V")
	public final void method4163(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (super.anInt4987 == 3553) {
			super.aClass39_Sub2_29.method3203(this);
			OpenGL.glTexParameteri(super.anInt4987, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt4987, 10243, arg1 ? 10497 : 33071);
		}
	}
}
