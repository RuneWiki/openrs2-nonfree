import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	public static int anInt1942;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
	public static final int[] anIntArray167 = new int[100];

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!oq;")
	public static Class1_Sub34 aClass1_Sub34_1 = null;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString78 = "Loading - please wait.";

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
	public static int anInt1939 = -1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	public static void method1596() {
		if (Static310.anInt6185 == 0) {
			return;
		}
		try {
			if (++Static123.anInt5165 > 1500) {
				if (Static81.aClass202_3 != null) {
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
				}
				if (Static257.anInt5264 >= 1) {
					Static310.anInt6185 = 0;
					Static6.anInt4143 = -5;
					return;
				}
				Static123.anInt5165 = 0;
				if (Static57.anInt1356 == Static233.anInt4834) {
					Static233.anInt4834 = Static325.anInt2760;
				} else {
					Static233.anInt4834 = Static57.anInt1356;
				}
				Static257.anInt5264++;
				Static310.anInt6185 = 1;
			}
			if (Static310.anInt6185 == 1) {
				Static319.aClass193_5 = Static197.aClass215_5.method5673(Static233.anInt4834, Static30.aString23);
				Static310.anInt6185 = 2;
			}
			@Pc(121) int local121;
			if (Static310.anInt6185 == 2) {
				if (Static319.aClass193_5.anInt5986 == 2) {
					throw new IOException();
				}
				if (Static319.aClass193_5.anInt5986 != 1) {
					return;
				}
				Static81.aClass202_3 = new Class202((Socket) Static319.aClass193_5.anObject7, Static197.aClass215_5);
				Static319.aClass193_5 = null;
				Static81.aClass202_3.method5480(Static305.aClass1_Sub21_Sub2_3.anInt6611, Static305.aClass1_Sub21_Sub2_3.aByteArray82);
				if (Static205.aClass125_1 != null) {
					Static205.aClass125_1.method5316();
				}
				if (Static310.aClass125_2 != null) {
					Static310.aClass125_2.method5316();
				}
				local121 = Static81.aClass202_3.method5478();
				if (Static205.aClass125_1 != null) {
					Static205.aClass125_1.method5316();
				}
				if (Static310.aClass125_2 != null) {
					Static310.aClass125_2.method5316();
				}
				if (local121 != 101) {
					Static6.anInt4143 = local121;
					Static310.anInt6185 = 0;
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
					return;
				}
				Static310.anInt6185 = 3;
			}
			if (Static310.anInt6185 == 3 && Static81.aClass202_3.method5473() >= 2) {
				local121 = Static81.aClass202_3.method5478() << 8 | Static81.aClass202_3.method5478();
				Static245.method832(local121);
				if (Static35.anInt877 == -1) {
					Static6.anInt4143 = 6;
					Static310.anInt6185 = 0;
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
				} else {
					Static310.anInt6185 = 0;
					Static81.aClass202_3.method5477();
					Static81.aClass202_3 = null;
					Static48.method954();
				}
			}
		} catch (@Pc(206) IOException local206) {
			if (Static81.aClass202_3 != null) {
				Static81.aClass202_3.method5477();
				Static81.aClass202_3 = null;
			}
			if (Static257.anInt5264 < 1) {
				if (Static233.anInt4834 == Static57.anInt1356) {
					Static233.anInt4834 = Static325.anInt2760;
				} else {
					Static233.anInt4834 = Static57.anInt1356;
				}
				Static257.anInt5264++;
				Static123.anInt5165 = 0;
				Static310.anInt6185 = 1;
			} else {
				Static310.anInt6185 = 0;
				Static6.anInt4143 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ii;ILclient!ge;BII)V")
	public static void method1598(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) Class69 local16 = Static307.method5320(arg2.lb);
		if (local16.anInt1643 == -1) {
			return;
		}
		if (arg2.aBoolean149) {
			@Pc(33) int local33 = arg3 + arg2.anInt1865;
			arg3 = local33 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(45) Class8 local45 = local16.method1396(arg2.aBoolean141, arg0, arg3);
		if (local45 == null) {
			return;
		}
		@Pc(51) int local51 = arg2.anInt1884;
		@Pc(54) int local54 = arg2.anInt1897;
		if ((arg3 & 0x1) == 1) {
			local51 = arg2.anInt1897;
			local54 = arg2.anInt1884;
		}
		@Pc(68) int local68 = local45.method4381();
		@Pc(71) int local71 = local45.method4395();
		if (local16.aBoolean116) {
			local68 = local51 * 4;
			local71 = local54 * 4;
		}
		if (local16.anInt1653 == 0) {
			local45.method4390(arg4, arg1 + 4 - local54 * 4, local68, local71);
		} else {
			local45.method4391(arg4, arg1 - (local54 - 1) * 4, local68, local71, 1, local16.anInt1653 | 0xFF000000, 1);
		}
	}
}
