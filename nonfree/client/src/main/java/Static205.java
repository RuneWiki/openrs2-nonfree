import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
	public static int anInt1290;

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array3;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_22 = new Class231("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!ki", name = "C", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_15 = new Class88();

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_16 = new Class186(9, 2);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBI)V")
	public static void method1164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class137 local14 = new Class137(16);
		for (@Pc(19) Class6_Sub12 local19 = (Class6_Sub12) Static23.aClass137_4.method3181(); local19 != null; local19 = (Class6_Sub12) Static23.aClass137_4.method3182()) {
			local19.method5977();
			@Pc(30) int local30 = (int) (local19.aLong217 >> 28);
			@Pc(41) int local41 = (int) (local19.aLong217 >> 14 & 0x3FFFL) - arg1;
			@Pc(49) int local49 = (int) (local19.aLong217 & 0x3FFFL) - arg0;
			if (local49 >= 0 && local41 >= 0 && local49 < Static84.anInt1632 && Static261.anInt4480 > local41) {
				local14.method3179((long) (local49 | local30 << 28 | local41 << 14), local19);
			}
		}
		Static23.aClass137_4 = local14;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	public static void method1168(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static36.aFloat46 = 3.0F;
		} else if (arg0 == 50) {
			Static36.aFloat46 = 4.0F;
		} else if (arg0 == 75) {
			Static36.aFloat46 = 6.0F;
		} else if (arg0 == 100) {
			Static36.aFloat46 = 8.0F;
		} else if (arg0 == 200) {
			Static36.aFloat46 = 16.0F;
		}
		Static340.anInt5720 = -1;
		Static340.anInt5720 = -1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZZ)I")
	public static int method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class6_Sub17 local10 = Static85.method1523(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray287.length; local24++) {
				if (arg0 == local10.anIntArray289[local24]) {
					local22 += local10.anIntArray287[local24];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	public static void method1174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(arg0, 12);
		local8.method3043();
		local8.anInt3397 = arg1;
	}
}
