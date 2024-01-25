import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "Lclient!ai;")
	public static Class12 aClass12_12;

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
	public static int anInt10399;

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "Lclient!gi;")
	public static final Class131 aClass131_25 = new Class131();

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
	public static int anInt10400 = -1;

	@OriginalMember(owner = "client!ev", name = "n", descriptor = "[I")
	public static final int[] anIntArray554 = new int[50];

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B[B)[B")
	public static byte[] method8487(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		@Pc(17) int local17 = local8.method7954();
		@Pc(21) int local21 = local8.method7895();
		if (local21 < 0 || Static626.anInt10362 != 0 && Static626.anInt10362 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(100) byte[] local100 = new byte[local21];
			local8.method7958(0, local100, local21);
			return local100;
		} else {
			@Pc(44) int local44 = local8.method7895();
			if (local44 < 0 || Static626.anInt10362 != 0 && Static626.anInt10362 < local44) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local44];
			if (local17 == 1) {
				Static423.method5813(local68, local44, arg0, local21);
			} else {
				@Pc(82) Class361 local82 = Static214.aClass361_7;
				synchronized (Static214.aClass361_7) {
					Static214.aClass361_7.method8334(local68, local8);
				}
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)Z")
	public static boolean method8491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
