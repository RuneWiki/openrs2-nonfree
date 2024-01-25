import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	public static int anInt9680;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "Lclient!jda;")
	public static final Class188 aClass188_4 = new Class188();

	@OriginalMember(owner = "client!v", name = "E", descriptor = "[Lclient!kj;")
	public static final Class210[] aClass210Array1 = new Class210[2048];

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZII)I")
	public static int method8243(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class3_Sub29 local10 = Static577.method7771(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray354.length; local24++) {
				if (local10.anIntArray353[local24] == arg0) {
					local22 += local10.anIntArray354[local24];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)I")
	public static int method8246(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
