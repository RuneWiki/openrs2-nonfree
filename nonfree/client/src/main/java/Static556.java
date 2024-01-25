import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!vaa", name = "I", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_29 = new Class126(14, 1);

	@OriginalMember(owner = "client!vaa", name = "J", descriptor = "I")
	public static final int anInt9447 = 1400;

	@OriginalMember(owner = "client!vaa", name = "L", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_30 = new Class126(15, 4);

	@OriginalMember(owner = "client!vaa", name = "M", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_31 = new Class126(16, -2);

	@OriginalMember(owner = "client!vaa", name = "N", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_32 = new Class126(17, 0);

	@OriginalMember(owner = "client!vaa", name = "O", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_33 = new Class126(18, -2);

	@OriginalMember(owner = "client!vaa", name = "P", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_34 = new Class126(19, -2);

	@OriginalMember(owner = "client!vaa", name = "Q", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_35 = new Class126(20, 6);

	@OriginalMember(owner = "client!vaa", name = "R", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_36 = new Class126(21, 9);

	@OriginalMember(owner = "client!vaa", name = "S", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_37 = new Class126(22, -2);

	@OriginalMember(owner = "client!vaa", name = "T", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_38 = new Class126(23, 4);

	@OriginalMember(owner = "client!vaa", name = "V", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_39 = new Class126(24, -1);

	@OriginalMember(owner = "client!vaa", name = "W", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_40 = new Class126(25, -2);

	@OriginalMember(owner = "client!vaa", name = "X", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_41 = new Class126(26, 0);

	@OriginalMember(owner = "client!vaa", name = "Y", descriptor = "Lclient!hl;")
	public static final Class126 aClass126_42 = new Class126(27, 0);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V")
	public static void method7413(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(11, arg0);
		local8.method7364();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "([BI)Lclient!uda;")
	public static Class3_Sub7_Sub18 method7414(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class3_Sub7_Sub18 local14 = new Class3_Sub7_Sub18();
		@Pc(19) Class3_Sub26 local19 = new Class3_Sub26(arg0);
		local19.anInt8703 = local19.aByteArray213.length - 2;
		@Pc(32) int local32 = local19.method6811();
		@Pc(41) int local41 = local19.aByteArray213.length - local32 - 14;
		local19.anInt8703 = local41;
		@Pc(48) int local48 = local19.method6816();
		local14.anInt9346 = local19.method6811();
		local14.anInt9344 = local19.method6811();
		local14.anInt9342 = local19.method6811();
		local14.anInt9343 = local19.method6811();
		@Pc(76) int local76 = local19.method6814();
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (local76 > 0) {
			local14.aClass297Array1 = new Class297[local76];
			for (local84 = 0; local84 < local76; local84++) {
				local90 = local19.method6811();
				@Pc(97) Class297 local97 = new Class297(Static538.method7366(local90));
				local14.aClass297Array1[local84] = local97;
				while (local90-- > 0) {
					@Pc(110) int local110 = local19.method6816();
					@Pc(116) int local116 = local19.method6816();
					local97.method6537((long) local110, new Class3_Sub2(local116));
				}
			}
		}
		local19.anInt8703 = 0;
		local14.aString241 = local19.method6788();
		local14.anIntArray538 = new int[local48];
		local14.anIntArray539 = new int[local48];
		local14.aStringArray45 = new String[local48];
		local84 = 0;
		while (local41 > local19.anInt8703) {
			local90 = local19.method6811();
			if (local90 == 3) {
				local14.aStringArray45[local84] = local19.method6786().intern();
			} else if (local90 >= 100 || local90 == 21 || local90 == 38 || local90 == 39) {
				local14.anIntArray539[local84] = local19.method6814();
			} else {
				local14.anIntArray539[local84] = local19.method6816();
			}
			local14.anIntArray538[local84++] = local90;
		}
		return local14;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIBI)V")
	public static void method7417(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static428.aByteArrayArrayArray4 = new byte[4][arg1][arg0];
	}
}
