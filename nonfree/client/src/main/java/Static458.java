import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "J")
	public static long aLong218;

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "Lclient!oo;")
	public static final Class242 aClass242_9 = new Class242();

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BI)Lclient!wj;")
	public static Class41_Sub10 method6411(@OriginalArg(1) int arg0) {
		@Pc(7) Class178[] local7 = RuntimeException_Sub1.aClass178Array1;
		synchronized (RuntimeException_Sub1.aClass178Array1) {
			@Pc(38) Class41_Sub10 local38;
			if (arg0 >= RuntimeException_Sub1.aClass178Array1.length || RuntimeException_Sub1.aClass178Array1[arg0].method4167()) {
				local38 = new Class41_Sub10();
				local38.aClass41_Sub8Array1 = new Class41_Sub8[arg0];
				for (@Pc(60) int local60 = 0; local60 < arg0; local60++) {
					local38.aClass41_Sub8Array1[local60] = new Class41_Sub8();
				}
			} else {
				local38 = (Class41_Sub10) RuntimeException_Sub1.aClass178Array1[arg0].method4163();
				local38.method7833();
				@Pc(45) int local45 = Static521.anIntArray541[arg0]--;
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BIC)I")
	public static int method6412(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(24) char local24 = Character.toLowerCase(arg1);
			local7 = (local24 << 4) + 1;
		}
		return local7;
	}
}
