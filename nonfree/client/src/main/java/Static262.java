import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "[S")
	public static short[] aShortArray78;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "Lclient!tq;")
	public static Class191 aClass191_171;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "Lclient!jj;")
	public static Class98 aClass98_7;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array16;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "[I")
	public static final int[] anIntArray392 = new int[14];

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ae;Lclient!na;IIIII)V")
	public static void method4743(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static37.anInt696) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static223.anInt4280) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static160.anInt3244 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class8 local62 = Static275.aClass8ArrayArrayArray4[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static301.aClass73Array31[local17].method4931(local23, local32) + Static301.aClass73Array31[local17].method4931(local23 + 1, local32) + Static301.aClass73Array31[local17].method4931(local23, local32 + 1) + Static301.aClass73Array31[local17].method4931(local23 + 1, local32 + 1)) / 4 - (Static301.aClass73Array31[arg2].method4931(arg3, arg4) + Static301.aClass73Array31[arg2].method4931(arg3 + 1, arg4) + Static301.aClass73Array31[arg2].method4931(arg3, arg4 + 1) + Static301.aClass73Array31[arg2].method4931(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class62_Sub4 local143 = local62.aClass62_Sub4_2;
									@Pc(146) Class62_Sub4 local146 = local62.aClass62_Sub4_1;
									if (local143 != null && local143.method5564()) {
										arg1.method5570(local1, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, local143, (local32 - arg4) * 128 + (1 - arg6) * 64, arg0);
									}
									if (local146 != null && local146.method5564()) {
										arg1.method5570(local1, local140, (local23 - arg3) * 128 + (1 - arg5) * 64, local146, (local32 - arg4) * 128 + (1 - arg6) * 64, arg0);
									}
									for (@Pc(219) Class172 local219 = local62.aClass172_1; local219 != null; local219 = local219.aClass172_4) {
										@Pc(223) Class62_Sub1 local223 = local219.aClass62_Sub1_1;
										if (local223 != null && local223.method5564() && (local23 == local223.aShort84 || local23 == local3) && (local32 == local223.aShort83 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort86 + 1 - local223.aShort84;
											@Pc(260) int local260 = local223.aShort85 + 1 - local223.aShort83;
											arg1.method5570(local1, local140, (local223.aShort84 - arg3) * 128 + (local252 - arg5) * 64, local223, (local223.aShort83 - arg4) * 128 + (local260 - arg6) * 64, arg0);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
	public static void method4744() {
		if (Static345.anInt654 <= 0) {
			Static291.aString57 = "";
			return;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < Static158.aStringArray28.length; local7++) {
			if (Static158.aStringArray28[local7].startsWith("--> ")) {
				@Pc(18) int local18 = ~Static345.anInt654;
				local5++;
				if (local18 == ~local5) {
					Static291.aString57 = Static158.aStringArray28[local7].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!on;)V")
	public static void method4745(@OriginalArg(1) Class146 arg0) {
		if (arg0.anInt4419 == 5 && arg0.anInt4478 != -1) {
			Static165.method3078(Static147.aClass4_2, arg0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)V")
	public static void method4747(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static189.anInt5795 = arg2;
		Static244.aString43 = arg1;
		Static272.aString56 = arg0;
		if (Static244.aString43.equals("") || Static272.aString56.equals("")) {
			Static211.anInt4078 = 3;
		} else if (Static261.anInt5114 == -1) {
			Static156.anInt3177 = 0;
			Static198.anInt3877 = 1;
			Static211.anInt4078 = -3;
			Static220.anInt4245 = 0;
			@Pc(40) Class2_Sub10 local40 = new Class2_Sub10(128);
			local40.method4430(10);
			local40.method4450((int) (Math.random() * 9.9999999E7D));
			local40.method4462(Static10.method376(Static244.aString43));
			local40.method4450((int) (Math.random() * 9.9999999E7D));
			local40.method4443(Static272.aString56);
			local40.method4450((int) (Math.random() * 9.9999999E7D));
			local40.method4405(Static302.aBigInteger2, Static31.aBigInteger1);
			Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
			Static74.aClass2_Sub10_Sub1_2.method4430(24);
			Static74.aClass2_Sub10_Sub1_2.method4430(local40.anInt4807 + 2);
			Static74.aClass2_Sub10_Sub1_2.method4452(569);
			Static74.aClass2_Sub10_Sub1_2.method4418(local40.aByteArray57, local40.anInt4807);
		} else {
			Static40.method946();
		}
	}
}
