import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
	public int anInt157;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
	public int anInt160;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "[Z")
	public boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "[I")
	public int[] anIntArray13;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt157 = arg0;
		@Pc(11) Class4_Sub17 local11 = new Class4_Sub17(arg1);
		this.anInt160 = local11.method1874();
		this.anIntArrayArray3 = new int[this.anInt160][];
		this.aBooleanArray1 = new boolean[this.anInt160];
		this.anIntArray13 = new int[this.anInt160];
		this.anIntArray12 = new int[this.anInt160];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt160; local38++) {
			this.anIntArray13[local38] = local11.method1874();
		}
		for (local38 = 0; local38 < this.anInt160; local38++) {
			this.aBooleanArray1[local38] = local11.method1874() == 1;
		}
		for (local38 = 0; local38 < this.anInt160; local38++) {
			this.anIntArray12[local38] = local11.method1837();
		}
		for (local38 = 0; local38 < this.anInt160; local38++) {
			this.anIntArrayArray3[local38] = new int[local11.method1874()];
		}
		for (local38 = 0; local38 < this.anInt160; local38++) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArrayArray3[local38].length; local126++) {
				this.anIntArrayArray3[local38][local126] = local11.method1874();
			}
		}
	}
}
