import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public final class Class144_Sub3 extends Class144 implements Interface8 {

	@OriginalMember(owner = "client!ou", name = "K", descriptor = "I")
	private final int anInt6792;

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
	private final int anInt6786;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!qba;IIZ[III)V")
	public Class144_Sub3(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static51.aClass150_1, Static268.aClass171_10, arg1 * arg2, arg3);
		this.anInt6792 = arg1;
		this.anInt6786 = arg2;
		super.aClass39_Sub2_Sub2_10.method6179(this);
		if (arg3 && arg6 == 0) {
			this.method7141(arg2, arg1, arg4, super.anInt8539);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt8539, 0, 6408, this.anInt6792, this.anInt6786, 0, 32993, super.aClass39_Sub2_Sub2_10.anInt7396, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!qba;Lclient!jt;IIZ[BII)V")
	public Class144_Sub3(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static268.aClass171_10, arg3 * arg2, arg4);
		this.anInt6792 = arg2;
		this.anInt6786 = arg3;
		super.aClass39_Sub2_Sub2_10.method6179(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7133(arg5, super.anInt8539, arg2, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt8539, 0, this.method7134(), arg2, arg3, 0, Static126.method6453(super.aClass150_15), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!qba;Lclient!jt;IIZ[FII)V")
	public Class144_Sub3(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static268.aClass171_14, arg2 * arg3, arg4);
		this.anInt6792 = arg2;
		this.anInt6786 = arg3;
		super.aClass39_Sub2_Sub2_10.method6179(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt8539, 0, this.method7134(), arg2, arg3, 0, Static126.method6453(super.aClass150_15), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7142(arg3, arg2, arg5, super.anInt8539);
		}
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!qba;Lclient!jt;Lclient!lc;II)V")
	public Class144_Sub3(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt6792 = arg3;
		this.anInt6786 = arg4;
		super.aClass39_Sub2_Sub2_10.method6179(this);
		OpenGL.glTexImage2Dub(super.anInt8539, 0, this.method7134(), arg3, arg4, 0, Static126.method6453(super.aClass150_15), Static375.method5912(super.aClass171_20), null, 0);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5774() {
		return true;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILclient!jt;I[BIIIII)V")
	@Override
	public void method5776(@OriginalArg(1) Class150 arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		super.aClass39_Sub2_Sub2_10.method6179(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Dub(super.anInt8539, 0, 0, 0, arg4, arg2, Static126.method6453(arg0), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(IF)F")
	@Override
	public float method5781(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6792;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)I")
	@Override
	public int method5775() {
		return this.anInt6792;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method5780(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass39_Sub2_Sub2_10.method6179(this);
		OpenGL.glTexParameteri(super.anInt8539, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt8539, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IF)F")
	@Override
	public float method5777(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt6786;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method5779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass39_Sub2_Sub2_10.method6179(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt8539, 0, arg0, arg4, arg5, arg1, 32993, super.aClass39_Sub2_Sub2_10.anInt7396, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I")
	@Override
	public int method5778() {
		return this.anInt6786;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBILclient!jt;III[FI)V")
	public void method5784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class150 arg2, @OriginalArg(7) float[] arg3) {
		super.aClass39_Sub2_Sub2_10.method6179(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt8539, 0, 0, 0, arg1, arg0, Static126.method6453(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
