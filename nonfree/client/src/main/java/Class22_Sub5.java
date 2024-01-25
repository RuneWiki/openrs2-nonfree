import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class22_Sub5 extends Class22 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Lclient!bb;")
	private Class20 aClass20_3;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!rl;")
	private final Class178 aClass178_2;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!fl;")
	private final Class56_Sub2 aClass56_Sub2_1;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!tb;Lclient!rl;)V")
	public Class22_Sub5(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Class178 arg1) {
		super(arg0);
		this.aClass178_2 = arg1;
		this.method2569();
		this.aClass56_Sub2_1 = new Class56_Sub2(this.aClass129_Sub2_32, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass56_Sub2_1.method1316();
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
	@Override
	public void method4340(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass129_Sub2_32.anOpengl2;
		if (this.aClass129_Sub2_32.lb > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass129_Sub2_32.lb;
			this.aClass129_Sub2_32.method5091(1);
			Static161.aFloatArray17[0] = 0.0F;
			Static161.aFloatArray17[1] = 0.0F;
			Static161.aFloatArray17[2] = local14;
			Static161.aFloatArray17[3] = this.aClass129_Sub2_32.aFloat67 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static161.aFloatArray17, 0);
			local3.glPopMatrix();
			this.aClass129_Sub2_32.method5051(0.5F, (float) this.aClass129_Sub2_32.lb);
			this.aClass129_Sub2_32.method5084(this.aClass56_Sub2_1);
			this.aClass129_Sub2_32.method5091(0);
		}
		this.aClass20_3.method223('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()V")
	private void method2569() {
		@Pc(3) opengl local3 = this.aClass129_Sub2_32.anOpengl2;
		this.aClass20_3 = new Class20(this.aClass129_Sub2_32, 2);
		this.aClass20_3.method222(0);
		this.aClass129_Sub2_32.method5091(1);
		this.aClass129_Sub2_32.method5067(7681, 260);
		this.aClass129_Sub2_32.method5037(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass129_Sub2_32.method5091(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass178_2.aBoolean357) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass20_3.method221();
		this.aClass20_3.method222(1);
		this.aClass129_Sub2_32.method5091(1);
		this.aClass129_Sub2_32.method5067(8448, 8448);
		this.aClass129_Sub2_32.method5037(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass129_Sub2_32.method5091(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass178_2.aBoolean357) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass20_3.method221();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()Z")
	@Override
	public boolean method4341() {
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ue;)V")
	@Override
	public void method4343(@OriginalArg(0) Class56 arg0) {
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass178_2.aBoolean357) {
				this.aClass129_Sub2_32.method5084(this.aClass178_2.aClass56_Sub3_1);
				Static161.aFloatArray17[0] = 0.0F;
				Static161.aFloatArray17[1] = 0.0F;
				Static161.aFloatArray17[2] = 0.0F;
				Static161.aFloatArray17[3] = (float) (this.aClass129_Sub2_32.anInt5886 % 4000) / 4000.0F;
				this.aClass129_Sub2_32.anOpengl2.glTexGenfv(8194, 9473, Static161.aFloatArray17, 0);
			} else {
				@Pc(56) int local56 = this.aClass129_Sub2_32.anInt5886 % 4000 * 16 / 4000;
				this.aClass129_Sub2_32.method5084(this.aClass178_2.aClass56_Sub4Array3[local56]);
			}
		} else if (this.aClass178_2.aBoolean357) {
			this.aClass129_Sub2_32.method5084(this.aClass178_2.aClass56_Sub3_1);
			Static161.aFloatArray17[0] = 0.0F;
			Static161.aFloatArray17[1] = 0.0F;
			Static161.aFloatArray17[2] = 0.0F;
			Static161.aFloatArray17[3] = 0.0F;
			this.aClass129_Sub2_32.anOpengl2.glTexGenfv(8194, 9473, Static161.aFloatArray17, 0);
		} else {
			this.aClass129_Sub2_32.method5084(this.aClass178_2.aClass56_Sub4Array3[0]);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	@Override
	public void method4338(@OriginalArg(0) boolean arg0) {
		this.aClass129_Sub2_32.method5067(260, 8448);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "()V")
	@Override
	public void method4342() {
		@Pc(3) opengl local3 = this.aClass129_Sub2_32.anOpengl2;
		this.aClass20_3.method223('\u0001');
		if (this.aClass129_Sub2_32.lb > 0) {
			this.aClass129_Sub2_32.method5091(1);
			this.aClass129_Sub2_32.method5084(null);
			this.aClass129_Sub2_32.method5051(1.0F, 0.0F);
			this.aClass129_Sub2_32.method5091(0);
		}
		this.aClass129_Sub2_32.method5067(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}
}
