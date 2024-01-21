import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!di", name = "C", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_5;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public static int anInt948 = 0;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[250][];

	@OriginalMember(owner = "client!di", name = "r", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_297 = Static181.method2795("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!di", name = "l", descriptor = "Lclient!qe;")
	public static Class83 aClass83_296 = aClass83_297;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_298 = Static181.method2795(": ");

	@OriginalMember(owner = "client!di", name = "z", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_299 = Static181.method2795("<col=ff3000>");

	@OriginalMember(owner = "client!di", name = "F", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_300 = Static181.method2795("To create a new account you need to");

	@OriginalMember(owner = "client!di", name = "H", descriptor = "I")
	public static int anInt961 = 0;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "Lclient!qe;")
	public static Class83 aClass83_301 = aClass83_300;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public static void method755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static112.anInt1949 != 0 && arg0 != -1) {
			Static3.method62(arg0, Static125.aClass28_Sub1_19, Static112.anInt1949);
			Static125.aBoolean136 = true;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIZ)Lclient!qe;")
	public static Class83 method756(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(33) int local33 = arg0 / 10;
		@Pc(35) int local35 = 1;
		while (local33 != 0) {
			local35++;
			local33 /= 10;
		}
		@Pc(46) int local46 = local35;
		if (arg0 < 0 || arg1) {
			local46 = local35 + 1;
		}
		@Pc(54) byte[] local54 = new byte[local46];
		if (arg0 < 0) {
			local54[0] = 45;
		} else if (arg1) {
			local54[0] = 43;
		}
		for (@Pc(73) int local73 = 0; local73 < local35; local73++) {
			@Pc(79) int local79 = arg0 % 10;
			arg0 /= 10;
			if (local79 < 0) {
				local79 = -local79;
			}
			if (local79 > 9) {
				local79 += 39;
			}
			local54[local46 - local73 - 1] = (byte) (local79 + 48);
		}
		@Pc(112) Class83 local112 = new Class83();
		local112.anInt3158 = local46;
		local112.aByteArray36 = local54;
		return local112;
	}
}
