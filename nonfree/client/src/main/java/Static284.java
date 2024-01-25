import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!fr;")
	public static Class48 aClass48_12;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	public static int anInt6477;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Z")
	public static final boolean aBoolean484 = false;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!jm;")
	public static final Class105 aClass105_18 = new Class105("", 15);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method5720() {
		@Pc(1) Class21 local1 = Static29.aClass21_29;
		synchronized (Static29.aClass21_29) {
			Static29.aClass21_29.method851();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIBI)I")
	public static int method5721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg2 & arg0 - 1;
		@Pc(28) int local28 = Static77.method1643(local17, local7);
		@Pc(40) int local40 = Static77.method1643(local17, local7 + 1);
		@Pc(47) int local47 = Static77.method1643(local17 + 1, local7);
		@Pc(56) int local56 = Static77.method1643(local17 + 1, local7 + 1);
		@Pc(63) int local63 = Static112.method2381(local13, arg0, local28, local40);
		@Pc(70) int local70 = Static112.method2381(local13, arg0, local47, local56);
		return Static112.method2381(local23, arg0, local63, local70);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method5722() {
		Static224.anInt4512 = 0;
		Static317.aClass42_43.method1542();
		Static317.aClass42_43.method1549(Static143.aClass1_Sub22_1);
		Static224.anInt4512++;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!td;I)Z")
	public static boolean method5723(@OriginalArg(0) Class194 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean438) {
			return false;
		} else if (!arg0.method5269()) {
			return false;
		} else if (Static138.aClass38_11.method1475((long) arg0.anInt5827) == null) {
			return Static201.aClass38_20.method1475((long) arg0.anInt5848) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIIIII)I")
	public static int method5726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static258.aClass36Array2 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(19) int local19 = arg4 >> 7;
			@Pc(23) int local23 = arg0 >> 7;
			if (arg2 < 0 || arg1 < 0 || Static311.anInt5653 - 1 < arg2 || Static189.anInt3820 - 1 < arg1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && Static311.anInt5653 - 1 >= local19 && local23 <= Static189.anInt3820 - 1) {
				@Pc(87) boolean local87 = (Static264.aByteArrayArrayArray7[1][arg4 >> 7][arg0 >> 7] & 0x2) != 0;
				@Pc(109) boolean local109;
				@Pc(125) boolean local125;
				if ((arg4 & 0x7F) == 0) {
					local109 = (Static264.aByteArrayArrayArray7[1][local19 - 1][arg0 >> 7] & 0x2) != 0;
					local125 = (Static264.aByteArrayArrayArray7[1][local19][arg0 >> 7] & 0x2) != 0;
					if (local125 != local109) {
						local87 = (Static264.aByteArrayArrayArray7[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x7F) == 0) {
					local109 = (Static264.aByteArrayArrayArray7[1][arg4 >> 7][local23 - 1] & 0x2) != 0;
					local125 = (Static264.aByteArrayArrayArray7[1][arg4 >> 7][local23] & 0x2) != 0;
					if (local125 != local109) {
						local87 = (Static264.aByteArrayArrayArray7[1][arg2][arg1] & 0x2) != 0;
					}
				}
				if (local87) {
					arg3++;
				}
				return Static258.aClass36Array2[arg3].method4433(arg4, arg0);
			} else {
				return 0;
			}
		} else {
			return Static258.aClass36Array2[arg3].method4433(arg4, arg0);
		}
	}
}
