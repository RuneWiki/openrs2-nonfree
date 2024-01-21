import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QVUHZTUC")
public final class Class1_Sub1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!QVUHZTUC", name = "xb", descriptor = "Lclient!JETHVCIV;")
	public static Class15 aClass15_8 = new Class15(false, 260);

	@OriginalMember(owner = "client!QVUHZTUC", name = "sb", descriptor = "I")
	private int anInt601;

	@OriginalMember(owner = "client!QVUHZTUC", name = "ub", descriptor = "I")
	private int anInt602;

	@OriginalMember(owner = "client!QVUHZTUC", name = "wb", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!QVUHZTUC", name = "yb", descriptor = "I")
	public int anInt603;

	@OriginalMember(owner = "client!QVUHZTUC", name = "zb", descriptor = "I")
	public int anInt604;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Ab", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Bb", descriptor = "Lclient!JLNSJQDR;")
	public Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Cb", descriptor = "I")
	public int anInt606;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Db", descriptor = "I")
	public int anInt607;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Eb", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Fb", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Lb", descriptor = "Lclient!RRZTMHXJ;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Mb", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Ob", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Pb", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Qb", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Rb", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Sb", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Vb", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Wb", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!QVUHZTUC", name = "tb", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!QVUHZTUC", name = "vb", descriptor = "[I")
	public int[] anIntArray157 = new int[12];

	@OriginalMember(owner = "client!QVUHZTUC", name = "Gb", descriptor = "Z")
	public boolean aBoolean144 = false;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Hb", descriptor = "[I")
	public int[] anIntArray158 = new int[5];

	@OriginalMember(owner = "client!QVUHZTUC", name = "Ib", descriptor = "B")
	private byte aByte24 = 8;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Jb", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Kb", descriptor = "I")
	private int anInt610 = -619;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Nb", descriptor = "I")
	private int anInt612 = 5;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Tb", descriptor = "J")
	private long aLong17 = -1L;

	@OriginalMember(owner = "client!QVUHZTUC", name = "Ub", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!QVUHZTUC", name = "a", descriptor = "(B)Lclient!JLNSJQDR;")
	private Class1_Sub1_Sub1_Sub4 method394(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 8) {
				@Pc(6) boolean local6 = false;
			} else {
				this.anInt612 = 133;
			}
			if (this.aClass38_2 != null) {
				@Pc(16) int local16 = -1;
				if (super.anInt590 >= 0 && super.anInt593 == 0) {
					local16 = Class29.aClass29Array1[super.anInt590].anIntArray140[super.anInt591];
				} else if (super.anInt583 >= 0) {
					local16 = Class29.aClass29Array1[super.anInt583].anIntArray140[super.anInt584];
				}
				return this.aClass38_2.method414(null, local16, -1);
			}
			@Pc(58) long local58 = this.aLong16;
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			@Pc(64) int local64 = -1;
			@Pc(66) int local66 = -1;
			if (super.anInt590 >= 0 && super.anInt593 == 0) {
				@Pc(77) Class29 local77 = Class29.aClass29Array1[super.anInt590];
				local60 = local77.anIntArray140[super.anInt591];
				if (super.anInt583 >= 0 && super.anInt583 != super.anInt598) {
					local62 = Class29.aClass29Array1[super.anInt583].anIntArray140[super.anInt584];
				}
				if (local77.anInt505 >= 0) {
					local64 = local77.anInt505;
					local58 += local64 - this.anIntArray157[5] << 8;
				}
				if (local77.anInt506 >= 0) {
					local66 = local77.anInt506;
					local58 += local66 - this.anIntArray157[3] << 16;
				}
			} else if (super.anInt583 >= 0) {
				local60 = Class29.aClass29Array1[super.anInt583].anIntArray140[super.anInt584];
			}
			@Pc(155) Class1_Sub1_Sub1_Sub4 local155 = (Class1_Sub1_Sub1_Sub4) aClass15_8.method222(local58);
			@Pc(161) int local161;
			@Pc(168) int local168;
			if (local155 == null) {
				@Pc(159) boolean local159 = false;
				for (local161 = 0; local161 < 12; local161++) {
					local168 = this.anIntArray157[local161];
					if (local66 >= 0 && local161 == 3) {
						local168 = local66;
					}
					if (local64 >= 0 && local161 == 5) {
						local168 = local64;
					}
					if (local168 >= 256 && local168 < 512 && !Class37.aClass37Array1[local168 - 256].method407()) {
						local159 = true;
					}
					if (local168 >= 512 && !Class23.method320(local168 - 512).method322((byte) 2, this.anInt602)) {
						local159 = true;
					}
				}
				if (local159) {
					if (this.aLong17 != -1L) {
						local155 = (Class1_Sub1_Sub1_Sub4) aClass15_8.method222(this.aLong17);
					}
					if (local155 == null) {
						return null;
					}
				}
			}
			if (local155 == null) {
				@Pc(238) Class1_Sub1_Sub1_Sub4[] local238 = new Class1_Sub1_Sub1_Sub4[12];
				local161 = 0;
				@Pc(249) int local249;
				for (local168 = 0; local168 < 12; local168++) {
					local249 = this.anIntArray157[local168];
					if (local66 >= 0 && local168 == 3) {
						local249 = local66;
					}
					if (local64 >= 0 && local168 == 5) {
						local249 = local64;
					}
					@Pc(277) Class1_Sub1_Sub1_Sub4 local277;
					if (local249 >= 256 && local249 < 512) {
						local277 = Class37.aClass37Array1[local249 - 256].method408();
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
					if (local249 >= 512) {
						local277 = Class23.method320(local249 - 512).method323(this.anInt602);
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
				}
				local155 = new Class1_Sub1_Sub1_Sub4(9, local161, local238);
				for (local249 = 0; local249 < 5; local249++) {
					if (this.anIntArray158[local249] != 0) {
						local155.method253(client.anIntArrayArray22[local249][0], client.anIntArrayArray22[local249][this.anIntArray158[local249]]);
						if (local249 == 1) {
							local155.method253(client.anIntArray265[0], client.anIntArray265[this.anIntArray158[local249]]);
						}
					}
				}
				local155.method246();
				local155.method256(64, 850, -30, -50, -30, true);
				aClass15_8.method223(local155, local58);
				this.aLong17 = local58;
			}
			if (this.aBoolean145) {
				return local155;
			}
			@Pc(382) Class1_Sub1_Sub1_Sub4 local382 = Class1_Sub1_Sub1_Sub4.aClass1_Sub1_Sub1_Sub4_1;
			local382.method241(local155, Class42.method479(local60) & Class42.method479(local62));
			if (local60 != -1 && local62 != -1) {
				local382.method248(Class29.aClass29Array1[super.anInt590].anIntArray143, 666, local60, local62);
			} else if (local60 != -1) {
				local382.method247(local60);
			}
			local382.method243();
			local382.anIntArrayArray11 = null;
			local382.anIntArrayArray10 = null;
			return local382;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("44066, " + arg0 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QVUHZTUC", name = "a", descriptor = "(I)Lclient!JLNSJQDR;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method509(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean144) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub4 local11 = this.method394(this.aByte24);
			if (arg0 < this.anInt612 || arg0 > this.anInt612) {
				this.anInt612 = -454;
			}
			if (local11 == null) {
				return null;
			}
			super.anInt572 = local11.anInt766;
			local11.aBoolean87 = true;
			if (this.aBoolean145) {
				return local11;
			}
			if (super.anInt564 != -1 && super.anInt565 != -1) {
				@Pc(51) Class25 local51 = Class25.aClass25Array1[super.anInt564];
				@Pc(54) Class1_Sub1_Sub1_Sub4 local54 = local51.method334();
				if (local54 != null) {
					@Pc(68) Class1_Sub1_Sub1_Sub4 local68 = new Class1_Sub1_Sub1_Sub4(Class42.method479(super.anInt565), false, true, true, local54);
					local68.method252(-super.anInt568, 0, 0);
					local68.method246();
					local68.method247(local51.aClass29_1.anIntArray140[super.anInt565]);
					local68.anIntArrayArray11 = null;
					local68.anIntArrayArray10 = null;
					if (local51.anInt475 != 128 || local51.anInt476 != 128) {
						local68.method255(local51.anInt475, local51.anInt476, local51.anInt475);
					}
					local68.method256(local51.anInt478 + 64, local51.anInt479 + 850, -30, -50, -30, true);
					@Pc(136) Class1_Sub1_Sub1_Sub4[] local136 = new Class1_Sub1_Sub1_Sub4[] { local11, local68 };
					local11 = new Class1_Sub1_Sub1_Sub4(true, local136, 2, false);
				}
			}
			if (this.aClass1_Sub1_Sub1_Sub4_2 != null) {
				if (client.anInt921 >= this.anInt615) {
					this.aClass1_Sub1_Sub1_Sub4_2 = null;
				}
				if (client.anInt921 >= this.anInt614 && client.anInt921 < this.anInt615) {
					@Pc(165) Class1_Sub1_Sub1_Sub4 local165 = this.aClass1_Sub1_Sub1_Sub4_2;
					local165.method252(this.anInt604 - this.anInt616, this.anInt605 - super.anInt574, this.anInt603 - super.anInt573);
					if (super.anInt562 == 512) {
						local165.method250();
						local165.method250();
						local165.method250();
					} else if (super.anInt562 == 1024) {
						local165.method250();
						local165.method250();
					} else if (super.anInt562 == 1536) {
						local165.method250();
					}
					@Pc(228) Class1_Sub1_Sub1_Sub4[] local228 = new Class1_Sub1_Sub1_Sub4[] { local11, local165 };
					local11 = new Class1_Sub1_Sub1_Sub4(true, local228, 2, false);
					if (super.anInt562 == 512) {
						local165.method250();
					} else if (super.anInt562 == 1024) {
						local165.method250();
						local165.method250();
					} else if (super.anInt562 == 1536) {
						local165.method250();
						local165.method250();
						local165.method250();
					}
					local165.method252(this.anInt616 - this.anInt604, super.anInt574 - this.anInt605, super.anInt573 - this.anInt603);
				}
			}
			local11.aBoolean87 = true;
			return local11;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("7753, " + arg0 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QVUHZTUC", name = "b", descriptor = "(I)Lclient!JLNSJQDR;")
	public Class1_Sub1_Sub1_Sub4 method395(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean144) {
				return null;
			} else if (this.aClass38_2 == null) {
				@Pc(17) boolean local17 = false;
				for (@Pc(19) int local19 = 0; local19 < 12; local19++) {
					@Pc(26) int local26 = this.anIntArray157[local19];
					if (local26 >= 256 && local26 < 512 && !Class37.aClass37Array1[local26 - 256].method409()) {
						local17 = true;
					}
					if (local26 >= 512 && !Class23.method320(local26 - 512).method325(this.anInt602)) {
						local17 = true;
					}
				}
				while (arg0 >= 0) {
					this.anInt612 = -43;
				}
				if (local17) {
					return null;
				}
				@Pc(74) Class1_Sub1_Sub1_Sub4[] local74 = new Class1_Sub1_Sub1_Sub4[12];
				@Pc(76) int local76 = 0;
				for (@Pc(78) int local78 = 0; local78 < 12; local78++) {
					@Pc(85) int local85 = this.anIntArray157[local78];
					@Pc(99) Class1_Sub1_Sub1_Sub4 local99;
					if (local85 >= 256 && local85 < 512) {
						local99 = Class37.aClass37Array1[local85 - 256].method410();
						if (local99 != null) {
							local74[local76++] = local99;
						}
					}
					if (local85 >= 512) {
						local99 = Class23.method320(local85 - 512).method321(this.anInt602);
						if (local99 != null) {
							local74[local76++] = local99;
						}
					}
				}
				@Pc(136) Class1_Sub1_Sub1_Sub4 local136 = new Class1_Sub1_Sub1_Sub4(9, local76, local74);
				for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
					if (this.anIntArray158[local138] != 0) {
						local136.method253(client.anIntArrayArray22[local138][0], client.anIntArrayArray22[local138][this.anIntArray158[local138]]);
						if (local138 == 1) {
							local136.method253(client.anIntArray265[0], client.anIntArray265[this.anIntArray158[local138]]);
						}
					}
				}
				return local136;
			} else {
				return this.aClass38_2.method415(this.anInt601);
			}
		} catch (@Pc(181) RuntimeException local181) {
			signlink.reporterror("39341, " + arg0 + ", " + local181.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QVUHZTUC", name = "a", descriptor = "(BLclient!BJPWOXRJ;)V")
	public void method396(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			arg0.anInt10 = 0;
			this.anInt602 = arg0.method22();
			this.anInt618 = arg0.method22();
			this.aClass38_2 = null;
			this.anInt611 = 0;
			@Pc(36) int local36;
			@Pc(48) int local48;
			@Pc(95) int local95;
			for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
				local36 = arg0.method22();
				if (local36 == 0) {
					this.anIntArray157[local31] = 0;
				} else {
					local48 = arg0.method22();
					this.anIntArray157[local31] = (local36 << 8) + local48;
					if (local31 == 0 && this.anIntArray157[0] == 65535) {
						this.aClass38_2 = Class38.method417(arg0.method24());
						break;
					}
					if (this.anIntArray157[local31] >= 512 && this.anIntArray157[local31] - 512 < Class23.anInt445) {
						local95 = Class23.method320(this.anIntArray157[local31] - 512).anInt450;
						if (local95 != 0) {
							this.anInt611 = local95;
						}
					}
				}
			}
			for (local36 = 0; local36 < 5; local36++) {
				local48 = arg0.method22();
				if (local48 < 0 || local48 >= client.anIntArrayArray22[local36].length) {
					local48 = 0;
				}
				this.anIntArray158[local36] = local48;
			}
			super.anInt598 = arg0.method24();
			if (super.anInt598 == 65535) {
				super.anInt598 = -1;
			}
			super.anInt599 = arg0.method24();
			if (super.anInt599 == 65535) {
				super.anInt599 = -1;
			}
			super.anInt586 = arg0.method24();
			if (super.anInt586 == 65535) {
				super.anInt586 = -1;
			}
			super.anInt587 = arg0.method24();
			if (super.anInt587 == 65535) {
				super.anInt587 = -1;
			}
			super.anInt588 = arg0.method24();
			if (super.anInt588 == 65535) {
				super.anInt588 = -1;
			}
			super.anInt589 = arg0.method24();
			if (super.anInt589 == 65535) {
				super.anInt589 = -1;
			}
			super.anInt569 = arg0.method24();
			if (super.anInt569 == 65535) {
				super.anInt569 = -1;
			}
			this.aString15 = Class31.method383(Class31.method380(arg0.method28()));
			this.anInt613 = arg0.method22();
			this.anInt617 = arg0.method24();
			this.aBoolean144 = true;
			this.aLong16 = 0L;
			for (local48 = 0; local48 < 12; local48++) {
				this.aLong16 <<= 0x4;
				if (this.anIntArray157[local48] >= 256) {
					this.aLong16 += this.anIntArray157[local48] - 256;
				}
			}
			if (this.anIntArray157[0] >= 256) {
				this.aLong16 += this.anIntArray157[0] - 256 >> 4;
			}
			if (this.anIntArray157[1] >= 256) {
				this.aLong16 += this.anIntArray157[1] - 256 >> 8;
			}
			for (local95 = 0; local95 < 5; local95++) {
				this.aLong16 <<= 0x3;
				this.aLong16 += this.anIntArray158[local95];
			}
			this.aLong16 <<= 0x1;
			this.aLong16 += this.anInt602;
		} catch (@Pc(342) RuntimeException local342) {
			signlink.reporterror("79301, " + 3 + ", " + arg0 + ", " + local342.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QVUHZTUC", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method389() {
		try {
			return this.aBoolean144;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("61327, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
