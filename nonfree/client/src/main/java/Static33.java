import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar24 = Calendar.getInstance();

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar25 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "Z")
	public static boolean aBoolean727 = false;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "([[BLclient!er;B)V")
	public static void method7957(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class100_Sub1 arg1) {
		@Pc(13) int local13 = Static352.aByteArrayArray21.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(21) byte[] local21 = arg0[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static472.anIntArray505[local15] >> 8) * 64 - Static445.anInt6949;
				@Pc(44) int local44 = (Static472.anIntArray505[local15] & 0xFF) * 64 - Static321.anInt5000;
				Static253.method3677();
				arg1.method2465(Static582.aClass33_13, local44, Static263.aClass389Array1, local21, local34);
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILjava/lang/String;)Lclient!wn;")
	public static Class61 method7963(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class61 local8;
		try {
			local8 = (Class61) Class.forName("Class61_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class61_Sub2();
		}
		local8.aString82 = arg1;
		local8.anInt6843 = arg0;
		return local8;
	}
}
