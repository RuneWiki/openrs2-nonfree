import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "[I")
	public static final int[] anIntArray658 = new int[3];

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZI)Lclient!ua;")
	public static Class9_Sub10 method8548(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) Class139[] local12 = Class66_Sub1.aClass139Array1;
		synchronized (Class66_Sub1.aClass139Array1) {
			@Pc(32) Class9_Sub10 local32;
			if (Class66_Sub1.aClass139Array1.length <= arg0 || Class66_Sub1.aClass139Array1[arg0].method3196()) {
				local32 = new Class9_Sub10();
				local32.aClass9_Sub5Array1 = new Class9_Sub5[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass9_Sub5Array1[local38] = new Class9_Sub5();
				}
			} else {
				local32 = (Class9_Sub10) Class66_Sub1.aClass139Array1[arg0].method3200();
				local32.method8593();
				@Pc(73) int local73 = Static55.anIntArray64[arg0]--;
			}
			local32.aBoolean698 = arg1;
			return local32;
		}
	}
}
