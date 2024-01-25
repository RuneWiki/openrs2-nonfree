import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!rd", name = "Db", descriptor = "I")
	public int anInt7592;

	@OriginalMember(owner = "client!rd", name = "lb", descriptor = "Z")
	public boolean lb = false;

	@OriginalMember(owner = "client!rd", name = "ib", descriptor = "Z")
	public boolean aBoolean595 = false;

	@OriginalMember(owner = "client!rd", name = "nb", descriptor = "Z")
	public boolean aBoolean596 = false;

	@OriginalMember(owner = "client!rd", name = "yb", descriptor = "Z")
	public boolean aBoolean598 = false;

	@OriginalMember(owner = "client!rd", name = "sb", descriptor = "Z")
	public boolean aBoolean597 = false;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class258 arg0) {
		super.anInt7572 = 3;
		super.anInt7552 = 3;
		this.method6321(true);
		super.anInt7565 = 0;
		super.aBoolean590 = true;
		super.anInt7557 = 0;
		super.aBoolean578 = false;
		super.anInt7569 = 0;
		super.aBoolean586 = true;
		super.anInt7553 = 127;
		super.anInt7561 = 127;
		super.aBoolean583 = true;
		super.anInt7577 = 127;
		super.anInt7559 = 127;
		super.aBoolean585 = true;
		super.aBoolean581 = true;
		super.aBoolean582 = true;
		super.anInt7555 = 127;
		super.aBoolean591 = true;
		super.aBoolean589 = true;
		super.anInt7560 = 0;
		super.anInt7566 = 2;
		super.anInt7576 = 1;
		super.anInt7575 = 0;
		super.aBoolean576 = true;
		super.aBoolean584 = true;
		if (Static350.anInt6083 < 96) {
			Static213.method6528(0);
		} else {
			Static213.method6528(2);
		}
		super.anInt7574 = 0;
		super.aBoolean580 = false;
		super.anInt7562 = 2;
		super.aBoolean588 = true;
		super.anInt7571 = 0;
		super.anInt7554 = 0;
		super.anInt7570 = 2;
		super.anInt7568 = Static488.anInt7961 == 1 ? 2 : 4;
		super.aBoolean587 = true;
		super.aBoolean577 = false;
		super.aBoolean594 = false;
		@Pc(152) Class204 local152 = null;
		try {
			@Pc(158) Class39 local158 = arg0.method5895("", true);
			while (local158.anInt894 == 0) {
				Static589.method7892(1L);
			}
			if (local158.anInt894 == 1) {
				local152 = (Class204) local158.anObject2;
				@Pc(185) byte[] local185 = new byte[(int) local152.method4676()];
				@Pc(200) int local200;
				for (@Pc(187) int local187 = 0; local187 < local185.length; local187 += local200) {
					local200 = local152.method4681(local185, local187, local185.length - local187);
					if (local200 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method6320(new Class3_Sub11(local185));
			}
		} catch (@Pc(226) Exception local226) {
		}
		try {
			if (local152 != null) {
				local152.method4677();
			}
		} catch (@Pc(233) Exception local233) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
	public void method6303(@OriginalArg(1) int arg0) {
		Static286.aClass306Array1 = null;
		Static307.aBoolean383 = true;
		super.anInt7554 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)I")
	private int method6304(@OriginalArg(1) int arg0) {
		@Pc(18) byte local18;
		if (arg0 > 12000) {
			this.method6319();
			local18 = 4;
		} else if (arg0 > 5000) {
			local18 = 3;
			this.method6306();
		} else if (arg0 <= 2000) {
			this.method6314(true);
			local18 = 1;
		} else {
			local18 = 2;
			this.method6307();
		}
		if (Static60.anInt1312 != 2) {
			super.anInt7562 = 2;
			Static486.method6610(2);
		}
		this.method6313(Static237.aClass258_3);
		return local18;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
	public int method6305() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static237.aClass258_3.aBoolean524 && !Static237.aClass258_3.aBoolean523) {
			if (Static408.aString61.startsWith("win")) {
				local9 = true;
				local11 = true;
				if (!Static408.aString59.startsWith("amd64") && !Static408.aString59.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.lb) {
			local11 = false;
		}
		if (this.aBoolean596) {
			local9 = false;
		}
		if (this.aBoolean595) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method6316();
		}
		@Pc(72) int local72 = -1;
		@Pc(74) int local74 = -1;
		@Pc(76) int local76 = -1;
		if (local7) {
			try {
				local72 = Static311.method4560(1000, 2);
			} catch (@Pc(85) Exception local85) {
			}
		}
		if (local11) {
			try {
				local76 = Static311.method4560(1000, 3);
				if (Static60.anInt1312 == 3) {
					@Pc(99) Class15 local99 = Static505.aClass45_11.method7401();
					@Pc(104) long local104 = local99.aLong12 & 0xFFFFFFFFFFFFL;
					@Pc(107) int local107 = local99.anInt307;
					if (local107 == 4318) {
						local9 &= local104 >= 64425238954L;
					} else if (local107 == 4098) {
						local9 &= local104 >= 60129613779L;
					}
				}
			} catch (@Pc(143) Exception local143) {
			}
		}
		if (local9) {
			try {
				local74 = Static311.method4560(1000, 1);
			} catch (@Pc(153) Exception local153) {
			}
		}
		if (local72 == -1 && local74 == -1 && local76 == -1) {
			return this.method6316();
		}
		local74 = (int) ((float) local74 * 1.1F);
		local76 = (int) ((float) local76 * 1.1F);
		if (local76 < local72 && local74 < local72) {
			return this.method6304(local72);
		} else if (local74 >= local76) {
			return this.method6318(1, local74);
		} else {
			return this.method6318(3, local76);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
	public void method6306() {
		this.method6321(true);
		super.anInt7576 = 1;
		super.aBoolean590 = true;
		super.aBoolean576 = true;
		super.anInt7565 = super.anInt7557 = 0;
		super.aBoolean582 = true;
		super.aBoolean581 = true;
		super.anInt7566 = super.anInt7575 = 1;
		super.aBoolean591 = true;
		super.aBoolean585 = true;
		super.aBoolean583 = true;
		super.aBoolean589 = false;
		super.aBoolean579 = true;
		super.aBoolean578 = false;
		super.aBoolean584 = true;
		if (Static350.anInt6083 <= 95) {
			Static213.method6528(0);
		} else {
			Static213.method6528(1);
		}
		super.aBoolean588 = true;
		super.anInt7571 = 0;
		super.aBoolean580 = false;
		this.method6317();
		this.method6303(1);
		super.anInt7572 = 3;
		Static563.method7599();
		Static428.method6060();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public void method6307() {
		this.method6321(true);
		super.aBoolean589 = false;
		super.aBoolean579 = false;
		super.anInt7576 = 0;
		super.aBoolean581 = false;
		super.aBoolean591 = true;
		super.aBoolean576 = false;
		super.aBoolean578 = false;
		super.aBoolean583 = false;
		super.aBoolean584 = false;
		super.anInt7565 = super.anInt7557 = 0;
		super.aBoolean585 = false;
		super.aBoolean590 = false;
		super.anInt7566 = super.anInt7575 = 0;
		super.aBoolean582 = false;
		Static213.method6528(0);
		super.aBoolean580 = false;
		super.aBoolean588 = true;
		super.anInt7571 = 0;
		this.method6317();
		this.method6303(2);
		super.anInt7572 = 2;
		Static563.method7599();
		Static428.method6060();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)I")
	public int method6310(@OriginalArg(0) int arg0) {
		if (Static376.method5511(arg0) && !Static309.method4507(Static32.anInt602)) {
			return Static350.anInt6083 < 96 && Static477.method6558(arg0) && super.anInt7554 == 0 ? 1 : super.anInt7554;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)I")
	public int method6311(@OriginalArg(1) int arg0) {
		if (this.aBoolean598) {
			return 0;
		} else if (this.method6312(arg0)) {
			return super.aBoolean585 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)Z")
	public boolean method6312(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean597 ? super.aBoolean592 : true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!pi;)V")
	public void method6313(@OriginalArg(1) Class258 arg0) {
		@Pc(7) Class204 local7 = null;
		try {
			@Pc(13) Class39 local13 = arg0.method5895("", true);
			while (local13.anInt894 == 0) {
				Static589.method7892(1L);
			}
			if (local13.anInt894 == 1) {
				local7 = (Class204) local13.anObject2;
				@Pc(40) Class3_Sub11 local40 = new Class3_Sub11(Static134.method2624());
				this.method6302(local40);
				local7.method4678(local40.anInt6128, 0, local40.aByteArray62);
			}
		} catch (@Pc(56) Exception local56) {
		}
		try {
			if (local7 != null) {
				local7.method4677();
			}
		} catch (@Pc(63) Exception local63) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(ZI)V")
	public void method6314(@OriginalArg(0) boolean arg0) {
		this.method6321(false);
		super.aBoolean583 = false;
		super.aBoolean578 = false;
		super.anInt7566 = super.anInt7575 = 0;
		super.aBoolean579 = false;
		super.aBoolean591 = false;
		super.aBoolean589 = false;
		super.aBoolean581 = false;
		super.anInt7565 = super.anInt7557 = 0;
		super.aBoolean576 = false;
		super.aBoolean584 = false;
		super.aBoolean590 = false;
		super.aBoolean582 = false;
		super.aBoolean585 = false;
		super.anInt7576 = 0;
		Static213.method6528(0);
		super.aBoolean588 = false;
		super.aBoolean580 = false;
		super.anInt7571 = 0;
		this.method6317();
		this.method6303(2);
		super.anInt7572 = 1;
		if (arg0) {
			Static563.method7599();
		}
		Static428.method6060();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IB)Z")
	public boolean method6315(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean592 : true;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
	private int method6316() {
		@Pc(23) byte local23;
		if (Static350.anInt6083 >= 96) {
			@Pc(18) int local18 = Static363.method5169();
			if (local18 <= 100) {
				local23 = 4;
				this.method6319();
			} else if (local18 <= 500) {
				local23 = 3;
				this.method6306();
			} else if (local18 > 1000) {
				local23 = 1;
				this.method6314(true);
			} else {
				local23 = 2;
				this.method6307();
			}
		} else {
			local23 = 1;
			this.method6314(true);
		}
		if (Static60.anInt1312 != 0) {
			super.anInt7562 = 0;
			Static486.method6610(0);
		}
		this.method6313(Static237.aClass258_3);
		return local23;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
	private void method6317() {
		if (Static488.anInt7961 > 1) {
			super.anInt7568 = 4;
		} else {
			super.anInt7568 = 2;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)I")
	private int method6318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12;
		if (arg1 > 20000) {
			local12 = 4;
			this.method6319();
		} else if (arg1 > 10000) {
			local12 = 3;
			this.method6306();
		} else if (arg1 <= 5000) {
			this.method6314(true);
			local12 = 1;
		} else {
			local12 = 2;
			this.method6307();
		}
		if (Static60.anInt1312 != arg0) {
			super.anInt7562 = arg0;
			Static486.method6610(arg0);
		}
		this.method6313(Static237.aClass258_3);
		return local12;
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)V")
	public void method6319() {
		this.method6321(true);
		super.aBoolean576 = true;
		super.aBoolean583 = true;
		super.aBoolean584 = true;
		super.aBoolean581 = true;
		super.aBoolean579 = true;
		super.anInt7566 = super.anInt7575 = 2;
		super.aBoolean591 = true;
		super.aBoolean582 = true;
		super.aBoolean589 = true;
		super.aBoolean578 = true;
		super.anInt7565 = super.anInt7557 = 0;
		super.aBoolean585 = true;
		super.aBoolean590 = true;
		super.anInt7576 = 1;
		if (Static350.anInt6083 > 95) {
			Static213.method6528(2);
		} else {
			Static213.method6528(0);
		}
		super.anInt7571 = 0;
		super.aBoolean580 = false;
		super.aBoolean588 = true;
		this.method6317();
		this.method6303(0);
		super.anInt7572 = 4;
		Static563.method7599();
		Static428.method6060();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!np;I)V")
	private void method6320(@OriginalArg(0) Class3_Sub11 arg0) {
		if (arg0.aByteArray62.length - arg0.anInt6128 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5175();
		if (local19 < 0 || local19 > 22) {
			return;
		}
		@Pc(33) byte local33;
		if (local19 == 22) {
			local33 = 45;
		} else if (local19 == 21) {
			local33 = 44;
		} else if (local19 == 20) {
			local33 = 43;
		} else if (local19 == 19) {
			local33 = 42;
		} else if (local19 == 18) {
			local33 = 41;
		} else if (local19 == 17) {
			local33 = 40;
		} else if (local19 == 16) {
			local33 = 38;
		} else if (local19 == 15) {
			local33 = 37;
		} else if (local19 == 14) {
			local33 = 36;
		} else if (local19 == 13) {
			local33 = 35;
		} else if (local19 == 12) {
			local33 = 34;
		} else if (local19 == 11) {
			local33 = 33;
		} else if (local19 == 10) {
			local33 = 32;
		} else if (local19 == 9) {
			local33 = 31;
		} else if (local19 == 8) {
			local33 = 30;
		} else if (local19 == 7) {
			local33 = 29;
		} else if (local19 == 6) {
			local33 = 28;
		} else if (local19 == 5) {
			local33 = 28;
		} else if (local19 == 4) {
			local33 = 24;
		} else if (local19 == 3) {
			local33 = 23;
		} else if (local19 == 2) {
			local33 = 22;
		} else if (local19 == 1) {
			local33 = 23;
		} else {
			local33 = 19;
		}
		if (arg0.aByteArray62.length - arg0.anInt6128 < local33) {
			return;
		}
		super.anInt7552 = arg0.method5175();
		if (super.anInt7552 < 1) {
			super.anInt7552 = 1;
		} else if (super.anInt7552 > 4) {
			super.anInt7552 = 4;
		}
		this.method6321(arg0.method5175() == 1);
		super.aBoolean585 = arg0.method5175() == 1;
		super.aBoolean591 = arg0.method5175() == 1;
		super.aBoolean581 = arg0.method5175() == 1;
		super.anInt7576 = arg0.method5175() == 1 ? 1 : 0;
		super.aBoolean583 = arg0.method5175() == 1;
		super.aBoolean590 = arg0.method5175() == 1;
		super.aBoolean576 = arg0.method5175() == 1;
		super.anInt7566 = arg0.method5175();
		if (super.anInt7566 > 2) {
			super.anInt7566 = 2;
		}
		if (local19 >= 17) {
			super.anInt7575 = arg0.method5175();
		}
		if (local19 < 2) {
			super.aBoolean582 = arg0.method5175() == 1;
			arg0.method5175();
		} else {
			super.aBoolean582 = arg0.method5175() == 1;
			if (local19 >= 17) {
				super.aBoolean578 = arg0.method5175() == 1;
			}
		}
		super.aBoolean589 = arg0.method5175() == 1;
		super.aBoolean584 = arg0.method5175() == 1;
		super.anInt7565 = arg0.method5175();
		if (super.anInt7565 > 2) {
			super.anInt7565 = 2;
		}
		super.anInt7557 = super.anInt7565;
		super.aBoolean586 = arg0.method5175() == 1;
		super.anInt7559 = arg0.method5175();
		if (super.anInt7559 > 127) {
			super.anInt7559 = 127;
		}
		if (local19 >= 20) {
			super.anInt7561 = arg0.method5175();
			if (super.anInt7561 > 127) {
				super.anInt7561 = 127;
			}
		} else {
			super.anInt7561 = super.anInt7559;
		}
		super.anInt7553 = arg0.method5175();
		super.anInt7577 = arg0.method5175();
		if (super.anInt7577 > 127) {
			super.anInt7577 = 127;
		}
		if (local19 < 21) {
			super.anInt7555 = super.anInt7553;
		} else {
			super.anInt7555 = arg0.method5175();
			if (super.anInt7555 > 127) {
				super.anInt7555 = 127;
			}
		}
		if (local19 >= 1) {
			super.anInt7569 = arg0.method5198();
			super.anInt7560 = arg0.method5198();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method5175();
		}
		@Pc(560) int local560;
		if (local19 >= 4) {
			local560 = arg0.method5175();
			if (local560 < 0 || local560 > 2) {
				local560 = 0;
			}
			if (Static350.anInt6083 < 96) {
				local560 = 0;
			}
			Static213.method6528(local560);
		}
		if (local19 >= 5) {
			super.anInt7574 = arg0.method5186();
		}
		local560 = 0;
		if (local19 >= 6) {
			super.anInt7570 = local560 = arg0.method5175();
		}
		if (super.anInt7570 != 1 && super.anInt7570 != 2) {
			super.anInt7570 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean594 = arg0.method5175() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean577 = arg0.method5175() == 1;
		}
		if (local19 >= 9) {
			super.anInt7571 = arg0.method5175();
		}
		if (super.anInt7571 < 0 || super.anInt7571 > Static53.method844(Static350.anInt6083)) {
			super.anInt7571 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean580 = arg0.method5175() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean587 = arg0.method5175() != 0;
		}
		if (local19 >= 12) {
			super.anInt7576 = arg0.method5175();
		}
		if (super.anInt7576 < 0 || super.anInt7576 > 2) {
			super.anInt7576 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean588 = arg0.method5175() == 1;
		}
		if (local19 >= 14) {
			super.anInt7562 = arg0.method5175();
		} else if (local560 == 0) {
			super.anInt7562 = 2;
		} else {
			super.anInt7562 = 1;
		}
		if (super.anInt7562 < 0 || super.anInt7562 > 5) {
			super.anInt7562 = 2;
		}
		if (local19 >= 15) {
			super.anInt7568 = arg0.method5175();
			if (super.anInt7568 < 0 || super.anInt7568 > 4) {
				super.anInt7568 = Static488.anInt7961 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean579 = arg0.method5175() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean579 = false;
				}
			} catch (@Pc(818) Throwable local818) {
			}
		}
		if (local19 < 17 && super.anInt7562 == 0) {
			super.anInt7562 = 2;
		}
		if (local19 >= 18) {
			super.anInt7572 = arg0.method5175();
			if (super.anInt7572 < 0 || super.anInt7572 > 4) {
				super.anInt7572 = 0;
			}
		}
		if (local19 >= 19) {
			super.anInt7554 = arg0.method5175();
		} else if (super.anInt7572 == 1 || super.anInt7572 == 2) {
			super.anInt7554 = 2;
		} else if (super.anInt7572 == 3) {
			super.anInt7554 = 1;
		} else {
			super.anInt7554 = 0;
		}
		if (local19 >= 22) {
			super.anInt7551 = arg0.method5175();
		}
		if (super.anInt7562 == 0 && Static350.anInt6083 < 96 && super.anInt7572 != 1 && super.anInt7572 != 0) {
			this.method6314(false);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)V")
	public void method6321(@OriginalArg(1) boolean arg0) {
		super.aBoolean592 = arg0;
		if (Static478.aClass212_3 != null) {
			Static478.aClass212_3.method4796(!this.method6312(Static60.anInt1312));
		}
	}
}
