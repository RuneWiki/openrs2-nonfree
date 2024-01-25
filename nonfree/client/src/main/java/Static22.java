import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array2;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!tba;")
	public static Class323 aClass323_4 = new Class323(8);

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
	public static int anInt469 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!ii;")
	public static Class16_Sub1_Sub1 method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class333 local14 = local7.aClass333_1; local14 != null; local14 = local14.aClass333_3) {
			@Pc(18) Class16_Sub1_Sub1 local18 = local14.aClass16_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort103 == arg1 && local18.aShort106 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!ii;)Lclient!tl;")
	public static Class333 method572(@OriginalArg(1) Class16_Sub1_Sub1 arg0) {
		@Pc(14) Class333 local14;
		if (Static382.aClass333_2 == null) {
			local14 = new Class333();
		} else {
			local14 = Static382.aClass333_2;
			Static382.aClass333_2 = Static382.aClass333_2.aClass333_3;
			Static585.anInt9525--;
			local14.aClass333_3 = null;
		}
		local14.aClass16_Sub1_Sub1_1 = arg0;
		return local14;
	}
}
