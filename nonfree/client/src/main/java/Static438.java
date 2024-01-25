import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public static int anInt7563;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;ILclient!lh;)I")
	public static int method5867(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		@Pc(6) int local6 = arg1.anInt5056;
		@Pc(10) byte[] local10 = Static323.method4558(arg0);
		arg1.method4145(local10.length);
		arg1.anInt5056 += Static25.aClass71_1.method1484(arg1.anInt5056, local10, local10.length, arg1.aByteArray66, 0);
		return arg1.anInt5056 - local6;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IBI)V")
	public static void method5868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub2_Sub1 local16 = Static258.method5559(arg1, 5);
		local16.method202();
		local16.anInt214 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)I")
	public static int method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method5870(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static27.method488(arg0, 0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method5871(@OriginalArg(1) String arg0) {
		return Static156.method2354(arg0, 10);
	}
}
