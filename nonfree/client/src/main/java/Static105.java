import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_30;

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
	public static int anInt2332 = 0;

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
	public static int anInt2334 = 0;

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
	public static int anInt2335 = 0;

	@OriginalMember(owner = "client!kb", name = "hb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_767 = Static64.method1101("::fpsoff");

	@OriginalMember(owner = "client!kb", name = "ib", descriptor = "Lclient!ia;")
	public static Class51 aClass51_768 = Static64.method1101(" x ");

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)V")
	public static void method1795(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static122.aBooleanArray18[arg0]) {
			return;
		}
		Static111.aClass70_26.method3530(arg0);
		if (Static64.aClass71ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(30) boolean local30 = true;
		for (@Pc(32) int local32 = 0; local32 < Static64.aClass71ArrayArray1[arg0].length; local32++) {
			if (Static64.aClass71ArrayArray1[arg0][local32] != null) {
				if (Static64.aClass71ArrayArray1[arg0][local32].anInt2777 == 2) {
					local30 = false;
				} else {
					Static64.aClass71ArrayArray1[arg0][local32] = null;
				}
			}
		}
		if (local30) {
			Static64.aClass71ArrayArray1[arg0] = null;
		}
		Static122.aBooleanArray18[arg0] = false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!mb;BI)[Lclient!ak;")
	public static Class1_Sub2_Sub1_Sub1[] method1796(@OriginalArg(0) int arg0, @OriginalArg(1) Class70 arg1) {
		return Static36.method640(arg0, arg1) ? Static102.method1686() : null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I")
	public static int method1797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
