import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	public final int anInt1857;

	@OriginalMember(owner = "client!la", name = "D", descriptor = "I")
	private final int anInt1861;

	@OriginalMember(owner = "client!la", name = "A", descriptor = "[I")
	public final int[] anIntArray233;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "[[I")
	public final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1857 = arg0;
		@Pc(11) Class2_Sub17 local11 = new Class2_Sub17(arg1);
		this.anInt1861 = local11.method1780();
		this.anIntArray233 = new int[this.anInt1861];
		this.anIntArrayArray22 = new int[this.anInt1861][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1861; local28++) {
			this.anIntArray233[local28] = local11.method1780();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt1861; local48++) {
			this.anIntArrayArray22[local48] = new int[local11.method1780()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt1861; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray22[local65].length; local69++) {
				this.anIntArrayArray22[local65][local69] = local11.method1780();
			}
		}
	}
}
