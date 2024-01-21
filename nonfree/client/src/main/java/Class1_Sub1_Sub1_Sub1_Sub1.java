import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40((byte) 7, 260);

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
	public int anInt124;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "I")
	public int anInt125;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLclient!lb;)V")
	public void method39(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt734 = 0;
			this.anInt123 = arg0.method476();
			this.anInt124 = arg0.method476();
			this.aClass13_1 = null;
			this.anInt137 = 0;
			@Pc(35) int local35;
			@Pc(47) int local47;
			@Pc(94) int local94;
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				local35 = arg0.method476();
				if (local35 == 0) {
					this.anIntArray13[local30] = 0;
				} else {
					local47 = arg0.method476();
					this.anIntArray13[local30] = (local35 << 8) + local47;
					if (local30 == 0 && this.anIntArray13[0] == 65535) {
						this.aClass13_1 = Class13.method321(arg0.method478());
						break;
					}
					if (this.anIntArray13[local30] >= 512 && this.anIntArray13[local30] - 512 < Class15.anInt593) {
						local94 = Class15.method358(this.anIntArray13[local30] - 512).anInt622;
						if (local94 != 0) {
							this.anInt137 = local94;
						}
					}
				}
			}
			for (local35 = 0; local35 < 5; local35++) {
				local47 = arg0.method476();
				if (local47 < 0 || local47 >= client.anIntArrayArray5[local35].length) {
					local47 = 0;
				}
				this.anIntArray14[local35] = local47;
			}
			super.anInt984 = arg0.method478();
			if (super.anInt984 == 65535) {
				super.anInt984 = -1;
			}
			super.anInt985 = arg0.method478();
			if (super.anInt985 == 65535) {
				super.anInt985 = -1;
			}
			super.anInt986 = arg0.method478();
			if (super.anInt986 == 65535) {
				super.anInt986 = -1;
			}
			super.anInt987 = arg0.method478();
			if (super.anInt987 == 65535) {
				super.anInt987 = -1;
			}
			super.anInt988 = arg0.method478();
			if (super.anInt988 == 65535) {
				super.anInt988 = -1;
			}
			super.anInt989 = arg0.method478();
			if (super.anInt989 == 65535) {
				super.anInt989 = -1;
			}
			super.anInt990 = arg0.method478();
			if (super.anInt990 == 65535) {
				super.anInt990 = -1;
			}
			this.aString3 = Class48.method667(Class48.method664(arg0.method482()));
			this.anInt125 = arg0.method476();
			this.anInt126 = arg0.method478();
			this.aBoolean29 = true;
			this.aLong8 = 0L;
			for (local47 = 0; local47 < 12; local47++) {
				this.aLong8 <<= 0x4;
				if (this.anIntArray13[local47] >= 256) {
					this.aLong8 += this.anIntArray13[local47] - 256;
				}
			}
			if (this.anIntArray13[0] >= 256) {
				this.aLong8 += this.anIntArray13[0] - 256 >> 4;
			}
			if (this.anIntArray13[1] >= 256) {
				this.aLong8 += this.anIntArray13[1] - 256 >> 8;
			}
			for (local94 = 0; local94 < 5; local94++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray14[local94];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt123;
		} catch (@Pc(341) RuntimeException local341) {
			signlink.reporterror("26459, " + false + ", " + arg0 + ", " + local341.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method672() {
		try {
			if (!this.aBoolean29) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40();
			if (local10 == null) {
				return null;
			}
			super.anInt1021 = local10.anInt979;
			local10.aBoolean120 = true;
			if (this.aBoolean30) {
				return local10;
			}
			if (super.anInt1008 != -1 && super.anInt1009 != -1) {
				@Pc(46) Class33 local46 = Class33.aClass33Array1[super.anInt1008];
				@Pc(49) Class1_Sub1_Sub1_Sub5 local49 = local46.method519();
				if (local49 != null) {
					@Pc(64) Class1_Sub1_Sub1_Sub5 local64 = new Class1_Sub1_Sub1_Sub5(local49, Class12.method304(super.anInt1009), false, this.anInt122, true);
					local64.method273(-super.anInt1012, 0, (byte) 2, 0);
					local64.method267((byte) 3);
					local64.method268(local46.aClass27_2.anIntArray224[super.anInt1009], 188);
					local64.anIntArrayArray9 = null;
					local64.anIntArrayArray8 = null;
					if (local46.anInt819 != 128 || local46.anInt820 != 128) {
						local64.method276(local46.anInt819, local46.anInt819, local46.anInt820);
					}
					local64.method277(local46.anInt822 + 64, local46.anInt823 + 850, -30, -50, -30, true);
					@Pc(132) Class1_Sub1_Sub1_Sub5[] local132 = new Class1_Sub1_Sub1_Sub5[] { local10, local64 };
					local10 = new Class1_Sub1_Sub1_Sub5(true, 0, local132, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt396 >= this.anInt129) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt396 >= this.anInt128 && client.anInt396 < this.anInt129) {
					@Pc(161) Class1_Sub1_Sub1_Sub5 local161 = this.aClass1_Sub1_Sub1_Sub5_1;
					local161.method273(this.anInt131 - this.anInt127, this.anInt130 - super.anInt980, (byte) 2, this.anInt132 - super.anInt981);
					if (super.anInt1022 == 512) {
						local161.method271();
						local161.method271();
						local161.method271();
					} else if (super.anInt1022 == 1024) {
						local161.method271();
						local161.method271();
					} else if (super.anInt1022 == 1536) {
						local161.method271();
					}
					@Pc(224) Class1_Sub1_Sub1_Sub5[] local224 = new Class1_Sub1_Sub1_Sub5[] { local10, local161 };
					local10 = new Class1_Sub1_Sub1_Sub5(true, 0, local224, 2);
					if (super.anInt1022 == 512) {
						local161.method271();
					} else if (super.anInt1022 == 1024) {
						local161.method271();
						local161.method271();
					} else if (super.anInt1022 == 1536) {
						local161.method271();
						local161.method271();
						local161.method271();
					}
					local161.method273(this.anInt127 - this.anInt131, super.anInt980 - this.anInt130, (byte) 2, super.anInt981 - this.anInt132);
				}
			}
			local10.aBoolean120 = true;
			return local10;
		} catch (@Pc(290) RuntimeException local290) {
			signlink.reporterror("67533, " + -37770 + ", " + local290.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1003 >= 0 && super.anInt1006 == 0) {
					local6 = Class27.aClass27Array1[super.anInt1003].anIntArray224[super.anInt1004];
				} else if (super.anInt1000 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt1000].anIntArray224[super.anInt1001];
				}
				return this.aClass13_1.method323(-1, local6, null);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt1003 >= 0 && super.anInt1006 == 0) {
				@Pc(67) Class27 local67 = Class27.aClass27Array1[super.anInt1003];
				local50 = local67.anIntArray224[super.anInt1004];
				if (super.anInt1000 >= 0 && super.anInt1000 != super.anInt984) {
					local52 = Class27.aClass27Array1[super.anInt1000].anIntArray224[super.anInt1001];
				}
				if (local67.anInt786 >= 0) {
					local54 = local67.anInt786;
					local48 += local54 - this.anIntArray13[5] << 8;
				}
				if (local67.anInt787 >= 0) {
					local56 = local67.anInt787;
					local48 += local56 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1000 >= 0) {
				local50 = Class27.aClass27Array1[super.anInt1000].anIntArray224[super.anInt1001];
			}
			@Pc(145) Class1_Sub1_Sub1_Sub5 local145 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method587(local48);
			@Pc(161) int local161;
			@Pc(168) int local168;
			if (local145 == null) {
				@Pc(159) boolean local159 = false;
				for (local161 = 0; local161 < 12; local161++) {
					local168 = this.anIntArray13[local161];
					if (local56 >= 0 && local161 == 3) {
						local168 = local56;
					}
					if (local54 >= 0 && local161 == 5) {
						local168 = local54;
					}
					if (local168 >= 256 && local168 < 512 && !Class23.aClass23Array1[local168 - 256].method494()) {
						local159 = true;
					}
					if (local168 >= 512 && !Class15.method358(local168 - 512).method365(this.anInt123)) {
						local159 = true;
					}
				}
				if (local159) {
					if (this.aLong9 != -1L) {
						local145 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method587(this.aLong9);
					}
					if (local145 == null) {
						return null;
					}
				}
			}
			if (local145 == null) {
				@Pc(238) Class1_Sub1_Sub1_Sub5[] local238 = new Class1_Sub1_Sub1_Sub5[12];
				local161 = 0;
				@Pc(249) int local249;
				for (local168 = 0; local168 < 12; local168++) {
					local249 = this.anIntArray13[local168];
					if (local56 >= 0 && local168 == 3) {
						local249 = local56;
					}
					if (local54 >= 0 && local168 == 5) {
						local249 = local54;
					}
					@Pc(277) Class1_Sub1_Sub1_Sub5 local277;
					if (local249 >= 256 && local249 < 512) {
						local277 = Class23.aClass23Array1[local249 - 256].method495();
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
					if (local249 >= 512) {
						local277 = Class15.method358(local249 - 512).method366(this.anInt123);
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
				}
				local145 = new Class1_Sub1_Sub1_Sub5(local238, local161, -33019);
				for (local249 = 0; local249 < 5; local249++) {
					if (this.anIntArray14[local249] != 0) {
						local145.method274(client.anIntArrayArray5[local249][0], client.anIntArrayArray5[local249][this.anIntArray14[local249]]);
						if (local249 == 1) {
							local145.method274(client.anIntArray67[0], client.anIntArray67[this.anIntArray14[local249]]);
						}
					}
				}
				local145.method267((byte) 3);
				local145.method277(64, 850, -30, -50, -30, true);
				aClass40_1.method588(local48, local145);
				this.aLong9 = local48;
			}
			if (this.aBoolean30) {
				return local145;
			}
			@Pc(382) Class1_Sub1_Sub1_Sub5 local382 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local382.method262(Class12.method304(local50) & Class12.method304(local52), local145);
			if (local50 != -1 && local52 != -1) {
				local382.method269(local50, local52, Class27.aClass27Array1[super.anInt1003].anIntArray227);
			} else if (local50 != -1) {
				local382.method268(local50, 188);
			}
			local382.method264();
			local382.anIntArrayArray9 = null;
			local382.anIntArrayArray8 = null;
			return local382;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("33523, " + false + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean29) {
				return null;
			} else if (this.aClass13_1 == null) {
				@Pc(25) boolean local25 = false;
				for (@Pc(27) int local27 = 0; local27 < 12; local27++) {
					@Pc(34) int local34 = this.anIntArray13[local27];
					if (local34 >= 256 && local34 < 512 && !Class23.aClass23Array1[local34 - 256].method496()) {
						local25 = true;
					}
					if (local34 >= 512 && !Class15.method358(local34 - 512).method367(this.anInt123)) {
						local25 = true;
					}
				}
				if (local25) {
					return null;
				}
				@Pc(75) Class1_Sub1_Sub1_Sub5[] local75 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(77) int local77 = 0;
				for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
					@Pc(86) int local86 = this.anIntArray13[local79];
					@Pc(100) Class1_Sub1_Sub1_Sub5 local100;
					if (local86 >= 256 && local86 < 512) {
						local100 = Class23.aClass23Array1[local86 - 256].method497();
						if (local100 != null) {
							local75[local77++] = local100;
						}
					}
					if (local86 >= 512) {
						local100 = Class15.method358(local86 - 512).method368(481, this.anInt123);
						if (local100 != null) {
							local75[local77++] = local100;
						}
					}
				}
				@Pc(137) Class1_Sub1_Sub1_Sub5 local137 = new Class1_Sub1_Sub1_Sub5(local75, local77, -33019);
				for (@Pc(139) int local139 = 0; local139 < 5; local139++) {
					if (this.anIntArray14[local139] != 0) {
						local137.method274(client.anIntArrayArray5[local139][0], client.anIntArrayArray5[local139][this.anIntArray14[local139]]);
						if (local139 == 1) {
							local137.method274(client.anIntArray67[0], client.anIntArray67[this.anIntArray14[local139]]);
						}
					}
				}
				return local137;
			} else {
				return this.aClass13_1.method324();
			}
		} catch (@Pc(182) RuntimeException local182) {
			signlink.reporterror("96228, " + false + ", " + local182.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method676() {
		try {
			return this.aBoolean29;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("52910, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
