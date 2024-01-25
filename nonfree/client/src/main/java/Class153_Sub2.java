import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class153_Sub2 extends Class153 implements Interface12 {

	@OriginalMember(owner = "client!il", name = "O", descriptor = "I")
	private final int anInt4039;

	@OriginalMember(owner = "client!il", name = "B", descriptor = "I")
	private final int anInt4029;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!og;II[III)V")
	public Class153_Sub2(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static92.aClass255_3, Static314.aClass206_12, arg2 * arg1, false);
		this.anInt4039 = arg1;
		this.anInt4029 = arg2;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8818, 0, 6408, this.anInt4039, this.anInt4029, 0, 32993, super.aClass143_Sub1_Sub2_10.anInt7508, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!og;Lclient!ofa;Lclient!kn;II)V")
	public Class153_Sub2(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt4039 = arg3;
		this.anInt4029 = arg4;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glTexImage2Dub(super.anInt8818, 0, this.method7446(), arg3, arg4, 0, Static517.method7337(super.aClass255_22), Static198.method2807(super.aClass206_18), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!og;Lclient!ofa;II[BII)V")
	public Class153_Sub2(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static314.aClass206_12, arg2 * arg3, false);
		this.anInt4029 = arg3;
		this.anInt4039 = arg2;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8818, 0, this.method7446(), arg2, arg3, 0, Static517.method7337(super.aClass255_22), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!og;Lclient!ofa;II[FII)V")
	public Class153_Sub2(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static314.aClass206_16, arg3 * arg2, false);
		this.anInt4029 = arg3;
		this.anInt4039 = arg2;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8818, 0, this.method7446(), arg2, arg3, 0, Static517.method7337(super.aClass255_22), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I")
	@Override
	public int method7456() {
		return this.anInt4039;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IF)F")
	@Override
	public float method7455(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([IZIIIII)V")
	@Override
	public void method7454(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt4039 * this.anInt4029];
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glGetTexImagei(super.anInt8818, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			Static685.method8329(local12, this.anInt4039 * (arg2 - local27 - 1), arg0, local27 * arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I")
	@Override
	public int method7448() {
		return this.anInt4029;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IF)F")
	@Override
	public float method7450(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7453() {
		return false;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIZI[I)V")
	@Override
	public void method7451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 == 0) {
			arg1 = arg0;
		}
		super.aClass143_Sub1_Sub2_10.method6338(this);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt8818, 0, arg2, arg4, arg0, arg3, 32993, super.aClass143_Sub1_Sub2_10.anInt7508, arg5, 0);
		if (arg0 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7449(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIILclient!ofa;[BIZI)V")
	@Override
	public void method7452(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class255 arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		if (arg0 == 0) {
			arg0 = arg4;
		}
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8818, 0, 0, 0, arg4, arg1, Static517.method7337(arg2), 5121, arg3, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
