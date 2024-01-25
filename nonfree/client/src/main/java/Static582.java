import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!sga", name = "q", descriptor = "Lclient!kka;")
	public static final Class143 aClass143_6 = Static370.method5350();

	@OriginalMember(owner = "client!sga", name = "k", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_117 = new Class286(6, -1);

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)Lclient!rba;")
	public static Class3_Sub28 method8679() {
		@Pc(8) Class3_Sub28 local8 = new Class3_Sub28(518);
		Static415.anIntArray396 = new int[4];
		Static415.anIntArray396[3] = (int) (Math.random() * 9.9999999E7D);
		Static415.anIntArray396[0] = (int) (Math.random() * 9.9999999E7D);
		Static415.anIntArray396[2] = (int) (Math.random() * 9.9999999E7D);
		Static415.anIntArray396[1] = (int) (Math.random() * 9.9999999E7D);
		local8.method5329(10);
		local8.method5311(Static415.anIntArray396[0]);
		local8.method5311(Static415.anIntArray396[1]);
		local8.method5311(Static415.anIntArray396[2]);
		local8.method5311(Static415.anIntArray396[3]);
		return local8;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!rba;B)Lclient!va;")
	public static Class21 method8682(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(10) Class304 local10 = Static24.method9444()[arg0.method5322(-67)];
		@Pc(17) Class216 local17 = Static133.method2912()[arg0.method5322(-121)];
		@Pc(21) int local21 = arg0.method5281();
		@Pc(25) int local25 = arg0.method5281();
		@Pc(29) int local29 = arg0.method5272();
		@Pc(33) int local33 = arg0.method5272();
		@Pc(37) int local37 = arg0.method5281();
		@Pc(49) int local49 = arg0.method5312();
		@Pc(53) int local53 = arg0.method5312();
		return new Class21(local10, local17, local21, local25, local29, local33, local37, local49, local53);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIB)V")
	public static void method8683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub48 local13 = Static89.method1200(Static627.aClass286_114, Static532.aClass400_3.aClass399_2);
		local13.aClass3_Sub28_Sub2_1.method5313(arg0);
		local13.aClass3_Sub28_Sub2_1.method5325(arg1);
		Static532.aClass400_3.method9223(local13);
	}
}
