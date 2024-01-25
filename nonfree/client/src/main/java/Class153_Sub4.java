import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class153_Sub4 extends Class153 implements Interface12 {

	@OriginalMember(owner = "client!sh", name = "C", descriptor = "[J")
	public static final long[] aLongArray22 = new long[256];

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
	private final int anInt8843;

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
	private final int anInt8836;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray22[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!og;Lclient!ofa;Lclient!kn;II)V")
	public Class153_Sub4(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt8843 = arg3;
		this.anInt8836 = arg4;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glTexImage2Dub(super.anInt8818, 0, this.method7446(), arg3, arg4, 0, Static517.method7337(super.aClass255_22), Static198.method2807(super.aClass206_18), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!og;Lclient!ofa;IIZ[BII)V")
	public Class153_Sub4(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static314.aClass206_12, arg2 * arg3, arg4);
		this.anInt8843 = arg2;
		this.anInt8836 = arg3;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7444(arg3, super.anInt8818, arg5, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8818, 0, this.method7446(), arg2, arg3, 0, Static517.method7337(super.aClass255_22), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!og;IIZ[III)V")
	public Class153_Sub4(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static92.aClass255_3, Static314.aClass206_12, arg2 * arg1, arg3);
		this.anInt8843 = arg1;
		this.anInt8836 = arg2;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		if (arg3 && arg6 == 0) {
			this.method7440(arg1, arg4, arg2, super.anInt8818);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8818, 0, 6408, this.anInt8843, this.anInt8836, 0, 32993, super.aClass143_Sub1_Sub2_10.anInt7508, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!og;Lclient!ofa;IIZ[FII)V")
	public Class153_Sub4(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static314.aClass206_16, arg3 * arg2, arg4);
		this.anInt8843 = arg2;
		this.anInt8836 = arg3;
		super.aClass143_Sub1_Sub2_10.method6338(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8818, 0, this.method7446(), arg2, arg3, 0, Static517.method7337(super.aClass255_22), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7442(arg5, arg2, super.anInt8818, arg3);
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7453() {
		return true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIILclient!ofa;[BIZI)V")
	@Override
	public void method7452(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class255 arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt8818, 0, 0, 0, arg4, arg1, Static517.method7337(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(IF)F")
	@Override
	public float method7455(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8836;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I")
	@Override
	public int method7448() {
		return this.anInt8836;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[FILclient!ofa;IIIII)V")
	public void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) Class255 arg2, @OriginalArg(8) int arg3) {
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8818, 0, 0, 0, arg3, arg0, Static517.method7337(arg2), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([IZIIIII)V")
	@Override
	public void method7454(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt8836 * this.anInt8843];
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glGetTexImagei(super.anInt8818, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			Static685.method8329(local12, (arg2 - local27 - 1) * this.anInt8843, arg0, local27 * arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7449(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glTexParameteri(super.anInt8818, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8818, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
	@Override
	public int method7456() {
		return this.anInt8843;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIZI[I)V")
	@Override
	public void method7451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		super.aClass143_Sub1_Sub2_10.method6338(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt8818, 0, arg2, arg4, arg0, arg3, 32993, super.aClass143_Sub1_Sub2_10.anInt7508, arg5, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IF)F")
	@Override
	public float method7450(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8843;
	}
}
