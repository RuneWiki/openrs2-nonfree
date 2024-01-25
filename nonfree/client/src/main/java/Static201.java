import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!js", name = "O", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_60 = new Class2(20, 3);

	@OriginalMember(owner = "client!js", name = "P", descriptor = "Lclient!fs;")
	public static final Class86 aClass86_2 = new Class86(128);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIB)B")
	public static byte method2881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(Z)V")
	public static void method2882() {
		Static187.method2734();
		Static330.method4331();
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!go;IB)V")
	public static void method2883(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray18 != null) {
			@Pc(17) Class7_Sub18 local17 = new Class7_Sub18();
			local17.anObjectArray1 = arg1.anObjectArray18;
			local17.aClass95_5 = arg1;
			Static159.method2352(local17);
		}
		Static250.anInt4255 = arg1.anInt2632;
		Static68.anInt1325 = arg1.anInt2602;
		Static141.anInt2697 = arg2;
		Static194.anInt3446 = arg1.anInt2668;
		Static175.anInt3126 = arg1.anInt2599;
		Static180.anInt3240 = arg0;
		Static402.aBoolean412 = true;
		Static228.anInt3966 = arg1.anInt2583;
		Static413.method5189(arg1);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)V")
	public static void method2884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static255.aClass7_Sub14_Sub1_2.method3933(arg2);
		Static255.aClass7_Sub14_Sub1_2.method3989(arg1);
		Static255.aClass7_Sub14_Sub1_2.method3958(arg0);
	}
}
