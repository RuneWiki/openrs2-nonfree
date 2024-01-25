import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!at", name = "o", descriptor = "[Lclient!sa;")
	public static Interface22[] anInterface22Array1;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "I")
	public static final int anInt481 = Static407.method6237(1600);

	@OriginalMember(owner = "client!at", name = "p", descriptor = "Lclient!qj;")
	public static final Class288 aClass288_1 = new Class288();

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!lg;Lclient!kaa;)Lclient!pf;")
	public static Class5_Sub40 method507(@OriginalArg(1) Class208 arg0, @OriginalArg(2) Class181 arg1) {
		@Pc(8) Class5_Sub40 local8 = Static240.method3662();
		local8.anInt7281 = arg1.anInt4534;
		local8.aClass181_61 = arg1;
		if (local8.anInt7281 == -1) {
			local8.aClass5_Sub12_Sub2_2 = new Class5_Sub12_Sub2(260);
		} else if (local8.anInt7281 == -2) {
			local8.aClass5_Sub12_Sub2_2 = new Class5_Sub12_Sub2(10000);
		} else if (local8.anInt7281 <= 18) {
			local8.aClass5_Sub12_Sub2_2 = new Class5_Sub12_Sub2(20);
		} else if (local8.anInt7281 > 98) {
			local8.aClass5_Sub12_Sub2_2 = new Class5_Sub12_Sub2(260);
		} else {
			local8.aClass5_Sub12_Sub2_2 = new Class5_Sub12_Sub2(100);
		}
		local8.aClass5_Sub12_Sub2_2.method8669(arg0);
		local8.aClass5_Sub12_Sub2_2.method8662(local8.aClass181_61.method4154());
		local8.anInt7278 = 0;
		return local8;
	}
}
