import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_130 = new Class274(14, 2);

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_9 = new Class271(13, 0, 1, 0);

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public static int anInt8018 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)Z")
	public static boolean method6718(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)I")
	public static int method6719(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static472.method6787(arg0 + 45365, 4, arg1 + 91923) + (Static472.method6787(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static472.method6787(arg0, 1, arg1) + -128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}
}
