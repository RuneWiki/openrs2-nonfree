import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "Lclient!wo;")
	public static Class216 aClass216_87;

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "Lclient!wo;")
	public static Class216 aClass216_88;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
	public static int anInt5589;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar4 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "Lclient!kb;")
	public static final Class112 aClass112_3 = Static299.method1008();

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
	public static int anInt5590 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!bg;B)Ljava/lang/String;")
	public static String method4790(@OriginalArg(1) Class1_Sub8 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4528();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt5182 += Static213.aClass55_1.method1615(arg0.anInt5182, local19, 0, local7, arg0.aByteArray81);
			return Static31.method799(local19, local7, 0);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZIIFIIZ)[I")
	public static int[] method4791(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub3_Sub26 local10 = new Class1_Sub3_Sub26();
		local10.anInt4524 = (int) (arg0 * 4096.0F);
		local10.anInt4532 = 8;
		local10.aBoolean430 = true;
		local10.anInt4534 = 4;
		local10.anInt4533 = 35;
		local10.anInt4529 = 8;
		local10.method5535();
		Static78.method1761(2048, 1);
		local10.method4080(local6, 0);
		return local6;
	}
}
