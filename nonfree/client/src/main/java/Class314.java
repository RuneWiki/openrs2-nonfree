import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class314 {

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "Z")
	public boolean aBoolean571 = true;

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
	private int anInt8797 = -1;

	@OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
	private final int anInt8798;

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "Lclient!qd;")
	private final Class261 aClass261_2;

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
	private final int anInt8790;

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_17;

	@OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
	private int anInt8789;

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
	private int anInt8792;

	@OriginalMember(owner = "client!tw", name = "r", descriptor = "Lclient!jn;")
	private Interface9 anInterface9_7;

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
	public final int anInt8793;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "Lclient!hr;")
	private Interface7 anInterface7_3;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!gj;Lclient!qd;Lclient!kb;IIIII)V")
	public Class314(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class46_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8798 = arg6;
		this.aClass261_2 = arg1;
		this.anInt8790 = arg7;
		this.aClass90_Sub3_17 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + arg2.anInt9997 * (local37 + local35);
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray19[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface7_3 = null;
			this.anInt8793 = 0;
		} else {
			this.anInt8789 = Integer.MAX_VALUE;
			this.anInt8792 = Integer.MIN_VALUE;
			this.anInterface9_7 = this.aClass90_Sub3_17.method7545(false);
			this.anInterface9_7.method5935(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(107) Buffer local107 = this.anInterface9_7.method6462();
				if (local107 != null) {
					@Pc(115) Stream local115 = this.aClass90_Sub3_17.method7595(local107);
					@Pc(119) int local119;
					@Pc(131) int local131;
					@Pc(133) int local133;
					@Pc(141) short[] local141;
					@Pc(145) int local145;
					@Pc(153) int local153;
					if (Stream.a()) {
						for (local119 = 0; local119 < local25; local119++) {
							local131 = local31 + (local119 + local35) * arg2.anInt9997;
							for (local133 = 0; local133 < local25; local133++) {
								local141 = arg2.aShortArrayArray19[local131++];
								if (local141 != null) {
									for (local145 = 0; local145 < local141.length; local145++) {
										local153 = local141[local145] & 0xFFFF;
										if (local153 < this.anInt8789) {
											this.anInt8789 = local153;
										}
										if (this.anInt8792 < local153) {
											this.anInt8792 = local153;
										}
										local115.e(local153);
									}
								}
							}
						}
					} else {
						for (local119 = 0; local119 < local25; local119++) {
							local131 = arg2.anInt9997 * (local35 + local119) + local31;
							for (local133 = 0; local133 < local25; local133++) {
								local141 = arg2.aShortArrayArray19[local131++];
								if (local141 != null) {
									for (local145 = 0; local145 < local141.length; local145++) {
										local153 = local141[local145] & 0xFFFF;
										if (local153 > this.anInt8792) {
											this.anInt8792 = local153;
										}
										if (this.anInt8789 > local153) {
											this.anInt8789 = local153;
										}
										local115.a(local153);
									}
								}
							}
						}
					}
					local115.b();
					if (this.anInterface9_7.method6460()) {
						break;
					}
				}
			}
			this.anInt8793 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!jn;IB)V")
	public void method7007(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method7010();
			this.aClass90_Sub3_17.method7624(this.anInterface7_3);
			this.aClass90_Sub3_17.method7560(this.anInt8792 + 1 - this.anInt8789, arg1, this.anInt8789, arg0, Static104.aClass321_1, 0);
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V")
	public void method7009() {
		this.method7007(this.anInterface9_7, this.anInt8793);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
	private void method7010() {
		if (!this.aBoolean571) {
			return;
		}
		this.aBoolean571 = false;
		@Pc(16) byte[] local16 = this.aClass261_2.aByteArray96;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass261_2.anInt7447;
		@Pc(32) int local32 = this.anInt8790 * this.aClass261_2.anInt7447 + this.anInt8798;
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
		if (this.anInterface7_3 != null && local18 == this.anInt8797) {
			this.aBoolean571 = false;
			return;
		}
		this.anInt8797 = local18;
		local32 = this.anInt8790 * local22 + this.anInt8798;
		local45 = 0;
		@Pc(105) int local105;
		@Pc(109) int local109;
		@Pc(127) int local127;
		if (!this.aClass90_Sub3_17.method7556(Static357.aClass171_12, Static407.aClass254_14)) {
			if (Static445.anIntArray564 == null) {
				Static445.anIntArray564 = new int[16384];
			}
			@Pc(103) int[] local103 = Static445.anIntArray564;
			for (local105 = -128; local105 < 0; local105++) {
				for (local109 = -128; local109 < 0; local109++) {
					if (local16[local32] == 0) {
						local127 = 0;
						if (local16[local32 - 1] != 0) {
							local127++;
						}
						if (local16[local32 + 1] != 0) {
							local127++;
						}
						if (local16[local32 - local22] != 0) {
							local127++;
						}
						if (local16[local32 + local22] != 0) {
							local127++;
						}
						local103[local45++] = local127 * 17 << 24;
					} else {
						local103[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass261_2.anInt7447 - 128;
			}
			if (this.anInterface7_3 == null) {
				this.anInterface7_3 = this.aClass90_Sub3_17.method7597(128, 128, Static445.anIntArray564, false);
				this.anInterface7_3.method7047(false, false);
			} else {
				this.anInterface7_3.method7048(0, 128, 0, 128, Static445.anIntArray564, 128);
			}
			return;
		}
		if (Static220.aByteArray55 == null) {
			Static220.aByteArray55 = new byte[16384];
		}
		@Pc(225) byte[] local225 = Static220.aByteArray55;
		for (local105 = -128; local105 < 0; local105++) {
			for (local109 = -128; local109 < 0; local109++) {
				if (local16[local32] == 0) {
					local127 = 0;
					if (local16[local32 - 1] != 0) {
						local127++;
					}
					if (local16[local32 + 1] != 0) {
						local127++;
					}
					if (local16[local32 - local22] != 0) {
						local127++;
					}
					if (local16[local22 + local32] != 0) {
						local127++;
					}
					local225[local45++] = (byte) (local127 * 17);
				} else {
					local225[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass261_2.anInt7447 - 128;
		}
		if (this.anInterface7_3 == null) {
			this.anInterface7_3 = this.aClass90_Sub3_17.method7622(Static220.aByteArray55, 128, false, Static357.aClass171_12, 128);
			this.anInterface7_3.method7047(false, false);
		} else {
			this.anInterface7_3.method7050(Static220.aByteArray55, 128, 128, Static357.aClass171_12, 128);
		}
	}
}
