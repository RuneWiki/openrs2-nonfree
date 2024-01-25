import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class53_Sub2 extends Class53 implements Interface2 {

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	private final int anInt5118;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
	private final int anInt5123;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!dc;Lclient!hi;IIZ[BII)V")
	public Class53_Sub2(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static349.aClass239_12, arg2 * arg3, arg4);
		this.anInt5118 = arg2;
		this.anInt5123 = arg3;
		super.aClass66_Sub1_Sub1_10.method6979(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method6772(super.anInt8203, arg5, arg3, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8203, 0, this.method6770(), arg2, arg3, 0, Static241.method4095(super.aClass141_15), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!dc;Lclient!hi;Lclient!ne;II)V")
	public Class53_Sub2(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt5123 = arg4;
		this.anInt5118 = arg3;
		super.aClass66_Sub1_Sub1_10.method6979(this);
		OpenGL.glTexImage2Dub(super.anInt8203, 0, this.method6770(), arg3, arg4, 0, Static241.method4095(super.aClass141_15), Static264.method4336(super.aClass239_19), null, 0);
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!dc;Lclient!hi;IIZ[FII)V")
	public Class53_Sub2(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static349.aClass239_16, arg3 * arg2, arg4);
		this.anInt5118 = arg2;
		this.anInt5123 = arg3;
		super.aClass66_Sub1_Sub1_10.method6979(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8203, 0, this.method6770(), arg2, arg3, 0, Static241.method4095(super.aClass141_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method6769(arg2, arg3, arg5, super.anInt8203);
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!dc;IIZ[III)V")
	public Class53_Sub2(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static85.aClass141_2, Static349.aClass239_12, arg2 * arg1, arg3);
		this.anInt5118 = arg1;
		this.anInt5123 = arg2;
		super.aClass66_Sub1_Sub1_10.method6979(this);
		if (arg3 && arg6 == 0) {
			this.method6771(super.anInt8203, arg4, arg1, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8203, 0, 6408, this.anInt5118, this.anInt5123, 0, 32993, super.aClass66_Sub1_Sub1_10.anInt2250, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)I")
	@Override
	public int method6722() {
		return this.anInt5123;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(FZ)F")
	@Override
	public float method6724(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt5123;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII[I)V")
	@Override
	public void method6720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int[] arg5) {
		super.aClass66_Sub1_Sub1_10.method6979(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt8203, 0, arg0, arg4, arg2, arg1, 32993, super.aClass66_Sub1_Sub1_10.anInt2250, arg5, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)I")
	@Override
	public int method6723() {
		return this.anInt5118;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBII[BLclient!hi;III)V")
	@Override
	public void method6719(@OriginalArg(0) int arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) Class141 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		super.aClass66_Sub1_Sub1_10.method6979(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt8203, 0, 0, 0, arg4, arg0, Static241.method4095(arg2), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6721() {
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method6718(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass66_Sub1_Sub1_10.method6979(this);
		OpenGL.glTexParameteri(super.anInt8203, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8203, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IF)F")
	@Override
	public float method6725(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt5118;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[FIIILclient!hi;IB)V")
	public void method4339(@OriginalArg(2) float[] arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class141 arg3) {
		super.aClass66_Sub1_Sub1_10.method6979(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8203, 0, 0, 0, arg2, arg1, Static241.method4095(arg3), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
