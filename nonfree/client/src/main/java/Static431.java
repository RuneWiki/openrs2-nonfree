import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "[I")
	public static final int[] anIntArray437 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ei;I)I")
	public static int method6709(@OriginalArg(0) Class8_Sub5_Sub6 arg0) {
		@Pc(12) String local12 = Static595.method8218(arg0);
		return Static469.aClass345_15.method8114(local12, Static99.aClass21Array5);
	}
}
