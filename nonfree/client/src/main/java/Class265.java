import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class265 {

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
	private int anInt7229 = -1;

	@OriginalMember(owner = "client!pca", name = "l", descriptor = "Z")
	public boolean aBoolean517 = true;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_14;

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
	private final int anInt7225;

	@OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
	private final int anInt7231;

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "Lclient!vda;")
	private final Class358 aClass358_1;

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
	public final int anInt7227;

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "Lclient!rm;")
	private Interface20 anInterface20_5;

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
	private int anInt7226;

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
	private int anInt7233;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Lclient!oq;")
	private Interface14 anInterface14_7;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!pj;Lclient!vda;Lclient!vha;IIIII)V")
	public Class265(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(2) Class61_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass133_Sub1_14 = arg0;
		this.anInt7225 = arg7;
		this.anInt7231 = arg6;
		this.aClass358_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + arg2.anInt10026 * (local35 + local37);
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray39[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt7227 = 0;
			this.anInterface20_5 = null;
		} else {
			this.anInt7226 = Integer.MIN_VALUE;
			this.anInt7233 = Integer.MAX_VALUE;
			this.anInterface14_7 = this.aClass133_Sub1_14.method6281(false);
			this.anInterface14_7.method6764(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(117) Buffer local117 = this.anInterface14_7.method6770();
				if (local117 != null) {
					@Pc(125) Stream local125 = this.aClass133_Sub1_14.method6242(local117);
					@Pc(129) int local129;
					@Pc(140) int local140;
					@Pc(142) int local142;
					@Pc(150) short[] local150;
					@Pc(154) int local154;
					@Pc(162) int local162;
					if (Stream.a()) {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = local31 + arg2.anInt10026 * (local129 + local35);
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray39[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt7226 < local162) {
											this.anInt7226 = local162;
										}
										if (this.anInt7233 > local162) {
											this.anInt7233 = local162;
										}
										local125.f(local162);
									}
								}
							}
						}
					} else {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = arg2.anInt10026 * (local35 + local129) + local31;
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray39[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt7233 > local162) {
											this.anInt7233 = local162;
										}
										if (local162 > this.anInt7226) {
											this.anInt7226 = local162;
										}
										local125.e(local162);
									}
								}
							}
						}
					}
					local125.b();
					if (this.anInterface14_7.method6769()) {
						break;
					}
				}
			}
			this.anInt7227 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
	public void method6381() {
		this.method6383(this.anInt7227, this.anInterface14_7);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILclient!oq;)V")
	public void method6383(@OriginalArg(1) int arg0, @OriginalArg(2) Interface14 arg1) {
		if (arg0 > 0) {
			this.method6384();
			this.aClass133_Sub1_14.method6153(this.anInterface20_5);
			this.aClass133_Sub1_14.method6194(arg0, this.anInt7226 + 1 - this.anInt7233, this.anInt7233, arg1, 0, Static68.aClass303_2);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V")
	private void method6384() {
		if (!this.aBoolean517) {
			return;
		}
		this.aBoolean517 = false;
		@Pc(16) byte[] local16 = this.aClass358_1.aByteArray103;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass358_1.anInt9900;
		@Pc(32) int local32 = this.anInt7231 + this.anInt7225 * this.aClass358_1.anInt9900;
		@Pc(50) int local50;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (local50 = -128; local50 < 0; local50++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface20_5 != null && this.anInt7229 == local18) {
			this.aBoolean517 = false;
			return;
		}
		this.anInt7229 = local18;
		local50 = 0;
		local32 = this.anInt7225 * local22 + this.anInt7231;
		@Pc(114) int local114;
		@Pc(118) int local118;
		@Pc(136) int local136;
		if (!this.aClass133_Sub1_14.method6263(Static20.aClass19_4, Static356.aClass223_12)) {
			if (Static38.anIntArray504 == null) {
				Static38.anIntArray504 = new int[16384];
			}
			@Pc(249) int[] local249 = Static38.anIntArray504;
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
						local249[local50++] = local136 * 17 << 24;
					} else {
						local249[local50++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass358_1.anInt9900 - 128;
			}
			if (this.anInterface20_5 == null) {
				this.anInterface20_5 = this.aClass133_Sub1_14.method6181(128, false, 128, Static38.anIntArray504);
				this.anInterface20_5.method4639(false, false);
			} else {
				this.anInterface20_5.method4635(128, Static38.anIntArray504, 128, 128, 0, 0);
			}
			return;
		}
		if (Static109.aByteArray20 == null) {
			Static109.aByteArray20 = new byte[16384];
		}
		@Pc(112) byte[] local112 = Static109.aByteArray20;
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
					local112[local50++] = (byte) (local136 * 17);
				} else {
					local112[local50++] = 68;
				}
				local32++;
			}
			local32 += this.aClass358_1.anInt9900 - 128;
		}
		if (this.anInterface20_5 == null) {
			this.anInterface20_5 = this.aClass133_Sub1_14.method6257(Static109.aByteArray20, 128, false, Static356.aClass223_12, 128);
			this.anInterface20_5.method4639(false, false);
		} else {
			this.anInterface20_5.method4638(128, Static356.aClass223_12, 128, 128, Static109.aByteArray20);
		}
	}
}
