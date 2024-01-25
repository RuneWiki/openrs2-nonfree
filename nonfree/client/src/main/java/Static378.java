import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	public static int anInt6844;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!sba;I)V")
	public static void method5963(@OriginalArg(0) Class3_Sub7_Sub19 arg0) {
		if (arg0 == null) {
			return;
		}
		Static544.aClass216_66.method5449(arg0);
		Static285.anInt7798++;
		@Pc(39) Class3_Sub7_Sub13 local39;
		if (arg0.aBoolean624 || "".equals(arg0.aString83)) {
			local39 = new Class3_Sub7_Sub13(arg0.aString83);
			Static334.anInt6266++;
		} else {
			@Pc(33) long local33 = arg0.aLong228;
			for (local39 = (Class3_Sub7_Sub13) Static166.aClass25_17.method426(local33); local39 != null && !local39.aString35.equals(arg0.aString83); local39 = (Class3_Sub7_Sub13) Static166.aClass25_17.method429()) {
			}
			if (local39 == null) {
				local39 = (Class3_Sub7_Sub13) Static614.aClass136_70.method3134(local33);
				if (local39 != null && !local39.aString35.equals(arg0.aString83)) {
					local39 = null;
				}
				if (local39 == null) {
					local39 = new Class3_Sub7_Sub13(arg0.aString83);
				}
				Static166.aClass25_17.method434(local33, local39);
				Static334.anInt6266++;
			}
		}
		if (local39.method3989(arg0)) {
			Static130.method2309(local39);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!ni;I)V")
	public static void method5964(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub2_Sub1_Sub2 arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (arg1.anInt10171 > Static304.anInt8391) {
			Static143.method2418(arg1);
		} else if (Static304.anInt8391 <= arg1.anInt10221) {
			Static430.method6553(arg1);
		} else {
			Static54.method986(false, arg1);
			local13 = Static98.anInt2005;
			local11 = Static6.anInt81;
		}
		@Pc(122) int local122;
		if (arg1.anInt10152 < 512 || arg1.anInt10158 < 512 || arg1.anInt10152 >= Static399.anInt7121 * 512 - 512 || arg1.anInt10158 >= Static24.anInt345 * 512 - 512) {
			arg1.anInt10193 = -1;
			arg1.anIntArray666 = null;
			arg1.anInt10171 = 0;
			arg1.anInt10221 = 0;
			local11 = -1;
			local13 = 0;
			arg1.anInt10152 = arg1.anIntArray675[0] * 512 + arg1.method8619() * 256;
			arg1.anInt10158 = arg1.anIntArray676[0] * 512 + arg1.method8619() * 256;
			arg1.method8631();
			for (local122 = 0; local122 < arg1.aClass380Array3.length; local122++) {
				arg1.aClass380Array3[local122].anInt10136 = -1;
			}
		}
		if (arg1 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 && (arg1.anInt10152 < 6144 || arg1.anInt10158 < 6144 || Static399.anInt7121 * 512 - 6144 <= arg1.anInt10152 || Static24.anInt345 * 512 - 6144 <= arg1.anInt10158)) {
			arg1.anInt10171 = 0;
			local13 = 0;
			arg1.anIntArray666 = null;
			local11 = -1;
			arg1.anInt10221 = 0;
			arg1.anInt10193 = -1;
			arg1.anInt10152 = arg1.anIntArray675[0] * 512 + arg1.method8619() * 256;
			arg1.anInt10158 = arg1.anIntArray676[0] * 512 + arg1.method8619() * 256;
			arg1.method8631();
			for (local122 = 0; local122 < arg1.aClass380Array3.length; local122++) {
				arg1.aClass380Array3[local122].anInt10136 = -1;
			}
		}
		local122 = Static41.method737(arg1);
		Static493.method7219(arg1);
		Static26.method367(arg1, local13, local11, local122);
		Static322.method5335(arg1, local11);
		Static606.method8326(arg1);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!aea;IZ)V")
	public static void method5965(@OriginalArg(0) Class3_Sub3_Sub1 arg0) {
		Static189.aClass89_3.method4218(arg0);
		Static53.method974(Static311.aClass343_155, Static155.aClass343_77, Static4.aClass343_7, Static189.aClass89_3, arg0);
	}
}
