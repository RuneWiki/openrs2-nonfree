import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!we", name = "y", descriptor = "I")
	public static int anInt6040;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "S")
	public static short aShort51 = 256;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray134 = new boolean[100];

	@OriginalMember(owner = "client!we", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!we", name = "z", descriptor = "Lclient!l;")
	public static Class98 aClass98_47 = new Class98(64);

	@OriginalMember(owner = "client!we", name = "A", descriptor = "[Lclient!hg;")
	public static Class3_Sub4_Sub11[] aClass3_Sub4_Sub11Array4 = new Class3_Sub4_Sub11[14];

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Z")
	public static boolean method4938(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
	public static void method4939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static235.method3988(arg0, Static129.anIntArrayArray40[arg2], arg3 + arg1, -arg1 + arg3);
		@Pc(17) int local17 = arg4;
		@Pc(30) int local30 = arg4 * arg4;
		@Pc(32) int local32 = 0;
		@Pc(36) int local36 = arg1 * arg1;
		@Pc(40) int local40 = local30 << 1;
		@Pc(44) int local44 = local36 << 1;
		@Pc(48) int local48 = arg4 << 1;
		@Pc(57) int local57 = local40 + (1 - local48) * local36;
		@Pc(61) int local61 = local36 << 2;
		@Pc(65) int local65 = local30 << 2;
		@Pc(74) int local74 = local30 - local44 * (local48 - 1);
		@Pc(82) int local82 = local40 * 3;
		@Pc(88) int local88 = local61 * (arg4 - 1);
		@Pc(96) int local96 = ((arg4 << 1) - 3) * local44;
		@Pc(102) int local102 = local65;
		while (local17 > 0) {
			if (local57 < 0) {
				while (local57 < 0) {
					local32++;
					local57 += local82;
					local74 += local102;
					local82 += local65;
					local102 += local65;
				}
			}
			if (local74 < 0) {
				local57 += local82;
				local82 += local65;
				local74 += local102;
				local102 += local65;
				local32++;
			}
			local74 += -local96;
			local57 += -local88;
			local88 -= local61;
			local17--;
			@Pc(168) int local168 = arg2 - local17;
			@Pc(173) int local173 = arg2 + local17;
			local96 -= local61;
			@Pc(181) int local181 = arg3 - local32;
			@Pc(185) int local185 = arg3 + local32;
			Static235.method3988(arg0, Static129.anIntArrayArray40[local168], local185, local181);
			Static235.method3988(arg0, Static129.anIntArrayArray40[local173], local185, local181);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method4940(@OriginalArg(1) int arg0) {
		return arg0 >= 0 ? Static295.method4156(arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method4941(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static167.method2785(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(30) int local30;
			for (local30 = local19; arg1 != arg0.charAt(local30); local30++) {
			}
			local15[local17++] = arg0.substring(local19, local30);
			local19 = local30 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IC)Z")
	public static boolean method4943(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
