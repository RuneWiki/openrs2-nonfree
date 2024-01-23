import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "I")
	public int anInt175;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!al", name = "u", descriptor = "[I")
	public int[] anIntArray14;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "[I")
	public int[] anIntArray13;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "[Z")
	public boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt178 = arg0;
		@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(arg1);
		this.anInt175 = local11.method1378();
		this.anIntArrayArray2 = new int[this.anInt175][];
		this.anIntArray14 = new int[this.anInt175];
		this.anIntArray13 = new int[this.anInt175];
		this.aBooleanArray1 = new boolean[this.anInt175];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt175; local38++) {
			this.anIntArray14[local38] = local11.method1378();
		}
		for (local38 = 0; local38 < this.anInt175; local38++) {
			this.aBooleanArray1[local38] = local11.method1378() == 1;
		}
		for (local38 = 0; local38 < this.anInt175; local38++) {
			this.anIntArray13[local38] = local11.method1386();
		}
		for (local38 = 0; local38 < this.anInt175; local38++) {
			this.anIntArrayArray2[local38] = new int[local11.method1378()];
		}
		for (local38 = 0; local38 < this.anInt175; local38++) {
			for (@Pc(120) int local120 = 0; local120 < this.anIntArrayArray2[local38].length; local120++) {
				this.anIntArrayArray2[local38][local120] = local11.method1378();
			}
		}
	}
}
