import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "[Lclient!cu;")
	public static Class62[] aClass62Array4;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public static int anInt9279 = 0;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[Lclient!kt;")
	public static final Class206[] aClass206Array1 = new Class206[16];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
	public static boolean method7893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;ZIILjava/lang/String;ZZ)V")
	public static void method7895(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) boolean arg5) {
		Static444.aClass238_206.anInt6471 = 1;
		@Pc(9) String local9 = arg0.toLowerCase();
		@Pc(17) short[] local17 = new short[16];
		@Pc(19) int local19 = -1;
		@Pc(21) String local21 = null;
		if (arg3 != -1) {
			@Pc(30) Class328 local30 = Static106.aClass293_1.method6807(arg3);
			if (local30 == null || arg1 != local30.method7527()) {
				return;
			}
			if (local30.method7527()) {
				local21 = local30.aString87;
			} else {
				local19 = local30.anInt8782;
			}
		}
		@Pc(55) int local55 = 0;
		for (@Pc(57) int local57 = 0; local57 < Static470.aClass250_1.anInt6847; local57++) {
			@Pc(63) Class327 local63 = Static470.aClass250_1.method5960(local57);
			if ((!arg5 || local63.aBoolean622) && local63.anInt8761 == -1 && local63.anInt8726 == -1 && local63.anInt8735 == 0 && local63.aString86.toLowerCase().indexOf(local9) != -1) {
				if (arg3 != -1) {
					if (arg1) {
						if (!arg4.equals(local63.method7498(local21, arg3))) {
							continue;
						}
					} else if (local63.method7508(arg3, local19) != arg2) {
						continue;
					}
				}
				if (local55 >= 250) {
					Static155.aShortArray48 = null;
					Static336.anInt5883 = -1;
					return;
				}
				if (local17.length <= local55) {
					@Pc(143) short[] local143 = new short[local17.length * 2];
					for (@Pc(145) int local145 = 0; local145 < local55; local145++) {
						local143[local145] = local17[local145];
					}
					local17 = local143;
				}
				local17[local55++] = (short) local57;
			}
		}
		Static588.anInt9782 = 0;
		Static155.aShortArray48 = local17;
		Static336.anInt5883 = local55;
		@Pc(186) String[] local186 = new String[Static336.anInt5883];
		for (@Pc(188) int local188 = 0; local188 < Static336.anInt5883; local188++) {
			local186[local188] = Static470.aClass250_1.method5960(local17[local188]).aString86;
		}
		Static240.method8286(local186, Static155.aShortArray48);
		Static444.aClass238_206.method5577();
		Static444.aClass238_206.anInt6471 = 2;
	}
}
