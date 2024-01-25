import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ak", name = "E", descriptor = "[Lclient!sa;")
	public static Class205[] aClass205Array1;

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
	public static int anInt415 = 0;

	@OriginalMember(owner = "client!ak", name = "J", descriptor = "Lclient!im;")
	public static final Class140 aClass140_6 = new Class140(74, 4);

	@OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
	public static int anInt421 = 0;

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_7 = new Class306("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!ak", name = "S", descriptor = "Lclient!im;")
	public static final Class140 aClass140_7 = new Class140(35, 4);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZBIZII)V")
	public static void method450(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg5 + arg2) / 2;
		@Pc(25) int local25 = arg5;
		@Pc(29) Class185_Sub1 local29 = Static234.aClass185_Sub1Array1[local23];
		Static234.aClass185_Sub1Array1[local23] = Static234.aClass185_Sub1Array1[arg2];
		Static234.aClass185_Sub1Array1[arg2] = local29;
		for (@Pc(41) int local41 = arg5; local41 < arg2; local41++) {
			if (Static3.method208(local29, arg1, Static234.aClass185_Sub1Array1[local41], arg0, arg4, arg3) <= 0) {
				@Pc(61) Class185_Sub1 local61 = Static234.aClass185_Sub1Array1[local41];
				Static234.aClass185_Sub1Array1[local41] = Static234.aClass185_Sub1Array1[local25];
				Static234.aClass185_Sub1Array1[local25++] = local61;
			}
		}
		Static234.aClass185_Sub1Array1[arg2] = Static234.aClass185_Sub1Array1[local25];
		Static234.aClass185_Sub1Array1[local25] = local29;
		method450(arg0, arg1, local25 - 1, arg3, arg4, arg5);
		method450(arg0, arg1, arg2, arg3, arg4, local25 + 1);
	}

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "(I)V")
	public static void method451() {
		if (!Static3.aBoolean5) {
			return;
		}
		while (true) {
			while (Static110.anInt2232 < Static234.aClass185_Sub1Array1.length) {
				@Pc(32) Class185_Sub1 local32 = Static234.aClass185_Sub1Array1[Static110.anInt2232];
				if (local32 != null && local32.anInt7771 == -1) {
					if (Static222.aClass1_Sub44_2 == null) {
						Static222.aClass1_Sub44_2 = Static523.aClass7_1.method371(local32.aString72);
					}
					@Pc(55) int local55 = Static222.aClass1_Sub44_2.anInt7961;
					if (local55 == -1) {
						return;
					}
					Static222.aClass1_Sub44_2 = null;
					local32.anInt7771 = local55;
					Static110.anInt2232++;
				} else {
					Static110.anInt2232++;
				}
			}
			return;
		}
	}
}
