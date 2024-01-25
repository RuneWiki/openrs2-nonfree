import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class73_Sub4 extends Class73 implements Interface17 {

	@OriginalMember(owner = "client!pu", name = "B", descriptor = "I")
	private final int anInt7110;

	@OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
	private final int anInt7112;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!mr;Lclient!sq;II[FII)V")
	public Class73_Sub4(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static471.aClass298_19, arg2 * arg3, false);
		this.anInt7110 = arg3;
		this.anInt7112 = arg2;
		super.aClass45_Sub2_Sub2_10.method4926(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt7096, 0, this.method5957(), arg2, arg3, 0, Static537.method7176(super.aClass314_18), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!mr;Lclient!sq;Lclient!rt;II)V")
	public Class73_Sub4(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) Class298 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt7110 = arg4;
		this.anInt7112 = arg3;
		super.aClass45_Sub2_Sub2_10.method4926(this);
		OpenGL.glTexImage2Dub(super.anInt7096, 0, this.method5957(), arg3, arg4, 0, Static537.method7176(super.aClass314_18), Static36.method583(super.aClass298_10), null, 0);
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!mr;II[III)V")
	public Class73_Sub4(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static469.aClass314_11, Static471.aClass298_15, arg2 * arg1, false);
		this.anInt7110 = arg2;
		this.anInt7112 = arg1;
		super.aClass45_Sub2_Sub2_10.method4926(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt7096, 0, 6408, this.anInt7112, this.anInt7110, 0, 32993, super.aClass45_Sub2_Sub2_10.anInt5961, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!mr;Lclient!sq;II[BII)V")
	public Class73_Sub4(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static471.aClass298_15, arg2 * arg3, false);
		this.anInt7110 = arg3;
		this.anInt7112 = arg2;
		super.aClass45_Sub2_Sub2_10.method4926(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt7096, 0, this.method5957(), arg2, arg3, 0, Static537.method7176(super.aClass314_18), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(FZ)F")
	@Override
	public float method6972(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)I")
	@Override
	public int method6968() {
		return this.anInt7110;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[BIIIILclient!sq;I)V")
	@Override
	public void method6971(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class314 arg4) {
		super.aClass45_Sub2_Sub2_10.method4926(this);
		if (arg0 == 0) {
			arg0 = arg3;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt7096, 0, 0, 0, arg3, arg2, Static537.method7176(arg4), 5121, arg1, 0);
		if (arg3 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(FI)F")
	@Override
	public float method6970(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIII[IBII)V")
	@Override
	public void method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 == 0) {
			arg0 = arg1;
		}
		super.aClass45_Sub2_Sub2_10.method4926(this);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt7096, 0, arg5, arg2, arg1, arg4, 32993, super.aClass45_Sub2_Sub2_10.anInt5961, arg3, 0);
		if (arg0 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6969() {
		return false;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)I")
	@Override
	public int method6966() {
		return this.anInt7112;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method6973(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}
}
