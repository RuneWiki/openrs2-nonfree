import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!im", name = "z", descriptor = "Z")
	public static boolean aBoolean433;

	@OriginalMember(owner = "client!im", name = "G", descriptor = "D")
	public static double aDouble4;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "I")
	public static int anInt5375 = -1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method4412(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg1[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg2 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg2; local34 < local30; local34++) {
				@Pc(40) String local40 = arg1[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local32);
			for (@Pc(65) int local65 = arg2; local65 < local30; local65++) {
				@Pc(71) String local71 = arg1[local65];
				if (local71 == null) {
					local63.append("null");
				} else {
					local63.append(local71);
				}
			}
			return local63.toString();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z")
	public static boolean method4413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!sba;II)V")
	public static void method4414(@OriginalArg(0) int arg0, @OriginalArg(1) Class302 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray11 != null) {
			@Pc(22) Class6_Sub29 local22 = new Class6_Sub29();
			local22.aClass302_7 = arg1;
			local22.anObjectArray1 = arg1.anObjectArray11;
			Static435.method6669(local22);
		}
		Static141.aBoolean262 = true;
		Static26.anInt771 = arg0;
		Static38.anInt1411 = arg2;
		Static350.anInt6854 = arg1.anInt8867;
		Static329.anInt6606 = arg1.anInt8915;
		Static541.anInt9362 = arg1.anInt8898;
		Static641.anInt10722 = arg1.anInt8899;
		Static574.anInt9810 = arg1.anInt8906;
		Static580.method8049(arg1);
	}
}
