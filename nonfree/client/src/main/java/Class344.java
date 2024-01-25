import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class344 {

	@OriginalMember(owner = "client!uk", name = "gb", descriptor = "[I")
	public static final int[] anIntArray578 = new int[16384];

	@OriginalMember(owner = "client!uk", name = "hb", descriptor = "[I")
	public static final int[] anIntArray579 = new int[16384];

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[Lclient!nda;")
	public Class219[] aClass219Array5;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
	public int[] anIntArray567;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "[Lclient!oia;")
	public Class238[] aClass238Array5;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "[S")
	public short[] aShortArray127;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "[I")
	public int[] anIntArray568;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "[I")
	public int[] anIntArray569;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "[I")
	public int[] anIntArray570;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "[I")
	public int[] anIntArray571;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "[S")
	public short[] aShortArray134;

	@OriginalMember(owner = "client!uk", name = "C", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!uk", name = "F", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "[S")
	public short[] aShortArray135;

	@OriginalMember(owner = "client!uk", name = "L", descriptor = "[Lclient!jga;")
	public Class156[] aClass156Array1;

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "[S")
	public short[] aShortArray136;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!uk", name = "R", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!uk", name = "U", descriptor = "[B")
	public byte[] aByteArray100;

	@OriginalMember(owner = "client!uk", name = "V", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!uk", name = "ab", descriptor = "[I")
	public int[] anIntArray575;

	@OriginalMember(owner = "client!uk", name = "db", descriptor = "[I")
	public int[] anIntArray576;

	@OriginalMember(owner = "client!uk", name = "eb", descriptor = "[I")
	public int[] anIntArray577;

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "B")
	public byte aByte113 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public int anInt9910 = 0;

	@OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
	public int anInt9923 = 0;

	@OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
	public int anInt9920 = 0;

	@OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
	public int anInt9930 = 0;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	public int anInt9915 = 12;

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			anIntArray579[local17] = (int) (Math.sin((double) local17 * local15) * 16384.0D);
			anIntArray578[local17] = (int) (Math.cos(local15 * (double) local17) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	private Class344() {
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "([B)V")
	public Class344(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method8060(arg0);
		} else {
			this.method8062(arg0);
		}
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(III)V")
	public Class344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray573 = new int[arg0];
		this.anIntArray569 = new int[arg1];
		this.aShortArray135 = new short[arg1];
		this.aByteArray95 = new byte[arg1];
		this.aByteArray98 = new byte[arg1];
		this.aShortArray134 = new short[arg1];
		this.anIntArray570 = new int[arg0];
		this.aByteArray100 = new byte[arg1];
		this.anIntArray567 = new int[arg0];
		this.aShortArray132 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray574 = new int[arg2];
			this.aByteArray99 = new byte[arg2];
			this.aShortArray130 = new short[arg2];
			this.anIntArray575 = new int[arg2];
			this.aShortArray127 = new short[arg2];
			this.anIntArray572 = new int[arg2];
			this.aByteArray101 = new byte[arg2];
			this.anIntArray568 = new int[arg2];
			this.anIntArray571 = new int[arg2];
			this.aShortArray129 = new short[arg2];
			this.anIntArray577 = new int[arg2];
			this.aByteArray97 = new byte[arg2];
		}
		this.aShortArray131 = new short[arg1];
		this.aShortArray128 = new short[arg1];
		this.anIntArray576 = new int[arg0];
		this.aByteArray96 = new byte[arg1];
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "([Lclient!uk;I)V")
	public Class344(@OriginalArg(0) Class344[] arg0, @OriginalArg(1) int arg1) {
		this.anInt9920 = 0;
		this.anInt9910 = 0;
		this.anInt9930 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte113 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class344 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt9930 += local59.anInt9930;
				this.anInt9920 += local59.anInt9920;
				this.anInt9910 += local59.anInt9910;
				if (local59.aClass219Array5 != null) {
					local32 += local59.aClass219Array5.length;
				}
				if (local59.aClass238Array5 != null) {
					local34 += local59.aClass238Array5.length;
				}
				if (local59.aClass156Array1 != null) {
					local36 += local59.aClass156Array1.length;
				}
				local38 |= local59.aByteArray100 != null;
				if (local59.aByteArray98 == null) {
					if (this.aByte113 == -1) {
						this.aByte113 = local59.aByte113;
					}
					if (this.aByte113 != local59.aByte113) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray96 != null;
				local46 |= local59.aShortArray135 != null;
				local44 |= local59.aByteArray95 != null;
				local48 |= local59.anIntArray569 != null;
			}
		}
		if (local42) {
			this.aByteArray96 = new byte[this.anInt9930];
		}
		this.anIntArray576 = new int[this.anInt9920];
		this.anIntArray570 = new int[this.anInt9920];
		this.aShortArray133 = new short[this.anInt9930];
		this.aShortArray132 = new short[this.anInt9930];
		this.aShortArray128 = new short[this.anInt9930];
		this.aShortArray131 = new short[this.anInt9930];
		if (local48) {
			this.anIntArray569 = new int[this.anInt9930];
		}
		if (local34 > 0) {
			this.aClass238Array5 = new Class238[local34];
		}
		if (this.anInt9910 > 0) {
			this.anIntArray572 = new int[this.anInt9910];
			this.aShortArray130 = new short[this.anInt9910];
			this.aByteArray101 = new byte[this.anInt9910];
			this.anIntArray575 = new int[this.anInt9910];
			this.anIntArray571 = new int[this.anInt9910];
			this.aByteArray97 = new byte[this.anInt9910];
			this.aByteArray99 = new byte[this.anInt9910];
			this.anIntArray568 = new int[this.anInt9910];
			this.aShortArray127 = new short[this.anInt9910];
			this.anIntArray574 = new int[this.anInt9910];
			this.anIntArray577 = new int[this.anInt9910];
			this.aShortArray129 = new short[this.anInt9910];
		}
		this.anIntArray567 = new int[this.anInt9920];
		if (local44) {
			this.aByteArray95 = new byte[this.anInt9930];
		}
		if (local38) {
			this.aByteArray100 = new byte[this.anInt9930];
		}
		if (local32 > 0) {
			this.aClass219Array5 = new Class219[local32];
		}
		if (local46) {
			this.aShortArray135 = new short[this.anInt9930];
		}
		if (local36 > 0) {
			this.aClass156Array1 = new Class156[local36];
		}
		this.aShortArray136 = new short[this.anInt9920];
		if (local40) {
			this.aByteArray98 = new byte[this.anInt9930];
		}
		this.aShortArray134 = new short[this.anInt9930];
		this.anIntArray573 = new int[this.anInt9920];
		this.anInt9930 = 0;
		this.anInt9910 = 0;
		local34 = 0;
		local36 = 0;
		local32 = 0;
		this.anInt9920 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(381) int local381 = 0; local381 < arg1; local381++) {
			@Pc(388) short local388 = (short) (0x1 << local381);
			@Pc(392) Class344 local392 = arg0[local381];
			if (local392 != null) {
				@Pc(399) int local399;
				if (local392.aClass156Array1 != null) {
					for (local399 = 0; local399 < local392.aClass156Array1.length; local399++) {
						@Pc(406) Class156 local406 = local392.aClass156Array1[local399];
						this.aClass156Array1[local36++] = local406.method4537(local406.anInt5531 + this.anInt9930);
					}
				}
				for (local399 = 0; local399 < local392.anInt9930; local399++) {
					if (local38 && local392.aByteArray100 != null) {
						this.aByteArray100[this.anInt9930] = local392.aByteArray100[local399];
					}
					if (local40) {
						if (local392.aByteArray98 == null) {
							this.aByteArray98[this.anInt9930] = local392.aByte113;
						} else {
							this.aByteArray98[this.anInt9930] = local392.aByteArray98[local399];
						}
					}
					if (local42 && local392.aByteArray96 != null) {
						this.aByteArray96[this.anInt9930] = local392.aByteArray96[local399];
					}
					if (local46) {
						if (local392.aShortArray135 == null) {
							this.aShortArray135[this.anInt9930] = -1;
						} else {
							this.aShortArray135[this.anInt9930] = local392.aShortArray135[local399];
						}
					}
					if (local48) {
						if (local392.anIntArray569 == null) {
							this.anIntArray569[this.anInt9930] = -1;
						} else {
							this.anIntArray569[this.anInt9930] = local392.anIntArray569[local399];
						}
					}
					this.aShortArray131[this.anInt9930] = (short) this.method8057(local392.aShortArray131[local399], local392, local388);
					this.aShortArray128[this.anInt9930] = (short) this.method8057(local392.aShortArray128[local399], local392, local388);
					this.aShortArray134[this.anInt9930] = (short) this.method8057(local392.aShortArray134[local399], local392, local388);
					this.aShortArray133[this.anInt9930] = local388;
					this.aShortArray132[this.anInt9930] = local392.aShortArray132[local399];
					this.anInt9930++;
				}
				@Pc(604) int local604;
				if (local392.aClass219Array5 != null) {
					for (local604 = 0; local604 < local392.aClass219Array5.length; local604++) {
						local617 = this.method8057(local392.aClass219Array5[local604].anInt6898, local392, local388);
						local628 = this.method8057(local392.aClass219Array5[local604].anInt6899, local392, local388);
						@Pc(639) int local639 = this.method8057(local392.aClass219Array5[local604].anInt6906, local392, local388);
						this.aClass219Array5[local32] = local392.aClass219Array5[local604].method5663(local628, local639, local617);
						local32++;
					}
				}
				if (local392.aClass238Array5 != null) {
					for (local604 = 0; local604 < local392.aClass238Array5.length; local604++) {
						local617 = this.method8057(local392.aClass238Array5[local604].anInt7661, local392, local388);
						this.aClass238Array5[local34] = local392.aClass238Array5[local604].method6343(local617);
						local34++;
					}
				}
			}
		}
		@Pc(709) int local709 = 0;
		this.anInt9923 = this.anInt9920;
		for (@Pc(715) int local715 = 0; local715 < arg1; local715++) {
			@Pc(722) short local722 = (short) (0x1 << local715);
			@Pc(726) Class344 local726 = arg0[local715];
			if (local726 != null) {
				for (local617 = 0; local617 < local726.anInt9930; local617++) {
					if (local44) {
						this.aByteArray95[local709++] = (byte) (local726.aByteArray95 == null || local726.aByteArray95[local617] == -1 ? -1 : local726.aByteArray95[local617] + this.anInt9910);
					}
				}
				for (local628 = 0; local628 < local726.anInt9910; local628++) {
					@Pc(778) byte local778 = this.aByteArray101[this.anInt9910] = local726.aByteArray101[local628];
					if (local778 == 0) {
						this.aShortArray127[this.anInt9910] = (short) this.method8057(local726.aShortArray127[local628], local726, local722);
						this.aShortArray129[this.anInt9910] = (short) this.method8057(local726.aShortArray129[local628], local726, local722);
						this.aShortArray130[this.anInt9910] = (short) this.method8057(local726.aShortArray130[local628], local726, local722);
					}
					if (local778 >= 1 && local778 <= 3) {
						this.aShortArray127[this.anInt9910] = local726.aShortArray127[local628];
						this.aShortArray129[this.anInt9910] = local726.aShortArray129[local628];
						this.aShortArray130[this.anInt9910] = local726.aShortArray130[local628];
						this.anIntArray574[this.anInt9910] = local726.anIntArray574[local628];
						this.anIntArray572[this.anInt9910] = local726.anIntArray572[local628];
						this.anIntArray577[this.anInt9910] = local726.anIntArray577[local628];
						this.aByteArray99[this.anInt9910] = local726.aByteArray99[local628];
						this.aByteArray97[this.anInt9910] = local726.aByteArray97[local628];
						this.anIntArray568[this.anInt9910] = local726.anIntArray568[local628];
					}
					if (local778 == 2) {
						this.anIntArray575[this.anInt9910] = local726.anIntArray575[local628];
						this.anIntArray571[this.anInt9910] = local726.anIntArray571[local628];
					}
					this.anInt9910++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BZ)[[I")
	public int[][] method8047(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt9920 : this.anInt9923;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray567[local20];
			if (local27 >= 0) {
				@Pc(36) int local36 = local8[local27]++;
				if (local27 > local10) {
					local10 = local27;
				}
			}
		}
		@Pc(61) int[][] local61 = new int[local10 + 1][];
		for (@Pc(63) int local63 = 0; local63 <= local10; local63++) {
			local61[local63] = new int[local8[local63]];
			local8[local63] = 0;
		}
		for (@Pc(94) int local94 = 0; local94 < local18; local94++) {
			@Pc(101) int local101 = this.anIntArray567[local94];
			if (local101 >= 0) {
				local61[local101][local8[local101]++] = local94;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(SSI)V")
	public void method8048(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9930; local7++) {
			if (this.aShortArray132[local7] == arg0) {
				this.aShortArray132[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BBSSSSSSBB)B")
	public byte method8051() {
		if (this.anInt9910 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray101[this.anInt9910] = 3;
		this.aShortArray127[this.anInt9910] = 0;
		this.aShortArray129[this.anInt9910] = 32767;
		this.aShortArray130[this.anInt9910] = 0;
		this.anIntArray574[this.anInt9910] = 1024;
		this.anIntArray572[this.anInt9910] = 1024;
		this.anIntArray577[this.anInt9910] = 1024;
		this.aByteArray99[this.anInt9910] = 0;
		this.aByteArray97[this.anInt9910] = 0;
		this.anIntArray568[this.anInt9910] = 0;
		return (byte) this.anInt9910++;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)[[I")
	public int[][] method8052() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass156Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass156Array1[local12].anInt5524;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(56) int[][] local56 = new int[local10 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local10; local58++) {
			local56[local58] = new int[local8[local58]];
			local8[local58] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.aClass156Array1.length; local82++) {
			@Pc(90) int local90 = this.aClass156Array1[local82].anInt5524;
			if (local90 >= 0) {
				local56[local90][local8[local90]++] = local82;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIBSISBB)I")
	public int method8054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray131[this.anInt9930] = (short) arg1;
		this.aShortArray128[this.anInt9930] = (short) arg4;
		this.aShortArray134[this.anInt9930] = (short) arg0;
		this.aByteArray100[this.anInt9930] = arg6;
		this.aByteArray95[this.anInt9930] = arg2;
		this.aShortArray132[this.anInt9930] = arg5;
		this.aByteArray96[this.anInt9930] = arg7;
		this.aShortArray135[this.anInt9930] = arg3;
		return this.anInt9930++;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
	public void method8055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt9920; local9++) {
			this.anIntArray576[local9] += arg0;
			this.anIntArray570[local9] += arg2;
			this.anIntArray573[local9] += arg1;
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(IIII)I")
	public int method8056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9920; local7++) {
			if (this.anIntArray576[local7] == arg0 && this.anIntArray570[local7] == arg1 && this.anIntArray573[local7] == arg2) {
				return local7;
			}
		}
		this.anIntArray576[this.anInt9920] = arg0;
		this.anIntArray570[this.anInt9920] = arg1;
		this.anIntArray573[this.anInt9920] = arg2;
		this.anInt9923 = this.anInt9920 + 1;
		return this.anInt9920++;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!uk;S)I")
	private int method8057(@OriginalArg(0) int arg0, @OriginalArg(2) Class344 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray576[arg0];
		@Pc(15) int local15 = arg1.anIntArray570[arg0];
		@Pc(25) int local25 = arg1.anIntArray573[arg0];
		for (@Pc(27) int local27 = 0; local27 < this.anInt9920; local27++) {
			if (local10 == this.anIntArray576[local27] && local15 == this.anIntArray570[local27] && local25 == this.anIntArray573[local27]) {
				this.aShortArray136[local27] |= arg2;
				return local27;
			}
		}
		this.anIntArray576[this.anInt9920] = local10;
		this.anIntArray570[this.anInt9920] = local15;
		this.anIntArray573[this.anInt9920] = local25;
		this.aShortArray136[this.anInt9920] = arg2;
		this.anIntArray567[this.anInt9920] = arg1.anIntArray567 == null ? -1 : arg1.anIntArray567[arg0];
		return this.anInt9920++;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)[[I")
	public int[][] method8059() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt9930; local12++) {
			@Pc(19) int local19 = this.anIntArray569[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local10; local62++) {
			local54[local62] = new int[local8[local62]];
			local8[local62] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt9930; local81++) {
			@Pc(88) int local88 = this.anIntArray569[local81];
			if (local88 >= 0) {
				local54[local88][local8[local88]++] = local81;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[B)V")
	private void method8060(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class8_Sub8 local10 = new Class8_Sub8(arg0);
		@Pc(15) Class8_Sub8 local15 = new Class8_Sub8(arg0);
		@Pc(20) Class8_Sub8 local20 = new Class8_Sub8(arg0);
		@Pc(25) Class8_Sub8 local25 = new Class8_Sub8(arg0);
		@Pc(30) Class8_Sub8 local30 = new Class8_Sub8(arg0);
		@Pc(35) Class8_Sub8 local35 = new Class8_Sub8(arg0);
		@Pc(40) Class8_Sub8 local40 = new Class8_Sub8(arg0);
		local10.anInt10588 = arg0.length - 23;
		this.anInt9920 = local10.method8578();
		this.anInt9930 = local10.method8578();
		this.anInt9910 = local10.method8525();
		@Pc(67) int local67 = local10.method8525();
		@Pc(76) boolean local76 = (local67 & 0x1) == 1;
		@Pc(85) boolean local85 = (local67 & 0x2) == 2;
		@Pc(96) boolean local96 = (local67 & 0x4) == 4;
		@Pc(105) boolean local105 = (local67 & 0x8) == 8;
		if (local105) {
			local10.anInt10588 -= 7;
			this.anInt9915 = local10.method8525();
			local10.anInt10588 += 6;
		}
		@Pc(128) int local128 = local10.method8525();
		@Pc(138) int local138 = local10.method8525();
		@Pc(142) int local142 = local10.method8525();
		@Pc(148) int local148 = local10.method8525();
		@Pc(152) int local152 = local10.method8525();
		@Pc(156) int local156 = local10.method8578();
		@Pc(160) int local160 = local10.method8578();
		@Pc(164) int local164 = local10.method8578();
		@Pc(168) int local168 = local10.method8578();
		@Pc(172) int local172 = local10.method8578();
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(194) int local194;
		if (this.anInt9910 > 0) {
			this.aByteArray101 = new byte[this.anInt9910];
			local10.anInt10588 = 0;
			for (local194 = 0; local194 < this.anInt9910; local194++) {
				@Pc(205) byte local205 = this.aByteArray101[local194] = local10.method8550();
				if (local205 == 2) {
					local178++;
				}
				if (local205 >= 1 && local205 <= 3) {
					local176++;
				}
				if (local205 == 0) {
					local174++;
				}
			}
		}
		local194 = this.anInt9910;
		@Pc(234) int local234 = local194;
		local194 += this.anInt9920;
		@Pc(241) int local241 = local194;
		if (local76) {
			local194 += this.anInt9930;
		}
		@Pc(250) int local250 = local194;
		local194 += this.anInt9930;
		@Pc(257) int local257 = local194;
		if (local128 == 255) {
			local194 += this.anInt9930;
		}
		@Pc(267) int local267 = local194;
		if (local142 == 1) {
			local194 += this.anInt9930;
		}
		@Pc(277) int local277 = local194;
		if (local152 == 1) {
			local194 += this.anInt9920;
		}
		@Pc(289) int local289 = local194;
		if (local138 == 1) {
			local194 += this.anInt9930;
		}
		@Pc(299) int local299 = local194;
		local194 += local168;
		@Pc(305) int local305 = local194;
		if (local148 == 1) {
			local194 += this.anInt9930 * 2;
		}
		@Pc(317) int local317 = local194;
		local194 += local172;
		@Pc(323) int local323 = local194;
		local194 += this.anInt9930 * 2;
		@Pc(332) int local332 = local194;
		local194 += local156;
		@Pc(338) int local338 = local194;
		local194 += local160;
		@Pc(344) int local344 = local194;
		local194 += local164;
		@Pc(350) int local350 = local194;
		local194 += local174 * 6;
		@Pc(358) int local358 = local194;
		local194 += local176 * 6;
		@Pc(366) byte local366 = 6;
		if (this.anInt9915 == 14) {
			local366 = 7;
		} else if (this.anInt9915 >= 15) {
			local366 = 9;
		}
		@Pc(384) int local384 = local194;
		local194 += local176 * local366;
		@Pc(392) int local392 = local194;
		local194 += local176;
		@Pc(398) int local398 = local194;
		local194 += local176;
		@Pc(404) int local404 = local194;
		local194 += local178 * 2 + local176;
		if (local138 == 1) {
			this.aByteArray96 = new byte[this.anInt9930];
		}
		if (local152 == 1) {
			this.anIntArray567 = new int[this.anInt9920];
		}
		this.aShortArray131 = new short[this.anInt9930];
		this.anIntArray573 = new int[this.anInt9920];
		this.aShortArray134 = new short[this.anInt9930];
		if (local76) {
			this.aByteArray100 = new byte[this.anInt9930];
		}
		if (local128 == 255) {
			this.aByteArray98 = new byte[this.anInt9930];
		} else {
			this.aByte113 = (byte) local128;
		}
		this.aShortArray132 = new short[this.anInt9930];
		local10.anInt10588 = local234;
		if (local148 == 1 && this.anInt9910 > 0) {
			this.aByteArray95 = new byte[this.anInt9930];
		}
		this.anIntArray576 = new int[this.anInt9920];
		if (this.anInt9910 > 0) {
			this.aShortArray127 = new short[this.anInt9910];
			if (local176 > 0) {
				this.aByteArray97 = new byte[local176];
				this.anIntArray574 = new int[local176];
				this.anIntArray577 = new int[local176];
				this.aByteArray99 = new byte[local176];
				this.anIntArray572 = new int[local176];
				this.anIntArray568 = new int[local176];
			}
			if (local178 > 0) {
				this.anIntArray571 = new int[local178];
				this.anIntArray575 = new int[local178];
			}
			this.aShortArray130 = new short[this.anInt9910];
			this.aShortArray129 = new short[this.anInt9910];
		}
		if (local148 == 1) {
			this.aShortArray135 = new short[this.anInt9930];
		}
		if (local142 == 1) {
			this.anIntArray569 = new int[this.anInt9930];
		}
		this.anIntArray570 = new int[this.anInt9920];
		this.aShortArray128 = new short[this.anInt9930];
		local15.anInt10588 = local332;
		local20.anInt10588 = local338;
		local25.anInt10588 = local344;
		local30.anInt10588 = local277;
		@Pc(606) int local606 = 0;
		@Pc(608) int local608 = 0;
		@Pc(610) int local610 = 0;
		@Pc(618) int local618;
		for (@Pc(612) int local612 = 0; local612 < this.anInt9920; local612++) {
			local618 = local10.method8525();
			@Pc(620) int local620 = 0;
			if ((local618 & 0x1) != 0) {
				local620 = local15.method8529();
			}
			@Pc(633) int local633 = 0;
			if ((local618 & 0x2) != 0) {
				local633 = local20.method8529();
			}
			@Pc(646) int local646 = 0;
			if ((local618 & 0x4) != 0) {
				local646 = local25.method8529();
			}
			this.anIntArray576[local612] = local606 + local620;
			this.anIntArray570[local612] = local633 + local608;
			this.anIntArray573[local612] = local646 + local610;
			local608 = this.anIntArray570[local612];
			local606 = this.anIntArray576[local612];
			local610 = this.anIntArray573[local612];
			if (local152 == 1) {
				this.anIntArray567[local612] = local30.method8525();
			}
		}
		local10.anInt10588 = local323;
		local15.anInt10588 = local241;
		local20.anInt10588 = local257;
		local25.anInt10588 = local289;
		local30.anInt10588 = local267;
		local35.anInt10588 = local305;
		local40.anInt10588 = local317;
		for (local618 = 0; local618 < this.anInt9930; local618++) {
			this.aShortArray132[local618] = (short) local10.method8578();
			if (local76) {
				this.aByteArray100[local618] = local15.method8550();
			}
			if (local128 == 255) {
				this.aByteArray98[local618] = local20.method8550();
			}
			if (local138 == 1) {
				this.aByteArray96[local618] = local25.method8550();
			}
			if (local142 == 1) {
				this.anIntArray569[local618] = local30.method8525();
			}
			if (local148 == 1) {
				this.aShortArray135[local618] = (short) (local35.method8578() - 1);
			}
			if (this.aByteArray95 != null) {
				if (this.aShortArray135[local618] == -1) {
					this.aByteArray95[local618] = -1;
				} else {
					this.aByteArray95[local618] = (byte) (local40.method8525() - 1);
				}
			}
		}
		local10.anInt10588 = local299;
		this.anInt9923 = -1;
		local15.anInt10588 = local250;
		@Pc(841) short local841 = 0;
		@Pc(843) short local843 = 0;
		@Pc(845) short local845 = 0;
		@Pc(847) short local847 = 0;
		@Pc(857) int local857;
		for (@Pc(849) int local849 = 0; local849 < this.anInt9930; local849++) {
			local857 = local15.method8525();
			if (local857 == 1) {
				local841 = (short) (local10.method8529() + local847);
				local843 = (short) (local10.method8529() + local841);
				local845 = (short) (local843 + local10.method8529());
				this.aShortArray131[local849] = local841;
				local847 = local845;
				this.aShortArray128[local849] = local843;
				this.aShortArray134[local849] = local845;
				if (this.anInt9923 < local841) {
					this.anInt9923 = local841;
				}
				if (this.anInt9923 < local843) {
					this.anInt9923 = local843;
				}
				if (local845 > this.anInt9923) {
					this.anInt9923 = local845;
				}
			}
			if (local857 == 2) {
				local843 = local845;
				local845 = (short) (local847 + local10.method8529());
				local847 = local845;
				this.aShortArray131[local849] = local841;
				this.aShortArray128[local849] = local843;
				this.aShortArray134[local849] = local845;
				if (this.anInt9923 < local845) {
					this.anInt9923 = local845;
				}
			}
			if (local857 == 3) {
				local841 = local845;
				local845 = (short) (local10.method8529() + local847);
				local847 = local845;
				this.aShortArray131[local849] = local841;
				this.aShortArray128[local849] = local843;
				this.aShortArray134[local849] = local845;
				if (local845 > this.anInt9923) {
					this.anInt9923 = local845;
				}
			}
			if (local857 == 4) {
				@Pc(1024) short local1024 = local841;
				local841 = local843;
				local845 = (short) (local10.method8529() + local847);
				local843 = local1024;
				this.aShortArray131[local849] = local841;
				local847 = local845;
				this.aShortArray128[local849] = local1024;
				this.aShortArray134[local849] = local845;
				if (local845 > this.anInt9923) {
					this.anInt9923 = local845;
				}
			}
		}
		this.anInt9923++;
		local10.anInt10588 = local350;
		local15.anInt10588 = local358;
		local20.anInt10588 = local384;
		local25.anInt10588 = local392;
		local30.anInt10588 = local398;
		local35.anInt10588 = local404;
		@Pc(1101) int local1101;
		for (local857 = 0; local857 < this.anInt9910; local857++) {
			local1101 = this.aByteArray101[local857] & 0xFF;
			if (local1101 == 0) {
				this.aShortArray127[local857] = (short) local10.method8578();
				this.aShortArray129[local857] = (short) local10.method8578();
				this.aShortArray130[local857] = (short) local10.method8578();
			}
			if (local1101 == 1) {
				this.aShortArray127[local857] = (short) local15.method8578();
				this.aShortArray129[local857] = (short) local15.method8578();
				this.aShortArray130[local857] = (short) local15.method8578();
				if (this.anInt9915 >= 15) {
					this.anIntArray574[local857] = local20.method8560();
					this.anIntArray572[local857] = local20.method8560();
					this.anIntArray577[local857] = local20.method8560();
				} else {
					this.anIntArray574[local857] = local20.method8578();
					if (this.anInt9915 >= 14) {
						this.anIntArray572[local857] = local20.method8560();
					} else {
						this.anIntArray572[local857] = local20.method8578();
					}
					this.anIntArray577[local857] = local20.method8578();
				}
				this.aByteArray99[local857] = local25.method8550();
				this.aByteArray97[local857] = local30.method8550();
				this.anIntArray568[local857] = local35.method8550();
			}
			if (local1101 == 2) {
				this.aShortArray127[local857] = (short) local15.method8578();
				this.aShortArray129[local857] = (short) local15.method8578();
				this.aShortArray130[local857] = (short) local15.method8578();
				if (this.anInt9915 < 15) {
					this.anIntArray574[local857] = local20.method8578();
					if (this.anInt9915 >= 14) {
						this.anIntArray572[local857] = local20.method8560();
					} else {
						this.anIntArray572[local857] = local20.method8578();
					}
					this.anIntArray577[local857] = local20.method8578();
				} else {
					this.anIntArray574[local857] = local20.method8560();
					this.anIntArray572[local857] = local20.method8560();
					this.anIntArray577[local857] = local20.method8560();
				}
				this.aByteArray99[local857] = local25.method8550();
				this.aByteArray97[local857] = local30.method8550();
				this.anIntArray568[local857] = local35.method8550();
				this.anIntArray575[local857] = local35.method8550();
				this.anIntArray571[local857] = local35.method8550();
			}
			if (local1101 == 3) {
				this.aShortArray127[local857] = (short) local15.method8578();
				this.aShortArray129[local857] = (short) local15.method8578();
				this.aShortArray130[local857] = (short) local15.method8578();
				if (this.anInt9915 < 15) {
					this.anIntArray574[local857] = local20.method8578();
					if (this.anInt9915 < 14) {
						this.anIntArray572[local857] = local20.method8578();
					} else {
						this.anIntArray572[local857] = local20.method8560();
					}
					this.anIntArray577[local857] = local20.method8578();
				} else {
					this.anIntArray574[local857] = local20.method8560();
					this.anIntArray572[local857] = local20.method8560();
					this.anIntArray577[local857] = local20.method8560();
				}
				this.aByteArray99[local857] = local25.method8550();
				this.aByteArray97[local857] = local30.method8550();
				this.anIntArray568[local857] = local35.method8550();
			}
		}
		local10.anInt10588 = local194;
		@Pc(1517) int local1517;
		@Pc(1523) int local1523;
		@Pc(1527) int local1527;
		@Pc(1587) int local1587;
		if (local85) {
			local1101 = local10.method8525();
			if (local1101 > 0) {
				this.aClass219Array5 = new Class219[local1101];
				for (local1517 = 0; local1517 < local1101; local1517++) {
					local1523 = local10.method8578();
					local1527 = local10.method8578();
					@Pc(1533) byte local1533;
					if (local128 == 255) {
						local1533 = this.aByteArray98[local1527];
					} else {
						local1533 = (byte) local128;
					}
					this.aClass219Array5[local1517] = new Class219(local1523, this.aShortArray131[local1527], this.aShortArray128[local1527], this.aShortArray134[local1527], local1533);
				}
			}
			local1517 = local10.method8525();
			if (local1517 > 0) {
				this.aClass238Array5 = new Class238[local1517];
				for (local1523 = 0; local1523 < local1517; local1523++) {
					local1527 = local10.method8578();
					local1587 = local10.method8578();
					this.aClass238Array5[local1523] = new Class238(local1527, local1587);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1101 = local10.method8525();
		if (local1101 <= 0) {
			return;
		}
		this.aClass156Array1 = new Class156[local1101];
		for (local1517 = 0; local1517 < local1101; local1517++) {
			local1523 = local10.method8578();
			local1527 = local10.method8578();
			local1587 = local10.method8525();
			@Pc(1643) byte local1643 = local10.method8550();
			this.aClass156Array1[local1517] = new Class156(local1523, local1527, local1587, local1643);
		}
		return;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBI)V")
	public void method8061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(22) int local22;
		@Pc(40) int local40;
		if (arg2 != 0) {
			local16 = anIntArray579[arg2];
			local20 = anIntArray578[arg2];
			for (local22 = 0; local22 < this.anInt9920; local22++) {
				local40 = local20 * this.anIntArray576[local22] + local16 * this.anIntArray570[local22] >> 14;
				this.anIntArray570[local22] = this.anIntArray570[local22] * local20 - this.anIntArray576[local22] * local16 >> 14;
				this.anIntArray576[local22] = local40;
			}
		}
		if (arg1 != 0) {
			local16 = anIntArray579[arg1];
			local20 = anIntArray578[arg1];
			for (local22 = 0; local22 < this.anInt9920; local22++) {
				local40 = local20 * this.anIntArray570[local22] - this.anIntArray573[local22] * local16 >> 14;
				this.anIntArray573[local22] = this.anIntArray573[local22] * local20 + local16 * this.anIntArray570[local22] >> 14;
				this.anIntArray570[local22] = local40;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local16 = anIntArray579[arg0];
		local20 = anIntArray578[arg0];
		for (local22 = 0; local22 < this.anInt9920; local22++) {
			local40 = this.anIntArray573[local22] * local16 + local20 * this.anIntArray576[local22] >> 14;
			this.anIntArray573[local22] = this.anIntArray573[local22] * local20 - local16 * this.anIntArray576[local22] >> 14;
			this.anIntArray576[local22] = local40;
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I[B)V")
	private void method8062(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class8_Sub8 local14 = new Class8_Sub8(arg0);
		@Pc(19) Class8_Sub8 local19 = new Class8_Sub8(arg0);
		@Pc(24) Class8_Sub8 local24 = new Class8_Sub8(arg0);
		@Pc(29) Class8_Sub8 local29 = new Class8_Sub8(arg0);
		@Pc(34) Class8_Sub8 local34 = new Class8_Sub8(arg0);
		local14.anInt10588 = arg0.length - 18;
		this.anInt9920 = local14.method8578();
		this.anInt9930 = local14.method8578();
		this.anInt9910 = local14.method8525();
		@Pc(61) int local61 = local14.method8525();
		@Pc(65) int local65 = local14.method8525();
		@Pc(69) int local69 = local14.method8525();
		@Pc(73) int local73 = local14.method8525();
		@Pc(77) int local77 = local14.method8525();
		@Pc(81) int local81 = local14.method8578();
		@Pc(87) int local87 = local14.method8578();
		@Pc(93) int local93 = local14.method8578();
		@Pc(97) int local97 = local14.method8578();
		@Pc(106) int local106 = this.anInt9920;
		@Pc(108) int local108 = local106;
		local106 += this.anInt9930;
		@Pc(115) int local115 = local106;
		if (local65 == 255) {
			local106 += this.anInt9930;
		}
		@Pc(125) int local125 = local106;
		if (local73 == 1) {
			local106 += this.anInt9930;
		}
		@Pc(137) int local137 = local106;
		if (local61 == 1) {
			local106 += this.anInt9930;
		}
		@Pc(149) int local149 = local106;
		if (local77 == 1) {
			local106 += this.anInt9920;
		}
		@Pc(161) int local161 = local106;
		if (local69 == 1) {
			local106 += this.anInt9930;
		}
		@Pc(171) int local171 = local106;
		local106 += local97;
		@Pc(177) int local177 = local106;
		local106 += this.anInt9930 * 2;
		@Pc(186) int local186 = local106;
		local106 += this.anInt9910 * 6;
		@Pc(195) int local195 = local106;
		local106 += local81;
		@Pc(201) int local201 = local106;
		local106 += local87;
		this.aShortArray131 = new short[this.anInt9930];
		this.anIntArray576 = new int[this.anInt9920];
		if (this.anInt9910 > 0) {
			this.aShortArray129 = new short[this.anInt9910];
			this.aShortArray130 = new short[this.anInt9910];
			this.aShortArray127 = new short[this.anInt9910];
			this.aByteArray101 = new byte[this.anInt9910];
		}
		this.aShortArray134 = new short[this.anInt9930];
		if (local73 == 1) {
			this.anIntArray569 = new int[this.anInt9930];
		}
		this.aShortArray132 = new short[this.anInt9930];
		if (local65 == 255) {
			this.aByteArray98 = new byte[this.anInt9930];
		} else {
			this.aByte113 = (byte) local65;
		}
		if (local77 == 1) {
			this.anIntArray567 = new int[this.anInt9920];
		}
		this.anIntArray570 = new int[this.anInt9920];
		if (local61 == 1) {
			this.aByteArray95 = new byte[this.anInt9930];
			this.aByteArray100 = new byte[this.anInt9930];
			this.aShortArray135 = new short[this.anInt9930];
		}
		if (local69 == 1) {
			this.aByteArray96 = new byte[this.anInt9930];
		}
		this.aShortArray128 = new short[this.anInt9930];
		this.anIntArray573 = new int[this.anInt9920];
		local14.anInt10588 = 0;
		local19.anInt10588 = local195;
		local24.anInt10588 = local201;
		local29.anInt10588 = local106;
		local34.anInt10588 = local149;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(362) int local362;
		@Pc(364) int local364;
		for (@Pc(356) int local356 = 0; local356 < this.anInt9920; local356++) {
			local362 = local14.method8525();
			local364 = 0;
			if ((local362 & 0x1) != 0) {
				local364 = local19.method8529();
			}
			@Pc(377) int local377 = 0;
			if ((local362 & 0x2) != 0) {
				local377 = local24.method8529();
			}
			@Pc(390) int local390 = 0;
			if ((local362 & 0x4) != 0) {
				local390 = local29.method8529();
			}
			this.anIntArray576[local356] = local364 + local350;
			this.anIntArray570[local356] = local377 + local352;
			this.anIntArray573[local356] = local354 + local390;
			local350 = this.anIntArray576[local356];
			local354 = this.anIntArray573[local356];
			local352 = this.anIntArray570[local356];
			if (local77 == 1) {
				this.anIntArray567[local356] = local34.method8525();
			}
		}
		local14.anInt10588 = local177;
		local19.anInt10588 = local137;
		local24.anInt10588 = local115;
		local29.anInt10588 = local161;
		local34.anInt10588 = local125;
		for (local362 = 0; local362 < this.anInt9930; local362++) {
			this.aShortArray132[local362] = (short) local14.method8578();
			if (local61 == 1) {
				local364 = local19.method8525();
				if ((local364 & 0x1) == 1) {
					local7 = true;
					this.aByteArray100[local362] = 1;
				} else {
					this.aByteArray100[local362] = 0;
				}
				if ((local364 & 0x2) == 2) {
					this.aByteArray95[local362] = (byte) (local364 >> 2);
					this.aShortArray135[local362] = this.aShortArray132[local362];
					this.aShortArray132[local362] = 127;
					if (this.aShortArray135[local362] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray95[local362] = -1;
					this.aShortArray135[local362] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray98[local362] = local24.method8550();
			}
			if (local69 == 1) {
				this.aByteArray96[local362] = local29.method8550();
			}
			if (local73 == 1) {
				this.anIntArray569[local362] = local34.method8525();
			}
		}
		local14.anInt10588 = local171;
		this.anInt9923 = -1;
		local19.anInt10588 = local108;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(617) int local617;
		for (@Pc(611) int local611 = 0; local611 < this.anInt9930; local611++) {
			local617 = local19.method8525();
			if (local617 == 1) {
				local603 = (short) (local14.method8529() + local609);
				local605 = (short) (local14.method8529() + local603);
				local607 = (short) (local14.method8529() + local605);
				this.aShortArray131[local611] = local603;
				local609 = local607;
				this.aShortArray128[local611] = local605;
				this.aShortArray134[local611] = local607;
				if (local603 > this.anInt9923) {
					this.anInt9923 = local603;
				}
				if (this.anInt9923 < local605) {
					this.anInt9923 = local605;
				}
				if (this.anInt9923 < local607) {
					this.anInt9923 = local607;
				}
			}
			if (local617 == 2) {
				local605 = local607;
				local607 = (short) (local609 + local14.method8529());
				local609 = local607;
				this.aShortArray131[local611] = local603;
				this.aShortArray128[local611] = local605;
				this.aShortArray134[local611] = local607;
				if (local607 > this.anInt9923) {
					this.anInt9923 = local607;
				}
			}
			if (local617 == 3) {
				local603 = local607;
				local607 = (short) (local14.method8529() + local609);
				local609 = local607;
				this.aShortArray131[local611] = local603;
				this.aShortArray128[local611] = local605;
				this.aShortArray134[local611] = local607;
				if (local607 > this.anInt9923) {
					this.anInt9923 = local607;
				}
			}
			if (local617 == 4) {
				@Pc(776) short local776 = local603;
				local603 = local605;
				local605 = local776;
				local607 = (short) (local609 + local14.method8529());
				local609 = local607;
				this.aShortArray131[local611] = local603;
				this.aShortArray128[local611] = local776;
				this.aShortArray134[local611] = local607;
				if (this.anInt9923 < local607) {
					this.anInt9923 = local607;
				}
			}
		}
		this.anInt9923++;
		local14.anInt10588 = local186;
		for (local617 = 0; local617 < this.anInt9910; local617++) {
			this.aByteArray101[local617] = 0;
			this.aShortArray127[local617] = (short) local14.method8578();
			this.aShortArray129[local617] = (short) local14.method8578();
			this.aShortArray130[local617] = (short) local14.method8578();
		}
		if (this.aByteArray95 != null) {
			@Pc(880) boolean local880 = false;
			for (@Pc(882) int local882 = 0; local882 < this.anInt9930; local882++) {
				@Pc(891) int local891 = this.aByteArray95[local882] & 0xFF;
				if (local891 != 255) {
					if (this.aShortArray131[local882] == (this.aShortArray127[local891] & 0xFFFF) && (this.aShortArray129[local891] & 0xFFFF) == this.aShortArray128[local882] && (this.aShortArray130[local891] & 0xFFFF) == this.aShortArray134[local882]) {
						this.aByteArray95[local882] = -1;
					} else {
						local880 = true;
					}
				}
			}
			if (!local880) {
				this.aByteArray95 = null;
			}
		}
		if (!local9) {
			this.aShortArray135 = null;
		}
		if (!local7) {
			this.aByteArray100 = null;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)V")
	public void method8065() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt9920; local15++) {
			this.anIntArray576[local15] <<= 0x2;
			this.anIntArray570[local15] <<= 0x2;
			this.anIntArray573[local15] <<= 0x2;
		}
		if (this.anInt9910 <= 0 || this.anIntArray574 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray574.length; local57++) {
			this.anIntArray574[local57] <<= 0x2;
			this.anIntArray572[local57] <<= 0x2;
			if (this.aByteArray101[local57] != 1) {
				this.anIntArray577[local57] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(SIS)V")
	public void method8066(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray135 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt9930; local15++) {
			if (arg1 == this.aShortArray135[local15]) {
				this.aShortArray135[local15] = arg0;
			}
		}
	}
}
