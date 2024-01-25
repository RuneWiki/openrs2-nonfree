import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[S")
	private static final short[] aShortArray79 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[S")
	private static final short[] aShortArray82 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[S")
	private static final short[] aShortArray81 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[S")
	private static final short[] aShortArray80 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { aShortArray82, aShortArray81, aShortArray79, aShortArray80 };

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[Lclient!we;")
	public static final Class369[] aClass369Array1 = new Class369[8];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method4770() {
		if (Static625.anInt10331 != -1) {
			Static563.method7920(false, Static625.anInt10331, -1, -1);
			Static625.anInt10331 = -1;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!gaa;)V")
	public static void method4772(@OriginalArg(1) Class108 arg0) {
		if (!Static82.aBoolean192) {
			return;
		}
		if (arg0.anObjectArray18 != null) {
			@Pc(14) Class108 local14 = Static526.method6818(Static33.anInt612, Static461.anInt8388);
			if (local14 != null) {
				@Pc(20) Class3_Sub51 local20 = new Class3_Sub51();
				local20.anObjectArray33 = arg0.anObjectArray18;
				local20.aClass108_14 = local14;
				local20.aClass108_13 = arg0;
				Static84.method2222(local20);
			}
		}
		@Pc(45) Class3_Sub26 local45 = Static640.method8636(Static19.aClass344_3, Static403.aClass294_3);
		local45.aClass3_Sub15_Sub1_3.method8419(arg0.anInt4043);
		local45.aClass3_Sub15_Sub1_3.method8431(arg0.anInt4083);
		local45.aClass3_Sub15_Sub1_3.method8423(Static60.anInt1272);
		local45.aClass3_Sub15_Sub1_3.method8423(arg0.anInt4059);
		local45.aClass3_Sub15_Sub1_3.method8423(Static33.anInt612);
		local45.aClass3_Sub15_Sub1_3.method8419(Static461.anInt8388);
		Static472.method5189(local45);
	}
}
