import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
	public int anInt1378;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
	public int anInt1379;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "[Z")
	public boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1378 = arg0;
		@Pc(11) Class1_Sub13 local11 = new Class1_Sub13(arg1);
		this.anInt1379 = local11.method1772();
		this.anIntArrayArray12 = new int[this.anInt1379][];
		this.anIntArray103 = new int[this.anInt1379];
		this.aBooleanArray3 = new boolean[this.anInt1379];
		this.anIntArray102 = new int[this.anInt1379];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1379; local38++) {
			this.anIntArray103[local38] = local11.method1772();
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt1379; local58++) {
			this.aBooleanArray3[local58] = local11.method1772() == 1;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt1379; local83++) {
			this.anIntArray102[local83] = local11.method1764();
		}
		for (@Pc(99) int local99 = 0; local99 < this.anInt1379; local99++) {
			this.anIntArrayArray12[local99] = new int[local11.method1772()];
		}
		for (@Pc(120) int local120 = 0; local120 < this.anInt1379; local120++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray12[local120].length; local124++) {
				this.anIntArrayArray12[local120][local124] = local11.method1772();
			}
		}
	}
}
