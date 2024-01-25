import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
	private int anInt2274 = 0;

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "Lclient!or;")
	private final Class151 aClass151_1 = new Class151();

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
	private void method1852() {
		@Pc(16) int local16 = super.anInt6877++;
		if (super.anInt6877 >= 5000) {
			super.anInt6877 = 0;
		}
		this.anInt2274 = super.aByteArray95[local16];
		@Pc(42) Object local42 = super.anObjectArray35[local16];
		super.anObjectArray35[local16] = null;
		if (this.anInt2274 == 21) {
			Static148.method3991(this.aClass151_1, (Class57) local42);
		} else if (this.anInt2274 == 20) {
			@Pc(62) Class57 local62 = (Class57) local42;
			if (local62.aClass2_Sub4_1 != null) {
				local62.aClass2_Sub4_1.method5409(Static84.aClass92_1);
			}
			if (local62.aClass2_Sub4_2 != null) {
				local62.aClass2_Sub4_2.method5409(Static84.aClass92_1);
			}
			if (local62.aClass2_Sub1_1 != null) {
				local62.aClass2_Sub1_1.method5409(Static84.aClass92_1);
			}
			if (local62.aClass2_Sub1_2 != null) {
				local62.aClass2_Sub1_2.method5409(Static84.aClass92_1);
			}
			if (local62.aClass2_Sub5_1 != null) {
				local62.aClass2_Sub5_1.method5409(Static84.aClass92_1);
			}
			for (@Pc(105) Class95 local105 = local62.aClass95_2; local105 != null; local105 = local105.aClass95_3) {
				local105.aClass2_Sub2_1.method5409(Static84.aClass92_1);
			}
			return;
		} else if (this.anInt2274 < 30 || this.anInt2274 > 33) {
			if (this.anInt2274 >= 40 && this.anInt2274 <= 43) {
				Static84.aClass92_1.method4539(3000.0F, super.aFloatArray30[local16] * 1.5F);
				((Class26) local42).method4993(Static307.anInt3770, Static178.anInt6542, Static226.anInt4752, Static47.aBooleanArrayArray2, this.anInt2274 - 40 == 0);
				return;
			}
			if (this.anInt2274 == 22) {
				Static84.aClass92_1.method4440();
				return;
			}
			if (this.anInt2274 == 23) {
				Static84.aClass92_1.method4446();
				return;
			}
			if (this.anInt2274 == 24) {
				Static84.aClass92_1.method4445(0, null);
				return;
			}
		} else {
			Static84.aClass92_1.method4539(3000.0F, super.aFloatArray30[local16] * 1.5F);
			((Class26) local42).method4993(Static307.anInt3770, Static178.anInt6542, Static226.anInt4752, Static248.aBooleanArrayArray4, this.anInt2274 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	@Override
	public void method5701() {
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	@Override
	public void method5703() {
		while (super.anInt6876 != super.anInt6877) {
			this.method1852();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IB)V")
	@Override
	public void method5711(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class57 arg0) {
		super.aByteArray95[super.anInt6876] = 20;
		super.anObjectArray35[super.anInt6876] = arg0;
		super.anInt6876++;
		if (super.anInt6876 >= 5000) {
			super.anInt6876 = 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!e;)V")
	@Override
	public void method5709(@OriginalArg(1) Class57 arg0) {
		super.aByteArray95[super.anInt6876] = 21;
		super.anObjectArray35[super.anInt6876] = arg0;
		super.anInt6876++;
		if (super.anInt6876 >= 5000) {
			super.anInt6876 = 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)V")
	@Override
	public void method5702(@OriginalArg(0) int arg0) {
		super.aByteArray95[super.anInt6876] = (byte) arg0;
		super.anInt6876++;
		if (super.anInt6876 >= 5000) {
			super.anInt6876 = 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!bl;IFBZ)V")
	@Override
	public void method5708(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray95[super.anInt6876] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray35[super.anInt6876] = arg0;
		super.aFloatArray30[super.anInt6876] = arg2;
		super.anInt6876++;
		if (super.anInt6876 >= 5000) {
			super.anInt6876 = 0;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5700(@OriginalArg(0) Class57 arg0) {
		super.anInt6877--;
		if (super.anInt6877 < 0) {
			super.anInt6877 = 4999;
		}
		super.aByteArray95[super.anInt6877] = 21;
		super.anObjectArray35[super.anInt6877] = arg0;
	}
}
