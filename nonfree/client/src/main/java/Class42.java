import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class42 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_522 = Static12.method257("Report abuse");

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!oa;")
	public static Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!qc;")
	public static Class47 aClass47_15 = new Class47(30);

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_523 = Static12.method257("*6nYou have not yet set any recovery questions)3*6nIt is @lre@strongly@yel@ recommended that you do so)3*6n*6nIf you don(Wt you will be @lre@unable to recover your*6n@lre@password@yel@ if you forget it)1 or it is stolen)3");

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_525 = Static12.method257("(U1");

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_524 = Static12.method257("Choose Option");

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	public static int anInt1813 = 0;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_526 = Static12.method257("Walk here @whi@");

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "[I")
	private final int[] anIntArray410;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[B")
	private final byte[] aByteArray15;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III[BI[B)I", line = 110)
	public int method1212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg2;
		while (true) {
			@Pc(24) byte local24 = arg3[local20];
			if (local24 >= 0) {
				local18++;
			} else {
				local18 = this.anIntArray409[local18];
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray409[local18]) < 0) {
				arg4[arg0++] = (byte) ~local43;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray409[local18];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray409[local18]) < 0) {
				arg4[arg0++] = (byte) ~local81;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray409[local18];
			}
			@Pc(123) int local123;
			if ((local123 = this.anIntArray409[local18]) < 0) {
				arg4[arg0++] = (byte) ~local123;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray409[local18];
			}
			@Pc(155) int local155;
			if ((local155 = this.anIntArray409[local18]) < 0) {
				arg4[arg0++] = (byte) ~local155;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray409[local18];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray409[local18]) < 0) {
				arg4[arg0++] = (byte) ~local197;
				if (arg0 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray409[local18];
			}
			@Pc(232) int local232;
			if ((local232 = this.anIntArray409[local18]) < 0) {
				arg4[arg0++] = (byte) ~local232;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray409[local18];
			}
			@Pc(271) int local271;
			if ((local271 = this.anIntArray409[local18]) < 0) {
				arg4[arg0++] = (byte) ~local271;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray409[local18];
			}
			@Pc(310) int local310;
			if ((local310 = this.anIntArray409[local18]) < 0) {
				arg4[arg0++] = (byte) ~local310;
				if (local16 <= arg0) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg2;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BI[BIBI)I", line = 260)
	public int method1213(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(16) int local16 = arg4 << 3;
		while (local12 > arg3) {
			@Pc(28) int local28 = arg0[arg3] & 0xFF;
			@Pc(33) byte local33 = this.aByteArray15[local28];
			@Pc(38) int local38 = this.anIntArray410[local28];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			@Pc(70) int local70 = (local59 + local33 - 1 >> 3) + local55;
			local8 &= -local59 >> 31;
			@Pc(78) int local78 = local59 + 24;
			arg2[local55] = (byte) (local8 |= local38 >>> local78);
			if (local55 < local70) {
				local59 = local78 - 8;
				local55++;
				arg2[local55] = (byte) (local8 = local38 >>> local59);
				if (local70 > local55) {
					local59 -= 8;
					local55++;
					arg2[local55] = (byte) (local8 = local38 >>> local59);
					if (local70 > local55) {
						local59 -= 8;
						local55++;
						arg2[local55] = (byte) (local8 = local38 >>> local59);
						if (local55 < local70) {
							local59 -= 8;
							local55++;
							arg2[local55] = (byte) (local8 = local38 << -local59);
						}
					}
				}
			}
			local16 += local33;
			arg3++;
		}
		return (local16 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V", line = 361)
	public Class42(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(9) int local9 = arg0.length;
		this.anIntArray410 = new int[local9];
		this.anIntArray409 = new int[8];
		@Pc(19) int local19 = 0;
		this.aByteArray15 = arg0;
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local6[local30];
				this.anIntArray410[local24] = local43;
				@Pc(56) int local56;
				@Pc(60) int local60;
				@Pc(66) int local66;
				@Pc(80) int local80;
				if ((local43 & local39) == 0) {
					local56 = local43 | local39;
					for (local60 = local30 - 1; local60 >= 1; local60--) {
						local66 = local6[local60];
						if (local66 != local43) {
							break;
						}
						local80 = 0x1 << 32 - local60;
						if ((local66 & local80) != 0) {
							local6[local60] = local6[local60 - 1];
							break;
						}
						local6[local60] = local80 | local66;
					}
				} else {
					local56 = local6[local30 - 1];
				}
				local6[local30] = local56;
				for (local60 = local30 + 1; local60 <= 32; local60++) {
					if (local43 == local6[local60]) {
						local6[local60] = local56;
					}
				}
				local66 = 0;
				for (local80 = 0; local80 < local30; local80++) {
					@Pc(152) int local152 = Integer.MIN_VALUE >>> local80;
					if ((local43 & local152) == 0) {
						local66++;
					} else {
						if (this.anIntArray409[local66] == 0) {
							this.anIntArray409[local66] = local19;
						}
						local66 = this.anIntArray409[local66];
					}
					if (this.anIntArray409.length <= local66) {
						@Pc(190) int[] local190 = new int[this.anIntArray409.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray409.length; local192++) {
							local190[local192] = this.anIntArray409[local192];
						}
						this.anIntArray409 = local190;
					}
				}
				this.anIntArray409[local66] = ~local24;
				if (local66 >= local19) {
					local19 = local66 + 1;
				}
			}
		}
	}
}
