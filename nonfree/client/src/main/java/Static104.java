import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	public static int anInt2560 = -1;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public static int anInt2563 = -1;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
	public static final int[] anIntArray292 = new int[50];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!wa;)V")
	public static void method1926(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(4) byte[] local4 = new byte[24];
		if (Static39.aClass72_1 != null) {
			@Pc(16) int local16;
			try {
				Static39.aClass72_1.method2633(0L);
				local16 = 0;
				Static39.aClass72_1.method2627(local4);
				while (local16 < 24 && local4[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(40) Exception local40) {
				for (local16 = 0; local16 < 24; local16++) {
					local4[local16] = -1;
				}
			}
		}
		arg0.method1731(24, local4);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method1927(@OriginalArg(1) Class65 arg0) {
		try {
			Static202.anApplet_Sub1_2.getAppletContext().showDocument(arg0.method2460(Static202.anApplet_Sub1_2.getCodeBase()), "_blank");
		} catch (@Pc(10) Exception local10) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method1929(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub15 local14 = (Class1_Sub15) Static145.aClass99_11.method3292((long) arg0);
		if (local14 != null) {
			local14.method3295();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILclient!wg;JZ)V")
	public static void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class33 local6 = new Class33();
		local6.aClass6_3 = arg4;
		local6.anInt1690 = arg1 * 128 + 64;
		local6.anInt1692 = arg2 * 128 + 64;
		local6.anInt1689 = arg3;
		local6.aLong53 = arg5;
		if (Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub7(arg0, arg1, arg2);
		}
		Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass33_1 = local6;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ni;ZB)V")
	public static void method1931(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt3111;
		@Pc(10) int local10 = (int) arg0.aLong150;
		arg0.method3295();
		if (arg1) {
			Static45.method758(local6);
		}
		method1933(local6);
		@Pc(30) Class97 local30 = Static154.method2691(local10);
		if (local30 != null) {
			Static25.method448(local30);
		}
		Static101.anInt2533 = 0;
		Static198.aBoolean168 = false;
		Static5.method64(Static197.anInt4258, Static195.anInt4218, Static51.anInt1360, Static71.anInt1742);
		if (Static28.anInt856 != -1) {
			Static123.method2354(Static28.anInt856, 1);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!nd;IIBZ)V")
	public static void method1932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg3);
		@Pc(16) Class1_Sub2_Sub21 local16 = (Class1_Sub2_Sub21) Static33.aClass99_2.method3292(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub21) Static89.aClass99_6.method3292(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub21) Static19.aClass99_1.method3292(local10);
		if (local16 == null) {
			if (!arg5) {
				local16 = (Class1_Sub2_Sub21) Static93.aClass99_7.method3292(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub2_Sub21();
			local16.aClass60_Sub1_141 = arg2;
			local16.aByte9 = arg4;
			local16.anInt3705 = arg0;
			if (arg5) {
				Static33.aClass99_2.method3290(local16, local10);
				Static205.anInt4357++;
			} else {
				Static49.aClass22_1.method725(local16);
				Static19.aClass99_1.method3290(local16, local10);
				Static205.anInt4377++;
			}
		} else if (arg5) {
			local16.method3229();
			Static33.aClass99_2.method3290(local16, local10);
			Static205.anInt4377--;
			Static205.anInt4357++;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	private static void method1933(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub21 local12 = (Class1_Sub21) Static81.aClass99_5.method3288(); local12 != null; local12 = (Class1_Sub21) Static81.aClass99_5.method3289()) {
			if ((local12.aLong150 >> 48 & 0xFFFFL) == (long) arg0) {
				local12.method3295();
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method1934() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}
}
