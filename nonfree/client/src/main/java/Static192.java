import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray15;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!hu;")
	public static Class44 aClass44_29;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "[I")
	public static int[] anIntArray689;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "[I")
	public static final int[] anIntArray687 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "[I")
	public static final int[] anIntArray688 = new int[1000];

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(B)Z")
	public static boolean method7611() {
		return Static449.aBoolean627;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLclient!pf;)[I")
	public static int[] method7615(@OriginalArg(1) Class5_Sub40 arg0) {
		@Pc(10) Class5_Sub12 local10 = new Class5_Sub12(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8647(10);
		local10.method8622(local13[0]);
		local10.method8622(local13[1]);
		local10.method8622(local13[2]);
		local10.method8622(local13[3]);
		for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
			local10.method8622((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8655((int) (Math.random() * 9.9999999E7D));
		local10.method8630(Static36.aBigInteger3, Static5.aBigInteger1);
		arg0.aClass5_Sub12_Sub2_2.method8651(0, local10.aByteArray104, local10.anInt10154);
		return local13;
	}
}
