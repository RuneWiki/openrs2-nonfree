import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!vd", name = "kb", descriptor = "[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] aClass2_Sub4_Sub3_Sub3Array11;

	@OriginalMember(owner = "client!vd", name = "gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2307 = Static107.method1838(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!vd", name = "lb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2308 = Static107.method1838("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!vd", name = "mb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2309 = aClass28_2308;

	@OriginalMember(owner = "client!vd", name = "pb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2310 = Static107.method1838(":assistreq:");

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
	public static void method2720() {
		aClass2_Sub4_Sub3_Sub3Array11 = null;
		aClass28_2309 = null;
		aClass28_2308 = null;
		aClass28_2310 = null;
		aClass28_2307 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class54 local3 = new Class54();
		local3.anInt2677 = arg2 / 128;
		local3.anInt2691 = arg3 / 128;
		local3.anInt2667 = arg4 / 128;
		local3.anInt2671 = arg5 / 128;
		local3.anInt2670 = arg1;
		local3.anInt2683 = arg2;
		local3.anInt2674 = arg3;
		local3.anInt2666 = arg4;
		local3.anInt2665 = arg5;
		local3.anInt2676 = arg6;
		local3.anInt2679 = arg7;
		Static149.aClass54ArrayArray1[arg0][Static149.anIntArray316[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public static void method2722() {
		@Pc(15) int local15;
		for (@Pc(8) int local8 = -1; local8 < Static35.anInt973; local8++) {
			if (local8 == -1) {
				local15 = 2047;
			} else {
				local15 = Static160.anIntArray327[local8];
			}
			@Pc(25) Class2_Sub4_Sub1_Sub1_Sub2 local25 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local15];
			if (local25 != null && local25.anInt1637 > 0) {
				local25.anInt1637--;
				if (local25.anInt1637 == 0) {
					local25.aClass28_951 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static29.anInt884; local15++) {
			@Pc(58) int local58 = Static129.anIntArray274[local15];
			@Pc(62) Class2_Sub4_Sub1_Sub1_Sub1 local62 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local58];
			if (local62 != null && local62.anInt1637 > 0) {
				local62.anInt1637--;
				if (local62.anInt1637 == 0) {
					local62.aClass28_951 = null;
				}
			}
		}
	}
}
