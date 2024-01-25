import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class7_Sub3 extends Class7 implements Interface14 {

	@OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
	private final int anInt8966;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
	private final int anInt8962;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!ia;Lclient!pw;IIZ[FII)V")
	public Class7_Sub3(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static302.aClass200_15, arg3 * arg2, arg4);
		this.anInt8966 = arg3;
		this.anInt8962 = arg2;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10141, 0, this.method8227(), arg2, arg3, 0, Static282.method4862(super.aClass261_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8233(super.anInt10141, arg3, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!ia;IIZ[III)V")
	public Class7_Sub3(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static492.aClass261_14, Static302.aClass200_11, arg2 * arg1, arg3);
		this.anInt8966 = arg2;
		this.anInt8962 = arg1;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		if (arg3 && arg6 == 0) {
			this.method8225(super.anInt10141, arg1, arg4, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10141, 0, 6408, this.anInt8962, this.anInt8966, 0, 32993, super.aClass15_Sub2_Sub1_10.anInt4275, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!ia;Lclient!pw;IIZ[BII)V")
	public Class7_Sub3(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static302.aClass200_11, arg3 * arg2, arg4);
		this.anInt8962 = arg2;
		this.anInt8966 = arg3;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8229(arg2, arg3, super.anInt10141, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10141, 0, this.method8227(), arg2, arg3, 0, Static282.method4862(super.aClass261_15), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!ia;Lclient!pw;Lclient!lj;II)V")
	public Class7_Sub3(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt8962 = arg3;
		this.anInt8966 = arg4;
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glTexImage2Dub(super.anInt10141, 0, this.method8227(), arg3, arg4, 0, Static282.method4862(super.aClass261_15), Static240.method4171(super.aClass200_20), null, 0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
	@Override
	public int method8235() {
		return this.anInt8962;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([IIBIIIII)V")
	@Override
	public void method8237(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt10141, 0, arg4, arg1, arg2, arg3, 32993, super.aClass15_Sub2_Sub1_10.anInt4275, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method8238(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glTexParameteri(super.anInt10141, 10242, arg1 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10141, 10243, arg0 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8240() {
		return true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIILclient!pw;[FII)V")
	public void method7344(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class261 arg2, @OriginalArg(6) float[] arg3) {
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10141, 0, 0, 0, arg1, arg0, Static282.method4862(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IF)F")
	@Override
	public float method8239(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt8962;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!pw;I[BIIIII)V")
	@Override
	public void method8241(@OriginalArg(0) int arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(7) int arg4) {
		super.aClass15_Sub2_Sub1_10.method5414(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg4);
		OpenGL.glTexSubImage2Dub(super.anInt10141, 0, 0, 0, arg2, arg0, Static282.method4862(arg1), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I")
	@Override
	public int method8236() {
		return this.anInt8966;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(FB)F")
	@Override
	public float method8242(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt8966;
	}
}
