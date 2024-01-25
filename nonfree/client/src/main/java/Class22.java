import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public abstract class Class22 {

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	protected Class22() {
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "()I")
	public abstract int method1561();

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "()I")
	public abstract int method1563();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!mu;Lclient!ro;I)V")
	public abstract void method1565(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class41_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!mu;Lclient!ro;II)V")
	public abstract void method1566(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class41_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
	public abstract void method1568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!fq;)Lclient!fq;")
	public abstract Class1_Sub6_Sub5 method1569(@OriginalArg(0) Class1_Sub6_Sub5 arg0);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method1570(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!un;ILclient!un;IIZIII)V")
	public final void method1571(@OriginalArg(0) Class1_Sub6_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub6_Sub15 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1 || !this.method1593()) {
			return;
		}
		@Pc(17) Class6 local17 = arg0.aClass6Array1[arg5];
		@Pc(20) Class1_Sub25 local20 = local17.aClass1_Sub25_1;
		@Pc(22) Class6 local22 = null;
		if (arg2 != null) {
			local22 = arg2.aClass6Array1[arg3];
			if (local22.aClass1_Sub25_1 != local20) {
				local22 = null;
			}
		}
		this.method1573(local20, arg4, arg6, 65535, local22, false, arg1, arg7, local17, null, null);
		this.method1590();
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "()I")
	public abstract int method1572();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!lr;ZIILclient!af;ZIILclient!af;[Z[II)V")
	private void method1573(@OriginalArg(0) Class1_Sub25 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6 arg8, @OriginalArg(9) boolean[] arg9, @OriginalArg(10) int[] arg10) {
		@Pc(14) int local14;
		if (arg4 == null || arg7 == 0) {
			for (local14 = 0; local14 < arg8.anInt94; local14++) {
				@Pc(21) short local21 = arg8.aShortArray5[local14];
				if (arg9 == null || arg5 == arg9[local21] || arg0.anIntArray453[local21] == 0) {
					@Pc(49) short local49 = arg8.aShortArray3[local14];
					if (local49 != -1) {
						this.method1599(arg0.anIntArray452[local49] & arg3, arg1, 0, 0, arg10, arg6, 0, arg0.anIntArrayArray43[local49], 0);
					}
					this.method1599(arg0.anIntArray452[local21] & arg3, arg1, arg8.aShortArray2[local14], arg8.aShortArray4[local14], arg10, arg6, arg8.aShortArray6[local14], arg0.anIntArrayArray43[local21], arg0.anIntArray453[local21]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(123) int local123 = 0;
		for (@Pc(125) int local125 = 0; local125 < arg0.anInt3661; local125++) {
			@Pc(129) boolean local129 = false;
			if (local14 < arg8.anInt94 && local125 == arg8.aShortArray5[local14]) {
				local129 = true;
			}
			@Pc(147) boolean local147 = false;
			if (arg4.anInt94 > local123 && arg4.aShortArray5[local123] == local125) {
				local147 = true;
			}
			if (local129 || local147) {
				if (arg9 == null || arg5 == arg9[local125] || arg0.anIntArray453[local125] == 0) {
					@Pc(197) short local197 = 0;
					@Pc(202) int local202 = arg0.anIntArray453[local125];
					if (local202 == 3) {
						local197 = 128;
					}
					@Pc(219) short local219;
					@Pc(234) short local234;
					@Pc(224) short local224;
					@Pc(214) short local214;
					@Pc(229) byte local229;
					if (local129) {
						local214 = arg8.aShortArray3[local14];
						local219 = arg8.aShortArray4[local14];
						local224 = arg8.aShortArray2[local14];
						local229 = arg8.aByteArray2[local14];
						local234 = arg8.aShortArray6[local14];
						local14++;
					} else {
						local234 = local197;
						local224 = local197;
						local214 = -1;
						local229 = 0;
						local219 = local197;
					}
					@Pc(259) short local259;
					@Pc(269) short local269;
					@Pc(254) short local254;
					@Pc(264) short local264;
					@Pc(274) byte local274;
					if (local147) {
						local254 = arg4.aShortArray2[local123];
						local259 = arg4.aShortArray4[local123];
						local264 = arg4.aShortArray3[local123];
						local269 = arg4.aShortArray6[local123];
						local274 = arg4.aByteArray2[local123];
						local123++;
					} else {
						local259 = local197;
						local254 = local197;
						local274 = 0;
						local264 = -1;
						local269 = local197;
					}
					if (local214 != -1) {
						this.method1599(arg3 & arg0.anIntArray452[local214], arg1, 0, 0, arg10, arg6, 0, arg0.anIntArrayArray43[local214], 0);
					} else if (local264 != -1) {
						this.method1599(arg3 & arg0.anIntArray452[local264], arg1, 0, 0, arg10, arg6, 0, arg0.anIntArrayArray43[local264], 0);
					}
					@Pc(352) int local352;
					@Pc(350) int local350;
					@Pc(354) int local354;
					if ((local229 & 0x2) == 0 && (local274 & 0x1) == 0) {
						@Pc(365) int local365;
						if (local202 == 2) {
							local365 = local259 - local219 & 0x3FFF;
							@Pc(372) int local372 = local269 - local234 & 0x3FFF;
							if (local365 >= 8192) {
								local365 -= 16384;
							}
							if (local372 >= 8192) {
								local372 -= 16384;
							}
							@Pc(387) int local387 = local254 - local224 & 0x3FFF;
							local350 = local234 + arg7 * local372 / arg2 & 0x3FFF;
							local352 = local365 * arg7 / arg2 + local219 & 0x3FFF;
							if (local387 >= 8192) {
								local387 -= 16384;
							}
							local354 = local224 + arg7 * local387 / arg2 & 0x3FFF;
						} else if (local202 == 7) {
							local365 = local259 - local219 & 0x3F;
							if (local365 >= 32) {
								local365 -= 64;
							}
							local352 = arg7 * local365 / arg2 + local219 & 0x3F;
							local350 = local234 + arg7 * (local269 - local234) / arg2;
							local354 = local224 + arg7 * (local254 - local224) / arg2;
						} else {
							local352 = (local259 - local219) * arg7 / arg2 + local219;
							local354 = local224 + arg7 * (local254 - local224) / arg2;
							local350 = arg7 * (local269 - local234) / arg2 + local234;
						}
					} else {
						local350 = local234;
						local352 = local219;
						local354 = local224;
					}
					this.method1599(arg3 & arg0.anIntArray452[local125], arg1, local354, local352, arg10, arg6, local350, arg0.anIntArrayArray43[local125], local202);
				} else {
					if (local129) {
						local14++;
					}
					if (local147) {
						local123++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "()I")
	public abstract int method1574();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(SS)V")
	public abstract void method1576(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "()I")
	public abstract int method1577();

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "()I")
	public abstract int method1578();

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "()I")
	public abstract int method1579();

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public abstract void method1580(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(SS)V")
	public abstract void method1581(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
	public abstract void method1582(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "()V")
	public abstract void method1583();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!mu;Z)Z")
	public abstract boolean method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!un;I)V")
	public final void method1585(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6_Sub15 arg1) {
		if (arg0 == -1 || !this.method1593()) {
			return;
		}
		@Pc(23) Class6 local23 = arg1.aClass6Array1[arg0];
		@Pc(26) Class1_Sub25 local26 = local23.aClass1_Sub25_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt94; local28++) {
			@Pc(35) short local35 = local23.aShortArray5[local28];
			if (local26.aBooleanArray18[local35]) {
				if (local23.aShortArray3[local28] != -1) {
					this.method1603(0, 0, 0, 0);
				}
				this.method1603(local26.anIntArray453[local35], local23.aShortArray4[local28], local23.aShortArray6[local28], local23.aShortArray2[local28]);
			}
		}
		this.method1590();
	}

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "()I")
	public abstract int method1586();

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "()I")
	public abstract int method1587();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!un;I[IZIIBIIILclient!un;)V")
	public final void method1588(@OriginalArg(0) Class1_Sub6_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class1_Sub6_Sub15 arg8) {
		if (arg1 == -1 || !this.method1593()) {
			return;
		}
		@Pc(17) Class6 local17 = arg8.aClass6Array1[arg1];
		@Pc(26) Class1_Sub25 local26 = local17.aClass1_Sub25_1;
		@Pc(28) Class6 local28 = null;
		if (arg0 != null) {
			local28 = arg0.aClass6Array1[arg5];
			if (local28.aClass1_Sub25_1 != local26) {
				local28 = null;
			}
		}
		this.method1573(local26, arg3, arg7, arg4, local28, false, 0, arg6, local17, null, arg2);
		this.method1590();
	}

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "()[Lclient!am;")
	public abstract Class12[] method1589();

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "()V")
	protected abstract void method1590();

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "()[Lclient!qt;")
	public abstract Class197[] method1591();

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "()I")
	public abstract int method1592();

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "()Z")
	protected abstract boolean method1593();

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)V")
	public abstract void method1594(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BIIILclient!cl;II)V")
	protected final void method1595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg5 / 2;
		@Pc(19) int local19 = -arg2 / 2;
		@Pc(30) int local30 = arg3.method3043(arg4 + local14, arg1 - -local19);
		@Pc(34) int local34 = arg5 / 2;
		@Pc(39) int local39 = -arg2 / 2;
		@Pc(49) int local49 = arg3.method3043(local34 + arg4, arg1 - -local39);
		@Pc(54) int local54 = -arg5 / 2;
		@Pc(58) int local58 = arg2 / 2;
		@Pc(67) int local67 = arg3.method3043(local54 + arg4, local58 + arg1);
		@Pc(71) int local71 = arg5 / 2;
		@Pc(75) int local75 = arg2 / 2;
		@Pc(84) int local84 = arg3.method3043(local71 + arg4, local75 + arg1);
		@Pc(91) int local91 = local49 > local30 ? local30 : local49;
		@Pc(102) int local102 = local84 > local67 ? local67 : local84;
		@Pc(118) int local118 = local49 < local84 ? local49 : local84;
		if (arg2 != 0) {
			@Pc(136) int local136 = (int) (Math.atan2((double) (local91 - local102), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local136 != 0) {
				this.method1582(local136);
			}
		}
		@Pc(148) int local148 = local30 >= local67 ? local67 : local30;
		if (arg5 != 0) {
			@Pc(164) int local164 = (int) (Math.atan2((double) (local148 - local118), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local164 != 0) {
				this.method1580(local164);
			}
		}
		@Pc(173) int local173 = local84 + local30;
		if (local67 + local49 < local173) {
			local173 = local49 + local67;
		}
		local173 = (local173 >> 1) - arg0;
		if (local173 != 0) {
			this.method1568(0, local173, 0);
		}
	}

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "()Z")
	public abstract boolean method1596();

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V")
	public abstract void method1597(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BIZ)Lclient!ns;")
	public abstract Class22 method1598(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZII[III[IBI)V")
	private void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(28) int local28;
		if (arg5 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local28 = -arg3;
				arg3 = arg2;
				arg2 = local28;
			} else if (arg8 == 3) {
				local28 = arg3;
				arg3 = arg2;
				arg2 = local28;
			} else if (arg8 == 2) {
				local28 = arg3;
				arg3 = -arg2 & 0x3FFF;
				arg2 = local28 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg2 = -arg2;
				arg3 = -arg3;
			} else if (arg8 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local28 = arg3;
				arg3 = -arg2;
				arg2 = local28;
			} else if (arg8 == 3) {
				local28 = arg3;
				arg3 = arg2;
				arg2 = local28;
			} else if (arg8 == 2) {
				local28 = arg3;
				arg3 = arg2 & 0x3FFF;
				arg2 = -local28 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method1570(arg8, arg7, arg3, arg6, arg2, arg5, arg1);
		} else {
			this.method1564(arg8, arg7, arg3, arg6, arg2, arg1, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)V")
	public abstract void method1600(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!un;[ZILclient!un;IIIILclient!un;ZILclient!un;III)V")
	public final void method1601(@OriginalArg(0) Class1_Sub6_Sub15 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub6_Sub15 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub6_Sub15 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class1_Sub6_Sub15 arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg1 == null || arg7 == -1) {
			this.method1571(arg0, 0, arg11, arg10, arg9, arg2, arg4, arg13);
		} else if (this.method1593()) {
			@Pc(35) Class6 local35 = arg0.aClass6Array1[arg2];
			@Pc(38) Class1_Sub25 local38 = local35.aClass1_Sub25_1;
			@Pc(40) Class6 local40 = null;
			if (arg11 != null) {
				local40 = arg11.aClass6Array1[arg10];
				if (local40.aClass1_Sub25_1 != local38) {
					local40 = null;
				}
			}
			@Pc(58) Class6 local58 = arg8.aClass6Array1[arg7];
			@Pc(60) Class6 local60 = null;
			if (arg3 != null) {
				local60 = arg3.aClass6Array1[arg6];
				if (local60.aClass1_Sub25_1 != local38) {
					local60 = null;
				}
			}
			this.method1573(local38, arg9, arg4, 65535, local40, false, 0, arg13, local35, arg1, null);
			this.method1570(0, new int[0], 0, 0, 0, 0, arg9);
			this.method1573(local38, arg9, arg5, 65535, local60, true, 0, arg12, local58, arg1, null);
			this.method1590();
		}
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)V")
	public abstract void method1602(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)V")
	protected abstract void method1603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!cl;Lclient!cl;III)V")
	public abstract void method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)V")
	public abstract void method1605(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "()V")
	public abstract void method1606();

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)V")
	public abstract void method1607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ns;IIIZ)V")
	public abstract void method1608(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
