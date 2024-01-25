import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class6_Sub3_Sub10 extends Class6_Sub3 {

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	private int anInt1984 = 4096;

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
	private int anInt1989 = 4096;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
	private int anInt1990 = 4096;

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
	private int anInt1991 = 409;

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "[I")
	private final int[] anIntArray172 = new int[3];

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt1991 = arg1.method6044();
		} else if (arg0 == 1) {
			this.anInt1984 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt1990 = arg1.method6044();
		} else if (arg0 == 3) {
			this.anInt1989 = arg1.method6044();
		} else if (arg0 == 4) {
			@Pc(60) int local60 = arg1.method6037();
			this.anIntArray172[1] = local60 >> 4 & 0xFF0;
			this.anIntArray172[2] = local60 >> 12 & 0x0;
			this.anIntArray172[0] = (local60 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(26) int[][] local26 = this.method7961(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static35.anInt670; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray172[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt1991 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(104) int local104 = local34[local52];
					local66 = local104 - this.anIntArray172[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt1991) {
						local42[local52] = local58;
						local46[local52] = local104;
						local50[local52] = local38[local52];
					} else {
						@Pc(148) int local148 = local38[local52];
						local66 = local148 - this.anIntArray172[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt1991) {
							local42[local52] = local58;
							local46[local52] = local104;
							local50[local52] = local148;
						} else {
							local42[local52] = local58 * this.anInt1989 >> 12;
							local46[local52] = local104 * this.anInt1990 >> 12;
							local50[local52] = this.anInt1984 * local148 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
