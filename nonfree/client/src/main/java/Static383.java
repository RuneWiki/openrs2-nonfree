import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!tf;I)V")
	public static void method5604(@OriginalArg(0) Class8_Sub10 arg0) {
		arg0.aClass8_Sub1_21 = null;
		@Pc(12) int local12 = arg0.aClass8_Sub7Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass8_Sub7Array1[local14].aBoolean519 = false;
		}
		@Pc(34) Class98[] local34 = Class170.aClass98Array1;
		synchronized (Class170.aClass98Array1) {
			if (local12 < Class170.aClass98Array1.length && Static223.anIntArray208[local12] < 200) {
				Class170.aClass98Array1[local12].method1780(arg0);
				@Pc(59) int local59 = Static223.anIntArray208[local12]++;
			}
		}
	}
}
