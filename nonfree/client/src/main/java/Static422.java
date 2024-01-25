import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_12 = new Class220(7, 0, 1, 1);

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_105 = new Class177(12, 12);

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public static void method5715() {
		for (@Pc(3) int local3 = 0; local3 < Static197.anInt4078; local3++) {
			@Pc(9) int local9 = Static415.anIntArray701[local3];
			@Pc(16) Class1_Sub27 local16 = (Class1_Sub27) Static24.aClass38_3.method765((long) local9);
			if (local16 != null) {
				@Pc(21) Class30_Sub1_Sub1_Sub1 local21 = local16.aClass30_Sub1_Sub1_Sub1_2;
				Static342.method4810(local21, local21.aClass11_1.anInt162);
			}
		}
	}
}
