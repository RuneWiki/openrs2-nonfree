import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class163 {

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	private int anInt4730 = -1;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "Z")
	public boolean aBoolean356 = true;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "I")
	private final int anInt4724;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Lclient!oo;")
	private final Class262 aClass262_1;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	private final int anInt4729;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_9;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "Lclient!wk;")
	private Interface27 anInterface27_3;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public final int anInt4733;

	@OriginalMember(owner = "client!in", name = "m", descriptor = "I")
	private int anInt4731;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "I")
	private int anInt4726;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "Lclient!iaa;")
	private Interface11 anInterface11_3;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!ij;Lclient!oo;Lclient!lp;IIIII)V")
	public Class163(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) Class262 arg1, @OriginalArg(2) Class91_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4724 = arg7;
		this.aClass262_1 = arg1;
		this.anInt4729 = arg6;
		this.aClass13_Sub3_9 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = local31 + (local35 + local37) * arg2.anInt8650;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray4[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface27_3 = null;
			this.anInt4733 = 0;
		} else {
			this.anInt4731 = Integer.MIN_VALUE;
			this.anInt4726 = Integer.MAX_VALUE;
			this.anInterface11_3 = this.aClass13_Sub3_9.method8288(false);
			this.anInterface11_3.method7407(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(115) Buffer local115 = this.anInterface11_3.method7405();
				if (local115 != null) {
					@Pc(123) Stream local123 = this.aClass13_Sub3_9.method8260(local115);
					@Pc(127) int local127;
					@Pc(139) int local139;
					@Pc(141) int local141;
					@Pc(149) short[] local149;
					@Pc(153) int local153;
					@Pc(161) int local161;
					if (Stream.c()) {
						for (local127 = 0; local127 < local25; local127++) {
							local139 = (local35 + local127) * arg2.anInt8650 + local31;
							for (local141 = 0; local141 < local25; local141++) {
								local149 = arg2.aShortArrayArray4[local139++];
								if (local149 != null) {
									for (local153 = 0; local153 < local149.length; local153++) {
										local161 = local149[local153] & 0xFFFF;
										if (this.anInt4726 > local161) {
											this.anInt4726 = local161;
										}
										if (local161 > this.anInt4731) {
											this.anInt4731 = local161;
										}
										local123.b(local161);
									}
								}
							}
						}
					} else {
						for (local127 = 0; local127 < local25; local127++) {
							local139 = local31 + arg2.anInt8650 * (local35 + local127);
							for (local141 = 0; local141 < local25; local141++) {
								local149 = arg2.aShortArrayArray4[local139++];
								if (local149 != null) {
									for (local153 = 0; local153 < local149.length; local153++) {
										local161 = local149[local153] & 0xFFFF;
										if (local161 < this.anInt4726) {
											this.anInt4726 = local161;
										}
										if (local161 > this.anInt4731) {
											this.anInt4731 = local161;
										}
										local123.e(local161);
									}
								}
							}
						}
					}
					local123.b();
					if (this.anInterface11_3.method7409()) {
						break;
					}
				}
			}
			this.anInt4733 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZILclient!iaa;)V")
	public void method4142(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		if (arg0 > 0) {
			this.method4147();
			this.aClass13_Sub3_9.method8234(this.anInterface27_3);
			this.aClass13_Sub3_9.method8188(this.anInt4726, this.anInt4731 + 1 - this.anInt4726, Static339.aClass191_4, arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public void method4143() {
		this.method4142(this.anInt4733, this.anInterface11_3);
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	private void method4147() {
		if (!this.aBoolean356) {
			return;
		}
		this.aBoolean356 = false;
		@Pc(16) byte[] local16 = this.aClass262_1.aByteArray72;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass262_1.anInt6979;
		@Pc(32) int local32 = this.anInt4724 * this.aClass262_1.anInt6979 + this.anInt4729;
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
		if (this.anInterface27_3 != null && local18 == this.anInt4730) {
			this.aBoolean356 = false;
			return;
		}
		this.anInt4730 = local18;
		local32 = local22 * this.anInt4724 + this.anInt4729;
		local45 = 0;
		@Pc(112) int local112;
		@Pc(116) int local116;
		@Pc(127) int local127;
		if (!this.aClass13_Sub3_9.method8293(Static210.aClass104_18, Static638.aClass381_15)) {
			if (Static353.anIntArray401 == null) {
				Static353.anIntArray401 = new int[16384];
			}
			@Pc(110) int[] local110 = Static353.anIntArray401;
			for (local112 = -128; local112 < 0; local112++) {
				for (local116 = -128; local116 < 0; local116++) {
					if (local16[local32] == 0) {
						local127 = 0;
						if (local16[local32 - 1] != 0) {
							local127++;
						}
						if (local16[local32 + 1] != 0) {
							local127++;
						}
						if (local16[local32 - local22] != 0) {
							local127++;
						}
						if (local16[local32 + local22] != 0) {
							local127++;
						}
						local110[local45++] = local127 * 17 << 24;
					} else {
						local110[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass262_1.anInt6979 - 128;
			}
			if (this.anInterface27_3 == null) {
				this.anInterface27_3 = this.aClass13_Sub3_9.method8257(false, Static353.anIntArray401, 128, 128);
				this.anInterface27_3.method7134(false, false);
			} else {
				this.anInterface27_3.method7131(0, 128, 0, Static353.anIntArray401, 128, 128);
			}
			return;
		}
		if (Static426.aByteArray74 == null) {
			Static426.aByteArray74 = new byte[16384];
		}
		@Pc(230) byte[] local230 = Static426.aByteArray74;
		for (local112 = -128; local112 < 0; local112++) {
			for (local116 = -128; local116 < 0; local116++) {
				if (local16[local32] == 0) {
					local127 = 0;
					if (local16[local32 - 1] != 0) {
						local127++;
					}
					if (local16[local32 + 1] != 0) {
						local127++;
					}
					if (local16[local32 - local22] != 0) {
						local127++;
					}
					if (local16[local22 + local32] != 0) {
						local127++;
					}
					local230[local45++] = (byte) (local127 * 17);
				} else {
					local230[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass262_1.anInt6979 - 128;
		}
		if (this.anInterface27_3 == null) {
			this.anInterface27_3 = this.aClass13_Sub3_9.method8198(Static426.aByteArray74, Static210.aClass104_18, 128, 128, false);
			this.anInterface27_3.method7134(false, false);
		} else {
			this.anInterface27_3.method7129(128, Static210.aClass104_18, 128, Static426.aByteArray74, 128);
		}
	}
}
