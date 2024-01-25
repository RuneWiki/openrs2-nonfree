import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_86 = new Class254(12, 5);

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
	public static int anInt4757 = -1;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!oa;Z)V")
	public static void method4075(@OriginalArg(0) Class9 arg0) {
		Static261.aClass141Array1 = new Class141[Static139.anIntArray225.length];
		for (@Pc(16) int local16 = 0; local16 < Static139.anIntArray225.length; local16++) {
			@Pc(22) int local22 = Static139.anIntArray225[local16];
			@Pc(27) Class82 local27 = Static505.method7521(Static394.aClass168_92, local22);
			@Pc(35) Class73 local35 = arg0.method5393(local27, Static583.method54(Static194.aClass168_50, local22));
			Static261.aClass141Array1[local16] = new Class141(local35, local27);
		}
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Lclient!gi;")
	public static Class116_Sub1 method4082() {
		Static294.anInt5608 = 0;
		return Static184.method3595();
	}
}
