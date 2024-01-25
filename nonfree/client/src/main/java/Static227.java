import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
	public static int anInt4750;

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "Lclient!tr;")
	public static Class137 aClass137_6;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "Lclient!je;")
	public static Class117 aClass117_14 = null;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_170 = new Class48(48, 16);

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "I")
	public static int anInt4752 = -1;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
	public static void method4199(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub6_Sub5 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class42 local8 = Static239.aClass42Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static230.anInt6113; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static19.anInt329; local15++) {
						local1 = local8.method3047(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static365.anInt5876;
							@Pc(32) int local32 = local12 << Static365.anInt5876;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class42 local41 = Static239.aClass42Array4[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method3060(local15, local12) - local41.method3060(local15, local12);
									@Pc(67) int local67 = local8.method3060(local15 + 1, local12) - local41.method3060(local15 + 1, local12);
									@Pc(85) int local85 = local8.method3060(local15 + 1, local12 + 1) - local41.method3060(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method3060(local15, local12 + 1) - local41.method3060(local15, local12 + 1);
									local41.method3055(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(B)Z")
	public static boolean method4201() {
		return Static215.anInt3678 > 0;
	}

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(Z)V")
	public static void method4202() {
		if (Static19.aFloat1 < 1024.0F) {
			Static19.aFloat1 = 1024.0F;
		}
		if (Static19.aFloat1 > 3072.0F) {
			Static19.aFloat1 = 3072.0F;
		}
		while (Static386.aFloat82 >= 16384.0F) {
			Static386.aFloat82 -= 16384.0F;
		}
		while (Static386.aFloat82 < 0.0F) {
			Static386.aFloat82 += 16384.0F;
		}
		@Pc(45) int local45 = Static305.anInt5159 >> 7;
		@Pc(49) int local49 = Static92.anInt1674 >> 7;
		@Pc(55) int local55 = Static236.method3260(Static122.anInt2188, Static92.anInt1674, Static305.anInt5159);
		@Pc(57) int local57 = 0;
		@Pc(81) int local81;
		if (local45 > 3 && local49 > 3 && local45 < 100 && local49 < 100) {
			for (local81 = local45 - 4; local81 <= local45 + 4; local81++) {
				for (@Pc(87) int local87 = local49 - 4; local87 <= local49 + 4; local87++) {
					@Pc(91) int local91 = Static122.anInt2188;
					if (local91 < 3 && Static180.method2598(local87, local81)) {
						local91++;
					}
					@Pc(104) int local104 = 0;
					if (Static48.aClass115_Sub1_2.aByteArrayArrayArray13 != null && Static48.aClass115_Sub1_2.aByteArrayArrayArray13[local91] != null) {
						local104 = (Static48.aClass115_Sub1_2.aByteArrayArrayArray13[local91][local81][local87] & 0xFF) * 8;
					}
					@Pc(137) int local137 = local104 + local55 - Static229.aClass42Array3[local91].method3060(local81, local87);
					if (local57 < local137) {
						local57 = local137;
					}
				}
			}
		}
		local81 = local57 * 1536;
		if (local81 > 786432) {
			local81 = 786432;
		}
		if (local81 < 262144) {
			local81 = 262144;
		}
		if (local81 > Static177.anInt1356) {
			Static177.anInt1356 += (local81 - Static177.anInt1356) / 24;
		} else if (local81 < Static177.anInt1356) {
			Static177.anInt1356 += (local81 - Static177.anInt1356) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)Lclient!es;")
	public static Class73 method4203(@OriginalArg(0) int arg0) {
		@Pc(8) Class73[] local8 = Static61.method1004();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class73 local16 = local8[local10];
			if (local16.anInt1642 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIZZ)V")
	public static void method4204(@OriginalArg(2) boolean arg0) {
		Static250.aBoolean432 = arg0;
		Static101.anInt1798 = 2;
		Static212.anInt3652 = 22050;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIILclient!pq;)V")
	public static void method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub4 arg3) {
		@Pc(4) Class132 local4 = Static18.method2854(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass25_Sub4_2 = arg3;
		}
	}
}
