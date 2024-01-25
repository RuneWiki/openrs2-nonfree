import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!lr;")
	public static Class129 aClass129_5;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "J")
	public static long aLong173 = -1L;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString51 = null;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!ii;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!vg;")
	public static Class201 aClass201_10 = null;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method4516(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		Static233.aClass93_88.anInt2609 = 1;
		@Pc(9) String local9 = arg1.toLowerCase();
		@Pc(19) short[] local19 = new short[16];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < Static102.anInt1937; local23++) {
			@Pc(28) Class130 local28 = Static322.method544(local23);
			if ((!arg0 || local28.aBoolean298) && local28.anInt3875 == -1 && local28.anInt3876 == -1 && local28.anInt3842 == 0 && local28.aString26.toLowerCase().indexOf(local9) != -1) {
				if (local21 >= 250) {
					Static160.aShortArray38 = null;
					Static249.anInt6209 = -1;
					return;
				}
				if (local21 >= local19.length) {
					@Pc(74) short[] local74 = new short[local19.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local21; local76++) {
						local74[local76] = local19[local76];
					}
					local19 = local74;
				}
				local19[local21++] = (short) local23;
			}
		}
		Static160.aShortArray38 = local19;
		Static249.anInt6209 = local21;
		Static276.anInt5763 = 0;
		@Pc(112) String[] local112 = new String[Static249.anInt6209];
		for (@Pc(114) int local114 = 0; local114 < Static249.anInt6209; local114++) {
			local112[local114] = Static322.method544(local19[local114]).aString26;
		}
		Static252.method4467(local112, Static160.aShortArray38);
		Static233.aClass93_88.method2396();
		Static233.aClass93_88.anInt2609 = 2;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
	public static int method4518() {
		return Static74.anInt1431;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4520(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static368.method5429(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
