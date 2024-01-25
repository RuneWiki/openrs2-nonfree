import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
	private int anInt9411 = 0;

	@OriginalMember(owner = "client!vv", name = "C", descriptor = "Lclient!pv;")
	private final Class260 aClass260_1 = new Class260();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!qs;B)V")
	@Override
	public void method7680(@OriginalArg(0) Class276 arg0) {
		super.anInt9401--;
		if (super.anInt9401 < 0) {
			super.anInt9401 = 4999;
		}
		super.aByteArray118[super.anInt9401] = 21;
		super.anObjectArray36[super.anInt9401] = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
	@Override
	public void method7673() {
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!qs;I)V")
	@Override
	public void method7674(@OriginalArg(0) Class276 arg0) {
		super.aByteArray118[super.anInt9399] = 20;
		super.anObjectArray36[super.anInt9399] = arg0;
		super.anInt9399++;
		if (super.anInt9399 >= 5000) {
			super.anInt9399 = 0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BZILclient!d;)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class59 arg2) {
		super.aByteArray118[super.anInt9399] = (byte) (arg0 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray36[super.anInt9399] = arg2;
		super.anInt9399++;
		if (super.anInt9399 >= 5000) {
			super.anInt9399 = 0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	private void method7684() {
		@Pc(12) int local12 = super.anInt9401++;
		if (super.anInt9401 >= 5000) {
			super.anInt9401 = 0;
		}
		this.anInt9411 = super.aByteArray118[local12];
		@Pc(36) Object local36 = super.anObjectArray36[local12];
		super.anObjectArray36[local12] = null;
		if (this.anInt9411 == 21) {
			Static263.method4409(this.aClass260_1, (Class276) local36);
		} else if (this.anInt9411 == 20) {
			@Pc(52) Class276 local52 = (Class276) local36;
			if (local52.aClass4_Sub5_2 != null) {
				local52.aClass4_Sub5_2.method7786(Static394.aClass14_11);
			}
			if (local52.aClass4_Sub5_3 != null) {
				local52.aClass4_Sub5_3.method7786(Static394.aClass14_11);
			}
			if (local52.aClass4_Sub2_3 != null) {
				local52.aClass4_Sub2_3.method7786(Static394.aClass14_11);
			}
			if (local52.aClass4_Sub2_2 != null) {
				local52.aClass4_Sub2_2.method7786(Static394.aClass14_11);
			}
			if (local52.aClass4_Sub3_2 != null) {
				local52.aClass4_Sub3_2.method7786(Static394.aClass14_11);
			}
			for (@Pc(95) Class267 local95 = local52.aClass267_3; local95 != null; local95 = local95.aClass267_2) {
				local95.aClass4_Sub1_2.method7786(Static394.aClass14_11);
			}
			return;
		} else if (this.anInt9411 < 30 || this.anInt9411 > 33) {
			if (this.anInt9411 >= 40 && this.anInt9411 <= 43) {
				((Class59) local36).method7860(Static213.anInt8691, Static117.anInt2704, Static156.anInt3342, Static472.aBooleanArrayArray8, this.anInt9411 - 40 == 0);
				return;
			}
			if (this.anInt9411 == 22) {
				Static394.aClass14_11.AA(-1, 1583160, 40, 127);
				return;
			}
			if (this.anInt9411 == 23) {
				Static394.aClass14_11.k();
				return;
			}
			if (this.anInt9411 == 24) {
				Static394.aClass14_11.method6869(0, null);
				return;
			}
		} else {
			((Class59) local36).method7860(Static213.anInt8691, Static117.anInt2704, Static156.anInt3342, Static211.aBooleanArrayArray2, this.anInt9411 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7678(@OriginalArg(0) int arg0) {
		super.aByteArray118[super.anInt9399] = (byte) arg0;
		super.anInt9399++;
		if (super.anInt9399 >= 5000) {
			super.anInt9399 = 0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILclient!qs;)V")
	@Override
	public void method7676(@OriginalArg(1) Class276 arg0) {
		super.aByteArray118[super.anInt9399] = 21;
		super.anObjectArray36[super.anInt9399] = arg0;
		super.anInt9399++;
		if (super.anInt9399 >= 5000) {
			super.anInt9399 = 0;
		}
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
	@Override
	public void method7677() {
		while (super.anInt9401 != super.anInt9399) {
			this.method7684();
		}
	}
}
