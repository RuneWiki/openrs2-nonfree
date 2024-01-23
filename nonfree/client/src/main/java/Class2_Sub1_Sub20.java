import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
	private int anInt2741 = 4096;

	@OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
	private int anInt2748 = 4096;

	@OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
	private int anInt2747 = 409;

	@OriginalMember(owner = "client!lh", name = "cb", descriptor = "[I")
	private int[] anIntArray300 = new int[3];

	@OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
	private int anInt2751 = 4096;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(17) int[][] local17 = this.method3205(0, arg0);
			@Pc(21) int[] local21 = local17[0];
			@Pc(25) int[] local25 = local17[1];
			@Pc(29) int[] local29 = local17[2];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[1];
			@Pc(41) int[] local41 = local7[2];
			for (@Pc(43) int local43 = 0; local43 < Static62.anInt1675; local43++) {
				@Pc(49) int local49 = local21[local43];
				@Pc(57) int local57 = local49 - this.anIntArray300[0];
				if (local57 < 0) {
					local57 = -local57;
				}
				if (local57 > this.anInt2747) {
					local33[local43] = local49;
					local37[local43] = local25[local43];
					local41[local43] = local29[local43];
				} else {
					@Pc(88) int local88 = local25[local43];
					local57 = local88 - this.anIntArray300[1];
					if (local57 < 0) {
						local57 = -local57;
					}
					if (this.anInt2747 < local57) {
						local33[local43] = local49;
						local37[local43] = local88;
						local41[local43] = local29[local43];
					} else {
						@Pc(125) int local125 = local29[local43];
						local57 = local125 - this.anIntArray300[2];
						if (local57 < 0) {
							local57 = -local57;
						}
						if (local57 > this.anInt2747) {
							local33[local43] = local49;
							local37[local43] = local88;
							local41[local43] = local125;
						} else {
							local33[local43] = this.anInt2751 * local49 >> 12;
							local37[local43] = local88 * this.anInt2748 >> 12;
							local41[local43] = this.anInt2741 * local125 >> 12;
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2747 = arg0.method163();
		} else if (arg1 == 1) {
			this.anInt2741 = arg0.method163();
		} else if (arg1 == 2) {
			this.anInt2748 = arg0.method163();
		} else if (arg1 == 3) {
			this.anInt2751 = arg0.method163();
		} else if (arg1 == 4) {
			@Pc(64) int local64 = arg0.method166();
			this.anIntArray300[0] = (local64 & 0xFF0000) << 4;
			this.anIntArray300[1] = local64 >> 4 & 0xFF0;
			this.anIntArray300[2] = local64 >> 12 & 0x0;
		}
	}
}
