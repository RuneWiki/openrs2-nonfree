import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "[S")
	public static short[] aShortArray91 = new short[256];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method5967() {
		@Pc(15) Class354 local15 = null;
		try {
			@Pc(21) Class316 local21 = Static372.aClass366_5.method8266("3", false);
			while (local21.anInt9478 == 0) {
				Static214.method3478(1L);
			}
			if (local21.anInt9478 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local15 = (Class354) local21.anObject136;
			@Pc(48) byte[] local48 = new byte[(int) local15.method8081()];
			if (local48.length == 0) {
				Static543.aString213 = "";
				Static570.aString228 = "";
			} else {
				@Pc(69) int local69;
				for (@Pc(56) int local56 = 0; local56 < local48.length; local56 += local69) {
					local69 = local15.method8083(local48.length - local56, local48, local56);
					if (local69 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(90) Class4_Sub13 local90 = new Class4_Sub13(local48);
				@Pc(94) int local94 = local90.method7004();
				if (local94 > 120) {
					throw new RuntimeException("Bad length");
				}
				local90.anInt9170 = local94 + 1;
				if (!local90.method7015()) {
					throw new RuntimeException("Invalid CRC");
				}
				local90.anInt9170 = 1;
				@Pc(123) int local123 = local90.method7004();
				if (local123 > 3) {
					throw new RuntimeException("Invalid version " + local123);
				}
				Static543.aString213 = local90.method7029();
				Static570.aString228 = local90.method7029();
				if (local123 >= 1) {
					Static105.anInt8981 = local90.method7054();
				} else {
					Static105.anInt8981 = Static446.anInt8497;
				}
				if (local123 >= 2) {
					Static66.aLong37 = local90.method7026();
				} else {
					Static66.aLong37 = Static452.aLong234;
				}
				if (local123 < 3) {
					Static517.aString233 = Static172.aString67;
				} else if (local90.method7004() == 1) {
					Static517.aString233 = local90.method7029();
				} else {
					Static517.aString233 = null;
				}
			}
		} catch (@Pc(199) Exception local199) {
			Static543.aString213 = "";
			Static570.aString228 = "";
		}
		try {
			if (local15 != null) {
				local15.method8089();
			}
		} catch (@Pc(210) Exception local210) {
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIBI)V")
	public static void method5969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static299.method4762(false, true, local35);
	}
}
