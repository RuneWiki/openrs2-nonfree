import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	public static int anInt6870;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "Lclient!qi;")
	public static Class206 aClass206_1;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_28 = new Class238(4, 4);

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_357 = new Class123(35, 14);

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_358 = new Class123(102, 0);

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!ph;")
	public static final Class193 aClass193_6 = new Class193("LOCAL", 4);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIII)V")
	public static void method5713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class16 local3 = new Class16();
		local3.anInt514 = arg1 >> Static62.anInt1705;
		local3.anInt530 = arg2 >> Static62.anInt1705;
		local3.anInt509 = arg3 >> Static62.anInt1705;
		local3.anInt521 = arg4 >> Static62.anInt1705;
		local3.anInt519 = arg0;
		local3.anInt512 = arg1;
		local3.anInt526 = arg2;
		local3.anInt511 = arg3;
		local3.anInt528 = arg4;
		local3.anInt510 = arg5;
		local3.anInt517 = arg6;
		Static300.aClass16Array4[Static386.anInt6859++] = local3;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)Z")
	public static boolean method5715(@OriginalArg(1) int arg0) {
		@Pc(7) Class152_Sub1 local7 = Static101.method1830(arg0);
		if (local7 == null) {
			return false;
		} else if (Static325.anInt5594 == 3) {
			@Pc(37) String local37 = "";
			if (Static136.aClass193_3 != Static170.aClass193_5) {
				local37 = ":" + (local7.anInt5635 + 7000);
			}
			@Pc(53) String local53 = "";
			if (Static65.aString14 != null) {
				local53 = "/p=" + Static65.aString14;
			}
			@Pc(102) String local102 = "http://" + local7.aString46 + local37 + "/l=" + Static161.anInt3239 + "/a=" + Static128.anInt2737 + local53 + "/j" + (Static29.aBoolean43 ? "1" : "0") + ",o" + (Static37.aBoolean92 ? "1" : "0") + ",a2";
			try {
				Static448.aClient1.getAppletContext().showDocument(new URL(local102), "_self");
				return true;
			} catch (@Pc(117) Exception local117) {
				return false;
			}
		} else {
			Static207.aString29 = local7.aString46;
			Static118.anInt2485 = local7.anInt5635;
			if (Static136.aClass193_3 != Static170.aClass193_5) {
				Static263.anInt4756 = Static118.anInt2485 + 40000;
				Static124.anInt2566 = Static118.anInt2485 + 50000;
				Static154.anInt3148 = Static263.anInt4756;
			}
			return true;
		}
	}
}
