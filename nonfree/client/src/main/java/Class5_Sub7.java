import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "[S")
	private short[] aShortArray148;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "[S")
	public short[] aShortArray149;

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "[Lclient!sd;")
	public Class85[] aClass85Array1;

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "S")
	public short aShort25;

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "[S")
	public short[] aShortArray150;

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "[I")
	public int[] anIntArray756;

	@OriginalMember(owner = "client!vj", name = "B", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "[S")
	public short[] aShortArray151;

	@OriginalMember(owner = "client!vj", name = "E", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!vj", name = "F", descriptor = "[S")
	public short[] aShortArray152;

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!vj", name = "H", descriptor = "[I")
	private int[] anIntArray758;

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "[B")
	private byte[] aByteArray59;

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "[S")
	public short[] aShortArray153;

	@OriginalMember(owner = "client!vj", name = "L", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!vj", name = "N", descriptor = "[[I")
	public int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!vj", name = "O", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!vj", name = "P", descriptor = "[[I")
	public int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!vj", name = "Q", descriptor = "[I")
	public int[] anIntArray760;

	@OriginalMember(owner = "client!vj", name = "R", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!vj", name = "S", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!vj", name = "T", descriptor = "[I")
	public int[] anIntArray761;

	@OriginalMember(owner = "client!vj", name = "U", descriptor = "[I")
	public int[] anIntArray762;

	@OriginalMember(owner = "client!vj", name = "V", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
	public int anInt4746;

	@OriginalMember(owner = "client!vj", name = "X", descriptor = "[I")
	public int[] anIntArray763;

	@OriginalMember(owner = "client!vj", name = "Y", descriptor = "[Lclient!tg;")
	public Class94[] aClass94Array1;

	@OriginalMember(owner = "client!vj", name = "ab", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!vj", name = "bb", descriptor = "[I")
	public int[] anIntArray764;

	@OriginalMember(owner = "client!vj", name = "cb", descriptor = "[I")
	private int[] anIntArray765;

	@OriginalMember(owner = "client!vj", name = "db", descriptor = "[S")
	private short[] aShortArray154;

	@OriginalMember(owner = "client!vj", name = "gb", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!vj", name = "hb", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!vj", name = "ib", descriptor = "[S")
	private short[] aShortArray155;

	@OriginalMember(owner = "client!vj", name = "jb", descriptor = "[Lclient!sd;")
	public Class85[] aClass85Array2;

	@OriginalMember(owner = "client!vj", name = "lb", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!vj", name = "mb", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!vj", name = "nb", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "B")
	public byte aByte17 = 0;

	@OriginalMember(owner = "client!vj", name = "fb", descriptor = "I")
	public int anInt4748 = 0;

	@OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
	public int anInt4747 = 0;

	@OriginalMember(owner = "client!vj", name = "eb", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	private Class5_Sub7() {
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([B)V")
	public Class5_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3806(arg0);
		} else {
			this.method3787(arg0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(III)V")
	public Class5_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray760 = new int[arg0];
		this.anIntArray763 = new int[arg0];
		this.anIntArray756 = new int[arg0];
		this.anIntArray758 = new int[arg0];
		this.anIntArray762 = new int[arg1];
		this.anIntArray761 = new int[arg1];
		this.anIntArray764 = new int[arg1];
		this.aByteArray63 = new byte[arg1];
		this.aByteArray58 = new byte[arg1];
		this.aByteArray64 = new byte[arg1];
		this.aShortArray153 = new short[arg1];
		this.aShortArray151 = new short[arg1];
		this.aByteArray57 = new byte[arg1];
		this.anIntArray765 = new int[arg1];
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([Lclient!vj;I)V")
	public Class5_Sub7(@OriginalArg(0) Class5_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt4748 = 0;
		this.anInt4747 = 0;
		this.anInt4746 = 0;
		this.aByte17 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class5_Sub7 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt4748 += local44.anInt4748;
				this.anInt4747 += local44.anInt4747;
				this.anInt4746 += local44.anInt4746;
				if (local44.aByteArray58 == null) {
					if (this.aByte17 == -1) {
						this.aByte17 = local44.aByte17;
					}
					if (this.aByte17 != local44.aByte17) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray63 != null;
				local19 |= local44.aByteArray64 != null;
				local21 |= local44.anIntArray765 != null;
				local23 |= local44.aShortArray151 != null;
				local25 |= local44.aByteArray57 != null;
			}
		}
		this.anIntArray760 = new int[this.anInt4748];
		this.anIntArray763 = new int[this.anInt4748];
		this.anIntArray756 = new int[this.anInt4748];
		this.anIntArray758 = new int[this.anInt4748];
		this.anIntArray762 = new int[this.anInt4747];
		this.anIntArray761 = new int[this.anInt4747];
		this.anIntArray764 = new int[this.anInt4747];
		if (local15) {
			this.aByteArray63 = new byte[this.anInt4747];
		}
		if (local17) {
			this.aByteArray58 = new byte[this.anInt4747];
		}
		if (local19) {
			this.aByteArray64 = new byte[this.anInt4747];
		}
		if (local21) {
			this.anIntArray765 = new int[this.anInt4747];
		}
		if (local23) {
			this.aShortArray151 = new short[this.anInt4747];
		}
		if (local25) {
			this.aByteArray57 = new byte[this.anInt4747];
		}
		this.aShortArray153 = new short[this.anInt4747];
		if (this.anInt4746 > 0) {
			this.aByteArray61 = new byte[this.anInt4746];
			this.aShortArray150 = new short[this.anInt4746];
			this.aShortArray149 = new short[this.anInt4746];
			this.aShortArray152 = new short[this.anInt4746];
			this.aShortArray155 = new short[this.anInt4746];
			this.aShortArray148 = new short[this.anInt4746];
			this.aShortArray154 = new short[this.anInt4746];
			this.aByteArray62 = new byte[this.anInt4746];
			this.aByteArray56 = new byte[this.anInt4746];
			this.aByteArray60 = new byte[this.anInt4746];
			this.aByteArray59 = new byte[this.anInt4746];
			this.aByteArray65 = new byte[this.anInt4746];
		}
		this.anInt4748 = 0;
		this.anInt4747 = 0;
		this.anInt4746 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class5_Sub7 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt4747; local302++) {
					if (local15 && local298.aByteArray63 != null) {
						this.aByteArray63[this.anInt4747] = local298.aByteArray63[local302];
					}
					if (local17) {
						if (local298.aByteArray58 == null) {
							this.aByteArray58[this.anInt4747] = local298.aByte17;
						} else {
							this.aByteArray58[this.anInt4747] = local298.aByteArray58[local302];
						}
					}
					if (local19 && local298.aByteArray64 != null) {
						this.aByteArray64[this.anInt4747] = local298.aByteArray64[local302];
					}
					if (local21 && local298.anIntArray765 != null) {
						this.anIntArray765[this.anInt4747] = local298.anIntArray765[local302];
					}
					if (local23) {
						if (local298.aShortArray151 == null) {
							this.aShortArray151[this.anInt4747] = -1;
						} else {
							this.aShortArray151[this.anInt4747] = local298.aShortArray151[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray57 == null || local298.aByteArray57[local302] == -1) {
							this.aByteArray57[this.anInt4747] = -1;
						} else {
							this.aByteArray57[this.anInt4747] = (byte) (local298.aByteArray57[local302] + this.anInt4746);
						}
					}
					this.aShortArray153[this.anInt4747] = local298.aShortArray153[local302];
					this.anIntArray762[this.anInt4747] = this.method3793(local298, local298.anIntArray762[local302]);
					this.anIntArray761[this.anInt4747] = this.method3793(local298, local298.anIntArray761[local302]);
					this.anIntArray764[this.anInt4747] = this.method3793(local298, local298.anIntArray764[local302]);
					this.anInt4747++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt4746; local477++) {
					@Pc(489) byte local489 = this.aByteArray61[this.anInt4746] = local298.aByteArray61[local477];
					if (local489 == 0) {
						this.aShortArray150[this.anInt4746] = (short) this.method3793(local298, local298.aShortArray150[local477]);
						this.aShortArray149[this.anInt4746] = (short) this.method3793(local298, local298.aShortArray149[local477]);
						this.aShortArray152[this.anInt4746] = (short) this.method3793(local298, local298.aShortArray152[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray150[this.anInt4746] = local298.aShortArray150[local477];
						this.aShortArray149[this.anInt4746] = local298.aShortArray149[local477];
						this.aShortArray152[this.anInt4746] = local298.aShortArray152[local477];
						this.aShortArray155[this.anInt4746] = local298.aShortArray155[local477];
						this.aShortArray148[this.anInt4746] = local298.aShortArray148[local477];
						this.aShortArray154[this.anInt4746] = local298.aShortArray154[local477];
						this.aByteArray62[this.anInt4746] = local298.aByteArray62[local477];
						this.aByteArray56[this.anInt4746] = local298.aByteArray56[local477];
						this.aByteArray60[this.anInt4746] = local298.aByteArray60[local477];
					}
					if (local489 == 2) {
						this.aByteArray59[this.anInt4746] = local298.aByteArray59[local477];
						this.aByteArray65[this.anInt4746] = local298.aByteArray65[local477];
					}
					this.anInt4746++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!vj;ZZZZ)V")
	public Class5_Sub7(@OriginalArg(0) Class5_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4748 = arg0.anInt4748;
		this.anInt4747 = arg0.anInt4747;
		this.anInt4746 = arg0.anInt4746;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray760 = arg0.anIntArray760;
			this.anIntArray763 = arg0.anIntArray763;
			this.anIntArray756 = arg0.anIntArray756;
		} else {
			this.anIntArray760 = new int[this.anInt4748];
			this.anIntArray763 = new int[this.anInt4748];
			this.anIntArray756 = new int[this.anInt4748];
			for (local57 = 0; local57 < this.anInt4748; local57++) {
				this.anIntArray760[local57] = arg0.anIntArray760[local57];
				this.anIntArray763[local57] = arg0.anIntArray763[local57];
				this.anIntArray756[local57] = arg0.anIntArray756[local57];
			}
		}
		if (arg2) {
			this.aShortArray153 = arg0.aShortArray153;
		} else {
			this.aShortArray153 = new short[this.anInt4747];
			for (local57 = 0; local57 < this.anInt4747; local57++) {
				this.aShortArray153[local57] = arg0.aShortArray153[local57];
			}
		}
		if (arg3 || arg0.aShortArray151 == null) {
			this.aShortArray151 = arg0.aShortArray151;
		} else {
			this.aShortArray151 = new short[this.anInt4747];
			for (local57 = 0; local57 < this.anInt4747; local57++) {
				this.aShortArray151[local57] = arg0.aShortArray151[local57];
			}
		}
		this.aByteArray64 = arg0.aByteArray64;
		this.anIntArray762 = arg0.anIntArray762;
		this.anIntArray761 = arg0.anIntArray761;
		this.anIntArray764 = arg0.anIntArray764;
		this.aByteArray63 = arg0.aByteArray63;
		this.aByteArray58 = arg0.aByteArray58;
		this.aByteArray57 = arg0.aByteArray57;
		this.aByte17 = arg0.aByte17;
		this.aByteArray61 = arg0.aByteArray61;
		this.aShortArray150 = arg0.aShortArray150;
		this.aShortArray149 = arg0.aShortArray149;
		this.aShortArray152 = arg0.aShortArray152;
		this.aShortArray155 = arg0.aShortArray155;
		this.aShortArray148 = arg0.aShortArray148;
		this.aShortArray154 = arg0.aShortArray154;
		this.aByteArray62 = arg0.aByteArray62;
		this.aByteArray56 = arg0.aByteArray56;
		this.aByteArray60 = arg0.aByteArray60;
		this.aByteArray59 = arg0.aByteArray59;
		this.aByteArray65 = arg0.aByteArray65;
		this.anIntArray758 = arg0.anIntArray758;
		this.anIntArray765 = arg0.anIntArray765;
		this.anIntArrayArray44 = arg0.anIntArrayArray44;
		this.anIntArrayArray45 = arg0.anIntArrayArray45;
		this.aClass85Array1 = arg0.aClass85Array1;
		this.aClass94Array1 = arg0.aClass94Array1;
		this.aClass85Array2 = arg0.aClass85Array2;
		this.aShort27 = arg0.aShort27;
		this.aShort25 = arg0.aShort25;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([[IIIIII)V")
	private void method3782(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(24) int local24 = Static218.method3784(arg0, arg1 + local10, arg3 + local15);
		@Pc(28) int local28 = arg4 / 2;
		@Pc(33) int local33 = -arg5 / 2;
		@Pc(42) int local42 = Static218.method3784(arg0, arg1 + local28, arg3 + local33);
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(51) int local51 = arg5 / 2;
		@Pc(60) int local60 = Static218.method3784(arg0, arg1 + local47, arg3 + local51);
		@Pc(64) int local64 = arg4 / 2;
		@Pc(68) int local68 = arg5 / 2;
		@Pc(77) int local77 = Static218.method3784(arg0, arg1 + local64, arg3 + local68);
		@Pc(84) int local84 = local24 < local42 ? local24 : local42;
		@Pc(91) int local91 = local60 < local77 ? local60 : local77;
		@Pc(98) int local98 = local42 < local77 ? local42 : local77;
		@Pc(105) int local105 = local24 < local60 ? local24 : local60;
		@Pc(118) int local118 = (int) (Math.atan2((double) (local84 - local91), (double) arg5) * 325.95D) & 0x7FF;
		if (local118 != 0) {
			this.method3801(local118);
		}
		@Pc(136) int local136 = (int) (Math.atan2((double) (local105 - local98), (double) arg4) * 325.95D) & 0x7FF;
		if (local136 != 0) {
			this.method3808(local136);
		}
		@Pc(145) int local145 = local24 + local77;
		if (local42 + local60 < local145) {
			local145 = local42 + local60;
		}
		local145 = (local145 >> 1) - arg2;
		if (local145 != 0) {
			this.method3799(0, local145, 0);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[[I[[IIIIZZ)Lclient!vj;")
	public Class5_Sub7 method3783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3796();
		@Pc(6) int local6 = arg4 + this.aShort29;
		@Pc(11) int local11 = arg4 + this.aShort30;
		@Pc(16) int local16 = arg6 + this.aShort32;
		@Pc(21) int local21 = arg6 + this.aShort31;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local6 < 0 || local11 + 128 >> 7 >= arg2.length || local16 < 0 || local21 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local6 < 0 || local11 + 128 >> 7 >= arg3.length || local16 < 0 || local21 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local6 >>= 0x7;
			local11 = local11 + 127 >> 7;
			local16 >>= 0x7;
			local21 = local21 + 127 >> 7;
			if (arg2[local6][local16] == arg5 && arg2[local11][local16] == arg5 && arg2[local6][local21] == arg5 && arg2[local11][local21] == arg5) {
				return this;
			}
		}
		@Pc(147) Class5_Sub7 local147 = new Class5_Sub7();
		local147.anInt4748 = this.anInt4748;
		local147.anInt4747 = this.anInt4747;
		local147.anInt4746 = this.anInt4746;
		local147.anIntArray762 = this.anIntArray762;
		local147.anIntArray761 = this.anIntArray761;
		local147.anIntArray764 = this.anIntArray764;
		local147.aByteArray63 = this.aByteArray63;
		local147.aByteArray58 = this.aByteArray58;
		local147.aByteArray64 = this.aByteArray64;
		local147.aByteArray57 = this.aByteArray57;
		local147.aShortArray153 = this.aShortArray153;
		local147.aShortArray151 = this.aShortArray151;
		local147.aByte17 = this.aByte17;
		local147.aByteArray61 = this.aByteArray61;
		local147.aShortArray150 = this.aShortArray150;
		local147.aShortArray149 = this.aShortArray149;
		local147.aShortArray152 = this.aShortArray152;
		local147.aShortArray155 = this.aShortArray155;
		local147.aShortArray148 = this.aShortArray148;
		local147.aShortArray154 = this.aShortArray154;
		local147.aByteArray62 = this.aByteArray62;
		local147.aByteArray56 = this.aByteArray56;
		local147.aByteArray60 = this.aByteArray60;
		local147.aByteArray59 = this.aByteArray59;
		local147.aByteArray65 = this.aByteArray65;
		local147.anIntArray758 = this.anIntArray758;
		local147.anIntArray765 = this.anIntArray765;
		local147.anIntArrayArray44 = this.anIntArrayArray44;
		local147.anIntArrayArray45 = this.anIntArrayArray45;
		local147.aShort27 = this.aShort27;
		local147.aShort25 = this.aShort25;
		local147.aClass85Array1 = this.aClass85Array1;
		local147.aClass94Array1 = this.aClass94Array1;
		local147.aClass85Array2 = this.aClass85Array2;
		if (arg0 == 3) {
			local147.anIntArray760 = Static174.method3166(this.anIntArray760);
			local147.anIntArray763 = Static174.method3166(this.anIntArray763);
			local147.anIntArray756 = Static174.method3166(this.anIntArray756);
		} else {
			local147.anIntArray760 = this.anIntArray760;
			local147.anIntArray763 = new int[local147.anInt4748];
			local147.anIntArray756 = this.anIntArray756;
		}
		@Pc(326) int local326;
		@Pc(334) int local334;
		@Pc(341) int local341;
		@Pc(345) int local345;
		@Pc(349) int local349;
		@Pc(353) int local353;
		@Pc(357) int local357;
		@Pc(379) int local379;
		@Pc(405) int local405;
		@Pc(417) int local417;
		if (arg0 == 1) {
			for (local326 = 0; local326 < local147.anInt4748; local326++) {
				local334 = this.anIntArray760[local326] + arg4;
				local341 = this.anIntArray756[local326] + arg6;
				local345 = local334 & 0x7F;
				local349 = local341 & 0x7F;
				local353 = local334 >> 7;
				local357 = local341 >> 7;
				local379 = arg2[local353][local357] * (128 - local345) + arg2[local353 + 1][local357] * local345 >> 7;
				local405 = arg2[local353][local357 + 1] * (128 - local345) + arg2[local353 + 1][local357 + 1] * local345 >> 7;
				local417 = local379 * (128 - local349) + local405 * local349 >> 7;
				local147.anIntArray763[local326] = this.anIntArray763[local326] + local417 - arg5;
			}
		} else {
			@Pc(544) int local544;
			if (arg0 == 2) {
				for (local326 = 0; local326 < local147.anInt4748; local326++) {
					local334 = (this.anIntArray763[local326] << 16) / this.aShort28;
					if (local334 < arg1) {
						local341 = this.anIntArray760[local326] + arg4;
						local345 = this.anIntArray756[local326] + arg6;
						local349 = local341 & 0x7F;
						local353 = local345 & 0x7F;
						local357 = local341 >> 7;
						local379 = local345 >> 7;
						local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
						local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
						local544 = local405 * (128 - local353) + local417 * local353 >> 7;
						local147.anIntArray763[local326] = this.anIntArray763[local326] + (local544 - arg5) * (arg1 - local334) / arg1;
					} else {
						local147.anIntArray763[local326] = this.anIntArray763[local326];
					}
				}
			} else if (arg0 == 3) {
				local326 = (arg1 & 0xFF) * 4;
				local334 = (arg1 >> 8 & 0xFF) * 4;
				this.method3782(arg2, arg4, arg5, arg6, local326, local334);
			} else if (arg0 == 4) {
				local326 = this.aShort26 - this.aShort28;
				for (local334 = 0; local334 < this.anInt4748; local334++) {
					local341 = this.anIntArray760[local334] + arg4;
					local345 = this.anIntArray756[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local147.anIntArray763[local334] = this.anIntArray763[local334] + local544 + local326 - arg5;
				}
			} else if (arg0 == 5) {
				local326 = this.aShort26 - this.aShort28;
				for (local334 = 0; local334 < this.anInt4748; local334++) {
					local341 = this.anIntArray760[local334] + arg4;
					local345 = this.anIntArray756[local334] + arg6;
					local349 = local341 & 0x7F;
					local353 = local345 & 0x7F;
					local357 = local341 >> 7;
					local379 = local345 >> 7;
					local405 = arg2[local357][local379] * (128 - local349) + arg2[local357 + 1][local379] * local349 >> 7;
					local417 = arg2[local357][local379 + 1] * (128 - local349) + arg2[local357 + 1][local379 + 1] * local349 >> 7;
					local544 = local405 * (128 - local353) + local417 * local353 >> 7;
					local405 = arg3[local357][local379] * (128 - local349) + arg3[local357 + 1][local379] * local349 >> 7;
					local417 = arg3[local357][local379 + 1] * (128 - local349) + arg3[local357 + 1][local379 + 1] * local349 >> 7;
					@Pc(887) int local887 = local405 * (128 - local353) + local417 * local353 >> 7;
					@Pc(891) int local891 = local544 - local887;
					local147.anIntArray763[local334] = ((this.anIntArray763[local334] << 8) / local326 * local891 >> 8) - (arg5 - local544);
				}
			}
		}
		this.aBoolean205 = false;
		return local147;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIBSB)I")
	public int method3785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) byte arg4) {
		this.anIntArray762[this.anInt4747] = arg0;
		this.anIntArray761[this.anInt4747] = arg1;
		this.anIntArray764[this.anInt4747] = arg2;
		this.aByteArray63[this.anInt4747] = 1;
		this.aByteArray57[this.anInt4747] = -1;
		this.aShortArray153[this.anInt4747] = arg3;
		this.aShortArray151[this.anInt4747] = -1;
		this.aByteArray64[this.anInt4747] = arg4;
		return this.anInt4747++;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)I")
	public int method3786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4748; local1++) {
			if (this.anIntArray760[local1] == arg0 && this.anIntArray763[local1] == 0 && this.anIntArray756[local1] == arg1) {
				return local1;
			}
		}
		this.anIntArray760[this.anInt4748] = arg0;
		this.anIntArray763[this.anInt4748] = 0;
		this.anIntArray756[this.anInt4748] = arg1;
		return this.anInt4748++;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([B)V")
	private void method3787(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class2_Sub23 local8 = new Class2_Sub23(arg0);
		@Pc(13) Class2_Sub23 local13 = new Class2_Sub23(arg0);
		@Pc(18) Class2_Sub23 local18 = new Class2_Sub23(arg0);
		@Pc(23) Class2_Sub23 local23 = new Class2_Sub23(arg0);
		@Pc(28) Class2_Sub23 local28 = new Class2_Sub23(arg0);
		local8.anInt2703 = arg0.length - 18;
		@Pc(38) int local38 = local8.method2095();
		@Pc(42) int local42 = local8.method2095();
		@Pc(46) int local46 = local8.method2122();
		@Pc(50) int local50 = local8.method2122();
		@Pc(54) int local54 = local8.method2122();
		@Pc(58) int local58 = local8.method2122();
		@Pc(62) int local62 = local8.method2122();
		@Pc(66) int local66 = local8.method2122();
		@Pc(70) int local70 = local8.method2095();
		@Pc(74) int local74 = local8.method2095();
		@Pc(78) int local78 = local8.method2095();
		@Pc(82) int local82 = local8.method2095();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt4748 = local38;
		this.anInt4747 = local42;
		this.anInt4746 = local46;
		this.anIntArray760 = new int[local38];
		this.anIntArray763 = new int[local38];
		this.anIntArray756 = new int[local38];
		this.anIntArray762 = new int[local42];
		this.anIntArray761 = new int[local42];
		this.anIntArray764 = new int[local42];
		if (local46 > 0) {
			this.aByteArray61 = new byte[local46];
			this.aShortArray150 = new short[local46];
			this.aShortArray149 = new short[local46];
			this.aShortArray152 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray758 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray63 = new byte[local42];
			this.aByteArray57 = new byte[local42];
			this.aShortArray151 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray58 = new byte[local42];
		} else {
			this.aByte17 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray64 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray765 = new int[local42];
		}
		this.aShortArray153 = new short[local42];
		local8.anInt2703 = 0;
		local13.anInt2703 = local165;
		local18.anInt2703 = local171;
		local23.anInt2703 = local90;
		local28.anInt2703 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method2122();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method2135();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method2135();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method2135();
			}
			this.anIntArray760[local307] = local301 + local314;
			this.anIntArray763[local307] = local303 + local324;
			this.anIntArray756[local307] = local305 + local334;
			local301 = this.anIntArray760[local307];
			local303 = this.anIntArray763[local307];
			local305 = this.anIntArray756[local307];
			if (local66 == 1) {
				this.anIntArray758[local307] = local28.method2122();
			}
		}
		local8.anInt2703 = local149;
		local13.anInt2703 = local116;
		local18.anInt2703 = local98;
		local23.anInt2703 = local134;
		local28.anInt2703 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray153[local312] = (short) local8.method2095();
			if (local50 == 1) {
				local314 = local13.method2122();
				if ((local314 & 0x1) == 1) {
					this.aByteArray63[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray63[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray57[local312] = (byte) (local314 >> 2);
					this.aShortArray151[local312] = this.aShortArray153[local312];
					this.aShortArray153[local312] = 127;
					if (this.aShortArray151[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray57[local312] = -1;
					this.aShortArray151[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray58[local312] = local18.method2114();
			}
			if (local58 == 1) {
				this.aByteArray64[local312] = local23.method2114();
			}
			if (local62 == 1) {
				this.anIntArray765[local312] = local28.method2122();
			}
		}
		local8.anInt2703 = local143;
		local13.anInt2703 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method2122();
			if (local543 == 1) {
				local314 = local8.method2135() + local536;
				local324 = local8.method2135() + local314;
				local334 = local8.method2135() + local324;
				local536 = local334;
				this.anIntArray762[local538] = local314;
				this.anIntArray761[local538] = local324;
				this.anIntArray764[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method2135() + local536;
				local536 = local334;
				this.anIntArray762[local538] = local314;
				this.anIntArray761[local538] = local324;
				this.anIntArray764[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method2135() + local536;
				local536 = local334;
				this.anIntArray762[local538] = local314;
				this.anIntArray761[local538] = local324;
				this.anIntArray764[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method2135() + local536;
				local536 = local334;
				this.anIntArray762[local538] = local314;
				this.anIntArray761[local538] = local646;
				this.anIntArray764[local538] = local334;
			}
		}
		local8.anInt2703 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray61[local543] = 0;
			this.aShortArray150[local543] = (short) local8.method2095();
			this.aShortArray149[local543] = (short) local8.method2095();
			this.aShortArray152[local543] = (short) local8.method2095();
		}
		if (this.aByteArray57 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray57[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray150[local731] & 0xFFFF) == this.anIntArray762[local723] && (this.aShortArray149[local731] & 0xFFFF) == this.anIntArray761[local723] && (this.aShortArray152[local731] & 0xFFFF) == this.anIntArray764[local723]) {
						this.aByteArray57[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray57 = null;
			}
		}
		if (!local3) {
			this.aShortArray151 = null;
		}
		if (!local1) {
			this.aByteArray63 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
	public void method3788() {
		@Pc(3) int local3 = Static218.anIntArray759[256];
		@Pc(7) int local7 = Static218.anIntArray755[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4748; local9++) {
			@Pc(26) int local26 = this.anIntArray756[local9] * local3 + this.anIntArray760[local9] * local7 >> 16;
			this.anIntArray756[local9] = this.anIntArray756[local9] * local7 - this.anIntArray760[local9] * local3 >> 16;
			this.anIntArray760[local9] = local26;
		}
		this.method3798();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "()V")
	public void method3789() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4748; local1++) {
			this.anIntArray760[local1] = -this.anIntArray760[local1];
			this.anIntArray756[local1] = -this.anIntArray756[local1];
		}
		this.method3798();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V")
	public void method3790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg2 != 0) {
			local5 = Static218.anIntArray759[arg2];
			local9 = Static218.anIntArray755[arg2];
			for (local11 = 0; local11 < this.anInt4748; local11++) {
				local28 = this.anIntArray763[local11] * local5 + this.anIntArray760[local11] * local9 >> 16;
				this.anIntArray763[local11] = this.anIntArray763[local11] * local9 - this.anIntArray760[local11] * local5 >> 16;
				this.anIntArray760[local11] = local28;
			}
		}
		if (arg0 != 0) {
			local5 = Static218.anIntArray759[arg0];
			local9 = Static218.anIntArray755[arg0];
			for (local11 = 0; local11 < this.anInt4748; local11++) {
				local28 = this.anIntArray763[local11] * local9 - this.anIntArray756[local11] * local5 >> 16;
				this.anIntArray756[local11] = this.anIntArray763[local11] * local5 + this.anIntArray756[local11] * local9 >> 16;
				this.anIntArray763[local11] = local28;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local5 = Static218.anIntArray759[arg1];
		local9 = Static218.anIntArray755[arg1];
		for (local11 = 0; local11 < this.anInt4748; local11++) {
			local28 = this.anIntArray756[local11] * local5 + this.anIntArray760[local11] * local9 >> 16;
			this.anIntArray756[local11] = this.anIntArray756[local11] * local9 - this.anIntArray760[local11] * local5 >> 16;
			this.anIntArray760[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(SS)V")
	public void method3791(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray151 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt4747; local5++) {
			if (this.aShortArray151[local5] == arg0) {
				this.aShortArray151[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "()Z")
	@Override
	public boolean method3772() {
		return true;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "()V")
	public void method3792() {
		this.anIntArray758 = null;
		this.anIntArray765 = null;
		this.anIntArrayArray44 = null;
		this.anIntArrayArray45 = null;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!vj;I)I")
	private int method3793(@OriginalArg(0) Class5_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray760[arg1];
		@Pc(11) int local11 = arg0.anIntArray763[arg1];
		@Pc(16) int local16 = arg0.anIntArray756[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4748; local18++) {
			if (local6 == this.anIntArray760[local18] && local11 == this.anIntArray763[local18] && local16 == this.anIntArray756[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray760[this.anInt4748] = local6;
			this.anIntArray763[this.anInt4748] = local11;
			this.anIntArray756[this.anInt4748] = local16;
			if (arg0.anIntArray758 != null) {
				this.anIntArray758[this.anInt4748] = arg0.anIntArray758[arg1];
			}
			local1 = this.anInt4748++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(SS)V")
	public void method3794(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4747; local1++) {
			if (this.aShortArray153[local1] == arg0) {
				this.aShortArray153[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIIII)Lclient!qc;")
	public Class5_Sub3 method3795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class5_Sub3_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!qf;IIIZ)V")
	@Override
	public void method3771(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class5_Sub7 local2 = (Class5_Sub7) arg0;
		local2.method3796();
		local2.method3805();
		Static218.anInt4745++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray760;
		@Pc(18) int local18 = local2.anInt4748;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt4748; local20++) {
			@Pc(26) Class85 local26 = this.aClass85Array1[local20];
			if (local26.anInt4290 != 0) {
				local36 = this.anIntArray763[local20] - arg2;
				if (local36 >= local2.aShort28 && local36 <= local2.aShort26) {
					@Pc(52) int local52 = this.anIntArray760[local20] - arg1;
					if (local52 >= local2.aShort29 && local52 <= local2.aShort30) {
						@Pc(68) int local68 = this.anIntArray756[local20] - arg3;
						if (local68 >= local2.aShort32 && local68 <= local2.aShort31) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class85 local85 = local2.aClass85Array1[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray756[local79] && local36 == local2.anIntArray763[local79] && local85.anInt4290 != 0) {
									if (this.aClass85Array2 == null) {
										this.aClass85Array2 = new Class85[this.anInt4748];
									}
									if (local2.aClass85Array2 == null) {
										local2.aClass85Array2 = new Class85[local18];
									}
									@Pc(125) Class85 local125 = this.aClass85Array2[local20];
									if (local125 == null) {
										local125 = this.aClass85Array2[local20] = new Class85(local26);
									}
									@Pc(142) Class85 local142 = local2.aClass85Array2[local79];
									if (local142 == null) {
										local142 = local2.aClass85Array2[local79] = new Class85(local85);
									}
									local125.anInt4286 += local85.anInt4286;
									local125.anInt4289 += local85.anInt4289;
									local125.anInt4287 += local85.anInt4287;
									local125.anInt4290 += local85.anInt4290;
									local142.anInt4286 += local26.anInt4286;
									local142.anInt4289 += local26.anInt4289;
									local142.anInt4287 += local26.anInt4287;
									local142.anInt4290 += local26.anInt4290;
									local12++;
									Static218.anIntArray766[local20] = Static218.anInt4745;
									Static218.anIntArray757[local79] = Static218.anInt4745;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (@Pc(236) int local236 = 0; local236 < this.anInt4747; local236++) {
			if (Static218.anIntArray766[this.anIntArray762[local236]] == Static218.anInt4745 && Static218.anIntArray766[this.anIntArray761[local236]] == Static218.anInt4745 && Static218.anIntArray766[this.anIntArray764[local236]] == Static218.anInt4745) {
				if (this.aByteArray63 == null) {
					this.aByteArray63 = new byte[this.anInt4747];
				}
				this.aByteArray63[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt4747; local36++) {
			if (Static218.anIntArray757[local2.anIntArray762[local36]] == Static218.anInt4745 && Static218.anIntArray757[local2.anIntArray761[local36]] == Static218.anInt4745 && Static218.anIntArray757[local2.anIntArray764[local36]] == Static218.anInt4745) {
				if (local2.aByteArray63 == null) {
					local2.aByteArray63 = new byte[local2.anInt4747];
				}
				local2.aByteArray63[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "()V")
	private void method3796() {
		if (this.aBoolean205) {
			return;
		}
		this.aBoolean205 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt4748; local20++) {
			@Pc(26) int local26 = this.anIntArray760[local20];
			@Pc(31) int local31 = this.anIntArray763[local20];
			@Pc(36) int local36 = this.anIntArray756[local20];
			if (local26 < local8) {
				local8 = local26;
			}
			if (local26 > local14) {
				local14 = local26;
			}
			if (local31 < local10) {
				local10 = local31;
			}
			if (local31 > local16) {
				local16 = local31;
			}
			if (local36 < local12) {
				local12 = local36;
			}
			if (local36 > local18) {
				local18 = local36;
			}
		}
		this.aShort29 = (short) local8;
		this.aShort30 = (short) local14;
		this.aShort28 = (short) local10;
		this.aShort26 = (short) local16;
		this.aShort32 = (short) local12;
		this.aShort31 = (short) local18;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "()V")
	private void method3798() {
		this.aClass85Array1 = null;
		this.aClass85Array2 = null;
		this.aClass94Array1 = null;
		this.aBoolean205 = false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Lclient!qf;")
	@Override
	public Class5 method3781() {
		return this.method3795(this.aShort27, this.aShort25, -50, -10, -50);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "()I")
	@Override
	public int method3773() {
		if (!this.aBoolean205) {
			this.method3796();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(III)V")
	public void method3799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4748; local1++) {
			this.anIntArray760[local1] += arg0;
			this.anIntArray763[local1] += arg1;
			this.anIntArray756[local1] += arg2;
		}
		this.method3798();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIIII)Lclient!hf;")
	public Class5_Sub3_Sub1 method3800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class5_Sub3_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	private void method3801(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static218.anIntArray759[arg0];
		@Pc(7) int local7 = Static218.anIntArray755[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4748; local9++) {
			@Pc(26) int local26 = this.anIntArray763[local9] * local7 - this.anIntArray756[local9] * local3 >> 16;
			this.anIntArray756[local9] = this.anIntArray763[local9] * local3 + this.anIntArray756[local9] * local7 >> 16;
			this.anIntArray763[local9] = local26;
		}
		this.method3798();
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(III)V")
	public void method3802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4748; local1++) {
			this.anIntArray760[local1] = this.anIntArray760[local1] * arg0 / 128;
			this.anIntArray763[local1] = this.anIntArray763[local1] * arg1 / 128;
			this.anIntArray756[local1] = this.anIntArray756[local1] * arg2 / 128;
		}
		this.method3798();
	}

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "()V")
	public void method3803() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4748; local1++) {
			@Pc(7) int local7 = this.anIntArray756[local1];
			this.anIntArray756[local1] = this.anIntArray760[local1];
			this.anIntArray760[local1] = -local7;
		}
		this.method3798();
	}

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "()V")
	public void method3804() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray758 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt4748; local9++) {
				local15 = this.anIntArray758[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray44 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray44[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt4748) {
				local65 = this.anIntArray758[local59];
				this.anIntArrayArray44[local65][local5[local65]++] = local59++;
			}
			this.anIntArray758 = null;
		}
		if (this.anIntArray765 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt4747; local9++) {
			local15 = this.anIntArray765[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray45 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray45[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt4747) {
			local65 = this.anIntArray765[local59];
			this.anIntArrayArray45[local65][local5[local65]++] = local59++;
		}
		this.anIntArray765 = null;
	}

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "()V")
	public void method3805() {
		if (this.aClass85Array1 != null) {
			return;
		}
		this.aClass85Array1 = new Class85[this.anInt4748];
		for (@Pc(10) int local10 = 0; local10 < this.anInt4748; local10++) {
			this.aClass85Array1[local10] = new Class85();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4747; local25++) {
			@Pc(31) int local31 = this.anIntArray762[local25];
			@Pc(36) int local36 = this.anIntArray761[local25];
			@Pc(41) int local41 = this.anIntArray764[local25];
			@Pc(51) int local51 = this.anIntArray760[local36] - this.anIntArray760[local31];
			@Pc(61) int local61 = this.anIntArray763[local36] - this.anIntArray763[local31];
			@Pc(71) int local71 = this.anIntArray756[local36] - this.anIntArray756[local31];
			@Pc(81) int local81 = this.anIntArray760[local41] - this.anIntArray760[local31];
			@Pc(91) int local91 = this.anIntArray763[local41] - this.anIntArray763[local31];
			@Pc(101) int local101 = this.anIntArray756[local41] - this.anIntArray756[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray63 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray63[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class85 local211 = this.aClass85Array1[local31];
				local211.anInt4286 += local109;
				local211.anInt4289 += local117;
				local211.anInt4287 += local125;
				local211.anInt4290++;
				@Pc(240) Class85 local240 = this.aClass85Array1[local36];
				local240.anInt4286 += local109;
				local240.anInt4289 += local117;
				local240.anInt4287 += local125;
				local240.anInt4290++;
				@Pc(269) Class85 local269 = this.aClass85Array1[local41];
				local269.anInt4286 += local109;
				local269.anInt4289 += local117;
				local269.anInt4287 += local125;
				local269.anInt4290++;
			} else if (local198 == 1) {
				if (this.aClass94Array1 == null) {
					this.aClass94Array1 = new Class94[this.anInt4747];
				}
				@Pc(314) Class94 local314 = this.aClass94Array1[local25] = new Class94();
				local314.anInt4465 = local109;
				local314.anInt4468 = local117;
				local314.anInt4470 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "([B)V")
	private void method3806(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub23 local4 = new Class2_Sub23(arg0);
		@Pc(9) Class2_Sub23 local9 = new Class2_Sub23(arg0);
		@Pc(14) Class2_Sub23 local14 = new Class2_Sub23(arg0);
		@Pc(19) Class2_Sub23 local19 = new Class2_Sub23(arg0);
		@Pc(24) Class2_Sub23 local24 = new Class2_Sub23(arg0);
		@Pc(29) Class2_Sub23 local29 = new Class2_Sub23(arg0);
		@Pc(34) Class2_Sub23 local34 = new Class2_Sub23(arg0);
		local4.anInt2703 = arg0.length - 23;
		@Pc(44) int local44 = local4.method2095();
		@Pc(48) int local48 = local4.method2095();
		@Pc(52) int local52 = local4.method2122();
		@Pc(56) int local56 = local4.method2122();
		@Pc(60) int local60 = local4.method2122();
		@Pc(64) int local64 = local4.method2122();
		@Pc(68) int local68 = local4.method2122();
		@Pc(72) int local72 = local4.method2122();
		@Pc(76) int local76 = local4.method2122();
		@Pc(80) int local80 = local4.method2095();
		@Pc(84) int local84 = local4.method2095();
		@Pc(88) int local88 = local4.method2095();
		@Pc(92) int local92 = local4.method2095();
		@Pc(96) int local96 = local4.method2095();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray61 = new byte[local52];
			local4.anInt2703 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray61[local113] = local4.method2114();
				if (local123 == 0) {
					local98++;
				}
				if (local123 >= 1 && local123 <= 3) {
					local100++;
				}
				if (local123 == 2) {
					local102++;
				}
			}
		}
		local113 = local52 + local44;
		@Pc(151) int local151 = local113;
		if (local56 == 1) {
			local113 += local48;
		}
		@Pc(160) int local160 = local113;
		local113 += local48;
		@Pc(166) int local166 = local113;
		if (local60 == 255) {
			local113 += local48;
		}
		@Pc(175) int local175 = local113;
		if (local68 == 1) {
			local113 += local48;
		}
		@Pc(184) int local184 = local113;
		if (local76 == 1) {
			local113 += local44;
		}
		@Pc(193) int local193 = local113;
		if (local64 == 1) {
			local113 += local48;
		}
		@Pc(202) int local202 = local113;
		local113 += local92;
		@Pc(208) int local208 = local113;
		if (local72 == 1) {
			local113 += local48 * 2;
		}
		@Pc(219) int local219 = local113;
		local113 += local96;
		@Pc(225) int local225 = local113;
		local113 += local48 * 2;
		@Pc(233) int local233 = local113;
		local113 += local80;
		@Pc(239) int local239 = local113;
		local113 += local84;
		@Pc(245) int local245 = local113;
		local113 += local88;
		@Pc(251) int local251 = local113;
		local113 += local98 * 6;
		@Pc(259) int local259 = local113;
		local113 += local100 * 6;
		@Pc(267) int local267 = local113;
		local113 += local100 * 6;
		@Pc(275) int local275 = local113;
		local113 += local100;
		@Pc(281) int local281 = local113;
		local113 += local100;
		this.anInt4748 = local44;
		this.anInt4747 = local48;
		this.anInt4746 = local52;
		this.anIntArray760 = new int[local44];
		this.anIntArray763 = new int[local44];
		this.anIntArray756 = new int[local44];
		this.anIntArray762 = new int[local48];
		this.anIntArray761 = new int[local48];
		this.anIntArray764 = new int[local48];
		if (local76 == 1) {
			this.anIntArray758 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray63 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray58 = new byte[local48];
		} else {
			this.aByte17 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray64 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray765 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray151 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray57 = new byte[local48];
		}
		this.aShortArray153 = new short[local48];
		if (local52 > 0) {
			this.aShortArray150 = new short[local52];
			this.aShortArray149 = new short[local52];
			this.aShortArray152 = new short[local52];
			if (local100 > 0) {
				this.aShortArray155 = new short[local100];
				this.aShortArray148 = new short[local100];
				this.aShortArray154 = new short[local100];
				this.aByteArray62 = new byte[local100];
				this.aByteArray56 = new byte[local100];
				this.aByteArray60 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray59 = new byte[local102];
				this.aByteArray65 = new byte[local102];
			}
		}
		local4.anInt2703 = local52;
		local9.anInt2703 = local233;
		local14.anInt2703 = local239;
		local19.anInt2703 = local245;
		local24.anInt2703 = local184;
		@Pc(455) int local455 = 0;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(466) int local466;
		@Pc(468) int local468;
		@Pc(478) int local478;
		@Pc(488) int local488;
		for (@Pc(461) int local461 = 0; local461 < local44; local461++) {
			local466 = local4.method2122();
			local468 = 0;
			if ((local466 & 0x1) != 0) {
				local468 = local9.method2135();
			}
			local478 = 0;
			if ((local466 & 0x2) != 0) {
				local478 = local14.method2135();
			}
			local488 = 0;
			if ((local466 & 0x4) != 0) {
				local488 = local19.method2135();
			}
			this.anIntArray760[local461] = local455 + local468;
			this.anIntArray763[local461] = local457 + local478;
			this.anIntArray756[local461] = local459 + local488;
			local455 = this.anIntArray760[local461];
			local457 = this.anIntArray763[local461];
			local459 = this.anIntArray756[local461];
			if (local76 == 1) {
				this.anIntArray758[local461] = local24.method2122();
			}
		}
		local4.anInt2703 = local225;
		local9.anInt2703 = local151;
		local14.anInt2703 = local166;
		local19.anInt2703 = local193;
		local24.anInt2703 = local175;
		local29.anInt2703 = local208;
		local34.anInt2703 = local219;
		for (local466 = 0; local466 < local48; local466++) {
			this.aShortArray153[local466] = (short) local4.method2095();
			if (local56 == 1) {
				this.aByteArray63[local466] = local9.method2114();
			}
			if (local60 == 255) {
				this.aByteArray58[local466] = local14.method2114();
			}
			if (local64 == 1) {
				this.aByteArray64[local466] = local19.method2114();
			}
			if (local68 == 1) {
				this.anIntArray765[local466] = local24.method2122();
			}
			if (local72 == 1) {
				this.aShortArray151[local466] = (short) (local29.method2095() - 1);
			}
			if (this.aByteArray57 != null) {
				if (this.aShortArray151[local466] == -1) {
					this.aByteArray57[local466] = -1;
				} else {
					this.aByteArray57[local466] = (byte) (local34.method2122() - 1);
				}
			}
		}
		local4.anInt2703 = local202;
		local9.anInt2703 = local160;
		local468 = 0;
		local478 = 0;
		local488 = 0;
		@Pc(674) int local674 = 0;
		@Pc(681) int local681;
		@Pc(784) int local784;
		for (@Pc(676) int local676 = 0; local676 < local48; local676++) {
			local681 = local9.method2122();
			if (local681 == 1) {
				local468 = local4.method2135() + local674;
				local478 = local4.method2135() + local468;
				local488 = local4.method2135() + local478;
				local674 = local488;
				this.anIntArray762[local676] = local468;
				this.anIntArray761[local676] = local478;
				this.anIntArray764[local676] = local488;
			}
			if (local681 == 2) {
				local478 = local488;
				local488 = local4.method2135() + local674;
				local674 = local488;
				this.anIntArray762[local676] = local468;
				this.anIntArray761[local676] = local478;
				this.anIntArray764[local676] = local488;
			}
			if (local681 == 3) {
				local468 = local488;
				local488 = local4.method2135() + local674;
				local674 = local488;
				this.anIntArray762[local676] = local468;
				this.anIntArray761[local676] = local478;
				this.anIntArray764[local676] = local488;
			}
			if (local681 == 4) {
				local784 = local468;
				local468 = local478;
				local478 = local784;
				local488 = local4.method2135() + local674;
				local674 = local488;
				this.anIntArray762[local676] = local468;
				this.anIntArray761[local676] = local784;
				this.anIntArray764[local676] = local488;
			}
		}
		local4.anInt2703 = local251;
		local9.anInt2703 = local259;
		local14.anInt2703 = local267;
		local19.anInt2703 = local275;
		local24.anInt2703 = local281;
		local29.anInt2703 = local113;
		for (local681 = 0; local681 < local52; local681++) {
			local784 = this.aByteArray61[local681] & 0xFF;
			if (local784 == 0) {
				this.aShortArray150[local681] = (short) local4.method2095();
				this.aShortArray149[local681] = (short) local4.method2095();
				this.aShortArray152[local681] = (short) local4.method2095();
			}
			if (local784 == 1) {
				this.aShortArray150[local681] = (short) local9.method2095();
				this.aShortArray149[local681] = (short) local9.method2095();
				this.aShortArray152[local681] = (short) local9.method2095();
				this.aShortArray155[local681] = (short) local14.method2095();
				this.aShortArray148[local681] = (short) local14.method2095();
				this.aShortArray154[local681] = (short) local14.method2095();
				this.aByteArray62[local681] = local19.method2114();
				this.aByteArray56[local681] = local24.method2114();
				this.aByteArray60[local681] = local29.method2114();
			}
			if (local784 == 2) {
				this.aShortArray150[local681] = (short) local9.method2095();
				this.aShortArray149[local681] = (short) local9.method2095();
				this.aShortArray152[local681] = (short) local9.method2095();
				this.aShortArray155[local681] = (short) local14.method2095();
				this.aShortArray148[local681] = (short) local14.method2095();
				this.aShortArray154[local681] = (short) local14.method2095();
				this.aByteArray62[local681] = local19.method2114();
				this.aByteArray56[local681] = local24.method2114();
				this.aByteArray60[local681] = local29.method2114();
				this.aByteArray59[local681] = local29.method2114();
				this.aByteArray65[local681] = local29.method2114();
			}
			if (local784 == 3) {
				this.aShortArray150[local681] = (short) local9.method2095();
				this.aShortArray149[local681] = (short) local9.method2095();
				this.aShortArray152[local681] = (short) local9.method2095();
				this.aShortArray155[local681] = (short) local14.method2095();
				this.aShortArray148[local681] = (short) local14.method2095();
				this.aShortArray154[local681] = (short) local14.method2095();
				this.aByteArray62[local681] = local19.method2114();
				this.aByteArray56[local681] = local24.method2114();
				this.aByteArray60[local681] = local29.method2114();
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
	private void method3808(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static218.anIntArray759[arg0];
		@Pc(7) int local7 = Static218.anIntArray755[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt4748; local9++) {
			@Pc(26) int local26 = this.anIntArray763[local9] * local3 + this.anIntArray760[local9] * local7 >> 16;
			this.anIntArray763[local9] = this.anIntArray763[local9] * local7 - this.anIntArray760[local9] * local3 >> 16;
			this.anIntArray760[local9] = local26;
		}
		this.method3798();
	}

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "()V")
	public void method3809() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4748; local1++) {
			this.anIntArray756[local1] = -this.anIntArray756[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt4747; local18++) {
			@Pc(24) int local24 = this.anIntArray762[local18];
			this.anIntArray762[local18] = this.anIntArray764[local18];
			this.anIntArray764[local18] = local24;
		}
		this.method3798();
	}

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "()Lclient!vj;")
	public Class5_Sub7 method3810() {
		@Pc(3) Class5_Sub7 local3 = new Class5_Sub7();
		if (this.aByteArray63 != null) {
			local3.aByteArray63 = new byte[this.anInt4747];
			for (@Pc(13) int local13 = 0; local13 < this.anInt4747; local13++) {
				local3.aByteArray63[local13] = this.aByteArray63[local13];
			}
		}
		local3.anInt4748 = this.anInt4748;
		local3.anInt4747 = this.anInt4747;
		local3.anInt4746 = this.anInt4746;
		local3.anIntArray760 = this.anIntArray760;
		local3.anIntArray763 = this.anIntArray763;
		local3.anIntArray756 = this.anIntArray756;
		local3.anIntArray762 = this.anIntArray762;
		local3.anIntArray761 = this.anIntArray761;
		local3.anIntArray764 = this.anIntArray764;
		local3.aByteArray58 = this.aByteArray58;
		local3.aByteArray64 = this.aByteArray64;
		local3.aByteArray57 = this.aByteArray57;
		local3.aShortArray153 = this.aShortArray153;
		local3.aShortArray151 = this.aShortArray151;
		local3.aByte17 = this.aByte17;
		local3.aByteArray61 = this.aByteArray61;
		local3.aShortArray150 = this.aShortArray150;
		local3.aShortArray149 = this.aShortArray149;
		local3.aShortArray152 = this.aShortArray152;
		local3.aShortArray155 = this.aShortArray155;
		local3.aShortArray148 = this.aShortArray148;
		local3.aShortArray154 = this.aShortArray154;
		local3.aByteArray62 = this.aByteArray62;
		local3.aByteArray56 = this.aByteArray56;
		local3.aByteArray60 = this.aByteArray60;
		local3.aByteArray59 = this.aByteArray59;
		local3.aByteArray65 = this.aByteArray65;
		local3.anIntArray758 = this.anIntArray758;
		local3.anIntArray765 = this.anIntArray765;
		local3.anIntArrayArray44 = this.anIntArrayArray44;
		local3.anIntArrayArray45 = this.anIntArrayArray45;
		local3.aClass85Array1 = this.aClass85Array1;
		local3.aClass94Array1 = this.aClass94Array1;
		local3.aShort27 = this.aShort27;
		local3.aShort25 = this.aShort25;
		return local3;
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "()V")
	public void method3811() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4748; local1++) {
			@Pc(7) int local7 = this.anIntArray760[local1];
			this.anIntArray760[local1] = this.anIntArray756[local1];
			this.anIntArray756[local1] = -local7;
		}
		this.method3798();
	}
}
