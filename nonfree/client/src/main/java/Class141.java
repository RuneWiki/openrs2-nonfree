import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class141 {

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
	private int anInt4287 = -1;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "Z")
	public boolean aBoolean321 = true;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_10;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
	private final int anInt4289;

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "Lclient!nt;")
	private final Class244 aClass244_2;

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
	private final int anInt4285;

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
	private int anInt4283;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
	private int anInt4284;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!oh;")
	private Interface20 anInterface20_2;

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
	public final int anInt4291;

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!ec;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ai;Lclient!nt;Lclient!ew;IIIII)V")
	public Class141(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class21_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass13_Sub1_10 = arg0;
		this.anInt4289 = arg6;
		this.aClass244_2 = arg1;
		this.anInt4285 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = local31 + (local35 + local37) * arg2.anInt9129;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray13[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt4291 = 0;
			this.anInterface7_1 = null;
		} else {
			this.anInt4283 = Integer.MIN_VALUE;
			this.anInt4284 = Integer.MAX_VALUE;
			this.anInterface20_2 = this.aClass13_Sub1_10.method7435(false);
			this.anInterface20_2.method8740(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(108) Buffer local108 = this.anInterface20_2.method7828();
				if (local108 != null) {
					@Pc(116) Stream local116 = this.aClass13_Sub1_10.method7409(local108);
					@Pc(120) int local120;
					@Pc(133) int local133;
					@Pc(135) int local135;
					@Pc(143) short[] local143;
					@Pc(147) int local147;
					@Pc(155) int local155;
					if (Stream.c()) {
						for (local120 = 0; local120 < local25; local120++) {
							local133 = arg2.anInt9129 * (local35 + local120) + local31;
							for (local135 = 0; local135 < local25; local135++) {
								local143 = arg2.aShortArrayArray13[local133++];
								if (local143 != null) {
									for (local147 = 0; local147 < local143.length; local147++) {
										local155 = local143[local147] & 0xFFFF;
										if (this.anInt4284 > local155) {
											this.anInt4284 = local155;
										}
										if (this.anInt4283 < local155) {
											this.anInt4283 = local155;
										}
										local116.b(local155);
									}
								}
							}
						}
					} else {
						for (local120 = 0; local120 < local25; local120++) {
							local133 = local31 + (local120 + local35) * arg2.anInt9129;
							for (local135 = 0; local135 < local25; local135++) {
								local143 = arg2.aShortArrayArray13[local133++];
								if (local143 != null) {
									for (local147 = 0; local147 < local143.length; local147++) {
										local155 = local143[local147] & 0xFFFF;
										if (local155 > this.anInt4283) {
											this.anInt4283 = local155;
										}
										if (local155 < this.anInt4284) {
											this.anInt4284 = local155;
										}
										local116.c(local155);
									}
								}
							}
						}
					}
					local116.a();
					if (this.anInterface20_2.method7826()) {
						break;
					}
				}
			}
			this.anInt4291 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	private void method3911() {
		if (!this.aBoolean321) {
			return;
		}
		this.aBoolean321 = false;
		@Pc(16) byte[] local16 = this.aClass244_2.aByteArray74;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass244_2.anInt6600;
		@Pc(32) int local32 = this.aClass244_2.anInt6600 * this.anInt4285 + this.anInt4289;
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
		if (this.anInterface7_1 != null && this.anInt4287 == local18) {
			this.aBoolean321 = false;
			return;
		}
		this.anInt4287 = local18;
		local32 = this.anInt4289 + this.anInt4285 * local22;
		local45 = 0;
		@Pc(109) int local109;
		@Pc(113) int local113;
		@Pc(121) int local121;
		if (!this.aClass13_Sub1_10.method7425(Static337.aClass327_12, Static246.aClass152_10)) {
			if (Static479.anIntArray671 == null) {
				Static479.anIntArray671 = new int[16384];
			}
			@Pc(107) int[] local107 = Static479.anIntArray671;
			for (local109 = -128; local109 < 0; local109++) {
				for (local113 = -128; local113 < 0; local113++) {
					if (local16[local32] == 0) {
						local121 = 0;
						if (local16[local32 - 1] != 0) {
							local121++;
						}
						if (local16[local32 + 1] != 0) {
							local121++;
						}
						if (local16[local32 - local22] != 0) {
							local121++;
						}
						if (local16[local32 + local22] != 0) {
							local121++;
						}
						local107[local45++] = local121 * 17 << 24;
					} else {
						local107[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass244_2.anInt6600 - 128;
			}
			if (this.anInterface7_1 == null) {
				this.anInterface7_1 = this.aClass13_Sub1_10.method7526(128, 128, false, Static479.anIntArray671);
				this.anInterface7_1.method5805(false, false);
			} else {
				this.anInterface7_1.method5801(0, 128, Static479.anIntArray671, 128, 128, 0);
			}
			return;
		}
		if (Static260.aByteArray44 == null) {
			Static260.aByteArray44 = new byte[16384];
		}
		@Pc(232) byte[] local232 = Static260.aByteArray44;
		for (local109 = -128; local109 < 0; local109++) {
			for (local113 = -128; local113 < 0; local113++) {
				if (local16[local32] == 0) {
					local121 = 0;
					if (local16[local32 - 1] != 0) {
						local121++;
					}
					if (local16[local32 + 1] != 0) {
						local121++;
					}
					if (local16[local32 - local22] != 0) {
						local121++;
					}
					if (local16[local22 + local32] != 0) {
						local121++;
					}
					local232[local45++] = (byte) (local121 * 17);
				} else {
					local232[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass244_2.anInt6600 - 128;
		}
		if (this.anInterface7_1 == null) {
			this.anInterface7_1 = this.aClass13_Sub1_10.method7446(Static260.aByteArray44, 128, 128, false, Static337.aClass327_12);
			this.anInterface7_1.method5805(false, false);
		} else {
			this.anInterface7_1.method5807(Static337.aClass327_12, 128, Static260.aByteArray44, 128, 128);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!oh;ZI)V")
	public void method3912(@OriginalArg(0) Interface20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method3911();
			this.aClass13_Sub1_10.method7530(this.anInterface7_1);
			this.aClass13_Sub1_10.method7424(arg1, 0, arg0, this.anInt4284, this.anInt4283 + 1 - this.anInt4284, Static413.aClass393_4);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	public void method3914() {
		this.method3912(this.anInterface20_2, this.anInt4291);
	}
}
