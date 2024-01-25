import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
	public static int anInt209 = 0;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString3 = "";

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method230(@OriginalArg(0) Class1_Sub19 arg0) {
		if (arg0.aByteArray38.length - arg0.anInt3698 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method2915();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray38.length - arg0.anInt3698 < 2) {
			return;
		}
		@Pc(42) int local42 = arg0.method2896();
		if (arg0.aByteArray38.length - arg0.anInt3698 < local42 * 6) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < local42; local60++) {
			@Pc(66) int local66 = arg0.method2896();
			@Pc(70) int local70 = arg0.method2877();
			if (local66 < Static136.anIntArray184.length && Static173.aBooleanArray67[local66] && (Static311.aClass125_1.method2687(local66).aChar2 != '1' || local70 >= -1 && local70 <= 1)) {
				Static136.anIntArray184[local66] = local70;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BJLclient!za;)V")
	public static void method232(@OriginalArg(1) long arg0, @OriginalArg(2) Class117 arg1) {
		Static462.anInt7417 = Static374.anInt6023;
		Static408.anInt4869 = 0;
		Static374.anInt6023 = 0;
		@Pc(14) long local14 = Static183.method2674();
		for (@Pc(19) Class111_Sub4 local19 = (Class111_Sub4) Static242.aClass63_5.method1019(); local19 != null; local19 = (Class111_Sub4) Static242.aClass63_5.method1022()) {
			if (local19.method3411(arg1, arg0)) {
				Static408.anInt4869++;
			}
		}
		if (Static352.aBoolean512 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static242.aClass63_5.method1021() + ", running: " + Static408.anInt4869 + ". Particles: " + Static374.anInt6023 + ". Time taken: " + (Static183.method2674() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BII[B)Ljava/lang/String;")
	public static String method236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) char[] local13 = new char[arg0];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[arg1 + local17] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(44) char local44 = Static292.aCharArray3[local27 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local27 = local44;
				}
				local13[local15++] = (char) local27;
			}
		}
		return new String(local13, 0, local15);
	}
}
