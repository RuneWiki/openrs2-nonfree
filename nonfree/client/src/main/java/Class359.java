import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class359 {

	@OriginalMember(owner = "client!uaa", name = "k", descriptor = "J")
	private long aLong274;

	@OriginalMember(owner = "client!uaa", name = "s", descriptor = "J")
	private long aLong275;

	@OriginalMember(owner = "client!uaa", name = "n", descriptor = "[I")
	public int[] anIntArray536;

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "[I")
	private int[] anIntArray537;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
	private int anInt9564;

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "Z")
	public boolean aBoolean669;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "[Lclient!jo;")
	private Class192[] aClass192Array1;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
	public int anInt9559 = -1;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI[Lclient!jo;[II[II)V")
	public void method8151(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class192[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		this.anIntArray537 = arg4;
		if (arg5 != this.anInt9564) {
			this.anInt9564 = arg5;
		}
		Static66.method1108(this.anIntArray537.length);
		this.anIntArray536 = arg2;
		this.aClass192Array1 = arg1;
		this.aBoolean669 = arg0;
		this.anInt9559 = arg3;
		this.method8157();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BZ)V")
	public void method8152(@OriginalArg(1) boolean arg0) {
		this.aBoolean669 = arg0;
		this.method8157();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIILclient!ps;)V")
	public void method8153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class294 arg2) {
		@Pc(7) int local7 = Static28.anIntArray32[arg0];
		if (arg2.method6580(arg1) != null) {
			this.anIntArray537[local7] = arg1 | Integer.MIN_VALUE;
			this.method8157();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIILclient!gja;)V")
	public void method8154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class134 arg2) {
		if (arg0 == -1) {
			this.anIntArray537[arg1] = 0;
		} else if (arg2.method3191(arg0) != null) {
			this.anIntArray537[arg1] = arg0 | 0x40000000;
			this.method8157();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!oe;ILclient!ha;IIIIIILclient!aia;ILclient!ps;)Lclient!ka;")
	public Class43 method8156(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class14 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class294 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(111) int local111;
		@Pc(45) int local45;
		if (arg0 != null) {
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			@Pc(24) boolean local24 = false;
			local7 = 2080;
			@Pc(41) int local41 = arg0.anIntArray423[arg5];
			local45 = local41 >>> 16;
			@Pc(50) Class5_Sub1_Sub21 local50 = arg7.method221(local45);
			@Pc(54) int local54 = local41 & 0xFFFF;
			if (local50 != null) {
				local20 = local50.method8958(local54) | false;
				local18 = local50.method8965(local54) | false;
				local24 = local50.method8962(local54) | false;
				local22 = arg0.aBoolean468 | false;
			}
			if ((arg0.aBoolean467 || Static54.aBoolean77) && arg4 != -1 && arg4 < arg0.anIntArray423.length) {
				local111 = arg0.anIntArray423[arg4];
				@Pc(115) int local115 = local111 >>> 16;
				@Pc(119) int local119 = local111 & 0xFFFF;
				@Pc(128) Class5_Sub1_Sub21 local128;
				if (local45 == local115) {
					local128 = local50;
				} else {
					local128 = arg7.method221(local119 >>> 16);
				}
				if (local128 != null) {
					local20 |= local128.method8958(local119);
					local18 |= local128.method8965(local119);
					local24 |= local128.method8962(local119);
				}
			}
			if (local20) {
				local7 = 2208;
			}
			if (local18) {
				local7 |= 0x100;
			}
			if (local22) {
				local7 |= 0x200;
			}
			if (local24) {
				local7 |= 0x400;
			}
		}
		@Pc(196) long local196 = (long) (arg6 << 16) | (long) arg8 << 32 | (long) arg1;
		@Pc(198) Class168 local198 = Static101.aClass168_18;
		@Pc(206) Class43 local206;
		synchronized (Static101.aClass168_18) {
			local206 = (Class43) Static101.aClass168_18.method3860(local196);
		}
		if (local206 == null || arg2.method8628(local206.ua(), local7) != 0) {
			if (local206 != null) {
				local7 = arg2.method8665(local7, local206.ua());
			}
			@Pc(237) Class197[] local237 = new Class197[3];
			local111 = 0;
			if (!arg9.method6580(arg1).method4243() || !arg9.method6580(arg6).method4243() || !arg9.method6580(arg8).method4243()) {
				return null;
			}
			@Pc(273) Class197 local273 = arg9.method6580(arg1).method4246();
			if (local273 != null) {
				local111++;
				local237[0] = local273;
			}
			local273 = arg9.method6580(arg6).method4246();
			if (local273 != null) {
				local237[local111++] = local273;
			}
			local273 = arg9.method6580(arg8).method4246();
			if (local273 != null) {
				local237[local111++] = local273;
			}
			local273 = new Class197(local237, local111);
			@Pc(324) int local324 = local7 | 0x4000;
			local206 = arg2.method8588(local273, local324, Static545.anInt8676, 64, 768);
			for (@Pc(334) int local334 = 0; local334 < 5; local334++) {
				for (local45 = 0; local45 < Static467.aShortArrayArrayArray4.length; local45++) {
					if (Static467.aShortArrayArrayArray4[local45][local334].length > this.anIntArray536[local334]) {
						local206.ia(Static445.aShortArrayArray20[local45][local334], Static467.aShortArrayArrayArray4[local45][local334][this.anIntArray536[local334]]);
					}
				}
			}
			local206.s(local7);
			@Pc(394) Class168 local394 = Static101.aClass168_18;
			synchronized (Static101.aClass168_18) {
				Static101.aClass168_18.method3853(local196, local206);
			}
		}
		if (arg0 == null) {
			return local206;
		} else {
			local206 = local206.method8840((byte) 4, local7, true);
			return arg0.method6130(arg4, arg5, local206, arg3, 2048);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
	private void method8157() {
		@Pc(7) long[] local7 = Class7.aLongArray3;
		this.aLong274 = -1L;
		this.aLong274 = local7[(int) ((this.aLong274 ^ (long) (this.anInt9564 >> 8)) & 0xFFL)] ^ this.aLong274 >>> 8;
		this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) ((this.aLong274 ^ (long) this.anInt9564) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray537.length; local50++) {
			this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) (((long) (this.anIntArray537[local50] >> 24) ^ this.aLong274) & 0xFFL)];
			this.aLong274 = local7[(int) (((long) (this.anIntArray537[local50] >> 16) ^ this.aLong274) & 0xFFL)] ^ this.aLong274 >>> 8;
			this.aLong274 = local7[(int) ((this.aLong274 ^ (long) (this.anIntArray537[local50] >> 8)) & 0xFFL)] ^ this.aLong274 >>> 8;
			this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) ((this.aLong274 ^ (long) this.anIntArray537[local50]) & 0xFFL)];
		}
		@Pc(159) int local159;
		if (this.aClass192Array1 != null) {
			for (local159 = 0; local159 < this.aClass192Array1.length; local159++) {
				if (this.aClass192Array1[local159] != null) {
					@Pc(185) int[] local185;
					@Pc(179) int[] local179;
					if (this.aBoolean669) {
						local179 = this.aClass192Array1[local159].anIntArray268;
						local185 = this.aClass192Array1[local159].anIntArray270;
					} else {
						local185 = this.aClass192Array1[local159].anIntArray267;
						local179 = this.aClass192Array1[local159].anIntArray269;
					}
					@Pc(203) int local203;
					if (local185 != null) {
						for (local203 = 0; local203 < local185.length; local203++) {
							this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) ((this.aLong274 ^ (long) (local185[local203] >> 8)) & 0xFFL)];
							this.aLong274 = local7[(int) (((long) local185[local203] ^ this.aLong274) & 0xFFL)] ^ this.aLong274 >>> 8;
						}
					}
					if (local179 != null) {
						for (local203 = 0; local203 < local179.length; local203++) {
							this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) ((this.aLong274 ^ (long) (local179[local203] >> 8)) & 0xFFL)];
							this.aLong274 = local7[(int) ((this.aLong274 ^ (long) local179[local203]) & 0xFFL)] ^ this.aLong274 >>> 8;
						}
					}
					if (this.aClass192Array1[local159].aShortArray61 != null) {
						for (local203 = 0; local203 < this.aClass192Array1[local159].aShortArray61.length; local203++) {
							this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) (((long) (this.aClass192Array1[local159].aShortArray61[local203] >> 8) ^ this.aLong274) & 0xFFL)];
							this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) ((this.aLong274 ^ (long) this.aClass192Array1[local159].aShortArray61[local203]) & 0xFFL)];
						}
					}
					if (this.aClass192Array1[local159].aShortArray60 != null) {
						for (local203 = 0; local203 < this.aClass192Array1[local159].aShortArray60.length; local203++) {
							this.aLong274 = local7[(int) (((long) (this.aClass192Array1[local159].aShortArray60[local203] >> 8) ^ this.aLong274) & 0xFFL)] ^ this.aLong274 >>> 8;
							this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) (((long) this.aClass192Array1[local159].aShortArray60[local203] ^ this.aLong274) & 0xFFL)];
						}
					}
				}
			}
		}
		for (local159 = 0; local159 < 5; local159++) {
			this.aLong274 = local7[(int) ((this.aLong274 ^ (long) this.anIntArray536[local159]) & 0xFFL)] ^ this.aLong274 >>> 8;
		}
		this.aLong274 = local7[(int) ((this.aLong274 ^ (long) (this.aBoolean669 ? 1 : 0)) & 0xFFL)] ^ this.aLong274 >>> 8;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZII)V")
	public void method8158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray536[arg0] = arg1;
		this.method8157();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILclient!uv;IIILclient!ps;Lclient!aia;Lclient!gja;Lclient!ha;ILclient!ada;Lclient!oe;)Lclient!ka;")
	public Class43 method8159(@OriginalArg(0) int arg0, @OriginalArg(1) Class369 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class294 arg3, @OriginalArg(6) Class14 arg4, @OriginalArg(7) Class134 arg5, @OriginalArg(8) Class100 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Interface1 arg8, @OriginalArg(11) Class264 arg9) {
		if (this.anInt9559 != -1) {
			return arg1.method8471(this.anInt9559).method2616(arg0, (Class322) null, arg9, arg4, arg8, arg6, arg2, arg7);
		}
		@Pc(38) int local38 = 2048;
		@Pc(46) boolean local46;
		@Pc(65) int local65;
		@Pc(135) int local135;
		@Pc(69) int local69;
		@Pc(139) int local139;
		if (arg9 != null) {
			@Pc(42) boolean local42 = false;
			@Pc(44) boolean local44 = false;
			local46 = false;
			@Pc(48) boolean local48 = false;
			local38 = 2080;
			local65 = arg9.anIntArray423[arg7];
			local69 = local65 >>> 16;
			@Pc(73) int local73 = local65 & 0xFFFF;
			@Pc(78) Class5_Sub1_Sub21 local78 = arg4.method221(local69);
			if (local78 != null) {
				local44 = local78.method8958(local73) | false;
				local42 = local78.method8965(local73) | false;
				local48 = local78.method8962(local73) | false;
				local46 = arg9.aBoolean468 | false;
			}
			if ((arg9.aBoolean467 || Static54.aBoolean77) && arg2 != -1 && arg9.anIntArray423.length > arg2) {
				local135 = arg9.anIntArray423[arg2];
				local139 = local135 >>> 16;
				@Pc(143) int local143 = local135 & 0xFFFF;
				@Pc(158) Class5_Sub1_Sub21 local158 = local139 == local69 ? local78 : arg4.method221(local139);
				if (local158 != null) {
					local44 |= local158.method8958(local143);
					local42 |= local158.method8965(local143);
					local48 |= local158.method8962(local143);
				}
			}
			if (local44) {
				local38 = 2208;
			}
			if (local42) {
				local38 |= 0x100;
			}
			if (local46) {
				local38 |= 0x200;
			}
			if (local48) {
				local38 |= 0x400;
			}
		}
		@Pc(207) Class168 local207 = Static101.aClass168_18;
		@Pc(216) Class43 local216;
		synchronized (Static101.aClass168_18) {
			local216 = (Class43) Static101.aClass168_18.method3860(this.aLong274);
		}
		if (local216 == null || arg6.method8628(local216.ua(), local38) != 0) {
			if (local216 != null) {
				local38 = arg6.method8665(local38, local216.ua());
			}
			local46 = false;
			for (@Pc(251) int local251 = 0; local251 < this.anIntArray537.length; local251++) {
				local65 = this.anIntArray537[local251];
				@Pc(262) Class192 local262 = null;
				if ((local65 & 0x40000000) != 0) {
					if (this.aClass192Array1 != null && this.aClass192Array1[local251] != null) {
						local262 = this.aClass192Array1[local251];
					}
					if (!arg5.method3191(local65 & 0x3FFFFFFF).method5681(this.aBoolean669, local262)) {
						local46 = true;
					}
				} else if ((local65 & Integer.MIN_VALUE) != 0 && !arg3.method6580(local65 & 0x3FFFFFFF).method4243()) {
					local46 = true;
				}
			}
			if (local46) {
				return null;
			}
			@Pc(345) Class197[] local345 = new Class197[this.anIntArray537.length];
			local135 = 0;
			for (@Pc(349) int local349 = 0; local349 < this.anIntArray537.length; local349++) {
				@Pc(358) int local358 = this.anIntArray537[local349];
				@Pc(360) Class192 local360 = null;
				@Pc(382) Class197 local382;
				if ((local358 & 0x40000000) != 0) {
					if (this.aClass192Array1 != null && this.aClass192Array1[local349] != null) {
						local360 = this.aClass192Array1[local349];
					}
					local382 = arg5.method3191(local358 & 0x3FFFFFFF).method5689(this.aBoolean669, local360);
					if (local382 != null) {
						local345[local135++] = local382;
					}
				} else if ((Integer.MIN_VALUE & local358) != 0) {
					local382 = arg3.method6580(local358 & 0x3FFFFFFF).method4246();
					if (local382 != null) {
						local345[local135++] = local382;
					}
				}
			}
			@Pc(443) Class197 local443 = new Class197(local345, local135);
			@Pc(447) int local447 = local38 | 0x4000;
			local216 = arg6.method8588(local443, local447, Static545.anInt8676, 64, 768);
			for (local69 = 0; local69 < 5; local69++) {
				for (local139 = 0; local139 < Static467.aShortArrayArrayArray4.length; local139++) {
					if (this.anIntArray536[local69] < Static467.aShortArrayArrayArray4[local139][local69].length) {
						local216.ia(Static445.aShortArrayArray20[local139][local69], Static467.aShortArrayArrayArray4[local139][local69][this.anIntArray536[local69]]);
					}
				}
			}
			local216.s(local38);
			@Pc(521) Class168 local521 = Static101.aClass168_18;
			synchronized (Static101.aClass168_18) {
				Static101.aClass168_18.method3853(this.aLong274, local216);
			}
		}
		if (arg9 == null) {
			return local216;
		} else {
			local216.method8840((byte) 4, local38, true);
			return arg9.method6130(arg2, arg7, local216, arg0, 2048);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IILclient!he;ILclient!ps;Lclient!aia;Lclient!gja;Lclient!oe;Lclient!ada;B[Lclient!cq;IILclient!uv;ILclient!oe;Z[ILclient!ha;Lclient!gj;II)Lclient!ka;")
	public Class43 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class148 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class294 arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) Class134 arg6, @OriginalArg(7) Class264 arg7, @OriginalArg(8) Interface1 arg8, @OriginalArg(10) Class64[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class369 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class264 arg14, @OriginalArg(17) int[] arg15, @OriginalArg(18) Class100 arg16, @OriginalArg(19) Class133 arg17, @OriginalArg(20) int arg18, @OriginalArg(21) int arg19) {
		if (this.anInt9559 != -1) {
			return arg12.method8471(this.anInt9559).method2621(arg8, arg18, arg0, arg15, arg7, arg10, arg13, arg9, (Class322) null, arg2, arg19, arg5, arg1, arg11, arg3, arg14, arg16);
		}
		@Pc(37) int local37 = arg11;
		@Pc(40) long local40 = this.aLong274;
		@Pc(43) int[] local43 = this.anIntArray537;
		@Pc(45) boolean local45 = false;
		@Pc(47) boolean local47 = false;
		if (arg14 != null && (arg14.anInt7036 >= 0 || arg14.anInt7045 >= 0)) {
			local43 = new int[this.anIntArray537.length];
			for (@Pc(69) int local69 = 0; local69 < local43.length; local69++) {
				local43[local69] = this.anIntArray537[local69];
			}
			@Pc(120) int local120;
			if (arg14.anInt7036 >= 0 && arg17.anInt3470 != -1) {
				local45 = true;
				if (arg14.anInt7036 == 65535) {
					local43[arg17.anInt3470] = 0;
					for (local120 = 0; local120 < arg17.anIntArray160.length; local120++) {
						local43[arg17.anIntArray160[local120]] = 0;
					}
					local40 ^= 0xFFFFFFFF00000000L;
				} else {
					local43[arg17.anInt3470] = arg14.anInt7036 | 0x40000000;
					for (local120 = 0; local120 < arg17.anIntArray160.length; local120++) {
						local43[arg17.anIntArray160[local120]] = 0;
					}
					local40 ^= (long) local43[arg17.anInt3470] << 32;
				}
			}
			if (arg14.anInt7045 >= 0 && arg17.anInt3467 != -1) {
				local47 = true;
				if (arg14.anInt7045 == 65535) {
					local43[arg17.anInt3467] = 0;
					for (local120 = 0; local120 < arg17.anIntArray161.length; local120++) {
						local43[arg17.anIntArray161[local120]] = 0;
					}
					local40 ^= 0xFFFFFFFFL;
				} else {
					local43[arg17.anInt3467] = arg14.anInt7045 | 0x40000000;
					for (local120 = 0; local120 < arg17.anIntArray161.length; local120++) {
						local43[arg17.anIntArray161[local120]] = 0;
					}
					local40 ^= (long) local43[arg17.anInt3467];
				}
			}
		}
		@Pc(280) boolean local280 = false;
		@Pc(282) boolean local282 = false;
		@Pc(284) boolean local284 = false;
		@Pc(295) boolean local295 = arg14 != null || arg7 != null;
		@Pc(303) int local303 = arg9 == null ? 0 : arg9.length;
		@Pc(339) int local339;
		@Pc(344) int local344;
		for (@Pc(305) int local305 = 0; local305 < local303; local305++) {
			Static347.aClass5_Sub1_Sub21Array2[local305] = null;
			if (arg9[local305] != null) {
				@Pc(325) Class264 local325 = arg5.method227(arg9[local305].anInt1376);
				if (local325.anIntArray423 != null) {
					local295 = true;
					Static459.aClass264Array1[local305] = local325;
					local339 = arg9[local305].anInt1384;
					local344 = arg9[local305].anInt1377;
					@Pc(349) int local349 = local325.anIntArray423[local339];
					Static347.aClass5_Sub1_Sub21Array2[local305] = arg5.method221(local349 >>> 16);
					@Pc(362) int local362 = local349 & 0xFFFF;
					Static378.anIntArray367[local305] = local362;
					if (Static347.aClass5_Sub1_Sub21Array2[local305] != null) {
						local282 |= Static347.aClass5_Sub1_Sub21Array2[local305].method8958(local362);
						local280 |= Static347.aClass5_Sub1_Sub21Array2[local305].method8965(local362);
						local284 |= Static347.aClass5_Sub1_Sub21Array2[local305].method8962(local362);
					}
					if ((local325.aBoolean467 || Static54.aBoolean77) && local344 != -1 && local325.anIntArray423.length > local344) {
						Static492.anIntArray461[local305] = local325.anIntArray425[local339];
						Static653.anIntArray608[local305] = arg9[local305].anInt1378;
						@Pc(460) int local460 = local325.anIntArray423[local344];
						Static300.aClass5_Sub1_Sub21Array1[local305] = arg5.method221(local460 >>> 16);
						@Pc(473) int local473 = local460 & 0xFFFF;
						Static519.anIntArray474[local305] = local473;
						if (Static300.aClass5_Sub1_Sub21Array1[local305] != null) {
							local282 |= Static300.aClass5_Sub1_Sub21Array1[local305].method8958(local473);
							local280 |= Static300.aClass5_Sub1_Sub21Array1[local305].method8965(local473);
							local284 |= Static300.aClass5_Sub1_Sub21Array1[local305].method8962(local473);
						}
					} else {
						Static492.anIntArray461[local305] = 0;
						Static653.anIntArray608[local305] = 0;
						Static300.aClass5_Sub1_Sub21Array1[local305] = null;
						Static519.anIntArray474[local305] = -1;
					}
				}
			}
		}
		@Pc(518) int local518 = -1;
		local339 = -1;
		local344 = 0;
		@Pc(524) Class5_Sub1_Sub21 local524 = null;
		@Pc(526) Class5_Sub1_Sub21 local526 = null;
		@Pc(528) int local528 = -1;
		@Pc(530) int local530 = -1;
		@Pc(532) int local532 = 0;
		@Pc(534) Class5_Sub1_Sub21 local534 = null;
		@Pc(544) Class5_Sub1_Sub21 local544 = null;
		if (local295) {
			local37 = arg11 | 0x20;
			@Pc(563) int local563;
			@Pc(632) int local632;
			if (arg14 != null) {
				local518 = arg14.anIntArray423[arg19];
				local563 = local518 >>> 16;
				local524 = arg5.method221(local563);
				local518 &= 0xFFFF;
				if (local524 != null) {
					local282 |= local524.method8958(local518);
					local280 |= local524.method8965(local518);
					local284 |= local524.method8962(local518);
				}
				if ((arg14.aBoolean467 || Static54.aBoolean77) && arg13 != -1 && arg13 < arg14.anIntArray423.length) {
					local344 = arg14.anIntArray425[arg19];
					local339 = arg14.anIntArray423[arg13];
					local632 = local339 >>> 16;
					local526 = local563 == local632 ? local524 : arg5.method221(local632);
					local339 &= 0xFFFF;
					if (local526 != null) {
						local282 |= local526.method8958(local339);
						local280 |= local526.method8965(local339);
						local284 |= local526.method8962(local339);
					}
				}
			}
			if (arg7 != null) {
				local528 = arg7.anIntArray423[arg3];
				local563 = local528 >>> 16;
				local528 &= 0xFFFF;
				local534 = arg5.method221(local563);
				if (local534 != null) {
					local282 |= local534.method8958(local528);
					local280 |= local534.method8965(local528);
					local284 |= local534.method8962(local528);
				}
				if ((arg7.aBoolean467 || Static54.aBoolean77) && arg10 != -1 && arg10 < arg7.anIntArray423.length) {
					local530 = arg7.anIntArray423[arg10];
					local532 = arg7.anIntArray425[arg3];
					local632 = local530 >>> 16;
					local544 = local632 == local563 ? local534 : arg5.method221(local632);
					local530 &= 0xFFFF;
					if (local544 != null) {
						local282 |= local544.method8958(local530);
						local280 |= local544.method8965(local530);
						local284 |= local544.method8962(local530);
					}
				}
			}
			if (local282) {
				local37 |= 0x80;
			}
			if (local280) {
				local37 |= 0x100;
			}
			if (local284) {
				local37 |= 0x400;
			}
		}
		@Pc(808) Class168 local808 = Static62.aClass168_11;
		@Pc(816) Class43 local816;
		synchronized (Static62.aClass168_11) {
			local816 = (Class43) Static62.aClass168_11.method3860(local40);
		}
		@Pc(824) Class92 local824 = null;
		if (this.anInt9564 != -1) {
			local824 = arg2.method3404(this.anInt9564);
		}
		@Pc(862) boolean local862;
		@Pc(864) int local864;
		@Pc(872) int local872;
		@Pc(890) int local890;
		@Pc(1086) int local1086;
		@Pc(1092) int local1092;
		if (local816 == null || arg16.method8628(local816.ua(), local37) != 0) {
			if (local816 != null) {
				local37 = arg16.method8665(local37, local816.ua());
			}
			local862 = false;
			local864 = 0;
			while (true) {
				if (local43.length <= local864) {
					if (local862) {
						if (this.aLong275 != -1L) {
							@Pc(1049) Class168 local1049 = Static62.aClass168_11;
							synchronized (Static62.aClass168_11) {
								local816 = (Class43) Static62.aClass168_11.method3860(this.aLong275);
							}
						}
						if (local816 != null && arg16.method8628(local816.ua(), local37) == 0) {
							break;
						}
						return null;
					}
					@Pc(1084) Class197[] local1084 = new Class197[local43.length];
					for (local1086 = 0; local1086 < local43.length; local1086++) {
						local1092 = local43[local1086];
						@Pc(1094) Class192 local1094 = null;
						@Pc(1119) boolean local1119 = local1086 == 5 && local45 || local1086 == 3 && local47;
						@Pc(1156) Class197 local1156;
						if ((local1092 & 0x40000000) != 0) {
							if (!local1119 && this.aClass192Array1 != null && this.aClass192Array1[local1086] != null) {
								local1094 = this.aClass192Array1[local1086];
							}
							local1156 = arg6.method3191(local1092 & 0x3FFFFFFF).method5692(this.aBoolean669, local1094);
							if (local1156 != null) {
								local1084[local1086] = local1156;
							}
						} else if ((local1092 & Integer.MIN_VALUE) != 0) {
							local1156 = arg4.method6580(local1092 & 0x3FFFFFFF).method4241();
							if (local1156 != null) {
								local1084[local1086] = local1156;
							}
						}
					}
					@Pc(1217) int local1217;
					if (local824 != null && local824.anIntArrayArray16 != null) {
						for (local1092 = 0; local1092 < local824.anIntArrayArray16.length; local1092++) {
							if (local1084[local1092] != null) {
								local890 = 0;
								local1217 = 0;
								@Pc(1219) int local1219 = 0;
								@Pc(1221) int local1221 = 0;
								@Pc(1223) int local1223 = 0;
								@Pc(1225) int local1225 = 0;
								if (local824.anIntArrayArray16[local1092] != null) {
									local1223 = local824.anIntArrayArray16[local1092][4] << 3;
									local1217 = local824.anIntArrayArray16[local1092][1];
									local1221 = local824.anIntArrayArray16[local1092][3] << 3;
									local1225 = local824.anIntArrayArray16[local1092][5] << 3;
									local890 = local824.anIntArrayArray16[local1092][0];
									local1219 = local824.anIntArrayArray16[local1092][2];
								}
								if (local1221 != 0 || local1223 != 0 || local1225 != 0) {
									local1084[local1092].method4594(local1223, local1225, local1221);
								}
								if (local890 != 0 || local1217 != 0 || local1219 != 0) {
									local1084[local1092].method4600(local1217, local890, local1219);
								}
							}
						}
					}
					@Pc(1341) int local1341 = local37 | 0x4000;
					@Pc(1348) Class197 local1348 = new Class197(local1084, local1084.length);
					local816 = arg16.method8588(local1348, local1341, Static545.anInt8676, 64, 850);
					for (local890 = 0; local890 < 5; local890++) {
						for (local1217 = 0; local1217 < Static467.aShortArrayArrayArray4.length; local1217++) {
							if (this.anIntArray536[local890] < Static467.aShortArrayArrayArray4[local1217][local890].length) {
								local816.ia(Static445.aShortArrayArray20[local1217][local890], Static467.aShortArrayArrayArray4[local1217][local890][this.anIntArray536[local890]]);
							}
						}
					}
					if (true) {
						local816.s(local37);
						@Pc(1426) Class168 local1426 = Static62.aClass168_11;
						synchronized (Static62.aClass168_11) {
							Static62.aClass168_11.method3853(local40, local816);
						}
						this.aLong275 = local40;
					}
					break;
				}
				local872 = local43[local864];
				@Pc(874) Class192 local874 = null;
				@Pc(876) boolean local876 = false;
				if (local45) {
					if (arg17.anInt3470 == local864) {
						local876 = true;
					} else {
						for (local890 = 0; local890 < arg17.anIntArray160.length; local890++) {
							if (local864 == arg17.anIntArray160[local890]) {
								local876 = true;
								break;
							}
						}
					}
				}
				if (local47) {
					if (arg17.anInt3467 == local864) {
						local876 = true;
					} else {
						for (local890 = 0; local890 < arg17.anIntArray161.length; local890++) {
							if (arg17.anIntArray161[local890] == local864) {
								local876 = true;
								break;
							}
						}
					}
				}
				if ((local872 & 0x40000000) != 0) {
					if (!local876 && this.aClass192Array1 != null && this.aClass192Array1[local864] != null) {
						local874 = this.aClass192Array1[local864];
					}
					if (!arg6.method3191(local872 & 0x3FFFFFFF).method5693(this.aBoolean669, local874)) {
						local862 = true;
					}
				} else if ((local872 & Integer.MIN_VALUE) != 0 && !arg4.method6580(local872 & 0x3FFFFFFF).method4245()) {
					local862 = true;
				}
				local864++;
			}
		}
		@Pc(1448) Class43 local1448 = local816.method8840((byte) 4, local37, true);
		local862 = false;
		if (arg15 != null) {
			for (local864 = 0; local864 < arg15.length; local864++) {
				if (arg15[local864] != -1) {
					local862 = true;
				}
			}
		}
		if (!local295 && !local862) {
			return local1448;
		}
		@Pc(1487) Class10[] local1487 = null;
		if (local824 != null) {
			local1487 = local824.method1747(arg16);
		}
		if (local862 && local1487 != null) {
			for (local872 = 0; local872 < arg15.length; local872++) {
				if (local1487[local872] != null) {
					local1448.method8856(local1487[local872], 0x1 << local872, true);
				}
			}
		}
		local872 = 0;
		local1086 = 1;
		while (local303 > local872) {
			if (Static347.aClass5_Sub1_Sub21Array2[local872] != null) {
				local1448.method8854((int[]) null, false, Static347.aClass5_Sub1_Sub21Array2[local872], Static492.anIntArray461[local872], Static519.anIntArray474[local872], Static300.aClass5_Sub1_Sub21Array1[local872], Static653.anIntArray608[local872] - 1, Static378.anIntArray367[local872], local1086);
			}
			local1086 <<= 0x1;
			local872++;
		}
		if (local862) {
			for (local1092 = 0; local1092 < arg15.length; local1092++) {
				if (arg15[local1092] != -1) {
					local890 = arg15[local1092] - arg0;
					local890 &= 0x3FFF;
					@Pc(1615) Class10 local1615 = arg16.method8623();
					local1615.method4217(local890);
					local1448.method8856(local1615, 0x1 << local1092, false);
				}
			}
		}
		if (local862 && local1487 != null) {
			for (local1092 = 0; local1092 < arg15.length; local1092++) {
				if (local1487[local1092] != null) {
					local1448.method8856(local1487[local1092], 0x1 << local1092, false);
				}
			}
		}
		if (local524 != null && local534 != null) {
			local1448.method8857(local524, local344, local518, arg14.aBooleanArray20, local526, local530, local544, arg1 - 1, false, local339, local532, local528, arg18 - 1, local534);
		} else if (local524 != null) {
			local1448.method8841(local526, local344, local524, false, local518, 0, arg1 - 1, local339);
		} else if (local534 != null) {
			local1448.method8841(local544, local532, local534, false, local528, 0, arg18 - 1, local530);
		}
		for (local1092 = 0; local1092 < local303; local1092++) {
			Static347.aClass5_Sub1_Sub21Array2[local1092] = null;
			Static300.aClass5_Sub1_Sub21Array1[local1092] = null;
			Static459.aClass264Array1[local1092] = null;
		}
		return local1448;
	}
}
