import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class5_Sub4 extends Class5 implements Interface4 {

	@OriginalMember(owner = "client!u", name = "B", descriptor = "I")
	private final int anInt9580;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "I")
	private final int anInt9577;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ad;IIZ[III)V")
	public Class5_Sub4(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static151.aClass161_6, Static424.aClass273_12, arg2 * arg1, arg3);
		this.anInt9580 = arg2;
		this.anInt9577 = arg1;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		if (arg3 && arg6 == 0) {
			this.method7360(super.anInt9565, arg2, arg4, arg1);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9565, 0, 6408, this.anInt9577, this.anInt9580, 0, 32993, super.aClass7_Sub1_Sub1_11.anInt721, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ad;Lclient!jb;Lclient!qda;II)V")
	public Class5_Sub4(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class273 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt9580 = arg4;
		this.anInt9577 = arg3;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glTexImage2Dub(super.anInt9565, 0, this.method7363(), arg3, arg4, 0, Static546.method7654(super.aClass161_18), Static266.method4173(super.aClass273_17), null, 0);
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ad;Lclient!jb;IIZ[FII)V")
	public Class5_Sub4(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static424.aClass273_16, arg2 * arg3, arg4);
		this.anInt9580 = arg3;
		this.anInt9577 = arg2;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9565, 0, this.method7363(), arg2, arg3, 0, Static546.method7654(super.aClass161_18), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7365(arg2, super.anInt9565, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ad;Lclient!jb;IIZ[BII)V")
	public Class5_Sub4(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static424.aClass273_12, arg3 * arg2, arg4);
		this.anInt9580 = arg3;
		this.anInt9577 = arg2;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7362(arg3, arg2, arg5, super.anInt9565);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9565, 0, this.method7363(), arg2, arg3, 0, Static546.method7654(super.aClass161_18), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
	@Override
	public int method7372() {
		return this.anInt9577;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILclient!jb;II[FI)V")
	public void method7379(@OriginalArg(3) int arg0, @OriginalArg(4) Class161 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) float[] arg3) {
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9565, 0, 0, 0, arg0, arg2, Static546.method7654(arg1), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7375(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glTexParameteri(super.anInt9565, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9565, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method7373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt9565, 0, arg3, arg1, arg2, arg5, 32993, super.aClass7_Sub1_Sub1_11.anInt721, arg4, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IF)F")
	@Override
	public float method7374(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9577;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I")
	@Override
	public int method7376() {
		return this.anInt9580;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7377(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9580;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7371() {
		return true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BIIIIIIILclient!jb;)V")
	@Override
	public void method7378(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(8) Class161 arg4) {
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Dub(super.anInt9565, 0, 0, 0, arg3, arg2, Static546.method7654(arg4), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
