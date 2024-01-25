import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class185 {

	@OriginalMember(owner = "client!k", name = "G", descriptor = "[Lclient!gga;")
	private static final Class126[] aClass126Array1 = new Class126[32];

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Z")
	public boolean aBoolean395 = true;

	@OriginalMember(owner = "client!k", name = "t", descriptor = "I")
	private int anInt5437 = -1;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	private final int anInt5430;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_12;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!aca;")
	private final Class5 aClass5_2;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	private final int anInt5431;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public final int anInt5425;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!dg;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	private int anInt5427;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	private int anInt5426;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!js;")
	private Interface12 anInterface12_5;

	static {
		@Pc(77) Class126[] local77 = Static572.method8038();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass126Array1[local77[local79].anInt3445] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!rl;Lclient!aca;Lclient!eha;IIIII)V")
	public Class185(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class91_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5430 = arg7;
		this.aClass82_Sub3_12 = arg0;
		this.aClass5_2 = arg1;
		this.anInt5431 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = arg2.anInt8983 * (local37 + local35) + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray3[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt5425 = 0;
			this.anInterface6_1 = null;
		} else {
			this.anInt5427 = Integer.MAX_VALUE;
			this.anInt5426 = Integer.MIN_VALUE;
			this.anInterface12_5 = this.aClass82_Sub3_12.method4985(false);
			this.anInterface12_5.method7563(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(114) Buffer local114 = this.anInterface12_5.method7573();
				if (local114 != null) {
					@Pc(122) Stream local122 = this.aClass82_Sub3_12.method4986(local114);
					@Pc(126) int local126;
					@Pc(138) int local138;
					@Pc(140) int local140;
					@Pc(148) short[] local148;
					@Pc(152) int local152;
					@Pc(160) int local160;
					if (Stream.c()) {
						for (local126 = 0; local126 < local25; local126++) {
							local138 = arg2.anInt8983 * (local126 + local35) + local31;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray3[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 > this.anInt5426) {
											this.anInt5426 = local160;
										}
										if (this.anInt5427 > local160) {
											this.anInt5427 = local160;
										}
										local122.c(local160);
									}
								}
							}
						}
					} else {
						for (local126 = 0; local126 < local25; local126++) {
							local138 = (local126 + local35) * arg2.anInt8983 + local31;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray3[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (this.anInt5426 < local160) {
											this.anInt5426 = local160;
										}
										if (local160 < this.anInt5427) {
											this.anInt5427 = local160;
										}
										local122.f(local160);
									}
								}
							}
						}
					}
					local122.b();
					if (this.anInterface12_5.method7574()) {
						break;
					}
				}
			}
			this.anInt5425 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	private void method4604() {
		if (!this.aBoolean395) {
			return;
		}
		this.aBoolean395 = false;
		@Pc(16) byte[] local16 = this.aClass5_2.aByteArray1;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass5_2.anInt89;
		@Pc(32) int local32 = this.anInt5430 * this.aClass5_2.anInt89 + this.anInt5431;
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
		if (this.anInterface6_1 != null && local18 == this.anInt5437) {
			this.aBoolean395 = false;
			return;
		}
		this.anInt5437 = local18;
		local32 = this.anInt5431 + this.anInt5430 * local22;
		local44 = 0;
		@Pc(114) int local114;
		@Pc(118) int local118;
		@Pc(136) int local136;
		if (!this.aClass82_Sub3_12.method5005(Static280.aClass182_8, Static491.aClass168_11)) {
			if (Static127.anIntArray172 == null) {
				Static127.anIntArray172 = new int[16384];
			}
			@Pc(112) int[] local112 = Static127.anIntArray172;
			for (local114 = -128; local114 < 0; local114++) {
				for (local118 = -128; local118 < 0; local118++) {
					if (local16[local32] == 0) {
						local136 = 0;
						if (local16[local32 - 1] != 0) {
							local136++;
						}
						if (local16[local32 + 1] != 0) {
							local136++;
						}
						if (local16[local32 - local22] != 0) {
							local136++;
						}
						if (local16[local22 + local32] != 0) {
							local136++;
						}
						local112[local44++] = local136 * 17 << 24;
					} else {
						local112[local44++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass5_2.anInt89 - 128;
			}
			if (this.anInterface6_1 == null) {
				this.anInterface6_1 = this.aClass82_Sub3_12.method5022(Static127.anIntArray172, 128, false, 128);
				this.anInterface6_1.method8506(false, false);
			} else {
				this.anInterface6_1.method8507(128, 128, Static127.anIntArray172, 0, 128, 0);
			}
			return;
		}
		if (Static395.aByteArray62 == null) {
			Static395.aByteArray62 = new byte[16384];
		}
		@Pc(239) byte[] local239 = Static395.aByteArray62;
		for (local114 = -128; local114 < 0; local114++) {
			for (local118 = -128; local118 < 0; local118++) {
				if (local16[local32] == 0) {
					local136 = 0;
					if (local16[local32 - 1] != 0) {
						local136++;
					}
					if (local16[local32 + 1] != 0) {
						local136++;
					}
					if (local16[local32 - local22] != 0) {
						local136++;
					}
					if (local16[local32 + local22] != 0) {
						local136++;
					}
					local239[local44++] = (byte) (local136 * 17);
				} else {
					local239[local44++] = 68;
				}
				local32++;
			}
			local32 += this.aClass5_2.anInt89 - 128;
		}
		if (this.anInterface6_1 == null) {
			this.anInterface6_1 = this.aClass82_Sub3_12.method4934(Static491.aClass168_11, 128, false, Static395.aByteArray62, 128);
			this.anInterface6_1.method8506(false, false);
		} else {
			this.anInterface6_1.method8505(128, 128, Static491.aClass168_11, Static395.aByteArray62, 128);
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V")
	public void method4607() {
		this.method4608(this.anInterface12_5, this.anInt5425);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!js;BI)V")
	public void method4608(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method4604();
			this.aClass82_Sub3_12.method4972(this.anInterface6_1);
			this.aClass82_Sub3_12.method4993(this.anInt5426 + 1 - this.anInt5427, arg0, Static525.aClass376_6, arg1, this.anInt5427, 0);
		}
	}
}
