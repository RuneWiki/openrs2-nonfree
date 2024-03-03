import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Lclient!r;")
	public static Class197 aClass197_48;

	@OriginalMember(owner = "client!ke", name = "F", descriptor = "[S")
	public static short[] aShortArray55;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!bu;[[BI)V", line = 45)
	public static void method3347(@OriginalArg(0) Class29_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(19) int local19 = arg1.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) byte[] local27 = arg1[local21];
			if (local27 != null) {
				@Pc(34) Class2_Sub4 local34 = new Class2_Sub4(local27);
				local40 = Static268.anIntArray372[local21] >> 8;
				@Pc(46) int local46 = Static268.anIntArray372[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static154.anInt3136;
				@Pc(59) int local59 = local46 * 64 - Static139.anInt2716;
				Static36.method1135();
				arg0.method1087(local53, Class2_Sub3_Sub18.aClass46Array1, local34, local59, Static139.anInt2716, Static154.anInt3136);
				arg0.method1100(local16, local59, local53, Static177.aClass19_8, local34);
				if (!arg0.aBoolean73 && Static98.anInt2184 / 8 == local40 && Static9.anInt212 / 8 == local46) {
					if (local16[0] == -1) {
						Static343.aClass43_1 = null;
					} else {
						Static343.aClass43_1 = Static9.aClass213_1.method5425(local16[0], local16[1], local16[2], Static255.aClass160_1, local16[3]);
						Static68.anInt1681 = local16[4];
					}
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local19; local136++) {
			@Pc(148) int local148 = (Static268.anIntArray372[local136] >> 8) * 64 - Static154.anInt3136;
			local40 = (Static268.anIntArray372[local136] & 0xFF) * 64 - Static139.anInt2716;
			@Pc(163) byte[] local163 = arg1[local136];
			if (local163 == null && Static9.anInt212 < 800) {
				Static36.method1135();
				arg0.method1098(local40, local148);
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 128)
	public static void method3348() {
		@Pc(1) Class98 local1 = Class72.aClass98_10;
		synchronized (Class72.aClass98_10) {
			Class72.aClass98_10.method2623();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I", line = 191)
	public static int method3350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Class59.anIntArray116[arg1 & 0x3] : Class137.anIntArray211[arg1 & 0x3];
	}
}
