import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!vb", name = "gb", descriptor = "Lclient!re;")
	public static Class9 aClass9_56;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "Lclient!cc;")
	public static Class2_Sub2_Sub1_Sub3 aClass2_Sub2_Sub1_Sub3_13;

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lclient!e;")
	public static Class16 aClass16_89 = new Class16(30);

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "[J")
	public static long[] aLongArray15 = new long[32];

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1650 = Static72.method1077("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1651 = Static72.method1077("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
	public static int anInt2659 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BILclient!sd;I[Lclient!ob;I)V")
	public static void method1853(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(4) Class55[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub10 local10 = new Class2_Sub10(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method1484();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method1484();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(48) int local48 = local27 >> 6 & 0x3F;
				@Pc(52) int local52 = local27 & 0x3F;
				@Pc(56) int local56 = local27 >> 12;
				@Pc(62) int local62 = local10.method1514();
				@Pc(66) int local66 = local62 & 0x3;
				@Pc(70) int local70 = local48 + arg1;
				@Pc(74) int local74 = local62 >> 2;
				@Pc(78) int local78 = arg4 + local52;
				if (local70 > 0 && local78 > 0 && local70 < 103 && local78 < 103) {
					@Pc(96) int local96 = local56;
					@Pc(98) Class55 local98 = null;
					if ((Static17.aByteArrayArrayArray1[1][local70][local78] & 0x2) == 2) {
						local96 = local56 - 1;
					}
					if (local96 >= 0) {
						local98 = arg3[local96];
					}
					Static88.method1309(arg2, local66, local78, local56, local70, local98, local74, local12);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	public static void method1854(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class2_Sub3 local18 = (Class2_Sub3) Static98.aClass58_53.method1305(); local18 != null; local18 = (Class2_Sub3) Static98.aClass58_53.method1302()) {
			if ((local18.aLong96 >> 48 & 0xFFFFL) == (long) arg0) {
				local18.method1930();
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	public static void method1856() {
		aClass2_Sub2_Sub1_Sub3_13 = null;
		aClass9_56 = null;
		aClass74_1651 = null;
		aClass74_1650 = null;
		aLongArray15 = null;
		aClass16_89 = null;
	}
}
