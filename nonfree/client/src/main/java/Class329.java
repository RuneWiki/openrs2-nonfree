import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class329 {

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	private int anInt9788 = -1;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "Z")
	public boolean aBoolean659 = true;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_20;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
	private final int anInt9785;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Lclient!vg;")
	private final Class343 aClass343_2;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
	private final int anInt9789;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
	public final int anInt9783;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "Lclient!dca;")
	private Interface4 anInterface4_6;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	private int anInt9782;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
	private int anInt9792;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Lclient!eu;")
	private Interface6 anInterface6_8;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!nh;Lclient!vg;Lclient!sq;IIIII)V")
	public Class329(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class115_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass7_Sub1_20 = arg0;
		this.anInt9785 = arg7;
		this.aClass343_2 = arg1;
		this.anInt9789 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local50 = arg2.anInt10330 * (local35 + local37) + local31;
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray18[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt9783 = 0;
			this.anInterface4_6 = null;
		} else {
			this.anInt9782 = Integer.MAX_VALUE;
			this.anInt9792 = Integer.MIN_VALUE;
			this.anInterface6_8 = this.aClass7_Sub1_20.method5726(false);
			this.anInterface6_8.method7932(local27);
			for (local50 = 0; local50 < 4; local50++) {
				@Pc(115) Buffer local115 = this.anInterface6_8.method7935();
				if (local115 != null) {
					@Pc(123) Stream local123 = this.aClass7_Sub1_20.method5675(local115);
					@Pc(127) int local127;
					@Pc(138) int local138;
					@Pc(140) int local140;
					@Pc(148) short[] local148;
					@Pc(152) int local152;
					@Pc(160) int local160;
					if (Stream.c()) {
						for (local127 = 0; local127 < local25; local127++) {
							local138 = arg2.anInt10330 * (local35 + local127) + local31;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray18[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (this.anInt9782 > local160) {
											this.anInt9782 = local160;
										}
										if (local160 > this.anInt9792) {
											this.anInt9792 = local160;
										}
										local123.d(local160);
									}
								}
							}
						}
					} else {
						for (local127 = 0; local127 < local25; local127++) {
							local138 = (local35 + local127) * arg2.anInt10330 + local31;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray18[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 < this.anInt9782) {
											this.anInt9782 = local160;
										}
										if (local160 > this.anInt9792) {
											this.anInt9792 = local160;
										}
										local123.e(local160);
									}
								}
							}
						}
					}
					local123.a();
					if (this.anInterface6_8.method7936()) {
						break;
					}
				}
			}
			this.anInt9783 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!eu;)V")
	public void method7522(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1) {
		if (arg0 > 0) {
			this.method7524();
			this.aClass7_Sub1_20.method5694(this.anInterface4_6);
			this.aClass7_Sub1_20.method5680(arg0, 0, this.anInt9792 + 1 - this.anInt9782, arg1, Static409.aClass119_6, this.anInt9782);
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	private void method7524() {
		if (!this.aBoolean659) {
			return;
		}
		this.aBoolean659 = false;
		@Pc(16) byte[] local16 = this.aClass343_2.aByteArray104;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass343_2.anInt10141;
		@Pc(32) int local32 = this.anInt9785 * this.aClass343_2.anInt10141 + this.anInt9789;
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
		if (this.anInterface4_6 != null && local18 == this.anInt9788) {
			this.aBoolean659 = false;
			return;
		}
		this.anInt9788 = local18;
		local44 = 0;
		local32 = this.anInt9785 * local22 + this.anInt9789;
		@Pc(112) int local112;
		@Pc(116) int local116;
		@Pc(124) int local124;
		if (!this.aClass7_Sub1_20.method5660(Static129.aClass161_5, Static424.aClass273_12)) {
			if (Static409.anIntArray439 == null) {
				Static409.anIntArray439 = new int[16384];
			}
			@Pc(239) int[] local239 = Static409.anIntArray439;
			for (local112 = -128; local112 < 0; local112++) {
				for (local116 = -128; local116 < 0; local116++) {
					if (local16[local32] == 0) {
						local124 = 0;
						if (local16[local32 - 1] != 0) {
							local124++;
						}
						if (local16[local32 + 1] != 0) {
							local124++;
						}
						if (local16[local32 - local22] != 0) {
							local124++;
						}
						if (local16[local32 + local22] != 0) {
							local124++;
						}
						local239[local44++] = local124 * 17 << 24;
					} else {
						local239[local44++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass343_2.anInt10141 - 128;
			}
			if (this.anInterface4_6 == null) {
				this.anInterface4_6 = this.aClass7_Sub1_20.method5699(128, false, 128, Static409.anIntArray439);
				this.anInterface4_6.method7375(false, false);
			} else {
				this.anInterface4_6.method7373(128, 0, 128, 0, Static409.anIntArray439, 128);
			}
			return;
		}
		if (Static149.aByteArray27 == null) {
			Static149.aByteArray27 = new byte[16384];
		}
		@Pc(110) byte[] local110 = Static149.aByteArray27;
		for (local112 = -128; local112 < 0; local112++) {
			for (local116 = -128; local116 < 0; local116++) {
				if (local16[local32] == 0) {
					local124 = 0;
					if (local16[local32 - 1] != 0) {
						local124++;
					}
					if (local16[local32 + 1] != 0) {
						local124++;
					}
					if (local16[local32 - local22] != 0) {
						local124++;
					}
					if (local16[local22 + local32] != 0) {
						local124++;
					}
					local110[local44++] = (byte) (local124 * 17);
				} else {
					local110[local44++] = 68;
				}
				local32++;
			}
			local32 += this.aClass343_2.anInt10141 - 128;
		}
		if (this.anInterface4_6 == null) {
			this.anInterface4_6 = this.aClass7_Sub1_20.method5665(Static149.aByteArray27, 128, Static129.aClass161_5, 128, false);
			this.anInterface4_6.method7375(false, false);
		} else {
			this.anInterface4_6.method7378(Static149.aByteArray27, 128, 128, 128, Static129.aClass161_5);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public void method7525() {
		this.method7522(this.anInt9783, this.anInterface6_8);
	}
}
