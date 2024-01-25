import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "Lclient!iv;")
	public static Class160 aClass160_6;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "Lclient!gj;")
	public static Class143 aClass143_117;

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_168 = new Class126(111, -1);

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_55 = new Class193();

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "(I)Z")
	public static boolean method7218() {
		@Pc(10) Class3_Sub36 local10 = (Class3_Sub36) Static160.aClass193_18.method4457();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt6623; local16++) {
			if (local10.aClass129Array1[local16] != null && local10.aClass129Array1[local16].anInt3299 == 0) {
				return false;
			}
			if (local10.aClass129Array2[local16] != null && local10.aClass129Array2[local16].anInt3299 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V")
	public static void method7219(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub6_Sub7 local13 = Static198.method3146((long) arg0, 1);
		local13.method1709();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Lclient!rha;")
	public static Class309 method7220(@OriginalArg(0) int arg0) {
		@Pc(8) Class309[] local8 = Static230.method3702();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(21) Class309 local21 = local8[local10];
			if (local21.anInt8623 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
