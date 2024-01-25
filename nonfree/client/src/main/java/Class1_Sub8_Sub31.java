import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class1_Sub8_Sub31 extends Class1_Sub8 {

	@OriginalMember(owner = "client!rk", name = "G", descriptor = "[B")
	private byte[] aByteArray79 = new byte[512];

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
	private int anInt6507 = 0;

	@OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
	private int anInt6505 = 2048;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
	private int anInt6508 = 1;

	@OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
	private int anInt6511 = 5;

	@OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
	private int anInt6509 = 2;

	@OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
	private int anInt6512 = 5;

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "[S")
	private short[] aShortArray117 = new short[512];

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
	private void method4971() {
		@Pc(16) Random local16 = new Random((long) this.anInt6507);
		this.aShortArray117 = new short[512];
		if (this.anInt6505 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray117[local25] = (short) Static70.method1340(local16, this.anInt6505);
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(32) int local32 = Static134.anIntArray308[arg0] * this.anInt6512 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static18.anInt439; local42++) {
				Static121.anInt7687 = Integer.MAX_VALUE;
				Static122.anInt2697 = Integer.MAX_VALUE;
				Static426.anInt1487 = Integer.MAX_VALUE;
				Static255.anInt4935 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt6511 * Static198.anIntArray749[local42] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(150) int local150;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(93) int local93 = this.aByteArray79[(this.anInt6512 > local73 ? local73 : local73 - this.anInt6512) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local65 - 1; local97 <= local69; local97++) {
						@Pc(122) int local122 = (this.aByteArray79[(this.anInt6511 <= local97 ? local97 - this.anInt6511 : local97) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(126) int local126 = local122 + 1;
						@Pc(136) int local136 = local61 - this.aShortArray117[local122] - (local97 << 12);
						@Pc(147) int local147 = local32 - (local73 << 12) - this.aShortArray117[local126];
						local150 = this.anInt6508;
						@Pc(187) int local187;
						if (local150 == 1) {
							local187 = local147 * local147 + local136 * local136 >> 12;
						} else if (local150 == 3) {
							local147 = local147 < 0 ? -local147 : local147;
							local136 = local136 < 0 ? -local136 : local136;
							local187 = local136 <= local147 ? local147 : local136;
						} else if (local150 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 >= 0 ? local136 : -local136) / 4096.0F)) * 4096.0D);
							local147 = (int) (Math.sqrt((double) ((float) (local147 < 0 ? -local147 : local147) / 4096.0F)) * 4096.0D);
							local187 = local136 + local147;
							local187 = local187 * local187 >> 12;
						} else if (local150 == 5) {
							local136 *= local136;
							local147 *= local147;
							local187 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local136 + local147) / 1.6777216E7F))) * 4096.0D);
						} else if (local150 == 2) {
							local187 = (local136 < 0 ? -local136 : local136) + (local147 < 0 ? -local147 : local147);
						} else {
							local187 = (int) (Math.sqrt((double) ((float) (local136 * local136 + local147 * local147) / 1.6777216E7F)) * 4096.0D);
						}
						if (local187 < Static255.anInt4935) {
							Static121.anInt7687 = Static122.anInt2697;
							Static122.anInt2697 = Static426.anInt1487;
							Static426.anInt1487 = Static255.anInt4935;
							Static255.anInt4935 = local187;
						} else if (local187 < Static426.anInt1487) {
							Static121.anInt7687 = Static122.anInt2697;
							Static122.anInt2697 = Static426.anInt1487;
							Static426.anInt1487 = local187;
						} else if (local187 < Static122.anInt2697) {
							Static121.anInt7687 = Static122.anInt2697;
							Static122.anInt2697 = local187;
						} else if (local187 < Static121.anInt7687) {
							Static121.anInt7687 = local187;
						}
					}
				}
				local150 = this.anInt6509;
				if (local150 == 0) {
					local19[local42] = Static255.anInt4935;
				} else if (local150 == 1) {
					local19[local42] = Static426.anInt1487;
				} else if (local150 == 3) {
					local19[local42] = Static122.anInt2697;
				} else if (local150 == 4) {
					local19[local42] = Static121.anInt7687;
				} else if (local150 == 2) {
					local19[local42] = Static426.anInt1487 - Static255.anInt4935;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		this.aByteArray79 = Static175.method2963(this.anInt6507);
		this.method4971();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6511 = this.anInt6512 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt6507 = arg1.method1171();
		} else if (arg0 == 2) {
			this.anInt6505 = arg1.method1177();
		} else if (arg0 == 3) {
			this.anInt6509 = arg1.method1171();
		} else if (arg0 == 4) {
			this.anInt6508 = arg1.method1171();
		} else if (arg0 == 5) {
			this.anInt6511 = arg1.method1171();
		} else if (arg0 == 6) {
			this.anInt6512 = arg1.method1171();
		}
	}
}
