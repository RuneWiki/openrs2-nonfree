import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!lga;Lclient!hj;)Lclient!eda;")
	public static Class6_Sub17 method7824(@OriginalArg(1) Class185 arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(10) Class6_Sub17 local10 = Static504.method7272();
		local10.aClass185_30 = arg0;
		local10.anInt3091 = arg0.anInt6331;
		if (local10.anInt3091 == -1) {
			local10.aClass6_Sub8_Sub1_2 = new Class6_Sub8_Sub1(260);
		} else if (local10.anInt3091 == -2) {
			local10.aClass6_Sub8_Sub1_2 = new Class6_Sub8_Sub1(10000);
		} else if (local10.anInt3091 <= 18) {
			local10.aClass6_Sub8_Sub1_2 = new Class6_Sub8_Sub1(20);
		} else if (local10.anInt3091 <= 98) {
			local10.aClass6_Sub8_Sub1_2 = new Class6_Sub8_Sub1(100);
		} else {
			local10.aClass6_Sub8_Sub1_2 = new Class6_Sub8_Sub1(260);
		}
		local10.aClass6_Sub8_Sub1_2.method1507(arg1);
		local10.aClass6_Sub8_Sub1_2.method1516(local10.aClass185_30.method5306());
		local10.anInt3094 = 0;
		return local10;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ji;Z)Lclient!tga;")
	public static Class322 method7825(@OriginalArg(0) Class6_Sub8 arg0) {
		@Pc(7) String local7 = arg0.method8221();
		@Pc(14) Class79 local14 = Static174.method3299()[arg0.method8246()];
		@Pc(21) Class127 local21 = Static569.method7978()[arg0.method8246()];
		@Pc(25) int local25 = arg0.method8231();
		@Pc(33) int local33 = arg0.method8231();
		@Pc(42) int local42 = arg0.method8246();
		@Pc(46) int local46 = arg0.method8246();
		@Pc(50) int local50 = arg0.method8246();
		@Pc(54) int local54 = arg0.method8220();
		@Pc(58) int local58 = arg0.method8220();
		@Pc(62) int local62 = arg0.method8236();
		@Pc(66) int local66 = arg0.method8236();
		@Pc(70) int local70 = arg0.method8236();
		return new Class322(local7, local14, local21, local25, local33, local42, local46, local50, local54, local58, local62, local66, local70);
	}
}
