import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "[I")
	public static final int[] anIntArray84 = new int[1000];

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "[I")
	public static final int[] anIntArray85 = new int[100];

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "F")
	public static float aFloat8 = 0.0F;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method506(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(local8 + local10);
		for (@Pc(51) int local51 = 0; local51 < local8; local51++) {
			@Pc(57) char local57 = arg0.charAt(local51);
			if (local57 == '<') {
				local44.append("<lt>");
			} else if (local57 == '>') {
				local44.append("<gt>");
			} else {
				local44.append(local57);
			}
		}
		return local44.toString();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)I")
	public static int method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static17.aClass33Array1 == null) {
			return 0;
		}
		@Pc(20) int local20 = arg2 >> 7;
		@Pc(24) int local24 = arg0 >> 7;
		if (local20 < 0 || local24 < 0 || Static392.anInt6751 - 1 < local20 || Static307.anInt5484 - 1 < local24) {
			return 0;
		}
		@Pc(53) int local53 = arg1;
		if (arg1 < 3 && (Static244.aByteArrayArrayArray4[1][local20][local24] & 0x2) != 0) {
			local53 = arg1 + 1;
		}
		return Static17.aClass33Array1[local53].method4055(arg2, arg0);
	}
}
