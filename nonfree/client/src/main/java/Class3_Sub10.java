import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
	public final int anInt1421;

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
	public final int anInt1418;

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "[I")
	public final int[] anIntArray79;

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "[I")
	public final int[] anIntArray80;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1421 = arg0;
		@Pc(11) Class3_Sub4 local11 = new Class3_Sub4(arg1);
		this.anInt1418 = local11.method7954();
		this.aBooleanArray5 = new boolean[this.anInt1418];
		this.anIntArrayArray6 = new int[this.anInt1418][];
		this.anIntArray79 = new int[this.anInt1418];
		this.anIntArray80 = new int[this.anInt1418];
		for (@Pc(38) int local38 = 0; local38 < this.anInt1418; local38++) {
			this.anIntArray80[local38] = local11.method7954();
			if (this.anIntArray80[local38] == 6) {
				this.anIntArray80[local38] = 2;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt1418; local69++) {
			this.aBooleanArray5[local69] = local11.method7954() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt1418; local94++) {
			this.anIntArray79[local94] = local11.method7951();
		}
		for (@Pc(114) int local114 = 0; local114 < this.anInt1418; local114++) {
			this.anIntArrayArray6[local114] = new int[local11.method7954()];
		}
		for (@Pc(135) int local135 = 0; local135 < this.anInt1418; local135++) {
			for (@Pc(139) int local139 = 0; local139 < this.anIntArrayArray6[local135].length; local139++) {
				this.anIntArrayArray6[local135][local139] = local11.method7954();
			}
		}
	}
}
