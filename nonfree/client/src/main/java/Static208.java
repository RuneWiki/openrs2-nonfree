import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!lb;")
	public static final Class151 aClass151_6 = new Class151("LOCAL", 4);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)I")
	public static int method3231(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(58) char local58;
			if (local17 == '\u0000') {
				local58 = arg0.charAt(local13++);
			} else {
				local58 = local17;
			}
			@Pc(77) char local77;
			if (local19 == '\u0000') {
				local77 = arg2.charAt(local15++);
			} else {
				local77 = local19;
			}
			local17 = Static450.method5994(local58);
			local19 = Static450.method5994(local77);
			local58 = Static49.method843(local58, arg1);
			local77 = Static49.method843(local77, arg1);
			if (local58 != local77 && Character.toUpperCase(local58) != Character.toUpperCase(local77)) {
				local58 = Character.toLowerCase(local58);
				local77 = Character.toLowerCase(local77);
				if (local58 != local77) {
					return Static282.method4004(arg1, local58) - Static282.method4004(arg1, local77);
				}
			}
		}
		@Pc(147) int local147 = Math.min(local8, local11);
		for (@Pc(149) int local149 = 0; local149 < local147; local149++) {
			if (arg1 == 2) {
				local15 = local11 - local149 - 1;
				local13 = local8 - local149 - 1;
			} else {
				local15 = local149;
				local13 = local149;
			}
			@Pc(178) char local178 = arg0.charAt(local13);
			@Pc(182) char local182 = arg2.charAt(local15);
			if (local182 != local178 && Character.toUpperCase(local178) != Character.toUpperCase(local182)) {
				local178 = Character.toLowerCase(local178);
				local182 = Character.toLowerCase(local182);
				if (local182 != local178) {
					return Static282.method4004(arg1, local178) - Static282.method4004(arg1, local182);
				}
			}
		}
		@Pc(227) int local227 = local8 - local11;
		if (local227 != 0) {
			return local227;
		}
		for (@Pc(233) int local233 = 0; local233 < local147; local233++) {
			@Pc(239) char local239 = arg0.charAt(local233);
			@Pc(243) char local243 = arg2.charAt(local233);
			if (local239 != local243) {
				return Static282.method4004(arg1, local239) - Static282.method4004(arg1, local243);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)I")
	public static int method3233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static332.anIntArray551[arg0 & 0x3] : Static39.anIntArray58[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBLclient!jc;I)V")
	public static void method3234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class10_Sub23 local10 = (Class10_Sub23) Static418.aClass163_43.method3620(); local10 != null; local10 = (Class10_Sub23) Static418.aClass163_43.method3621()) {
			if (local10.anInt3989 == arg0 && local10.anInt4002 == arg1 << 7 && local10.anInt4005 == arg3 << 7 && local10.aClass126_1.anInt3798 == arg2.anInt3798) {
				if (local10.aClass10_Sub7_Sub1_2 != null) {
					Static461.aClass10_Sub7_Sub2_5.method1841(local10.aClass10_Sub7_Sub1_2);
					local10.aClass10_Sub7_Sub1_2 = null;
				}
				if (local10.aClass10_Sub7_Sub1_3 != null) {
					Static461.aClass10_Sub7_Sub2_5.method1841(local10.aClass10_Sub7_Sub1_3);
					local10.aClass10_Sub7_Sub1_3 = null;
				}
				local10.method6033();
				return;
			}
		}
	}
}
