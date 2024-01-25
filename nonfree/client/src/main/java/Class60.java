import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class60 {

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	private int anInt1887 = -1;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
	private final int anInt1891;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_3;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Lclient!vh;")
	private final Class331 aClass331_1;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
	private final int anInt1886;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	public final int anInt1884;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "Lclient!ae;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
	private int anInt1885;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
	private int anInt1892;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "Lclient!tj;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!fo;Lclient!vh;Lclient!ow;IIIII)V")
	public Class60(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) Class62_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1891 = arg6;
		this.aClass9_Sub3_3 = arg0;
		this.aClass331_1 = arg1;
		this.anInt1886 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local35 + local37) * arg2.anInt9881 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray9[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt1884 = 0;
			this.anInterface1_1 = null;
		} else {
			this.anInt1885 = Integer.MIN_VALUE;
			this.anInt1892 = Integer.MAX_VALUE;
			this.anInterface21_1 = this.aClass9_Sub3_3.method5550(false);
			this.anInterface21_1.method5022(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(115) Buffer local115 = this.anInterface21_1.method6521();
				if (local115 != null) {
					@Pc(123) Stream local123 = this.aClass9_Sub3_3.method5524(local115);
					@Pc(127) int local127;
					@Pc(138) int local138;
					@Pc(140) int local140;
					@Pc(148) short[] local148;
					@Pc(152) int local152;
					@Pc(160) int local160;
					if (Stream.c()) {
						for (local127 = 0; local127 < local25; local127++) {
							local138 = (local127 + local35) * arg2.anInt9881 + local31;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray9[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (this.anInt1885 < local160) {
											this.anInt1885 = local160;
										}
										if (this.anInt1892 > local160) {
											this.anInt1892 = local160;
										}
										local123.c(local160);
									}
								}
							}
						}
					} else {
						for (local127 = 0; local127 < local25; local127++) {
							local138 = arg2.anInt9881 * (local35 + local127) + local31;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray9[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 > this.anInt1885) {
											this.anInt1885 = local160;
										}
										if (this.anInt1892 > local160) {
											this.anInt1892 = local160;
										}
										local123.d(local160);
									}
								}
							}
						}
					}
					local123.a();
					if (this.anInterface21_1.method6524()) {
						break;
					}
				}
			}
			this.anInt1884 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	private void method1692() {
		if (!this.aBoolean189) {
			return;
		}
		this.aBoolean189 = false;
		@Pc(26) byte[] local26 = this.aClass331_1.aByteArray122;
		@Pc(28) int local28 = 0;
		@Pc(32) int local32 = this.aClass331_1.anInt9333;
		@Pc(43) int local43 = this.anInt1891 + this.aClass331_1.anInt9333 * this.anInt1886;
		@Pc(55) int local55;
		for (@Pc(45) int local45 = -128; local45 < 0; local45++) {
			local28 = (local28 << 8) - local28;
			for (local55 = -128; local55 < 0; local55++) {
				if (local26[local43++] != 0) {
					local28++;
				}
			}
			local43 += local32 - 128;
		}
		if (this.anInterface1_1 != null && this.anInt1887 == local28) {
			this.aBoolean189 = false;
			return;
		}
		this.anInt1887 = local28;
		local55 = 0;
		local43 = this.anInt1891 + local32 * this.anInt1886;
		@Pc(119) int local119;
		@Pc(123) int local123;
		@Pc(141) int local141;
		if (!this.aClass9_Sub3_3.method5567(Static451.aClass333_14, Static336.aClass220_12)) {
			if (Static415.anIntArray558 == null) {
				Static415.anIntArray558 = new int[16384];
			}
			@Pc(246) int[] local246 = Static415.anIntArray558;
			for (local119 = -128; local119 < 0; local119++) {
				for (local123 = -128; local123 < 0; local123++) {
					if (local26[local43] == 0) {
						local141 = 0;
						if (local26[local43 - 1] != 0) {
							local141++;
						}
						if (local26[local43 + 1] != 0) {
							local141++;
						}
						if (local26[local43 - local32] != 0) {
							local141++;
						}
						if (local26[local43 + local32] != 0) {
							local141++;
						}
						local246[local55++] = local141 * 17 << 24;
					} else {
						local246[local55++] = 1140850688;
					}
					local43++;
				}
				local43 += this.aClass331_1.anInt9333 - 128;
			}
			if (this.anInterface1_1 == null) {
				this.anInterface1_1 = this.aClass9_Sub3_3.method5556(Static415.anIntArray558, 128, false, 128);
				this.anInterface1_1.method7753(false, false);
			} else {
				this.anInterface1_1.method7751(0, 128, 128, 0, 128, Static415.anIntArray558);
			}
			return;
		}
		if (Static334.aByteArray73 == null) {
			Static334.aByteArray73 = new byte[16384];
		}
		@Pc(117) byte[] local117 = Static334.aByteArray73;
		for (local119 = -128; local119 < 0; local119++) {
			for (local123 = -128; local123 < 0; local123++) {
				if (local26[local43] == 0) {
					local141 = 0;
					if (local26[local43 - 1] != 0) {
						local141++;
					}
					if (local26[local43 + 1] != 0) {
						local141++;
					}
					if (local26[local43 - local32] != 0) {
						local141++;
					}
					if (local26[local32 + local43] != 0) {
						local141++;
					}
					local117[local55++] = (byte) (local141 * 17);
				} else {
					local117[local55++] = 68;
				}
				local43++;
			}
			local43 += this.aClass331_1.anInt9333 - 128;
		}
		if (this.anInterface1_1 == null) {
			this.anInterface1_1 = this.aClass9_Sub3_3.method5572(Static451.aClass333_14, false, Static334.aByteArray73, 128, 128);
			this.anInterface1_1.method7753(false, false);
		} else {
			this.anInterface1_1.method7747(128, 128, Static334.aByteArray73, Static451.aClass333_14, 128);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	public void method1693() {
		this.method1694(this.anInterface21_1, this.anInt1884);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!tj;II)V")
	public void method1694(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method1692();
			this.aClass9_Sub3_3.method5494(this.anInterface1_1);
			this.aClass9_Sub3_3.method5539(0, this.anInt1892, Static492.aClass328_6, arg0, arg1, this.anInt1885 + 1 - this.anInt1892);
		}
	}
}
