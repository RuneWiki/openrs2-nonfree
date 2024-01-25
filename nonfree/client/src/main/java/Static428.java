import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "Lclient!da;")
	public static Class64 aClass64_11;

	@OriginalMember(owner = "client!pea", name = "f", descriptor = "Lclient!eq;")
	public static Class97 aClass97_107;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "[Lclient!ed;")
	public static final Class85[] aClass85Array1 = new Class85[2048];

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "Lclient!pba;")
	public static final Class2_Sub40 aClass2_Sub40_2 = new Class2_Sub40(0, -1);

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_73 = new Class269(70, 5);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZIILclient!ha;Lclient!uw;)V")
	public static void method6427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class87 arg3, @OriginalArg(5) Class350 arg4) {
		@Pc(19) Class375 local19 = Static509.aClass139_3.method3442(arg4.anInt9637);
		if (local19.anInt10173 == -1) {
			return;
		}
		if (arg4.aBoolean711) {
			@Pc(36) int local36 = arg1 + arg4.anInt9657;
			arg1 = local36 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(48) Class20 local48 = local19.method8496(arg1, arg3, arg4.aBoolean708);
		if (local48 == null) {
			return;
		}
		@Pc(54) int local54 = arg4.anInt9662;
		@Pc(57) int local57 = arg4.anInt9622;
		if ((arg1 & 0x1) == 1) {
			local57 = arg4.anInt9662;
			local54 = arg4.anInt9622;
		}
		@Pc(73) int local73 = local48.method4588();
		@Pc(76) int local76 = local48.method4576();
		if (local19.aBoolean754) {
			local76 = local57 * 4;
			local73 = local54 * 4;
		}
		if (local19.anInt10172 == 0) {
			local48.method4583(arg0, arg2 - (local57 - 1) * 4, local73, local76);
		} else {
			local48.method4596(arg0, arg2 + 4 - local57 * 4, local73, local76, 0, local19.anInt10172 | 0xFF000000, 1);
		}
	}
}
