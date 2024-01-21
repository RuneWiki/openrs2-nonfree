import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SRMWIYVM")
public final class Class3_Sub3_Sub2_Sub1_Sub2 extends Class3_Sub3_Sub2_Sub1 {

	@OriginalMember(owner = "client!SRMWIYVM", name = "Ab", descriptor = "Lclient!NQQFCAPC;")
	public static Class25 aClass25_8 = new Class25(260, 285);

	@OriginalMember(owner = "client!SRMWIYVM", name = "sb", descriptor = "I")
	public int anInt692;

	@OriginalMember(owner = "client!SRMWIYVM", name = "tb", descriptor = "I")
	public int anInt693;

	@OriginalMember(owner = "client!SRMWIYVM", name = "ub", descriptor = "I")
	public int anInt694;

	@OriginalMember(owner = "client!SRMWIYVM", name = "vb", descriptor = "I")
	public int anInt695;

	@OriginalMember(owner = "client!SRMWIYVM", name = "wb", descriptor = "I")
	public int anInt696;

	@OriginalMember(owner = "client!SRMWIYVM", name = "xb", descriptor = "Lclient!PJGEBWSY;")
	public Class30 aClass30_2;

	@OriginalMember(owner = "client!SRMWIYVM", name = "yb", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Db", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Gb", descriptor = "I")
	public int anInt699;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Hb", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Jb", descriptor = "I")
	public int anInt701;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Mb", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Nb", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Ob", descriptor = "I")
	public int anInt706;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Pb", descriptor = "I")
	public int anInt707;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Qb", descriptor = "Lclient!FCIDIKVY;")
	public Class3_Sub3_Sub2_Sub3 aClass3_Sub3_Sub2_Sub3_2;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Tb", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Vb", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!SRMWIYVM", name = "zb", descriptor = "Z")
	private boolean aBoolean155 = true;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Bb", descriptor = "[I")
	public int[] anIntArray182 = new int[5];

	@OriginalMember(owner = "client!SRMWIYVM", name = "Cb", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Eb", descriptor = "J")
	private long aLong23 = -1L;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Fb", descriptor = "I")
	private int anInt698 = 3982;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Ib", descriptor = "[I")
	public int[] anIntArray183 = new int[12];

	@OriginalMember(owner = "client!SRMWIYVM", name = "Kb", descriptor = "I")
	public int anInt702 = -1;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Lb", descriptor = "I")
	private int anInt703 = -697;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Rb", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Sb", descriptor = "I")
	public int anInt708 = -1;

	@OriginalMember(owner = "client!SRMWIYVM", name = "Ub", descriptor = "Z")
	public boolean aBoolean158 = false;

	@OriginalMember(owner = "client!SRMWIYVM", name = "a", descriptor = "(ILclient!WBEWPIXO;)V")
	public void method405(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub4 arg1) {
		try {
			arg1.anInt738 = 0;
			this.anInt697 = arg1.method468();
			this.anInt702 = arg1.method469();
			this.anInt708 = arg1.method469();
			this.aClass30_2 = null;
			this.anInt709 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg1.method468();
				if (local29 == 0) {
					this.anIntArray183[local24] = 0;
				} else {
					local41 = arg1.method468();
					this.anIntArray183[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray183[0] == 65535) {
						this.aClass30_2 = Class30.method322(arg1.method470());
						break;
					}
					if (this.anIntArray183[local24] >= 512 && this.anIntArray183[local24] - 512 < Class1.anInt9) {
						local88 = Class1.method7(this.anIntArray183[local24] - 512).anInt30;
						if (local88 != 0) {
							this.anInt709 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg1.method468();
				if (local41 < 0 || local41 >= client.anIntArrayArray24[local29].length) {
					local41 = 0;
				}
				this.anIntArray182[local29] = local41;
			}
			if (arg0 == 8) {
				super.anInt689 = arg1.method470();
				if (super.anInt689 == 65535) {
					super.anInt689 = -1;
				}
				super.anInt690 = arg1.method470();
				if (super.anInt690 == 65535) {
					super.anInt690 = -1;
				}
				super.anInt647 = arg1.method470();
				if (super.anInt647 == 65535) {
					super.anInt647 = -1;
				}
				super.anInt648 = arg1.method470();
				if (super.anInt648 == 65535) {
					super.anInt648 = -1;
				}
				super.anInt649 = arg1.method470();
				if (super.anInt649 == 65535) {
					super.anInt649 = -1;
				}
				super.anInt650 = arg1.method470();
				if (super.anInt650 == 65535) {
					super.anInt650 = -1;
				}
				super.anInt683 = arg1.method470();
				if (super.anInt683 == 65535) {
					super.anInt683 = -1;
				}
				this.aString14 = Class48.method539(Class48.method536(this.aBoolean157, arg1.method474()));
				this.anInt701 = arg1.method468();
				this.anInt696 = arg1.method470();
				this.aBoolean158 = true;
				this.aLong22 = 0L;
				local41 = this.anIntArray183[5];
				local88 = this.anIntArray183[9];
				this.anIntArray183[5] = local88;
				this.anIntArray183[9] = local41;
				for (@Pc(250) int local250 = 0; local250 < 12; local250++) {
					this.aLong22 <<= 0x4;
					if (this.anIntArray183[local250] >= 256) {
						this.aLong22 += this.anIntArray183[local250] - 256;
					}
				}
				if (this.anIntArray183[0] >= 256) {
					this.aLong22 += this.anIntArray183[0] - 256 >> 4;
				}
				if (this.anIntArray183[1] >= 256) {
					this.aLong22 += this.anIntArray183[1] - 256 >> 8;
				}
				this.anIntArray183[5] = local41;
				this.anIntArray183[9] = local88;
				for (@Pc(332) int local332 = 0; local332 < 5; local332++) {
					this.aLong22 <<= 0x3;
					this.aLong22 += this.anIntArray182[local332];
				}
				this.aLong22 <<= 0x1;
				this.aLong22 += this.anInt697;
			}
		} catch (@Pc(370) RuntimeException local370) {
			signlink.reporterror("71404, " + arg0 + ", " + arg1 + ", " + local370.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SRMWIYVM", name = "b", descriptor = "(Z)Lclient!FCIDIKVY;")
	public Class3_Sub3_Sub2_Sub3 method406() {
		try {
			if (!this.aBoolean158) {
				return null;
			} else if (this.aClass30_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(23) int local23 = 0; local23 < 12; local23++) {
					@Pc(30) int local30 = this.anIntArray183[local23];
					if (local30 >= 256 && local30 < 512 && !Class11.aClass11Array1[local30 - 256].method110()) {
						local16 = true;
					}
					if (local30 >= 512 && !Class1.method7(local30 - 512).method2(this.anInt703, this.anInt697)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(72) Class3_Sub3_Sub2_Sub3[] local72 = new Class3_Sub3_Sub2_Sub3[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray183[local76];
					@Pc(97) Class3_Sub3_Sub2_Sub3 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class11.aClass11Array1[local83 - 256].method111();
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class1.method7(local83 - 512).method6(this.anInt697);
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
				}
				@Pc(134) Class3_Sub3_Sub2_Sub3 local134 = new Class3_Sub3_Sub2_Sub3(local74, -23, local72);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray182[local136] != 0) {
						local134.method94(client.anIntArrayArray24[local136][0], client.anIntArrayArray24[local136][this.anIntArray182[local136]]);
						if (local136 == 1) {
							local134.method94(client.anIntArray248[0], client.anIntArray248[this.anIntArray182[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass30_2.method324(649);
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("32737, " + false + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SRMWIYVM", name = "a", descriptor = "(I)Lclient!FCIDIKVY;")
	@Override
	protected Class3_Sub3_Sub2_Sub3 method525() {
		try {
			if (!this.aBoolean158) {
				return null;
			}
			@Pc(10) Class3_Sub3_Sub2_Sub3 local10 = this.method407();
			if (local10 == null) {
				return null;
			}
			super.anInt684 = local10.anInt793;
			local10.aBoolean44 = true;
			if (this.aBoolean156) {
				return local10;
			}
			if (super.anInt663 != -1 && super.anInt664 != -1) {
				@Pc(45) Class43 local45 = Class43.aClass43Array1[super.anInt663];
				@Pc(48) Class3_Sub3_Sub2_Sub3 local48 = local45.method516();
				if (local48 != null) {
					@Pc(62) Class3_Sub3_Sub2_Sub3 local62 = new Class3_Sub3_Sub2_Sub3(false, Class12.method116(super.anInt664), true, local48, true);
					local62.method93(0, -super.anInt667, 0);
					local62.method87();
					local62.method88(local45.aClass46_1.anIntArray198[super.anInt664]);
					local62.anIntArrayArray3 = null;
					local62.anIntArrayArray2 = null;
					if (local45.anInt758 != 128 || local45.anInt759 != 128) {
						local62.method96(local45.anInt758, local45.anInt758, this.aBoolean155, local45.anInt759);
					}
					local62.method97(local45.anInt761 + 64, local45.anInt762 + 850, -30, -50, -30, true);
					@Pc(131) Class3_Sub3_Sub2_Sub3[] local131 = new Class3_Sub3_Sub2_Sub3[] { local10, local62 };
					local10 = new Class3_Sub3_Sub2_Sub3(true, local131, true, 2);
				}
			}
			if (this.aClass3_Sub3_Sub2_Sub3_2 != null) {
				if (client.anInt1032 >= this.anInt700) {
					this.aClass3_Sub3_Sub2_Sub3_2 = null;
				}
				if (client.anInt1032 >= this.anInt699 && client.anInt1032 < this.anInt700) {
					@Pc(160) Class3_Sub3_Sub2_Sub3 local160 = this.aClass3_Sub3_Sub2_Sub3_2;
					local160.method93(this.anInt707 - super.anInt686, this.anInt706 - this.anInt704, this.anInt705 - super.anInt685);
					if (super.anInt688 == 512) {
						local160.method91();
						local160.method91();
						local160.method91();
					} else if (super.anInt688 == 1024) {
						local160.method91();
						local160.method91();
					} else if (super.anInt688 == 1536) {
						local160.method91();
					}
					@Pc(223) Class3_Sub3_Sub2_Sub3[] local223 = new Class3_Sub3_Sub2_Sub3[] { local10, local160 };
					local10 = new Class3_Sub3_Sub2_Sub3(true, local223, true, 2);
					if (super.anInt688 == 512) {
						local160.method91();
					} else if (super.anInt688 == 1024) {
						local160.method91();
						local160.method91();
					} else if (super.anInt688 == 1536) {
						local160.method91();
						local160.method91();
						local160.method91();
					}
					local160.method93(super.anInt686 - this.anInt707, this.anInt704 - this.anInt706, super.anInt685 - this.anInt705);
				}
			}
			local10.aBoolean44 = true;
			return local10;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("92088, " + 0 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SRMWIYVM", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method400() {
		try {
			return this.aBoolean158;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("15530, " + 5 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SRMWIYVM", name = "a", descriptor = "(B)Lclient!FCIDIKVY;")
	private Class3_Sub3_Sub2_Sub3 method407() {
		try {
			if (this.aClass30_2 != null) {
				@Pc(13) int local13 = -1;
				if (super.anInt678 >= 0 && super.anInt681 == 0) {
					local13 = Class46.aClass46Array1[super.anInt678].anIntArray198[super.anInt679];
				} else if (super.anInt644 >= 0) {
					local13 = Class46.aClass46Array1[super.anInt644].anIntArray198[super.anInt645];
				}
				return this.aClass30_2.method325(null, local13, -1);
			}
			@Pc(55) long local55 = this.aLong22;
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			if (super.anInt678 >= 0 && super.anInt681 == 0) {
				@Pc(74) Class46 local74 = Class46.aClass46Array1[super.anInt678];
				local57 = local74.anIntArray198[super.anInt679];
				if (super.anInt644 >= 0 && super.anInt644 != super.anInt689) {
					local59 = Class46.aClass46Array1[super.anInt644].anIntArray198[super.anInt645];
				}
				if (local74.anInt783 >= 0) {
					local61 = local74.anInt783;
					local55 += local61 - this.anIntArray183[5] << 8;
				}
				if (local74.anInt784 >= 0) {
					local63 = local74.anInt784;
					local55 += local63 - this.anIntArray183[3] << 16;
				}
			} else if (super.anInt644 >= 0) {
				local57 = Class46.aClass46Array1[super.anInt644].anIntArray198[super.anInt645];
			}
			@Pc(152) Class3_Sub3_Sub2_Sub3 local152 = (Class3_Sub3_Sub2_Sub3) aClass25_8.method218(local55);
			@Pc(158) int local158;
			@Pc(165) int local165;
			if (local152 == null) {
				@Pc(156) boolean local156 = false;
				for (local158 = 0; local158 < 12; local158++) {
					local165 = this.anIntArray183[local158];
					if (local63 >= 0 && local158 == 3) {
						local165 = local63;
					}
					if (local61 >= 0 && local158 == 5) {
						local165 = local61;
					}
					if (local165 >= 256 && local165 < 512 && !Class11.aClass11Array1[local165 - 256].method108(this.anInt698)) {
						local156 = true;
					}
					if (local165 >= 512 && !Class1.method7(local165 - 512).method13(this.anInt697)) {
						local156 = true;
					}
				}
				if (local156) {
					if (this.aLong23 != -1L) {
						local152 = (Class3_Sub3_Sub2_Sub3) aClass25_8.method218(this.aLong23);
					}
					if (local152 == null) {
						return null;
					}
				}
			}
			if (local152 == null) {
				@Pc(236) Class3_Sub3_Sub2_Sub3[] local236 = new Class3_Sub3_Sub2_Sub3[12];
				local158 = 0;
				@Pc(247) int local247;
				for (local165 = 0; local165 < 12; local165++) {
					local247 = this.anIntArray183[local165];
					if (local63 >= 0 && local165 == 3) {
						local247 = local63;
					}
					if (local61 >= 0 && local165 == 5) {
						local247 = local61;
					}
					@Pc(275) Class3_Sub3_Sub2_Sub3 local275;
					if (local247 >= 256 && local247 < 512) {
						local275 = Class11.aClass11Array1[local247 - 256].method109();
						if (local275 != null) {
							local236[local158++] = local275;
						}
					}
					if (local247 >= 512) {
						local275 = Class1.method7(local247 - 512).method3(this.anInt697);
						if (local275 != null) {
							local236[local158++] = local275;
						}
					}
				}
				local152 = new Class3_Sub3_Sub2_Sub3(local158, -23, local236);
				for (local247 = 0; local247 < 5; local247++) {
					if (this.anIntArray182[local247] != 0) {
						local152.method94(client.anIntArrayArray24[local247][0], client.anIntArrayArray24[local247][this.anIntArray182[local247]]);
						if (local247 == 1) {
							local152.method94(client.anIntArray248[0], client.anIntArray248[this.anIntArray182[local247]]);
						}
					}
				}
				local152.method87();
				local152.method97(64, 850, -30, -50, -30, true);
				aClass25_8.method219(97, local55, local152);
				this.aLong23 = local55;
			}
			if (this.aBoolean156) {
				return local152;
			}
			@Pc(380) Class3_Sub3_Sub2_Sub3 local380 = Class3_Sub3_Sub2_Sub3.aClass3_Sub3_Sub2_Sub3_1;
			local380.method82(Class12.method116(local57) & Class12.method116(local59), local152);
			if (local57 != -1 && local59 != -1) {
				local380.method89(Class46.aClass46Array1[super.anInt678].anIntArray201, local57, local59);
			} else if (local57 != -1) {
				local380.method88(local57);
			}
			local380.method84();
			local380.anIntArrayArray3 = null;
			local380.anIntArrayArray2 = null;
			return local380;
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("36628, " + 8 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}
}
