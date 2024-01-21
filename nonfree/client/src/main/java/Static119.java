import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public static int anInt2563;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!db;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!ua;")
	public static Class72 aClass72_27 = new Class72(64);

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_1218 = Static134.method2017("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_1219 = Static134.method2017("sl_back");

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	public static int anInt2566 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method1800() {
		aClass76_1219 = null;
		aClass16_1 = null;
		aClass76_1218 = null;
		aClass72_27 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method1801() {
		Static31.aClass72_12.method1786();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIB)I")
	public static int method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * local13 + arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00) + (arg2 * (arg1 & 0xFF00) + (arg0 & 0xFF00) * local13 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)Lclient!nd;")
	public static Class4_Sub14 method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class4_Sub14 local16 = new Class4_Sub14();
		local16.anInt1980 = arg2;
		local16.anInt1983 = arg0;
		Static42.aClass28_3.method774((long) arg1, local16);
		Static79.method559(arg2);
		Static96.method1543(arg2);
		@Pc(40) Class4_Sub8 local40 = Static52.method946(arg1);
		if (local40 != null) {
			Static63.method1095(local40);
		}
		if (Static65.aClass4_Sub8_5 != null) {
			Static63.method1095(Static65.aClass4_Sub8_5);
			Static65.aClass4_Sub8_5 = null;
		}
		Static10.anInt206 = 0;
		Static32.aBoolean56 = false;
		Static3.method1526(Static36.anInt1035, Static9.anInt175, Static13.anInt230, Static42.anInt1164);
		if (Static6.anInt132 != -1) {
			Static6.method85(1, Static6.anInt132);
		}
		return local16;
	}
}
