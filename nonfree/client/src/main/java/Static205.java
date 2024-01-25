import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Lclient!wm;")
	public static Class390 aClass390_11;

	@OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
	public static int anInt1048 = 0;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[5];

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Lclient!hv;")
	public static final Class156 aClass156_2 = new Class156();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public static void method970() {
		@Pc(7) int local7 = Static105.anInt2258;
		@Pc(9) int[] local9 = Static321.anIntArray339;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class28_Sub1_Sub4_Sub2_Sub2 local19 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local9[local11]];
			if (local19 != null && local19.anInt5454 > 0) {
				local19.anInt5454--;
				if (local19.anInt5454 == 0) {
					local19.aString43 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static36.anInt607; local49++) {
			@Pc(58) long local58 = (long) Static588.anIntArray533[local49];
			@Pc(64) Class5_Sub25 local64 = (Class5_Sub25) Static56.aClass300_8.method7188(local58);
			if (local64 != null) {
				@Pc(69) Class28_Sub1_Sub4_Sub2_Sub1 local69 = local64.aClass28_Sub1_Sub4_Sub2_Sub1_1;
				if (local69.anInt5454 > 0) {
					local69.anInt5454--;
					if (local69.anInt5454 == 0) {
						local69.aString43 = null;
					}
				}
			}
		}
	}
}
