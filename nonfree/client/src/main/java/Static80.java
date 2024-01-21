import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Lclient!nb;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
	public static int anInt1806;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "[I")
	public static final int[] anIntArray174 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	public static int anInt1800 = 1;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_662 = Static161.method2452("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "[I")
	public static final int[] anIntArray175 = new int[32768];

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
	public static final int[] anIntArray176 = new int[1000];

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
	public static int anInt1803 = 0;

	@OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_663 = Static161.method2452("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
	public static int anInt1807 = 0;

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_664 = Static161.method2452("::fpson");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIILclient!ia;IZJ)Z")
	public static boolean method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static210.anInt919 || local4 >= Static31.anInt671) {
					return false;
				}
				@Pc(25) Class5_Sub3 local25 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][local1][local4];
				if (local25 != null && local25.anInt333 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class43 local49 = new Class43();
		local49.aLong102 = arg11;
		local49.anInt1809 = arg0;
		local49.anInt1812 = arg5;
		local49.anInt1818 = arg6;
		local49.anInt1817 = arg7;
		local49.aClass1_4 = arg8;
		local49.anInt1820 = arg9;
		local49.anInt1811 = arg1;
		local49.anInt1816 = arg2;
		local49.anInt1821 = arg1 + arg3 - 1;
		local49.anInt1810 = arg2 + arg4 - 1;
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
					if (Static157.aClass5_Sub3ArrayArrayArray2[local124][local92][local95] == null) {
						Static157.aClass5_Sub3ArrayArrayArray2[local124][local92][local95] = new Class5_Sub3(local124, local92, local95);
					}
				}
				@Pc(157) Class5_Sub3 local157 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][local92][local95];
				local157.aClass43Array1[local157.anInt333] = local49;
				local157.anIntArray22[local157.anInt333] = local98;
				local157.anInt337 |= local98;
				local157.anInt333++;
			}
		}
		if (arg10) {
			Static215.aClass43Array3[Static21.anInt4192++] = local49;
		}
		return true;
	}
}
