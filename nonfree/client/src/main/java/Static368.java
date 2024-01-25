import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_138 = new Class239(78, -2);

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray32 = new boolean[100];

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	public static int anInt6903 = 0;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	public static int anInt6904 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZLclient!br;Z)V")
	public static void method5870(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub9 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt833;
		@Pc(12) int local12 = (int) arg1.aLong241;
		arg1.method7802();
		if (arg0) {
			Static277.method4362(local8);
		}
		Static234.method3655(local8);
		@Pc(32) Class310 local32 = Static111.method2143(local12);
		if (local32 != null) {
			Static273.method4342(local32);
		}
		Static113.method2229();
		if (!arg2 && Static387.anInt7341 != -1) {
			Static363.method1117(1, Static387.anInt7341);
		}
		@Pc(57) Class172 local57 = new Class172(Static110.aClass127_21);
		for (@Pc(62) Class2_Sub9 local62 = (Class2_Sub9) local57.method4304(); local62 != null; local62 = (Class2_Sub9) local57.method4300()) {
			if (!local62.method7799()) {
				local62 = (Class2_Sub9) local57.method4304();
				if (local62 == null) {
					return;
				}
			}
			if (local62.anInt832 == 3) {
				@Pc(88) int local88 = (int) local62.aLong241;
				if (local8 == local88 >>> 16) {
					method5870(true, local62, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
	public static boolean method5871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method5872() {
		Static359.anIntArray520 = Static268.method4295(0.4F);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZZ)V")
	public static void method5873(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static450.anInt8197++;
			Static204.method3282();
		}
		if (arg1) {
			Static93.anInt1821++;
			Static274.method4347();
		}
	}
}
