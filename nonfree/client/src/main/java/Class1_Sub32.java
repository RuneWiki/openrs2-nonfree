import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	public final int anInt5023;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	public final int anInt5021;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "[I")
	public final int[] anIntArray385;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[Z")
	public final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "[I")
	public final int[] anIntArray384;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "[[I")
	public final int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt5023 = arg0;
		@Pc(9) Class1_Sub14 local9 = new Class1_Sub14(arg1);
		this.anInt5021 = local9.method4548();
		this.anIntArray385 = new int[this.anInt5021];
		this.aBooleanArray19 = new boolean[this.anInt5021];
		this.anIntArray384 = new int[this.anInt5021];
		this.anIntArrayArray35 = new int[this.anInt5021][];
		for (@Pc(36) int local36 = 0; local36 < this.anInt5021; local36++) {
			this.anIntArray384[local36] = local9.method4548();
		}
		for (@Pc(51) int local51 = 0; local51 < this.anInt5021; local51++) {
			this.aBooleanArray19[local51] = local9.method4548() == 1;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt5021; local73++) {
			this.anIntArray385[local73] = local9.method4498();
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt5021; local92++) {
			this.anIntArrayArray35[local92] = new int[local9.method4548()];
		}
		for (@Pc(112) int local112 = 0; local112 < this.anInt5021; local112++) {
			for (@Pc(115) int local115 = 0; local115 < this.anIntArrayArray35[local112].length; local115++) {
				this.anIntArrayArray35[local112][local115] = local9.method4548();
			}
		}
	}
}
