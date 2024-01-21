import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!wc;")
	public static Class1_Sub2_Sub8_Sub5 aClass1_Sub2_Sub8_Sub5_18;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array11 = new Class24[500];

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	public static int anInt1655 = 0;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	public static int anInt1656 = -1;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "[Lclient!ue;")
	public static final Class93[] aClass93Array1 = new Class93[4];

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_472 = Static81.method1507("Password: ");

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!dj;")
	public static Class24 aClass24_471 = aClass24_472;

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_473 = Static81.method1507("wave2:");

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "Lclient!dj;")
	public static Class24 aClass24_474 = aClass24_473;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "[I")
	public static final int[] anIntArray142 = new int[1000];

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_475 = Static81.method1507(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_476 = aClass24_473;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_477 = Static81.method1507("Ablegen");

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_478 = Static81.method1507("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
	public static int anInt1660 = 0;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_479 = Static81.method1507("Hierhin gehen");

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "[I")
	public static final int[] anIntArray143 = new int[50];

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
	public static int method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class1_Sub10 local6 = (Class1_Sub10) Static49.aClass57_12.method1872((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local6.anIntArray171.length; local23++) {
				if (local6.anIntArray170[local23] == arg1) {
					local21 += local6.anIntArray171[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!jf;IZ)V")
	public static void method1316(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt2169;
		@Pc(10) int local10 = (int) arg0.aLong149;
		arg0.method3563();
		if (arg1) {
			Static53.method1055(local6);
		}
		Static98.method1715(local6);
		@Pc(32) Class98 local32 = Static188.method3229(local10);
		if (local32 != null) {
			Static199.method2199(local32);
		}
		Static156.anInt3437 = 0;
		Static53.aBoolean73 = false;
		Static39.method726(Static7.anInt173, Static110.anInt2525, Static10.anInt1519, Static109.anInt2509);
		if (Static177.anInt3924 != -1) {
			Static5.method108(Static177.anInt3924, 1);
		}
	}
}
