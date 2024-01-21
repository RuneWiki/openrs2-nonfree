import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "Qb", descriptor = "Lclient!s;")
	public static Class40 aClass40_1 = new Class40(260, 0);

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!ab", name = "vb", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!ab", name = "wb", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ab", name = "Fb", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!ab", name = "Gb", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ab", name = "Hb", descriptor = "I")
	public int anInt138;

	@OriginalMember(owner = "client!ab", name = "Ib", descriptor = "Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ab", name = "Jb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ab", name = "Kb", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!ab", name = "Lb", descriptor = "I")
	public int anInt141;

	@OriginalMember(owner = "client!ab", name = "Mb", descriptor = "I")
	public int anInt142;

	@OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Lclient!gc;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "I")
	private int anInt127 = -12792;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "I")
	private int anInt128 = -582;

	@OriginalMember(owner = "client!ab", name = "ub", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ab", name = "xb", descriptor = "[I")
	public int[] anIntArray13 = new int[12];

	@OriginalMember(owner = "client!ab", name = "yb", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!ab", name = "Nb", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ab", name = "Ob", descriptor = "J")
	private long aLong9 = -1L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method39(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			arg0.anInt743 = 0;
			this.anInt129 = arg0.method473();
			this.anInt130 = arg0.method473();
			this.aClass13_1 = null;
			@Pc(22) int local22;
			@Pc(34) int local34;
			for (@Pc(17) int local17 = 0; local17 < 12; local17++) {
				local22 = arg0.method473();
				if (local22 == 0) {
					this.anIntArray13[local17] = 0;
				} else {
					local34 = arg0.method473();
					this.anIntArray13[local17] = (local22 << 8) + local34;
					if (local17 == 0 && this.anIntArray13[0] == 65535) {
						this.aClass13_1 = Class13.method321(arg0.method475());
						break;
					}
				}
			}
			@Pc(66) int local66 = 2 / arg1;
			for (local22 = 0; local22 < 5; local22++) {
				local34 = arg0.method473();
				if (local34 < 0 || local34 >= client.anIntArrayArray6[local22].length) {
					local34 = 0;
				}
				this.anIntArray14[local22] = local34;
			}
			super.anInt994 = arg0.method475();
			if (super.anInt994 == 65535) {
				super.anInt994 = -1;
			}
			super.anInt995 = arg0.method475();
			if (super.anInt995 == 65535) {
				super.anInt995 = -1;
			}
			super.anInt996 = arg0.method475();
			if (super.anInt996 == 65535) {
				super.anInt996 = -1;
			}
			super.anInt997 = arg0.method475();
			if (super.anInt997 == 65535) {
				super.anInt997 = -1;
			}
			super.anInt998 = arg0.method475();
			if (super.anInt998 == 65535) {
				super.anInt998 = -1;
			}
			super.anInt999 = arg0.method475();
			if (super.anInt999 == 65535) {
				super.anInt999 = -1;
			}
			super.anInt1000 = arg0.method475();
			if (super.anInt1000 == 65535) {
				super.anInt1000 = -1;
			}
			this.aString3 = Class48.method664(Class48.method661(arg0.method479()));
			this.anInt131 = arg0.method473();
			this.anInt132 = arg0.method475();
			this.aBoolean23 = true;
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
			for (@Pc(266) int local266 = 0; local266 < 5; local266++) {
				this.aLong8 <<= 0x3;
				this.aLong8 += this.anIntArray14[local266];
			}
			this.aLong8 <<= 0x1;
			this.aLong8 += this.anInt129;
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("4409, " + arg0 + ", " + arg1 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method670() {
		try {
			if (!this.aBoolean23) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method40();
			if (local10 == null) {
				return null;
			}
			super.anInt1031 = local10.anInt989;
			local10.aBoolean116 = true;
			if (this.aBoolean24) {
				return local10;
			}
			if (super.anInt1018 != -1 && super.anInt1019 != -1) {
				@Pc(44) Class33 local44 = Class33.aClass33Array1[super.anInt1018];
				@Pc(47) Class1_Sub1_Sub1_Sub5 local47 = local44.method516();
				if (local47 != null) {
					@Pc(61) Class1_Sub1_Sub1_Sub5 local61 = new Class1_Sub1_Sub1_Sub5(true, Class12.method304(super.anInt1019), local47, true, false);
					local61.method273(0, -super.anInt1022, 0);
					local61.method267();
					local61.method268(local44.aClass27_2.anIntArray222[super.anInt1019]);
					local61.anIntArrayArray9 = null;
					local61.anIntArrayArray8 = null;
					if (local44.anInt829 != 128 || local44.anInt830 != 128) {
						local61.method276(local44.anInt829, local44.anInt829, local44.anInt830);
					}
					local61.method277(local44.anInt832 + 64, local44.anInt833 + 850, -30, -50, -30, true);
					@Pc(129) Class1_Sub1_Sub1_Sub5[] local129 = new Class1_Sub1_Sub1_Sub5[] { local10, local61 };
					local10 = new Class1_Sub1_Sub1_Sub5(true, (byte) 72, local129, 2);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt207 >= this.anInt135) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt207 >= this.anInt134 && client.anInt207 < this.anInt135) {
					@Pc(158) Class1_Sub1_Sub1_Sub5 local158 = this.aClass1_Sub1_Sub1_Sub5_1;
					local158.method273(this.anInt136 - super.anInt990, this.anInt137 - this.anInt133, this.anInt138 - super.anInt991);
					if (super.anInt1032 == 512) {
						local158.method271();
						local158.method271();
						local158.method271();
					} else if (super.anInt1032 == 1024) {
						local158.method271();
						local158.method271();
					} else if (super.anInt1032 == 1536) {
						local158.method271();
					}
					@Pc(221) Class1_Sub1_Sub1_Sub5[] local221 = new Class1_Sub1_Sub1_Sub5[] { local10, local158 };
					local10 = new Class1_Sub1_Sub1_Sub5(true, (byte) 72, local221, 2);
					if (super.anInt1032 == 512) {
						local158.method271();
					} else if (super.anInt1032 == 1024) {
						local158.method271();
						local158.method271();
					} else if (super.anInt1032 == 1536) {
						local158.method271();
						local158.method271();
						local158.method271();
					}
					local158.method273(super.anInt990 - this.anInt136, this.anInt133 - this.anInt137, super.anInt991 - this.anInt138);
				}
			}
			local10.aBoolean116 = true;
			return local10;
		} catch (@Pc(287) RuntimeException local287) {
			signlink.reporterror("23054, " + false + ", " + local287.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method40() {
		try {
			if (this.aClass13_1 != null) {
				@Pc(15) int local15 = -1;
				if (super.anInt1013 >= 0 && super.anInt1016 == 0) {
					local15 = Class27.aClass27Array1[super.anInt1013].anIntArray222[super.anInt1014];
				} else if (super.anInt1010 >= 0) {
					local15 = Class27.aClass27Array1[super.anInt1010].anIntArray222[super.anInt1011];
				}
				return this.aClass13_1.method323(local15, -1, 811, null);
			}
			@Pc(57) long local57 = this.aLong8;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			@Pc(65) int local65 = -1;
			if (super.anInt1013 >= 0 && super.anInt1016 == 0) {
				@Pc(76) Class27 local76 = Class27.aClass27Array1[super.anInt1013];
				local59 = local76.anIntArray222[super.anInt1014];
				if (super.anInt1010 >= 0 && super.anInt1010 != super.anInt994) {
					local61 = Class27.aClass27Array1[super.anInt1010].anIntArray222[super.anInt1011];
				}
				if (local76.anInt798 >= 0) {
					local63 = local76.anInt798;
					local57 += local63 - this.anIntArray13[5] << 8;
				}
				if (local76.anInt799 >= 0) {
					local65 = local76.anInt799;
					local57 += local65 - this.anIntArray13[3] << 16;
				}
			} else if (super.anInt1010 >= 0) {
				local59 = Class27.aClass27Array1[super.anInt1010].anIntArray222[super.anInt1011];
			}
			@Pc(154) Class1_Sub1_Sub1_Sub5 local154 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method584(local57);
			@Pc(160) int local160;
			@Pc(167) int local167;
			if (local154 == null) {
				@Pc(158) boolean local158 = false;
				for (local160 = 0; local160 < 12; local160++) {
					local167 = this.anIntArray13[local160];
					if (local65 >= 0 && local160 == 3) {
						local167 = local65;
					}
					if (local63 >= 0 && local160 == 5) {
						local167 = local63;
					}
					if (local167 >= 256 && local167 < 512 && !Class23.aClass23Array1[local167 - 256].method491()) {
						local158 = true;
					}
					if (local167 >= 512 && !Class15.method358(local167 - 512).method365(this.anInt129)) {
						local158 = true;
					}
				}
				if (local158) {
					if (this.aLong9 != -1L) {
						local154 = (Class1_Sub1_Sub1_Sub5) aClass40_1.method584(this.aLong9);
					}
					if (local154 == null) {
						return null;
					}
				}
			}
			if (local154 == null) {
				@Pc(237) Class1_Sub1_Sub1_Sub5[] local237 = new Class1_Sub1_Sub1_Sub5[12];
				local160 = 0;
				@Pc(248) int local248;
				for (local167 = 0; local167 < 12; local167++) {
					local248 = this.anIntArray13[local167];
					if (local65 >= 0 && local167 == 3) {
						local248 = local65;
					}
					if (local63 >= 0 && local167 == 5) {
						local248 = local63;
					}
					@Pc(276) Class1_Sub1_Sub1_Sub5 local276;
					if (local248 >= 256 && local248 < 512) {
						local276 = Class23.aClass23Array1[local248 - 256].method492();
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
					if (local248 >= 512) {
						local276 = Class15.method358(local248 - 512).method366(this.anInt129);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
				}
				local154 = new Class1_Sub1_Sub1_Sub5(local160, -643, local237);
				for (local248 = 0; local248 < 5; local248++) {
					if (this.anIntArray14[local248] != 0) {
						local154.method274(client.anIntArrayArray6[local248][0], client.anIntArrayArray6[local248][this.anIntArray14[local248]]);
						if (local248 == 1) {
							local154.method274(client.anIntArray78[0], client.anIntArray78[this.anIntArray14[local248]]);
						}
					}
				}
				local154.method267();
				local154.method277(64, 850, -30, -50, -30, true);
				aClass40_1.method585(201, local57, local154);
				this.aLong9 = local57;
			}
			if (this.aBoolean24) {
				return local154;
			}
			@Pc(381) Class1_Sub1_Sub1_Sub5 local381 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local381.method262(local154, Class12.method304(local59) & Class12.method304(local61));
			if (local59 != -1 && local61 != -1) {
				local381.method269(Class27.aClass27Array1[super.anInt1013].anIntArray225, local59, local61);
			} else if (local59 != -1) {
				local381.method268(local59);
			}
			local381.method264(486);
			local381.anIntArrayArray9 = null;
			local381.anIntArrayArray8 = null;
			return local381;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("78562, " + true + ", " + local429.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method41() {
		try {
			if (!this.aBoolean23) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < 12; local10++) {
				@Pc(17) int local17 = this.anIntArray13[local10];
				if (local17 >= 256 && local17 < 512 && !Class23.aClass23Array1[local17 - 256].method493()) {
					local8 = true;
				}
				if (local17 >= 512 && !Class15.method358(local17 - 512).method367(this.anInt129, (byte) 1)) {
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
					local83 = Class23.aClass23Array1[local69 - 256].method494((byte) 7);
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
				if (local69 >= 512) {
					local83 = Class15.method358(local69 - 512).method368(this.anInt129);
					if (local83 != null) {
						local58[local60++] = local83;
					}
				}
			}
			@Pc(120) Class1_Sub1_Sub1_Sub5 local120 = new Class1_Sub1_Sub1_Sub5(local60, -643, local58);
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				if (this.anIntArray14[local122] != 0) {
					local120.method274(client.anIntArrayArray6[local122][0], client.anIntArrayArray6[local122][this.anIntArray14[local122]]);
					if (local122 == 1) {
						local120.method274(client.anIntArray78[0], client.anIntArray78[this.anIntArray14[local122]]);
					}
				}
			}
			return local120;
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("91602, " + true + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method674() {
		try {
			return this.aBoolean23;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("21061, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
