import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class114_Sub4 extends Class114 implements Interface3 {

	@OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
	private final int anInt9187;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
	private final int anInt9176;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!no;IIZ[III)V")
	public Class114_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static203.aClass250_7, Static409.aClass242_13, arg2 * arg1, arg3);
		this.anInt9187 = arg1;
		this.anInt9176 = arg2;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		if (arg3 && arg6 == 0) {
			this.method7835(arg4, arg1, arg2, super.anInt9168);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9168, 0, 6408, this.anInt9187, this.anInt9176, 0, 32993, super.aClass100_Sub1_Sub2_10.anInt7250, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!no;Lclient!pd;IIZ[BII)V")
	public Class114_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static409.aClass242_13, arg2 * arg3, arg4);
		this.anInt9176 = arg3;
		this.anInt9187 = arg2;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method7830(arg2, arg5, arg3, super.anInt9168);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9168, 0, this.method7828(), arg2, arg3, 0, Static124.method2047(super.aClass250_14), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!no;Lclient!pd;IIZ[FII)V")
	public Class114_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static409.aClass242_17, arg2 * arg3, arg4);
		this.anInt9187 = arg2;
		this.anInt9176 = arg3;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9168, 0, this.method7828(), arg2, arg3, 0, Static124.method2047(super.aClass250_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method7829(arg2, super.anInt9168, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!no;Lclient!pd;Lclient!ok;II)V")
	public Class114_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class242 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg4 * arg3, false);
		this.anInt9176 = arg4;
		this.anInt9187 = arg3;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glTexImage2Dub(super.anInt9168, 0, this.method7828(), arg3, arg4, 0, Static124.method2047(super.aClass250_14), Static326.method5412(super.aClass242_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)I")
	@Override
	public int method7841() {
		return this.anInt9187;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BF)F")
	@Override
	public float method7846(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt9187;
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)I")
	@Override
	public int method7840() {
		return this.anInt9176;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII[BLclient!pd;)V")
	@Override
	public void method7844(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) Class250 arg4) {
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg1);
		OpenGL.glTexSubImage2Dub(super.anInt9168, 0, 0, 0, arg0, arg2, Static124.method2047(arg4), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7847() {
		return true;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIII[II)V")
	@Override
	public void method7842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glPixelStorei(3314, arg3);
		OpenGL.glTexSubImage2Di(super.anInt9168, 0, arg1, arg4, arg0, arg2, 32993, super.aClass100_Sub1_Sub2_10.anInt7250, arg5, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIILclient!pd;ZIII[F)V")
	public void method7850(@OriginalArg(2) int arg0, @OriginalArg(3) Class250 arg1, @OriginalArg(7) int arg2, @OriginalArg(8) float[] arg3) {
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9168, 0, 0, 0, arg2, arg0, Static124.method2047(arg1), 5121, arg3, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method7843(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		@Pc(16) int[] local16 = new int[this.anInt9187 * this.anInt9176];
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glGetTexImagei(super.anInt9168, 0, 32993, 5121, local16, 0);
		for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
			Static655.method5830(local16, this.anInt9187 * (arg1 - local31 - 1), arg0, arg2 * local31, arg2);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7839(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glTexParameteri(super.anInt9168, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9168, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FI)F")
	@Override
	public float method7845(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9176;
	}
}
