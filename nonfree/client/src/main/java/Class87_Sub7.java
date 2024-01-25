import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class87_Sub7 extends Class87 {

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Lclient!gi;")
	private Class81 aClass81_6;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!bo;")
	private final Class29 aClass29_4;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!fb;")
	private final Class70_Sub1 aClass70_Sub1_1;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ql;Lclient!bo;)V")
	public Class87_Sub7(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Class29 arg1) {
		super(arg0);
		this.aClass29_4 = arg1;
		this.method5657();
		this.aClass70_Sub1_1 = new Class70_Sub1(this.aClass92_Sub2_40, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass70_Sub1_1.method1495();
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()Z")
	@Override
	public boolean method5656() {
		return true;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5652(@OriginalArg(0) boolean arg0) {
		this.aClass92_Sub2_40.method4569(260, 8448);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!na;)V")
	@Override
	public void method5654(@OriginalArg(0) Class70 arg0) {
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()V")
	@Override
	public void method5651() {
		@Pc(3) opengl local3 = this.aClass92_Sub2_40.anOpengl2;
		this.aClass81_6.method1875('\u0001');
		if (this.aClass92_Sub2_40.anInt5411 > 0) {
			this.aClass92_Sub2_40.method4568(1);
			this.aClass92_Sub2_40.method4548(null);
			this.aClass92_Sub2_40.method4543(1.0F, 0.0F);
			this.aClass92_Sub2_40.method4568(0);
		}
		this.aClass92_Sub2_40.method4569(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V")
	@Override
	public void method5653(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_40.anOpengl2;
		if (this.aClass92_Sub2_40.anInt5411 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass92_Sub2_40.anInt5411;
			this.aClass92_Sub2_40.method4568(1);
			Static353.aFloatArray29[0] = 0.0F;
			Static353.aFloatArray29[1] = 0.0F;
			Static353.aFloatArray29[2] = local14;
			Static353.aFloatArray29[3] = this.aClass92_Sub2_40.aFloat56 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static353.aFloatArray29, 0);
			local3.glPopMatrix();
			this.aClass92_Sub2_40.method4543(0.5F, (float) this.aClass92_Sub2_40.anInt5411);
			this.aClass92_Sub2_40.method4548(this.aClass70_Sub1_1);
			this.aClass92_Sub2_40.method4568(0);
		}
		this.aClass81_6.method1875('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	@Override
	public void method5655(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass29_4.aBoolean28) {
				this.aClass92_Sub2_40.method4548(this.aClass29_4.aClass70_Sub3_1);
				Static353.aFloatArray29[0] = 0.0F;
				Static353.aFloatArray29[1] = 0.0F;
				Static353.aFloatArray29[2] = 0.0F;
				Static353.aFloatArray29[3] = (float) (this.aClass92_Sub2_40.anInt5384 % 4000) / 4000.0F;
				this.aClass92_Sub2_40.anOpengl2.glTexGenfv(8194, 9473, Static353.aFloatArray29, 0);
			} else {
				@Pc(56) int local56 = this.aClass92_Sub2_40.anInt5384 % 4000 * 16 / 4000;
				this.aClass92_Sub2_40.method4548(this.aClass29_4.aClass70_Sub4Array2[local56]);
			}
		} else if (this.aClass29_4.aBoolean28) {
			this.aClass92_Sub2_40.method4548(this.aClass29_4.aClass70_Sub3_1);
			Static353.aFloatArray29[0] = 0.0F;
			Static353.aFloatArray29[1] = 0.0F;
			Static353.aFloatArray29[2] = 0.0F;
			Static353.aFloatArray29[3] = 0.0F;
			this.aClass92_Sub2_40.anOpengl2.glTexGenfv(8194, 9473, Static353.aFloatArray29, 0);
		} else {
			this.aClass92_Sub2_40.method4548(this.aClass29_4.aClass70_Sub4Array2[0]);
		}
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "()V")
	private void method5657() {
		@Pc(3) opengl local3 = this.aClass92_Sub2_40.anOpengl2;
		this.aClass81_6 = new Class81(this.aClass92_Sub2_40, 2);
		this.aClass81_6.method1877(0);
		this.aClass92_Sub2_40.method4568(1);
		this.aClass92_Sub2_40.method4569(7681, 260);
		this.aClass92_Sub2_40.method4578(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass92_Sub2_40.method4568(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass29_4.aBoolean28) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass81_6.method1876();
		this.aClass81_6.method1877(1);
		this.aClass92_Sub2_40.method4568(1);
		this.aClass92_Sub2_40.method4569(8448, 8448);
		this.aClass92_Sub2_40.method4578(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass92_Sub2_40.method4568(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass29_4.aBoolean28) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass81_6.method1876();
	}
}
