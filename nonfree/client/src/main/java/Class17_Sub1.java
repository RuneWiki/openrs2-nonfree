import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!km;")
	private Class119 aClass119_1;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!bk;")
	private final Class23 aClass23_1;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!fh;")
	private final Class8_Sub3 aClass8_Sub3_1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!sq;Lclient!bk;)V")
	public Class17_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Class23 arg1) {
		super(arg0);
		this.aClass23_1 = arg1;
		this.method446();
		this.aClass8_Sub3_1 = new Class8_Sub3(this.aClass46_Sub2_37, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass8_Sub3_1.method2075();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass23_1.aBoolean28) {
				this.aClass46_Sub2_37.method5251(this.aClass23_1.aClass8_Sub2_2);
				Static19.aFloatArray1[0] = 0.0F;
				Static19.aFloatArray1[1] = 0.0F;
				Static19.aFloatArray1[2] = 0.0F;
				Static19.aFloatArray1[3] = (float) (this.aClass46_Sub2_37.anInt5738 % 4000) / 4000.0F;
				this.aClass46_Sub2_37.anOpengl1.glTexGenfv(8194, 9473, Static19.aFloatArray1, 0);
			} else {
				@Pc(56) int local56 = this.aClass46_Sub2_37.anInt5738 % 4000 * 16 / 4000;
				this.aClass46_Sub2_37.method5251(this.aClass23_1.aClass8_Sub1Array3[local56]);
			}
		} else if (this.aClass23_1.aBoolean28) {
			this.aClass46_Sub2_37.method5251(this.aClass23_1.aClass8_Sub2_2);
			Static19.aFloatArray1[0] = 0.0F;
			Static19.aFloatArray1[1] = 0.0F;
			Static19.aFloatArray1[2] = 0.0F;
			Static19.aFloatArray1[3] = 0.0F;
			this.aClass46_Sub2_37.anOpengl1.glTexGenfv(8194, 9473, Static19.aFloatArray1, 0);
		} else {
			this.aClass46_Sub2_37.method5251(this.aClass23_1.aClass8_Sub1Array3[0]);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
	@Override
	public void method5299() {
		@Pc(3) opengl local3 = this.aClass46_Sub2_37.anOpengl1;
		this.aClass119_1.method3301('\u0001');
		if (this.aClass46_Sub2_37.anInt5753 > 0) {
			this.aClass46_Sub2_37.method5225(1);
			this.aClass46_Sub2_37.method5251(null);
			this.aClass46_Sub2_37.method5211(1.0F, 0.0F);
			this.aClass46_Sub2_37.method5225(0);
		}
		this.aClass46_Sub2_37.method5248(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5301(@OriginalArg(0) boolean arg0) {
		this.aClass46_Sub2_37.method5248(260, 8448);
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
	private void method446() {
		@Pc(3) opengl local3 = this.aClass46_Sub2_37.anOpengl1;
		this.aClass119_1 = new Class119(this.aClass46_Sub2_37, 2);
		this.aClass119_1.method3303(0);
		this.aClass46_Sub2_37.method5225(1);
		this.aClass46_Sub2_37.method5248(7681, 260);
		this.aClass46_Sub2_37.method5261(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass46_Sub2_37.method5225(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass23_1.aBoolean28) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass119_1.method3302();
		this.aClass119_1.method3303(1);
		this.aClass46_Sub2_37.method5225(1);
		this.aClass46_Sub2_37.method5248(8448, 8448);
		this.aClass46_Sub2_37.method5261(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass46_Sub2_37.method5225(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass23_1.aBoolean28) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass119_1.method3302();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!od;)V")
	@Override
	public void method5302(@OriginalArg(0) Class8 arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass46_Sub2_37.anOpengl1;
		if (this.aClass46_Sub2_37.anInt5753 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass46_Sub2_37.anInt5753;
			this.aClass46_Sub2_37.method5225(1);
			Static19.aFloatArray1[0] = 0.0F;
			Static19.aFloatArray1[1] = 0.0F;
			Static19.aFloatArray1[2] = local14;
			Static19.aFloatArray1[3] = this.aClass46_Sub2_37.aFloat133 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static19.aFloatArray1, 0);
			local3.glPopMatrix();
			this.aClass46_Sub2_37.method5211(0.5F, (float) this.aClass46_Sub2_37.anInt5753);
			this.aClass46_Sub2_37.method5251(this.aClass8_Sub3_1);
			this.aClass46_Sub2_37.method5225(0);
		}
		this.aClass119_1.method3301('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()Z")
	@Override
	public boolean method5298() {
		return true;
	}
}
