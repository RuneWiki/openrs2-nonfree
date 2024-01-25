import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_59 = new Class205(102, 4);

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	public static int anInt2498 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lclient!sp;")
	public static Class2_Sub10_Sub16 method2415(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub10_Sub16 local12 = (Class2_Sub10_Sub16) Static23.aClass166_2.method3688((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = Static125.aClass171_36.method3745(0, arg0);
		} else {
			local29 = Static68.aClass171_26.method3745(0, arg0 & 0x7FFF);
		}
		local12 = new Class2_Sub10_Sub16();
		if (local29 != null) {
			local12.method4703(new Class2_Sub16(local29));
		}
		if (arg0 >= 32768) {
			local12.method4702();
		}
		Static23.aClass166_2.method3693((long) arg0, local12);
		return local12;
	}
}
