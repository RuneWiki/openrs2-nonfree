import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class296 {

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "Z")
	public boolean aBoolean608 = true;

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
	private int anInt8647 = -1;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "Lclient!qs;")
	private final Class278 aClass278_2;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
	private final int anInt8646;

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_19;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	private final int anInt8645;

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "Lclient!co;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	public final int anInt8638;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
	private int anInt8639;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
	private int anInt8642;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Lclient!cda;")
	private Interface3 anInterface3_6;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!ifa;Lclient!qs;Lclient!jda;IIIII)V")
	public Class296(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) Class278 arg1, @OriginalArg(2) Class83_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass278_2 = arg1;
		this.anInt8646 = arg7;
		this.aClass44_Sub2_19 = arg0;
		this.anInt8645 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + (local35 + local37) * arg2.anInt8829;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray2[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface6_5 = null;
			this.anInt8638 = 0;
		} else {
			this.anInt8639 = Integer.MAX_VALUE;
			this.anInt8642 = Integer.MIN_VALUE;
			this.anInterface3_6 = this.aClass44_Sub2_19.method4245(false);
			this.anInterface3_6.method5228(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(121) Buffer local121 = this.anInterface3_6.method5235();
				if (local121 != null) {
					@Pc(129) Stream local129 = this.aClass44_Sub2_19.method4315(local121);
					@Pc(133) int local133;
					@Pc(145) int local145;
					@Pc(147) int local147;
					@Pc(155) short[] local155;
					@Pc(159) int local159;
					@Pc(167) int local167;
					if (Stream.b()) {
						for (local133 = 0; local133 < local25; local133++) {
							local145 = local31 + arg2.anInt8829 * (local133 + local35);
							for (local147 = 0; local147 < local25; local147++) {
								local155 = arg2.aShortArrayArray2[local145++];
								if (local155 != null) {
									for (local159 = 0; local159 < local155.length; local159++) {
										local167 = local155[local159] & 0xFFFF;
										if (local167 > this.anInt8642) {
											this.anInt8642 = local167;
										}
										if (this.anInt8639 > local167) {
											this.anInt8639 = local167;
										}
										local129.e(local167);
									}
								}
							}
						}
					} else {
						for (local133 = 0; local133 < local25; local133++) {
							local145 = local31 + arg2.anInt8829 * (local35 + local133);
							for (local147 = 0; local147 < local25; local147++) {
								local155 = arg2.aShortArrayArray2[local145++];
								if (local155 != null) {
									for (local159 = 0; local159 < local155.length; local159++) {
										local167 = local155[local159] & 0xFFFF;
										if (this.anInt8639 > local167) {
											this.anInt8639 = local167;
										}
										if (local167 > this.anInt8642) {
											this.anInt8642 = local167;
										}
										local129.f(local167);
									}
								}
							}
						}
					}
					local129.a();
					if (this.anInterface3_6.method5237()) {
						break;
					}
				}
			}
			this.anInt8638 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
	private void method7044() {
		if (!this.aBoolean608) {
			return;
		}
		this.aBoolean608 = false;
		@Pc(16) byte[] local16 = this.aClass278_2.aByteArray92;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass278_2.anInt8185;
		@Pc(32) int local32 = this.anInt8646 * this.aClass278_2.anInt8185 + this.anInt8645;
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
		if (this.anInterface6_5 != null && this.anInt8647 == local18) {
			this.aBoolean608 = false;
			return;
		}
		this.anInt8647 = local18;
		local32 = local22 * this.anInt8646 + this.anInt8645;
		local45 = 0;
		@Pc(105) int local105;
		@Pc(109) int local109;
		@Pc(120) int local120;
		if (!this.aClass44_Sub2_19.method4311(Static362.aClass97_41, Static53.aClass42_4)) {
			if (Static20.anIntArray13 == null) {
				Static20.anIntArray13 = new int[16384];
			}
			@Pc(103) int[] local103 = Static20.anIntArray13;
			for (local105 = -128; local105 < 0; local105++) {
				for (local109 = -128; local109 < 0; local109++) {
					if (local16[local32] == 0) {
						local120 = 0;
						if (local16[local32 - 1] != 0) {
							local120++;
						}
						if (local16[local32 + 1] != 0) {
							local120++;
						}
						if (local16[local32 - local22] != 0) {
							local120++;
						}
						if (local16[local32 + local22] != 0) {
							local120++;
						}
						local103[local45++] = local120 * 17 << 24;
					} else {
						local103[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass278_2.anInt8185 - 128;
			}
			if (this.anInterface6_5 == null) {
				this.anInterface6_5 = this.aClass44_Sub2_19.method4250(128, false, Static20.anIntArray13, 128);
				this.anInterface6_5.method8281(false, false);
			} else {
				this.anInterface6_5.method8287(128, 0, 128, Static20.anIntArray13, 0, 128);
			}
			return;
		}
		if (Static357.aByteArray83 == null) {
			Static357.aByteArray83 = new byte[16384];
		}
		@Pc(234) byte[] local234 = Static357.aByteArray83;
		for (local105 = -128; local105 < 0; local105++) {
			for (local109 = -128; local109 < 0; local109++) {
				if (local16[local32] == 0) {
					local120 = 0;
					if (local16[local32 - 1] != 0) {
						local120++;
					}
					if (local16[local32 + 1] != 0) {
						local120++;
					}
					if (local16[local32 - local22] != 0) {
						local120++;
					}
					if (local16[local22 + local32] != 0) {
						local120++;
					}
					local234[local45++] = (byte) (local120 * 17);
				} else {
					local234[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass278_2.anInt8185 - 128;
		}
		if (this.anInterface6_5 == null) {
			this.anInterface6_5 = this.aClass44_Sub2_19.method4337(128, false, Static357.aByteArray83, 128, Static362.aClass97_41);
			this.anInterface6_5.method8281(false, false);
		} else {
			this.anInterface6_5.method8286(128, 128, 128, Static362.aClass97_41, Static357.aByteArray83);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IILclient!cda;)V")
	public void method7045(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		if (arg0 > 0) {
			this.method7044();
			this.aClass44_Sub2_19.method4265(this.anInterface6_5);
			this.aClass44_Sub2_19.method4361(0, Static262.aClass271_5, arg0, this.anInt8639, this.anInt8642 + 1 - this.anInt8639, arg1);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public void method7049() {
		this.method7045(this.anInt8638, this.anInterface3_6);
	}
}
