import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "F")
	public static float aFloat138;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_123 = new Class73(67, -1);

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
	public static boolean aBoolean559 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_75 = new Class185(40, 4);

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "[I")
	public static final int[] anIntArray334 = new int[5];

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "[C")
	public static final char[] aCharArray13 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!vea;")
	public static final Class352 aClass352_4 = new Class352(9, 0, 4, 1);

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[200];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)I")
	public static int method5884(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ni;ILclient!jga;Lclient!qn;Lclient!ni;Lclient!ni;)Z")
	public static boolean method5886(@OriginalArg(0) Class223 arg0, @OriginalArg(2) Class6_Sub4_Sub2 arg1, @OriginalArg(3) Class114 arg2, @OriginalArg(4) Class223 arg3, @OriginalArg(5) Class223 arg4) {
		Static623.aClass6_Sub4_Sub2_4 = arg1;
		Static426.aClass223_95 = arg3;
		Static167.aClass223_45 = arg4;
		Static394.anIntArray369 = new int[16];
		Static474.aClass114_3 = arg2;
		Static12.aClass223_4 = arg0;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static394.anIntArray369[local25] = 255;
		}
		return true;
	}
}
