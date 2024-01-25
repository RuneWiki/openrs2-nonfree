import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!iq", name = "F", descriptor = "Lclient!on;")
	public static Class262 aClass262_2;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)I")
	public static int method3741(@OriginalArg(0) boolean arg0) {
		if (Static137.anIntArray180 == null) {
			return 0;
		} else if (arg0 || Static464.aClass195Array1 == null) {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < Static137.anIntArray180.length; local30++) {
				@Pc(36) int local36 = Static137.anIntArray180[local30];
				if (Static76.aClass384_29.method8883(local36)) {
					local28++;
				}
				if (Static558.aClass384_124.method8883(local36)) {
					local28++;
				}
			}
			return local28;
		} else {
			return Static137.anIntArray180.length * 2;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBII)Lclient!pf;")
	public static Class5_Sub40 method3743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class5_Sub40 local5 = null;
		if (arg0 == 0) {
			local5 = Static25.method507(Static98.aClass208_2, Static535.aClass181_75);
		}
		if (arg0 == 1) {
			local5 = Static25.method507(Static98.aClass208_2, Static527.aClass181_92);
		}
		local5.aClass5_Sub12_Sub2_2.method8604(Static622.anInt10087 + arg1);
		local5.aClass5_Sub12_Sub2_2.method8638(Static600.aClass38_1.method799(82) ? 1 : 0);
		local5.aClass5_Sub12_Sub2_2.method8604(Static113.anInt1785 + arg2);
		Static269.anInt1227 = arg2;
		Static119.anInt1885 = arg1;
		Static647.aBoolean840 = false;
		Static162.method2436();
		return local5;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;I)Z")
	public static boolean method3744(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static214.aClass192_1.aBoolean389) {
			Static282.aClass109_2 = new Class109();
			Static282.aClass109_2.aString44 = arg0;
			Static282.aClass109_2.anInt2756 = arg1;
			if (Static363.aClass346_4 != Static34.aClass346_2) {
				Static282.aClass109_2.anInt2759 = Static282.aClass109_2.anInt2756 + 40000;
				Static282.aClass109_2.anInt2758 = Static282.aClass109_2.anInt2756 + 50000;
			}
			for (@Pc(35) int local35 = 0; local35 < Static106.aClass166_Sub1Array1.length; local35++) {
				if (Static106.aClass166_Sub1Array1[local35].anInt8518 == arg1) {
					Static41.anInt706 = Static106.aClass166_Sub1Array1[local35].anInt8510;
				}
			}
			return true;
		}
		@Pc(73) String local73 = "";
		if (Static34.aClass346_2 != Static363.aClass346_4) {
			local73 = ":" + (arg1 + 7000);
		}
		@Pc(88) String local88 = "";
		if (Static604.aString143 != null) {
			local88 = "/p=" + Static604.aString143;
		}
		@Pc(136) String local136 = "http://" + arg0 + local73 + "/l=" + Static321.anInt5554 + "/a=" + Static141.anInt2321 + local88 + "/j" + (Static297.aBoolean391 ? "1" : "0") + ",o" + (Static259.aBoolean174 ? "1" : "0") + ",a2";
		try {
			Static108.aClient1.getAppletContext().showDocument(new URL(local136), "_self");
			return true;
		} catch (@Pc(146) Exception local146) {
			return false;
		}
	}
}
