import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
	public static int anInt88;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Lclient!iq;")
	public static Class104 aClass104_1;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	public static int anInt96;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	public static int anInt91 = 0;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
	public static int anInt92 = 0;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	public static final int anInt93 = anInt96;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
	public static final int anInt95 = anInt96 >> 2;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "[I")
	public static final int[] anIntArray20 = new int[14];

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "[I")
	public static final int[] anIntArray21 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "Lclient!uq;")
	public static final Class206 aClass206_1 = new Class206();

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
	public static void method83() {
		if (Static210.anInt4603 == 0) {
			return;
		}
		try {
			if (++Static155.anInt3667 > 1500) {
				if (Static129.aClass117_2 != null) {
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
				}
				if (Static121.anInt2558 >= 1) {
					Static284.anInt5721 = -5;
					Static210.anInt4603 = 0;
					return;
				}
				if (Static35.anInt6892 == Static134.anInt2875) {
					Static134.anInt2875 = Static15.anInt269;
				} else {
					Static134.anInt2875 = Static35.anInt6892;
				}
				Static210.anInt4603 = 1;
				Static155.anInt3667 = 0;
				Static121.anInt2558++;
			}
			if (Static210.anInt4603 == 1) {
				Static145.aClass26_4 = Static62.aClass179_2.method4887(Static134.anInt2875, Static91.aString20);
				Static210.anInt4603 = 2;
			}
			@Pc(127) int local127;
			if (Static210.anInt4603 == 2) {
				if (Static145.aClass26_4.anInt484 == 2) {
					throw new IOException();
				}
				if (Static145.aClass26_4.anInt484 != 1) {
					return;
				}
				Static129.aClass117_2 = new Class117((Socket) Static145.aClass26_4.anObject1, Static62.aClass179_2);
				Static145.aClass26_4 = null;
				Static129.aClass117_2.method3279(Static197.aClass2_Sub12_Sub2_2.anInt3606, Static197.aClass2_Sub12_Sub2_2.aByteArray30);
				if (Static288.aClass88_2 != null) {
					Static288.aClass88_2.method2721();
				}
				if (Static77.aClass88_1 != null) {
					Static77.aClass88_1.method2721();
				}
				local127 = Static129.aClass117_2.method3271();
				if (Static288.aClass88_2 != null) {
					Static288.aClass88_2.method2721();
				}
				if (Static77.aClass88_1 != null) {
					Static77.aClass88_1.method2721();
				}
				if (local127 != 101) {
					Static284.anInt5721 = local127;
					Static210.anInt4603 = 0;
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
					return;
				}
				Static210.anInt4603 = 3;
			}
			if (Static210.anInt4603 == 3 && Static129.aClass117_2.method3273() >= 2) {
				local127 = Static129.aClass117_2.method3271() << 8 | Static129.aClass117_2.method3271();
				Static237.method4315(local127);
				if (Static122.anInt2591 == -1) {
					Static284.anInt5721 = 6;
					Static210.anInt4603 = 0;
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
				} else {
					Static210.anInt4603 = 0;
					Static129.aClass117_2.method3278();
					Static129.aClass117_2 = null;
					Static364.method5838();
				}
			}
		} catch (@Pc(207) IOException local207) {
			if (Static129.aClass117_2 != null) {
				Static129.aClass117_2.method3278();
				Static129.aClass117_2 = null;
			}
			if (Static121.anInt2558 < 1) {
				Static210.anInt4603 = 1;
				Static121.anInt2558++;
				Static155.anInt3667 = 0;
				if (Static35.anInt6892 == Static134.anInt2875) {
					Static134.anInt2875 = Static15.anInt269;
				} else {
					Static134.anInt2875 = Static35.anInt6892;
				}
			} else {
				Static210.anInt4603 = 0;
				Static284.anInt5721 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!jk;)V")
	public static void method84(@OriginalArg(1) Class2_Sub12_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static248.anInt5203; local7++) {
			@Pc(13) int local13 = Static24.anIntArray71[local7];
			@Pc(17) Class1_Sub2_Sub3_Sub1 local17 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local13];
			@Pc(21) int local21 = arg0.method3124();
			if ((local21 & 0x1) != 0) {
				local21 += arg0.method3124() << 8;
			}
			Static91.method1823(local17, local13, arg0, local21);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZIBI)V")
	public static void method85(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static186.method3502(arg2, arg3, 0, arg1, Static339.aClass120_Sub1Array6.length - 1, arg0);
		Static204.aClass2_Sub2_1 = null;
		Static75.anInt1415 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[B")
	public static byte[] method86(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub9_Sub7 local17 = (Class2_Sub9_Sub7) Static187.aClass144_5.method4186((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static172.method3391(local52, local28);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local17 = new Class2_Sub9_Sub7(local22);
			Static187.aClass144_5.method4188((long) arg0, local17);
		}
		return local17.aByteArray19;
	}
}
