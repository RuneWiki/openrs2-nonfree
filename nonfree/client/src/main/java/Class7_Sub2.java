import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	private int anInt1224 = 0;

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "Lclient!pt;")
	private final Class180 aClass180_1 = new Class180();

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	private void method1159() {
		@Pc(12) int local12 = super.anInt1211++;
		if (super.anInt1211 >= 5000) {
			super.anInt1211 = 0;
		}
		this.anInt1224 = super.aByteArray24[local12];
		@Pc(38) Object local38 = super.anObjectArray3[local12];
		super.anObjectArray3[local12] = null;
		if (this.anInt1224 == 21) {
			Static511.method7316(this.aClass180_1, (Class290) local38);
		} else if (this.anInt1224 == 20) {
			@Pc(54) Class290 local54 = (Class290) local38;
			if (local54.aClass6_Sub2_2 != null) {
				local54.aClass6_Sub2_2.method7746(Static263.aClass5_9);
			}
			if (local54.aClass6_Sub2_3 != null) {
				local54.aClass6_Sub2_3.method7746(Static263.aClass5_9);
			}
			if (local54.aClass6_Sub4_3 != null) {
				local54.aClass6_Sub4_3.method7746(Static263.aClass5_9);
			}
			if (local54.aClass6_Sub4_2 != null) {
				local54.aClass6_Sub4_2.method7746(Static263.aClass5_9);
			}
			if (local54.aClass6_Sub3_2 != null) {
				local54.aClass6_Sub3_2.method7746(Static263.aClass5_9);
			}
			for (@Pc(97) Class98 local97 = local54.aClass98_3; local97 != null; local97 = local97.aClass98_1) {
				local97.aClass6_Sub1_1.method7746(Static263.aClass5_9);
			}
		} else if (this.anInt1224 >= 30 && this.anInt1224 <= 33) {
			((Class52) local38).method7828(Static227.anInt4884, Static320.anInt6157, Static345.anInt6586, Static30.aBooleanArrayArray3, this.anInt1224 - 30 == 0);
		} else if (this.anInt1224 >= 40 && this.anInt1224 <= 43) {
			((Class52) local38).method7828(Static227.anInt4884, Static320.anInt6157, Static345.anInt6586, Static131.aBooleanArrayArray4, this.anInt1224 - 40 == 0);
		} else if (this.anInt1224 == 22) {
			Static263.aClass5_9.AA(-1, 1583160, 40, 127);
		} else if (this.anInt1224 == 23) {
			Static263.aClass5_9.k();
		} else if (this.anInt1224 == 24) {
			Static263.aClass5_9.method7460(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
	@Override
	public void method1155() {
		while (super.anInt1211 != super.anInt1209) {
			this.method1159();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!d;IBZ)V")
	@Override
	public void method1156(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		super.aByteArray24[super.anInt1209] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray3[super.anInt1209] = arg0;
		super.anInt1209++;
		if (super.anInt1209 >= 5000) {
			super.anInt1209 = 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLclient!uaa;)V")
	@Override
	public void method1150(@OriginalArg(1) Class290 arg0) {
		super.aByteArray24[super.anInt1209] = 21;
		super.anObjectArray3[super.anInt1209] = arg0;
		super.anInt1209++;
		if (super.anInt1209 >= 5000) {
			super.anInt1209 = 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method1153(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	@Override
	public void method1152() {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!uaa;B)V")
	@Override
	public void method1157(@OriginalArg(0) Class290 arg0) {
		super.aByteArray24[super.anInt1209] = 20;
		super.anObjectArray3[super.anInt1209] = arg0;
		super.anInt1209++;
		if (super.anInt1209 >= 5000) {
			super.anInt1209 = 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	@Override
	public void method1154(@OriginalArg(1) int arg0) {
		super.aByteArray24[super.anInt1209] = (byte) arg0;
		super.anInt1209++;
		if (super.anInt1209 >= 5000) {
			super.anInt1209 = 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!uaa;Z)V")
	@Override
	public void method1151(@OriginalArg(0) Class290 arg0) {
		super.anInt1211--;
		if (super.anInt1211 < 0) {
			super.anInt1211 = 4999;
		}
		super.aByteArray24[super.anInt1211] = 21;
		super.anObjectArray3[super.anInt1211] = arg0;
	}
}
