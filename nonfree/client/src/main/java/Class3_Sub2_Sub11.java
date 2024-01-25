import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!in", name = "L", descriptor = "[B")
	private byte[] aByteArray50 = new byte[512];

	@OriginalMember(owner = "client!in", name = "I", descriptor = "I")
	private int anInt3477 = 1;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "I")
	private int anInt3483 = 5;

	@OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
	private int anInt3484 = 2;

	@OriginalMember(owner = "client!in", name = "U", descriptor = "[S")
	private short[] aShortArray49 = new short[512];

	@OriginalMember(owner = "client!in", name = "Y", descriptor = "I")
	private int anInt3490 = 2048;

	@OriginalMember(owner = "client!in", name = "X", descriptor = "I")
	private int anInt3489 = 0;

	@OriginalMember(owner = "client!in", name = "W", descriptor = "I")
	private int anInt3488 = 5;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(28) int local28 = this.anInt3483 * Static441.anIntArray522[arg0] + 2048;
			@Pc(32) int local32 = local28 >> 12;
			@Pc(36) int local36 = local32 + 1;
			for (@Pc(38) int local38 = 0; local38 < Static406.anInt6694; local38++) {
				Static156.anInt3155 = Integer.MAX_VALUE;
				Static342.anInt5805 = Integer.MAX_VALUE;
				Static78.anInt1945 = Integer.MAX_VALUE;
				Static224.anInt4194 = Integer.MAX_VALUE;
				@Pc(57) int local57 = this.anInt3488 * Static86.anIntArray125[local38] + 2048;
				@Pc(61) int local61 = local57 >> 12;
				@Pc(65) int local65 = local61 + 1;
				@Pc(147) int local147;
				for (@Pc(69) int local69 = local32 - 1; local69 <= local36; local69++) {
					@Pc(90) int local90 = this.aByteArray50[(this.anInt3483 <= local69 ? local69 - this.anInt3483 : local69) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local61 - 1; local94 <= local65; local94++) {
						@Pc(119) int local119 = (this.aByteArray50[local90 + (local94 < this.anInt3488 ? local94 : local94 - this.anInt3488) & 0xFF] & 0xFF) * 2;
						@Pc(123) int local123 = -(local94 << 12);
						@Pc(127) int local127 = local119 + 1;
						@Pc(132) int local132 = local123 + local57 - this.aShortArray49[local119];
						@Pc(144) int local144 = local28 - this.aShortArray49[local127] - (local69 << 12);
						local147 = this.anInt3477;
						@Pc(180) int local180;
						if (local147 == 1) {
							local180 = local144 * local144 + local132 * local132 >> 12;
						} else if (local147 == 3) {
							local132 = local132 < 0 ? -local132 : local132;
							local144 = local144 < 0 ? -local144 : local144;
							local180 = local132 <= local144 ? local144 : local132;
						} else if (local147 == 4) {
							local132 = (int) (Math.sqrt((double) ((float) (local132 >= 0 ? local132 : -local132) / 4096.0F)) * 4096.0D);
							local144 = (int) (Math.sqrt((double) ((float) (local144 < 0 ? -local144 : local144) / 4096.0F)) * 4096.0D);
							local180 = local144 + local132;
							local180 = local180 * local180 >> 12;
						} else if (local147 == 5) {
							local144 *= local144;
							local132 *= local132;
							local180 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local144 + local132) / 1.6777216E7F))) * 4096.0D);
						} else if (local147 == 2) {
							local180 = (local144 < 0 ? -local144 : local144) + (local132 >= 0 ? local132 : -local132);
						} else {
							local180 = (int) (Math.sqrt((double) ((float) (local132 * local132 + local144 * local144) / 1.6777216E7F)) * 4096.0D);
						}
						if (local180 < Static224.anInt4194) {
							Static156.anInt3155 = Static342.anInt5805;
							Static342.anInt5805 = Static78.anInt1945;
							Static78.anInt1945 = Static224.anInt4194;
							Static224.anInt4194 = local180;
						} else if (Static78.anInt1945 > local180) {
							Static156.anInt3155 = Static342.anInt5805;
							Static342.anInt5805 = Static78.anInt1945;
							Static78.anInt1945 = local180;
						} else if (Static342.anInt5805 > local180) {
							Static156.anInt3155 = Static342.anInt5805;
							Static342.anInt5805 = local180;
						} else if (local180 < Static156.anInt3155) {
							Static156.anInt3155 = local180;
						}
					}
				}
				local147 = this.anInt3484;
				if (local147 == 0) {
					local15[local38] = Static224.anInt4194;
				} else if (local147 == 1) {
					local15[local38] = Static78.anInt1945;
				} else if (local147 == 3) {
					local15[local38] = Static342.anInt5805;
				} else if (local147 == 4) {
					local15[local38] = Static156.anInt3155;
				} else if (local147 == 2) {
					local15[local38] = Static78.anInt1945 - Static224.anInt4194;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		this.aByteArray50 = Static436.method5722(this.anInt3489);
		this.method2792();
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "(I)V")
	private void method2792() {
		@Pc(16) Random local16 = new Random((long) this.anInt3489);
		this.aShortArray49 = new short[512];
		if (this.anInt3490 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray49[local25] = (short) Static180.method2865(local16, this.anInt3490);
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3488 = this.anInt3483 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt3489 = arg0.method2582();
		} else if (arg1 == 2) {
			this.anInt3490 = arg0.method2588();
		} else if (arg1 == 3) {
			this.anInt3484 = arg0.method2582();
		} else if (arg1 == 4) {
			this.anInt3477 = arg0.method2582();
		} else if (arg1 == 5) {
			this.anInt3488 = arg0.method2582();
		} else if (arg1 == 6) {
			this.anInt3483 = arg0.method2582();
		}
	}
}
