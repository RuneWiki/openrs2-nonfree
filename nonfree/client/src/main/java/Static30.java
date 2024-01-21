import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array9;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	public static int anInt813 = 10;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Lclient!dh;")
	public static Class18 aClass18_2 = new Class18(8);

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!cd;")
	public static Class10 aClass10_377 = Static51.method932("<br>");

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "Lclient!cd;")
	private static Class10 aClass10_382 = Static51.method932("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "Lclient!cd;")
	public static Class10 aClass10_378 = aClass10_382;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "Lclient!cd;")
	public static Class10 aClass10_379 = Static51.method932("(U");

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "Lclient!cd;")
	public static Class10 aClass10_380 = aClass10_382;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "Lclient!cd;")
	public static Class10 aClass10_381 = Static51.method932("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	public static int anInt818 = 0;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public static void method641() {
		aClass18_2 = null;
		aClass10_378 = null;
		aClass10_377 = null;
		aClass10_381 = null;
		aClass10_379 = null;
		aClass10_380 = null;
		aClass10_382 = null;
		aClass2_Sub1_Sub4_Sub3Array9 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!bb;)V")
	public static void method642(@OriginalArg(1) Class2_Sub1_Sub3_Sub2 arg0) {
		if (arg0.anInt3496 == 0) {
			return;
		}
		@Pc(31) int local31;
		@Pc(38) int local38;
		if (arg0.anInt3457 != -1 && arg0.anInt3457 < 32768) {
			@Pc(23) Class2_Sub1_Sub3_Sub2_Sub2 local23 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[arg0.anInt3457];
			if (local23 != null) {
				local31 = arg0.anInt3454 - local23.anInt3454;
				local38 = arg0.anInt3499 - local23.anInt3499;
				if (local31 != 0 || local38 != 0) {
					arg0.anInt3465 = (int) (Math.atan2((double) local31, (double) local38) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(72) int local72;
		if (arg0.anInt3457 >= 32768) {
			local72 = arg0.anInt3457 - 32768;
			if (local72 == Static14.anInt385) {
				local72 = 2047;
			}
			@Pc(81) Class2_Sub1_Sub3_Sub2_Sub1 local81 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local72];
			if (local81 != null) {
				local38 = arg0.anInt3454 - local81.anInt3454;
				@Pc(97) int local97 = arg0.anInt3499 - local81.anInt3499;
				if (local38 != 0 || local97 != 0) {
					arg0.anInt3465 = (int) (Math.atan2((double) local38, (double) local97) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3475 != 0 || arg0.anInt3456 != 0) && (arg0.anInt3476 == 0 || arg0.anInt3506 > 0)) {
			local72 = arg0.anInt3454 - (arg0.anInt3475 - Static137.anInt3049 - Static137.anInt3049) * 64;
			local31 = arg0.anInt3499 - (arg0.anInt3456 - Static85.anInt1937 - Static85.anInt1937) * 64;
			if (local72 != 0 || local31 != 0) {
				arg0.anInt3465 = (int) (Math.atan2((double) local72, (double) local31) * 325.949D) & 0x7FF;
			}
			arg0.anInt3456 = 0;
			arg0.anInt3475 = 0;
		}
		local72 = arg0.anInt3465 - arg0.anInt3489 & 0x7FF;
		if (local72 == 0) {
			arg0.anInt3483 = 0;
			return;
		}
		arg0.anInt3483++;
		@Pc(221) boolean local221;
		if (local72 <= 1024) {
			arg0.anInt3489 += arg0.anInt3496;
			local221 = true;
			if (local72 < arg0.anInt3496 || local72 > 2048 - arg0.anInt3496) {
				arg0.anInt3489 = arg0.anInt3465;
				local221 = false;
			}
			if (arg0.anInt3487 == arg0.anInt3479 && (arg0.anInt3483 > 25 || local221)) {
				if (arg0.anInt3464 == -1) {
					arg0.anInt3479 = arg0.anInt3493;
				} else {
					arg0.anInt3479 = arg0.anInt3464;
				}
			}
		} else {
			arg0.anInt3489 -= arg0.anInt3496;
			local221 = true;
			if (arg0.anInt3496 > local72 || local72 > 2048 - arg0.anInt3496) {
				arg0.anInt3489 = arg0.anInt3465;
				local221 = false;
			}
			if (arg0.anInt3479 == arg0.anInt3487 && (arg0.anInt3483 > 25 || local221)) {
				if (arg0.anInt3480 == -1) {
					arg0.anInt3479 = arg0.anInt3493;
				} else {
					arg0.anInt3479 = arg0.anInt3480;
				}
			}
		}
		arg0.anInt3489 &= 0x7FF;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
	public static int method643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub24 local10 = (Class2_Sub24) Static179.aClass18_13.method683((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray396.length) {
			return local10.anIntArray396[arg0];
		} else {
			return -1;
		}
	}
}
