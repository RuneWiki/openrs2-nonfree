import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class71 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	private int anInt1955 = -1;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private final int anInt1956;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!ee;")
	private final Class95_Sub1 aClass95_Sub1_6;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	private final int anInt1953;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "Lclient!jaa;")
	private final Class170 aClass170_1;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!fk;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public final int anInt1945;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt1957;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "I")
	private int anInt1948;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Lclient!ra;")
	private Interface22 anInterface22_3;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!ee;Lclient!jaa;Lclient!qq;IIIII)V")
	public Class71(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) Class35_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1956 = arg7;
		this.aClass95_Sub1_6 = arg0;
		this.anInt1953 = arg6;
		this.aClass170_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + (local35 + local37) * arg2.anInt9149;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray10[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface8_3 = null;
			this.anInt1945 = 0;
		} else {
			this.anInt1957 = Integer.MIN_VALUE;
			this.anInt1948 = Integer.MAX_VALUE;
			this.anInterface22_3 = this.aClass95_Sub1_6.method8115(false);
			this.anInterface22_3.method7408(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(110) Buffer local110 = this.anInterface22_3.method7405();
				if (local110 != null) {
					@Pc(118) Stream local118 = this.aClass95_Sub1_6.method8157(local110);
					@Pc(122) int local122;
					@Pc(133) int local133;
					@Pc(135) int local135;
					@Pc(143) short[] local143;
					@Pc(147) int local147;
					@Pc(155) int local155;
					if (Stream.b()) {
						for (local122 = 0; local122 < local25; local122++) {
							local133 = local31 + (local35 + local122) * arg2.anInt9149;
							for (local135 = 0; local135 < local25; local135++) {
								local143 = arg2.aShortArrayArray10[local133++];
								if (local143 != null) {
									for (local147 = 0; local147 < local143.length; local147++) {
										local155 = local143[local147] & 0xFFFF;
										if (this.anInt1957 < local155) {
											this.anInt1957 = local155;
										}
										if (this.anInt1948 > local155) {
											this.anInt1948 = local155;
										}
										local118.a(local155);
									}
								}
							}
						}
					} else {
						for (local122 = 0; local122 < local25; local122++) {
							local133 = arg2.anInt9149 * (local35 + local122) + local31;
							for (local135 = 0; local135 < local25; local135++) {
								local143 = arg2.aShortArrayArray10[local133++];
								if (local143 != null) {
									for (local147 = 0; local147 < local143.length; local147++) {
										local155 = local143[local147] & 0xFFFF;
										if (this.anInt1948 > local155) {
											this.anInt1948 = local155;
										}
										if (local155 > this.anInt1957) {
											this.anInt1957 = local155;
										}
										local118.e(local155);
									}
								}
							}
						}
					}
					local118.a();
					if (this.anInterface22_3.method7407()) {
						break;
					}
				}
			}
			this.anInt1945 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ra;II)V")
	public void method1622(@OriginalArg(0) Interface22 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method1624();
			this.aClass95_Sub1_6.method8147(this.anInterface8_3);
			this.aClass95_Sub1_6.method8109(arg1, 0, this.anInt1957 + 1 - this.anInt1948, Static649.aClass115_6, this.anInt1948, arg0);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	private void method1624() {
		if (!this.aBoolean154) {
			return;
		}
		this.aBoolean154 = false;
		@Pc(16) byte[] local16 = this.aClass170_1.aByteArray40;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass170_1.anInt4650;
		@Pc(32) int local32 = this.anInt1956 * this.aClass170_1.anInt4650 + this.anInt1953;
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
		if (this.anInterface8_3 != null && local18 == this.anInt1955) {
			this.aBoolean154 = false;
			return;
		}
		this.anInt1955 = local18;
		local32 = this.anInt1953 + local22 * this.anInt1956;
		local45 = 0;
		@Pc(108) int local108;
		@Pc(112) int local112;
		@Pc(120) int local120;
		if (!this.aClass95_Sub1_6.method8151(Static666.aClass389_16, Static111.aClass122_5)) {
			if (Static262.anIntArray269 == null) {
				Static262.anIntArray269 = new int[16384];
			}
			@Pc(229) int[] local229 = Static262.anIntArray269;
			for (local108 = -128; local108 < 0; local108++) {
				for (local112 = -128; local112 < 0; local112++) {
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
						local229[local45++] = local120 * 17 << 24;
					} else {
						local229[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass170_1.anInt4650 - 128;
			}
			if (this.anInterface8_3 == null) {
				this.anInterface8_3 = this.aClass95_Sub1_6.method8103(128, 128, Static262.anIntArray269, false);
				this.anInterface8_3.method7068(false, false);
			} else {
				this.anInterface8_3.method7066(0, 128, 0, 128, Static262.anIntArray269, 128);
			}
			return;
		}
		if (Static116.aByteArray12 == null) {
			Static116.aByteArray12 = new byte[16384];
		}
		@Pc(106) byte[] local106 = Static116.aByteArray12;
		for (local108 = -128; local108 < 0; local108++) {
			for (local112 = -128; local112 < 0; local112++) {
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
					local106[local45++] = (byte) (local120 * 17);
				} else {
					local106[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass170_1.anInt4650 - 128;
		}
		if (this.anInterface8_3 == null) {
			this.anInterface8_3 = this.aClass95_Sub1_6.method8112(128, 128, false, Static116.aByteArray12, Static111.aClass122_5);
			this.anInterface8_3.method7068(false, false);
		} else {
			this.anInterface8_3.method7069(128, 128, Static116.aByteArray12, Static111.aClass122_5, 128);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public void method1626() {
		this.method1622(this.anInterface22_3, this.anInt1945);
	}
}
