import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
	private int anInt2343 = 0;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Lclient!mf;")
	private final Class132 aClass132_1 = new Class132();

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!dc;)V")
	@Override
	public void method3930(@OriginalArg(1) Class51 arg0) {
		super.anInt4507--;
		if (super.anInt4507 < 0) {
			super.anInt4507 = 4999;
		}
		super.aByteArray58[super.anInt4507] = 21;
		super.anObjectArray34[super.anInt4507] = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!dc;B)V")
	@Override
	public void method3920(@OriginalArg(0) Class51 arg0) {
		super.aByteArray58[super.anInt4509] = 20;
		super.anObjectArray34[super.anInt4509] = arg0;
		super.anInt4509++;
		if (super.anInt4509 >= 5000) {
			super.anInt4509 = 0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!dc;I)V")
	@Override
	public void method3929(@OriginalArg(0) Class51 arg0) {
		super.aByteArray58[super.anInt4509] = 21;
		super.anObjectArray34[super.anInt4509] = arg0;
		super.anInt4509++;
		if (super.anInt4509 >= 5000) {
			super.anInt4509 = 0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V")
	@Override
	public void method3926(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public void method3923() {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)V")
	@Override
	public void method3922(@OriginalArg(0) int arg0) {
		super.aByteArray58[super.anInt4509] = (byte) arg0;
		super.anInt4509++;
		if (super.anInt4509 >= 5000) {
			super.anInt4509 = 0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZZLclient!s;F)V")
	@Override
	public void method3927(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class105 arg2, @OriginalArg(4) float arg3) {
		super.aByteArray58[super.anInt4509] = (byte) (arg1 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray34[super.anInt4509] = arg2;
		super.aFloatArray19[super.anInt4509] = arg3;
		super.anInt4509++;
		if (super.anInt4509 >= 5000) {
			super.anInt4509 = 0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
	private void method2167() {
		@Pc(8) int local8 = super.anInt4507++;
		if (super.anInt4507 >= 5000) {
			super.anInt4507 = 0;
		}
		this.anInt2343 = super.aByteArray58[local8];
		@Pc(38) Object local38 = super.anObjectArray34[local8];
		super.anObjectArray34[local8] = null;
		if (this.anInt2343 == 21) {
			Static77.method1591(this.aClass132_1, (Class51) local38);
		} else if (this.anInt2343 == 20) {
			@Pc(58) Class51 local58 = (Class51) local38;
			if (local58.aClass1_Sub1_2 != null) {
				local58.aClass1_Sub1_2.method5754(Static145.aClass37_8);
			}
			if (local58.aClass1_Sub1_1 != null) {
				local58.aClass1_Sub1_1.method5754(Static145.aClass37_8);
			}
			if (local58.aClass1_Sub3_2 != null) {
				local58.aClass1_Sub3_2.method5754(Static145.aClass37_8);
			}
			if (local58.aClass1_Sub3_1 != null) {
				local58.aClass1_Sub3_1.method5754(Static145.aClass37_8);
			}
			if (local58.aClass1_Sub4_1 != null) {
				local58.aClass1_Sub4_1.method5754(Static145.aClass37_8);
			}
			for (@Pc(109) Class11 local109 = local58.aClass11_2; local109 != null; local109 = local109.aClass11_1) {
				local109.aClass1_Sub2_1.method5754(Static145.aClass37_8);
			}
			return;
		} else if (this.anInt2343 < 30 || this.anInt2343 > 33) {
			if (this.anInt2343 >= 40 && this.anInt2343 <= 43) {
				Static145.aClass37_8.method3662(3000.0F, super.aFloatArray19[local8] * 1.5F);
				((Class105) local38).method4451(Static250.anInt5229, Static328.anInt6686, Static26.anInt3838, Static162.aBooleanArrayArray4, this.anInt2343 - 40 == 0);
				return;
			}
			if (this.anInt2343 == 22) {
				Static145.aClass37_8.method3656();
				return;
			}
			if (this.anInt2343 == 23) {
				Static145.aClass37_8.method3747();
				return;
			}
			if (this.anInt2343 == 24) {
				Static145.aClass37_8.method3652(0, null);
				return;
			}
		} else {
			Static145.aClass37_8.method3662(3000.0F, super.aFloatArray19[local8] * 1.5F);
			((Class105) local38).method4451(Static250.anInt5229, Static328.anInt6686, Static26.anInt3838, Static148.aBooleanArrayArray3, this.anInt2343 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	@Override
	public void method3924() {
		while (super.anInt4507 != super.anInt4509) {
			this.method2167();
		}
	}
}
