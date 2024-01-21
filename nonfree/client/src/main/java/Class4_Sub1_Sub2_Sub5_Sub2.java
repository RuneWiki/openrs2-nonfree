import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YFPQHQAV")
public final class Class4_Sub1_Sub2_Sub5_Sub2 extends Class4_Sub1_Sub2_Sub5 {

	@OriginalMember(owner = "client!YFPQHQAV", name = "sb", descriptor = "Lclient!FFRFJBIR;")
	public static Class7 aClass7_9 = new Class7(260, -2745);

	@OriginalMember(owner = "client!YFPQHQAV", name = "qb", descriptor = "Lclient!RDFTXEYV;")
	public Class33 aClass33_2;

	@OriginalMember(owner = "client!YFPQHQAV", name = "ub", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!YFPQHQAV", name = "yb", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!YFPQHQAV", name = "zb", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Ab", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Bb", descriptor = "Lclient!KUGNQTGL;")
	public Class4_Sub1_Sub2_Sub3 aClass4_Sub1_Sub2_Sub3_2;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Cb", descriptor = "I")
	public int anInt743;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Ib", descriptor = "I")
	public int anInt746;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Jb", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Mb", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Nb", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Ob", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Pb", descriptor = "I")
	public int anInt751;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Qb", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Rb", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Sb", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Tb", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Ub", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!YFPQHQAV", name = "rb", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!YFPQHQAV", name = "tb", descriptor = "[I")
	public int[] anIntArray179 = new int[5];

	@OriginalMember(owner = "client!YFPQHQAV", name = "vb", descriptor = "I")
	public int anInt739 = -1;

	@OriginalMember(owner = "client!YFPQHQAV", name = "wb", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!YFPQHQAV", name = "xb", descriptor = "Z")
	private boolean aBoolean190 = true;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Db", descriptor = "I")
	public int anInt744 = -1;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Eb", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Fb", descriptor = "[I")
	public int[] anIntArray180 = new int[12];

	@OriginalMember(owner = "client!YFPQHQAV", name = "Gb", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Hb", descriptor = "I")
	private int anInt745 = 25957;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Kb", descriptor = "J")
	private long aLong24 = -1L;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Lb", descriptor = "I")
	private int anInt747 = 9;

	@OriginalMember(owner = "client!YFPQHQAV", name = "Vb", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!YFPQHQAV", name = "a", descriptor = "(Z)Lclient!KUGNQTGL;")
	public Class4_Sub1_Sub2_Sub3 method500() {
		try {
			if (!this.aBoolean192) {
				return null;
			} else if (this.aClass33_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray180[local18];
					if (local25 >= 256 && local25 < 512 && !Class46.aClass46Array1[local25 - 256].method486()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class24.method315(local25 - 512).method308(this.anInt754)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class4_Sub1_Sub2_Sub3[] local66 = new Class4_Sub1_Sub2_Sub3[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray180[local76];
					@Pc(98) Class4_Sub1_Sub2_Sub3 local98;
					if (local83 >= 256 && local83 < 512) {
						local98 = Class46.aClass46Array1[local83 - 256].method487(this.aBoolean193);
						if (local98 != null) {
							local66[local74++] = local98;
						}
					}
					if (local83 >= 512) {
						local98 = Class24.method315(local83 - 512).method309(this.anInt754);
						if (local98 != null) {
							local66[local74++] = local98;
						}
					}
				}
				@Pc(135) Class4_Sub1_Sub2_Sub3 local135 = new Class4_Sub1_Sub2_Sub3(local74, local66, 127);
				for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
					if (this.anIntArray179[local137] != 0) {
						local135.method269(client.anIntArrayArray25[local137][0], client.anIntArrayArray25[local137][this.anIntArray179[local137]]);
						if (local137 == 1) {
							local135.method269(client.anIntArray233[0], client.anIntArray233[this.anIntArray179[local137]]);
						}
					}
				}
				return local135;
			} else {
				return this.aClass33_2.method370();
			}
		} catch (@Pc(180) RuntimeException local180) {
			signlink.reporterror("27863, " + false + ", " + local180.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFPQHQAV", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method499(@OriginalArg(0) int arg0) {
		try {
			return this.aBoolean192;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("3670, " + 172 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFPQHQAV", name = "a", descriptor = "(ILclient!FTMSICIZ;)V")
	public void method501(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		try {
			arg0.anInt101 = 0;
			this.anInt754 = arg0.method102();
			this.anInt744 = arg0.method103();
			this.anInt739 = arg0.method103();
			this.aClass33_2 = null;
			this.anInt743 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method102();
				if (local29 == 0) {
					this.anIntArray180[local24] = 0;
				} else {
					local41 = arg0.method102();
					this.anIntArray180[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray180[0] == 65535) {
						this.aClass33_2 = Class33.method372(arg0.method104());
						break;
					}
					if (this.anIntArray180[local24] >= 512 && this.anIntArray180[local24] - 512 < Class24.anInt301) {
						local88 = Class24.method315(this.anIntArray180[local24] - 512).anInt318;
						if (local88 != 0) {
							this.anInt743 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method102();
				if (local41 < 0 || local41 >= client.anIntArrayArray25[local29].length) {
					local41 = 0;
				}
				this.anIntArray179[local29] = local41;
			}
			super.anInt724 = arg0.method104();
			if (super.anInt724 == 65535) {
				super.anInt724 = -1;
			}
			super.anInt725 = arg0.method104();
			if (super.anInt725 == 65535) {
				super.anInt725 = -1;
			}
			super.anInt707 = arg0.method104();
			if (super.anInt707 == 65535) {
				super.anInt707 = -1;
			}
			super.anInt708 = arg0.method104();
			if (super.anInt708 == 65535) {
				super.anInt708 = -1;
			}
			super.anInt709 = arg0.method104();
			if (super.anInt709 == 65535) {
				super.anInt709 = -1;
			}
			super.anInt710 = arg0.method104();
			if (super.anInt710 == 65535) {
				super.anInt710 = -1;
			}
			super.anInt726 = arg0.method104();
			if (super.anInt726 == 65535) {
				super.anInt726 = -1;
			}
			this.aString16 = Class36.method382(Class36.method379(arg0.method108()), 78);
			this.anInt755 = arg0.method102();
			this.anInt746 = arg0.method104();
			this.aBoolean192 = true;
			this.aLong23 = 0L;
			local41 = this.anIntArray180[5];
			local88 = this.anIntArray180[9];
			this.anIntArray180[5] = local88;
			this.anIntArray180[9] = local41;
			for (@Pc(254) int local254 = 0; local254 < 12; local254++) {
				this.aLong23 <<= 0x4;
				if (this.anIntArray180[local254] >= 256) {
					this.aLong23 += this.anIntArray180[local254] - 256;
				}
			}
			if (this.anIntArray180[0] >= 256) {
				this.aLong23 += this.anIntArray180[0] - 256 >> 4;
			}
			if (this.anIntArray180[1] >= 256) {
				this.aLong23 += this.anIntArray180[1] - 256 >> 8;
			}
			this.anIntArray180[5] = local41;
			this.anIntArray180[9] = local88;
			for (@Pc(336) int local336 = 0; local336 < 5; local336++) {
				this.aLong23 <<= 0x3;
				this.aLong23 += this.anIntArray179[local336];
			}
			this.aLong23 <<= 0x1;
			this.aLong23 += this.anInt754;
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("27022, " + 2 + ", " + arg0 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFPQHQAV", name = "a", descriptor = "(B)Lclient!KUGNQTGL;")
	@Override
	protected Class4_Sub1_Sub2_Sub3 method575() {
		try {
			if (!this.aBoolean192) {
				return null;
			}
			@Pc(11) Class4_Sub1_Sub2_Sub3 local11 = this.method502(this.aBoolean191);
			if (local11 == null) {
				return null;
			}
			super.anInt731 = local11.anInt799;
			local11.aBoolean90 = true;
			if (this.aBoolean188) {
				return local11;
			}
			if (super.anInt689 != -1 && super.anInt690 != -1) {
				@Pc(40) Class16 local40 = Class16.aClass16Array1[super.anInt689];
				@Pc(43) Class4_Sub1_Sub2_Sub3 local43 = local40.method215();
				if (local43 != null) {
					@Pc(57) Class4_Sub1_Sub2_Sub3 local57 = new Class4_Sub1_Sub2_Sub3(local43, false, true, Class37.method388(super.anInt690), 584);
					local57.method268(0, 0, -super.anInt693, (byte) 8);
					local57.method262();
					local57.method263(local40.aClass27_2.anIntArray95[super.anInt690]);
					local57.anIntArrayArray3 = null;
					local57.anIntArrayArray2 = null;
					if (local40.anInt184 != 128 || local40.anInt185 != 128) {
						local57.method271(local40.anInt184, local40.anInt184, local40.anInt185);
					}
					local57.method272(local40.anInt187 + 64, local40.anInt188 + 850, -30, -50, -30, true);
					@Pc(125) Class4_Sub1_Sub2_Sub3[] local125 = new Class4_Sub1_Sub2_Sub3[] { local11, local57 };
					local11 = new Class4_Sub1_Sub2_Sub3(false, local125, true, 2);
				}
			}
			if (this.aClass4_Sub1_Sub2_Sub3_2 != null) {
				if (client.anInt927 >= this.anInt753) {
					this.aClass4_Sub1_Sub2_Sub3_2 = null;
				}
				if (client.anInt927 >= this.anInt752 && client.anInt927 < this.anInt753) {
					@Pc(154) Class4_Sub1_Sub2_Sub3 local154 = this.aClass4_Sub1_Sub2_Sub3_2;
					local154.method268(this.anInt740 - super.anInt694, this.anInt742 - super.anInt695, this.anInt741 - this.anInt738, (byte) 8);
					if (super.anInt733 == 512) {
						local154.method266();
						local154.method266();
						local154.method266();
					} else if (super.anInt733 == 1024) {
						local154.method266();
						local154.method266();
					} else if (super.anInt733 == 1536) {
						local154.method266();
					}
					@Pc(217) Class4_Sub1_Sub2_Sub3[] local217 = new Class4_Sub1_Sub2_Sub3[] { local11, local154 };
					local11 = new Class4_Sub1_Sub2_Sub3(false, local217, true, 2);
					if (super.anInt733 == 512) {
						local154.method266();
					} else if (super.anInt733 == 1024) {
						local154.method266();
						local154.method266();
					} else if (super.anInt733 == 1536) {
						local154.method266();
						local154.method266();
						local154.method266();
					}
					local154.method268(super.anInt694 - this.anInt740, super.anInt695 - this.anInt742, this.anInt738 - this.anInt741, (byte) 8);
				}
			}
			local11.aBoolean90 = true;
			return local11;
		} catch (@Pc(296) RuntimeException local296) {
			signlink.reporterror("2552, " + 0 + ", " + local296.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFPQHQAV", name = "b", descriptor = "(Z)Lclient!KUGNQTGL;")
	private Class4_Sub1_Sub2_Sub3 method502(@OriginalArg(0) boolean arg0) {
		try {
			if (this.aClass33_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt715 >= 0 && super.anInt718 == 0) {
					local6 = Class27.aClass27Array1[super.anInt715].anIntArray95[super.anInt716];
				} else if (super.anInt712 >= 0) {
					local6 = Class27.aClass27Array1[super.anInt712].anIntArray95[super.anInt713];
				}
				return this.aClass33_2.method368(local6, -1, null);
			}
			@Pc(48) long local48 = this.aLong23;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (arg0) {
				throw new NullPointerException();
			}
			if (super.anInt715 >= 0 && super.anInt718 == 0) {
				@Pc(73) Class27 local73 = Class27.aClass27Array1[super.anInt715];
				local50 = local73.anIntArray95[super.anInt716];
				if (super.anInt712 >= 0 && super.anInt712 != super.anInt724) {
					local52 = Class27.aClass27Array1[super.anInt712].anIntArray95[super.anInt713];
				}
				if (local73.anInt369 >= 0) {
					local54 = local73.anInt369;
					local48 += local54 - this.anIntArray180[5] << 8;
				}
				if (local73.anInt370 >= 0) {
					local56 = local73.anInt370;
					local48 += local56 - this.anIntArray180[3] << 16;
				}
			} else if (super.anInt712 >= 0) {
				local50 = Class27.aClass27Array1[super.anInt712].anIntArray95[super.anInt713];
			}
			@Pc(151) Class4_Sub1_Sub2_Sub3 local151 = (Class4_Sub1_Sub2_Sub3) aClass7_9.method85(local48);
			@Pc(157) int local157;
			@Pc(164) int local164;
			if (local151 == null) {
				@Pc(155) boolean local155 = false;
				for (local157 = 0; local157 < 12; local157++) {
					local164 = this.anIntArray180[local157];
					if (local56 >= 0 && local157 == 3) {
						local164 = local56;
					}
					if (local54 >= 0 && local157 == 5) {
						local164 = local54;
					}
					if (local164 >= 256 && local164 < 512 && !Class46.aClass46Array1[local164 - 256].method484()) {
						local155 = true;
					}
					if (local164 >= 512 && !Class24.method315(local164 - 512).method312(this.anInt754)) {
						local155 = true;
					}
				}
				if (local155) {
					if (this.aLong24 != -1L) {
						local151 = (Class4_Sub1_Sub2_Sub3) aClass7_9.method85(this.aLong24);
					}
					if (local151 == null) {
						return null;
					}
				}
			}
			if (local151 == null) {
				@Pc(234) Class4_Sub1_Sub2_Sub3[] local234 = new Class4_Sub1_Sub2_Sub3[12];
				local157 = 0;
				@Pc(245) int local245;
				for (local164 = 0; local164 < 12; local164++) {
					local245 = this.anIntArray180[local164];
					if (local56 >= 0 && local164 == 3) {
						local245 = local56;
					}
					if (local54 >= 0 && local164 == 5) {
						local245 = local54;
					}
					@Pc(273) Class4_Sub1_Sub2_Sub3 local273;
					if (local245 >= 256 && local245 < 512) {
						local273 = Class46.aClass46Array1[local245 - 256].method485();
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
					if (local245 >= 512) {
						local273 = Class24.method315(local245 - 512).method304(this.aBoolean190, this.anInt754);
						if (local273 != null) {
							local234[local157++] = local273;
						}
					}
				}
				local151 = new Class4_Sub1_Sub2_Sub3(local157, local234, 127);
				for (local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray179[local245] != 0) {
						local151.method269(client.anIntArrayArray25[local245][0], client.anIntArrayArray25[local245][this.anIntArray179[local245]]);
						if (local245 == 1) {
							local151.method269(client.anIntArray233[0], client.anIntArray233[this.anIntArray179[local245]]);
						}
					}
				}
				local151.method262();
				local151.method272(64, 850, -30, -50, -30, true);
				aClass7_9.method86(local48, local151, this.aBoolean189);
				this.aLong24 = local48;
			}
			if (this.aBoolean188) {
				return local151;
			}
			@Pc(380) Class4_Sub1_Sub2_Sub3 local380 = Class4_Sub1_Sub2_Sub3.aClass4_Sub1_Sub2_Sub3_1;
			local380.method257(Class37.method388(local50) & Class37.method388(local52), this.anInt747, local151);
			if (local50 != -1 && local52 != -1) {
				local380.method264(local50, local52, Class27.aClass27Array1[super.anInt715].anIntArray98);
			} else if (local50 != -1) {
				local380.method263(local50);
			}
			local380.method259();
			local380.anIntArrayArray3 = null;
			local380.anIntArrayArray2 = null;
			return local380;
		} catch (@Pc(429) RuntimeException local429) {
			signlink.reporterror("79383, " + arg0 + ", " + local429.toString());
			throw new RuntimeException();
		}
	}
}
