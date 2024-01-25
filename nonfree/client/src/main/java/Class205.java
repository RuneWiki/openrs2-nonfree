import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class205 {

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
	private int anInt6869 = -1;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "Z")
	public boolean aBoolean549 = true;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lclient!bba;")
	private final Class23 aClass23_1;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	private final int anInt6866;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	private final int anInt6868;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_15;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	private int anInt6872;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	private int anInt6865;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "Lclient!ug;")
	private Interface27 anInterface27_8;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	public final int anInt6864;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!js;")
	private Interface15 anInterface15_5;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!uv;Lclient!bba;Lclient!si;IIIII)V")
	public Class205(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class245_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass23_1 = arg1;
		this.anInt6866 = arg7;
		this.anInt6868 = arg6;
		this.aClass5_Sub2_15 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = arg2.anInt9289 * (local35 + local37) + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray29[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt6864 = 0;
			this.anInterface15_5 = null;
		} else {
			this.anInt6872 = Integer.MAX_VALUE;
			this.anInt6865 = Integer.MIN_VALUE;
			this.anInterface27_8 = this.aClass5_Sub2_15.method3993(false);
			this.anInterface27_8.method8101(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(108) Buffer local108 = this.anInterface27_8.method7962();
				if (local108 != null) {
					@Pc(116) Stream local116 = this.aClass5_Sub2_15.method4046(local108);
					@Pc(120) int local120;
					@Pc(132) int local132;
					@Pc(134) int local134;
					@Pc(142) short[] local142;
					@Pc(146) int local146;
					@Pc(154) int local154;
					if (Stream.a()) {
						for (local120 = 0; local120 < local25; local120++) {
							local132 = (local35 + local120) * arg2.anInt9289 + local31;
							for (local134 = 0; local134 < local25; local134++) {
								local142 = arg2.aShortArrayArray29[local132++];
								if (local142 != null) {
									for (local146 = 0; local146 < local142.length; local146++) {
										local154 = local142[local146] & 0xFFFF;
										if (local154 > this.anInt6865) {
											this.anInt6865 = local154;
										}
										if (this.anInt6872 > local154) {
											this.anInt6872 = local154;
										}
										local116.c(local154);
									}
								}
							}
						}
					} else {
						for (local120 = 0; local120 < local25; local120++) {
							local132 = local31 + (local35 + local120) * arg2.anInt9289;
							for (local134 = 0; local134 < local25; local134++) {
								local142 = arg2.aShortArrayArray29[local132++];
								if (local142 != null) {
									for (local146 = 0; local146 < local142.length; local146++) {
										local154 = local142[local146] & 0xFFFF;
										if (local154 < this.anInt6872) {
											this.anInt6872 = local154;
										}
										if (local154 > this.anInt6865) {
											this.anInt6865 = local154;
										}
										local116.d(local154);
									}
								}
							}
						}
					}
					local116.c();
					if (this.anInterface27_8.method7963()) {
						break;
					}
				}
			}
			this.anInt6864 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public void method5740() {
		this.method5742(this.anInterface27_8, this.anInt6864);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ug;I)V")
	public void method5742(@OriginalArg(1) Interface27 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method5744();
			this.aClass5_Sub2_15.method4008(this.anInterface15_5);
			this.aClass5_Sub2_15.method3976(Static574.aClass248_11, this.anInt6865 + 1 - this.anInt6872, 0, arg0, this.anInt6872, arg1);
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	private void method5744() {
		if (!this.aBoolean549) {
			return;
		}
		this.aBoolean549 = false;
		@Pc(22) byte[] local22 = this.aClass23_1.aByteArray5;
		@Pc(24) int local24 = 0;
		@Pc(28) int local28 = this.aClass23_1.anInt827;
		@Pc(38) int local38 = this.aClass23_1.anInt827 * this.anInt6866 + this.anInt6868;
		@Pc(51) int local51;
		for (@Pc(40) int local40 = -128; local40 < 0; local40++) {
			local24 = (local24 << 8) - local24;
			for (local51 = -128; local51 < 0; local51++) {
				if (local22[local38++] != 0) {
					local24++;
				}
			}
			local38 += local28 - 128;
		}
		if (this.anInterface15_5 != null && local24 == this.anInt6869) {
			this.aBoolean549 = false;
			return;
		}
		this.anInt6869 = local24;
		local38 = this.anInt6868 + this.anInt6866 * local28;
		local51 = 0;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(143) int local143;
		if (!this.aClass5_Sub2_15.method3945(Static268.aClass178_6, Static302.aClass176_8)) {
			if (Static12.anIntArray14 == null) {
				Static12.anIntArray14 = new int[16384];
			}
			@Pc(119) int[] local119 = Static12.anIntArray14;
			for (local121 = -128; local121 < 0; local121++) {
				for (local125 = -128; local125 < 0; local125++) {
					if (local22[local38] == 0) {
						local143 = 0;
						if (local22[local38 - 1] != 0) {
							local143++;
						}
						if (local22[local38 + 1] != 0) {
							local143++;
						}
						if (local22[local38 - local28] != 0) {
							local143++;
						}
						if (local22[local28 + local38] != 0) {
							local143++;
						}
						local119[local51++] = local143 * 17 << 24;
					} else {
						local119[local51++] = 1140850688;
					}
					local38++;
				}
				local38 += this.aClass23_1.anInt827 - 128;
			}
			if (this.anInterface15_5 == null) {
				this.anInterface15_5 = this.aClass5_Sub2_15.method4015(128, 128, Static12.anIntArray14, false);
				this.anInterface15_5.method8452(false, false);
			} else {
				this.anInterface15_5.method8455(0, 128, Static12.anIntArray14, 0, 128, 128);
			}
			return;
		}
		if (Static519.aByteArray84 == null) {
			Static519.aByteArray84 = new byte[16384];
		}
		@Pc(245) byte[] local245 = Static519.aByteArray84;
		for (local121 = -128; local121 < 0; local121++) {
			for (local125 = -128; local125 < 0; local125++) {
				if (local22[local38] == 0) {
					local143 = 0;
					if (local22[local38 - 1] != 0) {
						local143++;
					}
					if (local22[local38 + 1] != 0) {
						local143++;
					}
					if (local22[local38 - local28] != 0) {
						local143++;
					}
					if (local22[local28 + local38] != 0) {
						local143++;
					}
					local245[local51++] = (byte) (local143 * 17);
				} else {
					local245[local51++] = 68;
				}
				local38++;
			}
			local38 += this.aClass23_1.anInt827 - 128;
		}
		if (this.anInterface15_5 == null) {
			this.anInterface15_5 = this.aClass5_Sub2_15.method4056(128, Static268.aClass178_6, Static519.aByteArray84, false, 128);
			this.anInterface15_5.method8452(false, false);
		} else {
			this.anInterface15_5.method8447(128, 128, 128, Static519.aByteArray84, Static268.aClass178_6);
		}
	}
}
