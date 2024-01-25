import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class7_Sub4 extends Class7 implements Interface1 {

	@OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
	private final int anInt10189;

	@OriginalMember(owner = "client!vt", name = "C", descriptor = "I")
	private final int anInt10183;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!nv;IIZ[III)V")
	public Class7_Sub4(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static220.aClass276_11, Static111.aClass79_7, arg2 * arg1, arg3);
		this.anInt10189 = arg2;
		this.anInt10183 = arg1;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		if (arg3 && arg6 == 0) {
			this.method8622(super.anInt10172, arg2, arg4, arg1);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10172, 0, 6408, this.anInt10183, this.anInt10189, 0, 32993, super.aClass33_Sub2_Sub1_12.anInt6609, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!nv;Lclient!pe;IIZ[FII)V")
	public Class7_Sub4(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static111.aClass79_11, arg2 * arg3, arg4);
		this.anInt10183 = arg2;
		this.anInt10189 = arg3;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10172, 0, this.method8616(), arg2, arg3, 0, Static36.method738(super.aClass276_19), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method8614(super.anInt10172, arg2, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!nv;Lclient!pe;IIZ[BII)V")
	public Class7_Sub4(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static111.aClass79_7, arg3 * arg2, arg4);
		this.anInt10183 = arg2;
		this.anInt10189 = arg3;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method8618(arg2, arg3, super.anInt10172, arg5);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10172, 0, this.method8616(), arg2, arg3, 0, Static36.method738(super.aClass276_19), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!nv;Lclient!pe;Lclient!dw;II)V")
	public Class7_Sub4(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt10189 = arg4;
		this.anInt10183 = arg3;
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glTexImage2Dub(super.anInt10172, 0, this.method8616(), arg3, arg4, 0, Static36.method738(super.aClass276_19), Static48.method995(super.aClass79_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII[BILclient!pe;II)V")
	@Override
	public void method8626(@OriginalArg(4) byte[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class276 arg2, @OriginalArg(7) int arg3, @OriginalArg(8) int arg4) {
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Dub(super.anInt10172, 0, 0, 0, arg3, arg4, Static36.method738(arg2), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BF)F")
	@Override
	public float method8631(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt10189;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)I")
	@Override
	public int method8630() {
		return this.anInt10183;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZZB)V")
	@Override
	public void method8629(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glTexParameteri(super.anInt10172, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10172, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII[IBI)V")
	@Override
	public void method8624(@OriginalArg(3) int arg0, @OriginalArg(4) int[] arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt10183 * this.anInt10189];
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glGetTexImagei(super.anInt10172, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg2; local27++) {
			Static685.method6466(local12, this.anInt10183 * (arg2 - local27 - 1), arg1, arg0 * local27, arg0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!pe;IIIBI[FI)V")
	public void method8633(@OriginalArg(1) Class276 arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) float[] arg3) {
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10172, 0, 0, 0, arg2, arg1, Static36.method738(arg0), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII[IIBI)V")
	@Override
	public void method8625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass33_Sub2_Sub1_12.method8159(this);
		OpenGL.glPixelStorei(3314, arg4);
		OpenGL.glTexSubImage2Di(super.anInt10172, 0, arg1, arg5, arg0, arg2, 32993, super.aClass33_Sub2_Sub1_12.anInt6609, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8623() {
		return true;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IF)F")
	@Override
	public float method8627(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt10183;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)I")
	@Override
	public int method8628() {
		return this.anInt10189;
	}
}
