import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_25 = new Class102(30);

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
	public static void method3563() {
		for (@Pc(10) Class3_Sub4_Sub1 local10 = (Class3_Sub4_Sub1) Static226.aClass15_3.method897(); local10 != null; local10 = (Class3_Sub4_Sub1) Static226.aClass15_3.method898()) {
			if (local10.anInt805 > 1) {
				local10.anInt805 = 0;
				aClass102_25.method2674(((Class3_Sub4_Sub13) local10.aClass15_1.aClass3_Sub4_5.aClass3_Sub4_66).aLong135, local10);
				local10.aClass15_1.method903();
			}
		}
		Static157.anInt3113 = 0;
		Static160.anInt3142 = 0;
		Static464.aClass223_49.method5862();
		Static458.aClass280_34.method7100();
		Static226.aClass15_3.method903();
		Static447.aBoolean555 = false;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLclient!l;II)V")
	public static void method3565(@OriginalArg(1) Class4_Sub1_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static653.method6860(local6, 0, local6.length, arg2);
		Static574.method8145(arg0, arg1, local6);
	}
}
