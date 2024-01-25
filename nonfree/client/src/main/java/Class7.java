import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public abstract class Class7 {

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	protected Class7() {
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "()[Lclient!dj;")
	public abstract Class44[] method1399();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZIILclient!ac;II[IZ[ZLclient!ac;Lclient!mk;)V")
	private void method1400(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) Class3 arg9, @OriginalArg(11) Class2_Sub29 arg10) {
		@Pc(14) int local14;
		if (arg3 == null || arg0 == 0) {
			for (local14 = 0; local14 < arg9.anInt82; local14++) {
				@Pc(21) short local21 = arg9.aShortArray7[local14];
				if (arg8 == null || arg7 == arg8[local21] || arg10.anIntArray312[local21] == 0) {
					@Pc(42) short local42 = arg9.aShortArray8[local14];
					if (local42 != -1) {
						this.method1408(arg10.anIntArray311[local42] & arg4, 0, arg6, arg2, arg10.anIntArrayArray114[local42], 0, arg1, 0, 0);
					}
					this.method1408(arg10.anIntArray311[local21] & arg4, arg9.aShortArray1[local14], arg6, arg2, arg10.anIntArrayArray114[local21], arg9.aShortArray6[local14], arg1, arg9.aShortArray3[local14], arg10.anIntArray312[local21]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(107) int local107 = 0;
		for (@Pc(109) int local109 = 0; local109 < arg10.anInt3905; local109++) {
			@Pc(113) boolean local113 = false;
			if (arg9.anInt82 > local14 && arg9.aShortArray7[local14] == local109) {
				local113 = true;
			}
			@Pc(131) boolean local131 = false;
			if (local107 < arg3.anInt82 && local109 == arg3.aShortArray7[local107]) {
				local131 = true;
			}
			if (local113 || local131) {
				if (arg8 == null || arg7 == arg8[local109] || arg10.anIntArray312[local109] == 0) {
					@Pc(180) short local180 = 0;
					@Pc(185) int local185 = arg10.anIntArray312[local109];
					if (local185 == 3) {
						local180 = 128;
					}
					@Pc(202) short local202;
					@Pc(198) short local198;
					@Pc(200) short local200;
					@Pc(196) short local196;
					@Pc(194) byte local194;
					if (local113) {
						local202 = arg9.aShortArray6[local14];
						local194 = arg9.aByteArray1[local14];
						local198 = arg9.aShortArray3[local14];
						local196 = arg9.aShortArray8[local14];
						local200 = arg9.aShortArray1[local14];
						local14++;
					} else {
						local194 = 0;
						local196 = -1;
						local198 = local180;
						local200 = local180;
						local202 = local180;
					}
					@Pc(252) short local252;
					@Pc(257) short local257;
					@Pc(237) short local237;
					@Pc(247) short local247;
					@Pc(242) byte local242;
					if (local131) {
						local237 = arg3.aShortArray1[local107];
						local242 = arg3.aByteArray1[local107];
						local247 = arg3.aShortArray8[local107];
						local252 = arg3.aShortArray6[local107];
						local257 = arg3.aShortArray3[local107];
						local107++;
					} else {
						local257 = local180;
						local242 = 0;
						local237 = local180;
						local247 = -1;
						local252 = local180;
					}
					if (local196 != -1) {
						this.method1408(arg4 & arg10.anIntArray311[local196], 0, arg6, arg2, arg10.anIntArrayArray114[local196], 0, arg1, 0, 0);
					} else if (local247 != -1) {
						this.method1408(arg10.anIntArray311[local247] & arg4, 0, arg6, arg2, arg10.anIntArrayArray114[local247], 0, arg1, 0, 0);
					}
					@Pc(375) int local375;
					@Pc(386) int local386;
					@Pc(396) int local396;
					if ((local194 & 0x2) == 0 && (local242 & 0x1) == 0) {
						@Pc(338) int local338;
						if (local185 == 2) {
							local338 = local252 - local202 & 0x3FFF;
							@Pc(344) int local344 = local257 - local198 & 0x3FFF;
							if (local338 >= 8192) {
								local338 -= 16384;
							}
							if (local344 >= 8192) {
								local344 -= 16384;
							}
							@Pc(359) int local359 = local237 - local200 & 0x3FFF;
							if (local359 >= 8192) {
								local359 -= 16384;
							}
							local375 = arg0 * local338 / arg5 + local202 & 0x3FFF;
							local386 = local198 + arg0 * local344 / arg5 & 0x3FFF;
							local396 = arg0 * local359 / arg5 + local200 & 0x3FFF;
						} else if (local185 == 7) {
							local338 = local252 - local202 & 0x3F;
							if (local338 >= 32) {
								local338 -= 64;
							}
							local396 = arg0 * (local237 - local200) / arg5 + local200;
							local386 = arg0 * (local257 - local198) / arg5 + local198;
							local375 = arg0 * local338 / arg5 + local202 & 0x3F;
						} else {
							local375 = local202 + arg0 * (local252 - local202) / arg5;
							local386 = local198 + (local257 - local198) * arg0 / arg5;
							local396 = local200 + arg0 * (local237 - local200) / arg5;
						}
					} else {
						local396 = local200;
						local375 = local202;
						local386 = local198;
					}
					this.method1408(arg4 & arg10.anIntArray311[local109], local396, arg6, arg2, arg10.anIntArrayArray114[local109], local375, arg1, local386, local185);
				} else {
					if (local113) {
						local14++;
					}
					if (local131) {
						local107++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(SS)V")
	public abstract void method1401(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "()I")
	public abstract int method1402();

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "()V")
	protected abstract void method1403();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!mm;)Lclient!mm;")
	public abstract Class2_Sub11_Sub10 method1404(@OriginalArg(0) Class2_Sub11_Sub10 arg0);

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "()I")
	public abstract int method1405();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIILclient!gh;II)V")
	protected final void method1406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class73 arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = -arg1 / 2;
		@Pc(24) int local24 = -arg0 / 2;
		@Pc(33) int local33 = arg4.method4932(local19 + arg3, local24 + arg5);
		@Pc(37) int local37 = arg1 / 2;
		@Pc(42) int local42 = -arg0 / 2;
		@Pc(51) int local51 = arg4.method4932(arg3 + local37, local42 + arg5);
		@Pc(56) int local56 = -arg1 / 2;
		@Pc(60) int local60 = arg0 / 2;
		@Pc(69) int local69 = arg4.method4932(arg3 + local56, local60 + arg5);
		@Pc(73) int local73 = arg1 / 2;
		@Pc(77) int local77 = arg0 / 2;
		@Pc(87) int local87 = arg4.method4932(arg3 + local73, arg5 - -local77);
		@Pc(98) int local98 = local33 < local51 ? local33 : local51;
		@Pc(109) int local109 = local69 >= local87 ? local87 : local69;
		@Pc(116) int local116 = local87 <= local51 ? local87 : local51;
		@Pc(127) int local127 = local69 > local33 ? local33 : local69;
		if (arg0 != 0) {
			@Pc(145) int local145 = (int) (Math.atan2((double) (local98 - local109), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local145 != 0) {
				this.method1428(local145);
			}
		}
		if (arg1 != 0) {
			@Pc(172) int local172 = (int) (Math.atan2((double) (local127 - local116), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local172 != 0) {
				this.method1432(local172);
			}
		}
		@Pc(181) int local181 = local87 + local33;
		if (local51 + local69 < local181) {
			local181 = local51 + local69;
		}
		local181 = (local181 >> 1) - arg2;
		if (local181 != 0) {
			this.method1413(0, local181, 0);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILclient!nc;Z)Z")
	public abstract boolean method1407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIB[II[IIZII)V")
	private void method1408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(42) int local42;
		if (arg3 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local42 = -arg5;
				arg5 = arg1;
				arg1 = local42;
			} else if (arg8 == 3) {
				local42 = arg5;
				arg5 = arg1;
				arg1 = local42;
			} else if (arg8 == 2) {
				local42 = arg5;
				arg5 = -arg1 & 0x3FFF;
				arg1 = local42 & 0x3FFF;
			}
		} else if (arg3 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg1 = -arg1;
				arg5 = -arg5;
			} else if (arg8 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg1 = -arg1 & 0x3FFF;
			}
		} else if (arg3 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local42 = arg5;
				arg5 = -arg1;
				arg1 = local42;
			} else if (arg8 == 3) {
				local42 = arg5;
				arg5 = arg1;
				arg1 = local42;
			} else if (arg8 == 2) {
				local42 = arg5;
				arg5 = arg1 & 0x3FFF;
				arg1 = -local42 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method1442(arg8, arg4, arg5, arg7, arg1, arg3, arg6);
		} else {
			this.method1414(arg8, arg4, arg5, arg7, arg1, arg6, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!di;ZLclient!di;IIIIII)V")
	public final void method1409(@OriginalArg(0) Class2_Sub11_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class2_Sub11_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 == -1 || !this.method1444()) {
			return;
		}
		@Pc(17) Class3 local17 = arg0.aClass3Array1[arg6];
		@Pc(20) Class2_Sub29 local20 = local17.aClass2_Sub29_1;
		@Pc(22) Class3 local22 = null;
		if (arg2 != null) {
			local22 = arg2.aClass3Array1[arg5];
			if (local20 != local22.aClass2_Sub29_1) {
				local22 = null;
			}
		}
		this.method1400(arg3, arg1, arg4, local22, 65535, arg7, null, false, null, local17, local20);
		this.method1403();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILclient!gh;Lclient!gh;III)V")
	public abstract void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) Class73 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public abstract void method1412(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)V")
	public abstract void method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method1414(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public abstract void method1415(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!di;IILclient!di;IIIZLclient!di;Z[ZILclient!di;II)V")
	public final void method1416(@OriginalArg(0) Class2_Sub11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub11_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub11_Sub1 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class2_Sub11_Sub1 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg9 == null || arg13 == -1) {
			this.method1409(arg0, arg7, arg8, arg1, 0, arg6, arg4, arg10);
		} else if (this.method1444()) {
			@Pc(35) Class3 local35 = arg0.aClass3Array1[arg4];
			@Pc(38) Class2_Sub29 local38 = local35.aClass2_Sub29_1;
			@Pc(40) Class3 local40 = null;
			if (arg8 != null) {
				local40 = arg8.aClass3Array1[arg6];
				if (local40.aClass2_Sub29_1 != local38) {
					local40 = null;
				}
			}
			@Pc(58) Class3 local58 = arg11.aClass3Array1[arg13];
			@Pc(60) Class3 local60 = null;
			if (arg3 != null) {
				local60 = arg3.aClass3Array1[arg5];
				if (local38 != local60.aClass2_Sub29_1) {
					local60 = null;
				}
			}
			this.method1400(arg1, arg7, 0, local40, 65535, arg10, null, false, arg9, local35, local38);
			this.method1442(0, new int[0], 0, 0, 0, 0, arg7);
			this.method1400(arg2, arg7, 0, local60, 65535, arg12, null, true, arg9, local58, local38);
			this.method1403();
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(SS)V")
	public abstract void method1417(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "()V")
	public abstract void method1419();

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "()I")
	public abstract int method1420();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!di;I)V")
	public final void method1421(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11_Sub1 arg1) {
		if (arg0 == -1 || !this.method1444()) {
			return;
		}
		@Pc(24) Class3 local24 = arg1.aClass3Array1[arg0];
		@Pc(27) Class2_Sub29 local27 = local24.aClass2_Sub29_1;
		for (@Pc(29) int local29 = 0; local29 < local24.anInt82; local29++) {
			@Pc(36) short local36 = local24.aShortArray7[local29];
			if (local27.aBooleanArray19[local36]) {
				if (local24.aShortArray8[local29] != -1) {
					this.method1423(0, 0, 0, 0);
				}
				this.method1423(local27.anIntArray312[local36], local24.aShortArray6[local29], local24.aShortArray3[local29], local24.aShortArray1[local29]);
			}
		}
		this.method1403();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIZI[IILclient!di;Lclient!di;II)V")
	public final void method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class2_Sub11_Sub1 arg5, @OriginalArg(8) Class2_Sub11_Sub1 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg4 == -1 || !this.method1444()) {
			return;
		}
		@Pc(16) Class3 local16 = arg5.aClass3Array1[arg4];
		@Pc(19) Class2_Sub29 local19 = local16.aClass2_Sub29_1;
		@Pc(25) Class3 local25 = null;
		if (arg6 != null) {
			local25 = arg6.aClass3Array1[arg7];
			if (local19 != local25.aClass2_Sub29_1) {
				local25 = null;
			}
		}
		this.method1400(arg0, arg2, 0, local25, arg1, arg8, arg3, false, null, local16, local19);
		this.method1403();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIII)V")
	protected abstract void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "()[Lclient!qh;")
	public abstract Class161[] method1424();

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "()I")
	public abstract int method1425();

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "()I")
	public abstract int method1426();

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "()Z")
	public abstract boolean method1427();

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	public abstract void method1428(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
	public abstract void method1429(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "()I")
	public abstract int method1430();

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
	public abstract void method1431(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
	public abstract void method1432(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "()V")
	public abstract void method1434();

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "()I")
	public abstract int method1435();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BIZ)Lclient!bk;")
	public abstract Class7 method1436(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!nc;Lclient!kf;II)V")
	public abstract void method1437(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class55_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)V")
	public abstract void method1438(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "()I")
	public abstract int method1440();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!nc;Lclient!kf;I)V")
	public abstract void method1441(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class55_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method1442(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "()I")
	public abstract int method1443();

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "()Z")
	protected abstract boolean method1444();

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(III)V")
	public abstract void method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!bk;IIIZ)V")
	public abstract void method1446(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "()I")
	public abstract int method1447();
}
