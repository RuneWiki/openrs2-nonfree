import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class5_Sub1_Sub14 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
	private int anInt1545 = 3216;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
	private int anInt1548 = 4096;

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "[I")
	private final int[] anIntArray141 = new int[3];

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
	private int anInt1554 = 3216;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(22) int local22 = this.anInt1548 * Static105.anInt2188 >> 12;
			@Pc(32) int[] local32 = this.method3196(Static3.anInt74 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method3196(arg0, 0);
			@Pc(48) int[] local48 = this.method3196(Static3.anInt74 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static174.anInt3489; local50++) {
				@Pc(72) int local72 = (local38[local50 - 1 & Static189.anInt3753] - local38[local50 + 1 & Static189.anInt3753]) * local22 >> 12;
				@Pc(84) int local84 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(88) int local88 = local72 >> 4;
				@Pc(92) int local92 = local84 >> 4;
				if (local88 < 0) {
					local88 = -local88;
				}
				if (local92 < 0) {
					local92 = -local92;
				}
				if (local88 > 255) {
					local88 = 255;
				}
				if (local92 > 255) {
					local92 = 255;
				}
				@Pc(132) int local132 = Class5_Sub1_Sub16.aByteArray24[(local92 * (local92 + 1) >> 1) + local88] & 0xFF;
				@Pc(138) int local138 = local132 * 4096 >> 8;
				@Pc(147) int local147 = local138 * this.anIntArray141[2] >> 12;
				@Pc(153) int local153 = local72 * local132 >> 8;
				@Pc(162) int local162 = local153 * this.anIntArray141[0] >> 12;
				@Pc(168) int local168 = local84 * local132 >> 8;
				@Pc(177) int local177 = local168 * this.anIntArray141[1] >> 12;
				local7[local50] = local147 + local177 + local162;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1548 = arg0.method3077();
		} else if (arg1 == 1) {
			this.anInt1554 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt1545 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	private void method1164() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1545 / 4096.0F));
		this.anIntArray141[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt1554 / 4096.0F)));
		this.anIntArray141[1] = (int) (local11 * Math.cos((double) ((float) this.anInt1554 / 4096.0F)) * 4096.0D);
		this.anIntArray141[2] = (int) (Math.sin((double) ((float) this.anInt1545 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray141[0] * this.anIntArray141[0] >> 12;
		@Pc(85) int local85 = this.anIntArray141[1] * this.anIntArray141[1] >> 12;
		@Pc(97) int local97 = this.anIntArray141[2] * this.anIntArray141[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local73 + local85 + local97 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray141[0] = (this.anIntArray141[0] << 12) / local110;
			this.anIntArray141[1] = (this.anIntArray141[1] << 12) / local110;
			this.anIntArray141[2] = (this.anIntArray141[2] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		this.method1164();
	}
}
