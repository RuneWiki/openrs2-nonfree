import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class116 {

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "[Lclient!nla;")
	private Class262[] aClass262Array1;

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "Z")
	public boolean aBoolean287;

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "I")
	public int anInt2925 = -1;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "([Lclient!cb;Lclient!cb;Lclient!qq;ILclient!bja;Lclient!oha;Lclient!af;ZLclient!vt;Lclient!cb;ILclient!kh;[ILclient!ha;BLclient!bg;)Lclient!ka;")
	public Class45 method2531(@OriginalArg(0) Class53[] arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class314 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class41 arg4, @OriginalArg(5) Class274 arg5, @OriginalArg(6) Class7 arg6, @OriginalArg(8) Interface26 arg7, @OriginalArg(9) Class53 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class210 arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) Class145 arg12, @OriginalArg(15) Class37 arg13) {
		if (this.anInt2925 != -1) {
			return arg4.method754(this.anInt2925, 2).method6277((Class384) null, arg1, arg0, arg8, arg7, arg9, arg2, arg12, arg11, arg3);
		}
		@Pc(30) int local30 = arg9;
		@Pc(33) long local33 = this.aLong102;
		@Pc(44) int[] local44 = this.anIntArray222;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		@Pc(73) int local73;
		@Pc(125) int local125;
		if (arg1 != null) {
			@Pc(54) Class307 local54 = arg1.method4074();
			if (local54 != null && (local54.anInt8121 >= 0 || local54.anInt8134 >= 0)) {
				local44 = new int[this.anIntArray222.length];
				for (local73 = 0; local73 < local44.length; local73++) {
					local44[local73] = this.anIntArray222[local73];
				}
				if (local54.anInt8121 >= 0 && arg10.anInt5043 != -1) {
					local46 = true;
					if (local54.anInt8121 == 65535) {
						local44[arg10.anInt5043] = 0;
						local33 ^= 0xFFFFFFFF00000000L;
						for (local125 = 0; local125 < arg10.anIntArray357.length; local125++) {
							local44[arg10.anIntArray357[local125]] = 0;
						}
					} else {
						local44[arg10.anInt5043] = local54.anInt8121 | 0x40000000;
						for (local125 = 0; local125 < arg10.anIntArray357.length; local125++) {
							local44[arg10.anIntArray357[local125]] = 0;
						}
						local33 ^= (long) local44[arg10.anInt5043] << 32;
					}
				}
				if (local54.anInt8134 >= 0 && arg10.anInt5037 != -1) {
					if (local54.anInt8134 == 65535) {
						local44[arg10.anInt5037] = 0;
						for (local125 = 0; local125 < arg10.anIntArray358.length; local125++) {
							local44[arg10.anIntArray358[local125]] = 0;
						}
						local33 ^= 0xFFFFFFFFL;
					} else {
						local44[arg10.anInt5037] = local54.anInt8134 | 0x40000000;
						for (local125 = 0; local125 < arg10.anIntArray358.length; local125++) {
							local44[arg10.anIntArray358[local125]] = 0;
						}
						local33 ^= (long) local44[arg10.anInt5037];
					}
					local48 = true;
				}
			}
		}
		@Pc(289) boolean local289 = false;
		local73 = arg0 == null ? 0 : arg0.length;
		for (local125 = 0; local125 < local73; local125++) {
			if (arg0[local125] != null) {
				local30 |= arg0[local125].method4082();
				local289 = true;
			}
		}
		if (arg1 != null) {
			local30 |= arg1.method4082();
			local289 = true;
		}
		if (arg8 != null) {
			local30 |= arg8.method4082();
			local289 = true;
		}
		@Pc(347) boolean local347 = false;
		if (arg11 != null) {
			for (@Pc(351) int local351 = 0; local351 < arg11.length; local351++) {
				if (arg11[local351] != -1) {
					local347 = true;
					local30 |= 0x20;
				}
			}
		}
		@Pc(373) Class85 local373 = Static650.aClass85_66;
		@Pc(381) Class45 local381;
		synchronized (Static650.aClass85_66) {
			local381 = (Class45) Static650.aClass85_66.method1737(local33);
		}
		@Pc(389) Class49 local389 = null;
		if (this.anInt2912 != -1) {
			local389 = arg2.method7452(this.anInt2912);
		}
		@Pc(425) int local425;
		@Pc(433) int local433;
		@Pc(642) int local642;
		@Pc(648) int local648;
		if (local381 == null || arg12.method9686(local381.ua(), local30) != 0) {
			if (local381 != null) {
				local30 = arg12.method9695(local30, local381.ua());
			}
			@Pc(423) boolean local423 = false;
			local425 = 0;
			while (true) {
				@Pc(451) int local451;
				if (local425 >= local44.length) {
					if (local423) {
						if (this.aLong101 != -1L) {
							@Pc(608) Class85 local608 = Static650.aClass85_66;
							synchronized (Static650.aClass85_66) {
								local381 = (Class45) Static650.aClass85_66.method1737(this.aLong101);
							}
						}
						if (local381 == null || arg12.method9686(local381.ua(), local30) != 0) {
							return null;
						}
					} else {
						@Pc(640) Class229[] local640 = new Class229[local44.length];
						for (local642 = 0; local642 < local44.length; local642++) {
							local648 = local44[local642];
							@Pc(650) Class262 local650 = null;
							@Pc(673) boolean local673 = local642 == 5 && local46 || local642 == 3 && local48;
							@Pc(713) Class229 local713;
							if ((local648 & 0x40000000) != 0) {
								if (!local673 && this.aClass262Array1 != null && this.aClass262Array1[local642] != null) {
									local650 = this.aClass262Array1[local642];
								}
								local713 = arg13.method605(local648 & 0x3FFFFFFF).method4407(local650, this.aBoolean287);
								if (local713 != null) {
									local640[local642] = local713;
								}
							} else if ((local648 & Integer.MIN_VALUE) != 0) {
								local713 = arg6.method207(local648 & 0x3FFFFFFF).method1648();
								if (local713 != null) {
									local640[local642] = local713;
								}
							}
						}
						@Pc(770) int local770;
						if (local389 != null && local389.anIntArrayArray6 != null) {
							for (local648 = 0; local648 < local389.anIntArrayArray6.length; local648++) {
								if (local640[local648] != null) {
									local451 = 0;
									local770 = 0;
									@Pc(772) int local772 = 0;
									@Pc(774) int local774 = 0;
									@Pc(776) int local776 = 0;
									@Pc(778) int local778 = 0;
									if (local389.anIntArrayArray6[local648] != null) {
										local776 = local389.anIntArrayArray6[local648][4] << 3;
										local778 = local389.anIntArrayArray6[local648][5] << 3;
										local774 = local389.anIntArrayArray6[local648][3] << 3;
										local770 = local389.anIntArrayArray6[local648][1];
										local772 = local389.anIntArrayArray6[local648][2];
										local451 = local389.anIntArrayArray6[local648][0];
									}
									if (local774 != 0 || local776 != 0 || local778 != 0) {
										local640[local648].method5308(local776, local774, local778);
									}
									if (local451 != 0 || local770 != 0 || local772 != 0) {
										local640[local648].method5309(local770, local451, local772);
									}
								}
							}
						}
						@Pc(894) Class229 local894 = new Class229(local640, local640.length);
						@Pc(898) int local898 = local30 | 0x4000;
						local381 = arg12.method9700(local894, local898, Static254.anInt3989, 64, 850);
						for (local451 = 0; local451 < 10; local451++) {
							for (local770 = 0; local770 < Static75.aShortArrayArray1[local451].length; local770++) {
								if (Static87.aShortArrayArrayArray1[local451][local770].length > this.anIntArray221[local451]) {
									local381.ia(Static75.aShortArrayArray1[local451][local770], Static87.aShortArrayArrayArray1[local451][local770][this.anIntArray221[local451]]);
								}
							}
						}
						if (true) {
							local381.s(local30);
							@Pc(978) Class85 local978 = Static650.aClass85_66;
							synchronized (Static650.aClass85_66) {
								Static650.aClass85_66.method1745(local33, 16383, local381);
							}
							this.aLong101 = local33;
						}
					}
					break;
				}
				local433 = local44[local425];
				@Pc(435) Class262 local435 = null;
				@Pc(437) boolean local437 = false;
				if (local46) {
					if (arg10.anInt5043 == local425) {
						local437 = true;
					} else {
						for (local451 = 0; local451 < arg10.anIntArray357.length; local451++) {
							if (arg10.anIntArray357[local451] == local425) {
								local437 = true;
								break;
							}
						}
					}
				}
				if (local48) {
					if (arg10.anInt5037 == local425) {
						local437 = true;
					} else {
						for (local451 = 0; local451 < arg10.anIntArray358.length; local451++) {
							if (local425 == arg10.anIntArray358[local451]) {
								local437 = true;
								break;
							}
						}
					}
				}
				if ((local433 & 0x40000000) != 0) {
					if (!local437 && this.aClass262Array1 != null && this.aClass262Array1[local425] != null) {
						local435 = this.aClass262Array1[local425];
					}
					if (!arg13.method605(local433 & 0x3FFFFFFF).method4418(this.aBoolean287, local435)) {
						local423 = true;
					}
				} else if ((Integer.MIN_VALUE & local433) != 0 && !arg6.method207(local433 & 0x3FFFFFFF).method1647()) {
					local423 = true;
				}
				local425++;
			}
		}
		@Pc(1000) Class45 local1000 = local381.method5768((byte) 4, local30, true);
		if (!local289 && !local347) {
			return local1000;
		}
		@Pc(1011) Class86[] local1011 = null;
		if (local389 != null) {
			local1011 = local389.method947(arg12);
		}
		if (local347 && local1011 != null) {
			for (local425 = 0; local425 < arg11.length; local425++) {
				if (local1011[local425] != null) {
					local1000.method5756(local1011[local425], 0x1 << local425, true);
				}
			}
		}
		local425 = 0;
		local433 = 1;
		while (local73 > local425) {
			if (arg0[local425] != null) {
				arg0[local425].method4083(local433, local1000);
			}
			local425++;
			local433 <<= 0x1;
		}
		if (local347) {
			for (local642 = 0; local642 < arg11.length; local642++) {
				if (arg11[local642] != -1) {
					local648 = arg11[local642] - arg3;
					local648 &= 0x3FFF;
					@Pc(1119) Class86 local1119 = arg12.method9691();
					local1119.method7023(local648);
					local1000.method5756(local1119, 0x1 << local642, false);
				}
			}
		}
		if (local347 && local1011 != null) {
			for (local642 = 0; local642 < arg11.length; local642++) {
				if (local1011[local642] != null) {
					local1000.method5756(local1011[local642], 0x1 << local642, false);
				}
			}
		}
		if (arg1 != null && arg8 != null) {
			Static365.method5239(local1000, arg8, arg1);
		} else if (arg1 != null) {
			arg1.method4097(0, local1000);
		} else if (arg8 != null) {
			arg8.method4097(0, local1000);
		}
		return local1000;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BLclient!oha;ILclient!af;Lclient!cb;Lclient!ha;Lclient!bg;Lclient!bja;Lclient!vt;)Lclient!ka;")
	public Class45 method2532(@OriginalArg(1) Class274 arg0, @OriginalArg(3) Class7 arg1, @OriginalArg(4) Class53 arg2, @OriginalArg(5) Class145 arg3, @OriginalArg(6) Class37 arg4, @OriginalArg(7) Class41 arg5, @OriginalArg(8) Interface26 arg6) {
		if (this.anInt2925 != -1) {
			return arg5.method754(this.anInt2925, 2).method6276(arg6, arg3, (Class384) null, arg2);
		}
		@Pc(35) int local35 = arg2 == null ? 2048 : arg2.method4082() | 0x800;
		@Pc(45) Class85 local45 = Static124.aClass85_15;
		@Pc(54) Class45 local54;
		synchronized (Static124.aClass85_15) {
			local54 = (Class45) Static124.aClass85_15.method1737(this.aLong102);
		}
		if (local54 == null || arg3.method9686(local54.ua(), local35) != 0) {
			if (local54 != null) {
				local35 = arg3.method9695(local35, local54.ua());
			}
			@Pc(84) boolean local84 = false;
			for (@Pc(86) int local86 = 0; local86 < this.anIntArray222.length; local86++) {
				@Pc(95) int local95 = this.anIntArray222[local86];
				@Pc(97) Class262 local97 = null;
				if ((local95 & 0x40000000) != 0) {
					if (this.aClass262Array1 != null && this.aClass262Array1[local86] != null) {
						local97 = this.aClass262Array1[local86];
					}
					if (!arg4.method605(local95 & 0x3FFFFFFF).method4412(local97, this.aBoolean287)) {
						local84 = true;
					}
				} else if ((Integer.MIN_VALUE & local95) != 0 && !arg1.method207(local95 & 0x3FFFFFFF).method1646()) {
					local84 = true;
				}
			}
			if (local84) {
				return null;
			}
			@Pc(177) Class229[] local177 = new Class229[this.anIntArray222.length];
			@Pc(179) int local179 = 0;
			for (@Pc(181) int local181 = 0; local181 < this.anIntArray222.length; local181++) {
				@Pc(190) int local190 = this.anIntArray222[local181];
				@Pc(192) Class262 local192 = null;
				@Pc(211) Class229 local211;
				if ((local190 & 0x40000000) != 0) {
					if (this.aClass262Array1 != null && this.aClass262Array1[local181] != null) {
						local192 = this.aClass262Array1[local181];
					}
					local211 = arg4.method605(local190 & 0x3FFFFFFF).method4414(this.aBoolean287, local192);
					if (local211 != null) {
						local177[local179++] = local211;
					}
				} else if ((local190 & Integer.MIN_VALUE) != 0) {
					local211 = arg1.method207(local190 & 0x3FFFFFFF).method1650(113);
					if (local211 != null) {
						local177[local179++] = local211;
					}
				}
			}
			@Pc(270) int local270 = local35 | 0x4000;
			@Pc(276) Class229 local276 = new Class229(local177, local179);
			local54 = arg3.method9700(local276, local270, Static254.anInt3989, 64, 768);
			for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
				for (@Pc(292) int local292 = 0; local292 < Static75.aShortArrayArray1[local288].length; local292++) {
					if (Static87.aShortArrayArrayArray1[local288][local292].length > this.anIntArray221[local288]) {
						local54.ia(Static75.aShortArrayArray1[local288][local292], Static87.aShortArrayArrayArray1[local288][local292][this.anIntArray221[local288]]);
					}
				}
			}
			local54.s(local35);
			@Pc(348) Class85 local348 = Static124.aClass85_15;
			synchronized (Static124.aClass85_15) {
				Static124.aClass85_15.method1745(this.aLong102, 16383, local54);
			}
		}
		if (arg2 == null) {
			return local54;
		} else {
			@Pc(373) Class45 local373 = local54.method5768((byte) 4, local35, true);
			arg2.method4097(0, local373);
			return local373;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!bg;III)V")
	public void method2533(@OriginalArg(0) Class37 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == -1) {
			this.anIntArray222[arg2] = 0;
		} else if (arg0.method605(arg1) != null) {
			this.anIntArray222[arg2] = arg1 | 0x40000000;
			this.method2540();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(III)V")
	public void method2536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray221[arg1] = arg0;
		this.method2540();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!af;II)V")
	public void method2537(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = Static385.anIntArray421[arg2];
		if (arg1.method207(arg0) != null) {
			this.anIntArray222[local21] = arg0 | Integer.MIN_VALUE;
			this.method2540();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	private void method2540() {
		this.aLong102 = -1L;
		@Pc(34) long[] local34 = Class105_Sub2_Sub2.aLongArray20;
		this.aLong102 = this.aLong102 >>> 8 ^ local34[(int) (((long) (this.anInt2912 >> 8) ^ this.aLong102) & 0xFFL)];
		this.aLong102 = local34[(int) (((long) this.anInt2912 ^ this.aLong102) & 0xFFL)] ^ this.aLong102 >>> 8;
		for (@Pc(74) int local74 = 0; local74 < this.anIntArray222.length; local74++) {
			this.aLong102 = local34[(int) ((this.aLong102 ^ (long) (this.anIntArray222[local74] >> 24)) & 0xFFL)] ^ this.aLong102 >>> 8;
			this.aLong102 = local34[(int) ((this.aLong102 ^ (long) (this.anIntArray222[local74] >> 16)) & 0xFFL)] ^ this.aLong102 >>> 8;
			this.aLong102 = this.aLong102 >>> 8 ^ local34[(int) (((long) (this.anIntArray222[local74] >> 8) ^ this.aLong102) & 0xFFL)];
			this.aLong102 = local34[(int) ((this.aLong102 ^ (long) this.anIntArray222[local74]) & 0xFFL)] ^ this.aLong102 >>> 8;
		}
		@Pc(179) int local179;
		if (this.aClass262Array1 != null) {
			for (local179 = 0; local179 < this.aClass262Array1.length; local179++) {
				if (this.aClass262Array1[local179] != null) {
					@Pc(199) int[] local199;
					@Pc(205) int[] local205;
					if (this.aBoolean287) {
						local199 = this.aClass262Array1[local179].anIntArray505;
						local205 = this.aClass262Array1[local179].anIntArray504;
					} else {
						local199 = this.aClass262Array1[local179].anIntArray503;
						local205 = this.aClass262Array1[local179].anIntArray507;
					}
					@Pc(223) int local223;
					if (local199 != null) {
						for (local223 = 0; local223 < local199.length; local223++) {
							this.aLong102 = local34[(int) ((this.aLong102 ^ (long) (local199[local223] >> 8)) & 0xFFL)] ^ this.aLong102 >>> 8;
							this.aLong102 = local34[(int) ((this.aLong102 ^ (long) local199[local223]) & 0xFFL)] ^ this.aLong102 >>> 8;
						}
					}
					if (local205 != null) {
						for (local223 = 0; local223 < local205.length; local223++) {
							this.aLong102 = this.aLong102 >>> 8 ^ local34[(int) (((long) (local205[local223] >> 8) ^ this.aLong102) & 0xFFL)];
							this.aLong102 = local34[(int) (((long) local205[local223] ^ this.aLong102) & 0xFFL)] ^ this.aLong102 >>> 8;
						}
					}
					if (this.aClass262Array1[local179].aShortArray119 != null) {
						for (local223 = 0; local223 < this.aClass262Array1[local179].aShortArray119.length; local223++) {
							this.aLong102 = local34[(int) ((this.aLong102 ^ (long) (this.aClass262Array1[local179].aShortArray119[local223] >> 8)) & 0xFFL)] ^ this.aLong102 >>> 8;
							this.aLong102 = local34[(int) (((long) this.aClass262Array1[local179].aShortArray119[local223] ^ this.aLong102) & 0xFFL)] ^ this.aLong102 >>> 8;
						}
					}
					if (this.aClass262Array1[local179].aShortArray120 != null) {
						for (local223 = 0; local223 < this.aClass262Array1[local179].aShortArray120.length; local223++) {
							this.aLong102 = this.aLong102 >>> 8 ^ local34[(int) (((long) (this.aClass262Array1[local179].aShortArray120[local223] >> 8) ^ this.aLong102) & 0xFFL)];
							this.aLong102 = local34[(int) ((this.aLong102 ^ (long) this.aClass262Array1[local179].aShortArray120[local223]) & 0xFFL)] ^ this.aLong102 >>> 8;
						}
					}
				}
			}
		}
		for (local179 = 0; local179 < 10; local179++) {
			this.aLong102 = this.aLong102 >>> 8 ^ local34[(int) ((this.aLong102 ^ (long) this.anIntArray221[local179]) & 0xFFL)];
		}
		this.aLong102 = local34[(int) ((this.aLong102 ^ (long) (this.aBoolean287 ? 1 : 0)) & 0xFFL)] ^ this.aLong102 >>> 8;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZZ)V")
	public void method2541(@OriginalArg(1) boolean arg0) {
		this.aBoolean287 = arg0;
		this.method2540();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "([I[IIIZ[Lclient!nla;I)V")
	public void method2543(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class262[] arg4, @OriginalArg(6) int arg5) {
		this.aClass262Array1 = arg4;
		this.anInt2925 = arg2;
		if (arg5 != this.anInt2912) {
			this.anInt2912 = arg5;
		}
		this.anIntArray222 = arg0;
		this.aBoolean287 = arg3;
		this.anIntArray221 = arg1;
		this.method2540();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!af;Lclient!oha;IBLclient!cb;ILclient!ha;II)Lclient!ka;")
	public Class45 method2544(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class53 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg3 == null ? arg2 : arg3.method4082() | 0x800;
		@Pc(39) long local39 = (long) arg6 | (long) (arg4 << 16) | (long) arg7 << 32;
		@Pc(41) Class85 local41 = Static124.aClass85_15;
		@Pc(51) Class45 local51;
		synchronized (Static124.aClass85_15) {
			local51 = (Class45) Static124.aClass85_15.method1737(local39);
		}
		if (local51 == null || arg5.method9686(local51.ua(), local16) != 0) {
			if (local51 != null) {
				local16 = arg5.method9695(local16, local51.ua());
			}
			@Pc(82) Class229[] local82 = new Class229[3];
			@Pc(84) int local84 = 0;
			if (!arg0.method207(arg6).method1646() || !arg0.method207(arg4).method1646() || !arg0.method207(arg7).method1646()) {
				return null;
			}
			@Pc(123) Class229 local123 = arg0.method207(arg6).method1650(126);
			if (local123 != null) {
				local84++;
				local82[0] = local123;
			}
			local123 = arg0.method207(arg4).method1650(113);
			if (local123 != null) {
				local82[local84++] = local123;
			}
			local123 = arg0.method207(arg7).method1650(124);
			if (local123 != null) {
				local82[local84++] = local123;
			}
			@Pc(172) int local172 = local16 | 0x4000;
			local123 = new Class229(local82, local84);
			local51 = arg5.method9700(local123, local172, Static254.anInt3989, 64, 768);
			for (@Pc(188) int local188 = 0; local188 < 10; local188++) {
				for (@Pc(192) int local192 = 0; local192 < Static75.aShortArrayArray1[local188].length; local192++) {
					if (Static87.aShortArrayArrayArray1[local188][local192].length > this.anIntArray221[local188]) {
						local51.ia(Static75.aShortArrayArray1[local188][local192], Static87.aShortArrayArrayArray1[local188][local192][this.anIntArray221[local188]]);
					}
				}
			}
			local51.s(local16);
			@Pc(246) Class85 local246 = Static124.aClass85_15;
			synchronized (Static124.aClass85_15) {
				Static124.aClass85_15.method1745(local39, 16383, local51);
			}
		}
		if (arg3 == null) {
			return local51;
		} else {
			local51 = local51.method5768((byte) 4, local16, true);
			arg3.method4097(0, local51);
			return local51;
		}
	}
}
