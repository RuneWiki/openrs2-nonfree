import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!lq;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[B")
	public static byte[] method2195(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub4_Sub14 local14 = (Class6_Sub4_Sub14) Static303.aClass199_4.method4863((long) arg0);
		if (local14 == null) {
			@Pc(23) byte[] local23 = new byte[512];
			@Pc(29) Random local29 = new Random((long) arg0);
			for (@Pc(31) int local31 = 0; local31 < 255; local31++) {
				local23[local31] = (byte) local31;
			}
			for (@Pc(46) int local46 = 0; local46 < 255; local46++) {
				@Pc(52) int local52 = 255 - local46;
				@Pc(57) int local57 = Static326.method5252(local29, local52);
				@Pc(61) byte local61 = local23[local57];
				local23[local57] = local23[local52];
				local23[local52] = local23[511 - local46] = local61;
			}
			local14 = new Class6_Sub4_Sub14(local23);
			Static303.aClass199_4.method4858(local14, (long) arg0);
		}
		return local14.aByteArray95;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)Z")
	public static boolean method2196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static261.method4523(arg0, arg1) | (arg1 & 0x40000) != 0 || Static331.method8155(arg0, arg1);
	}
}
