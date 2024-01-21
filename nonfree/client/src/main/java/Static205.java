import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!vg", name = "P", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1163 = Static181.method2795("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!vg", name = "R", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1164 = Static181.method2795("k");

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLclient!eh;)V")
	public static void method3106(@OriginalArg(1) Class28 arg0) {
		Static44.aClass28_49 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
	public static void method3107() {
		for (@Pc(7) int local7 = 0; local7 < Static177.anInt3619; local7++) {
			@Pc(13) int local13 = Static64.anIntArray130[local7];
			@Pc(17) Class24_Sub4_Sub1 local17 = Static22.aClass24_Sub4_Sub1Array1[local13];
			@Pc(21) int local21 = Static33.aClass2_Sub3_Sub1_1.method260();
			if ((local21 & 0x80) != 0) {
				local21 += Static33.aClass2_Sub3_Sub1_1.method260() << 8;
			}
			Static154.method2371(local21, local13, local17);
		}
	}
}
