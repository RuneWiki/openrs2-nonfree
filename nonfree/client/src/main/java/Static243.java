import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!caa;")
	public static Class36 aClass36_6;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_98 = new Class362(2, -2);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!un;)Lclient!lea;")
	public static Class108_Sub1 method3889(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(7) Class108 local7 = Static555.method8026(arg0);
		@Pc(11) int local11 = arg0.method4936();
		@Pc(15) int local15 = arg0.method4936();
		@Pc(19) int local19 = arg0.method4936();
		@Pc(25) int local25 = arg0.method4936();
		@Pc(34) int local34 = arg0.method4936();
		@Pc(38) int local38 = arg0.method4936();
		return new Class108_Sub1(local7.aClass258_13, local7.aClass250_13, local7.anInt10009, local7.anInt10011, local7.anInt10015, local7.anInt10007, local7.anInt10008, local7.anInt10013, local7.anInt10014, local11, local15, local19, local25, local34, local38);
	}
}
