import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_10;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!lf;")
	public static Class48 aClass48_31 = new Class48(64);

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_776 = Static56.method816("Fps:");

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public static int anInt1675 = 0;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public static int anInt1676 = -1;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public static int anInt1678 = 0;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_777 = Static56.method816(":");

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
	public static int[] anIntArray207 = new int[50];

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
	public static int[] anIntArray208 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_778 = Static56.method816(")1p");

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_779 = Static56.method816("leuchten2:");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ce;B)V")
	public static void method1037(@OriginalArg(0) Class8_Sub1_Sub3_Sub2 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static82.anIntArray255.length; local15++) {
			Static82.anIntArray255[local15] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			Static82.anIntArray255[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(54) int local54;
		@Pc(57) int local57;
		@Pc(64) int local64;
		for (local36 = 0; local36 < 20; local36++) {
			for (local54 = 1; local54 < 255; local54++) {
				for (local57 = 1; local57 < 127; local57++) {
					local64 = (local54 << 7) + local57;
					anIntArray209[local64] = (Static82.anIntArray255[local64 - 1] + Static82.anIntArray255[local64 + 1] + Static82.anIntArray255[local64 - 128] + Static82.anIntArray255[local64 + 128]) / 4;
				}
			}
			@Pc(106) int[] local106 = Static82.anIntArray255;
			Static82.anIntArray255 = anIntArray209;
			anIntArray209 = local106;
		}
		if (arg0 == null) {
			return;
		}
		local54 = 0;
		for (local57 = 0; local57 < arg0.anInt485; local57++) {
			for (local64 = 0; local64 < arg0.anInt484; local64++) {
				if (arg0.aByteArray3[local54++] != 0) {
					@Pc(137) int local137 = arg0.anInt482 + local64 + 16;
					@Pc(144) int local144 = arg0.anInt486 + local57 + 16;
					@Pc(151) int local151 = local137 + (local144 << 7);
					Static82.anIntArray255[local151] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1038() {
		for (@Pc(10) Class8_Sub14 local10 = (Class8_Sub14) Static58.aClass49_7.method1107(); local10 != null; local10 = (Class8_Sub14) Static58.aClass49_7.method1109()) {
			if (local10.aClass8_Sub1_Sub4_1 != null) {
				local10.method1137();
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method1039() {
		aClass14_Sub1_10 = null;
		aClass34_779 = null;
		aClass34_777 = null;
		aClass34_776 = null;
		anIntArray209 = null;
		aClass48_31 = null;
		anIntArray208 = null;
		anIntArray207 = null;
		aClass34_778 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!dd;I)V")
	public static void method1040(@OriginalArg(0) Class14 arg0) {
		Static39.aClass14_13 = arg0;
	}
}
