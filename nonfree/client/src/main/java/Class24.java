import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class24 {

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "[Z")
	public boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "[I")
	public int[] anIntArray64;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
	public int anInt592;

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	public int anInt574 = 2;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
	public boolean aBoolean44 = false;

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "Z")
	public boolean aBoolean43 = false;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
	public int anInt586 = -1;

	@OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
	public int anInt588 = 5;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	public int anInt589 = 99;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
	public int anInt584 = -1;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
	public int anInt587 = -1;

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
	public int anInt595 = -1;

	@OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
	public int anInt596 = -1;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLclient!rc;IIIIII)Lclient!rc;")
	public Class78 method486(@OriginalArg(0) byte arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray66[arg4];
		@Pc(13) int local13 = this.anIntArray64[arg4];
		@Pc(19) Class6_Sub2_Sub9 local19 = Static109.method2198(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method4661((byte) 1, arg5, true);
		}
		@Pc(33) Class6_Sub2_Sub9 local33 = null;
		if ((this.aBoolean43 || Static139.aBoolean207) && arg2 != -1 && this.anIntArray64.length > arg2) {
			@Pc(55) int local55 = this.anIntArray64[arg2];
			local33 = Static109.method2198(local55 >> 16);
			arg2 = local55 & 0xFFFF;
		}
		if (this.aBoolean46) {
			arg5 |= 0x200;
		}
		if (local19.method3163(local23)) {
			arg5 |= 0x80;
		}
		if (local19.method3161(local23)) {
			arg5 |= 0x100;
		}
		if (local33 != null) {
			if (local33.method3163(arg2)) {
				arg5 |= 0x80;
			}
			if (local33.method3161(arg2)) {
				arg5 |= 0x100;
			}
		}
		arg5 |= 0x20;
		@Pc(122) Class78 local122 = arg1.method4661(arg0, arg5, true);
		local122.method4628(local19, arg2, local8, this.aBoolean46, local33, arg6, arg3 - 1, local23);
		return local122;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public void method488() {
		if (this.anInt595 == -1) {
			if (this.aBooleanArray10 == null) {
				this.anInt595 = 0;
			} else {
				this.anInt595 = 2;
			}
		}
		if (this.anInt587 != -1) {
			return;
		}
		if (this.aBooleanArray10 == null) {
			this.anInt587 = 0;
		} else {
			this.anInt587 = 2;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method491(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		@Pc(91) int local91;
		@Pc(97) int local97;
		@Pc(112) int local112;
		@Pc(173) int local173;
		if (arg1 == 1) {
			local91 = arg0.method4021();
			this.anIntArray66 = new int[local91];
			for (local97 = 0; local97 < local91; local97++) {
				this.anIntArray66[local97] = arg0.method4021();
			}
			this.anIntArray64 = new int[local91];
			for (local112 = 0; local112 < local91; local112++) {
				this.anIntArray64[local112] = arg0.method4021();
			}
			for (local173 = 0; local173 < local91; local173++) {
				this.anIntArray64[local173] += arg0.method4021() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt586 = arg0.method4021();
		} else if (arg1 == 3) {
			this.aBooleanArray10 = new boolean[256];
			local91 = arg0.method3972();
			for (local97 = 0; local97 < local91; local97++) {
				this.aBooleanArray10[arg0.method3972()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean45 = true;
		} else if (arg1 == 5) {
			this.anInt588 = arg0.method3972();
		} else if (arg1 == 6) {
			this.anInt596 = arg0.method4021();
		} else if (arg1 == 7) {
			this.anInt584 = arg0.method4021();
		} else if (arg1 == 8) {
			this.anInt589 = arg0.method3972();
		} else if (arg1 == 9) {
			this.anInt595 = arg0.method3972();
		} else if (arg1 == 10) {
			this.anInt587 = arg0.method3972();
		} else if (arg1 == 11) {
			this.anInt574 = arg0.method3972();
		} else if (arg1 == 12) {
			local91 = arg0.method3972();
			this.anIntArray65 = new int[local91];
			for (local97 = 0; local97 < local91; local97++) {
				this.anIntArray65[local97] = arg0.method4021();
			}
			for (local112 = 0; local112 < local91; local112++) {
				this.anIntArray65[local112] += arg0.method4021() << 16;
			}
		} else if (arg1 == 13) {
			local91 = arg0.method4021();
			this.anIntArrayArray30 = new int[local91][];
			for (local97 = 0; local97 < local91; local97++) {
				local112 = arg0.method3972();
				if (local112 > 0) {
					this.anIntArrayArray30[local97] = new int[local112];
					this.anIntArrayArray30[local97][0] = arg0.method3996();
					for (local173 = 1; local173 < local112; local173++) {
						this.anIntArrayArray30[local97][local173] = arg0.method4021();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean46 = true;
		} else if (arg1 == 15) {
			this.aBoolean43 = true;
			return;
		} else if (arg1 == 16) {
			this.aBoolean44 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method492(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3972();
			if (local15 == 0) {
				return;
			}
			this.method491(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZIZ)I")
	public int method493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray64[arg1];
		@Pc(19) Class6_Sub2_Sub9 local19 = null;
		@Pc(25) Class6_Sub2_Sub9 local25 = Static109.method2198(local17 >> 16);
		@Pc(29) int local29 = local17 & 0xFFFF;
		if (local25 == null) {
			return 0;
		}
		if ((this.aBoolean43 || Static139.aBoolean207) && arg0 != -1 && this.anIntArray64.length > arg0) {
			local12 = this.anIntArray64[arg0];
			local19 = Static109.method2198(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean46) {
			local10 = 512;
		}
		if (local25.method3163(local29)) {
			local10 |= 0x80;
		}
		if (local25.method3161(local29)) {
			local10 |= 0x100;
		}
		if (local19 != null) {
			if (local19.method3163(local12)) {
				local10 |= 0x80;
			}
			if (local19.method3161(local12)) {
				local10 |= 0x100;
			}
		}
		if (this.anIntArray65 != null && arg2) {
			@Pc(126) int local126;
			@Pc(137) Class6_Sub2_Sub9 local137;
			if (arg1 < this.anIntArray65.length) {
				local126 = this.anIntArray65[arg1];
				if (local126 != 65535) {
					local137 = Static109.method2198(local126 >> 16);
					local126 &= 0xFFFF;
					if (local137 != null) {
						if (local137.method3163(local126)) {
							local10 |= 0x80;
						}
						if (local137.method3161(local126)) {
							local10 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean43 || Static139.aBoolean207) && arg0 != -1 && this.anIntArray65.length > arg0) {
				local126 = this.anIntArray65[arg0];
				if (local126 != 65535) {
					local137 = Static109.method2198(local126 >> 16);
					local126 &= 0xFFFF;
					if (local137 != null) {
						if (local137.method3163(local126)) {
							local10 |= 0x80;
						}
						if (local137.method3161(local126)) {
							local10 |= 0x100;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIILclient!rc;)Lclient!rc;")
	public Class78 method495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class78 arg4) {
		@Pc(8) int local8 = this.anIntArray66[arg2];
		@Pc(13) int local13 = this.anIntArray64[arg2];
		@Pc(19) Class6_Sub2_Sub9 local19 = Static109.method2198(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg4.method4661((byte) 1, arg3, true);
		}
		@Pc(33) Class6_Sub2_Sub9 local33 = null;
		if ((this.aBoolean43 || Static139.aBoolean207) && arg1 != -1 && this.anIntArray64.length > arg1) {
			@Pc(56) int local56 = this.anIntArray64[arg1];
			local33 = Static109.method2198(local56 >> 16);
			arg1 = local56 & 0xFFFF;
		}
		@Pc(68) Class6_Sub2_Sub9 local68 = null;
		@Pc(70) Class6_Sub2_Sub9 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray65 != null) {
			if (arg2 < this.anIntArray65.length) {
				local72 = this.anIntArray65[arg2];
				if (local72 != 65535) {
					local68 = Static109.method2198(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean43 || Static139.aBoolean207) && arg1 != -1 && arg1 < this.anIntArray65.length) {
				local74 = this.anIntArray65[arg1];
				if (local74 != 65535) {
					local70 = Static109.method2198(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean46) {
			arg3 |= 0x200;
		}
		if (local19.method3163(local23)) {
			arg3 |= 0x80;
		}
		if (local19.method3161(local23)) {
			arg3 |= 0x100;
		}
		if (local68 != null) {
			if (local68.method3163(local72)) {
				arg3 |= 0x80;
			}
			if (local68.method3161(local72)) {
				arg3 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method3163(arg1)) {
				arg3 |= 0x80;
			}
			if (local33.method3161(arg1)) {
				arg3 |= 0x100;
			}
		}
		if (local70 != null) {
			if (local70.method3163(local74)) {
				arg3 |= 0x80;
			}
			if (local70.method3161(local74)) {
				arg3 |= 0x100;
			}
		}
		arg3 |= 0x20;
		@Pc(247) Class78 local247 = arg4.method4661((byte) 1, arg3, true);
		local247.method4628(local19, arg1, local8, this.aBoolean46, local33, 0, arg0 - 1, local23);
		if (local68 != null) {
			local247.method4628(local68, local74, local8, this.aBoolean46, local70, 0, arg0 - 1, local72);
		}
		return local247;
	}
}
