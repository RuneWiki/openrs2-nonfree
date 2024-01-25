import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class12_Sub4 extends Class12 implements Interface6 {

	@OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
	private final int anInt9301;

	@OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
	private final int anInt9299;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!el;Lclient!nh;II[BII)V")
	public Class12_Sub4(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static239.aClass161_12, arg2 * arg3, false);
		this.anInt9301 = arg2;
		this.anInt9299 = arg3;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9288, 0, this.method7591(), arg2, arg3, 0, Static255.method4299(super.aClass219_15), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!el;Lclient!nh;Lclient!jr;II)V")
	public Class12_Sub4(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt9299 = arg4;
		this.anInt9301 = arg3;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glTexImage2Dub(super.anInt9288, 0, this.method7591(), arg3, arg4, 0, Static255.method4299(super.aClass219_15), Static148.method2863(super.aClass161_20), null, 0);
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!el;Lclient!nh;II[FII)V")
	public Class12_Sub4(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static239.aClass161_16, arg2 * arg3, false);
		this.anInt9299 = arg3;
		this.anInt9301 = arg2;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9288, 0, this.method7591(), arg2, arg3, 0, Static255.method4299(super.aClass219_15), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!el;II[III)V")
	public Class12_Sub4(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static122.aClass219_7, Static239.aClass161_12, arg2 * arg1, false);
		this.anInt9299 = arg2;
		this.anInt9301 = arg1;
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9288, 0, 6408, this.anInt9301, this.anInt9299, 0, 32993, super.aClass14_Sub2_Sub1_10.anInt2779, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method7606(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
	@Override
	public int method7599() {
		return this.anInt9299;
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)I")
	@Override
	public int method7605() {
		return this.anInt9301;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BF)F")
	@Override
	public float method7604(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7601() {
		return false;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZIILclient!nh;I[B)V")
	@Override
	public void method7602(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class219 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		if (arg3 == 0) {
			arg3 = arg0;
		}
		super.aClass14_Sub2_Sub1_10.method7034(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9288, 0, 0, 0, arg0, arg1, Static255.method4299(arg2), 5121, arg4, 0);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(FI)F")
	@Override
	public float method7600(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method7603(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 == 0) {
			arg4 = arg2;
		}
		super.aClass14_Sub2_Sub1_10.method7034(this);
		if (arg4 != arg2) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Di(super.anInt9288, 0, arg5, arg3, arg2, arg1, 32993, super.aClass14_Sub2_Sub1_10.anInt2779, arg0, 0);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
