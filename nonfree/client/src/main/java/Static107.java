import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public static int anInt2133 = -1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public static int anInt2134 = 1;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public static int anInt2137 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public static void method1639() {
		if (Static4.anInt87 < 0) {
			Static44.anInt939 = -1;
			Static95.anInt1938 = -1;
			Static4.anInt87 = 0;
		}
		if (Static164.anInt3383 < Static4.anInt87) {
			Static95.anInt1938 = -1;
			Static44.anInt939 = -1;
			Static4.anInt87 = Static164.anInt3383;
		}
		if (Static177.anInt3717 < 0) {
			Static177.anInt3717 = 0;
			Static44.anInt939 = -1;
			Static95.anInt1938 = -1;
		}
		if (Static12.anInt239 < Static177.anInt3717) {
			Static95.anInt1938 = -1;
			Static177.anInt3717 = Static12.anInt239;
			Static44.anInt939 = -1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI[II)V")
	public static void method1641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg3 - 1;
		@Pc(19) int local19 = local15 - 7;
		arg0--;
		while (arg0 < local19) {
			@Pc(24) int local24 = arg0 + 1;
			arg2[local24] = arg1;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg1;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg1;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg1;
			@Pc(54) int local54 = local49 + 1;
			arg2[local54] = arg1;
			arg0 = local54 + 1;
			arg2[arg0] = arg1;
		}
		while (arg0 < local15) {
			arg0++;
			arg2[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!pg;)Lclient!ek;")
	public static Class1_Sub1_Sub6 method1643(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(30) Class1_Sub1_Sub6 local30 = new Class1_Sub1_Sub6(arg0.method2125(), arg0.method2125(), arg0.method2178(), arg0.method2178(), arg0.method2140(), arg0.method2142() == 1);
		@Pc(43) int local43 = arg0.method2142();
		for (@Pc(45) int local45 = 0; local45 < local43; local45++) {
			local30.aClass75_6.method2240(new Class1_Sub22(arg0.method2178(), arg0.method2178(), arg0.method2178(), arg0.method2178()));
		}
		local30.method838();
		return local30;
	}
}
