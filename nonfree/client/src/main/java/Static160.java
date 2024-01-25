import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Lclient!ik;")
	public static Class182 aClass182_41;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean182 = true;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_24 = new Class342();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ika;)Lclient!sa;")
	public static Class333 method2609(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(7) String local7 = arg0.method2014();
		@Pc(14) Class223 local14 = Static525.method7024()[arg0.method2048(255)];
		@Pc(21) Class352 local21 = Static588.method7593()[arg0.method2048(255)];
		@Pc(25) int local25 = arg0.method2017();
		@Pc(35) int local35 = arg0.method2017();
		@Pc(39) int local39 = arg0.method2048(255);
		@Pc(43) int local43 = arg0.method2048(255);
		@Pc(47) int local47 = arg0.method2048(255);
		@Pc(51) int local51 = arg0.method2028(-14795);
		@Pc(57) int local57 = arg0.method2028(-14795);
		@Pc(63) int local63 = arg0.method2036();
		@Pc(69) int local69 = arg0.method2036();
		@Pc(73) int local73 = arg0.method2036();
		return new Class333(local7, local14, local21, local25, local35, local39, local43, local47, local51, local57, local63, local69, local73);
	}
}
