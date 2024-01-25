import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class23_Sub7 extends Class23 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!el;")
	private Class57 aClass57_6;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!de;")
	private final Class44 aClass44_4;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!nb;")
	private final Class11_Sub4 aClass11_Sub4_1;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!po;Lclient!de;)V")
	public Class23_Sub7(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Class44 arg1) {
		super(arg0);
		this.aClass44_4 = arg1;
		this.method5768();
		this.aClass11_Sub4_1 = new Class11_Sub4(this.aClass59_Sub1_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass11_Sub4_1.method3583();
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "()V")
	private void method5768() {
		@Pc(3) opengl local3 = this.aClass59_Sub1_41.anOpengl2;
		this.aClass57_6 = new Class57(this.aClass59_Sub1_41, 2);
		this.aClass57_6.method1600(0);
		this.aClass59_Sub1_41.method4273(1);
		this.aClass59_Sub1_41.method4311(7681, 260);
		this.aClass59_Sub1_41.method4297(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass59_Sub1_41.method4273(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass44_4.aBoolean89) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass57_6.method1599();
		this.aClass57_6.method1600(1);
		this.aClass59_Sub1_41.method4273(1);
		this.aClass59_Sub1_41.method4311(8448, 8448);
		this.aClass59_Sub1_41.method4297(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass59_Sub1_41.method4273(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass44_4.aBoolean89) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass57_6.method1599();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5766(@OriginalArg(0) boolean arg0) {
		this.aClass59_Sub1_41.method4311(260, 8448);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
	@Override
	public void method5762() {
		@Pc(3) opengl local3 = this.aClass59_Sub1_41.anOpengl2;
		this.aClass57_6.method1598('\u0001');
		if (this.aClass59_Sub1_41.anInt4780 > 0) {
			this.aClass59_Sub1_41.method4273(1);
			this.aClass59_Sub1_41.method4296(null);
			this.aClass59_Sub1_41.method4337(1.0F, 0.0F);
			this.aClass59_Sub1_41.method4273(0);
		}
		this.aClass59_Sub1_41.method4311(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V")
	@Override
	public void method5767(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_41.anOpengl2;
		if (this.aClass59_Sub1_41.anInt4780 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass59_Sub1_41.anInt4780;
			this.aClass59_Sub1_41.method4273(1);
			Static349.aFloatArray30[0] = 0.0F;
			Static349.aFloatArray30[1] = 0.0F;
			Static349.aFloatArray30[2] = local14;
			Static349.aFloatArray30[3] = this.aClass59_Sub1_41.aFloat90 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static349.aFloatArray30, 0);
			local3.glPopMatrix();
			this.aClass59_Sub1_41.method4337(0.5F, (float) this.aClass59_Sub1_41.anInt4780);
			this.aClass59_Sub1_41.method4296(this.aClass11_Sub4_1);
			this.aClass59_Sub1_41.method4273(0);
		}
		this.aClass57_6.method1598('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method5763(@OriginalArg(0) Class11 arg0) {
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()Z")
	@Override
	public boolean method5764() {
		return true;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	@Override
	public void method5765(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass44_4.aBoolean89) {
				this.aClass59_Sub1_41.method4296(this.aClass44_4.aClass11_Sub3_2);
				Static349.aFloatArray30[0] = 0.0F;
				Static349.aFloatArray30[1] = 0.0F;
				Static349.aFloatArray30[2] = 0.0F;
				Static349.aFloatArray30[3] = (float) (this.aClass59_Sub1_41.anInt4759 % 4000) / 4000.0F;
				this.aClass59_Sub1_41.anOpengl2.glTexGenfv(8194, 9473, Static349.aFloatArray30, 0);
			} else {
				@Pc(56) int local56 = this.aClass59_Sub1_41.anInt4759 % 4000 * 16 / 4000;
				this.aClass59_Sub1_41.method4296(this.aClass44_4.aClass11_Sub1Array2[local56]);
			}
		} else if (this.aClass44_4.aBoolean89) {
			this.aClass59_Sub1_41.method4296(this.aClass44_4.aClass11_Sub3_2);
			Static349.aFloatArray30[0] = 0.0F;
			Static349.aFloatArray30[1] = 0.0F;
			Static349.aFloatArray30[2] = 0.0F;
			Static349.aFloatArray30[3] = 0.0F;
			this.aClass59_Sub1_41.anOpengl2.glTexGenfv(8194, 9473, Static349.aFloatArray30, 0);
		} else {
			this.aClass59_Sub1_41.method4296(this.aClass44_4.aClass11_Sub1Array2[0]);
		}
	}
}
