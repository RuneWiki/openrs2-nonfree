import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "Lclient!pia;")
	private Class283 aClass283_2;

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "Lclient!od;")
	private final Class262 aClass262_2;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!v;")
	private final Class116_Sub4 aClass116_Sub4_1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!pc;Lclient!od;)V")
	public Class44_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class262 arg1) {
		super(arg0);
		this.aClass262_2 = arg1;
		this.method4150();
		this.aClass116_Sub4_1 = new Class116_Sub4(super.aClass33_Sub3_34, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass116_Sub4_1.method8350();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass262_2.aBoolean519) {
				super.aClass33_Sub3_34.method6340(this.aClass262_2.aClass116_Sub3_3);
				Static152.aFloatArray17[3] = (float) (super.aClass33_Sub3_34.anInt7264 % 4000) / 4000.0F;
				Static152.aFloatArray17[2] = 0.0F;
				Static152.aFloatArray17[1] = 0.0F;
				Static152.aFloatArray17[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static152.aFloatArray17, 0);
			} else {
				@Pc(66) int local66 = super.aClass33_Sub3_34.anInt7264 % 4000 * 16 / 4000;
				super.aClass33_Sub3_34.method6340(this.aClass262_2.aClass116_Sub2Array4[local66]);
			}
		} else if (this.aClass262_2.aBoolean519) {
			super.aClass33_Sub3_34.method6340(this.aClass262_2.aClass116_Sub3_3);
			Static152.aFloatArray17[3] = 0.0F;
			Static152.aFloatArray17[0] = 0.0F;
			Static152.aFloatArray17[1] = 0.0F;
			Static152.aFloatArray17[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static152.aFloatArray17, 0);
		} else {
			super.aClass33_Sub3_34.method6340(this.aClass262_2.aClass116_Sub2Array4[0]);
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		if (super.aClass33_Sub3_34.anInt7305 > 0) {
			@Pc(14) float local14 = -0.5F / (float) super.aClass33_Sub3_34.anInt7305;
			super.aClass33_Sub3_34.method6329(1);
			Static152.aFloatArray17[2] = local14;
			Static152.aFloatArray17[0] = 0.0F;
			Static152.aFloatArray17[3] = super.aClass33_Sub3_34.aFloat178 * local14 + 0.25F;
			Static152.aFloatArray17[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static152.aFloatArray17, 0);
			OpenGL.glPopMatrix();
			super.aClass33_Sub3_34.method6373(0.5F, (float) super.aClass33_Sub3_34.anInt7305);
			super.aClass33_Sub3_34.method6340(this.aClass116_Sub4_1);
			super.aClass33_Sub3_34.method6329(0);
		}
		this.aClass283_2.method6453('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		this.aClass283_2.method6453('\u0001');
		if (super.aClass33_Sub3_34.anInt7305 > 0) {
			super.aClass33_Sub3_34.method6329(1);
			super.aClass33_Sub3_34.method6340((Class116) null);
			super.aClass33_Sub3_34.method6373(1.0F, 0.0F);
			super.aClass33_Sub3_34.method6329(0);
		}
		super.aClass33_Sub3_34.method6365(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub3_34.method6365(8448, 260);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return true;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
	private void method4150() {
		this.aClass283_2 = new Class283(super.aClass33_Sub3_34, 2);
		this.aClass283_2.method6455(0);
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6365(260, 7681);
		super.aClass33_Sub3_34.method6307(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass33_Sub3_34.method6329(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass262_2.aBoolean519) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass283_2.method6454();
		this.aClass283_2.method6455(1);
		super.aClass33_Sub3_34.method6329(1);
		super.aClass33_Sub3_34.method6365(8448, 8448);
		super.aClass33_Sub3_34.method6307(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass33_Sub3_34.method6329(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass262_2.aBoolean519) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass283_2.method6454();
	}
}
