import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class205 {

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
	private int anInt5938 = -1;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "Z")
	public boolean aBoolean438 = true;

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_14;

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
	private final int anInt5940;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
	private final int anInt5937;

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "Lclient!kda;")
	private final Class194 aClass194_1;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "Lclient!lba;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
	public final int anInt5936;

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
	private int anInt5935;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	private int anInt5939;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "Lclient!vv;")
	private Interface24 anInterface24_7;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!mj;Lclient!kda;Lclient!sl;IIIII)V")
	public Class205(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class18_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass101_Sub1_14 = arg0;
		this.anInt5940 = arg7;
		this.anInt5937 = arg6;
		this.aClass194_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = arg2.anInt9741 * (local35 + local37) + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray18[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface10_4 = null;
			this.anInt5936 = 0;
		} else {
			this.anInt5935 = Integer.MAX_VALUE;
			this.anInt5939 = Integer.MIN_VALUE;
			this.anInterface24_7 = this.aClass101_Sub1_14.method5941(false);
			this.anInterface24_7.method9031(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(115) Buffer local115 = this.anInterface24_7.method6460();
				if (local115 != null) {
					@Pc(123) Stream local123 = this.aClass101_Sub1_14.method5942(local115);
					@Pc(127) int local127;
					@Pc(138) int local138;
					@Pc(140) int local140;
					@Pc(148) short[] local148;
					@Pc(152) int local152;
					@Pc(160) int local160;
					if (Stream.c()) {
						for (local127 = 0; local127 < local25; local127++) {
							local138 = arg2.anInt9741 * (local127 + local35) + local31;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray18[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 > this.anInt5939) {
											this.anInt5939 = local160;
										}
										if (local160 < this.anInt5935) {
											this.anInt5935 = local160;
										}
										local123.c(local160);
									}
								}
							}
						}
					} else {
						for (local127 = 0; local127 < local25; local127++) {
							local138 = local31 + (local127 + local35) * arg2.anInt9741;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray18[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 < this.anInt5935) {
											this.anInt5935 = local160;
										}
										if (this.anInt5939 < local160) {
											this.anInt5939 = local160;
										}
										local123.a(local160);
									}
								}
							}
						}
					}
					local123.a();
					if (this.anInterface24_7.method6459()) {
						break;
					}
				}
			}
			this.anInt5936 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!vv;II)V")
	public void method5368(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method5370();
			this.aClass101_Sub1_14.method5909(this.anInterface10_4);
			this.aClass101_Sub1_14.method5947(this.anInt5935, this.anInt5939 + 1 - this.anInt5935, arg0, Static627.aClass320_6, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	private void method5370() {
		if (!this.aBoolean438) {
			return;
		}
		this.aBoolean438 = false;
		@Pc(16) byte[] local16 = this.aClass194_1.aByteArray45;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass194_1.anInt5546;
		@Pc(32) int local32 = this.anInt5940 * this.aClass194_1.anInt5546 + this.anInt5937;
		@Pc(51) int local51;
		for (@Pc(40) int local40 = -128; local40 < 0; local40++) {
			local18 = (local18 << 8) - local18;
			for (local51 = -128; local51 < 0; local51++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface10_4 != null && this.anInt5938 == local18) {
			this.aBoolean438 = false;
			return;
		}
		this.anInt5938 = local18;
		local32 = this.anInt5937 + local22 * this.anInt5940;
		local51 = 0;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(137) int local137;
		if (!this.aClass101_Sub1_14.method5850(Static612.aClass244_15, Static114.aClass79_7)) {
			if (Static188.anIntArray418 == null) {
				Static188.anIntArray418 = new int[16384];
			}
			@Pc(242) int[] local242 = Static188.anIntArray418;
			for (local122 = -128; local122 < 0; local122++) {
				for (local126 = -128; local126 < 0; local126++) {
					if (local16[local32] == 0) {
						local137 = 0;
						if (local16[local32 - 1] != 0) {
							local137++;
						}
						if (local16[local32 + 1] != 0) {
							local137++;
						}
						if (local16[local32 - local22] != 0) {
							local137++;
						}
						if (local16[local22 + local32] != 0) {
							local137++;
						}
						local242[local51++] = local137 * 17 << 24;
					} else {
						local242[local51++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass194_1.anInt5546 - 128;
			}
			if (this.anInterface10_4 == null) {
				this.anInterface10_4 = this.aClass101_Sub1_14.method5833(128, 128, Static188.anIntArray418, false);
				this.anInterface10_4.method9107(false, false);
			} else {
				this.anInterface10_4.method9108(128, 0, Static188.anIntArray418, 128, 128, 0);
			}
			return;
		}
		if (Static11.aByteArray4 == null) {
			Static11.aByteArray4 = new byte[16384];
		}
		@Pc(120) byte[] local120 = Static11.aByteArray4;
		for (local122 = -128; local122 < 0; local122++) {
			for (local126 = -128; local126 < 0; local126++) {
				if (local16[local32] == 0) {
					local137 = 0;
					if (local16[local32 - 1] != 0) {
						local137++;
					}
					if (local16[local32 + 1] != 0) {
						local137++;
					}
					if (local16[local32 - local22] != 0) {
						local137++;
					}
					if (local16[local22 + local32] != 0) {
						local137++;
					}
					local120[local51++] = (byte) (local137 * 17);
				} else {
					local120[local51++] = 68;
				}
				local32++;
			}
			local32 += this.aClass194_1.anInt5546 - 128;
		}
		if (this.anInterface10_4 == null) {
			this.anInterface10_4 = this.aClass101_Sub1_14.method5917(Static612.aClass244_15, false, 128, Static11.aByteArray4, 128);
			this.anInterface10_4.method9107(false, false);
		} else {
			this.anInterface10_4.method9106(Static612.aClass244_15, Static11.aByteArray4, 128, 128, 128);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V")
	public void method5372() {
		this.method5368(this.anInterface24_7, this.anInt5936);
	}
}
