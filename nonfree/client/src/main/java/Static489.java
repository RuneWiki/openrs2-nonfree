import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qda", name = "K", descriptor = "I")
	public static int anInt8467;

	@OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
	public static int anInt8464 = 0;

	@OriginalMember(owner = "client!qda", name = "L", descriptor = "Lclient!bd;")
	public static final Class32 aClass32_57 = new Class32();

	@OriginalMember(owner = "client!qda", name = "N", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I[Lclient!qga;I)V")
	public static void method7381(@OriginalArg(1) Class299[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(17) Class299 local17 = arg0[local12];
			if (local17 != null) {
				if (local17.anInt8610 == 0) {
					if (local17.aClass299Array2 != null) {
						method7381(local17.aClass299Array2, arg1);
					}
					@Pc(47) Class14_Sub13 local47 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local17.anInt8526);
					if (local47 != null) {
						Static323.method5078(local47.anInt1465, arg1);
					}
				}
				@Pc(70) Class14_Sub10 local70;
				if (arg1 == 0 && local17.anObjectArray24 != null) {
					local70 = new Class14_Sub10();
					local70.anObjectArray1 = local17.anObjectArray24;
					local70.aClass299_2 = local17;
					Static672.method9304(local70);
				}
				if (arg1 == 1 && local17.anObjectArray17 != null) {
					if (local17.anInt8590 >= 0) {
						@Pc(102) Class299 local102 = Static391.method5936(local17.anInt8526);
						if (local102 == null || local102.aClass299Array1 == null || local17.anInt8590 >= local102.aClass299Array1.length || local102.aClass299Array1[local17.anInt8590] != local17) {
							continue;
						}
					}
					local70 = new Class14_Sub10();
					local70.aClass299_2 = local17;
					local70.anObjectArray1 = local17.anObjectArray17;
					Static672.method9304(local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII)V")
	public static void method7382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(37) String local37 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local37);
		Static367.method5514(true, false, local37);
	}
}
