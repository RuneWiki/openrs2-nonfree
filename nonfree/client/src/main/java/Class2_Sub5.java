import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
	public final int anInt715;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
	private final int anInt712;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "[I")
	public final int[] anIntArray96;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "[[I")
	public final int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt715 = arg0;
		@Pc(11) Class2_Sub8 local11 = new Class2_Sub8(arg1);
		this.anInt712 = local11.method1410();
		this.anIntArray96 = new int[this.anInt712];
		this.anIntArrayArray7 = new int[this.anInt712][];
		for (@Pc(28) int local28 = 0; local28 < this.anInt712; local28++) {
			this.anIntArray96[local28] = local11.method1410();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt712; local44++) {
			this.anIntArrayArray7[local44] = new int[local11.method1410()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt712; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray7[local61].length; local65++) {
				this.anIntArrayArray7[local61][local65] = local11.method1410();
			}
		}
	}
}
