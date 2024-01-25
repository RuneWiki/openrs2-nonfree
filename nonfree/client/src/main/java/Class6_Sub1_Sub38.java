import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class6_Sub1_Sub38 extends Class6_Sub1 {

	@OriginalMember(owner = "client!va", name = "G", descriptor = "I")
	private int anInt5994 = 409;

	@OriginalMember(owner = "client!va", name = "K", descriptor = "I")
	private int anInt5998 = 4096;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "[I")
	private final int[] anIntArray686 = new int[3];

	@OriginalMember(owner = "client!va", name = "P", descriptor = "I")
	private int anInt6002 = 4096;

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
	private int anInt6003 = 4096;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(26) int[][] local26 = this.method5618(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static299.anInt5659; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray686[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt5994 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(104) int local104 = local34[local52];
					local66 = local104 - this.anIntArray686[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt5994) {
						local42[local52] = local58;
						local46[local52] = local104;
						local50[local52] = local38[local52];
					} else {
						@Pc(145) int local145 = local38[local52];
						local66 = local145 - this.anIntArray686[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt5994) {
							local42[local52] = local58;
							local46[local52] = local104;
							local50[local52] = local145;
						} else {
							local42[local52] = this.anInt6002 * local58 >> 12;
							local46[local52] = local104 * this.anInt6003 >> 12;
							local50[local52] = this.anInt5998 * local145 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5994 = arg0.method4021();
		} else if (arg1 == 1) {
			this.anInt5998 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt6003 = arg0.method4021();
		} else if (arg1 == 3) {
			this.anInt6002 = arg0.method4021();
		} else if (arg1 == 4) {
			@Pc(60) int local60 = arg0.method3996();
			this.anIntArray686[0] = (local60 & 0xFF0000) << 4;
			this.anIntArray686[1] = local60 >> 4 & 0xFF0;
			this.anIntArray686[2] = local60 >> 12 & 0x0;
		}
	}
}
