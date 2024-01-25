import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Lclient!hda;")
	public static final Class147 aClass147_1 = new Class147();

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLclient!mj;)V")
	public static void method5032(@OriginalArg(1) Class238 arg0) {
		if (Static547.anInt8691 == arg0.anInt6018) {
			Static325.aBooleanArray15[arg0.anInt5957] = true;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!wq;)Lclient!pq;")
	public static Class292 method5033(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(13) int local13 = arg0.method7333();
		return new Class292(local13);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lclient!mj;")
	public static Class238 method5035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class238 local7 = Static305.method4761(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass238Array1 == null || arg0 >= local7.aClass238Array1.length) {
			return null;
		} else {
			return local7.aClass238Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Lclient!pe;")
	public static Class282 method5036(@OriginalArg(0) int arg0) {
		@Pc(17) Class282[] local17 = Static287.method4564();
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			if (local17[local19].anInt7328 == arg0) {
				return local17[local19];
			}
		}
		return null;
	}
}
