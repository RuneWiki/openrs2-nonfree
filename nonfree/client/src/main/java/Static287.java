import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!vp;")
	public static Class262 aClass262_8;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static final int anInt5022 = 52;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
	public static final int[] anIntArray493 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4051(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static107.anInt2161 >= 100) {
			Static404.method5326(Static370.aClass182_222.method4155(Static191.anInt3842));
			return;
		}
		@Pc(24) String local24 = Static179.method2957(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(29) int local29 = 0; local29 < Static107.anInt2161; local29++) {
			@Pc(39) String local39 = Static179.method2957(Static369.aStringArray44[local29]);
			if (local39 != null && local39.equals(local24)) {
				Static404.method5326(arg1 + Static8.aClass182_6.method4155(Static191.anInt3842));
				return;
			}
			if (Static99.aStringArray17[local29] != null) {
				local69 = Static179.method2957(Static99.aStringArray17[local29]);
				if (local69 != null && local69.equals(local24)) {
					Static404.method5326(arg1 + Static8.aClass182_6.method4155(Static191.anInt3842));
					return;
				}
			}
		}
		for (@Pc(99) int local99 = 0; local99 < Static60.anInt7169; local99++) {
			local69 = Static179.method2957(Static325.aStringArray36[local99]);
			if (local69 != null && local69.equals(local24)) {
				Static404.method5326(Static15.aClass182_15.method4155(Static191.anInt3842) + arg1 + Static424.aClass182_243.method4155(Static191.anInt3842));
				return;
			}
			if (Static347.aStringArray40[local99] != null) {
				@Pc(144) String local144 = Static179.method2957(Static347.aStringArray40[local99]);
				if (local144 != null && local144.equals(local24)) {
					Static404.method5326(Static15.aClass182_15.method4155(Static191.anInt3842) + arg1 + Static424.aClass182_243.method4155(Static191.anInt3842));
					return;
				}
			}
		}
		if (Static179.method2957(Static263.aClass24_Sub3_Sub2_Sub2_4.aString58).equals(local24)) {
			Static404.method5326(Static30.aClass182_26.method4155(Static191.anInt3842));
		} else {
			Static310.method4308(Static257.aClass27_72);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(arg1) + 1);
			Static337.aClass10_Sub8_Sub2_2.method2465(arg1);
			Static337.aClass10_Sub8_Sub2_2.method2458(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIB)I")
	public static int method4052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local11;
	}
}
