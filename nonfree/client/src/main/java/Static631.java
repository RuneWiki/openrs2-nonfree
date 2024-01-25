import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!wia", name = "n", descriptor = "I")
	public static int anInt9614;

	@OriginalMember(owner = "client!wia", name = "f", descriptor = "I")
	public static int anInt9607 = -1;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
	public static void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class13_Sub5 local7 = new Class13_Sub5();
		local7.aString40 = arg5;
		local7.anInt4035 = arg2;
		local7.anInt4031 = arg0;
		local7.anInt4033 = arg4;
		local7.anInt4036 = arg6 + Static262.anInt5597;
		local7.anInt4029 = arg3;
		local7.anInt4032 = arg1;
		Static246.aClass171_4.method3746(local7);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(BLclient!ww;Lclient!ww;)V")
	public static void method8042(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg1.aClass2_Sub2_66 != null) {
			arg1.method8271();
		}
		arg1.aClass2_Sub2_67 = arg0.aClass2_Sub2_67;
		arg1.aClass2_Sub2_66 = arg0;
		arg1.aClass2_Sub2_66.aClass2_Sub2_67 = arg1;
		arg1.aClass2_Sub2_67.aClass2_Sub2_66 = arg1;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)I")
	public static int method8043(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
