import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!kp", name = "T", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_56 = new Class177(38, -1);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B[[I)V")
	public static void method3398(@OriginalArg(1) int[][] arg0) {
		Static60.anIntArrayArray14 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method3399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(17) int local17 = (arg0 + arg1) / 2;
		@Pc(19) int local19 = arg0;
		@Pc(23) Class103_Sub1 local23 = Static279.aClass103_Sub1Array3[local17];
		Static279.aClass103_Sub1Array3[local17] = Static279.aClass103_Sub1Array3[arg1];
		Static279.aClass103_Sub1Array3[arg1] = local23;
		for (@Pc(35) int local35 = arg0; local35 < arg1; local35++) {
			if (Static6.method69(arg5, Static279.aClass103_Sub1Array3[local35], local23, arg2, arg3, arg4) <= 0) {
				@Pc(54) Class103_Sub1 local54 = Static279.aClass103_Sub1Array3[local35];
				Static279.aClass103_Sub1Array3[local35] = Static279.aClass103_Sub1Array3[local19];
				Static279.aClass103_Sub1Array3[local19++] = local54;
			}
		}
		Static279.aClass103_Sub1Array3[arg1] = Static279.aClass103_Sub1Array3[local19];
		Static279.aClass103_Sub1Array3[local19] = local23;
		method3399(arg0, local19 - 1, arg2, arg3, arg4, arg5);
		method3399(local19 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)I")
	public static int method3400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local5 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local5 * arg1;
		} else {
			return local5;
		}
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V")
	public static void method3406() {
		if (Static134.anInt2989 < 0) {
			return;
		}
		@Pc(7) long local7 = Static250.method3737();
		Static134.anInt2989 = (int) ((long) Static134.anInt2989 + Static192.aLong110 - local7);
		if (Static134.anInt2989 <= 0) {
			Static285.aFloat85 = Static192.aClass108_1.aFloat36;
			Static438.aFloat102 = Static192.aClass108_1.aFloat35;
			Static114.aFloat15 = Static192.aClass108_1.aFloat34;
			Static47.anInt7026 = Static192.aClass108_1.anInt3374;
			Static389.anInt7108 = Static192.aClass108_1.anInt3370;
			Static162.aFloat39 = Static192.aClass108_1.aFloat33;
			Static269.aFloat84 = Static192.aClass108_1.aFloat37;
			Static134.anInt2989 = -1;
			Static222.anInt4443 = Static192.aClass108_1.anInt3371;
			Static139.aFloat22 = Static192.aClass108_1.aFloat38;
			Static388.aClass86_3 = Static192.aClass108_1.aClass86_1;
		} else {
			@Pc(57) int local57 = (Static134.anInt2989 << 8) / Static100.anInt2369;
			@Pc(62) int local62 = 255 - local57;
			@Pc(67) float local67 = (float) local57 / 255.0F;
			Static389.anInt7108 = ((Static192.aClass108_1.anInt3370 & 0xFF00) * local62 + (Static358.anInt6606 & 0xFF00) * local57 & 0xFF0000) + ((Static192.aClass108_1.anInt3370 & 0xFF00FF) * local62 + local57 * (Static358.anInt6606 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(103) float local103 = 1.0F - local67;
			Static114.aFloat15 = local103 * (Static192.aClass108_1.aFloat34 - Static204.aFloat63) + Static204.aFloat63;
			Static222.anInt4443 = local62 * Static192.aClass108_1.anInt3371 + Static296.anInt5568 * local57 >> 8;
			Static285.aFloat85 = (Static192.aClass108_1.aFloat36 - Static249.aFloat65) * local103 + Static249.aFloat65;
			Static47.anInt7026 = (local62 * (Static192.aClass108_1.anInt3374 & 0xFF00FF) + local57 * (Static414.anInt7373 & 0xFF00FF) & 0xFF00FF00) + (local57 * (Static414.anInt7373 & 0xFF00) + (Static192.aClass108_1.anInt3374 & 0xFF00) * local62 & 0xFF0000) >>> 8;
			Static162.aFloat39 = Static372.aFloat96 + local103 * (Static192.aClass108_1.aFloat33 - Static372.aFloat96);
			Static438.aFloat102 = (Static192.aClass108_1.aFloat35 - Static146.aFloat27) * local103 + Static146.aFloat27;
			Static269.aFloat84 = local103 * (Static192.aClass108_1.aFloat37 - Static373.aFloat97) + Static373.aFloat97;
			Static139.aFloat22 = (Static192.aClass108_1.aFloat38 - Static382.aFloat99) * local103 + Static382.aFloat99;
			if (Static192.aClass108_1.aClass86_1 != Static189.aClass86_2) {
				Static388.aClass86_3 = Static194.aClass106_7.method5972(Static189.aClass86_2, Static192.aClass108_1.aClass86_1, local103, Static388.aClass86_3);
			}
		}
		Static192.aLong110 = local7;
	}
}
