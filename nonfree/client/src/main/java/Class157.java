import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class157 {

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "[I")
	private final int[] anIntArray377;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "[B")
	private final byte[] aByteArray87;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "[I")
	private int[] anIntArray376;

	static {
		new Class209(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "([B)V")
	public Class157(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray377 = new int[local6];
		this.aByteArray87 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray376 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local16[local30];
				this.anIntArray377[local24] = local45;
				@Pc(61) int local61;
				@Pc(65) int local65;
				@Pc(71) int local71;
				@Pc(87) int local87;
				if ((local45 & local41) == 0) {
					local61 = local41 | local45;
					for (local65 = local30 - 1; local65 >= 1; local65--) {
						local71 = local16[local65];
						if (local45 != local71) {
							break;
						}
						local87 = 0x1 << 32 - local65;
						if ((local87 & local71) != 0) {
							local16[local65] = local16[local65 - 1];
							break;
						}
						local16[local65] = local87 | local71;
					}
				} else {
					local61 = local16[local30 - 1];
				}
				local16[local30] = local61;
				for (local65 = local30 + 1; local65 <= 32; local65++) {
					if (local45 == local16[local65]) {
						local16[local65] = local61;
					}
				}
				local71 = 0;
				for (local87 = 0; local87 < local30; local87++) {
					@Pc(158) int local158 = Integer.MIN_VALUE >>> local87;
					if ((local158 & local45) == 0) {
						local71++;
					} else {
						if (this.anIntArray376[local71] == 0) {
							this.anIntArray376[local71] = local22;
						}
						local71 = this.anIntArray376[local71];
					}
					if (local71 >= this.anIntArray376.length) {
						@Pc(199) int[] local199 = new int[this.anIntArray376.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray376.length; local201++) {
							local199[local201] = this.anIntArray376[local201];
						}
						this.anIntArray376 = local199;
					}
				}
				this.anIntArray376[local71] = ~local24;
				if (local71 >= local22) {
					local22 = local71 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III[B[BB)I")
	public int method3607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg2;
		@Pc(18) int local18 = 0;
		@Pc(26) int local26 = arg0;
		while (true) {
			@Pc(30) byte local30 = arg4[local26];
			if (local30 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray376[local18];
			}
			@Pc(46) int local46;
			if ((local46 = this.anIntArray376[local18]) < 0) {
				arg3[arg1++] = (byte) ~local46;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray376[local18];
			}
			@Pc(82) int local82;
			if ((local82 = this.anIntArray376[local18]) < 0) {
				arg3[arg1++] = (byte) ~local82;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray376[local18];
			}
			@Pc(114) int local114;
			if ((local114 = this.anIntArray376[local18]) < 0) {
				arg3[arg1++] = (byte) ~local114;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray376[local18];
			}
			@Pc(150) int local150;
			if ((local150 = this.anIntArray376[local18]) < 0) {
				arg3[arg1++] = (byte) ~local150;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray376[local18];
			}
			@Pc(189) int local189;
			if ((local189 = this.anIntArray376[local18]) < 0) {
				arg3[arg1++] = (byte) ~local189;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray376[local18];
			}
			@Pc(221) int local221;
			if ((local221 = this.anIntArray376[local18]) < 0) {
				arg3[arg1++] = (byte) ~local221;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray376[local18];
			}
			@Pc(260) int local260;
			if ((local260 = this.anIntArray376[local18]) < 0) {
				arg3[arg1++] = (byte) ~local260;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray376[local18];
			}
			@Pc(302) int local302;
			if ((local302 = this.anIntArray376[local18]) < 0) {
				arg3[arg1++] = (byte) ~local302;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			local26++;
		}
		return local26 + 1 - arg0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([BIZII[B)I")
	public int method3608(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg1 << 3;
		@Pc(20) int local20 = arg3;
		while (local20 > arg2) {
			@Pc(28) int local28 = arg4[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray377[local28];
			@Pc(38) byte local38 = this.aByteArray87[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(77) int local77 = local55 + (local59 + local38 - 1 >> 3);
			@Pc(78) int local78 = local59 + 24;
			arg0[local55] = (byte) (local12 |= local33 >>> local78);
			if (local77 > local55) {
				local55++;
				local59 = local78 - 8;
				arg0[local55] = (byte) (local12 = local33 >>> local59);
				if (local55 < local77) {
					local55++;
					local59 -= 8;
					arg0[local55] = (byte) (local12 = local33 >>> local59);
					if (local55 < local77) {
						local59 -= 8;
						local55++;
						arg0[local55] = (byte) (local12 = local33 >>> local59);
						if (local55 < local77) {
							local55++;
							local59 -= 8;
							arg0[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			local16 += local38;
			arg2++;
		}
		return (local16 + 7 >> 3) - arg1;
	}
}
