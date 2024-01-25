import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class150 {

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
	private int anInt4093 = -1;

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "Z")
	public boolean aBoolean315 = true;

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_12;

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "Lclient!wp;")
	private final Class361 aClass361_1;

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
	private final int anInt4095;

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
	private final int anInt4097;

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "Lclient!oi;")
	private Interface14 anInterface14_3;

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
	public final int anInt4100;

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
	private int anInt4096;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
	private int anInt4098;

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "Lclient!rn;")
	private Interface20 anInterface20_4;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!hea;Lclient!wp;Lclient!ni;IIIII)V")
	public Class150(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class47_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass134_Sub1_12 = arg0;
		this.aClass361_1 = arg1;
		this.anInt4095 = arg6;
		this.anInt4097 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = (local37 + local35) * arg2.anInt9209 + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray3[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface14_3 = null;
			this.anInt4100 = 0;
		} else {
			this.anInt4096 = Integer.MIN_VALUE;
			this.anInt4098 = Integer.MAX_VALUE;
			this.anInterface20_4 = this.aClass134_Sub1_12.method6804(false);
			this.anInterface20_4.method7376(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(117) Buffer local117 = this.anInterface20_4.method7387();
				if (local117 != null) {
					@Pc(125) Stream local125 = this.aClass134_Sub1_12.method6846(local117);
					@Pc(129) int local129;
					@Pc(140) int local140;
					@Pc(142) int local142;
					@Pc(150) short[] local150;
					@Pc(154) int local154;
					@Pc(162) int local162;
					if (Stream.c()) {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = local31 + (local129 + local35) * arg2.anInt9209;
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray3[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt4096 < local162) {
											this.anInt4096 = local162;
										}
										if (local162 < this.anInt4098) {
											this.anInt4098 = local162;
										}
										local125.c(local162);
									}
								}
							}
						}
					} else {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = local31 + arg2.anInt9209 * (local35 + local129);
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray3[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt4096 < local162) {
											this.anInt4096 = local162;
										}
										if (local162 < this.anInt4098) {
											this.anInt4098 = local162;
										}
										local125.a(local162);
									}
								}
							}
						}
					}
					local125.a();
					if (this.anInterface20_4.method7389()) {
						break;
					}
				}
			}
			this.anInt4100 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
	private void method3320() {
		if (!this.aBoolean315) {
			return;
		}
		this.aBoolean315 = false;
		@Pc(16) byte[] local16 = this.aClass361_1.aByteArray103;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass361_1.anInt9592;
		@Pc(32) int local32 = this.anInt4095 + this.anInt4097 * this.aClass361_1.anInt9592;
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
		if (this.anInterface14_3 != null && this.anInt4093 == local18) {
			this.aBoolean315 = false;
			return;
		}
		this.anInt4093 = local18;
		local32 = this.anInt4097 * local22 + this.anInt4095;
		local51 = 0;
		@Pc(115) int local115;
		@Pc(119) int local119;
		@Pc(134) int local134;
		if (!this.aClass134_Sub1_12.method6820(Static215.aClass155_10, Static194.aClass203_8)) {
			if (Static107.anIntArray151 == null) {
				Static107.anIntArray151 = new int[16384];
			}
			@Pc(113) int[] local113 = Static107.anIntArray151;
			for (local115 = -128; local115 < 0; local115++) {
				for (local119 = -128; local119 < 0; local119++) {
					if (local16[local32] == 0) {
						local134 = 0;
						if (local16[local32 - 1] != 0) {
							local134++;
						}
						if (local16[local32 + 1] != 0) {
							local134++;
						}
						if (local16[local32 - local22] != 0) {
							local134++;
						}
						if (local16[local22 + local32] != 0) {
							local134++;
						}
						local113[local51++] = local134 * 17 << 24;
					} else {
						local113[local51++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass361_1.anInt9592 - 128;
			}
			if (this.anInterface14_3 == null) {
				this.anInterface14_3 = this.aClass134_Sub1_12.method6821(128, false, Static107.anIntArray151, 128);
				this.anInterface14_3.method2130(false, false);
			} else {
				this.anInterface14_3.method2134(128, 0, 128, Static107.anIntArray151, 0, 128);
			}
			return;
		}
		if (Static317.aByteArray65 == null) {
			Static317.aByteArray65 = new byte[16384];
		}
		@Pc(235) byte[] local235 = Static317.aByteArray65;
		for (local115 = -128; local115 < 0; local115++) {
			for (local119 = -128; local119 < 0; local119++) {
				if (local16[local32] == 0) {
					local134 = 0;
					if (local16[local32 - 1] != 0) {
						local134++;
					}
					if (local16[local32 + 1] != 0) {
						local134++;
					}
					if (local16[local32 - local22] != 0) {
						local134++;
					}
					if (local16[local32 + local22] != 0) {
						local134++;
					}
					local235[local51++] = (byte) (local134 * 17);
				} else {
					local235[local51++] = 68;
				}
				local32++;
			}
			local32 += this.aClass361_1.anInt9592 - 128;
		}
		if (this.anInterface14_3 == null) {
			this.anInterface14_3 = this.aClass134_Sub1_12.method6753(false, Static194.aClass203_8, 128, Static317.aByteArray65, 128);
			this.anInterface14_3.method2130(false, false);
		} else {
			this.anInterface14_3.method2131(Static194.aClass203_8, 128, 128, 128, Static317.aByteArray65);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
	public void method3322() {
		this.method3323(this.anInterface20_4, this.anInt4100);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!rn;BI)V")
	public void method3323(@OriginalArg(0) Interface20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method3320();
			this.aClass134_Sub1_12.method6766(this.anInterface14_3);
			this.aClass134_Sub1_12.method6765(Static470.aClass185_5, arg1, this.anInt4098, arg0, this.anInt4096 + 1 - this.anInt4098, 0);
		}
	}
}
