import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!ha;")
	private final Class98 aClass98_2;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!hu;")
	private final Class110 aClass110_2;

	static {
		new Class267("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!rl;Lclient!ha;)V")
	public Class12_Sub3(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class98 arg1) {
		super(arg0);
		this.aClass98_2 = arg1;
		this.aClass110_2 = new Class110(arg0, 2);
		this.aClass110_2.method2674(0);
		super.aClass66_Sub2_41.method5075(1);
		if (this.aClass98_2.aBoolean187) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass66_Sub2_41.method5075(0);
		this.aClass110_2.method2676();
		this.aClass110_2.method2674(1);
		super.aClass66_Sub2_41.method5075(1);
		if (this.aClass98_2.aBoolean187) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass66_Sub2_41.method5075(0);
		this.aClass110_2.method2676();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	@Override
	public void method6096() {
		this.aClass110_2.method2677('\u0001');
		super.aClass66_Sub2_41.method5075(1);
		super.aClass66_Sub2_41.method5109(null);
		super.aClass66_Sub2_41.method5075(0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLclient!tu;)V")
	@Override
	public void method6090(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		super.aClass66_Sub2_41.method5109(arg1);
		super.aClass66_Sub2_41.method5140(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6097(@OriginalArg(0) boolean arg0) {
		this.aClass110_2.method2677('\u0000');
		if (this.aClass98_2.aBoolean187) {
			super.aClass66_Sub2_41.method5075(1);
			super.aClass66_Sub2_41.method5109(this.aClass98_2.aClass19_Sub1_1);
			super.aClass66_Sub2_41.method5075(0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6091() {
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6092(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	@Override
	public void method6094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(32) float local32 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(40) float local40 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass66_Sub2_41.method5075(1);
		@Pc(53) boolean local53 = (arg1 & 0x80) != 0;
		if (local53) {
			Static9.aFloatArray1[0] = local40;
			Static9.aFloatArray1[1] = 0.0F;
			Static9.aFloatArray1[2] = 0.0F;
			Static9.aFloatArray1[3] = 0.0F;
		} else {
			Static9.aFloatArray1[2] = local40;
			Static9.aFloatArray1[3] = 0.0F;
			Static9.aFloatArray1[1] = 0.0F;
			Static9.aFloatArray1[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static9.aFloatArray1, 0);
		Static9.aFloatArray1[2] = 0.0F;
		Static9.aFloatArray1[0] = 0.0F;
		Static9.aFloatArray1[3] = (float) super.aClass66_Sub2_41.anInt6140 * local14 % 1.0F;
		Static9.aFloatArray1[1] = local40;
		OpenGL.glTexGenfv(8193, 9474, Static9.aFloatArray1, 0);
		if (this.aClass98_2.aBoolean187) {
			Static9.aFloatArray1[1] = 0.0F;
			Static9.aFloatArray1[2] = 0.0F;
			Static9.aFloatArray1[3] = local32 * (float) super.aClass66_Sub2_41.anInt6140 % 1.0F;
			Static9.aFloatArray1[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static9.aFloatArray1, 0);
		} else {
			@Pc(166) int local166 = (int) (local32 * 16.0F * (float) super.aClass66_Sub2_41.anInt6140);
			super.aClass66_Sub2_41.method5109(this.aClass98_2.aClass19_Sub4Array2[local166 % 16]);
		}
		super.aClass66_Sub2_41.method5075(0);
	}
}
