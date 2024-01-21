import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
	public final int anInt1042;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
	private final int anInt1043;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "[I")
	public final int[] anIntArray194;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "[[I")
	public final int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1042 = arg0;
		@Pc(11) Class1_Sub5 local11 = new Class1_Sub5(arg1);
		this.anInt1043 = local11.method672();
		this.anIntArray194 = new int[this.anInt1043];
		this.anIntArrayArray9 = new int[this.anInt1043][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1043; local28++) {
			this.anIntArray194[local28] = local11.method672();
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt1043; local48++) {
			this.anIntArrayArray9[local48] = new int[local11.method672()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt1043; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray9[local65].length; local69++) {
				this.anIntArrayArray9[local65][local69] = local11.method672();
			}
		}
	}
}
