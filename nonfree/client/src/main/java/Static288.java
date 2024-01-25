import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Lclient!uh;")
	public static Class362 aClass362_2;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "Lclient!pe;")
	public static final Class282 aClass282_26 = new Class282(15, 0, 1, 0);

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_95 = new Class156(122, 7);

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	public static final int anInt5095 = -1;

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
	public static int anInt5097 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V")
	public static void method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class5_Sub1_Sub18 local16 = Static123.method1827((long) arg1, 8);
		local16.method7441();
		local16.anInt8638 = arg3;
		local16.anInt8632 = arg2;
		local16.anInt8635 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!fg;B)I")
	public static int method4583(@OriginalArg(0) Class112 arg0) {
		if (arg0 == Static449.aClass112_3) {
			return 9216;
		} else if (Static131.aClass112_1 == arg0) {
			return 34065;
		} else if (Static403.aClass112_2 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4584(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) String local13 = Static382.method5678(arg0);
		if (local13 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static62.anInt1053; local19++) {
			@Pc(25) String local25 = Static119.aStringArray8[local19];
			@Pc(29) String local29 = Static382.method5678(local25);
			if (Static601.method8248(arg0, local25, local29, local13)) {
				Static62.anInt1053--;
				for (@Pc(42) int local42 = local19; local42 < Static62.anInt1053; local42++) {
					Static119.aStringArray8[local42] = Static119.aStringArray8[local42 + 1];
					Static300.aStringArray27[local42] = Static300.aStringArray27[local42 + 1];
					Static669.aStringArray42[local42] = Static669.aStringArray42[local42 + 1];
					Static600.aStringArray40[local42] = Static600.aStringArray40[local42 + 1];
					Static222.aBooleanArray12[local42] = Static222.aBooleanArray12[local42 + 1];
				}
				Static98.anInt1628 = Static55.anInt959;
				@Pc(103) Class389 local103 = Static120.method1769(false);
				@Pc(109) Class5_Sub41 local109 = Static647.method8905(Static437.aClass381_190, local103.aClass393_2);
				local109.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(arg0));
				local109.aClass5_Sub36_Sub2_1.method7327(arg0);
				local103.method9079(local109);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)[Lclient!mm;")
	public static Class240[] method4586() {
		return new Class240[] { Static515.aClass240_4, Static43.aClass240_2, Static8.aClass240_1 };
	}
}
