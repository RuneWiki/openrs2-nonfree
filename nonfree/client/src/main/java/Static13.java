import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!c", name = "D", descriptor = "Lclient!oc;")
	public static Class56 aClass56_14;

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "[I")
	public static int[] anIntArray65 = new int[5];

	@OriginalMember(owner = "client!c", name = "lb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_199 = Static78.method1313("Icons redrawn");

	@OriginalMember(owner = "client!c", name = "ub", descriptor = "I")
	public static int anInt383 = 0;

	@OriginalMember(owner = "client!c", name = "Kb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_200 = Static78.method1313("cross");

	@OriginalMember(owner = "client!c", name = "Nb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_201 = Static78.method1313("gelb:");

	@OriginalMember(owner = "client!c", name = "Qb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_202 = Static78.method1313("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method316(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static31.aClass42_1);
		arg0.removeMouseMotionListener(Static31.aClass42_1);
		arg0.removeFocusListener(Static31.aClass42_1);
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	public static void method325() {
		aClass25_202 = null;
		aByteArrayArray1 = null;
		aClass56_14 = null;
		aClass25_199 = null;
		aClass25_201 = null;
		anIntArray65 = null;
		aClass25_200 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!uc;B)V")
	public static void method342(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class77 arg1) {
		if (Static18.aClass77_3 != null) {
			try {
				Static18.aClass77_3.method1909();
			} catch (@Pc(14) Exception local14) {
			}
			Static18.aClass77_3 = null;
		}
		Static18.aClass77_3 = arg1;
		Static27.method603(arg0);
		Static56.aClass1_Sub5_31 = null;
		Static14.aClass1_Sub2_Sub12_1 = null;
		Static10.aClass1_Sub5_7.anInt792 = 0;
		Static108.anInt2505 = 0;
		while (true) {
			@Pc(39) Class1_Sub2_Sub12 local39 = (Class1_Sub2_Sub12) Static90.aClass66_13.method1647();
			if (local39 == null) {
				while (true) {
					local39 = (Class1_Sub2_Sub12) Static70.aClass66_9.method1647();
					if (local39 == null) {
						if (Static27.aByte2 != 0) {
							try {
								@Pc(94) Class1_Sub5 local94 = new Class1_Sub5(4);
								local94.method676(4);
								local94.method676(Static27.aByte2);
								local94.method675(0);
								Static18.aClass77_3.method1904(4, local94.aByteArray13);
							} catch (@Pc(115) IOException local115) {
								try {
									Static18.aClass77_3.method1909();
								} catch (@Pc(120) Exception local120) {
								}
								Static18.aClass77_3 = null;
								Static21.anInt590++;
							}
						}
						Static38.anInt1079 = 0;
						Static62.aLong95 = Static26.method596();
						return;
					}
					Static127.aClass27_2.method897(local39);
					Static37.aClass66_7.method1653(local39, local39.aLong184);
					Static1.anInt22--;
					Static60.anInt1364++;
				}
			}
			Static75.aClass66_12.method1653(local39, local39.aLong184);
			Static30.anInt823++;
			Static98.anInt2779--;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)Lclient!f;")
	public static Class1_Sub2_Sub7 method343(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub7 local10 = (Class1_Sub2_Sub7) Static35.aClass63_5.method1517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static121.aClass56_91.method1269(8, arg0);
		local10 = new Class1_Sub2_Sub7();
		if (local27 != null) {
			local10.method733(new Class1_Sub5(local27));
		}
		Static35.aClass63_5.method1520(local10, (long) arg0);
		return local10;
	}
}
