import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	public static int anInt5817 = 0;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_104 = new Class36(33, -1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZI[B)I")
	public static int method4495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg1; local14++) {
			local7 = local7 >>> 8 ^ Class210.anIntArray553[(arg2[local14] ^ local7) & 0xFF];
		}
		return ~local7;
	}
}
