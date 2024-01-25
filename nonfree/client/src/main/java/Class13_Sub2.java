import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class13_Sub2 extends Class13 implements Interface16 {

	@OriginalMember(owner = "client!bha", name = "D", descriptor = "I")
	private final int anInt1292;

	@OriginalMember(owner = "client!bha", name = "N", descriptor = "I")
	private final int anInt1293;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!vaa;Lclient!sca;IIZ[FII)V")
	public Class13_Sub2(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static259.aClass167_11, arg3 * arg2, arg4);
		this.anInt1292 = arg3;
		this.anInt1293 = arg2;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method4746(arg2, arg5, super.anInt5293, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt5293, 0, this.method4743(), arg2, arg3, 0, Static82.method1790(super.aClass335_8), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!vaa;Lclient!sca;IIZ[BII)V")
	public Class13_Sub2(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static259.aClass167_7, arg2 * arg3, arg4);
		this.anInt1292 = arg3;
		this.anInt1293 = arg2;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method4742(arg2, arg5, arg3, super.anInt5293);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt5293, 0, this.method4743(), arg2, arg3, 0, Static82.method1790(super.aClass335_8), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!vaa;Lclient!sca;Lclient!hu;II)V")
	public Class13_Sub2(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt1293 = arg3;
		this.anInt1292 = arg4;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glTexImage2Dub(super.anInt5293, 0, this.method4743(), arg3, arg4, 0, Static82.method1790(super.aClass335_8), Static619.method7938(super.aClass167_14), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!vaa;IIZ[III)V")
	public Class13_Sub2(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static646.aClass335_14, Static259.aClass167_7, arg2 * arg1, arg3);
		this.anInt1292 = arg2;
		this.anInt1293 = arg1;
		super.aClass22_Sub2_Sub2_8.method8976(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method4744(arg1, arg2, super.anInt5293, arg4);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt5293, 0, 6408, this.anInt1293, this.anInt1292, 0, 32993, super.aClass22_Sub2_Sub2_8.anInt10582, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)I")
	@Override
	public int method8246() {
		return this.anInt1293;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8244() {
		return true;
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(Z)I")
	@Override
	public int method8245() {
		return this.anInt1292;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method8249(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt1293 * this.anInt1292];
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glGetTexImagei(super.anInt5293, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg1; local27++) {
			Static732.method6321(local12, (arg1 - local27 - 1) * this.anInt1293, arg0, arg2 * local27, arg2);
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIIIILclient!sca;I[BI)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class335 arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) int arg4) {
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt5293, 0, 0, 0, arg4, arg1, Static82.method1790(arg2), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(FI)F")
	@Override
	public float method8247(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1293;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IF)F")
	@Override
	public float method8250(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt1292;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZIIII[III)V")
	@Override
	public void method8242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt5293, 0, arg1, arg4, arg2, arg0, 32993, super.aClass22_Sub2_Sub2_8.anInt10582, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIILclient!sca;[FIIII)V")
	public void method1226(@OriginalArg(0) int arg0, @OriginalArg(3) Class335 arg1, @OriginalArg(4) float[] arg2, @OriginalArg(6) int arg3) {
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt5293, 0, 0, 0, arg0, arg3, Static82.method1790(arg1), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IZZ)V")
	@Override
	public void method8248(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass22_Sub2_Sub2_8.method8976(this);
		OpenGL.glTexParameteri(super.anInt5293, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt5293, 10243, arg1 ? 10497 : 33071);
	}
}
