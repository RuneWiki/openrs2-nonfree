import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "Lclient!o;")
	public static Class80 aClass80_2;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Lclient!mh;")
	public static Class51 method339() {
		try {
			return new Class51_Sub2();
		} catch (@Pc(12) Throwable local12) {
			try {
				return (Class51) Class.forName("Class51_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(18) Throwable local18) {
				return new Class51_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!nn;)Lclient!mp;")
	public static Class20_Sub3 method340(@OriginalArg(1) Class10_Sub8 arg0) {
		return new Class20_Sub3(arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2492(), arg0.method2507(), arg0.method2507(), arg0.method2502());
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZII)V")
	public static void method341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg0);
		@Pc(26) Class10_Sub44 local26 = (Class10_Sub44) Static81.aClass167_10.method3709(local14);
		if (local26 == null) {
			local26 = new Class10_Sub44();
			Static81.aClass167_10.method3705(local26, local14);
		}
		if (arg1 >= local26.anIntArray704.length) {
			@Pc(47) int[] local47 = new int[arg1 + 1];
			@Pc(52) int[] local52 = new int[arg1 + 1];
			for (@Pc(54) int local54 = 0; local54 < local26.anIntArray704.length; local54++) {
				local47[local54] = local26.anIntArray704[local54];
				local52[local54] = local26.anIntArray703[local54];
			}
			for (@Pc(84) int local84 = local26.anIntArray704.length; local84 < arg1; local84++) {
				local47[local84] = -1;
				local52[local84] = 0;
			}
			local26.anIntArray704 = local47;
			local26.anIntArray703 = local52;
		}
		local26.anIntArray704[arg1] = arg2;
		local26.anIntArray703[arg1] = arg4;
	}
}
