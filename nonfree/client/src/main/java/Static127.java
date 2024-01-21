import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	public static int anInt2789;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
	public static int anInt2781 = 0;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "[I")
	public static final int[] anIntArray222 = new int[2048];

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_839 = Static81.method1507("Existing User");

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_840 = Static81.method1507(" seconds)3");

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_841 = Static81.method1507("huffman");

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_842 = Static81.method1507("l");

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
	public static int anInt2788 = 0;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "Lclient!dj;")
	public static Class24 aClass24_843 = aClass24_839;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "Lclient!dj;")
	public static Class24 aClass24_844 = aClass24_840;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)V")
	public static void method2120(@OriginalArg(0) int arg0) {
		Static49.anInt1247 = -1;
		if (arg0 == 37) {
			Static29.aDouble1 = 3.0D;
		} else if (arg0 == 50) {
			Static29.aDouble1 = 4.0D;
		} else if (arg0 == 75) {
			Static29.aDouble1 = 6.0D;
		} else {
			Static29.aDouble1 = 8.0D;
		}
		Static49.anInt1247 = -1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIILclient!wd;IZJ)Z")
	public static boolean method2122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static60.anInt3602 || local4 >= Static18.anInt3874) {
					return false;
				}
				@Pc(25) Class1_Sub8 local25 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt1550 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class51 local49 = new Class51();
		local49.aLong68 = arg11;
		local49.anInt2217 = arg0;
		local49.anInt2214 = arg5;
		local49.anInt2209 = arg6;
		local49.anInt2210 = arg7;
		local49.aClass5_6 = arg8;
		local49.anInt2206 = arg9;
		local49.anInt2213 = arg1;
		local49.anInt2218 = arg2;
		local49.anInt2208 = arg1 + arg3 - 1;
		local49.anInt2205 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static29.aClass1_Sub8ArrayArrayArray1[local124][local92][local95] == null) {
						Static29.aClass1_Sub8ArrayArrayArray1[local124][local92][local95] = new Class1_Sub8(local124, local92, local95);
					}
				}
				@Pc(157) Class1_Sub8 local157 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][local92][local95];
				local157.aClass51Array1[local157.anInt1550] = local49;
				local157.anIntArray131[local157.anInt1550] = local98;
				local157.anInt1546 |= local98;
				local157.anInt1550++;
			}
		}
		if (arg10) {
			Static89.aClass51Array2[Static200.anInt4471++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	public static void method2123() {
		Static38.aClass86_15.method2817();
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	public static void method2124() {
		if (Static15.aClass37_1 != null) {
			@Pc(11) Class37 local11 = Static15.aClass37_1;
			synchronized (Static15.aClass37_1) {
				Static15.aClass37_1 = null;
			}
		}
	}
}
