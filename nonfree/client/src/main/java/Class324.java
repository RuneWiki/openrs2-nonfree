import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class324 {

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	private int anInt8114 = -1;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "Z")
	public boolean aBoolean630 = true;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	private final int anInt8110;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
	private final int anInt8112;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "Lclient!ev;")
	private final Class87 aClass87_1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_20;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	private int anInt8115;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
	private int anInt8113;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!or;")
	private Interface17 anInterface17_8;

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	public final int anInt8119;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!hi;")
	private Interface10 anInterface10_6;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!cf;Lclient!ev;Lclient!tr;IIIII)V")
	public Class324(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) Class139_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8110 = arg6;
		this.anInt8112 = arg7;
		this.aClass87_1 = arg1;
		this.aClass43_Sub1_20 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = (local37 + local35) * arg2.anInt8179 + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray79[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface10_6 = null;
			this.anInt8119 = 0;
		} else {
			this.anInt8115 = Integer.MAX_VALUE;
			this.anInt8113 = Integer.MIN_VALUE;
			this.anInterface17_8 = this.aClass43_Sub1_20.method4258(false);
			this.anInterface17_8.method6942(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(114) Buffer local114 = this.anInterface17_8.method6938();
				if (local114 != null) {
					@Pc(122) Stream local122 = this.aClass43_Sub1_20.method4233(local114);
					@Pc(126) int local126;
					@Pc(138) int local138;
					@Pc(140) int local140;
					@Pc(148) short[] local148;
					@Pc(152) int local152;
					@Pc(160) int local160;
					if (Stream.c()) {
						for (local126 = 0; local126 < local25; local126++) {
							local138 = local31 + arg2.anInt8179 * (local35 + local126);
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray79[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 < this.anInt8115) {
											this.anInt8115 = local160;
										}
										if (this.anInt8113 < local160) {
											this.anInt8113 = local160;
										}
										local122.d(local160);
									}
								}
							}
						}
					} else {
						for (local126 = 0; local126 < local25; local126++) {
							local138 = local31 + (local35 + local126) * arg2.anInt8179;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray79[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 > this.anInt8113) {
											this.anInt8113 = local160;
										}
										if (this.anInt8115 > local160) {
											this.anInt8115 = local160;
										}
										local122.f(local160);
									}
								}
							}
						}
					}
					local122.a();
					if (this.anInterface17_8.method6941()) {
						break;
					}
				}
			}
			this.anInt8119 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	private void method6831() {
		if (!this.aBoolean630) {
			return;
		}
		this.aBoolean630 = false;
		@Pc(16) byte[] local16 = this.aClass87_1.aByteArray32;
		@Pc(18) int local18 = 0;
		@Pc(30) int local30 = this.aClass87_1.anInt2828;
		@Pc(40) int local40 = this.anInt8112 * this.aClass87_1.anInt2828 + this.anInt8110;
		@Pc(53) int local53;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local18 = (local18 << 8) - local18;
			for (local53 = -128; local53 < 0; local53++) {
				if (local16[local40++] != 0) {
					local18++;
				}
			}
			local40 += local30 - 128;
		}
		if (this.anInterface10_6 != null && local18 == this.anInt8114) {
			this.aBoolean630 = false;
			return;
		}
		this.anInt8114 = local18;
		local40 = local30 * this.anInt8112 + this.anInt8110;
		local53 = 0;
		@Pc(116) int local116;
		@Pc(120) int local120;
		@Pc(135) int local135;
		if (!this.aClass43_Sub1_20.method4180(Static461.aClass292_14, Static563.aClass93_13)) {
			if (Static51.anIntArray97 == null) {
				Static51.anIntArray97 = new int[16384];
			}
			@Pc(237) int[] local237 = Static51.anIntArray97;
			for (local116 = -128; local116 < 0; local116++) {
				for (local120 = -128; local120 < 0; local120++) {
					if (local16[local40] == 0) {
						local135 = 0;
						if (local16[local40 - 1] != 0) {
							local135++;
						}
						if (local16[local40 + 1] != 0) {
							local135++;
						}
						if (local16[local40 - local30] != 0) {
							local135++;
						}
						if (local16[local30 + local40] != 0) {
							local135++;
						}
						local237[local53++] = local135 * 17 << 24;
					} else {
						local237[local53++] = 1140850688;
					}
					local40++;
				}
				local40 += this.aClass87_1.anInt2828 - 128;
			}
			if (this.anInterface10_6 == null) {
				this.anInterface10_6 = this.aClass43_Sub1_20.method4303(128, Static51.anIntArray97, false, 128);
				this.anInterface10_6.method6171(false, false);
			} else {
				this.anInterface10_6.method6169(0, Static51.anIntArray97, 128, 128, 0, 128);
			}
			return;
		}
		if (Static187.aByteArray37 == null) {
			Static187.aByteArray37 = new byte[16384];
		}
		@Pc(114) byte[] local114 = Static187.aByteArray37;
		for (local116 = -128; local116 < 0; local116++) {
			for (local120 = -128; local120 < 0; local120++) {
				if (local16[local40] == 0) {
					local135 = 0;
					if (local16[local40 - 1] != 0) {
						local135++;
					}
					if (local16[local40 + 1] != 0) {
						local135++;
					}
					if (local16[local40 - local30] != 0) {
						local135++;
					}
					if (local16[local40 + local30] != 0) {
						local135++;
					}
					local114[local53++] = (byte) (local135 * 17);
				} else {
					local114[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass87_1.anInt2828 - 128;
		}
		if (this.anInterface10_6 == null) {
			this.anInterface10_6 = this.aClass43_Sub1_20.method4285(128, Static187.aByteArray37, 128, false, Static563.aClass93_13);
			this.anInterface10_6.method6171(false, false);
		} else {
			this.anInterface10_6.method6173(Static563.aClass93_13, 128, 128, Static187.aByteArray37, 128);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLclient!or;I)V")
	public void method6832(@OriginalArg(1) Interface17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method6831();
			this.aClass43_Sub1_20.method4298(this.anInterface10_6);
			this.aClass43_Sub1_20.method4232(Static534.aClass319_7, this.anInt8115, this.anInt8113 + 1 - this.anInt8115, 0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public void method6835() {
		this.method6832(this.anInterface17_8, this.anInt8119);
	}
}
