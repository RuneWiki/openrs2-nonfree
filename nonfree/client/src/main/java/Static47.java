import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "Lclient!qi;")
	public static final Class188 aClass188_1 = new Class188();

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
	public static void method800(@OriginalArg(0) int arg0) {
		Static201.anInt3737 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static377.anInt6467; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static378.anInt6480; local6++) {
				if (Static268.aClass211ArrayArrayArray4[arg0][local3][local6] == null) {
					Static268.aClass211ArrayArrayArray4[arg0][local3][local6] = new Class211(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([SI)[S")
	public static short[] method802(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static460.method4218(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(III)I")
	public static int method803(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(40) int local40 = (arg0 & 0x7F) * 96 >> 7;
			if (local40 < 2) {
				local40 = 2;
			} else if (local40 > 126) {
				local40 = 126;
			}
			return local40 + (arg0 & 0xFF80);
		}
	}
}
