import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class22 {

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	private int anInt845 = -1;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Z")
	public boolean aBoolean75 = true;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "Lclient!gt;")
	private final Class125 aClass125_1;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
	private final int anInt850;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
	private final int anInt844;

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_3;

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "Lclient!gn;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
	public final int anInt853;

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "I")
	private int anInt855;

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
	private int anInt852;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "Lclient!kga;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!qq;Lclient!gt;Lclient!jba;IIIII)V")
	public Class22(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) Class17_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass125_1 = arg1;
		this.anInt850 = arg7;
		this.anInt844 = arg6;
		this.aClass12_Sub2_3 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = (local37 + local35) * arg2.anInt7983 + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray3[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface8_1 = null;
			this.anInt853 = 0;
		} else {
			this.anInt855 = Integer.MIN_VALUE;
			this.anInt852 = Integer.MAX_VALUE;
			this.anInterface13_1 = this.aClass12_Sub2_3.method6193(false);
			this.anInterface13_1.method7650(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(114) Buffer local114 = this.anInterface13_1.method7648();
				if (local114 != null) {
					@Pc(122) Stream local122 = this.aClass12_Sub2_3.method6160(local114);
					@Pc(126) int local126;
					@Pc(137) int local137;
					@Pc(139) int local139;
					@Pc(147) short[] local147;
					@Pc(151) int local151;
					@Pc(159) int local159;
					if (Stream.c()) {
						for (local126 = 0; local126 < local25; local126++) {
							local137 = local31 + arg2.anInt7983 * (local35 + local126);
							for (local139 = 0; local139 < local25; local139++) {
								local147 = arg2.aShortArrayArray3[local137++];
								if (local147 != null) {
									for (local151 = 0; local151 < local147.length; local151++) {
										local159 = local147[local151] & 0xFFFF;
										if (local159 < this.anInt852) {
											this.anInt852 = local159;
										}
										if (local159 > this.anInt855) {
											this.anInt855 = local159;
										}
										local122.b(local159);
									}
								}
							}
						}
					} else {
						for (local126 = 0; local126 < local25; local126++) {
							local137 = local31 + (local35 + local126) * arg2.anInt7983;
							for (local139 = 0; local139 < local25; local139++) {
								local147 = arg2.aShortArrayArray3[local137++];
								if (local147 != null) {
									for (local151 = 0; local151 < local147.length; local151++) {
										local159 = local147[local151] & 0xFFFF;
										if (this.anInt855 < local159) {
											this.anInt855 = local159;
										}
										if (this.anInt852 > local159) {
											this.anInt852 = local159;
										}
										local122.e(local159);
									}
								}
							}
						}
					}
					local122.a();
					if (this.anInterface13_1.method7652()) {
						break;
					}
				}
			}
			this.anInt853 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!kga;I)V")
	public void method751(@OriginalArg(1) Interface13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method757();
			this.aClass12_Sub2_3.method6159(this.anInterface8_1);
			this.aClass12_Sub2_3.method6274(0, this.anInt852, arg0, arg1, this.anInt855 + 1 - this.anInt852, Static312.aClass165_3);
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public void method755() {
		this.method751(this.anInterface13_1, this.anInt853);
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
	private void method757() {
		if (!this.aBoolean75) {
			return;
		}
		this.aBoolean75 = false;
		@Pc(16) byte[] local16 = this.aClass125_1.aByteArray26;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass125_1.anInt3199;
		@Pc(32) int local32 = this.anInt850 * this.aClass125_1.anInt3199 + this.anInt844;
		@Pc(44) int local44;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (local44 = -128; local44 < 0; local44++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface8_1 != null && this.anInt845 == local18) {
			this.aBoolean75 = false;
			return;
		}
		this.anInt845 = local18;
		local32 = this.anInt844 + this.anInt850 * local22;
		local44 = 0;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(137) int local137;
		if (!this.aClass12_Sub2_3.method6219(Static554.aClass340_14, Static257.aClass297_6)) {
			if (Static27.anIntArray22 == null) {
				Static27.anIntArray22 = new int[16384];
			}
			@Pc(116) int[] local116 = Static27.anIntArray22;
			for (local118 = -128; local118 < 0; local118++) {
				for (local122 = -128; local122 < 0; local122++) {
					if (local16[local32] == 0) {
						local137 = 0;
						if (local16[local32 - 1] != 0) {
							local137++;
						}
						if (local16[local32 + 1] != 0) {
							local137++;
						}
						if (local16[local32 - local22] != 0) {
							local137++;
						}
						if (local16[local22 + local32] != 0) {
							local137++;
						}
						local116[local44++] = local137 * 17 << 24;
					} else {
						local116[local44++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass125_1.anInt3199 - 128;
			}
			if (this.anInterface8_1 == null) {
				this.anInterface8_1 = this.aClass12_Sub2_3.method6229(128, false, 128, Static27.anIntArray22);
				this.anInterface8_1.method7331(false, false);
			} else {
				this.anInterface8_1.method7330(128, 128, 0, Static27.anIntArray22, 0, 128);
			}
			return;
		}
		if (Static99.aByteArray17 == null) {
			Static99.aByteArray17 = new byte[16384];
		}
		@Pc(232) byte[] local232 = Static99.aByteArray17;
		for (local118 = -128; local118 < 0; local118++) {
			for (local122 = -128; local122 < 0; local122++) {
				if (local16[local32] == 0) {
					local137 = 0;
					if (local16[local32 - 1] != 0) {
						local137++;
					}
					if (local16[local32 + 1] != 0) {
						local137++;
					}
					if (local16[local32 - local22] != 0) {
						local137++;
					}
					if (local16[local32 + local22] != 0) {
						local137++;
					}
					local232[local44++] = (byte) (local137 * 17);
				} else {
					local232[local44++] = 68;
				}
				local32++;
			}
			local32 += this.aClass125_1.anInt3199 - 128;
		}
		if (this.anInterface8_1 == null) {
			this.anInterface8_1 = this.aClass12_Sub2_3.method6217(Static257.aClass297_6, 128, Static99.aByteArray17, false, 128);
			this.anInterface8_1.method7331(false, false);
		} else {
			this.anInterface8_1.method7329(128, 128, Static99.aByteArray17, Static257.aClass297_6, 128);
		}
	}
}
