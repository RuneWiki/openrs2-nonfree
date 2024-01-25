import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class197_Sub1 extends Class197 implements Interface27 {

	@OriginalMember(owner = "client!qfa", name = "A", descriptor = "I")
	private final int anInt7513;

	@OriginalMember(owner = "client!qfa", name = "K", descriptor = "I")
	private final int anInt7522;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!tk;Lclient!et;II[FII)V")
	public Class197_Sub1(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static638.aClass381_19, arg3 * arg2, false);
		this.anInt7513 = arg3;
		this.anInt7522 = arg2;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt10370, 0, this.method8826(), arg2, arg3, 0, Static626.method8676(super.aClass104_19), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!tk;Lclient!et;II[BII)V")
	public Class197_Sub1(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static638.aClass381_15, arg3 * arg2, false);
		this.anInt7522 = arg2;
		this.anInt7513 = arg3;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt10370, 0, this.method8826(), arg2, arg3, 0, Static626.method8676(super.aClass104_19), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!tk;Lclient!et;Lclient!wha;II)V")
	public Class197_Sub1(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class381 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg4 * arg3, false);
		this.anInt7513 = arg4;
		this.anInt7522 = arg3;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glTexImage2Dub(super.anInt10370, 0, this.method8826(), arg3, arg4, 0, Static626.method8676(super.aClass104_19), Static17.method512(super.aClass381_20), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!tk;II[III)V")
	public Class197_Sub1(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static78.aClass104_3, Static638.aClass381_15, arg2 * arg1, false);
		this.anInt7522 = arg1;
		this.anInt7513 = arg2;
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt10370, 0, 6408, this.anInt7522, this.anInt7513, 0, 32993, super.aClass13_Sub3_Sub1_12.anInt9186, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7135() {
		return false;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!et;III[BIII)V")
	@Override
	public void method7129(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		super.aClass13_Sub3_Sub1_12.method8234(this);
		if (arg2 == 0) {
			arg2 = arg4;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10370, 0, 0, 0, arg4, arg0, Static626.method8676(arg1), 5121, arg3, 0);
		if (arg2 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)I")
	@Override
	public int method7130() {
		return this.anInt7513;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II[IIIII)V")
	@Override
	public void method7132(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt7513 * this.anInt7522];
		super.aClass13_Sub3_Sub1_12.method8234(this);
		OpenGL.glGetTexImagei(super.anInt10370, 0, 32993, 5121, local12, 0);
		for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
			Static650.method2270(local12, (arg2 - local31 - 1) * this.anInt7522, arg1, arg0 * local31, arg0);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FI)F")
	@Override
	public float method7133(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIII[IIII)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		super.aClass13_Sub3_Sub1_12.method8234(this);
		if (arg1 == 0) {
			arg1 = arg4;
		}
		if (arg4 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt10370, 0, arg0, arg2, arg4, arg5, 32993, super.aClass13_Sub3_Sub1_12.anInt9186, arg3, 0);
		if (arg1 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BZZ)V")
	@Override
	public void method7134(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IF)F")
	@Override
	public float method7127(@OriginalArg(1) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)I")
	@Override
	public int method7128() {
		return this.anInt7522;
	}
}
