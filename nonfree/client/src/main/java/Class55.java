import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class55 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
	public boolean aBoolean102;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	private int anInt2518;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZII)V")
	public void method1699(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean102) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray213[Static130.anIntArray276[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(61) Class2_Sub3_Sub4 local61;
		do {
			if (arg0) {
				local21++;
				if (local21 >= Static159.anInt3748) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static159.anInt3748 - 1;
				}
			}
			local61 = Static74.method1148(local21);
		} while (local61 == null || local61.aBoolean32 || local61.anInt762 != (this.aBoolean102 ? 7 : 0) + arg1);
		this.anIntArray213[Static130.anIntArray276[arg1]] = local21 + 256;
		this.method1701();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIZ)V")
	public void method1700(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = this.anIntArray214[arg0];
		if (arg1) {
			local12++;
			if (Static18.aShortArrayArray1[arg0].length <= local12) {
				local12 = 0;
			}
		} else {
			local12--;
			if (local12 < 0) {
				local12 = Static18.aShortArrayArray1[arg0].length - 1;
			}
		}
		this.anIntArray214[arg0] = local12;
		this.method1701();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	private void method1701() {
		@Pc(4) long local4 = this.aLong143;
		@Pc(13) int local13 = this.anIntArray213[5];
		@Pc(18) int local18 = this.anIntArray213[9];
		this.anIntArray213[5] = local18;
		this.anIntArray213[9] = local13;
		this.aLong143 = 0L;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong143 <<= 0x4;
			if (this.anIntArray213[local33] >= 256) {
				this.aLong143 += this.anIntArray213[local33] - 256;
			}
		}
		if (this.anIntArray213[0] >= 256) {
			this.aLong143 += this.anIntArray213[0] - 256 >> 4;
		}
		if (this.anIntArray213[1] >= 256) {
			this.aLong143 += this.anIntArray213[1] - 256 >> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong143 <<= 0x3;
			this.aLong143 += this.anIntArray214[local109];
		}
		this.anIntArray213[5] = local13;
		this.aLong143 <<= 0x1;
		this.anIntArray213[9] = local18;
		this.aLong143 += this.aBoolean102 ? 1 : 0;
		if (local4 != 0L && local4 != this.aLong143) {
			Static170.aClass17_28.method512(local4);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZB)V")
	public void method1702(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean102 != arg0) {
			this.method1703(-1, null, this.anIntArray214, arg0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[IB[IZ)V")
	public void method1703(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static159.anInt3748; local16++) {
					@Pc(22) Class2_Sub3_Sub4 local22 = Static74.method1148(local16);
					if (local22 != null && !local22.aBoolean32 && local12 + (arg3 ? 7 : 0) == local22.anInt762) {
						arg1[Static130.anIntArray276[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray213 = arg1;
		this.aBoolean102 = arg3;
		this.anInt2518 = arg0;
		this.anIntArray214 = arg2;
		this.method1701();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!ic;Lclient!ic;ZII)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1704(@OriginalArg(0) Class2_Sub3_Sub8 arg0, @OriginalArg(1) Class2_Sub3_Sub8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt2518 != -1) {
			return Static116.method1867(this.anInt2518).method2650(arg0, arg2, arg1, arg3);
		}
		@Pc(29) long local29 = this.aLong143;
		@Pc(32) int[] local32 = this.anIntArray213;
		if (arg1 != null && (arg1.anInt1684 >= 0 || arg1.anInt1693 >= 0)) {
			local32 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local32[local51] = this.anIntArray213[local51];
			}
			if (arg1.anInt1684 >= 0) {
				local29 += arg1.anInt1684 - this.anIntArray213[5] << 8;
				local32[5] = arg1.anInt1684;
			}
			if (arg1.anInt1693 >= 0) {
				local29 += arg1.anInt1693 - this.anIntArray213[3] << 16;
				local32[3] = arg1.anInt1693;
			}
		}
		@Pc(119) Class2_Sub3_Sub5_Sub7 local119 = (Class2_Sub3_Sub5_Sub7) Static170.aClass17_28.method505(local29);
		if (local119 == null) {
			@Pc(123) boolean local123 = false;
			for (@Pc(125) int local125 = 0; local125 < 12; local125++) {
				@Pc(131) int local131 = local32[local125];
				if (local131 >= 256 && local131 < 512 && !Static74.method1148(local131 - 256).method534()) {
					local123 = true;
				}
				if (local131 >= 512 && !Static92.method1502(local131 - 512).method1326(this.aBoolean102)) {
					local123 = true;
				}
			}
			if (local123) {
				if (this.aLong142 != -1L) {
					local119 = (Class2_Sub3_Sub5_Sub7) Static170.aClass17_28.method505(this.aLong142);
				}
				if (local119 == null) {
					return null;
				}
			}
			if (local119 == null) {
				@Pc(193) Class2_Sub3_Sub5_Sub3[] local193 = new Class2_Sub3_Sub5_Sub3[12];
				@Pc(195) int local195 = 0;
				for (@Pc(197) int local197 = 0; local197 < 12; local197++) {
					@Pc(203) int local203 = local32[local197];
					@Pc(219) Class2_Sub3_Sub5_Sub3 local219;
					if (local203 >= 256 && local203 < 512) {
						local219 = Static74.method1148(local203 - 256).method535();
						if (local219 != null) {
							local193[local195++] = local219;
						}
					}
					if (local203 >= 512) {
						local219 = Static92.method1502(local203 - 512).method1324(this.aBoolean102);
						if (local219 != null) {
							local193[local195++] = local219;
						}
					}
				}
				@Pc(260) Class2_Sub3_Sub5_Sub3 local260 = new Class2_Sub3_Sub5_Sub3(local193, local195);
				for (@Pc(262) int local262 = 0; local262 < 5; local262++) {
					if (Static18.aShortArrayArray1[local262].length > this.anIntArray214[local262]) {
						local260.method1644(Static81.aShortArray10[local262], Static18.aShortArrayArray1[local262][this.anIntArray214[local262]]);
					}
					if (this.anIntArray214[local262] < Static154.aShortArrayArray6[local262].length) {
						local260.method1644(Static162.aShortArray32[local262], Static154.aShortArrayArray6[local262][this.anIntArray214[local262]]);
					}
				}
				local119 = local260.method1642(64, 850, -30, -50, -30, true);
				Static170.aClass17_28.method508(local29, local119);
				this.aLong142 = local29;
			}
		}
		if (arg1 == null && arg0 == null) {
			return local119;
		}
		@Pc(354) Class2_Sub3_Sub5_Sub7 local354;
		if (arg1 != null && arg0 != null) {
			local354 = arg1.method1072(local119, arg0, arg3, arg2);
		} else if (arg1 == null) {
			local354 = arg0.method1073(local119, arg3);
		} else {
			local354 = arg1.method1073(local119, arg2);
		}
		return local354;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!me;I)V")
	public void method1708(@OriginalArg(0) Class2_Sub13 arg0) {
		arg0.method1416(this.aBoolean102 ? 1 : 0);
		@Pc(29) int local29;
		for (@Pc(20) int local20 = 0; local20 < 7; local20++) {
			local29 = this.anIntArray213[Static130.anIntArray276[local20]];
			if (local29 == 0) {
				arg0.method1416(-1);
			} else {
				arg0.method1416(local29 - 256);
			}
		}
		for (local29 = 0; local29 < 5; local29++) {
			arg0.method1416(this.anIntArray214[local29]);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!ic;)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1710(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3_Sub8 arg1) {
		if (this.anInt2518 != -1) {
			return Static116.method1867(this.anInt2518).method2648(arg1, arg0);
		}
		@Pc(31) Class2_Sub3_Sub5_Sub7 local31 = (Class2_Sub3_Sub5_Sub7) Static92.aClass17_13.method505(this.aLong143);
		if (local31 == null) {
			@Pc(35) boolean local35 = false;
			for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
				@Pc(44) int local44 = this.anIntArray213[local37];
				if (local44 >= 256 && local44 < 512 && !Static74.method1148(local44 - 256).method537()) {
					local35 = true;
				}
				if (local44 >= 512 && !Static92.method1502(local44 - 512).method1314(this.aBoolean102)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(92) Class2_Sub3_Sub5_Sub3[] local92 = new Class2_Sub3_Sub5_Sub3[12];
			@Pc(94) int local94 = 0;
			for (@Pc(96) int local96 = 0; local96 < 12; local96++) {
				@Pc(103) int local103 = this.anIntArray213[local96];
				@Pc(121) Class2_Sub3_Sub5_Sub3 local121;
				if (local103 >= 256 && local103 < 512) {
					local121 = Static74.method1148(local103 - 256).method532();
					if (local121 != null) {
						local92[local94++] = local121;
					}
				}
				if (local103 >= 512) {
					local121 = Static92.method1502(local103 - 512).method1327(this.aBoolean102);
					if (local121 != null) {
						local92[local94++] = local121;
					}
				}
			}
			@Pc(166) Class2_Sub3_Sub5_Sub3 local166 = new Class2_Sub3_Sub5_Sub3(local92, local94);
			for (@Pc(168) int local168 = 0; local168 < 5; local168++) {
				if (this.anIntArray214[local168] < Static18.aShortArrayArray1[local168].length) {
					local166.method1644(Static81.aShortArray10[local168], Static18.aShortArrayArray1[local168][this.anIntArray214[local168]]);
				}
				if (Static154.aShortArrayArray6[local168].length > this.anIntArray214[local168]) {
					local166.method1644(Static162.aShortArray32[local168], Static154.aShortArrayArray6[local168][this.anIntArray214[local168]]);
				}
			}
			local31 = local166.method1642(64, 768, -50, -10, -50, true);
			Static92.aClass17_13.method508(this.aLong143, local31);
		}
		if (arg1 != null) {
			local31 = arg1.method1074(local31, arg0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
	public int method1711() {
		return this.anInt2518 == -1 ? this.anIntArray213[1] + (this.anIntArray213[11] << 5) + (this.anIntArray213[8] << 10) + (this.anIntArray214[0] << 25) + (this.anIntArray214[4] << 20) + (this.anIntArray213[0] << 15) : Static116.method1867(this.anInt2518).anInt3918 + 305419896;
	}
}
