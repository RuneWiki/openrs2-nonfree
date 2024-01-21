import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	public final int anInt939;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
	private final int anInt938;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "[I")
	public final int[] anIntArray129;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt939 = arg0;
		@Pc(9) Class2_Sub12 local9 = new Class2_Sub12(arg1);
		this.anInt938 = local9.method1399();
		this.anIntArray129 = new int[this.anInt938];
		this.anIntArrayArray15 = new int[this.anInt938][];
		for (@Pc(26) int local26 = 0; local26 < this.anInt938; local26++) {
			this.anIntArray129[local26] = local9.method1399();
		}
		for (@Pc(45) int local45 = 0; local45 < this.anInt938; local45++) {
			this.anIntArrayArray15[local45] = new int[local9.method1399()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt938; local65++) {
			for (@Pc(68) int local68 = 0; local68 < this.anIntArrayArray15[local65].length; local68++) {
				this.anIntArrayArray15[local65][local68] = local9.method1399();
			}
		}
	}
}
