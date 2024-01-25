import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class135_Sub1 extends Class135 {

	@OriginalMember(owner = "client!op", name = "S", descriptor = "Z")
	public boolean aBoolean370 = false;

	@OriginalMember(owner = "client!op", name = "ab", descriptor = "Z")
	public boolean aBoolean371 = false;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class135_Sub1(@OriginalArg(0) Class180 arg0) {
		super.anInt5111 = 3;
		this.method4249(true);
		super.anInt5099 = 0;
		super.anInt5109 = 255;
		super.aBoolean356 = true;
		super.aBoolean355 = true;
		super.aBoolean353 = true;
		super.anInt5091 = 0;
		super.anInt5107 = 2;
		super.aBoolean363 = false;
		super.anInt5112 = 0;
		super.anInt5110 = 127;
		super.aBoolean365 = true;
		super.aBoolean364 = true;
		super.aBoolean366 = true;
		super.aBoolean367 = true;
		super.anInt5095 = 0;
		super.aBoolean354 = true;
		super.aBoolean360 = true;
		super.anInt5092 = 127;
		super.anInt5108 = 0;
		super.aBoolean352 = true;
		super.anInt5093 = 1;
		if (Static79.anInt1766 < 96) {
			Static278.method4057(0);
		} else {
			Static278.method4057(2);
		}
		super.aBoolean358 = true;
		super.anInt5105 = Static71.anInt3035 == 1 ? 2 : 4;
		super.anInt5090 = 2;
		super.anInt5098 = 2;
		super.aBoolean369 = false;
		super.aBoolean362 = false;
		super.aBoolean359 = false;
		super.aBoolean368 = true;
		super.anInt5103 = 0;
		super.anInt5102 = 0;
		@Pc(127) Class222 local127 = null;
		try {
			@Pc(133) Class9 local133 = arg0.method4083("", true);
			while (local133.anInt368 == 0) {
				Static224.method3441(1L);
			}
			if (local133.anInt368 == 1) {
				local127 = (Class222) local133.anObject2;
				@Pc(155) byte[] local155 = new byte[(int) local127.method4984()];
				@Pc(170) int local170;
				for (@Pc(157) int local157 = 0; local157 < local155.length; local157 += local170) {
					local170 = local127.method4983(local157, local155, local155.length - local157);
					if (local170 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4243(new Class1_Sub5(local155));
			}
		} catch (@Pc(200) Exception local200) {
		}
		try {
			if (local127 != null) {
				local127.method4988();
			}
		} catch (@Pc(207) Exception local207) {
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Lclient!hp;")
	public Class1_Sub5 method4238() {
		@Pc(8) Class1_Sub5 local8 = new Class1_Sub5(41);
		local8.method5396(17);
		local8.method5396(super.anInt5111);
		local8.method5396(super.aBoolean361 ? 1 : 0);
		local8.method5396(super.aBoolean365 ? 1 : 0);
		local8.method5396(super.aBoolean356 ? 1 : 0);
		local8.method5396(super.aBoolean353 ? 1 : 0);
		local8.method5396(0);
		local8.method5396(super.aBoolean352 ? 1 : 0);
		local8.method5396(super.aBoolean354 ? 1 : 0);
		local8.method5396(super.aBoolean364 ? 1 : 0);
		local8.method5396(super.anInt5107);
		local8.method5396(super.anInt5112);
		local8.method5396(super.aBoolean355 ? 1 : 0);
		local8.method5396(super.aBoolean363 ? 1 : 0);
		local8.method5396(super.aBoolean366 ? 1 : 0);
		local8.method5396(super.aBoolean360 ? 1 : 0);
		local8.method5396(super.anInt5091);
		local8.method5396(super.aBoolean367 ? 1 : 0);
		local8.method5396(super.anInt5110);
		local8.method5396(super.anInt5109);
		local8.method5396(super.anInt5092);
		local8.method5393(super.anInt5095);
		local8.method5393(super.anInt5099);
		local8.method5396(Static259.method3864());
		local8.method5417(super.anInt5102);
		local8.method5396(super.anInt5090);
		local8.method5396(super.aBoolean369 ? 1 : 0);
		local8.method5396(super.aBoolean362 ? 1 : 0);
		local8.method5396(super.anInt5103);
		local8.method5396(super.aBoolean359 ? 1 : 0);
		local8.method5396(super.aBoolean368 ? 1 : 0);
		local8.method5396(super.anInt5093);
		local8.method5396(super.aBoolean358 ? 1 : 0);
		local8.method5396(super.anInt5098);
		local8.method5396(super.anInt5105);
		local8.method5396(super.aBoolean357 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!od;)V")
	public void method4239(@OriginalArg(1) Class180 arg0) {
		@Pc(5) Class222 local5 = null;
		try {
			@Pc(11) Class9 local11 = arg0.method4083("", true);
			while (local11.anInt368 == 0) {
				Static224.method3441(1L);
			}
			if (local11.anInt368 == 1) {
				local5 = (Class222) local11.anObject2;
				@Pc(37) Class1_Sub5 local37 = this.method4238();
				local5.method4986(local37.anInt6475, local37.aByteArray89, 0);
			}
		} catch (@Pc(47) Exception local47) {
		}
		try {
			if (local5 != null) {
				local5.method4988();
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(II)I")
	public int method4241(@OriginalArg(0) int arg0) {
		if (this.aBoolean370) {
			return 0;
		} else if (this.method4244(arg0)) {
			return super.aBoolean365 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!hp;)V")
	private void method4243(@OriginalArg(1) Class1_Sub5 arg0) {
		if (arg0.aByteArray89.length - arg0.anInt6475 < 1) {
			return;
		}
		@Pc(24) int local24 = arg0.method5366();
		if (local24 < 0 || local24 > 17) {
			return;
		}
		@Pc(35) byte local35;
		if (local24 == 17) {
			local35 = 40;
		} else if (local24 == 16) {
			local35 = 38;
		} else if (local24 == 15) {
			local35 = 37;
		} else if (local24 == 14) {
			local35 = 36;
		} else if (local24 == 13) {
			local35 = 35;
		} else if (local24 == 12) {
			local35 = 34;
		} else if (local24 == 11) {
			local35 = 33;
		} else if (local24 == 10) {
			local35 = 32;
		} else if (local24 == 9) {
			local35 = 31;
		} else if (local24 == 8) {
			local35 = 30;
		} else if (local24 == 7) {
			local35 = 29;
		} else if (local24 == 6) {
			local35 = 28;
		} else if (local24 == 5) {
			local35 = 28;
		} else if (local24 == 4) {
			local35 = 24;
		} else if (local24 == 3) {
			local35 = 23;
		} else if (local24 == 2) {
			local35 = 22;
		} else if (local24 == 1) {
			local35 = 23;
		} else {
			local35 = 19;
		}
		if (arg0.aByteArray89.length - arg0.anInt6475 < local35) {
			return;
		}
		super.anInt5111 = arg0.method5366();
		if (super.anInt5111 < 1) {
			super.anInt5111 = 1;
		} else if (super.anInt5111 > 4) {
			super.anInt5111 = 4;
		}
		this.method4249(arg0.method5366() == 1);
		super.aBoolean365 = arg0.method5366() == 1;
		super.aBoolean356 = arg0.method5366() == 1;
		super.aBoolean353 = arg0.method5366() == 1;
		super.anInt5093 = arg0.method5366() == 1 ? 1 : 0;
		super.aBoolean352 = arg0.method5366() == 1;
		super.aBoolean354 = arg0.method5366() == 1;
		super.aBoolean364 = arg0.method5366() == 1;
		super.anInt5107 = arg0.method5366();
		if (super.anInt5107 > 2) {
			super.anInt5107 = 2;
		}
		if (local24 >= 17) {
			super.anInt5112 = arg0.method5366();
		}
		if (local24 >= 2) {
			super.aBoolean355 = arg0.method5366() == 1;
			if (local24 >= 17) {
				super.aBoolean363 = arg0.method5366() == 1;
			}
		} else {
			super.aBoolean355 = arg0.method5366() == 1;
			arg0.method5366();
		}
		super.aBoolean366 = arg0.method5366() == 1;
		super.aBoolean360 = arg0.method5366() == 1;
		super.anInt5091 = arg0.method5366();
		if (super.anInt5091 > 2) {
			super.anInt5091 = 2;
		}
		super.anInt5108 = super.anInt5091;
		super.aBoolean367 = arg0.method5366() == 1;
		super.anInt5110 = arg0.method5366();
		if (super.anInt5110 > 127) {
			super.anInt5110 = 127;
		}
		super.anInt5109 = arg0.method5366();
		super.anInt5092 = arg0.method5366();
		if (super.anInt5092 > 127) {
			super.anInt5092 = 127;
		}
		if (local24 >= 1) {
			super.anInt5095 = arg0.method5362();
			super.anInt5099 = arg0.method5362();
		}
		if (local24 >= 3 && local24 < 6) {
			arg0.method5366();
		}
		@Pc(455) int local455;
		if (local24 >= 4) {
			local455 = arg0.method5366();
			if (local455 < 0 || local455 > 2) {
				local455 = 0;
			}
			if (Static79.anInt1766 < 96) {
				local455 = 0;
			}
			Static278.method4057(local455);
		}
		if (local24 >= 5) {
			super.anInt5102 = arg0.method5407();
		}
		local455 = 0;
		if (local24 >= 6) {
			super.anInt5090 = local455 = arg0.method5366();
		}
		if (super.anInt5090 != 1 && super.anInt5090 != 2) {
			super.anInt5090 = 2;
		}
		if (local24 >= 7) {
			super.aBoolean369 = arg0.method5366() == 1;
		}
		if (local24 >= 8) {
			super.aBoolean362 = arg0.method5366() == 1;
		}
		if (local24 >= 9) {
			super.anInt5103 = arg0.method5366();
		}
		if (super.anInt5103 < 0 || super.anInt5103 > Static39.method721(Static79.anInt1766)) {
			super.anInt5103 = 0;
		}
		if (local24 >= 10) {
			super.aBoolean359 = arg0.method5366() != 0;
		}
		if (local24 >= 11) {
			super.aBoolean368 = arg0.method5366() != 0;
		}
		if (local24 >= 12) {
			super.anInt5093 = arg0.method5366();
		}
		if (super.anInt5093 < 0 || super.anInt5093 > 2) {
			super.anInt5093 = 1;
		}
		if (local24 >= 13) {
			super.aBoolean358 = arg0.method5366() == 1;
		}
		if (local24 >= 14) {
			super.anInt5098 = arg0.method5366();
		} else if (local455 == 0) {
			super.anInt5098 = 2;
		} else {
			super.anInt5098 = 1;
		}
		if (super.anInt5098 < 0 || super.anInt5098 > 3) {
			super.anInt5098 = 2;
		}
		if (local24 >= 15) {
			super.anInt5105 = arg0.method5366();
			if (super.anInt5105 < 0 || super.anInt5105 > 4) {
				super.anInt5105 = Static71.anInt3035 == 1 ? 2 : 4;
			}
		}
		if (local24 >= 16) {
			super.aBoolean357 = arg0.method5366() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean357 = false;
				}
			} catch (@Pc(726) Throwable local726) {
			}
		}
		if (local24 < 17 && super.anInt5098 == 0) {
			super.anInt5098 = 2;
		}
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(II)Z")
	public boolean method4244(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean371 ? super.aBoolean361 : true;
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(II)Z")
	public boolean method4248(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean361 : true;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZZ)V")
	public void method4249(@OriginalArg(0) boolean arg0) {
		super.aBoolean361 = arg0;
		if (Static349.aClass115_4 != null) {
			Static349.aClass115_4.method2773(!this.method4244(Static143.anInt2766));
		}
	}
}
