import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
	public final int anInt1059;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	private final int anInt1056;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "[Z")
	private final boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "[I")
	public final int[] anIntArray92;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1059 = arg0;
		@Pc(11) Class4_Sub11 local11 = new Class4_Sub11(arg1);
		this.anInt1056 = local11.method1253();
		this.aBooleanArray6 = new boolean[this.anInt1056];
		this.anIntArrayArray8 = new int[this.anInt1056][];
		this.anIntArray92 = new int[this.anInt1056];
		for (@Pc(33) int local33 = 0; local33 < this.anInt1056; local33++) {
			this.anIntArray92[local33] = local11.method1253();
		}
		for (@Pc(49) int local49 = 0; local49 < this.anInt1056; local49++) {
			this.aBooleanArray6[local49] = local11.method1253() == 1;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt1056; local74++) {
			this.anIntArrayArray8[local74] = new int[local11.method1253()];
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt1056; local91++) {
			for (@Pc(95) int local95 = 0; local95 < this.anIntArrayArray8[local91].length; local95++) {
				this.anIntArrayArray8[local91][local95] = local11.method1253();
			}
		}
	}
}
