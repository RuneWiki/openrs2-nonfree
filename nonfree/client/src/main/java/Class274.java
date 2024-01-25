import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class274 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	private int anInt7871 = -1;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Z")
	public boolean aBoolean539 = true;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	private final int anInt7878;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!ve;")
	private final Class362 aClass362_2;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	private final int anInt7879;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_12;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int anInt7876;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	private int anInt7877;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!dk;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public final int anInt7875;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!oga;")
	private Interface21 anInterface21_4;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!pj;Lclient!ve;Lclient!mf;IIIII)V")
	public Class274(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class51_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7878 = arg6;
		this.aClass362_2 = arg1;
		this.anInt7879 = arg7;
		this.aClass137_Sub1_12 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + arg2.anInt9511 * (local37 + local35);
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray15[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface21_4 = null;
			this.anInt7875 = 0;
		} else {
			this.anInt7876 = Integer.MIN_VALUE;
			this.anInt7877 = Integer.MAX_VALUE;
			this.anInterface4_5 = this.aClass137_Sub1_12.method8073(false);
			this.anInterface4_5.method5678(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(111) Buffer local111 = this.anInterface4_5.method5680();
				if (local111 != null) {
					@Pc(119) Stream local119 = this.aClass137_Sub1_12.method8079(local111);
					@Pc(123) int local123;
					@Pc(135) int local135;
					@Pc(137) int local137;
					@Pc(145) short[] local145;
					@Pc(149) int local149;
					@Pc(157) int local157;
					if (Stream.c()) {
						for (local123 = 0; local123 < local25; local123++) {
							local135 = local31 + arg2.anInt9511 * (local35 + local123);
							for (local137 = 0; local137 < local25; local137++) {
								local145 = arg2.aShortArrayArray15[local135++];
								if (local145 != null) {
									for (local149 = 0; local149 < local145.length; local149++) {
										local157 = local145[local149] & 0xFFFF;
										if (local157 < this.anInt7877) {
											this.anInt7877 = local157;
										}
										if (local157 > this.anInt7876) {
											this.anInt7876 = local157;
										}
										local119.a(local157);
									}
								}
							}
						}
					} else {
						for (local123 = 0; local123 < local25; local123++) {
							local135 = arg2.anInt9511 * (local35 + local123) + local31;
							for (local137 = 0; local137 < local25; local137++) {
								local145 = arg2.aShortArrayArray15[local135++];
								if (local145 != null) {
									for (local149 = 0; local149 < local145.length; local149++) {
										local157 = local145[local149] & 0xFFFF;
										if (local157 > this.anInt7876) {
											this.anInt7876 = local157;
										}
										if (local157 < this.anInt7877) {
											this.anInt7877 = local157;
										}
										local119.e(local157);
									}
								}
							}
						}
					}
					local119.b();
					if (this.anInterface4_5.method5682()) {
						break;
					}
				}
			}
			this.anInt7875 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	private void method6511() {
		if (!this.aBoolean539) {
			return;
		}
		this.aBoolean539 = false;
		@Pc(20) byte[] local20 = this.aClass362_2.aByteArray134;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass362_2.anInt10549;
		@Pc(37) int local37 = this.anInt7878 + this.aClass362_2.anInt10549 * this.anInt7879;
		@Pc(50) int local50;
		for (@Pc(39) int local39 = -128; local39 < 0; local39++) {
			local22 = (local22 << 8) - local22;
			for (local50 = -128; local50 < 0; local50++) {
				if (local20[local37++] != 0) {
					local22++;
				}
			}
			local37 += local26 - 128;
		}
		if (this.anInterface21_4 != null && local22 == this.anInt7871) {
			this.aBoolean539 = false;
			return;
		}
		this.anInt7871 = local22;
		local50 = 0;
		local37 = this.anInt7878 + this.anInt7879 * local26;
		@Pc(116) int local116;
		@Pc(120) int local120;
		@Pc(131) int local131;
		if (!this.aClass137_Sub1_12.method8087(Static202.aClass363_3, Static47.aClass36_5)) {
			if (Static167.anIntArray274 == null) {
				Static167.anIntArray274 = new int[16384];
			}
			@Pc(114) int[] local114 = Static167.anIntArray274;
			for (local116 = -128; local116 < 0; local116++) {
				for (local120 = -128; local120 < 0; local120++) {
					if (local20[local37] == 0) {
						local131 = 0;
						if (local20[local37 - 1] != 0) {
							local131++;
						}
						if (local20[local37 + 1] != 0) {
							local131++;
						}
						if (local20[local37 - local26] != 0) {
							local131++;
						}
						if (local20[local37 + local26] != 0) {
							local131++;
						}
						local114[local50++] = local131 * 17 << 24;
					} else {
						local114[local50++] = 1140850688;
					}
					local37++;
				}
				local37 += this.aClass362_2.anInt10549 - 128;
			}
			if (this.anInterface21_4 == null) {
				this.anInterface21_4 = this.aClass137_Sub1_12.method7982(false, 128, Static167.anIntArray274, 128);
				this.anInterface21_4.method9033(false, false);
			} else {
				this.anInterface21_4.method9036(128, 128, 0, 0, Static167.anIntArray274, 128);
			}
			return;
		}
		if (Static381.aByteArray82 == null) {
			Static381.aByteArray82 = new byte[16384];
		}
		@Pc(235) byte[] local235 = Static381.aByteArray82;
		for (local116 = -128; local116 < 0; local116++) {
			for (local120 = -128; local120 < 0; local120++) {
				if (local20[local37] == 0) {
					local131 = 0;
					if (local20[local37 - 1] != 0) {
						local131++;
					}
					if (local20[local37 + 1] != 0) {
						local131++;
					}
					if (local20[local37 - local26] != 0) {
						local131++;
					}
					if (local20[local26 + local37] != 0) {
						local131++;
					}
					local235[local50++] = (byte) (local131 * 17);
				} else {
					local235[local50++] = 68;
				}
				local37++;
			}
			local37 += this.aClass362_2.anInt10549 - 128;
		}
		if (this.anInterface21_4 == null) {
			this.anInterface21_4 = this.aClass137_Sub1_12.method8030(128, 128, Static381.aByteArray82, false, Static202.aClass363_3);
			this.anInterface21_4.method9033(false, false);
		} else {
			this.anInterface21_4.method9039(128, Static202.aClass363_3, 128, 128, Static381.aByteArray82);
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
	public void method6512() {
		this.method6513(this.anInterface4_5, this.anInt7875);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!dk;IZ)V")
	public void method6513(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method6511();
			this.aClass137_Sub1_12.method8007(this.anInterface21_4);
			this.aClass137_Sub1_12.method7980(arg1, arg0, this.anInt7877, 0, this.anInt7876 + 1 - this.anInt7877, Static620.aClass54_6);
		}
	}
}
