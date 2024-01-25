import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vja")
public final class Class24_Sub4 extends Class24 implements Interface7 {

	@OriginalMember(owner = "client!vja", name = "P", descriptor = "[Lclient!hn;")
	private static final Class162[] aClass162Array1 = new Class162[32];

	@OriginalMember(owner = "client!vja", name = "db", descriptor = "I")
	private final int anInt10029;

	@OriginalMember(owner = "client!vja", name = "R", descriptor = "I")
	private final int anInt10033;

	static {
		@Pc(186) Class162[] local186 = Static380.method5893();
		for (@Pc(188) int local188 = 0; local188 < local186.length; local188++) {
			aClass162Array1[local186[local188].anInt4493] = local186[local188];
		}
	}

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Lclient!dga;Lclient!hh;IIZ[FII)V")
	public Class24_Sub4(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static435.aClass274_17, arg3 * arg2, arg4);
		this.anInt10029 = arg3;
		this.anInt10033 = arg2;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method8711(arg5, super.anInt10024, arg2, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10024, 0, this.method8714(), arg2, arg3, 0, Static305.method5428(super.aClass155_59), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Lclient!dga;IIZ[III)V")
	public Class24_Sub4(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static432.aClass155_45, Static435.aClass274_13, arg1 * arg2, arg3);
		this.anInt10033 = arg1;
		this.anInt10029 = arg2;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method8710(arg4, super.anInt10024, arg1, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10024, 0, 6408, this.anInt10033, this.anInt10029, 0, 32993, super.aClass75_Sub1_Sub1_12.anInt2026, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Lclient!dga;Lclient!hh;IIZ[BII)V")
	public Class24_Sub4(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static435.aClass274_13, arg3 * arg2, arg4);
		this.anInt10029 = arg3;
		this.anInt10033 = arg2;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method8706(super.anInt10024, arg5, arg3, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10024, 0, this.method8714(), arg2, arg3, 0, Static305.method5428(super.aClass155_59), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Lclient!dga;Lclient!hh;Lclient!on;II)V")
	public Class24_Sub4(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt10033 = arg3;
		this.anInt10029 = arg4;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glTexImage2Dub(super.anInt10024, 0, this.method8714(), arg3, arg4, 0, Static305.method5428(super.aClass155_59), Static142.method2789(super.aClass274_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!vja", name = "c", descriptor = "(I)I")
	@Override
	public int method8718() {
		return this.anInt10029;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8722() {
		return true;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIBI[IIII)V")
	@Override
	public void method8721(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Di(super.anInt10024, 0, arg5, arg0, arg4, arg3, 32993, super.aClass75_Sub1_Sub1_12.anInt2026, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIIII[IB)V")
	@Override
	public void method8717(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int[] arg2) {
		@Pc(19) int[] local19 = new int[this.anInt10033 * this.anInt10029];
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glGetTexImagei(super.anInt10024, 0, 32993, 5121, local19, 0);
		for (@Pc(34) int local34 = 0; local34 < arg1; local34++) {
			Static695.method5649(local19, (arg1 - local34 - 1) * this.anInt10033, arg2, arg0 * local34, arg0);
		}
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(ZF)F")
	@Override
	public float method8720(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt10029;
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)I")
	@Override
	public int method8724() {
		return this.anInt10033;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IF)F")
	@Override
	public float method8719(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt10033;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!hh;I[BIIIIII)V")
	@Override
	public void method8716(@OriginalArg(0) Class155 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Dub(super.anInt10024, 0, 0, 0, arg4, arg3, Static305.method5428(arg0), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glTexParameteri(super.anInt10024, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10024, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII[FLclient!hh;III)V")
	public void method8728(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float[] arg2, @OriginalArg(5) Class155 arg3) {
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10024, 0, 0, 0, arg0, arg1, Static305.method5428(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}
}
