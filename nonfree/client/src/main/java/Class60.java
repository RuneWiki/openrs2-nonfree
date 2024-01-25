import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class60 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "[I")
	private final int[] anIntArray184;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "[B")
	private final byte[] aByteArray25;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([B)V")
	public Class60(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray184 = new int[local6];
		this.aByteArray25 = arg0;
		this.anIntArray185 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local20[local30];
				this.anIntArray184[local24] = local46;
				@Pc(64) int local64;
				@Pc(74) int local74;
				@Pc(80) int local80;
				@Pc(91) int local91;
				if ((local42 & local46) == 0) {
					local64 = local42 | local46;
					for (local74 = local30 - 1; local74 >= 1; local74--) {
						local80 = local20[local74];
						if (local80 != local46) {
							break;
						}
						local91 = 0x1 << 32 - local74;
						if ((local91 & local80) != 0) {
							local20[local74] = local20[local74 - 1];
							break;
						}
						local20[local74] = local91 | local80;
					}
				} else {
					local64 = local20[local30 - 1];
				}
				local20[local30] = local64;
				for (local74 = local30 + 1; local74 <= 32; local74++) {
					if (local46 == local20[local74]) {
						local20[local74] = local64;
					}
				}
				local80 = 0;
				for (local91 = 0; local91 < local30; local91++) {
					@Pc(154) int local154 = Integer.MIN_VALUE >>> local91;
					if ((local154 & local46) == 0) {
						local80++;
					} else {
						if (this.anIntArray185[local80] == 0) {
							this.anIntArray185[local80] = local22;
						}
						local80 = this.anIntArray185[local80];
					}
					if (this.anIntArray185.length <= local80) {
						@Pc(199) int[] local199 = new int[this.anIntArray185.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray185.length; local201++) {
							local199[local201] = this.anIntArray185[local201];
						}
						this.anIntArray185 = local199;
					}
				}
				if (local22 <= local80) {
					local22 = local80 + 1;
				}
				this.anIntArray185[local80] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BIBII[B)I")
	public int method1298(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = arg2;
		@Pc(32) int local32 = arg3;
		while (true) {
			@Pc(36) byte local36 = arg4[local32];
			if (local36 < 0) {
				local26 = this.anIntArray185[local26];
			} else {
				local26++;
			}
			@Pc(55) int local55;
			if ((local55 = this.anIntArray185[local26]) < 0) {
				arg0[arg1++] = (byte) ~local55;
				if (arg1 >= local30) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x40) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray185[local26];
			}
			@Pc(90) int local90;
			if ((local90 = this.anIntArray185[local26]) < 0) {
				arg0[arg1++] = (byte) ~local90;
				if (arg1 >= local30) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x20) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray185[local26];
			}
			@Pc(125) int local125;
			if ((local125 = this.anIntArray185[local26]) < 0) {
				arg0[arg1++] = (byte) ~local125;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x10) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray185[local26];
			}
			@Pc(164) int local164;
			if ((local164 = this.anIntArray185[local26]) < 0) {
				arg0[arg1++] = (byte) ~local164;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x8) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray185[local26];
			}
			@Pc(199) int local199;
			if ((local199 = this.anIntArray185[local26]) < 0) {
				arg0[arg1++] = (byte) ~local199;
				if (arg1 >= local30) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x4) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray185[local26];
			}
			@Pc(235) int local235;
			if ((local235 = this.anIntArray185[local26]) < 0) {
				arg0[arg1++] = (byte) ~local235;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x2) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray185[local26];
			}
			@Pc(273) int local273;
			if ((local273 = this.anIntArray185[local26]) < 0) {
				arg0[arg1++] = (byte) ~local273;
				if (arg1 >= local30) {
					break;
				}
				local26 = 0;
			}
			if ((local36 & 0x1) == 0) {
				local26++;
			} else {
				local26 = this.anIntArray185[local26];
			}
			@Pc(308) int local308;
			if ((local308 = this.anIntArray185[local26]) < 0) {
				arg0[arg1++] = (byte) ~local308;
				if (local30 <= arg1) {
					break;
				}
				local26 = 0;
			}
			local32++;
		}
		return local32 + 1 - arg3;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BI[BIIB)I")
	public int method1299(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = arg3 << 3;
		@Pc(20) int local20 = arg4;
		while (arg1 < local20) {
			@Pc(28) int local28 = arg0[arg1] & 0xFF;
			@Pc(33) int local33 = this.anIntArray184[local28];
			@Pc(38) byte local38 = this.aByteArray25[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local12 &= -local59 >> 31;
			@Pc(76) int local76 = local55 + (local38 + local59 - 1 >> 3);
			@Pc(77) int local77 = local59 + 24;
			arg2[local55] = (byte) (local12 |= local33 >>> local77);
			if (local55 < local76) {
				local55++;
				local59 = local77 - 8;
				arg2[local55] = (byte) (local12 = local33 >>> local59);
				if (local76 > local55) {
					local55++;
					local59 -= 8;
					arg2[local55] = (byte) (local12 = local33 >>> local59);
					if (local55 < local76) {
						local59 -= 8;
						local55++;
						arg2[local55] = (byte) (local12 = local33 >>> local59);
						if (local76 > local55) {
							local55++;
							local59 -= 8;
							arg2[local55] = (byte) (local12 = local33 << -local59);
						}
					}
				}
			}
			local16 += local38;
			arg1++;
		}
		return (local16 + 7 >> 3) - arg3;
	}
}
