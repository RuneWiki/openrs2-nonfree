import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public static int anInt4538;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_48 = new Class303(36, 7);

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
	public static int anInt4536 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([Lclient!wp;II)V")
	public static void method3947(@OriginalArg(0) Class361[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(18) Class361 local18 = arg0[local7];
			if (local18 != null) {
				if (local18.anInt9665 == 0) {
					if (local18.aClass361Array2 != null) {
						method3947(local18.aClass361Array2, arg1);
					}
					@Pc(39) Class3_Sub49 local39 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local18.anInt9594);
					if (local39 != null) {
						Static556.method7355(local39.anInt8836, arg1);
					}
				}
				@Pc(55) Class3_Sub32 local55;
				if (arg1 == 0 && local18.anObjectArray31 != null) {
					local55 = new Class3_Sub32();
					local55.aClass361_6 = local18;
					local55.anObjectArray1 = local18.anObjectArray31;
					Static312.method4566(local55);
				}
				if (arg1 == 1 && local18.anObjectArray22 != null) {
					if (local18.anInt9608 >= 0) {
						@Pc(83) Class361 local83 = Static265.method4040(local18.anInt9594);
						if (local83 == null || local83.aClass361Array2 == null || local83.aClass361Array2.length <= local18.anInt9608 || local83.aClass361Array2[local18.anInt9608] != local18) {
							continue;
						}
					}
					local55 = new Class3_Sub32();
					local55.aClass361_6 = local18;
					local55.anObjectArray1 = local18.anObjectArray22;
					Static312.method4566(local55);
				}
			}
		}
	}
}
