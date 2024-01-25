import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public static int anInt6399;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "S")
	public static short aShort81 = 256;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString239 = "Attack";

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public static int anInt6396 = 0;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
	public static int anInt6400 = 13156520;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method5348(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static112.method2071(arg0.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
	public static void method5349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static147.aClass154_51 = new Class154(arg0);
		Static35.aClass154_7 = new Class154(arg1);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIB)I")
	public static int method5350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub41 local12 = (Class4_Sub41) Static301.aClass198_34.method5261((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local12.anIntArray537.length; local30++) {
				if (arg0 == local12.anIntArray538[local30]) {
					local28 += local12.anIntArray537[local30];
				}
			}
			return local28;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!me;I)V")
	public static void method5351(@OriginalArg(0) Class126 arg0) {
		Static298.aClass126_1 = arg0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public static void method5352() {
		@Pc(12) Class154 local12 = Static256.aClass154_80;
		synchronized (Static256.aClass154_80) {
			Static256.aClass154_80.method4212();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([BII)I")
	public static int method5353(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static352.method5475(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)Lclient!ng;")
	public static Class136 method5355(@OriginalArg(1) int arg0) {
		@Pc(17) Class136 local17 = (Class136) Static317.aClass154_98.method4222((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(29) byte[] local29 = Static272.aClass11_121.method288(arg0, 31);
		local17 = new Class136();
		if (local29 != null) {
			local17.method3637(arg0, new Class4_Sub7(local29));
		}
		Static317.aClass154_98.method4221((long) arg0, local17);
		return local17;
	}
}
