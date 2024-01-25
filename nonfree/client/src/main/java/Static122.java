import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public static int anInt2380;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "Lclient!bfa;")
	public static Class2_Sub5 aClass2_Sub5_1;

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Lclient!ch;")
	public static Class2_Sub10_Sub1 aClass2_Sub10_Sub1_2;

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
	public static int anInt2385;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_5 = new Class28(15, 0, 1, 0);

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_40 = new Class286(0, 7);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!og;I)V")
	public static void method1783(@OriginalArg(0) Class6_Sub5 arg0) {
		arg0.aClass6_Sub1_1 = null;
		@Pc(12) int local12 = arg0.aClass6_Sub6Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass6_Sub6Array1[local14].aBoolean539 = false;
		}
		@Pc(32) Class109[] local32 = Class326.aClass109Array1;
		synchronized (Class326.aClass109Array1) {
			if (Class326.aClass109Array1.length > local12 && Static244.anIntArray303[local12] < 200) {
				Class326.aClass109Array1[local12].method2313(arg0);
				@Pc(55) int local55 = Static244.anIntArray303[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILclient!ev;Lclient!ev;)V")
	public static void method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub1_Sub3 arg3, @OriginalArg(4) Class6_Sub1_Sub3 arg4) {
		@Pc(4) Class346 local4 = Static308.method4598(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass6_Sub1_Sub3_2 = arg3;
		local4.aClass6_Sub1_Sub3_1 = arg4;
		@Pc(19) int local19 = Static421.aClass67Array7 == Static592.aClass67Array4 ? 1 : 0;
		if (!arg3.method7329()) {
			Static54.aClass6_Sub1ArrayArray2[local19][Static53.anIntArray64[local19]++] = arg3;
		} else if (arg3.method7318()) {
			Static312.aClass6_Sub1ArrayArray3[local19][Static142.anIntArray179[local19]++] = arg3;
		} else {
			Static3.aClass6_Sub1ArrayArray1[local19][Static26.anIntArray39[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7329()) {
			if (arg4.method7318()) {
				Static312.aClass6_Sub1ArrayArray3[local19][Static142.anIntArray179[local19]++] = arg4;
				return;
			}
			Static3.aClass6_Sub1ArrayArray1[local19][Static26.anIntArray39[local19]++] = arg4;
			return;
		}
		Static54.aClass6_Sub1ArrayArray2[local19][Static53.anIntArray64[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!es;)Lclient!jq;")
	public static Class178_Sub1 method1786(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(7) Class178 local7 = Static356.method5274(arg0);
		@Pc(11) int local11 = arg0.method4348();
		return new Class178_Sub1(local7.anInt4794, local7.aClass62_8, local7.aClass279_7, local7.anInt4798, local7.anInt4797, local11);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Lclient!lca;")
	public static Class6_Sub1_Sub5 method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub1_Sub5_1;
	}
}
