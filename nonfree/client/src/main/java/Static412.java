import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!oia", name = "n", descriptor = "I")
	public static int anInt6934;

	@OriginalMember(owner = "client!oia", name = "p", descriptor = "Lclient!hu;")
	public static Class155 aClass155_10;

	@OriginalMember(owner = "client!oia", name = "q", descriptor = "I")
	public static int anInt6936 = 0;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(II[Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method6050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg2[arg0];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg1 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg0; local34 < local30; local34++) {
				@Pc(39) String local39 = arg2[local34];
				if (local39 == null) {
					local32 += 4;
				} else {
					local32 += local39.length();
				}
			}
			@Pc(66) StringBuffer local66 = new StringBuffer(local32);
			for (@Pc(68) int local68 = arg0; local68 < local30; local68++) {
				@Pc(73) String local73 = arg2[local68];
				if (local73 == null) {
					local66.append("null");
				} else {
					local66.append(local73);
				}
			}
			return local66.toString();
		}
	}

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "(I)V")
	public static void method6052() {
		for (@Pc(14) Class2_Sub52 local14 = (Class2_Sub52) Static560.aClass323_36.method7480(); local14 != null; local14 = (Class2_Sub52) Static560.aClass323_36.method7482()) {
			if (local14.aBoolean761) {
				local14.aBoolean761 = false;
			} else {
				Static141.method2564(local14.anInt10449);
			}
		}
	}
}
