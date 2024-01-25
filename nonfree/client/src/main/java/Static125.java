import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_14 = new Class68(13, 0, 1, 0);

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BLclient!ej;)V")
	public static void method5997(@OriginalArg(1) Class21_Sub4 arg0) {
		arg0.aClass21_Sub1_2 = null;
		@Pc(12) int local12 = arg0.aClass21_Sub7Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass21_Sub7Array1[local14].aBoolean341 = false;
		}
		@Pc(37) Class158[] local37 = client.aClass158Array1;
		synchronized (client.aClass158Array1) {
			if (local12 < client.aClass158Array1.length && Static121.anIntArray128[local12] < 200) {
				client.aClass158Array1[local12].method3720(arg0);
				@Pc(60) int local60 = Static121.anIntArray128[local12]++;
			}
		}
	}
}
