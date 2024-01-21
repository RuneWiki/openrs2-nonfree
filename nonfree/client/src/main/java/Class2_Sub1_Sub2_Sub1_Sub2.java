import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HHCKFJEO")
public final class Class2_Sub1_Sub2_Sub1_Sub2 extends Class2_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!HHCKFJEO", name = "Eb", descriptor = "Lclient!RPWOWYDL;")
	public static Class37 aClass37_2 = new Class37(0, 260);

	@OriginalMember(owner = "client!HHCKFJEO", name = "tb", descriptor = "I")
	public int anInt288;

	@OriginalMember(owner = "client!HHCKFJEO", name = "xb", descriptor = "I")
	public int anInt290;

	@OriginalMember(owner = "client!HHCKFJEO", name = "yb", descriptor = "I")
	public int anInt291;

	@OriginalMember(owner = "client!HHCKFJEO", name = "zb", descriptor = "I")
	public int anInt292;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Ab", descriptor = "Lclient!SNMMQNPZ;")
	public Class2_Sub1_Sub2_Sub5 aClass2_Sub1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Cb", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Db", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Hb", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Ib", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Jb", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Kb", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Lb", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Mb", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Nb", descriptor = "I")
	public int anInt301;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Ob", descriptor = "I")
	public int anInt302;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Qb", descriptor = "I")
	private int anInt303;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Rb", descriptor = "Lclient!HEKJNUPL;")
	public Class14 aClass14_2;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Tb", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Ub", descriptor = "I")
	private int anInt304;

	@OriginalMember(owner = "client!HHCKFJEO", name = "qb", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!HHCKFJEO", name = "rb", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!HHCKFJEO", name = "sb", descriptor = "[I")
	public int[] anIntArray56 = new int[5];

	@OriginalMember(owner = "client!HHCKFJEO", name = "ub", descriptor = "I")
	public int anInt289 = -1;

	@OriginalMember(owner = "client!HHCKFJEO", name = "vb", descriptor = "J")
	private long aLong13 = -1L;

	@OriginalMember(owner = "client!HHCKFJEO", name = "wb", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Bb", descriptor = "I")
	public int anInt293 = -1;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Fb", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Gb", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!HHCKFJEO", name = "Pb", descriptor = "[I")
	public int[] anIntArray57 = new int[12];

	@OriginalMember(owner = "client!HHCKFJEO", name = "Sb", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!HHCKFJEO", name = "a", descriptor = "(I)Lclient!SNMMQNPZ;")
	public Class2_Sub1_Sub2_Sub5 method203() {
		try {
			if (!this.aBoolean74) {
				return null;
			} else if (this.aClass14_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
					@Pc(31) int local31 = this.anIntArray57[local24];
					if (local31 >= 256 && local31 < 512 && !Class6.aClass6Array1[local31 - 256].method68(713)) {
						local16 = true;
					}
					if (local31 >= 512 && !Class19.method221(local31 - 512).method213(this.anInt303)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(72) Class2_Sub1_Sub2_Sub5[] local72 = new Class2_Sub1_Sub2_Sub5[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray57[local76];
					@Pc(97) Class2_Sub1_Sub2_Sub5 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class6.aClass6Array1[local83 - 256].method69();
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class19.method221(local83 - 512).method222(this.anInt303, (byte) 3);
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
				}
				@Pc(134) Class2_Sub1_Sub2_Sub5 local134 = new Class2_Sub1_Sub2_Sub5(local74, false, local72);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray56[local136] != 0) {
						local134.method398(client.anIntArrayArray23[local136][0], client.anIntArrayArray23[local136][this.anIntArray56[local136]]);
						if (local136 == 1) {
							local134.method398(client.anIntArray263[0], client.anIntArray263[this.anIntArray56[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass14_2.method189();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("67071, " + 8 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HHCKFJEO", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method199() {
		try {
			return this.aBoolean74;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("54884, " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HHCKFJEO", name = "a", descriptor = "(B)Lclient!SNMMQNPZ;")
	@Override
	protected Class2_Sub1_Sub2_Sub5 method561(@OriginalArg(0) byte arg0) {
		try {
			if (!this.aBoolean74) {
				return null;
			}
			@Pc(10) Class2_Sub1_Sub2_Sub5 local10 = this.method204();
			if (local10 == null) {
				return null;
			}
			super.anInt273 = local10.anInt761;
			local10.aBoolean165 = true;
			if (this.aBoolean71) {
				return local10;
			}
			if (super.anInt251 != -1 && super.anInt252 != -1) {
				@Pc(50) Class27 local50 = Class27.aClass27Array1[super.anInt251];
				@Pc(53) Class2_Sub1_Sub2_Sub5 local53 = local50.method291();
				if (local53 != null) {
					@Pc(67) Class2_Sub1_Sub2_Sub5 local67 = new Class2_Sub1_Sub2_Sub5(local53, 707, false, true, Class29.method296(super.anInt252));
					local67.method397(0, -super.anInt255, 0);
					local67.method391();
					local67.method392(local50.aClass49_1.anIntArray206[super.anInt252]);
					local67.anIntArrayArray13 = null;
					local67.anIntArrayArray12 = null;
					if (local50.anInt484 != 128 || local50.anInt485 != 128) {
						local67.method400(local50.anInt484, local50.anInt484, local50.anInt485);
					}
					local67.method401(local50.anInt487 + 64, local50.anInt488 + 850, -30, -50, -30, true);
					@Pc(135) Class2_Sub1_Sub2_Sub5[] local135 = new Class2_Sub1_Sub2_Sub5[] { local10, local67 };
					local10 = new Class2_Sub1_Sub2_Sub5(false, true, 2, local135);
				}
			}
			if (this.aClass2_Sub1_Sub2_Sub5_1 != null) {
				if (client.anInt967 >= this.anInt301) {
					this.aClass2_Sub1_Sub2_Sub5_1 = null;
				}
				if (client.anInt967 >= this.anInt300 && client.anInt967 < this.anInt301) {
					@Pc(164) Class2_Sub1_Sub2_Sub5 local164 = this.aClass2_Sub1_Sub2_Sub5_1;
					local164.method397(this.anInt290 - super.anInt285, this.anInt291 - this.anInt294, this.anInt292 - super.anInt286);
					if (super.anInt264 == 512) {
						local164.method395();
						local164.method395();
						local164.method395();
					} else if (super.anInt264 == 1024) {
						local164.method395();
						local164.method395();
					} else if (super.anInt264 == 1536) {
						local164.method395();
					}
					@Pc(227) Class2_Sub1_Sub2_Sub5[] local227 = new Class2_Sub1_Sub2_Sub5[] { local10, local164 };
					local10 = new Class2_Sub1_Sub2_Sub5(false, true, 2, local227);
					if (super.anInt264 == 512) {
						local164.method395();
					} else if (super.anInt264 == 1024) {
						local164.method395();
						local164.method395();
					} else if (super.anInt264 == 1536) {
						local164.method395();
						local164.method395();
						local164.method395();
					}
					local164.method397(super.anInt285 - this.anInt290, this.anInt294 - this.anInt291, super.anInt286 - this.anInt292);
				}
			}
			local10.aBoolean165 = true;
			return local10;
		} catch (@Pc(293) RuntimeException local293) {
			signlink.reporterror("66502, " + 5 + ", " + local293.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HHCKFJEO", name = "c", descriptor = "(B)Lclient!SNMMQNPZ;")
	private Class2_Sub1_Sub2_Sub5 method204() {
		try {
			if (this.aClass14_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt277 >= 0 && super.anInt280 == 0) {
					local6 = Class49.aClass49Array1[super.anInt277].anIntArray206[super.anInt278];
				} else if (super.anInt241 >= 0) {
					local6 = Class49.aClass49Array1[super.anInt241].anIntArray206[super.anInt242];
				}
				return this.aClass14_2.method187(this.aBoolean73, local6, null, -1);
			}
			@Pc(49) long local49 = this.aLong14;
			@Pc(62) int local62 = -1;
			@Pc(64) int local64 = -1;
			@Pc(66) int local66 = -1;
			@Pc(68) int local68 = -1;
			if (super.anInt277 >= 0 && super.anInt280 == 0) {
				@Pc(79) Class49 local79 = Class49.aClass49Array1[super.anInt277];
				local62 = local79.anIntArray206[super.anInt278];
				if (super.anInt241 >= 0 && super.anInt241 != super.anInt257) {
					local64 = Class49.aClass49Array1[super.anInt241].anIntArray206[super.anInt242];
				}
				if (local79.anInt770 >= 0) {
					local66 = local79.anInt770;
					local49 += local66 - this.anIntArray57[5] << 8;
				}
				if (local79.anInt771 >= 0) {
					local68 = local79.anInt771;
					local49 += local68 - this.anIntArray57[3] << 16;
				}
			} else if (super.anInt241 >= 0) {
				local62 = Class49.aClass49Array1[super.anInt241].anIntArray206[super.anInt242];
			}
			@Pc(157) Class2_Sub1_Sub2_Sub5 local157 = (Class2_Sub1_Sub2_Sub5) aClass37_2.method363(local49);
			@Pc(163) int local163;
			@Pc(170) int local170;
			if (local157 == null) {
				@Pc(161) boolean local161 = false;
				for (local163 = 0; local163 < 12; local163++) {
					local170 = this.anIntArray57[local163];
					if (local68 >= 0 && local163 == 3) {
						local170 = local68;
					}
					if (local66 >= 0 && local163 == 5) {
						local170 = local66;
					}
					if (local170 >= 256 && local170 < 512 && !Class6.aClass6Array1[local170 - 256].method66()) {
						local161 = true;
					}
					if (local170 >= 512 && !Class19.method221(local170 - 512).method224(this.anInt303, (byte) 6)) {
						local161 = true;
					}
				}
				if (local161) {
					if (this.aLong13 != -1L) {
						local157 = (Class2_Sub1_Sub2_Sub5) aClass37_2.method363(this.aLong13);
					}
					if (local157 == null) {
						return null;
					}
				}
			}
			if (local157 == null) {
				@Pc(240) Class2_Sub1_Sub2_Sub5[] local240 = new Class2_Sub1_Sub2_Sub5[12];
				local163 = 0;
				@Pc(251) int local251;
				for (local170 = 0; local170 < 12; local170++) {
					local251 = this.anIntArray57[local170];
					if (local68 >= 0 && local170 == 3) {
						local251 = local68;
					}
					if (local66 >= 0 && local170 == 5) {
						local251 = local66;
					}
					@Pc(279) Class2_Sub1_Sub2_Sub5 local279;
					if (local251 >= 256 && local251 < 512) {
						local279 = Class6.aClass6Array1[local251 - 256].method67(40);
						if (local279 != null) {
							local240[local163++] = local279;
						}
					}
					if (local251 >= 512) {
						local279 = Class19.method221(local251 - 512).method219(this.anInt303);
						if (local279 != null) {
							local240[local163++] = local279;
						}
					}
				}
				local157 = new Class2_Sub1_Sub2_Sub5(local163, false, local240);
				for (local251 = 0; local251 < 5; local251++) {
					if (this.anIntArray56[local251] != 0) {
						local157.method398(client.anIntArrayArray23[local251][0], client.anIntArrayArray23[local251][this.anIntArray56[local251]]);
						if (local251 == 1) {
							local157.method398(client.anIntArray263[0], client.anIntArray263[this.anIntArray56[local251]]);
						}
					}
				}
				local157.method391();
				local157.method401(64, 850, -30, -50, -30, true);
				aClass37_2.method364(local49, local157);
				this.aLong13 = local49;
			}
			if (this.aBoolean71) {
				return local157;
			}
			@Pc(384) Class2_Sub1_Sub2_Sub5 local384 = Class2_Sub1_Sub2_Sub5.aClass2_Sub1_Sub2_Sub5_2;
			local384.method386(local157, Class29.method296(local62) & Class29.method296(local64));
			if (local62 != -1 && local64 != -1) {
				local384.method393(local64, Class49.aClass49Array1[super.anInt277].anIntArray209, local62);
			} else if (local62 != -1) {
				local384.method392(local62);
			}
			local384.method388();
			local384.anIntArrayArray13 = null;
			local384.anIntArrayArray12 = null;
			return local384;
		} catch (@Pc(432) RuntimeException local432) {
			signlink.reporterror("45681, " + 74 + ", " + local432.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HHCKFJEO", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	public void method205(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			arg0.anInt166 = 0;
			this.anInt303 = arg0.method94();
			this.anInt293 = arg0.method95();
			this.anInt289 = arg0.method95();
			this.aClass14_2 = null;
			this.anInt288 = 0;
			@Pc(32) int local32;
			@Pc(44) int local44;
			@Pc(91) int local91;
			for (@Pc(27) int local27 = 0; local27 < 12; local27++) {
				local32 = arg0.method94();
				if (local32 == 0) {
					this.anIntArray57[local27] = 0;
				} else {
					local44 = arg0.method94();
					this.anIntArray57[local27] = (local32 << 8) + local44;
					if (local27 == 0 && this.anIntArray57[0] == 65535) {
						this.aClass14_2 = Class14.method192(arg0.method96());
						break;
					}
					if (this.anIntArray57[local27] >= 512 && this.anIntArray57[local27] - 512 < Class19.anInt355) {
						local91 = Class19.method221(this.anIntArray57[local27] - 512).anInt333;
						if (local91 != 0) {
							this.anInt288 = local91;
						}
					}
				}
			}
			for (local32 = 0; local32 < 5; local32++) {
				local44 = arg0.method94();
				if (local44 < 0 || local44 >= client.anIntArrayArray23[local32].length) {
					local44 = 0;
				}
				this.anIntArray56[local32] = local44;
			}
			super.anInt257 = arg0.method96();
			if (super.anInt257 == 65535) {
				super.anInt257 = -1;
			}
			super.anInt258 = arg0.method96();
			if (super.anInt258 == 65535) {
				super.anInt258 = -1;
			}
			super.anInt247 = arg0.method96();
			if (super.anInt247 == 65535) {
				super.anInt247 = -1;
			}
			super.anInt248 = arg0.method96();
			if (super.anInt248 == 65535) {
				super.anInt248 = -1;
			}
			super.anInt249 = arg0.method96();
			if (super.anInt249 == 65535) {
				super.anInt249 = -1;
			}
			super.anInt250 = arg0.method96();
			if (super.anInt250 == 65535) {
				super.anInt250 = -1;
			}
			super.anInt283 = arg0.method96();
			if (super.anInt283 == 65535) {
				super.anInt283 = -1;
			}
			this.aString6 = Class18.method210(Class18.method207(this.aBoolean72, arg0.method100()));
			this.anInt302 = arg0.method94();
			this.anInt295 = arg0.method96();
			this.aBoolean74 = true;
			this.aLong14 = 0L;
			for (local44 = 0; local44 < 12; local44++) {
				this.aLong14 <<= 0x4;
				if (this.anIntArray57[local44] >= 256) {
					this.aLong14 += this.anIntArray57[local44] - 256;
				}
			}
			if (this.anIntArray57[0] >= 256) {
				this.aLong14 += this.anIntArray57[0] - 256 >> 4;
			}
			if (this.anIntArray57[1] >= 256) {
				this.aLong14 += this.anIntArray57[1] - 256 >> 8;
			}
			for (local91 = 0; local91 < 5; local91++) {
				this.aLong14 <<= 0x3;
				this.aLong14 += this.anIntArray56[local91];
			}
			this.aLong14 <<= 0x1;
			this.aLong14 += this.anInt303;
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("64545, " + arg0 + ", " + 0 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}
}
