import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
	public static int anInt4847;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	public static int anInt4849;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Lclient!bh;")
	public static final Class4_Sub5 aClass4_Sub5_1 = new Class4_Sub5(0, 0);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!ns;BLclient!qa;)V")
	public static void method3701(@OriginalArg(0) Class166 arg0, @OriginalArg(2) Class30 arg1) {
		if (Static285.aBoolean355) {
			return;
		}
		arg1.M(0);
		Static235.aClass3_12 = arg1.method4656(Static464.method4792(arg0, Static162.anInt6352));
		Static235.aClass3_12.method5877((Static87.anInt1948 - Static235.aClass3_12.ja()) / 2, (Static349.anInt6303 - Static235.aClass3_12.JA()) / 2);
		Static328.aClass3_16 = arg1.method4656(Static464.method4792(arg0, Static38.anInt985));
		Static328.aClass3_16.method5877((Static87.anInt1948 - Static328.aClass3_16.ja()) / 2, 18);
		Static285.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)Lclient!wi;")
	public static Class263 method3703(@OriginalArg(1) int arg0) {
		@Pc(8) Class263[] local8 = Static197.method5044();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (arg0 == local8[local10].anInt7392) {
				return local8[local10];
			}
		}
		return null;
	}
}
