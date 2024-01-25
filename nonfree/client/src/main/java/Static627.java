import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!wea", name = "m", descriptor = "[J")
	public static long[] aLongArray16;

	@OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
	public static int anInt10354;

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_151 = new Class218(55, 10);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZILclient!ha;I)Lclient!da;")
	public static Class25 method8493(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2) {
		@Pc(14) Class148 local14 = Static557.method7854(arg0, arg2, arg1);
		return local14 == null ? null : local14.aClass25_8;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIC)I")
	public static int method8496(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(21) char local21 = Character.toLowerCase(arg1);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}
}
