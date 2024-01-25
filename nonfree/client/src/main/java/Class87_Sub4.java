import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class87_Sub4 extends Class87 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!ja;")
	private final Class114 aClass114_2;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!fa;")
	private final Class72 aClass72_4;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ic;Lclient!ja;)V")
	public Class87_Sub4(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Class114 arg1) {
		super(arg0);
		this.aClass114_2 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl2;
		this.aClass72_4 = new Class72(arg0, 2);
		this.aClass72_4.method1605(0);
		this.aClass48_Sub2_39.method2566(1);
		if (this.aClass114_2.aBoolean250) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass48_Sub2_39.method2566(0);
		this.aClass72_4.method1606();
		this.aClass72_4.method1605(1);
		this.aClass48_Sub2_39.method2566(1);
		if (this.aClass114_2.aBoolean250) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass48_Sub2_39.method2566(0);
		this.aClass72_4.method1606();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	@Override
	public void method5871(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass48_Sub2_39.anOpengl2;
		this.aClass48_Sub2_39.method2566(1);
		if (local35) {
			Static244.aFloatArray23[0] = local27;
			Static244.aFloatArray23[1] = 0.0F;
			Static244.aFloatArray23[2] = 0.0F;
			Static244.aFloatArray23[3] = 0.0F;
		} else {
			Static244.aFloatArray23[0] = 0.0F;
			Static244.aFloatArray23[1] = 0.0F;
			Static244.aFloatArray23[2] = local27;
			Static244.aFloatArray23[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static244.aFloatArray23, 0);
		Static244.aFloatArray23[0] = 0.0F;
		Static244.aFloatArray23[1] = local27;
		Static244.aFloatArray23[2] = 0.0F;
		Static244.aFloatArray23[3] = (float) this.aClass48_Sub2_39.anInt3050 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static244.aFloatArray23, 0);
		if (this.aClass114_2.aBoolean250) {
			Static244.aFloatArray23[0] = 0.0F;
			Static244.aFloatArray23[1] = 0.0F;
			Static244.aFloatArray23[2] = 0.0F;
			Static244.aFloatArray23[3] = (float) this.aClass48_Sub2_39.anInt3050 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static244.aFloatArray23, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass48_Sub2_39.anInt3050 * 16.0F);
			this.aClass48_Sub2_39.method2573(this.aClass114_2.aClass81_Sub2Array1[local127 % 16]);
		}
		this.aClass48_Sub2_39.method2566(0);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
	@Override
	public void method5874() {
		this.aClass72_4.method1604('\u0001');
		this.aClass48_Sub2_39.method2566(1);
		this.aClass48_Sub2_39.method2573(null);
		this.aClass48_Sub2_39.method2566(0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
	@Override
	public void method5872(@OriginalArg(0) boolean arg0) {
		this.aClass72_4.method1604('\u0000');
		if (this.aClass114_2.aBoolean250) {
			this.aClass48_Sub2_39.method2566(1);
			this.aClass48_Sub2_39.method2573(this.aClass114_2.aClass81_Sub1_1);
			this.aClass48_Sub2_39.method2566(0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5870(@OriginalArg(0) Class81 arg0) {
		this.aClass48_Sub2_39.method2573(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5875(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()Z")
	@Override
	public boolean method5873() {
		return true;
	}
}
