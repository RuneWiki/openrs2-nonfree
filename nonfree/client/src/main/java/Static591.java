import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!uca", name = "u", descriptor = "Lclient!iv;")
	public static Class174 aClass174_7 = null;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([BI)[B")
	public static byte[] method8027(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static685.method8328(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BIIIIZLclient!cb;)V")
	public static void method8028(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class50 arg3) {
		if (arg2 <= 0) {
			Static550.method7596(arg3, arg0, arg1);
			return;
		}
		Static516.aClass50_76 = arg3;
		Static332.anInt6016 = arg0;
		Static30.anInt411 = 0;
		Static643.anInt10179 = arg1;
		Static175.anInt2881 = 1;
		Static464.aClass5_Sub14_Sub4_25 = null;
		Static342.aBoolean452 = false;
		Static133.anInt2251 = Static537.aClass5_Sub14_Sub4_35.method3227() / arg2;
		if (Static133.anInt2251 < 1) {
			Static133.anInt2251 = 1;
			return;
		}
	}
}
