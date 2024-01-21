import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
	public final int anInt1173;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	private final int anInt1167;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
	public final int[] anIntArray118;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "[[I")
	public final int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1173 = arg0;
		@Pc(9) Class1_Sub19 local9 = new Class1_Sub19(arg1);
		this.anInt1167 = local9.method2072();
		this.anIntArray118 = new int[this.anInt1167];
		this.anIntArrayArray6 = new int[this.anInt1167][];
		for (@Pc(26) int local26 = 0; local26 < this.anInt1167; local26++) {
			this.anIntArray118[local26] = local9.method2072();
		}
		for (@Pc(45) int local45 = 0; local45 < this.anInt1167; local45++) {
			this.anIntArrayArray6[local45] = new int[local9.method2072()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt1167; local65++) {
			for (@Pc(68) int local68 = 0; local68 < this.anIntArrayArray6[local65].length; local68++) {
				this.anIntArrayArray6[local65][local68] = local9.method2072();
			}
		}
	}
}
