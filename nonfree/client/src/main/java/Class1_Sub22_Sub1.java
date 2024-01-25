import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class1_Sub22_Sub1 extends Class1_Sub22 {

	@OriginalMember(owner = "client!lw", name = "wb", descriptor = "I")
	public int anInt5469;

	@OriginalMember(owner = "client!lw", name = "hb", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!lw", name = "fb", descriptor = "Z")
	public boolean aBoolean397 = false;

	@OriginalMember(owner = "client!lw", name = "kb", descriptor = "Z")
	public boolean aBoolean399 = false;

	@OriginalMember(owner = "client!lw", name = "sb", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!lw", name = "qb", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!gaa;)V")
	public Class1_Sub22_Sub1(@OriginalArg(0) Class102 arg0) {
		super.anInt5447 = 3;
		super.anInt5440 = 3;
		this.method4671(true);
		super.aBoolean385 = true;
		super.aBoolean391 = true;
		super.anInt5436 = 0;
		super.anInt5456 = 0;
		super.anInt5431 = 127;
		super.anInt5439 = 127;
		super.aBoolean395 = true;
		super.aBoolean381 = true;
		super.aBoolean386 = false;
		super.anInt5443 = 0;
		super.aBoolean379 = true;
		super.anInt5455 = 0;
		super.anInt5449 = 1;
		super.anInt5445 = 0;
		super.aBoolean380 = true;
		super.aBoolean394 = true;
		super.aBoolean392 = true;
		super.aBoolean388 = true;
		super.aBoolean393 = true;
		super.anInt5444 = 127;
		super.anInt5442 = 2;
		if (Static17.anInt454 >= 96) {
			Static26.method592(2);
		} else {
			Static26.method592(0);
		}
		super.aBoolean383 = true;
		super.aBoolean390 = true;
		super.anInt5453 = 0;
		super.anInt5450 = 0;
		super.aBoolean382 = false;
		super.aBoolean387 = false;
		super.anInt5437 = 2;
		super.aBoolean389 = false;
		super.anInt5429 = 2;
		super.anInt5435 = Static493.anInt8166 == 1 ? 2 : 4;
		@Pc(141) Class177 local141 = null;
		try {
			@Pc(147) Class157 local147 = arg0.method2388(true, "");
			while (local147.anInt4742 == 0) {
				Static209.method3565(1L);
			}
			if (local147.anInt4742 == 1) {
				local141 = (Class177) local147.anObject12;
				@Pc(169) byte[] local169 = new byte[(int) local141.method4410()];
				@Pc(184) int local184;
				for (@Pc(171) int local171 = 0; local171 < local169.length; local171 += local184) {
					local184 = local141.method4406(local169.length - local171, local169, local171);
					if (local184 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4657(new Class1_Sub6(local169));
			}
		} catch (@Pc(214) Exception local214) {
		}
		try {
			if (local141 != null) {
				local141.method4411();
			}
		} catch (@Pc(221) Exception local221) {
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)V")
	public void method4656() {
		this.method4671(false);
		super.aBoolean392 = false;
		super.aBoolean393 = false;
		super.anInt5443 = super.anInt5445 = 0;
		super.anInt5449 = 0;
		super.anInt5442 = super.anInt5436 = 0;
		super.aBoolean380 = false;
		super.aBoolean391 = false;
		super.aBoolean385 = false;
		super.aBoolean379 = false;
		super.aBoolean394 = false;
		super.aBoolean386 = false;
		super.aBoolean396 = false;
		super.aBoolean388 = false;
		super.aBoolean395 = false;
		Static26.method592(0);
		super.aBoolean387 = false;
		super.anInt5450 = 0;
		super.aBoolean383 = false;
		this.method4665();
		super.anInt5440 = 1;
		Static205.method3533();
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(ILclient!ge;)V")
	private void method4657(@OriginalArg(1) Class1_Sub6 arg0) {
		if (arg0.aByteArray66.length - arg0.anInt4555 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method3922();
		if (local21 < 0 || local21 > 18) {
			return;
		}
		@Pc(39) byte local39;
		if (local21 == 18) {
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
		if (local39 > arg0.aByteArray66.length - arg0.anInt4555) {
			return;
		}
		super.anInt5447 = arg0.method3922();
		if (super.anInt5447 < 1) {
			super.anInt5447 = 1;
		} else if (super.anInt5447 > 4) {
			super.anInt5447 = 4;
		}
		this.method4671(arg0.method3922() == 1);
		super.aBoolean393 = arg0.method3922() == 1;
		super.aBoolean380 = arg0.method3922() == 1;
		super.aBoolean395 = arg0.method3922() == 1;
		super.anInt5449 = arg0.method3922() == 1 ? 1 : 0;
		super.aBoolean379 = arg0.method3922() == 1;
		super.aBoolean388 = arg0.method3922() == 1;
		super.aBoolean394 = arg0.method3922() == 1;
		super.anInt5442 = arg0.method3922();
		if (super.anInt5442 > 2) {
			super.anInt5442 = 2;
		}
		if (local21 >= 17) {
			super.anInt5436 = arg0.method3922();
		}
		if (local21 >= 2) {
			super.aBoolean385 = arg0.method3922() == 1;
			if (local21 >= 17) {
				super.aBoolean386 = arg0.method3922() == 1;
			}
		} else {
			super.aBoolean385 = arg0.method3922() == 1;
			arg0.method3922();
		}
		super.aBoolean392 = arg0.method3922() == 1;
		super.aBoolean391 = arg0.method3922() == 1;
		super.anInt5443 = arg0.method3922();
		if (super.anInt5443 > 2) {
			super.anInt5443 = 2;
		}
		super.anInt5445 = super.anInt5443;
		super.aBoolean381 = arg0.method3922() == 1;
		super.anInt5444 = arg0.method3922();
		if (super.anInt5444 > 127) {
			super.anInt5444 = 127;
		}
		super.anInt5439 = arg0.method3922();
		super.anInt5431 = arg0.method3922();
		if (super.anInt5431 > 127) {
			super.anInt5431 = 127;
		}
		if (local21 >= 1) {
			super.anInt5455 = arg0.method3967();
			super.anInt5456 = arg0.method3967();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method3922();
		}
		@Pc(493) int local493;
		if (local21 >= 4) {
			local493 = arg0.method3922();
			if (local493 < 0 || local493 > 2) {
				local493 = 0;
			}
			if (Static17.anInt454 < 96) {
				local493 = 0;
			}
			Static26.method592(local493);
		}
		if (local21 >= 5) {
			super.anInt5453 = arg0.method3925();
		}
		local493 = 0;
		if (local21 >= 6) {
			super.anInt5429 = local493 = arg0.method3922();
		}
		if (super.anInt5429 != 1 && super.anInt5429 != 2) {
			super.anInt5429 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean382 = arg0.method3922() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean389 = arg0.method3922() == 1;
		}
		if (local21 >= 9) {
			super.anInt5450 = arg0.method3922();
		}
		if (super.anInt5450 < 0 || super.anInt5450 > Static238.method5129(Static17.anInt454)) {
			super.anInt5450 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean387 = arg0.method3922() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean390 = arg0.method3922() != 0;
		}
		if (local21 >= 12) {
			super.anInt5449 = arg0.method3922();
		}
		if (super.anInt5449 < 0 || super.anInt5449 > 2) {
			super.anInt5449 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean383 = arg0.method3922() == 1;
		}
		if (local21 >= 14) {
			super.anInt5437 = arg0.method3922();
		} else if (local493 == 0) {
			super.anInt5437 = 2;
		} else {
			super.anInt5437 = 1;
		}
		if (super.anInt5437 < 0 || super.anInt5437 > 5) {
			super.anInt5437 = 2;
		}
		if (local21 >= 15) {
			super.anInt5435 = arg0.method3922();
			if (super.anInt5435 < 0 || super.anInt5435 > 4) {
				super.anInt5435 = Static493.anInt8166 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean396 = arg0.method3922() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean396 = false;
				}
			} catch (@Pc(754) Throwable local754) {
			}
		}
		if (local21 < 17 && super.anInt5437 == 0) {
			super.anInt5437 = 2;
		}
		if (local21 < 18) {
			return;
		}
		super.anInt5440 = arg0.method3922();
		if (super.anInt5440 < 0 || super.anInt5440 > 4) {
			super.anInt5440 = 0;
		}
		if (super.anInt5440 == 2) {
			super.aBoolean380 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I")
	public int method4658() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static151.anInt2788 != 3 && Static151.anInt2788 != 2) {
			if (Static151.aString31.startsWith("win")) {
				local11 = true;
				local9 = true;
				if (!Static151.aString28.startsWith("amd64") && !Static151.aString28.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean400) {
			local7 = false;
		}
		if (this.aBoolean398) {
			local11 = false;
		}
		if (this.aBoolean397) {
			local9 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method4672();
		}
		@Pc(74) int local74 = -1;
		@Pc(76) int local76 = -1;
		if (local7) {
			try {
				local74 = Static109.method3482(1000, 2);
			} catch (@Pc(85) Exception local85) {
			}
		}
		@Pc(88) int local88 = -1;
		if (local11) {
			try {
				local88 = Static109.method3482(1000, 3);
				if (Static374.anInt6861 == 3) {
					@Pc(101) Class246 local101 = Static513.aClass122_10.method7276();
					@Pc(106) long local106 = local101.aLong297 & 0xFFFFFFFFFFFFL;
					@Pc(109) int local109 = local101.anInt7036;
					if (local109 == 4318) {
						local9 &= local106 >= 64425238954L;
					} else if (local109 == 4098) {
						local9 &= local106 >= 60129613779L;
					}
				}
			} catch (@Pc(143) Exception local143) {
			}
		}
		if (local9) {
			try {
				local76 = Static109.method3482(1000, 1);
			} catch (@Pc(153) Exception local153) {
			}
		}
		if (local74 == -1 && local76 == -1 && local88 == -1) {
			return this.method4672();
		} else if (local88 < local74 && local74 > local76) {
			return this.method4667(local74);
		} else if (local76 < local88) {
			return this.method4669(local88, 3);
		} else {
			return this.method4669(local76, 1);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!gaa;)V")
	public void method4660(@OriginalArg(1) Class102 arg0) {
		@Pc(7) Class177 local7 = null;
		try {
			@Pc(20) Class157 local20 = arg0.method2388(true, "");
			while (local20.anInt4742 == 0) {
				Static209.method3565(1L);
			}
			if (local20.anInt4742 == 1) {
				local7 = (Class177) local20.anObject12;
				@Pc(44) Class1_Sub6 local44 = new Class1_Sub6(Static23.method7118());
				this.method4653(local44);
				local7.method4408(local44.anInt4555, local44.aByteArray66, 0);
			}
		} catch (@Pc(58) Exception local58) {
		}
		try {
			if (local7 != null) {
				local7.method4411();
			}
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)I")
	public int method4661(@OriginalArg(1) int arg0) {
		if (this.aBoolean399) {
			return 0;
		} else if (this.method4662(arg0)) {
			return super.aBoolean393 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(II)Z")
	public boolean method4662(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean401 ? super.aBoolean384 : true;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
	public void method4663() {
		this.method4671(true);
		super.anInt5442 = super.anInt5436 = 1;
		super.aBoolean394 = true;
		super.aBoolean386 = false;
		super.aBoolean379 = true;
		super.aBoolean396 = true;
		super.aBoolean393 = true;
		super.aBoolean391 = true;
		super.aBoolean395 = true;
		super.anInt5449 = 1;
		super.aBoolean388 = true;
		super.aBoolean392 = false;
		super.aBoolean380 = true;
		super.anInt5443 = super.anInt5445 = 0;
		super.aBoolean385 = true;
		if (Static17.anInt454 <= 95) {
			Static26.method592(0);
		} else {
			Static26.method592(1);
		}
		super.aBoolean387 = false;
		super.anInt5450 = 0;
		super.aBoolean383 = true;
		this.method4665();
		super.anInt5440 = 3;
		Static205.method3533();
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V")
	public void method4664() {
		this.method4671(true);
		super.aBoolean385 = false;
		super.aBoolean392 = false;
		super.anInt5443 = super.anInt5445 = 0;
		super.aBoolean380 = true;
		super.aBoolean395 = false;
		super.aBoolean396 = false;
		super.aBoolean379 = false;
		super.anInt5449 = 0;
		super.aBoolean394 = false;
		super.aBoolean393 = false;
		super.aBoolean386 = false;
		super.anInt5442 = super.anInt5436 = 0;
		super.aBoolean388 = false;
		super.aBoolean391 = false;
		Static26.method592(0);
		super.aBoolean387 = false;
		super.anInt5450 = 0;
		super.aBoolean383 = true;
		this.method4665();
		super.anInt5440 = 2;
		Static205.method3533();
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(Z)V")
	private void method4665() {
		if (Static493.anInt8166 <= 1) {
			super.anInt5435 = 2;
		} else {
			super.anInt5435 = 4;
		}
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(II)I")
	private int method4667(@OriginalArg(1) int arg0) {
		@Pc(18) byte local18;
		if (arg0 > 12000) {
			local18 = 4;
			this.method4668();
		} else if (arg0 > 5000) {
			this.method4663();
			local18 = 3;
		} else if (arg0 > 2000) {
			local18 = 2;
			this.method4664();
		} else {
			this.method4656();
			local18 = 1;
		}
		if (Static374.anInt6861 != 2) {
			super.anInt5437 = 2;
			Static390.method4905(2);
		}
		this.method4660(Static466.aClass102_4);
		return local18;
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V")
	public void method4668() {
		this.method4671(true);
		super.anInt5449 = 1;
		super.aBoolean385 = true;
		super.aBoolean379 = true;
		super.anInt5442 = super.anInt5436 = 2;
		super.aBoolean380 = true;
		super.aBoolean395 = true;
		super.aBoolean388 = true;
		super.aBoolean393 = true;
		super.aBoolean392 = true;
		super.aBoolean386 = true;
		super.aBoolean391 = true;
		super.aBoolean394 = true;
		super.aBoolean396 = true;
		super.anInt5443 = super.anInt5445 = 0;
		if (Static17.anInt454 > 95) {
			Static26.method592(2);
		} else {
			Static26.method592(0);
		}
		super.aBoolean387 = false;
		super.aBoolean383 = true;
		super.anInt5450 = 0;
		this.method4665();
		super.anInt5440 = 4;
		Static205.method3533();
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(BII)I")
	private int method4669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) byte local17;
		if (arg0 > 20000) {
			local17 = 4;
			this.method4668();
		} else if (arg0 > 10000) {
			this.method4663();
			local17 = 3;
		} else if (arg0 > 5000) {
			local17 = 2;
			this.method4664();
		} else {
			local17 = 1;
			this.method4656();
		}
		if (Static374.anInt6861 != arg1) {
			super.anInt5437 = arg1;
			Static390.method4905(arg1);
		}
		this.method4660(Static466.aClass102_4);
		return local17;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZB)V")
	public void method4671(@OriginalArg(0) boolean arg0) {
		super.aBoolean384 = arg0;
		if (Static308.aClass96_4 != null) {
			Static308.aClass96_4.method2271(!this.method4662(Static374.anInt6861));
		}
	}

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "(I)I")
	private int method4672() {
		@Pc(16) byte local16;
		if (Static17.anInt454 >= 96) {
			@Pc(11) int local11 = Static232.method4011();
			if (local11 <= 100) {
				local16 = 4;
				this.method4668();
			} else if (local11 <= 500) {
				local16 = 3;
				this.method4663();
			} else if (local11 > 1000) {
				local16 = 1;
				this.method4656();
			} else {
				this.method4664();
				local16 = 2;
			}
		} else {
			local16 = 1;
			this.method4656();
		}
		if (Static374.anInt6861 != 0) {
			super.anInt5437 = 0;
			Static390.method4905(0);
		}
		this.method4660(Static466.aClass102_4);
		return local16;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)Z")
	public boolean method4673(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean384 : true;
	}
}
