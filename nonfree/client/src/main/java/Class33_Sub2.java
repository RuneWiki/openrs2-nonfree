import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "[F")
	private static final float[] aFloatArray13 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!rj;")
	private Class203 aClass203_2;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "Lclient!fs;")
	private final Class76 aClass76_2;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!ht;")
	private final Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!bf;Lclient!fs;)V", line = 34)
	public Class33_Sub2(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class76 arg1) {
		super(arg0);
		this.aClass76_2 = arg1;
		this.method2450();
		this.aClass8_Sub2_1 = new Class8_Sub2(this.aClass19_Sub1_35, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass8_Sub2_1.method2613();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 4)
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_35.anOpengl1;
		if (this.aClass19_Sub1_35.anInt601 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass19_Sub1_35.anInt601;
			this.aClass19_Sub1_35.method832(1);
			aFloatArray13[0] = 0.0F;
			aFloatArray13[1] = 0.0F;
			aFloatArray13[2] = local14;
			aFloatArray13[3] = this.aClass19_Sub1_35.aFloat5 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, aFloatArray13, 0);
			local3.glPopMatrix();
			this.aClass19_Sub1_35.method847(0.5F, (float) this.aClass19_Sub1_35.anInt601);
			this.aClass19_Sub1_35.method848(this.aClass8_Sub2_1);
			this.aClass19_Sub1_35.method832(0);
		}
		this.aClass203_2.method5191('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()Z", line = 30)
	@Override
	public boolean method5712() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 43)
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_35.method794(260, 8448);
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "()V", line = 48)
	private void method2450() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_35.anOpengl1;
		this.aClass203_2 = new Class203(this.aClass19_Sub1_35, 2);
		this.aClass203_2.method5193(0);
		this.aClass19_Sub1_35.method832(1);
		this.aClass19_Sub1_35.method794(7681, 260);
		this.aClass19_Sub1_35.method793(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass19_Sub1_35.method832(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass76_2.aBoolean160) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass203_2.method5192();
		this.aClass203_2.method5193(1);
		this.aClass19_Sub1_35.method832(1);
		this.aClass19_Sub1_35.method794(8448, 8448);
		this.aClass19_Sub1_35.method793(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass19_Sub1_35.method832(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass76_2.aBoolean160) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass203_2.method5192();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 87)
	@Override
	public void method5713(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass76_2.aBoolean160) {
				this.aClass19_Sub1_35.method848(this.aClass76_2.aClass8_Sub4_2);
				aFloatArray13[0] = 0.0F;
				aFloatArray13[1] = 0.0F;
				aFloatArray13[2] = 0.0F;
				aFloatArray13[3] = (float) (this.aClass19_Sub1_35.anInt584 % 4000) / 4000.0F;
				this.aClass19_Sub1_35.anOpengl1.glTexGenfv(8194, 9473, aFloatArray13, 0);
			} else {
				@Pc(56) int local56 = this.aClass19_Sub1_35.anInt584 % 4000 * 16 / 4000;
				this.aClass19_Sub1_35.method848(this.aClass76_2.aClass8_Sub1Array1[local56]);
			}
		} else if (this.aClass76_2.aBoolean160) {
			this.aClass19_Sub1_35.method848(this.aClass76_2.aClass8_Sub4_2);
			aFloatArray13[0] = 0.0F;
			aFloatArray13[1] = 0.0F;
			aFloatArray13[2] = 0.0F;
			aFloatArray13[3] = 0.0F;
			this.aClass19_Sub1_35.anOpengl1.glTexGenfv(8194, 9473, aFloatArray13, 0);
		} else {
			this.aClass19_Sub1_35.method848(this.aClass76_2.aClass8_Sub1Array1[0]);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()V", line = 125)
	@Override
	public void method5716() {
		@Pc(3) opengl local3 = this.aClass19_Sub1_35.anOpengl1;
		this.aClass203_2.method5191('\u0001');
		if (this.aClass19_Sub1_35.anInt601 > 0) {
			this.aClass19_Sub1_35.method832(1);
			this.aClass19_Sub1_35.method848(null);
			this.aClass19_Sub1_35.method847(1.0F, 0.0F);
			this.aClass19_Sub1_35.method832(0);
		}
		this.aClass19_Sub1_35.method794(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!kq;)V", line = 143)
	@Override
	public void method5711(@OriginalArg(0) Class8 arg0) {
	}
}
