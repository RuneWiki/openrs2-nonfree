import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "Lclient!s;")
	public static Class39 aClass39_1 = new Class39(260, false);

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "I")
	private int anInt127;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "Lclient!hc;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!ab", name = "pb", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method39(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt766 = 0;
			this.anInt127 = arg0.method503();
			this.anInt128 = arg0.method503();
			this.aClass15_1 = null;
			@Pc(22) int local22;
			@Pc(34) int local34;
			for (@Pc(17) int local17 = 0; local17 < 12; local17++) {
				local22 = arg0.method503();
				if (local22 == 0) {
					this.anIntArray13[local17] = 0;
				} else {
					local34 = arg0.method503();
					this.anIntArray13[local17] = (local22 << 8) + local34;
					if (local17 == 0 && this.anIntArray13[0] == 65535) {
						this.aClass15_1 = Class15.method352(arg0.method505());
						break;
					}
				}
			}
			for (local22 = 0; local22 < 5; local22++) {
				local34 = arg0.method503();
				if (local34 < 0 || local34 >= client.anIntArrayArray3[local22].length) {
					local34 = 0;
				}
				this.anIntArray14[local22] = local34;
			}
			super.anInt998 = arg0.method505();
			if (super.anInt998 == 65535) {
				super.anInt998 = -1;
			}
			super.anInt999 = arg0.method505();
			if (super.anInt999 == 65535) {
				super.anInt999 = -1;
			}
			super.anInt1000 = arg0.method505();
			if (super.anInt1000 == 65535) {
				super.anInt1000 = -1;
			}
			super.anInt1001 = arg0.method505();
			if (super.anInt1001 == 65535) {
				super.anInt1001 = -1;
			}
			super.anInt1002 = arg0.method505();
			if (super.anInt1002 == 65535) {
				super.anInt1002 = -1;
			}
			super.anInt1003 = arg0.method505();
			if (super.anInt1003 == 65535) {
				super.anInt1003 = -1;
			}
			super.anInt1004 = arg0.method505();
			if (super.anInt1004 == 65535) {
				super.anInt1004 = -1;
			}
			this.aString3 = Class49.method704(Class49.method701(586, arg0.method509()));
			this.anInt129 = arg0.method503();
			this.aBoolean22 = true;
			this.aLong8 = 0L;
			for (local34 = 0; local34 < 12; local34++) {
				this.aLong8 <<= 0x4;
				if (this.anIntArray13[local34] >= 256) {
					this.aLong8 += this.anIntArray13[local34] - 256;
				}
			}
			if (this.anIntArray13[0] >= 256) {
				this.aLong8 += this.anIntArray13[0] - 256 >> 4;
			}
			if (this.anIntArray13[1] >= 256) {
				this.aLong8 += this.anIntArray13[1] - 256 >> 8;
			}
			for (@Pc(262) int local262 = 0; local262 < 5; local262++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray14[local262];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt127;
		} catch (@Pc(300) RuntimeException local300) {
			signlink.reporterror("49223, " + arg0 + ", " + -25120 + ", " + local300.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method693() {
		try {
			if (!this.aBoolean22) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40();
			if (local10 == null) {
				return null;
			}
			super.anInt1035 = local10.anInt992;
			local10.aBoolean109 = true;
			if (this.aBoolean23) {
				return local10;
			}
			if (super.anInt1022 != -1 && super.anInt1023 != -1) {
				@Pc(50) Class35 local50 = Class35.aClass35Array1[super.anInt1022];
				@Pc(53) Class1_Sub1_Sub1_Sub5 local53 = local50.method546();
				if (local53 != null) {
					@Pc(67) Class1_Sub1_Sub1_Sub5 local67 = new Class1_Sub1_Sub1_Sub5(false, -164, local53, true, Class12.method304(super.anInt1023));
					local67.method269(-super.anInt1026, 0, 0);
					local67.method263(this.anInt126);
					local67.method264(local50.aClass29_2.anIntArray237[super.anInt1023]);
					local67.anIntArrayArray9 = null;
					local67.anIntArrayArray8 = null;
					if (local50.anInt845 != 128 || local50.anInt846 != 128) {
						local67.method272(local50.anInt845, local50.anInt845, local50.anInt846);
					}
					local67.method273(local50.anInt848 + 64, local50.anInt849 + 850, -30, -50, -30, true);
					@Pc(136) Class1_Sub1_Sub1_Sub5[] local136 = new Class1_Sub1_Sub1_Sub5[] { local10, local67 };
					local10 = new Class1_Sub1_Sub1_Sub5(2, true, local136, 144);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt209 >= this.anInt132) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt209 >= this.anInt131 && client.anInt209 < this.anInt132) {
					@Pc(165) Class1_Sub1_Sub1_Sub5 local165 = this.aClass1_Sub1_Sub1_Sub5_1;
					local165.method269(this.anInt134 - this.anInt130, this.anInt133 - super.anInt994, this.anInt135 - super.anInt995);
					if (super.anInt1036 == 512) {
						local165.method267();
						local165.method267();
						local165.method267();
					} else if (super.anInt1036 == 1024) {
						local165.method267();
						local165.method267();
					} else if (super.anInt1036 == 1536) {
						local165.method267();
					}
					@Pc(228) Class1_Sub1_Sub1_Sub5[] local228 = new Class1_Sub1_Sub1_Sub5[] { local10, local165 };
					local10 = new Class1_Sub1_Sub1_Sub5(2, true, local228, 144);
					if (super.anInt1036 == 512) {
						local165.method267();
					} else if (super.anInt1036 == 1024) {
						local165.method267();
						local165.method267();
					} else if (super.anInt1036 == 1536) {
						local165.method267();
						local165.method267();
						local165.method267();
					}
					local165.method269(this.anInt130 - this.anInt134, super.anInt994 - this.anInt133, super.anInt995 - this.anInt135);
				}
			}
			local10.aBoolean109 = true;
			return local10;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("89989, " + -21173 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass15_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt1017 >= 0 && super.anInt1020 == 0) {
					local6 = Class29.aClass29Array1[super.anInt1017].anIntArray237[super.anInt1018];
				} else if (super.anInt1014 >= 0) {
					local6 = Class29.aClass29Array1[super.anInt1014].anIntArray237[super.anInt1015];
				}
				return this.aClass15_1.method354(this.aBoolean21, -1, local6, null);
			}
			@Pc(49) long local49 = this.aLong8;
			@Pc(51) int local51 = -1;
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			@Pc(57) int local57 = -1;
			if (super.anInt1017 >= 0 && super.anInt1020 == 0) {
				@Pc(68) Class29 local68 = Class29.aClass29Array1[super.anInt1017];
				local51 = local68.anIntArray237[super.anInt1018];
				if (super.anInt1014 >= 0 && super.anInt1014 != super.anInt998) {
					local53 = Class29.aClass29Array1[super.anInt1014].anIntArray237[super.anInt1015];
				}
				if (local68.anInt810 >= 0) {
					local55 = local68.anInt810;
					local49 += local55 - this.anIntArray13[5] << 8;
				}
				if (local68.anInt811 >= 0) {
					local57 = local68.anInt811;
					local49 += local57 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1014 >= 0) {
				local51 = Class29.aClass29Array1[super.anInt1014].anIntArray237[super.anInt1015];
			}
			@Pc(146) Class1_Sub1_Sub1_Sub5 local146 = (Class1_Sub1_Sub1_Sub5) aClass39_1.method604(local49);
			@Pc(158) int local158;
			@Pc(165) int local165;
			if (local146 == null) {
				@Pc(156) boolean local156 = false;
				for (local158 = 0; local158 < 12; local158++) {
					local165 = this.anIntArray13[local158];
					if (local57 >= 0 && local158 == 3) {
						local165 = local57;
					}
					if (local55 >= 0 && local158 == 5) {
						local165 = local55;
					}
					if (local165 >= 256 && local165 < 512 && !Class25.aClass25Array1[local165 - 256].method521()) {
						local156 = true;
					}
					if (local165 >= 512 && !Class17.method385(local165 - 512).method392(this.anInt127)) {
						local156 = true;
					}
				}
				if (local156) {
					if (this.aLong9 != -1L) {
						local146 = (Class1_Sub1_Sub1_Sub5) aClass39_1.method604(this.aLong9);
					}
					if (local146 == null) {
						return null;
					}
				}
			}
			if (local146 == null) {
				@Pc(235) Class1_Sub1_Sub1_Sub5[] local235 = new Class1_Sub1_Sub1_Sub5[12];
				local158 = 0;
				@Pc(246) int local246;
				for (local165 = 0; local165 < 12; local165++) {
					local246 = this.anIntArray13[local165];
					if (local57 >= 0 && local165 == 3) {
						local246 = local57;
					}
					if (local55 >= 0 && local165 == 5) {
						local246 = local55;
					}
					@Pc(274) Class1_Sub1_Sub1_Sub5 local274;
					if (local246 >= 256 && local246 < 512) {
						local274 = Class25.aClass25Array1[local246 - 256].method522();
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
					if (local246 >= 512) {
						local274 = Class17.method385(local246 - 512).method393(this.anInt127);
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
				}
				local146 = new Class1_Sub1_Sub1_Sub5(172, local235, local158);
				for (local246 = 0; local246 < 5; local246++) {
					if (this.anIntArray14[local246] != 0) {
						local146.method270(client.anIntArrayArray3[local246][0], client.anIntArrayArray3[local246][this.anIntArray14[local246]]);
						if (local246 == 1) {
							local146.method270(client.anIntArray71[0], client.anIntArray71[this.anIntArray14[local246]]);
						}
					}
				}
				local146.method263(this.anInt126);
				local146.method273(64, 850, -30, -50, -30, true);
				aClass39_1.method605(local146, local49);
				this.aLong9 = local49;
			}
			if (this.aBoolean23) {
				return local146;
			}
			@Pc(380) Class1_Sub1_Sub1_Sub5 local380 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local380.method258((byte) 6, local146, Class12.method304(local51) & Class12.method304(local53));
			if (local51 != -1 && local53 != -1) {
				local380.method265(306, local51, Class29.aClass29Array1[super.anInt1017].anIntArray240, local53);
			} else if (local51 != -1) {
				local380.method264(local51);
			}
			local380.method260();
			local380.anIntArrayArray9 = null;
			local380.anIntArrayArray8 = null;
			return local380;
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("41229, " + true + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean22) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 12; local10++) {
				@Pc(17) int local17 = this.anIntArray13[local10];
				if (local17 >= 256 && local17 < 512 && !Class25.aClass25Array1[local17 - 256].method523()) {
					local8 = true;
				}
				if (local17 >= 512 && !Class17.method385(local17 - 512).method394(this.anInt127)) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(58) Class1_Sub1_Sub1_Sub5[] local58 = new Class1_Sub1_Sub1_Sub5[12];
			@Pc(60) int local60 = 0;
			for (@Pc(62) int local62 = 0; local62 < 12; local62++) {
				@Pc(69) int local69 = this.anIntArray13[local62];
				@Pc(83) Class1_Sub1_Sub1_Sub5 local83;
				if (local69 >= 256 && local69 < 512) {
					local83 = Class25.aClass25Array1[local69 - 256].method524();
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
				if (local69 >= 512) {
					local83 = Class17.method385(local69 - 512).method395(this.anInt127);
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
			}
			@Pc(126) Class1_Sub1_Sub1_Sub5 local126 = new Class1_Sub1_Sub1_Sub5(172, local58, local60);
			for (@Pc(128) int local128 = 0; local128 < 5; local128++) {
				if (this.anIntArray14[local128] != 0) {
					local126.method270(client.anIntArrayArray3[local128][0], client.anIntArrayArray3[local128][this.anIntArray14[local128]]);
					if (local128 == 1) {
						local126.method270(client.anIntArray71[0], client.anIntArray71[this.anIntArray14[local128]]);
					}
				}
			}
			return local126;
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("91438, " + 9 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method697() {
		try {
			return this.aBoolean22;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("29850, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
