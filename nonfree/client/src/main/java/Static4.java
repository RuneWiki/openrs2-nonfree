import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
	public static int anInt96;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_18 = Static181.method2795("Neuer Benutzer");

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_19 = Static181.method2795("gelb:");

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Lclient!jc;")
	public static final Class49 aClass49_1 = new Class49();

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_20 = Static181.method2795("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_21 = Static181.method2795("cross");

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "Lclient!qe;")
	public static Class83 aClass83_22 = aClass83_20;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	public static int anInt93 = -1;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	public static int anInt95 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!eh;Lclient!qe;Lclient!qe;I)[Lclient!fc;")
	public static Class29[] method85(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class83 arg2) {
		@Pc(15) int local15 = arg0.method870(arg2);
		@Pc(21) int local21 = arg0.method875(local15, arg1);
		return Static208.method3143(arg0, local15, local21);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method87(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static130.method2186(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(45) int local45;
			do {
				local45 = arg0.nextInt();
			} while (local45 >= local37);
			return Static214.method3237(local45, arg1);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)I")
	public static int method88(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
