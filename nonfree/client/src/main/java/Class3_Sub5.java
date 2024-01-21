import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!de", name = "w", descriptor = "I")
	public final int anInt735;

	@OriginalMember(owner = "client!de", name = "x", descriptor = "I")
	private final int anInt736;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "[I")
	public final int[] anIntArray74;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "[[I")
	public final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt735 = arg0;
		@Pc(11) Class3_Sub7 local11 = new Class3_Sub7(arg1);
		this.anInt736 = local11.method647();
		this.anIntArray74 = new int[this.anInt736];
		this.anIntArrayArray4 = new int[this.anInt736][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt736; local28++) {
			this.anIntArray74[local28] = local11.method647();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt736; local44++) {
			this.anIntArrayArray4[local44] = new int[local11.method647()];
		}
		for (@Pc(65) int local65 = 0; local65 < this.anInt736; local65++) {
			for (@Pc(69) int local69 = 0; local69 < this.anIntArrayArray4[local65].length; local69++) {
				this.anIntArrayArray4[local65][local69] = local11.method647();
			}
		}
	}
}
