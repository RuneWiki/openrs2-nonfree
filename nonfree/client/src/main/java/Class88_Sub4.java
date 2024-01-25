import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class88_Sub4 extends Class88 implements Interface3 {

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	private final int anInt8901;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
	private final int anInt8895;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ph;Lclient!uda;II[FII)V")
	public Class88_Sub4(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static431.aClass264_19, arg2 * arg3, false);
		this.anInt8901 = arg3;
		this.anInt8895 = arg2;
		super.aClass122_Sub2_Sub2_10.method5651(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt8877, 0, this.method7309(), arg2, arg3, 0, Static168.method4654(super.aClass292_16), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ph;Lclient!uda;II[BII)V")
	public Class88_Sub4(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static431.aClass264_15, arg2 * arg3, false);
		this.anInt8895 = arg2;
		this.anInt8901 = arg3;
		super.aClass122_Sub2_Sub2_10.method5651(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt8877, 0, this.method7309(), arg2, arg3, 0, Static168.method4654(super.aClass292_16), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ph;Lclient!uda;Lclient!sb;II)V")
	public Class88_Sub4(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) Class264 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt8895 = arg3;
		this.anInt8901 = arg4;
		super.aClass122_Sub2_Sub2_10.method5651(this);
		OpenGL.glTexImage2Dub(super.anInt8877, 0, this.method7309(), arg3, arg4, 0, Static168.method4654(super.aClass292_16), Static258.method4328(super.aClass264_20), null, 0);
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ph;II[III)V")
	public Class88_Sub4(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static542.aClass292_17, Static431.aClass264_15, arg2 * arg1, false);
		this.anInt8895 = arg1;
		this.anInt8901 = arg2;
		super.aClass122_Sub2_Sub2_10.method5651(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt8877, 0, 6408, this.anInt8895, this.anInt8901, 0, 32993, super.aClass122_Sub2_Sub2_10.anInt6812, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
	@Override
	public int method7315() {
		return this.anInt8895;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IF)F")
	@Override
	public float method7317(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIZ)V")
	@Override
	public void method7318(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BF)F")
	@Override
	public float method7320(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BIBLclient!uda;III)V")
	@Override
	public void method7321(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class292 arg3, @OriginalArg(7) int arg4) {
		super.aClass122_Sub2_Sub2_10.method5651(this);
		if (arg0 == 0) {
			arg0 = arg2;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg2) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt8877, 0, 0, 0, arg2, arg4, Static168.method4654(arg3), 5121, arg1, 0);
		if (arg2 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[IIIII)V")
	@Override
	public void method7322(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass122_Sub2_Sub2_10.method5651(this);
		if (arg0 == 0) {
			arg0 = arg4;
		}
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt8877, 0, arg2, arg5, arg4, arg3, 32993, super.aClass122_Sub2_Sub2_10.anInt6812, arg1, 0);
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7316() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	@Override
	public int method7319() {
		return this.anInt8901;
	}
}
