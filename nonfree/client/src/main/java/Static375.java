import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_346 = new Class123(42, 0);

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_347 = new Class123(50, 8);

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_348 = new Class123(97, 0);

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_90 = new Class267("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)I")
	public static int method5601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static263.anInt4747 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static7.anInt1139;
		@Pc(26) int local26 = arg1 - Static7.anInt1150;
		for (@Pc(31) Class6_Sub32 local31 = (Class6_Sub32) Static7.aClass244_7.method5976(); local31 != null; local31 = (Class6_Sub32) Static7.aClass244_7.method5964()) {
			if (arg0 == local31.anInt5707) {
				@Pc(44) int local44 = local31.anInt5701;
				@Pc(47) int local47 = local31.anInt5705;
				@Pc(57) int local57 = local47 + Static7.anInt1150 | local44 + Static7.anInt1139 << 14;
				@Pc(76) int local76 = (local26 - local47) * (local26 + -local47) + (local21 - local44) * (local21 + -local44);
				if (local14 < 0 || local16 > local76) {
					local14 = local57;
					local16 = local76;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZZI)Lclient!sc;")
	public static Class6_Sub37 method5604(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class6_Sub37) Static79.aClass74_9.method1883(local17);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method5606() {
		Static330.aClass44_45.method1351();
	}
}
