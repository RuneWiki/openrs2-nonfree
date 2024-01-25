import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!rt;")
	public static Class6_Sub42 aClass6_Sub42_7;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "[S")
	public static final short[] aShortArray162 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!iaa;)Lclient!kq;")
	public static Class189 method8013(@OriginalArg(1) Class6_Sub26 arg0) {
		@Pc(9) String local9 = arg0.method4941();
		@Pc(16) Class148 local16 = Static38.method1094()[arg0.method4966()];
		@Pc(23) Class49 local23 = Static131.method2521()[arg0.method4966()];
		@Pc(27) int local27 = arg0.method4974();
		@Pc(31) int local31 = arg0.method4974();
		@Pc(40) int local40 = arg0.method5000();
		@Pc(44) int local44 = arg0.method5000();
		return new Class189(local9, local16, local23, local27, local31, local40, local44);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!iaa;B)Ljava/lang/String;")
	public static String method8015(@OriginalArg(0) Class6_Sub26 arg0) {
		return Static474.method7262(arg0);
	}
}
