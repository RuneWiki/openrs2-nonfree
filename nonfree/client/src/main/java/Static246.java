import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jfa", name = "k", descriptor = "[I")
	public static int[] anIntArray323;

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "Z")
	public static boolean aBoolean381 = true;

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "Lclient!ida;")
	public static final Class148 aClass148_4 = new Class148();

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "[B")
	public static final byte[] aByteArray57 = new byte[520];

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_91 = new Class254(93, 7);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
	public static void method4280() {
		for (@Pc(18) Class6_Sub41 local18 = (Class6_Sub41) Static532.aClass211_72.method5183(); local18 != null; local18 = (Class6_Sub41) Static532.aClass211_72.method5177()) {
			if (local18.anInt8267 == -1) {
				local18.anInt8266 = 0;
				if (local18.anInt8273 >= 0 && local18.anInt8275 >= 0 && local18.anInt8273 < Static228.anInt4746 && local18.anInt8275 < Static44.anInt1275) {
					Static276.method4587(local18);
				}
			} else {
				local18.method8151();
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!iaa;B)Lclient!lfa;")
	public static Class197 method4283(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(7) int local7 = arg0.method4966();
		@Pc(14) Class148 local14 = Static38.method1094()[arg0.method4966()];
		@Pc(21) Class49 local21 = Static131.method2521()[arg0.method4966()];
		@Pc(25) int local25 = arg0.method4974();
		@Pc(29) int local29 = arg0.method4974();
		@Pc(41) int local41 = arg0.method4999();
		@Pc(45) int local45 = arg0.method4999();
		@Pc(49) int local49 = arg0.method5000();
		@Pc(53) int local53 = arg0.method5000();
		@Pc(57) int local57 = arg0.method5000();
		@Pc(68) boolean local68 = arg0.method4966() == 1;
		return new Class197(local7, local14, local21, local25, local29, local41, local45, local49, local53, local57, local68);
	}
}
