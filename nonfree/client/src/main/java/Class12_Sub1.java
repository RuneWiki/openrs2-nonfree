import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
	private int anInt2749 = 0;

	@OriginalMember(owner = "client!hv", name = "w", descriptor = "Lclient!sq;")
	private final Class183 aClass183_1 = new Class183();

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	@Override
	public void method4082() {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!rb;)V")
	@Override
	public void method4086(@OriginalArg(1) Class216 arg0) {
		super.aByteArray76[super.anInt5114] = 20;
		super.anObjectArray36[super.anInt5114] = arg0;
		super.anInt5114++;
		if (super.anInt5114 >= 5000) {
			super.anInt5114 = 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!rb;)V")
	@Override
	public void method4091(@OriginalArg(1) Class216 arg0) {
		super.aByteArray76[super.anInt5114] = 21;
		super.anObjectArray36[super.anInt5114] = arg0;
		super.anInt5114++;
		if (super.anInt5114 >= 5000) {
			super.anInt5114 = 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ZILclient!ya;FI)V")
	@Override
	public void method4087(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class139 arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		super.aByteArray76[super.anInt5114] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray36[super.anInt5114] = arg1;
		super.aFloatArray33[super.anInt5114] = arg2;
		super.anInt5114++;
		if (super.anInt5114 >= 5000) {
			super.anInt5114 = 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(ILclient!rb;)V")
	@Override
	public void method4093(@OriginalArg(1) Class216 arg0) {
		super.anInt5117--;
		if (super.anInt5117 < 0) {
			super.anInt5117 = 4999;
		}
		super.aByteArray76[super.anInt5117] = 21;
		super.anObjectArray36[super.anInt5117] = arg0;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
	private void method2200() {
		@Pc(8) int local8 = super.anInt5117++;
		if (super.anInt5117 >= 5000) {
			super.anInt5117 = 0;
		}
		this.anInt2749 = super.aByteArray76[local8];
		@Pc(34) Object local34 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt2749 == 21) {
			Static218.method3116(this.aClass183_1, (Class216) local34);
		} else if (this.anInt2749 == 20) {
			@Pc(65) Class216 local65 = (Class216) local34;
			if (local65.aClass11_Sub3_3 != null) {
				local65.aClass11_Sub3_3.method5182(Static335.aClass117_6);
			}
			if (local65.aClass11_Sub3_2 != null) {
				local65.aClass11_Sub3_2.method5182(Static335.aClass117_6);
			}
			if (local65.aClass11_Sub4_2 != null) {
				local65.aClass11_Sub4_2.method5182(Static335.aClass117_6);
			}
			if (local65.aClass11_Sub4_1 != null) {
				local65.aClass11_Sub4_1.method5182(Static335.aClass117_6);
			}
			if (local65.aClass11_Sub2_2 != null) {
				local65.aClass11_Sub2_2.method5182(Static335.aClass117_6);
			}
			for (@Pc(110) Class259 local110 = local65.aClass259_1; local110 != null; local110 = local110.aClass259_4) {
				local110.aClass11_Sub1_2.method5182(Static335.aClass117_6);
			}
		} else if (this.anInt2749 >= 30 && this.anInt2749 <= 33) {
			Static335.aClass117_6.da(3000.0F, super.aFloatArray33[local8] * 1.5F);
			((Class139) local34).method5362(Static166.anInt2722, Static44.anInt638, Static99.anInt1331, Static84.aBooleanArrayArray3, this.anInt2749 - 30 == 0);
		} else if (this.anInt2749 >= 40 && this.anInt2749 <= 43) {
			Static335.aClass117_6.da(3000.0F, super.aFloatArray33[local8] * 1.5F);
			((Class139) local34).method5362(Static166.anInt2722, Static44.anInt638, Static99.anInt1331, Static81.aBooleanArrayArray2, this.anInt2749 - 40 == 0);
		} else if (this.anInt2749 == 22) {
			Static335.aClass117_6.s(-1, 1583160, 40, 127);
		} else if (this.anInt2749 == 23) {
			Static335.aClass117_6.n();
		} else if (this.anInt2749 == 24) {
			Static335.aClass117_6.method5693(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V")
	@Override
	public void method4085() {
		while (super.anInt5117 != super.anInt5114) {
			this.method2200();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BI)V")
	@Override
	public void method4090(@OriginalArg(1) int arg0) {
		super.aByteArray76[super.anInt5114] = (byte) arg0;
		super.anInt5114++;
		if (super.anInt5114 >= 5000) {
			super.anInt5114 = 0;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)V")
	@Override
	public void method4092(@OriginalArg(1) int arg0) {
	}
}
