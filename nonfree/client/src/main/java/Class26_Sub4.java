import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public final class Class26_Sub4 extends Class26 implements Interface7 {

	@OriginalMember(owner = "client!uaa", name = "y", descriptor = "I")
	private final int anInt8844;

	@OriginalMember(owner = "client!uaa", name = "I", descriptor = "I")
	private final int anInt8851;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!mc;Lclient!kf;II[FII)V")
	public Class26_Sub4(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static407.aClass254_18, arg2 * arg3, false);
		this.anInt8844 = arg2;
		this.anInt8851 = arg3;
		super.aClass90_Sub3_Sub1_10.method7624(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8827, 0, this.method7040(), arg2, arg3, 0, Static474.method6581(super.aClass171_16), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!mc;II[III)V")
	public Class26_Sub4(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static493.aClass171_15, Static407.aClass254_14, arg1 * arg2, false);
		this.anInt8851 = arg2;
		this.anInt8844 = arg1;
		super.aClass90_Sub3_Sub1_10.method7624(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8827, 0, 6408, this.anInt8844, this.anInt8851, 0, 32993, super.aClass90_Sub3_Sub1_10.anInt6027, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!mc;Lclient!kf;II[BII)V")
	public Class26_Sub4(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static407.aClass254_14, arg2 * arg3, false);
		this.anInt8844 = arg2;
		this.anInt8851 = arg3;
		super.aClass90_Sub3_Sub1_10.method7624(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8827, 0, this.method7040(), arg2, arg3, 0, Static474.method6581(super.aClass171_16), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!mc;Lclient!kf;Lclient!ps;II)V")
	public Class26_Sub4(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt8844 = arg3;
		this.anInt8851 = arg4;
		super.aClass90_Sub3_Sub1_10.method7624(this);
		OpenGL.glTexImage2Dub(super.anInt8827, 0, this.method7040(), arg3, arg4, 0, Static474.method6581(super.aClass171_16), Static6.method88(super.aClass254_20), null, 0);
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)I")
	@Override
	public int method7046() {
		return this.anInt8844;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(FI)F")
	@Override
	public float method7052(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method7048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 == 0) {
			arg3 = arg1;
		}
		super.aClass90_Sub3_Sub1_10.method7624(this);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt8827, 0, arg0, arg2, arg1, arg5, 32993, super.aClass90_Sub3_Sub1_10.anInt6027, arg4, 0);
		if (arg3 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "([BIIILclient!kf;ZIII)V")
	@Override
	public void method7050(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class171 arg3, @OriginalArg(8) int arg4) {
		super.aClass90_Sub3_Sub1_10.method7624(this);
		if (arg4 == 0) {
			arg4 = arg1;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8827, 0, 0, 0, arg1, arg2, Static474.method6581(arg3), 5121, arg0, 0);
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)I")
	@Override
	public int method7049() {
		return this.anInt8851;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7047(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(FB)F")
	@Override
	public float method7053(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7051() {
		return false;
	}
}
