import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DEHYKQII")
public final class Class8_Sub1_Sub1_Sub1_Sub1 extends Class8_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!DEHYKQII", name = "Bb", descriptor = "Lclient!JGECYJMS;")
	public static Class15 aClass15_1 = new Class15(260, -11885);

	@OriginalMember(owner = "client!DEHYKQII", name = "pb", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!DEHYKQII", name = "rb", descriptor = "I")
	public int anInt140;

	@OriginalMember(owner = "client!DEHYKQII", name = "tb", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!DEHYKQII", name = "wb", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!DEHYKQII", name = "xb", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!DEHYKQII", name = "yb", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!DEHYKQII", name = "Ab", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!DEHYKQII", name = "Db", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!DEHYKQII", name = "Eb", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!DEHYKQII", name = "Fb", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!DEHYKQII", name = "Gb", descriptor = "I")
	public int anInt148;

	@OriginalMember(owner = "client!DEHYKQII", name = "Hb", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!DEHYKQII", name = "Ib", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!DEHYKQII", name = "Jb", descriptor = "Lclient!KDWDYCIL;")
	public Class8_Sub1_Sub1_Sub3 aClass8_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!DEHYKQII", name = "Kb", descriptor = "I")
	public int anInt151;

	@OriginalMember(owner = "client!DEHYKQII", name = "Lb", descriptor = "I")
	public int anInt152;

	@OriginalMember(owner = "client!DEHYKQII", name = "Mb", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!DEHYKQII", name = "Nb", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!DEHYKQII", name = "Ob", descriptor = "Lclient!YANZSPIT;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!DEHYKQII", name = "qb", descriptor = "Z")
	private boolean aBoolean23 = true;

	@OriginalMember(owner = "client!DEHYKQII", name = "sb", descriptor = "[I")
	public int[] anIntArray38 = new int[5];

	@OriginalMember(owner = "client!DEHYKQII", name = "ub", descriptor = "[I")
	public int[] anIntArray39 = new int[12];

	@OriginalMember(owner = "client!DEHYKQII", name = "vb", descriptor = "I")
	private int anInt142 = 41952;

	@OriginalMember(owner = "client!DEHYKQII", name = "zb", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!DEHYKQII", name = "Cb", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!DEHYKQII", name = "Pb", descriptor = "I")
	public int anInt155 = -1;

	@OriginalMember(owner = "client!DEHYKQII", name = "Qb", descriptor = "J")
	private long aLong7 = -1L;

	@OriginalMember(owner = "client!DEHYKQII", name = "Rb", descriptor = "I")
	public int anInt156 = -1;

	@OriginalMember(owner = "client!DEHYKQII", name = "Sb", descriptor = "I")
	private int anInt157 = 12272;

	@OriginalMember(owner = "client!DEHYKQII", name = "c", descriptor = "(I)Lclient!KDWDYCIL;")
	public Class8_Sub1_Sub1_Sub3 method62(@OriginalArg(0) int arg0) {
		try {
			if (!this.aBoolean25) {
				return null;
			} else if (this.aClass45_1 == null) {
				@Pc(16) boolean local16 = false;
				for (@Pc(18) int local18 = 0; local18 < 12; local18++) {
					@Pc(25) int local25 = this.anIntArray39[local18];
					if (local25 >= 256 && local25 < 512 && !Class9.aClass9Array1[local25 - 256].method69(this.anInt147)) {
						local16 = true;
					}
					if (local25 >= 512 && !Class46.method532(local25 - 512).method526(this.anInt141, 219)) {
						local16 = true;
					}
				}
				if (local16) {
					return null;
				}
				@Pc(67) Class8_Sub1_Sub1_Sub3[] local67 = new Class8_Sub1_Sub1_Sub3[12];
				@Pc(69) int local69 = 0;
				for (@Pc(71) int local71 = 0; local71 < 12; local71++) {
					@Pc(78) int local78 = this.anIntArray39[local71];
					@Pc(92) Class8_Sub1_Sub1_Sub3 local92;
					if (local78 >= 256 && local78 < 512) {
						local92 = Class9.aClass9Array1[local78 - 256].method70();
						if (local92 != null) {
							local67[local69++] = local92;
						}
					}
					if (local78 >= 512) {
						local92 = Class46.method532(local78 - 512).method533(this.anInt141);
						if (local92 != null) {
							local67[local69++] = local92;
						}
					}
				}
				@Pc(130) Class8_Sub1_Sub1_Sub3 local130 = new Class8_Sub1_Sub1_Sub3(local67, local69, this.anInt157);
				for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
					if (this.anIntArray38[local132] != 0) {
						local130.method150(client.anIntArrayArray24[local132][0], client.anIntArrayArray24[local132][this.anIntArray38[local132]]);
						if (local132 == 1) {
							local130.method150(client.anIntArray274[0], client.anIntArray274[this.anIntArray38[local132]]);
						}
					}
				}
				if (arg0 != 0) {
					for (@Pc(176) int local176 = 1; local176 > 0; local176++) {
					}
				}
				return local130;
			} else {
				return this.aClass45_1.method521();
			}
		} catch (@Pc(184) RuntimeException local184) {
			signlink.reporterror("50471, " + arg0 + ", " + local184.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEHYKQII", name = "a", descriptor = "(I)Lclient!KDWDYCIL;")
	@Override
	protected Class8_Sub1_Sub1_Sub3 method472() {
		try {
			if (!this.aBoolean25) {
				return null;
			}
			@Pc(10) Class8_Sub1_Sub1_Sub3 local10 = this.method63();
			if (local10 == null) {
				return null;
			}
			super.anInt194 = local10.anInt634;
			local10.aBoolean67 = true;
			if (this.aBoolean24) {
				return local10;
			}
			if (super.anInt220 != -1 && super.anInt221 != -1) {
				@Pc(50) Class32 local50 = Class32.aClass32Array1[super.anInt220];
				@Pc(53) Class8_Sub1_Sub1_Sub3 local53 = local50.method313();
				if (local53 != null) {
					@Pc(68) Class8_Sub1_Sub1_Sub3 local68 = new Class8_Sub1_Sub1_Sub3((byte) -48, false, local53, Class34.method331(super.anInt221, this.anInt142), true);
					local68.method149(0, -super.anInt224, 0);
					local68.method143();
					local68.method144(local50.aClass20_2.anIntArray110[super.anInt221]);
					local68.anIntArrayArray7 = null;
					local68.anIntArrayArray6 = null;
					if (local50.anInt515 != 128 || local50.anInt516 != 128) {
						local68.method152(local50.anInt515, local50.anInt515, local50.anInt516);
					}
					local68.method153(local50.anInt518 + 64, local50.anInt519 + 850, -30, -50, -30, true);
					@Pc(136) Class8_Sub1_Sub1_Sub3[] local136 = new Class8_Sub1_Sub1_Sub3[] { local10, local68 };
					local10 = new Class8_Sub1_Sub1_Sub3(local136, 2, true, -234);
				}
			}
			if (this.aClass8_Sub1_Sub1_Sub3_1 != null) {
				if (client.anInt917 >= this.anInt145) {
					this.aClass8_Sub1_Sub1_Sub3_1 = null;
				}
				if (client.anInt917 >= this.anInt144 && client.anInt917 < this.anInt145) {
					@Pc(165) Class8_Sub1_Sub1_Sub3 local165 = this.aClass8_Sub1_Sub1_Sub3_1;
					local165.method149(this.anInt148 - super.anInt230, this.anInt149 - this.anInt146, this.anInt150 - super.anInt231);
					if (super.anInt187 == 512) {
						local165.method147();
						local165.method147();
						local165.method147();
					} else if (super.anInt187 == 1024) {
						local165.method147();
						local165.method147();
					} else if (super.anInt187 == 1536) {
						local165.method147();
					}
					@Pc(228) Class8_Sub1_Sub1_Sub3[] local228 = new Class8_Sub1_Sub1_Sub3[] { local10, local165 };
					local10 = new Class8_Sub1_Sub1_Sub3(local228, 2, true, -234);
					if (super.anInt187 == 512) {
						local165.method147();
					} else if (super.anInt187 == 1024) {
						local165.method147();
						local165.method147();
					} else if (super.anInt187 == 1536) {
						local165.method147();
						local165.method147();
						local165.method147();
					}
					local165.method149(super.anInt230 - this.anInt148, this.anInt146 - this.anInt149, super.anInt231 - this.anInt150);
				}
			}
			local10.aBoolean67 = true;
			return local10;
		} catch (@Pc(294) RuntimeException local294) {
			signlink.reporterror("57308, " + 9 + ", " + local294.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEHYKQII", name = "d", descriptor = "(I)Lclient!KDWDYCIL;")
	private Class8_Sub1_Sub1_Sub3 method63() {
		try {
			if (this.aClass45_1 != null) {
				@Pc(6) int local6 = -1;
				if (super.anInt215 >= 0 && super.anInt218 == 0) {
					local6 = Class20.aClass20Array1[super.anInt215].anIntArray110[super.anInt216];
				} else if (super.anInt210 >= 0) {
					local6 = Class20.aClass20Array1[super.anInt210].anIntArray110[super.anInt211];
				}
				return this.aClass45_1.method518(null, local6, -1);
			}
			@Pc(48) long local48 = this.aLong6;
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			if (super.anInt215 >= 0 && super.anInt218 == 0) {
				@Pc(76) Class20 local76 = Class20.aClass20Array1[super.anInt215];
				local50 = local76.anIntArray110[super.anInt216];
				if (super.anInt210 >= 0 && super.anInt210 != super.anInt192) {
					local52 = Class20.aClass20Array1[super.anInt210].anIntArray110[super.anInt211];
				}
				if (local76.anInt328 >= 0) {
					local54 = local76.anInt328;
					local48 += local54 - this.anIntArray39[5] << 8;
				}
				if (local76.anInt329 >= 0) {
					local56 = local76.anInt329;
					local48 += local56 - this.anIntArray39[3] << 16;
				}
			} else if (super.anInt210 >= 0) {
				local50 = Class20.aClass20Array1[super.anInt210].anIntArray110[super.anInt211];
			}
			@Pc(154) Class8_Sub1_Sub1_Sub3 local154 = (Class8_Sub1_Sub1_Sub3) aClass15_1.method116(local48);
			@Pc(160) int local160;
			@Pc(167) int local167;
			if (local154 == null) {
				@Pc(158) boolean local158 = false;
				for (local160 = 0; local160 < 12; local160++) {
					local167 = this.anIntArray39[local160];
					if (local56 >= 0 && local160 == 3) {
						local167 = local56;
					}
					if (local54 >= 0 && local160 == 5) {
						local167 = local54;
					}
					if (local167 >= 256 && local167 < 512 && !Class9.aClass9Array1[local167 - 256].method67()) {
						local158 = true;
					}
					if (local167 >= 512 && !Class46.method532(local167 - 512).method536(this.anInt141)) {
						local158 = true;
					}
				}
				if (local158) {
					if (this.aLong7 != -1L) {
						local154 = (Class8_Sub1_Sub1_Sub3) aClass15_1.method116(this.aLong7);
					}
					if (local154 == null) {
						return null;
					}
				}
			}
			if (local154 == null) {
				@Pc(237) Class8_Sub1_Sub1_Sub3[] local237 = new Class8_Sub1_Sub1_Sub3[12];
				local160 = 0;
				@Pc(248) int local248;
				for (local167 = 0; local167 < 12; local167++) {
					local248 = this.anIntArray39[local167];
					if (local56 >= 0 && local167 == 3) {
						local248 = local56;
					}
					if (local54 >= 0 && local167 == 5) {
						local248 = local54;
					}
					@Pc(276) Class8_Sub1_Sub1_Sub3 local276;
					if (local248 >= 256 && local248 < 512) {
						local276 = Class9.aClass9Array1[local248 - 256].method68();
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
					if (local248 >= 512) {
						local276 = Class46.method532(local248 - 512).method535(this.anInt141, (byte) 8);
						if (local276 != null) {
							local237[local160++] = local276;
						}
					}
				}
				local154 = new Class8_Sub1_Sub1_Sub3(local237, local160, this.anInt157);
				for (local248 = 0; local248 < 5; local248++) {
					if (this.anIntArray38[local248] != 0) {
						local154.method150(client.anIntArrayArray24[local248][0], client.anIntArrayArray24[local248][this.anIntArray38[local248]]);
						if (local248 == 1) {
							local154.method150(client.anIntArray274[0], client.anIntArray274[this.anIntArray38[local248]]);
						}
					}
				}
				local154.method143();
				local154.method153(64, 850, -30, -50, -30, true);
				aClass15_1.method117(local48, 811, local154);
				this.aLong7 = local48;
			}
			if (this.aBoolean24) {
				return local154;
			}
			@Pc(382) Class8_Sub1_Sub1_Sub3 local382 = Class8_Sub1_Sub1_Sub3.aClass8_Sub1_Sub1_Sub3_2;
			local382.method138(Class34.method331(local50, this.anInt142) & Class34.method331(local52, this.anInt142), local154);
			if (local50 != -1 && local52 != -1) {
				local382.method145(local52, local50, Class20.aClass20Array1[super.anInt215].anIntArray113);
			} else if (local50 != -1) {
				local382.method144(local50);
			}
			local382.method140();
			local382.anIntArrayArray7 = null;
			local382.anIntArrayArray6 = null;
			return local382;
		} catch (@Pc(432) RuntimeException local432) {
			signlink.reporterror("18128, " + 778 + ", " + local432.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEHYKQII", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	public void method64(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			arg0.anInt620 = 0;
			this.anInt141 = arg0.method406();
			this.anInt155 = arg0.method407();
			this.anInt156 = arg0.method407();
			this.aClass45_1 = null;
			this.anInt139 = 0;
			@Pc(29) int local29;
			@Pc(41) int local41;
			@Pc(88) int local88;
			for (@Pc(24) int local24 = 0; local24 < 12; local24++) {
				local29 = arg0.method406();
				if (local29 == 0) {
					this.anIntArray39[local24] = 0;
				} else {
					local41 = arg0.method406();
					this.anIntArray39[local24] = (local29 << 8) + local41;
					if (local24 == 0 && this.anIntArray39[0] == 65535) {
						this.aClass45_1 = Class45.method520(arg0.method408());
						break;
					}
					if (this.anIntArray39[local24] >= 512 && this.anIntArray39[local24] - 512 < Class46.anInt746) {
						local88 = Class46.method532(this.anIntArray39[local24] - 512).anInt765;
						if (local88 != 0) {
							this.anInt139 = local88;
						}
					}
				}
			}
			for (local29 = 0; local29 < 5; local29++) {
				local41 = arg0.method406();
				if (local41 < 0 || local41 >= client.anIntArrayArray24[local29].length) {
					local41 = 0;
				}
				this.anIntArray38[local29] = local41;
			}
			super.anInt192 = arg0.method408();
			if (super.anInt192 == 65535) {
				super.anInt192 = -1;
			}
			super.anInt193 = arg0.method408();
			if (super.anInt193 == 65535) {
				super.anInt193 = -1;
			}
			super.anInt225 = arg0.method408();
			if (super.anInt225 == 65535) {
				super.anInt225 = -1;
			}
			super.anInt226 = arg0.method408();
			if (super.anInt226 == 65535) {
				super.anInt226 = -1;
			}
			super.anInt227 = arg0.method408();
			if (super.anInt227 == 65535) {
				super.anInt227 = -1;
			}
			super.anInt228 = arg0.method408();
			if (super.anInt228 == 65535) {
				super.anInt228 = -1;
			}
			super.anInt190 = arg0.method408();
			if (super.anInt190 == 65535) {
				super.anInt190 = -1;
			}
			this.aString4 = Class28.method309(Class28.method306(arg0.method412()));
			this.anInt143 = arg0.method406();
			this.anInt140 = arg0.method408();
			this.aBoolean25 = true;
			this.aLong6 = 0L;
			local41 = this.anIntArray39[5];
			local88 = this.anIntArray39[9];
			this.anIntArray39[5] = local88;
			this.anIntArray39[9] = local41;
			for (@Pc(255) int local255 = 0; local255 < 12; local255++) {
				this.aLong6 <<= 0x4;
				if (this.anIntArray39[local255] >= 256) {
					this.aLong6 += this.anIntArray39[local255] - 256;
				}
			}
			if (this.anIntArray39[0] >= 256) {
				this.aLong6 += this.anIntArray39[0] - 256 >> 4;
			}
			if (this.anIntArray39[1] >= 256) {
				this.aLong6 += this.anIntArray39[1] - 256 >> 8;
			}
			this.anIntArray39[5] = local41;
			this.anIntArray39[9] = local88;
			for (@Pc(337) int local337 = 0; local337 < 5; local337++) {
				this.aLong6 <<= 0x3;
				this.aLong6 += this.anIntArray38[local337];
			}
			this.aLong6 <<= 0x1;
			this.aLong6 += this.anInt141;
		} catch (@Pc(375) RuntimeException local375) {
			signlink.reporterror("64711, " + -5329 + ", " + arg0 + ", " + local375.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEHYKQII", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method85() {
		try {
			return this.aBoolean25;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("46375, " + true + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
