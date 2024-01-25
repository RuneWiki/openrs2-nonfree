import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!so", name = "j", descriptor = "Lclient!kn;")
	public static Class148 aClass148_5;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!mn;")
	public static Class171 aClass171_98;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_124 = new Class231("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!so", name = "i", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_125 = new Class231("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!so", name = "l", descriptor = "[Lclient!nb;")
	public static final Class2_Sub1_Sub12[] aClass2_Sub1_Sub12Array8 = new Class2_Sub1_Sub12[14];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLclient!mn;II)Lclient!fc;")
	public static Class76 method5924(@OriginalArg(1) Class171 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3658(arg1, 0);
		return local9 == null ? null : new Class76(local9);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!na;IIBII)Lclient!me;")
	public static Class64_Sub4_Sub1 method5925(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean360 || Static409.method687(arg4) && Static409.method687(arg3)) {
			return new Class64_Sub4_Sub1(arg0, 3553, arg1, arg2, arg4, arg3, true);
		} else if (arg0.aBoolean345) {
			return new Class64_Sub4_Sub1(arg0, 34037, arg1, arg2, arg4, arg3, true);
		} else {
			return new Class64_Sub4_Sub1(arg0, arg1, arg2, arg4, arg3, Static43.method654(arg4), Static43.method654(arg3), true);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBI)I")
	public static int method5926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
