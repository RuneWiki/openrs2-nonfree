import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "[Lclient!lj;")
	public static Class1_Sub5_Sub6[] aClass1_Sub5_Sub6Array15;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public static int anInt5481;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "[I")
	public static int[] anIntArray601 = new int[1000];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLclient!uo;)V")
	public static void method4550(@OriginalArg(1) Class176 arg0) {
		@Pc(7) Class48 local7 = null;
		try {
			@Pc(12) Class153 local12 = arg0.method4378("runescape");
			while (local12.anInt4614 == 0) {
				Static16.method242(1L);
			}
			if (local12.anInt4614 == 1) {
				local7 = (Class48) local12.anObject6;
				@Pc(49) Class1_Sub13 local49 = Static86.method1719();
				local7.method1175(local49.anInt2018, local49.aByteArray63, 0);
			}
		} catch (@Pc(59) Exception local59) {
		}
		try {
			if (local7 != null) {
				local7.method1174();
			}
		} catch (@Pc(66) Exception local66) {
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(FIBIIIIZI)[[I")
	public static int[][] method4551(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub1_Sub8 local13 = new Class1_Sub1_Sub8();
		local13.anInt710 = (int) (arg0 * 4096.0F);
		local13.aBoolean74 = false;
		local13.anInt717 = 4;
		local13.anInt713 = 3;
		local13.anInt712 = 8;
		local13.method4460();
		Static62.method1108(256, 64);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method662(local9[local48], local48);
		}
		return local9;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I")
	public static int method4552() {
		return Static161.anInt3218;
	}
}
