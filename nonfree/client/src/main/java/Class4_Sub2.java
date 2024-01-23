import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	public int anInt112;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "I")
	public int anInt107;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "[Z")
	public boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt112 = arg0;
		@Pc(11) Class4_Sub10 local11 = new Class4_Sub10(arg1);
		this.anInt107 = local11.method4666();
		this.anIntArray11 = new int[this.anInt107];
		this.anIntArray12 = new int[this.anInt107];
		this.aBooleanArray1 = new boolean[this.anInt107];
		this.anIntArrayArray1 = new int[this.anInt107][];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt107; local38++) {
			this.anIntArray11[local38] = local11.method4666();
		}
		for (local38 = 0; local38 < this.anInt107; local38++) {
			this.aBooleanArray1[local38] = local11.method4666() == 1;
		}
		for (local38 = 0; local38 < this.anInt107; local38++) {
			this.anIntArray12[local38] = local11.method4653();
		}
		for (local38 = 0; local38 < this.anInt107; local38++) {
			this.anIntArrayArray1[local38] = new int[local11.method4666()];
		}
		for (local38 = 0; local38 < this.anInt107; local38++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray1[local38].length; local126++) {
				this.anIntArrayArray1[local38][local126] = local11.method4666();
			}
		}
	}
}
