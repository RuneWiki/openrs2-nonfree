import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class7_Sub2 extends Class7 implements Interface1 {

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
	private final int anInt804;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	private final int anInt802;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!nv;Lclient!pe;II[FII)V")
	public Class7_Sub2(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static111.aClass79_11, arg3 * arg2, false);
		this.anInt804 = arg2;
		this.anInt802 = arg3;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10172, 0, this.method8616(), arg2, arg3, 0, Static36.method738(super.aClass276_19), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!nv;II[III)V")
	public Class7_Sub2(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static220.aClass276_11, Static111.aClass79_7, arg1 * arg2, false);
		this.anInt802 = arg2;
		this.anInt804 = arg1;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10172, 0, 6408, this.anInt804, this.anInt802, 0, 32993, super.aClass33_Sub2_Sub1_12.anInt6609, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!nv;Lclient!pe;II[BII)V")
	public Class7_Sub2(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static111.aClass79_7, arg2 * arg3, false);
		this.anInt802 = arg3;
		this.anInt804 = arg2;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10172, 0, this.method8616(), arg2, arg3, 0, Static36.method738(super.aClass276_19), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!nv;Lclient!pe;Lclient!dw;II)V")
	public Class7_Sub2(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt802 = arg4;
		this.anInt804 = arg3;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glTexImage2Dub(super.anInt10172, 0, this.method8616(), arg3, arg4, 0, Static36.method738(super.aClass276_19), Static48.method995(super.aClass79_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)I")
	@Override
	public int method8630() {
		return this.anInt804;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[BILclient!pe;II)V")
	@Override
	public void method8626(@OriginalArg(4) byte[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class276 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		super.aClass33_Sub2_Sub1_12.method8159(this);
		if (arg1 == 0) {
			arg1 = arg3;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10172, 0, 0, 0, arg3, arg4, Static36.method738(arg2), 5121, arg0, 0);
		if (arg1 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8623() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BF)F")
	@Override
	public float method8631(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
	@Override
	public int method8628() {
		return this.anInt802;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[IIBI)V")
	@Override
	public void method8625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass33_Sub2_Sub1_12.method8159(this);
		if (arg4 == 0) {
			arg4 = arg0;
		}
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, arg4);
		}
		OpenGL.glTexSubImage2Di(super.anInt10172, 0, arg1, arg5, arg0, arg2, 32993, super.aClass33_Sub2_Sub1_12.anInt6609, arg3, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII[IBI)V")
	@Override
	public void method8624(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt802 * this.anInt804];
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glGetTexImagei(super.anInt10172, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			Static685.method6466(local12, (arg2 - local27 - 1) * this.anInt804, arg1, local27 * arg0, arg0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method8629(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IF)F")
	@Override
	public float method8627(@OriginalArg(1) float arg0) {
		return arg0;
	}
}
