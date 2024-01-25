import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public static int anInt1711 = -1;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method1623() {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(13) Class20 local13 = Static531.aClass283_6.method7180("3", false);
			while (local13.anInt593 == 0) {
				Static379.method5233(1L);
			}
			if (local13.anInt593 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class133) local13.anObject2;
			@Pc(50) byte[] local50 = new byte[(int) local7.method3311()];
			if (local50.length == 0) {
				Static316.aString128 = "";
				Static47.aString24 = "";
			} else {
				@Pc(74) int local74;
				for (@Pc(61) int local61 = 0; local61 < local50.length; local61 += local74) {
					local74 = local7.method3309(local50.length - local61, local50, local61);
					if (local74 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(100) Class2_Sub29 local100 = new Class2_Sub29(local50);
				@Pc(104) int local104 = local100.method5170();
				if (local104 > 50) {
					throw new RuntimeException("Bad length");
				}
				local100.anInt6132 = local104 + 1;
				if (!local100.method5171()) {
					throw new RuntimeException("Invalid CRC");
				}
				local100.anInt6132 = 1;
				@Pc(133) int local133 = local100.method5170();
				if (local133 > 1) {
					throw new RuntimeException("Invalid version " + local133);
				}
				Static47.aString24 = local100.method5193();
				Static316.aString128 = local100.method5193();
				if (local133 >= 1) {
					Static338.anInt6263 = local100.method5229();
				} else {
					Static338.anInt6263 = Static224.anInt4041;
				}
			}
		} catch (@Pc(174) Exception local174) {
			Static47.aString24 = "";
			Static316.aString128 = "";
		}
		try {
			if (local7 != null) {
				local7.method3306();
			}
		} catch (@Pc(185) Exception local185) {
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!dda;Lclient!qa;I)V")
	public static void method1624(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class39 arg1) {
		if (Static14.aBoolean20) {
			return;
		}
		arg1.Z(0);
		Static515.aClass35_19 = arg1.method6018(Static558.method6370(arg0, Static277.anInt5010));
		Static515.aClass35_19.method7351((Static461.anInt8348 - Static515.aClass35_19.EA()) / 2, (Static223.anInt3996 - Static515.aClass35_19.ma()) / 2);
		Static193.aClass35_17 = arg1.method6018(Static558.method6370(arg0, Static424.anInt7847));
		Static193.aClass35_17.method7351((Static461.anInt8348 - Static193.aClass35_17.EA()) / 2, 18);
		Static14.aBoolean20 = true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Z")
	public static boolean method1625(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static289.aCharArray7[local12 - 128] != '\u0000';
		}
	}
}
