import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kba", name = "O", descriptor = "I")
	public static int anInt5092;

	@OriginalMember(owner = "client!kba", name = "eb", descriptor = "[S")
	private static final short[] aShortArray76 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!kba", name = "kb", descriptor = "[S")
	private static final short[] aShortArray77 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kba", name = "L", descriptor = "[S")
	private static final short[] aShortArray75 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kba", name = "K", descriptor = "[[S")
	public static final short[][] aShortArrayArray11 = new short[][] { aShortArray76, aShortArray77, aShortArray75 };

	@OriginalMember(owner = "client!kba", name = "R", descriptor = "[I")
	public static final int[] anIntArray274 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(CIZ)I")
	public static int method4599(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(16) char local16 = Character.toLowerCase(arg0);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}
}
