import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class230 {

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
	public static final int[] anIntArray314 = new int[128];

	static {
		for (@Pc(14) int local14 = 0; local14 < anIntArray314.length; local14++) {
			anIntArray314[local14] = -1;
		}
		for (@Pc(30) int local30 = 65; local30 <= 90; local30++) {
			anIntArray314[local30] = local30 - 65;
		}
		for (@Pc(45) int local45 = 97; local45 <= 122; local45++) {
			anIntArray314[local45] = local45 + 26 - 97;
		}
		for (@Pc(60) int local60 = 48; local60 <= 57; local60++) {
			anIntArray314[local60] = local60 + 52 - 48;
		}
		anIntArray314[45] = anIntArray314[47] = 63;
		anIntArray314[42] = anIntArray314[43] = 62;
	}
}
