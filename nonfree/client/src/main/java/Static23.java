import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bn", name = "T", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array2;

	@OriginalMember(owner = "client!bn", name = "W", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array3;

	@OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
	public static int anInt641 = 0;

	@OriginalMember(owner = "client!bn", name = "U", descriptor = "[I")
	public static int[] anIntArray55 = new int[50];

	@OriginalMember(owner = "client!bn", name = "eb", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[112];

	@OriginalMember(owner = "client!bn", name = "fb", descriptor = "I")
	public static int anInt656 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method500(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < Static223.anInt4775; local21++) {
			if (arg0.equalsIgnoreCase(Static280.aStringArray43[local21])) {
				return local21;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!na;)[Lclient!bo;")
	public static Class22[] method501(@OriginalArg(1) Class112 arg0) {
		if (!arg0.method2894()) {
			return new Class22[0];
		}
		@Pc(16) Class47 local16 = arg0.method2898();
		while (local16.anInt1417 == 0) {
			Static312.method4734(10L);
		}
		if (local16.anInt1417 == 2) {
			return new Class22[0];
		}
		@Pc(45) int[] local45 = (int[]) local16.anObject2;
		@Pc(51) Class22[] local51 = new Class22[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(61) Class22 local61 = new Class22();
			local51[local53] = local61;
			local61.anInt660 = local45[local53 << 2];
			local61.anInt661 = local45[(local53 << 2) + 1];
			local61.anInt664 = local45[(local53 << 2) + 2];
			local61.anInt659 = local45[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(II)V")
	public static void method502(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static99.method1656(arg0)) {
			return;
		}
		@Pc(19) Class191[] local19 = Static34.aClass191ArrayArray1[arg0];
		for (@Pc(26) int local26 = 0; local26 < local19.length; local26++) {
			@Pc(38) Class191 local38 = local19[local26];
			if (local38.anObjectArray31 != null) {
				@Pc(47) Class1_Sub27 local47 = new Class1_Sub27();
				local47.aClass191_14 = local38;
				local47.anObjectArray1 = local38.anObjectArray31;
				Static84.method1462(2000000, local47);
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V")
	public static void method503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(9, arg2);
		local8.method4468();
		local8.anInt5849 = arg1;
		local8.anInt5852 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)C")
	public static char method506(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(47) char local47 = Static149.aCharArray4[local12 - 128];
			if (local47 == '\u0000') {
				local47 = '?';
			}
			local12 = local47;
		}
		return (char) local12;
	}
}
