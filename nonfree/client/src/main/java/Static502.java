import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_121 = new Class289(43, 2);

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!gca;")
	public static final Class115 aClass115_11 = new Class115(true);

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public static int anInt8454 = 0;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public static int anInt8456 = 0;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "[I")
	public static final int[] anIntArray552 = new int[5];

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "[I")
	public static final int[] anIntArray553 = new int[1];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)[Lclient!wb;")
	public static Class382[] method7195() {
		if (Static506.aClass382Array1 == null) {
			@Pc(11) Class382[] local11 = Static524.method7857(Static569.aClass380_6);
			@Pc(15) Class382[] local15 = new Class382[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(22) int local22 = Static96.aClass6_Sub22_7.aClass29_Sub22_1.method7060();
			@Pc(85) int local85;
			@Pc(91) Class382 local91;
			label70: for (@Pc(24) int local24 = 0; local24 < local11.length; local24++) {
				@Pc(30) Class382 local30 = local11[local24];
				if ((local30.anInt10499 <= 0 || local30.anInt10499 >= 24) && local30.anInt10494 >= 800 && local30.anInt10491 >= 600 && (local22 != 2 || local30.anInt10494 <= 800 && local30.anInt10491 <= 600) && (local22 != 1 || local30.anInt10494 <= 1024 && local30.anInt10491 <= 768)) {
					for (local85 = 0; local85 < local17; local85++) {
						local91 = local15[local85];
						if (local91.anInt10494 == local30.anInt10494 && local30.anInt10491 == local91.anInt10491) {
							if (local91.anInt10499 < local30.anInt10499) {
								local15[local85] = local30;
							}
							continue label70;
						}
					}
					local15[local17] = local30;
					local17++;
				}
			}
			Static506.aClass382Array1 = new Class382[local17];
			Static679.method1568(local15, 0, Static506.aClass382Array1, 0, local17);
			@Pc(147) int[] local147 = new int[Static506.aClass382Array1.length];
			for (local85 = 0; local85 < Static506.aClass382Array1.length; local85++) {
				local91 = Static506.aClass382Array1[local85];
				local147[local85] = local91.anInt10494 * local91.anInt10491;
			}
			Static223.method3251(local147, Static506.aClass382Array1);
		}
		return Static506.aClass382Array1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[FI)[F")
	public static float[] method7197(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static679.method1567(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
