import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class6_Sub1_Sub27 extends Class6_Sub1 {

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray151;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
	private int anInt4089;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray152;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
	private int anInt4098;

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
	private int anInt4101;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	private int anInt4091 = 0;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	private int anInt4090 = 1024;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
	private int anInt4092 = 1024;

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
	private int anInt4099 = 409;

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
	private int anInt4095 = 204;

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
	private int anInt4088 = 81;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
	private int anInt4085 = 4;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
	private int anInt4094 = 8;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		this.method3937();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4085 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt4094 = arg0.method3972();
		} else if (arg1 == 2) {
			this.anInt4099 = arg0.method4021();
		} else if (arg1 == 3) {
			this.anInt4095 = arg0.method4021();
		} else if (arg1 == 4) {
			this.anInt4092 = arg0.method4021();
		} else if (arg1 == 5) {
			this.anInt4091 = arg0.method4021();
		} else if (arg1 == 6) {
			this.anInt4088 = arg0.method4021();
		} else if (arg1 == 7) {
			this.anInt4090 = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt4091 + Static273.anIntArray703[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt4094 > local22 && this.anIntArray474[local22] <= local29) {
				local22++;
			}
			@Pc(66) int local66 = local22 - 1;
			@Pc(77) boolean local77 = (local22 & 0x1) == 0;
			@Pc(82) int local82 = this.anIntArray474[local22];
			@Pc(89) int local89 = this.anIntArray474[local22 - 1];
			if (this.anInt4098 + local89 < local29 && local82 - this.anInt4098 > local29) {
				for (@Pc(104) int local104 = 0; local104 < Static299.anInt5659; local104++) {
					@Pc(108) int local108 = 0;
					@Pc(117) int local117 = local77 ? this.anInt4092 : -this.anInt4092;
					@Pc(129) int local129;
					for (local129 = Static18.anIntArray32[local104] + (local117 * this.anInt4089 >> 12); local129 < 0; local129 += 4096) {
					}
					while (local129 > 4096) {
						local129 -= 4096;
					}
					while (local108 < this.anInt4085 && local129 >= this.anIntArrayArray152[local66][local108]) {
						local108++;
					}
					@Pc(163) int local163 = local108 - 1;
					@Pc(170) int local170 = this.anIntArrayArray152[local66][local108];
					@Pc(177) int local177 = this.anIntArrayArray152[local66][local163];
					if (local177 + this.anInt4098 < local129 && local170 - this.anInt4098 > local129) {
						local16[local104] = this.anIntArrayArray151[local66][local163];
					} else {
						local16[local104] = 0;
					}
				}
			} else {
				Static358.method955(local16, 0, Static299.anInt5659, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	private void method3937() {
		@Pc(12) Random local12 = new Random((long) this.anInt4094);
		this.anInt4098 = this.anInt4088 / 2;
		this.anInt4089 = 4096 / this.anInt4085;
		this.anInt4101 = 4096 / this.anInt4094;
		@Pc(35) int local35 = this.anInt4089 / 2;
		this.anIntArrayArray152 = new int[this.anInt4094][this.anInt4085 + 1];
		@Pc(57) int local57 = this.anInt4101 / 2;
		this.anIntArrayArray151 = new int[this.anInt4094][this.anInt4085];
		this.anIntArray474 = new int[this.anInt4094 + 1];
		this.anIntArray474[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt4094; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt4101;
				local97 = (Static24.method368(4096, local12) - 2048) * this.anInt4095 >> 12;
				@Pc(105) int local105 = local85 + (local57 * local97 >> 12);
				this.anIntArray474[local78] = this.anIntArray474[local78 - 1] + local105;
			}
			this.anIntArrayArray152[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt4085; local85++) {
				if (local85 > 0) {
					local97 = this.anInt4089;
					@Pc(149) int local149 = (Static24.method368(4096, local12) - 2048) * this.anInt4099 >> 12;
					local97 += local35 * local149 >> 12;
					this.anIntArrayArray152[local78][local85] = this.anIntArrayArray152[local78][local85 - 1] + local97;
				}
				this.anIntArrayArray151[local78][local85] = this.anInt4090 <= 0 ? 4096 : 4096 - Static24.method368(this.anInt4090, local12);
			}
			this.anIntArrayArray152[local78][this.anInt4085] = 4096;
		}
		this.anIntArray474[this.anInt4094] = 4096;
	}
}
