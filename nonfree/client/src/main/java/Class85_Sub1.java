import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!fr", name = "O", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!fr", name = "Z", descriptor = "Z")
	public boolean aBoolean184 = false;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lclient!lt;)V")
	public Class85_Sub1(@OriginalArg(0) Class159 arg0) {
		super.anInt2491 = 3;
		this.method2110(true);
		super.anInt2481 = 127;
		super.anInt2480 = 0;
		super.anInt2496 = 255;
		super.aBoolean172 = true;
		super.anInt2493 = 0;
		super.anInt2487 = 127;
		super.aBoolean173 = true;
		super.aBoolean169 = true;
		super.aBoolean171 = true;
		super.anInt2489 = 1;
		super.aBoolean165 = true;
		super.anInt2500 = 0;
		super.aBoolean168 = true;
		super.anInt2485 = 2;
		super.aBoolean175 = false;
		super.aBoolean180 = true;
		super.aBoolean179 = true;
		super.anInt2486 = 0;
		super.aBoolean170 = true;
		super.aBoolean174 = true;
		super.anInt2495 = 0;
		if (Static108.anInt2167 < 96) {
			Static126.method2213(0);
		} else {
			Static126.method2213(2);
		}
		super.aBoolean178 = true;
		super.aBoolean166 = false;
		super.anInt2482 = 0;
		super.anInt2488 = 0;
		super.anInt2494 = Static298.anInt5167 == 1 ? 2 : 4;
		super.aBoolean181 = false;
		super.anInt2484 = 2;
		super.anInt2483 = 2;
		super.aBoolean164 = false;
		super.aBoolean176 = true;
		@Pc(129) Class108 local129 = null;
		try {
			@Pc(135) Class270 local135 = arg0.method3514("", true);
			while (local135.anInt7548 == 0) {
				Static328.method5696(1L);
			}
			if (local135.anInt7548 == 1) {
				local129 = (Class108) local135.anObject9;
				@Pc(159) byte[] local159 = new byte[(int) local129.method2645()];
				@Pc(173) int local173;
				for (@Pc(161) int local161 = 0; local161 < local159.length; local161 += local173) {
					local173 = local129.method2646(local161, local159, local159.length - local161);
					if (local173 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2116(new Class10_Sub8(local159));
			}
		} catch (@Pc(203) Exception local203) {
		}
		try {
			if (local129 != null) {
				local129.method2643();
			}
		} catch (@Pc(210) Exception local210) {
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZ)V")
	public void method2110(@OriginalArg(1) boolean arg0) {
		super.aBoolean177 = arg0;
		if (Static342.aClass237_4 != null) {
			Static342.aClass237_4.method5207(!this.method2113(Static423.anInt7114));
		}
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(II)I")
	public int method2111(@OriginalArg(0) int arg0) {
		if (this.aBoolean182) {
			return 0;
		} else if (this.method2113(arg0)) {
			return super.aBoolean174 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)Lclient!nn;")
	public Class10_Sub8 method2112() {
		@Pc(16) Class10_Sub8 local16 = new Class10_Sub8(41);
		local16.method2458(17);
		local16.method2458(super.anInt2491);
		local16.method2458(super.aBoolean177 ? 1 : 0);
		local16.method2458(super.aBoolean174 ? 1 : 0);
		local16.method2458(super.aBoolean165 ? 1 : 0);
		local16.method2458(super.aBoolean179 ? 1 : 0);
		local16.method2458(0);
		local16.method2458(super.aBoolean173 ? 1 : 0);
		local16.method2458(super.aBoolean172 ? 1 : 0);
		local16.method2458(super.aBoolean171 ? 1 : 0);
		local16.method2458(super.anInt2485);
		local16.method2458(super.anInt2495);
		local16.method2458(super.aBoolean169 ? 1 : 0);
		local16.method2458(super.aBoolean175 ? 1 : 0);
		local16.method2458(super.aBoolean170 ? 1 : 0);
		local16.method2458(super.aBoolean168 ? 1 : 0);
		local16.method2458(super.anInt2493);
		local16.method2458(super.aBoolean180 ? 1 : 0);
		local16.method2458(super.anInt2481);
		local16.method2458(super.anInt2496);
		local16.method2458(super.anInt2487);
		local16.method2509(super.anInt2500);
		local16.method2509(super.anInt2480);
		local16.method2458(Static201.method3169());
		local16.method2506(super.anInt2482);
		local16.method2458(super.anInt2483);
		local16.method2458(super.aBoolean181 ? 1 : 0);
		local16.method2458(super.aBoolean164 ? 1 : 0);
		local16.method2458(super.anInt2488);
		local16.method2458(super.aBoolean166 ? 1 : 0);
		local16.method2458(super.aBoolean176 ? 1 : 0);
		local16.method2458(super.anInt2489);
		local16.method2458(super.aBoolean178 ? 1 : 0);
		local16.method2458(super.anInt2484);
		local16.method2458(super.anInt2494);
		local16.method2458(super.aBoolean167 ? 1 : 0);
		return local16;
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "(II)Z")
	public boolean method2113(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean184 ? super.aBoolean177 : true;
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "(II)Z")
	public boolean method2114(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean177 : true;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!nn;I)V")
	private void method2116(@OriginalArg(0) Class10_Sub8 arg0) {
		if (arg0.aByteArray44.length - arg0.anInt2989 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method2502();
		if (local19 < 0 || local19 > 17) {
			return;
		}
		@Pc(59) byte local59;
		if (local19 == 17) {
			local59 = 40;
		} else if (local19 == 16) {
			local59 = 38;
		} else if (local19 == 15) {
			local59 = 37;
		} else if (local19 == 14) {
			local59 = 36;
		} else if (local19 == 13) {
			local59 = 35;
		} else if (local19 == 12) {
			local59 = 34;
		} else if (local19 == 11) {
			local59 = 33;
		} else if (local19 == 10) {
			local59 = 32;
		} else if (local19 == 9) {
			local59 = 31;
		} else if (local19 == 8) {
			local59 = 30;
		} else if (local19 == 7) {
			local59 = 29;
		} else if (local19 == 6) {
			local59 = 28;
		} else if (local19 == 5) {
			local59 = 28;
		} else if (local19 == 4) {
			local59 = 24;
		} else if (local19 == 3) {
			local59 = 23;
		} else if (local19 == 2) {
			local59 = 22;
		} else if (local19 == 1) {
			local59 = 23;
		} else {
			local59 = 19;
		}
		if (local59 > arg0.aByteArray44.length - arg0.anInt2989) {
			return;
		}
		super.anInt2491 = arg0.method2502();
		if (super.anInt2491 < 1) {
			super.anInt2491 = 1;
		} else if (super.anInt2491 > 4) {
			super.anInt2491 = 4;
		}
		this.method2110(arg0.method2502() == 1);
		super.aBoolean174 = arg0.method2502() == 1;
		super.aBoolean165 = arg0.method2502() == 1;
		super.aBoolean179 = arg0.method2502() == 1;
		super.anInt2489 = arg0.method2502() == 1 ? 1 : 0;
		super.aBoolean173 = arg0.method2502() == 1;
		super.aBoolean172 = arg0.method2502() == 1;
		super.aBoolean171 = arg0.method2502() == 1;
		super.anInt2485 = arg0.method2502();
		if (super.anInt2485 > 2) {
			super.anInt2485 = 2;
		}
		if (local19 >= 17) {
			super.anInt2495 = arg0.method2502();
		}
		if (local19 < 2) {
			super.aBoolean169 = arg0.method2502() == 1;
			arg0.method2502();
		} else {
			super.aBoolean169 = arg0.method2502() == 1;
			if (local19 >= 17) {
				super.aBoolean175 = arg0.method2502() == 1;
			}
		}
		super.aBoolean170 = arg0.method2502() == 1;
		super.aBoolean168 = arg0.method2502() == 1;
		super.anInt2493 = arg0.method2502();
		if (super.anInt2493 > 2) {
			super.anInt2493 = 2;
		}
		super.anInt2486 = super.anInt2493;
		super.aBoolean180 = arg0.method2502() == 1;
		super.anInt2481 = arg0.method2502();
		if (super.anInt2481 > 127) {
			super.anInt2481 = 127;
		}
		super.anInt2496 = arg0.method2502();
		super.anInt2487 = arg0.method2502();
		if (super.anInt2487 > 127) {
			super.anInt2487 = 127;
		}
		if (local19 >= 1) {
			super.anInt2500 = arg0.method2485();
			super.anInt2480 = arg0.method2485();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method2502();
		}
		@Pc(484) int local484;
		if (local19 >= 4) {
			local484 = arg0.method2502();
			if (local484 < 0 || local484 > 2) {
				local484 = 0;
			}
			if (Static108.anInt2167 < 96) {
				local484 = 0;
			}
			Static126.method2213(local484);
		}
		if (local19 >= 5) {
			super.anInt2482 = arg0.method2459();
		}
		local484 = 0;
		if (local19 >= 6) {
			super.anInt2483 = local484 = arg0.method2502();
		}
		if (super.anInt2483 != 1 && super.anInt2483 != 2) {
			super.anInt2483 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean181 = arg0.method2502() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean164 = arg0.method2502() == 1;
		}
		if (local19 >= 9) {
			super.anInt2488 = arg0.method2502();
		}
		if (super.anInt2488 < 0 || super.anInt2488 > Static304.method4242(Static108.anInt2167)) {
			super.anInt2488 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean166 = arg0.method2502() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean176 = arg0.method2502() != 0;
		}
		if (local19 >= 12) {
			super.anInt2489 = arg0.method2502();
		}
		if (super.anInt2489 < 0 || super.anInt2489 > 2) {
			super.anInt2489 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean178 = arg0.method2502() == 1;
		}
		if (local19 >= 14) {
			super.anInt2484 = arg0.method2502();
		} else if (local484 == 0) {
			super.anInt2484 = 2;
		} else {
			super.anInt2484 = 1;
		}
		if (super.anInt2484 < 0 || super.anInt2484 > 3) {
			super.anInt2484 = 2;
		}
		if (local19 >= 15) {
			super.anInt2494 = arg0.method2502();
			if (super.anInt2494 < 0 || super.anInt2494 > 4) {
				super.anInt2494 = Static298.anInt5167 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean167 = arg0.method2502() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean167 = false;
				}
			} catch (@Pc(738) Throwable local738) {
			}
		}
		if (local19 < 17 && super.anInt2484 == 0) {
			super.anInt2484 = 2;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLclient!lt;)V")
	public void method2117(@OriginalArg(1) Class159 arg0) {
		@Pc(7) Class108 local7 = null;
		try {
			@Pc(13) Class270 local13 = arg0.method3514("", true);
			while (local13.anInt7548 == 0) {
				Static328.method5696(1L);
			}
			if (local13.anInt7548 == 1) {
				local7 = (Class108) local13.anObject9;
				@Pc(38) Class10_Sub8 local38 = this.method2112();
				local7.method2648(local38.aByteArray44, 0, local38.anInt2989);
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			if (local7 != null) {
				local7.method2643();
			}
		} catch (@Pc(62) Exception local62) {
		}
	}
}
