import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class211 {

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Z")
	public boolean aBoolean470 = true;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	private int anInt5884 = -1;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	private final int anInt5882;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	private final int anInt5881;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_14;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "Lclient!tea;")
	private final Class316 aClass316_2;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
	private int anInt5883;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	private int anInt5879;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "Lclient!hh;")
	private Interface11 anInterface11_6;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	public final int anInt5885;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "Lclient!ls;")
	private Interface14 anInterface14_5;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!en;Lclient!tea;Lclient!daa;IIIII)V")
	public Class211(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class316 arg1, @OriginalArg(2) Class67_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5882 = arg6;
		this.anInt5881 = arg7;
		this.aClass100_Sub1_14 = arg0;
		this.aClass316_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + (local37 + local35) * arg2.anInt8111;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray1[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface14_5 = null;
			this.anInt5885 = 0;
		} else {
			this.anInt5883 = Integer.MIN_VALUE;
			this.anInt5879 = Integer.MAX_VALUE;
			this.anInterface11_6 = this.aClass100_Sub1_14.method4777(false);
			this.anInterface11_6.method4117(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(107) Buffer local107 = this.anInterface11_6.method4114();
				if (local107 != null) {
					@Pc(115) Stream local115 = this.aClass100_Sub1_14.method4834(local107);
					@Pc(119) int local119;
					@Pc(130) int local130;
					@Pc(132) int local132;
					@Pc(140) short[] local140;
					@Pc(144) int local144;
					@Pc(152) int local152;
					if (Stream.a()) {
						for (local119 = 0; local119 < local25; local119++) {
							local130 = arg2.anInt8111 * (local119 + local35) + local31;
							for (local132 = 0; local132 < local25; local132++) {
								local140 = arg2.aShortArrayArray1[local130++];
								if (local140 != null) {
									for (local144 = 0; local144 < local140.length; local144++) {
										local152 = local140[local144] & 0xFFFF;
										if (local152 < this.anInt5879) {
											this.anInt5879 = local152;
										}
										if (local152 > this.anInt5883) {
											this.anInt5883 = local152;
										}
										local115.c(local152);
									}
								}
							}
						}
					} else {
						for (local119 = 0; local119 < local25; local119++) {
							local130 = local31 + arg2.anInt8111 * (local119 + local35);
							for (local132 = 0; local132 < local25; local132++) {
								local140 = arg2.aShortArrayArray1[local130++];
								if (local140 != null) {
									for (local144 = 0; local144 < local140.length; local144++) {
										local152 = local140[local144] & 0xFFFF;
										if (local152 > this.anInt5883) {
											this.anInt5883 = local152;
										}
										if (this.anInt5879 > local152) {
											this.anInt5879 = local152;
										}
										local115.e(local152);
									}
								}
							}
						}
					}
					local115.c();
					if (this.anInterface11_6.method4118()) {
						break;
					}
				}
			}
			this.anInt5885 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!hh;)V")
	public void method4890(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		if (arg0 > 0) {
			this.method4893();
			this.aClass100_Sub1_14.method4876(this.anInterface14_5);
			this.aClass100_Sub1_14.method4764(this.anInt5883 + 1 - this.anInt5879, Static341.aClass213_5, 0, arg0, this.anInt5879, arg1);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public void method4891() {
		this.method4890(this.anInt5885, this.anInterface11_6);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V")
	private void method4893() {
		if (!this.aBoolean470) {
			return;
		}
		this.aBoolean470 = false;
		@Pc(16) byte[] local16 = this.aClass316_2.aByteArray84;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass316_2.anInt8457;
		@Pc(32) int local32 = this.aClass316_2.anInt8457 * this.anInt5881 + this.anInt5882;
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
		if (this.anInterface14_5 != null && this.anInt5884 == local18) {
			this.aBoolean470 = false;
			return;
		}
		this.anInt5884 = local18;
		local32 = this.anInt5882 + local22 * this.anInt5881;
		local45 = 0;
		@Pc(114) int local114;
		@Pc(118) int local118;
		@Pc(129) int local129;
		if (!this.aClass100_Sub1_14.method4794(Static47.aClass42_4, Static104.aClass88_3)) {
			if (Static476.anIntArray579 == null) {
				Static476.anIntArray579 = new int[16384];
			}
			@Pc(238) int[] local238 = Static476.anIntArray579;
			for (local114 = -128; local114 < 0; local114++) {
				for (local118 = -128; local118 < 0; local118++) {
					if (local16[local32] == 0) {
						local129 = 0;
						if (local16[local32 - 1] != 0) {
							local129++;
						}
						if (local16[local32 + 1] != 0) {
							local129++;
						}
						if (local16[local32 - local22] != 0) {
							local129++;
						}
						if (local16[local32 + local22] != 0) {
							local129++;
						}
						local238[local45++] = local129 * 17 << 24;
					} else {
						local238[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass316_2.anInt8457 - 128;
			}
			if (this.anInterface14_5 == null) {
				this.anInterface14_5 = this.aClass100_Sub1_14.method4838(128, false, 128, Static476.anIntArray579);
				this.anInterface14_5.method7067(false, false);
			} else {
				this.anInterface14_5.method7069(128, Static476.anIntArray579, 0, 128, 128, 0);
			}
			return;
		}
		if (Static559.aByteArray97 == null) {
			Static559.aByteArray97 = new byte[16384];
		}
		@Pc(112) byte[] local112 = Static559.aByteArray97;
		for (local114 = -128; local114 < 0; local114++) {
			for (local118 = -128; local118 < 0; local118++) {
				if (local16[local32] == 0) {
					local129 = 0;
					if (local16[local32 - 1] != 0) {
						local129++;
					}
					if (local16[local32 + 1] != 0) {
						local129++;
					}
					if (local16[local32 - local22] != 0) {
						local129++;
					}
					if (local16[local32 + local22] != 0) {
						local129++;
					}
					local112[local45++] = (byte) (local129 * 17);
				} else {
					local112[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass316_2.anInt8457 - 128;
		}
		if (this.anInterface14_5 == null) {
			this.anInterface14_5 = this.aClass100_Sub1_14.method4869(Static559.aByteArray97, 128, 128, Static104.aClass88_3, false);
			this.anInterface14_5.method7067(false, false);
		} else {
			this.anInterface14_5.method7066(Static559.aByteArray97, Static104.aClass88_3, 128, 128, 128);
		}
	}
}
