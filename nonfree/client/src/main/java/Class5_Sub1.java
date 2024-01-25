import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class5_Sub1 extends Class5 implements Interface4 {

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	private final int anInt147;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	private final int anInt146;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ad;Lclient!jb;II[BII)V")
	public Class5_Sub1(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static424.aClass273_12, arg2 * arg3, false);
		this.anInt147 = arg2;
		this.anInt146 = arg3;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9565, 0, this.method7363(), arg2, arg3, 0, Static546.method7654(super.aClass161_18), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ad;Lclient!jb;II[FII)V")
	public Class5_Sub1(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static424.aClass273_16, arg3 * arg2, false);
		this.anInt147 = arg2;
		this.anInt146 = arg3;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9565, 0, this.method7363(), arg2, arg3, 0, Static546.method7654(super.aClass161_18), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ad;Lclient!jb;Lclient!qda;II)V")
	public Class5_Sub1(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class273 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt147 = arg3;
		this.anInt146 = arg4;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glTexImage2Dub(super.anInt9565, 0, this.method7363(), arg3, arg4, 0, Static546.method7654(super.aClass161_18), Static266.method4173(super.aClass273_17), null, 0);
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ad;II[III)V")
	public Class5_Sub1(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static151.aClass161_6, Static424.aClass273_12, arg1 * arg2, false);
		this.anInt147 = arg1;
		this.anInt146 = arg2;
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9565, 0, 6408, this.anInt147, this.anInt146, 0, 32993, super.aClass7_Sub1_Sub1_11.anInt721, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIIIIIIILclient!jb;)V")
	@Override
	public void method7378(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(8) Class161 arg4) {
		if (arg1 == 0) {
			arg1 = arg3;
		}
		super.aClass7_Sub1_Sub1_11.method5694(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9565, 0, 0, 0, arg3, arg2, Static546.method7654(arg4), 5121, arg0, 0);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII[III)V")
	@Override
	public void method7373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (arg0 == 0) {
			arg0 = arg2;
		}
		super.aClass7_Sub1_Sub1_11.method5694(this);
		if (arg2 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt9565, 0, arg3, arg1, arg2, arg5, 32993, super.aClass7_Sub1_Sub1_11.anInt721, arg4, 0);
		if (arg0 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7371() {
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I")
	@Override
	public int method7372() {
		return this.anInt147;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method7375(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IF)F")
	@Override
	public float method7374(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(FZ)F")
	@Override
	public float method7377(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I")
	@Override
	public int method7376() {
		return this.anInt146;
	}
}
