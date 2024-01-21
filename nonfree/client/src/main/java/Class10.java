import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class10 {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
	public boolean aBoolean13;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!bi;Lclient!bi;B)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub4 arg2, @OriginalArg(3) Class2_Sub2_Sub4 arg3) {
		if (this.anInt259 != -1) {
			return Static169.method2802(this.anInt259).method2479(arg2, arg0, arg1, arg3);
		}
		@Pc(26) int[] local26 = this.anIntArray17;
		@Pc(29) long local29 = this.aLong16;
		if (arg2 != null && (arg2.anInt399 >= 0 || arg2.anInt408 >= 0)) {
			local26 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local26[local45] = this.anIntArray17[local45];
			}
			if (arg2.anInt399 >= 0) {
				if (arg2.anInt399 == 65535) {
					local26[5] = 0;
					local29 ^= 0xFFFFFFFF00000000L;
				} else {
					local26[5] = arg2.anInt399 | 0x40000000;
					local29 ^= (long) local26[5] << 32;
				}
			}
			if (arg2.anInt408 >= 0) {
				if (arg2.anInt408 == 65535) {
					local26[3] = 0;
					local29 ^= 0xFFFFFFFFL;
				} else {
					local26[3] = arg2.anInt408 | 0x40000000;
					local29 ^= local26[3];
				}
			}
		}
		@Pc(139) Class2_Sub2_Sub3_Sub4 local139 = (Class2_Sub2_Sub3_Sub4) Static170.aClass74_91.method2345(local29);
		if (local139 == null) {
			@Pc(143) boolean local143 = false;
			for (@Pc(145) int local145 = 0; local145 < 12; local145++) {
				@Pc(151) int local151 = local26[local145];
				if ((local151 & 0x40000000) == 0) {
					if ((local151 & Integer.MIN_VALUE) != 0 && !Static6.method106(local151 & 0x3FFFFFFF).method1178()) {
						local143 = true;
					}
				} else if (!Static113.method1913(local151 & 0x3FFFFFFF).method1241(this.aBoolean13)) {
					local143 = true;
				}
			}
			if (local143) {
				if (this.aLong17 != -1L) {
					local139 = (Class2_Sub2_Sub3_Sub4) Static170.aClass74_91.method2345(this.aLong17);
				}
				if (local139 == null) {
					return null;
				}
			}
			if (local139 == null) {
				@Pc(216) int local216 = 0;
				@Pc(219) Class2_Sub2_Sub3_Sub6[] local219 = new Class2_Sub2_Sub3_Sub6[12];
				for (@Pc(221) int local221 = 0; local221 < 12; local221++) {
					@Pc(227) int local227 = local26[local221];
					@Pc(249) Class2_Sub2_Sub3_Sub6 local249;
					if ((local227 & 0x40000000) != 0) {
						local249 = Static113.method1913(local227 & 0x3FFFFFFF).method1252(this.aBoolean13);
						if (local249 != null) {
							local219[local216++] = local249;
						}
					} else if ((local227 & Integer.MIN_VALUE) != 0) {
						local249 = Static6.method106(local227 & 0x3FFFFFFF).method1176();
						if (local249 != null) {
							local219[local216++] = local249;
						}
					}
				}
				@Pc(289) Class2_Sub2_Sub3_Sub6 local289 = new Class2_Sub2_Sub3_Sub6(local219, local216);
				for (@Pc(291) int local291 = 0; local291 < 5; local291++) {
					if (this.anIntArray18[local291] < Static75.aShortArrayArray3[local291].length) {
						local289.method2025(Static146.aShortArray32[local291], Static75.aShortArrayArray3[local291][this.anIntArray18[local291]]);
					}
					if (this.anIntArray18[local291] < Static36.aShortArrayArray2[local291].length) {
						local289.method2025(Static78.aShortArray17[local291], Static36.aShortArrayArray2[local291][this.anIntArray18[local291]]);
					}
				}
				local139 = local289.method2027(64, 850, -30, -50, -30, true);
				Static170.aClass74_91.method2341(local29, local139);
				this.aLong17 = local29;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local139;
		}
		@Pc(379) Class2_Sub2_Sub3_Sub4 local379;
		if (arg2 != null && arg3 != null) {
			local379 = arg2.method361(arg3, arg1, local139, arg0);
		} else if (arg2 == null) {
			local379 = arg3.method369(arg0, local139);
		} else {
			local379 = arg2.method369(arg1, local139);
		}
		return local379;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)V")
	public void method209(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean13) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray17[Static30.anIntArray61[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 &= 0x3FFFFFFF;
		@Pc(59) Class2_Sub2_Sub8 local59;
		do {
			if (arg1) {
				local19++;
				if (Static69.anInt1430 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static69.anInt1430 - 1;
				}
			}
			local59 = Static6.method106(local19);
		} while (local59 == null || local59.aBoolean60 || arg0 + (this.aBoolean13 ? 7 : 0) != local59.anInt1462);
		this.anIntArray17[Static30.anIntArray61[arg0]] = local19 | Integer.MIN_VALUE;
		this.method211();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	public void method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray18[arg0] = arg1;
		this.method211();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	private void method211() {
		@Pc(8) long local8 = this.aLong16;
		this.aLong16 = -1L;
		@Pc(13) long[] local13 = Class2_Sub2_Sub12.aLongArray14;
		for (@Pc(19) int local19 = 0; local19 < 12; local19++) {
			this.aLong16 = this.aLong16 >>> 8 ^ local13[(int) ((this.aLong16 ^ (long) (this.anIntArray17[local19] >> 24)) & 0xFFL)];
			this.aLong16 = local13[(int) ((this.aLong16 ^ (long) (this.anIntArray17[local19] >> 16)) & 0xFFL)] ^ this.aLong16 >>> 8;
			this.aLong16 = local13[(int) (((long) (this.anIntArray17[local19] >> 8) ^ this.aLong16) & 0xFFL)] ^ this.aLong16 >>> 8;
			this.aLong16 = this.aLong16 >>> 8 ^ local13[(int) ((this.aLong16 ^ (long) this.anIntArray17[local19]) & 0xFFL)];
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong16 = this.aLong16 >>> 8 ^ local13[(int) ((this.aLong16 ^ (long) this.anIntArray18[local113]) & 0xFFL)];
		}
		this.aLong16 = this.aLong16 >>> 8 ^ local13[(int) (((long) (this.aBoolean13 ? 1 : 0) ^ this.aLong16) & 0xFFL)];
		if (local8 != 0L && this.aLong16 != local8) {
			Static170.aClass74_91.method2342(local8);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ[IB[I)V")
	public void method212(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static69.anInt1430; local16++) {
					@Pc(22) Class2_Sub2_Sub8 local22 = Static6.method106(local16);
					if (local22 != null && !local22.aBoolean60 && local12 + (arg1 ? 7 : 0) == local22.anInt1462) {
						arg2[Static30.anIntArray61[local12]] = local16 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt259 = arg0;
		this.aBoolean13 = arg1;
		this.anIntArray18 = arg3;
		this.anIntArray17 = arg2;
		this.method211();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
	public void method213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static30.anIntArray61[arg1];
		if (this.anIntArray17[local11] != 0 && Static6.method106(arg0) != null) {
			this.anIntArray17[local11] = Integer.MIN_VALUE | arg0;
			this.method211();
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIZ)V")
	public void method215(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = this.anIntArray18[arg0];
		if (arg1) {
			local15++;
			if (Static75.aShortArrayArray3[arg0].length <= local15) {
				local15 = 0;
			}
		} else {
			local15--;
			if (local15 < 0) {
				local15 = Static75.aShortArrayArray3[arg0].length - 1;
			}
		}
		this.anIntArray18[arg0] = local15;
		this.method211();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ja;)V")
	public void method216(@OriginalArg(1) Class2_Sub13 arg0) {
		arg0.method2932(this.aBoolean13 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray17[Static30.anIntArray61[local12]];
			if ((Integer.MIN_VALUE & local21) == 0) {
				arg0.method2921(65535);
			} else {
				arg0.method2921(local21 & 0x3FFFFFFF);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method2932(this.anIntArray18[local21]);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!bi;I)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method218(@OriginalArg(1) Class2_Sub2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt259 != -1) {
			return Static169.method2802(this.anInt259).method2471(arg1, arg0);
		}
		@Pc(28) Class2_Sub2_Sub3_Sub4 local28 = (Class2_Sub2_Sub3_Sub4) Static6.aClass74_5.method2345(this.aLong16);
		if (local28 == null) {
			@Pc(32) boolean local32 = false;
			for (@Pc(34) int local34 = 0; local34 < 12; local34++) {
				@Pc(41) int local41 = this.anIntArray17[local34];
				if ((local41 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local41) != 0 && !Static6.method106(local41 & 0x3FFFFFFF).method1180()) {
						local32 = true;
					}
				} else if (!Static113.method1913(local41 & 0x3FFFFFFF).method1243(this.aBoolean13)) {
					local32 = true;
				}
			}
			if (local32) {
				return null;
			}
			@Pc(89) Class2_Sub2_Sub3_Sub6[] local89 = new Class2_Sub2_Sub3_Sub6[12];
			@Pc(91) int local91 = 0;
			for (@Pc(93) int local93 = 0; local93 < 12; local93++) {
				@Pc(100) int local100 = this.anIntArray17[local93];
				@Pc(116) Class2_Sub2_Sub3_Sub6 local116;
				if ((local100 & 0x40000000) != 0) {
					local116 = Static113.method1913(local100 & 0x3FFFFFFF).method1253(this.aBoolean13);
					if (local116 != null) {
						local89[local91++] = local116;
					}
				} else if ((local100 & Integer.MIN_VALUE) != 0) {
					local116 = Static6.method106(local100 & 0x3FFFFFFF).method1175();
					if (local116 != null) {
						local89[local91++] = local116;
					}
				}
			}
			@Pc(156) Class2_Sub2_Sub3_Sub6 local156 = new Class2_Sub2_Sub3_Sub6(local89, local91);
			for (@Pc(158) int local158 = 0; local158 < 5; local158++) {
				if (this.anIntArray18[local158] < Static75.aShortArrayArray3[local158].length) {
					local156.method2025(Static146.aShortArray32[local158], Static75.aShortArrayArray3[local158][this.anIntArray18[local158]]);
				}
				if (this.anIntArray18[local158] < Static36.aShortArrayArray2[local158].length) {
					local156.method2025(Static78.aShortArray17[local158], Static36.aShortArrayArray2[local158][this.anIntArray18[local158]]);
				}
			}
			local28 = local156.method2027(64, 768, -50, -10, -50, true);
			Static6.aClass74_5.method2341(this.aLong16, local28);
		}
		if (arg0 != null) {
			local28 = arg0.method363(local28, arg1);
		}
		return local28;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
	public int method219() {
		return this.anInt259 == -1 ? this.anIntArray17[1] + (this.anIntArray17[11] << 5) + (this.anIntArray17[0] << 15) + (this.anIntArray18[4] << 20) + (this.anIntArray18[0] << 25) + (this.anIntArray17[8] << 10) : Static169.method2802(this.anInt259).anInt3219 + 305419896;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V")
	public void method220(@OriginalArg(1) boolean arg0) {
		this.aBoolean13 = arg0;
		this.method211();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZB)V")
	public void method221(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean13 != arg0) {
			this.method212(-1, arg0, null, this.anIntArray18);
		}
	}
}
