import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qi", name = "S", descriptor = "[B")
	private byte[] aByteArray92 = new byte[512];

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
	private int anInt8864 = 2048;

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
	private int anInt8865 = 0;

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
	private int anInt8859 = 1;

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
	private int anInt8857 = 5;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "[S")
	private short[] aShortArray140 = new short[512];

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
	private int anInt8858 = 5;

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
	private int anInt8856 = 2;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt8857 = this.anInt8858 = arg1.method5322(-38);
		} else if (arg0 == 1) {
			this.anInt8865 = arg1.method5322(-76);
		} else if (arg0 == 2) {
			this.anInt8864 = arg1.method5272();
		} else if (arg0 == 3) {
			this.anInt8856 = arg1.method5322(-73);
		} else if (arg0 == 4) {
			this.anInt8859 = arg1.method5322(-51);
		} else if (arg0 == 5) {
			this.anInt8857 = arg1.method5322(-7);
		} else if (arg0 == 6) {
			this.anInt8858 = arg1.method5322(-16);
		}
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
	private void method7424() {
		@Pc(12) Random local12 = new Random((long) this.anInt8865);
		this.aShortArray140 = new short[512];
		if (this.anInt8864 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray140[local29] = (short) Static63.method794(this.anInt8864, local12);
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		this.aByteArray92 = Static523.method7449(this.anInt8865);
		this.method7424();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(32) int local32 = Static123.anIntArray113[arg0] * this.anInt8858 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static636.anInt10302; local42++) {
				Static412.anInt7312 = Integer.MAX_VALUE;
				Static398.anInt7125 = Integer.MAX_VALUE;
				Static508.anInt8655 = Integer.MAX_VALUE;
				Static248.anInt4606 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt8857 * Static508.anIntArray472[local42] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(158) int local158;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(96) int local96 = this.aByteArray92[(local73 < this.anInt8858 ? local73 : local73 - this.anInt8858) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local65 - 1; local100 <= local69; local100++) {
						@Pc(128) int local128 = (this.aByteArray92[local96 + (this.anInt8857 <= local100 ? local100 - this.anInt8857 : local100) & 0xFF] & 0xFF) * 2;
						@Pc(132) int local132 = -(local100 << 12);
						@Pc(136) int local136 = local128 + 1;
						@Pc(142) int local142 = local132 + local61 - this.aShortArray140[local128];
						@Pc(155) int local155 = local32 - (local73 << 12) - this.aShortArray140[local136];
						local158 = this.anInt8859;
						@Pc(202) int local202;
						if (local158 == 1) {
							local202 = local142 * local142 + local155 * local155 >> 12;
						} else if (local158 == 3) {
							local142 = local142 >= 0 ? local142 : -local142;
							local155 = local155 < 0 ? -local155 : local155;
							local202 = local155 >= local142 ? local155 : local142;
						} else if (local158 == 4) {
							local142 = (int) (Math.sqrt((double) ((float) (local142 < 0 ? -local142 : local142) / 4096.0F)) * 4096.0D);
							local155 = (int) (Math.sqrt((double) ((float) (local155 >= 0 ? local155 : -local155) / 4096.0F)) * 4096.0D);
							local202 = local155 + local142;
							local202 = local202 * local202 >> 12;
						} else if (local158 == 5) {
							local142 *= local142;
							local155 *= local155;
							local202 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local155 + local142) / 1.6777216E7F))) * 4096.0D);
						} else if (local158 == 2) {
							local202 = (local142 >= 0 ? local142 : -local142) + (local155 < 0 ? -local155 : local155);
						} else {
							local202 = (int) (Math.sqrt((double) ((float) (local142 * local142 + local155 * local155) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static248.anInt4606 > local202) {
							Static412.anInt7312 = Static398.anInt7125;
							Static398.anInt7125 = Static508.anInt8655;
							Static508.anInt8655 = Static248.anInt4606;
							Static248.anInt4606 = local202;
						} else if (local202 < Static508.anInt8655) {
							Static412.anInt7312 = Static398.anInt7125;
							Static398.anInt7125 = Static508.anInt8655;
							Static508.anInt8655 = local202;
						} else if (local202 < Static398.anInt7125) {
							Static412.anInt7312 = Static398.anInt7125;
							Static398.anInt7125 = local202;
						} else if (local202 < Static412.anInt7312) {
							Static412.anInt7312 = local202;
						}
					}
				}
				local158 = this.anInt8856;
				if (local158 == 0) {
					local19[local42] = Static248.anInt4606;
				} else if (local158 == 1) {
					local19[local42] = Static508.anInt8655;
				} else if (local158 == 3) {
					local19[local42] = Static398.anInt7125;
				} else if (local158 == 4) {
					local19[local42] = Static412.anInt7312;
				} else if (local158 == 2) {
					local19[local42] = Static508.anInt8655 - Static248.anInt4606;
				}
			}
		}
		return local19;
	}
}
