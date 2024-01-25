import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!i", name = "C", descriptor = "I")
	public static int anInt6634;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(FFI[BIILclient!pj;IFFFIB)V")
	public static void method5192(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) Class189 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6, @OriginalArg(10) float arg7) {
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			Static340.method4573(arg7, arg4, arg2, arg6, arg0, arg1, arg3, arg5, local11);
			arg4 += 16384;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5193(@OriginalArg(1) long arg0) {
		Static444.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static444.aCalendar2.get(7);
		@Pc(17) int local17 = Static444.aCalendar2.get(5);
		@Pc(21) int local21 = Static444.aCalendar2.get(2);
		@Pc(25) int local25 = Static444.aCalendar2.get(1);
		@Pc(29) int local29 = Static444.aCalendar2.get(11);
		@Pc(33) int local33 = Static444.aCalendar2.get(12);
		@Pc(42) int local42 = Static444.aCalendar2.get(13);
		return Static6.aStringArray1[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static234.aStringArray21[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Z")
	public static boolean method5194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
	public static void method5195() {
		Static80.aStringArray13 = new String[500];
		Static280.anInt4920 = Static320.aClass79_5.anInt2284 + Static320.aClass79_5.anInt2290 + 2;
		Static32.anInt533 = Static450.aClass79_10.anInt2284 + Static450.aClass79_10.anInt2290 + 2;
		for (@Pc(31) int local31 = 0; local31 < Static80.aStringArray13.length; local31++) {
			Static80.aStringArray13[local31] = "";
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)Z")
	public static boolean method5196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static68.method1345(arg1, arg0) | (arg0 & 0x70000) != 0 || Static214.method3288(arg0, arg1);
	}
}
