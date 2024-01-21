import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_19;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!af;")
	private static Class5 aClass5_1205 = Static45.method1937("slide:");

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_1204 = aClass5_1205;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_1206 = aClass5_1205;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_1207 = Static45.method1937("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public static int anInt2535 = 0;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public static int anInt2536 = 0;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public static int anInt2537 = 0;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_1208 = Static45.method1937("weiss:");

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array21 = new Class5[100];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method1748() {
		aClass5_1206 = null;
		aClass5_1205 = null;
		aClass5Array21 = null;
		aClass5_1208 = null;
		aClass41_Sub1_19 = null;
		aClass5_1204 = null;
		aClass5_1207 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;I)V")
	public static void method1749(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) Class41 arg2) {
		Static128.aClass41_32 = arg0;
		Static68.aClass41_10 = arg2;
		Static113.aClass41_28 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIB)I")
	public static int method1750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class1_Sub3_Sub1_Sub4.anIntArray424[arg0 * 1024 / arg1] >> 1;
		return ((65536 - local11) * arg2 >> 16) + (local11 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BII)I")
	public static int method1751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!qc;)V")
	public static void method1752(@OriginalArg(1) Class1_Sub3_Sub1_Sub3 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static17.anIntArray70.length; local15++) {
			Static17.anIntArray70[local15] = 0;
		}
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 5000; local30++) {
			local40 = (int) ((double) 256 * Math.random() * 128.0D);
			Static17.anIntArray70[local40] = (int) (Math.random() * 256.0D);
		}
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(70) int local70;
		for (local40 = 0; local40 < 20; local40++) {
			for (local57 = 1; local57 < 255; local57++) {
				for (local61 = 1; local61 < 127; local61++) {
					local70 = local61 + (local57 << 7);
					Static25.anIntArray89[local70] = (Static17.anIntArray70[local70 + 128] + Static17.anIntArray70[local70 - 128] + Static17.anIntArray70[local70 - 1] + Static17.anIntArray70[local70 + 1]) / 4;
				}
			}
			@Pc(116) int[] local116 = Static17.anIntArray70;
			Static17.anIntArray70 = Static25.anIntArray89;
			Static25.anIntArray89 = local116;
		}
		if (arg0 == null) {
			return;
		}
		local57 = 0;
		for (local61 = 0; local61 < arg0.anInt2442; local61++) {
			for (local70 = 0; local70 < arg0.anInt2443; local70++) {
				if (arg0.aByteArray33[local57++] != 0) {
					@Pc(150) int local150 = local61 + arg0.anInt2444 + 16;
					@Pc(157) int local157 = local70 + arg0.anInt2447 + 16;
					@Pc(164) int local164 = local157 + (local150 << 7);
					Static17.anIntArray70[local164] = 0;
				}
			}
		}
	}
}
