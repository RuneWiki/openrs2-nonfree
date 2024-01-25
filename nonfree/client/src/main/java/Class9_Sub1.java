import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	private int anInt7771 = 0;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!pt;")
	private final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	@Override
	public void method6061() {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
	@Override
	public void method6067(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!ut;)V")
	@Override
	public void method6064(@OriginalArg(1) Class252 arg0) {
		super.aByteArray96[super.anInt7829] = 21;
		super.anObjectArray36[super.anInt7829] = arg0;
		super.anInt7829++;
		if (super.anInt7829 >= 5000) {
			super.anInt7829 = 0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	@Override
	public void method6063() {
		while (super.anInt7829 != super.anInt7827) {
			this.method6004();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILclient!ut;)V")
	@Override
	public void method6068(@OriginalArg(1) Class252 arg0) {
		super.aByteArray96[super.anInt7829] = 20;
		super.anObjectArray36[super.anInt7829] = arg0;
		super.anInt7829++;
		if (super.anInt7829 >= 5000) {
			super.anInt7829 = 0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ut;I)V")
	@Override
	public void method6066(@OriginalArg(0) Class252 arg0) {
		super.anInt7827--;
		if (super.anInt7827 < 0) {
			super.anInt7827 = 4999;
		}
		super.aByteArray96[super.anInt7827] = 21;
		super.anObjectArray36[super.anInt7827] = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ya;IZFI)V")
	@Override
	public void method6065(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3) {
		super.aByteArray96[super.anInt7829] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray36[super.anInt7829] = arg0;
		super.aFloatArray33[super.anInt7829] = arg3;
		super.anInt7829++;
		if (super.anInt7829 >= 5000) {
			super.anInt7829 = 0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	private void method6004() {
		@Pc(8) int local8 = super.anInt7827++;
		if (super.anInt7827 >= 5000) {
			super.anInt7827 = 0;
		}
		this.anInt7771 = super.aByteArray96[local8];
		@Pc(32) Object local32 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt7771 == 21) {
			Static249.method3736(this.aClass54_1, (Class252) local32);
		} else if (this.anInt7771 == 20) {
			@Pc(57) Class252 local57 = (Class252) local32;
			if (local57.aClass30_Sub3_3 != null) {
				local57.aClass30_Sub3_3.method5716(Static227.aClass106_8);
			}
			if (local57.aClass30_Sub3_2 != null) {
				local57.aClass30_Sub3_2.method5716(Static227.aClass106_8);
			}
			if (local57.aClass30_Sub2_2 != null) {
				local57.aClass30_Sub2_2.method5716(Static227.aClass106_8);
			}
			if (local57.aClass30_Sub2_3 != null) {
				local57.aClass30_Sub2_3.method5716(Static227.aClass106_8);
			}
			if (local57.aClass30_Sub4_2 != null) {
				local57.aClass30_Sub4_2.method5716(Static227.aClass106_8);
			}
			for (@Pc(100) Class208 local100 = local57.aClass208_3; local100 != null; local100 = local100.aClass208_2) {
				local100.aClass30_Sub1_1.method5716(Static227.aClass106_8);
			}
			return;
		} else if (this.anInt7771 < 30 || this.anInt7771 > 33) {
			if (this.anInt7771 >= 40 && this.anInt7771 <= 43) {
				Static227.aClass106_8.da(3000.0F, super.aFloatArray33[local8] * 1.5F);
				((Class96) local32).method4429(Static166.anInt3464, Static31.anInt2066, Static235.anInt4661, Static166.aBooleanArrayArray2, this.anInt7771 - 40 == 0);
				return;
			}
			if (this.anInt7771 == 22) {
				Static227.aClass106_8.s(-1, 1583160, 40, 127);
				return;
			}
			if (this.anInt7771 == 23) {
				Static227.aClass106_8.n();
				return;
			}
			if (this.anInt7771 == 24) {
				Static227.aClass106_8.method5956(0, null);
				return;
			}
		} else {
			Static227.aClass106_8.da(3000.0F, super.aFloatArray33[local8] * 1.5F);
			((Class96) local32).method4429(Static166.anInt3464, Static31.anInt2066, Static235.anInt4661, Static335.aBooleanArrayArray4, this.anInt7771 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	@Override
	public void method6069(@OriginalArg(1) int arg0) {
		super.aByteArray96[super.anInt7829] = (byte) arg0;
		super.anInt7829++;
		if (super.anInt7829 >= 5000) {
			super.anInt7829 = 0;
		}
	}
}
