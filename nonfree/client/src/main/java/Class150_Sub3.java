import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class150_Sub3 extends Class150 implements Interface6 {

	@OriginalMember(owner = "client!wba", name = "J", descriptor = "I")
	private final int anInt9959;

	@OriginalMember(owner = "client!wba", name = "I", descriptor = "I")
	private final int anInt9958;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!hj;Lclient!iv;Lclient!jt;II)V")
	public Class150_Sub3(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt9959 = arg4;
		this.anInt9958 = arg3;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glTexImage2Dub(super.anInt10006, 0, this.method8493(), arg3, arg4, 0, Static383.method8680(super.aClass168_15), Static157.method2758(super.aClass182_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!hj;IIZ[III)V")
	public Class150_Sub3(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static95.aClass168_2, Static280.aClass182_8, arg1 * arg2, arg3);
		this.anInt9959 = arg2;
		this.anInt9958 = arg1;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		if (arg3 && arg6 == 0) {
			this.method8494(arg2, arg1, super.anInt10006, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10006, 0, 6408, this.anInt9958, this.anInt9959, 0, 32993, super.aClass82_Sub3_Sub1_11.anInt4414, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!hj;Lclient!iv;IIZ[FII)V")
	public Class150_Sub3(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static280.aClass182_12, arg2 * arg3, arg4);
		this.anInt9958 = arg2;
		this.anInt9959 = arg3;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10006, 0, this.method8493(), arg2, arg3, 0, Static383.method8680(super.aClass168_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8497(arg5, arg3, super.anInt10006, arg2);
		}
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!hj;Lclient!iv;IIZ[BII)V")
	public Class150_Sub3(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static280.aClass182_8, arg3 * arg2, arg4);
		this.anInt9959 = arg3;
		this.anInt9958 = arg2;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8489(arg5, super.anInt10006, arg2, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10006, 0, this.method8493(), arg2, arg3, 0, Static383.method8680(super.aClass168_15), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(III[FIILclient!iv;II)V")
	public void method8465(@OriginalArg(2) int arg0, @OriginalArg(3) float[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class168 arg3) {
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10006, 0, 0, 0, arg2, arg0, Static383.method8680(arg3), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I")
	@Override
	public int method8501() {
		return this.anInt9958;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8499() {
		return true;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(III[IIII)V")
	@Override
	public void method8504(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt9958 * this.anInt9959];
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glGetTexImagei(super.anInt10006, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg0; local27++) {
			Static651.method750(local12, (arg0 - local27 - 1) * this.anInt9958, arg1, local27 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(FI)F")
	@Override
	public float method8502(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9958;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIILclient!iv;[BIIZI)V")
	@Override
	public void method8505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class168 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(8) int arg4) {
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt10006, 0, 0, 0, arg1, arg4, Static383.method8680(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)I")
	@Override
	public int method8500() {
		return this.anInt9959;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8506(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glTexParameteri(super.anInt10006, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10006, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IF)F")
	@Override
	public float method8503(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9959;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method8507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt10006, 0, arg5, arg3, arg4, arg1, 32993, super.aClass82_Sub3_Sub1_11.anInt4414, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
