import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class14_Sub2 extends Class14 implements Interface14 {

	@OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
	private final int anInt2697;

	@OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
	private final int anInt2695;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!hp;Lclient!lca;IIZ[FII)V")
	public Class14_Sub2(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static215.aClass155_14, arg2 * arg3, arg4);
		this.anInt2697 = arg3;
		this.anInt2695 = arg2;
		super.aClass134_Sub1_Sub1_9.method6766(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt6022, 0, this.method4925(), arg2, arg3, 0, Static28.method321(super.aClass203_12), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method4936(arg2, arg5, arg3, super.anInt6022);
		}
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!hp;IIZ[III)V")
	public Class14_Sub2(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static129.aClass203_5, Static215.aClass155_10, arg2 * arg1, arg3);
		this.anInt2697 = arg2;
		this.anInt2695 = arg1;
		super.aClass134_Sub1_Sub1_9.method6766(this);
		if (arg3 && arg6 == 0) {
			this.method4937(arg4, arg1, arg2, super.anInt6022);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt6022, 0, 6408, this.anInt2695, this.anInt2697, 0, 32993, super.aClass134_Sub1_Sub1_9.anInt3985, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!hp;Lclient!lca;IIZ[BII)V")
	public Class14_Sub2(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static215.aClass155_10, arg3 * arg2, arg4);
		this.anInt2697 = arg3;
		this.anInt2695 = arg2;
		super.aClass134_Sub1_Sub1_9.method6766(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method4931(super.anInt6022, arg3, arg5, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt6022, 0, this.method4925(), arg2, arg3, 0, Static28.method321(super.aClass203_12), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!hp;Lclient!lca;Lclient!ig;II)V")
	public Class14_Sub2(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt2697 = arg4;
		this.anInt2695 = arg3;
		super.aClass134_Sub1_Sub1_9.method6766(this);
		OpenGL.glTexImage2Dub(super.anInt6022, 0, this.method4925(), arg3, arg4, 0, Static28.method321(super.aClass203_12), Static117.method1848(super.aClass155_18), null, 0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method2129() {
		return true;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!lca;IIIBI[FI)V")
	public void method2136(@OriginalArg(1) Class203 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(7) float[] arg3) {
		super.aClass134_Sub1_Sub1_9.method6766(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt6022, 0, 0, 0, arg1, arg2, Static28.method321(arg0), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(FI)F")
	@Override
	public float method2128(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt2695;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZF)F")
	@Override
	public float method2133(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt2697;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)I")
	@Override
	public int method2132() {
		return this.anInt2695;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method2130(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass134_Sub1_Sub1_9.method6766(this);
		OpenGL.glTexParameteri(super.anInt6022, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt6022, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!lca;IIZIIII[B)V")
	@Override
	public void method2131(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4) {
		super.aClass134_Sub1_Sub1_9.method6766(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Dub(super.anInt6022, 0, 0, 0, arg3, arg2, Static28.method321(arg0), 5121, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
	@Override
	public int method2135() {
		return this.anInt2697;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBIII[III)V")
	@Override
	public void method2134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass134_Sub1_Sub1_9.method6766(this);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Di(super.anInt6022, 0, arg1, arg4, arg0, arg5, 32993, super.aClass134_Sub1_Sub1_9.anInt3985, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
