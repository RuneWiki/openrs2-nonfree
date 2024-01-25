import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class338 {

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "Z")
	public boolean aBoolean752 = true;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
	private int anInt8868 = -1;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "Lclient!cba;")
	private final Class47 aClass47_2;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	private final int anInt8863;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
	private final int anInt8871;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_22;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
	public final int anInt8867;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!fj;")
	private Interface11 anInterface11_6;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	private int anInt8870;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	private int anInt8869;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "Lclient!ip;")
	private Interface13 anInterface13_8;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!um;Lclient!cba;Lclient!om;IIIII)V")
	public Class338(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class151_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass47_2 = arg1;
		this.anInt8863 = arg6;
		this.anInt8871 = arg7;
		this.aClass162_Sub1_22 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local50 = (local35 + local37) * arg2.anInt9572 + local31;
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray13[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt8867 = 0;
			this.anInterface11_6 = null;
		} else {
			this.anInt8870 = Integer.MIN_VALUE;
			this.anInt8869 = Integer.MAX_VALUE;
			this.anInterface13_8 = this.aClass162_Sub1_22.method3889(false);
			this.anInterface13_8.method7035(local27);
			for (local50 = 0; local50 < 4; local50++) {
				@Pc(119) Buffer local119 = this.anInterface13_8.method7034();
				if (local119 != null) {
					@Pc(127) Stream local127 = this.aClass162_Sub1_22.method3907(local119);
					@Pc(131) int local131;
					@Pc(144) int local144;
					@Pc(146) int local146;
					@Pc(154) short[] local154;
					@Pc(158) int local158;
					@Pc(166) int local166;
					if (Stream.b()) {
						for (local131 = 0; local131 < local25; local131++) {
							local144 = (local131 + local35) * arg2.anInt9572 + local31;
							for (local146 = 0; local146 < local25; local146++) {
								local154 = arg2.aShortArrayArray13[local144++];
								if (local154 != null) {
									for (local158 = 0; local158 < local154.length; local158++) {
										local166 = local154[local158] & 0xFFFF;
										if (this.anInt8870 < local166) {
											this.anInt8870 = local166;
										}
										if (this.anInt8869 > local166) {
											this.anInt8869 = local166;
										}
										local127.e(local166);
									}
								}
							}
						}
					} else {
						for (local131 = 0; local131 < local25; local131++) {
							local144 = (local35 + local131) * arg2.anInt9572 + local31;
							for (local146 = 0; local146 < local25; local146++) {
								local154 = arg2.aShortArrayArray13[local144++];
								if (local154 != null) {
									for (local158 = 0; local158 < local154.length; local158++) {
										local166 = local154[local158] & 0xFFFF;
										if (local166 < this.anInt8869) {
											this.anInt8869 = local166;
										}
										if (this.anInt8870 < local166) {
											this.anInt8870 = local166;
										}
										local127.b(local166);
									}
								}
							}
						}
					}
					local127.c();
					if (this.anInterface13_8.method7033()) {
						break;
					}
				}
			}
			this.anInt8867 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public void method7060() {
		this.method7065(this.anInterface13_8, this.anInt8867);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	private void method7061() {
		if (!this.aBoolean752) {
			return;
		}
		this.aBoolean752 = false;
		@Pc(16) byte[] local16 = this.aClass47_2.aByteArray19;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass47_2.anInt985;
		@Pc(32) int local32 = this.anInt8871 * this.aClass47_2.anInt985 + this.anInt8863;
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
		if (this.anInterface11_6 != null && local18 == this.anInt8868) {
			this.aBoolean752 = false;
			return;
		}
		this.anInt8868 = local18;
		local44 = 0;
		local32 = local22 * this.anInt8871 + this.anInt8863;
		@Pc(115) int local115;
		@Pc(119) int local119;
		@Pc(130) int local130;
		if (!this.aClass162_Sub1_22.method3847(Static398.aClass366_10, Static42.aClass35_4)) {
			if (Static485.anIntArray516 == null) {
				Static485.anIntArray516 = new int[16384];
			}
			@Pc(113) int[] local113 = Static485.anIntArray516;
			for (local115 = -128; local115 < 0; local115++) {
				for (local119 = -128; local119 < 0; local119++) {
					if (local16[local32] == 0) {
						local130 = 0;
						if (local16[local32 - 1] != 0) {
							local130++;
						}
						if (local16[local32 + 1] != 0) {
							local130++;
						}
						if (local16[local32 - local22] != 0) {
							local130++;
						}
						if (local16[local22 + local32] != 0) {
							local130++;
						}
						local113[local44++] = local130 * 17 << 24;
					} else {
						local113[local44++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass47_2.anInt985 - 128;
			}
			if (this.anInterface11_6 == null) {
				this.anInterface11_6 = this.aClass162_Sub1_22.method3904(128, 128, false, Static485.anIntArray516);
				this.anInterface11_6.method7639(false, false);
			} else {
				this.anInterface11_6.method7637(128, 0, Static485.anIntArray516, 128, 0, 128);
			}
			return;
		}
		if (Static343.aByteArray58 == null) {
			Static343.aByteArray58 = new byte[16384];
		}
		@Pc(241) byte[] local241 = Static343.aByteArray58;
		for (local115 = -128; local115 < 0; local115++) {
			for (local119 = -128; local119 < 0; local119++) {
				if (local16[local32] == 0) {
					local130 = 0;
					if (local16[local32 - 1] != 0) {
						local130++;
					}
					if (local16[local32 + 1] != 0) {
						local130++;
					}
					if (local16[local32 - local22] != 0) {
						local130++;
					}
					if (local16[local22 + local32] != 0) {
						local130++;
					}
					local241[local44++] = (byte) (local130 * 17);
				} else {
					local241[local44++] = 68;
				}
				local32++;
			}
			local32 += this.aClass47_2.anInt985 - 128;
		}
		if (this.anInterface11_6 == null) {
			this.anInterface11_6 = this.aClass162_Sub1_22.method3863(Static343.aByteArray58, 128, false, Static398.aClass366_10, 128);
			this.anInterface11_6.method7639(false, false);
		} else {
			this.anInterface11_6.method7641(128, 128, 128, Static343.aByteArray58, Static398.aClass366_10);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ip;II)V")
	public void method7065(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method7061();
			this.aClass162_Sub1_22.method3865(this.anInterface11_6);
			this.aClass162_Sub1_22.method3892(0, this.anInt8870 + 1 - this.anInt8869, Static523.aClass155_6, arg1, arg0, this.anInt8869);
		}
	}
}
