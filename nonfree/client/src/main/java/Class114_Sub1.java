import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class114_Sub1 extends Class114 implements Interface3 {

	@OriginalMember(owner = "client!gfa", name = "I", descriptor = "I")
	private final int anInt3716;

	@OriginalMember(owner = "client!gfa", name = "J", descriptor = "I")
	private final int anInt3717;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!no;Lclient!pd;II[FII)V")
	public Class114_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static409.aClass242_17, arg2 * arg3, false);
		this.anInt3716 = arg3;
		this.anInt3717 = arg2;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9168, 0, this.method7828(), arg2, arg3, 0, Static124.method2047(super.aClass250_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!no;II[III)V")
	public Class114_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static203.aClass250_7, Static409.aClass242_13, arg2 * arg1, false);
		this.anInt3717 = arg1;
		this.anInt3716 = arg2;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9168, 0, 6408, this.anInt3717, this.anInt3716, 0, 32993, super.aClass100_Sub1_Sub2_10.anInt7250, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!no;Lclient!pd;II[BII)V")
	public Class114_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static409.aClass242_13, arg2 * arg3, false);
		this.anInt3716 = arg3;
		this.anInt3717 = arg2;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9168, 0, this.method7828(), arg2, arg3, 0, Static124.method2047(super.aClass250_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!no;Lclient!pd;Lclient!ok;II)V")
	public Class114_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class242 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt3716 = arg4;
		this.anInt3717 = arg3;
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glTexImage2Dub(super.anInt9168, 0, this.method7828(), arg3, arg4, 0, Static124.method2047(super.aClass250_14), Static326.method5412(super.aClass242_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIII[II)V")
	@Override
	public void method7842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		if (arg3 == 0) {
			arg3 = arg0;
		}
		super.aClass100_Sub1_Sub2_10.method6033(this);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, arg3);
		}
		OpenGL.glTexSubImage2Di(super.anInt9168, 0, arg1, arg4, arg0, arg2, 32993, super.aClass100_Sub1_Sub2_10.anInt7250, arg5, 0);
		if (arg0 != arg3) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIIIII[BLclient!pd;)V")
	@Override
	public void method7844(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) Class250 arg4) {
		super.aClass100_Sub1_Sub2_10.method6033(this);
		if (arg1 == 0) {
			arg1 = arg0;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg1 != arg0) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9168, 0, 0, 0, arg0, arg2, Static124.method2047(arg4), 5121, arg3, 0);
		if (arg0 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(FI)F")
	@Override
	public float method7845(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BF)F")
	@Override
	public float method7846(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)I")
	@Override
	public int method7840() {
		return this.anInt3716;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZBZ)V")
	@Override
	public void method7839(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[IIIIII)V")
	@Override
	public void method7843(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt3717 * this.anInt3716];
		super.aClass100_Sub1_Sub2_10.method6033(this);
		OpenGL.glGetTexImagei(super.anInt9168, 0, 32993, 5121, local12, 0);
		for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
			Static655.method5830(local12, (arg1 - local31 - 1) * this.anInt3717, arg0, local31 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)I")
	@Override
	public int method7841() {
		return this.anInt3717;
	}
}
