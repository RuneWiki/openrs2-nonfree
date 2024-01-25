import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class84_Sub3 extends Class84 {

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "Lclient!bw;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "Lclient!qh;")
	private final Class202 aClass202_2;

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "Lclient!av;")
	private final Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!od;Lclient!qh;)V")
	public Class84_Sub3(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_2 = arg1;
		this.method2360();
		this.aClass5_Sub2_1 = new Class5_Sub2(super.aClass128_Sub2_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass5_Sub2_1.method333();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!jk;IB)V")
	@Override
	public void method5152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
	@Override
	public void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass202_2.aBoolean437) {
				super.aClass128_Sub2_39.method3691(this.aClass202_2.aClass5_Sub3_3);
				Static339.aFloatArray27[2] = 0.0F;
				Static339.aFloatArray27[3] = (float) (super.aClass128_Sub2_39.anInt4604 % 4000) / 4000.0F;
				Static339.aFloatArray27[0] = 0.0F;
				Static339.aFloatArray27[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static339.aFloatArray27, 0);
			} else {
				@Pc(28) int local28 = super.aClass128_Sub2_39.anInt4604 % 4000 * 16 / 4000;
				super.aClass128_Sub2_39.method3691(this.aClass202_2.aClass5_Sub1Array4[local28]);
			}
		} else if (this.aClass202_2.aBoolean437) {
			super.aClass128_Sub2_39.method3691(this.aClass202_2.aClass5_Sub3_3);
			Static339.aFloatArray27[1] = 0.0F;
			Static339.aFloatArray27[3] = 0.0F;
			Static339.aFloatArray27[2] = 0.0F;
			Static339.aFloatArray27[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static339.aFloatArray27, 0);
		} else {
			super.aClass128_Sub2_39.method3691(this.aClass202_2.aClass5_Sub1Array4[0]);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	@Override
	public void method5153() {
		this.aClass32_2.method651('\u0001');
		if (super.aClass128_Sub2_39.anInt4636 > 0) {
			super.aClass128_Sub2_39.method3667(1);
			super.aClass128_Sub2_39.method3691(null);
			super.aClass128_Sub2_39.method3654(1.0F, 0.0F);
			super.aClass128_Sub2_39.method3667(0);
		}
		super.aClass128_Sub2_39.method3622(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	private void method2360() {
		this.aClass32_2 = new Class32(super.aClass128_Sub2_39, 2);
		this.aClass32_2.method657(0);
		super.aClass128_Sub2_39.method3667(1);
		super.aClass128_Sub2_39.method3622(260, 7681);
		super.aClass128_Sub2_39.method3647(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass128_Sub2_39.method3667(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass202_2.aBoolean437) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass32_2.method658();
		this.aClass32_2.method657(1);
		super.aClass128_Sub2_39.method3667(1);
		super.aClass128_Sub2_39.method3622(8448, 8448);
		super.aClass128_Sub2_39.method3647(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass128_Sub2_39.method3667(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass202_2.aBoolean437) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass32_2.method658();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		if (super.aClass128_Sub2_39.anInt4636 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass128_Sub2_39.anInt4636;
			super.aClass128_Sub2_39.method3667(1);
			Static339.aFloatArray27[2] = local13;
			Static339.aFloatArray27[1] = 0.0F;
			Static339.aFloatArray27[0] = 0.0F;
			Static339.aFloatArray27[3] = super.aClass128_Sub2_39.aFloat56 * local13 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static339.aFloatArray27, 0);
			OpenGL.glPopMatrix();
			super.aClass128_Sub2_39.method3654(0.5F, (float) super.aClass128_Sub2_39.anInt4636);
			super.aClass128_Sub2_39.method3691(this.aClass5_Sub2_1);
			super.aClass128_Sub2_39.method3667(0);
		}
		this.aClass32_2.method651('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5155() {
		return true;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5150(@OriginalArg(0) boolean arg0) {
		super.aClass128_Sub2_39.method3622(8448, 260);
	}
}
