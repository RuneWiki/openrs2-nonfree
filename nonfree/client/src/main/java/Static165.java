import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Z")
	public static boolean aBoolean173;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public static int anInt3205;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!m;")
	public static final Class127 aClass127_18 = new Class127();

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "S")
	public static short aShort37 = 1;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
	public static boolean aBoolean172 = true;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString123 = " is already on your ignore list.";

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public static int anInt3204 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method2609() {
		Static60.aClass198_16.method5230();
		Static4.aClass198_3.method5230();
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public static void method2610() {
		Static233.method4014(false);
		if (Static148.anInt2912 >= 0 && Static148.anInt2912 != 0) {
			Static276.method4628(Static148.anInt2912);
			Static148.anInt2912 = -1;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method2611() {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = -1; local3 < Static170.anInt6275; local3++) {
			if (local3 == -1) {
				local14 = 2047;
			} else {
				local14 = Static235.anIntArray377[local3];
			}
			@Pc(22) Class5_Sub4_Sub4_Sub1 local22 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local14];
			if (local22 != null && local22.anInt4900 > 0) {
				local22.anInt4900--;
				if (local22.anInt4900 == 0) {
					local22.aString180 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static42.anInt897; local14++) {
			@Pc(65) int local65 = Static130.anIntArray180[local14];
			@Pc(69) Class5_Sub4_Sub4_Sub2 local69 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local65];
			if (local69 != null && local69.anInt4900 > 0) {
				local69.anInt4900--;
				if (local69.anInt4900 == 0) {
					local69.aString180 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIILclient!rk;)V")
	public static void method2613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub38 arg3) {
		@Pc(16) long local16 = (long) (arg0 | arg1 << 14 | arg2 << 28);
		@Pc(22) Class3_Sub40 local22 = (Class3_Sub40) Static128.aClass24_18.method609(local16);
		if (local22 == null) {
			local22 = new Class3_Sub40();
			Static128.aClass24_18.method598(local16, local22);
			local22.aClass127_41.method3387(arg3);
			return;
		}
		@Pc(44) Class41 local44 = Static230.method5537(arg3.anInt5434);
		@Pc(47) int local47 = local44.anInt1206;
		if (local44.anInt1175 == 1) {
			local47 *= arg3.anInt5431 + 1;
		}
		for (@Pc(69) Class3_Sub38 local69 = (Class3_Sub38) local22.aClass127_41.method3402(); local69 != null; local69 = (Class3_Sub38) local22.aClass127_41.method3400()) {
			local44 = Static230.method5537(local69.anInt5434);
			@Pc(79) int local79 = local44.anInt1206;
			if (local44.anInt1175 == 1) {
				local79 *= local69.anInt5431 + 1;
			}
			if (local47 > local79) {
				Static109.method1874(local69, arg3);
				return;
			}
		}
		local22.aClass127_41.method3387(arg3);
	}
}
