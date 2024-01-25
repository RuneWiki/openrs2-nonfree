import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
	private int anInt4809 = 5;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
	private int anInt4808 = 2048;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	private int anInt4810 = 2;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
	private int anInt4814 = 0;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "[S")
	private short[] aShortArray88 = new short[512];

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
	private int anInt4816 = 5;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
	private int anInt4811 = 1;

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "[B")
	private byte[] aByteArray77 = new byte[512];

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4809 = this.anInt4816 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt4814 = arg1.method2132();
		} else if (arg0 == 2) {
			this.anInt4808 = arg1.method2161();
		} else if (arg0 == 3) {
			this.anInt4810 = arg1.method2132();
		} else if (arg0 == 4) {
			this.anInt4811 = arg1.method2132();
		} else if (arg0 == 5) {
			this.anInt4809 = arg1.method2132();
		} else if (arg0 == 6) {
			this.anInt4816 = arg1.method2132();
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
	private void method4403() {
		@Pc(16) Random local16 = new Random((long) this.anInt4814);
		this.aShortArray88 = new short[512];
		if (this.anInt4808 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray88[local28] = (short) Static297.method5193(local16, this.anInt4808);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(30) int local30 = Static60.anIntArray122[arg0] * this.anInt4816 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static85.anInt1910; local40++) {
				Static202.anInt4058 = Integer.MAX_VALUE;
				Static149.anInt3139 = Integer.MAX_VALUE;
				Static38.anInt947 = Integer.MAX_VALUE;
				Static237.anInt2679 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static273.anIntArray414[local40] * this.anInt4809 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(152) int local152;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(97) int local97 = this.aByteArray77[(local72 < this.anInt4816 ? local72 : local72 - this.anInt4816) & 0xFF] & 0xFF;
					for (@Pc(101) int local101 = local64 - 1; local101 <= local68; local101++) {
						@Pc(126) int local126 = (this.aByteArray77[local97 + (local101 < this.anInt4809 ? local101 : local101 - this.anInt4809) & 0xFF] & 0xFF) * 2;
						@Pc(130) int local130 = local101 << 12;
						@Pc(134) int local134 = local126 + 1;
						@Pc(138) int local138 = local60 - local130 - this.aShortArray88[local126];
						@Pc(149) int local149 = local30 - (local72 << 12) - this.aShortArray88[local134];
						local152 = this.anInt4811;
						@Pc(185) int local185;
						if (local152 == 1) {
							local185 = local138 * local138 + local149 * local149 >> 12;
						} else if (local152 == 3) {
							local149 = local149 < 0 ? -local149 : local149;
							local138 = local138 >= 0 ? local138 : -local138;
							local185 = local138 <= local149 ? local149 : local138;
						} else if (local152 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 < 0 ? -local138 : local138) / 4096.0F)) * 4096.0D);
							local149 = (int) (Math.sqrt((double) ((float) (local149 < 0 ? -local149 : local149) / 4096.0F)) * 4096.0D);
							local185 = local149 + local138;
							local185 = local185 * local185 >> 12;
						} else if (local152 == 5) {
							local149 *= local149;
							local138 *= local138;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local149) / 1.6777216E7F))) * 4096.0D);
						} else if (local152 == 2) {
							local185 = (local149 < 0 ? -local149 : local149) + (local138 < 0 ? -local138 : local138);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local149 * local149 + local138 * local138) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static237.anInt2679 > local185) {
							Static202.anInt4058 = Static149.anInt3139;
							Static149.anInt3139 = Static38.anInt947;
							Static38.anInt947 = Static237.anInt2679;
							Static237.anInt2679 = local185;
						} else if (local185 < Static38.anInt947) {
							Static202.anInt4058 = Static149.anInt3139;
							Static149.anInt3139 = Static38.anInt947;
							Static38.anInt947 = local185;
						} else if (Static149.anInt3139 > local185) {
							Static202.anInt4058 = Static149.anInt3139;
							Static149.anInt3139 = local185;
						} else if (local185 < Static202.anInt4058) {
							Static202.anInt4058 = local185;
						}
					}
				}
				local152 = this.anInt4810;
				if (local152 == 0) {
					local17[local40] = Static237.anInt2679;
				} else if (local152 == 1) {
					local17[local40] = Static38.anInt947;
				} else if (local152 == 3) {
					local17[local40] = Static149.anInt3139;
				} else if (local152 == 4) {
					local17[local40] = Static202.anInt4058;
				} else if (local152 == 2) {
					local17[local40] = Static38.anInt947 - Static237.anInt2679;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		this.aByteArray77 = Static159.method2992(this.anInt4814);
		this.method4403();
	}
}
