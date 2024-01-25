import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class57 {

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "[Z")
	public boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
	public int anInt1538;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!cu", name = "v", descriptor = "Lclient!sa;")
	public Class298 aClass298_1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
	public int anInt1531 = -1;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	public int anInt1535 = 0;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
	public int anInt1532 = 5;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
	public int anInt1539 = -1;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	public int anInt1537 = 99;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "Z")
	public boolean aBoolean115 = false;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
	public int anInt1541 = -1;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
	public int anInt1540 = -1;

	@OriginalMember(owner = "client!cu", name = "D", descriptor = "I")
	public int anInt1549 = -1;

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
	public int anInt1547 = 2;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZII)I")
	public int method1448(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray132[arg2];
		@Pc(14) Class6_Sub2_Sub19 local14 = null;
		@Pc(30) Class6_Sub2_Sub19 local30 = this.aClass298_1.method6517(local12 >> 16);
		@Pc(34) int local34 = local12 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean114 || Static132.aBoolean213) && arg0 != -1 && arg0 < this.anIntArray132.length) {
			local7 = this.anIntArray132[arg0];
			local14 = this.aClass298_1.method6517(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean113) {
			local5 = 512;
		}
		if (local30.method7102(local34)) {
			local5 |= 0x80;
		}
		if (local30.method7106(local34)) {
			local5 |= 0x100;
		}
		if (local30.method7107(local34)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method7102(local7)) {
				local5 |= 0x80;
			}
			if (local14.method7106(local7)) {
				local5 |= 0x100;
			}
			if (local14.method7107(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray131 != null && arg1) {
			@Pc(146) int local146;
			@Pc(159) Class6_Sub2_Sub19 local159;
			if (this.anIntArray131.length > arg2) {
				local146 = this.anIntArray131[arg2];
				if (local146 != 65535) {
					local159 = this.aClass298_1.method6517(local146 >> 16);
					local146 &= 0xFFFF;
					if (local159 != null) {
						if (local159.method7102(local146)) {
							local5 |= 0x80;
						}
						if (local159.method7106(local146)) {
							local5 |= 0x100;
						}
						if (local159.method7107(local146)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean114 || Static132.aBoolean213) && arg0 != -1 && arg0 < this.anIntArray131.length) {
				local146 = this.anIntArray131[arg0];
				if (local146 != 65535) {
					local159 = this.aClass298_1.method6517(local146 >> 16);
					local146 &= 0xFFFF;
					if (local159 != null) {
						if (local159.method7102(local146)) {
							local5 |= 0x80;
						}
						if (local159.method7106(local146)) {
							local5 |= 0x100;
						}
						if (local159.method7107(local146)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!ji;)V")
	public void method1449(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method6069();
			if (local19 == 0) {
				return;
			}
			this.method1454(local19, arg0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIBILclient!ba;B)Lclient!ba;")
	public Class20 method1451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray130[arg1];
		@Pc(13) int local13 = this.anIntArray132[arg1];
		@Pc(21) Class6_Sub2_Sub19 local21 = this.aClass298_1.method6517(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method7264(arg6, arg4, true);
		}
		@Pc(35) Class6_Sub2_Sub19 local35 = null;
		if ((this.aBoolean114 || Static132.aBoolean213) && arg0 != -1 && arg0 < this.anIntArray132.length) {
			@Pc(58) int local58 = this.anIntArray132[arg0];
			local35 = this.aClass298_1.method6517(local58 >> 16);
			arg0 = local58 & 0xFFFF;
		}
		if (this.aBoolean113) {
			arg4 |= 0x200;
		}
		if (local21.method7102(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method7106(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method7107(local25)) {
			arg4 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method7102(arg0)) {
				arg4 |= 0x80;
			}
			if (local35.method7106(arg0)) {
				arg4 |= 0x100;
			}
			if (local35.method7107(arg0)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(149) Class20 local149 = arg5.method7264(arg6, arg4, true);
		local149.method7262(local21, this.aBoolean113, arg0, local8, local25, local35, arg3 - 1, arg2);
		return local149;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZILclient!ba;II)Lclient!ba;")
	public Class20 method1453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray130[arg1];
		@Pc(13) int local13 = this.anIntArray132[arg1];
		@Pc(21) Class6_Sub2_Sub19 local21 = this.aClass298_1.method6517(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method7264((byte) 1, arg0, true);
		}
		@Pc(35) Class6_Sub2_Sub19 local35 = null;
		if ((this.aBoolean114 || Static132.aBoolean213) && arg4 != -1 && this.anIntArray132.length > arg4) {
			@Pc(54) int local54 = this.anIntArray132[arg4];
			local35 = this.aClass298_1.method6517(local54 >> 16);
			arg4 = local54 & 0xFFFF;
		}
		@Pc(68) Class6_Sub2_Sub19 local68 = null;
		@Pc(70) Class6_Sub2_Sub19 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray131 != null) {
			if (arg1 < this.anIntArray131.length) {
				local72 = this.anIntArray131[arg1];
				if (local72 != 65535) {
					local68 = this.aClass298_1.method6517(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean114 || Static132.aBoolean213) && arg4 != -1 && arg4 < this.anIntArray131.length) {
				local74 = this.anIntArray131[arg4];
				if (local74 != 65535) {
					local70 = this.aClass298_1.method6517(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean113) {
			arg0 |= 0x200;
		}
		if (local21.method7102(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method7106(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method7107(local25)) {
			arg0 |= 0x400;
		}
		if (local68 != null) {
			if (local68.method7102(local72)) {
				arg0 |= 0x80;
			}
			if (local68.method7106(local72)) {
				arg0 |= 0x100;
			}
			if (local68.method7107(local72)) {
				arg0 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method7102(arg4)) {
				arg0 |= 0x80;
			}
			if (local35.method7106(arg4)) {
				arg0 |= 0x100;
			}
			if (local35.method7107(arg4)) {
				arg0 |= 0x400;
			}
		}
		if (local70 != null) {
			if (local70.method7102(local74)) {
				arg0 |= 0x80;
			}
			if (local70.method7106(local74)) {
				arg0 |= 0x100;
			}
			if (local70.method7107(local74)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(271) Class20 local271 = arg2.method7264((byte) 1, arg0, true);
		local271.method7262(local21, this.aBoolean113, arg4, local8, local25, local35, arg3 - 1, 0);
		if (local68 != null) {
			local271.method7262(local68, this.aBoolean113, local74, local8, local72, local70, arg3 - 1, 0);
		}
		return local271;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBLclient!ji;)V")
	private void method1454(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		@Pc(66) int local66;
		@Pc(72) int local72;
		@Pc(87) int local87;
		@Pc(154) int local154;
		if (arg0 == 1) {
			local66 = arg1.method6003();
			this.anIntArray130 = new int[local66];
			for (local72 = 0; local72 < local66; local72++) {
				this.anIntArray130[local72] = arg1.method6003();
			}
			this.anIntArray132 = new int[local66];
			for (local87 = 0; local87 < local66; local87++) {
				this.anIntArray132[local87] = arg1.method6003();
			}
			for (local154 = 0; local154 < local66; local154++) {
				this.anIntArray132[local154] = (arg1.method6003() << 16) + this.anIntArray132[local154];
			}
		} else if (arg0 == 2) {
			this.anInt1549 = arg1.method6003();
		} else if (arg0 == 3) {
			this.aBooleanArray13 = new boolean[256];
			local66 = arg1.method6069();
			for (local72 = 0; local72 < local66; local72++) {
				this.aBooleanArray13[arg1.method6069()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt1532 = arg1.method6069();
		} else if (arg0 == 6) {
			this.anInt1540 = arg1.method6003();
		} else if (arg0 == 7) {
			this.anInt1539 = arg1.method6003();
		} else if (arg0 == 8) {
			this.anInt1537 = arg1.method6069();
		} else if (arg0 == 9) {
			this.anInt1531 = arg1.method6069();
		} else if (arg0 == 10) {
			this.anInt1541 = arg1.method6069();
		} else if (arg0 == 11) {
			this.anInt1547 = arg1.method6069();
		} else if (arg0 == 12) {
			local66 = arg1.method6069();
			this.anIntArray131 = new int[local66];
			for (local72 = 0; local72 < local66; local72++) {
				this.anIntArray131[local72] = arg1.method6003();
			}
			for (local87 = 0; local87 < local66; local87++) {
				this.anIntArray131[local87] = (arg1.method6003() << 16) + this.anIntArray131[local87];
			}
		} else if (arg0 == 13) {
			local66 = arg1.method6003();
			this.anIntArrayArray12 = new int[local66][];
			for (local72 = 0; local72 < local66; local72++) {
				local87 = arg1.method6069();
				if (local87 > 0) {
					this.anIntArrayArray12[local72] = new int[local87];
					this.anIntArrayArray12[local72][0] = arg1.method6031();
					for (local154 = 1; local154 < local87; local154++) {
						this.anIntArrayArray12[local72][local154] = arg1.method6003();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean113 = true;
		} else if (arg0 == 15) {
			this.aBoolean114 = true;
		} else if (arg0 == 16) {
			this.aBoolean112 = true;
		} else if (arg0 == 17) {
			this.anInt1535 = arg1.method6069();
		} else if (arg0 == 18) {
			this.aBoolean115 = true;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
	public void method1455() {
		if (this.anInt1541 == -1) {
			if (this.aBooleanArray13 == null) {
				this.anInt1541 = 0;
			} else {
				this.anInt1541 = 2;
			}
		}
		if (this.anInt1531 != -1) {
			return;
		}
		if (this.aBooleanArray13 == null) {
			this.anInt1531 = 0;
		} else {
			this.anInt1531 = 2;
		}
	}
}
