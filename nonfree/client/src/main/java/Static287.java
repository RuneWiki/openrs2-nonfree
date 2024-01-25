import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
	public static int anInt5147;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "Lclient!vt;")
	public static Class263 aClass263_4;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "Lclient!cw;")
	public static final Class46 aClass46_1 = Static7.method93();

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "[I")
	public static final int[] anIntArray434 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!qc;B)I")
	public static int method4059(@OriginalArg(0) Class2_Sub35 arg0) {
		@Pc(7) String local7 = Static48.method741(arg0);
		@Pc(17) int[] local17 = null;
		if (Static315.method4489(arg0.anInt5875)) {
			local17 = Static413.aClass271_2.method6193((int) arg0.aLong299).anIntArray521;
		} else if (arg0.anInt5878 != -1) {
			local17 = Static413.aClass271_2.method6193(arg0.anInt5878).anIntArray521;
		} else if (Static188.method5359(arg0.anInt5875)) {
			@Pc(40) Class2_Sub34 local40 = (Class2_Sub34) Static400.aClass220_41.method5099((long) arg0.aLong299);
			if (local40 != null) {
				@Pc(45) Class11_Sub5_Sub2_Sub2 local45 = local40.aClass11_Sub5_Sub2_Sub2_2;
				@Pc(48) Class82 local48 = local45.aClass82_1;
				if (local48.anIntArray149 != null) {
					local48 = local48.method1888(Static63.aClass120_2);
				}
				if (local48 != null) {
					local17 = local48.anIntArray151;
				}
			}
		} else if (Static459.method6243(arg0.anInt5875)) {
			@Pc(80) Class192 local80;
			if (arg0.anInt5875 == 1007) {
				local80 = Static249.aClass39_2.method748((int) arg0.aLong299);
			} else {
				local80 = Static249.aClass39_2.method748((int) (arg0.aLong299 >>> 32 & 0x7FFFFFFFL));
			}
			if (local80.anIntArray462 != null) {
				local80 = local80.method4323(Static63.aClass120_2);
			}
			if (local80 != null) {
				local17 = local80.anIntArray460;
			}
		}
		if (local17 != null) {
			local7 = local7 + Static148.method2251(local17);
		}
		@Pc(141) int local141 = Static9.aClass15_9.method323(local7, Static243.aClass41Array8);
		if (arg0.aBoolean414) {
			local141 += Static446.aClass41_19.YA() + 4;
		}
		return local141;
	}
}
