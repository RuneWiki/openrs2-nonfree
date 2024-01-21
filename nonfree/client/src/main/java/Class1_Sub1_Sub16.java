import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
	private int anInt1958 = 4096;

	@OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
	private int anInt1963 = 4096;

	@OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
	private int anInt1960 = 4096;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1960 = arg1.method1753();
		} else if (arg0 == 1) {
			this.anInt1958 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt1963 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(22) int[][] local22 = this.method3307(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local12[0];
			@Pc(38) int[] local38 = local22[1];
			@Pc(42) int[] local42 = local12[1];
			@Pc(46) int[] local46 = local12[2];
			for (@Pc(48) int local48 = 0; local48 < Static176.anInt3921; local48++) {
				@Pc(54) int local54 = local30[local48];
				@Pc(58) int local58 = local26[local48];
				@Pc(62) int local62 = local38[local48];
				if (local58 == local54 && local54 == local62) {
					local34[local48] = this.anInt1960 * local58 >> 12;
					local42[local48] = local54 * this.anInt1958 >> 12;
					local46[local48] = local62 * this.anInt1963 >> 12;
				} else {
					local34[local48] = this.anInt1960;
					local42[local48] = this.anInt1958;
					local46[local48] = this.anInt1963;
				}
			}
		}
		return local12;
	}
}
