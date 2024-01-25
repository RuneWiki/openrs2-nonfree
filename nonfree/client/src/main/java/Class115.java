import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public class Class115 {

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	protected final int anInt2997;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "Lclient!sm;")
	private final Class214 aClass214_17;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!mo;")
	private final Class158 aClass158_5;

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "Z")
	public final boolean aBoolean255;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public final int anInt2995;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
	protected final int anInt3002;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIZLclient!mo;Lclient!sm;)V")
	protected Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class158 arg4, @OriginalArg(5) Class214 arg5) {
		this.anInt2997 = arg2;
		this.aClass214_17 = arg5;
		this.aClass158_5 = arg4;
		this.aBoolean255 = arg3;
		this.anInt2995 = arg0;
		this.anInt3002 = arg1;
		this.aByteArrayArrayArray11 = new byte[this.anInt2995][this.anInt3002][this.anInt2997];
		this.aByteArrayArrayArray12 = new byte[this.anInt2995][this.anInt3002][this.anInt2997];
		this.anIntArrayArrayArray2 = new int[this.anInt2995][this.anInt3002 + 1][this.anInt2997 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt2995][this.anInt3002][this.anInt2997];
		this.aByteArrayArrayArray14 = new byte[this.anInt2995][this.anInt3002 + 1][this.anInt2997 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt2995][this.anInt3002][this.anInt2997];
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII[Lclient!tf;IIIILclient!re;)V")
	public final void method2447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class222[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class1_Sub33 arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean255) {
			@Pc(24) Class222 local24 = arg4[arg2];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg0 + Static55.method897(local30 & 0x7, arg6, local26 & 0x7);
					local57 = Static286.method4349(arg6, local26 & 0x7, local30 & 0x7) + arg3;
					if (local45 > 0 && local45 < this.anInt3002 - 1 && local57 > 0 && local57 < this.anInt2997 - 1) {
						local24.method4826(local57, local45);
					}
				}
			}
		}
		@Pc(102) int local102 = (arg1 & 0x1FFFFFF8) << 3;
		local26 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(125) byte local125 = 0;
		@Pc(127) byte local127 = 0;
		if (arg6 == 1) {
			local127 = 1;
		} else if (arg6 == 2) {
			local125 = 1;
			local127 = 1;
		} else if (arg6 == 3) {
			local125 = 1;
		}
		for (local57 = 0; local57 < this.anInt2995; local57++) {
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
					if (arg5 == local57 && local11 <= local156 && local11 + 8 >= local156 && local17 <= local160 && local160 <= local17 + 8) {
						@Pc(207) int local207;
						@Pc(214) int local214;
						if (local11 + 8 == local156 || local160 == local17 + 8) {
							if (arg6 == 0) {
								local207 = local156 + arg0 - local11;
								local214 = local160 + arg3 - local17;
							} else if (arg6 == 1) {
								local214 = local11 + arg3 + 8 - local156;
								local207 = local160 + arg0 - local17;
							} else if (arg6 == 2) {
								local214 = arg3 + local17 + 8 - local160;
								local207 = local11 + arg0 + 8 - local156;
							} else {
								local214 = arg3 + local156 - local11;
								local207 = arg0 + local17 + 8 - local160;
							}
							this.method2448(local207, true, 0, arg2, arg8, local214, 0, local156 + local102, local160 + local26, 0);
						} else {
							local207 = arg0 + Static55.method897(local160 & 0x7, arg6, local156 & 0x7);
							local214 = arg3 + Static286.method4349(arg6, local156 & 0x7, local160 & 0x7);
							this.method2448(local207, false, local127, arg2, arg8, local214, local125, local102 + local156, local160 + local26, arg6);
							if (local156 == 63 || local160 == 63) {
								@Pc(355) int local355 = local156 == 63 ? 64 : local156;
								@Pc(362) int local362 = local160 == 63 ? 64 : local160;
								@Pc(380) int local380;
								@Pc(374) int local374;
								if (arg6 == 0) {
									local374 = local362 + arg3 - local17;
									local380 = arg0 + local355 - local11;
								} else if (arg6 == 1) {
									local380 = arg0 + local362 - local17;
									local374 = arg3 + local11 + 8 - local355;
								} else if (arg6 == 2) {
									local380 = arg0 + local11 + 8 - local355;
									local374 = arg3 + local17 + 8 - local362;
								} else {
									local374 = arg3 + local355 - local11;
									local380 = local17 + arg0 + 8 - local362;
								}
								if (local380 >= 0 && this.anInt3002 > local380 && local374 >= 0 && this.anInt2997 > local374) {
									this.anIntArrayArrayArray2[arg2][local380][local374] = this.anIntArrayArrayArray2[arg2][local125 + local207][local214 + local127];
								}
							}
						}
					} else {
						this.method2448(-1, false, 0, 0, arg8, -1, 0, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZIILclient!re;IIIIII)V")
	private void method2448(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub33 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg2 = 1;
		} else if (arg9 == 2) {
			arg6 = 1;
			arg2 = 1;
		} else if (arg9 == 3) {
			arg6 = 1;
		}
		@Pc(62) int local62;
		if (arg0 < 0 || this.anInt3002 <= arg0 || arg5 < 0 || arg5 >= this.anInt2997) {
			while (true) {
				local62 = arg4.method5174();
				if (local62 == 0) {
					break;
				}
				if (local62 == 1) {
					arg4.method5174();
					break;
				}
				if (local62 <= 49) {
					arg4.method5174();
				}
			}
			return;
		}
		if (!this.aBoolean255 && !arg1) {
			Static373.aByteArrayArrayArray16[arg3][arg0][arg5] = 0;
		}
		while (true) {
			local62 = arg4.method5174();
			if (local62 == 0) {
				if (this.aBoolean255) {
					this.anIntArrayArrayArray2[0][arg6 + arg0][arg5 + arg2] = 0;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray2[0][arg6 + arg0][arg2 + arg5] = -Static166.method2987(arg7 + 932731, arg8 + 556238) * 8;
				} else {
					this.anIntArrayArrayArray2[arg3][arg6 + arg0][arg5 + arg2] = this.anIntArrayArrayArray2[arg3 - 1][arg0 + arg6][arg2 + arg5] - 240;
				}
				break;
			}
			if (local62 == 1) {
				@Pc(150) int local150 = arg4.method5174();
				if (this.aBoolean255) {
					this.anIntArrayArrayArray2[0][arg6 + arg0][arg5 + arg2] = local150 * 8;
				} else {
					if (local150 == 1) {
						local150 = 0;
					}
					if (arg3 == 0) {
						this.anIntArrayArrayArray2[0][arg0 + arg6][arg5 + arg2] = -local150 * 8;
					} else {
						this.anIntArrayArrayArray2[arg3][arg6 + arg0][arg5 + arg2] = this.anIntArrayArrayArray2[arg3 - 1][arg0 + arg6][arg5 + arg2] - local150 * 8;
					}
				}
				break;
			}
			if (local62 <= 49) {
				if (arg1) {
					arg4.method5174();
				} else {
					this.aByteArrayArrayArray12[arg3][arg0][arg5] = arg4.method5188();
					this.aByteArrayArrayArray9[arg3][arg0][arg5] = (byte) ((local62 - 2) / 4);
					this.aByteArrayArrayArray10[arg3][arg0][arg5] = (byte) (arg9 + local62 - 2 & 0x3);
				}
			} else if (local62 <= 81) {
				if (!this.aBoolean255 && !arg1) {
					Static373.aByteArrayArrayArray16[arg3][arg0][arg5] = (byte) (local62 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray11[arg3][arg0][arg5] = (byte) (local62 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!cl;ILclient!tq;Lclient!cl;)V")
	public final void method2451(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt3002][this.anInt2997];
		if (Static392.anIntArray747 == null || Static392.anIntArray747.length != this.anInt2997) {
			Static155.anIntArray338 = new int[this.anInt2997];
			Static384.anIntArray732 = new int[this.anInt2997];
			Static55.anIntArray145 = new int[this.anInt2997];
			Static392.anIntArray747 = new int[this.anInt2997];
			Static24.anIntArray75 = new int[this.anInt2997];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt2995; local44++) {
			for (local48 = 0; local48 < this.anInt2997; local48++) {
				Static392.anIntArray747[local48] = 0;
				Static384.anIntArray732[local48] = 0;
				Static55.anIntArray145[local48] = 0;
				Static24.anIntArray75[local48] = 0;
				Static155.anIntArray338[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt3002; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(179) int local179;
				for (@Pc(85) int local85 = 0; local85 < this.anInt2997; local85++) {
					local91 = local81 + 5;
					@Pc(156) int local156;
					if (this.anInt3002 > local91) {
						local110 = this.aByteArrayArrayArray11[local44][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(120) Class251 local120 = this.aClass214_17.method4732(local110 - 1);
							Static392.anIntArray747[local85] += local120.anInt6399;
							Static384.anIntArray732[local85] += local120.anInt6403;
							Static55.anIntArray145[local85] += local120.anInt6392;
							Static24.anIntArray75[local85] += local120.anInt6393;
							local156 = Static155.anIntArray338[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local179 = this.aByteArrayArrayArray11[local44][local110][local85] & 0xFF;
						if (local179 > 0) {
							@Pc(192) Class251 local192 = this.aClass214_17.method4732(local179 - 1);
							Static392.anIntArray747[local85] -= local192.anInt6399;
							Static384.anIntArray732[local85] -= local192.anInt6403;
							Static55.anIntArray145[local85] -= local192.anInt6392;
							Static24.anIntArray75[local85] -= local192.anInt6393;
							local156 = Static155.anIntArray338[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local179 = 0;
					@Pc(250) int local250 = 0;
					@Pc(252) int local252 = 0;
					for (@Pc(254) int local254 = -5; local254 < this.anInt2997; local254++) {
						@Pc(260) int local260 = local254 + 5;
						if (this.anInt2997 > local260) {
							local179 += Static55.anIntArray145[local260];
							local91 += Static392.anIntArray747[local260];
							local110 += Static384.anIntArray732[local260];
							local252 += Static155.anIntArray338[local260];
							local250 += Static24.anIntArray75[local260];
						}
						@Pc(302) int local302 = local254 - 5;
						if (local302 >= 0) {
							local250 -= Static24.anIntArray75[local302];
							local252 -= Static155.anIntArray338[local302];
							local91 -= Static392.anIntArray747[local302];
							local110 -= Static384.anIntArray732[local302];
							local179 -= Static55.anIntArray145[local302];
						}
						if (local254 >= 0 && local250 > 0 && local252 > 0) {
							local11[local81][local254] = Static218.method3197(local110 / local252, local179 / local252, local91 * 256 / local250);
						}
					}
				}
			}
			if (Static153.aBoolean242) {
				this.method2454(local44 == 0 ? arg0 : null, local11, local44, local44 == 0 ? arg2 : null, Static229.aClass42Array3[local44], arg1);
			} else {
				this.method2458(local44 == 0 ? arg0 : null, local44 == 0 ? arg2 : null, local11, arg1, local44, Static229.aClass42Array3[local44]);
			}
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray9[local44] = null;
			this.aByteArrayArrayArray10[local44] = null;
		}
		if (!this.aBoolean255) {
			if (Static393.anInt6410 != 0) {
				Static294.method4447();
			}
			if (Static155.aBoolean244) {
				Static256.method3913();
			}
		}
		for (local48 = 0; local48 < this.anInt2995; local48++) {
			Static229.aClass42Array3[local48].method3057();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
	public final void method2452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) int local16 = 0; local16 < this.anInt2995; local16++) {
			this.method2455(arg1, local16, arg0, 64, 64);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[Lclient!tf;Lclient!re;III)V")
	public final void method2453(@OriginalArg(0) int arg0, @OriginalArg(2) Class222[] arg1, @OriginalArg(3) Class1_Sub33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean255) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class222 local16 = arg1[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg3;
						@Pc(32) int local32 = local22 + arg4;
						if (local28 >= 0 && this.anInt3002 > local28 && local32 >= 0 && local32 < this.anInt2997) {
							local16.method4826(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg5 + arg3;
		@Pc(76) int local76 = arg0 + arg4;
		for (local18 = 0; local18 < this.anInt2995; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2448(arg3 + local22, false, 0, local18, arg2, arg4 + local28, 0, local10 + local22, local76 - -local28, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!cl;[[IILclient!cl;Lclient!cl;Lclient!tq;)V")
	private void method2454(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3, @OriginalArg(5) Class42 arg4, @OriginalArg(6) Class164 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray9[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray10[arg2];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray11[arg2];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray12[arg2];
		for (@Pc(27) int local27 = 0; local27 < this.anInt3002; local27++) {
			@Pc(45) int local45 = local27 < this.anInt3002 - 1 ? local27 + 1 : local27;
			for (@Pc(47) int local47 = 0; local47 < this.anInt2997; local47++) {
				@Pc(61) int local61 = this.anInt2997 - 1 <= local47 ? local47 : local47 + 1;
				if (Static105.anInt1862 == -1 || Static96.method1396(Static105.anInt1862, local27, local47, arg2)) {
					@Pc(76) boolean local76 = false;
					@Pc(78) boolean local78 = false;
					@Pc(81) boolean[] local81 = new boolean[4];
					@Pc(87) int local87 = local10[local27][local47];
					@Pc(93) int local93 = local15[local27][local47];
					@Pc(101) int local101 = local25[local27][local47] & 0xFF;
					@Pc(109) int local109 = local20[local27][local47] & 0xFF;
					@Pc(117) int local117 = local20[local27][local61] & 0xFF;
					@Pc(125) int local125 = local20[local45][local61] & 0xFF;
					@Pc(133) int local133 = local20[local45][local47] & 0xFF;
					if (local101 != 0 || local109 != 0) {
						@Pc(152) Class13 local152 = local101 == 0 ? null : this.aClass158_5.method3161(local101 - 1);
						if (local87 == 0 && local152 == null) {
							local87 = 12;
						}
						@Pc(173) Class251 local173 = local109 == 0 ? null : this.aClass214_17.method4732(local109 - 1);
						@Pc(175) Class13 local175 = local152;
						if (local152 != null) {
							if (local152.anInt202 == -1 && local152.anInt197 == -1) {
								local175 = local152;
								local152 = null;
							} else if (local173 != null && local87 != 0) {
								local78 = local152.aBoolean16;
							}
						}
						@Pc(250) int local250;
						@Pc(322) int local322;
						@Pc(372) int local372;
						@Pc(382) int local382;
						if ((local87 == 0 || local87 == 12) && local27 > 0 && local47 > 0 && local27 < this.anInt3002 && this.anInt2997 > local47) {
							local250 = local109 == local20[local27 - 1][local47 - 1] ? 1 : -1;
							@Pc(271) int local271 = local109 == local20[local45][local47 - 1] ? 1 : -1;
							@Pc(288) int local288 = local20[local45][local61] == local109 ? 1 : -1;
							if (local109 == local20[local27][local47 - 1]) {
								local250++;
								local271++;
							} else {
								local271--;
								local250--;
							}
							local322 = local109 == local20[local27 - 1][local61] ? 1 : -1;
							if (local20[local45][local47] == local109) {
								local271++;
								local288++;
							} else {
								local288--;
								local271--;
							}
							if (local20[local27][local61] == local109) {
								local288++;
								local322++;
							} else {
								local322--;
								local288--;
							}
							if (local20[local27 - 1][local47] == local109) {
								local250++;
								local322++;
							} else {
								local322--;
								local250--;
							}
							local372 = local250 - local288;
							if (local372 < 0) {
								local372 = -local372;
							}
							local382 = local271 - local322;
							if (local382 < 0) {
								local382 = -local382;
							}
							if (local372 == local382) {
								local372 = arg4.method3060(local27, local47) - arg4.method3060(local45, local61);
								if (local372 < 0) {
									local372 = -local372;
								}
								local382 = arg4.method3060(local45, local47) - arg4.method3060(local27, local61);
								if (local382 < 0) {
									local382 = -local382;
								}
							}
							local93 = local372 < local382 ? 1 : 0;
						}
						for (local250 = 0; local250 < 13; local250++) {
							Static216.anIntArray459[local250] = -1;
							Static343.anIntArray680[local250] = 1;
						}
						@Pc(469) boolean[] local469 = local152 != null && local152.aBoolean16 ? Static293.aBooleanArrayArray6[local87] : Static88.aBooleanArrayArray4[local87];
						this.method2459(local47, local81, local93, arg5, local87, local152, local15, this.anInt3002, local27, local25, local10, local173, this.anInt2997);
						@Pc(498) boolean local498 = local152 != null && local152.anInt202 != local152.anInt197;
						if (!local498) {
							for (local322 = 0; local322 < 8; local322++) {
								if (Static216.anIntArray459[local322] >= 0 && Static143.anIntArray323[local322] != Static192.anIntArray392[local322]) {
									local498 = true;
									break;
								}
							}
						}
						if (!local469[local93 + 1 & 0x3]) {
							local81[1] = Static86.method1291(local81[1], (Static343.anIntArray680[4] & Static343.anIntArray680[2]) == 0);
						}
						if (!local469[local93 + 3 & 0x3]) {
							local81[3] = Static86.method1291(local81[3], (Static343.anIntArray680[6] & Static343.anIntArray680[0]) == 0);
						}
						if (!local469[local93 & 0x3]) {
							local81[0] = Static86.method1291(local81[0], (Static343.anIntArray680[2] & Static343.anIntArray680[0]) == 0);
						}
						if (!local469[local93 + 2 & 0x3]) {
							local81[2] = Static86.method1291(local81[2], (Static343.anIntArray680[4] & Static343.anIntArray680[6]) == 0);
						}
						if (!local78 && (local87 == 0 || local87 == 12)) {
							if (local81[0] && !local81[1] && !local81[2] && local81[3]) {
								local87 = local87 == 0 ? 13 : 14;
								local81[0] = local81[3] = false;
								local93 = 0;
							} else if (local81[0] && local81[1] && !local81[2] && !local81[3]) {
								local93 = 3;
								local81[0] = local81[1] = false;
								local87 = local87 == 0 ? 13 : 14;
							} else if (!local81[0] && local81[1] && local81[2] && !local81[3]) {
								local81[1] = local81[2] = false;
								local87 = local87 == 0 ? 13 : 14;
								local93 = 2;
							} else if (!local81[0] && !local81[1] && local81[2] && local81[3]) {
								local87 = local87 == 0 ? 13 : 14;
								local81[2] = local81[3] = false;
								local93 = 1;
							}
						}
						@Pc(806) boolean local806 = !local78 && !local81[0] && !local81[2] && !local81[1] && !local81[3];
						@Pc(808) int[] local808 = null;
						@Pc(844) int[] local844;
						@Pc(816) int[] local816;
						@Pc(832) int[] local832;
						if (local806) {
							local382 = local152 == null ? 0 : Static102.anIntArray372[local87];
							local816 = Static163.anIntArrayArray33[local87];
							local832 = Static259.anIntArrayArray51[local87];
							local844 = Static354.anIntArrayArray60[local87];
							local372 = local173 == null ? 0 : Static173.anIntArray369[local87];
						} else if (local78) {
							local816 = Static51.anIntArrayArray16[local87];
							local372 = local173 == null ? 0 : Static220.anIntArray470[local87];
							local808 = Static234.anIntArrayArray49[local87];
							local832 = Static273.anIntArrayArray53[local87];
							local382 = local152 == null ? 0 : Static252.anIntArray536[local87];
							local844 = Static31.anIntArrayArray11[local87];
						} else {
							local816 = Static221.anIntArrayArray45[local87];
							local808 = Static195.anIntArrayArray63[local87];
							local382 = local152 == null ? 0 : Static43.anIntArray126[local87];
							local844 = Static69.anIntArrayArray21[local87];
							local832 = Static13.anIntArrayArray3[local87];
							local372 = local173 == null ? 0 : Static159.anIntArray343[local87];
						}
						@Pc(911) int local911 = local382 + local372;
						if (local911 <= 0) {
							Static59.method970(arg2, local27, local47);
						} else {
							if (local81[0]) {
								local911++;
							}
							if (local81[2]) {
								local911++;
							}
							if (local81[1]) {
								local911++;
							}
							if (local81[3]) {
								local911++;
							}
							@Pc(944) int local944 = 0;
							@Pc(946) int local946 = 0;
							@Pc(950) int local950 = local911 * 3;
							@Pc(957) int[] local957 = local498 ? new int[local950] : null;
							@Pc(960) int[] local960 = new int[local950];
							@Pc(963) int[] local963 = new int[local950];
							@Pc(966) int[] local966 = new int[local950];
							@Pc(969) int[] local969 = new int[local950];
							@Pc(972) int[] local972 = new int[local950];
							@Pc(979) int[] local979 = arg3 == null ? null : new int[local950];
							@Pc(988) int[] local988 = arg3 == null && arg0 == null ? null : new int[local950];
							@Pc(990) int local990 = -1;
							@Pc(992) int local992 = -1;
							@Pc(994) int local994 = 256;
							@Pc(1062) byte local1062;
							@Pc(1016) int local1016;
							@Pc(1018) int local1018;
							@Pc(1246) int local1246;
							@Pc(1252) int local1252;
							@Pc(1261) int local1261;
							@Pc(1265) int local1265;
							@Pc(1286) int local1286;
							@Pc(1269) int local1269;
							@Pc(1288) int local1288;
							@Pc(1339) int local1339;
							@Pc(1345) int local1345;
							if (local152 != null) {
								local990 = local152.anInt202;
								local992 = arg5.method5369() ? local152.anInt192 : local152.anInt191;
								local994 = local152.anInt190;
								local1016 = Static271.method4164(arg5, local152);
								for (local1018 = 0; local1018 < local382; local1018++) {
									if (local81[-local93 & 0x3] && local808[0] == local944) {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = 1;
										Static175.anIntArray374[2] = local832[local944];
										Static175.anIntArray374[3] = 1;
										Static175.anIntArray374[4] = local816[local944];
										local1062 = 6;
										Static175.anIntArray374[5] = local832[local944];
									} else if (local81[2 - local93 & 0x3] && local944 == local808[2]) {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = 5;
										Static175.anIntArray374[2] = local832[local944];
										Static175.anIntArray374[3] = 5;
										Static175.anIntArray374[4] = local816[local944];
										Static175.anIntArray374[5] = local832[local944];
										local1062 = 6;
									} else if (local81[1 - local93 & 0x3] && local944 == local808[1]) {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = 3;
										Static175.anIntArray374[2] = local832[local944];
										Static175.anIntArray374[3] = 3;
										Static175.anIntArray374[4] = local816[local944];
										local1062 = 6;
										Static175.anIntArray374[5] = local832[local944];
									} else if (local81[3 - local93 & 0x3] && local808[3] == local944) {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = 7;
										Static175.anIntArray374[2] = local832[local944];
										Static175.anIntArray374[3] = 7;
										Static175.anIntArray374[4] = local816[local944];
										Static175.anIntArray374[5] = local832[local944];
										local1062 = 6;
									} else {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = local816[local944];
										local1062 = 3;
										Static175.anIntArray374[2] = local832[local944];
									}
									local944++;
									for (local1246 = 0; local1246 < local1062; local1246++) {
										local1252 = Static175.anIntArray374[local1246];
										local1261 = local1252 - local93 * 2 & 0x7;
										local1265 = Static60.anIntArray152[local1252];
										local1269 = Static155.anIntArray337[local1252];
										if (local93 == 1) {
											local1288 = 128 - local1265;
											local1286 = local1269;
										} else if (local93 == 2) {
											local1288 = 128 - local1269;
											local1286 = 128 - local1265;
										} else if (local93 == 3) {
											local1288 = local1265;
											local1286 = 128 - local1269;
										} else {
											local1286 = local1265;
											local1288 = local1269;
										}
										local960[local946] = local1286;
										local963[local946] = local1288;
										if (local979 != null && Static81.aBooleanArrayArray3[local87][local1252]) {
											local1339 = (local27 << 7) + local1286;
											local1345 = local1288 + (local47 << 7);
											local979[local946] = arg3.method3043(local1339, local1345) - arg4.method3043(local1339, local1345);
										}
										if (local988 != null) {
											if (arg3 != null && !Static81.aBooleanArrayArray3[local87][local1252]) {
												local1339 = local1286 + (local27 << 7);
												local1345 = local1288 + (local47 << 7);
												local988[local946] = arg4.method3043(local1339, local1345) - arg3.method3043(local1339, local1345);
											} else if (arg0 != null && !Static296.aBooleanArrayArray7[local87][local1252]) {
												local1339 = (local27 << 7) + local1286;
												local1345 = (local47 << 7) + local1288;
												local988[local946] = arg0.method3043(local1339, local1345) - arg4.method3043(local1339, local1345);
											}
										}
										if (local1252 < 8 && local152.anInt193 < Static216.anIntArray459[local1261]) {
											if (local957 != null) {
												local957[local946] = Static192.anIntArray392[local1261];
											}
											local972[local946] = Static236.anIntArray500[local1261];
											local969[local946] = Static255.anIntArray541[local1261];
											local966[local946] = Static143.anIntArray323[local1261];
										} else {
											if (local957 != null) {
												local957[local946] = local1016;
											}
											local969[local946] = arg5.method5369() ? local152.anInt192 : local152.anInt191;
											local972[local946] = local152.anInt190;
											local966[local946] = local990;
										}
										local946++;
									}
								}
								if (!this.aBoolean255 && arg2 == 0) {
									Static8.method80(local27, local47, local152.anInt199, local152.anInt196 * 8, local152.anInt203);
								}
								if (local87 != 12 && local152.anInt202 != -1 && local152.aBoolean15) {
									local76 = true;
								}
							} else if (local806) {
								local944 = Static102.anIntArray372[local87];
							} else if (local78) {
								local944 = Static252.anIntArray536[local87];
							} else {
								local944 = Static43.anIntArray126[local87];
							}
							if (local173 != null) {
								if (local133 == 0) {
									local133 = local109;
								}
								if (local117 == 0) {
									local117 = local109;
								}
								if (local125 == 0) {
									local125 = local109;
								}
								@Pc(1591) Class251 local1591 = this.aClass214_17.method4732(local109 - 1);
								@Pc(1599) Class251 local1599 = this.aClass214_17.method4732(local117 - 1);
								@Pc(1607) Class251 local1607 = this.aClass214_17.method4732(local125 - 1);
								@Pc(1615) Class251 local1615 = this.aClass214_17.method4732(local133 - 1);
								for (local1261 = 0; local1261 < local372; local1261++) {
									if (local81[-local93 & 0x3] && local808[0] == local944) {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = 1;
										Static175.anIntArray374[2] = local832[local944];
										Static175.anIntArray374[3] = 1;
										Static175.anIntArray374[4] = local816[local944];
										Static175.anIntArray374[5] = local832[local944];
										local1062 = 6;
									} else if (local81[2 - local93 & 0x3] && local808[2] == local944) {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = 5;
										Static175.anIntArray374[2] = local832[local944];
										Static175.anIntArray374[3] = 5;
										Static175.anIntArray374[4] = local816[local944];
										local1062 = 6;
										Static175.anIntArray374[5] = local832[local944];
									} else if (local81[1 - local93 & 0x3] && local808[1] == local944) {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = 3;
										Static175.anIntArray374[2] = local832[local944];
										Static175.anIntArray374[3] = 3;
										Static175.anIntArray374[4] = local816[local944];
										local1062 = 6;
										Static175.anIntArray374[5] = local832[local944];
									} else if (local81[3 - local93 & 0x3] && local944 == local808[3]) {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = 7;
										Static175.anIntArray374[2] = local832[local944];
										Static175.anIntArray374[3] = 7;
										Static175.anIntArray374[4] = local816[local944];
										local1062 = 6;
										Static175.anIntArray374[5] = local832[local944];
									} else {
										Static175.anIntArray374[0] = local844[local944];
										Static175.anIntArray374[1] = local816[local944];
										local1062 = 3;
										Static175.anIntArray374[2] = local832[local944];
									}
									for (local1265 = 0; local1265 < local1062; local1265++) {
										local1286 = Static175.anIntArray374[local1265];
										local1269 = local1286 - local93 * 2 & 0x7;
										local1288 = Static60.anIntArray152[local1286];
										local1345 = Static155.anIntArray337[local1286];
										@Pc(1882) int local1882;
										if (local93 == 1) {
											local1339 = local1345;
											local1882 = 128 - local1288;
										} else if (local93 == 2) {
											local1339 = 128 - local1288;
											local1882 = 128 - local1345;
										} else if (local93 == 3) {
											local1882 = local1288;
											local1339 = 128 - local1345;
										} else {
											local1882 = local1345;
											local1339 = local1288;
										}
										local960[local946] = local1339;
										local963[local946] = local1882;
										@Pc(1941) int local1941;
										@Pc(1947) int local1947;
										if (local979 != null && Static81.aBooleanArrayArray3[local87][local1286]) {
											local1941 = (local27 << 7) + local1339;
											local1947 = local1882 + (local47 << 7);
											local979[local946] = arg3.method3043(local1941, local1947) - arg4.method3043(local1941, local1947);
										}
										if (local988 != null) {
											if (arg3 != null && !Static81.aBooleanArrayArray3[local87][local1286]) {
												local1941 = (local27 << 7) + local1339;
												local1947 = (local47 << 7) + local1882;
												local988[local946] = arg4.method3043(local1941, local1947) - arg3.method3043(local1941, local1947);
											} else if (arg0 != null && !Static296.aBooleanArrayArray7[local87][local1286]) {
												local1941 = (local27 << 7) + local1339;
												local1947 = local1882 + (local47 << 7);
												local988[local946] = arg0.method3043(local1941, local1947) - arg4.method3043(local1941, local1947);
											}
										}
										if (local1286 < 8 && Static216.anIntArray459[local1269] >= 0) {
											if (local957 != null) {
												local957[local946] = Static192.anIntArray392[local1269];
											}
											local972[local946] = Static236.anIntArray500[local1269];
											local969[local946] = Static255.anIntArray541[local1269];
											local966[local946] = Static143.anIntArray323[local1269];
										} else {
											if (local78 && Static81.aBooleanArrayArray3[local87][local1286]) {
												local969[local946] = local992;
												local972[local946] = local994;
												local966[local946] = local990;
											} else if (local1339 == 0 && local1882 == 0) {
												local966[local946] = arg1[local27][local47];
												local969[local946] = local1591.anInt6397;
												local972[local946] = local1591.anInt6396;
											} else if (local1339 == 0 && local1882 == 128) {
												local966[local946] = arg1[local27][local61];
												local969[local946] = local1599.anInt6397;
												local972[local946] = local1599.anInt6396;
											} else if (local1339 == 128 && local1882 == 128) {
												local966[local946] = arg1[local45][local61];
												local969[local946] = local1607.anInt6397;
												local972[local946] = local1607.anInt6396;
											} else if (local1339 == 128 && local1882 == 0) {
												local966[local946] = arg1[local45][local47];
												local969[local946] = local1615.anInt6397;
												local972[local946] = local1615.anInt6396;
											} else {
												if (local1339 < 64) {
													if (local1882 >= 64) {
														local969[local946] = local1599.anInt6397;
														local972[local946] = local1599.anInt6396;
													} else {
														local969[local946] = local1591.anInt6397;
														local972[local946] = local1591.anInt6396;
													}
												} else if (local1882 < 64) {
													local969[local946] = local1615.anInt6397;
													local972[local946] = local1615.anInt6396;
												} else {
													local969[local946] = local1607.anInt6397;
													local972[local946] = local1607.anInt6396;
												}
												local1941 = Static234.method3218(arg1[local27][local47], arg1[local45][local47], local1339 << 7 >> 7);
												local1947 = Static234.method3218(arg1[local27][local61], arg1[local45][local61], local1339 << 7 >> 7);
												local966[local946] = Static234.method3218(local1941, local1947, local1882 << 7 >> 7);
											}
											if (local957 != null) {
												local957[local946] = local966[local946];
											}
										}
										local946++;
									}
									local944++;
								}
								if (local87 != 0 && local173.aBoolean592) {
									local76 = true;
								}
							}
							local1016 = arg4.method3060(local27, local47);
							local1018 = arg4.method3060(local45, local47);
							local1246 = arg4.method3060(local45, local61);
							local1252 = arg4.method3060(local27, local61);
							if (arg2 > 0) {
								@Pc(2360) boolean local2360 = true;
								if (local109 == 0 && local87 != 0) {
									local2360 = false;
								}
								if (local101 > 0 && local175 != null && !local175.aBoolean14) {
									local2360 = false;
								}
								if (local2360 && local1018 == local1016 && local1246 == local1016 && local1252 == local1016) {
									this.aByteArrayArrayArray14[arg2][local27][local47] = (byte) (this.aByteArrayArrayArray14[arg2][local27][local47] | 0x4);
								}
							}
							local1261 = 0;
							local1265 = 0;
							local1286 = 0;
							if (this.aBoolean255) {
								local1261 = Static270.method4146(local27, local47);
								local1265 = Static284.method4330(local27, local47);
								local1286 = Static297.method4473(local27, local47);
							}
							arg4.method3058(local27, local47, local960, local979, local963, local988, local966, local957, local969, local972, local1261, local1265, local1286, local76);
							Static59.method970(arg2, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIIII)V")
	public final void method2455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13;
		for (@Pc(9) int local9 = arg2; local9 < arg3 + arg2; local9++) {
			for (local13 = arg0; local13 < arg0 + arg4; local13++) {
				if (local13 >= 0 && this.anInt3002 > local13 && local9 >= 0 && local9 < this.anInt2997) {
					this.anIntArrayArrayArray2[arg1][local13][local9] = arg1 > 0 ? this.anIntArrayArrayArray2[arg1 - 1][local13][local9] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && this.anInt3002 > arg0) {
			for (local13 = arg2 + 1; local13 < arg2 + arg3; local13++) {
				if (local13 >= 0 && this.anInt2997 > local13) {
					this.anIntArrayArrayArray2[arg1][arg0][local13] = this.anIntArrayArrayArray2[arg1][arg0 - 1][local13];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt2997) {
			for (local13 = arg0 + 1; local13 < arg0 + arg4; local13++) {
				if (local13 >= 0 && this.anInt3002 > local13) {
					this.anIntArrayArrayArray2[arg1][local13][arg2] = this.anIntArrayArrayArray2[arg1][local13][arg2 - 1];
				}
			}
		}
		if (arg0 < 0 || arg2 < 0 || this.anInt3002 <= arg0 || this.anInt2997 <= arg2) {
			return;
		}
		if (arg1 != 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2] != this.anIntArrayArrayArray2[arg1 - 1][arg0 - 1][arg2]) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1] != this.anIntArrayArrayArray2[arg1 - 1][arg0][arg2 - 1]) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1];
				return;
			}
			if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray2[arg1 - 1][arg0 - 1][arg2 - 1] != this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1]) {
				this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2] != 0) {
			this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1] != 0) {
			this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0][arg2 - 1];
			return;
		}
		if (arg0 > 0 && arg2 > 0 && this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray2[arg1][arg0][arg2] = this.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!tq;[Lclient!tf;[[[I)V")
	public final void method2456(@OriginalArg(1) Class164 arg0, @OriginalArg(2) Class222[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		if (!this.aBoolean255) {
			for (local6 = 0; local6 < 4; local6++) {
				for (@Pc(10) int local10 = 0; local10 < this.anInt3002; local10++) {
					for (local14 = 0; local14 < this.anInt2997; local14++) {
						if ((Static373.aByteArrayArrayArray16[local6][local10][local14] & 0x1) != 0) {
							local31 = local6;
							if ((Static373.aByteArrayArrayArray16[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method4830(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt2995; local6++) {
			local14 = 0;
			local31 = 0;
			if (!this.aBoolean255) {
				if (Static54.aBoolean103) {
					local31 = 8;
				}
				if (Static155.aBoolean244) {
					local14 = 2;
				}
				if (Static393.anInt6410 != 0) {
					if (local6 == 0 | Static309.aBoolean495) {
						local31 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static155.aBoolean244) {
				local31 |= 0x7;
			}
			@Pc(153) int[][] local153 = arg2 == null || local6 >= arg2.length ? this.anIntArrayArrayArray2[local6] : arg2[local6];
			Static82.method1215(local6, arg0.method5403(this.anInt3002, this.anInt2997, this.anIntArrayArrayArray2[local6], local153, local14, local31));
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[[II)V")
	public final void method2457(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray2[0];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3002 + 1; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2997 + 1; local24++) {
				local10[local20][local24] += arg0[local20][local24];
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!cl;Lclient!cl;[[ILclient!tq;IILclient!cl;)V")
	private void method2458(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class164 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class42 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3002; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2997; local7++) {
				if (Static105.anInt1862 == -1 || Static96.method1396(Static105.anInt1862, local3, local7, arg4)) {
					@Pc(33) byte local33 = this.aByteArrayArrayArray9[arg4][local3][local7];
					@Pc(42) byte local42 = this.aByteArrayArrayArray10[arg4][local3][local7];
					@Pc(53) int local53 = this.aByteArrayArrayArray12[arg4][local3][local7] & 0xFF;
					@Pc(64) int local64 = this.aByteArrayArrayArray11[arg4][local3][local7] & 0xFF;
					@Pc(76) Class13 local76 = local53 == 0 ? null : this.aClass158_5.method3161(local53 - 1);
					@Pc(91) Class251 local91 = local64 == 0 ? null : this.aClass214_17.method4732(local64 - 1);
					@Pc(93) int local93 = 0;
					@Pc(95) int local95 = 0;
					if (local33 != 0) {
						local93 = local91 == null ? 0 : Static173.anIntArray369[local33];
						local95 = local76 == null ? 0 : Static102.anIntArray372[local33];
					} else if (local76 != null) {
						local95 = Static102.anIntArray372[local33];
					} else if (local91 != null) {
						local93 = Static102.anIntArray372[local33];
					}
					@Pc(137) int local137 = local95 + local93;
					@Pc(139) int local139 = 0;
					if (local137 != 0) {
						@Pc(144) int[] local144 = new int[local137];
						@Pc(147) int[] local147 = new int[local137];
						@Pc(150) int[] local150 = new int[local137];
						@Pc(153) int[] local153 = new int[local137];
						@Pc(155) boolean local155 = false;
						@Pc(171) int local171;
						@Pc(199) int local199;
						if (local76 == null || local76.anInt202 == -1 && local76.anInt197 == -1 && local76.anInt192 == -1) {
							for (local171 = 0; local171 < local95; local171++) {
								local144[local139] = -1;
								local139++;
							}
						} else {
							local171 = arg3.method5369() ? local76.anInt192 : local76.anInt191;
							if (Static380.aBoolean566) {
								local171 = -1;
							}
							for (local199 = 0; local199 < local95; local199++) {
								local150[local139] = local171;
								local153[local139] = local76.anInt190;
								if (local76.anInt202 == -1) {
									local144[local139] = -1;
								} else {
									local144[local139] = local76.anInt202;
								}
								if (local76.anInt197 == -1) {
									local147[local139] = -1;
								} else {
									local147[local139] = local76.anInt197;
									local155 = true;
								}
								local139++;
							}
							if (!this.aBoolean255 && arg4 == 0) {
								Static8.method80(local3, local7, local76.anInt199, local76.anInt196 * 8, local76.anInt203);
							}
						}
						if (!local155) {
							local147 = null;
						}
						if (local91 == null) {
							for (local171 = 0; local171 < local93; local171++) {
								local144[local139] = -1;
								local139++;
							}
						} else {
							local171 = local91.anInt6397;
							if (Static380.aBoolean566) {
								local171 = -1;
							}
							for (local199 = 0; local199 < local93; local199++) {
								local150[local139] = local171;
								local153[local139] = local91.anInt6396;
								local144[local139] = arg2[local3][local7];
								if (local147 != null) {
									local147[local139] = -1;
								}
								local139++;
							}
						}
						local171 = Static60.anIntArray152.length;
						@Pc(333) int[] local333 = new int[local171];
						@Pc(336) int[] local336 = new int[local171];
						@Pc(343) int[] local343 = arg1 == null ? null : new int[local171];
						@Pc(352) int[] local352 = arg1 == null && arg0 == null ? null : new int[local171];
						@Pc(360) int local360;
						@Pc(364) int local364;
						@Pc(445) int local445;
						@Pc(451) int local451;
						for (@Pc(354) int local354 = 0; local354 < local171; local354++) {
							local360 = Static60.anIntArray152[local354];
							local364 = Static155.anIntArray337[local354];
							if (local42 == 0) {
								local333[local354] = local360;
								local336[local354] = local364;
							} else if (local42 == 1) {
								local333[local354] = local364;
								local336[local354] = 128 - local360;
							} else if (local42 == 2) {
								local333[local354] = 128 - local360;
								local336[local354] = 128 - local364;
							} else if (local42 == 3) {
								local333[local354] = 128 - local364;
								local336[local354] = local360;
							}
							if (local343 != null && Static81.aBooleanArrayArray3[local33][local354]) {
								local445 = local360 + (local3 << 7);
								local451 = local360 + (local7 << 7);
								local343[local354] = arg1.method3043(local445, local451) - arg5.method3043(local445, local451);
							}
							if (local352 != null) {
								if (arg1 != null && !Static81.aBooleanArrayArray3[local33][local354]) {
									local445 = local360 + (local3 << 7);
									local451 = local360 + (local7 << 7);
									local352[local354] = arg5.method3043(local445, local451) - arg1.method3043(local445, local451);
								} else if (arg0 != null && !Static296.aBooleanArrayArray7[local33][local354]) {
									local445 = (local3 << 7) + local360;
									local451 = (local7 << 7) + local360;
									local352[local354] = arg0.method3043(local445, local451) - arg5.method3043(local445, local451);
								}
							}
						}
						local360 = arg5.method3060(local3, local7);
						local364 = arg5.method3060(local3 + 1, local7);
						local445 = arg5.method3060(local3 + 1, local7 + 1);
						local451 = arg5.method3060(local3, local7 + 1);
						if (arg4 > 0) {
							@Pc(571) boolean local571 = true;
							if (local64 == 0 && local33 != 0) {
								local571 = false;
							}
							if (local53 > 0 && local76 != null && !local76.aBoolean14) {
								local571 = false;
							}
							if (local571 && local364 == local360 && local445 == local360 && local451 == local360) {
								this.aByteArrayArrayArray14[arg4][local3][local7] = (byte) (this.aByteArrayArrayArray14[arg4][local3][local7] | 0x4);
							}
						}
						@Pc(633) int local633 = 0;
						@Pc(635) int local635 = 0;
						@Pc(637) int local637 = 0;
						if (this.aBoolean255) {
							local633 = Static270.method4146(local3, local7);
							local635 = Static284.method4330(local3, local7);
							local637 = Static297.method4473(local3, local7);
						}
						arg5.method3059(local3, local7, local333, local343, local336, local352, Static354.anIntArrayArray60[local33], Static163.anIntArrayArray33[local33], Static259.anIntArrayArray51[local33], local144, local147, local150, local153, local633, local635, local637);
						Static59.method970(arg4, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[ZIBLclient!tq;ILclient!an;[[BII[[B[[BLclient!wr;I)V")
	private void method2459(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class164 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13 arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class251 arg11, @OriginalArg(13) int arg12) {
		@Pc(50) int local50;
		if (arg5 != null && arg11 != null || arg11 != null && arg4 == 12 || arg5 != null && arg4 == 0) {
			@Pc(31) boolean[] local31 = arg5 != null && arg5.aBoolean16 ? Static293.aBooleanArrayArray6[arg4] : Static88.aBooleanArrayArray4[arg4];
			@Pc(60) Class13 local60;
			@Pc(78) byte local78;
			@Pc(94) int local94;
			@Pc(101) int local101;
			if (arg0 > 0) {
				if (arg8 > 0) {
					local50 = arg9[arg8 - 1][arg0 - 1] & 0xFF;
					if (local50 > 0) {
						local60 = this.aClass158_5.method3161(local50 - 1);
						if (local60.anInt202 != -1 && local60.aBoolean16) {
							local78 = arg10[arg8 - 1][arg0 - 1];
							local94 = arg6[arg8 - 1][arg0 - 1] * 2 + 4 & 0x7;
							local101 = Static271.method4164(arg3, local60);
							if (Static81.aBooleanArrayArray3[local78][local94]) {
								Static143.anIntArray323[0] = local60.anInt202;
								Static192.anIntArray392[0] = local101;
								Static255.anIntArray541[0] = arg3.method5369() ? local60.anInt192 : local60.anInt191;
								Static236.anIntArray500[0] = local60.anInt190;
								Static216.anIntArray459[0] = local60.anInt193;
								Static343.anIntArray680[0] = 256;
							}
						}
					}
				}
				if (arg8 < arg7 - 1) {
					local50 = arg9[arg8 + 1][arg0 - 1] & 0xFF;
					if (local50 > 0) {
						local60 = this.aClass158_5.method3161(local50 - 1);
						if (local60.anInt202 != -1 && local60.aBoolean16) {
							local78 = arg10[arg8 + 1][arg0 - 1];
							local94 = arg6[arg8 + 1][arg0 - 1] * 2 + 6 & 0x7;
							local101 = Static271.method4164(arg3, local60);
							if (Static81.aBooleanArrayArray3[local78][local94]) {
								Static143.anIntArray323[2] = local60.anInt202;
								Static192.anIntArray392[2] = local101;
								Static255.anIntArray541[2] = arg3.method5369() ? local60.anInt192 : local60.anInt191;
								Static236.anIntArray500[2] = local60.anInt190;
								Static216.anIntArray459[2] = local60.anInt193;
								Static343.anIntArray680[2] = 512;
							}
						}
					}
				}
			}
			if (arg0 < arg12 - 1) {
				if (arg8 > 0) {
					local50 = arg9[arg8 - 1][arg0 + 1] & 0xFF;
					if (local50 > 0) {
						local60 = this.aClass158_5.method3161(local50 - 1);
						if (local60.anInt202 != -1 && local60.aBoolean16) {
							local78 = arg10[arg8 - 1][arg0 + 1];
							local94 = arg6[arg8 - 1][arg0 + 1] * 2 + 2 & 0x7;
							local101 = Static271.method4164(arg3, local60);
							if (Static81.aBooleanArrayArray3[local78][local94]) {
								Static143.anIntArray323[6] = local60.anInt202;
								Static192.anIntArray392[6] = local101;
								Static255.anIntArray541[6] = arg3.method5369() ? local60.anInt192 : local60.anInt191;
								Static236.anIntArray500[6] = local60.anInt190;
								Static216.anIntArray459[6] = local60.anInt193;
								Static343.anIntArray680[6] = 64;
							}
						}
					}
				}
				if (arg8 < arg7 - 1) {
					local50 = arg9[arg8 + 1][arg0 + 1] & 0xFF;
					if (local50 > 0) {
						local60 = this.aClass158_5.method3161(local50 - 1);
						if (local60.anInt202 != -1 && local60.aBoolean16) {
							local78 = arg10[arg8 + 1][arg0 + 1];
							local94 = arg6[arg8 + 1][arg0 + 1] * 2 & 0x7;
							local101 = Static271.method4164(arg3, local60);
							if (Static81.aBooleanArrayArray3[local78][local94]) {
								Static143.anIntArray323[4] = local60.anInt202;
								Static192.anIntArray392[4] = local101;
								Static255.anIntArray541[4] = arg3.method5369() ? local60.anInt192 : local60.anInt191;
								Static236.anIntArray500[4] = local60.anInt190;
								Static216.anIntArray459[4] = local60.anInt193;
								Static343.anIntArray680[4] = 128;
							}
						}
					}
				}
			}
			@Pc(555) int local555;
			@Pc(562) int local562;
			@Pc(564) int local564;
			@Pc(524) byte local524;
			if (arg0 > 0) {
				local50 = arg9[arg8][arg0 - 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass158_5.method3161(local50 - 1);
					if (local60.anInt202 != -1) {
						local78 = arg10[arg8][arg0 - 1];
						local524 = arg6[arg8][arg0 - 1];
						if (local60.aBoolean16) {
							local101 = 2;
							local555 = local524 * 2 + 4;
							local562 = Static271.method4164(arg3, local60);
							for (local564 = 0; local564 < 3; local564++) {
								local101 &= 0x7;
								local555 &= 0x7;
								if (Static81.aBooleanArrayArray3[local78][local555] && Static216.anIntArray459[local101] <= local60.anInt193) {
									Static143.anIntArray323[local101] = local60.anInt202;
									Static192.anIntArray392[local101] = local562;
									Static255.anIntArray541[local101] = arg3.method5369() ? local60.anInt192 : local60.anInt191;
									Static236.anIntArray500[local101] = local60.anInt190;
									if (Static216.anIntArray459[local101] == local60.anInt193) {
										Static343.anIntArray680[local101] |= 0x20;
									} else {
										Static343.anIntArray680[local101] = 32;
									}
									Static216.anIntArray459[local101] = local60.anInt193;
								}
								local101--;
								local555++;
							}
							if (!local31[arg2 & 0x3]) {
								arg1[0] = Static293.aBooleanArrayArray6[local78][local524 + 2 & 0x3];
							}
						} else if (!local31[arg2 & 0x3]) {
							arg1[0] = Static88.aBooleanArrayArray4[local78][local524 + 2 & 0x3];
						}
					}
				}
			}
			if (arg12 - 1 > arg0) {
				local50 = arg9[arg8][arg0 + 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass158_5.method3161(local50 - 1);
					if (local60.anInt202 != -1) {
						local78 = arg10[arg8][arg0 + 1];
						local524 = arg6[arg8][arg0 + 1];
						if (local60.aBoolean16) {
							local101 = 4;
							local555 = local524 * 2 + 2;
							local562 = Static271.method4164(arg3, local60);
							for (local564 = 0; local564 < 3; local564++) {
								local101 &= 0x7;
								local555 &= 0x7;
								if (Static81.aBooleanArrayArray3[local78][local555] && local60.anInt193 >= Static216.anIntArray459[local101]) {
									Static143.anIntArray323[local101] = local60.anInt202;
									Static192.anIntArray392[local101] = local562;
									Static255.anIntArray541[local101] = arg3.method5369() ? local60.anInt192 : local60.anInt191;
									Static236.anIntArray500[local101] = local60.anInt190;
									if (Static216.anIntArray459[local101] == local60.anInt193) {
										Static343.anIntArray680[local101] |= 0x10;
									} else {
										Static343.anIntArray680[local101] = 16;
									}
									Static216.anIntArray459[local101] = local60.anInt193;
								}
								local101++;
								local555--;
							}
							if (!local31[arg2 + 2 & 0x3]) {
								arg1[2] = Static293.aBooleanArrayArray6[local78][local524 & 0x3];
							}
						} else if (!local31[arg2 + 2 & 0x3]) {
							arg1[2] = Static88.aBooleanArrayArray4[local78][local524 & 0x3];
						}
					}
				}
			}
			if (arg8 > 0) {
				local50 = arg9[arg8 - 1][arg0] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass158_5.method3161(local50 - 1);
					if (local60.anInt202 != -1) {
						local78 = arg10[arg8 - 1][arg0];
						local524 = arg6[arg8 - 1][arg0];
						if (local60.aBoolean16) {
							local101 = 6;
							local555 = local524 * 2 + 4;
							local562 = Static271.method4164(arg3, local60);
							for (local564 = 0; local564 < 3; local564++) {
								local555 &= 0x7;
								local101 &= 0x7;
								if (Static81.aBooleanArrayArray3[local78][local555] && local60.anInt193 >= Static216.anIntArray459[local101]) {
									Static143.anIntArray323[local101] = local60.anInt202;
									Static192.anIntArray392[local101] = local562;
									Static255.anIntArray541[local101] = arg3.method5369() ? local60.anInt192 : local60.anInt191;
									Static236.anIntArray500[local101] = local60.anInt190;
									if (Static216.anIntArray459[local101] == local60.anInt193) {
										Static343.anIntArray680[local101] |= 0x8;
									} else {
										Static343.anIntArray680[local101] = 8;
									}
									Static216.anIntArray459[local101] = local60.anInt193;
								}
								local555--;
								local101++;
							}
							if (!local31[arg2 + 3 & 0x3]) {
								arg1[3] = Static293.aBooleanArrayArray6[local78][local524 + 1 & 0x3];
							}
						} else if (!local31[arg2 + 3 & 0x3]) {
							arg1[3] = Static88.aBooleanArrayArray4[local78][local524 + 1 & 0x3];
						}
					}
				}
			}
			if (arg7 - 1 > arg8) {
				local50 = arg9[arg8 + 1][arg0] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass158_5.method3161(local50 - 1);
					if (local60.anInt202 != -1) {
						local78 = arg10[arg8 + 1][arg0];
						local524 = arg6[arg8 + 1][arg0];
						if (local60.aBoolean16) {
							local101 = 4;
							local555 = local524 * 2 + 6;
							local562 = Static271.method4164(arg3, local60);
							for (local564 = 0; local564 < 3; local564++) {
								local101 &= 0x7;
								local555 &= 0x7;
								if (Static81.aBooleanArrayArray3[local78][local555] && Static216.anIntArray459[local101] <= local60.anInt193) {
									Static143.anIntArray323[local101] = local60.anInt202;
									Static192.anIntArray392[local101] = local562;
									Static255.anIntArray541[local101] = arg3.method5369() ? local60.anInt192 : local60.anInt191;
									Static236.anIntArray500[local101] = local60.anInt190;
									if (Static216.anIntArray459[local101] == local60.anInt193) {
										Static343.anIntArray680[local101] |= 0x4;
									} else {
										Static343.anIntArray680[local101] = 4;
									}
									Static216.anIntArray459[local101] = local60.anInt193;
								}
								local555++;
								local101--;
							}
							if (!local31[arg2 + 1 & 0x3]) {
								arg1[1] = Static293.aBooleanArrayArray6[local78][local524 + 3 & 0x3];
							}
						} else if (!local31[arg2 + 1 & 0x3]) {
							arg1[1] = Static88.aBooleanArrayArray4[local78][local524 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		@Pc(1244) int local1244 = Static271.method4164(arg3, arg5);
		if (!arg5.aBoolean16) {
			return;
		}
		for (local50 = 0; local50 < 8; local50++) {
			@Pc(1259) int local1259 = local50 - arg2 * 2 & 0x7;
			if (Static81.aBooleanArrayArray3[arg4][local50] && arg5.anInt193 >= Static216.anIntArray459[local1259]) {
				Static143.anIntArray323[local1259] = arg5.anInt202;
				Static192.anIntArray392[local1259] = local1244;
				Static255.anIntArray541[local1259] = arg3.method5369() ? arg5.anInt192 : arg5.anInt191;
				Static236.anIntArray500[local1259] = arg5.anInt190;
				if (arg5.anInt193 == Static216.anIntArray459[local1259]) {
					Static343.anIntArray680[local1259] |= 0x2;
				} else {
					Static343.anIntArray680[local1259] = 2;
				}
				Static216.anIntArray459[local1259] = arg5.anInt193;
			}
		}
		return;
	}
}
