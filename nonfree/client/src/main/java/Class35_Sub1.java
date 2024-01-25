import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "Lclient!wl;")
	private Class318 aClass318_1;

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Lclient!wq;")
	private final Class319 aClass319_1;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "Lclient!oda;")
	private final Class20_Sub4 aClass20_Sub4_1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!te;Lclient!wq;)V")
	public Class35_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class319 arg1) {
		super(arg0);
		this.aClass319_1 = arg1;
		this.method1388();
		this.aClass20_Sub4_1 = new Class20_Sub4(super.aClass9_Sub3_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass20_Sub4_1.method5529();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7416(@OriginalArg(0) boolean arg0) {
		if (super.aClass9_Sub3_41.anInt7887 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass9_Sub3_41.anInt7887;
			super.aClass9_Sub3_41.method6660(1);
			Static168.aFloatArray34[2] = local10;
			Static168.aFloatArray34[0] = 0.0F;
			Static168.aFloatArray34[1] = 0.0F;
			Static168.aFloatArray34[3] = super.aClass9_Sub3_41.aFloat160 * local10 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static168.aFloatArray34, 0);
			OpenGL.glPopMatrix();
			super.aClass9_Sub3_41.method6720(0.5F, (float) super.aClass9_Sub3_41.anInt7887);
			super.aClass9_Sub3_41.method6701(this.aClass20_Sub4_1);
			super.aClass9_Sub3_41.method6660(0);
		}
		this.aClass318_1.method7877('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7417(@OriginalArg(1) boolean arg0) {
		super.aClass9_Sub3_41.method6732(260, 8448);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V")
	private void method1388() {
		this.aClass318_1 = new Class318(super.aClass9_Sub3_41, 2);
		this.aClass318_1.method7880(0);
		super.aClass9_Sub3_41.method6660(1);
		super.aClass9_Sub3_41.method6732(7681, 260);
		super.aClass9_Sub3_41.method6706(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass9_Sub3_41.method6660(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass319_1.aBoolean653) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass318_1.method7881();
		this.aClass318_1.method7880(1);
		super.aClass9_Sub3_41.method6660(1);
		super.aClass9_Sub3_41.method6732(8448, 8448);
		super.aClass9_Sub3_41.method6706(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass9_Sub3_41.method6660(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass319_1.aBoolean653) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass318_1.method7881();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass319_1.aBoolean653) {
				super.aClass9_Sub3_41.method6701(this.aClass319_1.aClass20_Sub1_3);
				Static168.aFloatArray34[2] = 0.0F;
				Static168.aFloatArray34[1] = 0.0F;
				Static168.aFloatArray34[0] = 0.0F;
				Static168.aFloatArray34[3] = (float) (super.aClass9_Sub3_41.anInt7876 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static168.aFloatArray34, 0);
			} else {
				@Pc(63) int local63 = super.aClass9_Sub3_41.anInt7876 % 4000 * 16 / 4000;
				super.aClass9_Sub3_41.method6701(this.aClass319_1.aClass20_Sub3Array4[local63]);
			}
		} else if (this.aClass319_1.aBoolean653) {
			super.aClass9_Sub3_41.method6701(this.aClass319_1.aClass20_Sub1_3);
			Static168.aFloatArray34[1] = 0.0F;
			Static168.aFloatArray34[0] = 0.0F;
			Static168.aFloatArray34[3] = 0.0F;
			Static168.aFloatArray34[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static168.aFloatArray34, 0);
		} else {
			super.aClass9_Sub3_41.method6701(this.aClass319_1.aClass20_Sub3Array4[0]);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7414() {
		return true;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!jl;)V")
	@Override
	public void method7420(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
	@Override
	public void method7418() {
		this.aClass318_1.method7877('\u0001');
		if (super.aClass9_Sub3_41.anInt7887 > 0) {
			super.aClass9_Sub3_41.method6660(1);
			super.aClass9_Sub3_41.method6701(null);
			super.aClass9_Sub3_41.method6720(1.0F, 0.0F);
			super.aClass9_Sub3_41.method6660(0);
		}
		super.aClass9_Sub3_41.method6732(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
