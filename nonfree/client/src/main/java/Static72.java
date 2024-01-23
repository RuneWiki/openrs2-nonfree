import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public static int anInt1643;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public static int anInt1644;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!fa;")
	public static Class38 aClass38_4;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_547 = Static64.method1101("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V")
	public static void method1263() {
		@Pc(7) byte[][] local7 = Static55.aByteArrayArray2;
		@Pc(10) int local10 = Static43.aByteArrayArray1.length;
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			@Pc(26) byte[] local26 = local7[local20];
			if (local26 != null) {
				@Pc(38) int local38 = (Static164.anIntArray240[local20] >> 8) * 64 - Static198.anInt4217;
				@Pc(49) int local49 = (Static164.anIntArray240[local20] & 0xFF) * 64 - Static118.anInt2541;
				Static208.method3447();
				Static181.method3052(local49, local38, Static228.aClass90Array1, local26);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)Lclient!ia;")
	public static Class51 method1264(@OriginalArg(1) int arg0) {
		return Static198.method3275(arg0, true);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZIJ)Lclient!ia;")
	public static Class51 method1266(@OriginalArg(3) long arg0) {
		@Pc(26) int local26 = 1;
		for (@Pc(31) long local31 = arg0 / (long) 10; local31 != 0L; local31 /= 10) {
			local26++;
		}
		@Pc(47) int local47 = local26;
		if (arg0 < 0L) {
			local47 = local26 + 1;
		}
		@Pc(59) byte[] local59 = new byte[local47];
		if (arg0 < 0L) {
			local59[0] = 45;
		}
		for (@Pc(79) int local79 = 0; local79 < local26; local79++) {
			@Pc(87) int local87 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local87 < 0) {
				local87 = -local87;
			}
			if (local87 > 9) {
				local87 += 39;
			}
			local59[local47 - local79 - 1] = (byte) (local87 + 48);
		}
		@Pc(123) Class51 local123 = new Class51();
		local123.aByteArray17 = local59;
		local123.anInt1858 = local47;
		return local123;
	}
}
