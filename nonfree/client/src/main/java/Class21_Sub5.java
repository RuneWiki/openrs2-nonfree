import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class21_Sub5 extends Class21 {

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "Lclient!cga;")
	private Class58 aClass58_3;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "Lclient!ol;")
	private final Class264 aClass264_4;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "Lclient!dha;")
	private final Class39_Sub2 aClass39_Sub2_1;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!hk;Lclient!ol;)V")
	public Class21_Sub5(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class264 arg1) {
		super(arg0);
		this.aClass264_4 = arg1;
		this.method4750();
		this.aClass39_Sub2_1 = new Class39_Sub2(super.aClass16_Sub2_43, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass39_Sub2_1.method2056();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZI)V")
	@Override
	public void method8696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass264_4.aBoolean579) {
				super.aClass16_Sub2_43.method3620(this.aClass264_4.aClass39_Sub3_2);
				Static15.aFloatArray1[2] = 0.0F;
				Static15.aFloatArray1[1] = 0.0F;
				Static15.aFloatArray1[0] = 0.0F;
				Static15.aFloatArray1[3] = (float) (super.aClass16_Sub2_43.anInt4365 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, Static15.aFloatArray1, 0);
			} else {
				@Pc(71) int local71 = super.aClass16_Sub2_43.anInt4365 % 4000 * 16 / 4000;
				super.aClass16_Sub2_43.method3620(this.aClass264_4.aClass39_Sub4Array3[local71]);
			}
		} else if (this.aClass264_4.aBoolean579) {
			super.aClass16_Sub2_43.method3620(this.aClass264_4.aClass39_Sub3_2);
			Static15.aFloatArray1[2] = 0.0F;
			Static15.aFloatArray1[3] = 0.0F;
			Static15.aFloatArray1[1] = 0.0F;
			Static15.aFloatArray1[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static15.aFloatArray1, 0);
		} else {
			super.aClass16_Sub2_43.method3620(this.aClass264_4.aClass39_Sub4Array3[0]);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8692() {
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	@Override
	public void method8695() {
		this.aClass58_3.method1625('\u0001');
		if (super.aClass16_Sub2_43.anInt4386 > 0) {
			super.aClass16_Sub2_43.method3683(1);
			super.aClass16_Sub2_43.method3620((Class39) null);
			super.aClass16_Sub2_43.method3624(0.0F, 1.0F);
			super.aClass16_Sub2_43.method3683(0);
		}
		super.aClass16_Sub2_43.method3671(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8697(@OriginalArg(1) boolean arg0) {
		super.aClass16_Sub2_43.method3671(260, 8448);
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V")
	private void method4750() {
		this.aClass58_3 = new Class58(super.aClass16_Sub2_43, 2);
		this.aClass58_3.method1621(0);
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3671(7681, 260);
		super.aClass16_Sub2_43.method3669(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass16_Sub2_43.method3683(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass264_4.aBoolean579) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass58_3.method1620();
		this.aClass58_3.method1621(1);
		super.aClass16_Sub2_43.method3683(1);
		super.aClass16_Sub2_43.method3671(8448, 8448);
		super.aClass16_Sub2_43.method3669(5890, 0, 768);
		OpenGL.glDisable(3168);
		super.aClass16_Sub2_43.method3683(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass264_4.aBoolean579) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass58_3.method1620();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8698(@OriginalArg(0) boolean arg0) {
		if (super.aClass16_Sub2_43.anInt4386 > 0) {
			@Pc(10) float local10 = -0.5F / (float) super.aClass16_Sub2_43.anInt4386;
			super.aClass16_Sub2_43.method3683(1);
			Static15.aFloatArray1[1] = 0.0F;
			Static15.aFloatArray1[2] = local10;
			Static15.aFloatArray1[3] = super.aClass16_Sub2_43.aFloat99 * local10 + 0.25F;
			Static15.aFloatArray1[0] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static15.aFloatArray1, 0);
			OpenGL.glPopMatrix();
			super.aClass16_Sub2_43.method3624((float) super.aClass16_Sub2_43.anInt4386, 0.5F);
			super.aClass16_Sub2_43.method3620(this.aClass39_Sub2_1);
			super.aClass16_Sub2_43.method3683(0);
		}
		this.aClass58_3.method1625('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBLclient!qk;)V")
	@Override
	public void method8700(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
	}
}
