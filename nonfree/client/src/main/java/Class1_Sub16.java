import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public final int anInt1603;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public final int anInt1604;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "[Z")
	public final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "[I")
	public final int[] anIntArray134;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "[[I")
	public final int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
	public final int[] anIntArray135;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1603 = arg0;
		@Pc(11) Class1_Sub7 local11 = new Class1_Sub7(arg1);
		this.anInt1604 = local11.method2132();
		this.aBooleanArray7 = new boolean[this.anInt1604];
		this.anIntArray134 = new int[this.anInt1604];
		this.anIntArrayArray17 = new int[this.anInt1604][];
		this.anIntArray135 = new int[this.anInt1604];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1604; local38++) {
			this.anIntArray134[local38] = local11.method2132();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt1604; local58++) {
			this.aBooleanArray7[local58] = local11.method2132() == 1;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt1604; local83++) {
			this.anIntArray135[local83] = local11.method2161();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt1604; local99++) {
			this.anIntArrayArray17[local99] = new int[local11.method2132()];
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt1604; local116++) {
			for (@Pc(120) int local120 = 0; local120 < this.anIntArrayArray17[local116].length; local120++) {
				this.anIntArrayArray17[local116][local120] = local11.method2132();
			}
		}
	}
}
