import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!ph;")
	public static Class187 aClass187_76;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!mn;")
	public static final Class167 aClass167_20 = new Class167(16);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!wi;)Ljava/lang/String;")
	public static String method3431(@OriginalArg(1) Class10_Sub45 arg0) {
		return arg0.aString72 == null || arg0.aString72.length() <= 0 ? arg0.aString71 : arg0.aString71 + Static395.aClass182_227.method4155(Static191.anInt3842) + arg0.aString72;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBIFIIIZI)[[I")
	public static int[][] method3436(@OriginalArg(3) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class10_Sub2_Sub22 local18 = new Class10_Sub2_Sub22();
		local18.anInt4916 = 4;
		local18.anInt4910 = (int) (arg0 * 4096.0F);
		local18.aBoolean335 = false;
		local18.anInt4917 = 8;
		local18.anInt4922 = 3;
		local18.method6036();
		Static229.method3414(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method3963(local14[local45], local45);
		}
		return local14;
	}
}
