import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class4_Sub2_Sub27 extends Class4_Sub2 {

	@OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
	private int anInt8790 = 5;

	@OriginalMember(owner = "client!rm", name = "J", descriptor = "[B")
	private byte[] aByteArray84 = new byte[512];

	@OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
	private int anInt8793 = 0;

	@OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
	private int anInt8795 = 2048;

	@OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
	private int anInt8794 = 5;

	@OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
	private int anInt8792 = 1;

	@OriginalMember(owner = "client!rm", name = "S", descriptor = "I")
	private int anInt8798 = 2;

	@OriginalMember(owner = "client!rm", name = "T", descriptor = "[S")
	private short[] aShortArray123 = new short[512];

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V")
	private void method6763() {
		@Pc(12) Random local12 = new Random((long) this.anInt8793);
		this.aShortArray123 = new short[512];
		if (this.anInt8795 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray123[local30] = (short) Static319.method4997(local12, this.anInt8795);
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(24) int local24 = this.anInt8790 * Static217.anIntArray501[arg0] + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static417.anInt5248; local34++) {
				Static389.anInt9604 = Integer.MAX_VALUE;
				Static402.anInt7840 = Integer.MAX_VALUE;
				Static321.anInt6363 = Integer.MAX_VALUE;
				Static488.anInt9252 = Integer.MAX_VALUE;
				@Pc(54) int local54 = this.anInt8794 * Static579.anIntArray585[local34] + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(145) int local145;
				for (@Pc(66) int local66 = local28 - 1; local66 <= local32; local66++) {
					@Pc(87) int local87 = this.aByteArray84[(local66 < this.anInt8790 ? local66 : local66 - this.anInt8790) & 0xFF] & 0xFF;
					for (@Pc(91) int local91 = local58 - 1; local91 <= local62; local91++) {
						@Pc(116) int local116 = (this.aByteArray84[(this.anInt8794 > local91 ? local91 : local91 - this.anInt8794) + local87 & 0xFF] & 0xFF) * 2;
						@Pc(120) int local120 = -(local91 << 12);
						@Pc(124) int local124 = local116 + 1;
						@Pc(130) int local130 = local120 + local54 - this.aShortArray123[local116];
						@Pc(142) int local142 = local24 - this.aShortArray123[local124] - (local66 << 12);
						local145 = this.anInt8792;
						@Pc(174) int local174;
						if (local145 == 1) {
							local174 = local130 * local130 + local142 * local142 >> 12;
						} else if (local145 == 3) {
							local130 = local130 >= 0 ? local130 : -local130;
							local142 = local142 >= 0 ? local142 : -local142;
							local174 = local130 <= local142 ? local142 : local130;
						} else if (local145 == 4) {
							local130 = (int) (Math.sqrt((double) ((float) (local130 < 0 ? -local130 : local130) / 4096.0F)) * 4096.0D);
							local142 = (int) (Math.sqrt((double) ((float) (local142 >= 0 ? local142 : -local142) / 4096.0F)) * 4096.0D);
							local174 = local130 + local142;
							local174 = local174 * local174 >> 12;
						} else if (local145 == 5) {
							local142 *= local142;
							local130 *= local130;
							local174 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local142 + local130) / 1.6777216E7F))) * 4096.0D);
						} else if (local145 == 2) {
							local174 = (local142 < 0 ? -local142 : local142) + (local130 >= 0 ? local130 : -local130);
						} else {
							local174 = (int) (Math.sqrt((double) ((float) (local142 * local142 + local130 * local130) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static488.anInt9252 > local174) {
							Static389.anInt9604 = Static402.anInt7840;
							Static402.anInt7840 = Static321.anInt6363;
							Static321.anInt6363 = Static488.anInt9252;
							Static488.anInt9252 = local174;
						} else if (local174 < Static321.anInt6363) {
							Static389.anInt9604 = Static402.anInt7840;
							Static402.anInt7840 = Static321.anInt6363;
							Static321.anInt6363 = local174;
						} else if (Static402.anInt7840 > local174) {
							Static389.anInt9604 = Static402.anInt7840;
							Static402.anInt7840 = local174;
						} else if (Static389.anInt9604 > local174) {
							Static389.anInt9604 = local174;
						}
					}
				}
				local145 = this.anInt8798;
				if (local145 == 0) {
					local11[local34] = Static488.anInt9252;
				} else if (local145 == 1) {
					local11[local34] = Static321.anInt6363;
				} else if (local145 == 3) {
					local11[local34] = Static402.anInt7840;
				} else if (local145 == 4) {
					local11[local34] = Static389.anInt9604;
				} else if (local145 == 2) {
					local11[local34] = Static321.anInt6363 - Static488.anInt9252;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8794 = this.anInt8790 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt8793 = arg0.method7004();
		} else if (arg1 == 2) {
			this.anInt8795 = arg0.method7054();
		} else if (arg1 == 3) {
			this.anInt8798 = arg0.method7004();
		} else if (arg1 == 4) {
			this.anInt8792 = arg0.method7004();
		} else if (arg1 == 5) {
			this.anInt8794 = arg0.method7004();
		} else if (arg1 == 6) {
			this.anInt8790 = arg0.method7004();
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		this.aByteArray84 = Static401.method6112(this.anInt8793);
		this.method6763();
	}
}
