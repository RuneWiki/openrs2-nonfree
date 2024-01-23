import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!k", name = "I", descriptor = "I")
	public int anInt2305;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "Lclient!ff;")
	private Class33 aClass33_6;

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!k", name = "hb", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!k", name = "ib", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!k", name = "kb", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!k", name = "nb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!k", name = "xb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "S")
	public short aShort24 = 0;

	@OriginalMember(owner = "client!k", name = "O", descriptor = "I")
	public int anInt2310 = -1;

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
	public int anInt2316 = -1;

	@OriginalMember(owner = "client!k", name = "K", descriptor = "I")
	private int anInt2307 = 128;

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
	private int anInt2319 = 128;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "I")
	private int anInt2308 = 0;

	@OriginalMember(owner = "client!k", name = "X", descriptor = "I")
	public int anInt2315 = -1;

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
	private int anInt2317 = -1;

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "S")
	public short aShort25 = 0;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "Z")
	public boolean aBoolean125 = true;

	@OriginalMember(owner = "client!k", name = "pb", descriptor = "Lclient!kh;")
	public Class60 aClass60_752 = Static74.aClass60_581;

	@OriginalMember(owner = "client!k", name = "ub", descriptor = "I")
	public int anInt2327 = -1;

	@OriginalMember(owner = "client!k", name = "N", descriptor = "I")
	public int anInt2309 = -1;

	@OriginalMember(owner = "client!k", name = "qb", descriptor = "I")
	public int anInt2325 = -1;

	@OriginalMember(owner = "client!k", name = "wb", descriptor = "I")
	public int anInt2328 = -1;

	@OriginalMember(owner = "client!k", name = "mb", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
	public int anInt2322 = -1;

	@OriginalMember(owner = "client!k", name = "zb", descriptor = "Z")
	public boolean aBoolean128 = true;

	@OriginalMember(owner = "client!k", name = "sb", descriptor = "I")
	public int anInt2326 = -1;

	@OriginalMember(owner = "client!k", name = "yb", descriptor = "[Lclient!kh;")
	public Class60[] aClass60Array15 = new Class60[5];

	@OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
	public int anInt2321 = 32;

	@OriginalMember(owner = "client!k", name = "Ab", descriptor = "I")
	public int anInt2329 = 1;

	@OriginalMember(owner = "client!k", name = "Db", descriptor = "I")
	private int anInt2331 = 0;

	@OriginalMember(owner = "client!k", name = "vb", descriptor = "Z")
	public boolean aBoolean127 = true;

	@OriginalMember(owner = "client!k", name = "ob", descriptor = "I")
	private int anInt2324 = -1;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Lclient!k;")
	public Class1_Sub1_Sub9 method1739() {
		@Pc(10) int local10 = -1;
		if (this.anInt2317 != -1) {
			local10 = Static7.method142(this.anInt2317);
		} else if (this.anInt2324 != -1) {
			local10 = Static126.anIntArray358[this.anInt2324];
		}
		if (local10 < 0 || this.anIntArray295.length - 1 <= local10 || this.anIntArray295[local10] == -1) {
			@Pc(59) int local59 = this.anIntArray295[this.anIntArray295.length - 1];
			return local59 == -1 ? null : Static52.method1014(local59);
		} else {
			return Static52.method1014(this.anIntArray295[local10]);
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)Z")
	public boolean method1740() {
		if (this.anIntArray295 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2317 != -1) {
			local10 = Static7.method142(this.anInt2317);
		} else if (this.anInt2324 != -1) {
			local10 = Static126.anIntArray358[this.anInt2324];
		}
		if (local10 < 0 || local10 >= this.anIntArray295.length - 1 || this.anIntArray295[local10] == -1) {
			@Pc(57) int local57 = this.anIntArray295[this.anIntArray295.length - 1];
			return local57 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!nc;II)V")
	private void method1741(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 1) {
			local18 = arg0.method895();
			this.anIntArray294 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray294[local24] = arg0.method946();
			}
		} else if (arg1 == 2) {
			this.aClass60_752 = arg0.method935();
		} else if (arg1 == 12) {
			this.anInt2329 = arg0.method895();
		} else if (arg1 == 13) {
			this.anInt2328 = arg0.method946();
		} else if (arg1 == 14) {
			this.anInt2326 = arg0.method946();
		} else if (arg1 == 15) {
			this.anInt2310 = arg0.method946();
		} else if (arg1 == 16) {
			this.anInt2322 = arg0.method946();
		} else if (arg1 == 17) {
			this.anInt2326 = arg0.method946();
			this.anInt2309 = arg0.method946();
			this.anInt2316 = arg0.method946();
			this.anInt2325 = arg0.method946();
		} else {
			if (arg1 < 30 || arg1 >= 35) {
				if (arg1 == 40) {
					local18 = arg0.method895();
					this.aShortArray29 = new short[local18];
					this.aShortArray28 = new short[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.aShortArray29[local24] = (short) arg0.method946();
						this.aShortArray28[local24] = (short) arg0.method946();
					}
					return;
				} else if (arg1 == 41) {
					local18 = arg0.method895();
					this.aShortArray27 = new short[local18];
					this.aShortArray30 = new short[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.aShortArray27[local24] = (short) arg0.method946();
						this.aShortArray30[local24] = (short) arg0.method946();
					}
					return;
				} else if (arg1 == 42) {
					local18 = arg0.method895();
					this.aByteArray31 = new byte[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.aByteArray31[local24] = arg0.method891();
					}
					return;
				} else if (arg1 == 60) {
					local18 = arg0.method895();
					this.anIntArray296 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray296[local24] = arg0.method946();
					}
					return;
				} else if (arg1 == 93) {
					this.aBoolean128 = false;
					return;
				} else if (arg1 == 95) {
					this.anInt2327 = arg0.method946();
					return;
				} else if (arg1 == 97) {
					this.anInt2307 = arg0.method946();
					return;
				} else if (arg1 == 98) {
					this.anInt2319 = arg0.method946();
					return;
				} else if (arg1 == 99) {
					this.aBoolean126 = true;
					return;
				} else if (arg1 == 100) {
					this.anInt2331 = arg0.method891();
					return;
				} else if (arg1 == 101) {
					this.anInt2308 = arg0.method891() * 5;
					return;
				} else if (arg1 == 102) {
					this.anInt2315 = arg0.method946();
					return;
				} else {
					if (arg1 == 103) {
						this.anInt2321 = arg0.method946();
					} else if (arg1 == 106 || arg1 == 118) {
						this.anInt2317 = arg0.method946();
						local18 = -1;
						if (this.anInt2317 == 65535) {
							this.anInt2317 = -1;
						}
						this.anInt2324 = arg0.method946();
						if (this.anInt2324 == 65535) {
							this.anInt2324 = -1;
						}
						if (arg1 == 118) {
							local18 = arg0.method946();
							if (local18 == 65535) {
								local18 = -1;
							}
						}
						local24 = arg0.method895();
						this.anIntArray295 = new int[local24 + 2];
						for (@Pc(311) int local311 = 0; local311 <= local24; local311++) {
							this.anIntArray295[local311] = arg0.method946();
							if (this.anIntArray295[local311] == 65535) {
								this.anIntArray295[local311] = -1;
							}
						}
						this.anIntArray295[local24 + 1] = local18;
						return;
					} else if (arg1 == 107) {
						this.aBoolean127 = false;
						return;
					} else if (arg1 == 109) {
						this.aBoolean125 = false;
						return;
					} else if (arg1 != 111) {
						if (arg1 != 113) {
							if (arg1 == 114) {
								arg0.method891();
								arg0.method891();
							} else if (arg1 == 115) {
								this.aShort25 = (short) (arg0.method895() * 4);
								this.aShort24 = (short) (arg0.method895() * 4);
								return;
							} else if (arg1 == 119) {
								arg0.method891();
								return;
							} else if (arg1 == 249) {
								local18 = arg0.method895();
								if (this.aClass33_6 == null) {
									local24 = Static61.method1102(local18);
									this.aClass33_6 = new Class33(local24);
								}
								for (local24 = 0; local24 < local18; local24++) {
									@Pc(445) boolean local445 = arg0.method895() == 1;
									@Pc(449) int local449 = arg0.method920();
									@Pc(458) Class1 local458;
									if (local445) {
										local458 = new Class1_Sub6(arg0.method935());
									} else {
										local458 = new Class1_Sub16(arg0.method915());
									}
									this.aClass33_6.method1072((long) local449, local458);
								}
								return;
							}
							return;
						}
						arg0.method946();
						arg0.method946();
						return;
					}
					return;
				}
			}
			this.aClass60Array15[arg1 - 30] = arg0.method935();
			if (this.aClass60Array15[arg1 - 30].method1805(Static28.aClass60_978)) {
				this.aClass60Array15[arg1 - 30] = null;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!pj;Lclient!pj;I)Lclient!cf;")
	public Class9_Sub2 method1743(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub21 arg1, @OriginalArg(3) Class1_Sub1_Sub21 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray295 != null) {
			@Pc(12) Class1_Sub1_Sub9 local12 = this.method1739();
			return local12 == null ? null : local12.method1743(arg0, arg1, arg2, arg3);
		}
		@Pc(34) Class9_Sub2 local34 = (Class9_Sub2) Static188.aClass27_106.method965((long) this.anInt2305);
		if (local34 == null) {
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray294.length; local40++) {
				if (!Static16.aClass7_4.method3247(this.anIntArray294[local40], 0)) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(68) Class9_Sub1[] local68 = new Class9_Sub1[this.anIntArray294.length];
			for (@Pc(70) int local70 = 0; local70 < this.anIntArray294.length; local70++) {
				local68[local70] = Static14.method275(Static16.aClass7_4, this.anIntArray294[local70]);
			}
			@Pc(101) Class9_Sub1 local101;
			if (local68.length == 1) {
				local101 = local68[0];
			} else {
				local101 = new Class9_Sub1(local68, local68.length);
			}
			@Pc(112) int local112;
			if (this.aShortArray29 != null) {
				for (local112 = 0; local112 < this.aShortArray29.length; local112++) {
					if (this.aByteArray31 == null || local112 >= this.aByteArray31.length) {
						local101.method276(this.aShortArray29[local112], this.aShortArray28[local112]);
					} else {
						local101.method276(this.aShortArray29[local112], Static170.aShortArray49[this.aByteArray31[local112] & 0xFF]);
					}
				}
			}
			if (this.aShortArray27 != null) {
				for (local112 = 0; local112 < this.aShortArray27.length; local112++) {
					local101.method282(this.aShortArray27[local112], this.aShortArray30[local112]);
				}
			}
			local34 = local101.method288(this.anInt2331 + 64, this.anInt2308 + 850, -30, -50, -30);
			Static188.aClass27_106.method961(local34, (long) this.anInt2305);
		}
		@Pc(225) Class9_Sub2 local225;
		if (arg1 != null && arg2 != null) {
			local225 = arg1.method2618(arg2, arg3, arg0, local34);
		} else if (arg1 != null) {
			local225 = arg1.method2615(arg3, local34);
		} else if (arg2 == null) {
			local225 = local34.method1703(true, true);
		} else {
			local225 = arg2.method2615(arg0, local34);
		}
		if (this.anInt2307 != 128 || this.anInt2319 != 128) {
			local225.method1696(this.anInt2307, this.anInt2319, this.anInt2307);
		}
		return local225;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!pj;I)Lclient!cf;")
	public Class9_Sub2 method1744(@OriginalArg(1) Class1_Sub1_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray295 != null) {
			@Pc(12) Class1_Sub1_Sub9 local12 = this.method1739();
			return local12 == null ? null : local12.method1744(arg0, arg1);
		} else if (this.anIntArray296 == null) {
			return null;
		} else {
			@Pc(40) Class9_Sub2 local40 = (Class9_Sub2) Static172.aClass27_100.method965((long) this.anInt2305);
			if (local40 == null) {
				@Pc(44) boolean local44 = false;
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray296.length; local46++) {
					if (!Static16.aClass7_4.method3247(this.anIntArray296[local46], 0)) {
						local44 = true;
					}
				}
				if (local44) {
					return null;
				}
				@Pc(74) Class9_Sub1[] local74 = new Class9_Sub1[this.anIntArray296.length];
				for (@Pc(76) int local76 = 0; local76 < this.anIntArray296.length; local76++) {
					local74[local76] = Static14.method275(Static16.aClass7_4, this.anIntArray296[local76]);
				}
				@Pc(102) Class9_Sub1 local102;
				if (local74.length == 1) {
					local102 = local74[0];
				} else {
					local102 = new Class9_Sub1(local74, local74.length);
				}
				@Pc(116) int local116;
				if (this.aShortArray29 != null) {
					for (local116 = 0; local116 < this.aShortArray29.length; local116++) {
						if (this.aByteArray31 == null || this.aByteArray31.length <= local116) {
							local102.method276(this.aShortArray29[local116], this.aShortArray28[local116]);
						} else {
							local102.method276(this.aShortArray29[local116], Static170.aShortArray49[this.aByteArray31[local116] & 0xFF]);
						}
					}
				}
				if (this.aShortArray27 != null) {
					for (local116 = 0; local116 < this.aShortArray27.length; local116++) {
						local102.method282(this.aShortArray27[local116], this.aShortArray30[local116]);
					}
				}
				local40 = local102.method288(64, 768, -50, -10, -50);
				Static172.aClass27_100.method961(local40, (long) this.anInt2305);
			}
			if (arg0 != null) {
				local40 = arg0.method2620(arg1, local40);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!nc;)V")
	public void method1745(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method895();
			if (local9 == 0) {
				return;
			}
			this.method1741(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BII)I")
	public int method1746(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass33_6 == null) {
			return arg0;
		} else {
			@Pc(23) Class1_Sub16 local23 = (Class1_Sub16) this.aClass33_6.method1071((long) arg1);
			return local23 == null ? arg0 : local23.anInt2543;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!kh;IB)Lclient!kh;")
	public Class60 method1748(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass33_6 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub6 local16 = (Class1_Sub6) this.aClass33_6.method1071((long) arg1);
			return local16 == null ? arg0 : local16.aClass60_251;
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	public void method1749() {
	}
}
