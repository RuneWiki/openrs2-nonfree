import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class24_Sub3 extends Class24 implements Interface7 {

	@OriginalMember(owner = "client!df", name = "J", descriptor = "I")
	private final int anInt1423;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "I")
	private final int anInt1431;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dga;Lclient!hh;II[BII)V")
	public Class24_Sub3(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static435.aClass274_13, arg2 * arg3, false);
		this.anInt1423 = arg3;
		this.anInt1431 = arg2;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10024, 0, this.method8714(), arg2, arg3, 0, Static305.method5428(super.aClass155_59), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dga;Lclient!hh;Lclient!on;II)V")
	public Class24_Sub3(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt1431 = arg3;
		this.anInt1423 = arg4;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glTexImage2Dub(super.anInt10024, 0, this.method8714(), arg3, arg4, 0, Static305.method5428(super.aClass155_59), Static142.method2789(super.aClass274_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dga;Lclient!hh;II[FII)V")
	public Class24_Sub3(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static435.aClass274_17, arg3 * arg2, false);
		this.anInt1423 = arg3;
		this.anInt1431 = arg2;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10024, 0, this.method8714(), arg2, arg3, 0, Static305.method5428(super.aClass155_59), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!dga;II[III)V")
	public Class24_Sub3(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static432.aClass155_45, Static435.aClass274_13, arg1 * arg2, false);
		this.anInt1431 = arg1;
		this.anInt1423 = arg2;
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10024, 0, 6408, this.anInt1431, this.anInt1423, 0, 32993, super.aClass75_Sub1_Sub1_12.anInt2026, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)I")
	@Override
	public int method8718() {
		return this.anInt1423;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!hh;I[BIIIIII)V")
	@Override
	public void method8716(@OriginalArg(0) Class155 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		super.aClass75_Sub1_Sub1_12.method6814(this);
		if (arg2 == 0) {
			arg2 = arg4;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10024, 0, 0, 0, arg4, arg3, Static305.method5428(arg0), 5121, arg1, 0);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IF)F")
	@Override
	public float method8719(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII[IB)V")
	@Override
	public void method8717(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt1431 * this.anInt1423];
		super.aClass75_Sub1_Sub1_12.method6814(this);
		OpenGL.glGetTexImagei(super.anInt10024, 0, 32993, 5121, local12, 0);
		for (@Pc(35) int local35 = 0; local35 < arg1; local35++) {
			Static695.method5649(local12, (arg1 - local35 - 1) * this.anInt1431, arg2, local35 * arg0, arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8722() {
		return false;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)I")
	@Override
	public int method8724() {
		return this.anInt1431;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method8723(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZF)F")
	@Override
	public float method8720(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBI[IIII)V")
	@Override
	public void method8721(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 == 0) {
			arg1 = arg4;
		}
		super.aClass75_Sub1_Sub1_12.method6814(this);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt10024, 0, arg5, arg0, arg4, arg3, 32993, super.aClass75_Sub1_Sub1_12.anInt2026, arg2, 0);
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}
}
