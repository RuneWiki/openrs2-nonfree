import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_46 = new Class130();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!bw;)V")
	public static void method6501(@OriginalArg(1) Class3_Sub11_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static348.anInt6099; local7++) {
			@Pc(13) int local13 = Static394.anIntArray542[local7];
			@Pc(17) Class9_Sub1_Sub1_Sub2_Sub2 local17 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local13];
			@Pc(23) int local23 = arg0.method3118();
			if ((local23 & 0x20) != 0) {
				local23 += arg0.method3118() << 8;
			}
			if ((local23 & 0x4000) != 0) {
				local23 += arg0.method3118() << 16;
			}
			Static272.method4398(local13, local17, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ICI)I")
	public static int method6504(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(16) char local16 = Character.toLowerCase(arg0);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}
}
