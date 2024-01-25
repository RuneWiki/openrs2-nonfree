import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class191 {

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Z")
	public boolean aBoolean387 = true;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
	private int anInt4743 = -1;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
	private final int anInt4735;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	private final int anInt4737;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Lclient!qw;")
	private final Class296 aClass296_1;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_11;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	private int anInt4734;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
	private int anInt4736;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Lclient!rh;")
	private Interface21 anInterface21_5;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
	public final int anInt4742;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Lclient!tr;")
	private Interface25 anInterface25_5;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!rv;Lclient!qw;Lclient!via;IIIII)V")
	public Class191(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) Class296 arg1, @OriginalArg(2) Class40_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4735 = arg6;
		this.anInt4737 = arg7;
		this.aClass296_1 = arg1;
		this.aClass126_Sub2_11 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = arg2.anInt9920 * (local37 + local35) + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray21[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface25_5 = null;
			this.anInt4742 = 0;
		} else {
			this.anInt4734 = Integer.MAX_VALUE;
			this.anInt4736 = Integer.MIN_VALUE;
			this.anInterface21_5 = this.aClass126_Sub2_11.method5444(false);
			this.anInterface21_5.method5732(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(107) Buffer local107 = this.anInterface21_5.method5730();
				if (local107 != null) {
					@Pc(115) Stream local115 = this.aClass126_Sub2_11.method5446(local107);
					@Pc(119) int local119;
					@Pc(131) int local131;
					@Pc(133) int local133;
					@Pc(141) short[] local141;
					@Pc(145) int local145;
					@Pc(153) int local153;
					if (Stream.b()) {
						for (local119 = 0; local119 < local25; local119++) {
							local131 = local31 + (local35 + local119) * arg2.anInt9920;
							for (local133 = 0; local133 < local25; local133++) {
								local141 = arg2.aShortArrayArray21[local131++];
								if (local141 != null) {
									for (local145 = 0; local145 < local141.length; local145++) {
										local153 = local141[local145] & 0xFFFF;
										if (local153 > this.anInt4736) {
											this.anInt4736 = local153;
										}
										if (this.anInt4734 > local153) {
											this.anInt4734 = local153;
										}
										local115.b(local153);
									}
								}
							}
						}
					} else {
						for (local119 = 0; local119 < local25; local119++) {
							local131 = arg2.anInt9920 * (local35 + local119) + local31;
							for (local133 = 0; local133 < local25; local133++) {
								local141 = arg2.aShortArrayArray21[local131++];
								if (local141 != null) {
									for (local145 = 0; local145 < local141.length; local145++) {
										local153 = local141[local145] & 0xFFFF;
										if (local153 < this.anInt4734) {
											this.anInt4734 = local153;
										}
										if (this.anInt4736 < local153) {
											this.anInt4736 = local153;
										}
										local115.d(local153);
									}
								}
							}
						}
					}
					local115.a();
					if (this.anInterface21_5.method5734()) {
						break;
					}
				}
			}
			this.anInt4742 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	private void method4318() {
		if (!this.aBoolean387) {
			return;
		}
		this.aBoolean387 = false;
		@Pc(16) byte[] local16 = this.aClass296_1.aByteArray73;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass296_1.anInt8008;
		@Pc(32) int local32 = this.anInt4735 + this.aClass296_1.anInt8008 * this.anInt4737;
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
		if (this.anInterface25_5 != null && local18 == this.anInt4743) {
			this.aBoolean387 = false;
			return;
		}
		this.anInt4743 = local18;
		local45 = 0;
		local32 = local22 * this.anInt4737 + this.anInt4735;
		@Pc(117) int local117;
		@Pc(121) int local121;
		@Pc(136) int local136;
		if (!this.aClass126_Sub2_11.method5453(Static385.aClass247_14, Static225.aClass281_13)) {
			if (Static420.anIntArray576 == null) {
				Static420.anIntArray576 = new int[16384];
			}
			@Pc(240) int[] local240 = Static420.anIntArray576;
			for (local117 = -128; local117 < 0; local117++) {
				for (local121 = -128; local121 < 0; local121++) {
					if (local16[local32] == 0) {
						local136 = 0;
						if (local16[local32 - 1] != 0) {
							local136++;
						}
						if (local16[local32 + 1] != 0) {
							local136++;
						}
						if (local16[local32 - local22] != 0) {
							local136++;
						}
						if (local16[local32 + local22] != 0) {
							local136++;
						}
						local240[local45++] = local136 * 17 << 24;
					} else {
						local240[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass296_1.anInt8008 - 128;
			}
			if (this.anInterface25_5 == null) {
				this.anInterface25_5 = this.aClass126_Sub2_11.method5553(128, Static420.anIntArray576, false, 128);
				this.anInterface25_5.method7630(false, false);
			} else {
				this.anInterface25_5.method7625(0, 128, 0, 128, Static420.anIntArray576, 128);
			}
			return;
		}
		if (Static326.aByteArray45 == null) {
			Static326.aByteArray45 = new byte[16384];
		}
		@Pc(115) byte[] local115 = Static326.aByteArray45;
		for (local117 = -128; local117 < 0; local117++) {
			for (local121 = -128; local121 < 0; local121++) {
				if (local16[local32] == 0) {
					local136 = 0;
					if (local16[local32 - 1] != 0) {
						local136++;
					}
					if (local16[local32 + 1] != 0) {
						local136++;
					}
					if (local16[local32 - local22] != 0) {
						local136++;
					}
					if (local16[local32 + local22] != 0) {
						local136++;
					}
					local115[local45++] = (byte) (local136 * 17);
				} else {
					local115[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass296_1.anInt8008 - 128;
		}
		if (this.anInterface25_5 == null) {
			this.anInterface25_5 = this.aClass126_Sub2_11.method5492(Static326.aByteArray45, 128, Static225.aClass281_13, 128, false);
			this.anInterface25_5.method7630(false, false);
		} else {
			this.anInterface25_5.method7628(128, Static225.aClass281_13, 128, 128, Static326.aByteArray45);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!rh;II)V")
	public void method4320(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method4318();
			this.aClass126_Sub2_11.method5449(this.anInterface25_5);
			this.aClass126_Sub2_11.method5526(arg0, Static370.aClass23_7, arg1, 0, this.anInt4736 + 1 - this.anInt4734, this.anInt4734);
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	public void method4321() {
		this.method4320(this.anInterface21_5, this.anInt4742);
	}
}
