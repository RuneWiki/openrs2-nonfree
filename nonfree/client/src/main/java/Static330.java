import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!nea", name = "A", descriptor = "Lclient!rn;")
	public static final Class277 aClass277_6 = new Class277();

	@OriginalMember(owner = "client!nea", name = "eb", descriptor = "Lclient!ji;")
	public static final Class154 aClass154_2 = Static210.method3130();

	@OriginalMember(owner = "client!nea", name = "gb", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_144 = new Class40(24, -1);

	@OriginalMember(owner = "client!nea", name = "hb", descriptor = "Z")
	public static boolean aBoolean414 = false;

	@OriginalMember(owner = "client!nea", name = "ib", descriptor = "Z")
	public static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!ud;III)V")
	public static void method5147(@OriginalArg(0) Class29_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt8538 == arg2 && arg2 != -1) {
			@Pc(18) Class108 local18 = Static31.aClass345_1.method7798(arg2);
			@Pc(21) int local21 = local18.anInt2591;
			if (local21 == 1) {
				arg0.anInt8577 = 0;
				arg0.anInt8516 = 0;
				arg0.anInt8540 = 1;
				arg0.anInt8536 = 0;
				arg0.anInt8563 = arg1;
				Static294.method4111(arg0.anInt8536, arg0.anInt9218, arg0 == Static426.aClass29_Sub2_Sub1_Sub2_2, arg0.anInt9222, local18, arg0.aByte103);
			}
			if (local21 == 2) {
				arg0.anInt8516 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt8538 == -1 || Static31.aClass345_1.method7798(arg2).anInt2604 >= Static31.aClass345_1.method7798(arg0.anInt8538).anInt2604) {
			arg0.anInt8516 = 0;
			arg0.anInt8538 = arg2;
			arg0.anInt8563 = arg1;
			arg0.anInt8540 = 1;
			arg0.anInt8577 = 0;
			arg0.anInt8536 = 0;
			arg0.anInt8583 = arg0.anInt8582;
			if (arg0.anInt8538 == -1) {
				return;
			}
			Static294.method4111(arg0.anInt8536, arg0.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2 == arg0, arg0.anInt9222, Static31.aClass345_1.method7798(arg0.anInt8538), arg0.aByte103);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)Z")
	public static boolean method5150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = (arg0 & 0x37) == 0 ? Static85.method1344(arg0, arg1) : Static224.method3265(arg0, arg1);
		return (arg1 & 0x10000) != 0 | Static340.method5138(arg1, arg0) | local24;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	public static void method5152() {
		Static228.anInt3904 = 0;
		@Pc(11) int local11 = Static420.aClass6_Sub14_Sub2_2.method5982();
		@Pc(15) int local15 = Static420.aClass6_Sub14_Sub2_2.method6032();
		@Pc(19) int local19 = Static420.aClass6_Sub14_Sub2_2.method6012();
		@Pc(32) boolean local32 = Static420.aClass6_Sub14_Sub2_2.method6012() == 1;
		Static552.method7593();
		Static301.method4219(local19);
		@Pc(47) int local47 = (Static567.anInt9502 - Static420.aClass6_Sub14_Sub2_2.anInt7244) / 16;
		Static84.anIntArrayArray25 = new int[local47][4];
		@Pc(57) int local57;
		for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static84.anIntArrayArray25[local53][local57] = Static420.aClass6_Sub14_Sub2_2.method6027();
			}
		}
		Static225.anIntArray414 = new int[local47];
		Static202.aByteArrayArray11 = new byte[local47][];
		Static196.aByteArrayArray10 = new byte[local47][];
		Static193.anIntArray386 = new int[local47];
		Static340.aByteArrayArray20 = new byte[local47][];
		Static567.anIntArray719 = null;
		Static491.aByteArrayArray24 = new byte[local47][];
		Static370.anIntArray541 = new int[local47];
		Static35.anIntArray45 = new int[local47];
		Static69.aByteArrayArray3 = null;
		Static268.anIntArray440 = new int[local47];
		local47 = 0;
		for (local57 = (local15 - (Static301.anInt4912 >> 4)) / 8; local57 <= (local15 + (Static301.anInt4912 >> 4)) / 8; local57++) {
			for (@Pc(137) int local137 = (local11 - (Static473.anInt7969 >> 4)) / 8; local137 <= ((Static473.anInt7969 >> 4) + local11) / 8; local137++) {
				Static35.anIntArray45[local47] = (local57 << 8) + local137;
				Static268.anIntArray440[local47] = Static285.aClass251_84.method5863("m" + local57 + "_" + local137);
				Static193.anIntArray386[local47] = Static285.aClass251_84.method5863("l" + local57 + "_" + local137);
				Static225.anIntArray414[local47] = Static285.aClass251_84.method5863("um" + local57 + "_" + local137);
				Static370.anIntArray541[local47] = Static285.aClass251_84.method5863("ul" + local57 + "_" + local137);
				local47++;
			}
		}
		Static242.method3514(local32, local11, 11, local15);
	}
}
