import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static706 {

	@OriginalMember(owner = "client!wfa", name = "M", descriptor = "[J")
	public static long[] aLongArray25;

	@OriginalMember(owner = "client!wfa", name = "K", descriptor = "I")
	public static final int anInt11039 = 4;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BII)Z")
	public static boolean method9215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static393.method5917(arg0, arg1) || Static288.method4390(arg0, arg1);
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(Z)I")
	public static int method9216() {
		return Static607.anInt9860;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)I")
	public static int method9217(@OriginalArg(0) boolean arg0) {
		@Pc(12) int local12 = Static293.anInt5243;
		if (local12 == 0) {
			return arg0 ? 0 : Static575.anInt9444;
		} else if (local12 == 1) {
			return Static575.anInt9444;
		} else if (local12 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZZLjava/lang/String;)Z")
	public static boolean method9218(@OriginalArg(3) String arg0) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		}
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(48) char local48 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local48 == '-') {
					local31 = true;
					continue;
				}
				if (local48 == '+' && true) {
					continue;
				}
			}
			@Pc(114) int local114;
			if (local48 >= '0' && local48 <= '9') {
				local114 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local114 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local114 = local48 - 'W';
			} else {
				return false;
			}
			if (local114 >= 10) {
				return false;
			}
			if (local31) {
				local114 = -local114;
			}
			@Pc(148) int local148 = local114 + local35 * 10;
			if (local35 != local148 / 10) {
				return false;
			}
			local35 = local148;
			local33 = true;
		}
		return local33;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!ffa;Lclient!ffa;I)V")
	public static void method9219(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg1.aClass3_Sub4_67 != null) {
			arg1.method8848();
		}
		arg1.aClass3_Sub4_66 = arg0;
		arg1.aClass3_Sub4_67 = arg0.aClass3_Sub4_67;
		arg1.aClass3_Sub4_67.aClass3_Sub4_66 = arg1;
		arg1.aClass3_Sub4_66.aClass3_Sub4_67 = arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IJIIZILclient!lb;I)V")
	public static void method9220(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class221 arg3) {
		Static713.aClass3_Sub22_Sub5_4 = null;
		Static481.aClass221_127 = arg3;
		Static78.anInt1227 = arg2;
		Static89.anInt1479 = 0;
		Static554.anInt9248 = arg0;
		Static375.aBoolean498 = false;
		Static112.anInt2244 = 1;
		Static114.anInt2270 = 0;
		Static172.anInt3134 = 10000;
		Static482.aLong276 = arg1;
	}
}
