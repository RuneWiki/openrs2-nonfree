import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
	public final int anInt4744;

	@OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
	public final int anInt4745;

	@OriginalMember(owner = "client!kaa", name = "j", descriptor = "[I")
	public final int[] anIntArray260;

	@OriginalMember(owner = "client!kaa", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "[I")
	public final int[] anIntArray261;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4744 = arg0;
		@Pc(11) Class1_Sub3 local11 = new Class1_Sub3(arg1);
		this.anInt4745 = local11.method7974();
		this.anIntArray260 = new int[this.anInt4745];
		this.aBooleanArray20 = new boolean[this.anInt4745];
		this.anIntArrayArray23 = new int[this.anInt4745][];
		this.anIntArray261 = new int[this.anInt4745];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4745; local38++) {
			this.anIntArray261[local38] = local11.method7974();
			if (this.anIntArray261[local38] == 6) {
				this.anIntArray261[local38] = 2;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < this.anInt4745; local67++) {
			this.aBooleanArray20[local67] = local11.method7974() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt4745; local94++) {
			this.anIntArray260[local94] = local11.method7945();
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt4745; local114++) {
			this.anIntArrayArray23[local114] = new int[local11.method7974()];
		}
		for (@Pc(131) int local131 = 0; local131 < this.anInt4745; local131++) {
			for (@Pc(135) int local135 = 0; local135 < this.anIntArrayArray23[local131].length; local135++) {
				this.anIntArrayArray23[local131][local135] = local11.method7974();
			}
		}
	}
}
