import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "([BI)[B")
	public static byte[] method4200(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub12 local8 = new Class5_Sub12(arg0);
		@Pc(19) int local19 = local8.method8645();
		@Pc(23) int local23 = local8.method8623();
		if (local23 < 0 || Static468.anInt7879 != 0 && Static468.anInt7879 < local23) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(106) byte[] local106 = new byte[local23];
			local8.method8625(local106, 0, local23);
			return local106;
		} else {
			@Pc(53) int local53 = local8.method8623();
			if (local53 < 0 || Static468.anInt7879 != 0 && Static468.anInt7879 < local53) {
				throw new RuntimeException();
			}
			@Pc(74) byte[] local74 = new byte[local53];
			if (local19 == 1) {
				Static524.method7498(local74, local53, arg0, local23);
			} else {
				@Pc(81) Class157 local81 = Static210.aClass157_1;
				synchronized (Static210.aClass157_1) {
					Static210.aClass157_1.method3634(local8, local74);
				}
			}
			return local74;
		}
	}
}
