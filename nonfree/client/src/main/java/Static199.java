import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!de;")
	public static final Class69 aClass69_65 = new Class69(50);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method8149(@OriginalArg(1) Class13 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static148.aBoolean241) {
			local7 = Static100.method1939();
			local9 = Static260.method4303();
		}
		Static561.method7864(Static131.anInt2708, arg0, Static240.anInt9646, local7 + Static441.anInt7238, local9 + Static250.anInt4790);
		Static544.aClass37_8.method6067(-10660793, Static573.aClass345_26.method7951(Static496.anInt7407), -1, Static441.anInt7238 + local7 + 3, local9 + (Static250.anInt4790 - -14));
		@Pc(63) int local63 = local7 + Static186.aClass358_1.method8722();
		@Pc(70) int local70 = Static186.aClass358_1.method8721() + local9;
		@Pc(74) int local74;
		@Pc(97) int local97;
		if (Static193.aBoolean754) {
			local74 = 0;
			for (@Pc(131) Class2_Sub7_Sub20 local131 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6680(); local131 != null; local131 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6673()) {
				local97 = local74 * 16 + Static250.anInt4790 + local9 + 31;
				if (local131.anInt9985 == 1) {
					Static469.method6666(local9 + Static250.anInt4790, (Class2_Sub7_Sub21) local131.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66, -1, local63, Static240.anInt9646, arg0, local70, local7 + Static441.anInt7238, local97, Static131.anInt2708, -256);
				} else {
					Static145.method2604(local70, local97, -256, arg0, local9 + Static250.anInt4790, local63, Static240.anInt9646, local7 + Static441.anInt7238, local131, -1, Static131.anInt2708);
				}
				local74++;
			}
			if (Static429.aClass2_Sub7_Sub20_3 != null) {
				Static561.method7864(Static220.anInt4137, arg0, Static122.anInt2592, Static540.anInt8699, Static573.anInt9360);
				Static544.aClass37_8.method6067(-10660793, Static429.aClass2_Sub7_Sub20_3.aString106, -1, Static540.anInt8699 + 3, Static573.anInt9360 + 14);
				local74 = 0;
				for (@Pc(229) Class2_Sub7_Sub21 local229 = (Class2_Sub7_Sub21) Static429.aClass2_Sub7_Sub20_3.aClass290_13.method6680(); local229 != null; local229 = (Class2_Sub7_Sub21) Static429.aClass2_Sub7_Sub20_3.aClass290_13.method6673()) {
					@Pc(239) int local239 = local74 * 16 + Static573.anInt9360 + 31;
					Static469.method6666(Static573.anInt9360, local229, -1, local63, Static122.anInt2592, arg0, local70, Static540.anInt8699, local239, Static220.anInt4137, -256);
					local74++;
				}
				Static501.method6965(Static573.anInt9360, Static122.anInt2592, Static540.anInt8699, Static220.anInt4137);
			}
		} else {
			local74 = 0;
			for (@Pc(79) Class2_Sub7_Sub21 local79 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local79 != null; local79 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
				local97 = (Static633.anInt10265 - local74 - 1) * 16 + Static250.anInt4790 + local9 + 31;
				local74++;
				Static469.method6666(Static250.anInt4790 + local9, local79, -1, local63, Static240.anInt9646, arg0, local70, local7 + Static441.anInt7238, local97, Static131.anInt2708, -256);
			}
		}
		Static501.method6965(local9 + Static250.anInt4790, Static240.anInt9646, local7 + Static441.anInt7238, Static131.anInt2708);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!d;Lclient!nd;Ljava/awt/Canvas;BIIII)Lclient!ha;")
	public static synchronized Class13 method8159(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 0) {
			return Static47.method1196(arg2, arg5, arg4, arg0);
		} else if (arg6 == 2) {
			return Static277.method4489(arg2, arg0, arg4, arg5);
		} else if (arg6 == 1) {
			return Static7.method100(arg3, arg2, arg0);
		} else if (arg6 == 5) {
			return Static254.method4241(arg3, arg0, arg2, arg1);
		} else if (arg6 == 3) {
			return Static651.method3000(arg3, arg2, arg0, arg1);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
