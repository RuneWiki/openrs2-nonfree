import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	public static void method4264(@OriginalArg(1) int arg0) {
		Static290.method4167();
		Static337.method4680();
		Static136.method2085(true, arg0);
		Static54.method1048(Static8.aClass250_2, Static351.aClass250_88, Static413.aClass167_11);
		Static285.method4134(Static413.aClass167_11, Static8.aClass250_2);
		Static453.method6159();
		Static291.method4181(Static353.aClass2Array19);
		Static174.method2784();
		Static444.method5197();
		if (Static345.anInt5823 == 2) {
			Static393.method5432(3);
		} else if (Static345.anInt5823 == 6) {
			Static393.method5432(7);
		} else if (Static345.anInt5823 == 9) {
			Static393.method5432(10);
			return;
		} else if (Static345.anInt5823 == 1) {
			Static258.method3604(Static8.aClass250_2, Static413.aClass167_11);
			return;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
	public static void method4268() {
		@Pc(7) Class220 local7 = null;
		try {
			@Pc(13) Class181 local13 = Static32.aClass51_1.method1359(false, "3");
			while (local13.anInt5298 == 0) {
				Static83.method1499(1L);
			}
			if (local13.anInt5298 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class220) local13.anObject7;
			@Pc(43) byte[] local43 = new byte[(int) local7.method5189()];
			if (local43.length == 0) {
				Static140.aString37 = "";
				Static223.aString46 = "";
			} else {
				@Pc(63) int local63;
				for (@Pc(51) int local51 = 0; local51 < local43.length; local51 += local63) {
					local63 = local7.method5186(local43.length - local51, local51, local43);
					if (local63 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(89) Class3_Sub25 local89 = new Class3_Sub25(local43);
				@Pc(93) int local93 = local89.method4096();
				if (local93 > 50) {
					throw new RuntimeException("Bad length");
				}
				local89.anInt4974 = local93 + 1;
				if (!local89.method4094()) {
					throw new RuntimeException("Invalid CRC");
				}
				local89.anInt4974 = 1;
				@Pc(122) int local122 = local89.method4096();
				if (local122 != 0) {
					throw new RuntimeException("Invalid version " + local122);
				}
				Static140.aString37 = local89.method4104();
				Static223.aString46 = local89.method4104();
			}
		} catch (@Pc(154) Exception local154) {
			Static223.aString46 = "";
			Static140.aString37 = "";
		}
		try {
			if (local7 != null) {
				local7.method5190();
			}
		} catch (@Pc(165) Exception local165) {
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!wk;)I")
	public static int method4272(@OriginalArg(1) Class1_Sub2_Sub6_Sub2 arg0) {
		@Pc(16) int local16 = arg0.anInt7674;
		@Pc(20) Class142 local20 = arg0.method6189();
		if (arg0.aBoolean507) {
			local16 = arg0.anInt7673;
		} else if (arg0.anInt7586 == local20.anInt4153 || local20.anInt4182 == arg0.anInt7586 || local20.anInt4157 == arg0.anInt7586 || arg0.anInt7586 == local20.anInt4191) {
			local16 = arg0.anInt7653;
		} else if (local20.anInt4175 == arg0.anInt7586 || local20.anInt4176 == arg0.anInt7586 || local20.anInt4181 == arg0.anInt7586 || arg0.anInt7586 == local20.anInt4195) {
			local16 = arg0.anInt7663;
		}
		return local16;
	}
}
