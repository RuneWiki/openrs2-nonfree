import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ek", name = "zc", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ek", name = "yc", descriptor = "Z")
	public static boolean aBoolean92 = true;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII)I")
	public static int method1245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class1_Sub28 local17 = (Class1_Sub28) Static84.aClass117_6.method3438((long) arg1);
		if (local17 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local17.anIntArray500.length) {
			return local17.anIntArray500[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!kb;Lclient!kb;)V")
	public static void method1246(@OriginalArg(1) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		Static247.aClass83_168 = arg0;
		Static200.aClass83_111 = arg1;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)Lclient!ha;")
	public static Class1_Sub2_Sub9 method1247() {
		return Static176.aClass1_Sub2_Sub9_2;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)Z")
	public static boolean method1249(@OriginalArg(0) int arg0) {
		@Pc(7) Class140_Sub1 local7 = Static65.method323(arg0);
		if (local7 == null) {
			return false;
		} else if (Static93.anInt2149 == 1 || Static93.anInt2149 == 2 || Static105.anInt6119 == 2) {
			Static113.anInt2454 = local7.anInt5462;
			Static194.aString136 = local7.aString175;
			if (Static105.anInt6119 != 0) {
				Static15.anInt393 = Static113.anInt2454 + 40000;
				Static206.anInt4590 = Static15.anInt393;
				Static98.anInt2195 = Static113.anInt2454 + 50000;
			}
			return true;
		} else {
			@Pc(46) String local46 = "";
			if (Static24.aString15 != null) {
				local46 = "/p=" + Static24.aString15;
			}
			@Pc(60) String local60 = "";
			if (Static105.anInt6119 != 0) {
				local60 = ":" + (local7.anInt5462 + 7000);
			}
			@Pc(129) String local129 = "http://" + local7.aString175 + local60 + "/l=" + Static244.anInt5333 + "/a=" + Static178.anInt4015 + local46 + "/j" + (Static130.aBoolean148 ? "1" : "0") + ",o" + (Static87.aBoolean109 ? "1" : "0") + ",a2,m" + (Static40.aBoolean105 ? "1" : "0");
			try {
				Static26.aClient1.getAppletContext().showDocument(new URL(local129), "_self");
				return true;
			} catch (@Pc(139) Exception local139) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([J[Ljava/lang/Object;IBI)V")
	public static void method1251(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg2];
		arg0[arg2] = local16;
		@Pc(30) Object local30 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local30;
		for (@Pc(42) int local42 = arg3; local42 < arg2; local42++) {
			if (local16 + (long) (local42 & 0x1) > arg0[local42]) {
				@Pc(66) long local66 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local66;
				@Pc(80) Object local80 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local80;
			}
		}
		arg0[arg2] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg2] = arg1[local12];
		arg1[local12] = local30;
		method1251(arg0, arg1, local12 - 1, arg3);
		method1251(arg0, arg1, arg2, local12 + 1);
	}
}
