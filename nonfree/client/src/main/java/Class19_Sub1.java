import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class19_Sub1 extends Class19 implements Interface10 {

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	private final int anInt6085;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
	private final int anInt6079;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!jq;IIZ[III)V")
	public Class19_Sub1(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static581.aClass93_14, Static461.aClass292_14, arg2 * arg1, arg3);
		this.anInt6085 = arg1;
		this.anInt6079 = arg2;
		super.aClass43_Sub1_Sub2_12.method4298(this);
		if (arg3 && arg6 == 0) {
			this.method7427(arg1, super.anInt8940, arg2, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8940, 0, 6408, this.anInt6085, this.anInt6079, 0, 32993, super.aClass43_Sub1_Sub2_12.anInt4926, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!jq;Lclient!fda;IIZ[FII)V")
	public Class19_Sub1(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static461.aClass292_18, arg3 * arg2, arg4);
		this.anInt6079 = arg3;
		this.anInt6085 = arg2;
		super.aClass43_Sub1_Sub2_12.method4298(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8940, 0, this.method7428(), arg2, arg3, 0, Static428.method1615(super.aClass93_12), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7433(arg5, arg2, super.anInt8940, arg3);
		}
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!jq;Lclient!fda;IIZ[BII)V")
	public Class19_Sub1(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static461.aClass292_14, arg3 * arg2, arg4);
		this.anInt6085 = arg2;
		this.anInt6079 = arg3;
		super.aClass43_Sub1_Sub2_12.method4298(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7430(arg2, arg3, super.anInt8940, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8940, 0, this.method7428(), arg2, arg3, 0, Static428.method1615(super.aClass93_12), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!jq;Lclient!fda;Lclient!ro;II)V")
	public Class19_Sub1(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class292 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt6085 = arg3;
		this.anInt6079 = arg4;
		super.aClass43_Sub1_Sub2_12.method4298(this);
		OpenGL.glTexImage2Dub(super.anInt8940, 0, this.method7428(), arg3, arg4, 0, Static428.method1615(super.aClass93_12), Static425.method6052(super.aClass292_20), null, 0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI[IIIII)V")
	@Override
	public void method6169(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass43_Sub1_Sub2_12.method4298(this);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Di(super.anInt8940, 0, arg0, arg4, arg3, arg5, 32993, super.aClass43_Sub1_Sub2_12.anInt4926, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6171(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass43_Sub1_Sub2_12.method4298(this);
		OpenGL.glTexParameteri(super.anInt8940, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8940, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
	@Override
	public int method6174() {
		return this.anInt6085;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(FI)F")
	@Override
	public float method6175(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6085;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIII[FLclient!fda;I)V")
	public void method5273(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) float[] arg2, @OriginalArg(7) Class93 arg3) {
		super.aClass43_Sub1_Sub2_12.method4298(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8940, 0, 0, 0, arg1, arg0, Static428.method1615(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!fda;IIIII[BZI)V")
	@Override
	public void method6173(@OriginalArg(0) Class93 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4) {
		super.aClass43_Sub1_Sub2_12.method4298(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Dub(super.anInt8940, 0, 0, 0, arg4, arg1, Static428.method1615(arg0), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(FI)F")
	@Override
	public float method6170(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt6079;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
	@Override
	public int method6176() {
		return this.anInt6079;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6172() {
		return true;
	}
}
