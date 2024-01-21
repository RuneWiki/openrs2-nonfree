import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!me", name = "y", descriptor = "I")
	public final int anInt1793;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	private final int anInt1798;

	@OriginalMember(owner = "client!me", name = "O", descriptor = "[I")
	public final int[] anIntArray198;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1793 = arg0;
		@Pc(11) Class4_Sub16 local11 = new Class4_Sub16(arg1);
		this.anInt1798 = local11.method1474();
		this.anIntArray198 = new int[this.anInt1798];
		this.anIntArrayArray15 = new int[this.anInt1798][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1798; local28++) {
			this.anIntArray198[local28] = local11.method1474();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt1798; local44++) {
			this.anIntArrayArray15[local44] = new int[local11.method1474()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1798; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray15[local61].length; local65++) {
				this.anIntArrayArray15[local61][local65] = local11.method1474();
			}
		}
	}
}
