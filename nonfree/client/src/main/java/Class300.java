import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class300 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	private int anInt7472;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "J")
	private long aLong206;

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "[I")
	private int[] anIntArray504;

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
	public int anInt7482 = -1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!r;Lclient!qi;ILclient!gs;Lclient!wfa;IILclient!hq;IILclient!uaa;Lclient!ar;)Lclient!da;")
	public Class33 method6019(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class286 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class130 arg3, @OriginalArg(4) Class361 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class148 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Interface23 arg8, @OriginalArg(11) Class18 arg9) {
		if (this.anInt7482 != -1) {
			return arg4.method7581(this.anInt7482).method5943(arg2, arg8, arg6, arg5, arg7, arg0, arg9);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(48) int local48;
		@Pc(113) int local113;
		@Pc(58) int local58;
		@Pc(117) int local117;
		if (arg6 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local48 = arg6.anIntArray254[arg2];
			local27 = 2080;
			local58 = local48 >>> 16;
			@Pc(63) Class2_Sub2_Sub15 local63 = arg9.method292(local58);
			@Pc(67) int local67 = local48 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method5302(local67) | false;
				local31 = local63.method5305(local67) | false;
				local37 = local63.method5303(local67) | false;
				local35 = arg6.aBoolean220 | false;
			}
			if ((arg6.aBoolean219 || Static269.aBoolean328) && arg7 != -1 && arg6.anIntArray254.length > arg7) {
				local113 = arg6.anIntArray254[arg7];
				local117 = local113 >>> 16;
				@Pc(121) int local121 = local113 & 0xFFFF;
				@Pc(135) Class2_Sub2_Sub15 local135 = local58 == local117 ? local63 : arg9.method292(local117);
				if (local135 != null) {
					local33 |= local135.method5302(local121);
					local31 |= local135.method5305(local121);
					local37 |= local135.method5303(local121);
				}
			}
			if (local33) {
				local27 = 2208;
			}
			if (local31) {
				local27 |= 0x100;
			}
			if (local35) {
				local27 |= 0x200;
			}
			if (local37) {
				local27 |= 0x400;
			}
		}
		@Pc(184) Class21 local184 = Static547.aClass21_88;
		@Pc(193) Class33 local193;
		synchronized (Static547.aClass21_88) {
			local193 = (Class33) Static547.aClass21_88.method324(this.aLong206);
		}
		if (local193 == null || arg0.method6881(local193.PA(), local27) != 0) {
			if (local193 != null) {
				local27 = arg0.method6846(local27, local193.PA());
			}
			local35 = false;
			for (@Pc(224) int local224 = 0; local224 < 12; local224++) {
				local48 = this.anIntArray504[local224];
				if ((local48 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local48) != 0 && !arg1.method5743(local48 & 0x3FFFFFFF).method5131()) {
						local35 = true;
					}
				} else if (!arg3.method2311(local48 & 0x3FFFFFFF).method3323(this.aBoolean622)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(282) Class13[] local282 = new Class13[12];
			local113 = 0;
			for (@Pc(286) int local286 = 0; local286 < 12; local286++) {
				@Pc(293) int local293 = this.anIntArray504[local286];
				@Pc(313) Class13 local313;
				if ((local293 & 0x40000000) != 0) {
					local313 = arg3.method2311(local293 & 0x3FFFFFFF).method3324(this.aBoolean622);
					if (local313 != null) {
						local282[local113++] = local313;
					}
				} else if ((Integer.MIN_VALUE & local293) != 0) {
					local313 = arg1.method5743(local293 & 0x3FFFFFFF).method5130();
					if (local313 != null) {
						local282[local113++] = local313;
					}
				}
			}
			@Pc(350) Class13 local350 = new Class13(local282, local113);
			@Pc(354) int local354 = local27 | 0x4000;
			local193 = arg0.method6839(local350, local354, Static254.anInt7147, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				for (local117 = 0; local117 < Static320.aShortArrayArrayArray3.length; local117++) {
					if (Static320.aShortArrayArrayArray3[local117][local58].length > this.anIntArray503[local58]) {
						local193.d(Static250.aShortArrayArray12[local117][local58], Static320.aShortArrayArrayArray3[local117][local58][this.anIntArray503[local58]]);
					}
				}
			}
			local193.SA(local27);
			@Pc(420) Class21 local420 = Static547.aClass21_88;
			synchronized (Static547.aClass21_88) {
				Static547.aClass21_88.method317(local193, this.aLong206);
			}
		}
		if (arg6 == null) {
			return local193;
		} else {
			local193.method7200((byte) 4, local27, true);
			return arg6.method2586(arg2, local193, 2048, arg7, arg5);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILclient!qi;)V")
	public void method6020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class286 arg2) {
		@Pc(7) int local7 = Static494.anIntArray526[arg0];
		if (arg2.method5743(arg1) != null) {
			this.anIntArray504[local7] = arg1 | Integer.MIN_VALUE;
			this.method6029();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)V")
	public void method6022(@OriginalArg(0) boolean arg0) {
		this.aBoolean622 = arg0;
		this.method6029();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLclient!gs;I)V")
	public void method6023(@OriginalArg(0) int arg0, @OriginalArg(2) Class130 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray504[arg0] = 0;
		} else if (arg1.method2311(arg2) == null) {
			return;
		} else {
			this.anIntArray504[arg0] = arg2 | 0x40000000;
			this.method6029();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZII)V")
	public void method6024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray503[arg1] = arg0;
		this.method6029();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILclient!mba;Lclient!qi;ZILclient!ar;ILclient!r;IIILclient!uaa;[Lclient!tf;Lclient!hq;[IILclient!hq;Lclient!wfa;Lclient!gs;)Lclient!da;")
	public Class33 method6025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class221 arg2, @OriginalArg(4) Class286 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class18 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class162 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) Interface23 arg11, @OriginalArg(14) Class324[] arg12, @OriginalArg(15) Class148 arg13, @OriginalArg(16) int[] arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class148 arg16, @OriginalArg(19) Class361 arg17, @OriginalArg(20) Class130 arg18) {
		if (this.anInt7482 != -1) {
			return arg17.method7581(this.anInt7482).method5941(arg5, arg15, arg1, arg4, arg2, arg10, arg11, arg9, arg6, arg7, arg8, arg14, arg16, arg12, arg13, arg0);
		}
		@Pc(36) int local36 = arg1;
		@Pc(39) long local39 = this.aLong206;
		@Pc(42) int[] local42 = this.anIntArray504;
		if (arg13 != null && (arg13.anInt3047 >= 0 || arg13.anInt3057 >= 0)) {
			local42 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local42[local58] = this.anIntArray504[local58];
			}
			if (arg13.anInt3047 >= 0) {
				if (arg13.anInt3047 == 65535) {
					local39 ^= 0xFFFFFFFF00000000L;
					local42[5] = 0;
				} else {
					local42[5] = arg13.anInt3047 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg13.anInt3057 >= 0) {
				if (arg13.anInt3057 == 65535) {
					local39 ^= 0xFFFFFFFFL;
					local42[3] = 0;
				} else {
					local42[3] = arg13.anInt3057 | 0x40000000;
					local39 ^= local42[3];
				}
			}
		}
		@Pc(146) boolean local146 = false;
		@Pc(148) boolean local148 = false;
		@Pc(150) boolean local150 = false;
		@Pc(158) boolean local158 = arg13 != null || arg16 != null;
		@Pc(165) int local165 = arg12 == null ? 0 : arg12.length;
		@Pc(199) int local199;
		@Pc(204) int local204;
		for (@Pc(167) int local167 = 0; local167 < local165; local167++) {
			Static481.aClass2_Sub2_Sub15Array3[local167] = null;
			if (arg12[local167] != null) {
				@Pc(185) Class148 local185 = arg5.method296(arg12[local167].anInt8135);
				if (local185.anIntArray254 != null) {
					local158 = true;
					Static74.aClass148Array1[local167] = local185;
					local199 = arg12[local167].anInt8129;
					local204 = arg12[local167].anInt8128;
					@Pc(209) int local209 = local185.anIntArray254[local199];
					Static481.aClass2_Sub2_Sub15Array3[local167] = arg5.method292(local209 >>> 16);
					@Pc(222) int local222 = local209 & 0xFFFF;
					Static143.anIntArray499[local167] = local222;
					if (Static481.aClass2_Sub2_Sub15Array3[local167] != null) {
						local148 |= Static481.aClass2_Sub2_Sub15Array3[local167].method5302(local222);
						local146 |= Static481.aClass2_Sub2_Sub15Array3[local167].method5305(local222);
						local150 |= Static481.aClass2_Sub2_Sub15Array3[local167].method5303(local222);
					}
					if ((local185.aBoolean219 || Static269.aBoolean328) && local204 != -1 && local185.anIntArray254.length > local204) {
						Static571.anIntArray606[local167] = local185.anIntArray253[local199];
						Static219.anIntArray266[local167] = arg12[local167].anInt8133;
						@Pc(311) int local311 = local185.anIntArray254[local204];
						Static575.aClass2_Sub2_Sub15Array4[local167] = arg5.method292(local311 >>> 16);
						@Pc(324) int local324 = local311 & 0xFFFF;
						Static96.anIntArray150[local167] = local324;
						if (Static575.aClass2_Sub2_Sub15Array4[local167] != null) {
							local148 |= Static575.aClass2_Sub2_Sub15Array4[local167].method5302(local324);
							local146 |= Static575.aClass2_Sub2_Sub15Array4[local167].method5305(local324);
							local150 |= Static575.aClass2_Sub2_Sub15Array4[local167].method5303(local324);
						}
					} else {
						Static571.anIntArray606[local167] = 0;
						Static219.anIntArray266[local167] = 0;
						Static575.aClass2_Sub2_Sub15Array4[local167] = null;
						Static96.anIntArray150[local167] = -1;
					}
				}
			}
		}
		@Pc(369) int local369 = -1;
		local199 = -1;
		local204 = 0;
		@Pc(375) Class2_Sub2_Sub15 local375 = null;
		@Pc(377) Class2_Sub2_Sub15 local377 = null;
		@Pc(379) int local379 = -1;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = 0;
		@Pc(385) Class2_Sub2_Sub15 local385 = null;
		@Pc(387) Class2_Sub2_Sub15 local387 = null;
		if (local158) {
			@Pc(400) int local400;
			@Pc(459) int local459;
			if (arg13 != null) {
				local369 = arg13.anIntArray254[arg10];
				local400 = local369 >>> 16;
				local369 &= 0xFFFF;
				local375 = arg5.method292(local400);
				if (local375 != null) {
					local148 |= local375.method5302(local369);
					local146 |= local375.method5305(local369);
					local150 |= local375.method5303(local369);
				}
				if ((arg13.aBoolean219 || Static269.aBoolean328) && arg6 != -1 && arg6 < arg13.anIntArray254.length) {
					local204 = arg13.anIntArray253[arg10];
					local199 = arg13.anIntArray254[arg6];
					local459 = local199 >>> 16;
					local199 &= 0xFFFF;
					local377 = local400 == local459 ? local375 : arg5.method292(local459);
					if (local377 != null) {
						local148 |= local377.method5302(local199);
						local146 |= local377.method5305(local199);
						local150 |= local377.method5303(local199);
					}
				}
			}
			local36 = arg1 | 0x20;
			if (arg16 != null) {
				local379 = arg16.anIntArray254[arg9];
				local400 = local379 >>> 16;
				local379 &= 0xFFFF;
				local385 = arg5.method292(local400);
				if (local385 != null) {
					local148 |= local385.method5302(local379);
					local146 |= local385.method5305(local379);
					local150 |= local385.method5303(local379);
				}
				if ((arg16.aBoolean219 || Static269.aBoolean328) && arg8 != -1 && arg8 < arg16.anIntArray254.length) {
					local381 = arg16.anIntArray254[arg8];
					local383 = arg16.anIntArray253[arg9];
					local459 = local381 >>> 16;
					local381 &= 0xFFFF;
					local387 = local400 == local459 ? local385 : arg5.method292(local459);
					if (local387 != null) {
						local148 |= local387.method5302(local381);
						local146 |= local387.method5305(local381);
						local150 |= local387.method5303(local381);
					}
				}
			}
			if (local148) {
				local36 |= 0x80;
			}
			if (local146) {
				local36 |= 0x100;
			}
			if (local150) {
				local36 |= 0x400;
			}
		}
		@Pc(636) Class21 local636 = Static31.aClass21_9;
		@Pc(644) Class33 local644;
		synchronized (Static31.aClass21_9) {
			local644 = (Class33) Static31.aClass21_9.method324(local39);
		}
		@Pc(652) Class61 local652 = null;
		if (this.anInt7472 != -1) {
			local652 = arg2.method4666(this.anInt7472);
		}
		@Pc(683) boolean local683;
		@Pc(685) int local685;
		@Pc(691) int local691;
		@Pc(771) int local771;
		@Pc(777) int local777;
		@Pc(841) int local841;
		if (local644 == null || arg7.method6881(local644.PA(), local36) != 0) {
			if (local644 != null) {
				local36 = arg7.method6846(local36, local644.PA());
			}
			local683 = false;
			for (local685 = 0; local685 < 12; local685++) {
				local691 = local42[local685];
				if ((local691 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local691) != 0 && !arg3.method5743(local691 & 0x3FFFFFFF).method5128()) {
						local683 = true;
					}
				} else if (!arg18.method2311(local691 & 0x3FFFFFFF).method3321(this.aBoolean622)) {
					local683 = true;
				}
			}
			if (local683) {
				if (this.aLong207 != -1L) {
					@Pc(738) Class21 local738 = Static31.aClass21_9;
					synchronized (Static31.aClass21_9) {
						local644 = (Class33) Static31.aClass21_9.method324(this.aLong207);
					}
				}
				if (local644 == null || arg7.method6881(local644.PA(), local36) != 0) {
					return null;
				}
			} else {
				@Pc(769) Class13[] local769 = new Class13[12];
				for (local771 = 0; local771 < 12; local771++) {
					local777 = local42[local771];
					@Pc(792) Class13 local792;
					if ((local777 & 0x40000000) != 0) {
						local792 = arg18.method2311(local777 & 0x3FFFFFFF).method3317(this.aBoolean622);
						if (local792 != null) {
							local769[local771] = local792;
						}
					} else if ((Integer.MIN_VALUE & local777) != 0) {
						local792 = arg3.method5743(local777 & 0x3FFFFFFF).method5125();
						if (local792 != null) {
							local769[local771] = local792;
						}
					}
				}
				@Pc(843) int local843;
				if (local652 != null && local652.anIntArrayArray19 != null) {
					for (local777 = 0; local777 < local652.anIntArrayArray19.length; local777++) {
						if (local769[local777] != null) {
							local841 = 0;
							local843 = 0;
							@Pc(845) int local845 = 0;
							@Pc(847) int local847 = 0;
							@Pc(849) int local849 = 0;
							@Pc(851) int local851 = 0;
							if (local652.anIntArrayArray19[local777] != null) {
								local843 = local652.anIntArrayArray19[local777][1];
								local841 = local652.anIntArrayArray19[local777][0];
								local851 = local652.anIntArrayArray19[local777][5] << 3;
								local845 = local652.anIntArrayArray19[local777][2];
								local847 = local652.anIntArrayArray19[local777][3] << 3;
								local849 = local652.anIntArrayArray19[local777][4] << 3;
							}
							if (local847 != 0 || local849 != 0 || local851 != 0) {
								local769[local777].method238(local849, local851, local847);
							}
							if (local841 != 0 || local843 != 0 || local845 != 0) {
								local769[local777].method237(local841, local845, local843);
							}
						}
					}
				}
				@Pc(957) Class13 local957 = new Class13(local769, local769.length);
				@Pc(961) int local961 = local36 | 0x4000;
				local644 = arg7.method6839(local957, local961, Static254.anInt7147, 64, 850);
				for (local841 = 0; local841 < 5; local841++) {
					for (local843 = 0; local843 < Static320.aShortArrayArrayArray3.length; local843++) {
						if (this.anIntArray503[local841] < Static320.aShortArrayArrayArray3[local843][local841].length) {
							local644.d(Static250.aShortArrayArray12[local843][local841], Static320.aShortArrayArrayArray3[local843][local841][this.anIntArray503[local841]]);
						}
					}
				}
				local644.SA(local36);
				@Pc(1027) Class21 local1027 = Static31.aClass21_9;
				synchronized (Static31.aClass21_9) {
					Static31.aClass21_9.method317(local644, local39);
				}
				this.aLong207 = local39;
			}
		}
		@Pc(1049) Class33 local1049 = local644.method7200((byte) 4, local36, true);
		local683 = false;
		if (arg14 != null) {
			for (local685 = 0; local685 < 12; local685++) {
				if (arg14[local685] != -1) {
					local683 = true;
				}
			}
		}
		if (!local158 && !local683) {
			return local1049;
		}
		@Pc(1085) Class25[] local1085 = null;
		if (local652 != null) {
			local1085 = local652.method1202(arg7);
		}
		if (local683 && local1085 != null) {
			for (local691 = 0; local691 < 12; local691++) {
				if (local1085[local691] != null) {
					local1049.method7197(local1085[local691], 0x1 << local691, true);
				}
			}
		}
		local691 = 0;
		local771 = 1;
		while (local691 < local165) {
			if (Static481.aClass2_Sub2_Sub15Array3[local691] != null) {
				local1049.method7186(false, Static219.anIntArray266[local691] - 1, Static571.anIntArray606[local691], Static143.anIntArray499[local691], local771, Static96.anIntArray150[local691], null, Static481.aClass2_Sub2_Sub15Array3[local691], Static575.aClass2_Sub2_Sub15Array4[local691]);
			}
			local771 <<= 0x1;
			local691++;
		}
		if (local683) {
			for (local777 = 0; local777 < 12; local777++) {
				if (arg14[local777] != -1) {
					local841 = arg14[local777] - arg4;
					local841 &= 0x3FFF;
					@Pc(1186) Class25 local1186 = arg7.method6889();
					local1186.o(local841);
					local1049.method7197(local1186, 0x1 << local777, false);
				}
			}
		}
		if (local683 && local1085 != null) {
			for (local777 = 0; local777 < 12; local777++) {
				if (local1085[local777] != null) {
					local1049.method7197(local1085[local777], 0x1 << local777, false);
				}
			}
		}
		if (local375 != null && local385 != null) {
			local1049.method7188(local375, local383, local385, arg15 - 1, arg0 + -1, local387, false, local377, local381, local204, local379, local369, arg13.aBooleanArray9, local199);
		} else if (local375 != null) {
			local1049.method7184(local204, local369, 0, local377, local375, arg0 - 1, local199, false);
		} else if (local385 != null) {
			local1049.method7184(local383, local379, 0, local387, local385, arg15 - 1, local381, false);
		}
		for (local777 = 0; local777 < local165; local777++) {
			Static481.aClass2_Sub2_Sub15Array3[local777] = null;
			Static575.aClass2_Sub2_Sub15Array4[local777] = null;
			Static74.aClass148Array1[local777] = null;
		}
		return local1049;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!r;IIIILclient!ar;IIILclient!hq;Lclient!qi;I)Lclient!da;")
	public Class33 method6026(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class18 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class148 arg8, @OriginalArg(10) Class286 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		@Pc(38) int local38;
		if (arg8 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg8.anIntArray254[arg3];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(43) Class2_Sub2_Sub15 local43 = arg4.method292(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method5302(local47) | false;
				local11 = local43.method5305(local47) | false;
				local17 = local43.method5303(local47) | false;
				local15 = arg8.aBoolean220 | false;
			}
			if ((arg8.aBoolean219 || Static269.aBoolean328) && arg1 != -1 && arg8.anIntArray254.length > arg1) {
				local94 = arg8.anIntArray254[arg1];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(116) Class2_Sub2_Sub15 local116;
				if (local38 == local98) {
					local116 = local43;
				} else {
					local116 = arg4.method292(local102 >>> 16);
				}
				if (local116 != null) {
					local13 |= local116.method5302(local102);
					local11 |= local116.method5305(local102);
					local17 |= local116.method5303(local102);
				}
			}
			if (local13) {
				local7 = 2208;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
			if (local17) {
				local7 |= 0x400;
			}
		}
		@Pc(179) long local179 = (long) arg6 | (long) arg5 << 32 | (long) (arg7 << 16);
		@Pc(192) Class21 local192 = Static547.aClass21_88;
		@Pc(200) Class33 local200;
		synchronized (Static547.aClass21_88) {
			local200 = (Class33) Static547.aClass21_88.method324(local179);
		}
		if (local200 == null || arg0.method6881(local200.PA(), local7) != 0) {
			if (local200 != null) {
				local7 = arg0.method6846(local7, local200.PA());
			}
			@Pc(227) Class13[] local227 = new Class13[3];
			local94 = 0;
			if (!arg9.method5743(arg6).method5131() || !arg9.method5743(arg7).method5131() || !arg9.method5743(arg5).method5131()) {
				return null;
			}
			@Pc(259) Class13 local259 = arg9.method5743(arg6).method5130();
			if (local259 != null) {
				local94++;
				local227[0] = local259;
			}
			local259 = arg9.method5743(arg7).method5130();
			if (local259 != null) {
				local227[local94++] = local259;
			}
			local259 = arg9.method5743(arg5).method5130();
			if (local259 != null) {
				local227[local94++] = local259;
			}
			@Pc(298) int local298 = local7 | 0x4000;
			local259 = new Class13(local227, local94);
			local200 = arg0.method6839(local259, local298, Static254.anInt7147, 64, 768);
			for (@Pc(314) int local314 = 0; local314 < 5; local314++) {
				for (local38 = 0; local38 < Static320.aShortArrayArrayArray3.length; local38++) {
					if (Static320.aShortArrayArrayArray3[local38][local314].length > this.anIntArray503[local314]) {
						local200.d(Static250.aShortArrayArray12[local38][local314], Static320.aShortArrayArrayArray3[local38][local314][this.anIntArray503[local314]]);
					}
				}
			}
			local200.SA(local7);
			@Pc(370) Class21 local370 = Static547.aClass21_88;
			synchronized (Static547.aClass21_88) {
				Static547.aClass21_88.method317(local200, local179);
			}
		}
		if (arg8 == null) {
			return local200;
		} else {
			local200 = local200.method7200((byte) 4, local7, true);
			return arg8.method2586(arg3, local200, 2048, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[I[IZIB)V")
	public void method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anIntArray504 = arg1;
		this.aBoolean622 = arg3;
		if (this.anInt7472 != arg4) {
			this.anInt7472 = arg4;
		}
		this.anInt7482 = arg0;
		this.anIntArray503 = arg2;
		this.method6029();
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
	private void method6029() {
		this.aLong206 = -1L;
		@Pc(10) long[] local10 = Class289.aLongArray13;
		this.aLong206 = local10[(int) (((long) (this.anInt7472 >> 8) ^ this.aLong206) & 0xFFL)] ^ this.aLong206 >>> 8;
		this.aLong206 = local10[(int) ((this.aLong206 ^ (long) this.anInt7472) & 0xFFL)] ^ this.aLong206 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong206 = this.aLong206 >>> 8 ^ local10[(int) (((long) (this.anIntArray504[local50] >> 24) ^ this.aLong206) & 0xFFL)];
			this.aLong206 = this.aLong206 >>> 8 ^ local10[(int) ((this.aLong206 ^ (long) (this.anIntArray504[local50] >> 16)) & 0xFFL)];
			this.aLong206 = local10[(int) ((this.aLong206 ^ (long) (this.anIntArray504[local50] >> 8)) & 0xFFL)] ^ this.aLong206 >>> 8;
			this.aLong206 = this.aLong206 >>> 8 ^ local10[(int) (((long) this.anIntArray504[local50] ^ this.aLong206) & 0xFFL)];
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong206 = local10[(int) (((long) this.anIntArray503[local144] ^ this.aLong206) & 0xFFL)] ^ this.aLong206 >>> 8;
		}
		this.aLong206 = this.aLong206 >>> 8 ^ local10[(int) ((this.aLong206 ^ (long) (this.aBoolean622 ? 1 : 0)) & 0xFFL)];
	}
}
