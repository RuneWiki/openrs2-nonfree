import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!n", name = "Q", descriptor = "Lclient!kh;")
	public static Class29 aClass29_47;

	@OriginalMember(owner = "client!n", name = "W", descriptor = "Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_5;

	@OriginalMember(owner = "client!n", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1054 = Static51.method932("Untersuchen");

	@OriginalMember(owner = "client!n", name = "V", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!he;Z)V")
	public static void method1706(@OriginalArg(1) Class34 arg0, @OriginalArg(2) boolean arg1) {
		if (Static58.aClass34_2 != null) {
			try {
				Static58.aClass34_2.method1136();
			} catch (@Pc(12) Exception local12) {
			}
			Static58.aClass34_2 = null;
		}
		Static58.aClass34_2 = arg0;
		Static104.method1689(arg1);
		Static27.aClass2_Sub11_2.anInt2077 = 0;
		Static10.aClass2_Sub11_1 = null;
		Static160.anInt3404 = 0;
		Static139.aClass2_Sub1_Sub11_1 = null;
		while (true) {
			@Pc(33) Class2_Sub1_Sub11 local33 = (Class2_Sub1_Sub11) Static22.aClass18_1.method687();
			if (local33 == null) {
				while (true) {
					local33 = (Class2_Sub1_Sub11) Static57.aClass18_7.method687();
					if (local33 == null) {
						if (Static123.aByte7 != 0) {
							try {
								@Pc(88) Class2_Sub11 local88 = new Class2_Sub11(4);
								local88.method1439(4);
								local88.method1439(Static123.aByte7);
								local88.method1479(0);
								Static58.aClass34_2.method1130(4, local88.aByteArray24);
							} catch (@Pc(109) IOException local109) {
								try {
									Static58.aClass34_2.method1136();
								} catch (@Pc(114) Exception local114) {
								}
								Static36.anInt926++;
								Static58.aClass34_2 = null;
							}
						}
						Static41.anInt983 = 0;
						Static54.aLong48 = Static29.method615();
						return;
					}
					Static22.aClass28_1.method950(local33);
					Static155.aClass18_10.method685(local33.aLong139, local33);
					Static30.anInt818++;
					Static10.anInt260--;
				}
			}
			Static179.aClass18_12.method685(local33.aLong139, local33);
			Static77.anInt1801--;
			Static130.anInt2900++;
		}
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	public static void method1707() {
		aClass29_47 = null;
		aClass2_Sub1_Sub4_Sub3_5 = null;
		aClass10_1054 = null;
	}
}
