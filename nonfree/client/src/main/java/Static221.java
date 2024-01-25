import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!f;")
	public static Class46 aClass46_13;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public static int anInt5801 = 0;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "[Lclient!fh;")
	public static final Class95[] aClass95Array2 = new Class95[4];

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
	public static final int[] anIntArray449 = new int[1];

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method5004() {
		for (@Pc(3) int local3 = 0; local3 < Static370.aClass217ArrayArray1.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static370.aClass217ArrayArray1[local3].length; local7++) {
				Static370.aClass217ArrayArray1[local3][local7] = Static100.aClass217_2;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method5005(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!n;)[Lclient!cu;")
	public static Class54[] method5007(@OriginalArg(1) Class221 arg0) {
		if (!arg0.method5204()) {
			return new Class54[0];
		}
		@Pc(16) Class192 local16 = arg0.method5206();
		while (local16.anInt5186 == 0) {
			Static374.method5521(10L);
		}
		if (local16.anInt5186 == 2) {
			return new Class54[0];
		}
		@Pc(40) int[] local40 = (int[]) local16.anObject30;
		@Pc(46) Class54[] local46 = new Class54[local40.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local46.length; local53++) {
			@Pc(59) Class54 local59 = new Class54();
			local46[local53] = local59;
			local59.anInt1990 = local40[local53 << 2];
			local59.anInt1988 = local40[(local53 << 2) + 1];
			local59.anInt1992 = local40[(local53 << 2) + 2];
			local59.anInt1991 = local40[(local53 << 2) + 3];
		}
		return local46;
	}
}
