import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
	public static int anInt10100;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I[B)[B")
	public static byte[] method8656(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class3_Sub3 local13 = new Class3_Sub3(arg0);
		@Pc(17) int local17 = local13.method4225();
		@Pc(21) int local21 = local13.method4207();
		if (local21 < 0 || Static186.anInt3578 != 0 && Static186.anInt3578 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(44) byte[] local44 = new byte[local21];
			local13.method4206(local44, local21, 0);
			return local44;
		} else {
			@Pc(56) int local56 = local13.method4207();
			if (local56 < 0 || Static186.anInt3578 != 0 && Static186.anInt3578 < local56) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local56];
			if (local17 == 1) {
				Static385.method6209(local73, local56, arg0, local21);
			} else {
				@Pc(78) Class354 local78 = Static495.aClass354_1;
				synchronized (Static495.aClass354_1) {
					Static495.aClass354_1.method8378(local73, local13);
				}
			}
			return local73;
		}
	}
}
