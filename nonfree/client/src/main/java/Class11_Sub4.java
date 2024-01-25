import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!jr;")
	private Class164 aClass164_3;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "Lclient!jga;")
	private final Class161 aClass161_3;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Lclient!ab;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!wh;Lclient!jga;)V")
	public Class11_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class161 arg1) {
		super(arg0);
		this.aClass161_3 = arg1;
		this.method2181();
		this.aClass3_Sub1_1 = new Class3_Sub1(super.aClass100_Sub3_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass3_Sub1_1.method52();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8725() {
		return true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8724(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_41.method8880(8448, 260);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	@Override
	public void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass161_3.aBoolean354) {
				super.aClass100_Sub3_41.method8925(this.aClass161_3.aClass3_Sub3_2);
				Static429.aFloatArray70[2] = 0.0F;
				Static429.aFloatArray70[3] = (float) (super.aClass100_Sub3_41.anInt10585 % 4000) / 4000.0F;
				Static429.aFloatArray70[0] = 0.0F;
				Static429.aFloatArray70[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static429.aFloatArray70, 0);
			} else {
				@Pc(24) int local24 = super.aClass100_Sub3_41.anInt10585 % 4000 * 16 / 4000;
				super.aClass100_Sub3_41.method8925(this.aClass161_3.aClass3_Sub2Array4[local24]);
			}
		} else if (this.aClass161_3.aBoolean354) {
			super.aClass100_Sub3_41.method8925(this.aClass161_3.aClass3_Sub3_2);
			Static429.aFloatArray70[0] = 0.0F;
			Static429.aFloatArray70[3] = 0.0F;
			Static429.aFloatArray70[2] = 0.0F;
			Static429.aFloatArray70[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static429.aFloatArray70, 0);
		} else {
			super.aClass100_Sub3_41.method8925(this.aClass161_3.aClass3_Sub2Array4[0]);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!me;ZI)V")
	@Override
	public void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8728(@OriginalArg(1) boolean arg0) {
		if (super.aClass100_Sub3_41.anInt10597 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass100_Sub3_41.anInt10597;
			super.aClass100_Sub3_41.method8861(1);
			Static429.aFloatArray70[3] = super.aClass100_Sub3_41.aFloat215 * local10 + 0.25F;
			Static429.aFloatArray70[2] = local10;
			Static429.aFloatArray70[1] = 0.0F;
			Static429.aFloatArray70[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static429.aFloatArray70, 0);
			OpenGL.glPopMatrix();
			super.aClass100_Sub3_41.method8919(0.5F, (float) super.aClass100_Sub3_41.anInt10597);
			super.aClass100_Sub3_41.method8925(this.aClass3_Sub1_1);
			super.aClass100_Sub3_41.method8861(0);
		}
		this.aClass164_3.method4788('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, (float) 1);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
	private void method2181() {
		this.aClass164_3 = new Class164(super.aClass100_Sub3_41, 2);
		this.aClass164_3.method4791(0);
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8880(260, 7681);
		super.aClass100_Sub3_41.method8889(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass100_Sub3_41.method8861(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass161_3.aBoolean354) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass164_3.method4790();
		this.aClass164_3.method4791(1);
		super.aClass100_Sub3_41.method8861(1);
		super.aClass100_Sub3_41.method8880(8448, 8448);
		super.aClass100_Sub3_41.method8889(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass100_Sub3_41.method8861(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass161_3.aBoolean354) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass164_3.method4790();
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	@Override
	public void method8727() {
		this.aClass164_3.method4788('\u0001');
		if (super.aClass100_Sub3_41.anInt10597 > 0) {
			super.aClass100_Sub3_41.method8861(1);
			super.aClass100_Sub3_41.method8925((Class3) null);
			super.aClass100_Sub3_41.method8919(1.0F, 0.0F);
			super.aClass100_Sub3_41.method8861(0);
		}
		super.aClass100_Sub3_41.method8880(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
