import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!ma;")
	private Class151 aClass151_1;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!mb;")
	private final Class152 aClass152_1;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!bn;")
	private final Class30_Sub1 aClass30_Sub1_1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!mi;Lclient!mb;)V")
	public Class86_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Class152 arg1) {
		super(arg0);
		this.aClass152_1 = arg1;
		this.method1816();
		this.aClass30_Sub1_1 = new Class30_Sub1(this.aClass155_Sub1_39, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass30_Sub1_1.method504();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5360(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass155_Sub1_39.anOpengl1;
		if (this.aClass155_Sub1_39.anInt3879 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass155_Sub1_39.anInt3879;
			this.aClass155_Sub1_39.method3590(1);
			Static112.aFloatArray11[0] = 0.0F;
			Static112.aFloatArray11[1] = 0.0F;
			Static112.aFloatArray11[2] = local14;
			Static112.aFloatArray11[3] = this.aClass155_Sub1_39.aFloat47 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static112.aFloatArray11, 0);
			local3.glPopMatrix();
			this.aClass155_Sub1_39.method3615(0.5F, (float) this.aClass155_Sub1_39.anInt3879);
			this.aClass155_Sub1_39.method3585(this.aClass30_Sub1_1);
			this.aClass155_Sub1_39.method3590(0);
		}
		this.aClass151_1.method3279('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()Z")
	@Override
	public boolean method5358() {
		return true;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	@Override
	public void method5362(@OriginalArg(0) boolean arg0) {
		this.aClass155_Sub1_39.method3610(260, 8448);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
	private void method1816() {
		@Pc(3) opengl local3 = this.aClass155_Sub1_39.anOpengl1;
		this.aClass151_1 = new Class151(this.aClass155_Sub1_39, 2);
		this.aClass151_1.method3281(0);
		this.aClass155_Sub1_39.method3590(1);
		this.aClass155_Sub1_39.method3610(7681, 260);
		this.aClass155_Sub1_39.method3624(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass155_Sub1_39.method3590(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass152_1.aBoolean269) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass151_1.method3280();
		this.aClass151_1.method3281(1);
		this.aClass155_Sub1_39.method3590(1);
		this.aClass155_Sub1_39.method3610(8448, 8448);
		this.aClass155_Sub1_39.method3624(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass155_Sub1_39.method3590(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass152_1.aBoolean269) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass151_1.method3280();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public void method5359(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass152_1.aBoolean269) {
				this.aClass155_Sub1_39.method3585(this.aClass152_1.aClass30_Sub2_1);
				Static112.aFloatArray11[0] = 0.0F;
				Static112.aFloatArray11[1] = 0.0F;
				Static112.aFloatArray11[2] = 0.0F;
				Static112.aFloatArray11[3] = (float) (this.aClass155_Sub1_39.anInt3844 % 4000) / 4000.0F;
				this.aClass155_Sub1_39.anOpengl1.glTexGenfv(8194, 9473, Static112.aFloatArray11, 0);
			} else {
				@Pc(56) int local56 = this.aClass155_Sub1_39.anInt3844 % 4000 * 16 / 4000;
				this.aClass155_Sub1_39.method3585(this.aClass152_1.aClass30_Sub3Array2[local56]);
			}
		} else if (this.aClass152_1.aBoolean269) {
			this.aClass155_Sub1_39.method3585(this.aClass152_1.aClass30_Sub2_1);
			Static112.aFloatArray11[0] = 0.0F;
			Static112.aFloatArray11[1] = 0.0F;
			Static112.aFloatArray11[2] = 0.0F;
			Static112.aFloatArray11[3] = 0.0F;
			this.aClass155_Sub1_39.anOpengl1.glTexGenfv(8194, 9473, Static112.aFloatArray11, 0);
		} else {
			this.aClass155_Sub1_39.method3585(this.aClass152_1.aClass30_Sub3Array2[0]);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()V")
	@Override
	public void method5361() {
		@Pc(3) opengl local3 = this.aClass155_Sub1_39.anOpengl1;
		this.aClass151_1.method3279('\u0001');
		if (this.aClass155_Sub1_39.anInt3879 > 0) {
			this.aClass155_Sub1_39.method3590(1);
			this.aClass155_Sub1_39.method3585(null);
			this.aClass155_Sub1_39.method3615(1.0F, 0.0F);
			this.aClass155_Sub1_39.method3590(0);
		}
		this.aClass155_Sub1_39.method3610(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!bl;)V")
	@Override
	public void method5357(@OriginalArg(0) Class30 arg0) {
	}
}
