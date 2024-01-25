import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Lclient!tm;")
	public static Class49_Sub3 method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass49_Sub3_1;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IB)V")
	public static void method1032(@OriginalArg(0) int arg0) {
		Static455.anInt7772 = arg0;
		Static235.aClass313_29.method7398();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILclient!jq;B)V")
	public static void method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class156 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray34 != null) {
			@Pc(13) Class1_Sub30 local13 = new Class1_Sub30();
			local13.anObjectArray36 = arg2.anObjectArray34;
			local13.aClass156_11 = arg2;
			Static180.method2683(local13);
		}
		Static48.anInt942 = arg2.anInt4677;
		Static196.anInt3862 = arg2.anInt4697;
		Static379.anInt8819 = arg2.anInt4723;
		Static146.anInt2743 = arg0;
		Static276.anInt9030 = arg1;
		Static222.anInt4414 = arg2.anInt4710;
		Static108.anInt2198 = arg2.anInt4654;
		Static431.aBoolean542 = true;
		Static473.method6593(arg2);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!hda;I)V")
	public static void method1036(@OriginalArg(0) Class1_Sub24 arg0) {
		if (!Static15.aBoolean16) {
			arg0.method7525();
			Static16.anInt415--;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZ)V")
	public static void method1037(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub1_Sub11 local14 = Static541.method7520(7, arg0);
		local14.method4945();
	}
}
