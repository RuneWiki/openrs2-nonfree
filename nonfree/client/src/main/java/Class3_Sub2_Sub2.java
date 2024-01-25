import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
	private int anInt471 = 5;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
	private int anInt470 = 2;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	private int anInt475 = 0;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	private int anInt479 = 1;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
	private int anInt474 = 2048;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
	private int anInt478 = 5;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "[S")
	private short[] aShortArray5 = new short[512];

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "[B")
	private byte[] aByteArray5 = new byte[512];

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	private void method453() {
		@Pc(16) Random local16 = new Random((long) this.anInt475);
		this.aShortArray5 = new short[512];
		if (this.anInt474 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray5[local25] = (short) Static512.method7419(this.anInt474, local16);
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		this.aByteArray5 = Static140.method2400(this.anInt475);
		this.method453();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(29) int local29 = Static376.anIntArray665[arg0] * this.anInt471 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static201.anInt3738; local39++) {
				Static181.anInt3446 = Integer.MAX_VALUE;
				Static190.anInt3577 = Integer.MAX_VALUE;
				Static134.anInt2814 = Integer.MAX_VALUE;
				Static378.anInt6844 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt478 * Static57.anIntArray536[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(151) int local151;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(95) int local95 = this.aByteArray5[(this.anInt471 > local70 ? local70 : local70 - this.anInt471) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local62 - 1; local99 <= local66; local99++) {
						@Pc(124) int local124 = (this.aByteArray5[(local99 >= this.anInt478 ? local99 - this.anInt478 : local99) + local95 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local124 + 1;
						@Pc(136) int local136 = local58 - this.aShortArray5[local124] - (local99 << 12);
						@Pc(148) int local148 = local29 - this.aShortArray5[local129] - (local70 << 12);
						local151 = this.anInt479;
						@Pc(182) int local182;
						if (local151 == 1) {
							local182 = local148 * local148 + local136 * local136 >> 12;
						} else if (local151 == 3) {
							local136 = local136 >= 0 ? local136 : -local136;
							local148 = local148 < 0 ? -local148 : local148;
							local182 = local148 >= local136 ? local148 : local136;
						} else if (local151 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 < 0 ? -local136 : local136) / 4096.0F)) * 4096.0D);
							local148 = (int) (Math.sqrt((double) ((float) (local148 >= 0 ? local148 : -local148) / 4096.0F)) * 4096.0D);
							local182 = local136 + local148;
							local182 = local182 * local182 >> 12;
						} else if (local151 == 5) {
							local136 *= local136;
							local148 *= local148;
							local182 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local148 + local136) / 1.6777216E7F))) * 4096.0D);
						} else if (local151 == 2) {
							local182 = (local136 >= 0 ? local136 : -local136) + (local148 < 0 ? -local148 : local148);
						} else {
							local182 = (int) (Math.sqrt((double) ((float) (local136 * local136 + local148 * local148) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static378.anInt6844 > local182) {
							Static181.anInt3446 = Static190.anInt3577;
							Static190.anInt3577 = Static134.anInt2814;
							Static134.anInt2814 = Static378.anInt6844;
							Static378.anInt6844 = local182;
						} else if (Static134.anInt2814 > local182) {
							Static181.anInt3446 = Static190.anInt3577;
							Static190.anInt3577 = Static134.anInt2814;
							Static134.anInt2814 = local182;
						} else if (Static190.anInt3577 > local182) {
							Static181.anInt3446 = Static190.anInt3577;
							Static190.anInt3577 = local182;
						} else if (local182 < Static181.anInt3446) {
							Static181.anInt3446 = local182;
						}
					}
				}
				local151 = this.anInt470;
				if (local151 == 0) {
					local16[local39] = Static378.anInt6844;
				} else if (local151 == 1) {
					local16[local39] = Static134.anInt2814;
				} else if (local151 == 3) {
					local16[local39] = Static190.anInt3577;
				} else if (local151 == 4) {
					local16[local39] = Static181.anInt3446;
				} else if (local151 == 2) {
					local16[local39] = Static134.anInt2814 - Static378.anInt6844;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt478 = this.anInt471 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt475 = arg0.method5633();
		} else if (arg1 == 2) {
			this.anInt474 = arg0.method5610();
		} else if (arg1 == 3) {
			this.anInt470 = arg0.method5633();
		} else if (arg1 == 4) {
			this.anInt479 = arg0.method5633();
		} else if (arg1 == 5) {
			this.anInt478 = arg0.method5633();
		} else if (arg1 == 6) {
			this.anInt471 = arg0.method5633();
		}
	}
}
