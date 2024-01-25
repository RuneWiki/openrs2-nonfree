import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
	public static int anInt9256;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
	public static int anInt9262 = 0;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([BI)Z")
	public static boolean method7911(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub9 local8 = new Class3_Sub9(arg0);
		@Pc(19) int local19 = local8.method5633();
		if (local19 != 2) {
			return false;
		}
		@Pc(35) boolean local35 = local8.method5633() == 1;
		if (local35) {
			Static327.method5369(local8);
		}
		Static506.method7356(local8);
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public static void method7912(@OriginalArg(0) int arg0) {
		Static128.anInt1667 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static573.anInt6750; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static547.anInt9143; local6++) {
				if (Static567.aClass351ArrayArrayArray4[arg0][local3][local6] == null) {
					Static567.aClass351ArrayArrayArray4[arg0][local3][local6] = new Class351(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I")
	public static int method7914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static616.aShortArrayArray20 == null ? 0 : Static616.aShortArrayArray20[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
	public static String[] method7916(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(10) int local10 = Static402.method6293(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg1.charAt(local25) != arg0; local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}
}
