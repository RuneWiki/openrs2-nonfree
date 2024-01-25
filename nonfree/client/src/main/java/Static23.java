import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!mga;I)Lclient!ija;")
	public static Class181 method657(@OriginalArg(0) Class9_Sub1_Sub1 arg0) {
		@Pc(9) Class181 local9;
		if (Static79.aClass181_1 == null) {
			local9 = new Class181();
		} else {
			local9 = Static79.aClass181_1;
			Static79.aClass181_1 = Static79.aClass181_1.aClass181_2;
			Static154.anInt2752--;
			local9.aClass181_2 = null;
		}
		local9.aClass9_Sub1_Sub1_1 = arg0;
		return local9;
	}
}
