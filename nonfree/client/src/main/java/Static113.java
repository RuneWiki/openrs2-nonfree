import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1115 = Static169.method2903("Walk here");

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1114 = aClass23_1115;

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "Lclient!td;")
	public static Class79 aClass79_16 = new Class79(64);

	@OriginalMember(owner = "client!nh", name = "ab", descriptor = "Lclient!bf;")
	public static Class10 aClass10_9 = new Class10(4096);

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
	public static void method2004() {
		aClass10_9 = null;
		aClass23_1115 = null;
		aClass23_1114 = null;
		aClass79_16 = null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IJ)V")
	public static void method2005(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static65.anInt3673; local12++) {
			if (arg0 == Static70.aLongArray4[local12]) {
				Static65.anInt3673--;
				for (@Pc(30) int local30 = local12; local30 < Static65.anInt3673; local30++) {
					Static70.aLongArray4[local30] = Static70.aLongArray4[local30 + 1];
					Static163.aClass23Array22[local30] = Static163.aClass23Array22[local30 + 1];
				}
				Static23.anInt698 = Static176.anInt4191;
				Static25.aClass1_Sub8_Sub1_1.method919(253);
				Static25.aClass1_Sub8_Sub1_1.method873(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(BII)V")
	public static void method2006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static7.anInt328 == 2) {
			Static140.method2469((Static105.anInt2702 - Static152.anInt3545 << 7) + Static116.anInt3015, Static103.anInt2647 + (-Static75.anInt2039 + Static127.anInt3360 << 7), Static144.anInt3642 * 2);
			if (Static176.anInt4187 > -1 && Static26.anInt845 % 20 < 10) {
				Static122.aClass1_Sub1_Sub12_Sub1Array9[0].method1944(arg0 + Static176.anInt4187 - 12, Static16.anInt497 + -28 + arg1);
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZILclient!ga;Lclient!ga;)V")
	public static void method2007(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) Class30 arg2) {
		Static166.aBoolean204 = arg0;
		Static29.aClass30_15 = arg1;
		Static111.aClass30_41 = arg2;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ig;BLclient!f;I)V")
	public static void method2008(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(2) Class27 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class1_Sub25 local15 = new Class1_Sub25();
		local15.aLong140 = arg2;
		local15.aClass27_6 = arg1;
		local15.aClass30_Sub1_19 = arg0;
		local15.anInt4202 = 1;
		@Pc(30) Class56 local30 = Static102.aClass56_10;
		synchronized (Static102.aClass56_10) {
			Static102.aClass56_10.method1856(local15);
		}
		Static33.method573();
	}
}
