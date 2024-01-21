import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BPHJJPRI")
public final class Class1_Sub1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!BPHJJPRI", name = "zb", descriptor = "Lclient!UNPPHFRC;")
	public static Class41 aClass41_1 = new Class41(true, 260);

	@OriginalMember(owner = "client!BPHJJPRI", name = "sb", descriptor = "I")
	public int anInt176;

	@OriginalMember(owner = "client!BPHJJPRI", name = "tb", descriptor = "I")
	public int anInt177;

	@OriginalMember(owner = "client!BPHJJPRI", name = "ub", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!BPHJJPRI", name = "vb", descriptor = "Lclient!QYNFXHXW;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Cb", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Gb", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Hb", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Ib", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Jb", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Kb", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Mb", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Nb", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Ob", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Pb", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Qb", descriptor = "Lclient!OJGAHFXC;")
	public Class1_Sub1_Sub1_Sub5 aClass1_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Rb", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Sb", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Ub", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Wb", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Xb", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!BPHJJPRI", name = "wb", descriptor = "[I")
	public int[] anIntArray25 = new int[12];

	@OriginalMember(owner = "client!BPHJJPRI", name = "xb", descriptor = "I")
	private int anInt179 = 1;

	@OriginalMember(owner = "client!BPHJJPRI", name = "yb", descriptor = "I")
	public int anInt180 = -1;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Ab", descriptor = "I")
	private int anInt181 = 856;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Bb", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Db", descriptor = "J")
	private long aLong10 = -1L;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Eb", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Fb", descriptor = "I")
	private int anInt182 = 772;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Lb", descriptor = "I")
	public int anInt188 = -1;

	@OriginalMember(owner = "client!BPHJJPRI", name = "Tb", descriptor = "[I")
	public int[] anIntArray26 = new int[5];

	@OriginalMember(owner = "client!BPHJJPRI", name = "Vb", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!BPHJJPRI", name = "c", descriptor = "(I)Lclient!OJGAHFXC;")
	private Class1_Sub1_Sub1_Sub5 method82() {
		try {
			if (this.aClass31_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt451 >= 0 && super.anInt454 == 0) {
					local6 = Class7.aClass7Array1[super.anInt451].anIntArray27[super.anInt452];
				} else if (super.anInt463 >= 0) {
					local6 = Class7.aClass7Array1[super.anInt463].anIntArray27[super.anInt464];
				}
				return this.aClass31_1.method480(null, 653, local6, -1);
			}
			@Pc(48) long local48 = this.aLong9;
			@Pc(57) int local57 = -1;
			@Pc(59) int local59 = -1;
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			if (super.anInt451 >= 0 && super.anInt454 == 0) {
				@Pc(74) Class7 local74 = Class7.aClass7Array1[super.anInt451];
				local57 = local74.anIntArray27[super.anInt452];
				if (super.anInt463 >= 0 && super.anInt463 != super.anInt461) {
					local59 = Class7.aClass7Array1[super.anInt463].anIntArray27[super.anInt464];
				}
				if (local74.anInt240 >= 0) {
					local61 = local74.anInt240;
					local48 += local61 - this.anIntArray25[5] << 8;
				}
				if (local74.anInt241 >= 0) {
					local63 = local74.anInt241;
					local48 += local63 - this.anIntArray25[3] << 16;
				}
			} else if (super.anInt463 >= 0) {
				local57 = Class7.aClass7Array1[super.anInt463].anIntArray27[super.anInt464];
			}
			@Pc(152) Class1_Sub1_Sub1_Sub5 local152 = (Class1_Sub1_Sub1_Sub5) aClass41_1.method498(local48);
			@Pc(158) int local158;
			@Pc(165) int local165;
			if (local152 == null) {
				@Pc(156) boolean local156 = false;
				for (local158 = 0; local158 < 12; local158++) {
					local165 = this.anIntArray25[local158];
					if (local63 >= 0 && local158 == 3) {
						local165 = local63;
					}
					if (local61 >= 0 && local158 == 5) {
						local165 = local61;
					}
					if (local165 >= 256 && local165 < 512 && !Class49.aClass49Array1[local165 - 256].method560()) {
						local156 = true;
					}
					if (local165 >= 512 && !Class19.method315(local165 - 512).method317(this.anInt195)) {
						local156 = true;
					}
				}
				if (local156) {
					if (this.aLong10 != -1L) {
						local152 = (Class1_Sub1_Sub1_Sub5) aClass41_1.method498(this.aLong10);
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
					local246 = this.anIntArray25[local165];
					if (local63 >= 0 && local165 == 3) {
						local246 = local63;
					}
					if (local61 >= 0 && local165 == 5) {
						local246 = local61;
					}
					@Pc(274) Class1_Sub1_Sub1_Sub5 local274;
					if (local246 >= 256 && local246 < 512) {
						local274 = Class49.aClass49Array1[local246 - 256].method561();
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
					if (local246 >= 512) {
						local274 = Class19.method315(local246 - 512).method316(this.anInt195);
						if (local274 != null) {
							local235[local158++] = local274;
						}
					}
				}
				local152 = new Class1_Sub1_Sub1_Sub5(local158, (byte) 112, local235);
				for (local246 = 0; local246 < 5; local246++) {
					if (this.anIntArray26[local246] != 0) {
						local152.method393(client.anIntArrayArray22[local246][0], client.anIntArrayArray22[local246][this.anIntArray26[local246]]);
						if (local246 == 1) {
							local152.method393(client.anIntArray276[0], client.anIntArray276[this.anIntArray26[local246]]);
						}
					}
				}
				local152.method386(this.anInt187);
				local152.method396(64, 850, -30, -50, -30, true);
				aClass41_1.method499(local48, local152);
				this.aLong10 = local48;
			}
			if (this.aBoolean32) {
				return local152;
			}
			@Pc(380) Class1_Sub1_Sub1_Sub5 local380 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local380.method381(Class23.method343(local57, (byte) 1) & Class23.method343(local59, (byte) 1), local152);
			if (local57 != -1 && local59 != -1) {
				local380.method388(local57, Class7.aClass7Array1[super.anInt451].anIntArray30, local59);
			} else if (local57 != -1) {
				local380.method387(local57);
			}
			local380.method383();
			local380.anIntArrayArray11 = null;
			local380.anIntArrayArray10 = null;
			return local380;
		} catch (@Pc(428) RuntimeException local428) {
			signlink.reporterror("94722, " + -61 + ", " + local428.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHJJPRI", name = "a", descriptor = "(I)Lclient!OJGAHFXC;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method504(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean31) {
				return null;
			}
			@Pc(10) Class1_Sub1_Sub1_Sub5 local10 = this.method82();
			if (local10 == null) {
				return null;
			}
			super.anInt468 = local10.anInt716;
			local10.aBoolean116 = true;
			if (this.aBoolean32) {
				return local10;
			}
			if (super.anInt422 != -1 && super.anInt423 != -1) {
				@Pc(44) Class46 local44 = Class46.aClass46Array1[super.anInt422];
				@Pc(47) Class1_Sub1_Sub1_Sub5 local47 = local44.method554();
				if (local47 != null) {
					@Pc(61) Class1_Sub1_Sub1_Sub5 local61 = new Class1_Sub1_Sub1_Sub5(Class23.method343(super.anInt423, (byte) 1), false, true, -900, local47);
					local61.method392(-super.anInt426, 0, 0);
					local61.method386(this.anInt187);
					local61.method387(local44.aClass7_2.anIntArray27[super.anInt423]);
					local61.anIntArrayArray11 = null;
					local61.anIntArrayArray10 = null;
					if (local44.anInt818 != 128 || local44.anInt819 != 128) {
						local61.method395(local44.anInt818, this.anInt179, local44.anInt819, local44.anInt818);
					}
					local61.method396(local44.anInt821 + 64, local44.anInt822 + 850, -30, -50, -30, true);
					@Pc(131) Class1_Sub1_Sub1_Sub5[] local131 = new Class1_Sub1_Sub1_Sub5[] { local10, local61 };
					local10 = new Class1_Sub1_Sub1_Sub5(true, local131, 2, true);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub5_1 != null) {
				if (client.anInt1079 >= this.anInt177) {
					this.aClass1_Sub1_Sub1_Sub5_1 = null;
				}
				if (client.anInt1079 >= this.anInt176 && client.anInt1079 < this.anInt177) {
					@Pc(160) Class1_Sub1_Sub1_Sub5 local160 = this.aClass1_Sub1_Sub1_Sub5_1;
					local160.method392(this.anInt191 - this.anInt196, this.anInt192 - super.anInt429, this.anInt190 - super.anInt428);
					if (super.anInt446 == 512) {
						local160.method390();
						local160.method390();
						local160.method390();
					} else if (super.anInt446 == 1024) {
						local160.method390();
						local160.method390();
					} else if (super.anInt446 == 1536) {
						local160.method390();
					}
					@Pc(223) Class1_Sub1_Sub1_Sub5[] local223 = new Class1_Sub1_Sub1_Sub5[] { local10, local160 };
					local10 = new Class1_Sub1_Sub1_Sub5(true, local223, 2, true);
					if (super.anInt446 == 512) {
						local160.method390();
					} else if (super.anInt446 == 1024) {
						local160.method390();
						local160.method390();
					} else if (super.anInt446 == 1536) {
						local160.method390();
						local160.method390();
						local160.method390();
					}
					local160.method392(this.anInt196 - this.anInt191, super.anInt429 - this.anInt192, super.anInt428 - this.anInt190);
				}
			}
			local10.aBoolean116 = true;
			return local10;
		} catch (@Pc(289) RuntimeException local289) {
			signlink.reporterror("39679, " + 822 + ", " + local289.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHJJPRI", name = "a", descriptor = "(ILclient!EYMNCFMK;)V")
	public void method83(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			arg0.anInt301 = 0;
			this.anInt195 = arg0.method155();
			this.anInt180 = arg0.method156();
			this.anInt188 = arg0.method156();
			this.aClass31_1 = null;
			this.anInt193 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method155();
				if (local29 == 0) {
					this.anIntArray25[local24] = 0;
				} else {
					local41 = arg0.method155();
					this.anIntArray25[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray25[0] == 65535) {
						this.aClass31_1 = Class31.method479(arg0.method157());
						break;
					}
					if (this.anIntArray25[local24] >= 512 && this.anIntArray25[local24] - 512 < Class19.anInt497) {
						local88 = Class19.method315(this.anIntArray25[local24] - 512).anInt489;
						if (local88 != 0) {
							this.anInt193 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method155();
				if (local41 < 0 || local41 >= client.anIntArrayArray22[local29].length) {
					local41 = 0;
				}
				this.anIntArray26[local29] = local41;
			}
			super.anInt461 = arg0.method157();
			if (super.anInt461 == 65535) {
				super.anInt461 = -1;
			}
			super.anInt462 = arg0.method157();
			if (super.anInt462 == 65535) {
				super.anInt462 = -1;
			}
			super.anInt432 = arg0.method157();
			if (super.anInt432 == 65535) {
				super.anInt432 = -1;
			}
			super.anInt433 = arg0.method157();
			if (super.anInt433 == 65535) {
				super.anInt433 = -1;
			}
			super.anInt434 = arg0.method157();
			if (super.anInt434 == 65535) {
				super.anInt434 = -1;
			}
			super.anInt435 = arg0.method157();
			if (super.anInt435 == 65535) {
				super.anInt435 = -1;
			}
			super.anInt456 = arg0.method157();
			if (super.anInt456 == 65535) {
				super.anInt456 = -1;
			}
			this.aString3 = Class20.method323(this.aBoolean30, Class20.method320(arg0.method161(this.anInt181)));
			this.anInt189 = arg0.method155();
			this.anInt178 = arg0.method157();
			this.aBoolean31 = true;
			this.aLong9 = 0L;
			local41 = this.anIntArray25[5];
			local88 = this.anIntArray25[9];
			this.anIntArray25[5] = local88;
			this.anIntArray25[9] = local41;
			for (@Pc(250) int local250 = 0; local250 < 12; local250++) {
				this.aLong9 <<= 0x4;
				if (this.anIntArray25[local250] >= 256) {
					this.aLong9 += this.anIntArray25[local250] - 256;
				}
			}
			if (this.anIntArray25[0] >= 256) {
				this.aLong9 += this.anIntArray25[0] - 256 >> 4;
			}
			if (this.anIntArray25[1] >= 256) {
				this.aLong9 += this.anIntArray25[1] - 256 >> 8;
			}
			this.anIntArray25[5] = local41;
			this.anIntArray25[9] = local88;
			for (@Pc(332) int local332 = 0; local332 < 5; local332++) {
				this.aLong9 <<= 0x3;
				this.aLong9 += this.anIntArray26[local332];
			}
			this.aLong9 <<= 0x1;
			this.aLong9 += this.anInt195;
		} catch (@Pc(370) RuntimeException local370) {
			signlink.reporterror("67563, " + -925 + ", " + arg0 + ", " + local370.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHJJPRI", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method302(@OriginalArg(0) int arg0) {
		try {
			return this.aBoolean31;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("84979, " + 772 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BPHJJPRI", name = "d", descriptor = "(I)Lclient!OJGAHFXC;")
	public Class1_Sub1_Sub1_Sub5 method84() {
		try {
			if (!this.aBoolean31) {
				return null;
			} else if (this.aClass31_1 == null) {
				@Pc(22) boolean local22 = false;
				for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
					@Pc(31) int local31 = this.anIntArray25[local24];
					if (local31 >= 256 && local31 < 512 && !Class49.aClass49Array1[local31 - 256].method562()) {
						local22 = true;
					}
					if (local31 >= 512 && !Class19.method315(local31 - 512).method314(this.anInt195)) {
						local22 = true;
					}
				}
				if (local22) {
					return null;
				}
				@Pc(72) Class1_Sub1_Sub1_Sub5[] local72 = new Class1_Sub1_Sub1_Sub5[12];
				@Pc(74) int local74 = 0;
				for (@Pc(76) int local76 = 0; local76 < 12; local76++) {
					@Pc(83) int local83 = this.anIntArray25[local76];
					@Pc(97) Class1_Sub1_Sub1_Sub5 local97;
					if (local83 >= 256 && local83 < 512) {
						local97 = Class49.aClass49Array1[local83 - 256].method563();
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
					if (local83 >= 512) {
						local97 = Class19.method315(local83 - 512).method310(this.anInt195);
						if (local97 != null) {
							local72[local74++] = local97;
						}
					}
				}
				@Pc(134) Class1_Sub1_Sub1_Sub5 local134 = new Class1_Sub1_Sub1_Sub5(local74, (byte) 112, local72);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray26[local136] != 0) {
						local134.method393(client.anIntArrayArray22[local136][0], client.anIntArrayArray22[local136][this.anIntArray26[local136]]);
						if (local136 == 1) {
							local134.method393(client.anIntArray276[0], client.anIntArray276[this.anIntArray26[local136]]);
						}
					}
				}
				return local134;
			} else {
				return this.aClass31_1.method481();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("21722, " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}
}
