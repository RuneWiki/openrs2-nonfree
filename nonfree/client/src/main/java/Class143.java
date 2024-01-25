import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class143 {

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!mo", name = "A", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray5;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Lclient!ij;")
	private Class92 aClass92_2 = null;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
	private final boolean aBoolean252;

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
	public int anInt4082;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!ue;")
	private final Class121 aClass121_1;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ue;ZI)V")
	public Class143(@OriginalArg(0) Class121 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean252 = arg1;
		this.anInt4082 = arg2;
		this.aClass121_1 = arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3731(@OriginalArg(0) String arg0) {
		if (this.method3741()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass92_2.aClass135_1.method3663(Static281.method4770(local12));
			return this.method3734(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
	public int method3732(@OriginalArg(0) int arg0) {
		return this.method3756(arg0) ? this.aClass92_2.anIntArray259[arg0] : 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II[II)[B")
	public byte[] method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method3766(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method3742(arg2, arg0, arg1);
			if (!local30) {
				this.method3740(arg0);
				local30 = this.method3742(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static59.method1341(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt4082 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass92_2.anIntArray259[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt4082 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)I")
	private int method3734(@OriginalArg(0) int arg0) {
		if (this.method3756(arg0)) {
			return this.anObjectArray5[arg0] == null ? this.aClass121_1.method3315(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)Z")
	public boolean method3736(@OriginalArg(1) int arg0) {
		if (!this.method3741()) {
			return false;
		} else if (this.aClass92_2.anIntArray259.length == 1) {
			return this.method3749(arg0, 0);
		} else if (!this.method3756(arg0)) {
			return false;
		} else if (this.aClass92_2.anIntArray259[arg0] == 1) {
			return this.method3749(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)[I")
	public int[] method3738(@OriginalArg(0) int arg0) {
		if (!this.method3756(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass92_2.anIntArrayArray44[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass92_2.anIntArray258[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)I")
	public int method3739(@OriginalArg(0) int arg0) {
		if (this.method3741()) {
			@Pc(16) int local16 = this.aClass92_2.aClass135_1.method3663(arg0);
			return this.method3756(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)V")
	private void method3740(@OriginalArg(0) int arg0) {
		if (this.aBoolean252) {
			this.anObjectArray5[arg0] = this.aClass121_1.method3317(arg0);
		} else {
			this.anObjectArray5[arg0] = Static330.method5667(this.aClass121_1.method3317(arg0));
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)Z")
	private boolean method3741() {
		if (this.aClass92_2 == null) {
			this.aClass92_2 = this.aClass121_1.method3319();
			if (this.aClass92_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass92_2.anInt2865][];
			this.anObjectArray5 = new Object[this.aClass92_2.anInt2865];
		}
		return true;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([IIII)Z")
	private boolean method3742(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method3756(arg1)) {
			return false;
		} else if (this.anObjectArray5[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass92_2.anIntArray258[arg1];
			@Pc(31) int[] local31 = this.aClass92_2.anIntArrayArray44[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass92_2.anIntArray259[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(61) int local61;
				if (local31 == null) {
					local61 = local55;
				} else {
					local61 = local31[local55];
				}
				if (local51[local61] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(118) byte[] local118;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local118 = Static59.method1341(false, this.anObjectArray5[arg1]);
			} else {
				local118 = Static59.method1341(true, this.anObjectArray5[arg1]);
				@Pc(133) Class14_Sub4 local133 = new Class14_Sub4(local118);
				local133.method2555(local133.aByteArray74.length, arg0);
			}
			@Pc(145) byte[] local145;
			try {
				local145 = Static181.method3507(local118);
			} catch (@Pc(147) RuntimeException local147) {
				throw Static3.method108(local147, "T3 - " + (arg0 != null) + "," + arg1 + "," + local118.length + "," + Static66.method1650(local118.length, local118) + "," + Static66.method1650(local118.length - 2, local118) + "," + this.aClass92_2.anIntArray260[arg1] + "," + this.aClass92_2.anInt2863);
			}
			if (this.aBoolean252) {
				this.anObjectArray5[arg1] = null;
			}
			@Pc(227) int local227;
			if (local25 <= 1) {
				if (local31 == null) {
					local227 = 0;
				} else {
					local227 = local31[0];
				}
				if (this.anInt4082 == 0) {
					local51[local227] = Static330.method5667(local145);
				} else {
					local51[local227] = local145;
				}
			} else {
				@Pc(267) int local267;
				@Pc(280) Class14_Sub4 local280;
				@Pc(284) int local284;
				@Pc(289) int local289;
				@Pc(293) int local293;
				@Pc(295) int local295;
				@Pc(309) int local309;
				@Pc(358) int local358;
				@Pc(360) int local360;
				if (this.anInt4082 == 2) {
					local227 = local145.length;
					local227--;
					local267 = local145[local227] & 0xFF;
					local227 -= local25 * 4 * local267;
					local280 = new Class14_Sub4(local145);
					@Pc(282) int local282 = 0;
					local284 = 0;
					local280.anInt2637 = local227;
					for (local289 = 0; local289 < local267; local289++) {
						local293 = 0;
						for (local295 = 0; local295 < local25; local295++) {
							local293 += local280.method2510();
							if (local31 == null) {
								local309 = local295;
							} else {
								local309 = local31[local295];
							}
							if (arg2 == local309) {
								local284 = local309;
								local282 += local293;
							}
						}
					}
					if (local282 == 0) {
						return true;
					}
					@Pc(345) byte[] local345 = new byte[local282];
					local280.anInt2637 = local227;
					local282 = 0;
					local295 = 0;
					for (local309 = 0; local309 < local267; local309++) {
						local358 = 0;
						for (local360 = 0; local360 < local25; local360++) {
							local358 += local280.method2510();
							@Pc(374) int local374;
							if (local31 == null) {
								local374 = local360;
							} else {
								local374 = local31[local360];
							}
							if (local374 == arg2) {
								Static358.method769(local145, local295, local345, local282, local358);
								local282 += local358;
							}
							local295 += local358;
						}
					}
					local51[local284] = local345;
				} else {
					local227 = local145.length;
					local227--;
					local267 = local145[local227] & 0xFF;
					local227 -= local267 * 4 * local25;
					local280 = new Class14_Sub4(local145);
					local280.anInt2637 = local227;
					@Pc(446) int[] local446 = new int[local25];
					for (local284 = 0; local284 < local267; local284++) {
						local289 = 0;
						for (local293 = 0; local293 < local25; local293++) {
							local289 += local280.method2510();
							local446[local293] += local289;
						}
					}
					@Pc(488) byte[][] local488 = new byte[local25][];
					for (local293 = 0; local293 < local25; local293++) {
						local488[local293] = new byte[local446[local293]];
						local446[local293] = 0;
					}
					local280.anInt2637 = local227;
					local295 = 0;
					for (local309 = 0; local309 < local267; local309++) {
						local358 = 0;
						for (local360 = 0; local360 < local25; local360++) {
							local358 += local280.method2510();
							Static358.method769(local145, local295, local488[local360], local446[local360], local358);
							local295 += local358;
							local446[local360] += local358;
						}
					}
					for (local358 = 0; local358 < local25; local358++) {
						if (local31 == null) {
							local360 = local358;
						} else {
							local360 = local31[local358];
						}
						if (this.anInt4082 == 0) {
							local51[local360] = Static330.method5667(local488[local358]);
						} else {
							local51[local360] = local488[local358];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3743(@OriginalArg(0) String arg0) {
		if (this.method3741()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(32) int local32 = this.aClass92_2.aClass135_1.method3663(Static281.method4770(local14));
			return local32 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(IB)V")
	public void method3744(@OriginalArg(0) int arg0) {
		if (this.method3756(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)[B")
	public byte[] method3745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3733(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3746(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3741()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass92_2.aClass135_1.method3663(Static281.method4770(local12));
		if (this.method3756(local29)) {
			@Pc(47) int local47 = this.aClass92_2.aClass135Array1[local29].method3663(Static281.method4770(local20));
			return this.method3745(local29, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
	public int method3747() {
		return this.method3741() ? this.aClass92_2.anIntArray259.length : -1;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V")
	public void method3748() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)Z")
	public boolean method3749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3766(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray5[arg1] == null) {
			this.method3740(arg1);
			return this.anObjectArray5[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)[B")
	public byte[] method3750(@OriginalArg(1) int arg0) {
		if (!this.method3741()) {
			return null;
		} else if (this.aClass92_2.anIntArray259.length == 1) {
			return this.method3745(0, arg0);
		} else if (!this.method3756(arg0)) {
			return null;
		} else if (this.aClass92_2.anIntArray259[arg0] == 1) {
			return this.method3745(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)I")
	public int method3751() {
		if (!this.method3741()) {
			throw new IllegalStateException("");
		}
		return this.aClass92_2.anInt2863;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Z")
	public boolean method3752() {
		if (!this.method3741()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass92_2.anIntArray256.length; local23++) {
			@Pc(31) int local31 = this.aClass92_2.anIntArray256[local23];
			if (this.anObjectArray5[local31] == null) {
				this.method3740(local31);
				if (this.anObjectArray5[local31] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
	public void method3753() {
		if (this.anObjectArray5 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray5.length; local10++) {
				this.anObjectArray5[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method3754(@OriginalArg(0) String arg0) {
		if (this.method3741()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass92_2.aClass135_1.method3663(Static281.method4770(local12));
			return this.method3759(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)I")
	public int method3755() {
		if (!this.method3741()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray5.length; local17++) {
			if (this.aClass92_2.anIntArray258[local17] > 0) {
				local15 += this.method3734(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(II)Z")
	private boolean method3756(@OriginalArg(1) int arg0) {
		if (!this.method3741()) {
			return false;
		} else if (arg0 >= 0 && this.aClass92_2.anIntArray259.length > arg0 && this.aClass92_2.anIntArray259[arg0] != 0) {
			return true;
		} else if (Static110.aBoolean170) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZIZ)V")
	public void method3757(@OriginalArg(0) boolean arg0) {
		if (!this.method3741()) {
			return;
		}
		this.aClass92_2.anIntArrayArray43 = null;
		this.aClass92_2.aClass135Array1 = null;
		if (arg0) {
			this.aClass92_2.anIntArray257 = null;
			this.aClass92_2.aClass135_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(II)V")
	private void method3758(@OriginalArg(1) int arg0) {
		this.aClass121_1.method3314(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(IB)Z")
	public boolean method3759(@OriginalArg(0) int arg0) {
		if (!this.method3756(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method3740(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method3762(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3741()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass92_2.aClass135_1.method3663(Static281.method4770(local12));
		if (this.method3756(local24)) {
			@Pc(42) int local42 = this.aClass92_2.aClass135Array1[local24].method3663(Static281.method4770(local15));
			return this.method3749(local42, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public void method3764(@OriginalArg(1) String arg0) {
		if (this.method3741()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass92_2.aClass135_1.method3663(Static281.method4770(local18));
			this.method3758(local27);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method3765(@OriginalArg(1) String arg0) {
		if (this.method3741()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass92_2.aClass135_1.method3663(Static281.method4770(local12));
			return this.method3756(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZI)Z")
	private boolean method3766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3741()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass92_2.anIntArray259.length > arg0 && arg1 < this.aClass92_2.anIntArray259[arg0]) {
			return true;
		} else if (Static110.aBoolean170) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}
}
