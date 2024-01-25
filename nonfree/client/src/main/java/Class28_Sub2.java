import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
	private int anInt5540 = 0;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!vh;")
	private final Class184 aClass184_1 = new Class184();

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ta;IIFZ)V")
	@Override
	public void method4505(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray71[super.anInt5529] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray36[super.anInt5529] = arg0;
		super.aFloatArray26[super.anInt5529] = arg2;
		super.anInt5529++;
		if (super.anInt5529 >= 5000) {
			super.anInt5529 = 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(ILclient!ev;)V")
	@Override
	public void method4507(@OriginalArg(1) Class75 arg0) {
		super.anInt5532--;
		if (super.anInt5532 < 0) {
			super.anInt5532 = 4999;
		}
		super.aByteArray71[super.anInt5532] = 21;
		super.anObjectArray36[super.anInt5532] = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	@Override
	public void method4504(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ev;I)V")
	@Override
	public void method4502(@OriginalArg(0) Class75 arg0) {
		super.aByteArray71[super.anInt5529] = 20;
		super.anObjectArray36[super.anInt5529] = arg0;
		super.anInt5529++;
		if (super.anInt5529 >= 5000) {
			super.anInt5529 = 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
	private void method4510() {
		@Pc(8) int local8 = super.anInt5532++;
		if (super.anInt5532 >= 5000) {
			super.anInt5532 = 0;
		}
		this.anInt5540 = super.aByteArray71[local8];
		@Pc(34) Object local34 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt5540 == 21) {
			Static51.method679(this.aClass184_1, (Class75) local34);
		} else if (this.anInt5540 == 20) {
			@Pc(169) Class75 local169 = (Class75) local34;
			if (local169.aClass8_Sub2_1 != null) {
				local169.aClass8_Sub2_1.method5877(Static323.aClass135_12);
			}
			if (local169.aClass8_Sub2_2 != null) {
				local169.aClass8_Sub2_2.method5877(Static323.aClass135_12);
			}
			if (local169.aClass8_Sub5_2 != null) {
				local169.aClass8_Sub5_2.method5877(Static323.aClass135_12);
			}
			if (local169.aClass8_Sub5_1 != null) {
				local169.aClass8_Sub5_1.method5877(Static323.aClass135_12);
			}
			if (local169.aClass8_Sub4_1 != null) {
				local169.aClass8_Sub4_1.method5877(Static323.aClass135_12);
			}
			for (@Pc(214) Class251 local214 = local169.aClass251_2; local214 != null; local214 = local214.aClass251_3) {
				local214.aClass8_Sub3_2.method5877(Static323.aClass135_12);
			}
		} else if (this.anInt5540 >= 30 && this.anInt5540 <= 33) {
			Static323.aClass135_12.g(3000.0F, super.aFloatArray26[local8] * 1.5F);
			((Class41) local34).method5565(Static32.anInt531, Static150.anInt2733, Static387.anInt6326, Static458.aBooleanArrayArray8, this.anInt5540 - 30 == 0);
		} else if (this.anInt5540 >= 40 && this.anInt5540 <= 43) {
			Static323.aClass135_12.g(3000.0F, super.aFloatArray26[local8] * 1.5F);
			((Class41) local34).method5565(Static32.anInt531, Static150.anInt2733, Static387.anInt6326, Static399.aBooleanArrayArray7, this.anInt5540 - 40 == 0);
		} else if (this.anInt5540 == 22) {
			Static323.aClass135_12.AA(-1, 1583160, 40, 127);
		} else if (this.anInt5540 == 23) {
			Static323.aClass135_12.l();
		} else if (this.anInt5540 == 24) {
			Static323.aClass135_12.method5359(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!ev;)V")
	@Override
	public void method4501(@OriginalArg(1) Class75 arg0) {
		super.aByteArray71[super.anInt5529] = 21;
		super.anObjectArray36[super.anInt5529] = arg0;
		super.anInt5529++;
		if (super.anInt5529 >= 5000) {
			super.anInt5529 = 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	@Override
	public void method4506() {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	@Override
	public void method4499(@OriginalArg(1) int arg0) {
		super.aByteArray71[super.anInt5529] = (byte) arg0;
		super.anInt5529++;
		if (super.anInt5529 >= 5000) {
			super.anInt5529 = 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	@Override
	public void method4503() {
		while (super.anInt5529 != super.anInt5532) {
			this.method4510();
		}
	}
}
