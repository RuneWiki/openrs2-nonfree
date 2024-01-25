import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lclient!tga;")
	public static Class349 aClass349_5;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "Lclient!ko;")
	public static final Class208 aClass208_11 = new Class208("", 18);

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
	public static int anInt8986 = 0;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	public static int anInt8990 = 1403;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(JB)V")
	public static void method7712(@OriginalArg(0) long arg0) {
		Static462.aCalendar4.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!eg;Lclient!gda;Lclient!gda;BLclient!gda;Lclient!eca;)Z")
	public static boolean method7715(@OriginalArg(0) Class5_Sub4_Sub2 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(4) Class126 arg3, @OriginalArg(5) Class45 arg4) {
		Static445.aClass5_Sub4_Sub2_6 = arg0;
		Static176.aClass126_95 = arg3;
		Static610.aClass45_3 = arg4;
		Static507.anIntArray604 = new int[16];
		Static361.aClass126_167 = arg2;
		Static267.aClass126_130 = arg1;
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			Static507.anIntArray604[local20] = 255;
		}
		if (85 <= 17) {
			anInt8990 = 93;
		}
		return true;
	}
}
