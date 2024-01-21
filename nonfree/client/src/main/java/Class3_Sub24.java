import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
	public final int anInt3128;

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
	private final int anInt3134;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "[[I")
	public final int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "[I")
	public final int[] anIntArray379;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3128 = arg0;
		@Pc(11) Class3_Sub11 local11 = new Class3_Sub11(arg1);
		this.anInt3134 = local11.method981();
		this.anIntArrayArray28 = new int[this.anInt3134][];
		this.anIntArray379 = new int[this.anInt3134];
		for (@Pc(28) int local28 = 0; local28 < this.anInt3134; local28++) {
			this.anIntArray379[local28] = local11.method981();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt3134; local44++) {
			this.anIntArrayArray28[local44] = new int[local11.method981()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt3134; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray28[local61].length; local65++) {
				this.anIntArrayArray28[local61][local65] = local11.method981();
			}
		}
	}
}
