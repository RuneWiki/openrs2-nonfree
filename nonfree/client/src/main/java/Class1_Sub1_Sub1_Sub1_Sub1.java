import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Sb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40(260, 0);

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "I")
	public int anInt123;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "I")
	public int anInt124;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt125;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Lclient!gc;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
	private int anInt120 = 4697;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "I")
	private int anInt121 = 848;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Z")
	private boolean aBoolean29 = true;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!lb;)V")
	public void method39(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			arg1.anInt715 = 0;
			this.anInt122 = arg1.method472();
			this.anInt123 = arg1.method472();
			this.aClass13_1 = null;
			@Pc(22) int local22;
			@Pc(34) int local34;
			for (@Pc(17) int local17 = 0; local17 < 12; local17++) {
				local22 = arg1.method472();
				if (local22 == 0) {
					this.anIntArray13[local17] = 0;
				} else {
					local34 = arg1.method472();
					this.anIntArray13[local17] = (local22 << 8) + local34;
					if (local17 == 0 && this.anIntArray13[0] == 65535) {
						this.aClass13_1 = Class13.method320(arg1.method474());
						break;
					}
				}
			}
			for (local22 = 0; local22 < 5; local22++) {
				local34 = arg1.method472();
				if (local34 < 0 || local34 >= client.anIntArrayArray5[local22].length) {
					local34 = 0;
				}
				this.anIntArray14[local22] = local34;
			}
			super.anInt965 = arg1.method474();
			if (super.anInt965 == 65535) {
				super.anInt965 = -1;
			}
			super.anInt966 = arg1.method474();
			if (super.anInt966 == 65535) {
				super.anInt966 = -1;
			}
			super.anInt967 = arg1.method474();
			if (super.anInt967 == 65535) {
				super.anInt967 = -1;
			}
			super.anInt968 = arg1.method474();
			if (super.anInt968 == 65535) {
				super.anInt968 = -1;
			}
			super.anInt969 = arg1.method474();
			if (super.anInt969 == 65535) {
				super.anInt969 = -1;
			}
			super.anInt970 = arg1.method474();
			@Pc(152) boolean local152 = false;
			if (super.anInt970 == 65535) {
				super.anInt970 = -1;
			}
			super.anInt971 = arg1.method474();
			if (super.anInt971 == 65535) {
				super.anInt971 = -1;
			}
			this.aString3 = Class48.method663(584, Class48.method660(arg1.method478()));
			this.anInt124 = arg1.method472();
			this.anInt125 = arg1.method474();
			this.aBoolean30 = true;
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
			for (@Pc(277) int local277 = 0; local277 < 5; local277++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray14[local277];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt122;
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("62998, " + arg0 + ", " + arg1 + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method669() {
		try {
			if (!this.aBoolean30) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40();
			if (local10 == null) {
				return null;
			}
			super.anInt1002 = local10.anInt959;
			local10.aBoolean126 = true;
			if (this.aBoolean31) {
				return local10;
			}
			if (super.anInt989 != -1 && super.anInt990 != -1) {
				@Pc(49) Class33 local49 = Class33.aClass33Array1[super.anInt989];
				@Pc(52) Class1_Sub1_Sub1_Sub5 local52 = local49.method515();
				if (local52 != null) {
					@Pc(66) Class1_Sub1_Sub1_Sub5 local66 = new Class1_Sub1_Sub1_Sub5(false, true, local52, Class12.method303(super.anInt990, 681), 9);
					local66.method272(0, -super.anInt993, 0);
					local66.method266();
					local66.method267(local49.aClass27_2.anIntArray222[super.anInt990]);
					local66.anIntArrayArray9 = null;
					local66.anIntArrayArray8 = null;
					if (local49.anInt804 != 128 || local49.anInt805 != 128) {
						local66.method275(local49.anInt804, local49.anInt805, local49.anInt804);
					}
					local66.method276(local49.anInt807 + 64, local49.anInt808 + 850, -30, -50, -30, true);
					@Pc(134) Class1_Sub1_Sub1_Sub5[] local134 = new Class1_Sub1_Sub1_Sub5[] { local10, local66 };
					local10 = new Class1_Sub1_Sub1_Sub5(-638, true, local134, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt375 >= this.anInt128) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt375 >= this.anInt127 && client.anInt375 < this.anInt128) {
					@Pc(163) Class1_Sub1_Sub1_Sub5 local163 = this.aClass1_Sub1_Sub1_Sub5_1;
					local163.method272(this.anInt129 - super.anInt961, this.anInt130 - this.anInt126, this.anInt131 - super.anInt962);
					if (super.anInt1003 == 512) {
						local163.method270((byte) 4);
						local163.method270((byte) 4);
						local163.method270((byte) 4);
					} else if (super.anInt1003 == 1024) {
						local163.method270((byte) 4);
						local163.method270((byte) 4);
					} else if (super.anInt1003 == 1536) {
						local163.method270((byte) 4);
					}
					@Pc(226) Class1_Sub1_Sub1_Sub5[] local226 = new Class1_Sub1_Sub1_Sub5[] { local10, local163 };
					local10 = new Class1_Sub1_Sub1_Sub5(-638, true, local226, 2);
					if (super.anInt1003 == 512) {
						local163.method270((byte) 4);
					} else if (super.anInt1003 == 1024) {
						local163.method270((byte) 4);
						local163.method270((byte) 4);
					} else if (super.anInt1003 == 1536) {
						local163.method270((byte) 4);
						local163.method270((byte) 4);
						local163.method270((byte) 4);
					}
					local163.method272(super.anInt961 - this.anInt129, this.anInt126 - this.anInt130, super.anInt962 - this.anInt131);
				}
			}
			local10.aBoolean126 = true;
			return local10;
		} catch (@Pc(292) RuntimeException local292) {
			signlink.reporterror("35071, " + 0 + ", " + local292.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(13) int local13 = -1;
				if (super.anInt984 >= 0 && super.anInt987 == 0) {
					local13 = Class27.aClass27Array1[super.anInt984].anIntArray222[super.anInt985];
				} else if (super.anInt981 >= 0) {
					local13 = Class27.aClass27Array1[super.anInt981].anIntArray222[super.anInt982];
				}
				return this.aClass13_1.method322(local13, null, -1);
			}
			@Pc(55) long local55 = this.aLong8;
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			if (super.anInt984 >= 0 && super.anInt987 == 0) {
				@Pc(74) Class27 local74 = Class27.aClass27Array1[super.anInt984];
				local57 = local74.anIntArray222[super.anInt985];
				if (super.anInt981 >= 0 && super.anInt981 != super.anInt965) {
					local59 = Class27.aClass27Array1[super.anInt981].anIntArray222[super.anInt982];
				}
				if (local74.anInt771 >= 0) {
					local61 = local74.anInt771;
					local55 += local61 - this.anIntArray13[5] << 8;
				}
				if (local74.anInt772 >= 0) {
					local63 = local74.anInt772;
					local55 += local63 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt981 >= 0) {
				local57 = Class27.aClass27Array1[super.anInt981].anIntArray222[super.anInt982];
			}
			@Pc(152) Class1_Sub1_Sub1_Sub5 local152 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method583(local55);
			@Pc(158) int local158;
			@Pc(165) int local165;
			if (local152 == null) {
				@Pc(156) boolean local156 = false;
				for (local158 = 0; local158 < 12; local158++) {
					local165 = this.anIntArray13[local158];
					if (local63 >= 0 && local158 == 3) {
						local165 = local63;
					}
					if (local61 >= 0 && local158 == 5) {
						local165 = local61;
					}
					if (local165 >= 256 && local165 < 512 && !Class23.aClass23Array1[local165 - 256].method490()) {
						local156 = true;
					}
					if (local165 >= 512 && !Class15.method357(local165 - 512).method364(this.anInt122)) {
						local156 = true;
					}
				}
				if (local156) {
					if (this.aLong9 != -1L) {
						local152 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method583(this.aLong9);
					}
					if (local152 == null) {
						return null;
					}
				}
			}
			if (local152 == null) {
				@Pc(235) Class1_Sub1_Sub1_Sub5[] local235 = new Class1_Sub1_Sub1_Sub5[12];
				local158 = 0;
				@Pc(246) int local246;
				for (local165 = 0; local165 < 12; local165++) {
					local246 = this.anIntArray13[local165];
					if (local63 >= 0 && local165 == 3) {
						local246 = local63;
					}
					if (local61 >= 0 && local165 == 5) {
						local246 = local61;
					}
					@Pc(274) Class1_Sub1_Sub1_Sub5 local274;
					if (local246 >= 256 && local246 < 512) {
						local274 = Class23.aClass23Array1[local246 - 256].method491();
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
					if (local246 >= 512) {
						local274 = Class15.method357(local246 - 512).method365(this.anInt122);
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
				}
				local152 = new Class1_Sub1_Sub1_Sub5(local158, local235, this.anInt120);
				for (local246 = 0; local246 < 5; local246++) {
					if (this.anIntArray14[local246] != 0) {
						local152.method273(client.anIntArrayArray5[local246][0], client.anIntArrayArray5[local246][this.anIntArray14[local246]]);
						if (local246 == 1) {
							local152.method273(client.anIntArray32[0], client.anIntArray32[this.anIntArray14[local246]]);
						}
					}
				}
				local152.method266();
				local152.method276(64, 850, -30, -50, -30, true);
				aClass40_1.method584(local55, local152, this.anInt121);
				this.aLong9 = local55;
			}
			if (this.aBoolean31) {
				return local152;
			}
			@Pc(381) Class1_Sub1_Sub1_Sub5 local381 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local381.method261(Class12.method303(local57, 681) & Class12.method303(local59, 681), local152);
			if (local57 != -1 && local59 != -1) {
				local381.method268(local59, Class27.aClass27Array1[super.anInt984].anIntArray225, local57);
			} else if (local57 != -1) {
				local381.method267(local57);
			}
			local381.method263(this.aBoolean28);
			local381.anIntArrayArray9 = null;
			local381.anIntArrayArray8 = null;
			return local381;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("24373, " + 40 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean30) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 12; local10++) {
				@Pc(17) int local17 = this.anIntArray13[local10];
				if (local17 >= 256 && local17 < 512 && !Class23.aClass23Array1[local17 - 256].method492()) {
					local8 = true;
				}
				if (local17 >= 512 && !Class15.method357(local17 - 512).method366(this.anInt122)) {
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
					local83 = Class23.aClass23Array1[local69 - 256].method493();
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
				if (local69 >= 512) {
					local83 = Class15.method357(local69 - 512).method367(this.anInt122);
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
			}
			@Pc(130) Class1_Sub1_Sub1_Sub5 local130 = new Class1_Sub1_Sub1_Sub5(local60, local58, this.anInt120);
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				if (this.anIntArray14[local132] != 0) {
					local130.method273(client.anIntArrayArray5[local132][0], client.anIntArrayArray5[local132][this.anIntArray14[local132]]);
					if (local132 == 1) {
						local130.method273(client.anIntArray32[0], client.anIntArray32[this.anIntArray14[local132]]);
					}
				}
			}
			return local130;
		} catch (@Pc(175) RuntimeException local175) {
			signlink.reporterror("78373, " + false + ", " + local175.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method673() {
		try {
			return this.aBoolean30;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("46104, " + -948 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
