import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class32_Sub1_Sub1 extends Class32_Sub1 {

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "[I")
	public static int[] anIntArray119 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray119[local4] = Static51.method853(local4);
		}
	}
}
