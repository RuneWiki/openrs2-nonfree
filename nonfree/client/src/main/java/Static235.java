import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "[I")
	public static int[] anIntArray330;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_10 = new Class60(10, 7);

	@OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
	public static int anInt4108 = 0;

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "[I")
	public static final int[] anIntArray329 = new int[5];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)Z")
	public static boolean method3419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static362.method5162(arg1, arg0) | (arg0 & 0x70000) != 0 || Static434.method5821(arg0, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	public static void method3420() {
		if (Static312.anInt5262 == 0) {
			return;
		}
		try {
			if (++Static305.anInt5156 > 2000) {
				if (Static169.aClass114_4 != null) {
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
				}
				if (Static382.anInt5721 >= 1) {
					Static230.anInt4025 = -5;
					Static312.anInt5262 = 0;
					return;
				}
				if (Static168.anInt3019 == Static29.anInt481) {
					Static29.anInt481 = Static11.anInt231;
				} else {
					Static29.anInt481 = Static168.anInt3019;
				}
				Static382.anInt5721++;
				Static305.anInt5156 = 0;
				Static312.anInt5262 = 1;
			}
			if (Static312.anInt5262 == 1) {
				Static439.aClass159_9 = Static403.aClass42_6.method656(Static63.aString24, Static29.anInt481);
				Static312.anInt5262 = 2;
			}
			@Pc(113) int local113;
			if (Static312.anInt5262 == 2) {
				if (Static439.aClass159_9.anInt4271 == 2) {
					throw new IOException();
				}
				if (Static439.aClass159_9.anInt4271 != 1) {
					return;
				}
				Static169.aClass114_4 = new Class114((Socket) Static439.aClass159_9.anObject8, Static403.aClass42_6);
				Static439.aClass159_9 = null;
				Static169.aClass114_4.method2497(Static201.aClass1_Sub14_Sub2_2.anInt5695, Static201.aClass1_Sub14_Sub2_2.aByteArray65);
				Static206.method3160();
				local113 = Static169.aClass114_4.method2499();
				Static206.method3160();
				if (local113 != 21) {
					Static312.anInt5262 = 0;
					Static230.anInt4025 = local113;
					Static169.aClass114_4.method2496();
					Static169.aClass114_4 = null;
					return;
				}
				Static312.anInt5262 = 3;
			}
			if (Static312.anInt5262 == 3) {
				if (Static169.aClass114_4.method2495() < 1) {
					return;
				}
				Static50.aStringArray6 = new String[Static169.aClass114_4.method2499()];
				Static312.anInt5262 = 4;
			}
			if (Static312.anInt5262 == 4 && Static169.aClass114_4.method2495() >= Static50.aStringArray6.length * 8) {
				Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
				Static169.aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, Static50.aStringArray6.length * 8);
				for (local113 = 0; local113 < Static50.aStringArray6.length; local113++) {
					Static50.aStringArray6[local113] = Static138.method5724(Static116.aClass1_Sub14_Sub2_1.method4547());
				}
				Static312.anInt5262 = 0;
				Static230.anInt4025 = 21;
				Static169.aClass114_4.method2496();
				Static169.aClass114_4 = null;
			}
		} catch (@Pc(218) IOException local218) {
			if (Static169.aClass114_4 != null) {
				Static169.aClass114_4.method2496();
				Static169.aClass114_4 = null;
			}
			if (Static382.anInt5721 < 1) {
				if (Static168.anInt3019 == Static29.anInt481) {
					Static29.anInt481 = Static11.anInt231;
				} else {
					Static29.anInt481 = Static168.anInt3019;
				}
				Static382.anInt5721++;
				Static305.anInt5156 = 0;
				Static312.anInt5262 = 1;
			} else {
				Static230.anInt4025 = -4;
				Static312.anInt5262 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(CB)Z")
	public static boolean method3422(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)I")
	public static int method3424() {
		return Static346.anInt6353;
	}
}
