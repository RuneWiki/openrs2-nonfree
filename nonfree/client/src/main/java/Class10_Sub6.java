import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class10_Sub6 extends Class10 {

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	public final int anInt941;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
	private final int anInt945;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "[[I")
	public final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
	public final int[] anIntArray103;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I[B)V")
	public Class10_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt941 = arg0;
		@Pc(11) Class10_Sub10 local11 = new Class10_Sub10(arg1);
		this.anInt945 = local11.method1111();
		this.anIntArrayArray8 = new int[this.anInt945][];
		this.anIntArray103 = new int[this.anInt945];
		for (@Pc(28) int local28 = 0; local28 < this.anInt945; local28++) {
			this.anIntArray103[local28] = local11.method1111();
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt945; local44++) {
			this.anIntArrayArray8[local44] = new int[local11.method1111()];
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt945; local61++) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArrayArray8[local61].length; local65++) {
				this.anIntArrayArray8[local61][local65] = local11.method1111();
			}
		}
	}
}
