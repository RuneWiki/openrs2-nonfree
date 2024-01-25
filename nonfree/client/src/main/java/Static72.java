import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_7 = new Class14();

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_32 = new Class265(38, 4);

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_40 = new Class209("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([SZ)[S")
	public static short[] method1337(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static457.method681(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!em;)V")
	public static void method1342(@OriginalArg(1) Class68 arg0) {
		@Pc(7) Class68 local7 = Static71.method1332(arg0);
		@Pc(16) int local16;
		@Pc(18) int local18;
		if (local7 == null) {
			local16 = Static86.anInt4394;
			local18 = Static395.anInt6582;
		} else {
			local18 = local7.anInt2252;
			local16 = local7.anInt2188;
		}
		Static38.method5044(local18, false, local16, arg0);
		Static357.method4871(arg0, local18, local16);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public static void method1344() {
		Static195.aClass49_5.B(Static336.aFloat82 * ((float) Static12.aClass79_Sub1_1.anInt4928 * 0.1F + 0.7F));
		Static195.aClass49_5.T(Static179.anInt3514, Static276.aFloat72, Static75.aFloat22, (float) (Static264.anInt4902 << 0), (float) (Static40.anInt754 << 0), (float) (Static437.anInt7192 << 0));
		Static195.aClass49_5.method4470(Static273.aClass155_4);
	}
}
