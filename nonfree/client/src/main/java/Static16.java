import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
	public static int anInt334;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!mi;")
	public static Class112 aClass112_1 = new Class112(128);

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "[I")
	public static int[] anIntArray28 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString8 = "flash3:";

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "[I")
	public static int[] anIntArray29 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
	public static int anInt335 = -1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Lclient!i;")
	public static Class79 method240(@OriginalArg(0) int arg0) {
		@Pc(10) Class79 local10 = (Class79) Static83.aClass175_10.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static69.aClass119_23.method3235(arg0, 30);
		local10 = new Class79();
		if (local21 != null) {
			local10.method2023(new Class1_Sub13(local21), arg0);
		}
		Static83.aClass175_10.method4285(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1 method241() {
		@Pc(15) byte[] local15 = Static25.aByteArrayArray19[0];
		@Pc(23) int local23 = Static69.anIntArray119[0] * Static206.anIntArray419[0];
		@Pc(26) int[] local26 = new int[local23];
		for (@Pc(28) int local28 = 0; local28 < local23; local28++) {
			local26[local28] = Static5.anIntArray17[local15[local28] & 0xFF];
		}
		@Pc(67) Class1_Sub5_Sub6_Sub1 local67 = new Class1_Sub5_Sub6_Sub1(Static94.anInt1976, Static222.anInt4184, Static192.anIntArray398[0], Static173.anIntArray353[0], Static69.anIntArray119[0], Static206.anIntArray419[0], local26);
		Static176.method3009();
		return local67;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V")
	public static void method242(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static171.method2958(arg0 - 1L);
			Static171.method2958(1L);
		} else {
			Static171.method2958(arg0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void method243() {
		Static199.aClass175_31.method4294();
		Static22.aClass175_4.method4294();
		Static181.aClass175_27.method4294();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[Lclient!jb;)V")
	public static void method244(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub15[] arg1) {
		Static230.aClass1_Sub15ArrayArray30[arg0] = arg1;
	}
}
