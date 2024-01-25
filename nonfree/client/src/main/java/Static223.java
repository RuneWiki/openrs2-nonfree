import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
	public static int anInt4634;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	public static int anInt4637;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!am;")
	public static Class11 aClass11_87;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString170 = "Loaded input handler";

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	public static int anInt4639 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)Lclient!rd;")
	public static Class4_Sub1_Sub19 method3818(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub1_Sub19 local10 = (Class4_Sub1_Sub19) Static348.aClass15_9.method356((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static132.aClass11_58.method288(arg0, 5);
		local10 = new Class4_Sub1_Sub19();
		if (local20 != null) {
			local10.method4753(new Class4_Sub7(local20));
		}
		Static348.aClass15_9.method352((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ja;IZ)V")
	public static void method3820(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		if (Static183.aBoolean334) {
			arg1 = 0;
			Static183.aBoolean334 = false;
		}
		if (Static13.aClass100_1 != null && Static13.aClass100_1.method2726(arg0)) {
			return;
		}
		Static13.aClass100_1 = arg0;
		Static16.aLong18 = Static274.method4763();
		Static11.anInt266 = arg1;
		Static240.anInt5022 = arg1;
		if (Static240.anInt5022 != 0) {
			Static221.aFloat42 = Static305.aFloat73;
			Static308.anInt6687 = Static22.anInt409;
			Static30.aFloat16 = Static91.aFloat20;
			Static157.aFloat37 = Static322.aFloat75;
			Static174.aClass49_3 = Static112.aClass49_1;
			Static125.anInt6058 = Static6.anInt1977;
			Static153.aFloat36 = Static72.aFloat19;
			Static208.anInt4349 = Static47.anInt1065;
			Static167.aFloat38 = Static277.aFloat71;
			Static189.aFloat40 = Static320.aFloat74;
			return;
		}
		Static289.method4939();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!lh;)[Lclient!tn;")
	public static Class196[] method3821(@OriginalArg(1) Class120 arg0) {
		if (!arg0.method3240()) {
			return new Class196[0];
		}
		@Pc(16) Class51 local16 = arg0.method3226();
		while (local16.anInt1229 == 0) {
			Static270.method5481(10L);
		}
		if (local16.anInt1229 == 2) {
			return new Class196[0];
		}
		@Pc(45) int[] local45 = (int[]) local16.anObject1;
		@Pc(51) Class196[] local51 = new Class196[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(59) Class196 local59 = new Class196();
			local51[local53] = local59;
			local59.anInt6206 = local45[local53 << 2];
			local59.anInt6212 = local45[(local53 << 2) + 1];
			local59.anInt6213 = local45[(local53 << 2) + 2];
			local59.anInt6209 = local45[(local53 << 2) + 3];
		}
		return local51;
	}
}
