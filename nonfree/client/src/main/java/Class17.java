import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class17 {

	@OriginalMember(owner = "client!aja", name = "k", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!aja", name = "q", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!aja", name = "g", descriptor = "Lclient!iha;")
	public Class172 aClass172_1;

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!aja", name = "x", descriptor = "I")
	public int anInt247;

	@OriginalMember(owner = "client!aja", name = "n", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
	private int anInt235 = -1;

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
	private int anInt241 = 0;

	@OriginalMember(owner = "client!aja", name = "t", descriptor = "I")
	private int anInt248 = 128;

	@OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
	private int anInt243 = 0;

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
	private int anInt245 = 0;

	@OriginalMember(owner = "client!aja", name = "m", descriptor = "I")
	public int anInt251 = -1;

	@OriginalMember(owner = "client!aja", name = "l", descriptor = "I")
	private int anInt240 = 128;

	@OriginalMember(owner = "client!aja", name = "p", descriptor = "B")
	public byte aByte3 = 0;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(BLclient!s;Lclient!qu;Lclient!s;ZIILclient!ha;IIB)Lclient!ka;")
	public Class54 method218(@OriginalArg(0) byte arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class75 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(18) boolean local18 = arg4 & this.aByte3 != 0;
		@Pc(20) int local20 = arg9;
		if (arg2 != null) {
			local20 = arg9 | arg2.method9025();
		}
		if (local18) {
			local20 |= this.aByte3 == 3 ? 7 : 2;
		}
		if (this.anInt248 != 128) {
			local20 |= 0x2;
		}
		if (this.anInt240 != 128 || this.anInt245 != 0) {
			local20 |= 0x5;
		}
		@Pc(72) Class359 local72 = this.aClass172_1.aClass359_36;
		@Pc(92) Class54 local92;
		synchronized (this.aClass172_1.aClass359_36) {
			local92 = (Class54) this.aClass172_1.aClass359_36.method8517((long) (this.anInt247 |= arg7.anInt7475 << 29));
		}
		if (local92 == null || arg7.method6712(local92.ua(), local20) != 0) {
			if (local92 != null) {
				local20 = arg7.method6686(local20, local92.ua());
			}
			@Pc(123) int local123 = local20;
			if (this.aShortArray10 != null) {
				local123 = local20 | 0x4000;
			}
			if (this.aShortArray8 != null) {
				local123 |= 0x8000;
			}
			@Pc(146) Class316 local146 = Static347.method5332(this.anInt236, this.aClass172_1.aClass223_59);
			if (local146 == null) {
				return null;
			}
			if (local146.anInt8613 < 13) {
				local146.method7538();
			}
			local92 = arg7.method6688(local146, local123, this.aClass172_1.anInt4916, this.anInt241 + 64, this.anInt243 + 850);
			@Pc(182) int local182;
			if (this.aShortArray10 != null) {
				for (local182 = 0; local182 < this.aShortArray10.length; local182++) {
					local92.ia(this.aShortArray10[local182], this.aShortArray9[local182]);
				}
			}
			if (this.aShortArray8 != null) {
				for (local182 = 0; local182 < this.aShortArray8.length; local182++) {
					local92.aa(this.aShortArray8[local182], this.aShortArray7[local182]);
				}
			}
			local92.s(local20);
			@Pc(240) Class359 local240 = this.aClass172_1.aClass359_36;
			synchronized (this.aClass172_1.aClass359_36) {
				this.aClass172_1.aClass359_36.method8515((long) (this.anInt247 |= arg7.anInt7475 << 29), local92);
			}
		}
		@Pc(279) Class54 local279 = local92.method7398(arg0, local20, true);
		if (arg2 != null) {
			arg2.method9020(0, local279);
		}
		if (this.anInt240 != 128 || this.anInt248 != 128) {
			local279.O(this.anInt240, this.anInt248, this.anInt240);
		}
		if (this.anInt245 != 0) {
			if (this.anInt245 == 90) {
				local279.a(4096);
			}
			if (this.anInt245 == 180) {
				local279.a(8192);
			}
			if (this.anInt245 == 270) {
				local279.a(12288);
			}
		}
		if (local18) {
			local279.p(this.aByte3, this.anInt235, arg1, arg3, arg5, arg8, arg6);
		}
		local279.s(arg9);
		return local279;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!qu;Lclient!ha;BI)Lclient!ka;")
	public Class54 method221(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) byte arg3) {
		return this.method218(arg3, (Class96) null, arg1, (Class96) null, false, 0, 0, arg2, 0, arg0);
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method222(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3030();
			if (local9 == 0) {
				return;
			}
			this.method225(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method225(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt236 = arg0.method3018();
		} else if (arg1 == 2) {
			this.anInt251 = arg0.method3018();
		} else if (arg1 == 4) {
			this.anInt240 = arg0.method3018();
		} else if (arg1 == 5) {
			this.anInt248 = arg0.method3018();
		} else if (arg1 == 6) {
			this.anInt245 = arg0.method3018();
		} else if (arg1 == 7) {
			this.anInt241 = arg0.method3030();
		} else if (arg1 == 8) {
			this.anInt243 = arg0.method3030();
		} else if (arg1 == 9) {
			this.anInt235 = 8224;
			this.aByte3 = 3;
		} else if (arg1 == 10) {
			this.aBoolean21 = true;
		} else if (arg1 == 11) {
			this.aByte3 = 1;
		} else if (arg1 == 12) {
			this.aByte3 = 4;
		} else if (arg1 == 13) {
			this.aByte3 = 5;
		} else if (arg1 == 14) {
			this.aByte3 = 2;
			this.anInt235 = arg0.method3030() * 256;
		} else if (arg1 == 15) {
			this.aByte3 = 3;
			this.anInt235 = arg0.method3018();
		} else if (arg1 == 16) {
			this.aByte3 = 3;
			this.anInt235 = arg0.method3015();
		} else {
			@Pc(180) int local180;
			@Pc(190) int local190;
			if (arg1 == 40) {
				local180 = arg0.method3030();
				this.aShortArray9 = new short[local180];
				this.aShortArray10 = new short[local180];
				for (local190 = 0; local190 < local180; local190++) {
					this.aShortArray10[local190] = (short) arg0.method3018();
					this.aShortArray9[local190] = (short) arg0.method3018();
				}
			} else if (arg1 == 41) {
				local180 = arg0.method3030();
				this.aShortArray8 = new short[local180];
				this.aShortArray7 = new short[local180];
				for (local190 = 0; local190 < local180; local190++) {
					this.aShortArray8[local190] = (short) arg0.method3018();
					this.aShortArray7[local190] = (short) arg0.method3018();
				}
			}
		}
	}
}
