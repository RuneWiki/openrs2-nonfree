import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class136_Sub1 extends Class136 {

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "Z")
	public boolean aBoolean513 = false;

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "Z")
	public boolean aBoolean514 = false;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!fq;)V")
	public Class136_Sub1(@OriginalArg(0) Class83 arg0) {
		super.anInt4451 = 3;
		this.method3524(true);
		super.anInt4454 = 0;
		super.aBoolean503 = true;
		super.aBoolean512 = true;
		super.anInt4458 = 2;
		super.anInt4447 = 0;
		super.aBoolean509 = true;
		super.anInt4450 = 1;
		super.aBoolean496 = true;
		super.aBoolean500 = true;
		super.anInt4441 = 127;
		super.aBoolean498 = true;
		super.aBoolean506 = true;
		super.anInt4442 = 127;
		super.anInt4444 = 255;
		super.anInt4445 = 0;
		super.aBoolean504 = true;
		super.anInt4443 = 0;
		super.aBoolean499 = false;
		super.aBoolean501 = true;
		super.aBoolean508 = true;
		super.anInt4440 = 0;
		if (Static270.anInt4858 >= 96) {
			Static300.method4092(2);
		} else {
			Static300.method4092(0);
		}
		super.aBoolean511 = false;
		super.anInt4455 = 2;
		super.aBoolean497 = false;
		super.anInt4439 = 2;
		super.aBoolean507 = true;
		super.anInt4457 = 0;
		super.aBoolean510 = true;
		super.anInt4459 = Static336.anInt5735 == 1 ? 2 : 4;
		super.aBoolean495 = false;
		super.anInt4446 = 0;
		@Pc(129) Class98 local129 = null;
		try {
			@Pc(135) Class232 local135 = arg0.method1877("", true);
			while (local135.anInt6402 == 0) {
				Static223.method4582(1L);
			}
			if (local135.anInt6402 == 1) {
				local129 = (Class98) local135.anObject8;
				@Pc(157) byte[] local157 = new byte[(int) local129.method2225()];
				@Pc(172) int local172;
				for (@Pc(159) int local159 = 0; local159 < local157.length; local159 += local172) {
					local172 = local129.method2223(local157.length - local159, local159, local157);
					if (local172 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method3523(new Class1_Sub28(local157));
			}
		} catch (@Pc(202) Exception local202) {
		}
		try {
			if (local129 != null) {
				local129.method2224();
			}
		} catch (@Pc(209) Exception local209) {
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
	public int method3520(@OriginalArg(0) int arg0) {
		if (this.aBoolean513) {
			return 0;
		} else if (this.method3522(arg0)) {
			return super.aBoolean509 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)Z")
	public boolean method3522(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean514 ? super.aBoolean502 : true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ug;I)V")
	private void method3523(@OriginalArg(0) Class1_Sub28 arg0) {
		if (arg0.aByteArray86.length - arg0.anInt6812 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5337();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(35) byte local35;
		if (local21 == 17) {
			local35 = 40;
		} else if (local21 == 16) {
			local35 = 38;
		} else if (local21 == 15) {
			local35 = 37;
		} else if (local21 == 14) {
			local35 = 36;
		} else if (local21 == 13) {
			local35 = 35;
		} else if (local21 == 12) {
			local35 = 34;
		} else if (local21 == 11) {
			local35 = 33;
		} else if (local21 == 10) {
			local35 = 32;
		} else if (local21 == 9) {
			local35 = 31;
		} else if (local21 == 8) {
			local35 = 30;
		} else if (local21 == 7) {
			local35 = 29;
		} else if (local21 == 6) {
			local35 = 28;
		} else if (local21 == 5) {
			local35 = 28;
		} else if (local21 == 4) {
			local35 = 24;
		} else if (local21 == 3) {
			local35 = 23;
		} else if (local21 == 2) {
			local35 = 22;
		} else if (local21 == 1) {
			local35 = 23;
		} else {
			local35 = 19;
		}
		if (arg0.aByteArray86.length - arg0.anInt6812 < local35) {
			return;
		}
		super.anInt4451 = arg0.method5337();
		if (super.anInt4451 < 1) {
			super.anInt4451 = 1;
		} else if (super.anInt4451 > 4) {
			super.anInt4451 = 4;
		}
		this.method3524(arg0.method5337() == 1);
		super.aBoolean509 = arg0.method5337() == 1;
		super.aBoolean512 = arg0.method5337() == 1;
		super.aBoolean498 = arg0.method5337() == 1;
		super.anInt4450 = arg0.method5337() == 1 ? 1 : 0;
		super.aBoolean500 = arg0.method5337() == 1;
		super.aBoolean506 = arg0.method5337() == 1;
		super.aBoolean503 = arg0.method5337() == 1;
		super.anInt4458 = arg0.method5337();
		if (super.anInt4458 > 2) {
			super.anInt4458 = 2;
		}
		if (local21 >= 17) {
			super.anInt4447 = arg0.method5337();
		}
		if (local21 >= 2) {
			super.aBoolean508 = arg0.method5337() == 1;
			if (local21 >= 17) {
				super.aBoolean499 = arg0.method5337() == 1;
			}
		} else {
			super.aBoolean508 = arg0.method5337() == 1;
			arg0.method5337();
		}
		super.aBoolean501 = arg0.method5337() == 1;
		super.aBoolean496 = arg0.method5337() == 1;
		super.anInt4454 = arg0.method5337();
		if (super.anInt4454 > 2) {
			super.anInt4454 = 2;
		}
		super.anInt4443 = super.anInt4454;
		super.aBoolean504 = arg0.method5337() == 1;
		super.anInt4442 = arg0.method5337();
		if (super.anInt4442 > 127) {
			super.anInt4442 = 127;
		}
		super.anInt4444 = arg0.method5337();
		super.anInt4441 = arg0.method5337();
		if (super.anInt4441 > 127) {
			super.anInt4441 = 127;
		}
		if (local21 >= 1) {
			super.anInt4445 = arg0.method5335();
			super.anInt4440 = arg0.method5335();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method5337();
		}
		@Pc(492) int local492;
		if (local21 >= 4) {
			local492 = arg0.method5337();
			if (local492 < 0 || local492 > 2) {
				local492 = 0;
			}
			if (Static270.anInt4858 < 96) {
				local492 = 0;
			}
			Static300.method4092(local492);
		}
		if (local21 >= 5) {
			super.anInt4457 = arg0.method5355();
		}
		local492 = 0;
		if (local21 >= 6) {
			super.anInt4455 = local492 = arg0.method5337();
		}
		if (super.anInt4455 != 1 && super.anInt4455 != 2) {
			super.anInt4455 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean497 = arg0.method5337() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean495 = arg0.method5337() == 1;
		}
		if (local21 >= 9) {
			super.anInt4446 = arg0.method5337();
		}
		if (super.anInt4446 < 0 || super.anInt4446 > Static127.method2012(Static270.anInt4858)) {
			super.anInt4446 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean511 = arg0.method5337() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean507 = arg0.method5337() != 0;
		}
		if (local21 >= 12) {
			super.anInt4450 = arg0.method5337();
		}
		if (super.anInt4450 < 0 || super.anInt4450 > 2) {
			super.anInt4450 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean510 = arg0.method5337() == 1;
		}
		if (local21 >= 14) {
			super.anInt4439 = arg0.method5337();
		} else if (local492 == 0) {
			super.anInt4439 = 2;
		} else {
			super.anInt4439 = 1;
		}
		if (super.anInt4439 < 0 || super.anInt4439 > 3) {
			super.anInt4439 = 2;
		}
		if (local21 >= 15) {
			super.anInt4459 = arg0.method5337();
			if (super.anInt4459 < 0 || super.anInt4459 > 4) {
				super.anInt4459 = Static336.anInt5735 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean505 = arg0.method5337() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean505 = false;
				}
			} catch (@Pc(772) Throwable local772) {
			}
		}
		if (local21 < 17 && super.anInt4439 == 0) {
			super.anInt4439 = 2;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	public void method3524(@OriginalArg(0) boolean arg0) {
		super.aBoolean502 = arg0;
		if (Static341.aClass75_4 != null) {
			Static341.aClass75_4.method1612(!this.method3522(Static14.anInt293));
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lclient!ug;")
	public Class1_Sub28 method3525() {
		@Pc(8) Class1_Sub28 local8 = new Class1_Sub28(41);
		local8.method5398(17);
		local8.method5398(super.anInt4451);
		local8.method5398(super.aBoolean502 ? 1 : 0);
		local8.method5398(super.aBoolean509 ? 1 : 0);
		local8.method5398(super.aBoolean512 ? 1 : 0);
		local8.method5398(super.aBoolean498 ? 1 : 0);
		local8.method5398(0);
		local8.method5398(super.aBoolean500 ? 1 : 0);
		local8.method5398(super.aBoolean506 ? 1 : 0);
		local8.method5398(super.aBoolean503 ? 1 : 0);
		local8.method5398(super.anInt4458);
		local8.method5398(super.anInt4447);
		local8.method5398(super.aBoolean508 ? 1 : 0);
		local8.method5398(super.aBoolean499 ? 1 : 0);
		local8.method5398(super.aBoolean501 ? 1 : 0);
		local8.method5398(super.aBoolean496 ? 1 : 0);
		local8.method5398(super.anInt4454);
		local8.method5398(super.aBoolean504 ? 1 : 0);
		local8.method5398(super.anInt4442);
		local8.method5398(super.anInt4444);
		local8.method5398(super.anInt4441);
		local8.method5393(super.anInt4445);
		local8.method5393(super.anInt4440);
		local8.method5398(Static241.method3473());
		local8.method5347(super.anInt4457);
		local8.method5398(super.anInt4455);
		local8.method5398(super.aBoolean497 ? 1 : 0);
		local8.method5398(super.aBoolean495 ? 1 : 0);
		local8.method5398(super.anInt4446);
		local8.method5398(super.aBoolean511 ? 1 : 0);
		local8.method5398(super.aBoolean507 ? 1 : 0);
		local8.method5398(super.anInt4450);
		local8.method5398(super.aBoolean510 ? 1 : 0);
		local8.method5398(super.anInt4439);
		local8.method5398(super.anInt4459);
		local8.method5398(super.aBoolean505 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)Z")
	public boolean method3526(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean502 : true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!fq;B)V")
	public void method3527(@OriginalArg(0) Class83 arg0) {
		@Pc(7) Class98 local7 = null;
		try {
			@Pc(13) Class232 local13 = arg0.method1877("", true);
			while (local13.anInt6402 == 0) {
				Static223.method4582(1L);
			}
			if (local13.anInt6402 == 1) {
				local7 = (Class98) local13.anObject8;
				@Pc(43) Class1_Sub28 local43 = this.method3525();
				local7.method2221(0, local43.anInt6812, local43.aByteArray86);
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			if (local7 != null) {
				local7.method2224();
			}
		} catch (@Pc(60) Exception local60) {
		}
	}
}
