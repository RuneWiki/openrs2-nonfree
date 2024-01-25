import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class150_Sub4 extends Class150 implements Interface6 {

	@OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
	private final int anInt10019;

	@OriginalMember(owner = "client!wea", name = "A", descriptor = "I")
	private final int anInt10010;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!hj;II[III)V")
	public Class150_Sub4(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static95.aClass168_2, Static280.aClass182_8, arg1 * arg2, false);
		this.anInt10019 = arg2;
		this.anInt10010 = arg1;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10006, 0, 6408, this.anInt10010, this.anInt10019, 0, 32993, super.aClass82_Sub3_Sub1_11.anInt4414, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!hj;Lclient!iv;Lclient!jt;II)V")
	public Class150_Sub4(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt10019 = arg4;
		this.anInt10010 = arg3;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glTexImage2Dub(super.anInt10006, 0, this.method8493(), arg3, arg4, 0, Static383.method8680(super.aClass168_15), Static157.method2758(super.aClass182_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!hj;Lclient!iv;II[BII)V")
	public Class150_Sub4(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static280.aClass182_8, arg2 * arg3, false);
		this.anInt10019 = arg3;
		this.anInt10010 = arg2;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10006, 0, this.method8493(), arg2, arg3, 0, Static383.method8680(super.aClass168_15), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!hj;Lclient!iv;II[FII)V")
	public Class150_Sub4(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static280.aClass182_12, arg3 * arg2, false);
		this.anInt10010 = arg2;
		this.anInt10019 = arg3;
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10006, 0, this.method8493(), arg2, arg3, 0, Static383.method8680(super.aClass168_15), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIILclient!iv;[BIIZI)V")
	@Override
	public void method8505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class168 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(8) int arg4) {
		super.aClass82_Sub3_Sub1_11.method4972(this);
		if (arg0 == 0) {
			arg0 = arg1;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10006, 0, 0, 0, arg1, arg4, Static383.method8680(arg2), 5121, arg3, 0);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)I")
	@Override
	public int method8500() {
		return this.anInt10019;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)I")
	@Override
	public int method8501() {
		return this.anInt10010;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(III[IIII)V")
	@Override
	public void method8504(@OriginalArg(1) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt10019 * this.anInt10010];
		super.aClass82_Sub3_Sub1_11.method4972(this);
		OpenGL.glGetTexImagei(super.anInt10006, 0, 32993, 5121, local12, 0);
		for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
			Static651.method750(local12, this.anInt10010 * (arg0 - local31 - 1), arg1, arg2 * local31, arg2);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(FI)F")
	@Override
	public float method8502(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8506(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method8507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == 0) {
			arg0 = arg4;
		}
		super.aClass82_Sub3_Sub1_11.method4972(this);
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt10006, 0, arg5, arg3, arg4, arg1, 32993, super.aClass82_Sub3_Sub1_11.anInt4414, arg2, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IF)F")
	@Override
	public float method8503(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8499() {
		return false;
	}
}
