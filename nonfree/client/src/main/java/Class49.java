import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class49 {

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	private int anInt1181 = -1;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Z")
	public boolean aBoolean84 = true;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!gf;")
	private final Class122 aClass122_1;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_5;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	private final int anInt1185;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	private final int anInt1186;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!oia;")
	private Interface19 anInterface19_2;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
	public final int anInt1183;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
	private int anInt1188;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	private int anInt1182;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!ho;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!pga;Lclient!gf;Lclient!sba;IIIII)V")
	public Class49(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) Class76_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass122_1 = arg1;
		this.aClass95_Sub3_5 = arg0;
		this.anInt1185 = arg7;
		this.anInt1186 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + (local37 + local35) * arg2.anInt8791;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray26[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface19_2 = null;
			this.anInt1183 = 0;
		} else {
			this.anInt1188 = Integer.MAX_VALUE;
			this.anInt1182 = Integer.MIN_VALUE;
			this.anInterface10_1 = this.aClass95_Sub3_5.method7119(false);
			this.anInterface10_1.method7382(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(113) Buffer local113 = this.anInterface10_1.method7385();
				if (local113 != null) {
					@Pc(121) Stream local121 = this.aClass95_Sub3_5.method7086(local113);
					@Pc(125) int local125;
					@Pc(136) int local136;
					@Pc(138) int local138;
					@Pc(146) short[] local146;
					@Pc(150) int local150;
					@Pc(158) int local158;
					if (Stream.a()) {
						for (local125 = 0; local125 < local25; local125++) {
							local136 = arg2.anInt8791 * (local35 + local125) + local31;
							for (local138 = 0; local138 < local25; local138++) {
								local146 = arg2.aShortArrayArray26[local136++];
								if (local146 != null) {
									for (local150 = 0; local150 < local146.length; local150++) {
										local158 = local146[local150] & 0xFFFF;
										if (this.anInt1182 < local158) {
											this.anInt1182 = local158;
										}
										if (local158 < this.anInt1188) {
											this.anInt1188 = local158;
										}
										local121.e(local158);
									}
								}
							}
						}
					} else {
						for (local125 = 0; local125 < local25; local125++) {
							local136 = arg2.anInt8791 * (local35 + local125) + local31;
							for (local138 = 0; local138 < local25; local138++) {
								local146 = arg2.aShortArrayArray26[local136++];
								if (local146 != null) {
									for (local150 = 0; local150 < local146.length; local150++) {
										local158 = local146[local150] & 0xFFFF;
										if (this.anInt1188 > local158) {
											this.anInt1188 = local158;
										}
										if (local158 > this.anInt1182) {
											this.anInt1182 = local158;
										}
										local121.b(local158);
									}
								}
							}
						}
					}
					local121.c();
					if (this.anInterface10_1.method7384()) {
						break;
					}
				}
			}
			this.anInt1183 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public void method920() {
		this.method922(this.anInterface10_1, this.anInt1183);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ho;II)V")
	public void method922(@OriginalArg(0) Interface10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method923();
			this.aClass95_Sub3_5.method7112(this.anInterface19_2);
			this.aClass95_Sub3_5.method7060(Static286.aClass30_3, 0, this.anInt1188, this.anInt1182 + 1 - this.anInt1188, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	private void method923() {
		if (!this.aBoolean84) {
			return;
		}
		this.aBoolean84 = false;
		@Pc(20) byte[] local20 = this.aClass122_1.aByteArray38;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass122_1.anInt3112;
		@Pc(37) int local37 = this.anInt1186 + this.aClass122_1.anInt3112 * this.anInt1185;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local20[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.anInterface19_2 != null && local22 == this.anInt1181) {
			this.aBoolean84 = false;
			return;
		}
		this.anInt1181 = local22;
		local50 = 0;
		local37 = this.anInt1186 + local26 * this.anInt1185;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(140) int local140;
		if (!this.aClass95_Sub3_5.method7103(Static588.aClass188_15, Static290.aClass189_11)) {
			if (Static276.anIntArray294 == null) {
				Static276.anIntArray294 = new int[16384];
			}
			@Pc(239) int[] local239 = Static276.anIntArray294;
			for (local121 = -128; local121 < 0; local121++) {
				for (local125 = -128; local125 < 0; local125++) {
					if (local20[local37] == 0) {
						local140 = 0;
						if (local20[local37 - 1] != 0) {
							local140++;
						}
						if (local20[local37 + 1] != 0) {
							local140++;
						}
						if (local20[local37 - local26] != 0) {
							local140++;
						}
						if (local20[local37 + local26] != 0) {
							local140++;
						}
						local239[local50++] = local140 * 17 << 24;
					} else {
						local239[local50++] = 1140850688;
					}
					local37++;
				}
				local37 += this.aClass122_1.anInt3112 - 128;
			}
			if (this.anInterface19_2 == null) {
				this.anInterface19_2 = this.aClass95_Sub3_5.method7116(false, 128, 128, Static276.anIntArray294);
				this.anInterface19_2.method3138(false, false);
			} else {
				this.anInterface19_2.method3130(0, 128, 0, 128, Static276.anIntArray294, 128);
			}
			return;
		}
		if (Static278.aByteArray50 == null) {
			Static278.aByteArray50 = new byte[16384];
		}
		@Pc(119) byte[] local119 = Static278.aByteArray50;
		for (local121 = -128; local121 < 0; local121++) {
			for (local125 = -128; local125 < 0; local125++) {
				if (local20[local37] == 0) {
					local140 = 0;
					if (local20[local37 - 1] != 0) {
						local140++;
					}
					if (local20[local37 + 1] != 0) {
						local140++;
					}
					if (local20[local37 - local26] != 0) {
						local140++;
					}
					if (local20[local37 + local26] != 0) {
						local140++;
					}
					local119[local50++] = (byte) (local140 * 17);
				} else {
					local119[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass122_1.anInt3112 - 128;
		}
		if (this.anInterface19_2 == null) {
			this.anInterface19_2 = this.aClass95_Sub3_5.method7031(false, 128, 128, Static278.aByteArray50, Static588.aClass188_15);
			this.anInterface19_2.method3138(false, false);
		} else {
			this.anInterface19_2.method3135(Static278.aByteArray50, Static588.aClass188_15, 128, 128, 128);
		}
	}
}
