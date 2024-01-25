import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Lclient!de;")
	private final Class44 aClass44_1;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Lclient!el;")
	private final Class57 aClass57_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!po;Lclient!de;)V")
	public Class23_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Class44 arg1) {
		super(arg0);
		this.aClass44_1 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass57_1 = new Class57(arg0, 2);
		this.aClass57_1.method1600(0);
		this.aClass59_Sub1_41.method4273(1);
		if (this.aClass44_1.aBoolean89) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass59_Sub1_41.method4273(0);
		this.aClass57_1.method1599();
		this.aClass57_1.method1600(1);
		this.aClass59_Sub1_41.method4273(1);
		if (this.aClass44_1.aBoolean89) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass59_Sub1_41.method4273(0);
		this.aClass57_1.method1599();
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "()Z")
	@Override
	public boolean method5764() {
		return true;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!fl;)V")
	@Override
	public void method5763(@OriginalArg(0) Class11 arg0) {
		this.aClass59_Sub1_41.method4296(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	public void method5765(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass59_Sub1_41.anOpengl2;
		this.aClass59_Sub1_41.method4273(1);
		if (local35) {
			Static23.aFloatArray1[0] = local27;
			Static23.aFloatArray1[1] = 0.0F;
			Static23.aFloatArray1[2] = 0.0F;
			Static23.aFloatArray1[3] = 0.0F;
		} else {
			Static23.aFloatArray1[0] = 0.0F;
			Static23.aFloatArray1[1] = 0.0F;
			Static23.aFloatArray1[2] = local27;
			Static23.aFloatArray1[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static23.aFloatArray1, 0);
		Static23.aFloatArray1[0] = 0.0F;
		Static23.aFloatArray1[1] = local27;
		Static23.aFloatArray1[2] = 0.0F;
		Static23.aFloatArray1[3] = (float) this.aClass59_Sub1_41.anInt4759 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static23.aFloatArray1, 0);
		if (this.aClass44_1.aBoolean89) {
			Static23.aFloatArray1[0] = 0.0F;
			Static23.aFloatArray1[1] = 0.0F;
			Static23.aFloatArray1[2] = 0.0F;
			Static23.aFloatArray1[3] = (float) this.aClass59_Sub1_41.anInt4759 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static23.aFloatArray1, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass59_Sub1_41.anInt4759 * 16.0F);
			this.aClass59_Sub1_41.method4296(this.aClass44_1.aClass11_Sub1Array3[local127 % 16]);
		}
		this.aClass59_Sub1_41.method4273(0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	@Override
	public void method5762() {
		this.aClass57_1.method1598('\u0001');
		this.aClass59_Sub1_41.method4273(1);
		this.aClass59_Sub1_41.method4296(null);
		this.aClass59_Sub1_41.method4273(0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5766(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5767(@OriginalArg(0) boolean arg0) {
		this.aClass57_1.method1598('\u0000');
		if (this.aClass44_1.aBoolean89) {
			this.aClass59_Sub1_41.method4273(1);
			this.aClass59_Sub1_41.method4296(this.aClass44_1.aClass11_Sub3_1);
			this.aClass59_Sub1_41.method4273(0);
		}
	}
}
