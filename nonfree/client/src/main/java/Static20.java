import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bg", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString24 = "green:";

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
	public static int anInt382 = 0;

	@OriginalMember(owner = "client!bg", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString25 = "glow3:";

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lclient!sf;")
	public static Class160 method354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class160 local14 = local7.aClass160_1;
			local7.aClass160_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILclient!bf;ZII)Lclient!bf;")
	public static Class15_Sub2 method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg5;
		@Pc(14) Class15_Sub2 local14 = (Class15_Sub2) Static46.aClass187_25.method4527(local8);
		if (local14 == null) {
			@Pc(21) Class15_Sub6 local21 = Static241.method3755(Static3.aClass121_1, arg5);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method3760(64, 768, -50, -10, -50);
			Static46.aClass187_25.method4524(local8, local14);
		}
		@Pc(42) int local42 = arg3.method1039();
		@Pc(45) int local45 = arg3.method1033();
		@Pc(48) int local48 = arg3.method1031();
		@Pc(51) int local51 = arg3.method1018();
		local14 = local14.method1032(true, true, true);
		if (arg4 != 0) {
			local14.method1034(arg4);
		}
		@Pc(104) int local104;
		if (Static156.aBoolean211) {
			@Pc(71) Class15_Sub2_Sub1 local71 = (Class15_Sub2_Sub1) local14;
			if (arg2 != Static69.method4275(local48 + arg1, Static65.anInt1300, local42 + arg0) || arg2 != Static69.method4275(local51 + arg1, Static65.anInt1300, local45 + arg0)) {
				for (local104 = 0; local104 < local71.anInt923; local104++) {
					local71.anIntArray51[local104] += Static69.method4275(arg1 + local71.anIntArray49[local104], Static65.anInt1300, local71.anIntArray53[local104] + arg0) - arg2;
				}
				local71.aClass171_1.aBoolean339 = false;
				local71.aClass33_2.aBoolean52 = false;
			}
		} else {
			@Pc(150) Class15_Sub2_Sub2 local150 = (Class15_Sub2_Sub2) local14;
			if (Static69.method4275(local48 + arg1, Static65.anInt1300, arg0 + local42) != arg2 || Static69.method4275(local51 + arg1, Static65.anInt1300, arg0 + local45) != arg2) {
				for (local104 = 0; local104 < local150.anInt1114; local104++) {
					local150.anIntArray69[local104] += Static69.method4275(arg1 + local150.anIntArray71[local104], Static65.anInt1300, local150.anIntArray70[local104] + arg0) - arg2;
				}
				local150.aBoolean63 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method358(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static8.method120(Static124.method4681(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
