import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class11 {

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	private int anInt162 = -1;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	private final int anInt157;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Lclient!tv;")
	private final Class290 aClass290_1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	private final int anInt163;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!uj;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	public final int anInt165;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!wn;")
	private Interface20 anInterface20_1;

	static {
		new Class88("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!wr;Lclient!tv;Lclient!uw;IIIII)V")
	public Class11(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class290 arg1, @OriginalArg(2) Class215_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt157 = arg6;
		this.aClass290_1 = arg1;
		this.aClass42_Sub1_1 = arg0;
		this.anInt163 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local35 + local37) * arg2.anInt9452 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray12[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt165 = 0;
			this.anInterface20_1 = null;
		} else {
			this.anInt161 = Integer.MAX_VALUE;
			this.anInt158 = Integer.MIN_VALUE;
			this.anInterface18_1 = this.aClass42_Sub1_1.method5906(false);
			this.anInterface18_1.method7529(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(107) Buffer local107 = this.anInterface18_1.method7895();
				if (local107 != null) {
					@Pc(115) Stream local115 = this.aClass42_Sub1_1.method5871(local107);
					@Pc(119) int local119;
					@Pc(130) int local130;
					@Pc(132) int local132;
					@Pc(140) short[] local140;
					@Pc(144) int local144;
					@Pc(152) int local152;
					if (Stream.c()) {
						for (local119 = 0; local119 < local25; local119++) {
							local130 = arg2.anInt9452 * (local119 + local35) + local31;
							for (local132 = 0; local132 < local25; local132++) {
								local140 = arg2.aShortArrayArray12[local130++];
								if (local140 != null) {
									for (local144 = 0; local144 < local140.length; local144++) {
										local152 = local140[local144] & 0xFFFF;
										if (this.anInt158 < local152) {
											this.anInt158 = local152;
										}
										if (this.anInt161 > local152) {
											this.anInt161 = local152;
										}
										local115.a(local152);
									}
								}
							}
						}
					} else {
						for (local119 = 0; local119 < local25; local119++) {
							local130 = arg2.anInt9452 * (local119 + local35) + local31;
							for (local132 = 0; local132 < local25; local132++) {
								local140 = arg2.aShortArrayArray12[local130++];
								if (local140 != null) {
									for (local144 = 0; local144 < local140.length; local144++) {
										local152 = local140[local144] & 0xFFFF;
										if (this.anInt161 > local152) {
											this.anInt161 = local152;
										}
										if (this.anInt158 < local152) {
											this.anInt158 = local152;
										}
										local115.d(local152);
									}
								}
							}
						}
					}
					local115.a();
					if (this.anInterface18_1.method7899()) {
						break;
					}
				}
			}
			this.anInt165 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!uj;II)V")
	public void method294(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method298();
			this.aClass42_Sub1_1.method5868(this.anInterface20_1);
			this.aClass42_Sub1_1.method5986(this.anInt158 + 1 - this.anInt161, arg0, this.anInt161, arg1, 0, Static480.aClass147_8);
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
	public void method297() {
		this.method294(this.anInterface18_1, this.anInt165);
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
	private void method298() {
		if (!this.aBoolean6) {
			return;
		}
		this.aBoolean6 = false;
		@Pc(16) byte[] local16 = this.aClass290_1.aByteArray109;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass290_1.anInt8770;
		@Pc(32) int local32 = this.anInt157 + this.aClass290_1.anInt8770 * this.anInt163;
		@Pc(47) int local47;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (local47 = -128; local47 < 0; local47++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface20_1 != null && this.anInt162 == local18) {
			this.aBoolean6 = false;
			return;
		}
		this.anInt162 = local18;
		local47 = 0;
		local32 = this.anInt157 + this.anInt163 * local22;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(130) int local130;
		if (!this.aClass42_Sub1_1.method5911(Static61.aClass72_1, Static155.aClass114_6)) {
			if (Static60.anIntArray139 == null) {
				Static60.anIntArray139 = new int[16384];
			}
			@Pc(116) int[] local116 = Static60.anIntArray139;
			for (local118 = -128; local118 < 0; local118++) {
				for (local122 = -128; local122 < 0; local122++) {
					if (local16[local32] == 0) {
						local130 = 0;
						if (local16[local32 - 1] != 0) {
							local130++;
						}
						if (local16[local32 + 1] != 0) {
							local130++;
						}
						if (local16[local32 - local22] != 0) {
							local130++;
						}
						if (local16[local32 + local22] != 0) {
							local130++;
						}
						local116[local47++] = local130 * 17 << 24;
					} else {
						local116[local47++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass290_1.anInt8770 - 128;
			}
			if (this.anInterface20_1 == null) {
				this.anInterface20_1 = this.aClass42_Sub1_1.method5960(128, Static60.anIntArray139, 128, false);
				this.anInterface20_1.method6988(false, false);
			} else {
				this.anInterface20_1.method6986(Static60.anIntArray139, 128, 0, 128, 128, 0);
			}
			return;
		}
		if (Static280.aByteArray61 == null) {
			Static280.aByteArray61 = new byte[16384];
		}
		@Pc(241) byte[] local241 = Static280.aByteArray61;
		for (local118 = -128; local118 < 0; local118++) {
			for (local122 = -128; local122 < 0; local122++) {
				if (local16[local32] == 0) {
					local130 = 0;
					if (local16[local32 - 1] != 0) {
						local130++;
					}
					if (local16[local32 + 1] != 0) {
						local130++;
					}
					if (local16[local32 - local22] != 0) {
						local130++;
					}
					if (local16[local22 + local32] != 0) {
						local130++;
					}
					local241[local47++] = (byte) (local130 * 17);
				} else {
					local241[local47++] = 68;
				}
				local32++;
			}
			local32 += this.aClass290_1.anInt8770 - 128;
		}
		if (this.anInterface20_1 == null) {
			this.anInterface20_1 = this.aClass42_Sub1_1.method5969(128, Static61.aClass72_1, false, 128, Static280.aByteArray61);
			this.anInterface20_1.method6988(false, false);
		} else {
			this.anInterface20_1.method6983(Static280.aByteArray61, 128, 128, Static61.aClass72_1, 128);
		}
	}
}
