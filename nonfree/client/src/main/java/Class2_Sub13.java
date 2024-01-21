import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
	public final int anInt2660;

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
	private final int anInt2658;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "[[I")
	public final int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!va", name = "mb", descriptor = "[I")
	public final int[] anIntArray336;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt2660 = arg0;
		@Pc(11) Class2_Sub3 local11 = new Class2_Sub3(arg1);
		this.anInt2658 = local11.method791();
		this.anIntArrayArray26 = new int[this.anInt2658][];
		this.anIntArray336 = new int[this.anInt2658];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2658; local28++) {
			this.anIntArray336[local28] = local11.method791();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt2658; local44++) {
			this.anIntArrayArray26[local44] = new int[local11.method791()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt2658; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray26[local65].length; local69++) {
				this.anIntArrayArray26[local65][local69] = local11.method791();
			}
		}
	}
}
