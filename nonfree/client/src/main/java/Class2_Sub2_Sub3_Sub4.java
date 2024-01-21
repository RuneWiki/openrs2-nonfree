import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public abstract class Class2_Sub2_Sub3_Sub4 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!n", name = "eb", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!n", name = "Gb", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!n", name = "rb", descriptor = "[[B")
	protected byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!n", name = "mb", descriptor = "I")
	public int anInt1744 = 0;

	@OriginalMember(owner = "client!n", name = "ab", descriptor = "[I")
	private int[] anIntArray276;

	@OriginalMember(owner = "client!n", name = "ib", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!n", name = "bb", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!n", name = "hb", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!n", name = "yb", descriptor = "I")
	private int anInt1748;

	@OriginalMember(owner = "client!n", name = "sb", descriptor = "I")
	private int anInt1746;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub2_Sub3_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray276 = arg1;
		this.anIntArray280 = arg2;
		this.anIntArray277 = arg3;
		this.anIntArray279 = arg4;
		this.method1277(arg0);
		this.aByteArrayArray3 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray280[local32] < local28 && this.anIntArray279[local32] != 0) {
				local28 = this.anIntArray280[local32];
			}
			if (this.anIntArray280[local32] + this.anIntArray279[local32] > local30) {
				local30 = this.anIntArray280[local32] + this.anIntArray279[local32];
			}
		}
		this.anInt1748 = this.anInt1744 - local28;
		this.anInt1746 = local30 - this.anInt1744;
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub3_Sub4(@OriginalArg(0) byte[] arg0) {
		this.method1277(arg0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;II[I[I)V")
	private void method1251(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1744;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3606; local12++) {
			@Pc(20) int local20 = arg0.aByteArray46[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class77 local40 = arg0.method2530(local6 + 1, local12);
					local6 = -1;
					if (local40.method2519(Static102.aClass77_685)) {
						local20 = 60;
					} else {
						if (!local40.method2519(Static102.aClass77_686)) {
							if (local40.method2522(Static102.aClass77_689)) {
								try {
									if (arg3 == null) {
										local69 = 0;
									} else {
										local69 = arg3[local10];
									}
									if (arg4 == null) {
										local78 = 0;
									} else {
										local78 = arg4[local10];
									}
									local10++;
									local89 = local40.method2504(4).method2521();
									@Pc(93) Class2_Sub2_Sub3_Sub3 local93 = Static102.aClass2_Sub2_Sub3_Sub3Array11[local89];
									if (Static102.anInt1743 == 256) {
										local93.method1019(arg1 + local69, local4 + this.anInt1744 - local93.anInt1452 + local78);
									} else {
										local93.method1020(arg1 + local69, local4 + this.anInt1744 - local93.anInt1452 + local78, Static102.anInt1743);
									}
									arg1 += local93.anInt1450;
									local8 = -1;
								} catch (@Pc(135) Exception local135) {
								}
							} else {
								this.method1262(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray27 != null && local8 != -1) {
						arg1 += this.aByteArray27[(local8 << 8) + local20];
					}
					@Pc(165) int local165 = this.anIntArray277[local20];
					local69 = this.anIntArray279[local20];
					if (arg3 == null) {
						local78 = 0;
					} else {
						local78 = arg3[local10];
					}
					if (arg4 == null) {
						local89 = 0;
					} else {
						local89 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static102.anInt1751 > 0) {
							Static102.anInt1745 += Static102.anInt1751;
							arg1 += Static102.anInt1745 >> 8;
							Static102.anInt1745 &= 0xFF;
						}
					} else if (Static102.anInt1743 == 256) {
						if (Static102.anInt1741 != -1) {
							this.method1263(local20, arg1 + this.anIntArray276[local20] + local78 + 1, local4 + this.anIntArray280[local20] + 1 + local89, local165, local69, Static102.anInt1741);
						}
						this.method1261(local20, arg1 + this.anIntArray276[local20] + local78, local4 + this.anIntArray280[local20] + local89, local165, local69, Static102.anInt1752);
					} else {
						if (Static102.anInt1741 != -1) {
							this.method1259(local20, arg1 + this.anIntArray276[local20] + local78 + 1, local4 + this.anIntArray280[local20] + 1 + local89, local165, local69, Static102.anInt1741, Static102.anInt1743);
						}
						this.method1268(local20, arg1 + this.anIntArray276[local20] + local78, local4 + this.anIntArray280[local20] + local89, local165, local69, Static102.anInt1752, Static102.anInt1743);
					}
					@Pc(322) int local322 = this.anIntArray278[local20];
					if (Static102.anInt1749 != -1) {
						Static113.method1236(arg1, local4 + (int) ((double) this.anInt1744 * 0.7D), local322, Static102.anInt1749);
					}
					if (Static102.anInt1740 != -1) {
						Static113.method1236(arg1, local4 + this.anInt1744, local322, Static102.anInt1740);
					}
					arg1 += local322;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
	private void method1252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static102.anInt1749 = -1;
		Static102.anInt1740 = -1;
		Static102.anInt1750 = arg1;
		Static102.anInt1741 = arg1;
		Static102.anInt1742 = arg0;
		Static102.anInt1752 = arg0;
		Static102.anInt1747 = 256;
		Static102.anInt1743 = 256;
		Static102.anInt1751 = 0;
		Static102.anInt1745 = 0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;IIIIIIIIII)I")
	private int method1253(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1257(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1744;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1748 + this.anInt1746 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1269(arg0, local20, Static102.aClass77Array13);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1748;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1748 + (arg4 - this.anInt1748 - this.anInt1746 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1746 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1748 - this.anInt1746 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1748 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1254(Static102.aClass77Array13[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1254(Static102.aClass77Array13[local118], arg1 + (arg3 - this.method1276(Static102.aClass77Array13[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1254(Static102.aClass77Array13[local118], arg1 + arg3 - this.method1276(Static102.aClass77Array13[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1254(Static102.aClass77Array13[local118], arg1, local57);
			} else {
				this.method1274(Static102.aClass77Array13[local118], arg3);
				this.method1254(Static102.aClass77Array13[local118], arg1, local57);
				Static102.anInt1751 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;II)V")
	private void method1254(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1744;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt3606; local10++) {
			@Pc(18) int local18 = arg0.aByteArray46[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class77 local38 = arg0.method2530(local6 + 1, local10);
					local6 = -1;
					if (local38.method2519(Static102.aClass77_685)) {
						local18 = 60;
					} else {
						if (!local38.method2519(Static102.aClass77_686)) {
							if (local38.method2522(Static102.aClass77_689)) {
								try {
									local68 = local38.method2504(4).method2521();
									@Pc(72) Class2_Sub2_Sub3_Sub3 local72 = Static102.aClass2_Sub2_Sub3_Sub3Array11[local68];
									if (Static102.anInt1743 == 256) {
										local72.method1019(arg1, local4 + this.anInt1744 - local72.anInt1452);
									} else {
										local72.method1020(arg1, local4 + this.anInt1744 - local72.anInt1452, Static102.anInt1743);
									}
									arg1 += local72.anInt1450;
									local8 = -1;
								} catch (@Pc(106) Exception local106) {
								}
							} else {
								this.method1262(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray27 != null && local8 != -1) {
						arg1 += this.aByteArray27[(local8 << 8) + local18];
					}
					@Pc(136) int local136 = this.anIntArray277[local18];
					local68 = this.anIntArray279[local18];
					if (local18 == 32) {
						if (Static102.anInt1751 > 0) {
							Static102.anInt1745 += Static102.anInt1751;
							arg1 += Static102.anInt1745 >> 8;
							Static102.anInt1745 &= 0xFF;
						}
					} else if (Static102.anInt1743 == 256) {
						if (Static102.anInt1741 != -1) {
							this.method1263(local18, arg1 + this.anIntArray276[local18] + 1, local4 + this.anIntArray280[local18] + 1, local136, local68, Static102.anInt1741);
						}
						this.method1261(local18, arg1 + this.anIntArray276[local18], local4 + this.anIntArray280[local18], local136, local68, Static102.anInt1752);
					} else {
						if (Static102.anInt1741 != -1) {
							this.method1259(local18, arg1 + this.anIntArray276[local18] + 1, local4 + this.anIntArray280[local18] + 1, local136, local68, Static102.anInt1741, Static102.anInt1743);
						}
						this.method1268(local18, arg1 + this.anIntArray276[local18], local4 + this.anIntArray280[local18], local136, local68, Static102.anInt1752, Static102.anInt1743);
					}
					@Pc(258) int local258 = this.anIntArray278[local18];
					if (Static102.anInt1749 != -1) {
						Static113.method1236(arg1, local4 + (int) ((double) this.anInt1744 * 0.7D), local258, Static102.anInt1749);
					}
					if (Static102.anInt1740 != -1) {
						Static113.method1236(arg1, local4 + this.anInt1744 + 1, local258, Static102.anInt1740);
					}
					arg1 += local258;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;IIII)V")
	public final void method1255(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1252(arg3, arg4);
			this.method1254(arg0, arg1 - this.method1276(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!sg;IIII)V")
	public final void method1256(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1252(arg3, arg4);
			this.method1254(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	private void method1257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static102.anInt1749 = -1;
		Static102.anInt1740 = -1;
		Static102.anInt1750 = arg1;
		Static102.anInt1741 = arg1;
		Static102.anInt1742 = arg0;
		Static102.anInt1752 = arg0;
		Static102.anInt1747 = arg2;
		Static102.anInt1743 = arg2;
		Static102.anInt1751 = 0;
		Static102.anInt1745 = 0;
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)I")
	private int method1258(@OriginalArg(0) int arg0) {
		return this.anIntArray278[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIII)V")
	private void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static113.anInt1736;
		@Pc(9) int local9 = Static113.anInt1736 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static113.anInt1737) {
			local20 = Static113.anInt1737 - arg2;
			arg4 -= local20;
			arg2 = Static113.anInt1737;
			local13 = local20 * arg3;
			local5 += local20 * Static113.anInt1736;
		}
		if (arg2 + arg4 > Static113.anInt1739) {
			arg4 -= arg2 + arg4 - Static113.anInt1739;
		}
		if (arg1 < Static113.anInt1734) {
			local20 = Static113.anInt1734 - arg1;
			arg3 -= local20;
			arg1 = Static113.anInt1734;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static113.anInt1735) {
			local20 = arg1 + arg3 - Static113.anInt1735;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static102.method1271(Static113.anIntArray275, this.aByteArrayArray3[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;IIIII)V")
	public final void method1260(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1252(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3606];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3606; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1251(arg0, arg1 - this.method1276(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(IIIIII)V")
	protected abstract void method1261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;)V")
	private void method1262(@OriginalArg(0) Class77 arg0) {
		try {
			if (arg0.method2522(Static102.aClass77_691)) {
				Static102.anInt1752 = arg0.method2504(4).method2523(16);
				return;
			}
			if (arg0.method2519(Static102.aClass77_690)) {
				Static102.anInt1752 = Static102.anInt1742;
				return;
			}
			if (arg0.method2522(Static102.aClass77_688)) {
				Static102.anInt1749 = arg0.method2504(4).method2523(16);
				return;
			}
			if (arg0.method2519(Static102.aClass77_695)) {
				Static102.anInt1749 = 8388608;
				return;
			}
			if (arg0.method2519(Static102.aClass77_694)) {
				Static102.anInt1749 = -1;
				return;
			}
			if (arg0.method2522(Static102.aClass77_697)) {
				Static102.anInt1740 = arg0.method2504(2).method2523(16);
				return;
			}
			if (arg0.method2519(Static102.aClass77_692)) {
				Static102.anInt1740 = 0;
				return;
			}
			if (arg0.method2519(Static102.aClass77_684)) {
				Static102.anInt1740 = -1;
				return;
			}
			if (arg0.method2522(Static102.aClass77_696)) {
				Static102.anInt1741 = arg0.method2504(5).method2523(16);
				return;
			}
			if (arg0.method2519(Static102.aClass77_693)) {
				Static102.anInt1741 = 0;
				return;
			}
			if (arg0.method2519(Static102.aClass77_687)) {
				Static102.anInt1741 = Static102.anInt1750;
				return;
			}
			if (arg0.method2519(Static102.aClass77_683)) {
				this.method1257(Static102.anInt1742, Static102.anInt1750, Static102.anInt1747);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(IIIIII)V")
	private void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static113.anInt1736;
		@Pc(9) int local9 = Static113.anInt1736 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static113.anInt1737) {
			local20 = Static113.anInt1737 - arg2;
			arg4 -= local20;
			arg2 = Static113.anInt1737;
			local13 = local20 * arg3;
			local5 += local20 * Static113.anInt1736;
		}
		if (arg2 + arg4 > Static113.anInt1739) {
			arg4 -= arg2 + arg4 - Static113.anInt1739;
		}
		if (arg1 < Static113.anInt1734) {
			local20 = Static113.anInt1734 - arg1;
			arg3 -= local20;
			arg1 = Static113.anInt1734;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static113.anInt1735) {
			local20 = arg1 + arg3 - Static113.anInt1735;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static102.method1267(Static113.anIntArray275, this.aByteArrayArray3[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;I)I")
	public final int method1264(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1269(arg0, new int[] { arg1 }, Static102.aClass77Array13);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1276(Static102.aClass77Array13[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!sg;IIIII)V")
	public final void method1265(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1252(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3606];
		@Pc(14) int[] local14 = new int[arg0.anInt3606];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3606; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1251(arg0, arg1 - this.method1276(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(Lclient!sg;IIII)V")
	public final void method1266(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1252(arg3, arg4);
			this.method1254(arg0, arg1 - this.method1276(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method1268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;[I[Lclient!sg;)I")
	private int method1269(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class77[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class77 local11 = Static90.method1664(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method2532();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method2526(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class77 local55 = arg0.method2530(local19 + 1, local29);
					local19 = -1;
					local11.method2538(60);
					local11.method2503(local55);
					local11.method2538(62);
					if (local55.method2519(Static102.aClass77_683)) {
						arg2[local23++] = local11.method2530(local7, local11.method2532());
						local7 = local11.method2532();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method2519(Static102.aClass77_685)) {
						local5 += this.method1258(60);
						if (this.aByteArray27 != null && local21 != -1) {
							local5 += this.aByteArray27[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method2519(Static102.aClass77_686)) {
						local5 += this.method1258(62);
						if (this.aByteArray27 != null && local21 != -1) {
							local5 += this.aByteArray27[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method2522(Static102.aClass77_689)) {
						try {
							@Pc(173) int local173 = local55.method2504(4).method2521();
							local5 += Static102.aClass2_Sub2_Sub3_Sub3Array11[local173].anInt1450;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method2538(local35);
						local5 += this.method1258(local35);
						if (this.aByteArray27 != null && local21 != -1) {
							local5 += this.aByteArray27[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method2532();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method2530(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method2532();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method2532() > local7) {
			arg2[local23++] = local11.method2530(local7, local11.method2532());
		}
		return local23;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;IIIILjava/util/Random;I)I")
	public final int method1270(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1257(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt3606];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3606; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1251(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;IIIIIIIII)I")
	public final int method1272(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1253(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!sg;I)V")
	private void method1274(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method2532(); local5++) {
			@Pc(11) int local11 = arg0.method2526(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static102.anInt1751 = (arg1 - this.method1276(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!sg;)I")
	public final int method1276(@OriginalArg(0) Class77 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt3606; local11++) {
			@Pc(19) int local19 = arg0.aByteArray46[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class77 local39 = arg0.method2530(local5 + 1, local11);
					local5 = -1;
					if (local39.method2519(Static102.aClass77_685)) {
						local19 = 60;
					} else {
						if (!local39.method2519(Static102.aClass77_686)) {
							if (local39.method2522(Static102.aClass77_689)) {
								try {
									@Pc(69) int local69 = local39.method2504(4).method2521();
									local9 += Static102.aClass2_Sub2_Sub3_Sub3Array11[local69].anInt1450;
									local7 = -1;
								} catch (@Pc(80) Exception local80) {
								}
							}
							continue;
						}
						local19 = 62;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray278[local19];
					if (this.aByteArray27 != null && local7 != -1) {
						local9 += this.aByteArray27[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([B)V")
	private void method1277(@OriginalArg(0) byte[] arg0) {
		this.anIntArray278 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray278.length; local9++) {
				this.anIntArray278[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1744 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray278[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
			local58[local76] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(107) int local107;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(105) byte local105 = 0;
			for (local107 = 0; local107 < local93[local95].length; local107++) {
				local105 += arg0[local9++];
				local93[local95][local107] = local105;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(150) int local150;
		for (local107 = 0; local107 < 256; local107++) {
			local136[local107] = new byte[local55[local107]];
			@Pc(148) byte local148 = 0;
			for (local150 = 0; local150 < local136[local107].length; local150++) {
				local148 += arg0[local9++];
				local136[local107][local150] = local148;
			}
		}
		this.aByteArray27 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray27[(local182 << 8) + local150] = (byte) Static102.method1273(local93, local136, local58, this.anIntArray278, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1744 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(Lclient!sg;I)I")
	public final int method1278(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1) {
		return this.method1269(arg0, new int[] { arg1 }, Static102.aClass77Array13);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sg;IIIIII)V")
	public final void method1280(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1252(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt3606];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3606; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1251(arg0, arg1 - this.method1276(arg0) / 2, arg2, null, local23);
	}
}
