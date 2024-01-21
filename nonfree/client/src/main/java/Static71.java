import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray40;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	public static int anInt1742;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Lclient!wd;")
	public static Class97 aClass97_8;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
	public static int anInt1744 = 0;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1075 = Static118.method2249(" is already on your friend list)3");

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1074 = aClass65_1075;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "[Lclient!ph;")
	public static final Class72[] aClass72Array1 = new Class72[24];

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)I")
	public static int method1211(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLclient!eb;)V")
	public static void method1212(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class23 arg1) {
		if (Static202.aClass23_3 != null) {
			try {
				Static202.aClass23_3.method731();
			} catch (@Pc(14) Exception local14) {
			}
			Static202.aClass23_3 = null;
		}
		Static202.aClass23_3 = arg1;
		Static100.method1895(arg0);
		Static82.aClass1_Sub2_Sub21_1 = null;
		Static120.aClass1_Sub14_3.anInt2306 = 0;
		Static157.anInt4278 = 0;
		Static108.aClass1_Sub14_2 = null;
		while (true) {
			@Pc(35) Class1_Sub2_Sub21 local35 = (Class1_Sub2_Sub21) Static89.aClass99_6.method3288();
			if (local35 == null) {
				while (true) {
					local35 = (Class1_Sub2_Sub21) Static93.aClass99_7.method3288();
					if (local35 == null) {
						if (Static70.aByte6 != 0) {
							try {
								@Pc(87) Class1_Sub14 local87 = new Class1_Sub14(4);
								local87.method1710(4);
								local87.method1710(Static70.aByte6);
								local87.method1726(0);
								Static202.aClass23_3.method726(4, local87.aByteArray29);
							} catch (@Pc(110) IOException local110) {
								try {
									Static202.aClass23_3.method731();
								} catch (@Pc(117) Exception local117) {
								}
								Static202.aClass23_3 = null;
								Static188.anInt4139++;
							}
						}
						Static74.anInt1818 = 0;
						Static209.aLong148 = Static190.method3141();
						return;
					}
					Static49.aClass22_1.method724(local35);
					Static19.aClass99_1.method3290(local35, local35.aLong150);
					Static205.anInt4377++;
					Static180.anInt3909--;
				}
			}
			Static33.aClass99_2.method3290(local35, local35.aLong150);
			Static149.anInt3501--;
			Static205.anInt4357++;
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
	public static void method1213() {
		for (@Pc(13) Class1_Sub24 local13 = (Class1_Sub24) Static159.aClass91_19.method3148(); local13 != null; local13 = (Class1_Sub24) Static159.aClass91_19.method3150()) {
			if (local13.anInt4094 > 0) {
				local13.anInt4094--;
			}
			if (local13.anInt4094 != 0) {
				if (local13.anInt4098 > 0) {
					local13.anInt4098--;
				}
				if (local13.anInt4098 == 0 && local13.anInt4100 >= 1 && local13.anInt4087 >= 1 && local13.anInt4100 <= 102 && local13.anInt4087 <= 102 && (local13.anInt4085 < 0 || Static88.method1497(local13.anInt4085, local13.anInt4101))) {
					Static12.method225(local13.anInt4089, local13.anInt4093, local13.anInt4096, local13.anInt4085, local13.anInt4101, local13.anInt4100, local13.anInt4087);
					local13.anInt4098 = -1;
					if (local13.anInt4095 == local13.anInt4085 && local13.anInt4095 == -1) {
						local13.method3295();
					} else if (local13.anInt4085 == local13.anInt4095 && local13.anInt4093 == local13.anInt4086 && local13.anInt4101 == local13.anInt4092) {
						local13.method3295();
					}
				}
			} else if (local13.anInt4095 < 0 || Static88.method1497(local13.anInt4095, local13.anInt4092)) {
				Static12.method225(local13.anInt4089, local13.anInt4086, local13.anInt4096, local13.anInt4095, local13.anInt4092, local13.anInt4100, local13.anInt4087);
				local13.method3295();
			}
		}
	}
}
