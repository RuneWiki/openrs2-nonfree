import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
	private int anInt2781 = 0;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Lclient!cp;")
	private final Class51 aClass51_1 = new Class51();

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
	@Override
	public void method3863(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!gn;)V")
	@Override
	public void method3865(@OriginalArg(1) Class125 arg0) {
		super.anInt4580--;
		if (super.anInt4580 < 0) {
			super.anInt4580 = 4999;
		}
		super.aByteArray57[super.anInt4580] = 21;
		super.anObjectArray3[super.anInt4580] = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!gn;Z)V")
	@Override
	public void method3870(@OriginalArg(0) Class125 arg0) {
		super.aByteArray57[super.anInt4579] = 21;
		super.anObjectArray3[super.anInt4579] = arg0;
		super.anInt4579++;
		if (super.anInt4579 >= 5000) {
			super.anInt4579 = 0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V")
	@Override
	public void method3862(@OriginalArg(0) int arg0) {
		super.aByteArray57[super.anInt4579] = (byte) arg0;
		super.anInt4579++;
		if (super.anInt4579 >= 5000) {
			super.anInt4579 = 0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZBLclient!d;I)V")
	@Override
	public void method3866(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2) {
		super.aByteArray57[super.anInt4579] = (byte) (arg0 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray3[super.anInt4579] = arg1;
		super.anInt4579++;
		if (super.anInt4579 >= 5000) {
			super.anInt4579 = 0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	@Override
	public void method3867() {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!gn;I)V")
	@Override
	public void method3868(@OriginalArg(0) Class125 arg0) {
		super.aByteArray57[super.anInt4579] = 20;
		super.anObjectArray3[super.anInt4579] = arg0;
		super.anInt4579++;
		if (super.anInt4579 >= 5000) {
			super.anInt4579 = 0;
		}
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
	private void method2430() {
		@Pc(8) int local8 = super.anInt4580++;
		if (super.anInt4580 >= 5000) {
			super.anInt4580 = 0;
		}
		this.anInt2781 = super.aByteArray57[local8];
		@Pc(34) Object local34 = super.anObjectArray3[local8];
		super.anObjectArray3[local8] = null;
		if (this.anInt2781 == 21) {
			Static386.method6189(this.aClass51_1, (Class125) local34);
		} else if (this.anInt2781 == 20) {
			@Pc(54) Class125 local54 = (Class125) local34;
			if (local54.aClass2_Sub4_1 != null) {
				local54.aClass2_Sub4_1.method8384(Static338.aClass15_11);
			}
			if (local54.aClass2_Sub4_2 != null) {
				local54.aClass2_Sub4_2.method8384(Static338.aClass15_11);
			}
			if (local54.aClass2_Sub3_2 != null) {
				local54.aClass2_Sub3_2.method8384(Static338.aClass15_11);
			}
			if (local54.aClass2_Sub3_1 != null) {
				local54.aClass2_Sub3_1.method8384(Static338.aClass15_11);
			}
			if (local54.aClass2_Sub1_1 != null) {
				local54.aClass2_Sub1_1.method8384(Static338.aClass15_11);
			}
			for (@Pc(99) Class302 local99 = local54.aClass302_1; local99 != null; local99 = local99.aClass302_2) {
				local99.aClass2_Sub2_1.method8384(Static338.aClass15_11);
			}
		} else if (this.anInt2781 >= 30 && this.anInt2781 <= 33) {
			((Class4) local34).method8443(Static342.anInt6991, Static484.anInt9030, Static403.anInt7929, Static331.aBooleanArrayArray3, this.anInt2781 - 30 == 0);
		} else if (this.anInt2781 >= 40 && this.anInt2781 <= 43) {
			((Class4) local34).method8443(Static342.anInt6991, Static484.anInt9030, Static403.anInt7929, Static281.aBooleanArrayArray2, this.anInt2781 - 40 == 0);
		} else if (this.anInt2781 == 22) {
			Static338.aClass15_11.AA(-1, 1583160, 40, 127);
		} else if (this.anInt2781 == 23) {
			Static338.aClass15_11.k();
		} else if (this.anInt2781 == 24) {
			Static338.aClass15_11.method5353(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	@Override
	public void method3864() {
		while (super.anInt4580 != super.anInt4579) {
			this.method2430();
		}
	}
}
