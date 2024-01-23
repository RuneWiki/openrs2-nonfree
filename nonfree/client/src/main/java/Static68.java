import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1 aClass1_Sub2_Sub14_Sub1_1;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!kb;")
	public static Class83 aClass83_44;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	public static int anInt1755 = 0;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V")
	public static void method1297() {
		Static263.aClass155_43.method4364(5);
		Static200.aClass155_32.method4364(5);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1298(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static191.aClass158_1);
		arg0.addMouseMotionListener(Static191.aClass158_1);
		arg0.addFocusListener(Static191.aClass158_1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLclient!ok;)Z")
	public static boolean method1299(@OriginalArg(1) Class116 arg0) {
		if (arg0.anIntArray392 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray392.length; local20++) {
			@Pc(30) int local30 = Static127.method2178(arg0, local20);
			@Pc(35) int local35 = arg0.anIntArray393[local20];
			if (arg0.anIntArray392[local20] == 2) {
				if (local35 <= local30) {
					return false;
				}
			} else if (arg0.anIntArray392[local20] == 3) {
				if (local30 <= local35) {
					return false;
				}
			} else if (arg0.anIntArray392[local20] == 4) {
				if (local35 == local30) {
					return false;
				}
			} else if (local30 != local35) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method1300() {
		if (Static283.aBoolean322) {
			return;
		}
		Static283.aBoolean322 = true;
		if (Static205.aBoolean243) {
			Static125.aFloat97 = (int) Static125.aFloat97 + 191 & 0xFFFFFF80;
		} else {
			Static279.aFloat196 += (24.0F - Static279.aFloat196) / 2.0F;
		}
		Static37.aBoolean69 = true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!rg;")
	public static Class1_Sub2_Sub16_Sub2 method1302(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub2_Sub16_Sub2 local16 = (Class1_Sub2_Sub16_Sub2) Static37.aClass155_7.method4358((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static259.aClass83_179.method2306(arg0, 0);
		local16 = new Class1_Sub2_Sub16_Sub2(local26);
		local16.method3963(Static216.aClass7Array3, null);
		Static37.aClass155_7.method4360((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public static void method1303() {
		Static99.aClass155_17.method4362();
		Static285.aClass155_46.method4362();
	}
}
