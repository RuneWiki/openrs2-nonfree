import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UFGXOLGK")
public final class Class6_Sub2_Sub1_Sub3_Sub2 extends Class6_Sub2_Sub1_Sub3 {

	@OriginalMember(owner = "client!UFGXOLGK", name = "pb", descriptor = "Lclient!EOJHVRZF;")
	public static Class10 aClass10_9 = new Class10(10369, 260);

	@OriginalMember(owner = "client!UFGXOLGK", name = "qb", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!UFGXOLGK", name = "sb", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!UFGXOLGK", name = "ub", descriptor = "I")
	public int anInt665;

	@OriginalMember(owner = "client!UFGXOLGK", name = "xb", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Ab", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Bb", descriptor = "Lclient!JKAPIYZO;")
	public Class16 aClass16_2;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Cb", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Db", descriptor = "I")
	public int anInt671;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Eb", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Fb", descriptor = "Lclient!WEVRTBOZ;")
	public Class6_Sub2_Sub1_Sub6 aClass6_Sub2_Sub1_Sub6_1;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Hb", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Ib", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Jb", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Kb", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Lb", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Mb", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Nb", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Ob", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!UFGXOLGK", name = "rb", descriptor = "[I")
	public int[] anIntArray148 = new int[12];

	@OriginalMember(owner = "client!UFGXOLGK", name = "tb", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!UFGXOLGK", name = "vb", descriptor = "I")
	public int anInt666 = -1;

	@OriginalMember(owner = "client!UFGXOLGK", name = "wb", descriptor = "[I")
	public int[] anIntArray149 = new int[5];

	@OriginalMember(owner = "client!UFGXOLGK", name = "yb", descriptor = "I")
	public int anInt668 = -1;

	@OriginalMember(owner = "client!UFGXOLGK", name = "zb", descriptor = "J")
	private long aLong22 = -1L;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Gb", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!UFGXOLGK", name = "Pb", descriptor = "I")
	private int anInt679 = 33820;

	@OriginalMember(owner = "client!UFGXOLGK", name = "a", descriptor = "(I)Lclient!WEVRTBOZ;")
	public Class6_Sub2_Sub1_Sub6 method451() {
		try {
			if (!this.aBoolean174) {
				return null;
			} else if (this.aClass16_2 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray148[local18];
					if (local25 >= 256 && local25 < 512 && !Class23.aClass23Array1[local25 - 256].method295()) {
						local16 = true;
					}
					if (local25 >= 512 && !Class19.method281(local25 - 512).method274(this.anInt663)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(66) Class6_Sub2_Sub1_Sub6[] local66 = new Class6_Sub2_Sub1_Sub6[12];
				@Pc(68) int local68 = 0;
				for (@Pc(70) int local70 = 0; local70 < 12; local70++) {
					@Pc(77) int local77 = this.anIntArray148[local70];
					@Pc(91) Class6_Sub2_Sub1_Sub6 local91;
					if (local77 >= 256 && local77 < 512) {
						local91 = Class23.aClass23Array1[local77 - 256].method296();
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
					if (local77 >= 512) {
						local91 = Class19.method281(local77 - 512).method280(this.anInt663);
						if (local91 != null) {
							local66[local68++] = local91;
						}
					}
				}
				@Pc(128) Class6_Sub2_Sub1_Sub6 local128 = new Class6_Sub2_Sub1_Sub6(true, local68, local66);
				for (@Pc(136) int local136 = 0; local136 < 5; local136++) {
					if (this.anIntArray149[local136] != 0) {
						local128.method501(client.anIntArrayArray22[local136][0], client.anIntArrayArray22[local136][this.anIntArray149[local136]]);
						if (local136 == 1) {
							local128.method501(client.anIntArray214[0], client.anIntArray214[this.anIntArray149[local136]]);
						}
					}
				}
				return local128;
			} else {
				return this.aClass16_2.method204();
			}
		} catch (@Pc(179) RuntimeException local179) {
			signlink.reporterror("31073, " + 0 + ", " + local179.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFGXOLGK", name = "a", descriptor = "(Z)Lclient!WEVRTBOZ;")
	@Override
	protected Class6_Sub2_Sub1_Sub6 method482() {
		try {
			if (!this.aBoolean174) {
				return null;
			}
			@Pc(10) Class6_Sub2_Sub1_Sub6 local10 = this.method453((byte) 6);
			if (local10 == null) {
				return null;
			}
			super.anInt661 = local10.anInt714;
			local10.aBoolean192 = true;
			if (this.aBoolean175) {
				return local10;
			}
			if (super.anInt630 != -1 && super.anInt631 != -1) {
				@Pc(45) Class29 local45 = Class29.aClass29Array1[super.anInt630];
				@Pc(48) Class6_Sub2_Sub1_Sub6 local48 = local45.method361();
				if (local48 != null) {
					@Pc(62) Class6_Sub2_Sub1_Sub6 local62 = new Class6_Sub2_Sub1_Sub6(107, local48, Class12.method88(super.anInt631), false, true);
					local62.method500(-super.anInt634, 0, 0);
					local62.method494((byte) 2);
					local62.method495(local45.aClass33_2.anIntArray129[super.anInt631], 803);
					local62.anIntArrayArray19 = null;
					local62.anIntArrayArray18 = null;
					if (local45.anInt545 != 128 || local45.anInt546 != 128) {
						local62.method503(local45.anInt545, local45.anInt545, local45.anInt546);
					}
					local62.method504(local45.anInt548 + 64, local45.anInt549 + 850, -30, -50, -30, true);
					@Pc(130) Class6_Sub2_Sub1_Sub6[] local130 = new Class6_Sub2_Sub1_Sub6[] { local10, local62 };
					local10 = new Class6_Sub2_Sub1_Sub6(local130, true, true, 2);
				}
			}
			if (this.aClass6_Sub2_Sub1_Sub6_1 != null) {
				if (client.anInt928 >= this.anInt674) {
					this.aClass6_Sub2_Sub1_Sub6_1 = null;
				}
				if (client.anInt928 >= this.anInt673 && client.anInt928 < this.anInt674) {
					@Pc(159) Class6_Sub2_Sub1_Sub6 local159 = this.aClass6_Sub2_Sub1_Sub6_1;
					local159.method500(this.anInt671 - this.anInt664, this.anInt672 - super.anInt652, this.anInt670 - super.anInt651);
					if (super.anInt662 == 512) {
						local159.method498(644);
						local159.method498(644);
						local159.method498(644);
					} else if (super.anInt662 == 1024) {
						local159.method498(644);
						local159.method498(644);
					} else if (super.anInt662 == 1536) {
						local159.method498(644);
					}
					@Pc(222) Class6_Sub2_Sub1_Sub6[] local222 = new Class6_Sub2_Sub1_Sub6[] { local10, local159 };
					local10 = new Class6_Sub2_Sub1_Sub6(local222, true, true, 2);
					if (super.anInt662 == 512) {
						local159.method498(644);
					} else if (super.anInt662 == 1024) {
						local159.method498(644);
						local159.method498(644);
					} else if (super.anInt662 == 1536) {
						local159.method498(644);
						local159.method498(644);
						local159.method498(644);
					}
					local159.method500(this.anInt664 - this.anInt671, super.anInt652 - this.anInt672, super.anInt651 - this.anInt670);
				}
			}
			local10.aBoolean192 = true;
			return local10;
		} catch (@Pc(288) RuntimeException local288) {
			signlink.reporterror("54528, " + true + ", " + local288.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFGXOLGK", name = "a", descriptor = "(BLclient!UAWAYCTK;)V")
	public void method452(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			arg1.anInt609 = 0;
			this.anInt663 = arg1.method402();
			this.anInt666 = arg1.method403();
			this.anInt668 = arg1.method403();
			this.aClass16_2 = null;
			this.anInt665 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg1.method402();
				if (local29 == 0) {
					this.anIntArray148[local24] = 0;
				} else {
					local41 = arg1.method402();
					this.anIntArray148[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray148[0] == 65535) {
						this.aClass16_2 = Class16.method207(arg1.method404());
						break;
					}
					if (this.anIntArray148[local24] >= 512 && this.anIntArray148[local24] - 512 < Class19.anInt435) {
						local88 = Class19.method281(this.anIntArray148[local24] - 512).anInt439;
						if (local88 != 0) {
							this.anInt665 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg1.method402();
				if (local41 < 0 || local41 >= client.anIntArrayArray22[local29].length) {
					local41 = 0;
				}
				this.anIntArray149[local29] = local41;
			}
			super.anInt640 = arg1.method404();
			if (super.anInt640 == 65535) {
				super.anInt640 = -1;
			}
			super.anInt641 = arg1.method404();
			if (super.anInt641 == 65535) {
				super.anInt641 = -1;
			}
			super.anInt643 = arg1.method404();
			if (super.anInt643 == 65535) {
				super.anInt643 = -1;
			}
			super.anInt644 = arg1.method404();
			if (super.anInt644 == 65535) {
				super.anInt644 = -1;
			}
			super.anInt645 = arg1.method404();
			if (super.anInt645 == 65535) {
				super.anInt645 = -1;
			}
			super.anInt646 = arg1.method404();
			if (arg0 != 2) {
				for (local41 = 1; local41 > 0; local41++) {
				}
			}
			if (super.anInt646 == 65535) {
				super.anInt646 = -1;
			}
			super.anInt647 = arg1.method404();
			if (super.anInt647 == 65535) {
				super.anInt647 = -1;
			}
			this.aString15 = Class42.method468(Class42.method465(this.anInt679, arg1.method408()));
			this.anInt669 = arg1.method402();
			this.anInt667 = arg1.method404();
			this.aBoolean174 = true;
			this.aLong23 = 0L;
			for (local41 = 0; local41 < 12; local41++) {
				this.aLong23 <<= 0x4;
				if (this.anIntArray148[local41] >= 256) {
					this.aLong23 += this.anIntArray148[local41] - 256;
				}
			}
			if (this.anIntArray148[0] >= 256) {
				this.aLong23 += this.anIntArray148[0] - 256 >> 4;
			}
			if (this.anIntArray148[1] >= 256) {
				this.aLong23 += this.anIntArray148[1] - 256 >> 8;
			}
			for (local88 = 0; local88 < 5; local88++) {
				this.aLong23 <<= 0x3;
				this.aLong23 += this.anIntArray149[local88];
			}
			this.aLong23 <<= 0x1;
			this.aLong23 += this.anInt663;
		} catch (@Pc(346) RuntimeException local346) {
			signlink.reporterror("43060, " + arg0 + ", " + arg1 + ", " + local346.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFGXOLGK", name = "b", descriptor = "(B)Lclient!WEVRTBOZ;")
	private Class6_Sub2_Sub1_Sub6 method453(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass16_2 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt616 >= 0 && super.anInt619 == 0) {
					local6 = Class33.aClass33Array1[super.anInt616].anIntArray129[super.anInt617];
				} else if (super.anInt654 >= 0) {
					local6 = Class33.aClass33Array1[super.anInt654].anIntArray129[super.anInt655];
				}
				return this.aClass16_2.method201(local6, null, -1);
			}
			@Pc(48) long local48 = this.aLong23;
			@Pc(53) boolean local53 = false;
			@Pc(60) int local60 = -1;
			@Pc(62) int local62 = -1;
			@Pc(64) int local64 = -1;
			@Pc(66) int local66 = -1;
			if (super.anInt616 >= 0 && super.anInt619 == 0) {
				@Pc(77) Class33 local77 = Class33.aClass33Array1[super.anInt616];
				local60 = local77.anIntArray129[super.anInt617];
				if (super.anInt654 >= 0 && super.anInt654 != super.anInt640) {
					local62 = Class33.aClass33Array1[super.anInt654].anIntArray129[super.anInt655];
				}
				if (local77.anInt561 >= 0) {
					local64 = local77.anInt561;
					local48 += local64 - this.anIntArray148[5] << 8;
				}
				if (local77.anInt562 >= 0) {
					local66 = local77.anInt562;
					local48 += local66 - this.anIntArray148[3] << 16;
				}
			} else if (super.anInt654 >= 0) {
				local60 = Class33.aClass33Array1[super.anInt654].anIntArray129[super.anInt655];
			}
			@Pc(155) Class6_Sub2_Sub1_Sub6 local155 = (Class6_Sub2_Sub1_Sub6) aClass10_9.method75(local48);
			@Pc(161) int local161;
			@Pc(168) int local168;
			if (local155 == null) {
				@Pc(159) boolean local159 = false;
				for (local161 = 0; local161 < 12; local161++) {
					local168 = this.anIntArray148[local161];
					if (local66 >= 0 && local161 == 3) {
						local168 = local66;
					}
					if (local64 >= 0 && local161 == 5) {
						local168 = local64;
					}
					if (local168 >= 256 && local168 < 512 && !Class23.aClass23Array1[local168 - 256].method293()) {
						local159 = true;
					}
					if (local168 >= 512 && !Class19.method281(local168 - 512).method277(this.anInt663)) {
						local159 = true;
					}
				}
				if (local159) {
					if (this.aLong22 != -1L) {
						local155 = (Class6_Sub2_Sub1_Sub6) aClass10_9.method75(this.aLong22);
					}
					if (local155 == null) {
						return null;
					}
				}
			}
			if (local155 == null) {
				@Pc(238) Class6_Sub2_Sub1_Sub6[] local238 = new Class6_Sub2_Sub1_Sub6[12];
				local161 = 0;
				@Pc(249) int local249;
				for (local168 = 0; local168 < 12; local168++) {
					local249 = this.anIntArray148[local168];
					if (local66 >= 0 && local168 == 3) {
						local249 = local66;
					}
					if (local64 >= 0 && local168 == 5) {
						local249 = local64;
					}
					@Pc(277) Class6_Sub2_Sub1_Sub6 local277;
					if (local249 >= 256 && local249 < 512) {
						local277 = Class23.aClass23Array1[local249 - 256].method294((byte) 4);
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
					if (local249 >= 512) {
						local277 = Class19.method281(local249 - 512).method270(this.anInt663);
						if (local277 != null) {
							local238[local161++] = local277;
						}
					}
				}
				local155 = new Class6_Sub2_Sub1_Sub6(true, local161, local238);
				for (local249 = 0; local249 < 5; local249++) {
					if (this.anIntArray149[local249] != 0) {
						local155.method501(client.anIntArrayArray22[local249][0], client.anIntArrayArray22[local249][this.anIntArray149[local249]]);
						if (local249 == 1) {
							local155.method501(client.anIntArray214[0], client.anIntArray214[this.anIntArray149[local249]]);
						}
					}
				}
				local155.method494((byte) 2);
				local155.method504(64, 850, -30, -50, -30, true);
				aClass10_9.method76(local48, local155);
				this.aLong22 = local48;
			}
			if (this.aBoolean175) {
				return local155;
			}
			@Pc(382) Class6_Sub2_Sub1_Sub6 local382 = Class6_Sub2_Sub1_Sub6.aClass6_Sub2_Sub1_Sub6_2;
			local382.method489(local155, Class12.method88(local60) & Class12.method88(local62));
			if (local60 != -1 && local62 != -1) {
				local382.method496(local62, local60, Class33.aClass33Array1[super.anInt616].anIntArray132);
			} else if (local60 != -1) {
				local382.method495(local60, 803);
			}
			local382.method491();
			local382.anIntArrayArray19 = null;
			local382.anIntArrayArray18 = null;
			return local382;
		} catch (@Pc(430) RuntimeException local430) {
			signlink.reporterror("62126, " + arg0 + ", " + local430.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFGXOLGK", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method446() {
		try {
			return this.aBoolean174;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("25989, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
