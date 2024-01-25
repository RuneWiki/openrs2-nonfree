import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_19 = new Class154(20);

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[B")
	public static final byte[] aByteArray49 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)I")
	public static int method2696(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(32) int local32 = (local9 & 0x33333333) + (local9 >>> 2 & 0xF3333333);
		@Pc(41) int local41 = local32 + (local32 >>> 4) & 0xF0F0F0F;
		@Pc(47) int local47 = local41 + (local41 >>> 8);
		@Pc(53) int local53 = local47 + (local47 >>> 16);
		return local53 & 0xFF;
	}
}
