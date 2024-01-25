import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class2_Sub4_Sub9 extends Class2_Sub4 {

	@OriginalMember(owner = "client!eaa", name = "F", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!eaa", name = "V", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!eaa", name = "O", descriptor = "I")
	public int anInt2516 = 0;

	@OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
	public int anInt2512 = 4;

	@OriginalMember(owner = "client!eaa", name = "N", descriptor = "Z")
	public boolean aBoolean201 = true;

	@OriginalMember(owner = "client!eaa", name = "R", descriptor = "I")
	public int anInt2519 = 4;

	@OriginalMember(owner = "client!eaa", name = "S", descriptor = "[B")
	private byte[] aByteArray18 = new byte[512];

	@OriginalMember(owner = "client!eaa", name = "M", descriptor = "I")
	public int anInt2515 = 1638;

	@OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
	public int anInt2514 = 4;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			this.method2130(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean201 = arg0.method2859() == 1;
		} else if (arg1 == 1) {
			this.anInt2512 = arg0.method2859();
		} else if (arg1 == 2) {
			this.anInt2515 = arg0.method2836();
			if (this.anInt2515 < 0) {
				this.aShortArray33 = new short[this.anInt2512];
				for (@Pc(78) int local78 = 0; local78 < this.anInt2512; local78++) {
					this.aShortArray33[local78] = (short) arg0.method2836();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt2514 = this.anInt2519 = arg0.method2859();
			return;
		} else if (arg1 == 4) {
			this.anInt2516 = arg0.method2859();
			return;
		} else if (arg1 == 5) {
			this.anInt2514 = arg0.method2859();
			return;
		} else if (arg1 == 6) {
			this.anInt2519 = arg0.method2859();
			return;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		this.aByteArray18 = Static415.method6263(this.anInt2516);
		this.method2129();
		for (@Pc(25) int local25 = this.anInt2512 - 1; local25 >= 1; local25--) {
			@Pc(31) short local31 = this.aShortArray33[local25];
			if (local31 > 8 || local31 < -8) {
				return;
			}
			this.anInt2512--;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
	private void method2129() {
		@Pc(24) int local24;
		if (this.anInt2515 > 0) {
			this.aShortArray33 = new short[this.anInt2512];
			this.aShortArray34 = new short[this.anInt2512];
			for (local24 = 0; local24 < this.anInt2512; local24++) {
				this.aShortArray33[local24] = (short) (int) (Math.pow((double) ((float) this.anInt2515 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray34[local24] = (short) (int) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray33 != null && this.aShortArray33.length == this.anInt2512) {
			this.aShortArray34 = new short[this.anInt2512];
			for (local24 = 0; local24 < this.anInt2512; local24++) {
				this.aShortArray34[local24] = (short) (int) Math.pow(2.0D, (double) local24);
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I[II)V")
	public void method2130(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2519 * Static415.anIntArray482[arg1];
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(40) int local40;
		@Pc(25) short local25;
		@Pc(101) int local101;
		@Pc(53) int local53;
		@Pc(47) int local47;
		@Pc(60) int local60;
		@Pc(81) int local81;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(90) int local90;
		@Pc(99) int local99;
		if (this.anInt2512 == 1) {
			local25 = this.aShortArray33[0];
			local40 = this.aShortArray34[0] << 12;
			local47 = this.anInt2514 * local40 >> 12;
			local60 = this.anInt2519 * local40 >> 12;
			local53 = local10 * local40 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local68 >= local60) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local90 = this.aByteArray18[local64 & 0xFF] & 0xFF;
			local99 = this.aByteArray18[local68 & 0xFF] & 0xFF;
			local81 = Class2_Sub7_Sub19.anIntArray667[local53];
			if (this.aBoolean201) {
				for (local101 = 0; local101 < Static395.anInt6816; local101++) {
					local109 = Static20.anIntArray40[local101] * this.anInt2514;
					local123 = this.method2131(local81, local53, local90, local99, local109 * local40 >> 12, local47);
					@Pc(468) int local468 = local123 * local25 >> 12;
					arg0[local101] = (local468 >> 1) + 2048;
				}
			} else {
				for (local101 = 0; local101 < Static395.anInt6816; local101++) {
					local109 = Static20.anIntArray40[local101] * this.anInt2514;
					local123 = this.method2131(local81, local53, local90, local99, local109 * local40 >> 12, local47);
					arg0[local101] = local123 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray33[0];
		if (local25 > 8 || local25 < -8) {
			local40 = this.aShortArray34[0] << 12;
			local47 = this.anInt2514 * local40 >> 12;
			local53 = local40 * local10 >> 12;
			local60 = this.anInt2519 * local40 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			local53 &= 0xFFF;
			if (local60 <= local68) {
				local68 = 0;
			}
			local81 = Class2_Sub7_Sub19.anIntArray667[local53];
			local90 = this.aByteArray18[local64 & 0xFF] & 0xFF;
			local99 = this.aByteArray18[local68 & 0xFF] & 0xFF;
			for (local101 = 0; local101 < Static395.anInt6816; local101++) {
				local109 = this.anInt2514 * Static20.anIntArray40[local101];
				local123 = this.method2131(local81, local53, local90, local99, local40 * local109 >> 12, local47);
				arg0[local101] = local25 * local123 >> 12;
			}
		}
		for (@Pc(137) int local137 = 1; local137 < this.anInt2512; local137++) {
			local25 = this.aShortArray33[local137];
			if (local25 > 8 || local25 < -8) {
				local40 = this.aShortArray34[local137] << 12;
				local60 = local40 * this.anInt2519 >> 12;
				local53 = local10 * local40 >> 12;
				local47 = local40 * this.anInt2514 >> 12;
				local64 = local53 >> 12;
				local68 = local64 + 1;
				local53 &= 0xFFF;
				if (local68 >= local60) {
					local68 = 0;
				}
				local90 = this.aByteArray18[local64 & 0xFF] & 0xFF;
				local99 = this.aByteArray18[local68 & 0xFF] & 0xFF;
				local81 = Class2_Sub7_Sub19.anIntArray667[local53];
				if (this.aBoolean201 && this.anInt2512 - 1 == local137) {
					for (local101 = 0; local101 < Static395.anInt6816; local101++) {
						local109 = Static20.anIntArray40[local101] * this.anInt2514;
						local123 = this.method2131(local81, local53, local90, local99, local40 * local109 >> 12, local47);
						local123 = (local123 * local25 >> 12) + arg0[local101];
						arg0[local101] = (local123 >> 1) + 2048;
					}
				} else {
					for (local101 = 0; local101 < Static395.anInt6816; local101++) {
						local109 = this.anInt2514 * Static20.anIntArray40[local101];
						local123 = this.method2131(local81, local53, local90, local99, local109 * local40 >> 12, local47);
						arg0[local101] += local25 * local123 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BIIIIII)I")
	private int method2131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 >> 12;
		@Pc(11) int local11 = local7 + 1;
		@Pc(15) int local15 = local7 & 0xFF;
		@Pc(24) int local24 = arg4 & 0xFFF;
		if (arg5 <= local11) {
			local11 = 0;
		}
		local11 &= 0xFF;
		@Pc(37) int local37 = arg1 - 4096;
		@Pc(41) int local41 = local24 - 4096;
		@Pc(45) int local45 = Class2_Sub7_Sub19.anIntArray667[local24];
		@Pc(54) int local54 = this.aByteArray18[arg2 + local15] & 0x3;
		@Pc(75) int local75;
		if (local54 > 1) {
			local75 = local54 == 2 ? local24 - arg1 : -arg1 + -local24;
		} else {
			local75 = local54 == 0 ? arg1 + local24 : arg1 - local24;
		}
		local54 = this.aByteArray18[arg2 + local11] & 0x3;
		@Pc(117) int local117;
		if (local54 <= 1) {
			local117 = local54 == 0 ? local41 + arg1 : arg1 + -local41;
		} else {
			local117 = local54 == 2 ? local41 - arg1 : -local41 - arg1;
		}
		local54 = this.aByteArray18[arg3 + local15] & 0x3;
		@Pc(153) int local153 = local75 + (local45 * (local117 - local75) >> 12);
		if (local54 > 1) {
			local75 = local54 == 2 ? local24 - local37 : -local24 - local37;
		} else {
			local75 = local54 == 0 ? local37 + local24 : local37 - local24;
		}
		local54 = this.aByteArray18[local11 + arg3] & 0x3;
		if (local54 <= 1) {
			local117 = local54 == 0 ? local41 + local37 : -local41 + local37;
		} else {
			local117 = local54 == 2 ? local41 - local37 : -local37 + -local41;
		}
		@Pc(231) int local231 = (local45 * (local117 - local75) >> 12) + local75;
		return (arg0 * (local231 - local153) >> 12) + local153;
	}
}
