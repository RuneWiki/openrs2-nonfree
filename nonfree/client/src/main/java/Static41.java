import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
	public static int anInt1082 = 0;

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_16 = new Class44(25, 7);

	@OriginalMember(owner = "client!bt", name = "E", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)V")
	public static void method775() {
		Static180.method2820();
		Static227.method3517(Static399.aClass167_Sub1_1.aBoolean492);
		Static105.aClass141_2 = Static440.method5945(0, Static303.aClass131_4, Static118.aCanvas3, 22050);
		Static105.aClass141_2.method5196(Static453.aClass2_Sub18_Sub2_3);
		Static51.aClass141_1 = Static440.method5945(1, Static303.aClass131_4, Static118.aCanvas3, 2048);
		Static51.aClass141_1.method5196(Static360.aClass2_Sub18_Sub4_2);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIII)V")
	public static void method776(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static11.anInt305 = arg2;
		Static147.anInt4429 = arg0;
		Static284.anInt5178 = arg3;
		Static6.anInt201 = arg1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method777(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 + 1 - 65;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 - 96;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 - 21;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)V")
	public static void method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass4_Sub4_2 != null) {
			local7.aClass4_Sub4_2 = null;
		}
		if (local7.aClass4_Sub4_1 != null) {
			local7.aClass4_Sub4_1 = null;
		}
	}
}
