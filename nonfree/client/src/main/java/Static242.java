import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!iba", name = "Y", descriptor = "[Lclient!s;")
	public static Class22[] aClass22Array3;

	@OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
	public static int anInt4082;

	@OriginalMember(owner = "client!iba", name = "G", descriptor = "I")
	public static int anInt4086;

	@OriginalMember(owner = "client!iba", name = "C", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!iba", name = "V", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!iba", name = "Q", descriptor = "I")
	public static int anInt4080 = 0;

	@OriginalMember(owner = "client!iba", name = "D", descriptor = "Lclient!el;")
	public static final Class109 aClass109_91 = new Class109(55, 0);

	@OriginalMember(owner = "client!iba", name = "K", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_8 = new Class96(14, 0, 4, 1);

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!nw;)I")
	public static int method3548(@OriginalArg(1) Class8_Sub1_Sub3_Sub2_Sub2 arg0) {
		@Pc(8) Class227 local8 = arg0.aClass227_1;
		if (local8.anIntArray341 != null) {
			local8 = local8.method5322(Static413.aClass118_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(24) int local24 = local8.anInt6261;
		@Pc(30) Class101 local30 = arg0.method5991(120);
		if (arg0.anInt7008 == -1 || arg0.aBoolean543) {
			local24 = local8.anInt6252;
		} else if (local30.anInt2168 == arg0.anInt7008 || arg0.anInt7008 == local30.anInt2179 || arg0.anInt7008 == local30.anInt2197 || local30.anInt2185 == arg0.anInt7008) {
			local24 = local8.anInt6231;
		} else if (local30.anInt2165 == arg0.anInt7008 || arg0.anInt7008 == local30.anInt2205 || arg0.anInt7008 == local30.anInt2182 || arg0.anInt7008 == local30.anInt2172) {
			local24 = local8.anInt6254;
		}
		return local24;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIB)Z")
	public static boolean method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static433.method6424(arg0, arg1) || Static62.method872(arg1, arg0);
	}
}
