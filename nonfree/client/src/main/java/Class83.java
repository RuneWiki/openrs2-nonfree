import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class83 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	private int anInt2556;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public int anInt2555 = -1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II[II[IZ)V")
	public void method2444(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (this.anInt2556 != arg2) {
			this.anInt2556 = arg2;
			this.anIntArrayArray38 = null;
		}
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static34.anInt4373; local34++) {
					@Pc(42) Class132 local42 = Static111.method2379(local34);
					if (local42 != null && !local42.aBoolean244 && (arg4 ? Static82.anIntArray185[local30] : Static28.anIntArray42[local30]) == local42.anInt3865) {
						arg3[Static247.anIntArray433[local30]] = local34 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray226 = arg1;
		this.anIntArray228 = arg3;
		this.anInt2555 = arg0;
		this.aBoolean179 = arg4;
		this.method2452();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)V")
	public void method2447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static247.anIntArray433[arg1];
		if (this.anIntArray228[local7] != 0 && Static111.method2379(arg0) != null) {
			this.anIntArray228[local7] = Integer.MIN_VALUE | arg0;
			this.method2452();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!gn;Lclient!e;ZII)Lclient!id;")
	public Class45 method2448(@OriginalArg(1) int arg0, @OriginalArg(2) Class79 arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.anInt2555 != -1) {
			return Static267.method4561(this.anInt2555).method5279(arg1, arg0, arg2, arg3, arg4);
		}
		@Pc(30) int local30 = 1024;
		@Pc(38) boolean local38;
		@Pc(49) int local49;
		@Pc(106) int local106;
		@Pc(59) int local59;
		@Pc(110) int local110;
		if (arg1 != null) {
			@Pc(34) boolean local34 = false;
			@Pc(36) boolean local36 = false;
			local38 = false;
			local49 = arg1.anIntArray217[arg4];
			local30 = 1056;
			local59 = local49 >>> 16;
			@Pc(63) Class14_Sub2_Sub15 local63 = Static203.method5589(local59);
			@Pc(67) int local67 = local49 & 0xFFFF;
			if (local63 != null) {
				local36 = local63.method4107(local67) | false;
				local34 = local63.method4103(local67) | false;
				local38 = arg1.aBoolean166 | false;
			}
			if ((arg1.aBoolean164 || Static308.aBoolean300) && arg3 != -1 && arg1.anIntArray217.length > arg3) {
				local106 = arg1.anIntArray217[arg3];
				local110 = local106 >>> 16;
				@Pc(123) Class14_Sub2_Sub15 local123 = local110 == local59 ? local63 : Static203.method5589(local110);
				@Pc(127) int local127 = local106 & 0xFFFF;
				if (local123 != null) {
					local36 |= local123.method4107(local127);
					local34 |= local123.method4103(local127);
				}
			}
			if (local36) {
				local30 = 1184;
			}
			if (local34) {
				local30 |= 0x100;
			}
			if (local38) {
				local30 |= 0x200;
			}
		}
		@Pc(163) Class11 local163 = Static259.aClass11_113;
		@Pc(172) Class45 local172;
		synchronized (Static259.aClass11_113) {
			local172 = (Class45) Static259.aClass11_113.method209(this.aLong74);
		}
		if (local172 == null || arg2.method5149(local172.method1809(), local30) != 0) {
			if (local172 != null) {
				local30 = arg2.method5112(local30, local172.method1809());
			}
			local38 = false;
			for (local49 = 0; local49 < 12; local49++) {
				local106 = this.anIntArray228[local49];
				if ((local106 & 0x40000000) == 0) {
					if ((local106 & Integer.MIN_VALUE) != 0 && !Static111.method2379(local106 & 0x3FFFFFFF).method3591()) {
						local38 = true;
					}
				} else if (!Static296.method5066(local106 & 0x3FFFFFFF).method5973(this.aBoolean179)) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(253) Class71[] local253 = new Class71[12];
			@Pc(255) int local255 = 0;
			for (@Pc(257) int local257 = 0; local257 < 12; local257++) {
				local59 = this.anIntArray228[local257];
				@Pc(281) Class71 local281;
				if ((local59 & 0x40000000) != 0) {
					local281 = Static296.method5066(local59 & 0x3FFFFFFF).method5975(this.aBoolean179);
					if (local281 != null) {
						local253[local255++] = local281;
					}
				} else if ((local59 & Integer.MIN_VALUE) != 0) {
					local281 = Static111.method2379(local59 & 0x3FFFFFFF).method3588();
					if (local281 != null) {
						local253[local255++] = local281;
					}
				}
			}
			@Pc(319) int local319 = local30 | 0x2000;
			@Pc(325) Class71 local325 = new Class71(local253, local255);
			local172 = arg2.method5148(local325, local319, Static271.anInt5162, 64, 768);
			for (local110 = 0; local110 < 5; local110++) {
				if (this.anIntArray226[local110] < Static325.aShortArrayArray11[local110].length) {
					local172.method1821(Static67.aShortArray23[local110], Static325.aShortArrayArray11[local110][this.anIntArray226[local110]]);
				}
				if (Static257.aShortArrayArray7[local110].length > this.anIntArray226[local110]) {
					local172.method1821(Static81.aShortArray42[local110], Static257.aShortArrayArray7[local110][this.anIntArray226[local110]]);
				}
			}
			local172.method1782(local30);
			@Pc(398) Class11 local398 = Static259.aClass11_113;
			synchronized (Static259.aClass11_113) {
				Static259.aClass11_113.method219(this.aLong74, local172);
			}
		}
		if (arg1 == null) {
			return local172;
		} else {
			local172.method1793((byte) 1, local30, true);
			return arg1.method2297(arg0, arg4, 1024, arg3, local172);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
	public void method2449(@OriginalArg(0) boolean arg0) {
		this.aBoolean179 = arg0;
		this.method2452();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
	public void method2450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray226[arg0] = arg1;
		this.method2452();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIILclient!gn;ILclient!e;II)Lclient!id;")
	public Class45 method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class79 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class46 arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local30 = arg5.anIntArray217[arg0];
			local36 = local30 >>> 16;
			@Pc(40) Class14_Sub2_Sub15 local40 = Static203.method5589(local36);
			@Pc(44) int local44 = local30 & 0xFFFF;
			if (local40 != null) {
				local13 = local40.method4107(local44) | false;
				local11 = local40.method4103(local44) | false;
				local15 = arg5.aBoolean166 | false;
			}
			if ((arg5.aBoolean164 || Static308.aBoolean300) && arg3 != -1 && arg3 < arg5.anIntArray217.length) {
				@Pc(83) int local83 = arg5.anIntArray217[arg3];
				@Pc(87) int local87 = local83 >>> 16;
				@Pc(91) int local91 = local83 & 0xFFFF;
				@Pc(102) Class14_Sub2_Sub15 local102;
				if (local87 == local36) {
					local102 = local40;
				} else {
					local102 = Static203.method5589(local91 >>> 16);
				}
				if (local102 != null) {
					local13 |= local102.method4107(local91);
					local11 |= local102.method4103(local91);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(152) long local152 = (long) arg1 | (long) arg6 << 32 | (long) (arg2 << 16);
		@Pc(154) Class11 local154 = Static259.aClass11_113;
		@Pc(168) Class45 local168;
		synchronized (Static259.aClass11_113) {
			local168 = (Class45) Static259.aClass11_113.method209(local152);
		}
		if (local168 == null || arg7.method5149(local168.method1809(), local7) != 0) {
			if (local168 != null) {
				local7 = arg7.method5112(local7, local168.method1809());
			}
			@Pc(195) Class71[] local195 = new Class71[3];
			@Pc(197) int local197 = 0;
			if (!Static111.method2379(arg1).method3591() || !Static111.method2379(arg2).method3591() || !Static111.method2379(arg6).method3591()) {
				return null;
			}
			@Pc(225) Class71 local225 = Static111.method2379(arg1).method3588();
			if (local225 != null) {
				local197++;
				local195[0] = local225;
			}
			local225 = Static111.method2379(arg2).method3588();
			if (local225 != null) {
				local195[local197++] = local225;
			}
			local225 = Static111.method2379(arg6).method3588();
			if (local225 != null) {
				local195[local197++] = local225;
			}
			local225 = new Class71(local195, local197);
			local30 = local7 | 0x2000;
			local168 = arg7.method5148(local225, local30, Static271.anInt5162, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (Static325.aShortArrayArray11[local36].length > this.anIntArray226[local36]) {
					local168.method1821(Static67.aShortArray23[local36], Static325.aShortArrayArray11[local36][this.anIntArray226[local36]]);
				}
				if (Static257.aShortArrayArray7[local36].length > this.anIntArray226[local36]) {
					local168.method1821(Static81.aShortArray42[local36], Static257.aShortArrayArray7[local36][this.anIntArray226[local36]]);
				}
			}
			local168.method1782(local7);
			@Pc(345) Class11 local345 = Static259.aClass11_113;
			synchronized (Static259.aClass11_113) {
				Static259.aClass11_113.method219(local152, local168);
			}
		}
		if (arg5 == null) {
			return local168;
		} else {
			local168 = local168.method1793((byte) 1, local7, true);
			return arg5.method2297(arg4, arg0, 1024, arg3, local168);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	private void method2452() {
		@Pc(7) long[] local7 = Class14_Sub2_Sub2.aLongArray9;
		this.aLong74 = -1L;
		this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) (((long) (this.anInt2556 >> 8) ^ this.aLong74) & 0xFFL)];
		this.aLong74 = local7[(int) ((this.aLong74 ^ (long) this.anInt2556) & 0xFFL)] ^ this.aLong74 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) ((this.aLong74 ^ (long) (this.anIntArray228[local50] >> 24)) & 0xFFL)];
			this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) (((long) (this.anIntArray228[local50] >> 16) ^ this.aLong74) & 0xFFL)];
			this.aLong74 = local7[(int) (((long) (this.anIntArray228[local50] >> 8) ^ this.aLong74) & 0xFFL)] ^ this.aLong74 >>> 8;
			this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) ((this.aLong74 ^ (long) this.anIntArray228[local50]) & 0xFFL)];
		}
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) (((long) this.anIntArray226[local149] ^ this.aLong74) & 0xFFL)];
		}
		this.aLong74 = local7[(int) ((this.aLong74 ^ (long) (this.aBoolean179 ? 1 : 0)) & 0xFFL)] ^ this.aLong74 >>> 8;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([Lclient!ac;IIIILclient!gn;IIILclient!e;ILclient!gn;Z)Lclient!id;")
	public Class45 method2453(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class79 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class46 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class79 arg10) {
		if (this.anInt2555 != -1) {
			return Static267.method4561(this.anInt2555).method5285(arg2, arg8, arg6, arg3, arg9, arg4, arg0, arg1, arg5, arg10, arg7);
		}
		@Pc(29) int local29 = arg7;
		@Pc(32) long local32 = this.aLong74;
		@Pc(35) int[] local35 = this.anIntArray228;
		if (arg10 != null && (arg10.anInt2359 >= 0 || arg10.anInt2349 >= 0)) {
			local35 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local35[local51] = this.anIntArray228[local51];
			}
			if (arg10.anInt2359 >= 0) {
				if (arg10.anInt2359 == 65535) {
					local32 ^= 0xFFFFFFFF00000000L;
					local35[5] = 0;
				} else {
					local35[5] = arg10.anInt2359 | 0x40000000;
					local32 ^= (long) local35[5] << 32;
				}
			}
			if (arg10.anInt2349 >= 0) {
				if (arg10.anInt2349 == 65535) {
					local35[3] = 0;
					local32 ^= 0xFFFFFFFFL;
				} else {
					local35[3] = arg10.anInt2349 | 0x40000000;
					local32 ^= local35[3];
				}
			}
		}
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(146) boolean local146 = arg10 != null || arg5 != null;
		@Pc(153) int local153 = arg0 == null ? 0 : arg0.length;
		@Pc(188) int local188;
		@Pc(193) int local193;
		for (@Pc(155) int local155 = 0; local155 < local153; local155++) {
			Static353.aClass14_Sub2_Sub15Array6[local155] = null;
			if (arg0[local155] != null) {
				@Pc(174) Class79 local174 = Static233.method4080(arg0[local155].anInt103);
				if (local174.anIntArray217 != null) {
					Static68.aClass79Array2[local155] = local174;
					local146 = true;
					local188 = arg0[local155].anInt97;
					local193 = arg0[local155].anInt102;
					@Pc(198) int local198 = local174.anIntArray217[local188];
					Static353.aClass14_Sub2_Sub15Array6[local155] = Static203.method5589(local198 >>> 16);
					@Pc(210) int local210 = local198 & 0xFFFF;
					Static28.anIntArray43[local155] = local210;
					if (Static353.aClass14_Sub2_Sub15Array6[local155] != null) {
						local138 |= Static353.aClass14_Sub2_Sub15Array6[local155].method4107(local210);
						local136 |= Static353.aClass14_Sub2_Sub15Array6[local155].method4103(local210);
					}
					if ((local174.aBoolean164 || Static308.aBoolean300) && local193 != -1 && local174.anIntArray217.length > local193) {
						Static18.anIntArray30[local155] = local174.anIntArray215[local188];
						Static274.anIntArray472[local155] = arg0[local155].anInt98;
						@Pc(289) int local289 = local174.anIntArray217[local193];
						Static335.aClass14_Sub2_Sub15Array5[local155] = Static203.method5589(local289 >>> 16);
						@Pc(301) int local301 = local289 & 0xFFFF;
						Static70.anIntArray123[local155] = local301;
						if (Static335.aClass14_Sub2_Sub15Array5[local155] != null) {
							local138 |= Static335.aClass14_Sub2_Sub15Array5[local155].method4107(local301);
							local136 |= Static335.aClass14_Sub2_Sub15Array5[local155].method4103(local301);
						}
					} else {
						Static18.anIntArray30[local155] = 0;
						Static274.anIntArray472[local155] = 0;
						Static335.aClass14_Sub2_Sub15Array5[local155] = null;
						Static70.anIntArray123[local155] = -1;
					}
				}
			}
		}
		@Pc(333) int local333 = -1;
		local188 = -1;
		local193 = 0;
		@Pc(339) Class14_Sub2_Sub15 local339 = null;
		@Pc(341) Class14_Sub2_Sub15 local341 = null;
		@Pc(343) int local343 = -1;
		@Pc(345) int local345 = -1;
		@Pc(347) int local347 = 0;
		@Pc(349) Class14_Sub2_Sub15 local349 = null;
		@Pc(351) Class14_Sub2_Sub15 local351 = null;
		if (local146) {
			@Pc(364) int local364;
			@Pc(419) int local419;
			if (arg10 != null) {
				local333 = arg10.anIntArray217[arg9];
				local364 = local333 >>> 16;
				local339 = Static203.method5589(local364);
				local333 &= 0xFFFF;
				if (local339 != null) {
					local138 |= local339.method4107(local333);
					local136 |= local339.method4103(local333);
				}
				if ((arg10.aBoolean164 || Static308.aBoolean300) && arg1 != -1 && arg10.anIntArray217.length > arg1) {
					local193 = arg10.anIntArray215[arg9];
					local188 = arg10.anIntArray217[arg1];
					local419 = local188 >>> 16;
					local188 &= 0xFFFF;
					local341 = local364 == local419 ? local339 : Static203.method5589(local419);
					if (local341 != null) {
						local138 |= local341.method4107(local188);
						local136 |= local341.method4103(local188);
					}
				}
			}
			local29 = arg7 | 0x20;
			if (arg5 != null) {
				local343 = arg5.anIntArray217[arg3];
				local364 = local343 >>> 16;
				local349 = Static203.method5589(local364);
				local343 &= 0xFFFF;
				if (local349 != null) {
					local138 |= local349.method4107(local343);
					local136 |= local349.method4103(local343);
				}
				if ((arg5.aBoolean164 || Static308.aBoolean300) && arg4 != -1 && arg4 < arg5.anIntArray217.length) {
					local345 = arg5.anIntArray217[arg4];
					local347 = arg5.anIntArray215[arg3];
					local419 = local345 >>> 16;
					local345 &= 0xFFFF;
					local351 = local419 == local364 ? local349 : Static203.method5589(local419);
					if (local351 != null) {
						local138 |= local351.method4107(local345);
						local136 |= local351.method4103(local345);
					}
				}
			}
			if (local138) {
				local29 |= 0x80;
			}
			if (local136) {
				local29 |= 0x100;
			}
		}
		@Pc(569) Class11 local569 = Static93.aClass11_50;
		@Pc(577) Class45 local577;
		synchronized (Static93.aClass11_50) {
			local577 = (Class45) Static93.aClass11_50.method209(local32);
		}
		@Pc(585) Class128 local585 = null;
		if (this.anInt2556 != -1) {
			local585 = Static88.method2112(this.anInt2556);
		}
		@Pc(625) int local625;
		@Pc(631) int local631;
		if (local577 == null || arg8.method5149(local577.method1809(), local29) != 0 || local585 != null && local585.anIntArrayArray57 != null && this.anIntArrayArray38 == null) {
			if (local577 != null) {
				local29 = arg8.method5112(local29, local577.method1809());
			}
			@Pc(623) boolean local623 = false;
			local625 = 0;
			while (true) {
				if (local625 >= 12) {
					if (local623) {
						if (this.aLong73 != -1L) {
							@Pc(1246) Class11 local1246 = Static93.aClass11_50;
							synchronized (Static93.aClass11_50) {
								local577 = (Class45) Static93.aClass11_50.method209(this.aLong73);
							}
						}
						if (local577 == null || arg8.method5149(local577.method1809(), local29) != 0 || local585 != null && local585.anIntArrayArray57 != null && this.anIntArrayArray38 == null) {
							return null;
						}
					} else {
						@Pc(679) Class71[] local679 = new Class71[12];
						@Pc(687) int local687;
						for (@Pc(681) int local681 = 0; local681 < 12; local681++) {
							local687 = local35[local681];
							@Pc(701) Class71 local701;
							if ((local687 & 0x40000000) != 0) {
								local701 = Static296.method5066(local687 & 0x3FFFFFFF).method5970(this.aBoolean179);
								if (local701 != null) {
									local679[local681] = local701;
								}
							} else if ((Integer.MIN_VALUE & local687) != 0) {
								local701 = Static111.method2379(local687 & 0x3FFFFFFF).method3595();
								if (local701 != null) {
									local679[local681] = local701;
								}
							}
						}
						@Pc(763) int local763;
						if (local585 != null && local585.anIntArrayArray57 != null) {
							for (local687 = 0; local687 < local585.anIntArrayArray57.length; local687++) {
								if (local585.anIntArrayArray57[local687] != null && local679[local687] != null) {
									local763 = local585.anIntArrayArray57[local687][0];
									@Pc(770) int local770 = local585.anIntArrayArray57[local687][1];
									@Pc(777) int local777 = local585.anIntArrayArray57[local687][2];
									@Pc(786) int local786 = local585.anIntArrayArray57[local687][3] << 3;
									@Pc(795) int local795 = local585.anIntArrayArray57[local687][4] << 3;
									@Pc(804) int local804 = local585.anIntArrayArray57[local687][5] << 3;
									if (this.anIntArrayArray38 == null) {
										this.anIntArrayArray38 = new int[local585.anIntArrayArray57.length][];
									}
									if (this.anIntArrayArray38[local687] == null) {
										@Pc(826) int[] local826 = this.anIntArrayArray38[local687] = new int[15];
										if (local786 == 0 && local795 == 0 && local804 == 0) {
											local826[0] = local826[4] = local826[8] = 32768;
											local826[14] = -local777;
											local826[13] = -local770;
											local826[12] = -local763;
										} else {
											@Pc(868) int local868 = Class14_Sub3_Sub34.anIntArray546[local786];
											@Pc(872) int local872 = Class14_Sub3_Sub34.anIntArray547[local786];
											@Pc(876) int local876 = Class14_Sub3_Sub34.anIntArray546[local795];
											@Pc(880) int local880 = Class14_Sub3_Sub34.anIntArray547[local795];
											@Pc(884) int local884 = Class14_Sub3_Sub34.anIntArray546[local804];
											@Pc(888) int local888 = Class14_Sub3_Sub34.anIntArray547[local804];
											@Pc(896) int local896 = local872 * local884 + 16384 >> 15;
											@Pc(904) int local904 = local888 * local872 + 16384 >> 15;
											local826[2] = local880 * local868 + 16384 >> 15;
											local826[0] = local904 * local880 + local884 * local876 + 16384 >> 15;
											local826[1] = local876 * -local888 + local896 * local880 + 16384 >> 15;
											local826[8] = local876 * local868 + 16384 >> 15;
											local826[7] = local876 * local896 + -local880 * -local888 + 16384 >> 15;
											local826[4] = local884 * local868 + 16384 >> 15;
											local826[6] = local884 * -local880 + local876 * local904 + 16384 >> 15;
											local826[5] = -local872;
											local826[3] = local868 * local888 + 16384 >> 15;
											local826[13] = local826[4] * -local770 + local826[1] * -local763 + local826[7] * -local777 + 16384 >> 15;
											local826[14] = -local777 * local826[8] + local826[2] * -local763 + local826[5] * -local770 + 16384 >> 15;
											local826[12] = -local777 * local826[6] + -local770 * local826[3] + -local763 * local826[0] + 16384 >> 15;
										}
										local826[9] = local763;
										local826[10] = local770;
										local826[11] = local777;
									}
									if (local786 != 0 || local795 != 0 || local804 != 0) {
										local679[local687].method2187(local795, local804, local786);
									}
									if (local763 != 0 || local770 != 0 || local777 != 0) {
										local679[local687].method2186(local763, local777, local770);
									}
								}
							}
						}
						@Pc(1148) Class71 local1148 = new Class71(local679, local679.length);
						@Pc(1152) int local1152 = local29 | 0x2000;
						local577 = arg8.method5148(local1148, local1152, Static271.anInt5162, 64, 850);
						for (local763 = 0; local763 < 5; local763++) {
							if (Static325.aShortArrayArray11[local763].length > this.anIntArray226[local763]) {
								local577.method1821(Static67.aShortArray23[local763], Static325.aShortArrayArray11[local763][this.anIntArray226[local763]]);
							}
							if (this.anIntArray226[local763] < Static257.aShortArrayArray7[local763].length) {
								local577.method1821(Static81.aShortArray42[local763], Static257.aShortArrayArray7[local763][this.anIntArray226[local763]]);
							}
						}
						local577.method1782(local29);
						@Pc(1219) Class11 local1219 = Static93.aClass11_50;
						synchronized (Static93.aClass11_50) {
							Static93.aClass11_50.method219(local32, local577);
						}
						this.aLong73 = local32;
					}
					break;
				}
				local631 = local35[local625];
				if ((local631 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local631) != 0 && !Static111.method2379(local631 & 0x3FFFFFFF).method3589()) {
						local623 = true;
					}
				} else if (!Static296.method5066(local631 & 0x3FFFFFFF).method5968(this.aBoolean179)) {
					local623 = true;
				}
				local625++;
			}
		}
		@Pc(1291) Class45 local1291 = local577.method1793((byte) 1, local29, true);
		if (!local146) {
			return local1291;
		}
		@Pc(1297) int local1297 = 0;
		local625 = 1;
		while (local1297 < local153) {
			if (Static353.aClass14_Sub2_Sub15Array6[local1297] != null) {
				local1291.method1808(Static18.anIntArray30[local1297], Static28.anIntArray43[local1297], this.anIntArrayArray38 == null ? null : this.anIntArrayArray38[local1297], local625, Static335.aClass14_Sub2_Sub15Array5[local1297], false, Static353.aClass14_Sub2_Sub15Array6[local1297], Static70.anIntArray123[local1297], Static274.anIntArray472[local1297] - 1);
			}
			local1297++;
			local625 <<= 0x1;
		}
		if (local339 != null && local349 != null) {
			local1291.method1820(false, local188, local343, local345, local341, local349, local339, local351, arg10.aBooleanArray10, local333, arg2 - 1, local193, local347, arg6 - 1);
		} else if (local339 != null) {
			local1291.method1817(0, local339, local193, false, local341, local333, local188, arg2 - 1);
		} else if (local349 != null) {
			local1291.method1817(0, local349, local347, false, local351, local343, local345, arg6 - 1);
		}
		for (local631 = 0; local631 < local153; local631++) {
			Static353.aClass14_Sub2_Sub15Array6[local631] = null;
			Static335.aClass14_Sub2_Sub15Array5[local631] = null;
			Static68.aClass79Array2[local631] = null;
		}
		return local1291;
	}
}
