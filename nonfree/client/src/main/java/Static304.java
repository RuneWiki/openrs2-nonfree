import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public static int anInt10368;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!maa;")
	public static final Class227 aClass227_10 = new Class227();

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_21 = new Class368(13, -1);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILclient!uf;I)V")
	public static void method8964(@OriginalArg(1) int arg0, @OriginalArg(2) Class357 arg1, @OriginalArg(3) int arg2) {
		if (Static537.aBoolean683) {
			@Pc(14) Class204 local14 = Static125.anInt2444 == -1 ? null : Static142.aClass367_1.method9243(Static125.anInt2444);
			if (Static85.method1469(arg1).method1141() && (Static156.anInt3415 & 0x20) != 0 && (local14 == null || arg1.method8979(Static125.anInt2444, local14.anInt5933) != local14.anInt5933)) {
				Static335.method5521(arg1.anInt10396, false, 0L, Static13.aString100 + " -> " + arg1.aString121, arg1.anInt10460, arg1.anInt10432, false, true, Static397.anInt11031, (long) (arg1.anInt10432 << 0 | arg1.anInt10460), 12, Static526.aString109);
			}
		}
		@Pc(93) String local93;
		for (@Pc(86) int local86 = 9; local86 >= 5; local86--) {
			local93 = Static209.method3954(arg1, local86);
			if (local93 != null) {
				Static335.method5521(arg1.anInt10396, false, (long) (local86 + 1), arg1.aString121, arg1.anInt10460, arg1.anInt10432, false, true, Static244.method9717(local86, arg1), (long) (arg1.anInt10432 << 0 | arg1.anInt10460), 1001, local93);
			}
		}
		local93 = Static181.method3540(arg1);
		if (local93 != null) {
			Static335.method5521(arg1.anInt10396, false, 0L, arg1.aString121, arg1.anInt10460, arg1.anInt10432, false, true, arg1.anInt10485, (long) (arg1.anInt10432 << 0 | arg1.anInt10460), 57, local93);
		}
		for (@Pc(172) int local172 = 4; local172 >= 0; local172--) {
			@Pc(179) String local179 = Static209.method3954(arg1, local172);
			if (local179 != null) {
				Static335.method5521(arg1.anInt10396, false, (long) (local172 + 1), arg1.aString121, arg1.anInt10460, arg1.anInt10432, false, true, Static244.method9717(local172, arg1), (long) (arg1.anInt10432 << 0 | arg1.anInt10460), 15, local179);
			}
		}
		if (!Static85.method1469(arg1).method1138()) {
			return;
		}
		if (arg1.aString124 == null) {
			Static335.method5521(arg1.anInt10396, false, 0L, "", arg1.anInt10460, arg1.anInt10432, false, true, -1, (long) (arg1.anInt10432 << 0 | arg1.anInt10460), 53, Static205.aClass134_10.method3906(Static204.anInt8130));
		} else {
			Static335.method5521(arg1.anInt10396, false, 0L, "", arg1.anInt10460, arg1.anInt10432, false, true, -1, (long) (arg1.anInt10460 | arg1.anInt10432 << 0), 53, arg1.aString124);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method8966() {
		Static383.anInt7249 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static510.aClass2_Sub8Array1[local9] = null;
			Static15.aByteArray6[local9] = 1;
			Static221.aClass245Array1[local9] = null;
		}
	}
}
