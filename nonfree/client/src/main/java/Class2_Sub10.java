import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
	public int anInt1508;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
	public int anInt1505;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "[I")
	public int[] anIntArray110;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "[Z")
	public boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1508 = arg0;
		@Pc(11) Class2_Sub26 local11 = new Class2_Sub26(arg1);
		this.anInt1505 = local11.method4261();
		this.anIntArray111 = new int[this.anInt1505];
		this.anIntArrayArray15 = new int[this.anInt1505][];
		this.anIntArray110 = new int[this.anInt1505];
		this.aBooleanArray5 = new boolean[this.anInt1505];
		@Pc(38) int local38;
		for (local38 = 0; local38 < this.anInt1505; local38++) {
			this.anIntArray111[local38] = local11.method4261();
		}
		for (local38 = 0; local38 < this.anInt1505; local38++) {
			this.aBooleanArray5[local38] = local11.method4261() == 1;
		}
		for (local38 = 0; local38 < this.anInt1505; local38++) {
			this.anIntArray110[local38] = local11.method4242();
		}
		for (local38 = 0; local38 < this.anInt1505; local38++) {
			this.anIntArrayArray15[local38] = new int[local11.method4261()];
		}
		for (local38 = 0; local38 < this.anInt1505; local38++) {
			for (@Pc(124) int local124 = 0; local124 < this.anIntArrayArray15[local38].length; local124++) {
				this.anIntArrayArray15[local38][local124] = local11.method4261();
			}
		}
	}
}
