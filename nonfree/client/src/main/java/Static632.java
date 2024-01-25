import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[[[Lclient!qj;")
	public static Class311[][][] aClass311ArrayArrayArray3;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public static int anInt9758;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public static int anInt9753 = -1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!et;)Lclient!ws;")
	public static Class407 method8616(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(7) String local7 = arg0.method8553();
		@Pc(14) Class18 local14 = Static562.method7826()[arg0.method8581(-17416)];
		@Pc(21) Class239 local21 = Static505.method7161()[arg0.method8581(-17416)];
		@Pc(25) int local25 = arg0.method8598();
		@Pc(29) int local29 = arg0.method8598();
		@Pc(33) int local33 = arg0.method8581(-17416);
		@Pc(37) int local37 = arg0.method8581(-17416);
		@Pc(41) int local41 = arg0.method8581(-17416);
		@Pc(45) int local45 = arg0.method8575();
		@Pc(49) int local49 = arg0.method8575();
		@Pc(59) int local59 = arg0.method8555(-9372);
		@Pc(63) int local63 = arg0.method8555(-9372);
		@Pc(67) int local67 = arg0.method8555(-9372);
		return new Class407(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local59, local63, local67);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!jb;B)V")
	public static void method8620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub7 arg2) {
		if (!Static189.aBoolean301) {
			return;
		}
		@Pc(11) int local11 = 0;
		@Pc(26) int local26;
		for (@Pc(17) Class2_Sub6_Sub20 local17 = (Class2_Sub6_Sub20) arg2.aClass388_4.method9213(); local17 != null; local17 = (Class2_Sub6_Sub20) arg2.aClass388_4.method9212()) {
			local26 = Static281.method3945(local17);
			if (local26 > local11) {
				local11 = local26;
			}
		}
		local11 += 8;
		local26 = arg2.anInt4448 * 16 + 21;
		Static563.anInt8853 = arg2.anInt4448 * 16 + (Static437.aBoolean603 ? 26 : 22);
		@Pc(65) int local65 = Static699.anInt10734 + Static216.anInt3440;
		if (Static151.anInt7983 < local11 + local65) {
			local65 = Static216.anInt3440 - local11;
		}
		if (local65 < 0) {
			local65 = 0;
		}
		@Pc(90) int local90 = Static437.aBoolean603 ? 33 : 31;
		@Pc(96) int local96 = arg1 + 13 - local90;
		if (local96 + local26 > Static295.anInt4558) {
			local96 = Static295.anInt4558 - local26;
		}
		Static261.anInt10711 = local65;
		if (local96 < 0) {
			local96 = 0;
		}
		Static18.anInt242 = local11;
		Static555.anInt8749 = local96;
		Static671.aClass2_Sub6_Sub7_1 = arg2;
	}
}
