import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class83_Sub5 extends Class83 {

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "Lclient!am;")
	private Class11 aClass11_3;

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!pda;")
	private final Class224 aClass224_2;

	@OriginalMember(owner = "client!gv", name = "v", descriptor = "Lclient!sh;")
	private final Class164_Sub4 aClass164_Sub4_1;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!mh;Lclient!pda;)V")
	public Class83_Sub5(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class224 arg1) {
		super(arg0);
		this.aClass224_2 = arg1;
		this.method3165();
		this.aClass164_Sub4_1 = new Class164_Sub4(super.aClass4_Sub3_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass164_Sub4_1.method6921();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBLclient!uu;)V")
	@Override
	public void method7922(@OriginalArg(0) int arg0, @OriginalArg(2) Class164 arg1) {
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7930() {
		return true;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	private void method3165() {
		this.aClass11_3 = new Class11(super.aClass4_Sub3_41, 2);
		this.aClass11_3.method532(0);
		super.aClass4_Sub3_41.method5245(1);
		super.aClass4_Sub3_41.method5266(260, 7681);
		super.aClass4_Sub3_41.method5293(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass4_Sub3_41.method5245(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass224_2.aBoolean492) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass11_3.method537();
		this.aClass11_3.method532(1);
		super.aClass4_Sub3_41.method5245(1);
		super.aClass4_Sub3_41.method5266(8448, 8448);
		super.aClass4_Sub3_41.method5293(0, 768, 5890);
		OpenGL.glDisable(3168);
		super.aClass4_Sub3_41.method5245(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass224_2.aBoolean492) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass11_3.method537();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		this.aClass11_3.method534('\u0001');
		if (super.aClass4_Sub3_41.anInt5812 > 0) {
			super.aClass4_Sub3_41.method5245(1);
			super.aClass4_Sub3_41.method5250(null);
			super.aClass4_Sub3_41.method5258(1.0F, 0.0F);
			super.aClass4_Sub3_41.method5245(0);
		}
		super.aClass4_Sub3_41.method5266(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7927(@OriginalArg(0) boolean arg0) {
		super.aClass4_Sub3_41.method5266(8448, 260);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass224_2.aBoolean492) {
				super.aClass4_Sub3_41.method5250(this.aClass224_2.aClass164_Sub2_1);
				Static35.aFloatArray14[1] = 0.0F;
				Static35.aFloatArray14[2] = 0.0F;
				Static35.aFloatArray14[3] = (float) (super.aClass4_Sub3_41.anInt5794 % 4000) / 4000.0F;
				Static35.aFloatArray14[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static35.aFloatArray14, 0);
			} else {
				@Pc(108) int local108 = super.aClass4_Sub3_41.anInt5794 % 4000 * 16 / 4000;
				super.aClass4_Sub3_41.method5250(this.aClass224_2.aClass164_Sub3Array4[local108]);
			}
		} else if (this.aClass224_2.aBoolean492) {
			super.aClass4_Sub3_41.method5250(this.aClass224_2.aClass164_Sub2_1);
			Static35.aFloatArray14[0] = 0.0F;
			Static35.aFloatArray14[1] = 0.0F;
			Static35.aFloatArray14[2] = 0.0F;
			Static35.aFloatArray14[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static35.aFloatArray14, 0);
		} else {
			super.aClass4_Sub3_41.method5250(this.aClass224_2.aClass164_Sub3Array4[0]);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7924(@OriginalArg(1) boolean arg0) {
		if (super.aClass4_Sub3_41.anInt5812 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass4_Sub3_41.anInt5812;
			super.aClass4_Sub3_41.method5245(1);
			Static35.aFloatArray14[2] = local13;
			Static35.aFloatArray14[1] = 0.0F;
			Static35.aFloatArray14[0] = 0.0F;
			Static35.aFloatArray14[3] = super.aClass4_Sub3_41.aFloat124 * local13 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static35.aFloatArray14, 0);
			OpenGL.glPopMatrix();
			super.aClass4_Sub3_41.method5258(0.5F, (float) super.aClass4_Sub3_41.anInt5812);
			super.aClass4_Sub3_41.method5250(this.aClass164_Sub4_1);
			super.aClass4_Sub3_41.method5245(0);
		}
		this.aClass11_3.method534('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}
}
