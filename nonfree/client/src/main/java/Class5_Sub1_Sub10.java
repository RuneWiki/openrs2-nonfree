import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class5_Sub1_Sub10 extends Class5_Sub1 {

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
	private int anInt1657 = 4096;

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "[I")
	private final int[] anIntArray75 = new int[3];

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
	private int anInt1665 = 4096;

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
	private int anInt1659 = 4096;

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
	private int anInt1663 = 409;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(26) int[][] local26 = this.method5764(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static148.anInt2666; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray75[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt1663) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(101) int local101 = local34[local52];
					local66 = local101 - this.anIntArray75[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt1663 < local66) {
						local42[local52] = local58;
						local46[local52] = local101;
						local50[local52] = local38[local52];
					} else {
						@Pc(138) int local138 = local38[local52];
						local66 = local138 - this.anIntArray75[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt1663) {
							local42[local52] = local58;
							local46[local52] = local101;
							local50[local52] = local138;
						} else {
							local42[local52] = local58 * this.anInt1659 >> 12;
							local46[local52] = this.anInt1657 * local101 >> 12;
							local50[local52] = this.anInt1665 * local138 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt1663 = arg1.method5598();
		} else if (arg0 == 1) {
			this.anInt1665 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt1657 = arg1.method5598();
		} else if (arg0 == 3) {
			this.anInt1659 = arg1.method5598();
		} else if (arg0 == 4) {
			@Pc(60) int local60 = arg1.method5541();
			this.anIntArray75[2] = local60 >> 12 & 0x0;
			this.anIntArray75[1] = local60 >> 4 & 0xFF0;
			this.anIntArray75[0] = (local60 & 0xFF0000) << 4;
		}
	}
}
