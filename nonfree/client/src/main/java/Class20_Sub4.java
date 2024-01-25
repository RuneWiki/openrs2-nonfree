import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!pa;")
	private Class155 aClass155_4;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Lclient!qg;")
	private final Class166 aClass166_2;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!vg;")
	private final Class44_Sub3 aClass44_Sub3_1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!nf;Lclient!qg;)V")
	public Class20_Sub4(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) Class166 arg1) {
		super(arg0);
		this.aClass166_2 = arg1;
		this.method2874();
		this.aClass44_Sub3_1 = new Class44_Sub3(this.aClass105_Sub1_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass44_Sub3_1.method5538();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	@Override
	public void method5682(@OriginalArg(0) boolean arg0) {
		this.aClass105_Sub1_42.method3562(260, 8448);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()V")
	private void method2874() {
		@Pc(3) opengl local3 = this.aClass105_Sub1_42.anOpengl1;
		this.aClass155_4 = new Class155(this.aClass105_Sub1_42, 2);
		this.aClass155_4.method4111(0);
		this.aClass105_Sub1_42.method3634(1);
		this.aClass105_Sub1_42.method3562(7681, 260);
		this.aClass105_Sub1_42.method3568(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass105_Sub1_42.method3634(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass166_2.aBoolean424) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass155_4.method4110();
		this.aClass155_4.method4111(1);
		this.aClass105_Sub1_42.method3634(1);
		this.aClass105_Sub1_42.method3562(8448, 8448);
		this.aClass105_Sub1_42.method3568(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass105_Sub1_42.method3634(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass166_2.aBoolean424) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass155_4.method4110();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()Z")
	@Override
	public boolean method5683() {
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!me;)V")
	@Override
	public void method5680(@OriginalArg(0) Class44 arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5681(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass105_Sub1_42.anOpengl1;
		if (this.aClass105_Sub1_42.anInt4208 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass105_Sub1_42.anInt4208;
			this.aClass105_Sub1_42.method3634(1);
			Static164.aFloatArray5[0] = 0.0F;
			Static164.aFloatArray5[1] = 0.0F;
			Static164.aFloatArray5[2] = local14;
			Static164.aFloatArray5[3] = this.aClass105_Sub1_42.aFloat40 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static164.aFloatArray5, 0);
			local3.glPopMatrix();
			this.aClass105_Sub1_42.method3576(0.5F, (float) this.aClass105_Sub1_42.anInt4208);
			this.aClass105_Sub1_42.method3591(this.aClass44_Sub3_1);
			this.aClass105_Sub1_42.method3634(0);
		}
		this.aClass155_4.method4112('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	@Override
	public void method5685(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass166_2.aBoolean424) {
				this.aClass105_Sub1_42.method3591(this.aClass166_2.aClass44_Sub2_2);
				Static164.aFloatArray5[0] = 0.0F;
				Static164.aFloatArray5[1] = 0.0F;
				Static164.aFloatArray5[2] = 0.0F;
				Static164.aFloatArray5[3] = (float) (this.aClass105_Sub1_42.anInt4167 % 4000) / 4000.0F;
				this.aClass105_Sub1_42.anOpengl1.glTexGenfv(8194, 9473, Static164.aFloatArray5, 0);
			} else {
				@Pc(56) int local56 = this.aClass105_Sub1_42.anInt4167 % 4000 * 16 / 4000;
				this.aClass105_Sub1_42.method3591(this.aClass166_2.aClass44_Sub1Array3[local56]);
			}
		} else if (this.aClass166_2.aBoolean424) {
			this.aClass105_Sub1_42.method3591(this.aClass166_2.aClass44_Sub2_2);
			Static164.aFloatArray5[0] = 0.0F;
			Static164.aFloatArray5[1] = 0.0F;
			Static164.aFloatArray5[2] = 0.0F;
			Static164.aFloatArray5[3] = 0.0F;
			this.aClass105_Sub1_42.anOpengl1.glTexGenfv(8194, 9473, Static164.aFloatArray5, 0);
		} else {
			this.aClass105_Sub1_42.method3591(this.aClass166_2.aClass44_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()V")
	@Override
	public void method5684() {
		@Pc(3) opengl local3 = this.aClass105_Sub1_42.anOpengl1;
		this.aClass155_4.method4112('\u0001');
		if (this.aClass105_Sub1_42.anInt4208 > 0) {
			this.aClass105_Sub1_42.method3634(1);
			this.aClass105_Sub1_42.method3591(null);
			this.aClass105_Sub1_42.method3576(1.0F, 0.0F);
			this.aClass105_Sub1_42.method3634(0);
		}
		this.aClass105_Sub1_42.method3562(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}
}
