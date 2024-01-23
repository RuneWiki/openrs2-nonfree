import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class4_Sub1_Sub27 extends Class4_Sub1 {

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	private int anInt4245 = 4096;

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
	private int anInt4242 = 0;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(29) int[] local29 = this.method4538(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static68.anInt1753; local31++) {
				@Pc(42) int local42 = local29[local31];
				if (this.anInt4242 > local42) {
					local19[local31] = this.anInt4242;
				} else if (this.anInt4245 < local42) {
					local19[local31] = this.anInt4245;
				} else {
					local19[local31] = local42;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(30) int[][] local30 = this.method4549(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[2];
			@Pc(42) int[] local42 = local30[1];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static68.anInt1753; local56++) {
				@Pc(63) int local63 = local34[local56];
				@Pc(67) int local67 = local42[local56];
				@Pc(71) int local71 = local38[local56];
				if (local63 < this.anInt4242) {
					local46[local56] = this.anInt4242;
				} else if (this.anInt4245 < local63) {
					local46[local56] = this.anInt4245;
				} else {
					local46[local56] = local63;
				}
				if (local67 < this.anInt4242) {
					local50[local56] = this.anInt4242;
				} else if (local67 > this.anInt4245) {
					local50[local56] = this.anInt4245;
				} else {
					local50[local56] = local67;
				}
				if (local71 < this.anInt4242) {
					local54[local56] = this.anInt4242;
				} else if (local71 <= this.anInt4245) {
					local54[local56] = local71;
				} else {
					local54[local56] = this.anInt4245;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4242 = arg1.method3085();
		} else if (arg0 == 1) {
			this.anInt4245 = arg1.method3085();
		} else if (arg0 == 2) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}
}
