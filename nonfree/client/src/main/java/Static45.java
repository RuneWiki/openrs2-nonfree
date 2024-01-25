import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "Lclient!jga;")
	public static final Class3_Sub29 aClass3_Sub29_2 = new Class3_Sub29(0, -1);

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_12 = new Class286(20, 3);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V")
	public static void method612() {
		Static481.anInt8379 = 0;
		Static179.anInt3232 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static643.anInt10383; local19++) {
			@Pc(25) int local25 = local19 * Static310.anInt5521;
			for (@Pc(27) int local27 = 0; local27 < Static310.anInt5521; local27++) {
				@Pc(33) int local33 = local27 + local25;
				Static76.anInterface20Array1[local33].method9153(local27 * Static299.anInt6879, local19 * Static523.anInt8898, Static299.anInt6879, Static523.anInt8898, true);
			}
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIZ)I")
	public static int method613(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub51 local15 = Static321.method5223(false, arg0);
		if (local15 == null) {
			return Static156.aClass301_1.method7377(arg0).anInt3511;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local15.anIntArray577.length; local34++) {
			if (local15.anIntArray577[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static156.aClass301_1.method7377(arg0).anInt3511 - local15.anIntArray577.length;
	}
}
