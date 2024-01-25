import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class3_Sub6_Sub16 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ifa", name = "G", descriptor = "[S")
	private short[] aShortArray55 = new short[512];

	@OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
	private int anInt3953 = 5;

	@OriginalMember(owner = "client!ifa", name = "L", descriptor = "I")
	private int anInt3960 = 0;

	@OriginalMember(owner = "client!ifa", name = "D", descriptor = "I")
	private int anInt3954 = 1;

	@OriginalMember(owner = "client!ifa", name = "H", descriptor = "I")
	private int anInt3957 = 2;

	@OriginalMember(owner = "client!ifa", name = "M", descriptor = "I")
	private int anInt3961 = 2048;

	@OriginalMember(owner = "client!ifa", name = "K", descriptor = "I")
	private int anInt3959 = 5;

	@OriginalMember(owner = "client!ifa", name = "I", descriptor = "[B")
	private byte[] aByteArray44 = new byte[512];

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(33) int local33 = this.anInt3953 * Static525.anIntArray553[arg0] + 2048;
			@Pc(37) int local37 = local33 >> 12;
			@Pc(41) int local41 = local37 + 1;
			for (@Pc(43) int local43 = 0; local43 < Static521.anInt8383; local43++) {
				Static438.anInt7309 = Integer.MAX_VALUE;
				Static5.anInt105 = Integer.MAX_VALUE;
				Static419.anInt7107 = Integer.MAX_VALUE;
				Static335.anInt5609 = Integer.MAX_VALUE;
				@Pc(62) int local62 = this.anInt3959 * Static73.anIntArray76[local43] + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(154) int local154;
				for (@Pc(74) int local74 = local37 - 1; local74 <= local41; local74++) {
					@Pc(95) int local95 = this.aByteArray44[(this.anInt3953 > local74 ? local74 : local74 - this.anInt3953) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local66 - 1; local99 <= local70; local99++) {
						@Pc(124) int local124 = (this.aByteArray44[(local99 < this.anInt3959 ? local99 : local99 - this.anInt3959) + local95 & 0xFF] & 0xFF) * 2;
						@Pc(128) int local128 = -(local99 << 12);
						@Pc(132) int local132 = local124 + 1;
						@Pc(138) int local138 = local128 + local62 - this.aShortArray55[local124];
						@Pc(151) int local151 = local33 - this.aShortArray55[local132] - (local74 << 12);
						local154 = this.anInt3954;
						@Pc(191) int local191;
						if (local154 == 1) {
							local191 = local151 * local151 + local138 * local138 >> 12;
						} else if (local154 == 3) {
							local138 = local138 < 0 ? -local138 : local138;
							local151 = local151 < 0 ? -local151 : local151;
							local191 = local138 <= local151 ? local151 : local138;
						} else if (local154 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 >= 0 ? local138 : -local138) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 < 0 ? -local151 : local151) / 4096.0F)) * 4096.0D);
							local191 = local151 + local138;
							local191 = local191 * local191 >> 12;
						} else if (local154 == 5) {
							local138 *= local138;
							local151 *= local151;
							local191 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local151 + local138) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local191 = (local151 >= 0 ? local151 : -local151) + (local138 < 0 ? -local138 : local138);
						} else {
							local191 = (int) (Math.sqrt((double) ((float) (local138 * local138 + local151 * local151) / 1.6777216E7F)) * 4096.0D);
						}
						if (local191 < Static335.anInt5609) {
							Static438.anInt7309 = Static5.anInt105;
							Static5.anInt105 = Static419.anInt7107;
							Static419.anInt7107 = Static335.anInt5609;
							Static335.anInt5609 = local191;
						} else if (local191 < Static419.anInt7107) {
							Static438.anInt7309 = Static5.anInt105;
							Static5.anInt105 = Static419.anInt7107;
							Static419.anInt7107 = local191;
						} else if (local191 < Static5.anInt105) {
							Static438.anInt7309 = Static5.anInt105;
							Static5.anInt105 = local191;
						} else if (local191 < Static438.anInt7309) {
							Static438.anInt7309 = local191;
						}
					}
				}
				local154 = this.anInt3957;
				if (local154 == 0) {
					local11[local43] = Static335.anInt5609;
				} else if (local154 == 1) {
					local11[local43] = Static419.anInt7107;
				} else if (local154 == 3) {
					local11[local43] = Static5.anInt105;
				} else if (local154 == 4) {
					local11[local43] = Static438.anInt7309;
				} else if (local154 == 2) {
					local11[local43] = Static419.anInt7107 - Static335.anInt5609;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		this.aByteArray44 = Static595.method7947(this.anInt3960);
		this.method3524();
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V")
	private void method3524() {
		@Pc(16) Random local16 = new Random((long) this.anInt3960);
		this.aShortArray55 = new short[512];
		if (this.anInt3961 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray55[local25] = (short) Static164.method2981(local16, this.anInt3961);
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3959 = this.anInt3953 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt3960 = arg0.method5175();
		} else if (arg1 == 2) {
			this.anInt3961 = arg0.method5198();
		} else if (arg1 == 3) {
			this.anInt3957 = arg0.method5175();
		} else if (arg1 == 4) {
			this.anInt3954 = arg0.method5175();
		} else if (arg1 == 5) {
			this.anInt3959 = arg0.method5175();
		} else if (arg1 == 6) {
			this.anInt3953 = arg0.method5175();
		}
	}
}
