import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	private int anInt1581 = 0;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!il;")
	private final Class96 aClass96_1 = new Class96();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!sq;I)V")
	@Override
	public void method2036(@OriginalArg(0) Class194 arg0) {
		super.anInt2315--;
		if (super.anInt2315 < 0) {
			super.anInt2315 = 4999;
		}
		super.aByteArray37[super.anInt2315] = 21;
		super.anObjectArray33[super.anInt2315] = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!sq;)V")
	@Override
	public void method2032(@OriginalArg(1) Class194 arg0) {
		super.aByteArray37[super.anInt2313] = 20;
		super.anObjectArray33[super.anInt2313] = arg0;
		super.anInt2313++;
		if (super.anInt2313 >= 5000) {
			super.anInt2313 = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!sq;)V")
	@Override
	public void method2030(@OriginalArg(1) Class194 arg0) {
		super.aByteArray37[super.anInt2313] = 21;
		super.anObjectArray33[super.anInt2313] = arg0;
		super.anInt2313++;
		if (super.anInt2313 >= 5000) {
			super.anInt2313 = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLclient!ip;FZI)V")
	@Override
	public void method2029(@OriginalArg(1) Class53 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		super.aByteArray37[super.anInt2313] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray33[super.anInt2313] = arg0;
		super.aFloatArray9[super.anInt2313] = arg1;
		super.anInt2313++;
		if (super.anInt2313 >= 5000) {
			super.anInt2313 = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
	@Override
	public void method2034(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V")
	@Override
	public void method2035(@OriginalArg(1) int arg0) {
		super.aByteArray37[super.anInt2313] = (byte) arg0;
		super.anInt2313++;
		if (super.anInt2313 >= 5000) {
			super.anInt2313 = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	@Override
	public void method2033() {
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	@Override
	public void method2031() {
		while (super.anInt2313 != super.anInt2315) {
			this.method1369();
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
	private void method1369() {
		@Pc(8) int local8 = super.anInt2315++;
		if (super.anInt2315 >= 5000) {
			super.anInt2315 = 0;
		}
		this.anInt1581 = super.aByteArray37[local8];
		@Pc(38) Object local38 = super.anObjectArray33[local8];
		super.anObjectArray33[local8] = null;
		if (this.anInt1581 == 21) {
			Static285.method4004(this.aClass96_1, (Class194) local38);
		} else if (this.anInt1581 == 20) {
			@Pc(156) Class194 local156 = (Class194) local38;
			if (local156.aClass17_Sub4_1 != null) {
				local156.aClass17_Sub4_1.method4787(Static20.aClass32_4);
			}
			if (local156.aClass17_Sub4_2 != null) {
				local156.aClass17_Sub4_2.method4787(Static20.aClass32_4);
			}
			if (local156.aClass17_Sub3_1 != null) {
				local156.aClass17_Sub3_1.method4787(Static20.aClass32_4);
			}
			if (local156.aClass17_Sub3_2 != null) {
				local156.aClass17_Sub3_2.method4787(Static20.aClass32_4);
			}
			if (local156.aClass17_Sub5_1 != null) {
				local156.aClass17_Sub5_1.method4787(Static20.aClass32_4);
			}
			for (@Pc(199) Class126 local199 = local156.aClass126_2; local199 != null; local199 = local199.aClass126_1) {
				local199.aClass17_Sub1_1.method4787(Static20.aClass32_4);
			}
		} else if (this.anInt1581 >= 30 && this.anInt1581 <= 33) {
			Static20.aClass32_4.method2225(3000.0F, super.aFloatArray9[local8] * 1.5F);
			((Class53) local38).method2791(Static318.anInt6137, Static204.anInt4305, Static77.anInt2009, Static253.aBooleanArrayArray6, this.anInt1581 - 30 == 0);
		} else if (this.anInt1581 >= 40 && this.anInt1581 <= 43) {
			Static20.aClass32_4.method2225(3000.0F, super.aFloatArray9[local8] * 1.5F);
			((Class53) local38).method2791(Static318.anInt6137, Static204.anInt4305, Static77.anInt2009, Static203.aBooleanArrayArray4, this.anInt1581 - 40 == 0);
		} else if (this.anInt1581 == 22) {
			Static20.aClass32_4.method2138();
		} else if (this.anInt1581 == 23) {
			Static20.aClass32_4.method2162();
		} else if (this.anInt1581 == 24) {
			Static20.aClass32_4.method2236(0, null);
			return;
		}
	}
}
