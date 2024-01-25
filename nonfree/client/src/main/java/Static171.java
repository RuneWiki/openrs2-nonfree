import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gv", name = "C", descriptor = "[[[Lclient!nj;")
	public static Class206[][][] aClass206ArrayArrayArray1;

	@OriginalMember(owner = "client!gv", name = "H", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(II)V")
	public static void method3325(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub1_Sub4 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class10 local8 = Static53.aClass10Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static60.anInt1677; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static488.anInt8353; local15++) {
						local1 = local8.X(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static246.anInt4759;
							@Pc(32) int local32 = local12 << Static246.anInt4759;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class10 local41 = Static53.aClass10Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ba(local15, local12) - local41.ba(local15, local12);
									@Pc(67) int local67 = local8.ba(local15 + 1, local12) - local41.ba(local15 + 1, local12);
									@Pc(85) int local85 = local8.ba(local15 + 1, local12 + 1) - local41.ba(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ba(local15, local12 + 1) - local41.ba(local15, local12 + 1);
									local41.ya(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method3329(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static283.anInt5580 != 3) {
			Static153.aClass130_5 = new Class130();
			Static153.aClass130_5.anInt4072 = arg1;
			Static153.aClass130_5.aString26 = arg0;
			if (Static363.aClass199_14 != Static359.aClass199_13) {
				Static153.aClass130_5.anInt4073 = Static153.aClass130_5.anInt4072 + 40000;
				Static153.aClass130_5.anInt4074 = Static153.aClass130_5.anInt4072 + 50000;
			}
			if (Static538.aClass50_Sub1Array2.length > arg1 && Static538.aClass50_Sub1Array2[arg1] != null) {
				Static411.anInt7172 = Static538.aClass50_Sub1Array2[arg1].anInt1985;
			}
			return true;
		}
		@Pc(51) String local51 = "";
		if (Static363.aClass199_14 != Static359.aClass199_13) {
			local51 = ":" + (arg1 + 7000);
		}
		@Pc(66) String local66 = "";
		if (Static120.aString18 != null) {
			local66 = "/p=" + Static120.aString18;
		}
		@Pc(119) String local119 = "http://" + arg0 + local51 + "/l=" + Static315.anInt5993 + "/a=" + Static143.anInt3316 + local66 + "/j" + (Static111.aBoolean184 ? "1" : "0") + ",o" + (Static239.aBoolean282 ? "1" : "0") + ",a2";
		try {
			Static496.aClient1.getAppletContext().showDocument(new URL(local119), "_self");
			return true;
		} catch (@Pc(129) Exception local129) {
			return false;
		}
	}
}
