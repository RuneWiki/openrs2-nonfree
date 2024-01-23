import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public static int anInt2534;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!ak;")
	public static Class7 aClass7_117;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "Lclient!db;")
	public static Class31 aClass31_21 = new Class31(64);

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "[I")
	public static int[] anIntArray304 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
	public static void method2132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static270.aClass1_Sub18_Sub1_3.method3130(33);
		Static270.aClass1_Sub18_Sub1_3.method3089(arg0);
		Static270.aClass1_Sub18_Sub1_3.method3120(arg1);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!jj;B)V")
	public static void method2133(@OriginalArg(0) Class1_Sub18 arg0) {
		label85: while (true) {
			if (arg0.anInt3911 < arg0.aByteArray71.length) {
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				@Pc(27) boolean local27 = false;
				if (arg0.method3122() == 1) {
					local23 = arg0.method3122();
					local25 = arg0.method3122();
					local27 = true;
				}
				@Pc(49) int local49 = arg0.method3122();
				@Pc(53) int local53 = arg0.method3122();
				@Pc(59) int local59 = local49 * 64 - Static219.anInt4487;
				@Pc(70) int local70 = Static198.anInt3851 + Static77.anInt1559 - local53 * 64 - 1;
				@Pc(148) byte local148;
				@Pc(100) int local100;
				if (local59 >= 0 && local70 - 63 >= 0 && local59 + 63 < Static93.anInt1769 && Static77.anInt1559 > local70) {
					@Pc(96) int local96 = local70 >> 6;
					local100 = local59 >> 6;
					@Pc(102) int local102 = 0;
					while (true) {
						if (local102 >= 64) {
							continue label85;
						}
						for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
							if (!local27 || local102 >= local23 * 8 && local23 * 8 + 8 > local102 && local25 * 8 <= local107 && local107 < local25 * 8 + 8) {
								local148 = arg0.method3082();
								if (local148 != 0) {
									if (Static46.aByteArrayArrayArray7[local100][local96] == null) {
										Static46.aByteArrayArrayArray7[local100][local96] = new byte[4096];
									}
									Static46.aByteArrayArrayArray7[local100][local96][local102 + (63 - local107 << 6)] = local148;
									@Pc(186) byte local186 = arg0.method3082();
									if (Static175.aByteArrayArrayArray15[local100][local96] == null) {
										Static175.aByteArrayArrayArray15[local100][local96] = new byte[4096];
									}
									Static175.aByteArrayArrayArray15[local100][local96][(63 - local107 << 6) + local102] = local186;
								}
							}
						}
						local102++;
					}
				}
				local100 = 0;
				while (true) {
					if ((local27 ? 64 : 4096) <= local100) {
						continue label85;
					}
					local148 = arg0.method3082();
					if (local148 != 0) {
						arg0.anInt3911++;
					}
					local100++;
				}
			}
			return;
		}
	}
}
