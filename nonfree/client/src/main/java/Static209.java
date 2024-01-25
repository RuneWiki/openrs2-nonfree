import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!he", name = "I", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_65 = new Class73(68, 3);

	@OriginalMember(owner = "client!he", name = "M", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_66 = new Class73(77, 2);

	@OriginalMember(owner = "client!he", name = "O", descriptor = "I")
	public static int anInt4534 = 0;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_14 = new Class380(16);

	@OriginalMember(owner = "client!he", name = "S", descriptor = "I")
	public static int anInt4537 = 0;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "I")
	public static int anInt4538 = 0;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)V")
	public static void method3767(@OriginalArg(0) int arg0) {
		Static554.anInt9496 = 2;
		Static326.anInt6465 = arg0;
		if (Static143.aString27 == null) {
			Static628.method8566(35);
		} else {
			@Pc(22) Class6_Sub8 local22 = new Class6_Sub8(Static313.method5253(Static644.method8781(Static143.aString27)));
			@Pc(26) long local26 = local22.method8263();
			Static328.aLong181 = local22.method8263();
			Static581.method8051(true, Static310.method1707(local26), "");
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLclient!ji;)Lclient!pd;")
	public static Class35_Sub3 method3768(@OriginalArg(1) Class6_Sub8 arg0) {
		return new Class35_Sub3(arg0.method8231(), arg0.method8231(), arg0.method8231(), arg0.method8231(), arg0.method8231(), arg0.method8231(), arg0.method8231(), arg0.method8231(), arg0.method8203(), arg0.method8246());
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)Z")
	public static boolean method3769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static406.method6372(arg1, arg0) || Static481.method7100(arg0, arg1);
	}
}
