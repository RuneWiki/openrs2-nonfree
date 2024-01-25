import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
	private int anInt458 = 5;

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "[S")
	private short[] aShortArray3 = new short[512];

	@OriginalMember(owner = "client!aw", name = "W", descriptor = "I")
	private int anInt464 = 1;

	@OriginalMember(owner = "client!aw", name = "V", descriptor = "I")
	private int anInt463 = 0;

	@OriginalMember(owner = "client!aw", name = "U", descriptor = "I")
	private int anInt462 = 2;

	@OriginalMember(owner = "client!aw", name = "R", descriptor = "[B")
	private byte[] aByteArray14 = new byte[512];

	@OriginalMember(owner = "client!aw", name = "Q", descriptor = "I")
	private int anInt460 = 5;

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
	private int anInt457 = 2048;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt458 = this.anInt460 = arg1.method3737();
		} else if (arg0 == 1) {
			this.anInt463 = arg1.method3737();
		} else if (arg0 == 2) {
			this.anInt457 = arg1.method3711();
		} else if (arg0 == 3) {
			this.anInt462 = arg1.method3737();
		} else if (arg0 == 4) {
			this.anInt464 = arg1.method3737();
		} else if (arg0 == 5) {
			this.anInt458 = arg1.method3737();
		} else if (arg0 == 6) {
			this.anInt460 = arg1.method3737();
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		this.aByteArray14 = Static28.method383(this.anInt463);
		this.method295();
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V")
	private void method295() {
		@Pc(12) Random local12 = new Random((long) this.anInt463);
		this.aShortArray3 = new short[512];
		if (this.anInt457 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray3[local32] = (short) Static159.method2512(this.anInt457, local12);
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(29) int local29 = this.anInt460 * Static373.anIntArray55[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static131.anInt2581; local39++) {
				Static33.anInt667 = Integer.MAX_VALUE;
				Static124.anInt2438 = Integer.MAX_VALUE;
				Static305.anInt1352 = Integer.MAX_VALUE;
				Static384.anInt6793 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt458 * Static252.anIntArray323[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(156) int local156;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(95) int local95 = this.aByteArray14[(local70 < this.anInt460 ? local70 : local70 - this.anInt460) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local62 - 1; local99 <= local66; local99++) {
						@Pc(128) int local128 = (this.aByteArray14[local95 + (local99 < this.anInt458 ? local99 : local99 - this.anInt458) & 0xFF] & 0xFF) * 2;
						@Pc(133) int local133 = local58 - (local99 << 12);
						@Pc(137) int local137 = local128 + 1;
						@Pc(140) int local140 = local133 - this.aShortArray3[local128];
						@Pc(153) int local153 = local29 - this.aShortArray3[local137] - (local70 << 12);
						local156 = this.anInt464;
						@Pc(189) int local189;
						if (local156 == 1) {
							local189 = local153 * local153 + local140 * local140 >> 12;
						} else if (local156 == 3) {
							local140 = local140 >= 0 ? local140 : -local140;
							local153 = local153 < 0 ? -local153 : local153;
							local189 = local153 >= local140 ? local153 : local140;
						} else if (local156 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 >= 0 ? local140 : -local140) / 4096.0F)) * 4096.0D);
							local153 = (int) (Math.sqrt((double) ((float) (local153 >= 0 ? local153 : -local153) / 4096.0F)) * 4096.0D);
							local189 = local140 + local153;
							local189 = local189 * local189 >> 12;
						} else if (local156 == 5) {
							local140 *= local140;
							local153 *= local153;
							local189 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local140 + local153) / 1.6777216E7F))) * 4096.0D);
						} else if (local156 == 2) {
							local189 = (local153 >= 0 ? local153 : -local153) + (local140 >= 0 ? local140 : -local140);
						} else {
							local189 = (int) (Math.sqrt((double) ((float) (local153 * local153 + local140 * local140) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static384.anInt6793 > local189) {
							Static33.anInt667 = Static124.anInt2438;
							Static124.anInt2438 = Static305.anInt1352;
							Static305.anInt1352 = Static384.anInt6793;
							Static384.anInt6793 = local189;
						} else if (Static305.anInt1352 > local189) {
							Static33.anInt667 = Static124.anInt2438;
							Static124.anInt2438 = Static305.anInt1352;
							Static305.anInt1352 = local189;
						} else if (local189 < Static124.anInt2438) {
							Static33.anInt667 = Static124.anInt2438;
							Static124.anInt2438 = local189;
						} else if (Static33.anInt667 > local189) {
							Static33.anInt667 = local189;
						}
					}
				}
				local156 = this.anInt462;
				if (local156 == 0) {
					local16[local39] = Static384.anInt6793;
				} else if (local156 == 1) {
					local16[local39] = Static305.anInt1352;
				} else if (local156 == 3) {
					local16[local39] = Static124.anInt2438;
				} else if (local156 == 4) {
					local16[local39] = Static33.anInt667;
				} else if (local156 == 2) {
					local16[local39] = Static305.anInt1352 - Static384.anInt6793;
				}
			}
		}
		return local16;
	}
}
