import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public static int anInt1364;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Lclient!si;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "I")
	public static int anInt1356 = -1;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "[I")
	public static final int[] anIntArray90 = new int[14];

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public static int anInt1365 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)[Lclient!ub;")
	public static Class234[] method1137() {
		return new Class234[] { Static439.aClass234_7, Static430.aClass234_6, Static113.aClass234_4 };
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lclient!vq;")
	public static Class196_Sub1 method1141(@OriginalArg(0) int arg0) {
		return Static144.aBoolean133 && Static185.anInt3367 <= arg0 && arg0 <= Static324.anInt5682 ? Static4.aClass196_Sub1Array1[arg0 - Static185.anInt3367] : null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLjava/lang/String;ZLclient!vh;)Lclient!te;")
	public static Class222 method1144(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class250 arg2) {
		@Pc(10) int local10 = arg2.method5652(arg0);
		if (local10 == -1) {
			return new Class222(0);
		}
		@Pc(26) int[] local26 = arg2.method5671(local10);
		@Pc(37) Class222 local37 = new Class222(local26.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local37.anInt6534 > local39) {
				@Pc(55) Class1_Sub1 local55 = new Class1_Sub1(arg2.method5667(local26[local41++], local10));
				@Pc(59) int local59 = local55.method4087();
				@Pc(63) int local63 = local55.method4093();
				@Pc(67) int local67 = local55.method4130();
				if (!arg1 && local67 == 1) {
					local37.anInt6534--;
				} else {
					local37.anIntArray544[local39] = local59;
					local37.anIntArray542[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}
}
