import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class330 {

	@OriginalMember(owner = "client!taa", name = "r", descriptor = "Z")
	public boolean aBoolean776 = true;

	@OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
	private int anInt9106 = -1;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
	private final int anInt9094;

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "I")
	private final int anInt9103;

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_18;

	@OriginalMember(owner = "client!taa", name = "e", descriptor = "Lclient!ep;")
	private final Class107 aClass107_2;

	@OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
	public final int anInt9104;

	@OriginalMember(owner = "client!taa", name = "m", descriptor = "Lclient!w;")
	private Interface27 anInterface27_6;

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
	private int anInt9096;

	@OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
	private int anInt9102;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "Lclient!jj;")
	private Interface12 anInterface12_7;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!gd;Lclient!ep;Lclient!rd;IIIII)V")
	public Class330(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) Class109_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt9094 = arg7;
		this.anInt9103 = arg6;
		this.aClass65_Sub2_18 = arg0;
		this.aClass107_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local35 + local37) * arg2.anInt9061 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray17[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt9104 = 0;
			this.anInterface27_6 = null;
		} else {
			this.anInt9096 = Integer.MAX_VALUE;
			this.anInt9102 = Integer.MIN_VALUE;
			this.anInterface12_7 = this.aClass65_Sub2_18.method4364(false);
			this.anInterface12_7.method8239(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(119) Buffer local119 = this.anInterface12_7.method900();
				if (local119 != null) {
					@Pc(127) Stream local127 = this.aClass65_Sub2_18.method4457(local119);
					@Pc(131) int local131;
					@Pc(144) int local144;
					@Pc(146) int local146;
					@Pc(154) short[] local154;
					@Pc(158) int local158;
					@Pc(166) int local166;
					if (Stream.c()) {
						for (local131 = 0; local131 < local25; local131++) {
							local144 = (local131 + local35) * arg2.anInt9061 + local31;
							for (local146 = 0; local146 < local25; local146++) {
								local154 = arg2.aShortArrayArray17[local144++];
								if (local154 != null) {
									for (local158 = 0; local158 < local154.length; local158++) {
										local166 = local154[local158] & 0xFFFF;
										if (this.anInt9096 > local166) {
											this.anInt9096 = local166;
										}
										if (this.anInt9102 < local166) {
											this.anInt9102 = local166;
										}
										local127.e(local166);
									}
								}
							}
						}
					} else {
						for (local131 = 0; local131 < local25; local131++) {
							local144 = (local35 + local131) * arg2.anInt9061 + local31;
							for (local146 = 0; local146 < local25; local146++) {
								local154 = arg2.aShortArrayArray17[local144++];
								if (local154 != null) {
									for (local158 = 0; local158 < local154.length; local158++) {
										local166 = local154[local158] & 0xFFFF;
										if (this.anInt9096 > local166) {
											this.anInt9096 = local166;
										}
										if (local166 > this.anInt9102) {
											this.anInt9102 = local166;
										}
										local127.b(local166);
									}
								}
							}
						}
					}
					local127.a();
					if (this.anInterface12_7.method903()) {
						break;
					}
				}
			}
			this.anInt9104 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public void method7718() {
		this.method7725(this.anInterface12_7, this.anInt9104);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V")
	private void method7720() {
		if (!this.aBoolean776) {
			return;
		}
		this.aBoolean776 = false;
		@Pc(16) byte[] local16 = this.aClass107_2.aByteArray22;
		@Pc(24) int local24 = 0;
		@Pc(28) int local28 = this.aClass107_2.anInt3022;
		@Pc(38) int local38 = this.anInt9094 * this.aClass107_2.anInt3022 + this.anInt9103;
		@Pc(51) int local51;
		for (@Pc(40) int local40 = -128; local40 < 0; local40++) {
			local24 = (local24 << 8) - local24;
			for (local51 = -128; local51 < 0; local51++) {
				if (local16[local38++] != 0) {
					local24++;
				}
			}
			local38 += local28 - 128;
		}
		if (this.anInterface27_6 != null && this.anInt9106 == local24) {
			this.aBoolean776 = false;
			return;
		}
		this.anInt9106 = local24;
		local51 = 0;
		local38 = local28 * this.anInt9094 + this.anInt9103;
		@Pc(124) int local124;
		@Pc(128) int local128;
		@Pc(136) int local136;
		if (!this.aClass65_Sub2_18.method4359(Static67.aClass339_4, Static120.aClass89_7)) {
			if (Static76.anIntArray62 == null) {
				Static76.anIntArray62 = new int[16384];
			}
			@Pc(253) int[] local253 = Static76.anIntArray62;
			for (local124 = -128; local124 < 0; local124++) {
				for (local128 = -128; local128 < 0; local128++) {
					if (local16[local38] == 0) {
						local136 = 0;
						if (local16[local38 - 1] != 0) {
							local136++;
						}
						if (local16[local38 + 1] != 0) {
							local136++;
						}
						if (local16[local38 - local28] != 0) {
							local136++;
						}
						if (local16[local38 + local28] != 0) {
							local136++;
						}
						local253[local51++] = local136 * 17 << 24;
					} else {
						local253[local51++] = 1140850688;
					}
					local38++;
				}
				local38 += this.aClass107_2.anInt3022 - 128;
			}
			if (this.anInterface27_6 == null) {
				this.anInterface27_6 = this.aClass65_Sub2_18.method4371(128, Static76.anIntArray62, 128, false);
				this.anInterface27_6.method5618(false, false);
			} else {
				this.anInterface27_6.method5620(Static76.anIntArray62, 0, 128, 0, 128, 128);
			}
			return;
		}
		if (Static675.aByteArray109 == null) {
			Static675.aByteArray109 = new byte[16384];
		}
		@Pc(122) byte[] local122 = Static675.aByteArray109;
		for (local124 = -128; local124 < 0; local124++) {
			for (local128 = -128; local128 < 0; local128++) {
				if (local16[local38] == 0) {
					local136 = 0;
					if (local16[local38 - 1] != 0) {
						local136++;
					}
					if (local16[local38 + 1] != 0) {
						local136++;
					}
					if (local16[local38 - local28] != 0) {
						local136++;
					}
					if (local16[local28 + local38] != 0) {
						local136++;
					}
					local122[local51++] = (byte) (local136 * 17);
				} else {
					local122[local51++] = 68;
				}
				local38++;
			}
			local38 += this.aClass107_2.anInt3022 - 128;
		}
		if (this.anInterface27_6 == null) {
			this.anInterface27_6 = this.aClass65_Sub2_18.method4422(128, Static675.aByteArray109, 128, Static67.aClass339_4, false);
			this.anInterface27_6.method5618(false, false);
		} else {
			this.anInterface27_6.method5621(Static67.aClass339_4, 128, 128, Static675.aByteArray109, 128);
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!jj;II)V")
	public void method7725(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method7720();
			this.aClass65_Sub2_18.method4426(this.anInterface27_6);
			this.aClass65_Sub2_18.method4398(0, this.anInt9102 + 1 - this.anInt9096, this.anInt9096, Static72.aClass155_1, arg0, arg1);
		}
	}
}
