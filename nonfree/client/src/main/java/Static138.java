import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1335 = Static51.method932("white:");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1333 = aClass10_1335;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public static int anInt3055 = 1;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1334 = aClass10_1335;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
	public static int[] anIntArray327 = new int[25];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIIZ)Lclient!cd;")
	public static Class10 method2178(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(17) int local17 = 1;
		@Pc(21) int local21 = arg0 / 10;
		while (local21 != 0) {
			local21 /= 10;
			local17++;
		}
		@Pc(32) int local32 = local17;
		if (arg0 < 0 || arg1) {
			local32 = local17 + 1;
		}
		@Pc(40) byte[] local40 = new byte[local32];
		if (arg0 < 0) {
			local40[0] = 45;
		} else if (arg1) {
			local40[0] = 43;
		}
		for (@Pc(59) int local59 = 0; local59 < local17; local59++) {
			@Pc(65) int local65 = arg0 % 10;
			arg0 /= 10;
			if (local65 < 0) {
				local65 = -local65;
			}
			if (local65 > 9) {
				local65 += 39;
			}
			local40[local32 - local59 - 1] = (byte) (local65 + 48);
		}
		@Pc(100) Class10 local100 = new Class10();
		local100.aByteArray7 = local40;
		local100.anInt513 = local32;
		return local100;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method2179() {
		aClass10_1334 = null;
		anIntArray328 = null;
		aClass10_1333 = null;
		anIntArray327 = null;
		aClass10_1335 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lclient!aa;")
	public static Class2_Sub1_Sub1 method2180(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub1 local10 = (Class2_Sub1_Sub1) Static18.aClass72_2.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static155.method2395(Static78.aClass29_14, Static29.aClass29_16, arg0);
		if (local10 != null) {
			Static18.aClass72_2.method2254(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method2181() {
		Static178.aClass2_Sub5_Sub4_2.method2691();
		Static111.aClass29_49 = null;
		Static168.anInt3655 = 1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
	public static int method2182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class2_Sub24 local17 = (Class2_Sub24) Static179.aClass18_13.method683((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local17.anIntArray395.length; local31++) {
				if (arg1 == local17.anIntArray396[local31]) {
					local29 += local17.anIntArray395[local31];
				}
			}
			return local29;
		}
	}
}
