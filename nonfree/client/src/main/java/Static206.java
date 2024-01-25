import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
	public static int anInt3612;

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_40 = new Class171(71, 2);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Z")
	public static boolean method3083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static226.method3387(arg0, arg1) || Static506.method6604(arg0, arg1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZLclient!ofa;Lclient!ha;)V")
	public static void method3084(@OriginalArg(1) Class265 arg0, @OriginalArg(2) Class95 arg1) {
		@Pc(36) boolean local36 = Static117.aClass197_2.method4529(arg0.anInt7039, arg0.anInt7045, arg0.anInt7051 | 0xFF000000, arg1, arg0.anInt7005, arg0.anInt6971, arg0.aBoolean494 ? Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 : null) == null;
		if (local36) {
			Static211.aClass302_21.method6613(new Class3_Sub50(arg0.anInt7005, arg0.anInt7045, arg0.anInt6971, arg0.anInt7051 | 0xFF000000, arg0.anInt7039, arg0.aBoolean494));
			Static218.method3194(arg0);
		}
	}
}
