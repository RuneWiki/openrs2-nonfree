import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
	public static int anInt2296;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_76 = new Class175("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	public static int anInt2297 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)[B")
	public static byte[] method1774(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub3_Sub16 local15 = (Class3_Sub3_Sub16) Static281.aClass173_2.method4163((long) arg0);
		if (local15 == null) {
			@Pc(20) byte[] local20 = new byte[512];
			@Pc(26) Random local26 = new Random((long) arg0);
			for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
				local20[local28] = (byte) local28;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(46) int local46 = 255 - local40;
				@Pc(51) int local51 = Static36.method851(local26, local46);
				@Pc(55) byte local55 = local20[local51];
				local20[local51] = local20[local46];
				local20[local46] = local20[511 - local40] = local55;
			}
			local15 = new Class3_Sub3_Sub16(local20);
			Static281.aClass173_2.method4159(local15, (long) arg0);
		}
		return local15.aByteArray59;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public static String method1777(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static206.aClass175_134.method4201(Static216.anInt4257) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static410.aClass175_229.method4201(Static216.anInt4257) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
