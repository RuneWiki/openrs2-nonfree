import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public final class Class102_Sub4 extends Class102 implements Interface3 {

	@OriginalMember(owner = "client!ww", name = "z", descriptor = "I")
	private final int anInt9171;

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
	private final int anInt9167;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!lh;Lclient!kl;IIZ[FII)V")
	public Class102_Sub4(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static523.aClass306_19, arg2 * arg3, arg4);
		this.anInt9171 = arg3;
		this.anInt9167 = arg2;
		super.aClass62_Sub1_Sub2_10.method4676(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9162, 0, this.method7444(), arg2, arg3, 0, Static546.method7437(super.aClass174_17), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7448(super.anInt9162, arg2, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!lh;IIZ[III)V")
	public Class102_Sub4(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static189.aClass174_6, Static523.aClass306_15, arg1 * arg2, arg3);
		this.anInt9171 = arg2;
		this.anInt9167 = arg1;
		super.aClass62_Sub1_Sub2_10.method4676(this);
		if (arg3 && arg6 == 0) {
			this.method7445(arg2, arg1, super.anInt9162, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9162, 0, 6408, this.anInt9167, this.anInt9171, 0, 32993, super.aClass62_Sub1_Sub2_10.anInt5782, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!lh;Lclient!kl;Lclient!vt;II)V")
	public Class102_Sub4(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class306 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt9171 = arg4;
		this.anInt9167 = arg3;
		super.aClass62_Sub1_Sub2_10.method4676(this);
		OpenGL.glTexImage2Dub(super.anInt9162, 0, this.method7444(), arg3, arg4, 0, Static546.method7437(super.aClass174_17), Static149.method2768(super.aClass306_20), null, 0);
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!lh;Lclient!kl;IIZ[BII)V")
	public Class102_Sub4(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static523.aClass306_15, arg2 * arg3, arg4);
		this.anInt9171 = arg3;
		this.anInt9167 = arg2;
		super.aClass62_Sub1_Sub2_10.method4676(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7442(arg3, arg2, super.anInt9162, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9162, 0, this.method7444(), arg2, arg3, 0, Static546.method7437(super.aClass174_17), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZI[IIII)V")
	@Override
	public void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass62_Sub1_Sub2_10.method4676(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt9162, 0, arg4, arg0, arg2, arg1, 32993, super.aClass62_Sub1_Sub2_10.anInt5782, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILclient!kl;III[BII)V")
	@Override
	public void method7453(@OriginalArg(1) int arg0, @OriginalArg(2) Class174 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4) {
		super.aClass62_Sub1_Sub2_10.method4676(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Dub(super.anInt9162, 0, 0, 0, arg0, arg4, Static546.method7437(arg1), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)I")
	@Override
	public int method7451() {
		return this.anInt9167;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I")
	@Override
	public int method7450() {
		return this.anInt9171;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIII[FIILclient!kl;B)V")
	public void method7457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float[] arg2, @OriginalArg(7) Class174 arg3) {
		super.aClass62_Sub1_Sub2_10.method4676(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9162, 0, 0, 0, arg0, arg1, Static546.method7437(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZF)F")
	@Override
	public float method7456(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9171;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method7454(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass62_Sub1_Sub2_10.method4676(this);
		OpenGL.glTexParameteri(super.anInt9162, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9162, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7455() {
		return true;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IF)F")
	@Override
	public float method7449(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9167;
	}
}
