import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!r;")
	public static Class197 aClass197_37;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
	public static int anInt2660;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)Z", line = 4)
	public static boolean method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static334.aByteArrayArrayArray16[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static334.aByteArrayArrayArray16[arg2][arg3][arg0] & 0x10) == 0) {
			return Static257.method4768(arg0, arg3, arg2) == arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V", line = 27)
	public static void method2664() {
		Static293.aClass5_1.method4409();
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			Class2_Sub3_Sub10_Sub1.aLongArray12[local12] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Class49_Sub3.aLongArray9[local24] = 0L;
		}
		Static10.anInt247 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 83)
	public static void method2665() {
		if (Class2_Sub3_Sub15.anInt2649 == 0) {
			return;
		}
		try {
			if (++Class219.anInt6097 > 2000) {
				if (Static312.aClass111_4 != null) {
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
				}
				if (Class2_Sub3_Sub9.anInt1623 >= 1) {
					Class213.anInt5956 = -5;
					Class2_Sub3_Sub15.anInt2649 = 0;
					return;
				}
				Class219.anInt6097 = 0;
				if (Static16.anInt4748 == Static81.anInt1841) {
					Static81.anInt1841 = Static307.anInt6181;
				} else {
					Static81.anInt1841 = Static16.anInt4748;
				}
				Class2_Sub3_Sub15.anInt2649 = 1;
				Class2_Sub3_Sub9.anInt1623++;
			}
			if (Class2_Sub3_Sub15.anInt2649 == 1) {
				Static5.aClass32_1 = Static305.aClass152_5.method3752(Static201.aString36, Static81.anInt1841);
				Class2_Sub3_Sub15.anInt2649 = 2;
			}
			@Pc(119) int local119;
			if (Class2_Sub3_Sub15.anInt2649 == 2) {
				if (Static5.aClass32_1.anInt992 == 2) {
					throw new IOException();
				}
				if (Static5.aClass32_1.anInt992 != 1) {
					return;
				}
				Static312.aClass111_4 = new Class111((Socket) Static5.aClass32_1.anObject2, Static305.aClass152_5);
				Static5.aClass32_1 = null;
				Static312.aClass111_4.method2799(Class14.aClass2_Sub4_Sub2_4.anInt5289, Class14.aClass2_Sub4_Sub2_4.aByteArray73);
				if (Static280.aClass221_2 != null) {
					Static280.aClass221_2.method6326();
				}
				if (Static177.aClass221_1 != null) {
					Static177.aClass221_1.method6326();
				}
				local119 = Static312.aClass111_4.method2802();
				if (Static280.aClass221_2 != null) {
					Static280.aClass221_2.method6326();
				}
				if (Static177.aClass221_1 != null) {
					Static177.aClass221_1.method6326();
				}
				if (local119 != 21) {
					Class213.anInt5956 = local119;
					Class2_Sub3_Sub15.anInt2649 = 0;
					Static312.aClass111_4.method2801();
					Static312.aClass111_4 = null;
					return;
				}
				Class2_Sub3_Sub15.anInt2649 = 3;
			}
			if (Class2_Sub3_Sub15.anInt2649 == 3) {
				if (Static312.aClass111_4.method2797() < 1) {
					return;
				}
				Static153.aStringArray23 = new String[Static312.aClass111_4.method2802()];
				Class2_Sub3_Sub15.anInt2649 = 4;
			}
			if (Class2_Sub3_Sub15.anInt2649 == 4 && Static312.aClass111_4.method2797() >= Static153.aStringArray23.length * 8) {
				Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
				Static312.aClass111_4.method2795(Class150.aClass2_Sub4_Sub2_3.aByteArray73, Static153.aStringArray23.length * 8, 0);
				for (local119 = 0; local119 < Static153.aStringArray23.length; local119++) {
					Static153.aStringArray23[local119] = Static189.method3677(Class150.aClass2_Sub4_Sub2_3.method4799());
				}
				Class2_Sub3_Sub15.anInt2649 = 0;
				Class213.anInt5956 = 21;
				Static312.aClass111_4.method2801();
				Static312.aClass111_4 = null;
			}
		} catch (@Pc(219) IOException local219) {
			if (Static312.aClass111_4 != null) {
				Static312.aClass111_4.method2801();
				Static312.aClass111_4 = null;
			}
			if (Class2_Sub3_Sub9.anInt1623 >= 1) {
				Class2_Sub3_Sub15.anInt2649 = 0;
				Class213.anInt5956 = -4;
			} else {
				Class219.anInt6097 = 0;
				Class2_Sub3_Sub15.anInt2649 = 1;
				Class2_Sub3_Sub9.anInt1623++;
				if (Static16.anInt4748 == Static81.anInt1841) {
					Static81.anInt1841 = Static307.anInt6181;
				} else {
					Static81.anInt1841 = Static16.anInt4748;
				}
			}
		}
	}
}
