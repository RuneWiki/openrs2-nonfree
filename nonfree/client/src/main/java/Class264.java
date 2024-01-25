import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class264 {

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
	private int anInt7986 = -1;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "Z")
	public boolean aBoolean677 = true;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
	private final int anInt7982;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
	private final int anInt7983;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "Lclient!jga;")
	private final Class158 aClass158_1;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_16;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "Lclient!baa;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public final int anInt7985;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
	private int anInt7991;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	private int anInt7988;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "Lclient!ru;")
	private Interface23 anInterface23_8;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!bm;Lclient!jga;Lclient!up;IIIII)V")
	public Class264(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class274_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7982 = arg6;
		this.anInt7983 = arg7;
		this.aClass158_1 = arg1;
		this.aClass33_Sub1_16 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + arg2.anInt9726 * (local35 + local37);
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray20[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface2_4 = null;
			this.anInt7985 = 0;
		} else {
			this.anInt7991 = Integer.MAX_VALUE;
			this.anInt7988 = Integer.MIN_VALUE;
			this.anInterface23_8 = this.aClass33_Sub1_16.method1998(false);
			this.anInterface23_8.method7624(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(114) Buffer local114 = this.anInterface23_8.method4807();
				if (local114 != null) {
					@Pc(122) Stream local122 = this.aClass33_Sub1_16.method2092(local114);
					@Pc(126) int local126;
					@Pc(137) int local137;
					@Pc(139) int local139;
					@Pc(147) short[] local147;
					@Pc(151) int local151;
					@Pc(159) int local159;
					if (Stream.b()) {
						for (local126 = 0; local126 < local25; local126++) {
							local137 = arg2.anInt9726 * (local35 + local126) + local31;
							for (local139 = 0; local139 < local25; local139++) {
								local147 = arg2.aShortArrayArray20[local137++];
								if (local147 != null) {
									for (local151 = 0; local151 < local147.length; local151++) {
										local159 = local147[local151] & 0xFFFF;
										if (local159 > this.anInt7988) {
											this.anInt7988 = local159;
										}
										if (local159 < this.anInt7991) {
											this.anInt7991 = local159;
										}
										local122.e(local159);
									}
								}
							}
						}
					} else {
						for (local126 = 0; local126 < local25; local126++) {
							local137 = local31 + (local126 + local35) * arg2.anInt9726;
							for (local139 = 0; local139 < local25; local139++) {
								local147 = arg2.aShortArrayArray20[local137++];
								if (local147 != null) {
									for (local151 = 0; local151 < local147.length; local151++) {
										local159 = local147[local151] & 0xFFFF;
										if (local159 < this.anInt7991) {
											this.anInt7991 = local159;
										}
										if (this.anInt7988 < local159) {
											this.anInt7988 = local159;
										}
										local122.a(local159);
									}
								}
							}
						}
					}
					local122.a();
					if (this.anInterface23_8.method4806()) {
						break;
					}
				}
			}
			this.anInt7985 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V")
	private void method6671() {
		if (!this.aBoolean677) {
			return;
		}
		this.aBoolean677 = false;
		@Pc(16) byte[] local16 = this.aClass158_1.aByteArray62;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass158_1.anInt5724;
		@Pc(32) int local32 = this.anInt7983 * this.aClass158_1.anInt5724 + this.anInt7982;
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
		if (this.anInterface2_4 != null && local18 == this.anInt7986) {
			this.aBoolean677 = false;
			return;
		}
		this.anInt7986 = local18;
		local32 = this.anInt7982 + local22 * this.anInt7983;
		local44 = 0;
		@Pc(109) int local109;
		@Pc(113) int local113;
		@Pc(128) int local128;
		if (!this.aClass33_Sub1_16.method2007(Static137.aClass89_8, Static104.aClass82_3)) {
			if (Static166.anIntArray213 == null) {
				Static166.anIntArray213 = new int[16384];
			}
			@Pc(107) int[] local107 = Static166.anIntArray213;
			for (local109 = -128; local109 < 0; local109++) {
				for (local113 = -128; local113 < 0; local113++) {
					if (local16[local32] == 0) {
						local128 = 0;
						if (local16[local32 - 1] != 0) {
							local128++;
						}
						if (local16[local32 + 1] != 0) {
							local128++;
						}
						if (local16[local32 - local22] != 0) {
							local128++;
						}
						if (local16[local22 + local32] != 0) {
							local128++;
						}
						local107[local44++] = local128 * 17 << 24;
					} else {
						local107[local44++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass158_1.anInt5724 - 128;
			}
			if (this.anInterface2_4 == null) {
				this.anInterface2_4 = this.aClass33_Sub1_16.method2023(Static166.anIntArray213, false, 128, 128);
				this.anInterface2_4.method6506(false, false);
			} else {
				this.anInterface2_4.method6500(128, 128, 0, Static166.anIntArray213, 0, 128);
			}
			return;
		}
		if (Static78.aByteArray9 == null) {
			Static78.aByteArray9 = new byte[16384];
		}
		@Pc(232) byte[] local232 = Static78.aByteArray9;
		for (local109 = -128; local109 < 0; local109++) {
			for (local113 = -128; local113 < 0; local113++) {
				if (local16[local32] == 0) {
					local128 = 0;
					if (local16[local32 - 1] != 0) {
						local128++;
					}
					if (local16[local32 + 1] != 0) {
						local128++;
					}
					if (local16[local32 - local22] != 0) {
						local128++;
					}
					if (local16[local22 + local32] != 0) {
						local128++;
					}
					local232[local44++] = (byte) (local128 * 17);
				} else {
					local232[local44++] = 68;
				}
				local32++;
			}
			local32 += this.aClass158_1.anInt5724 - 128;
		}
		if (this.anInterface2_4 == null) {
			this.anInterface2_4 = this.aClass33_Sub1_16.method1992(128, 128, Static78.aByteArray9, false, Static104.aClass82_3);
			this.anInterface2_4.method6506(false, false);
		} else {
			this.anInterface2_4.method6499(Static78.aByteArray9, 128, 128, Static104.aClass82_3, 128);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILclient!ru;)V")
	public void method6672(@OriginalArg(1) int arg0, @OriginalArg(2) Interface23 arg1) {
		if (arg0 > 0) {
			this.method6671();
			this.aClass33_Sub1_16.method1987(this.anInterface2_4);
			this.aClass33_Sub1_16.method2091(this.anInt7991, Static338.aClass304_5, 0, arg0, arg1, this.anInt7988 + 1 - this.anInt7991);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public void method6674() {
		this.method6672(this.anInt7985, this.anInterface23_8);
	}
}
