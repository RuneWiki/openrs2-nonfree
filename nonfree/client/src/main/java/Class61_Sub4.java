import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class61_Sub4 extends Class61 implements Interface20 {

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	private final int anInt6577;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
	private final int anInt6570;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!mc;Lclient!nl;II[FII)V")
	public Class61_Sub4(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static108.aClass82_12, arg3 * arg2, false);
		this.anInt6577 = arg3;
		this.anInt6570 = arg2;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt6559, 0, this.method5535(), arg2, arg3, 0, Static564.method7708(super.aClass214_12), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!mc;II[III)V")
	public Class61_Sub4(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static255.aClass214_8, Static108.aClass82_8, arg1 * arg2, false);
		this.anInt6570 = arg1;
		this.anInt6577 = arg2;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt6559, 0, 6408, this.anInt6570, this.anInt6577, 0, 32993, super.aClass121_Sub2_Sub1_5.anInt5463, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!mc;Lclient!nl;Lclient!eea;II)V")
	public Class61_Sub4(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt6570 = arg3;
		this.anInt6577 = arg4;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glTexImage2Dub(super.anInt6559, 0, this.method5535(), arg3, arg4, 0, Static564.method7708(super.aClass214_12), Static414.method6081(super.aClass82_17), null, 0);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!mc;Lclient!nl;II[BII)V")
	public Class61_Sub4(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static108.aClass82_8, arg3 * arg2, false);
		this.anInt6570 = arg2;
		this.anInt6577 = arg3;
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt6559, 0, this.method5535(), arg2, arg3, 0, Static564.method7708(super.aClass214_12), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IF)F")
	@Override
	public float method7534(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)I")
	@Override
	public int method7530() {
		return this.anInt6577;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(FI)F")
	@Override
	public float method7533(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7531(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method7529(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass121_Sub2_Sub1_5.method7167(this);
		if (arg0 == 0) {
			arg0 = arg5;
		}
		if (arg5 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt6559, 0, arg4, arg1, arg5, arg3, 32993, super.aClass121_Sub2_Sub1_5.anInt5463, arg2, 0);
		if (arg0 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)I")
	@Override
	public int method7536() {
		return this.anInt6570;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!nl;IB[BIIIII)V")
	@Override
	public void method7532(@OriginalArg(0) Class214 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (arg4 == 0) {
			arg4 = arg3;
		}
		super.aClass121_Sub2_Sub1_5.method7167(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg3) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt6559, 0, 0, 0, arg3, arg1, Static564.method7708(arg0), 5121, arg2, 0);
		if (arg4 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7535() {
		return false;
	}
}
