import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!io", name = "O", descriptor = "I")
	public static int anInt4898;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!io", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!io", name = "M", descriptor = "F")
	public static float aFloat111 = 0.25F;

	@OriginalMember(owner = "client!io", name = "P", descriptor = "Lclient!uca;")
	public static final Class351 aClass351_1 = new Class351();

	@OriginalMember(owner = "client!io", name = "g", descriptor = "(I)V")
	public static void method4105() {
		@Pc(13) int local13 = 0;
		if (Static227.aClass3_Sub15_11.aClass17_Sub2_1.method725() == 1) {
			local13 = 55;
		}
		if (Static227.aClass3_Sub15_11.aClass17_Sub12_1.method4577() == 0) {
			local13 |= 0x40;
		}
		Static80.method8699(local13);
		Static349.aClass374_2.method8356(local13);
		Static237.aClass371_2.method8304(local13);
		Static481.aClass241_2.method5577(local13);
		Static196.aClass315_2.method7422(local13);
		Static134.method2283(local13);
		Static195.method3089(local13);
		Static506.method7171(local13);
		Static472.method6743(local13);
		Static230.method3703();
	}
}
