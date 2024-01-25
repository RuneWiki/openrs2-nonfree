import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "[I")
	public static final int[] anIntArray594 = new int[128];

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
	public final int anInt11042;

	static {
		for (@Pc(55) int local55 = 0; local55 < anIntArray594.length; local55++) {
			anIntArray594[local55] = -1;
		}
		for (@Pc(71) int local71 = 65; local71 <= 90; local71++) {
			anIntArray594[local71] = local71 - 65;
		}
		for (@Pc(86) int local86 = 97; local86 <= 122; local86++) {
			anIntArray594[local86] = local86 - 71;
		}
		for (@Pc(101) int local101 = 48; local101 <= 57; local101++) {
			anIntArray594[local101] = local101 + 52 - 48;
		}
		anIntArray594[45] = anIntArray594[47] = 63;
		anIntArray594[42] = anIntArray594[43] = 62;
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
	public Class4_Sub10(@OriginalArg(0) int arg0) {
		this.anInt11042 = arg0;
	}
}
