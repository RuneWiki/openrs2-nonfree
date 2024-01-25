import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class1_Sub30_Sub1 extends Class1_Sub30 {

	@OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
	public int anInt6206;

	@OriginalMember(owner = "client!naa", name = "wb", descriptor = "Z")
	public boolean aBoolean492 = false;

	@OriginalMember(owner = "client!naa", name = "Ab", descriptor = "Z")
	public boolean aBoolean494 = false;

	@OriginalMember(owner = "client!naa", name = "zb", descriptor = "Z")
	public boolean aBoolean493 = false;

	@OriginalMember(owner = "client!naa", name = "pb", descriptor = "Z")
	public boolean aBoolean490 = false;

	@OriginalMember(owner = "client!naa", name = "qb", descriptor = "Z")
	public boolean aBoolean491 = false;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!laa;)V")
	public Class1_Sub30_Sub1(@OriginalArg(0) Class198 arg0) {
		super.anInt6184 = 3;
		super.anInt6195 = 3;
		this.method5036(true);
		super.anInt6198 = 2;
		super.aBoolean479 = true;
		super.anInt6193 = 1;
		super.anInt6196 = 127;
		super.aBoolean486 = true;
		super.aBoolean472 = false;
		super.aBoolean484 = true;
		super.anInt6189 = 127;
		super.aBoolean473 = true;
		super.anInt6192 = 127;
		super.aBoolean477 = true;
		super.aBoolean476 = true;
		super.aBoolean487 = true;
		super.aBoolean478 = true;
		super.anInt6202 = 0;
		super.anInt6205 = 127;
		super.anInt6186 = 0;
		super.anInt6191 = 0;
		super.anInt6201 = 0;
		super.anInt6190 = 0;
		super.anInt6185 = 127;
		super.aBoolean488 = true;
		super.aBoolean483 = true;
		if (Static221.anInt4095 >= 96) {
			Static386.method5577(2);
		} else {
			Static386.method5577(0);
		}
		super.anInt6199 = 2;
		super.anInt6204 = Static107.anInt1802 == 1 ? 2 : 4;
		super.anInt6197 = 0;
		super.aBoolean480 = true;
		super.aBoolean482 = false;
		super.anInt6200 = 2;
		super.aBoolean485 = false;
		super.anInt6182 = 0;
		super.aBoolean474 = false;
		super.aBoolean481 = true;
		super.anInt6194 = 0;
		@Pc(152) Class268 local152 = null;
		try {
			@Pc(158) Class191 local158 = arg0.method4291(true, "");
			while (local158.anInt5014 == 0) {
				Static408.method5841(1L);
			}
			if (local158.anInt5014 == 1) {
				local152 = (Class268) local158.anObject11;
				@Pc(182) byte[] local182 = new byte[(int) local152.method5812()];
				@Pc(196) int local196;
				for (@Pc(184) int local184 = 0; local184 < local182.length; local184 += local196) {
					local196 = local152.method5813(local182, local182.length - local184, local184);
					if (local196 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method5041(new Class1_Sub3(local182));
			}
		} catch (@Pc(221) Exception local221) {
		}
		try {
			if (local152 != null) {
				local152.method5816();
			}
		} catch (@Pc(228) Exception local228) {
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)I")
	public int method5025() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static361.aClass198_3.aBoolean401 && !Static361.aClass198_3.aBoolean402) {
			if (Static285.aString59.startsWith("win")) {
				local11 = true;
				local9 = true;
				if (!Static285.aString57.startsWith("amd64") && !Static285.aString57.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean494) {
			local11 = false;
		}
		if (this.aBoolean493) {
			local9 = false;
		}
		if (this.aBoolean491) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method5027();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		if (local7) {
			try {
				local66 = Static271.method3981(1000, 2);
			} catch (@Pc(77) Exception local77) {
			}
		}
		@Pc(88) int local88 = -1;
		if (local11) {
			try {
				local88 = Static271.method3981(1000, 3);
				if (Static286.anInt5239 == 3) {
					@Pc(103) Class141 local103 = Static31.aClass78_18.method6841();
					@Pc(108) long local108 = local103.aLong99 & 0xFFFFFFFFFFFFL;
					@Pc(111) int local111 = local103.anInt3807;
					if (local111 == 4318) {
						local9 &= local108 >= 64425238954L;
					} else if (local111 == 4098) {
						local9 &= local108 >= 60129613779L;
					}
				}
			} catch (@Pc(149) Exception local149) {
			}
		}
		if (local9) {
			try {
				local68 = Static271.method3981(1000, 1);
			} catch (@Pc(159) Exception local159) {
			}
		}
		if (local66 == -1 && local68 == -1 && local88 == -1) {
			return this.method5027();
		}
		local68 = (int) ((float) local68 * 1.1F);
		local88 = (int) ((float) local88 * 1.1F);
		if (local88 < local66 && local66 > local68) {
			return this.method5034(local66);
		} else if (local68 < local88) {
			return this.method5038(3, local88);
		} else {
			return this.method5038(1, local68);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(II)I")
	public int method5026(@OriginalArg(1) int arg0) {
		if (Static572.method7721(arg0) && !Static581.method7787(Static55.anInt1068)) {
			return Static221.anInt4095 < 96 && Static204.method3114(arg0) && super.anInt6182 == 0 ? 1 : super.anInt6182;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)I")
	private int method5027() {
		@Pc(20) byte local20;
		if (Static221.anInt4095 < 96) {
			local20 = 1;
			this.method5043(true);
		} else {
			@Pc(29) int local29 = Static228.method3400();
			if (local29 <= 100) {
				this.method5044();
				local20 = 4;
			} else if (local29 <= 500) {
				local20 = 3;
				this.method5028();
			} else if (local29 > 1000) {
				local20 = 1;
				this.method5043(true);
			} else {
				local20 = 2;
				this.method5030();
			}
		}
		if (Static286.anInt5239 != 0) {
			super.anInt6200 = 0;
			Static358.method7632(0);
		}
		this.method5035(Static361.aClass198_3);
		return local20;
	}

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)V")
	public void method5028() {
		this.method5036(true);
		super.aBoolean488 = true;
		super.aBoolean486 = true;
		super.aBoolean483 = true;
		super.aBoolean484 = true;
		super.anInt6198 = super.anInt6191 = 1;
		super.aBoolean472 = false;
		super.anInt6193 = 1;
		super.aBoolean477 = true;
		super.aBoolean478 = false;
		super.aBoolean476 = true;
		super.aBoolean487 = true;
		super.aBoolean475 = true;
		super.aBoolean473 = true;
		super.anInt6202 = super.anInt6186 = 0;
		if (Static221.anInt4095 > 95) {
			Static386.method5577(1);
		} else {
			Static386.method5577(0);
		}
		super.aBoolean480 = true;
		super.anInt6197 = 0;
		super.aBoolean474 = false;
		this.method5031();
		this.method5042(1);
		super.anInt6195 = 3;
		Static308.method4625();
		Static585.method7837();
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)Z")
	public boolean method5029(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean490 ? super.aBoolean489 : true;
	}

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "(I)V")
	public void method5030() {
		this.method5036(true);
		super.aBoolean477 = false;
		super.aBoolean483 = false;
		super.aBoolean478 = false;
		super.aBoolean472 = false;
		super.aBoolean476 = false;
		super.aBoolean473 = false;
		super.anInt6198 = super.anInt6191 = 0;
		super.aBoolean475 = false;
		super.anInt6193 = 0;
		super.aBoolean488 = false;
		super.anInt6202 = super.anInt6186 = 0;
		super.aBoolean486 = false;
		super.aBoolean487 = true;
		super.aBoolean484 = false;
		Static386.method5577(0);
		super.aBoolean480 = true;
		super.anInt6197 = 0;
		super.aBoolean474 = false;
		this.method5031();
		this.method5042(2);
		super.anInt6195 = 2;
		Static308.method4625();
		Static585.method7837();
	}

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "(I)V")
	private void method5031() {
		if (Static107.anInt1802 > 1) {
			super.anInt6204 = 4;
		} else {
			super.anInt6204 = 2;
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(IB)Z")
	public boolean method5032(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean489 : true;
	}

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "(II)I")
	public int method5033(@OriginalArg(0) int arg0) {
		if (this.aBoolean492) {
			return 0;
		} else if (this.method5029(arg0)) {
			return super.aBoolean483 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)I")
	private int method5034(@OriginalArg(1) int arg0) {
		@Pc(28) byte local28;
		if (arg0 > 12000) {
			local28 = 4;
			this.method5044();
		} else if (arg0 > 5000) {
			this.method5028();
			local28 = 3;
		} else if (arg0 <= 2000) {
			this.method5043(true);
			local28 = 1;
		} else {
			this.method5030();
			local28 = 2;
		}
		if (Static286.anInt5239 != 2) {
			super.anInt6200 = 2;
			Static358.method7632(2);
		}
		this.method5035(Static361.aClass198_3);
		return local28;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!laa;B)V")
	public void method5035(@OriginalArg(0) Class198 arg0) {
		@Pc(11) Class268 local11 = null;
		try {
			@Pc(17) Class191 local17 = arg0.method4291(true, "");
			while (local17.anInt5014 == 0) {
				Static408.method5841(1L);
			}
			if (local17.anInt5014 == 1) {
				local11 = (Class268) local17.anObject11;
				@Pc(44) Class1_Sub3 local44 = new Class1_Sub3(Static5.method84());
				this.method5021(local44);
				local11.method5810(local44.aByteArray104, local44.anInt9802, 0);
			}
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (local11 != null) {
				local11.method5816();
			}
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(IZ)V")
	public void method5036(@OriginalArg(1) boolean arg0) {
		super.aBoolean489 = arg0;
		if (Static347.aClass122_4 != null) {
			Static347.aClass122_4.method2768(!this.method5029(Static286.anInt5239));
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)I")
	private int method5038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) byte local15;
		if (arg1 > 20000) {
			local15 = 4;
			this.method5044();
		} else if (arg1 > 10000) {
			this.method5028();
			local15 = 3;
		} else if (arg1 > 5000) {
			this.method5030();
			local15 = 2;
		} else {
			local15 = 1;
			this.method5043(true);
		}
		if (arg0 != Static286.anInt5239) {
			super.anInt6200 = arg0;
			Static358.method7632(arg0);
		}
		this.method5035(Static361.aClass198_3);
		return local15;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!ac;I)V")
	private void method5041(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aByteArray104.length - arg0.anInt9802 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method7974();
		if (local21 < 0 || local21 > 22) {
			return;
		}
		@Pc(39) byte local39;
		if (local21 == 22) {
			local39 = 45;
		} else if (local21 == 21) {
			local39 = 44;
		} else if (local21 == 20) {
			local39 = 43;
		} else if (local21 == 19) {
			local39 = 42;
		} else if (local21 == 18) {
			local39 = 41;
		} else if (local21 == 17) {
			local39 = 40;
		} else if (local21 == 16) {
			local39 = 38;
		} else if (local21 == 15) {
			local39 = 37;
		} else if (local21 == 14) {
			local39 = 36;
		} else if (local21 == 13) {
			local39 = 35;
		} else if (local21 == 12) {
			local39 = 34;
		} else if (local21 == 11) {
			local39 = 33;
		} else if (local21 == 10) {
			local39 = 32;
		} else if (local21 == 9) {
			local39 = 31;
		} else if (local21 == 8) {
			local39 = 30;
		} else if (local21 == 7) {
			local39 = 29;
		} else if (local21 == 6) {
			local39 = 28;
		} else if (local21 == 5) {
			local39 = 28;
		} else if (local21 == 4) {
			local39 = 24;
		} else if (local21 == 3) {
			local39 = 23;
		} else if (local21 == 2) {
			local39 = 22;
		} else if (local21 == 1) {
			local39 = 23;
		} else {
			local39 = 19;
		}
		if (arg0.aByteArray104.length - arg0.anInt9802 < local39) {
			return;
		}
		super.anInt6184 = arg0.method7974();
		if (super.anInt6184 < 1) {
			super.anInt6184 = 1;
		} else if (super.anInt6184 > 4) {
			super.anInt6184 = 4;
		}
		this.method5036(arg0.method7974() == 1);
		super.aBoolean483 = arg0.method7974() == 1;
		super.aBoolean487 = arg0.method7974() == 1;
		super.aBoolean486 = arg0.method7974() == 1;
		super.anInt6193 = arg0.method7974() == 1 ? 1 : 0;
		super.aBoolean488 = arg0.method7974() == 1;
		super.aBoolean484 = arg0.method7974() == 1;
		super.aBoolean477 = arg0.method7974() == 1;
		super.anInt6198 = arg0.method7974();
		if (super.anInt6198 > 2) {
			super.anInt6198 = 2;
		}
		if (local21 >= 17) {
			super.anInt6191 = arg0.method7974();
		}
		if (local21 >= 2) {
			super.aBoolean473 = arg0.method7974() == 1;
			if (local21 >= 17) {
				super.aBoolean472 = arg0.method7974() == 1;
			}
		} else {
			super.aBoolean473 = arg0.method7974() == 1;
			arg0.method7974();
		}
		super.aBoolean478 = arg0.method7974() == 1;
		super.aBoolean476 = arg0.method7974() == 1;
		super.anInt6202 = arg0.method7974();
		if (super.anInt6202 > 2) {
			super.anInt6202 = 2;
		}
		super.anInt6186 = super.anInt6202;
		super.aBoolean479 = arg0.method7974() == 1;
		super.anInt6185 = arg0.method7974();
		if (super.anInt6185 > 127) {
			super.anInt6185 = 127;
		}
		if (local21 >= 20) {
			super.anInt6205 = arg0.method7974();
			if (super.anInt6205 > 127) {
				super.anInt6205 = 127;
			}
		} else {
			super.anInt6205 = super.anInt6185;
		}
		super.anInt6189 = arg0.method7974();
		super.anInt6196 = arg0.method7974();
		if (super.anInt6196 > 127) {
			super.anInt6196 = 127;
		}
		if (local21 < 21) {
			super.anInt6192 = super.anInt6189;
		} else {
			super.anInt6192 = arg0.method7974();
			if (super.anInt6192 > 127) {
				super.anInt6192 = 127;
			}
		}
		if (local21 >= 1) {
			super.anInt6190 = arg0.method7945();
			super.anInt6201 = arg0.method7945();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method7974();
		}
		@Pc(563) int local563;
		if (local21 >= 4) {
			local563 = arg0.method7974();
			if (local563 < 0 || local563 > 2) {
				local563 = 0;
			}
			if (Static221.anInt4095 < 96) {
				local563 = 0;
			}
			Static386.method5577(local563);
		}
		if (local21 >= 5) {
			super.anInt6194 = arg0.method7940();
		}
		local563 = 0;
		if (local21 >= 6) {
			super.anInt6199 = local563 = arg0.method7974();
		}
		if (super.anInt6199 != 1 && super.anInt6199 != 2) {
			super.anInt6199 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean482 = arg0.method7974() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean485 = arg0.method7974() == 1;
		}
		if (local21 >= 9) {
			super.anInt6197 = arg0.method7974();
		}
		if (super.anInt6197 < 0 || super.anInt6197 > Static523.method6293(Static221.anInt4095)) {
			super.anInt6197 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean474 = arg0.method7974() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean481 = arg0.method7974() != 0;
		}
		if (local21 >= 12) {
			super.anInt6193 = arg0.method7974();
		}
		if (super.anInt6193 < 0 || super.anInt6193 > 2) {
			super.anInt6193 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean480 = arg0.method7974() == 1;
		}
		if (local21 >= 14) {
			super.anInt6200 = arg0.method7974();
		} else if (local563 == 0) {
			super.anInt6200 = 2;
		} else {
			super.anInt6200 = 1;
		}
		if (super.anInt6200 < 0 || super.anInt6200 > 5) {
			super.anInt6200 = 2;
		}
		if (local21 >= 15) {
			super.anInt6204 = arg0.method7974();
			if (super.anInt6204 < 0 || super.anInt6204 > 4) {
				super.anInt6204 = Static107.anInt1802 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean475 = arg0.method7974() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean475 = false;
				}
			} catch (@Pc(834) Throwable local834) {
			}
		}
		if (local21 < 17 && super.anInt6200 == 0) {
			super.anInt6200 = 2;
		}
		if (local21 >= 18) {
			super.anInt6195 = arg0.method7974();
			if (super.anInt6195 < 0 || super.anInt6195 > 4) {
				super.anInt6195 = 0;
			}
		}
		if (local21 >= 19) {
			super.anInt6182 = arg0.method7974();
		} else if (super.anInt6195 == 1 || super.anInt6195 == 2) {
			super.anInt6182 = 2;
		} else if (super.anInt6195 == 3) {
			super.anInt6182 = 1;
		} else {
			super.anInt6182 = 0;
		}
		if (local21 >= 22) {
			super.anInt6180 = arg0.method7974();
		}
		if (super.anInt6200 == 0 && Static221.anInt4095 < 96 && super.anInt6195 != 1 && super.anInt6195 != 0) {
			this.method5043(false);
		}
	}

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "(II)V")
	public void method5042(@OriginalArg(0) int arg0) {
		super.anInt6182 = arg0;
		Static174.aBoolean239 = true;
		Static188.aClass19Array1 = null;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZB)V")
	public void method5043(@OriginalArg(0) boolean arg0) {
		this.method5036(false);
		super.aBoolean483 = false;
		super.aBoolean487 = !Static101.aClass42_1.equals(Static354.aClass42_4);
		super.anInt6198 = super.anInt6191 = 0;
		super.aBoolean486 = false;
		super.anInt6193 = 0;
		super.aBoolean478 = false;
		super.aBoolean476 = false;
		super.aBoolean473 = false;
		super.anInt6202 = super.anInt6186 = 0;
		super.aBoolean475 = false;
		super.aBoolean488 = false;
		super.aBoolean484 = false;
		super.aBoolean472 = false;
		super.aBoolean477 = false;
		Static386.method5577(0);
		super.anInt6197 = 0;
		super.aBoolean474 = false;
		super.aBoolean480 = false;
		this.method5031();
		this.method5042(2);
		super.anInt6195 = 1;
		if (arg0) {
			Static308.method4625();
		}
		Static585.method7837();
	}

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "(B)V")
	public void method5044() {
		this.method5036(true);
		super.aBoolean475 = true;
		super.anInt6202 = super.anInt6186 = 0;
		super.aBoolean478 = true;
		super.aBoolean473 = true;
		super.anInt6193 = 1;
		super.aBoolean484 = true;
		super.aBoolean486 = true;
		super.aBoolean483 = true;
		super.aBoolean472 = true;
		super.aBoolean477 = true;
		super.anInt6198 = super.anInt6191 = 2;
		super.aBoolean488 = true;
		super.aBoolean476 = true;
		super.aBoolean487 = true;
		if (Static221.anInt4095 <= 95) {
			Static386.method5577(0);
		} else {
			Static386.method5577(2);
		}
		super.aBoolean480 = true;
		super.aBoolean474 = false;
		super.anInt6197 = 0;
		this.method5031();
		this.method5042(0);
		super.anInt6195 = 4;
		Static308.method4625();
		Static585.method7837();
	}
}
