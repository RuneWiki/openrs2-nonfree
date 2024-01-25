import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
	public static int anInt8407;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "Lclient!wr;")
	public static final Class380 aClass380_36 = new Class380(4);

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "[I")
	public static final int[] anIntArray432 = new int[13];

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBZ)I")
	public static int method7040(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub6 local14 = Static612.method8391(arg0, false);
		if (local14 == null) {
			return Static252.aClass15_1.method548(arg0).anInt6434;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray33.length; local26++) {
			if (local14.anIntArray33[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static252.aClass15_1.method548(arg0).anInt6434 - local14.anIntArray33.length;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)I")
	public static int method7041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static429.method6629(arg1 - 1, arg0 + -1) + Static429.method6629(arg1 + 1, arg0 + -1) + Static429.method6629(arg1 - 1, arg0 + 1) + Static429.method6629(arg1 - -1, arg0 + 1);
		@Pc(72) int local72 = Static429.method6629(arg1 - 1, arg0) + Static429.method6629(arg1 + 1, arg0) + Static429.method6629(arg1, arg0 - 1) + Static429.method6629(arg1, arg0 + 1);
		@Pc(77) int local77 = Static429.method6629(arg1, arg0);
		return local72 / 8 + local41 / 16 + local77 / 4;
	}
}
