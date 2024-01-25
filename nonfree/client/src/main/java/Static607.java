import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public static int anInt10283;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!ni;I)Lclient!tba;")
	public static Class6_Sub46 method8354(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1) {
		@Pc(13) byte[] local13 = arg1.method5942(arg0);
		return local13 == null ? null : new Class6_Sub46(local13);
	}
}
