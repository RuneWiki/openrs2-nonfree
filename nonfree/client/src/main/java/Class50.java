import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class50 {

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
	private int anInt1635 = -1;

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "Z")
	public boolean aBoolean108 = true;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
	private final int anInt1641;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_3;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "Lclient!vo;")
	private final Class379 aClass379_1;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
	private final int anInt1636;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "Lclient!ada;")
	private Interface1 anInterface1_1;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public final int anInt1637;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	private int anInt1640;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
	private int anInt1639;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Lclient!je;")
	private Interface16 anInterface16_1;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!wg;Lclient!vo;Lclient!ll;IIIII)V")
	public Class50(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) Class379 arg1, @OriginalArg(2) Class42_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1641 = arg6;
		this.aClass33_Sub2_3 = arg0;
		this.aClass379_1 = arg1;
		this.anInt1636 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local37 + local35) * arg2.anInt8638 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray12[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface1_1 = null;
			this.anInt1637 = 0;
		} else {
			this.anInt1640 = Integer.MAX_VALUE;
			this.anInt1639 = Integer.MIN_VALUE;
			this.anInterface16_1 = this.aClass33_Sub2_3.method8265(false);
			this.anInterface16_1.method8360(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(114) Buffer local114 = this.anInterface16_1.method8364();
				if (local114 != null) {
					@Pc(122) Stream local122 = this.aClass33_Sub2_3.method8168(local114);
					@Pc(126) int local126;
					@Pc(138) int local138;
					@Pc(140) int local140;
					@Pc(148) short[] local148;
					@Pc(152) int local152;
					@Pc(160) int local160;
					if (Stream.b()) {
						for (local126 = 0; local126 < local25; local126++) {
							local138 = local31 + arg2.anInt8638 * (local35 + local126);
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray12[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (this.anInt1640 > local160) {
											this.anInt1640 = local160;
										}
										if (this.anInt1639 < local160) {
											this.anInt1639 = local160;
										}
										local122.f(local160);
									}
								}
							}
						}
					} else {
						for (local126 = 0; local126 < local25; local126++) {
							local138 = local31 + arg2.anInt8638 * (local126 + local35);
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray12[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 > this.anInt1639) {
											this.anInt1639 = local160;
										}
										if (local160 < this.anInt1640) {
											this.anInt1640 = local160;
										}
										local122.d(local160);
									}
								}
							}
						}
					}
					local122.c();
					if (this.anInterface16_1.method8363()) {
						break;
					}
				}
			}
			this.anInt1637 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
	private void method1624() {
		if (!this.aBoolean108) {
			return;
		}
		this.aBoolean108 = false;
		@Pc(16) byte[] local16 = this.aClass379_1.aByteArray103;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass379_1.anInt10088;
		@Pc(32) int local32 = this.anInt1641 + this.aClass379_1.anInt10088 * this.anInt1636;
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
		if (this.anInterface1_1 != null && this.anInt1635 == local18) {
			this.aBoolean108 = false;
			return;
		}
		this.anInt1635 = local18;
		local32 = local22 * this.anInt1636 + this.anInt1641;
		local44 = 0;
		@Pc(118) int local118;
		@Pc(122) int local122;
		@Pc(133) int local133;
		if (!this.aClass33_Sub2_3.method8165(Static111.aClass79_7, Static360.aClass276_15)) {
			if (Static542.anIntArray575 == null) {
				Static542.anIntArray575 = new int[16384];
			}
			@Pc(116) int[] local116 = Static542.anIntArray575;
			for (local118 = -128; local118 < 0; local118++) {
				for (local122 = -128; local122 < 0; local122++) {
					if (local16[local32] == 0) {
						local133 = 0;
						if (local16[local32 - 1] != 0) {
							local133++;
						}
						if (local16[local32 + 1] != 0) {
							local133++;
						}
						if (local16[local32 - local22] != 0) {
							local133++;
						}
						if (local16[local32 + local22] != 0) {
							local133++;
						}
						local116[local44++] = local133 * 17 << 24;
					} else {
						local116[local44++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass379_1.anInt10088 - 128;
			}
			if (this.anInterface1_1 == null) {
				this.anInterface1_1 = this.aClass33_Sub2_3.method8273(false, 128, 128, Static542.anIntArray575);
				this.anInterface1_1.method8629(false, false);
			} else {
				this.anInterface1_1.method8625(128, 0, 128, Static542.anIntArray575, 128, 0);
			}
			return;
		}
		if (Static677.aByteArray109 == null) {
			Static677.aByteArray109 = new byte[16384];
		}
		@Pc(243) byte[] local243 = Static677.aByteArray109;
		for (local118 = -128; local118 < 0; local118++) {
			for (local122 = -128; local122 < 0; local122++) {
				if (local16[local32] == 0) {
					local133 = 0;
					if (local16[local32 - 1] != 0) {
						local133++;
					}
					if (local16[local32 + 1] != 0) {
						local133++;
					}
					if (local16[local32 - local22] != 0) {
						local133++;
					}
					if (local16[local22 + local32] != 0) {
						local133++;
					}
					local243[local44++] = (byte) (local133 * 17);
				} else {
					local243[local44++] = 68;
				}
				local32++;
			}
			local32 += this.aClass379_1.anInt10088 - 128;
		}
		if (this.anInterface1_1 == null) {
			this.anInterface1_1 = this.aClass33_Sub2_3.method8174(128, false, Static677.aByteArray109, Static360.aClass276_15, 128);
			this.anInterface1_1.method8629(false, false);
		} else {
			this.anInterface1_1.method8626(Static677.aByteArray109, 128, Static360.aClass276_15, 128, 128);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IILclient!je;)V")
	public void method1625(@OriginalArg(1) int arg0, @OriginalArg(2) Interface16 arg1) {
		if (arg0 > 0) {
			this.method1624();
			this.aClass33_Sub2_3.method8159(this.anInterface1_1);
			this.aClass33_Sub2_3.method8279(arg1, this.anInt1639 + 1 - this.anInt1640, Static83.aClass194_13, 0, arg0, this.anInt1640);
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(Z)V")
	public void method1626() {
		this.method1625(this.anInt1637, this.anInterface16_1);
	}
}
