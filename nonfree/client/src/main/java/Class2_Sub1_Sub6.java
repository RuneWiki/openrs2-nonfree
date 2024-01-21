import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dh", name = "fb", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!dh", name = "pb", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!dh", name = "ib", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!dh", name = "lb", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!dh", name = "mb", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
	private int anInt1019;

	@OriginalMember(owner = "client!dh", name = "rb", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!dh", name = "ub", descriptor = "Z")
	private boolean aBoolean51;

	@OriginalMember(owner = "client!dh", name = "wb", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)I")
	private int method699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg1 & 0xFFFFF000;
		@Pc(11) int local11 = arg3 & 0xFFFFF000;
		@Pc(15) int local15 = arg1 - local7;
		@Pc(19) int local19 = arg3 - local11;
		@Pc(23) int local23 = arg2 & 0xFFFFF000;
		@Pc(27) int local27 = local11 >> 12;
		@Pc(31) int local31 = local27 + 1;
		@Pc(35) int local35 = local7 >> 12;
		@Pc(39) int local39 = arg0 & 0xFFFFF000;
		@Pc(43) int local43 = local27 & 0xFF;
		if (local23 >> 12 <= local31) {
			local31 = 0;
		}
		@Pc(54) int local54 = local35 + 1;
		local7 = local35 & 0xFF;
		if (local39 >> 12 <= local54) {
			local54 = 0;
		}
		local54 &= 0xFF;
		@Pc(85) int local85 = this.anIntArray157[this.anIntArray157[local43] + local7] % 4;
		local31 &= 0xFF;
		@Pc(101) int local101 = this.anIntArray157[this.anIntArray157[local31] + local7] % 4;
		@Pc(113) int local113 = this.anIntArray157[this.anIntArray157[local43] + local54] % 4;
		@Pc(125) int local125 = this.anIntArray157[this.anIntArray157[local31] + local54] % 4;
		@Pc(133) int local133 = Static30.method610(local19, local15, Static130.anIntArrayArray26[local85]);
		@Pc(143) int local143 = Static30.method610(local19, local15 - 4096, Static130.anIntArrayArray26[local113]);
		@Pc(153) int local153 = Static30.method610(local19 - 4096, local15, Static130.anIntArrayArray26[local101]);
		@Pc(165) int local165 = Static30.method610(local19 - 4096, local15 + -4096, Static130.anIntArrayArray26[local125]);
		@Pc(169) int local169 = Static77.method1451(local15);
		@Pc(173) int local173 = Static77.method1451(local19);
		@Pc(179) int local179 = Static27.method562(local133, local143, local169);
		@Pc(185) int local185 = Static27.method562(local153, local165, local169);
		return Static27.method562(local179, local185, local173);
	}

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "(I)V")
	private void method702() {
		@Pc(29) int local29;
		if (this.anInt1021 > 0) {
			this.anIntArray155 = new int[this.anInt1024];
			this.anIntArray156 = new int[this.anInt1024];
			for (local29 = 0; local29 < this.anInt1024; local29++) {
				this.anIntArray156[local29] = (int) (Math.pow((double) (this.anInt1021 / 4096), (double) local29) * 4096.0D);
				this.anIntArray155[local29] = (int) (Math.pow(2.0D, (double) local29) * 4096.0D);
			}
		} else if (this.anIntArray156 != null && this.anInt1024 == this.anIntArray156.length) {
			this.anIntArray155 = new int[this.anInt1024];
			for (local29 = 0; local29 < this.anInt1024; local29++) {
				this.anIntArray155[local29] = (int) (Math.pow(2.0D, (double) local29) * 4096.0D);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "(I)V")
	private void method703() {
		@Pc(12) Random local12 = new Random((long) this.anInt1019);
		for (@Pc(19) int local19 = 0; local19 < 255; local19++) {
			this.anIntArray157[local19] = -1;
		}
		for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
			@Pc(39) int local39;
			do {
				local39 = Static41.method805(local12, 255);
			} while (this.anIntArray157[local39] != -1);
			this.anIntArray157[local39 + 255] = this.anIntArray157[local39] = local32;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean51 = arg0.method2387() == 1;
		} else if (arg1 == 1) {
			this.anInt1024 = arg0.method2387();
		} else if (arg1 == 2) {
			this.anInt1021 = arg0.method2386();
			if (this.anInt1021 < 0) {
				this.anIntArray156 = new int[this.anInt1024];
				for (@Pc(78) int local78 = 0; local78 < this.anInt1024; local78++) {
					this.anIntArray156[local78] = arg0.method2386();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt1031 = this.anInt1025 = arg0.method2387();
			return;
		} else if (arg1 == 4) {
			this.anInt1019 = arg0.method2387();
			return;
		} else if (arg1 == 5) {
			this.anInt1031 = arg0.method2387();
			return;
		} else if (arg1 == 6) {
			this.anInt1025 = arg0.method2387();
			return;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int local26 = this.anInt1031 << 12;
			@Pc(31) int local31 = this.anInt1025 << 12;
			@Pc(38) int local38 = this.anInt1025 * Static166.anIntArray619[arg0];
			for (@Pc(40) int local40 = 0; local40 < Static129.anInt3118; local40++) {
				@Pc(44) int local44 = 0;
				@Pc(51) int local51 = Static163.anIntArray577[local40] * this.anInt1031;
				for (@Pc(53) int local53 = 0; local53 < this.anInt1024; local53++) {
					@Pc(60) int local60 = this.anIntArray155[local53];
					@Pc(65) int local65 = this.anIntArray156[local53];
					@Pc(89) int local89 = this.method699(local60 * local26 >> 12, local60 * local51 >> 12, local31 * local60 >> 12, local60 * local38 >> 12);
					local44 += local65 * local89 >> 12;
				}
				if (this.aBoolean51) {
					local44 = (local44 >> 1) + 2048;
				}
				local17[local40] = local44;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		this.method703();
		this.method702();
	}
}
