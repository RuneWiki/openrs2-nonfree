import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	public static int anInt6465;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_112 = new Class93(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public static void method5613() {
		for (@Pc(12) int local12 = 0; local12 < Static108.anInt2399; local12++) {
			@Pc(18) Class144 local18 = Static183.method3316(local12);
			if (local18 != null && local18.anInt4348 == 0) {
				Static147.anIntArray22[local12] = 0;
				Static133.anIntArray238[local12] = 0;
			}
		}
		Static23.aClass199_2 = new Class199(128);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILclient!dg;)V")
	public static void method5615(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (Static241.aClass174_5 == null) {
			return;
		}
		try {
			Static241.aClass174_5.method5036(0L);
			Static241.aClass174_5.method5033(arg1.aByteArray57, 24, arg0);
		} catch (@Pc(22) Exception local22) {
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
	public static void method5618() {
		Static221.aClass119_132.method3304();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)V")
	public static void method5619() {
		Static312.aClass119_189.method3315(5);
		Static38.aClass119_24.method3315(5);
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	public static void method5620() {
		if (Static32.aBoolean71) {
			return;
		}
		Static32.aBoolean71 = true;
		if (Static234.aBoolean412) {
			Static92.aFloat28 = (int) Static92.aFloat28 - 65 & 0xFFFFFF80;
		} else {
			Static148.aFloat41 += (-Static148.aFloat41 - 24.0F) / 2.0F;
		}
		Static285.aBoolean515 = true;
	}
}
