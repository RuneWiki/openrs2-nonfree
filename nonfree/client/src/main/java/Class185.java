import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class185 {

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	public int anInt4973;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray114;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "[Z")
	public boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!oj;")
	public Class240 aClass240_3;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	private int[] anIntArray281;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	public int anInt4971 = -1;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
	public boolean aBoolean360 = false;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
	public boolean aBoolean363 = false;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public int anInt4980 = -1;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public int anInt4979 = 99;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
	public boolean aBoolean361 = false;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public int anInt4978 = 2;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
	public boolean aBoolean362 = false;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	public int anInt4987 = -1;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	public int anInt4981 = 5;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	public int anInt4985 = -1;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	public int anInt4988 = -1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!np;B)V")
	public void method4375(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5175();
			if (local9 == 0) {
				return;
			}
			this.method4378(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method4377() {
		if (this.anInt4987 == -1) {
			if (this.aBooleanArray15 == null) {
				this.anInt4987 = 0;
			} else {
				this.anInt4987 = 2;
			}
		}
		if (this.anInt4985 != -1) {
			return;
		}
		if (this.aBooleanArray15 == null) {
			this.anInt4985 = 0;
		} else {
			this.anInt4985 = 2;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!np;)V")
	private void method4378(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		@Pc(133) int local133;
		@Pc(139) int local139;
		@Pc(145) int local145;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local133 = arg1.method5198();
			this.anIntArray282 = new int[local133];
			for (local139 = 0; local139 < local133; local139++) {
				this.anIntArray282[local139] = arg1.method5198();
			}
			this.anIntArray280 = new int[local133];
			for (local145 = 0; local145 < local133; local145++) {
				this.anIntArray280[local145] = arg1.method5198();
			}
			for (local164 = 0; local164 < local133; local164++) {
				this.anIntArray280[local164] = (arg1.method5198() << 16) + this.anIntArray280[local164];
			}
		} else if (arg0 == 2) {
			this.anInt4971 = arg1.method5198();
		} else if (arg0 == 3) {
			this.aBooleanArray15 = new boolean[256];
			local133 = arg1.method5175();
			for (local139 = 0; local139 < local133; local139++) {
				this.aBooleanArray15[arg1.method5175()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt4981 = arg1.method5175();
		} else if (arg0 == 6) {
			this.anInt4988 = arg1.method5198();
		} else if (arg0 == 7) {
			this.anInt4980 = arg1.method5198();
		} else if (arg0 == 8) {
			this.anInt4979 = arg1.method5175();
		} else if (arg0 == 9) {
			this.anInt4987 = arg1.method5175();
		} else if (arg0 == 10) {
			this.anInt4985 = arg1.method5175();
		} else if (arg0 == 11) {
			this.anInt4978 = arg1.method5175();
		} else if (arg0 == 12) {
			local133 = arg1.method5175();
			this.anIntArray281 = new int[local133];
			for (local139 = 0; local139 < local133; local139++) {
				this.anIntArray281[local139] = arg1.method5198();
			}
			for (local145 = 0; local145 < local133; local145++) {
				this.anIntArray281[local145] = (arg1.method5198() << 16) + this.anIntArray281[local145];
			}
		} else if (arg0 == 13) {
			local133 = arg1.method5198();
			this.anIntArrayArray114 = new int[local133][];
			for (local139 = 0; local139 < local133; local139++) {
				local145 = arg1.method5175();
				if (local145 > 0) {
					this.anIntArrayArray114[local139] = new int[local145];
					this.anIntArrayArray114[local139][0] = arg1.method5230();
					for (local164 = 1; local164 < local145; local164++) {
						this.anIntArrayArray114[local139][local164] = arg1.method5198();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean361 = true;
		} else if (arg0 == 15) {
			this.aBoolean362 = true;
		} else if (arg0 == 16) {
			this.aBoolean363 = true;
		} else if (arg0 == 18) {
			this.aBoolean360 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIZ)I")
	public int method4379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray280[arg0];
		@Pc(19) Class3_Sub7_Sub6 local19 = null;
		@Pc(27) Class3_Sub7_Sub6 local27 = this.aClass240_3.method5679(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean362 || Static391.aBoolean508) && arg1 != -1 && this.anIntArray280.length > arg1) {
			local12 = this.anIntArray280[arg1];
			local19 = this.aClass240_3.method5679(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean361) {
			local10 = 512;
		}
		if (local27.method2517(local31)) {
			local10 |= 0x80;
		}
		if (local27.method2519(local31)) {
			local10 |= 0x100;
		}
		if (local27.method2516(local31)) {
			local10 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method2517(local12)) {
				local10 |= 0x80;
			}
			if (local19.method2519(local12)) {
				local10 |= 0x100;
			}
			if (local19.method2516(local12)) {
				local10 |= 0x400;
			}
		}
		if (this.anIntArray281 != null && arg2) {
			@Pc(143) int local143;
			@Pc(156) Class3_Sub7_Sub6 local156;
			if (arg0 < this.anIntArray281.length) {
				local143 = this.anIntArray281[arg0];
				if (local143 != 65535) {
					local156 = this.aClass240_3.method5679(local143 >> 16);
					local143 &= 0xFFFF;
					if (local156 != null) {
						if (local156.method2517(local143)) {
							local10 |= 0x80;
						}
						if (local156.method2519(local143)) {
							local10 |= 0x100;
						}
						if (local156.method2516(local143)) {
							local10 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean362 || Static391.aBoolean508) && arg1 != -1 && arg1 < this.anIntArray281.length) {
				local143 = this.anIntArray281[arg1];
				if (local143 != 65535) {
					local156 = this.aClass240_3.method5679(local143 >> 16);
					local143 &= 0xFFFF;
					if (local156 != null) {
						if (local156.method2517(local143)) {
							local10 |= 0x80;
						}
						if (local156.method2519(local143)) {
							local10 |= 0x100;
						}
						if (local156.method2516(local143)) {
							local10 |= 0x400;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BBIILclient!da;III)Lclient!da;")
	public Class60 method4380(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = this.anIntArray282[arg4];
		@Pc(19) int local19 = this.anIntArray280[arg4];
		@Pc(27) Class3_Sub7_Sub6 local27 = this.aClass240_3.method5679(local19 >> 16);
		@Pc(31) int local31 = local19 & 0xFFFF;
		if (local27 == null) {
			return arg3.method7229(arg0, arg6, true);
		}
		@Pc(41) Class3_Sub7_Sub6 local41 = null;
		if ((this.aBoolean362 || Static391.aBoolean508) && arg1 != -1 && arg1 < this.anIntArray280.length) {
			@Pc(59) int local59 = this.anIntArray280[arg1];
			local41 = this.aClass240_3.method5679(local59 >> 16);
			arg1 = local59 & 0xFFFF;
		}
		if (this.aBoolean361) {
			arg6 |= 0x200;
		}
		if (local27.method2517(local31)) {
			arg6 |= 0x80;
		}
		if (local27.method2519(local31)) {
			arg6 |= 0x100;
		}
		if (local27.method2516(local31)) {
			arg6 |= 0x400;
		}
		if (local41 != null) {
			if (local41.method2517(arg1)) {
				arg6 |= 0x80;
			}
			if (local41.method2519(arg1)) {
				arg6 |= 0x100;
			}
			if (local41.method2516(arg1)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(148) Class60 local148 = arg3.method7229(arg0, arg6, true);
		local148.method7226(local31, this.aBoolean361, local41, local27, arg5, arg1, arg2 - 1, local14);
		return local148;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!da;IIB)Lclient!da;")
	public Class60 method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) int local14 = this.anIntArray282[arg1];
		@Pc(19) int local19 = this.anIntArray280[arg1];
		@Pc(27) Class3_Sub7_Sub6 local27 = this.aClass240_3.method5679(local19 >> 16);
		@Pc(31) int local31 = local19 & 0xFFFF;
		if (local27 == null) {
			return arg2.method7229((byte) 1, arg4, true);
		}
		@Pc(41) Class3_Sub7_Sub6 local41 = null;
		if ((this.aBoolean362 || Static391.aBoolean508) && arg3 != -1 && this.anIntArray280.length > arg3) {
			@Pc(64) int local64 = this.anIntArray280[arg3];
			local41 = this.aClass240_3.method5679(local64 >> 16);
			arg3 = local64 & 0xFFFF;
		}
		@Pc(78) Class3_Sub7_Sub6 local78 = null;
		@Pc(80) Class3_Sub7_Sub6 local80 = null;
		@Pc(82) int local82 = 0;
		@Pc(84) int local84 = 0;
		if (this.anIntArray281 != null) {
			if (arg1 < this.anIntArray281.length) {
				local82 = this.anIntArray281[arg1];
				if (local82 != 65535) {
					local78 = this.aClass240_3.method5679(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
			if ((this.aBoolean362 || Static391.aBoolean508) && arg3 != -1 && arg3 < this.anIntArray281.length) {
				local84 = this.anIntArray281[arg3];
				if (local84 != 65535) {
					local80 = this.aClass240_3.method5679(local84 >> 16);
					local84 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean361) {
			arg4 |= 0x200;
		}
		if (local27.method2517(local31)) {
			arg4 |= 0x80;
		}
		if (local27.method2519(local31)) {
			arg4 |= 0x100;
		}
		if (local27.method2516(local31)) {
			arg4 |= 0x400;
		}
		if (local78 != null) {
			if (local78.method2517(local82)) {
				arg4 |= 0x80;
			}
			if (local78.method2519(local82)) {
				arg4 |= 0x100;
			}
			if (local78.method2516(local82)) {
				arg4 |= 0x400;
			}
		}
		if (local41 != null) {
			if (local41.method2517(arg3)) {
				arg4 |= 0x80;
			}
			if (local41.method2519(arg3)) {
				arg4 |= 0x100;
			}
			if (local41.method2516(arg3)) {
				arg4 |= 0x400;
			}
		}
		if (local80 != null) {
			if (local80.method2517(local84)) {
				arg4 |= 0x80;
			}
			if (local80.method2519(local84)) {
				arg4 |= 0x100;
			}
			if (local80.method2516(local84)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(287) Class60 local287 = arg2.method7229((byte) 1, arg4, true);
		local287.method7226(local31, this.aBoolean361, local41, local27, 0, arg3, arg0 - 1, local14);
		if (local78 != null) {
			local287.method7226(local82, this.aBoolean361, local80, local78, 0, local84, arg0 - 1, local14);
		}
		return local287;
	}
}
