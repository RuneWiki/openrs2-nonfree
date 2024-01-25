import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class83_Sub7 extends Class83 {

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Lclient!pda;")
	private final Class224 aClass224_3;

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "Lclient!am;")
	private final Class11 aClass11_5;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!mh;Lclient!pda;)V")
	public Class83_Sub7(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class224 arg1) {
		super(arg0);
		this.aClass224_3 = arg1;
		this.aClass11_5 = new Class11(arg0, 2);
		this.aClass11_5.method532(0);
		super.aClass4_Sub3_41.method5245(1);
		if (this.aClass224_3.aBoolean492) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass4_Sub3_41.method5245(0);
		this.aClass11_5.method537();
		this.aClass11_5.method532(1);
		super.aClass4_Sub3_41.method5245(1);
		if (this.aClass224_3.aBoolean492) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass4_Sub3_41.method5245(0);
		this.aClass11_5.method537();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass4_Sub3_41.method5245(1);
		@Pc(51) boolean local51 = (arg0 & 0x80) != 0;
		if (local51) {
			Static168.aFloatArray24[3] = 0.0F;
			Static168.aFloatArray24[0] = local33;
			Static168.aFloatArray24[2] = 0.0F;
			Static168.aFloatArray24[1] = 0.0F;
		} else {
			Static168.aFloatArray24[3] = 0.0F;
			Static168.aFloatArray24[1] = 0.0F;
			Static168.aFloatArray24[0] = 0.0F;
			Static168.aFloatArray24[2] = local33;
		}
		OpenGL.glTexGenfv(8192, 9474, Static168.aFloatArray24, 0);
		Static168.aFloatArray24[0] = 0.0F;
		Static168.aFloatArray24[2] = 0.0F;
		Static168.aFloatArray24[3] = (float) super.aClass4_Sub3_41.anInt5794 * local14 % 1.0F;
		Static168.aFloatArray24[1] = local33;
		OpenGL.glTexGenfv(8193, 9474, Static168.aFloatArray24, 0);
		if (this.aClass224_3.aBoolean492) {
			Static168.aFloatArray24[0] = 0.0F;
			Static168.aFloatArray24[1] = 0.0F;
			Static168.aFloatArray24[3] = local25 * (float) super.aClass4_Sub3_41.anInt5794 % 1.0F;
			Static168.aFloatArray24[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static168.aFloatArray24, 0);
		} else {
			@Pc(164) int local164 = (int) (local25 * (float) super.aClass4_Sub3_41.anInt5794 * 16.0F);
			super.aClass4_Sub3_41.method5250(this.aClass224_3.aClass164_Sub3Array3[local164 % 16]);
		}
		super.aClass4_Sub3_41.method5245(0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7924(@OriginalArg(1) boolean arg0) {
		this.aClass11_5.method534('\u0000');
		if (this.aClass224_3.aBoolean492) {
			super.aClass4_Sub3_41.method5245(1);
			super.aClass4_Sub3_41.method5250(this.aClass224_3.aClass164_Sub2_3);
			super.aClass4_Sub3_41.method5245(0);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		this.aClass11_5.method534('\u0001');
		super.aClass4_Sub3_41.method5245(1);
		super.aClass4_Sub3_41.method5250(null);
		super.aClass4_Sub3_41.method5245(0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBLclient!uu;)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1) {
		super.aClass4_Sub3_41.method5250(arg1);
		super.aClass4_Sub3_41.method5230(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7930() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7927(@OriginalArg(0) boolean arg0) {
	}
}
