import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class78 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "[S")
	public short[] aShortArray26;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "[Lclient!in;")
	public Class119[] aClass119Array1;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "[Lclient!gq;")
	public Class94[] aClass94Array1;

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!fl", name = "X", descriptor = "[Lclient!db;")
	public Class43[] aClass43Array1;

	@OriginalMember(owner = "client!fl", name = "Z", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!fl", name = "bb", descriptor = "[S")
	public short[] aShortArray35;

	@OriginalMember(owner = "client!fl", name = "cb", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	public int anInt2406 = 0;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "B")
	public byte aByte37 = 0;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
	public int anInt2404 = 12;

	@OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
	public int anInt2414 = 0;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
	public int anInt2409 = 0;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	public int anInt2402 = 0;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([B)V")
	public Class78(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1984(arg0);
		} else {
			this.method1975(arg0);
		}
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(III)V")
	public Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 0) {
			this.aByteArray37 = new byte[arg2];
			this.anIntArray147 = new int[arg2];
			this.aShortArray31 = new short[arg2];
			this.anIntArray154 = new int[arg2];
			this.anIntArray153 = new int[arg2];
			this.aByteArray36 = new byte[arg2];
			this.anIntArray146 = new int[arg2];
			this.anIntArray152 = new int[arg2];
			this.aShortArray30 = new short[arg2];
			this.aShortArray26 = new short[arg2];
			this.aByteArray35 = new byte[arg2];
			this.anIntArray144 = new int[arg2];
		}
		this.anIntArray145 = new int[arg0];
		this.aByteArray33 = new byte[arg1];
		this.aShortArray34 = new short[arg1];
		this.aShortArray35 = new short[arg1];
		this.anIntArray151 = new int[arg0];
		this.aShortArray29 = new short[arg1];
		this.aByteArray32 = new byte[arg1];
		this.aByteArray34 = new byte[arg1];
		this.aByteArray31 = new byte[arg1];
		this.aShortArray28 = new short[arg1];
		this.anIntArray148 = new int[arg1];
		this.anIntArray149 = new int[arg0];
		this.aShortArray32 = new short[arg1];
		this.anIntArray150 = new int[arg0];
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "([Lclient!fl;I)V")
	public Class78(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2409 = 0;
		this.anInt2414 = 0;
		this.anInt2402 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte37 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class78 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt2414 += local59.anInt2414;
				this.anInt2409 += local59.anInt2409;
				this.anInt2402 += local59.anInt2402;
				if (local59.aClass119Array1 != null) {
					local32 += local59.aClass119Array1.length;
				}
				local38 |= local59.aByteArray33 != null;
				if (local59.aClass94Array1 != null) {
					local34 += local59.aClass94Array1.length;
				}
				if (local59.aClass43Array1 != null) {
					local36 += local59.aClass43Array1.length;
				}
				if (local59.aByteArray31 == null) {
					if (this.aByte37 == -1) {
						this.aByte37 = local59.aByte37;
					}
					if (this.aByte37 != local59.aByte37) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray32 != null;
				local46 |= local59.aShortArray34 != null;
				local48 |= local59.anIntArray148 != null;
				local44 |= local59.aByteArray34 != null;
			}
		}
		this.anIntArray149 = new int[this.anInt2409];
		this.aShortArray33 = new short[this.anInt2414];
		if (local46) {
			this.aShortArray34 = new short[this.anInt2414];
		}
		this.anIntArray151 = new int[this.anInt2409];
		this.aShortArray35 = new short[this.anInt2414];
		this.aShortArray29 = new short[this.anInt2414];
		if (this.anInt2402 > 0) {
			this.anIntArray152 = new int[this.anInt2402];
			this.aShortArray30 = new short[this.anInt2402];
			this.aByteArray37 = new byte[this.anInt2402];
			this.aShortArray26 = new short[this.anInt2402];
			this.aByteArray36 = new byte[this.anInt2402];
			this.aByteArray35 = new byte[this.anInt2402];
			this.anIntArray153 = new int[this.anInt2402];
			this.aShortArray31 = new short[this.anInt2402];
			this.anIntArray147 = new int[this.anInt2402];
			this.anIntArray146 = new int[this.anInt2402];
			this.anIntArray154 = new int[this.anInt2402];
			this.anIntArray144 = new int[this.anInt2402];
		}
		if (local34 > 0) {
			this.aClass94Array1 = new Class94[local34];
		}
		if (local38) {
			this.aByteArray33 = new byte[this.anInt2414];
		}
		if (local32 > 0) {
			this.aClass119Array1 = new Class119[local32];
		}
		this.anIntArray145 = new int[this.anInt2409];
		if (local40) {
			this.aByteArray31 = new byte[this.anInt2414];
		}
		this.aShortArray27 = new short[this.anInt2409];
		this.anIntArray150 = new int[this.anInt2409];
		if (local48) {
			this.anIntArray148 = new int[this.anInt2414];
		}
		this.aShortArray32 = new short[this.anInt2414];
		if (local42) {
			this.aByteArray32 = new byte[this.anInt2414];
		}
		if (local36 > 0) {
			this.aClass43Array1 = new Class43[local36];
		}
		this.aShortArray28 = new short[this.anInt2414];
		if (local44) {
			this.aByteArray34 = new byte[this.anInt2414];
		}
		local36 = 0;
		this.anInt2414 = 0;
		local32 = 0;
		this.anInt2402 = 0;
		local34 = 0;
		this.anInt2409 = 0;
		@Pc(613) int local613;
		@Pc(624) int local624;
		for (@Pc(376) int local376 = 0; local376 < arg1; local376++) {
			@Pc(383) short local383 = (short) (0x1 << local376);
			@Pc(387) Class78 local387 = arg0[local376];
			if (local387 != null) {
				@Pc(394) int local394;
				if (local387.aClass43Array1 != null) {
					for (local394 = 0; local394 < local387.aClass43Array1.length; local394++) {
						@Pc(401) Class43 local401 = local387.aClass43Array1[local394];
						this.aClass43Array1[local36++] = local401.method1341(local401.anInt1709 + this.anInt2414);
					}
				}
				for (local394 = 0; local394 < local387.anInt2414; local394++) {
					if (local38 && local387.aByteArray33 != null) {
						this.aByteArray33[this.anInt2414] = local387.aByteArray33[local394];
					}
					if (local40) {
						if (local387.aByteArray31 == null) {
							this.aByteArray31[this.anInt2414] = local387.aByte37;
						} else {
							this.aByteArray31[this.anInt2414] = local387.aByteArray31[local394];
						}
					}
					if (local42 && local387.aByteArray32 != null) {
						this.aByteArray32[this.anInt2414] = local387.aByteArray32[local394];
					}
					if (local46) {
						if (local387.aShortArray34 == null) {
							this.aShortArray34[this.anInt2414] = -1;
						} else {
							this.aShortArray34[this.anInt2414] = local387.aShortArray34[local394];
						}
					}
					if (local48) {
						if (local387.anIntArray148 == null) {
							this.anIntArray148[this.anInt2414] = -1;
						} else {
							this.anIntArray148[this.anInt2414] = local387.anIntArray148[local394];
						}
					}
					this.aShortArray32[this.anInt2414] = (short) this.method1979(local387, local383, local387.aShortArray32[local394]);
					this.aShortArray35[this.anInt2414] = (short) this.method1979(local387, local383, local387.aShortArray35[local394]);
					this.aShortArray28[this.anInt2414] = (short) this.method1979(local387, local383, local387.aShortArray28[local394]);
					this.aShortArray33[this.anInt2414] = local383;
					this.aShortArray29[this.anInt2414] = local387.aShortArray29[local394];
					this.anInt2414++;
				}
				@Pc(600) int local600;
				if (local387.aClass119Array1 != null) {
					for (local600 = 0; local600 < local387.aClass119Array1.length; local600++) {
						local613 = this.method1979(local387, local383, local387.aClass119Array1[local600].anInt3446);
						local624 = this.method1979(local387, local383, local387.aClass119Array1[local600].anInt3458);
						@Pc(635) int local635 = this.method1979(local387, local383, local387.aClass119Array1[local600].anInt3459);
						this.aClass119Array1[local32] = local387.aClass119Array1[local600].method2862(local635, local613, local624);
						local32++;
					}
				}
				if (local387.aClass94Array1 != null) {
					for (local600 = 0; local600 < local387.aClass94Array1.length; local600++) {
						local613 = this.method1979(local387, local383, local387.aClass94Array1[local600].anInt2880);
						this.aClass94Array1[local34] = local387.aClass94Array1[local600].method2408(local613);
						local34++;
					}
				}
			}
		}
		@Pc(705) int local705 = 0;
		this.anInt2406 = this.anInt2409;
		for (@Pc(711) int local711 = 0; local711 < arg1; local711++) {
			@Pc(718) short local718 = (short) (0x1 << local711);
			@Pc(722) Class78 local722 = arg0[local711];
			if (local722 != null) {
				for (local613 = 0; local613 < local722.anInt2414; local613++) {
					if (local44) {
						this.aByteArray34[local705++] = (byte) (local722.aByteArray34 == null || local722.aByteArray34[local613] == -1 ? -1 : this.anInt2402 + local722.aByteArray34[local613]);
					}
				}
				for (local624 = 0; local624 < local722.anInt2402; local624++) {
					@Pc(778) byte local778 = this.aByteArray35[this.anInt2402] = local722.aByteArray35[local624];
					if (local778 == 0) {
						this.aShortArray31[this.anInt2402] = (short) this.method1979(local722, local718, local722.aShortArray31[local624]);
						this.aShortArray30[this.anInt2402] = (short) this.method1979(local722, local718, local722.aShortArray30[local624]);
						this.aShortArray26[this.anInt2402] = (short) this.method1979(local722, local718, local722.aShortArray26[local624]);
					}
					if (local778 >= 1 && local778 <= 3) {
						this.aShortArray31[this.anInt2402] = local722.aShortArray31[local624];
						this.aShortArray30[this.anInt2402] = local722.aShortArray30[local624];
						this.aShortArray26[this.anInt2402] = local722.aShortArray26[local624];
						this.anIntArray154[this.anInt2402] = local722.anIntArray154[local624];
						this.anIntArray146[this.anInt2402] = local722.anIntArray146[local624];
						this.anIntArray153[this.anInt2402] = local722.anIntArray153[local624];
						this.aByteArray37[this.anInt2402] = local722.aByteArray37[local624];
						this.aByteArray36[this.anInt2402] = local722.aByteArray36[local624];
						this.anIntArray147[this.anInt2402] = local722.anIntArray147[local624];
					}
					if (local778 == 2) {
						this.anIntArray144[this.anInt2402] = local722.anIntArray144[local624];
						this.anIntArray152[this.anInt2402] = local722.anIntArray152[local624];
					}
					this.anInt2402++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
	public void method1969() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2409; local7++) {
			this.anIntArray145[local7] <<= 0x0;
			this.anIntArray149[local7] <<= 0x0;
			this.anIntArray151[local7] <<= 0x0;
		}
		if (this.anInt2402 <= 0 || this.anIntArray154 == null) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < this.anIntArray154.length; local53++) {
			this.anIntArray154[local53] <<= 0x0;
			this.anIntArray146[local53] <<= 0x0;
			if (this.aByteArray35[local53] != 1) {
				this.anIntArray153[local53] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(SSB)V")
	public void method1970(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray34 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt2414; local11++) {
			if (arg1 == this.aShortArray34[local11]) {
				this.aShortArray34[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(SISBIBBBI)I")
	public int method1971(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray32[this.anInt2414] = (short) arg4;
		this.aShortArray35[this.anInt2414] = (short) arg7;
		this.aShortArray28[this.anInt2414] = (short) arg1;
		this.aByteArray33[this.anInt2414] = arg5;
		this.aByteArray34[this.anInt2414] = arg6;
		this.aShortArray29[this.anInt2414] = arg0;
		this.aByteArray32[this.anInt2414] = arg3;
		this.aShortArray34[this.anInt2414] = arg2;
		return this.anInt2414++;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)I")
	public int method1972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2409; local13++) {
			if (arg1 == this.anIntArray145[local13] && this.anIntArray149[local13] == arg2 && arg0 == this.anIntArray151[local13]) {
				return local13;
			}
		}
		this.anIntArray145[this.anInt2409] = arg1;
		this.anIntArray149[this.anInt2409] = arg2;
		this.anIntArray151[this.anInt2409] = arg0;
		this.anInt2406 = this.anInt2409 + 1;
		return this.anInt2409++;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)[[I")
	public int[][] method1973() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2406; local12++) {
			@Pc(19) int local19 = this.anIntArray150[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(68) int local68 = 0; local68 < this.anInt2406; local68++) {
			@Pc(75) int local75 = this.anIntArray150[local68];
			if (local75 >= 0) {
				local47[local75][local8[local75]++] = local68;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ISS)V")
	public void method1974(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2414; local15++) {
			if (arg0 == this.aShortArray29[local15]) {
				this.aShortArray29[local15] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B[B)V")
	private void method1975(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub1 local14 = new Class6_Sub1(arg0);
		@Pc(19) Class6_Sub1 local19 = new Class6_Sub1(arg0);
		@Pc(24) Class6_Sub1 local24 = new Class6_Sub1(arg0);
		@Pc(29) Class6_Sub1 local29 = new Class6_Sub1(arg0);
		@Pc(34) Class6_Sub1 local34 = new Class6_Sub1(arg0);
		local14.anInt7898 = arg0.length - 18;
		this.anInt2409 = local14.method6485();
		this.anInt2414 = local14.method6485();
		this.anInt2402 = local14.method6433();
		@Pc(59) int local59 = local14.method6433();
		@Pc(63) int local63 = local14.method6433();
		@Pc(67) int local67 = local14.method6433();
		@Pc(71) int local71 = local14.method6433();
		@Pc(75) int local75 = local14.method6433();
		@Pc(79) int local79 = local14.method6485();
		@Pc(83) int local83 = local14.method6485();
		@Pc(87) int local87 = local14.method6485();
		@Pc(91) int local91 = local14.method6485();
		@Pc(100) int local100 = this.anInt2409;
		@Pc(102) int local102 = local100;
		local100 += this.anInt2414;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt2414;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt2414;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt2414;
		}
		@Pc(139) int local139 = local100;
		if (local75 == 1) {
			local100 += this.anInt2409;
		}
		@Pc(159) int local159 = local100;
		if (local67 == 1) {
			local100 += this.anInt2414;
		}
		@Pc(169) int local169 = local100;
		local100 += local91;
		@Pc(175) int local175 = local100;
		local100 += this.anInt2414 * 2;
		@Pc(184) int local184 = local100;
		local100 += this.anInt2402 * 6;
		@Pc(193) int local193 = local100;
		local100 += local79;
		@Pc(199) int local199 = local100;
		local100 += local83;
		if (this.anInt2402 > 0) {
			this.aShortArray26 = new short[this.anInt2402];
			this.aShortArray30 = new short[this.anInt2402];
			this.aShortArray31 = new short[this.anInt2402];
			this.aByteArray35 = new byte[this.anInt2402];
		}
		if (local71 == 1) {
			this.anIntArray148 = new int[this.anInt2414];
		}
		if (local67 == 1) {
			this.aByteArray32 = new byte[this.anInt2414];
		}
		this.anIntArray149 = new int[this.anInt2409];
		this.aShortArray32 = new short[this.anInt2414];
		this.anIntArray145 = new int[this.anInt2409];
		this.aShortArray28 = new short[this.anInt2414];
		this.aShortArray35 = new short[this.anInt2414];
		this.anIntArray151 = new int[this.anInt2409];
		if (local75 == 1) {
			this.anIntArray150 = new int[this.anInt2409];
		}
		if (local63 == 255) {
			this.aByteArray31 = new byte[this.anInt2414];
		} else {
			this.aByte37 = (byte) local63;
		}
		local14.anInt7898 = 0;
		this.aShortArray29 = new short[this.anInt2414];
		if (local59 == 1) {
			this.aByteArray34 = new byte[this.anInt2414];
			this.aByteArray33 = new byte[this.anInt2414];
			this.aShortArray34 = new short[this.anInt2414];
		}
		local19.anInt7898 = local193;
		local24.anInt7898 = local199;
		local29.anInt7898 = local100;
		local34.anInt7898 = local139;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(360) int local360;
		@Pc(362) int local362;
		for (@Pc(354) int local354 = 0; local354 < this.anInt2409; local354++) {
			local360 = local14.method6433();
			local362 = 0;
			if ((local360 & 0x1) != 0) {
				local362 = local19.method6471();
			}
			@Pc(372) int local372 = 0;
			if ((local360 & 0x2) != 0) {
				local372 = local24.method6471();
			}
			@Pc(385) int local385 = 0;
			if ((local360 & 0x4) != 0) {
				local385 = local29.method6471();
			}
			this.anIntArray145[local354] = local348 + local362;
			this.anIntArray149[local354] = local350 + local372;
			this.anIntArray151[local354] = local352 + local385;
			local350 = this.anIntArray149[local354];
			local348 = this.anIntArray145[local354];
			local352 = this.anIntArray151[local354];
			if (local75 == 1) {
				this.anIntArray150[local354] = local34.method6433();
			}
		}
		local14.anInt7898 = local175;
		local19.anInt7898 = local129;
		local24.anInt7898 = local109;
		local29.anInt7898 = local159;
		local34.anInt7898 = local119;
		for (local360 = 0; local360 < this.anInt2414; local360++) {
			this.aShortArray29[local360] = (short) local14.method6485();
			if (local59 == 1) {
				local362 = local19.method6433();
				if ((local362 & 0x1) == 1) {
					this.aByteArray33[local360] = 1;
					local7 = true;
				} else {
					this.aByteArray33[local360] = 0;
				}
				if ((local362 & 0x2) == 2) {
					this.aByteArray34[local360] = (byte) (local362 >> 2);
					this.aShortArray34[local360] = this.aShortArray29[local360];
					this.aShortArray29[local360] = 127;
					if (this.aShortArray34[local360] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray34[local360] = -1;
					this.aShortArray34[local360] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray31[local360] = local24.method6438();
			}
			if (local67 == 1) {
				this.aByteArray32[local360] = local29.method6438();
			}
			if (local71 == 1) {
				this.anIntArray148[local360] = local34.method6433();
			}
		}
		this.anInt2406 = -1;
		local14.anInt7898 = local169;
		local19.anInt7898 = local102;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(622) int local622;
		for (@Pc(616) int local616 = 0; local616 < this.anInt2414; local616++) {
			local622 = local19.method6433();
			if (local622 == 1) {
				local608 = (short) (local14.method6471() + local614);
				local610 = (short) (local14.method6471() + local608);
				local612 = (short) (local14.method6471() + local610);
				this.aShortArray32[local616] = local608;
				local614 = local612;
				this.aShortArray35[local616] = local610;
				this.aShortArray28[local616] = local612;
				if (local608 > this.anInt2406) {
					this.anInt2406 = local608;
				}
				if (local610 > this.anInt2406) {
					this.anInt2406 = local610;
				}
				if (this.anInt2406 < local612) {
					this.anInt2406 = local612;
				}
			}
			if (local622 == 2) {
				local610 = local612;
				local612 = (short) (local614 + local14.method6471());
				this.aShortArray32[local616] = local608;
				local614 = local612;
				this.aShortArray35[local616] = local610;
				this.aShortArray28[local616] = local612;
				if (local612 > this.anInt2406) {
					this.anInt2406 = local612;
				}
			}
			if (local622 == 3) {
				local608 = local612;
				local612 = (short) (local614 + local14.method6471());
				this.aShortArray32[local616] = local608;
				local614 = local612;
				this.aShortArray35[local616] = local610;
				this.aShortArray28[local616] = local612;
				if (local612 > this.anInt2406) {
					this.anInt2406 = local612;
				}
			}
			if (local622 == 4) {
				@Pc(779) short local779 = local608;
				local608 = local610;
				local610 = local779;
				local612 = (short) (local14.method6471() + local614);
				this.aShortArray32[local616] = local608;
				local614 = local612;
				this.aShortArray35[local616] = local779;
				this.aShortArray28[local616] = local612;
				if (local612 > this.anInt2406) {
					this.anInt2406 = local612;
				}
			}
		}
		local14.anInt7898 = local184;
		this.anInt2406++;
		for (local622 = 0; local622 < this.anInt2402; local622++) {
			this.aByteArray35[local622] = 0;
			this.aShortArray31[local622] = (short) local14.method6485();
			this.aShortArray30[local622] = (short) local14.method6485();
			this.aShortArray26[local622] = (short) local14.method6485();
		}
		if (this.aByteArray34 != null) {
			@Pc(875) boolean local875 = false;
			for (@Pc(877) int local877 = 0; local877 < this.anInt2414; local877++) {
				@Pc(886) int local886 = this.aByteArray34[local877] & 0xFF;
				if (local886 != 255) {
					if ((this.aShortArray31[local886] & 0xFFFF) == this.aShortArray32[local877] && this.aShortArray35[local877] == (this.aShortArray30[local886] & 0xFFFF) && this.aShortArray28[local877] == (this.aShortArray26[local886] & 0xFFFF)) {
						this.aByteArray34[local877] = -1;
					} else {
						local875 = true;
					}
				}
			}
			if (!local875) {
				this.aByteArray34 = null;
			}
		}
		if (!local9) {
			this.aShortArray34 = null;
		}
		if (!local7) {
			this.aByteArray33 = null;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)[[I")
	public int[][] method1976() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass43Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass43Array1[local12].anInt1712;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(34) int local34 = local8[local20]++;
			}
		}
		@Pc(48) int[][] local48 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local48[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.aClass43Array1.length; local79++) {
			@Pc(87) int local87 = this.aClass43Array1[local79].anInt1712;
			if (local87 >= 0) {
				local48[local87][local8[local87]++] = local79;
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(IIII)V")
	public void method1977(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(31) int local31;
		if (arg0 != 0) {
			local7 = Class145.anIntArray279[arg0];
			local11 = Class145.anIntArray280[arg0];
			for (local13 = 0; local13 < this.anInt2409; local13++) {
				local31 = local11 * this.anIntArray145[local13] + local7 * this.anIntArray149[local13] >> 15;
				this.anIntArray149[local13] = local11 * this.anIntArray149[local13] - this.anIntArray145[local13] * local7 >> 15;
				this.anIntArray145[local13] = local31;
			}
		}
		if (arg2 != 0) {
			local7 = Class145.anIntArray279[arg2];
			local11 = Class145.anIntArray280[arg2];
			for (local13 = 0; local13 < this.anInt2409; local13++) {
				local31 = local11 * this.anIntArray149[local13] - local7 * this.anIntArray151[local13] >> 15;
				this.anIntArray151[local13] = local7 * this.anIntArray149[local13] + this.anIntArray151[local13] * local11 >> 15;
				this.anIntArray149[local13] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local7 = Class145.anIntArray279[arg1];
		local11 = Class145.anIntArray280[arg1];
		for (local13 = 0; local13 < this.anInt2409; local13++) {
			local31 = this.anIntArray151[local13] * local7 + local11 * this.anIntArray145[local13] >> 15;
			this.anIntArray151[local13] = local11 * this.anIntArray151[local13] - this.anIntArray145[local13] * local7 >> 15;
			this.anIntArray145[local13] = local31;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIII)V")
	public void method1978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2409; local3++) {
			this.anIntArray145[local3] += arg2;
			this.anIntArray149[local3] += arg1;
			this.anIntArray151[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!fl;SII)I")
	private int method1979(@OriginalArg(0) Class78 arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray145[arg2];
		@Pc(15) int local15 = arg0.anIntArray149[arg2];
		@Pc(20) int local20 = arg0.anIntArray151[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2409; local22++) {
			if (local10 == this.anIntArray145[local22] && local15 == this.anIntArray149[local22] && local20 == this.anIntArray151[local22]) {
				this.aShortArray27[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray145[this.anInt2409] = local10;
		this.anIntArray149[this.anInt2409] = local15;
		this.anIntArray151[this.anInt2409] = local20;
		this.aShortArray27[this.anInt2409] = arg1;
		this.anIntArray150[this.anInt2409] = arg0.anIntArray150 == null ? -1 : arg0.anIntArray150[arg2];
		return this.anInt2409++;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(SISSBSSBBS)B")
	public byte method1980() {
		if (this.anInt2402 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray35[this.anInt2402] = 3;
		this.aShortArray31[this.anInt2402] = 0;
		this.aShortArray30[this.anInt2402] = 32767;
		this.aShortArray26[this.anInt2402] = 0;
		this.anIntArray154[this.anInt2402] = 1024;
		this.anIntArray146[this.anInt2402] = 1024;
		this.anIntArray153[this.anInt2402] = 1024;
		this.aByteArray37[this.anInt2402] = 0;
		this.aByteArray36[this.anInt2402] = 0;
		this.anIntArray147[this.anInt2402] = 0;
		return (byte) this.anInt2402++;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)[[I")
	public int[][] method1981() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2414; local18++) {
			@Pc(25) int local25 = this.anIntArray148[local18];
			if (local25 >= 0) {
				if (local25 > local10) {
					local10 = local25;
				}
				@Pc(40) int local40 = local8[local25]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.anInt2414; local82++) {
			@Pc(89) int local89 = this.anIntArray148[local82];
			if (local89 >= 0) {
				local57[local89][local8[local89]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[B)V")
	private void method1984(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class6_Sub1 local10 = new Class6_Sub1(arg0);
		@Pc(15) Class6_Sub1 local15 = new Class6_Sub1(arg0);
		@Pc(20) Class6_Sub1 local20 = new Class6_Sub1(arg0);
		@Pc(25) Class6_Sub1 local25 = new Class6_Sub1(arg0);
		@Pc(30) Class6_Sub1 local30 = new Class6_Sub1(arg0);
		@Pc(35) Class6_Sub1 local35 = new Class6_Sub1(arg0);
		@Pc(40) Class6_Sub1 local40 = new Class6_Sub1(arg0);
		local10.anInt7898 = arg0.length - 23;
		this.anInt2409 = local10.method6485();
		this.anInt2414 = local10.method6485();
		this.anInt2402 = local10.method6433();
		@Pc(65) int local65 = local10.method6433();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt7898 -= 7;
			this.anInt2404 = local10.method6433();
			local10.anInt7898 += 6;
		}
		@Pc(128) int local128 = local10.method6433();
		@Pc(132) int local132 = local10.method6433();
		@Pc(136) int local136 = local10.method6433();
		@Pc(140) int local140 = local10.method6433();
		@Pc(144) int local144 = local10.method6433();
		@Pc(148) int local148 = local10.method6485();
		@Pc(160) int local160 = local10.method6485();
		@Pc(164) int local164 = local10.method6485();
		@Pc(168) int local168 = local10.method6485();
		@Pc(172) int local172 = local10.method6485();
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(194) int local194;
		if (this.anInt2402 > 0) {
			local10.anInt7898 = 0;
			this.aByteArray35 = new byte[this.anInt2402];
			for (local194 = 0; local194 < this.anInt2402; local194++) {
				@Pc(205) byte local205 = this.aByteArray35[local194] = local10.method6438();
				if (local205 == 0) {
					local174++;
				}
				if (local205 == 2) {
					local178++;
				}
				if (local205 >= 1 && local205 <= 3) {
					local176++;
				}
			}
		}
		local194 = this.anInt2402;
		@Pc(236) int local236 = local194;
		local194 += this.anInt2409;
		@Pc(243) int local243 = local194;
		if (local74) {
			local194 += this.anInt2414;
		}
		@Pc(252) int local252 = local194;
		local194 += this.anInt2414;
		@Pc(259) int local259 = local194;
		if (local128 == 255) {
			local194 += this.anInt2414;
		}
		@Pc(271) int local271 = local194;
		if (local136 == 1) {
			local194 += this.anInt2414;
		}
		@Pc(283) int local283 = local194;
		if (local144 == 1) {
			local194 += this.anInt2409;
		}
		@Pc(295) int local295 = local194;
		if (local132 == 1) {
			local194 += this.anInt2414;
		}
		@Pc(307) int local307 = local194;
		local194 += local168;
		@Pc(313) int local313 = local194;
		if (local140 == 1) {
			local194 += this.anInt2414 * 2;
		}
		@Pc(325) int local325 = local194;
		local194 += local172;
		@Pc(331) int local331 = local194;
		local194 += this.anInt2414 * 2;
		@Pc(340) int local340 = local194;
		local194 += local148;
		@Pc(346) int local346 = local194;
		local194 += local160;
		@Pc(352) int local352 = local194;
		local194 += local164;
		@Pc(358) int local358 = local194;
		local194 += local174 * 6;
		@Pc(366) int local366 = local194;
		local194 += local176 * 6;
		@Pc(380) int local380 = this.anInt2404 < 14 ? 6 : 7;
		@Pc(382) int local382 = local194;
		local194 += local176 * local380;
		@Pc(390) int local390 = local194;
		local194 += local176;
		@Pc(396) int local396 = local194;
		local194 += local176;
		@Pc(402) int local402 = local194;
		local194 += local178 * 2 + local176;
		if (local140 == 1 && this.anInt2402 > 0) {
			this.aByteArray34 = new byte[this.anInt2414];
		}
		if (this.anInt2402 > 0) {
			this.aShortArray31 = new short[this.anInt2402];
			if (local176 > 0) {
				this.anIntArray153 = new int[local176];
				this.anIntArray147 = new int[local176];
				this.aByteArray36 = new byte[local176];
				this.anIntArray146 = new int[local176];
				this.anIntArray154 = new int[local176];
				this.aByteArray37 = new byte[local176];
			}
			if (local178 > 0) {
				this.anIntArray144 = new int[local178];
				this.anIntArray152 = new int[local178];
			}
			this.aShortArray26 = new short[this.anInt2402];
			this.aShortArray30 = new short[this.anInt2402];
		}
		this.aShortArray32 = new short[this.anInt2414];
		if (local132 == 1) {
			this.aByteArray32 = new byte[this.anInt2414];
		}
		this.anIntArray149 = new int[this.anInt2409];
		this.anIntArray145 = new int[this.anInt2409];
		this.anIntArray151 = new int[this.anInt2409];
		if (local140 == 1) {
			this.aShortArray34 = new short[this.anInt2414];
		}
		this.aShortArray29 = new short[this.anInt2414];
		this.aShortArray28 = new short[this.anInt2414];
		if (local128 == 255) {
			this.aByteArray31 = new byte[this.anInt2414];
		} else {
			this.aByte37 = (byte) local128;
		}
		if (local74) {
			this.aByteArray33 = new byte[this.anInt2414];
		}
		if (local144 == 1) {
			this.anIntArray150 = new int[this.anInt2409];
		}
		if (local136 == 1) {
			this.anIntArray148 = new int[this.anInt2414];
		}
		local10.anInt7898 = local236;
		this.aShortArray35 = new short[this.anInt2414];
		local15.anInt7898 = local340;
		local20.anInt7898 = local346;
		local25.anInt7898 = local352;
		local30.anInt7898 = local283;
		@Pc(596) int local596 = 0;
		@Pc(598) int local598 = 0;
		@Pc(600) int local600 = 0;
		@Pc(608) int local608;
		for (@Pc(602) int local602 = 0; local602 < this.anInt2409; local602++) {
			local608 = local10.method6433();
			@Pc(610) int local610 = 0;
			if ((local608 & 0x1) != 0) {
				local610 = local15.method6471();
			}
			@Pc(620) int local620 = 0;
			if ((local608 & 0x2) != 0) {
				local620 = local20.method6471();
			}
			@Pc(630) int local630 = 0;
			if ((local608 & 0x4) != 0) {
				local630 = local25.method6471();
			}
			this.anIntArray145[local602] = local610 + local596;
			this.anIntArray149[local602] = local598 + local620;
			this.anIntArray151[local602] = local600 + local630;
			local598 = this.anIntArray149[local602];
			local600 = this.anIntArray151[local602];
			local596 = this.anIntArray145[local602];
			if (local144 == 1) {
				this.anIntArray150[local602] = local30.method6433();
			}
		}
		local10.anInt7898 = local331;
		local15.anInt7898 = local243;
		local20.anInt7898 = local259;
		local25.anInt7898 = local295;
		local30.anInt7898 = local271;
		local35.anInt7898 = local313;
		local40.anInt7898 = local325;
		for (local608 = 0; local608 < this.anInt2414; local608++) {
			this.aShortArray29[local608] = (short) local10.method6485();
			if (local74) {
				this.aByteArray33[local608] = local15.method6438();
			}
			if (local128 == 255) {
				this.aByteArray31[local608] = local20.method6438();
			}
			if (local132 == 1) {
				this.aByteArray32[local608] = local25.method6438();
			}
			if (local136 == 1) {
				this.anIntArray148[local608] = local30.method6433();
			}
			if (local140 == 1) {
				this.aShortArray34[local608] = (short) (local35.method6485() - 1);
			}
			if (this.aByteArray34 != null) {
				if (this.aShortArray34[local608] == -1) {
					this.aByteArray34[local608] = -1;
				} else {
					this.aByteArray34[local608] = (byte) (local40.method6433() - 1);
				}
			}
		}
		local10.anInt7898 = local307;
		this.anInt2406 = -1;
		local15.anInt7898 = local252;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(842) short local842 = 0;
		@Pc(850) int local850;
		for (@Pc(844) int local844 = 0; local844 < this.anInt2414; local844++) {
			local850 = local15.method6433();
			if (local850 == 1) {
				local836 = (short) (local10.method6471() + local842);
				local838 = (short) (local836 + local10.method6471());
				local840 = (short) (local838 + local10.method6471());
				local842 = local840;
				this.aShortArray32[local844] = local836;
				this.aShortArray35[local844] = local838;
				this.aShortArray28[local844] = local840;
				if (local836 > this.anInt2406) {
					this.anInt2406 = local836;
				}
				if (local838 > this.anInt2406) {
					this.anInt2406 = local838;
				}
				if (local840 > this.anInt2406) {
					this.anInt2406 = local840;
				}
			}
			if (local850 == 2) {
				local838 = local840;
				local840 = (short) (local10.method6471() + local842);
				local842 = local840;
				this.aShortArray32[local844] = local836;
				this.aShortArray35[local844] = local838;
				this.aShortArray28[local844] = local840;
				if (this.anInt2406 < local840) {
					this.anInt2406 = local840;
				}
			}
			if (local850 == 3) {
				local836 = local840;
				local840 = (short) (local10.method6471() + local842);
				local842 = local840;
				this.aShortArray32[local844] = local836;
				this.aShortArray35[local844] = local838;
				this.aShortArray28[local844] = local840;
				if (local840 > this.anInt2406) {
					this.anInt2406 = local840;
				}
			}
			if (local850 == 4) {
				@Pc(1003) short local1003 = local836;
				local836 = local838;
				local838 = local1003;
				local840 = (short) (local842 + local10.method6471());
				local842 = local840;
				this.aShortArray32[local844] = local836;
				this.aShortArray35[local844] = local1003;
				this.aShortArray28[local844] = local840;
				if (this.anInt2406 < local840) {
					this.anInt2406 = local840;
				}
			}
		}
		this.anInt2406++;
		local10.anInt7898 = local358;
		local15.anInt7898 = local366;
		local20.anInt7898 = local382;
		local25.anInt7898 = local390;
		local30.anInt7898 = local396;
		local35.anInt7898 = local402;
		@Pc(1086) int local1086;
		for (local850 = 0; local850 < this.anInt2402; local850++) {
			local1086 = this.aByteArray35[local850] & 0xFF;
			if (local1086 == 0) {
				this.aShortArray31[local850] = (short) local10.method6485();
				this.aShortArray30[local850] = (short) local10.method6485();
				this.aShortArray26[local850] = (short) local10.method6485();
			}
			if (local1086 == 1) {
				this.aShortArray31[local850] = (short) local15.method6485();
				this.aShortArray30[local850] = (short) local15.method6485();
				this.aShortArray26[local850] = (short) local15.method6485();
				this.anIntArray154[local850] = local20.method6485();
				if (this.anInt2404 >= 14) {
					this.anIntArray146[local850] = local20.method6435();
				} else {
					this.anIntArray146[local850] = local20.method6485();
				}
				this.anIntArray153[local850] = local20.method6485();
				this.aByteArray37[local850] = local25.method6438();
				this.aByteArray36[local850] = local30.method6438();
				this.anIntArray147[local850] = local35.method6438();
			}
			if (local1086 == 2) {
				this.aShortArray31[local850] = (short) local15.method6485();
				this.aShortArray30[local850] = (short) local15.method6485();
				this.aShortArray26[local850] = (short) local15.method6485();
				this.anIntArray154[local850] = local20.method6485();
				if (this.anInt2404 >= 14) {
					this.anIntArray146[local850] = local20.method6435();
				} else {
					this.anIntArray146[local850] = local20.method6485();
				}
				this.anIntArray153[local850] = local20.method6485();
				this.aByteArray37[local850] = local25.method6438();
				this.aByteArray36[local850] = local30.method6438();
				this.anIntArray147[local850] = local35.method6438();
				this.anIntArray144[local850] = local35.method6438();
				this.anIntArray152[local850] = local35.method6438();
			}
			if (local1086 == 3) {
				this.aShortArray31[local850] = (short) local15.method6485();
				this.aShortArray30[local850] = (short) local15.method6485();
				this.aShortArray26[local850] = (short) local15.method6485();
				this.anIntArray154[local850] = local20.method6485();
				if (this.anInt2404 < 14) {
					this.anIntArray146[local850] = local20.method6485();
				} else {
					this.anIntArray146[local850] = local20.method6435();
				}
				this.anIntArray153[local850] = local20.method6485();
				this.aByteArray37[local850] = local25.method6438();
				this.aByteArray36[local850] = local30.method6438();
				this.anIntArray147[local850] = local35.method6438();
			}
		}
		local10.anInt7898 = local194;
		@Pc(1405) int local1405;
		@Pc(1411) int local1411;
		@Pc(1415) int local1415;
		@Pc(1481) int local1481;
		if (local85) {
			local1086 = local10.method6433();
			if (local1086 > 0) {
				this.aClass119Array1 = new Class119[local1086];
				for (local1405 = 0; local1405 < local1086; local1405++) {
					local1411 = local10.method6485();
					local1415 = local10.method6485();
					@Pc(1425) byte local1425;
					if (local128 == 255) {
						local1425 = this.aByteArray31[local1415];
					} else {
						local1425 = (byte) local128;
					}
					this.aClass119Array1[local1405] = new Class119(local1411, this.aShortArray32[local1415], this.aShortArray35[local1415], this.aShortArray28[local1415], local1425);
				}
			}
			local1405 = local10.method6433();
			if (local1405 > 0) {
				this.aClass94Array1 = new Class94[local1405];
				for (local1411 = 0; local1411 < local1405; local1411++) {
					local1415 = local10.method6485();
					local1481 = local10.method6485();
					this.aClass94Array1[local1411] = new Class94(local1415, local1481);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1086 = local10.method6433();
		if (local1086 <= 0) {
			return;
		}
		this.aClass43Array1 = new Class43[local1086];
		for (local1405 = 0; local1405 < local1086; local1405++) {
			local1411 = local10.method6485();
			local1415 = local10.method6485();
			local1481 = local10.method6433();
			@Pc(1533) byte local1533 = local10.method6438();
			this.aClass43Array1[local1405] = new Class43(local1411, local1415, local1481, local1533);
		}
		return;
	}
}
