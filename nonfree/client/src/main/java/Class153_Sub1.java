import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class153_Sub1 extends Class153 {

	@OriginalMember(owner = "client!qc", name = "S", descriptor = "Z")
	public boolean aBoolean356 = false;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "Z")
	public boolean aBoolean355 = false;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class153_Sub1(@OriginalArg(0) Class61 arg0) {
		super.anInt5250 = 3;
		this.method4231(true);
		super.aBoolean351 = true;
		super.aBoolean350 = true;
		super.anInt5237 = 127;
		super.anInt5241 = 0;
		super.aBoolean343 = true;
		super.anInt5235 = 0;
		super.anInt5238 = 1;
		super.aBoolean354 = true;
		super.anInt5244 = 0;
		super.aBoolean340 = true;
		super.anInt5240 = 255;
		super.aBoolean347 = true;
		super.aBoolean342 = false;
		super.aBoolean344 = true;
		super.aBoolean345 = true;
		super.aBoolean341 = true;
		super.anInt5246 = 127;
		super.aBoolean349 = true;
		super.anInt5242 = 0;
		super.anInt5247 = 2;
		super.anInt5239 = 0;
		if (Static268.anInt4537 < 96) {
			Static36.method513(0);
		} else {
			Static36.method513(2);
		}
		super.aBoolean337 = false;
		super.anInt5245 = 2;
		super.anInt5233 = 2;
		super.anInt5234 = 0;
		super.aBoolean339 = false;
		super.aBoolean353 = true;
		super.aBoolean348 = true;
		super.anInt5231 = 0;
		super.anInt5230 = Static62.anInt1162 == 1 ? 2 : 4;
		super.aBoolean352 = false;
		@Pc(129) Class266 local129 = null;
		try {
			@Pc(135) Class236 local135 = arg0.method1456("", true);
			while (local135.anInt6178 == 0) {
				Static214.method2089(1L);
			}
			if (local135.anInt6178 == 1) {
				local129 = (Class266) local135.anObject8;
				@Pc(159) byte[] local159 = new byte[(int) local129.method5673()];
				@Pc(173) int local173;
				for (@Pc(161) int local161 = 0; local161 < local159.length; local161 += local173) {
					local173 = local129.method5677(local161, local159, local159.length - local161);
					if (local173 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4223(new Class7_Sub14(local159));
			}
		} catch (@Pc(199) Exception local199) {
		}
		try {
			if (local129 != null) {
				local129.method5674();
			}
		} catch (@Pc(206) Exception local206) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!gk;)V")
	private void method4223(@OriginalArg(1) Class7_Sub14 arg0) {
		if (arg0.aByteArray75.length - arg0.anInt4989 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method3981();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 17) {
			local34 = 40;
		} else if (local21 == 16) {
			local34 = 38;
		} else if (local21 == 15) {
			local34 = 37;
		} else if (local21 == 14) {
			local34 = 36;
		} else if (local21 == 13) {
			local34 = 35;
		} else if (local21 == 12) {
			local34 = 34;
		} else if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.aByteArray75.length - arg0.anInt4989) {
			return;
		}
		super.anInt5250 = arg0.method3981();
		if (super.anInt5250 < 1) {
			super.anInt5250 = 1;
		} else if (super.anInt5250 > 4) {
			super.anInt5250 = 4;
		}
		this.method4231(arg0.method3981() == 1);
		super.aBoolean349 = arg0.method3981() == 1;
		super.aBoolean347 = arg0.method3981() == 1;
		super.aBoolean340 = arg0.method3981() == 1;
		super.anInt5238 = arg0.method3981() == 1 ? 1 : 0;
		super.aBoolean354 = arg0.method3981() == 1;
		super.aBoolean350 = arg0.method3981() == 1;
		super.aBoolean351 = arg0.method3981() == 1;
		super.anInt5247 = arg0.method3981();
		if (super.anInt5247 > 2) {
			super.anInt5247 = 2;
		}
		if (local21 >= 17) {
			super.anInt5235 = arg0.method3981();
		}
		if (local21 >= 2) {
			super.aBoolean345 = arg0.method3981() == 1;
			if (local21 >= 17) {
				super.aBoolean342 = arg0.method3981() == 1;
			}
		} else {
			super.aBoolean345 = arg0.method3981() == 1;
			arg0.method3981();
		}
		super.aBoolean341 = arg0.method3981() == 1;
		super.aBoolean343 = arg0.method3981() == 1;
		super.anInt5242 = arg0.method3981();
		if (super.anInt5242 > 2) {
			super.anInt5242 = 2;
		}
		super.anInt5244 = super.anInt5242;
		super.aBoolean344 = arg0.method3981() == 1;
		super.anInt5237 = arg0.method3981();
		if (super.anInt5237 > 127) {
			super.anInt5237 = 127;
		}
		super.anInt5240 = arg0.method3981();
		super.anInt5246 = arg0.method3981();
		if (super.anInt5246 > 127) {
			super.anInt5246 = 127;
		}
		if (local21 >= 1) {
			super.anInt5241 = arg0.method3943();
			super.anInt5239 = arg0.method3943();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method3981();
		}
		if (local21 >= 4) {
			@Pc(465) int local465 = arg0.method3981();
			if (local465 < 0 || local465 > 2) {
				local465 = 0;
			}
			if (Static268.anInt4537 < 96) {
				local465 = 0;
			}
			Static36.method513(local465);
		}
		if (local21 >= 5) {
			super.anInt5231 = arg0.method3938();
		}
		@Pc(505) int local505 = 0;
		if (local21 >= 6) {
			super.anInt5233 = local505 = arg0.method3981();
		}
		if (super.anInt5233 != 1 && super.anInt5233 != 2) {
			super.anInt5233 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean339 = arg0.method3981() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean337 = arg0.method3981() == 1;
		}
		if (local21 >= 9) {
			super.anInt5234 = arg0.method3981();
		}
		if (super.anInt5234 < 0 || super.anInt5234 > Static435.method5603(Static268.anInt4537)) {
			super.anInt5234 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean352 = arg0.method3981() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean353 = arg0.method3981() != 0;
		}
		if (local21 >= 12) {
			super.anInt5238 = arg0.method3981();
		}
		if (super.anInt5238 < 0 || super.anInt5238 > 2) {
			super.anInt5238 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean348 = arg0.method3981() == 1;
		}
		if (local21 >= 14) {
			super.anInt5245 = arg0.method3981();
		} else if (local505 == 0) {
			super.anInt5245 = 2;
		} else {
			super.anInt5245 = 1;
		}
		if (super.anInt5245 < 0 || super.anInt5245 > 3) {
			super.anInt5245 = 2;
		}
		if (local21 >= 15) {
			super.anInt5230 = arg0.method3981();
			if (super.anInt5230 < 0 || super.anInt5230 > 4) {
				super.anInt5230 = Static62.anInt1162 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean338 = arg0.method3981() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean338 = false;
				}
			} catch (@Pc(728) Throwable local728) {
			}
		}
		if (local21 < 17 && super.anInt5245 == 0) {
			super.anInt5245 = 2;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Lclient!gk;")
	public Class7_Sub14 method4225() {
		@Pc(8) Class7_Sub14 local8 = new Class7_Sub14(41);
		local8.method3970(17);
		local8.method3970(super.anInt5250);
		local8.method3970(super.aBoolean346 ? 1 : 0);
		local8.method3970(super.aBoolean349 ? 1 : 0);
		local8.method3970(super.aBoolean347 ? 1 : 0);
		local8.method3970(super.aBoolean340 ? 1 : 0);
		local8.method3970(0);
		local8.method3970(super.aBoolean354 ? 1 : 0);
		local8.method3970(super.aBoolean350 ? 1 : 0);
		local8.method3970(super.aBoolean351 ? 1 : 0);
		local8.method3970(super.anInt5247);
		local8.method3970(super.anInt5235);
		local8.method3970(super.aBoolean345 ? 1 : 0);
		local8.method3970(super.aBoolean342 ? 1 : 0);
		local8.method3970(super.aBoolean341 ? 1 : 0);
		local8.method3970(super.aBoolean343 ? 1 : 0);
		local8.method3970(super.anInt5242);
		local8.method3970(super.aBoolean344 ? 1 : 0);
		local8.method3970(super.anInt5237);
		local8.method3970(super.anInt5240);
		local8.method3970(super.anInt5246);
		local8.method3993(super.anInt5241);
		local8.method3993(super.anInt5239);
		local8.method3970(Static35.method3785());
		local8.method3933(super.anInt5231);
		local8.method3970(super.anInt5233);
		local8.method3970(super.aBoolean339 ? 1 : 0);
		local8.method3970(super.aBoolean337 ? 1 : 0);
		local8.method3970(super.anInt5234);
		local8.method3970(super.aBoolean352 ? 1 : 0);
		local8.method3970(super.aBoolean353 ? 1 : 0);
		local8.method3970(super.anInt5238);
		local8.method3970(super.aBoolean348 ? 1 : 0);
		local8.method3970(super.anInt5245);
		local8.method3970(super.anInt5230);
		local8.method3970(super.aBoolean338 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)Z")
	public boolean method4227(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean346 : true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method4228(@OriginalArg(0) Class61 arg0) {
		@Pc(7) Class266 local7 = null;
		try {
			@Pc(13) Class236 local13 = arg0.method1456("", true);
			while (local13.anInt6178 == 0) {
				Static214.method2089(1L);
			}
			if (local13.anInt6178 == 1) {
				local7 = (Class266) local13.anObject8;
				@Pc(37) Class7_Sub14 local37 = this.method4225();
				local7.method5678(0, local37.anInt4989, local37.aByteArray75);
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			if (local7 != null) {
				local7.method5674();
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(II)Z")
	public boolean method4229(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean355 ? super.aBoolean346 : true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
	public int method4230(@OriginalArg(0) int arg0) {
		if (this.aBoolean356) {
			return 0;
		} else if (this.method4229(arg0)) {
			return super.aBoolean349 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V")
	public void method4231(@OriginalArg(0) boolean arg0) {
		super.aBoolean346 = arg0;
		if (Static411.aClass142_4 != null) {
			Static411.aClass142_4.method3150(!this.method4229(Static377.anInt6113));
		}
	}
}
