import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class3_Sub1_Sub23 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "[I")
	private int[] anIntArray533;

	@OriginalMember(owner = "client!pc", name = "gb", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
	private int anInt3067;

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	private int anInt3068;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
	private int anInt3070;

	@OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
	private int anInt3073;

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
	private int anInt3078;

	@OriginalMember(owner = "client!pc", name = "pb", descriptor = "[I")
	private int[] anIntArray535;

	@OriginalMember(owner = "client!pc", name = "wb", descriptor = "Z")
	private boolean aBoolean149;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		this.method2404();
		this.method2399();
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	private void method2399() {
		@Pc(26) int local26;
		if (this.anInt3078 > 0) {
			this.anIntArray533 = new int[this.anInt3067];
			this.anIntArray534 = new int[this.anInt3067];
			for (local26 = 0; local26 < this.anInt3067; local26++) {
				this.anIntArray534[local26] = (int) (Math.pow((double) (this.anInt3078 / 4096), (double) local26) * 4096.0D);
				this.anIntArray533[local26] = (int) (Math.pow(2.0D, (double) local26) * 4096.0D);
			}
		} else if (this.anIntArray534 != null && this.anInt3067 == this.anIntArray534.length) {
			this.anIntArray533 = new int[this.anInt3067];
			for (local26 = 0; local26 < this.anInt3067; local26++) {
				this.anIntArray533[local26] = (int) (Math.pow(2.0D, (double) local26) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(24) int local24 = this.anInt3068 << 12;
			@Pc(29) int local29 = this.anInt3073 << 12;
			@Pc(36) int local36 = this.anInt3073 * Static22.anIntArray152[arg0];
			for (@Pc(38) int local38 = 0; local38 < Static129.anInt3285; local38++) {
				@Pc(42) int local42 = 0;
				@Pc(49) int local49 = this.anInt3068 * Static146.anIntArray618[local38];
				for (@Pc(51) int local51 = 0; local51 < this.anInt3067; local51++) {
					@Pc(58) int local58 = this.anIntArray533[local51];
					@Pc(63) int local63 = this.anIntArray534[local51];
					@Pc(87) int local87 = this.method2402(local58 * local49 >> 12, local36 * local58 >> 12, local58 * local24 >> 12, local58 * local29 >> 12);
					local42 += local87 * local63 >> 12;
				}
				if (this.aBoolean149) {
					local42 = (local42 >> 1) + 2048;
				}
				local15[local38] = local42;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)I")
	private int method2402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = arg0 & 0xFFFFF000;
		@Pc(7) int local7 = arg0 - local3;
		@Pc(15) int local15 = arg3 & 0xFFFFF000;
		@Pc(19) int local19 = arg1 & 0xFFFFF000;
		@Pc(23) int local23 = arg2 & 0xFFFFF000;
		@Pc(27) int local27 = arg1 - local19;
		@Pc(31) int local31 = local19 >> 12;
		@Pc(35) int local35 = local3 >> 12;
		@Pc(39) int local39 = local35 + 1;
		@Pc(43) int local43 = local31 + 1;
		@Pc(47) int local47 = local31 & 0xFF;
		if (local39 >= local23 >> 12) {
			local39 = 0;
		}
		local3 = local35 & 0xFF;
		@Pc(74) int local74 = this.anIntArray535[this.anIntArray535[local47] + local3] % 4;
		if (local43 >= local15 >> 12) {
			local43 = 0;
		}
		local39 &= 0xFF;
		local43 &= 0xFF;
		@Pc(101) int local101 = this.anIntArray535[this.anIntArray535[local43] + local39] % 4;
		@Pc(113) int local113 = this.anIntArray535[this.anIntArray535[local43] + local3] % 4;
		@Pc(126) int local126 = this.anIntArray535[local39 + this.anIntArray535[local47]] % 4;
		@Pc(134) int local134 = Static116.method2336(local7, Static159.anIntArrayArray29[local74], local27);
		@Pc(144) int local144 = Static116.method2336(local7 - 4096, Static159.anIntArrayArray29[local126], local27);
		@Pc(154) int local154 = Static116.method2336(local7, Static159.anIntArrayArray29[local113], local27 - 4096);
		@Pc(166) int local166 = Static116.method2336(local7 - 4096, Static159.anIntArrayArray29[local101], local27 - 4096);
		@Pc(170) int local170 = Static160.method2985(local7);
		@Pc(174) int local174 = Static160.method2985(local27);
		@Pc(180) int local180 = Static113.method2281(local144, local134, local170);
		@Pc(186) int local186 = Static113.method2281(local166, local154, local170);
		return Static113.method2281(local186, local180, local174);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean149 = arg1.method1545() == 1;
		} else if (arg0 == 1) {
			this.anInt3067 = arg1.method1545();
		} else if (arg0 == 2) {
			this.anInt3078 = arg1.method1542();
			if (this.anInt3078 < 0) {
				this.anIntArray534 = new int[this.anInt3067];
				for (@Pc(75) int local75 = 0; local75 < this.anInt3067; local75++) {
					this.anIntArray534[local75] = arg1.method1542();
				}
			}
		} else if (arg0 == 3) {
			this.anInt3068 = this.anInt3073 = arg1.method1545();
		} else if (arg0 == 4) {
			this.anInt3070 = arg1.method1545();
		} else if (arg0 == 5) {
			this.anInt3068 = arg1.method1545();
		} else if (arg0 == 6) {
			this.anInt3073 = arg1.method1545();
		}
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
	private void method2404() {
		@Pc(8) Random local8 = new Random((long) this.anInt3070);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray535[local14] = -1;
		}
		for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
			@Pc(40) int local40;
			do {
				local40 = Static42.method1009(255, local8);
			} while (this.anIntArray535[local40] != -1);
			this.anIntArray535[local40 + 255] = this.anIntArray535[local40] = local33;
		}
	}
}
