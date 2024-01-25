import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class138 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!du;")
	public Class55 aClass55_2;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
	public int anInt4411;

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "[Z")
	public boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
	public int anInt4401 = -1;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	public int anInt4408 = -1;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
	public int anInt4412 = 99;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Z")
	public boolean aBoolean405 = false;

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
	public int anInt4413 = 5;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "Z")
	public boolean aBoolean407 = false;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	public int anInt4405 = -1;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Z")
	public boolean aBoolean404 = false;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	public int anInt4406 = 2;

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
	public int anInt4415 = -1;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
	public int anInt4410 = -1;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!iv;II)V")
	private void method3454(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(31) int local31;
		@Pc(33) int local33;
		@Pc(149) int local149;
		@Pc(168) int local168;
		if (arg1 == 1) {
			local31 = arg0.method2536();
			this.anIntArray296 = new int[local31];
			for (local33 = 0; local33 < local31; local33++) {
				this.anIntArray296[local33] = arg0.method2536();
			}
			this.anIntArray295 = new int[local31];
			for (local149 = 0; local149 < local31; local149++) {
				this.anIntArray295[local149] = arg0.method2536();
			}
			for (local168 = 0; local168 < local31; local168++) {
				this.anIntArray295[local168] += arg0.method2536() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt4405 = arg0.method2536();
		} else if (arg1 == 3) {
			this.aBooleanArray14 = new boolean[256];
			local31 = arg0.method2490();
			for (local33 = 0; local33 < local31; local33++) {
				this.aBooleanArray14[arg0.method2490()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean407 = true;
		} else if (arg1 == 5) {
			this.anInt4413 = arg0.method2490();
		} else if (arg1 == 6) {
			this.anInt4408 = arg0.method2536();
		} else if (arg1 == 7) {
			this.anInt4415 = arg0.method2536();
		} else if (arg1 == 8) {
			this.anInt4412 = arg0.method2490();
		} else if (arg1 == 9) {
			this.anInt4401 = arg0.method2490();
		} else if (arg1 == 10) {
			this.anInt4410 = arg0.method2490();
		} else if (arg1 == 11) {
			this.anInt4406 = arg0.method2490();
		} else if (arg1 == 12) {
			local31 = arg0.method2490();
			this.anIntArray297 = new int[local31];
			for (local33 = 0; local33 < local31; local33++) {
				this.anIntArray297[local33] = arg0.method2536();
			}
			for (local149 = 0; local149 < local31; local149++) {
				this.anIntArray297[local149] = (arg0.method2536() << 16) + this.anIntArray297[local149];
			}
		} else if (arg1 == 13) {
			local31 = arg0.method2536();
			this.anIntArrayArray36 = new int[local31][];
			for (local33 = 0; local33 < local31; local33++) {
				local149 = arg0.method2490();
				if (local149 > 0) {
					this.anIntArrayArray36[local33] = new int[local149];
					this.anIntArrayArray36[local33][0] = arg0.method2493();
					for (local168 = 1; local168 < local149; local168++) {
						this.anIntArrayArray36[local33][local168] = arg0.method2536();
					}
				}
			}
			return;
		} else if (arg1 == 14) {
			this.aBoolean406 = true;
			return;
		} else if (arg1 == 15) {
			this.aBoolean405 = true;
			return;
		} else if (arg1 == 16) {
			this.aBoolean404 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!iv;I)V")
	public void method3455(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2490();
			if (local13 == 0) {
				return;
			}
			this.method3454(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIILclient!t;I)Lclient!t;")
	public Class110 method3456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class110 arg4) {
		@Pc(14) int local14 = this.anIntArray296[arg3];
		@Pc(19) int local19 = this.anIntArray295[arg3];
		@Pc(27) Class4_Sub1_Sub17 local27 = this.aClass55_2.method1391(local19 >> 16);
		@Pc(31) int local31 = local19 & 0xFFFF;
		if (local27 == null) {
			return arg4.method4887((byte) 1, arg1, true);
		}
		@Pc(41) Class4_Sub1_Sub17 local41 = null;
		if ((this.aBoolean405 || Static127.aBoolean244) && arg2 != -1 && this.anIntArray295.length > arg2) {
			@Pc(60) int local60 = this.anIntArray295[arg2];
			local41 = this.aClass55_2.method1391(local60 >> 16);
			arg2 = local60 & 0xFFFF;
		}
		@Pc(74) Class4_Sub1_Sub17 local74 = null;
		@Pc(76) Class4_Sub1_Sub17 local76 = null;
		@Pc(78) int local78 = 0;
		@Pc(80) int local80 = 0;
		if (this.anIntArray297 != null) {
			if (arg3 < this.anIntArray297.length) {
				local78 = this.anIntArray297[arg3];
				if (local78 != 65535) {
					local74 = this.aClass55_2.method1391(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
			if ((this.aBoolean405 || Static127.aBoolean244) && arg2 != -1 && arg2 < this.anIntArray297.length) {
				local80 = this.anIntArray297[arg2];
				if (local80 != 65535) {
					local76 = this.aClass55_2.method1391(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean406) {
			arg1 |= 0x200;
		}
		if (local27.method4207(local31)) {
			arg1 |= 0x80;
		}
		if (local27.method4214(local31)) {
			arg1 |= 0x100;
		}
		if (local27.method4215(local31)) {
			arg1 |= 0x400;
		}
		if (local74 != null) {
			if (local74.method4207(local78)) {
				arg1 |= 0x80;
			}
			if (local74.method4214(local78)) {
				arg1 |= 0x100;
			}
			if (local74.method4215(local78)) {
				arg1 |= 0x400;
			}
		}
		if (local41 != null) {
			if (local41.method4207(arg2)) {
				arg1 |= 0x80;
			}
			if (local41.method4214(arg2)) {
				arg1 |= 0x100;
			}
			if (local41.method4215(arg2)) {
				arg1 |= 0x400;
			}
		}
		if (local76 != null) {
			if (local76.method4207(local80)) {
				arg1 |= 0x80;
			}
			if (local76.method4214(local80)) {
				arg1 |= 0x100;
			}
			if (local76.method4215(local80)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(281) Class110 local281 = arg4.method4887((byte) 1, arg1, true);
		local281.method4883(0, local14, this.aBoolean406, local31, arg2, local27, local41, arg0 - 1);
		if (local74 != null) {
			local281.method4883(0, local14, this.aBoolean406, local78, local80, local74, local76, arg0 - 1);
		}
		return local281;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIZ)I")
	public int method3457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(20) int local20 = this.anIntArray295[arg0];
		@Pc(22) Class4_Sub1_Sub17 local22 = null;
		@Pc(30) Class4_Sub1_Sub17 local30 = this.aClass55_2.method1391(local20 >> 16);
		@Pc(34) int local34 = local20 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean405 || Static127.aBoolean244) && arg1 != -1 && arg1 < this.anIntArray295.length) {
			local7 = this.anIntArray295[arg1];
			local22 = this.aClass55_2.method1391(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean406) {
			local5 = 512;
		}
		if (local30.method4207(local34)) {
			local5 |= 0x80;
		}
		if (local30.method4214(local34)) {
			local5 |= 0x100;
		}
		if (local30.method4215(local34)) {
			local5 |= 0x400;
		}
		if (local22 != null) {
			if (local22.method4207(local7)) {
				local5 |= 0x80;
			}
			if (local22.method4214(local7)) {
				local5 |= 0x100;
			}
			if (local22.method4215(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray297 != null && arg2) {
			@Pc(151) int local151;
			@Pc(164) Class4_Sub1_Sub17 local164;
			if (this.anIntArray297.length > arg0) {
				local151 = this.anIntArray297[arg0];
				if (local151 != 65535) {
					local164 = this.aClass55_2.method1391(local151 >> 16);
					local151 &= 0xFFFF;
					if (local164 != null) {
						if (local164.method4207(local151)) {
							local5 |= 0x80;
						}
						if (local164.method4214(local151)) {
							local5 |= 0x100;
						}
						if (local164.method4215(local151)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean405 || Static127.aBoolean244) && arg1 != -1 && this.anIntArray297.length > arg1) {
				local151 = this.anIntArray297[arg1];
				if (local151 != 65535) {
					local164 = this.aClass55_2.method1391(local151 >> 16);
					local151 &= 0xFFFF;
					if (local164 != null) {
						if (local164.method4207(local151)) {
							local5 |= 0x80;
						}
						if (local164.method4214(local151)) {
							local5 |= 0x100;
						}
						if (local164.method4215(local151)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBLclient!t;IIIII)Lclient!t;")
	public Class110 method3459(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = this.anIntArray296[arg0];
		@Pc(13) int local13 = this.anIntArray295[arg0];
		@Pc(23) Class4_Sub1_Sub17 local23 = this.aClass55_2.method1391(local13 >> 16);
		@Pc(27) int local27 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg2.method4887(arg1, arg6, true);
		}
		@Pc(37) Class4_Sub1_Sub17 local37 = null;
		if ((this.aBoolean405 || Static127.aBoolean244) && arg4 != -1 && arg4 < this.anIntArray295.length) {
			@Pc(55) int local55 = this.anIntArray295[arg4];
			local37 = this.aClass55_2.method1391(local55 >> 16);
			arg4 = local55 & 0xFFFF;
		}
		if (this.aBoolean406) {
			arg6 |= 0x200;
		}
		if (local23.method4207(local27)) {
			arg6 |= 0x80;
		}
		if (local23.method4214(local27)) {
			arg6 |= 0x100;
		}
		if (local23.method4215(local27)) {
			arg6 |= 0x400;
		}
		if (local37 != null) {
			if (local37.method4207(arg4)) {
				arg6 |= 0x80;
			}
			if (local37.method4214(arg4)) {
				arg6 |= 0x100;
			}
			if (local37.method4215(arg4)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(150) Class110 local150 = arg2.method4887(arg1, arg6, true);
		local150.method4883(arg5, local8, this.aBoolean406, local27, arg4, local23, local37, arg3 - 1);
		return local150;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
	public void method3460() {
		if (this.anInt4401 == -1) {
			if (this.aBooleanArray14 == null) {
				this.anInt4401 = 0;
			} else {
				this.anInt4401 = 2;
			}
		}
		if (this.anInt4410 != -1) {
			return;
		}
		if (this.aBooleanArray14 == null) {
			this.anInt4410 = 0;
		} else {
			this.anInt4410 = 2;
		}
	}
}
