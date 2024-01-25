import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public abstract class Class75_Sub2 extends Class75 {

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
	protected int anInt7999;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
	protected int anInt8000;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
	protected int anInt8001;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
	protected int anInt8002;

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
	protected int anInt8003;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
	protected int anInt8005;

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
	protected int anInt8006;

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
	protected int anInt8007;

	@OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
	protected int anInt8008;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
	protected int anInt8009;

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "[[Lclient!ho;")
	protected Class121[][] aClass121ArrayArray3;

	@OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
	protected int anInt8010;

	@OriginalMember(owner = "client!hu", name = "z", descriptor = "[[Lclient!wh;")
	protected Class312[][] aClass312ArrayArray3;

	@OriginalMember(owner = "client!hu", name = "C", descriptor = "[[Lclient!vca;")
	protected Class294[][] aClass294ArrayArray3;

	@OriginalMember(owner = "client!hu", name = "D", descriptor = "[[Lclient!jw;")
	protected Class152[][] aClass152ArrayArray3;

	@OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
	protected int anInt8012;

	@OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
	protected int anInt8004 = -1;

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "Lclient!fg;")
	protected final Class39_Sub1 aClass39_Sub1_16;

	@OriginalMember(owner = "client!hu", name = "A", descriptor = "I")
	private final int anInt8011;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!hu", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!hu", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!fg;IIII[[I[[II)V")
	public Class75_Sub2(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass39_Sub1_16 = arg0;
		this.anInt8011 = arg2;
		this.anIntArrayArray70 = arg5;
		this.aByteArrayArray25 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass39_Sub1_16.anInt2083 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass39_Sub1_16.anInt2063 * local92 + this.aClass39_Sub1_16.anInt2067 * local98 + this.aClass39_Sub1_16.anInt2079 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray25[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray24 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)Z")
	protected final boolean method6707(@OriginalArg(0) int arg0) {
		if ((this.anInt8011 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!hu", name = "ba", descriptor = "(II)I")
	@Override
	public final int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray70[arg0][arg1];
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!at;[I)V")
	@Override
	public final void method6706(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!hu", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void ya(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method6698(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!hu", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public final Class2_Sub13_Sub6 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13_Sub6 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public final void F(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!hu", name = "Q", descriptor = "(III)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray24[arg0][arg1] < arg2) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!hu", name = "N", descriptor = "()V")
	@Override
	public final void N() {
		this.aByteArrayArray25 = null;
		this.aByteArrayArray24 = null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public final boolean method6703(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
	public abstract void method6699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public final void method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class181_Sub1 local3 = this.aClass39_Sub1_16.aClass181_Sub1_5;
		this.anInt8004 = -1;
		this.anInt8005 = local3.anInt6304;
		this.anInt8007 = local3.anInt6299;
		this.anInt8008 = local3.anInt6302;
		this.anInt7999 = local3.anInt6301;
		this.anInt8003 = local3.anInt6295;
		this.anInt8002 = local3.anInt6303;
		this.anInt8012 = local3.anInt6298;
		this.anInt8000 = local3.anInt6297;
		this.anInt8001 = local3.anInt6293;
		this.anInt8009 = local3.anInt6296;
		this.anInt8006 = local3.anInt6300;
		this.anInt8010 = local3.anInt6294;
	}

	@OriginalMember(owner = "client!hu", name = "aa", descriptor = "(II)I")
	@Override
	public final int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt7996;
		@Pc(9) int local9 = arg1 >> super.anInt7996;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt7998 - 1 || local9 > super.anInt7995 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt7994 - 1;
		@Pc(41) int local41 = arg1 & super.anInt7994 - 1;
		@Pc(67) int local67 = this.anIntArrayArray70[local4][local9] * (super.anInt7994 - local34) + this.anIntArrayArray70[local4 + 1][local9] * local34 >> super.anInt7996;
		@Pc(97) int local97 = this.anIntArrayArray70[local4][local9 + 1] * (super.anInt7994 - local34) + this.anIntArrayArray70[local4 + 1][local9 + 1] * local34 >> super.anInt7996;
		return local67 * (super.anInt7994 - local41) + local97 * local41 >> super.anInt7996;
	}

	@OriginalMember(owner = "client!hu", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass152ArrayArray3 == null) {
			this.aClass152ArrayArray3 = new Class152[super.anInt7998][super.anInt7995];
			this.aClass294ArrayArray3 = new Class294[super.anInt7998][super.anInt7995];
		} else if (this.aClass121ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static77.anIntArray130[Static71.method1451(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static77.anIntArray130[Static71.method1451(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == super.anInt7994 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt7994 && arg4[local116] == super.anInt7994) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt7994) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt7994 && arg2[local244] != arg2[0] - super.anInt7994) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt7994 && arg4[local244] != arg4[0] - super.anInt7994) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class152 local334 = new Class152();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt4285 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte63 = (byte) (local334.aByte63 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray70[arg0][arg1] == this.anIntArrayArray70[arg0 + 1][arg1] && this.anIntArrayArray70[arg0][arg1] == this.anIntArrayArray70[arg0 + 1][arg1 + 1] && this.anIntArrayArray70[arg0][arg1] == this.anIntArrayArray70[arg0][arg1 + 1]) {
				local334.aByte63 = (byte) (local334.aByte63 | 0x1);
			}
			if (local342 == -1 || (local334.aByte63 & 0x2) != 0 || this.aClass39_Sub1_16.anInterface12_15.method2573(local342).aBoolean460) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt4286 = Static21.method552(arg10, Static551.method6708(arg6[local104] >> 8, this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]), local527);
				if (local334.anInt4285 != 0) {
					local334.anInt4286 |= this.aByteArrayArray24[arg0][arg1] + 255 - this.aByteArrayArray25[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt4284 = Static21.method552(arg10, Static551.method6708(arg6[local106] >> 8, this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]), local527);
				if (local334.anInt4285 != 0) {
					local334.anInt4284 |= this.aByteArrayArray24[arg0 + 1][arg1] + 255 - this.aByteArrayArray25[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt4288 = Static21.method552(arg10, Static551.method6708(arg6[local108] >> 8, this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]), local527);
				if (local334.anInt4285 != 0) {
					local334.anInt4288 |= this.aByteArrayArray24[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray25[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt4287 = Static21.method552(arg10, Static551.method6708(arg6[local110] >> 8, this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]), local527);
				if (local334.anInt4285 != 0) {
					local334.anInt4287 |= this.aByteArrayArray24[arg0][arg1 + 1] + 255 - this.aByteArrayArray25[arg0][arg1 + 1] << 25;
				}
				local334.aShort90 = -1;
			} else {
				local334.anInt4286 = this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1];
				local334.anInt4284 = this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1];
				local334.anInt4288 = this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1];
				local334.anInt4287 = this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1];
				local334.aShort90 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort92 = (short) arg5[local108];
				local334.aShort94 = (short) arg5[local110];
				local334.aShort91 = (short) arg5[local106];
				local334.aShort93 = (short) arg5[local104];
			}
			this.aClass152ArrayArray3[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class294 local888 = new Class294();
		local888.aShort151 = (short) arg2.length;
		local888.aShort150 = (short) (arg2.length / 3);
		local888.aShortArray127 = new short[local888.aShort151];
		local888.aShortArray125 = new short[local888.aShort151];
		local888.aShortArray128 = new short[local888.aShort151];
		local888.anIntArray677 = new int[local888.aShort151];
		if (arg5 != null) {
			local888.aShortArray129 = new short[local888.aShort151];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort151; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt7994) {
				local958 = this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1];
			} else if (local342 == super.anInt7994 && local527 == super.anInt7994) {
				local958 = this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt7994 && local527 == 0) {
				local958 = this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]) * (super.anInt7994 - local342) + (this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]) * (super.anInt7994 - local342) + (this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt7994 - local527) + local1126 * local527 >> super.anInt7996 * 2;
			}
			local1079 = (arg0 << super.anInt7996) + local342;
			local1126 = (arg1 << super.anInt7996) + local527;
			local888.aShortArray127[local244] = (short) local342;
			local888.aShortArray128[local244] = (short) local527;
			local888.aShortArray125[local244] = (short) (this.aa(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass39_Sub1_16.anInterface12_15.method2573(arg8[local244]).aBoolean460) {
				local888.anIntArray677[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray129[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray677[local244] = Static21.method552(arg10, Static551.method6708(arg6[local244] >> 8, local958), local1226);
				if (arg7 != null) {
					local888.anIntArray677[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray677[local244] = 0;
			} else {
				local888.anIntArray677[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort150; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass39_Sub1_16.anInterface12_15.method2573(arg8[local527 * 3]).aBoolean460) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray676 = new int[local888.aShort150];
		}
		if (local1296) {
			local888.aShortArray126 = new short[local888.aShort150];
			local888.aShortArray130 = new short[local888.aShort150];
		}
		for (local958 = 0; local958 < local888.aShort150; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray676[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aBoolean460) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aBoolean460) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aBoolean460) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray126[local958] = (short) local1384;
					local888.aShortArray130[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aBoolean460) {
							local888.anIntArray677[local1079] = Static77.anIntArray130[Static71.method1451(this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aShort118 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aBoolean460) {
							local888.anIntArray677[local1126] = Static77.anIntArray130[Static71.method1451(this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aShort118 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aBoolean460) {
							local888.anIntArray677[local1226] = Static77.anIntArray130[Static71.method1451(this.aClass39_Sub1_16.anInterface12_15.method2573(local1384).aShort118 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray126[local958] = -1;
				}
			}
		}
		this.aClass294ArrayArray3[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public final void method6704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass121ArrayArray3 == null) {
			this.aClass121ArrayArray3 = new Class121[super.anInt7998][super.anInt7995];
			this.aClass312ArrayArray3 = new Class312[super.anInt7998][super.anInt7995];
		} else if (this.aClass152ArrayArray3 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != super.anInt7994 || local70 != 0 && local70 != super.anInt7994) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class312 local95 = new Class312();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort163 = local99;
			local95.aShortArray146 = new short[local99];
			local95.aShortArray149 = new short[local99];
			local95.aShortArray151 = new short[local99];
			local95.aShortArray148 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray146[local124] = (short) (this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt7994) {
					local95.aShortArray146[local124] = (short) (this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]);
				} else if (local129 == super.anInt7994 && local133 == super.anInt7994) {
					local95.aShortArray146[local124] = (short) (this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt7994 && local133 == 0) {
					local95.aShortArray146[local124] = (short) (this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]) * (super.anInt7994 - local129) + (this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]) * (super.anInt7994 - local129) + (this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray146[local124] = (short) (local288 * (super.anInt7994 - local133) + local335 * local133 >> super.anInt7996 * 2);
				}
				local288 = (arg0 << super.anInt7996) + local129;
				local335 = (arg1 << super.anInt7996) + local133;
				local95.aShortArray149[local124] = (short) local129;
				local95.aShortArray148[local124] = (short) local133;
				local95.aShortArray151[local124] = (short) (this.aa(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray146[local124] < 2) {
					local95.aShortArray146[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass39_Sub1_16.anInterface12_15.method2573(arg11[local288]).aBoolean460) {
					local415 = true;
				}
			}
			local95.anIntArray753 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray754 = new int[local133];
			}
			local95.aShortArray150 = new short[local133];
			local95.aShortArray145 = new short[local133];
			local95.aShortArray147 = new short[local133];
			if (local415) {
				local95.aShortArray144 = new short[local133];
				local95.aShortArray152 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray753[local95.aShort162] = Static71.method1451(arg9[local335]);
					} else {
						local95.anIntArray753[local95.aShort162] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray754[local95.aShort162] = -1;
						} else {
							local95.anIntArray754[local95.aShort162] = Static71.method1451(arg10[local335]);
						}
					}
					local95.aShortArray150[local95.aShort162] = (short) arg6[local335];
					local95.aShortArray145[local95.aShort162] = (short) arg7[local335];
					local95.aShortArray147[local95.aShort162] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass39_Sub1_16.anInterface12_15.method2573(arg11[local335]).aBoolean460) {
							local95.aShortArray144[local95.aShort162] = -1;
						} else {
							local95.aShortArray144[local95.aShort162] = (short) arg11[local335];
							local95.aShortArray152[local95.aShort162] = (short) arg12[local335];
						}
					}
					local95.aShort162++;
				}
			}
			this.aClass312ArrayArray3[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class121 local644 = new Class121();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt3408 = Static35.method704(this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1], Static71.method1451(arg10[0]));
				if (local64 == -1) {
					local644.aByte51 = (byte) (local644.aByte51 | 0x2);
				}
			}
			if (this.anIntArrayArray70[arg0][arg1] == this.anIntArrayArray70[arg0 + 1][arg1] && this.anIntArrayArray70[arg0][arg1] == this.anIntArrayArray70[arg0 + 1][arg1 + 1] && this.anIntArrayArray70[arg0][arg1] == this.anIntArrayArray70[arg0][arg1 + 1]) {
				local644.aByte51 = (byte) (local644.aByte51 | 0x1);
			}
			if (local70 == -1 || (local644.aByte51 & 0x2) != 0 || this.aClass39_Sub1_16.anInterface12_15.method2573(local70).aBoolean460) {
				@Pc(845) short local845 = Static71.method1451(local64);
				local644.aShort64 = (short) Static35.method704(this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1], local845);
				local644.aShort62 = (short) Static35.method704(this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1], local845);
				local644.aShort61 = (short) Static35.method704(this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1], local845);
				local644.aShort65 = (short) Static35.method704(this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1], local845);
				local644.aShort63 = -1;
			} else {
				local644.aShort64 = (short) (this.aByteArrayArray25[arg0][arg1] - this.aByteArrayArray24[arg0][arg1]);
				local644.aShort62 = (short) (this.aByteArrayArray25[arg0 + 1][arg1] - this.aByteArrayArray24[arg0 + 1][arg1]);
				local644.aShort61 = (short) (this.aByteArrayArray25[arg0 + 1][arg1 + 1] - this.aByteArrayArray24[arg0 + 1][arg1 + 1]);
				local644.aShort65 = (short) (this.aByteArrayArray25[arg0][arg1 + 1] - this.aByteArrayArray24[arg0][arg1 + 1]);
				local644.aShort63 = (short) local70;
			}
			this.aClass121ArrayArray3[arg0][arg1] = local644;
		}
	}
}
