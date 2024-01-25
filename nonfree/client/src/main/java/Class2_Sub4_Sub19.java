import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class2_Sub4_Sub19 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
	private int anInt3541 = 1;

	@OriginalMember(owner = "client!ku", name = "V", descriptor = "I")
	private int anInt3545 = 0;

	@OriginalMember(owner = "client!ku", name = "bb", descriptor = "[B")
	private byte[] aByteArray65 = new byte[512];

	@OriginalMember(owner = "client!ku", name = "U", descriptor = "I")
	private int anInt3544 = 5;

	@OriginalMember(owner = "client!ku", name = "cb", descriptor = "I")
	private int anInt3549 = 2048;

	@OriginalMember(owner = "client!ku", name = "db", descriptor = "[S")
	private short[] aShortArray64 = new short[512];

	@OriginalMember(owner = "client!ku", name = "gb", descriptor = "I")
	private int anInt3552 = 5;

	@OriginalMember(owner = "client!ku", name = "Z", descriptor = "I")
	private int anInt3547 = 2;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3552 = this.anInt3544 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt3545 = arg0.method5350();
		} else if (arg1 == 2) {
			this.anInt3549 = arg0.method5312();
		} else if (arg1 == 3) {
			this.anInt3547 = arg0.method5350();
		} else if (arg1 == 4) {
			this.anInt3541 = arg0.method5350();
		} else if (arg1 == 5) {
			this.anInt3552 = arg0.method5350();
		} else if (arg1 == 6) {
			this.anInt3544 = arg0.method5350();
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
	private void method3242() {
		@Pc(12) Random local12 = new Random((long) this.anInt3545);
		this.aShortArray64 = new short[512];
		if (this.anInt3549 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray64[local28] = (short) Static331.method4885(local12, this.anInt3549);
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(29) int local29 = Static347.anIntArray1193[arg0] * this.anInt3544 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static76.anInt1458; local39++) {
				Static113.anInt2427 = Integer.MAX_VALUE;
				Static235.anInt4181 = Integer.MAX_VALUE;
				Static344.anInt4791 = Integer.MAX_VALUE;
				Static350.anInt3741 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static40.anIntArray173[local39] * this.anInt3552 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(154) int local154;
				for (@Pc(71) int local71 = local33 - 1; local71 <= local37; local71++) {
					@Pc(92) int local92 = this.aByteArray65[(local71 >= this.anInt3544 ? local71 - this.anInt3544 : local71) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(125) int local125 = (this.aByteArray65[(local96 < this.anInt3552 ? local96 : local96 - this.anInt3552) + local92 & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = local59 - (local96 << 12);
						@Pc(135) int local135 = local125 + 1;
						@Pc(139) int local139 = local131 - this.aShortArray64[local125];
						@Pc(151) int local151 = local29 - this.aShortArray64[local135] - (local71 << 12);
						local154 = this.anInt3541;
						@Pc(185) int local185;
						if (local154 == 1) {
							local185 = local139 * local139 + local151 * local151 >> 12;
						} else if (local154 == 3) {
							local151 = local151 >= 0 ? local151 : -local151;
							local139 = local139 < 0 ? -local139 : local139;
							local185 = local139 <= local151 ? local151 : local139;
						} else if (local154 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 < 0 ? -local139 : local139) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 >= 0 ? local151 : -local151) / 4096.0F)) * 4096.0D);
							local185 = local139 + local151;
							local185 = local185 * local185 >> 12;
						} else if (local154 == 5) {
							local151 *= local151;
							local139 *= local139;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local151 + local139) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local185 = (local151 < 0 ? -local151 : local151) + (local139 >= 0 ? local139 : -local139);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local151 * local151 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static350.anInt3741 > local185) {
							Static113.anInt2427 = Static235.anInt4181;
							Static235.anInt4181 = Static344.anInt4791;
							Static344.anInt4791 = Static350.anInt3741;
							Static350.anInt3741 = local185;
						} else if (Static344.anInt4791 > local185) {
							Static113.anInt2427 = Static235.anInt4181;
							Static235.anInt4181 = Static344.anInt4791;
							Static344.anInt4791 = local185;
						} else if (Static235.anInt4181 > local185) {
							Static113.anInt2427 = Static235.anInt4181;
							Static235.anInt4181 = local185;
						} else if (Static113.anInt2427 > local185) {
							Static113.anInt2427 = local185;
						}
					}
				}
				local154 = this.anInt3547;
				if (local154 == 0) {
					local16[local39] = Static350.anInt3741;
				} else if (local154 == 1) {
					local16[local39] = Static344.anInt4791;
				} else if (local154 == 3) {
					local16[local39] = Static235.anInt4181;
				} else if (local154 == 4) {
					local16[local39] = Static113.anInt2427;
				} else if (local154 == 2) {
					local16[local39] = Static344.anInt4791 - Static350.anInt3741;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		this.aByteArray65 = Static309.method4528(this.anInt3545);
		this.method3242();
	}
}
