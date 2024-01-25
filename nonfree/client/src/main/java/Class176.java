import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class176 {

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "[I")
	public int[] anIntArray432;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "[I")
	public int[] anIntArray433;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "Lclient!jh;")
	public Class152 aClass152_2;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "[Z")
	public boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
	public int anInt5286;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public int anInt5271 = 2;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public int anInt5280 = -1;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public int anInt5277 = 5;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public int anInt5279 = -1;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	public int anInt5284 = -1;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "Z")
	public boolean aBoolean395 = false;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
	public boolean aBoolean394 = false;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
	public int anInt5288 = -1;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
	public int anInt5282 = 0;

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
	public int anInt5287 = 99;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
	public int anInt5285 = -1;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZLclient!os;)V")
	private void method4866(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		@Pc(78) int local78;
		@Pc(84) int local84;
		@Pc(99) int local99;
		@Pc(207) int local207;
		if (arg0 == 1) {
			local78 = arg1.method4494();
			this.anIntArray433 = new int[local78];
			for (local84 = 0; local84 < local78; local84++) {
				this.anIntArray433[local84] = arg1.method4494();
			}
			this.anIntArray432 = new int[local78];
			for (local99 = 0; local99 < local78; local99++) {
				this.anIntArray432[local99] = arg1.method4494();
			}
			for (local207 = 0; local207 < local78; local207++) {
				this.anIntArray432[local207] = (arg1.method4494() << 16) + this.anIntArray432[local207];
			}
		} else if (arg0 == 2) {
			this.anInt5288 = arg1.method4494();
		} else if (arg0 == 3) {
			this.aBooleanArray20 = new boolean[256];
			local78 = arg1.method4487();
			for (local84 = 0; local84 < local78; local84++) {
				this.aBooleanArray20[arg1.method4487()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt5277 = arg1.method4487();
		} else if (arg0 == 6) {
			this.anInt5279 = arg1.method4494();
		} else if (arg0 == 7) {
			this.anInt5284 = arg1.method4494();
		} else if (arg0 == 8) {
			this.anInt5287 = arg1.method4487();
		} else if (arg0 == 9) {
			this.anInt5280 = arg1.method4487();
		} else if (arg0 == 10) {
			this.anInt5285 = arg1.method4487();
		} else if (arg0 == 11) {
			this.anInt5271 = arg1.method4487();
		} else if (arg0 == 12) {
			local78 = arg1.method4487();
			this.anIntArray434 = new int[local78];
			for (local84 = 0; local84 < local78; local84++) {
				this.anIntArray434[local84] = arg1.method4494();
			}
			for (local99 = 0; local99 < local78; local99++) {
				this.anIntArray434[local99] = (arg1.method4494() << 16) + this.anIntArray434[local99];
			}
		} else if (arg0 == 13) {
			local78 = arg1.method4494();
			this.anIntArrayArray63 = new int[local78][];
			for (local84 = 0; local84 < local78; local84++) {
				local99 = arg1.method4487();
				if (local99 > 0) {
					this.anIntArrayArray63[local84] = new int[local99];
					this.anIntArrayArray63[local84][0] = arg1.method4486();
					for (local207 = 1; local207 < local99; local207++) {
						this.anIntArrayArray63[local84][local207] = arg1.method4494();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean394 = true;
		} else if (arg0 == 15) {
			this.aBoolean395 = true;
		} else if (arg0 == 16) {
			this.aBoolean396 = true;
		} else if (arg0 == 17) {
			this.anInt5282 = arg1.method4487();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public void method4867() {
		if (this.anInt5280 == -1) {
			if (this.aBooleanArray20 == null) {
				this.anInt5280 = 0;
			} else {
				this.anInt5280 = 2;
			}
		}
		if (this.anInt5285 != -1) {
			return;
		}
		if (this.aBooleanArray20 == null) {
			this.anInt5285 = 0;
		} else {
			this.anInt5285 = 2;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZBII)I")
	public int method4868(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray432[arg2];
		@Pc(14) Class1_Sub2_Sub17 local14 = null;
		@Pc(22) Class1_Sub2_Sub17 local22 = this.aClass152_2.method4041(local12 >> 16);
		@Pc(31) int local31 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean395 || Static294.aBoolean419) && arg1 != -1 && arg1 < this.anIntArray432.length) {
			local7 = this.anIntArray432[arg1];
			local14 = this.aClass152_2.method4041(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean394) {
			local5 = 512;
		}
		if (local22.method6818(local31)) {
			local5 |= 0x80;
		}
		if (local22.method6820(local31)) {
			local5 |= 0x100;
		}
		if (local22.method6816(local31)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method6818(local7)) {
				local5 |= 0x80;
			}
			if (local14.method6820(local7)) {
				local5 |= 0x100;
			}
			if (local14.method6816(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray434 != null && arg0) {
			@Pc(145) int local145;
			@Pc(158) Class1_Sub2_Sub17 local158;
			if (this.anIntArray434.length > arg2) {
				local145 = this.anIntArray434[arg2];
				if (local145 != 65535) {
					local158 = this.aClass152_2.method4041(local145 >> 16);
					local145 &= 0xFFFF;
					if (local158 != null) {
						if (local158.method6818(local145)) {
							local5 |= 0x80;
						}
						if (local158.method6820(local145)) {
							local5 |= 0x100;
						}
						if (local158.method6816(local145)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean395 || Static294.aBoolean419) && arg1 != -1 && arg1 < this.anIntArray434.length) {
				local145 = this.anIntArray434[arg1];
				if (local145 != 65535) {
					local158 = this.aClass152_2.method4041(local145 >> 16);
					local145 &= 0xFFFF;
					if (local158 != null) {
						if (local158.method6818(local145)) {
							local5 |= 0x80;
						}
						if (local158.method6820(local145)) {
							local5 |= 0x100;
						}
						if (local158.method6816(local145)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!r;III)Lclient!r;")
	public Class97 method4870(@OriginalArg(1) int arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray433[arg4];
		@Pc(13) int local13 = this.anIntArray432[arg4];
		@Pc(21) Class1_Sub2_Sub17 local21 = this.aClass152_2.method4041(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method6770((byte) 1, arg2, true);
		}
		@Pc(35) Class1_Sub2_Sub17 local35 = null;
		if ((this.aBoolean395 || Static294.aBoolean419) && arg0 != -1 && this.anIntArray432.length > arg0) {
			@Pc(58) int local58 = this.anIntArray432[arg0];
			local35 = this.aClass152_2.method4041(local58 >> 16);
			arg0 = local58 & 0xFFFF;
		}
		@Pc(72) Class1_Sub2_Sub17 local72 = null;
		@Pc(74) Class1_Sub2_Sub17 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray434 != null) {
			if (arg4 < this.anIntArray434.length) {
				local76 = this.anIntArray434[arg4];
				if (local76 != 65535) {
					local72 = this.aClass152_2.method4041(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean395 || Static294.aBoolean419) && arg0 != -1 && arg0 < this.anIntArray434.length) {
				local78 = this.anIntArray434[arg0];
				if (local78 != 65535) {
					local74 = this.aClass152_2.method4041(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean394) {
			arg2 |= 0x200;
		}
		if (local21.method6818(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method6820(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method6816(local25)) {
			arg2 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method6818(local76)) {
				arg2 |= 0x80;
			}
			if (local72.method6820(local76)) {
				arg2 |= 0x100;
			}
			if (local72.method6816(local76)) {
				arg2 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method6818(arg0)) {
				arg2 |= 0x80;
			}
			if (local35.method6820(arg0)) {
				arg2 |= 0x100;
			}
			if (local35.method6816(arg0)) {
				arg2 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method6818(local78)) {
				arg2 |= 0x80;
			}
			if (local74.method6820(local78)) {
				arg2 |= 0x100;
			}
			if (local74.method6816(local78)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(278) Class97 local278 = arg1.method6770((byte) 1, arg2, true);
		local278.method6772(local35, local25, 0, this.aBoolean394, arg0, local21, arg3 - 1, local8);
		if (local72 != null) {
			local278.method6772(local74, local76, 0, this.aBoolean394, local78, local72, arg3 - 1, local8);
		}
		return local278;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BIILclient!r;IIIB)Lclient!r;")
	public Class97 method4872(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class97 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = this.anIntArray433[arg5];
		@Pc(13) int local13 = this.anIntArray432[arg5];
		@Pc(21) Class1_Sub2_Sub17 local21 = this.aClass152_2.method4041(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method6770(arg0, arg2, true);
		}
		@Pc(35) Class1_Sub2_Sub17 local35 = null;
		if ((this.aBoolean395 || Static294.aBoolean419) && arg1 != -1 && this.anIntArray432.length > arg1) {
			@Pc(58) int local58 = this.anIntArray432[arg1];
			local35 = this.aClass152_2.method4041(local58 >> 16);
			arg1 = local58 & 0xFFFF;
		}
		if (this.aBoolean394) {
			arg2 |= 0x200;
		}
		if (local21.method6818(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method6820(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method6816(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method6818(arg1)) {
				arg2 |= 0x80;
			}
			if (local35.method6820(arg1)) {
				arg2 |= 0x100;
			}
			if (local35.method6816(arg1)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(151) Class97 local151 = arg3.method6770(arg0, arg2, true);
		local151.method6772(local35, local25, arg4, this.aBoolean394, arg1, local21, arg6 - 1, local8);
		return local151;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!os;B)V")
	public void method4874(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4487();
			if (local13 == 0) {
				return;
			}
			this.method4866(local13, arg0);
		}
	}
}
