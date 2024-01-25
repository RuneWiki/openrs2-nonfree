import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!qaa", name = "H", descriptor = "Lclient!qba;")
	public static Class25 aClass25_4;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IB)V")
	public static void method5806(@OriginalArg(0) int arg0) {
		Static460.anIntArray621 = new int[arg0];
		Static298.anIntArray407 = new int[arg0];
		Static213.anIntArray327 = new int[arg0];
		Static55.anIntArray141 = new int[arg0];
		Static9.anIntArray16 = new int[arg0];
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(14) String local14 = arg2[arg0];
			return local14 == null ? "null" : local14.toString();
		} else {
			@Pc(26) int local26 = arg1 + arg0;
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = arg0; local30 < local26; local30++) {
				@Pc(35) String local35 = arg2[local30];
				if (local35 == null) {
					local28 += 4;
				} else {
					local28 += local35.length();
				}
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local28);
			for (@Pc(68) int local68 = arg0; local68 < local26; local68++) {
				@Pc(73) String local73 = arg2[local68];
				if (local73 == null) {
					local57.append("null");
				} else {
					local57.append(local73);
				}
			}
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZIFIZIII)[I")
	public static int[] method5809(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub3_Sub7 local10 = new Class1_Sub3_Sub7();
		local10.anInt1709 = 4;
		local10.aBoolean121 = true;
		local10.anInt1702 = 35;
		local10.anInt1711 = 8;
		local10.anInt1703 = (int) (arg0 * 4096.0F);
		local10.anInt1704 = 8;
		local10.method7912();
		Static400.method6036(1, 2048);
		local10.method1682(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!kda;II)Lclient!lg;")
	public static Class177 method5813(@OriginalArg(1) Class160 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4198(0, arg1);
		return local9 == null ? null : new Class177(local9);
	}
}
