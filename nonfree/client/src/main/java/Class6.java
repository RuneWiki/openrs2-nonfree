import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class6 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
	private int anInt703;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "Z")
	public boolean aBoolean50;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	public void method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray98[arg0] = arg1;
		this.method642();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZ)V")
	public void method633(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean50 != arg0) {
			this.method641(-1, null, arg0, this.anIntArray98);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!fa;I)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method634(@OriginalArg(1) Class1_Sub2_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt703 != -1) {
			return Static165.method2827(this.anInt703).method2801(arg0, arg1);
		}
		@Pc(33) Class1_Sub2_Sub2_Sub5 local33 = (Class1_Sub2_Sub2_Sub5) Static64.aClass47_15.method1999(this.aLong30);
		if (local33 == null) {
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				@Pc(46) int local46 = this.anIntArray99[local39];
				if ((local46 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local46) != 0 && !Static159.method2738(local46 & 0x3FFFFFFF).method2331()) {
						local37 = true;
					}
				} else if (!Static184.method2994(local46 & 0x3FFFFFFF).method1057(this.aBoolean50)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(94) Class1_Sub2_Sub2_Sub1[] local94 = new Class1_Sub2_Sub2_Sub1[12];
			@Pc(96) int local96 = 0;
			for (@Pc(98) int local98 = 0; local98 < 12; local98++) {
				@Pc(105) int local105 = this.anIntArray99[local98];
				@Pc(121) Class1_Sub2_Sub2_Sub1 local121;
				if ((local105 & 0x40000000) != 0) {
					local121 = Static184.method2994(local105 & 0x3FFFFFFF).method1062(this.aBoolean50);
					if (local121 != null) {
						local94[local96++] = local121;
					}
				} else if ((Integer.MIN_VALUE & local105) != 0) {
					local121 = Static159.method2738(local105 & 0x3FFFFFFF).method2329();
					if (local121 != null) {
						local94[local96++] = local121;
					}
				}
			}
			@Pc(157) Class1_Sub2_Sub2_Sub1 local157 = new Class1_Sub2_Sub2_Sub1(local94, local96);
			for (@Pc(159) int local159 = 0; local159 < 5; local159++) {
				if (Static63.aShortArrayArray6[local159].length > this.anIntArray98[local159]) {
					local157.method513(Static160.aShortArray44[local159], Static63.aShortArrayArray6[local159][this.anIntArray98[local159]]);
				}
				if (Static26.aShortArrayArray3[local159].length > this.anIntArray98[local159]) {
					local157.method513(Static12.aShortArray1[local159], Static26.aShortArrayArray3[local159][this.anIntArray98[local159]]);
				}
			}
			local33 = local157.method511(64, 768, -50, -10, -50, true);
			Static64.aClass47_15.method1998(local33, this.aLong30);
		}
		if (arg0 != null) {
			local33 = arg0.method1204(arg1, local33);
		}
		return local33;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!fa;ILclient!fa;BI)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method635(@OriginalArg(0) Class1_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub8 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt703 != -1) {
			return Static165.method2827(this.anInt703).method2794(arg3, arg2, arg0, arg1);
		}
		@Pc(24) long local24 = this.aLong30;
		@Pc(27) int[] local27 = this.anIntArray99;
		if (arg0 != null && (arg0.anInt1508 >= 0 || arg0.anInt1511 >= 0)) {
			local27 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local27[local54] = this.anIntArray99[local54];
			}
			if (arg0.anInt1508 >= 0) {
				if (arg0.anInt1508 == 65535) {
					local24 ^= 0xFFFFFFFF00000000L;
					local27[5] = 0;
				} else {
					local27[5] = arg0.anInt1508 | 0x40000000;
					local24 ^= (long) local27[5] << 32;
				}
			}
			if (arg0.anInt1511 >= 0) {
				if (arg0.anInt1511 == 65535) {
					local24 ^= 0xFFFFFFFFL;
					local27[3] = 0;
				} else {
					local27[3] = arg0.anInt1511 | 0x40000000;
					local24 ^= local27[3];
				}
			}
		}
		@Pc(142) Class1_Sub2_Sub2_Sub5 local142 = (Class1_Sub2_Sub2_Sub5) Static27.aClass47_6.method1999(local24);
		if (local142 == null) {
			@Pc(146) boolean local146 = false;
			for (@Pc(148) int local148 = 0; local148 < 12; local148++) {
				@Pc(154) int local154 = local27[local148];
				if ((local154 & 0x40000000) == 0) {
					if ((local154 & Integer.MIN_VALUE) != 0 && !Static159.method2738(local154 & 0x3FFFFFFF).method2328()) {
						local146 = true;
					}
				} else if (!Static184.method2994(local154 & 0x3FFFFFFF).method1061(this.aBoolean50)) {
					local146 = true;
				}
			}
			if (local146) {
				if (this.aLong31 != -1L) {
					local142 = (Class1_Sub2_Sub2_Sub5) Static27.aClass47_6.method1999(this.aLong31);
				}
				if (local142 == null) {
					return null;
				}
			}
			if (local142 == null) {
				@Pc(215) Class1_Sub2_Sub2_Sub1[] local215 = new Class1_Sub2_Sub2_Sub1[12];
				@Pc(217) int local217 = 0;
				for (@Pc(219) int local219 = 0; local219 < 12; local219++) {
					@Pc(225) int local225 = local27[local219];
					@Pc(244) Class1_Sub2_Sub2_Sub1 local244;
					if ((local225 & 0x40000000) != 0) {
						local244 = Static184.method2994(local225 & 0x3FFFFFFF).method1058(this.aBoolean50);
						if (local244 != null) {
							local215[local217++] = local244;
						}
					} else if ((local225 & Integer.MIN_VALUE) != 0) {
						local244 = Static159.method2738(local225 & 0x3FFFFFFF).method2333();
						if (local244 != null) {
							local215[local217++] = local244;
						}
					}
				}
				@Pc(282) Class1_Sub2_Sub2_Sub1 local282 = new Class1_Sub2_Sub2_Sub1(local215, local217);
				for (@Pc(284) int local284 = 0; local284 < 5; local284++) {
					if (this.anIntArray98[local284] < Static63.aShortArrayArray6[local284].length) {
						local282.method513(Static160.aShortArray44[local284], Static63.aShortArrayArray6[local284][this.anIntArray98[local284]]);
					}
					if (Static26.aShortArrayArray3[local284].length > this.anIntArray98[local284]) {
						local282.method513(Static12.aShortArray1[local284], Static26.aShortArrayArray3[local284][this.anIntArray98[local284]]);
					}
				}
				local142 = local282.method511(64, 850, -30, -50, -30, true);
				Static27.aClass47_6.method1998(local142, local24);
				this.aLong31 = local24;
			}
		}
		if (arg0 == null && arg2 == null) {
			return local142;
		}
		@Pc(374) Class1_Sub2_Sub2_Sub5 local374;
		if (arg0 != null && arg2 != null) {
			local374 = arg0.method1205(arg1, local142, arg3, arg2);
		} else if (arg0 == null) {
			local374 = arg2.method1202(arg1, local142);
		} else {
			local374 = arg0.method1202(arg3, local142);
		}
		return local374;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
	public void method637(@OriginalArg(1) boolean arg0) {
		this.aBoolean50 = arg0;
		this.method642();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZB)V")
	public void method638(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean50) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray99[Static187.anIntArray454[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 &= 0x3FFFFFFF;
		@Pc(50) Class1_Sub2_Sub13 local50;
		do {
			if (arg1) {
				local19++;
				if (local19 >= Static52.anInt1703) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static52.anInt1703 - 1;
				}
			}
			local50 = Static159.method2738(local19);
		} while (local50 == null || local50.aBoolean244 || (this.aBoolean50 ? 7 : 0) + arg0 != local50.anInt3262);
		this.anIntArray99[Static187.anIntArray454[arg0]] = Integer.MIN_VALUE | local19;
		this.method642();
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)I")
	public int method639() {
		return this.anInt703 == -1 ? this.anIntArray99[1] + (this.anIntArray99[11] << 5) + (this.anIntArray98[4] << 20) + (this.anIntArray98[0] << 25) + (this.anIntArray99[0] << 15) + (this.anIntArray99[8] << 10) : Static165.method2827(this.anInt703).anInt3854 + 305419896;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	public void method640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static187.anIntArray454[arg0];
		if (this.anIntArray99[local7] != 0 && Static159.method2738(arg1) != null) {
			this.anIntArray99[local7] = arg1 | Integer.MIN_VALUE;
			this.method642();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI[IZ[I)V")
	public void method641(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static52.anInt1703; local12++) {
					@Pc(18) Class1_Sub2_Sub13 local18 = Static159.method2738(local12);
					if (local18 != null && !local18.aBoolean244 && local8 + (arg2 ? 7 : 0) == local18.anInt3262) {
						arg1[Static187.anIntArray454[local8]] = local12 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray98 = arg3;
		this.aBoolean50 = arg2;
		this.anInt703 = arg0;
		this.anIntArray99 = arg1;
		this.method642();
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
	private void method642() {
		@Pc(11) long local11 = this.aLong30;
		@Pc(17) long[] local17 = Class1_Sub2_Sub12.aLongArray5;
		this.aLong30 = -1L;
		for (@Pc(22) int local22 = 0; local22 < 12; local22++) {
			this.aLong30 = this.aLong30 >>> 8 ^ local17[(int) ((this.aLong30 ^ (long) (this.anIntArray99[local22] >> 24)) & 0xFFL)];
			this.aLong30 = this.aLong30 >>> 8 ^ local17[(int) ((this.aLong30 ^ (long) (this.anIntArray99[local22] >> 16)) & 0xFFL)];
			this.aLong30 = this.aLong30 >>> 8 ^ local17[(int) ((this.aLong30 ^ (long) (this.anIntArray99[local22] >> 8)) & 0xFFL)];
			this.aLong30 = this.aLong30 >>> 8 ^ local17[(int) (((long) this.anIntArray99[local22] ^ this.aLong30) & 0xFFL)];
		}
		for (@Pc(116) int local116 = 0; local116 < 5; local116++) {
			this.aLong30 = this.aLong30 >>> 8 ^ local17[(int) ((this.aLong30 ^ (long) this.anIntArray98[local116]) & 0xFFL)];
		}
		this.aLong30 = this.aLong30 >>> 8 ^ local17[(int) ((this.aLong30 ^ (long) (this.aBoolean50 ? 1 : 0)) & 0xFFL)];
		if (local11 != 0L && local11 != this.aLong30) {
			Static27.aClass47_6.method1993(local11);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZ)V")
	public void method643(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray98[arg0];
		if (arg1) {
			local8++;
			if (Static63.aShortArrayArray6[arg0].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static63.aShortArrayArray6[arg0].length - 1;
			}
		}
		this.anIntArray98[arg0] = local8;
		this.method642();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!ce;)V")
	public void method644(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.method1643(this.aBoolean50 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray99[Static187.anIntArray454[local16]];
			if ((Integer.MIN_VALUE & local25) == 0) {
				arg0.method1650(65535);
			} else {
				arg0.method1650(local25 & 0x3FFFFFFF);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1643(this.anIntArray98[local25]);
		}
	}
}
