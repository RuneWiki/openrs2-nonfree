import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class109 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "[[I")
	public int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "Lclient!fk;")
	public Class80 aClass80_2;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	public int anInt2780;

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "[Z")
	public boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!hg", name = "z", descriptor = "[I")
	public int[] anIntArray240;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
	public int anInt2774 = 99;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
	public int anInt2777 = 5;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public int anInt2775 = -1;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
	public int anInt2785 = -1;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
	public int anInt2788 = 2;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	public int anInt2776 = -1;

	@OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
	public int anInt2789 = -1;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
	public int anInt2790 = -1;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public int anInt2773 = 0;

	@OriginalMember(owner = "client!hg", name = "B", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!hw;I)V")
	public void method2295(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6138();
			if (local15 == 0) {
				return;
			}
			this.method2300(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIILclient!e;B)Lclient!e;")
	public Class63 method2297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class63 arg4) {
		@Pc(8) int local8 = this.anIntArray238[arg3];
		@Pc(13) int local13 = this.anIntArray240[arg3];
		@Pc(21) Class2_Sub1_Sub12 local21 = this.aClass80_2.method1871(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method6296((byte) 1, arg1, true);
		}
		@Pc(35) Class2_Sub1_Sub12 local35 = null;
		if ((this.aBoolean172 || Static83.aBoolean76) && arg2 != -1 && arg2 < this.anIntArray240.length) {
			@Pc(53) int local53 = this.anIntArray240[arg2];
			local35 = this.aClass80_2.method1871(local53 >> 16);
			arg2 = local53 & 0xFFFF;
		}
		@Pc(67) Class2_Sub1_Sub12 local67 = null;
		@Pc(69) Class2_Sub1_Sub12 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray239 != null) {
			if (arg3 < this.anIntArray239.length) {
				local71 = this.anIntArray239[arg3];
				if (local71 != 65535) {
					local67 = this.aClass80_2.method1871(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean172 || Static83.aBoolean76) && arg2 != -1 && this.anIntArray239.length > arg2) {
				local73 = this.anIntArray239[arg2];
				if (local73 != 65535) {
					local69 = this.aClass80_2.method1871(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean173) {
			arg1 |= 0x200;
		}
		if (local21.method3895(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method3890(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method3889(local25)) {
			arg1 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method3895(local71)) {
				arg1 |= 0x80;
			}
			if (local67.method3890(local71)) {
				arg1 |= 0x100;
			}
			if (local67.method3889(local71)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method3895(arg2)) {
				arg1 |= 0x80;
			}
			if (local35.method3890(arg2)) {
				arg1 |= 0x100;
			}
			if (local35.method3889(arg2)) {
				arg1 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method3895(local73)) {
				arg1 |= 0x80;
			}
			if (local69.method3890(local73)) {
				arg1 |= 0x100;
			}
			if (local69.method3889(local73)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(276) Class63 local276 = arg4.method6296((byte) 1, arg1, true);
		local276.method6299(0, local25, arg2, local35, local8, this.aBoolean173, arg0 - 1, local21);
		if (local67 != null) {
			local276.method6299(0, local71, local73, local69, local8, this.aBoolean173, arg0 - 1, local67);
		}
		return local276;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBIBLclient!e;III)Lclient!e;")
	public Class63 method2298(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class63 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = this.anIntArray238[arg2];
		@Pc(18) int local18 = this.anIntArray240[arg2];
		@Pc(26) Class2_Sub1_Sub12 local26 = this.aClass80_2.method1871(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg3.method6296(arg1, arg6, true);
		}
		@Pc(40) Class2_Sub1_Sub12 local40 = null;
		if ((this.aBoolean172 || Static83.aBoolean76) && arg4 != -1 && arg4 < this.anIntArray240.length) {
			@Pc(62) int local62 = this.anIntArray240[arg4];
			local40 = this.aClass80_2.method1871(local62 >> 16);
			arg4 = local62 & 0xFFFF;
		}
		if (this.aBoolean173) {
			arg6 |= 0x200;
		}
		if (local26.method3895(local30)) {
			arg6 |= 0x80;
		}
		if (local26.method3890(local30)) {
			arg6 |= 0x100;
		}
		if (local26.method3889(local30)) {
			arg6 |= 0x400;
		}
		if (local40 != null) {
			if (local40.method3895(arg4)) {
				arg6 |= 0x80;
			}
			if (local40.method3890(arg4)) {
				arg6 |= 0x100;
			}
			if (local40.method3889(arg4)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(147) Class63 local147 = arg3.method6296(arg1, arg6, true);
		local147.method6299(arg0, local30, arg4, local40, local13, this.aBoolean173, arg5 - 1, local26);
		return local147;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIZ)I")
	public int method2299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray240[arg1];
		@Pc(14) Class2_Sub1_Sub12 local14 = null;
		@Pc(22) Class2_Sub1_Sub12 local22 = this.aClass80_2.method1871(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean172 || Static83.aBoolean76) && arg0 != -1 && this.anIntArray240.length > arg0) {
			local7 = this.anIntArray240[arg0];
			local14 = this.aClass80_2.method1871(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean173) {
			local5 = 512;
		}
		if (local22.method3895(local26)) {
			local5 |= 0x80;
		}
		if (local22.method3890(local26)) {
			local5 |= 0x100;
		}
		if (local22.method3889(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method3895(local7)) {
				local5 |= 0x80;
			}
			if (local14.method3890(local7)) {
				local5 |= 0x100;
			}
			if (local14.method3889(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray239 != null && arg2) {
			@Pc(148) int local148;
			@Pc(161) Class2_Sub1_Sub12 local161;
			if (arg1 < this.anIntArray239.length) {
				local148 = this.anIntArray239[arg1];
				if (local148 != 65535) {
					local161 = this.aClass80_2.method1871(local148 >> 16);
					local148 &= 0xFFFF;
					if (local161 != null) {
						if (local161.method3895(local148)) {
							local5 |= 0x80;
						}
						if (local161.method3890(local148)) {
							local5 |= 0x100;
						}
						if (local161.method3889(local148)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean172 || Static83.aBoolean76) && arg0 != -1 && arg0 < this.anIntArray239.length) {
				local148 = this.anIntArray239[arg0];
				if (local148 != 65535) {
					local161 = this.aClass80_2.method1871(local148 >> 16);
					local148 &= 0xFFFF;
					if (local161 != null) {
						if (local161.method3895(local148)) {
							local5 |= 0x80;
						}
						if (local161.method3890(local148)) {
							local5 |= 0x100;
						}
						if (local161.method3889(local148)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZILclient!hw;)V")
	private void method2300(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(46) int local46;
		@Pc(60) int local60;
		if (arg0 == 1) {
			local18 = arg1.method6148();
			this.anIntArray238 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray238[local24] = arg1.method6148();
			}
			this.anIntArray240 = new int[local18];
			for (local46 = 0; local46 < local18; local46++) {
				this.anIntArray240[local46] = arg1.method6148();
			}
			for (local60 = 0; local60 < local18; local60++) {
				this.anIntArray240[local60] += arg1.method6148() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt2785 = arg1.method6148();
		} else if (arg0 == 3) {
			this.aBooleanArray10 = new boolean[256];
			local18 = arg1.method6138();
			for (local24 = 0; local24 < local18; local24++) {
				this.aBooleanArray10[arg1.method6138()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt2777 = arg1.method6138();
		} else if (arg0 == 6) {
			this.anInt2775 = arg1.method6148();
		} else if (arg0 == 7) {
			this.anInt2776 = arg1.method6148();
		} else if (arg0 == 8) {
			this.anInt2774 = arg1.method6138();
		} else if (arg0 == 9) {
			this.anInt2789 = arg1.method6138();
		} else if (arg0 == 10) {
			this.anInt2790 = arg1.method6138();
		} else if (arg0 == 11) {
			this.anInt2788 = arg1.method6138();
		} else if (arg0 == 12) {
			local18 = arg1.method6138();
			this.anIntArray239 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray239[local24] = arg1.method6148();
			}
			for (local46 = 0; local46 < local18; local46++) {
				this.anIntArray239[local46] += arg1.method6148() << 16;
			}
		} else if (arg0 == 13) {
			local18 = arg1.method6148();
			this.anIntArrayArray63 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				local46 = arg1.method6138();
				if (local46 > 0) {
					this.anIntArrayArray63[local24] = new int[local46];
					this.anIntArrayArray63[local24][0] = arg1.method6145();
					for (local60 = 1; local60 < local46; local60++) {
						this.anIntArrayArray63[local24][local60] = arg1.method6148();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean173 = true;
		} else if (arg0 == 15) {
			this.aBoolean172 = true;
		} else if (arg0 == 16) {
			this.aBoolean174 = true;
		} else if (arg0 == 17) {
			this.anInt2773 = arg1.method6138();
			return;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public void method2301() {
		if (this.anInt2789 == -1) {
			if (this.aBooleanArray10 == null) {
				this.anInt2789 = 0;
			} else {
				this.anInt2789 = 2;
			}
		}
		if (this.anInt2790 != -1) {
			return;
		}
		if (this.aBooleanArray10 == null) {
			this.anInt2790 = 0;
		} else {
			this.anInt2790 = 2;
		}
	}
}
