import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "Lclient!fj;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_123 = new Class6(93, 3);

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_104 = new Class186(18, -1);

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public static int anInt7517 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BIII)I")
	public static int method6421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static437.method6400(local7, local17);
		@Pc(35) int local35 = Static437.method6400(local7 + 1, local17);
		@Pc(49) int local49 = Static437.method6400(local7, local17 + 1);
		@Pc(58) int local58 = Static437.method6400(local7 + 1, local17 - -1);
		@Pc(65) int local65 = Static320.method5238(local28, arg2, local35, local13);
		@Pc(72) int local72 = Static320.method5238(local49, arg2, local58, local13);
		return Static320.method5238(local65, arg2, local72, local23);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)V")
	public static void method6423(@OriginalArg(1) byte arg0) {
		if (Static388.aByteArrayArrayArray16 == null) {
			Static388.aByteArrayArrayArray16 = new byte[4][Static542.anInt9387][Static36.anInt1324];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(23) int local23 = 0; local23 < Static542.anInt9387; local23++) {
				for (@Pc(26) int local26 = 0; local26 < Static36.anInt1324; local26++) {
					Static388.aByteArrayArrayArray16[local20][local23][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Z")
	public static boolean method6424(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
