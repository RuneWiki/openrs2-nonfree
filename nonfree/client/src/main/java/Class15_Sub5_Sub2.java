import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class15_Sub5_Sub2 extends Class15_Sub5 {

	@OriginalMember(owner = "client!wf", name = "sc", descriptor = "Lclient!tb;")
	public Class167 aClass167_6;

	@OriginalMember(owner = "client!wf", name = "bd", descriptor = "Ljava/lang/String;")
	public String aString336;

	@OriginalMember(owner = "client!wf", name = "zc", descriptor = "I")
	public int anInt5607 = 0;

	@OriginalMember(owner = "client!wf", name = "mc", descriptor = "I")
	public int anInt5597 = -1;

	@OriginalMember(owner = "client!wf", name = "Ic", descriptor = "I")
	public int anInt5616 = -1;

	@OriginalMember(owner = "client!wf", name = "Fc", descriptor = "I")
	public int anInt5613 = 0;

	@OriginalMember(owner = "client!wf", name = "uc", descriptor = "Z")
	public boolean aBoolean378 = false;

	@OriginalMember(owner = "client!wf", name = "Dc", descriptor = "I")
	public int anInt5611 = -1;

	@OriginalMember(owner = "client!wf", name = "tc", descriptor = "B")
	private byte aByte27 = 0;

	@OriginalMember(owner = "client!wf", name = "Hc", descriptor = "I")
	public int anInt5615 = -1;

	@OriginalMember(owner = "client!wf", name = "Ac", descriptor = "I")
	public int anInt5608 = -1;

	@OriginalMember(owner = "client!wf", name = "Qc", descriptor = "I")
	public int anInt5623 = 255;

	@OriginalMember(owner = "client!wf", name = "Pc", descriptor = "I")
	public int anInt5622 = 0;

	@OriginalMember(owner = "client!wf", name = "Yc", descriptor = "I")
	public int anInt5630 = -1;

	@OriginalMember(owner = "client!wf", name = "yc", descriptor = "I")
	public int anInt5606 = 0;

	@OriginalMember(owner = "client!wf", name = "Tc", descriptor = "I")
	public int anInt5625 = 0;

	@OriginalMember(owner = "client!wf", name = "qc", descriptor = "I")
	public int anInt5601 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZI)V")
	public void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		super.method4693(arg0, this.method4702(), arg1, arg2);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean374) {
			if (this.aClass167_6 == null) {
				return;
			}
			@Pc(29) Class157 local29 = this.anInt5594 != -1 && this.anInt5585 == 0 ? Static80.method1561(this.anInt5594) : null;
			@Pc(53) Class157 local53 = this.anInt5569 == -1 || this.aBoolean378 || this.anInt5569 == this.method4698().anInt206 && local29 != null ? null : Static80.method1561(this.anInt5569);
			@Pc(76) Class15_Sub2 local76 = this.aClass167_6.method4179(false, this.anInt5521, this.anInt5539, this.anInt5522, false, this.anInt5544, local53, this.anInt5537, local29, this.anInt5516, this.aClass14Array3);
			if (local76 == null) {
				return;
			}
			this.method4688(null, local76);
		}
		if (this.aClass87_Sub2_7 != null) {
			this.aClass87_Sub2_7.method2719(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10) {
		if (this.aClass167_6 == null) {
			return;
		}
		@Pc(25) Class157 local25 = this.anInt5594 != -1 && this.anInt5585 == 0 ? Static80.method1561(this.anInt5594) : null;
		@Pc(29) Class11 local29 = this.method4698();
		@Pc(49) boolean local49 = local29.anInt204 != 0 || local29.anInt185 != 0 || local29.anInt218 != 0 || local29.anInt198 != 0;
		@Pc(72) Class157 local72 = this.anInt5569 == -1 || this.aBoolean378 || this.anInt5569 == this.method4698().anInt206 && local25 != null ? null : Static80.method1561(this.anInt5569);
		@Pc(95) Class15_Sub2 local95 = this.aClass167_6.method4179(true, this.anInt5521, this.anInt5539, this.anInt5522, local49, this.anInt5544, local72, this.anInt5537, local25, this.anInt5516, this.aClass14Array3);
		@Pc(98) int local98 = Static41.method743();
		if (Static156.aBoolean211 && Static207.anInt3958 < 96 && local98 > 50) {
			Static105.method1210();
		}
		@Pc(122) int local122;
		if (Static31.anInt552 != 0 && local98 < 50) {
			local122 = 50 - local98;
			while (local122 > Static24.anInt404) {
				Static282.aByteArrayArray16[Static24.anInt404] = new byte[102400];
				Static24.anInt404++;
			}
			while (local122 < Static24.anInt404) {
				Static24.anInt404--;
				Static282.aByteArrayArray16[Static24.anInt404] = null;
			}
		}
		if (local95 == null) {
			return;
		}
		this.anInt5513 = local95.method4676();
		@Pc(207) Class15_Sub2 local207;
		if (Static123.aBoolean160 && (this.aClass167_6.anInt4863 == -1 || Static261.method4114(this.aClass167_6.anInt4863).aBoolean193)) {
			local207 = Static286.method4397(160, 0, 240, 1, local72 == null ? this.anInt5537 : this.anInt5521, this.anInt5587, this.anInt5559, arg0, local72 == null ? local25 : local72, 0, this.anInt5557, this.aBoolean372, local95);
			if (Static156.aBoolean211) {
				@Pc(211) float local211 = Static156.method2666();
				@Pc(213) float local213 = Static156.method2690();
				Static156.method2656();
				Static156.method2670(local211, local213 - 150.0F);
				local207.method4678(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static156.method2676();
				Static156.method2670(local211, local213);
			} else {
				local207.method4678(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static90.aClass15_Sub5_Sub2_2 == this) {
			for (local122 = Static290.aClass134Array1.length - 1; local122 >= 0; local122--) {
				@Pc(265) Class134 local265 = Static290.aClass134Array1[local122];
				if (local265 != null && local265.anInt4014 != -1) {
					@Pc(310) int local310;
					@Pc(321) int local321;
					if (local265.anInt4007 == 1 && local265.anInt4011 >= 0 && local265.anInt4011 < Static83.aClass15_Sub5_Sub1Array1.length) {
						@Pc(296) Class15_Sub5_Sub1 local296 = Static83.aClass15_Sub5_Sub1Array1[local265.anInt4011];
						if (local296 != null) {
							local310 = local296.anInt5559 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
							local321 = local296.anInt5557 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
							this.method4712(local95, local265.anInt4014, arg3, null, arg6, arg1, arg5, arg9, arg0, arg4, 360000, arg7, local310, arg2, local321);
						}
					}
					if (local265.anInt4007 == 2) {
						@Pc(361) int local361 = (local265.anInt4012 - Static199.anInt3817) * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
						local310 = (local265.anInt4006 - Static192.anInt3637) * 4 + 2 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
						local321 = local265.anInt4013 * 4;
						local321 *= local321;
						this.method4712(local95, local265.anInt4014, arg3, null, arg6, arg1, arg5, arg9, arg0, arg4, local321, arg7, local361, arg2, local310);
					}
					if (local265.anInt4007 == 10 && local265.anInt4011 >= 0 && Static17.aClass15_Sub5_Sub2Array1.length > local265.anInt4011) {
						@Pc(426) Class15_Sub5_Sub2 local426 = Static17.aClass15_Sub5_Sub2Array1[local265.anInt4011];
						if (local426 != null) {
							local321 = local426.anInt5557 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5557 / 32;
							local310 = local426.anInt5559 / 32 - Static90.aClass15_Sub5_Sub2_2.anInt5559 / 32;
							this.method4712(local95, local265.anInt4014, arg3, null, arg6, arg1, arg5, arg9, arg0, arg4, 360000, arg7, local310, arg2, local321);
						}
					}
				}
			}
		}
		this.method4690(local95);
		this.method4699(local95, arg0);
		local207 = null;
		if (!this.aBoolean378 && this.anInt5510 != -1 && this.anInt5590 != -1) {
			@Pc(500) Class114 local500 = Static55.method978(this.anInt5510);
			local207 = local500.method2985(this.anInt5547, this.anInt5580, this.anInt5590);
			if (local207 != null) {
				local207.method1028(0, -this.anInt5576, 0);
				if (local500.aBoolean234) {
					if (Static225.anInt4139 != 0) {
						local207.method1041(Static225.anInt4139);
					}
					if (Static105.anInt1295 != 0) {
						local207.method1036(Static105.anInt1295);
					}
					if (Static296.anInt5311 != 0) {
						local207.method1028(0, Static296.anInt5311, 0);
					}
				}
			}
		}
		@Pc(550) Class15_Sub2 local550 = null;
		if (!this.aBoolean378 && this.anObject7 != null) {
			if (Static313.anInt2966 >= this.anInt5582) {
				this.anObject7 = null;
			}
			if (this.anInt5588 <= Static313.anInt2966 && Static313.anInt2966 < this.anInt5582) {
				if (this.anObject7 instanceof Class15_Sub3) {
					local550 = (Class15_Sub2) ((Class15_Sub3) this.anObject7).method450();
				} else {
					local550 = (Class15_Sub2) this.anObject7;
				}
				local550.method1028(this.anInt5514 - this.anInt5559, this.anInt5565 - this.anInt5587, this.anInt5511 - this.anInt5557);
				if (this.anInt5593 == 512) {
					local550.method1025();
				} else if (this.anInt5593 == 1024) {
					local550.method1045();
				} else if (this.anInt5593 == 1536) {
					local550.method1042();
				}
			}
		}
		if (Static156.aBoolean211) {
			this.method4688(local207, local95);
			local95.aBoolean61 = true;
			local95.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_7);
			if (local207 != null) {
				if (this.aClass87_Sub2_7 != null) {
					@Pc(708) Class15_Sub2_Sub1 local708 = (Class15_Sub2_Sub1) local207;
					this.aClass87_Sub2_7.method2718(local708.aClass180Array1, local708.aClass176Array1, true, local708.anIntArray53, local708.anIntArray51, local708.anIntArray49);
				}
				local207.aBoolean61 = true;
				local207.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_7);
			}
		} else {
			if (local207 != null) {
				local95 = ((Class15_Sub2_Sub2) local95).method1050(local207);
			}
			if (local550 != null) {
				local95 = ((Class15_Sub2_Sub2) local95).method1050(local550);
			}
			this.method4688(local207, local95);
			local95.aBoolean61 = true;
			local95.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_7);
		}
		if (local550 == null) {
			return;
		}
		if (this.anInt5593 == 512) {
			local550.method1042();
		} else if (this.anInt5593 == 1024) {
			local550.method1045();
		} else if (this.anInt5593 == 1536) {
			local550.method1025();
		}
		local550.method1028(this.anInt5559 - this.anInt5514, this.anInt5587 - this.anInt5565, this.anInt5557 - this.anInt5511);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!lf;B)V")
	public void method4706(@OriginalArg(0) Class1_Sub14 arg0) {
		arg0.anInt1480 = 0;
		@Pc(12) int local12 = arg0.method1378();
		@Pc(22) int local22 = local12 & 0x1;
		@Pc(33) boolean local33 = (local12 & 0x4) != 0;
		@Pc(37) int local37 = super.method4702();
		this.method4700((local12 >> 3 & 0x7) + 1);
		this.aByte27 = (byte) (local12 >> 6 & 0x3);
		this.anInt5559 += (this.method4702() - local37) * 64;
		@Pc(70) int local70 = -1;
		@Pc(73) int[] local73 = new int[12];
		this.anInt5557 += (this.method4702() - local37) * 64;
		this.anInt5601 = arg0.method1363();
		this.anInt5616 = arg0.method1363();
		this.anInt5622 = 0;
		@Pc(110) int local110;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(166) int local166;
		for (@Pc(101) int local101 = 0; local101 < 12; local101++) {
			local110 = arg0.method1378();
			if (local110 == 0) {
				local73[local101] = 0;
			} else {
				local122 = arg0.method1378();
				local128 = local122 + (local110 << 8);
				if (local101 == 0 && local128 == 65535) {
					local70 = arg0.method1386();
					this.anInt5622 = arg0.method1378();
					break;
				}
				if (local128 >= 32768) {
					local128 = Static48.anIntArray60[local128 - 32768];
					local73[local101] = local128 | 0x40000000;
					local166 = Static49.method909(local128).anInt3222;
					if (local166 != 0) {
						this.anInt5622 = local166;
					}
				} else {
					local73[local101] = local128 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(190) int[] local190 = new int[5];
		for (local110 = 0; local110 < 5; local110++) {
			local122 = arg0.method1378();
			if (local122 < 0 || local122 >= Static143.aShortArrayArray1[local110].length) {
				local122 = 0;
			}
			local190[local110] = local122;
		}
		this.anInt5543 = arg0.method1386();
		@Pc(230) long local230 = arg0.method1348();
		this.aString336 = Static113.method2021(local230);
		this.anInt5625 = arg0.method1378();
		if (local33) {
			this.anInt5606 = arg0.method1386();
			this.anInt5597 = -1;
			this.anInt5613 = this.anInt5625;
		} else {
			this.anInt5606 = 0;
			this.anInt5613 = arg0.method1378();
			this.anInt5597 = arg0.method1378();
			if (this.anInt5597 == 255) {
				this.anInt5597 = -1;
			}
		}
		local128 = this.anInt5607;
		this.anInt5607 = arg0.method1378();
		if (this.anInt5607 == 0) {
			Static297.method4532(this);
		} else {
			local166 = this.anInt5630;
			@Pc(299) int local299 = this.anInt5608;
			@Pc(302) int local302 = this.anInt5611;
			@Pc(305) int local305 = this.anInt5615;
			@Pc(308) int local308 = this.anInt5623;
			this.anInt5630 = arg0.method1386();
			this.anInt5608 = arg0.method1386();
			this.anInt5615 = arg0.method1386();
			this.anInt5611 = arg0.method1386();
			this.anInt5623 = arg0.method1378();
			if (local128 != this.anInt5607 || local166 != this.anInt5630 || this.anInt5608 != local299 || local305 != this.anInt5615 || this.anInt5611 != local302 || this.anInt5623 != local308) {
				Static266.method4188(this);
			}
		}
		if (this.aClass167_6 == null) {
			this.aClass167_6 = new Class167();
		}
		local166 = this.aClass167_6.anInt4863;
		this.aClass167_6.method4182(local190, local73, this.anInt5543, local22 == 1, local70);
		if (local166 != local70) {
			this.anInt5559 = this.anIntArray501[0] * 128 + this.method4702() * 64;
			this.anInt5557 = this.anIntArray504[0] * 128 + this.method4702() * 64;
		}
		if (this.aClass87_Sub2_7 != null) {
			this.aClass87_Sub2_7.method2727();
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
	@Override
	public int method4702() {
		return this.aClass167_6 == null || this.aClass167_6.anInt4863 == -1 ? super.method4702() : Static261.method4114(this.aClass167_6.anInt4863).anInt3050;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4685() {
		return this.aClass167_6 != null;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I")
	@Override
	protected int method4687() {
		return this.anInt5543;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()I")
	@Override
	public int method4676() {
		return this.anInt5513;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method4710() {
		@Pc(2) String local2 = this.aString336;
		if (Static88.aStringArray14 != null) {
			local2 = Static88.aStringArray14[this.aByte27] + local2;
		}
		if (Static80.aStringArray10 != null) {
			local2 = local2 + Static80.aStringArray10[this.aByte27];
		}
		return local2;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!bf;IILclient!lg;IIIIIIIIIIII)V")
	private void method4712(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class87_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(18) int local18 = arg12 * arg12 + arg14 * arg14;
		if (local18 < 16 || arg10 < local18) {
			return;
		}
		@Pc(43) int local43 = (int) (Math.atan2((double) arg12, (double) arg14) * 325.949D) & 0x7FF;
		@Pc(55) Class15_Sub2 local55 = Static20.method355(this.anInt5559, this.anInt5557, this.anInt5587, arg0, local43, arg1);
		if (local55 == null) {
			return;
		}
		if (!Static156.aBoolean211) {
			local55.method4678(0, arg5, arg13, arg2, arg9, arg6, arg4, arg11, -1L, arg7, arg3);
			return;
		}
		@Pc(77) float local77 = Static156.method2666();
		@Pc(79) float local79 = Static156.method2690();
		Static156.method2656();
		Static156.method2670(local77, local79 - 150.0F);
		local55.method4678(0, arg5, arg13, arg2, arg9, arg6, arg4, arg11, -1L, arg7, arg3);
		Static156.method2676();
		Static156.method2670(local77, local79);
	}

	@OriginalMember(owner = "client!wf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass87_Sub2_7 != null) {
			this.aClass87_Sub2_7.method2722();
		}
	}
}
