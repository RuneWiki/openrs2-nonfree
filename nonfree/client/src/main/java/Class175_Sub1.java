import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class175_Sub1 extends Class175 {

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
	private int anInt4881 = 0;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Lclient!mh;")
	private final Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZLclient!d;)V")
	@Override
	public void method4155(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class46 arg2) {
		super.aByteArray68[super.anInt4891] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray35[super.anInt4891] = arg2;
		super.anInt4891++;
		if (super.anInt4891 >= 5000) {
			super.anInt4891 = 0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	@Override
	public void method4160() {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	@Override
	public void method4154() {
		while (super.anInt4891 != super.anInt4896) {
			this.method4133();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!hl;)V")
	@Override
	public void method4157(@OriginalArg(1) Class133 arg0) {
		super.aByteArray68[super.anInt4891] = 20;
		super.anObjectArray35[super.anInt4891] = arg0;
		super.anInt4891++;
		if (super.anInt4891 >= 5000) {
			super.anInt4891 = 0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V")
	@Override
	public void method4163(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
	private void method4133() {
		@Pc(8) int local8 = super.anInt4896++;
		if (super.anInt4896 >= 5000) {
			super.anInt4896 = 0;
		}
		this.anInt4881 = super.aByteArray68[local8];
		@Pc(41) Object local41 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt4881 == 21) {
			Static545.method7379(this.aClass128_1, (Class133) local41);
		} else if (this.anInt4881 == 20) {
			@Pc(144) Class133 local144 = (Class133) local41;
			if (local144.aClass15_Sub1_2 != null) {
				local144.aClass15_Sub1_2.method7160(Static276.aClass90_9);
			}
			if (local144.aClass15_Sub1_1 != null) {
				local144.aClass15_Sub1_1.method7160(Static276.aClass90_9);
			}
			if (local144.aClass15_Sub4_2 != null) {
				local144.aClass15_Sub4_2.method7160(Static276.aClass90_9);
			}
			if (local144.aClass15_Sub4_1 != null) {
				local144.aClass15_Sub4_1.method7160(Static276.aClass90_9);
			}
			if (local144.aClass15_Sub3_2 != null) {
				local144.aClass15_Sub3_2.method7160(Static276.aClass90_9);
			}
			for (@Pc(187) Class315 local187 = local144.aClass315_1; local187 != null; local187 = local187.aClass315_3) {
				local187.aClass15_Sub2_2.method7160(Static276.aClass90_9);
			}
		} else if (this.anInt4881 >= 30 && this.anInt4881 <= 33) {
			((Class46) local41).method7967(Static207.anInt3926, Static3.anInt7083, Static2.anInt40, Static528.aBooleanArrayArray9, this.anInt4881 - 30 == 0);
		} else if (this.anInt4881 >= 40 && this.anInt4881 <= 43) {
			((Class46) local41).method7967(Static207.anInt3926, Static3.anInt7083, Static2.anInt40, Static467.aBooleanArrayArray7, this.anInt4881 - 40 == 0);
		} else if (this.anInt4881 == 22) {
			Static276.aClass90_9.AA(-1, 1583160, 40, 127);
		} else if (this.anInt4881 == 23) {
			Static276.aClass90_9.k();
		} else if (this.anInt4881 == 24) {
			Static276.aClass90_9.method7448(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!hl;B)V")
	@Override
	public void method4153(@OriginalArg(0) Class133 arg0) {
		super.aByteArray68[super.anInt4891] = 21;
		super.anObjectArray35[super.anInt4891] = arg0;
		super.anInt4891++;
		if (super.anInt4891 >= 5000) {
			super.anInt4891 = 0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	@Override
	public void method4159(@OriginalArg(0) int arg0) {
		super.aByteArray68[super.anInt4891] = (byte) arg0;
		super.anInt4891++;
		if (super.anInt4891 >= 5000) {
			super.anInt4891 = 0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(ZLclient!hl;)V")
	@Override
	public void method4162(@OriginalArg(1) Class133 arg0) {
		super.anInt4896--;
		if (super.anInt4896 < 0) {
			super.anInt4896 = 4999;
		}
		super.aByteArray68[super.anInt4896] = 21;
		super.anObjectArray35[super.anInt4896] = arg0;
	}
}
