import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
	public static int anInt5167;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	public static int anInt5168 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZII)Lclient!maa;")
	public static Class12_Sub8 method4323(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class376[] local11 = Class175.aClass376Array1;
		synchronized (Class175.aClass376Array1) {
			@Pc(27) Class12_Sub8 local27;
			if (Class175.aClass376Array1.length <= arg1 || Class175.aClass376Array1[arg1].method9006()) {
				local27 = new Class12_Sub8();
				local27.aClass12_Sub1Array1 = new Class12_Sub1[arg1];
				for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
					local27.aClass12_Sub1Array1[local33] = new Class12_Sub1();
				}
			} else {
				local27 = (Class12_Sub8) Class175.aClass376Array1[arg1].method9013();
				local27.method9143();
				@Pc(68) int local68 = Static42.anIntArray83[arg1]--;
			}
			local27.aBoolean459 = arg0;
			return local27;
		}
	}
}
