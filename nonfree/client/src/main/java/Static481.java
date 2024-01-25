import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_158 = new Class136(91, 4);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!li;)I")
	public static int method6954(@OriginalArg(1) Class5_Sub4_Sub14 arg0) {
		@Pc(12) String local12 = Static172.method2653(arg0);
		@Pc(14) int[] local14 = null;
		if (Static40.method723(arg0.anInt5598)) {
			local14 = Static479.aClass348_1.method8197((int) arg0.aLong165).anIntArray697;
		} else if (arg0.anInt5600 != -1) {
			local14 = Static479.aClass348_1.method8197(arg0.anInt5600).anIntArray697;
		} else if (Static453.method6733(arg0.anInt5598)) {
			@Pc(83) Class5_Sub13 local83 = (Class5_Sub13) Static51.aClass81_11.method1599((long) (int) arg0.aLong165);
			if (local83 != null) {
				@Pc(88) Class14_Sub1_Sub1_Sub3_Sub2 local88 = local83.aClass14_Sub1_Sub1_Sub3_Sub2_1;
				@Pc(91) Class271 local91 = local88.aClass271_1;
				if (local91.anIntArray591 != null) {
					local91 = local91.method6476(Static564.aClass304_1);
				}
				if (local91 != null) {
					local14 = local91.anIntArray589;
				}
			}
		} else if (Static488.method7158(arg0.anInt5598)) {
			@Pc(48) Class283 local48;
			if (arg0.anInt5598 == 1009) {
				local48 = Static525.aClass371_4.method8554((int) arg0.aLong165);
			} else {
				local48 = Static525.aClass371_4.method8554((int) (arg0.aLong165 >>> 32 & 0x7FFFFFFFL));
			}
			if (local48.anIntArray623 != null) {
				local48 = local48.method6858(Static564.aClass304_1);
			}
			if (local48 != null) {
				local14 = local48.anIntArray621;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static605.method8431(local14);
		}
		@Pc(140) int local140 = Static457.aClass298_11.method6968(local12, Static158.aClass44Array7);
		if (arg0.aBoolean474) {
			local140 += Static493.aClass44_21.method5319() + 4;
		}
		return local140;
	}
}
