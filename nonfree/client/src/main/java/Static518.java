import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_137 = new Class47(77, 7);

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!rr;")
	public static Class292 aClass292_13 = null;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
	public static int anInt8739 = 0;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public static void method7150() {
		@Pc(12) Class6_Sub31 local12 = Static114.method2007(Static288.aClass47_86, Static337.aClass324_1);
		local12.aClass6_Sub21_Sub2_2.method6062(0);
		Static534.method7251(local12);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!vo;")
	public static RuntimeException_Sub1 method7151(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString102 = local9.aString102 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZZII)I")
	public static int method7152(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class6_Sub49 local10 = Static84.method1640(arg2, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray697.length; local18++) {
			if (local10.anIntArray697[local18] >= 0 && local10.anIntArray697[local18] < Static444.aClass322_2.anInt8716) {
				@Pc(40) Class237 local40 = Static444.aClass322_2.method7141(local10.anIntArray697[local18]);
				@Pc(54) int local54 = local40.method5531(Static577.aClass185_2.method4519(arg0).anInt8653, arg0);
				if (arg1) {
					local16 += local10.anIntArray696[local18] * local54;
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}
}
