import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
	public int anInt6314;

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
	public int anInt6315;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray80;

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "[I")
	public int[] anIntArray571;

	@OriginalMember(owner = "client!wn", name = "A", descriptor = "[Z")
	public boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "[I")
	public int[] anIntArray570;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt6314 = arg0;
		@Pc(11) Class1_Sub14 local11 = new Class1_Sub14(arg1);
		this.anInt6315 = local11.method2199();
		this.anIntArrayArray80 = new int[this.anInt6315][];
		this.anIntArray571 = new int[this.anInt6315];
		this.aBooleanArray28 = new boolean[this.anInt6315];
		this.anIntArray570 = new int[this.anInt6315];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt6315; local38++) {
			this.anIntArray571[local38] = local11.method2199();
		}
		for (local38 = 0; local38 < this.anInt6315; local38++) {
			this.aBooleanArray28[local38] = local11.method2199() == 1;
		}
		for (local38 = 0; local38 < this.anInt6315; local38++) {
			this.anIntArray570[local38] = local11.method2244();
		}
		for (local38 = 0; local38 < this.anInt6315; local38++) {
			this.anIntArrayArray80[local38] = new int[local11.method2199()];
		}
		for (local38 = 0; local38 < this.anInt6315; local38++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray80[local38].length; local124++) {
				this.anIntArrayArray80[local38][local124] = local11.method2199();
			}
		}
	}
}
