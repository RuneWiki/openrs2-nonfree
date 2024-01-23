import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "Lclient!o;")
	public static Class86 aClass86_12 = null;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "S")
	public static short aShort28 = 256;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!o;)Z")
	public static boolean method2580(@OriginalArg(1) Class86 arg0) {
		if (arg0.anInt3285 == 205) {
			Static37.anInt769 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2581(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static146.aClass102_1);
		arg0.addMouseMotionListener(Static146.aClass102_1);
		arg0.addFocusListener(Static146.aClass102_1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!o;ZI)V")
	public static void method2582(@OriginalArg(0) Class86 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg0.anInt3218 == 0 ? arg0.anInt3280 : arg0.anInt3218;
		@Pc(20) int local20 = arg0.anInt3266 == 0 ? arg0.anInt3270 : arg0.anInt3266;
		Static49.method1021(Static6.aClass86ArrayArray11[arg0.anInt3239 >> 16], arg1, arg0.anInt3239, local20, local11);
		if (arg0.aClass86Array1 != null) {
			Static49.method1021(arg0.aClass86Array1, arg1, arg0.anInt3239, local20, local11);
		}
		@Pc(62) Class1_Sub11 local62 = (Class1_Sub11) Static154.aClass50_18.method1364((long) arg0.anInt3239);
		if (local62 != null) {
			Static36.method706(local11, local62.anInt1575, arg1, local20);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIIILclient!dg;B)V")
	public static void method2584(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28_Sub1 arg4, @OriginalArg(6) byte arg5) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg1);
		@Pc(16) Class1_Sub2_Sub12 local16 = (Class1_Sub2_Sub12) Static83.aClass50_12.method1364(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub12) Static195.aClass50_25.method1364(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub2_Sub12) Static64.aClass50_11.method1364(local10);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class1_Sub2_Sub12) Static106.aClass50_16.method1364(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub2_Sub12();
			local16.aClass28_Sub1_76 = arg4;
			local16.anInt2836 = arg2;
			local16.aByte10 = arg5;
			if (arg0) {
				Static83.aClass50_12.method1362(local10, local16);
				Static76.anInt1703++;
			} else {
				Static25.aClass85_2.method2432(local16);
				Static64.aClass50_11.method1362(local10, local16);
				Static19.anInt399++;
			}
		} else if (arg0) {
			local16.method3682();
			Static83.aClass50_12.method1362(local10, local16);
			Static19.anInt399--;
			Static76.anInt1703++;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method2585() {
		Static114.aClass120_13 = new Class120();
	}
}
