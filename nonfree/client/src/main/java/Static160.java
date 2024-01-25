import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
	public static int anInt3748;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_112 = new Class157(20, 16);

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
	public static int anInt3750 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
	public static void method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static258.anIntArray417[arg1] = arg0;
		@Pc(14) Class2_Sub17 local14 = (Class2_Sub17) Static180.aClass41_19.method902((long) arg1);
		if (local14 == null) {
			local14 = new Class2_Sub17(4611686018427387905L);
			Static180.aClass41_19.method901(local14, (long) arg1);
		} else if (local14.aLong74 != 4611686018427387905L) {
			local14.aLong74 = Static22.method285() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V")
	public static void method3261() {
		Static76.aClass41_9.method907();
		Static19.aClass41_2.method907();
	}
}
