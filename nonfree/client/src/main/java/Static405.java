import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!or", name = "o", descriptor = "Lclient!hu;")
	public static Class21 aClass21_27;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "Lclient!gfa;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "[[[Lclient!cj;")
	public static Class56[][][] aClass56ArrayArrayArray2;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)[B")
	public static byte[] method6420(@OriginalArg(1) int arg0) {
		@Pc(12) Class8_Sub5_Sub16 local12 = (Class8_Sub5_Sub16) Static489.aClass159_4.method4551((long) arg0);
		if (local12 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(54) int local54 = 255 - local48;
				@Pc(59) int local59 = Static221.method4149(local54, local31);
				@Pc(63) byte local63 = local25[local59];
				local25[local59] = local25[local54];
				local25[local54] = local25[511 - local48] = local63;
			}
			local12 = new Class8_Sub5_Sub16(local25);
			Static489.aClass159_4.method4549((long) arg0, local12);
		}
		return local12.aByteArray76;
	}
}
