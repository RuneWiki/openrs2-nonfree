import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!haa", name = "jb", descriptor = "I")
	public static int anInt4633;

	@OriginalMember(owner = "client!haa", name = "kb", descriptor = "J")
	public static long aLong99;

	@OriginalMember(owner = "client!haa", name = "q", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_41 = new Class94(53, -1);

	@OriginalMember(owner = "client!haa", name = "E", descriptor = "I")
	public static final int anInt4609 = -1;

	@OriginalMember(owner = "client!haa", name = "hb", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_91 = new Class215(119, 6);

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BZ)V")
	public static void method4041(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class2_Sub21 local10 = (Class2_Sub21) Static501.aClass341_59.method8524(); local10 != null; local10 = (Class2_Sub21) Static501.aClass341_59.method8519()) {
			if (local10.aClass2_Sub8_Sub5_3 != null) {
				Static614.aClass2_Sub8_Sub4_2.method7925(local10.aClass2_Sub8_Sub5_3);
				local10.aClass2_Sub8_Sub5_3 = null;
			}
			if (local10.aClass2_Sub8_Sub5_2 != null) {
				Static614.aClass2_Sub8_Sub4_2.method7925(local10.aClass2_Sub8_Sub5_2);
				local10.aClass2_Sub8_Sub5_2 = null;
			}
			local10.method9253();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class2_Sub21 local53 = (Class2_Sub21) Static76.aClass341_25.method8524(); local53 != null; local53 = (Class2_Sub21) Static76.aClass341_25.method8519()) {
			if (local53.aClass2_Sub8_Sub5_3 != null) {
				Static614.aClass2_Sub8_Sub4_2.method7925(local53.aClass2_Sub8_Sub5_3);
				local53.aClass2_Sub8_Sub5_3 = null;
			}
			local53.method9253();
		}
		for (@Pc(80) Class2_Sub21 local80 = (Class2_Sub21) Static458.aClass99_62.method3060(); local80 != null; local80 = (Class2_Sub21) Static458.aClass99_62.method3058()) {
			if (local80.aClass2_Sub8_Sub5_3 != null) {
				Static614.aClass2_Sub8_Sub4_2.method7925(local80.aClass2_Sub8_Sub5_3);
				local80.aClass2_Sub8_Sub5_3 = null;
			}
			local80.method9253();
		}
	}
}
