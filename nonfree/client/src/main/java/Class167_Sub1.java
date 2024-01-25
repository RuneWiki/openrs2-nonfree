import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class167_Sub1 extends Class167 {

	@OriginalMember(owner = "client!qg", name = "V", descriptor = "Z")
	public boolean aBoolean498 = false;

	@OriginalMember(owner = "client!qg", name = "db", descriptor = "Z")
	public boolean aBoolean499 = false;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!js;)V")
	public Class167_Sub1(@OriginalArg(0) Class131 arg0) {
		super.anInt5554 = 3;
		this.method4523(true);
		super.anInt5556 = 2;
		super.aBoolean492 = true;
		super.aBoolean484 = false;
		super.anInt5569 = 0;
		super.anInt5568 = 255;
		super.aBoolean493 = true;
		super.aBoolean496 = true;
		super.anInt5560 = 0;
		super.aBoolean494 = true;
		super.anInt5550 = 1;
		super.aBoolean495 = true;
		super.anInt5567 = 127;
		super.anInt5561 = 0;
		super.aBoolean485 = true;
		super.anInt5559 = 0;
		super.anInt5564 = 0;
		super.anInt5565 = 127;
		super.aBoolean489 = true;
		super.aBoolean491 = true;
		super.aBoolean497 = true;
		super.aBoolean483 = true;
		if (Static43.anInt1146 >= 96) {
			Static48.method940(2);
		} else {
			Static48.method940(0);
		}
		super.anInt5562 = 0;
		super.anInt5566 = 0;
		super.aBoolean480 = false;
		super.aBoolean481 = false;
		super.anInt5563 = Static204.anInt3949 == 1 ? 2 : 4;
		super.aBoolean490 = true;
		super.anInt5557 = 2;
		super.anInt5553 = 2;
		super.aBoolean482 = true;
		super.aBoolean488 = false;
		@Pc(129) Class224 local129 = null;
		try {
			@Pc(134) Class128 local134 = arg0.method3058("");
			while (local134.anInt3727 == 0) {
				Static443.method5991(1L);
			}
			if (local134.anInt3727 == 1) {
				local129 = (Class224) local134.anObject4;
				@Pc(159) byte[] local159 = new byte[(int) local129.method5144()];
				@Pc(174) int local174;
				for (@Pc(161) int local161 = 0; local161 < local159.length; local161 += local174) {
					local174 = local129.method5142(local159, local161, local159.length - local161);
					if (local174 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4529(new Class2_Sub20(local159));
			}
		} catch (@Pc(199) Exception local199) {
		}
		try {
			if (local129 != null) {
				local129.method5141();
			}
		} catch (@Pc(206) Exception local206) {
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
	public boolean method4521(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean486 : true;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)I")
	public int method4522(@OriginalArg(0) int arg0) {
		if (this.aBoolean498) {
			return 0;
		} else if (this.method4528(arg0)) {
			return super.aBoolean495 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)V")
	public void method4523(@OriginalArg(0) boolean arg0) {
		super.aBoolean486 = arg0;
		if (Static406.aClass150_3 != null) {
			Static406.aClass150_3.method3510(!this.method4528(Static281.anInt5126));
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!js;B)V")
	public void method4525(@OriginalArg(0) Class131 arg0) {
		@Pc(7) Class224 local7 = null;
		try {
			@Pc(20) Class128 local20 = arg0.method3058("");
			while (local20.anInt3727 == 0) {
				Static443.method5991(1L);
			}
			if (local20.anInt3727 == 1) {
				local7 = (Class224) local20.anObject4;
				@Pc(40) Class2_Sub20 local40 = this.method4526();
				local7.method5140(0, local40.aByteArray136, local40.anInt4608);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local7 != null) {
				local7.method5141();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Lclient!md;")
	public Class2_Sub20 method4526() {
		@Pc(8) Class2_Sub20 local8 = new Class2_Sub20(41);
		local8.method3699(17);
		local8.method3699(super.anInt5554);
		local8.method3699(super.aBoolean486 ? 1 : 0);
		local8.method3699(super.aBoolean495 ? 1 : 0);
		local8.method3699(super.aBoolean491 ? 1 : 0);
		local8.method3699(super.aBoolean485 ? 1 : 0);
		local8.method3699(0);
		local8.method3699(super.aBoolean489 ? 1 : 0);
		local8.method3699(super.aBoolean483 ? 1 : 0);
		local8.method3699(super.aBoolean493 ? 1 : 0);
		local8.method3699(super.anInt5556);
		local8.method3699(super.anInt5564);
		local8.method3699(super.aBoolean496 ? 1 : 0);
		local8.method3699(super.aBoolean484 ? 1 : 0);
		local8.method3699(super.aBoolean497 ? 1 : 0);
		local8.method3699(super.aBoolean494 ? 1 : 0);
		local8.method3699(super.anInt5560);
		local8.method3699(super.aBoolean492 ? 1 : 0);
		local8.method3699(super.anInt5565);
		local8.method3699(super.anInt5568);
		local8.method3699(super.anInt5567);
		local8.method3745(super.anInt5569);
		local8.method3745(super.anInt5561);
		local8.method3699(Static118.method1725());
		local8.method3713(super.anInt5562);
		local8.method3699(super.anInt5557);
		local8.method3699(super.aBoolean481 ? 1 : 0);
		local8.method3699(super.aBoolean480 ? 1 : 0);
		local8.method3699(super.anInt5566);
		local8.method3699(super.aBoolean488 ? 1 : 0);
		local8.method3699(super.aBoolean490 ? 1 : 0);
		local8.method3699(super.anInt5550);
		local8.method3699(super.aBoolean482 ? 1 : 0);
		local8.method3699(super.anInt5553);
		local8.method3699(super.anInt5563);
		local8.method3699(super.aBoolean487 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(BI)Z")
	public boolean method4528(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean499 ? super.aBoolean486 : true;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!md;I)V")
	private void method4529(@OriginalArg(0) Class2_Sub20 arg0) {
		if (arg0.aByteArray136.length - arg0.anInt4608 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method3737();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(36) byte local36;
		if (local21 == 17) {
			local36 = 40;
		} else if (local21 == 16) {
			local36 = 38;
		} else if (local21 == 15) {
			local36 = 37;
		} else if (local21 == 14) {
			local36 = 36;
		} else if (local21 == 13) {
			local36 = 35;
		} else if (local21 == 12) {
			local36 = 34;
		} else if (local21 == 11) {
			local36 = 33;
		} else if (local21 == 10) {
			local36 = 32;
		} else if (local21 == 9) {
			local36 = 31;
		} else if (local21 == 8) {
			local36 = 30;
		} else if (local21 == 7) {
			local36 = 29;
		} else if (local21 == 6) {
			local36 = 28;
		} else if (local21 == 5) {
			local36 = 28;
		} else if (local21 == 4) {
			local36 = 24;
		} else if (local21 == 3) {
			local36 = 23;
		} else if (local21 == 2) {
			local36 = 22;
		} else if (local21 == 1) {
			local36 = 23;
		} else {
			local36 = 19;
		}
		if (arg0.aByteArray136.length - arg0.anInt4608 < local36) {
			return;
		}
		super.anInt5554 = arg0.method3737();
		if (super.anInt5554 < 1) {
			super.anInt5554 = 1;
		} else if (super.anInt5554 > 4) {
			super.anInt5554 = 4;
		}
		this.method4523(arg0.method3737() == 1);
		super.aBoolean495 = arg0.method3737() == 1;
		super.aBoolean491 = arg0.method3737() == 1;
		super.aBoolean485 = arg0.method3737() == 1;
		super.anInt5550 = arg0.method3737() == 1 ? 1 : 0;
		super.aBoolean489 = arg0.method3737() == 1;
		super.aBoolean483 = arg0.method3737() == 1;
		super.aBoolean493 = arg0.method3737() == 1;
		super.anInt5556 = arg0.method3737();
		if (super.anInt5556 > 2) {
			super.anInt5556 = 2;
		}
		if (local21 >= 17) {
			super.anInt5564 = arg0.method3737();
		}
		if (local21 >= 2) {
			super.aBoolean496 = arg0.method3737() == 1;
			if (local21 >= 17) {
				super.aBoolean484 = arg0.method3737() == 1;
			}
		} else {
			super.aBoolean496 = arg0.method3737() == 1;
			arg0.method3737();
		}
		super.aBoolean497 = arg0.method3737() == 1;
		super.aBoolean494 = arg0.method3737() == 1;
		super.anInt5560 = arg0.method3737();
		if (super.anInt5560 > 2) {
			super.anInt5560 = 2;
		}
		super.anInt5559 = super.anInt5560;
		super.aBoolean492 = arg0.method3737() == 1;
		super.anInt5565 = arg0.method3737();
		if (super.anInt5565 > 127) {
			super.anInt5565 = 127;
		}
		super.anInt5568 = arg0.method3737();
		super.anInt5567 = arg0.method3737();
		if (super.anInt5567 > 127) {
			super.anInt5567 = 127;
		}
		if (local21 >= 1) {
			super.anInt5569 = arg0.method3711();
			super.anInt5561 = arg0.method3711();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method3737();
		}
		@Pc(496) int local496;
		if (local21 >= 4) {
			local496 = arg0.method3737();
			if (local496 < 0 || local496 > 2) {
				local496 = 0;
			}
			if (Static43.anInt1146 < 96) {
				local496 = 0;
			}
			Static48.method940(local496);
		}
		if (local21 >= 5) {
			super.anInt5562 = arg0.method3731();
		}
		local496 = 0;
		if (local21 >= 6) {
			super.anInt5557 = local496 = arg0.method3737();
		}
		if (super.anInt5557 != 1 && super.anInt5557 != 2) {
			super.anInt5557 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean481 = arg0.method3737() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean480 = arg0.method3737() == 1;
		}
		if (local21 >= 9) {
			super.anInt5566 = arg0.method3737();
		}
		if (super.anInt5566 < 0 || super.anInt5566 > Static336.method4748(Static43.anInt1146)) {
			super.anInt5566 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean488 = arg0.method3737() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean490 = arg0.method3737() != 0;
		}
		if (local21 >= 12) {
			super.anInt5550 = arg0.method3737();
		}
		if (super.anInt5550 < 0 || super.anInt5550 > 2) {
			super.anInt5550 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean482 = arg0.method3737() == 1;
		}
		if (local21 >= 14) {
			super.anInt5553 = arg0.method3737();
		} else if (local496 == 0) {
			super.anInt5553 = 2;
		} else {
			super.anInt5553 = 1;
		}
		if (super.anInt5553 < 0 || super.anInt5553 > 3) {
			super.anInt5553 = 2;
		}
		if (local21 >= 15) {
			super.anInt5563 = arg0.method3737();
			if (super.anInt5563 < 0 || super.anInt5563 > 4) {
				super.anInt5563 = Static204.anInt3949 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean487 = arg0.method3737() == 1;
		}
		if (local21 < 17 && super.anInt5553 == 0) {
			super.anInt5553 = 2;
		}
	}
}
