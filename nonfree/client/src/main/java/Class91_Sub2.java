import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class91_Sub2 extends Class91 {

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
	private int anInt4230 = 0;

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "Lclient!gg;")
	private final Class76 aClass76_1 = new Class76();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	@Override
	public void method3912() {
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	@Override
	public void method3916() {
		while (super.anInt4216 != super.anInt4213) {
			this.method3925();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V")
	@Override
	public void method3919(@OriginalArg(1) int arg0) {
		super.aByteArray58[super.anInt4216] = (byte) arg0;
		super.anInt4216++;
		if (super.anInt4216 >= 5000) {
			super.anInt4216 = 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(Lclient!r;B)V")
	@Override
	public void method3920(@OriginalArg(0) Class174 arg0) {
		super.aByteArray58[super.anInt4216] = 20;
		super.anObjectArray5[super.anInt4216] = arg0;
		super.anInt4216++;
		if (super.anInt4216 >= 5000) {
			super.anInt4216 = 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method3911(@OriginalArg(0) Class174 arg0) {
		super.aByteArray58[super.anInt4216] = 21;
		super.anObjectArray5[super.anInt4216] = arg0;
		super.anInt4216++;
		if (super.anInt4216 >= 5000) {
			super.anInt4216 = 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(FLclient!dn;ZII)V")
	@Override
	public void method3918(@OriginalArg(0) float arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		super.aByteArray58[super.anInt4216] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray5[super.anInt4216] = arg1;
		super.aFloatArray17[super.anInt4216] = arg0;
		super.anInt4216++;
		if (super.anInt4216 >= 5000) {
			super.anInt4216 = 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	private void method3925() {
		@Pc(8) int local8 = super.anInt4213++;
		if (super.anInt4213 >= 5000) {
			super.anInt4213 = 0;
		}
		this.anInt4230 = super.aByteArray58[local8];
		@Pc(38) Object local38 = super.anObjectArray5[local8];
		super.anObjectArray5[local8] = null;
		if (this.anInt4230 == 21) {
			Static4.method72(this.aClass76_1, (Class174) local38);
		} else if (this.anInt4230 == 20) {
			@Pc(62) Class174 local62 = (Class174) local38;
			if (local62.aClass4_Sub3_2 != null) {
				local62.aClass4_Sub3_2.method5899(Static42.aClass55_3);
			}
			if (local62.aClass4_Sub3_1 != null) {
				local62.aClass4_Sub3_1.method5899(Static42.aClass55_3);
			}
			if (local62.aClass4_Sub1_2 != null) {
				local62.aClass4_Sub1_2.method5899(Static42.aClass55_3);
			}
			if (local62.aClass4_Sub1_1 != null) {
				local62.aClass4_Sub1_1.method5899(Static42.aClass55_3);
			}
			if (local62.aClass4_Sub4_1 != null) {
				local62.aClass4_Sub4_1.method5899(Static42.aClass55_3);
			}
			for (@Pc(105) Class84 local105 = local62.aClass84_3; local105 != null; local105 = local105.aClass84_2) {
				local105.aClass4_Sub5_1.method5899(Static42.aClass55_3);
			}
		} else if (this.anInt4230 >= 30 && this.anInt4230 <= 33) {
			Static42.aClass55_3.method5156(3000.0F, super.aFloatArray17[local8] * 1.5F);
			((Class51) local38).method1842(Static66.anInt5817, Static150.anInt2937, Static257.anInt5067, Static172.aBooleanArrayArray6, this.anInt4230 - 30 == 0);
		} else if (this.anInt4230 >= 40 && this.anInt4230 <= 43) {
			Static42.aClass55_3.method5156(3000.0F, super.aFloatArray17[local8] * 1.5F);
			((Class51) local38).method1842(Static66.anInt5817, Static150.anInt2937, Static257.anInt5067, Static206.aBooleanArrayArray5, this.anInt4230 - 40 == 0);
		} else if (this.anInt4230 == 22) {
			Static42.aClass55_3.method5234();
		} else if (this.anInt4230 == 23) {
			Static42.aClass55_3.method5224();
			return;
		} else if (this.anInt4230 == 24) {
			Static42.aClass55_3.method5172(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
	@Override
	public void method3913(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method3915(@OriginalArg(1) Class174 arg0) {
		super.anInt4213--;
		if (super.anInt4213 < 0) {
			super.anInt4213 = 4999;
		}
		super.aByteArray58[super.anInt4213] = 21;
		super.anObjectArray5[super.anInt4213] = arg0;
	}
}
