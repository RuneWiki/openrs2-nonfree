import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "T", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!al", name = "U", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!al", name = "V", descriptor = "Lclient!ia;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!al", name = "Q", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_9 = new Class189("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!al", name = "W", descriptor = "[B")
	public static final byte[] aByteArray6 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;Lclient!to;III)V")
	public static void method287(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class118 local12;
		if (arg3 < Static405.anInt6684) {
			local12 = Static263.aClass118ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass7_Sub1_1 != null && local12.aClass7_Sub1_1.method5276()) {
				arg1.method5273(Static205.anInt3992, arg0, true, local12.aClass7_Sub1_1, 0, 0);
			}
		}
		if (arg4 < Static405.anInt6684) {
			local12 = Static263.aClass118ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass7_Sub1_1 != null && local12.aClass7_Sub1_1.method5276()) {
				arg1.method5273(0, arg0, true, local12.aClass7_Sub1_1, Static205.anInt3992, 0);
			}
		}
		if (arg3 < Static405.anInt6684 && arg4 < Static37.anInt1025) {
			local12 = Static263.aClass118ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass7_Sub1_1 != null && local12.aClass7_Sub1_1.method5276()) {
				arg1.method5273(Static205.anInt3992, arg0, true, local12.aClass7_Sub1_1, Static205.anInt3992, 0);
			}
		}
		if (arg3 < Static405.anInt6684 && arg4 > 0) {
			local12 = Static263.aClass118ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass7_Sub1_1 != null && local12.aClass7_Sub1_1.method5276()) {
				arg1.method5273(Static205.anInt3992, arg0, true, local12.aClass7_Sub1_1, -Static205.anInt3992, 0);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!pa;III)J")
	public static long method289(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class93 local16 = Static435.aClass30_4.method769(arg0.method4808());
		@Pc(37) long local37 = (long) (arg0.method4810() << 14 | arg2 | arg1 << 7 | arg0.method4807() << 20 | 0x40000000);
		if (local16.anInt2768 == 0) {
			local37 |= local9;
		}
		if (local16.anInt2752 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean253) {
			local37 |= local7;
		}
		return local37 | (long) arg0.method4808() << 32;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V")
	public static void method290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1007) {
			Static285.method4054(Static332.aClass167_8, arg1, arg0);
		} else if (arg2 == 1008) {
			Static285.method4054(Static422.aClass167_9, arg1, arg0);
		} else if (arg2 == 1012) {
			Static285.method4054(Static207.aClass167_4, arg1, arg0);
		} else if (arg2 == 1003) {
			Static285.method4054(Static14.aClass167_1, arg1, arg0);
		} else if (arg2 == 1009) {
			Static285.method4054(Static122.aClass167_3, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method291(@OriginalArg(1) String arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static408.aStringArray47.length; local14++) {
			if (Static408.aStringArray47[local14].equalsIgnoreCase(arg0)) {
				return local14;
			}
		}
		return -1;
	}
}
