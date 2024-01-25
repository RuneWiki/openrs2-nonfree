import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class8_Sub1 extends Class8 implements Interface9 {

	@OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
	private final int anInt1845;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
	private final int anInt1838;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!gf;Lclient!kp;Lclient!vt;II)V")
	public Class8_Sub1(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt1845 = arg4;
		this.anInt1838 = arg3;
		super.aClass5_Sub3_Sub1_9.method6416(this);
		OpenGL.glTexImage2Dub(super.anInt7814, 0, this.method6479(), arg3, arg4, 0, Static88.method1793(super.aClass167_12), Static138.method2343(super.aClass310_12), null, 0);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!gf;IIZ[III)V")
	public Class8_Sub1(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static468.aClass167_14, Static524.aClass310_16, arg2 * arg1, arg3);
		this.anInt1838 = arg1;
		this.anInt1845 = arg2;
		super.aClass5_Sub3_Sub1_9.method6416(this);
		if (arg3 && arg6 == 0) {
			this.method6477(arg2, arg1, super.anInt7814, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt7814, 0, 6408, this.anInt1838, this.anInt1845, 0, 32993, super.aClass5_Sub3_Sub1_9.anInt3688, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!gf;Lclient!kp;IIZ[BII)V")
	public Class8_Sub1(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static524.aClass310_16, arg2 * arg3, arg4);
		this.anInt1838 = arg2;
		this.anInt1845 = arg3;
		super.aClass5_Sub3_Sub1_9.method6416(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method6475(arg5, super.anInt7814, arg2, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt7814, 0, this.method6479(), arg2, arg3, 0, Static88.method1793(super.aClass167_12), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!gf;Lclient!kp;IIZ[FII)V")
	public Class8_Sub1(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static524.aClass310_20, arg3 * arg2, arg4);
		this.anInt1838 = arg2;
		this.anInt1845 = arg3;
		super.aClass5_Sub3_Sub1_9.method6416(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt7814, 0, this.method6479(), arg2, arg3, 0, Static88.method1793(super.aClass167_12), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method6474(super.anInt7814, arg5, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
	@Override
	public int method3272() {
		return this.anInt1845;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method3270(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass5_Sub3_Sub1_9.method6416(this);
		OpenGL.glTexParameteri(super.anInt7814, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt7814, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IF)F")
	@Override
	public float method3277(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1845;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIILclient!kp;[BIBII)V")
	@Override
	public void method3274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(8) int arg4) {
		super.aClass5_Sub3_Sub1_9.method6416(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt7814, 0, 0, 0, arg1, arg4, Static88.method1793(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII[II)V")
	@Override
	public void method3271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		super.aClass5_Sub3_Sub1_9.method6416(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt7814, 0, arg0, arg3, arg2, arg5, 32993, super.aClass5_Sub3_Sub1_9.anInt3688, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
	@Override
	public int method3273() {
		return this.anInt1838;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZF)F")
	@Override
	public float method3275(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1838;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII[FBLclient!kp;II)V")
	public void method1743(@OriginalArg(1) int arg0, @OriginalArg(4) float[] arg1, @OriginalArg(6) Class167 arg2, @OriginalArg(7) int arg3) {
		super.aClass5_Sub3_Sub1_9.method6416(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt7814, 0, 0, 0, arg0, arg3, Static88.method1793(arg2), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3276() {
		return true;
	}
}
