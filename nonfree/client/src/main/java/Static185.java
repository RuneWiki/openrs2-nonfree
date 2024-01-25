import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_44 = new Class179(17, 3);

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Z")
	public static boolean aBoolean200 = true;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[BLjava/lang/String;)I")
	public static int method2912(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(10) int local10 = arg0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg2.charAt(local12);
			if (local18 <= '\u007f') {
				arg1[local10++] = (byte) local18;
			} else if (local18 > '\u07ff') {
				arg1[local10++] = (byte) (local18 >> 12 | 0xE0);
				arg1[local10++] = (byte) (local18 >> 6 & 0x3F | 0x80);
				arg1[local10++] = (byte) (local18 & 0x3F | 0x80);
			} else {
				arg1[local10++] = (byte) (local18 >> 6 | 0xC0);
				arg1[local10++] = (byte) (local18 & 0x3F | 0x80);
			}
		}
		return local10 - arg0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
	public static void method2913() {
		Static188.aClass143_20 = null;
		Static446.anInt7163 = -1;
	}
}
