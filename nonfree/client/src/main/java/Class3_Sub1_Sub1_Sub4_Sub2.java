import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WQWDCUWR")
public final class Class3_Sub1_Sub1_Sub4_Sub2 extends Class3_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!WQWDCUWR", name = "nb", descriptor = "Lclient!DSCQIAPU;")
	public static Class7 aClass7_9 = new Class7(401, 260);

	@OriginalMember(owner = "client!WQWDCUWR", name = "ob", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!WQWDCUWR", name = "pb", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!WQWDCUWR", name = "qb", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!WQWDCUWR", name = "sb", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!WQWDCUWR", name = "tb", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!WQWDCUWR", name = "ub", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!WQWDCUWR", name = "vb", descriptor = "Lclient!UNLYQRUD;")
	public Class3_Sub1_Sub1_Sub5 aClass3_Sub1_Sub1_Sub5_2;

	@OriginalMember(owner = "client!WQWDCUWR", name = "wb", descriptor = "I")
	private int anInt743;

	@OriginalMember(owner = "client!WQWDCUWR", name = "yb", descriptor = "I")
	public int anInt745;

	@OriginalMember(owner = "client!WQWDCUWR", name = "zb", descriptor = "I")
	public int anInt746;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Ab", descriptor = "I")
	public int anInt747;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Bb", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Eb", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Fb", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Hb", descriptor = "I")
	public int anInt751;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Jb", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Ob", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Pb", descriptor = "Lclient!BJGOYLYN;")
	public Class2 aClass2_2;

	@OriginalMember(owner = "client!WQWDCUWR", name = "rb", descriptor = "I")
	public int anInt739 = -1;

	@OriginalMember(owner = "client!WQWDCUWR", name = "xb", descriptor = "I")
	private int anInt744 = 45895;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Cb", descriptor = "Z")
	private boolean aBoolean168 = true;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Db", descriptor = "I")
	public int anInt749 = -1;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Gb", descriptor = "[I")
	public int[] anIntArray179 = new int[12];

	@OriginalMember(owner = "client!WQWDCUWR", name = "Ib", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Kb", descriptor = "Z")
	public boolean aBoolean170 = false;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Lb", descriptor = "[I")
	public int[] anIntArray180 = new int[5];

	@OriginalMember(owner = "client!WQWDCUWR", name = "Mb", descriptor = "J")
	private long aLong25 = -1L;

	@OriginalMember(owner = "client!WQWDCUWR", name = "Nb", descriptor = "I")
	private int anInt752 = 932;

	@OriginalMember(owner = "client!WQWDCUWR", name = "a", descriptor = "(B)Lclient!UNLYQRUD;")
	@Override
	protected Class3_Sub1_Sub1_Sub5 method505() {
		try {
			if (!this.aBoolean169) {
				return null;
			}
			@Pc(10) Class3_Sub1_Sub1_Sub5 local10 = this.method512();
			if (local10 == null) {
				return null;
			}
			super.anInt691 = local10.anInt688;
			local10.aBoolean139 = true;
			if (this.aBoolean170) {
				return local10;
			}
			if (super.anInt709 != -1 && super.anInt710 != -1) {
				@Pc(49) Class39 local49 = Class39.aClass39Array1[super.anInt709];
				@Pc(52) Class3_Sub1_Sub1_Sub5 local52 = local49.method377();
				if (local52 != null) {
					@Pc(66) Class3_Sub1_Sub1_Sub5 local66 = new Class3_Sub1_Sub1_Sub5(true, local52, false, 8, Class5.method64(super.anInt710));
					local66.method409(-super.anInt713, 0, 0);
					local66.method403(956);
					local66.method404(936, local49.aClass30_2.anIntArray90[super.anInt710]);
					local66.anIntArrayArray15 = null;
					local66.anIntArrayArray14 = null;
					if (local49.anInt559 != 128 || local49.anInt560 != 128) {
						local66.method412(local49.anInt559, local49.anInt560, local49.anInt559);
					}
					local66.method413(local49.anInt562 + 64, local49.anInt563 + 850, -30, -50, -30, true);
					@Pc(134) Class3_Sub1_Sub1_Sub5[] local134 = new Class3_Sub1_Sub1_Sub5[] { local10, local66 };
					local10 = new Class3_Sub1_Sub1_Sub5(2, this.anInt752, local134, true);
				}
			}
			if (this.aClass3_Sub1_Sub1_Sub5_2 != null) {
				if (client.anInt919 >= this.anInt738) {
					this.aClass3_Sub1_Sub1_Sub5_2 = null;
				}
				if (client.anInt919 >= this.anInt737 && client.anInt919 < this.anInt738) {
					@Pc(164) Class3_Sub1_Sub1_Sub5 local164 = this.aClass3_Sub1_Sub1_Sub5_2;
					local164.method409(this.anInt741 - this.anInt736, this.anInt742 - super.anInt729, this.anInt740 - super.anInt728);
					if (super.anInt731 == 512) {
						local164.method407();
						local164.method407();
						local164.method407();
					} else if (super.anInt731 == 1024) {
						local164.method407();
						local164.method407();
					} else if (super.anInt731 == 1536) {
						local164.method407();
					}
					@Pc(227) Class3_Sub1_Sub1_Sub5[] local227 = new Class3_Sub1_Sub1_Sub5[] { local10, local164 };
					local10 = new Class3_Sub1_Sub1_Sub5(2, this.anInt752, local227, true);
					if (super.anInt731 == 512) {
						local164.method407();
					} else if (super.anInt731 == 1024) {
						local164.method407();
						local164.method407();
					} else if (super.anInt731 == 1536) {
						local164.method407();
						local164.method407();
						local164.method407();
					}
					local164.method409(this.anInt736 - this.anInt741, super.anInt729 - this.anInt742, super.anInt728 - this.anInt740);
				}
			}
			local10.aBoolean139 = true;
			return local10;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("72113, " + 93 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQWDCUWR", name = "b", descriptor = "(I)Lclient!UNLYQRUD;")
	public Class3_Sub1_Sub1_Sub5 method511() {
		try {
			if (!this.aBoolean169) {
				return null;
			} else if (this.aClass2_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray179[local18];
					if (local25 >= 256 && local25 < 512 && !Class36.aClass36Array1[local25 - 256].method346()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class10.method118(local25 - 512).method125(this.anInt743)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class3_Sub1_Sub1_Sub5[] local66 = new Class3_Sub1_Sub1_Sub5[12];
				@Pc(68) int local68 = 0;
				for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
					@Pc(89) int local89 = this.anIntArray179[local82];
					@Pc(103) Class3_Sub1_Sub1_Sub5 local103;
					if (local89 >= 256 && local89 < 512) {
						local103 = Class36.aClass36Array1[local89 - 256].method347();
						if (local103 != null) {
							local66[local68++] = local103;
						}
					}
					if (local89 >= 512) {
						local103 = Class10.method118(local89 - 512).method119(this.anInt743);
						if (local103 != null) {
							local66[local68++] = local103;
						}
					}
				}
				@Pc(140) Class3_Sub1_Sub1_Sub5 local140 = new Class3_Sub1_Sub1_Sub5(local68, local66, 0);
				for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
					if (this.anIntArray180[local142] != 0) {
						local140.method410(client.anIntArrayArray22[local142][0], client.anIntArrayArray22[local142][this.anIntArray180[local142]]);
						if (local142 == 1) {
							local140.method410(client.anIntArray264[0], client.anIntArray264[this.anIntArray180[local142]]);
						}
					}
				}
				return local140;
			} else {
				return this.aClass2_2.method7();
			}
		} catch (@Pc(185) RuntimeException local185) {
			signlink.reporterror("30474, " + -333 + ", " + local185.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQWDCUWR", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method506() {
		try {
			return this.aBoolean169;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("67363, " + 8 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQWDCUWR", name = "c", descriptor = "(B)Lclient!UNLYQRUD;")
	private Class3_Sub1_Sub1_Sub5 method512() {
		try {
			if (this.aClass2_2 != null) {
				@Pc(16) int local16 = -1;
				if (super.anInt701 >= 0 && super.anInt704 == 0) {
					local16 = Class30.aClass30Array1[super.anInt701].anIntArray90[super.anInt702];
				} else if (super.anInt732 >= 0) {
					local16 = Class30.aClass30Array1[super.anInt732].anIntArray90[super.anInt733];
				}
				return this.aClass2_2.method2(-1, null, local16);
			}
			@Pc(58) long local58 = this.aLong24;
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			@Pc(64) int local64 = -1;
			@Pc(66) int local66 = -1;
			if (super.anInt701 >= 0 && super.anInt704 == 0) {
				@Pc(77) Class30 local77 = Class30.aClass30Array1[super.anInt701];
				local60 = local77.anIntArray90[super.anInt702];
				if (super.anInt732 >= 0 && super.anInt732 != super.anInt689) {
					local62 = Class30.aClass30Array1[super.anInt732].anIntArray90[super.anInt733];
				}
				if (local77.anInt389 >= 0) {
					local64 = local77.anInt389;
					local58 += local64 - this.anIntArray179[5] << 8;
				}
				if (local77.anInt390 >= 0) {
					local66 = local77.anInt390;
					local58 += local66 - this.anIntArray179[3] << 16;
				}
			} else if (super.anInt732 >= 0) {
				local60 = Class30.aClass30Array1[super.anInt732].anIntArray90[super.anInt733];
			}
			@Pc(155) Class3_Sub1_Sub1_Sub5 local155 = (Class3_Sub1_Sub1_Sub5) aClass7_9.method65(local58);
			@Pc(161) int local161;
			@Pc(168) int local168;
			if (local155 == null) {
				@Pc(159) boolean local159 = false;
				for (local161 = 0; local161 < 12; local161++) {
					local168 = this.anIntArray179[local161];
					if (local66 >= 0 && local161 == 3) {
						local168 = local66;
					}
					if (local64 >= 0 && local161 == 5) {
						local168 = local64;
					}
					if (local168 >= 256 && local168 < 512 && !Class36.aClass36Array1[local168 - 256].method344()) {
						local159 = true;
					}
					if (local168 >= 512 && !Class10.method118(local168 - 512).method127(this.anInt743)) {
						local159 = true;
					}
				}
				if (local159) {
					if (this.aLong25 != -1L) {
						local155 = (Class3_Sub1_Sub1_Sub5) aClass7_9.method65(this.aLong25);
					}
					if (local155 == null) {
						return null;
					}
				}
			}
			if (local155 == null) {
				@Pc(238) Class3_Sub1_Sub1_Sub5[] local238 = new Class3_Sub1_Sub1_Sub5[12];
				local161 = 0;
				@Pc(249) int local249;
				for (local168 = 0; local168 < 12; local168++) {
					local249 = this.anIntArray179[local168];
					if (local66 >= 0 && local168 == 3) {
						local249 = local66;
					}
					if (local64 >= 0 && local168 == 5) {
						local249 = local64;
					}
					@Pc(277) Class3_Sub1_Sub1_Sub5 local277;
					if (local249 >= 256 && local249 < 512) {
						local277 = Class36.aClass36Array1[local249 - 256].method345();
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
					if (local249 >= 512) {
						local277 = Class10.method118(local249 - 512).method121(this.anInt743);
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
				}
				local155 = new Class3_Sub1_Sub1_Sub5(local161, local238, 0);
				for (local249 = 0; local249 < 5; local249++) {
					if (this.anIntArray180[local249] != 0) {
						local155.method410(client.anIntArrayArray22[local249][0], client.anIntArrayArray22[local249][this.anIntArray180[local249]]);
						if (local249 == 1) {
							local155.method410(client.anIntArray264[0], client.anIntArray264[this.anIntArray180[local249]]);
						}
					}
				}
				local155.method403(956);
				local155.method413(64, 850, -30, -50, -30, true);
				aClass7_9.method66(local155, local58);
				this.aLong25 = local58;
			}
			if (this.aBoolean170) {
				return local155;
			}
			@Pc(382) Class3_Sub1_Sub1_Sub5 local382 = Class3_Sub1_Sub1_Sub5.aClass3_Sub1_Sub1_Sub5_1;
			local382.method398(Class5.method64(local60) & Class5.method64(local62), this.anInt744, local155);
			if (local60 != -1 && local62 != -1) {
				local382.method405(local62, local60, Class30.aClass30Array1[super.anInt701].anIntArray93);
			} else if (local60 != -1) {
				local382.method404(936, local60);
			}
			local382.method400();
			local382.anIntArrayArray15 = null;
			local382.anIntArrayArray14 = null;
			return local382;
		} catch (@Pc(431) RuntimeException local431) {
			signlink.reporterror("8600, " + 103 + ", " + local431.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQWDCUWR", name = "a", descriptor = "(Lclient!WNCFPLWV;I)V")
	public void method513(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		try {
			arg0.anInt666 = 0;
			this.anInt743 = arg0.method458();
			this.anInt739 = arg0.method459();
			this.anInt749 = arg0.method459();
			this.aClass2_2 = null;
			this.anInt750 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method458();
				if (local29 == 0) {
					this.anIntArray179[local24] = 0;
				} else {
					local41 = arg0.method458();
					this.anIntArray179[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray179[0] == 65535) {
						this.aClass2_2 = Class2.method4(arg0.method460());
						break;
					}
					if (this.anIntArray179[local24] >= 512 && this.anIntArray179[local24] - 512 < Class10.anInt142) {
						local88 = Class10.method118(this.anIntArray179[local24] - 512).anInt165;
						if (local88 != 0) {
							this.anInt750 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method458();
				if (local41 < 0 || local41 >= client.anIntArrayArray22[local29].length) {
					local41 = 0;
				}
				this.anIntArray180[local29] = local41;
			}
			super.anInt689 = arg0.method460();
			if (super.anInt689 == 65535) {
				super.anInt689 = -1;
			}
			super.anInt690 = arg0.method460();
			if (super.anInt690 == 65535) {
				super.anInt690 = -1;
			}
			super.anInt718 = arg0.method460();
			if (super.anInt718 == 65535) {
				super.anInt718 = -1;
			}
			super.anInt719 = arg0.method460();
			if (super.anInt719 == 65535) {
				super.anInt719 = -1;
			}
			super.anInt720 = arg0.method460();
			if (super.anInt720 == 65535) {
				super.anInt720 = -1;
			}
			super.anInt721 = arg0.method460();
			if (super.anInt721 == 65535) {
				super.anInt721 = -1;
			}
			super.anInt693 = arg0.method460();
			if (super.anInt693 == 65535) {
				super.anInt693 = -1;
			}
			this.aString16 = Class15.method202(Class15.method199(arg0.method464()));
			this.anInt753 = arg0.method458();
			this.anInt751 = arg0.method460();
			this.aBoolean169 = true;
			this.aLong24 = 0L;
			local41 = this.anIntArray179[5];
			local88 = this.anIntArray179[9];
			this.anIntArray179[5] = local88;
			this.anIntArray179[9] = local41;
			for (@Pc(254) int local254 = 0; local254 < 12; local254++) {
				this.aLong24 <<= 0x4;
				if (this.anIntArray179[local254] >= 256) {
					this.aLong24 += this.anIntArray179[local254] - 256;
				}
			}
			if (this.anIntArray179[0] >= 256) {
				this.aLong24 += this.anIntArray179[0] - 256 >> 4;
			}
			if (this.anIntArray179[1] >= 256) {
				this.aLong24 += this.anIntArray179[1] - 256 >> 8;
			}
			this.anIntArray179[5] = local41;
			this.anIntArray179[9] = local88;
			for (@Pc(336) int local336 = 0; local336 < 5; local336++) {
				this.aLong24 <<= 0x3;
				this.aLong24 += this.anIntArray180[local336];
			}
			this.aLong24 <<= 0x1;
			this.aLong24 += this.anInt743;
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("70846, " + arg0 + ", " + 0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}
}
