import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "Lclient!hv;")
	public static Class12_Sub20 aClass12_Sub20_1;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "[Lclient!g;")
	public static Class7_Sub1_Sub1_Sub1[] aClass7_Sub1_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_55 = new Class45(82, 8);

	@OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
	public static int anInt3980 = 0;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_56 = new Class45(18, 7);

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3489(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILclient!nj;)V")
	public static void method3490(@OriginalArg(1) Class12_Sub8_Sub2 arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static77.anInt1793; local13++) {
			@Pc(19) int local19 = Static523.anIntArray683[local13];
			@Pc(23) Class30_Sub1_Sub1_Sub1 local23 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local19];
			@Pc(27) int local27 = arg0.method5216();
			if ((local27 & 0x80) != 0) {
				local27 += arg0.method5216() << 8;
			}
			if ((local27 & 0x1000) != 0) {
				local27 += arg0.method5216() << 16;
			}
			Static119.method2467(local23, local19, arg0, local27);
		}
	}
}
