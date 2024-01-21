import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	public final int anInt1990;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	private final int anInt1988;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "[[I")
	public final int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "[Z")
	private final boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "[I")
	public final int[] anIntArray220;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1990 = arg0;
		@Pc(11) Class1_Sub8 local11 = new Class1_Sub8(arg1);
		this.anInt1988 = local11.method336();
		this.anIntArrayArray18 = new int[this.anInt1988][];
		this.aBooleanArray12 = new boolean[this.anInt1988];
		this.anIntArray220 = new int[this.anInt1988];
		for (@Pc(33) int local33 = 0; local33 < this.anInt1988; local33++) {
			this.anIntArray220[local33] = local11.method336();
		}
		for (@Pc(53) int local53 = 0; local53 < this.anInt1988; local53++) {
			this.aBooleanArray12[local53] = local11.method336() == 1;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt1988; local80++) {
			this.anIntArrayArray18[local80] = new int[local11.method336()];
		}
		for (@Pc(97) int local97 = 0; local97 < this.anInt1988; local97++) {
			for (@Pc(101) int local101 = 0; local101 < this.anIntArrayArray18[local97].length; local101++) {
				this.anIntArrayArray18[local97][local101] = local11.method336();
			}
		}
	}
}
