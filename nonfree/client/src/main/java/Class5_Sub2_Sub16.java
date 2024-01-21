import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!vb", name = "pb", descriptor = "I")
	public int anInt3135;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!vb", name = "Ab", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!vb", name = "Db", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!vb", name = "Nb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!vb", name = "Ub", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!vb", name = "dc", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
	public int anInt3117 = 0;

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
	private int anInt3119 = -1;

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
	public int anInt3120 = 1;

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
	private int anInt3121 = 0;

	@OriginalMember(owner = "client!vb", name = "ob", descriptor = "I")
	private int anInt3134 = 0;

	@OriginalMember(owner = "client!vb", name = "lb", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!vb", name = "U", descriptor = "Z")
	public boolean aBoolean111 = true;

	@OriginalMember(owner = "client!vb", name = "rb", descriptor = "I")
	public int anInt3136 = 0;

	@OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
	private int anInt3130 = -1;

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
	public int anInt3124 = -1;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
	public int anInt3131 = -1;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
	private int anInt3125 = 0;

	@OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
	public int anInt3126 = 1;

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
	private int anInt3122 = 0;

	@OriginalMember(owner = "client!vb", name = "Qb", descriptor = "I")
	public int anInt3148 = -1;

	@OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
	public int anInt3137 = -1;

	@OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
	public int anInt3133 = 2;

	@OriginalMember(owner = "client!vb", name = "xb", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
	public int anInt3123 = 0;

	@OriginalMember(owner = "client!vb", name = "Mb", descriptor = "I")
	public int anInt3146 = 16;

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "I")
	private int anInt3127 = 0;

	@OriginalMember(owner = "client!vb", name = "Hb", descriptor = "I")
	private int anInt3144 = 128;

	@OriginalMember(owner = "client!vb", name = "Ob", descriptor = "I")
	public int anInt3147 = -1;

	@OriginalMember(owner = "client!vb", name = "Zb", descriptor = "I")
	public int anInt3150 = 0;

	@OriginalMember(owner = "client!vb", name = "Xb", descriptor = "I")
	private int anInt3149 = 128;

	@OriginalMember(owner = "client!vb", name = "Jb", descriptor = "[Lclient!r;")
	public final Class61[] aClass61Array24 = new Class61[5];

	@OriginalMember(owner = "client!vb", name = "Rb", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!vb", name = "cc", descriptor = "I")
	private int anInt3152 = 128;

	@OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
	public int anInt3140 = -1;

	@OriginalMember(owner = "client!vb", name = "Eb", descriptor = "Lclient!r;")
	public Class61 aClass61_997 = Static129.aClass61_1071;

	@OriginalMember(owner = "client!vb", name = "Yb", descriptor = "Z")
	public boolean aBoolean115 = true;

	@OriginalMember(owner = "client!vb", name = "jc", descriptor = "I")
	private int anInt3157 = -1;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Z")
	public boolean method1959() {
		if (this.anIntArray377 == null) {
			return this.anInt3148 != -1 || this.anIntArray376 != null;
		}
		for (@Pc(26) int local26 = 0; local26 < this.anIntArray377.length; local26++) {
			if (this.anIntArray377[local26] != -1) {
				@Pc(43) Class5_Sub2_Sub16 local43 = Static43.method767(this.anIntArray377[local26]);
				if (local43.anInt3148 != -1 || local43.anIntArray376 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[[IIIILclient!w;II)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method1960(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub2_Sub17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray375 == null) {
			local16 = (this.anInt3135 << 10) + arg6;
		} else {
			local16 = arg6 + (arg7 << 3) + (this.anInt3135 << 10);
		}
		@Pc(36) Class5_Sub2_Sub2_Sub6 local36 = (Class5_Sub2_Sub2_Sub6) Static9.aClass29_4.method766(local16);
		if (local36 == null) {
			@Pc(44) Class5_Sub2_Sub2_Sub1 local44 = this.method1968(arg6, arg7);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method342(this.anInt3127 + 64, this.anInt3125 * 5 + 768, -50, -10, -50);
			Static9.aClass29_4.method762(local36, local16);
		}
		if (arg5 == null && this.anInt3130 == -1) {
			return local36;
		}
		if (arg5 == null) {
			local36 = local36.method2156(true);
		} else {
			local36 = arg5.method2062(local36, arg3, arg6);
		}
		if (this.anInt3130 >= 0) {
			local36 = local36.method2160(arg1, arg0, arg2, arg4, false, this.anInt3130);
		}
		return local36;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
	public void method1961() {
		if (this.anInt3137 == -1) {
			this.anInt3137 = 0;
			if (this.anIntArray380 != null && (this.anIntArray375 == null || this.anIntArray375[0] == 10)) {
				this.anInt3137 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.aClass61Array24[local27] != null) {
					this.anInt3137 = 1;
				}
			}
		}
		if (this.anInt3131 == -1) {
			this.anInt3131 = this.anInt3133 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Z")
	public boolean method1962(@OriginalArg(1) int arg0) {
		if (this.anIntArray375 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.anIntArray375.length; local52++) {
				if (arg0 == this.anIntArray375[local52]) {
					return Static72.aClass26_17.method1041(this.anIntArray380[local52] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray380 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(25) boolean local25 = true;
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray380.length; local27++) {
				local25 &= Static72.aClass26_17.method1041(this.anIntArray380[local27] & 0xFFFF, 0);
			}
			return local25;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Lclient!vb;")
	public Class5_Sub2_Sub16 method1966() {
		@Pc(1) int local1 = -1;
		if (this.anInt3157 != -1) {
			local1 = Static111.method1829(this.anInt3157);
		} else if (this.anInt3119 != -1) {
			local1 = Static83.anIntArray289[this.anInt3119];
		}
		return local1 < 0 || this.anIntArray377.length <= local1 || this.anIntArray377[local1] == -1 ? null : Static43.method767(this.anIntArray377[local1]);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!pa;)V")
	public void method1967(@OriginalArg(1) Class5_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1471();
			if (local5 == 0) {
				return;
			}
			this.method1970(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lclient!cb;")
	private Class5_Sub2_Sub2_Sub1 method1968(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class5_Sub2_Sub2_Sub1 local16 = null;
		@Pc(34) boolean local34;
		@Pc(52) int local52;
		@Pc(54) int local54;
		@Pc(60) int local60;
		if (this.anIntArray375 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray380 == null) {
				return null;
			}
			local34 = this.aBoolean113;
			if (arg1 == 2 && arg0 > 3) {
				local34 = !local34;
			}
			local52 = this.anIntArray380.length;
			for (local54 = 0; local54 < local52; local54++) {
				local60 = this.anIntArray380[local54];
				if (local34) {
					local60 += 65536;
				}
				local16 = (Class5_Sub2_Sub2_Sub1) Static37.aClass29_10.method766((long) local60);
				if (local16 == null) {
					local16 = Static15.method341(Static72.aClass26_17, local60 & 0xFFFF);
					if (local16 == null) {
						return null;
					}
					if (local34) {
						local16.method324();
					}
					Static37.aClass29_10.method762(local16, (long) local60);
				}
				if (local52 > 1) {
					Static68.aClass5_Sub2_Sub2_Sub1Array1[local54] = local16;
				}
			}
			if (local52 > 1) {
				local16 = new Class5_Sub2_Sub2_Sub1(Static68.aClass5_Sub2_Sub2_Sub1Array1, local52);
			}
		} else {
			@Pc(121) int local121 = -1;
			for (local52 = 0; local52 < this.anIntArray375.length; local52++) {
				if (arg1 == this.anIntArray375[local52]) {
					local121 = local52;
					break;
				}
			}
			if (local121 == -1) {
				return null;
			}
			@Pc(164) boolean local164 = this.aBoolean113 ^ arg0 > 3;
			local54 = this.anIntArray380[local121];
			if (local164) {
				local54 += 65536;
			}
			local16 = (Class5_Sub2_Sub2_Sub1) Static37.aClass29_10.method766((long) local54);
			if (local16 == null) {
				local16 = Static15.method341(Static72.aClass26_17, local54 & 0xFFFF);
				if (local16 == null) {
					return null;
				}
				if (local164) {
					local16.method324();
				}
				Static37.aClass29_10.method762(local16, (long) local54);
			}
		}
		if (this.anInt3149 == 128 && this.anInt3144 == 128 && this.anInt3152 == 128) {
			local34 = false;
		} else {
			local34 = true;
		}
		@Pc(242) boolean local242;
		if (this.anInt3122 == 0 && this.anInt3121 == 0 && this.anInt3134 == 0) {
			local242 = false;
		} else {
			local242 = true;
		}
		@Pc(276) Class5_Sub2_Sub2_Sub1 local276 = new Class5_Sub2_Sub2_Sub1(local16, arg0 == 0 && !local34 && !local242, this.aShortArray37 == null, this.aShortArray36 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local276.method340();
			local276.method328(45, 0, -45);
		}
		@Pc(298) int local298 = arg0 & 0x3;
		if (local298 == 1) {
			local276.method333();
		} else if (local298 == 2) {
			local276.method332();
		} else if (local298 == 3) {
			local276.method321();
		}
		if (this.aShortArray37 != null) {
			for (local60 = 0; local60 < this.aShortArray37.length; local60++) {
				local276.method329(this.aShortArray37[local60], this.aShortArray38[local60]);
			}
		}
		if (this.aShortArray36 != null) {
			for (local60 = 0; local60 < this.aShortArray36.length; local60++) {
				local276.method343(this.aShortArray36[local60], this.aShortArray35[local60]);
			}
		}
		if (local34) {
			local276.method323(this.anInt3149, this.anInt3144, this.anInt3152);
		}
		if (local242) {
			local276.method328(this.anInt3122, this.anInt3121, this.anInt3134);
		}
		return local276;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)Z")
	public boolean method1969() {
		if (this.anIntArray380 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray380.length; local19++) {
			local12 &= Static72.aClass26_17.method1041(this.anIntArray380[local19] & 0xFFFF, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!pa;II)V")
	private void method1970(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		@Pc(38) int local38;
		if (arg1 == 1) {
			local18 = arg0.method1471();
			if (local18 > 0) {
				if (this.anIntArray380 != null && !Static62.aBoolean58) {
					arg0.anInt2199 += local18 * 3;
					return;
				}
				this.anIntArray375 = new int[local18];
				this.anIntArray380 = new int[local18];
				for (local38 = 0; local38 < local18; local38++) {
					this.anIntArray380[local38] = arg0.method1478();
					this.anIntArray375[local38] = arg0.method1471();
				}
				return;
			}
		} else if (arg1 == 2) {
			this.aClass61_997 = arg0.method1450();
			return;
		} else {
			if (arg1 != 5) {
				if (arg1 == 14) {
					this.anInt3120 = arg0.method1471();
					return;
				} else if (arg1 == 15) {
					this.anInt3126 = arg0.method1471();
					return;
				} else if (arg1 == 17) {
					this.anInt3133 = 0;
					this.aBoolean111 = false;
					return;
				} else if (arg1 == 18) {
					this.aBoolean111 = false;
					return;
				} else if (arg1 == 19) {
					this.anInt3137 = arg0.method1471();
					return;
				} else if (arg1 == 21) {
					this.anInt3130 = 0;
					return;
				} else if (arg1 == 22) {
					this.aBoolean114 = true;
					return;
				} else if (arg1 == 23) {
					this.aBoolean109 = true;
					return;
				} else {
					if (arg1 == 24) {
						this.anInt3147 = arg0.method1478();
						if (this.anInt3147 == 65535) {
							this.anInt3147 = -1;
							return;
						}
					} else if (arg1 == 27) {
						this.anInt3133 = 1;
					} else if (arg1 == 28) {
						this.anInt3146 = arg0.method1471();
						return;
					} else if (arg1 == 29) {
						this.anInt3127 = arg0.method1447();
						return;
					} else if (arg1 == 39) {
						this.anInt3125 = arg0.method1447() * 5;
						return;
					} else {
						if (arg1 >= 30 && arg1 < 35) {
							this.aClass61Array24[arg1 - 30] = arg0.method1450();
							if (this.aClass61Array24[arg1 - 30].method1709(Static116.aClass61_928)) {
								this.aClass61Array24[arg1 - 30] = null;
								return;
							}
						} else if (arg1 == 40) {
							local18 = arg0.method1471();
							this.aShortArray38 = new short[local18];
							this.aShortArray37 = new short[local18];
							for (local38 = 0; local38 < local18; local38++) {
								this.aShortArray37[local38] = (short) arg0.method1478();
								this.aShortArray38[local38] = (short) arg0.method1478();
							}
							return;
						} else if (arg1 == 41) {
							local18 = arg0.method1471();
							this.aShortArray35 = new short[local18];
							this.aShortArray36 = new short[local18];
							for (local38 = 0; local38 < local18; local38++) {
								this.aShortArray36[local38] = (short) arg0.method1478();
								this.aShortArray35[local38] = (short) arg0.method1478();
							}
						} else if (arg1 == 60) {
							this.anInt3140 = arg0.method1478();
							return;
						} else if (arg1 == 62) {
							this.aBoolean113 = true;
							return;
						} else if (arg1 == 64) {
							this.aBoolean115 = false;
							return;
						} else if (arg1 == 65) {
							this.anInt3149 = arg0.method1478();
							return;
						} else if (arg1 == 66) {
							this.anInt3144 = arg0.method1478();
							return;
						} else if (arg1 == 67) {
							this.anInt3152 = arg0.method1478();
							return;
						} else if (arg1 == 68) {
							this.anInt3124 = arg0.method1478();
							return;
						} else if (arg1 == 69) {
							this.anInt3123 = arg0.method1471();
							return;
						} else if (arg1 == 70) {
							this.anInt3122 = arg0.method1430();
							return;
						} else if (arg1 == 71) {
							this.anInt3121 = arg0.method1430();
							return;
						} else if (arg1 == 72) {
							this.anInt3134 = arg0.method1430();
							return;
						} else if (arg1 == 73) {
							this.aBoolean110 = true;
							return;
						} else if (arg1 == 74) {
							this.aBoolean112 = true;
							return;
						} else if (arg1 == 75) {
							this.anInt3131 = arg0.method1471();
							return;
						} else if (arg1 == 77) {
							this.anInt3157 = arg0.method1478();
							if (this.anInt3157 == 65535) {
								this.anInt3157 = -1;
							}
							this.anInt3119 = arg0.method1478();
							if (this.anInt3119 == 65535) {
								this.anInt3119 = -1;
							}
							local18 = arg0.method1471();
							this.anIntArray377 = new int[local18 + 1];
							for (local38 = 0; local38 <= local18; local38++) {
								this.anIntArray377[local38] = arg0.method1478();
								if (this.anIntArray377[local38] == 65535) {
									this.anIntArray377[local38] = -1;
								}
							}
							return;
						} else if (arg1 == 78) {
							this.anInt3148 = arg0.method1478();
							this.anInt3117 = arg0.method1471();
							return;
						} else {
							if (arg1 == 79) {
								this.anInt3150 = arg0.method1478();
								this.anInt3136 = arg0.method1478();
								this.anInt3117 = arg0.method1471();
								local18 = arg0.method1471();
								this.anIntArray376 = new int[local18];
								for (local38 = 0; local38 < local18; local38++) {
									this.anIntArray376[local38] = arg0.method1478();
								}
							} else if (arg1 == 81) {
								this.anInt3130 = arg0.method1471() * 256;
								return;
							}
							return;
						}
						return;
					}
					return;
				}
			}
			local18 = arg0.method1471();
			if (local18 <= 0) {
				return;
			}
			if (this.anIntArray380 == null || Static62.aBoolean58) {
				this.anIntArray375 = null;
				this.anIntArray380 = new int[local18];
				for (local38 = 0; local38 < local18; local38++) {
					this.anIntArray380[local38] = arg0.method1478();
				}
				return;
			}
			arg0.anInt2199 += local18 * 2;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII[[I)Lclient!mf;")
	public Class5_Sub2_Sub2 method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(25) long local25;
		if (this.anIntArray375 == null) {
			local25 = arg3 + (this.anInt3135 << 10);
		} else {
			local25 = (this.anInt3135 << 10) + (arg2 << 3) + arg3;
		}
		@Pc(41) Class5_Sub2_Sub2 local41 = (Class5_Sub2_Sub2) Static22.aClass29_7.method766(local25);
		if (local41 == null) {
			@Pc(49) Class5_Sub2_Sub2_Sub1 local49 = this.method1968(arg3, arg2);
			if (local49 == null) {
				return null;
			}
			if (this.aBoolean114) {
				local49.aShort1 = (short) (this.anInt3127 + 64);
				local49.aShort2 = (short) (this.anInt3125 * 5 + 768);
				local41 = local49;
				local49.method325();
			} else {
				local41 = local49.method342(this.anInt3127 + 64, 768 - -(this.anInt3125 * 5), -50, -10, -50);
			}
			Static22.aClass29_7.method762(local41, local25);
		}
		if (this.aBoolean114) {
			local41 = ((Class5_Sub2_Sub2_Sub1) local41).method338();
		}
		if (this.anInt3130 >= 0) {
			if (local41 instanceof Class5_Sub2_Sub2_Sub6) {
				local41 = ((Class5_Sub2_Sub2_Sub6) local41).method2160(arg5, arg0, arg4, arg1, true, this.anInt3130);
			} else if (local41 instanceof Class5_Sub2_Sub2_Sub1) {
				local41 = ((Class5_Sub2_Sub2_Sub1) local41).method336(arg5, arg0, arg4, arg1, this.anInt3130);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([[IIIIIII)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method1972(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11;
		if (this.anIntArray375 == null) {
			local11 = (this.anInt3135 << 10) + arg2;
		} else {
			local11 = (arg5 << 3) + ((this.anInt3135 << 10) + arg2);
		}
		@Pc(41) Class5_Sub2_Sub2_Sub6 local41 = (Class5_Sub2_Sub2_Sub6) Static9.aClass29_4.method766(local11);
		if (local41 == null) {
			@Pc(49) Class5_Sub2_Sub2_Sub1 local49 = this.method1968(arg2, arg5);
			if (local49 == null) {
				return null;
			}
			local41 = local49.method342(this.anInt3127 + 64, this.anInt3125 * 5 + 768, -50, -10, -50);
			Static9.aClass29_4.method762(local41, local11);
		}
		if (this.anInt3130 >= 0) {
			local41 = local41.method2160(arg0, arg3, arg1, arg4, true, this.anInt3130);
		}
		return local41;
	}
}
