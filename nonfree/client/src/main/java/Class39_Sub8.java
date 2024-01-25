import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class39_Sub8 extends Class39 {

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "Lclient!q;")
	private Class168 aClass168_5;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "Lclient!cf;")
	private final Class38 aClass38_4;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "Lclient!li;")
	private final Class92_Sub2 aClass92_Sub2_1;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!hd;Lclient!cf;)V")
	public Class39_Sub8(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Class38 arg1) {
		super(arg0);
		this.aClass38_4 = arg1;
		this.method5248();
		this.aClass92_Sub2_1 = new Class92_Sub2(this.aClass89_Sub1_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass92_Sub2_1.method3405();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()Z")
	@Override
	public boolean method5245() {
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	@Override
	public void method5243(@OriginalArg(0) boolean arg0) {
		this.aClass89_Sub1_39.method2419(260, 8448);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5242(@OriginalArg(0) Class92 arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "()V")
	private void method5248() {
		@Pc(3) opengl local3 = this.aClass89_Sub1_39.anOpengl2;
		this.aClass168_5 = new Class168(this.aClass89_Sub1_39, 2);
		this.aClass168_5.method4286(0);
		this.aClass89_Sub1_39.method2433(1);
		this.aClass89_Sub1_39.method2419(7681, 260);
		this.aClass89_Sub1_39.method2392(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass89_Sub1_39.method2433(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass38_4.aBoolean80) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass168_5.method4285();
		this.aClass168_5.method4286(1);
		this.aClass89_Sub1_39.method2433(1);
		this.aClass89_Sub1_39.method2419(8448, 8448);
		this.aClass89_Sub1_39.method2392(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass89_Sub1_39.method2433(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass38_4.aBoolean80) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass168_5.method4285();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "()V")
	@Override
	public void method5247() {
		@Pc(3) opengl local3 = this.aClass89_Sub1_39.anOpengl2;
		this.aClass168_5.method4287('\u0001');
		if (this.aClass89_Sub1_39.anInt2626 > 0) {
			this.aClass89_Sub1_39.method2433(1);
			this.aClass89_Sub1_39.method2445(null);
			this.aClass89_Sub1_39.method2460(1.0F, 0.0F);
			this.aClass89_Sub1_39.method2433(0);
		}
		this.aClass89_Sub1_39.method2419(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	@Override
	public void method5244(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass38_4.aBoolean80) {
				this.aClass89_Sub1_39.method2445(this.aClass38_4.aClass92_Sub1_1);
				Static328.aFloatArray30[0] = 0.0F;
				Static328.aFloatArray30[1] = 0.0F;
				Static328.aFloatArray30[2] = 0.0F;
				Static328.aFloatArray30[3] = (float) (this.aClass89_Sub1_39.anInt2599 % 4000) / 4000.0F;
				this.aClass89_Sub1_39.anOpengl2.glTexGenfv(8194, 9473, Static328.aFloatArray30, 0);
			} else {
				@Pc(56) int local56 = this.aClass89_Sub1_39.anInt2599 % 4000 * 16 / 4000;
				this.aClass89_Sub1_39.method2445(this.aClass38_4.aClass92_Sub4Array2[local56]);
			}
		} else if (this.aClass38_4.aBoolean80) {
			this.aClass89_Sub1_39.method2445(this.aClass38_4.aClass92_Sub1_1);
			Static328.aFloatArray30[0] = 0.0F;
			Static328.aFloatArray30[1] = 0.0F;
			Static328.aFloatArray30[2] = 0.0F;
			Static328.aFloatArray30[3] = 0.0F;
			this.aClass89_Sub1_39.anOpengl2.glTexGenfv(8194, 9473, Static328.aFloatArray30, 0);
		} else {
			this.aClass89_Sub1_39.method2445(this.aClass38_4.aClass92_Sub4Array2[0]);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V")
	@Override
	public void method5246(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_39.anOpengl2;
		if (this.aClass89_Sub1_39.anInt2626 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass89_Sub1_39.anInt2626;
			this.aClass89_Sub1_39.method2433(1);
			Static328.aFloatArray30[0] = 0.0F;
			Static328.aFloatArray30[1] = 0.0F;
			Static328.aFloatArray30[2] = local14;
			Static328.aFloatArray30[3] = this.aClass89_Sub1_39.aFloat29 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static328.aFloatArray30, 0);
			local3.glPopMatrix();
			this.aClass89_Sub1_39.method2460(0.5F, (float) this.aClass89_Sub1_39.anInt2626);
			this.aClass89_Sub1_39.method2445(this.aClass92_Sub2_1);
			this.aClass89_Sub1_39.method2433(0);
		}
		this.aClass168_5.method4287('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}
}
