import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static420 {

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "Lclient!qm;")
	public static Class1_Sub6_Sub2 aClass1_Sub6_Sub2_3;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_169 = new Class119("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
	public static int anInt7132 = 0;

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)I")
	public static int method5575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static47.anIntArrayArray10 == null ? 0 : Static47.anIntArrayArray10[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)I")
	public static int method5577(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
