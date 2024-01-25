import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_81 = new Class276(71, 1);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)Z")
	public static boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static102.method2184(arg1, arg0) | Static109.method2277(arg0, arg1) | Static14.method423(arg1, arg0)) & Static2.method178(arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!cda;I)V")
	public static void method5422(@OriginalArg(0) Class3_Sub7_Sub1 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static293.anInt6017; local1++) {
			@Pc(9) int local9 = Static12.anIntArray6[local1];
			@Pc(13) Class2_Sub2_Sub1_Sub1 local13 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local9];
			@Pc(19) int local19 = arg0.method6538();
			if ((local19 & 0x2) != 0) {
				local19 += arg0.method6538() << 8;
			}
			if ((local19 & 0x200) != 0) {
				local19 += arg0.method6538() << 16;
			}
			Static252.method4534(arg0, local9, local19, local13);
		}
	}
}
