import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class8_Sub8_Sub1_Sub1 extends Class8_Sub8_Sub1 {

	@OriginalMember(owner = "client!om", name = "N", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "I")
	private int anInt7351;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "Lclient!bj;")
	public Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!om", name = "E", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "I")
	private int anInt7352;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!bj;IIIIIIIIIIIZZ)V")
	public Class8_Sub8_Sub1_Sub1(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass8_Sub2_1 = arg0;
		super.anInt7345 = arg1 << 12;
		super.anInt7350 = arg2 << 12;
		super.anInt7349 = arg3 << 12;
		super.anInt7344 = arg9;
		this.aShort92 = this.aShort95 = (short) arg8;
		super.anInt7348 = arg10;
		super.anInt7342 = arg11;
		super.aBoolean565 = arg13;
		this.aShort97 = (short) arg4;
		this.aShort96 = (short) arg5;
		this.aShort94 = (short) arg6;
		this.anInt7352 = arg7;
		super.aByte123 = this.aClass8_Sub2_1.aClass189_1.aByte69;
		this.method6339();
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
	public void method6335() {
		this.aClass8_Sub2_1.aClass8_Sub5_1.aClass8_Sub8_Sub1_Sub1Array1[this.aShort93] = null;
		Static350.aClass8_Sub8_Sub1_Sub1Array2[Static411.anInt7152] = this;
		Static411.anInt7152 = Static411.anInt7152 + 1 & 0x3FF;
		this.method8893();
		this.method6981();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method6336(@OriginalArg(0) Class57 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt7345 >> Static611.anInt10115 + 12;
		@Pc(13) int local13 = super.anInt7349 >> Static611.anInt10115 + 12;
		@Pc(18) int local18 = super.anInt7350 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static328.anInt5870 || local13 < 0 || local13 >= Static526.anInt8863) {
			this.method6335();
			return;
		}
		@Pc(40) Class8_Sub5 local40 = this.aClass8_Sub2_1.aClass8_Sub5_1;
		@Pc(44) Class184 local44 = this.aClass8_Sub2_1.aClass184_1;
		@Pc(46) Class22[] local46 = Static242.aClass22Array3;
		@Pc(49) int local49 = local40.anInt5766;
		@Pc(58) Class174 local58 = Static260.aClass174ArrayArrayArray2[local40.anInt5766][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte65;
		}
		@Pc(71) int local71 = local46[local49].method8038(local13, local6);
		@Pc(86) int local86;
		if (local49 < Static490.anInt9715 - 1) {
			local86 = local46[local49 + 1].method8038(local13, local6);
		} else {
			local86 = local71 - (0x8 << Static611.anInt10115);
		}
		if (local44.aBoolean368) {
			if (local44.anInt4711 == -1 && local18 > local71) {
				this.method6335();
				return;
			}
			if (local44.anInt4711 >= 0 && local18 > local46[local44.anInt4711].method8038(local13, local6)) {
				this.method6335();
				return;
			}
			if (local44.anInt4733 == -1 && local18 < local86) {
				this.method6335();
				return;
			}
			if (local44.anInt4733 >= 0 && local18 < local46[local44.anInt4733 + 1].method8038(local13, local6)) {
				this.method6335();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static490.anInt9715 - 1; local154 > 0 && local18 > local46[local154].method8038(local13, local6); local154--) {
		}
		if (local44.aBoolean371 && local154 == 0 && local18 > local46[0].method8038(local13, local6)) {
			this.method6335();
		} else if (local154 == Static490.anInt9715 - 1 && local46[local154].method8038(local13, local6) - local18 > 0x8 << Static611.anInt10115) {
			this.method6335();
		} else {
			local58 = Static260.aClass174ArrayArrayArray2[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static260.aClass174ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static260.aClass174ArrayArrayArray2[0][local6][local13] = new Class174(0);
				}
				@Pc(251) boolean local251 = Static260.aClass174ArrayArrayArray2[0][local6][local13].aClass174_1 != null;
				if (local154 == 3 && local251) {
					this.method6335();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static260.aClass174ArrayArrayArray2[local261][local6][local13] == null) {
						local58 = Static260.aClass174ArrayArrayArray2[local261][local6][local13] = new Class174(local261);
						if (local251) {
							local58.aByte65++;
						}
					}
				}
			}
			if (local44.aBoolean370) {
				@Pc(304) int local304 = super.anInt7345 >> 12;
				local261 = super.anInt7349 >> 12;
				@Pc(318) Class59 local318;
				if (local58.aClass8_Sub1_Sub4_2 != null) {
					local318 = local58.aClass8_Sub1_Sub4_2.method8904(arg0, 105);
					if (local318 != null && local318.method1083(local261, local18, local304)) {
						this.method6335();
						return;
					}
				}
				if (local58.aClass8_Sub1_Sub4_1 != null) {
					local318 = local58.aClass8_Sub1_Sub4_1.method8904(arg0, 75);
					if (local318 != null && local318.method1083(local261, local18, local304)) {
						this.method6335();
						return;
					}
				}
				if (local58.aClass8_Sub1_Sub1_1 != null) {
					local318 = local58.aClass8_Sub1_Sub1_1.method8904(arg0, 79);
					if (local318 != null && local318.method1083(local261, local18, local304)) {
						this.method6335();
						return;
					}
				}
				for (@Pc(375) Class273 local375 = local58.aClass273_67; local375 != null; local375 = local375.aClass273_114) {
					@Pc(382) Class59 local382 = local375.aClass8_Sub1_Sub3_1.method8904(arg0, 92);
					if (local382 != null && local382.method1083(local261, local18, local304)) {
						this.method6335();
						return;
					}
				}
			}
			local40.aClass193_1.aClass154_1.method3046(this);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!bj;IIIIIIIIIIIZZ)V")
	public void method6337(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass8_Sub2_1 = arg0;
		super.anInt7345 = arg1 << 12;
		super.anInt7350 = arg2 << 12;
		super.anInt7349 = arg3 << 12;
		super.anInt7344 = arg9;
		this.aShort92 = this.aShort95 = (short) arg8;
		super.anInt7348 = arg10;
		super.anInt7342 = arg11;
		super.aBoolean565 = arg13;
		this.aShort97 = (short) arg4;
		this.aShort96 = (short) arg5;
		this.aShort94 = (short) arg6;
		this.anInt7352 = arg7;
		super.aByte123 = this.aClass8_Sub2_1.aClass189_1.aByte69;
		this.method6339();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)V")
	public void method6338(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort95 = (short) (this.aShort95 - arg1);
		if (this.aShort95 <= 0) {
			this.method6335();
			return;
		}
		@Pc(17) int local17 = super.anInt7345 >> 12;
		@Pc(22) int local22 = super.anInt7350 >> 12;
		@Pc(27) int local27 = super.anInt7349 >> 12;
		@Pc(31) Class8_Sub5 local31 = this.aClass8_Sub2_1.aClass8_Sub5_1;
		@Pc(35) Class184 local35 = this.aClass8_Sub2_1.aClass184_1;
		if (local35.anInt4712 != 0) {
			@Pc(65) int local65;
			if (this.aShort92 - this.aShort95 <= local35.anInt4713) {
				local65 = (super.anInt7344 >> 8 & 0xFF00) + (this.anInt7351 >> 16 & 0xFF) + local35.anInt4721 * arg1;
				@Pc(82) int local82 = (super.anInt7344 & 0xFF00) + (this.anInt7351 >> 8 & 0xFF) + local35.anInt4702 * arg1;
				@Pc(99) int local99 = ((super.anInt7344 & 0xFF) << 8) + (this.anInt7351 & 0xFF) + local35.anInt4746 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt7344 &= 0xFF000000;
				super.anInt7344 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt7351 &= 0xFF000000;
				this.anInt7351 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort92 - this.aShort95 <= local35.anInt4734) {
				local65 = (super.anInt7344 >> 16 & 0xFF00) + (this.anInt7351 >> 24 & 0xFF) + local35.anInt4729 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt7344 &= 0xFFFFFF;
				super.anInt7344 |= (local65 & 0xFF00) << 16;
				this.anInt7351 &= 0xFFFFFF;
				this.anInt7351 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt4720 != -1 && this.aShort92 - this.aShort95 <= local35.anInt4738) {
			this.anInt7352 += local35.anInt4728 * arg1;
		}
		if (local35.anInt4745 != -1 && this.aShort92 - this.aShort95 <= local35.anInt4740) {
			super.anInt7348 += local35.anInt4710 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort97;
		@Pc(300) double local300 = (double) this.aShort96;
		@Pc(304) double local304 = (double) this.aShort94;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt4696 == 1) {
			local317 = local17 - this.aClass8_Sub2_1.aClass263_1.anInt7316;
			local324 = local22 - this.aClass8_Sub2_1.aClass263_1.anInt7321;
			local331 = local27 - this.aClass8_Sub2_1.aClass263_1.anInt7322;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt4732 * local348 * arg1);
			this.anInt7352 = (int) ((long) this.anInt7352 - ((long) this.anInt7352 * local356 >> 18));
		} else if (local35.anInt4696 == 2) {
			local317 = local17 - this.aClass8_Sub2_1.aClass263_1.anInt7316;
			local324 = local22 - this.aClass8_Sub2_1.aClass263_1.anInt7321;
			local331 = local27 - this.aClass8_Sub2_1.aClass263_1.anInt7322;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt4732 * local348 * arg1);
			this.anInt7352 = (int) ((long) this.anInt7352 - ((long) this.anInt7352 * local356 >> 28));
		}
		if (local35.anIntArray269 != null) {
			@Pc(437) Class5 local437 = local31.aClass102_40.aClass5_61;
			for (@Pc(440) Class5 local440 = local437.aClass5_338; local440 != local437; local440 = local440.aClass5_338) {
				@Pc(444) Class5_Sub5_Sub10 local444 = (Class5_Sub5_Sub10) local440;
				@Pc(447) Class92 local447 = local444.aClass92_1;
				if (local447.anInt1838 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray269.length; local455++) {
						if (local35.anIntArray269[local455] == local447.anInt1841) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt3708);
						@Pc(486) double local486 = (double) (local22 - local444.anInt3702);
						@Pc(492) double local492 = (double) (local27 - local444.anInt3705);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong47)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt3704 + local486 * (double) local447.anInt1837 + local492 * (double) local444.anInt3699) * 65535.0D / ((double) local447.anInt1836 * local513);
							if (!(local545 < (double) local447.anInt1834)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt1843 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt1846;
								} else if (local447.anInt1843 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt1846;
								}
								if (local447.anInt1849 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt1836;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt1836;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt1836;
									if (local447.anInt1848 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt7345 = (int) ((double) super.anInt7345 + local678 * (double) arg1);
										super.anInt7350 = (int) ((double) super.anInt7350 + local686 * (double) arg1);
										super.anInt7349 = (int) ((double) super.anInt7349 + local694 * (double) arg1);
									}
								} else if (local447.anInt1848 == 0) {
									local296 += ((double) local444.anInt3704 - local553) * (double) arg1;
									local300 += ((double) local447.anInt1837 - local553) * (double) arg1;
									local304 += ((double) local444.anInt3699 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt7345 = (int) ((double) super.anInt7345 + ((double) local444.anInt3704 - local553) * (double) arg1);
									super.anInt7350 = (int) ((double) super.anInt7350 + ((double) local447.anInt1837 - local553) * (double) arg1);
									super.anInt7349 = (int) ((double) super.anInt7349 + ((double) local444.anInt3699 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray268 != null) {
			for (local317 = 0; local317 < local35.anIntArray268.length; local317++) {
				@Pc(776) Class5_Sub5_Sub10 local776 = (Class5_Sub5_Sub10) Static348.aClass195_1.method4398((long) local35.anIntArray268[local317]);
				while (local776 != null) {
					@Pc(780) Class92 local780 = local776.aClass92_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt3708);
					@Pc(792) double local792 = (double) (local22 - local776.anInt3702);
					@Pc(798) double local798 = (double) (local27 - local776.anInt3705);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong47) {
						local776 = (Class5_Sub5_Sub10) Static348.aClass195_1.method4402();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt3704 + local792 * (double) local780.anInt1837 + local798 * (double) local776.anInt3699) * 65535.0D / ((double) local780.anInt1836 * local825);
						if (local857 < (double) local780.anInt1834) {
							local776 = (Class5_Sub5_Sub10) Static348.aClass195_1.method4402();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt1843 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt1846;
							} else if (local780.anInt1843 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt1846;
							}
							if (local780.anInt1849 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt1836;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt1836;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt1836;
								if (local780.anInt1848 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt7345 = (int) ((double) super.anInt7345 + local996 * (double) arg1);
									super.anInt7350 = (int) ((double) super.anInt7350 + local1004 * (double) arg1);
									super.anInt7349 = (int) ((double) super.anInt7349 + local1012 * (double) arg1);
								}
							} else if (local780.anInt1848 == 0) {
								local296 += ((double) local776.anInt3704 - local871) * (double) arg1;
								local300 += ((double) local780.anInt1837 - local871) * (double) arg1;
								local304 += ((double) local776.anInt3699 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt7345 = (int) ((double) super.anInt7345 + ((double) local776.anInt3704 - local871) * (double) arg1);
								super.anInt7350 = (int) ((double) super.anInt7350 + ((double) local780.anInt1837 - local871) * (double) arg1);
								super.anInt7349 = (int) ((double) super.anInt7349 + ((double) local776.anInt3699 - local871) * (double) arg1);
							}
							local776 = (Class5_Sub5_Sub10) Static348.aClass195_1.method4402();
						}
					}
				}
			}
		}
		if (local35.anIntArray266 != null) {
			if (local35.anIntArray267 == null) {
				local35.anIntArray267 = new int[local35.anIntArray266.length];
				for (local317 = 0; local317 < local35.anIntArray266.length; local317++) {
					Static109.method1571(local35.anIntArray266[local317]);
					local35.anIntArray267[local317] = ((Class5_Sub29) Static371.aClass291_26.method6993((long) local35.anIntArray266[local317], 1)).anInt5492;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray267.length; local317++) {
				@Pc(1137) Class92 local1137 = Static599.aClass92Array1[local35.anIntArray267[local317]];
				if (local1137.anInt1848 == 0) {
					local296 += (double) (local1137.anInt1844 * arg1);
					local300 += (double) (local1137.anInt1837 * arg1);
					local304 += (double) (local1137.anInt1850 * arg1);
					local306 = true;
				} else {
					super.anInt7345 += local1137.anInt1844 * arg1;
					super.anInt7350 += local1137.anInt1837 * arg1;
					super.anInt7349 += local1137.anInt1850 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort97 = (short) (int) local296;
					this.aShort96 = (short) (int) local300;
					this.aShort94 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt7352 <<= 0x1;
			}
		}
		super.anInt7345 = (int) ((long) super.anInt7345 + ((long) this.aShort97 * (long) (this.anInt7352 << 2) >> 23) * (long) arg1);
		super.anInt7350 = (int) ((long) super.anInt7350 + ((long) this.aShort96 * (long) (this.anInt7352 << 2) >> 23) * (long) arg1);
		super.anInt7349 = (int) ((long) super.anInt7349 + ((long) this.aShort94 * (long) (this.anInt7352 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
	private void method6339() {
		@Pc(4) int local4 = this.aClass8_Sub2_1.aClass8_Sub5_1.anInt5764;
		if (this.aClass8_Sub2_1.aClass8_Sub5_1.aClass8_Sub8_Sub1_Sub1Array1[local4] != null) {
			this.aClass8_Sub2_1.aClass8_Sub5_1.aClass8_Sub8_Sub1_Sub1Array1[local4].method6335();
		}
		this.aClass8_Sub2_1.aClass8_Sub5_1.aClass8_Sub8_Sub1_Sub1Array1[local4] = this;
		this.aShort93 = (short) this.aClass8_Sub2_1.aClass8_Sub5_1.anInt5764;
		this.aClass8_Sub2_1.aClass8_Sub5_1.anInt5764 = local4 + 1 & 0x1FFF;
		this.aClass8_Sub2_1.aClass98_1.method1780(this);
	}
}
