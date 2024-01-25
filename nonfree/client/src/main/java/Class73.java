import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class73 {

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
	private int anInt1486 = -1;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "Z")
	public boolean aBoolean126 = true;

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "Lclient!vo;")
	private final Class382 aClass382_1;

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_7;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	private final int anInt1481;

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
	private final int anInt1489;

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
	private int anInt1480;

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
	private int anInt1482;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "Lclient!lp;")
	private Interface20 anInterface20_3;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
	public final int anInt1484;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "Lclient!ah;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!gca;Lclient!vo;Lclient!kb;IIIII)V")
	public Class73(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class382 arg1, @OriginalArg(2) Class84_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass382_1 = arg1;
		this.aClass100_Sub1_7 = arg0;
		this.anInt1481 = arg7;
		this.anInt1489 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local50 = local31 + (local37 + local35) * arg2.anInt8883;
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray16[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface2_1 = null;
			this.anInt1484 = 0;
		} else {
			this.anInt1480 = Integer.MAX_VALUE;
			this.anInt1482 = Integer.MIN_VALUE;
			this.anInterface20_3 = this.aClass100_Sub1_7.method7882(false);
			this.anInterface20_3.method7350(local27);
			for (local50 = 0; local50 < 4; local50++) {
				@Pc(117) Buffer local117 = this.anInterface20_3.method7347();
				if (local117 != null) {
					@Pc(125) Stream local125 = this.aClass100_Sub1_7.method7910(local117);
					@Pc(129) int local129;
					@Pc(141) int local141;
					@Pc(143) int local143;
					@Pc(151) short[] local151;
					@Pc(155) int local155;
					@Pc(163) int local163;
					if (Stream.c()) {
						for (local129 = 0; local129 < local25; local129++) {
							local141 = local31 + (local35 + local129) * arg2.anInt8883;
							for (local143 = 0; local143 < local25; local143++) {
								local151 = arg2.aShortArrayArray16[local141++];
								if (local151 != null) {
									for (local155 = 0; local155 < local151.length; local155++) {
										local163 = local151[local155] & 0xFFFF;
										if (local163 > this.anInt1482) {
											this.anInt1482 = local163;
										}
										if (this.anInt1480 > local163) {
											this.anInt1480 = local163;
										}
										local125.c(local163);
									}
								}
							}
						}
					} else {
						for (local129 = 0; local129 < local25; local129++) {
							local141 = arg2.anInt8883 * (local129 + local35) + local31;
							for (local143 = 0; local143 < local25; local143++) {
								local151 = arg2.aShortArrayArray16[local141++];
								if (local151 != null) {
									for (local155 = 0; local155 < local151.length; local155++) {
										local163 = local151[local155] & 0xFFFF;
										if (this.anInt1482 < local163) {
											this.anInt1482 = local163;
										}
										if (this.anInt1480 > local163) {
											this.anInt1480 = local163;
										}
										local125.f(local163);
									}
								}
							}
						}
					}
					local125.b();
					if (this.anInterface20_3.method7349()) {
						break;
					}
				}
			}
			this.anInt1484 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLclient!lp;I)V")
	public void method1381(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method1383();
			this.aClass100_Sub1_7.method7923(this.anInterface2_1);
			this.aClass100_Sub1_7.method7948(this.anInt1482 + 1 - this.anInt1480, this.anInt1480, 0, Static649.aClass187_6, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
	private void method1383() {
		if (!this.aBoolean126) {
			return;
		}
		this.aBoolean126 = false;
		@Pc(17) byte[] local17 = this.aClass382_1.aByteArray109;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = this.aClass382_1.anInt10527;
		@Pc(40) int local40 = this.anInt1489 + this.anInt1481 * this.aClass382_1.anInt10527;
		@Pc(53) int local53;
		for (@Pc(42) int local42 = -128; local42 < 0; local42++) {
			local26 = (local26 << 8) - local26;
			for (local53 = -128; local53 < 0; local53++) {
				if (local17[local40++] != 0) {
					local26++;
				}
			}
			local40 += local30 - 128;
		}
		if (this.anInterface2_1 != null && local26 == this.anInt1486) {
			this.aBoolean126 = false;
			return;
		}
		this.anInt1486 = local26;
		local53 = 0;
		local40 = this.anInt1481 * local30 + this.anInt1489;
		@Pc(140) int local140;
		@Pc(144) int local144;
		@Pc(163) int local163;
		if (!this.aClass100_Sub1_7.method7885(Static104.aClass86_8, Static624.aClass358_16)) {
			if (Static368.anIntArray360 == null) {
				Static368.anIntArray360 = new int[16384];
			}
			@Pc(138) int[] local138 = Static368.anIntArray360;
			for (local140 = -128; local140 < 0; local140++) {
				for (local144 = -128; local144 < 0; local144++) {
					if (local17[local40] == 0) {
						local163 = 0;
						if (local17[local40 - 1] != 0) {
							local163++;
						}
						if (local17[local40 + 1] != 0) {
							local163++;
						}
						if (local17[local40 - local30] != 0) {
							local163++;
						}
						if (local17[local30 + local40] != 0) {
							local163++;
						}
						local138[local53++] = local163 * 17 << 24;
					} else {
						local138[local53++] = 1140850688;
					}
					local40++;
				}
				local40 += this.aClass382_1.anInt10527 - 128;
			}
			if (this.anInterface2_1 == null) {
				this.anInterface2_1 = this.aClass100_Sub1_7.method7875(false, 128, Static368.anIntArray360, 128);
				this.anInterface2_1.method3687(false, false);
			} else {
				this.anInterface2_1.method3684(0, 128, Static368.anIntArray360, 128, 128, 0);
			}
			return;
		}
		if (Static362.aByteArray101 == null) {
			Static362.aByteArray101 = new byte[16384];
		}
		@Pc(279) byte[] local279 = Static362.aByteArray101;
		for (local140 = -128; local140 < 0; local140++) {
			for (local144 = -128; local144 < 0; local144++) {
				if (local17[local40] == 0) {
					local163 = 0;
					if (local17[local40 - 1] != 0) {
						local163++;
					}
					if (local17[local40 + 1] != 0) {
						local163++;
					}
					if (local17[local40 - local30] != 0) {
						local163++;
					}
					if (local17[local30 + local40] != 0) {
						local163++;
					}
					local279[local53++] = (byte) (local163 * 17);
				} else {
					local279[local53++] = 68;
				}
				local40++;
			}
			local40 += this.aClass382_1.anInt10527 - 128;
		}
		if (this.anInterface2_1 == null) {
			this.anInterface2_1 = this.aClass100_Sub1_7.method7944(Static362.aByteArray101, 128, Static624.aClass358_16, 128, false);
			this.anInterface2_1.method3687(false, false);
		} else {
			this.anInterface2_1.method3683(128, 128, Static624.aClass358_16, Static362.aByteArray101, 128);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
	public void method1384() {
		this.method1381(this.anInterface20_3, this.anInt1484);
	}
}
