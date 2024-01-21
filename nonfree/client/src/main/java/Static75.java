import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	public static final int anInt2183 = 3353893;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1002 = Static24.method441("Schlie-8en");

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1003 = Static24.method441("lila:");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)V")
	public static void method1295(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static32.anInt1047; local21++) {
			if (Static4.aLongArray2[local21] == arg0) {
				Static32.anInt1047--;
				Static19.aBoolean99 = true;
				for (@Pc(45) int local45 = local21; local45 < Static32.anInt1047; local45++) {
					Static67.aClass65Array9[local45] = Static67.aClass65Array9[local45 + 1];
					Static12.anIntArray71[local45] = Static12.anIntArray71[local45 + 1];
					Static4.aLongArray2[local45] = Static4.aLongArray2[local45 + 1];
				}
				Static12.aClass2_Sub8_Sub1_8.method1425(139);
				Static12.aClass2_Sub8_Sub1_8.method1389(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!eb;")
	public static RuntimeException_Sub1 method1296(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString1 = local12.aString1 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1297() {
		Static12.anInt419 = 0;
		@Pc(18) int local18 = (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 >> 7) + Static107.anInt2849;
		@Pc(25) int local25 = (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 >> 7) + Static37.anInt1220;
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static12.anInt419 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static12.anInt419 = 1;
		}
		if (Static12.anInt419 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static12.anInt419 = 0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!k;Lclient!k;ILclient!k;)V")
	public static void method1298(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) Class33 arg2) {
		Static21.aClass33_40 = arg1;
		Static84.aClass33_36 = arg0;
		Static45.aClass33_20 = arg2;
		Static89.aClass2_Sub1_Sub2ArrayArray1 = new Class2_Sub1_Sub2[Static21.aClass33_40.method1135()][];
		Static39.aBooleanArray11 = new boolean[Static21.aClass33_40.method1135()];
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIB)I")
	public static int method1299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg1 / 32 << 7) + (arg0 / 4 << 10) + arg2 / 2;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method1300() {
		aClass65_1002 = null;
		aClass65_1003 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Lclient!o;")
	public static Class2_Sub1_Sub11 method1301(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub11 local10 = (Class2_Sub1_Sub11) Static104.aClass21_35.method744((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static21.aClass33_39.method1150(arg0, 9);
		local10 = new Class2_Sub1_Sub11();
		local10.anInt2122 = arg0;
		if (local20 != null) {
			local10.method1269(new Class2_Sub8(local20));
		}
		local10.method1264();
		Static104.aClass21_35.method745((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!k;I)Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2 method1302(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		return Static23.method425(arg1, arg0, arg2) ? Static81.method1797() : null;
	}
}
