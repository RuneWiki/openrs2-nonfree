import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class43 {

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	private int anInt1962;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!h;I)V")
	public void method1557(@OriginalArg(0) Class4_Sub11 arg0) {
		arg0.method1238(this.aBoolean88 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray196[Static53.anIntArray139[local16]];
			if ((local25 & Integer.MIN_VALUE) == 0) {
				arg0.method1268(65535);
			} else {
				arg0.method1268(local25 & 0x3FFFFFFF);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1238(this.anIntArray195[local25]);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BZ)V")
	public void method1558(@OriginalArg(1) boolean arg0) {
		this.aBoolean88 = arg0;
		this.method1564();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ca;ZI)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method1559(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1962 != -1) {
			return Static105.method1980(this.anInt1962).method1751(arg1, arg0);
		}
		@Pc(31) Class4_Sub1_Sub1_Sub4 local31 = (Class4_Sub1_Sub1_Sub4) Static142.aClass66_44.method2225(this.aLong69);
		if (local31 == null) {
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
				@Pc(44) int local44 = this.anIntArray196[local37];
				if ((local44 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local44) != 0 && !Static80.method1603(local44 & 0x3FFFFFFF).method180()) {
						local35 = true;
					}
				} else if (!Static83.method1663(local44 & 0x3FFFFFFF).method1884(this.aBoolean88)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(86) int local86 = 0;
			@Pc(89) Class4_Sub1_Sub1_Sub6[] local89 = new Class4_Sub1_Sub1_Sub6[12];
			for (@Pc(91) int local91 = 0; local91 < 12; local91++) {
				@Pc(98) int local98 = this.anIntArray196[local91];
				@Pc(112) Class4_Sub1_Sub1_Sub6 local112;
				if ((local98 & 0x40000000) != 0) {
					local112 = Static83.method1663(local98 & 0x3FFFFFFF).method1879(this.aBoolean88);
					if (local112 != null) {
						local89[local86++] = local112;
					}
				} else if ((Integer.MIN_VALUE & local98) != 0) {
					local112 = Static80.method1603(local98 & 0x3FFFFFFF).method181();
					if (local112 != null) {
						local89[local86++] = local112;
					}
				}
			}
			@Pc(150) Class4_Sub1_Sub1_Sub6 local150 = new Class4_Sub1_Sub1_Sub6(local89, local86);
			for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
				if (this.anIntArray195[local152] < Static181.aShortArrayArray7[local152].length) {
					local150.method1011(Static106.aShortArray32[local152], Static181.aShortArrayArray7[local152][this.anIntArray195[local152]]);
				}
				if (this.anIntArray195[local152] < Static36.aShortArrayArray3[local152].length) {
					local150.method1011(Static79.aShortArray20[local152], Static36.aShortArrayArray3[local152][this.anIntArray195[local152]]);
				}
			}
			local31 = local150.method1007(64, 768, -50, -10, -50, true);
			Static142.aClass66_44.method2222(local31, this.aLong69);
		}
		if (arg0 != null) {
			local31 = arg0.method349(arg1, local31);
		}
		return local31;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZII)V")
	public void method1560(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 && this.aBoolean88) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray196[Static53.anIntArray139[arg1]];
		if (local19 == 0) {
			return;
		}
		local19 &= 0x3FFFFFFF;
		@Pc(53) Class4_Sub1_Sub3 local53;
		do {
			if (arg0) {
				local19++;
				if (local19 >= Static130.anInt3126) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static130.anInt3126 - 1;
				}
			}
			local53 = Static80.method1603(local19);
		} while (local53 == null || local53.aBoolean18 || local53.anInt323 != (this.aBoolean88 ? 7 : 0) + arg1);
		this.anIntArray196[Static53.anIntArray139[arg1]] = Integer.MIN_VALUE | local19;
		this.method1564();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BIZ)V")
	public void method1561(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray195[arg0];
		if (arg1) {
			local8++;
			if (Static181.aShortArrayArray7[arg0].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static181.aShortArrayArray7[arg0].length - 1;
			}
		}
		this.anIntArray195[arg0] = local8;
		this.method1564();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	public void method1563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray195[arg1] = arg0;
		this.method1564();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
	private void method1564() {
		@Pc(8) long local8 = this.aLong69;
		this.aLong69 = -1L;
		@Pc(13) long[] local13 = Class4_Sub3_Sub5.aLongArray8;
		for (@Pc(19) int local19 = 0; local19 < 12; local19++) {
			this.aLong69 = this.aLong69 >>> 8 ^ local13[(int) (((long) (this.anIntArray196[local19] >> 24) ^ this.aLong69) & 0xFFL)];
			this.aLong69 = this.aLong69 >>> 8 ^ local13[(int) ((this.aLong69 ^ (long) (this.anIntArray196[local19] >> 16)) & 0xFFL)];
			this.aLong69 = local13[(int) ((this.aLong69 ^ (long) (this.anIntArray196[local19] >> 8)) & 0xFFL)] ^ this.aLong69 >>> 8;
			this.aLong69 = this.aLong69 >>> 8 ^ local13[(int) ((this.aLong69 ^ (long) this.anIntArray196[local19]) & 0xFFL)];
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong69 = local13[(int) ((this.aLong69 ^ (long) this.anIntArray195[local113]) & 0xFFL)] ^ this.aLong69 >>> 8;
		}
		this.aLong69 = local13[(int) ((this.aLong69 ^ (long) (this.aBoolean88 ? 1 : 0)) & 0xFFL)] ^ this.aLong69 >>> 8;
		if (local8 != 0L && this.aLong69 != local8) {
			Static77.aClass66_29.method2220(local8);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z[II[II)V")
	public void method1565(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static130.anInt3126; local12++) {
					@Pc(18) Class4_Sub1_Sub3 local18 = Static80.method1603(local12);
					if (local18 != null && !local18.aBoolean18 && local8 + (arg0 ? 7 : 0) == local18.anInt323) {
						arg1[Static53.anIntArray139[local8]] = Integer.MIN_VALUE | local12;
						break;
					}
				}
			}
		}
		this.anIntArray195 = arg2;
		this.aBoolean88 = arg0;
		this.anInt1962 = arg3;
		this.anIntArray196 = arg1;
		this.method1564();
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)V")
	public void method1566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static53.anIntArray139[arg0];
		if (this.anIntArray196[local11] != 0 && Static80.method1603(arg1) != null) {
			this.anIntArray196[local11] = Integer.MIN_VALUE | arg1;
			this.method1564();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	public int method1569() {
		return this.anInt1962 == -1 ? (this.anIntArray196[8] << 10) + (this.anIntArray196[0] << 15) + (this.anIntArray195[4] << 20) + (this.anIntArray195[0] << 25) + (this.anIntArray196[11] << 5) + this.anIntArray196[1] : 305419896 - -Static105.method1980(this.anInt1962).anInt2248;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IZ)V")
	public void method1570(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean88) {
			this.method1565(arg0, null, this.anIntArray195, -1);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ca;ILclient!ca;B)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method1571(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1_Sub4 arg3) {
		if (this.anInt1962 != -1) {
			return Static105.method1980(this.anInt1962).method1747(arg3, arg2, arg0, arg1);
		}
		@Pc(26) long local26 = this.aLong69;
		@Pc(29) int[] local29 = this.anIntArray196;
		if (arg3 != null && (arg3.anInt552 >= 0 || arg3.anInt549 >= 0)) {
			local29 = new int[12];
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local29[local42] = this.anIntArray196[local42];
			}
			if (arg3.anInt552 >= 0) {
				if (arg3.anInt552 == 65535) {
					local26 ^= 0xFFFFFFFF00000000L;
					local29[5] = 0;
				} else {
					local29[5] = arg3.anInt552 | 0x40000000;
					local26 ^= (long) local29[5] << 32;
				}
			}
			if (arg3.anInt549 >= 0) {
				if (arg3.anInt549 == 65535) {
					local29[3] = 0;
					local26 ^= 0xFFFFFFFFL;
				} else {
					local29[3] = arg3.anInt549 | 0x40000000;
					local26 ^= local29[3];
				}
			}
		}
		@Pc(138) Class4_Sub1_Sub1_Sub4 local138 = (Class4_Sub1_Sub1_Sub4) Static77.aClass66_29.method2225(local26);
		if (local138 == null) {
			@Pc(142) boolean local142 = false;
			for (@Pc(144) int local144 = 0; local144 < 12; local144++) {
				@Pc(150) int local150 = local29[local144];
				if ((local150 & 0x40000000) == 0) {
					if ((local150 & Integer.MIN_VALUE) != 0 && !Static80.method1603(local150 & 0x3FFFFFFF).method182()) {
						local142 = true;
					}
				} else if (!Static83.method1663(local150 & 0x3FFFFFFF).method1880(this.aBoolean88)) {
					local142 = true;
				}
			}
			if (local142) {
				if (this.aLong68 != -1L) {
					local138 = (Class4_Sub1_Sub1_Sub4) Static77.aClass66_29.method2225(this.aLong68);
				}
				if (local138 == null) {
					return null;
				}
			}
			if (local138 == null) {
				@Pc(214) Class4_Sub1_Sub1_Sub6[] local214 = new Class4_Sub1_Sub1_Sub6[12];
				@Pc(216) int local216 = 0;
				for (@Pc(218) int local218 = 0; local218 < 12; local218++) {
					@Pc(224) int local224 = local29[local218];
					@Pc(241) Class4_Sub1_Sub1_Sub6 local241;
					if ((local224 & 0x40000000) != 0) {
						local241 = Static83.method1663(local224 & 0x3FFFFFFF).method1885(this.aBoolean88);
						if (local241 != null) {
							local214[local216++] = local241;
						}
					} else if ((local224 & Integer.MIN_VALUE) != 0) {
						local241 = Static80.method1603(local224 & 0x3FFFFFFF).method179();
						if (local241 != null) {
							local214[local216++] = local241;
						}
					}
				}
				@Pc(282) Class4_Sub1_Sub1_Sub6 local282 = new Class4_Sub1_Sub1_Sub6(local214, local216);
				for (@Pc(284) int local284 = 0; local284 < 5; local284++) {
					if (this.anIntArray195[local284] < Static181.aShortArrayArray7[local284].length) {
						local282.method1011(Static106.aShortArray32[local284], Static181.aShortArrayArray7[local284][this.anIntArray195[local284]]);
					}
					if (Static36.aShortArrayArray3[local284].length > this.anIntArray195[local284]) {
						local282.method1011(Static79.aShortArray20[local284], Static36.aShortArrayArray3[local284][this.anIntArray195[local284]]);
					}
				}
				local138 = local282.method1007(64, 850, -30, -50, -30, true);
				Static77.aClass66_29.method2222(local138, local26);
				this.aLong68 = local26;
			}
		}
		if (arg3 == null && arg1 == null) {
			return local138;
		}
		@Pc(374) Class4_Sub1_Sub1_Sub4 local374;
		if (arg3 != null && arg1 != null) {
			local374 = arg3.method348(arg1, arg0, local138, arg2);
		} else if (arg3 == null) {
			local374 = arg1.method344(local138, arg2);
		} else {
			local374 = arg3.method344(local138, arg0);
		}
		return local374;
	}
}
