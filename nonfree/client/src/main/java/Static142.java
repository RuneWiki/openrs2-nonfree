import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
	public static int anInt2719;

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_60 = new Class81(74, 6);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
	public static void method2019() {
		if (Static291.anInt5271 != -1) {
			Static277.method4103(false, -1, -1, Static291.anInt5271);
			Static291.anInt5271 = -1;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIB[B)Ljava/lang/String;")
	public static String method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[local17 + arg1] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(43) char local43 = Static127.aCharArray3[local27 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local27 = local43;
				}
				local8[local15++] = (char) local27;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZIIZI)I")
	public static int method2023(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(18) Class2_Sub44 local18 = Static432.method5828(false, arg2);
		if (local18 == null) {
			return 0;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local18.anIntArray499.length; local26++) {
			if (local18.anIntArray499[local26] >= 0 && Static350.aClass149_2.anInt4314 > local18.anIntArray499[local26]) {
				@Pc(55) Class30 local55 = Static350.aClass149_2.method3483(local18.anIntArray499[local26]);
				@Pc(65) int local65 = local55.method736(arg0, Static150.aClass43_1.method1210(arg0).anInt1781);
				if (arg1) {
					local24 += local65 * local18.anIntArray498[local26];
				} else {
					local24 += local65;
				}
			}
		}
		return local24;
	}
}
