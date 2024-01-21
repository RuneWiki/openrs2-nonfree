import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
	public final int anInt184;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
	private final int anInt178;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "[[I")
	public final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "[I")
	public final int[] anIntArray28;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt184 = arg0;
		@Pc(11) Class2_Sub5 local11 = new Class2_Sub5(arg1);
		this.anInt178 = local11.method1281();
		this.anIntArrayArray5 = new int[this.anInt178][];
		this.anIntArray28 = new int[this.anInt178];
		for (@Pc(28) int local28 = 0; local28 < this.anInt178; local28++) {
			this.anIntArray28[local28] = local11.method1281();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt178; local44++) {
			this.anIntArrayArray5[local44] = new int[local11.method1281()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt178; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray5[local61].length; local65++) {
				this.anIntArrayArray5[local61][local65] = local11.method1281();
			}
		}
	}
}
