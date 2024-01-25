import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class5_Sub21 extends Class5 {

	@OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
	public final int anInt4010;

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
	public final int anInt4008;

	@OriginalMember(owner = "client!iia", name = "t", descriptor = "[I")
	public final int[] anIntArray340;

	@OriginalMember(owner = "client!iia", name = "l", descriptor = "[Z")
	public final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!iia", name = "v", descriptor = "[I")
	public final int[] anIntArray341;

	@OriginalMember(owner = "client!iia", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(I[B)V")
	public Class5_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt4010 = arg0;
		@Pc(11) Class5_Sub12 local11 = new Class5_Sub12(arg1);
		this.anInt4008 = local11.method8645();
		this.anIntArray340 = new int[this.anInt4008];
		this.aBooleanArray25 = new boolean[this.anInt4008];
		this.anIntArray341 = new int[this.anInt4008];
		this.anIntArrayArray19 = new int[this.anInt4008][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt4008; local38++) {
			this.anIntArray341[local38] = local11.method8645();
			if (this.anIntArray341[local38] == 6) {
				this.anIntArray341[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt4008; local71++) {
			this.aBooleanArray25[local71] = local11.method8645() == 1;
		}
		for (@Pc(94) int local94 = 0; local94 < this.anInt4008; local94++) {
			this.anIntArray340[local94] = local11.method8631();
		}
		for (@Pc(110) int local110 = 0; local110 < this.anInt4008; local110++) {
			this.anIntArrayArray19[local110] = new int[local11.method8645()];
		}
		for (@Pc(127) int local127 = 0; local127 < this.anInt4008; local127++) {
			for (@Pc(131) int local131 = 0; local131 < this.anIntArrayArray19[local127].length; local131++) {
				this.anIntArrayArray19[local127][local131] = local11.method8645();
			}
		}
	}
}
