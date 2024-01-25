import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "Z")
	public static volatile boolean aBoolean813 = true;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "[Z")
	public static final boolean[] aBooleanArray37 = new boolean[100];

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)I")
	public static int method8381() {
		return Static261.anInt10710;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZLclient!et;)Lclient!bfa;")
	public static Class36 method8382(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method8581(-17416);
		@Pc(14) Class18 local14 = Static562.method7826()[arg0.method8581(-17416)];
		@Pc(27) Class239 local27 = Static505.method7161()[arg0.method8581(-17416)];
		@Pc(31) int local31 = arg0.method8598();
		@Pc(35) int local35 = arg0.method8598();
		@Pc(39) int local39 = arg0.method8575();
		@Pc(43) int local43 = arg0.method8575();
		@Pc(47) int local47 = arg0.method8555(-9372);
		@Pc(51) int local51 = arg0.method8555(-9372);
		@Pc(55) int local55 = arg0.method8555(-9372);
		@Pc(67) boolean local67 = arg0.method8581(-17416) == 1;
		return new Class36(local7, local14, local27, local31, local35, local39, local43, local47, local51, local55, local67);
	}
}
