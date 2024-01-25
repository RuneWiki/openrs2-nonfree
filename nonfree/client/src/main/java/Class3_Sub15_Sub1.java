import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class3_Sub15_Sub1 extends Class3_Sub15 {

	@OriginalMember(owner = "client!ti", name = "Fb", descriptor = "I")
	public int anInt8403;

	@OriginalMember(owner = "client!ti", name = "qb", descriptor = "Z")
	public boolean aBoolean611 = false;

	@OriginalMember(owner = "client!ti", name = "mb", descriptor = "Z")
	public boolean aBoolean610 = false;

	@OriginalMember(owner = "client!ti", name = "rb", descriptor = "Z")
	public boolean aBoolean612 = false;

	@OriginalMember(owner = "client!ti", name = "Ab", descriptor = "Z")
	public boolean aBoolean613 = false;

	@OriginalMember(owner = "client!ti", name = "Gb", descriptor = "Z")
	public boolean aBoolean614 = false;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!tq;)V")
	public Class3_Sub15_Sub1(@OriginalArg(0) Class285 arg0) {
		super.anInt8383 = 3;
		super.anInt8374 = 3;
		this.method6967(true);
		super.anInt8361 = 2;
		super.anInt8368 = 1;
		super.anInt8375 = 0;
		super.anInt8372 = 0;
		super.aBoolean599 = true;
		super.anInt8370 = 127;
		super.anInt8367 = 0;
		super.anInt8357 = 127;
		super.aBoolean607 = true;
		super.aBoolean609 = true;
		super.aBoolean608 = true;
		super.aBoolean605 = true;
		super.aBoolean598 = true;
		super.aBoolean597 = true;
		super.aBoolean596 = true;
		super.aBoolean600 = false;
		super.anInt8366 = 0;
		super.anInt8382 = 127;
		super.anInt8362 = 127;
		super.aBoolean606 = true;
		super.anInt8380 = 0;
		super.anInt8360 = 127;
		super.aBoolean592 = true;
		if (Class5_Sub1.lb < 96) {
			Static385.method5947(0);
		} else {
			Static385.method5947(2);
		}
		super.anInt8369 = 2;
		super.anInt8379 = 2;
		super.anInt8378 = Static277.anInt5700 == 1 ? 2 : 4;
		super.aBoolean593 = false;
		super.aBoolean601 = true;
		super.aBoolean595 = false;
		super.anInt8363 = 0;
		super.aBoolean604 = false;
		super.anInt8365 = 0;
		super.anInt8384 = 0;
		super.aBoolean594 = true;
		@Pc(152) Class323 local152 = null;
		try {
			@Pc(158) Class212 local158 = arg0.method7034(true, "");
			while (local158.anInt6547 == 0) {
				Static327.method5231(1L);
			}
			if (local158.anInt6547 == 1) {
				local152 = (Class323) local158.anObject13;
				@Pc(180) byte[] local180 = new byte[(int) local152.method7799()];
				@Pc(195) int local195;
				for (@Pc(182) int local182 = 0; local182 < local180.length; local182 += local195) {
					local195 = local152.method7797(local182, local180, local180.length - local182);
					if (local195 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method6961(new Class3_Sub27(local180));
			}
		} catch (@Pc(221) Exception local221) {
		}
		try {
			if (local152 != null) {
				local152.method7794();
			}
		} catch (@Pc(228) Exception local228) {
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	private void method6950() {
		if (Static277.anInt5700 > 1) {
			super.anInt8378 = 4;
		} else {
			super.anInt8378 = 2;
		}
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V")
	public void method6951() {
		this.method6967(true);
		super.aBoolean602 = true;
		super.aBoolean599 = true;
		super.aBoolean609 = true;
		super.aBoolean597 = true;
		super.aBoolean600 = true;
		super.anInt8361 = super.anInt8367 = 2;
		super.aBoolean596 = true;
		super.anInt8368 = 1;
		super.aBoolean606 = true;
		super.anInt8375 = super.anInt8366 = 0;
		super.aBoolean607 = true;
		super.aBoolean605 = true;
		super.aBoolean598 = true;
		super.aBoolean608 = true;
		if (Class5_Sub1.lb > 95) {
			Static385.method5947(2);
		} else {
			Static385.method5947(0);
		}
		super.anInt8365 = 0;
		super.aBoolean595 = false;
		super.aBoolean601 = true;
		this.method6950();
		this.method6960(0);
		super.anInt8383 = 4;
		Static467.method6980();
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
	public void method6952() {
		this.method6967(true);
		super.anInt8361 = super.anInt8367 = 1;
		super.aBoolean608 = true;
		super.aBoolean598 = true;
		super.aBoolean607 = false;
		super.aBoolean599 = true;
		super.aBoolean602 = true;
		super.aBoolean605 = true;
		super.aBoolean606 = true;
		super.aBoolean600 = false;
		super.anInt8368 = 1;
		super.aBoolean609 = true;
		super.anInt8375 = super.anInt8366 = 0;
		super.aBoolean597 = true;
		super.aBoolean596 = true;
		if (Class5_Sub1.lb > 95) {
			Static385.method5947(1);
		} else {
			Static385.method5947(0);
		}
		super.aBoolean601 = true;
		super.anInt8365 = 0;
		super.aBoolean595 = false;
		this.method6950();
		this.method6960(1);
		super.anInt8383 = 3;
		Static467.method6980();
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(IB)I")
	private int method6953(@OriginalArg(0) int arg0) {
		@Pc(15) byte local15;
		if (arg0 > 12000) {
			local15 = 4;
			this.method6951();
		} else if (arg0 > 5000) {
			local15 = 3;
			this.method6952();
		} else if (arg0 <= 2000) {
			local15 = 1;
			this.method6958();
		} else {
			this.method6965();
			local15 = 2;
		}
		if (Static382.anInt7091 != 2) {
			super.anInt8379 = 2;
			Static269.method4698(2);
		}
		this.method6968(Static401.aClass285_11);
		return local15;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
	public boolean method6954(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean613 ? super.aBoolean603 : true;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I")
	public int method6955(@OriginalArg(1) int arg0) {
		if (Static197.method3742(arg0)) {
			return Class5_Sub1.lb < 96 && Static398.method6077(arg0) && super.anInt8384 == 0 ? 1 : super.anInt8384;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)Z")
	public boolean method6956(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean603 : true;
	}

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
	public void method6958() {
		this.method6967(false);
		super.aBoolean609 = false;
		super.anInt8368 = 0;
		super.aBoolean598 = false;
		super.aBoolean597 = false;
		super.aBoolean602 = false;
		super.aBoolean606 = false;
		super.aBoolean600 = false;
		super.anInt8361 = super.anInt8367 = 0;
		super.aBoolean605 = false;
		super.aBoolean607 = false;
		super.aBoolean596 = false;
		super.anInt8375 = super.anInt8366 = 0;
		super.aBoolean608 = false;
		super.aBoolean599 = false;
		Static385.method5947(0);
		super.anInt8365 = 0;
		super.aBoolean601 = false;
		super.aBoolean595 = false;
		this.method6950();
		this.method6960(2);
		super.anInt8383 = 1;
		Static467.method6980();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
	private int method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) byte local15;
		if (arg1 > 20000) {
			this.method6951();
			local15 = 4;
		} else if (arg1 > 10000) {
			this.method6952();
			local15 = 3;
		} else if (arg1 <= 5000) {
			this.method6958();
			local15 = 1;
		} else {
			local15 = 2;
			this.method6965();
		}
		if (arg0 != Static382.anInt7091) {
			super.anInt8379 = arg0;
			Static269.method4698(arg0);
		}
		this.method6968(Static401.aClass285_11);
		return local15;
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(II)V")
	public void method6960(@OriginalArg(0) int arg0) {
		Static17.aBoolean318 = true;
		super.anInt8384 = arg0;
		Static544.aClass204Array1 = null;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!rt;I)V")
	private void method6961(@OriginalArg(0) Class3_Sub27 arg0) {
		if (arg0.aByteArray114.length - arg0.anInt9191 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method7548();
		if (local22 < 0 || local22 > 21) {
			return;
		}
		@Pc(38) byte local38;
		if (local22 == 21) {
			local38 = 44;
		} else if (local22 == 20) {
			local38 = 43;
		} else if (local22 == 19) {
			local38 = 42;
		} else if (local22 == 18) {
			local38 = 41;
		} else if (local22 == 17) {
			local38 = 40;
		} else if (local22 == 16) {
			local38 = 38;
		} else if (local22 == 15) {
			local38 = 37;
		} else if (local22 == 14) {
			local38 = 36;
		} else if (local22 == 13) {
			local38 = 35;
		} else if (local22 == 12) {
			local38 = 34;
		} else if (local22 == 11) {
			local38 = 33;
		} else if (local22 == 10) {
			local38 = 32;
		} else if (local22 == 9) {
			local38 = 31;
		} else if (local22 == 8) {
			local38 = 30;
		} else if (local22 == 7) {
			local38 = 29;
		} else if (local22 == 6) {
			local38 = 28;
		} else if (local22 == 5) {
			local38 = 28;
		} else if (local22 == 4) {
			local38 = 24;
		} else if (local22 == 3) {
			local38 = 23;
		} else if (local22 == 2) {
			local38 = 22;
		} else if (local22 == 1) {
			local38 = 23;
		} else {
			local38 = 19;
		}
		if (local38 > arg0.aByteArray114.length - arg0.anInt9191) {
			return;
		}
		super.anInt8374 = arg0.method7548();
		if (super.anInt8374 < 1) {
			super.anInt8374 = 1;
		} else if (super.anInt8374 > 4) {
			super.anInt8374 = 4;
		}
		this.method6967(arg0.method7548() == 1);
		super.aBoolean597 = arg0.method7548() == 1;
		super.aBoolean605 = arg0.method7548() == 1;
		super.aBoolean609 = arg0.method7548() == 1;
		super.anInt8368 = arg0.method7548() == 1 ? 1 : 0;
		super.aBoolean598 = arg0.method7548() == 1;
		super.aBoolean599 = arg0.method7548() == 1;
		super.aBoolean608 = arg0.method7548() == 1;
		super.anInt8361 = arg0.method7548();
		if (super.anInt8361 > 2) {
			super.anInt8361 = 2;
		}
		if (local22 >= 17) {
			super.anInt8367 = arg0.method7548();
		}
		if (local22 < 2) {
			super.aBoolean596 = arg0.method7548() == 1;
			arg0.method7548();
		} else {
			super.aBoolean596 = arg0.method7548() == 1;
			if (local22 >= 17) {
				super.aBoolean600 = arg0.method7548() == 1;
			}
		}
		super.aBoolean607 = arg0.method7548() == 1;
		super.aBoolean606 = arg0.method7548() == 1;
		super.anInt8375 = arg0.method7548();
		if (super.anInt8375 > 2) {
			super.anInt8375 = 2;
		}
		super.anInt8366 = super.anInt8375;
		super.aBoolean592 = arg0.method7548() == 1;
		super.anInt8362 = arg0.method7548();
		if (super.anInt8362 > 127) {
			super.anInt8362 = 127;
		}
		if (local22 < 20) {
			super.anInt8360 = super.anInt8362;
		} else {
			super.anInt8360 = arg0.method7548();
			if (super.anInt8360 > 127) {
				super.anInt8360 = 127;
			}
		}
		super.anInt8382 = arg0.method7548();
		super.anInt8370 = arg0.method7548();
		if (super.anInt8370 > 127) {
			super.anInt8370 = 127;
		}
		if (local22 >= 21) {
			super.anInt8357 = arg0.method7548();
			if (super.anInt8357 > 127) {
				super.anInt8357 = 127;
			}
		} else {
			super.anInt8357 = super.anInt8382;
		}
		if (local22 >= 1) {
			super.anInt8372 = arg0.method7591();
			super.anInt8380 = arg0.method7591();
		}
		if (local22 >= 3 && local22 < 6) {
			arg0.method7548();
		}
		@Pc(564) int local564;
		if (local22 >= 4) {
			local564 = arg0.method7548();
			if (local564 < 0 || local564 > 2) {
				local564 = 0;
			}
			if (Class5_Sub1.lb < 96) {
				local564 = 0;
			}
			Static385.method5947(local564);
		}
		if (local22 >= 5) {
			super.anInt8363 = arg0.method7549();
		}
		local564 = 0;
		if (local22 >= 6) {
			super.anInt8369 = local564 = arg0.method7548();
		}
		if (super.anInt8369 != 1 && super.anInt8369 != 2) {
			super.anInt8369 = 2;
		}
		if (local22 >= 7) {
			super.aBoolean593 = arg0.method7548() == 1;
		}
		if (local22 >= 8) {
			super.aBoolean604 = arg0.method7548() == 1;
		}
		if (local22 >= 9) {
			super.anInt8365 = arg0.method7548();
		}
		if (super.anInt8365 < 0 || super.anInt8365 > Static315.method5109(Class5_Sub1.lb)) {
			super.anInt8365 = 0;
		}
		if (local22 >= 10) {
			super.aBoolean595 = arg0.method7548() != 0;
		}
		if (local22 >= 11) {
			super.aBoolean594 = arg0.method7548() != 0;
		}
		if (local22 >= 12) {
			super.anInt8368 = arg0.method7548();
		}
		if (super.anInt8368 < 0 || super.anInt8368 > 2) {
			super.anInt8368 = 1;
		}
		if (local22 >= 13) {
			super.aBoolean601 = arg0.method7548() == 1;
		}
		if (local22 >= 14) {
			super.anInt8379 = arg0.method7548();
		} else if (local564 == 0) {
			super.anInt8379 = 2;
		} else {
			super.anInt8379 = 1;
		}
		if (super.anInt8379 < 0 || super.anInt8379 > 5) {
			super.anInt8379 = 2;
		}
		if (local22 >= 15) {
			super.anInt8378 = arg0.method7548();
			if (super.anInt8378 < 0 || super.anInt8378 > 4) {
				super.anInt8378 = Static277.anInt5700 == 1 ? 2 : 4;
			}
		}
		if (local22 >= 16) {
			super.aBoolean602 = arg0.method7548() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean602 = false;
				}
			} catch (@Pc(832) Throwable local832) {
			}
		}
		if (local22 < 17 && super.anInt8379 == 0) {
			super.anInt8379 = 2;
		}
		if (local22 >= 18) {
			super.anInt8383 = arg0.method7548();
			if (super.anInt8383 < 0 || super.anInt8383 > 4) {
				super.anInt8383 = 0;
			}
		}
		if (local22 >= 19) {
			super.anInt8384 = arg0.method7548();
		} else if (super.anInt8383 == 1 || super.anInt8383 == 2) {
			super.anInt8384 = 2;
		} else if (super.anInt8383 == 3) {
			super.anInt8384 = 1;
		} else {
			super.anInt8384 = 0;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
	public int method6962() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static401.aClass285_11.aBoolean625 && !Static401.aClass285_11.aBoolean624) {
			if (Static472.aString75.startsWith("win")) {
				local11 = true;
				local9 = true;
				if (!Static472.aString79.startsWith("amd64") && !Static472.aString79.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean612) {
			local9 = false;
		}
		if (this.aBoolean614) {
			local7 = false;
		}
		if (this.aBoolean611) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method6963();
		}
		@Pc(74) int local74 = -1;
		@Pc(76) int local76 = -1;
		@Pc(78) int local78 = -1;
		if (local7) {
			try {
				local74 = Static6.method6470(2, 1000);
			} catch (@Pc(87) Exception local87) {
			}
		}
		if (local11) {
			try {
				local78 = Static6.method6470(3, 1000);
				if (Static382.anInt7091 == 3) {
					@Pc(103) Class207 local103 = Static121.aClass5_7.method7430();
					@Pc(108) long local108 = local103.aLong188 & 0xFFFFFFFFFFFFL;
					@Pc(111) int local111 = local103.anInt6309;
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
				local76 = Static6.method6470(1, 1000);
			} catch (@Pc(159) Exception local159) {
			}
		}
		if (local74 == -1 && local76 == -1 && local78 == -1) {
			return this.method6963();
		} else if (local74 > local78 && local76 < local74) {
			return this.method6953(local74);
		} else if (local78 <= local76) {
			return this.method6959(1, local76);
		} else {
			return this.method6959(3, local78);
		}
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)I")
	private int method6963() {
		@Pc(18) byte local18;
		if (Class5_Sub1.lb < 96) {
			local18 = 1;
			this.method6958();
		} else {
			@Pc(28) int local28 = Static379.method5911();
			if (local28 <= 100) {
				this.method6951();
				local18 = 4;
			} else if (local28 <= 500) {
				local18 = 3;
				this.method6952();
			} else if (local28 <= 1000) {
				local18 = 2;
				this.method6965();
			} else {
				this.method6958();
				local18 = 1;
			}
		}
		if (Static382.anInt7091 != 0) {
			super.anInt8379 = 0;
			Static269.method4698(0);
		}
		this.method6968(Static401.aClass285_11);
		return local18;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(II)I")
	public int method6964(@OriginalArg(0) int arg0) {
		if (this.aBoolean610) {
			return 0;
		} else if (this.method6954(arg0)) {
			return super.aBoolean597 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
	public void method6965() {
		this.method6967(true);
		super.aBoolean609 = false;
		super.aBoolean596 = false;
		super.aBoolean607 = false;
		super.aBoolean605 = true;
		super.aBoolean598 = false;
		super.anInt8368 = 0;
		super.aBoolean608 = false;
		super.anInt8361 = super.anInt8367 = 0;
		super.aBoolean599 = false;
		super.anInt8375 = super.anInt8366 = 0;
		super.aBoolean606 = false;
		super.aBoolean602 = false;
		super.aBoolean597 = false;
		super.aBoolean600 = false;
		Static385.method5947(0);
		super.anInt8365 = 0;
		super.aBoolean601 = true;
		super.aBoolean595 = false;
		this.method6950();
		this.method6960(2);
		super.anInt8383 = 2;
		Static467.method6980();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
	public void method6967(@OriginalArg(0) boolean arg0) {
		super.aBoolean603 = arg0;
		if (Static454.aClass298_3 != null) {
			Static454.aClass298_3.method7187(!this.method6954(Static382.anInt7091));
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!tq;I)V")
	public void method6968(@OriginalArg(0) Class285 arg0) {
		@Pc(7) Class323 local7 = null;
		try {
			@Pc(13) Class212 local13 = arg0.method7034(true, "");
			while (local13.anInt6547 == 0) {
				Static327.method5231(1L);
			}
			if (local13.anInt6547 == 1) {
				local7 = (Class323) local13.anObject13;
				@Pc(37) Class3_Sub27 local37 = new Class3_Sub27(Static97.method1905());
				this.method6947(local37);
				local7.method7795(local37.anInt9191, local37.aByteArray114, 0);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local7 != null) {
				local7.method7794();
			}
		} catch (@Pc(64) Exception local64) {
		}
	}
}
