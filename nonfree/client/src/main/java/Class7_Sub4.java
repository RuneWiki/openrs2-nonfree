import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class7_Sub4 extends Class7 implements Interface14 {

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	private final int anInt10155;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
	private final int anInt10159;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ia;II[III)V")
	public Class7_Sub4(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static492.aClass261_14, Static302.aClass200_11, arg1 * arg2, false);
		this.anInt10155 = arg2;
		this.anInt10159 = arg1;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10141, 0, 6408, this.anInt10159, this.anInt10155, 0, 32993, super.aClass15_Sub2_Sub1_10.anInt4275, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ia;Lclient!pw;II[BII)V")
	public Class7_Sub4(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static302.aClass200_11, arg3 * arg2, false);
		this.anInt10159 = arg2;
		this.anInt10155 = arg3;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10141, 0, this.method8227(), arg2, arg3, 0, Static282.method4862(super.aClass261_15), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ia;Lclient!pw;Lclient!lj;II)V")
	public Class7_Sub4(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt10159 = arg3;
		this.anInt10155 = arg4;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glTexImage2Dub(super.anInt10141, 0, this.method8227(), arg3, arg4, 0, Static282.method4862(super.aClass261_15), Static240.method4171(super.aClass200_20), null, 0);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ia;Lclient!pw;II[FII)V")
	public Class7_Sub4(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static302.aClass200_15, arg2 * arg3, false);
		this.anInt10159 = arg2;
		this.anInt10155 = arg3;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10141, 0, this.method8227(), arg2, arg3, 0, Static282.method4862(super.aClass261_15), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8240() {
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!pw;I[BIIIII)V")
	@Override
	public void method8241(@OriginalArg(0) int arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(7) int arg4) {
		if (arg4 == 0) {
			arg4 = arg2;
		}
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10141, 0, 0, 0, arg2, arg0, Static282.method4862(arg1), 5121, arg3, 0);
		if (arg4 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I")
	@Override
	public int method8236() {
		return this.anInt10155;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)I")
	@Override
	public int method8235() {
		return this.anInt10159;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([IIBIIIII)V")
	@Override
	public void method8237(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 == 0) {
			arg5 = arg2;
		}
		super.aClass15_Sub2_Sub1_10.method5414(this);
		if (arg2 != arg5) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt10141, 0, arg4, arg1, arg2, arg3, 32993, super.aClass15_Sub2_Sub1_10.anInt4275, arg0, 0);
		if (arg5 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8238(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IF)F")
	@Override
	public float method8239(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(FB)F")
	@Override
	public float method8242(@OriginalArg(0) float arg0) {
		return arg0;
	}
}
