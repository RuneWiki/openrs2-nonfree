import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kha", name = "y", descriptor = "Lclient!pg;")
	public static final Class271 aClass271_15 = new Class271();

	@OriginalMember(owner = "client!kha", name = "ab", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!kha", name = "fb", descriptor = "S")
	public static short aShort67 = 1;

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
	public static void method4160() {
		Static609.method8190(Static610.aClass394_12);
		Static512.anInt8633++;
		if (Static335.aBoolean440 && Static254.aBoolean280) {
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			if (aBoolean315) {
				local24 = Static304.method4150();
				local26 = Static563.method7702();
			}
			@Pc(43) int local43 = Static178.aClass111_1.method8703() + local24;
			@Pc(49) int local49 = Static178.aClass111_1.method8696() + local26;
			local49 -= Static127.anInt2189;
			local43 -= Static546.anInt8936;
			if (local43 < Static364.anInt6380) {
				local43 = Static364.anInt6380;
			}
			if (Static42.anInt602 > local49) {
				local49 = Static42.anInt602;
			}
			if (local43 + Static610.aClass394_12.anInt10536 > Static364.anInt6380 - -Static96.aClass394_1.anInt10536) {
				local43 = Static96.aClass394_1.anInt10536 + Static364.anInt6380 - Static610.aClass394_12.anInt10536;
			}
			if (local49 + Static610.aClass394_12.anInt10532 > Static42.anInt602 + Static96.aClass394_1.anInt10532) {
				local49 = Static42.anInt602 + Static96.aClass394_1.anInt10532 - Static610.aClass394_12.anInt10532;
			}
			@Pc(119) int local119 = local43 + Static96.aClass394_1.anInt10506 - Static364.anInt6380;
			@Pc(127) int local127 = Static96.aClass394_1.anInt10448 + local49 - Static42.anInt602;
			@Pc(142) Class5_Sub28 local142;
			if (Static178.aClass111_1.method8697()) {
				if (Static610.aClass394_12.anInt10537 < Static512.anInt8633) {
					@Pc(219) int local219 = local43 - Static336.anInt6063;
					@Pc(224) int local224 = local49 - Static116.anInt2040;
					if (Static610.aClass394_12.anInt10519 < local219 || -Static610.aClass394_12.anInt10519 > local219 || Static610.aClass394_12.anInt10519 < local224 || -Static610.aClass394_12.anInt10519 > local224) {
						Static133.aBoolean153 = true;
					}
				}
				if (Static610.aClass394_12.anObjectArray24 != null && Static133.aBoolean153) {
					local142 = new Class5_Sub28();
					local142.aClass394_2 = Static610.aClass394_12;
					local142.anObjectArray2 = Static610.aClass394_12.anObjectArray24;
					local142.anInt3839 = local119;
					local142.anInt3840 = local127;
					Static497.method7205(local142);
				}
			} else {
				if (Static133.aBoolean153) {
					Static355.method5247();
					if (Static610.aClass394_12.anObjectArray17 != null) {
						local142 = new Class5_Sub28();
						local142.anInt3840 = local127;
						local142.anObjectArray2 = Static610.aClass394_12.anObjectArray17;
						local142.aClass394_3 = Static522.aClass394_9;
						local142.anInt3839 = local119;
						local142.aClass394_2 = Static610.aClass394_12;
						Static497.method7205(local142);
					}
					if (Static522.aClass394_9 != null && Static81.method1272(Static610.aClass394_12) != null) {
						Static416.method6118(Static522.aClass394_9, Static610.aClass394_12);
					}
				} else if ((Static171.anInt2827 == 1 || Static360.method5299()) && Static223.anInt3566 > 2) {
					Static634.method8425(Static116.anInt2040 + Static127.anInt2189, Static336.anInt6063 + Static546.anInt8936);
				} else if (Static562.method7688()) {
					Static634.method8425(Static116.anInt2040 + Static127.anInt2189, Static336.anInt6063 + Static546.anInt8936);
				}
				Static610.aClass394_12 = null;
			}
		} else if (Static512.anInt8633 > 1) {
			Static610.aClass394_12 = null;
		}
	}
}
