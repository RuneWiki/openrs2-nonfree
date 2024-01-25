import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!un", name = "d", descriptor = "[[[Lclient!sk;")
	public static Class187[][][] aClass187ArrayArrayArray3;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "[I")
	public static int[] anIntArray678;

	@OriginalMember(owner = "client!un", name = "l", descriptor = "Lclient!lo;")
	public static final Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)I")
	public static int method5368(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(24) int local24 = (local9 & 0x33333333) + (local9 >>> 2 & 0x33333333);
		@Pc(37) int local37 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
