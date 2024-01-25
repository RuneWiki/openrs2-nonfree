import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class312 {

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "Z")
	public boolean aBoolean617 = true;

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
	private int anInt8867 = -1;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
	private final int anInt8869;

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "Lclient!ap;")
	private final Class15 aClass15_2;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_20;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
	private final int anInt8870;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Lclient!jb;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	public final int anInt8872;

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
	private int anInt8868;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
	private int anInt8865;

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "Lclient!af;")
	private Interface1 anInterface1_7;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!cb;Lclient!ap;Lclient!ih;IIIII)V")
	public Class312(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class10_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8869 = arg6;
		this.aClass15_2 = arg1;
		this.aClass9_Sub1_20 = arg0;
		this.anInt8870 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + arg2.anInt7412 * (local37 + local35);
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray4[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface5_3 = null;
			this.anInt8872 = 0;
		} else {
			this.anInt8868 = Integer.MIN_VALUE;
			this.anInt8865 = Integer.MAX_VALUE;
			this.anInterface1_7 = this.aClass9_Sub1_20.method7718(false);
			this.anInterface1_7.method7526(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(114) Buffer local114 = this.anInterface1_7.method7519();
				if (local114 != null) {
					@Pc(122) Stream local122 = this.aClass9_Sub1_20.method7677(local114);
					@Pc(126) int local126;
					@Pc(137) int local137;
					@Pc(139) int local139;
					@Pc(147) short[] local147;
					@Pc(151) int local151;
					@Pc(159) int local159;
					if (Stream.c()) {
						for (local126 = 0; local126 < local25; local126++) {
							local137 = local31 + arg2.anInt7412 * (local126 + local35);
							for (local139 = 0; local139 < local25; local139++) {
								local147 = arg2.aShortArrayArray4[local137++];
								if (local147 != null) {
									for (local151 = 0; local151 < local147.length; local151++) {
										local159 = local147[local151] & 0xFFFF;
										if (this.anInt8868 < local159) {
											this.anInt8868 = local159;
										}
										if (this.anInt8865 > local159) {
											this.anInt8865 = local159;
										}
										local122.c(local159);
									}
								}
							}
						}
					} else {
						for (local126 = 0; local126 < local25; local126++) {
							local137 = arg2.anInt7412 * (local35 + local126) + local31;
							for (local139 = 0; local139 < local25; local139++) {
								local147 = arg2.aShortArrayArray4[local137++];
								if (local147 != null) {
									for (local151 = 0; local151 < local147.length; local151++) {
										local159 = local147[local151] & 0xFFFF;
										if (local159 < this.anInt8865) {
											this.anInt8865 = local159;
										}
										if (this.anInt8868 < local159) {
											this.anInt8868 = local159;
										}
										local122.f(local159);
									}
								}
							}
						}
					}
					local122.b();
					if (this.anInterface1_7.method7521()) {
						break;
					}
				}
			}
			this.anInt8872 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
	private void method7442() {
		if (!this.aBoolean617) {
			return;
		}
		this.aBoolean617 = false;
		@Pc(24) byte[] local24 = this.aClass15_2.aByteArray3;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = this.aClass15_2.anInt853;
		@Pc(41) int local41 = this.anInt8869 + this.anInt8870 * this.aClass15_2.anInt853;
		@Pc(54) int local54;
		for (@Pc(43) int local43 = -128; local43 < 0; local43++) {
			local26 = (local26 << 8) - local26;
			for (local54 = -128; local54 < 0; local54++) {
				if (local24[local41++] != 0) {
					local26++;
				}
			}
			local41 += local30 - 128;
		}
		if (this.anInterface5_3 != null && this.anInt8867 == local26) {
			this.aBoolean617 = false;
			return;
		}
		this.anInt8867 = local26;
		local54 = 0;
		local41 = local30 * this.anInt8870 + this.anInt8869;
		@Pc(117) int local117;
		@Pc(121) int local121;
		@Pc(129) int local129;
		if (!this.aClass9_Sub1_20.method7713(Static489.aClass289_13, Static97.aClass16_17)) {
			if (Static52.anIntArray137 == null) {
				Static52.anIntArray137 = new int[16384];
			}
			@Pc(115) int[] local115 = Static52.anIntArray137;
			for (local117 = -128; local117 < 0; local117++) {
				for (local121 = -128; local121 < 0; local121++) {
					if (local24[local41] == 0) {
						local129 = 0;
						if (local24[local41 - 1] != 0) {
							local129++;
						}
						if (local24[local41 + 1] != 0) {
							local129++;
						}
						if (local24[local41 - local30] != 0) {
							local129++;
						}
						if (local24[local41 + local30] != 0) {
							local129++;
						}
						local115[local54++] = local129 * 17 << 24;
					} else {
						local115[local54++] = 1140850688;
					}
					local41++;
				}
				local41 += this.aClass15_2.anInt853 - 128;
			}
			if (this.anInterface5_3 == null) {
				this.anInterface5_3 = this.aClass9_Sub1_20.method7711(128, Static52.anIntArray137, false, 128);
				this.anInterface5_3.method7967(false, false);
			} else {
				this.anInterface5_3.method7968(128, 0, 128, Static52.anIntArray137, 0, 128);
			}
			return;
		}
		if (Static168.aByteArray59 == null) {
			Static168.aByteArray59 = new byte[16384];
		}
		@Pc(244) byte[] local244 = Static168.aByteArray59;
		for (local117 = -128; local117 < 0; local117++) {
			for (local121 = -128; local121 < 0; local121++) {
				if (local24[local41] == 0) {
					local129 = 0;
					if (local24[local41 - 1] != 0) {
						local129++;
					}
					if (local24[local41 + 1] != 0) {
						local129++;
					}
					if (local24[local41 - local30] != 0) {
						local129++;
					}
					if (local24[local30 + local41] != 0) {
						local129++;
					}
					local244[local54++] = (byte) (local129 * 17);
				} else {
					local244[local54++] = 68;
				}
				local41++;
			}
			local41 += this.aClass15_2.anInt853 - 128;
		}
		if (this.anInterface5_3 == null) {
			this.anInterface5_3 = this.aClass9_Sub1_20.method7702(false, 128, Static168.aByteArray59, 128, Static97.aClass16_17);
			this.anInterface5_3.method7967(false, false);
		} else {
			this.anInterface5_3.method7973(128, Static168.aByteArray59, 128, Static97.aClass16_17, 128);
		}
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V")
	public void method7444() {
		this.method7445(this.anInterface1_7, this.anInt8872);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!af;II)V")
	public void method7445(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method7442();
			this.aClass9_Sub1_20.method7712(this.anInterface5_3);
			this.aClass9_Sub1_20.method7658(Static29.aClass102_1, this.anInt8865, 0, this.anInt8868 + 1 - this.anInt8865, arg1, arg0);
		}
	}
}
