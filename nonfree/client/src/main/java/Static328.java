import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public static int anInt5546;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!jg;")
	public static final Class128 aClass128_9 = new Class128();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method4697() {
		Static434.aClass220_56.method4999();
		Static253.aClass220_38.method4999();
		Static260.aClass220_39.method4999();
		Static141.aClass220_17.method4999();
		Static93.aClass220_11.method4999();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)I")
	public static int method4698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static210.anIntArray315[arg0 & 0x3] : Static321.anIntArray468[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIILclient!qq;)V")
	public static void method4699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2) {
		Static307.aClass28_42 = arg2;
		Static78.aClass125ArrayArray1 = new Class125[arg0][arg1];
		if (Static105.anIntArray203 != null) {
			Static35.aClass133_1 = Static439.method5909(Static105.anIntArray203[5], Static105.anIntArray203[4], Static105.anIntArray203[3], Static105.anIntArray203[0], Static105.anIntArray203[1], Static105.anIntArray203[2]);
		}
		Static350.aClass125_2 = new Class125();
		Static121.method1984();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIIIII)I")
	public static int method4701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg2;
			arg2 = local12;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 7 + 1 - arg4 - arg3;
		} else if (local3 == 2) {
			return 7 + 1 - arg5 - arg2;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ta;I)V")
	public static void method4702(@OriginalArg(0) Class3_Sub3_Sub6 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static125.anInt2225 == arg0.anInt6700 || arg0.anInt6713 == -1 || arg0.anInt6725 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class83 local26 = Static244.aClass174_2.method4011(arg0.anInt6713);
			if (local26.aBoolean156 || arg0.anInt6723 + 1 > local26.anIntArray212[arg0.anInt6683]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt6700 - arg0.anInt6686;
			@Pc(60) int local60 = Static125.anInt2225 - arg0.anInt6686;
			@Pc(73) int local73 = arg0.anInt6719 * 128 + arg0.method5512() * 64;
			@Pc(87) int local87 = arg0.anInt6734 * 128 + arg0.method5512() * 64;
			@Pc(100) int local100 = arg0.anInt6751 * 128 + arg0.method5512() * 64;
			@Pc(111) int local111 = arg0.anInt6748 * 128 + arg0.method5512() * 64;
			arg0.anInt6675 = ((local54 - local60) * local73 + local60 * local100) / local54;
			arg0.anInt6677 = (local111 * local60 + local87 * (local54 - local60)) / local54;
		}
		arg0.anInt6757 = 0;
		if (arg0.anInt6718 == 0) {
			arg0.method5522(8192);
		}
		if (arg0.anInt6718 == 1) {
			arg0.method5522(12288);
		}
		if (arg0.anInt6718 == 2) {
			arg0.method5522(0);
		}
		if (arg0.anInt6718 == 3) {
			arg0.method5522(4096);
		}
	}
}
