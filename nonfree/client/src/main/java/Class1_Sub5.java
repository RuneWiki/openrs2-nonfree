import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!i", name = "D", descriptor = "I")
	public final int anInt1070;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "I")
	private final int anInt1073;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[[I")
	public final int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "[I")
	public final int[] anIntArray155;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1070 = arg0;
		@Pc(11) Class1_Sub6 local11 = new Class1_Sub6(arg1);
		this.anInt1073 = local11.method1837();
		this.anIntArrayArray9 = new int[this.anInt1073][];
		this.anIntArray155 = new int[this.anInt1073];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1073; local28++) {
			this.anIntArray155[local28] = local11.method1837();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt1073; local44++) {
			this.anIntArrayArray9[local44] = new int[local11.method1837()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt1073; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray9[local61].length; local65++) {
				this.anIntArrayArray9[local61][local65] = local11.method1837();
			}
		}
	}
}
