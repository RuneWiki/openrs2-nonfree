import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class4_Sub4_Sub19 extends Class4_Sub4 {

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "[S")
	private short[] aShortArray83 = new short[512];

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	private int anInt4338 = 5;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
	private int anInt4337 = 0;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
	private int anInt4343 = 2;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "[B")
	private byte[] aByteArray58 = new byte[512];

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
	private int anInt4342 = 1;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
	private int anInt4346 = 2048;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	private int anInt4345 = 5;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		this.aByteArray58 = Static412.method5612(this.anInt4337);
		this.method3462();
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
	private void method3462() {
		@Pc(16) Random local16 = new Random((long) this.anInt4337);
		this.aShortArray83 = new short[512];
		if (this.anInt4346 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray83[local25] = (short) Static425.method5717(local16, this.anInt4346);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(32) int local32 = this.anInt4338 * Static334.anIntArray437[arg0] + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static419.anInt6404; local42++) {
				Static134.anInt2445 = Integer.MAX_VALUE;
				Static402.anInt6545 = Integer.MAX_VALUE;
				Static318.anInt5167 = Integer.MAX_VALUE;
				Static209.anInt3655 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt4345 * Static226.anIntArray284[local42] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(158) int local158;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(94) int local94 = this.aByteArray58[(local73 >= this.anInt4338 ? local73 - this.anInt4338 : local73) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local65 - 1; local98 <= local69; local98++) {
						@Pc(128) int local128 = (this.aByteArray58[local94 + (this.anInt4345 <= local98 ? local98 - this.anInt4345 : local98) & 0xFF] & 0xFF) * 2;
						@Pc(133) int local133 = -(local98 << 12);
						@Pc(137) int local137 = local128 + 1;
						@Pc(142) int local142 = local61 + local133 - this.aShortArray83[local128];
						@Pc(155) int local155 = local32 - (local73 << 12) - this.aShortArray83[local137];
						local158 = this.anInt4342;
						@Pc(191) int local191;
						if (local158 == 1) {
							local191 = local155 * local155 + local142 * local142 >> 12;
						} else if (local158 == 3) {
							local155 = local155 < 0 ? -local155 : local155;
							local142 = local142 < 0 ? -local142 : local142;
							local191 = local142 <= local155 ? local155 : local142;
						} else if (local158 == 4) {
							local142 = (int) (Math.sqrt((double) ((float) (local142 >= 0 ? local142 : -local142) / 4096.0F)) * 4096.0D);
							local155 = (int) (Math.sqrt((double) ((float) (local155 < 0 ? -local155 : local155) / 4096.0F)) * 4096.0D);
							local191 = local155 + local142;
							local191 = local191 * local191 >> 12;
						} else if (local158 == 5) {
							local142 *= local142;
							local155 *= local155;
							local191 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local142 + local155) / 1.6777216E7F))) * 4096.0D);
						} else if (local158 == 2) {
							local191 = (local155 >= 0 ? local155 : -local155) + (local142 >= 0 ? local142 : -local142);
						} else {
							local191 = (int) (Math.sqrt((double) ((float) (local155 * local155 + local142 * local142) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static209.anInt3655 > local191) {
							Static134.anInt2445 = Static402.anInt6545;
							Static402.anInt6545 = Static318.anInt5167;
							Static318.anInt5167 = Static209.anInt3655;
							Static209.anInt3655 = local191;
						} else if (Static318.anInt5167 > local191) {
							Static134.anInt2445 = Static402.anInt6545;
							Static402.anInt6545 = Static318.anInt5167;
							Static318.anInt5167 = local191;
						} else if (local191 < Static402.anInt6545) {
							Static134.anInt2445 = Static402.anInt6545;
							Static402.anInt6545 = local191;
						} else if (Static134.anInt2445 > local191) {
							Static134.anInt2445 = local191;
						}
					}
				}
				local158 = this.anInt4343;
				if (local158 == 0) {
					local19[local42] = Static209.anInt3655;
				} else if (local158 == 1) {
					local19[local42] = Static318.anInt5167;
				} else if (local158 == 3) {
					local19[local42] = Static402.anInt6545;
				} else if (local158 == 4) {
					local19[local42] = Static134.anInt2445;
				} else if (local158 == 2) {
					local19[local42] = Static318.anInt5167 - Static209.anInt3655;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4345 = this.anInt4338 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt4337 = arg1.method5007();
		} else if (arg0 == 2) {
			this.anInt4346 = arg1.method5028();
		} else if (arg0 == 3) {
			this.anInt4343 = arg1.method5007();
		} else if (arg0 == 4) {
			this.anInt4342 = arg1.method5007();
		} else if (arg0 == 5) {
			this.anInt4345 = arg1.method5007();
		} else if (arg0 == 6) {
			this.anInt4338 = arg1.method5007();
		}
	}
}
