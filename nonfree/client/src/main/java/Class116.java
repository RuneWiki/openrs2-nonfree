import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class116 {

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	private int anInt3546 = -1;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Z")
	public boolean aBoolean284 = true;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	private final int anInt3550;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!pm;")
	private final Class269 aClass269_2;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_7;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	private final int anInt3553;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public final int anInt3540;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!ak;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	private int anInt3543;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	private int anInt3544;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!ft;")
	private Interface8 anInterface8_5;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!ej;Lclient!pm;Lclient!an;IIIII)V")
	public Class116(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Class269 arg1, @OriginalArg(2) Class16_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3550 = arg7;
		this.aClass269_2 = arg1;
		this.aClass66_Sub1_7 = arg0;
		this.anInt3553 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = arg2.anInt9838 * (local35 + local37) + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray3[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt3540 = 0;
			this.anInterface2_1 = null;
		} else {
			this.anInt3543 = Integer.MIN_VALUE;
			this.anInt3544 = Integer.MAX_VALUE;
			this.anInterface8_5 = this.aClass66_Sub1_7.method6859(false);
			this.anInterface8_5.method7148(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(117) Buffer local117 = this.anInterface8_5.method7149();
				if (local117 != null) {
					@Pc(125) Stream local125 = this.aClass66_Sub1_7.method6978(local117);
					@Pc(129) int local129;
					@Pc(140) int local140;
					@Pc(142) int local142;
					@Pc(150) short[] local150;
					@Pc(154) int local154;
					@Pc(162) int local162;
					if (Stream.b()) {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = local31 + (local129 + local35) * arg2.anInt9838;
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray3[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (local162 > this.anInt3543) {
											this.anInt3543 = local162;
										}
										if (local162 < this.anInt3544) {
											this.anInt3544 = local162;
										}
										local125.c(local162);
									}
								}
							}
						}
					} else {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = local31 + arg2.anInt9838 * (local129 + local35);
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray3[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt3543 < local162) {
											this.anInt3543 = local162;
										}
										if (local162 < this.anInt3544) {
											this.anInt3544 = local162;
										}
										local125.e(local162);
									}
								}
							}
						}
					}
					local125.c();
					if (this.anInterface8_5.method7150()) {
						break;
					}
				}
			}
			this.anInt3540 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public void method3161() {
		this.method3162(this.anInt3540, this.anInterface8_5);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZILclient!ft;)V")
	public void method3162(@OriginalArg(1) int arg0, @OriginalArg(2) Interface8 arg1) {
		if (arg0 > 0) {
			this.method3168();
			this.aClass66_Sub1_7.method6979(this.anInterface2_1);
			this.aClass66_Sub1_7.method6917(this.anInt3544, Static453.aClass247_5, arg1, 0, this.anInt3543 + 1 - this.anInt3544, arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	private void method3168() {
		if (!this.aBoolean284) {
			return;
		}
		this.aBoolean284 = false;
		@Pc(24) byte[] local24 = this.aClass269_2.aByteArray96;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = this.aClass269_2.anInt7137;
		@Pc(40) int local40 = this.aClass269_2.anInt7137 * this.anInt3550 + this.anInt3553;
		@Pc(53) int local53;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local26 = (local26 << 8) - local26;
			for (local53 = -128; local53 < 0; local53++) {
				if (local24[local40++] != 0) {
					local26++;
				}
			}
			local40 += local30 - 128;
		}
		if (this.anInterface2_1 != null && local26 == this.anInt3546) {
			this.aBoolean284 = false;
			return;
		}
		this.anInt3546 = local26;
		local53 = 0;
		local40 = this.anInt3550 * local30 + this.anInt3553;
		@Pc(113) int local113;
		@Pc(117) int local117;
		@Pc(135) int local135;
		if (!this.aClass66_Sub1_7.method6969(Static106.aClass141_3, Static349.aClass239_12)) {
			if (Static362.anIntArray520 == null) {
				Static362.anIntArray520 = new int[16384];
			}
			@Pc(111) int[] local111 = Static362.anIntArray520;
			for (local113 = -128; local113 < 0; local113++) {
				for (local117 = -128; local117 < 0; local117++) {
					if (local24[local40] == 0) {
						local135 = 0;
						if (local24[local40 - 1] != 0) {
							local135++;
						}
						if (local24[local40 + 1] != 0) {
							local135++;
						}
						if (local24[local40 - local30] != 0) {
							local135++;
						}
						if (local24[local40 + local30] != 0) {
							local135++;
						}
						local111[local53++] = local135 * 17 << 24;
					} else {
						local111[local53++] = 1140850688;
					}
					local40++;
				}
				local40 += this.aClass269_2.anInt7137 - 128;
			}
			if (this.anInterface2_1 == null) {
				this.anInterface2_1 = this.aClass66_Sub1_7.method6951(false, 128, 128, Static362.anIntArray520);
				this.anInterface2_1.method6718(false, false);
			} else {
				this.anInterface2_1.method6720(0, 128, 128, 128, 0, Static362.anIntArray520);
			}
			return;
		}
		if (Static483.aByteArray106 == null) {
			Static483.aByteArray106 = new byte[16384];
		}
		@Pc(232) byte[] local232 = Static483.aByteArray106;
		for (local113 = -128; local113 < 0; local113++) {
			for (local117 = -128; local117 < 0; local117++) {
				if (local24[local40] == 0) {
					local135 = 0;
					if (local24[local40 - 1] != 0) {
						local135++;
					}
					if (local24[local40 + 1] != 0) {
						local135++;
					}
					if (local24[local40 - local30] != 0) {
						local135++;
					}
					if (local24[local40 + local30] != 0) {
						local135++;
					}
					local232[local53++] = (byte) (local135 * 17);
				} else {
					local232[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass269_2.anInt7137 - 128;
		}
		if (this.anInterface2_1 == null) {
			this.anInterface2_1 = this.aClass66_Sub1_7.method6958(false, 128, Static483.aByteArray106, Static106.aClass141_3, 128);
			this.anInterface2_1.method6718(false, false);
		} else {
			this.anInterface2_1.method6719(128, Static483.aByteArray106, Static106.aClass141_3, 128, 128);
		}
	}
}
