import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class329 {

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
	private int anInt8294 = -1;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Z")
	public boolean aBoolean636 = true;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	private final int anInt8287;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
	private final int anInt8295;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!mj;")
	private final Class45_Sub2 aClass45_Sub2_19;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "Lclient!ws;")
	private final Class363 aClass363_2;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
	private int anInt8291;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
	private int anInt8293;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!mda;")
	private Interface13 anInterface13_8;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public final int anInt8288;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "Lclient!pm;")
	private Interface17 anInterface17_5;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!mj;Lclient!ws;Lclient!bh;IIIII)V")
	public Class329(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) Class34_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8287 = arg7;
		this.anInt8295 = arg6;
		this.aClass45_Sub2_19 = arg0;
		this.aClass363_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + (local37 + local35) * arg2.anInt7854;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray1[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt8288 = 0;
			this.anInterface17_5 = null;
		} else {
			this.anInt8291 = Integer.MIN_VALUE;
			this.anInt8293 = Integer.MAX_VALUE;
			this.anInterface13_8 = this.aClass45_Sub2_19.method4945(false);
			this.anInterface13_8.method6435(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(114) Buffer local114 = this.anInterface13_8.method6437();
				if (local114 != null) {
					@Pc(122) Stream local122 = this.aClass45_Sub2_19.method4901(local114);
					@Pc(126) int local126;
					@Pc(138) int local138;
					@Pc(140) int local140;
					@Pc(148) short[] local148;
					@Pc(152) int local152;
					@Pc(160) int local160;
					if (Stream.c()) {
						for (local126 = 0; local126 < local25; local126++) {
							local138 = local31 + arg2.anInt7854 * (local35 + local126);
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray1[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (this.anInt8291 < local160) {
											this.anInt8291 = local160;
										}
										if (local160 < this.anInt8293) {
											this.anInt8293 = local160;
										}
										local122.b(local160);
									}
								}
							}
						}
					} else {
						for (local126 = 0; local126 < local25; local126++) {
							local138 = local31 + (local35 + local126) * arg2.anInt7854;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray1[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (this.anInt8293 > local160) {
											this.anInt8293 = local160;
										}
										if (local160 > this.anInt8291) {
											this.anInt8291 = local160;
										}
										local122.e(local160);
									}
								}
							}
						}
					}
					local122.a();
					if (this.anInterface13_8.method6433()) {
						break;
					}
				}
			}
			this.anInt8288 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!mda;BI)V")
	public void method6888(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method6890();
			this.aClass45_Sub2_19.method4926(this.anInterface17_5);
			this.aClass45_Sub2_19.method4967(0, arg1, this.anInt8291 + 1 - this.anInt8293, Static379.aClass40_9, arg0, this.anInt8293);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	private void method6890() {
		if (!this.aBoolean636) {
			return;
		}
		this.aBoolean636 = false;
		@Pc(16) byte[] local16 = this.aClass363_2.aByteArray105;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass363_2.anInt9685;
		@Pc(32) int local32 = this.anInt8295 + this.aClass363_2.anInt9685 * this.anInt8287;
		@Pc(45) int local45;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (local45 = -128; local45 < 0; local45++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface17_5 != null && this.anInt8294 == local18) {
			this.aBoolean636 = false;
			return;
		}
		this.anInt8294 = local18;
		local45 = 0;
		local32 = this.anInt8295 + local22 * this.anInt8287;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(133) int local133;
		if (!this.aClass45_Sub2_19.method4955(Static471.aClass298_15, Static213.aClass314_19)) {
			if (Static296.anIntArray287 == null) {
				Static296.anIntArray287 = new int[16384];
			}
			@Pc(239) int[] local239 = Static296.anIntArray287;
			for (local118 = -128; local118 < 0; local118++) {
				for (local122 = -128; local122 < 0; local122++) {
					if (local16[local32] == 0) {
						local133 = 0;
						if (local16[local32 - 1] != 0) {
							local133++;
						}
						if (local16[local32 + 1] != 0) {
							local133++;
						}
						if (local16[local32 - local22] != 0) {
							local133++;
						}
						if (local16[local22 + local32] != 0) {
							local133++;
						}
						local239[local45++] = local133 * 17 << 24;
					} else {
						local239[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass363_2.anInt9685 - 128;
			}
			if (this.anInterface17_5 == null) {
				this.anInterface17_5 = this.aClass45_Sub2_19.method4904(false, 128, 128, Static296.anIntArray287);
				this.anInterface17_5.method6973(false, false);
			} else {
				this.anInterface17_5.method6967(128, 128, 0, Static296.anIntArray287, 128, 0);
			}
			return;
		}
		if (Static364.aByteArray6 == null) {
			Static364.aByteArray6 = new byte[16384];
		}
		@Pc(116) byte[] local116 = Static364.aByteArray6;
		for (local118 = -128; local118 < 0; local118++) {
			for (local122 = -128; local122 < 0; local122++) {
				if (local16[local32] == 0) {
					local133 = 0;
					if (local16[local32 - 1] != 0) {
						local133++;
					}
					if (local16[local32 + 1] != 0) {
						local133++;
					}
					if (local16[local32 - local22] != 0) {
						local133++;
					}
					if (local16[local22 + local32] != 0) {
						local133++;
					}
					local116[local45++] = (byte) (local133 * 17);
				} else {
					local116[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass363_2.anInt9685 - 128;
		}
		if (this.anInterface17_5 == null) {
			this.anInterface17_5 = this.aClass45_Sub2_19.method5013(128, Static364.aByteArray6, 128, Static213.aClass314_19, false);
			this.anInterface17_5.method6973(false, false);
		} else {
			this.anInterface17_5.method6971(128, Static364.aByteArray6, 128, 128, Static213.aClass314_19);
		}
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
	public void method6892() {
		this.method6888(this.anInterface13_8, this.anInt8288);
	}
}
