import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class2_Sub2_Sub39 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wt", name = "N", descriptor = "I")
	private int anInt7424 = 2;

	@OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
	private int anInt7422 = 5;

	@OriginalMember(owner = "client!wt", name = "I", descriptor = "[B")
	private byte[] aByteArray137 = new byte[512];

	@OriginalMember(owner = "client!wt", name = "Q", descriptor = "[S")
	private short[] aShortArray115 = new short[512];

	@OriginalMember(owner = "client!wt", name = "T", descriptor = "I")
	private int anInt7429 = 5;

	@OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
	private int anInt7419 = 2048;

	@OriginalMember(owner = "client!wt", name = "P", descriptor = "I")
	private int anInt7426 = 0;

	@OriginalMember(owner = "client!wt", name = "O", descriptor = "I")
	private int anInt7425 = 1;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(31) int local31 = this.anInt7429 * Static318.anIntArray565[arg0] + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static429.anInt6518; local41++) {
				Static283.anInt1548 = Integer.MAX_VALUE;
				Static24.anInt5067 = Integer.MAX_VALUE;
				Static97.anInt2361 = Integer.MAX_VALUE;
				Static11.anInt288 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static365.anIntArray535[local41] * this.anInt7422 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(160) int local160;
				for (@Pc(72) int local72 = local35 - 1; local72 <= local39; local72++) {
					@Pc(97) int local97 = this.aByteArray137[(this.anInt7429 > local72 ? local72 : local72 - this.anInt7429) & 0xFF] & 0xFF;
					for (@Pc(101) int local101 = local64 - 1; local101 <= local68; local101++) {
						@Pc(130) int local130 = (this.aByteArray137[(local101 >= this.anInt7422 ? local101 - this.anInt7422 : local101) + local97 & 0xFF] & 0xFF) * 2;
						@Pc(134) int local134 = -(local101 << 12);
						@Pc(138) int local138 = local130 + 1;
						@Pc(144) int local144 = local134 + local60 - this.aShortArray115[local130];
						@Pc(157) int local157 = local31 - this.aShortArray115[local138] - (local72 << 12);
						local160 = this.anInt7425;
						@Pc(191) int local191;
						if (local160 == 1) {
							local191 = local144 * local144 + local157 * local157 >> 12;
						} else if (local160 == 3) {
							local144 = local144 < 0 ? -local144 : local144;
							local157 = local157 < 0 ? -local157 : local157;
							local191 = local157 >= local144 ? local157 : local144;
						} else if (local160 == 4) {
							local144 = (int) (Math.sqrt((double) ((float) (local144 < 0 ? -local144 : local144) / 4096.0F)) * 4096.0D);
							local157 = (int) (Math.sqrt((double) ((float) (local157 >= 0 ? local157 : -local157) / 4096.0F)) * 4096.0D);
							local191 = local157 + local144;
							local191 = local191 * local191 >> 12;
						} else if (local160 == 5) {
							local144 *= local144;
							local157 *= local157;
							local191 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local144 + local157) / 1.6777216E7F))) * 4096.0D);
						} else if (local160 == 2) {
							local191 = (local157 >= 0 ? local157 : -local157) + (local144 >= 0 ? local144 : -local144);
						} else {
							local191 = (int) (Math.sqrt((double) ((float) (local144 * local144 + local157 * local157) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static11.anInt288 > local191) {
							Static283.anInt1548 = Static24.anInt5067;
							Static24.anInt5067 = Static97.anInt2361;
							Static97.anInt2361 = Static11.anInt288;
							Static11.anInt288 = local191;
						} else if (local191 < Static97.anInt2361) {
							Static283.anInt1548 = Static24.anInt5067;
							Static24.anInt5067 = Static97.anInt2361;
							Static97.anInt2361 = local191;
						} else if (local191 < Static24.anInt5067) {
							Static283.anInt1548 = Static24.anInt5067;
							Static24.anInt5067 = local191;
						} else if (local191 < Static283.anInt1548) {
							Static283.anInt1548 = local191;
						}
					}
				}
				local160 = this.anInt7424;
				if (local160 == 0) {
					local11[local41] = Static11.anInt288;
				} else if (local160 == 1) {
					local11[local41] = Static97.anInt2361;
				} else if (local160 == 3) {
					local11[local41] = Static24.anInt5067;
				} else if (local160 == 4) {
					local11[local41] = Static283.anInt1548;
				} else if (local160 == 2) {
					local11[local41] = Static97.anInt2361 - Static11.anInt288;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7422 = this.anInt7429 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt7426 = arg0.method5495();
		} else if (arg1 == 2) {
			this.anInt7419 = arg0.method5500();
		} else if (arg1 == 3) {
			this.anInt7424 = arg0.method5495();
		} else if (arg1 == 4) {
			this.anInt7425 = arg0.method5495();
		} else if (arg1 == 5) {
			this.anInt7422 = arg0.method5495();
		} else if (arg1 == 6) {
			this.anInt7429 = arg0.method5495();
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		this.aByteArray137 = Static390.method5183(this.anInt7426);
		this.method5852();
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)V")
	private void method5852() {
		@Pc(12) Random local12 = new Random((long) this.anInt7426);
		this.aShortArray115 = new short[512];
		if (this.anInt7419 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray115[local24] = (short) Static149.method2451(this.anInt7419, local12);
			}
		}
	}
}
