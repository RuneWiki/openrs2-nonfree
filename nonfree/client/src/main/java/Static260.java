import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "Lclient!no;")
	public static final Class142 aClass142_11 = new Class142(128);

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
	public static boolean aBoolean346 = false;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;B)V")
	public static void method4521(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4) {
		Static40.method582(arg4, arg1, -1, null, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V")
	public static void method4523(@OriginalArg(1) int arg0) {
		Static307.anInt4795 = -1;
		Static140.anInt2591 = arg0;
		Static307.anInt4795 = -1;
		Static32.method457();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILjava/lang/String;IB)V")
	public static void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class137 local8 = Static188.method3467(arg0, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray16 != null) {
			@Pc(18) Class11_Sub13 local18 = new Class11_Sub13();
			local18.aClass137_5 = local8;
			local18.aString13 = arg2;
			local18.anInt1543 = arg1;
			local18.anObjectArray3 = local8.anObjectArray16;
			Static93.method1353(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt4093 > 0) {
			local35 = Static204.method3653(local8);
		}
		if (!local35 || !Static42.method634(local8).method4733(arg1 - 1)) {
			return;
		}
		if (arg1 == 1) {
			Static313.aClass11_Sub25_Sub1_5.method2454(39);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 2) {
			Static313.aClass11_Sub25_Sub1_5.method2454(40);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 3) {
			Static313.aClass11_Sub25_Sub1_5.method2454(87);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 4) {
			Static313.aClass11_Sub25_Sub1_5.method2454(35);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 5) {
			Static313.aClass11_Sub25_Sub1_5.method2454(33);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 6) {
			Static313.aClass11_Sub25_Sub1_5.method2454(99);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 7) {
			Static313.aClass11_Sub25_Sub1_5.method2454(164);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 8) {
			Static313.aClass11_Sub25_Sub1_5.method2454(150);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 9) {
			Static313.aClass11_Sub25_Sub1_5.method2454(159);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
		if (arg1 == 10) {
			Static313.aClass11_Sub25_Sub1_5.method2454(169);
			Static55.method828(local8.anInt4112, arg3, arg0);
		}
	}
}
