import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	public static int anInt8983;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Lclient!kka;")
	public static final Class205 aClass205_15 = new Class205();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)Lclient!w;")
	public static Class4_Sub9 method7693(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) Class283[] local7 = Class14_Sub22.aClass283Array1;
		synchronized (Class14_Sub22.aClass283Array1) {
			@Pc(30) Class4_Sub9 local30;
			if (Class14_Sub22.aClass283Array1.length <= arg0 || Class14_Sub22.aClass283Array1[arg0].method6795()) {
				local30 = new Class4_Sub9();
				local30.aClass4_Sub1Array1 = new Class4_Sub1[arg0];
				for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
					local30.aClass4_Sub1Array1[local52] = new Class4_Sub1();
				}
			} else {
				local30 = (Class4_Sub9) Class14_Sub22.aClass283Array1[arg0].method6803();
				local30.method9473();
				@Pc(37) int local37 = Static245.anIntArray235[arg0]--;
			}
			local30.aBoolean748 = arg1;
			return local30;
		}
	}
}
