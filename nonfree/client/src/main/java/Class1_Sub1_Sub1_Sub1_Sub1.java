import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Yb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40(false, 260);

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!ab", name = "Sb", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!ab", name = "Tb", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!ab", name = "Wb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "Xb", descriptor = "I")
	public int anInt151;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "I")
	private int anInt135 = 3;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "Z")
	private boolean aBoolean25 = true;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "B")
	private byte aByte1 = -41;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "I")
	private int anInt136 = -47208;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "Z")
	private boolean aBoolean26 = true;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Ub", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!ab", name = "Vb", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!lb;B)V")
	public void method39(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt763 = 0;
			this.anInt137 = arg0.method480();
			this.anInt138 = arg0.method480();
			this.aClass13_1 = null;
			this.anInt151 = 0;
			@Pc(25) int local25;
			@Pc(37) int local37;
			@Pc(84) int local84;
			for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
				local25 = arg0.method480();
				if (local25 == 0) {
					this.anIntArray13[local20] = 0;
				} else {
					local37 = arg0.method480();
					this.anIntArray13[local20] = (local25 << 8) + local37;
					if (local20 == 0 && this.anIntArray13[0] == 65535) {
						this.aClass13_1 = Class13.method323(arg0.method482());
						break;
					}
					if (this.anIntArray13[local20] >= 512 && this.anIntArray13[local20] - 512 < Class15.anInt617) {
						local84 = Class15.method361(this.anIntArray13[local20] - 512).anInt646;
						if (local84 != 0) {
							this.anInt151 = local84;
						}
					}
				}
			}
			for (local25 = 0; local25 < 5; local25++) {
				local37 = arg0.method480();
				if (local37 < 0 || local37 >= client.anIntArrayArray5[local25].length) {
					local37 = 0;
				}
				this.anIntArray14[local25] = local37;
			}
			super.anInt1013 = arg0.method482();
			if (super.anInt1013 == 65535) {
				super.anInt1013 = -1;
			}
			super.anInt1014 = arg0.method482();
			if (super.anInt1014 == 65535) {
				super.anInt1014 = -1;
			}
			super.anInt1015 = arg0.method482();
			if (super.anInt1015 == 65535) {
				super.anInt1015 = -1;
			}
			super.anInt1016 = arg0.method482();
			if (super.anInt1016 == 65535) {
				super.anInt1016 = -1;
			}
			super.anInt1017 = arg0.method482();
			if (super.anInt1017 == 65535) {
				super.anInt1017 = -1;
			}
			super.anInt1018 = arg0.method482();
			if (super.anInt1018 == 65535) {
				super.anInt1018 = -1;
			}
			super.anInt1019 = arg0.method482();
			if (super.anInt1019 == 65535) {
				super.anInt1019 = -1;
			}
			this.aString3 = Class48.method671(Class48.method668(arg0.method486(), this.anInt135));
			this.anInt139 = arg0.method480();
			this.anInt140 = arg0.method482();
			this.aBoolean28 = true;
			this.aLong8 = 0L;
			for (local37 = 0; local37 < 12; local37++) {
				this.aLong8 <<= 0x4;
				if (this.anIntArray13[local37] >= 256) {
					this.aLong8 += this.anIntArray13[local37] - 256;
				}
			}
			if (this.anIntArray13[0] >= 256) {
				this.aLong8 += this.anIntArray13[0] - 256 >> 4;
			}
			if (this.anIntArray13[1] >= 256) {
				this.aLong8 += this.anIntArray13[1] - 256 >> 8;
			}
			for (local84 = 0; local84 < 5; local84++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray14[local84];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt137;
		} catch (@Pc(343) RuntimeException local343) {
			signlink.reporterror("54411, " + arg0 + ", " + 50 + ", " + local343.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (!this.aBoolean28) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40();
			if (local10 == null) {
				return null;
			}
			super.anInt1050 = local10.anInt1005;
			local10.aBoolean123 = true;
			if (this.aBoolean29) {
				return local10;
			}
			if (super.anInt1037 != -1 && super.anInt1038 != -1) {
				@Pc(49) Class33 local49 = Class33.aClass33Array1[super.anInt1037];
				@Pc(52) Class1_Sub1_Sub1_Sub5 local52 = local49.method523();
				if (local52 != null) {
					@Pc(67) Class1_Sub1_Sub1_Sub5 local67 = new Class1_Sub1_Sub1_Sub5(false, -16051, local52, Class12.method306(super.anInt1038, this.aBoolean25), true);
					local67.method274(-super.anInt1041, 0, 0);
					local67.method268();
					local67.method269(local49.aClass27_2.anIntArray225[super.anInt1038]);
					local67.anIntArrayArray9 = null;
					local67.anIntArrayArray8 = null;
					if (local49.anInt847 != 128 || local49.anInt848 != 128) {
						local67.method277(local49.anInt847, local49.anInt847, local49.anInt848);
					}
					local67.method278(local49.anInt850 + 64, local49.anInt851 + 850, -30, -50, -30, true);
					@Pc(135) Class1_Sub1_Sub1_Sub5[] local135 = new Class1_Sub1_Sub1_Sub5[] { local10, local67 };
					local10 = new Class1_Sub1_Sub1_Sub5(3, local135, true, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt252 >= this.anInt143) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt252 >= this.anInt142 && client.anInt252 < this.anInt143) {
					@Pc(164) Class1_Sub1_Sub1_Sub5 local164 = this.aClass1_Sub1_Sub1_Sub5_1;
					local164.method274(this.anInt145 - this.anInt141, this.anInt146 - super.anInt1010, this.anInt144 - super.anInt1009);
					if (super.anInt1051 == 512) {
						local164.method272();
						local164.method272();
						local164.method272();
					} else if (super.anInt1051 == 1024) {
						local164.method272();
						local164.method272();
					} else if (super.anInt1051 == 1536) {
						local164.method272();
					}
					@Pc(227) Class1_Sub1_Sub1_Sub5[] local227 = new Class1_Sub1_Sub1_Sub5[] { local10, local164 };
					local10 = new Class1_Sub1_Sub1_Sub5(3, local227, true, 2);
					if (super.anInt1051 == 512) {
						local164.method272();
					} else if (super.anInt1051 == 1024) {
						local164.method272();
						local164.method272();
					} else if (super.anInt1051 == 1536) {
						local164.method272();
						local164.method272();
						local164.method272();
					}
					local164.method274(this.anInt141 - this.anInt145, super.anInt1010 - this.anInt146, super.anInt1009 - this.anInt144);
				}
			}
			local10.aBoolean123 = true;
			return local10;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("1852, " + -47094 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1032 >= 0 && super.anInt1035 == 0) {
					local6 = Class27.aClass27Array1[super.anInt1032].anIntArray225[super.anInt1033];
				} else if (super.anInt1029 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt1029].anIntArray225[super.anInt1030];
				}
				return this.aClass13_1.method325(local6, -1, null);
			}
			@Pc(48) long local48 = this.aLong8;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt1032 >= 0 && super.anInt1035 == 0) {
				@Pc(77) Class27 local77 = Class27.aClass27Array1[super.anInt1032];
				local50 = local77.anIntArray225[super.anInt1033];
				if (super.anInt1029 >= 0 && super.anInt1029 != super.anInt1013) {
					local52 = Class27.aClass27Array1[super.anInt1029].anIntArray225[super.anInt1030];
				}
				if (local77.anInt817 >= 0) {
					local54 = local77.anInt817;
					local48 += local54 - this.anIntArray13[5] << 8;
				}
				if (local77.anInt818 >= 0) {
					local56 = local77.anInt818;
					local48 += local56 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1029 >= 0) {
				local50 = Class27.aClass27Array1[super.anInt1029].anIntArray225[super.anInt1030];
			}
			@Pc(155) Class1_Sub1_Sub1_Sub5 local155 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(local48);
			@Pc(161) int local161;
			@Pc(168) int local168;
			if (local155 == null) {
				@Pc(159) boolean local159 = false;
				for (local161 = 0; local161 < 12; local161++) {
					local168 = this.anIntArray13[local161];
					if (local56 >= 0 && local161 == 3) {
						local168 = local56;
					}
					if (local54 >= 0 && local161 == 5) {
						local168 = local54;
					}
					if (local168 >= 256 && local168 < 512 && !Class23.aClass23Array1[local168 - 256].method498()) {
						local159 = true;
					}
					if (local168 >= 512 && !Class15.method361(local168 - 512).method368(this.anInt137)) {
						local159 = true;
					}
				}
				if (local159) {
					if (this.aLong9 != -1L) {
						local155 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method591(this.aLong9);
					}
					if (local155 == null) {
						return null;
					}
				}
			}
			if (local155 == null) {
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
						local277 = Class23.aClass23Array1[local249 - 256].method499();
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
					if (local249 >= 512) {
						local277 = Class15.method361(local249 - 512).method369(this.anInt137);
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
				}
				local155 = new Class1_Sub1_Sub1_Sub5(local238, this.aByte1, local161);
				for (local249 = 0; local249 < 5; local249++) {
					if (this.anIntArray14[local249] != 0) {
						local155.method275(client.anIntArrayArray5[local249][0], client.anIntArrayArray5[local249][this.anIntArray14[local249]]);
						if (local249 == 1) {
							local155.method275(client.anIntArray72[0], client.anIntArray72[this.anIntArray14[local249]]);
						}
					}
				}
				local155.method268();
				local155.method278(64, 850, -30, -50, -30, true);
				aClass40_1.method592(local48, local155);
				this.aLong9 = local48;
			}
			if (this.aBoolean29) {
				return local155;
			}
			@Pc(383) Class1_Sub1_Sub1_Sub5 local383 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local383.method263(local155, Class12.method306(local50, this.aBoolean25) & Class12.method306(local52, this.aBoolean25));
			if (local50 != -1 && local52 != -1) {
				local383.method270(local50, Class27.aClass27Array1[super.anInt1032].anIntArray228, local52);
			} else if (local50 != -1) {
				local383.method269(local50);
			}
			local383.method265();
			local383.anIntArrayArray9 = null;
			local383.anIntArrayArray8 = null;
			return local383;
		} catch (@Pc(433) RuntimeException local433) {
			signlink.reporterror("70645, " + true + ", " + local433.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean28) {
				return null;
			} else if (this.aClass13_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray13[local18];
					if (local25 >= 256 && local25 < 512 && !Class23.aClass23Array1[local25 - 256].method500()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class15.method361(local25 - 512).method370(this.anInt137)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(71) Class1_Sub1_Sub1_Sub5[] local71 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(73) int local73 = 0;
				for (@Pc(75) int local75 = 0; local75 < 12; local75++) {
					@Pc(82) int local82 = this.anIntArray13[local75];
					@Pc(96) Class1_Sub1_Sub1_Sub5 local96;
					if (local82 >= 256 && local82 < 512) {
						local96 = Class23.aClass23Array1[local82 - 256].method501();
						if (local96 != null) {
							local71[local73++] = local96;
						}
					}
					if (local82 >= 512) {
						local96 = Class15.method361(local82 - 512).method371(this.anInt137);
						if (local96 != null) {
							local71[local73++] = local96;
						}
					}
				}
				@Pc(134) Class1_Sub1_Sub1_Sub5 local134 = new Class1_Sub1_Sub1_Sub5(local71, this.aByte1, local73);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray14[local136] != 0) {
						local134.method275(client.anIntArrayArray5[local136][0], client.anIntArrayArray5[local136][this.anIntArray14[local136]]);
						if (local136 == 1) {
							local134.method275(client.anIntArray72[0], client.anIntArray72[this.anIntArray14[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass13_1.method326();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("51428, " + false + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method680() {
		try {
			return this.aBoolean28;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("2305, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
