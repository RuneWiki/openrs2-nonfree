import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class165_Sub1 extends Class165 {

	@OriginalMember(owner = "client!lt", name = "V", descriptor = "Z")
	public boolean aBoolean309 = false;

	@OriginalMember(owner = "client!lt", name = "S", descriptor = "Z")
	public boolean aBoolean308 = false;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!pb;)V")
	public Class165_Sub1(@OriginalArg(0) Class194 arg0) {
		super.anInt4210 = 3;
		this.method3399(true);
		super.aBoolean298 = true;
		super.anInt4205 = 127;
		super.anInt4201 = 0;
		super.aBoolean306 = true;
		super.anInt4208 = 255;
		super.aBoolean307 = true;
		super.anInt4198 = 2;
		super.aBoolean291 = true;
		super.aBoolean294 = true;
		super.anInt4202 = 127;
		super.anInt4196 = 0;
		super.anInt4211 = 0;
		super.anInt4215 = 1;
		super.aBoolean300 = false;
		super.aBoolean303 = true;
		super.anInt4212 = 0;
		super.anInt4194 = 0;
		super.aBoolean305 = true;
		super.aBoolean295 = true;
		super.aBoolean292 = true;
		super.aBoolean293 = true;
		if (Static170.anInt3068 < 96) {
			Static108.method1792(0);
		} else {
			Static108.method1792(2);
		}
		super.anInt4197 = 0;
		super.aBoolean296 = false;
		super.aBoolean302 = false;
		super.aBoolean301 = true;
		super.anInt4214 = Static323.anInt5773 == 1 ? 2 : 4;
		super.anInt4200 = 0;
		super.anInt4193 = 2;
		super.aBoolean290 = false;
		super.anInt4206 = 2;
		super.aBoolean304 = true;
		@Pc(131) Class213 local131 = null;
		try {
			@Pc(137) Class136 local137 = arg0.method4405(true, "");
			while (local137.anInt3418 == 0) {
				Static167.method6157(1L);
			}
			if (local137.anInt3418 == 1) {
				local131 = (Class213) local137.anObject10;
				@Pc(164) byte[] local164 = new byte[(int) local131.method4949()];
				@Pc(179) int local179;
				for (@Pc(166) int local166 = 0; local166 < local164.length; local166 += local179) {
					local179 = local131.method4945(local164, local166, local164.length - local166);
					if (local179 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method3394(new Class2_Sub17(local164));
			}
		} catch (@Pc(205) Exception local205) {
		}
		try {
			if (local131 != null) {
				local131.method4946();
			}
		} catch (@Pc(212) Exception local212) {
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)Lclient!hw;")
	public Class2_Sub17 method3393() {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(41);
		local8.method6172(17);
		local8.method6172(super.anInt4210);
		local8.method6172(super.aBoolean299 ? 1 : 0);
		local8.method6172(super.aBoolean298 ? 1 : 0);
		local8.method6172(super.aBoolean303 ? 1 : 0);
		local8.method6172(super.aBoolean294 ? 1 : 0);
		local8.method6172(0);
		local8.method6172(super.aBoolean292 ? 1 : 0);
		local8.method6172(super.aBoolean295 ? 1 : 0);
		local8.method6172(super.aBoolean293 ? 1 : 0);
		local8.method6172(super.anInt4198);
		local8.method6172(super.anInt4194);
		local8.method6172(super.aBoolean291 ? 1 : 0);
		local8.method6172(super.aBoolean300 ? 1 : 0);
		local8.method6172(super.aBoolean307 ? 1 : 0);
		local8.method6172(super.aBoolean305 ? 1 : 0);
		local8.method6172(super.anInt4196);
		local8.method6172(super.aBoolean306 ? 1 : 0);
		local8.method6172(super.anInt4205);
		local8.method6172(super.anInt4208);
		local8.method6172(super.anInt4202);
		local8.method6130(super.anInt4212);
		local8.method6130(super.anInt4211);
		local8.method6172(Static109.method1801());
		local8.method6170(super.anInt4197);
		local8.method6172(super.anInt4206);
		local8.method6172(super.aBoolean302 ? 1 : 0);
		local8.method6172(super.aBoolean290 ? 1 : 0);
		local8.method6172(super.anInt4200);
		local8.method6172(super.aBoolean296 ? 1 : 0);
		local8.method6172(super.aBoolean304 ? 1 : 0);
		local8.method6172(super.anInt4215);
		local8.method6172(super.aBoolean301 ? 1 : 0);
		local8.method6172(super.anInt4193);
		local8.method6172(super.anInt4214);
		local8.method6172(super.aBoolean297 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!hw;I)V")
	private void method3394(@OriginalArg(0) Class2_Sub17 arg0) {
		if (arg0.aByteArray94.length - arg0.anInt7523 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method6138();
		if (local19 < 0 || local19 > 17) {
			return;
		}
		@Pc(37) byte local37;
		if (local19 == 17) {
			local37 = 40;
		} else if (local19 == 16) {
			local37 = 38;
		} else if (local19 == 15) {
			local37 = 37;
		} else if (local19 == 14) {
			local37 = 36;
		} else if (local19 == 13) {
			local37 = 35;
		} else if (local19 == 12) {
			local37 = 34;
		} else if (local19 == 11) {
			local37 = 33;
		} else if (local19 == 10) {
			local37 = 32;
		} else if (local19 == 9) {
			local37 = 31;
		} else if (local19 == 8) {
			local37 = 30;
		} else if (local19 == 7) {
			local37 = 29;
		} else if (local19 == 6) {
			local37 = 28;
		} else if (local19 == 5) {
			local37 = 28;
		} else if (local19 == 4) {
			local37 = 24;
		} else if (local19 == 3) {
			local37 = 23;
		} else if (local19 == 2) {
			local37 = 22;
		} else if (local19 == 1) {
			local37 = 23;
		} else {
			local37 = 19;
		}
		if (arg0.aByteArray94.length - arg0.anInt7523 < local37) {
			return;
		}
		super.anInt4210 = arg0.method6138();
		if (super.anInt4210 < 1) {
			super.anInt4210 = 1;
		} else if (super.anInt4210 > 4) {
			super.anInt4210 = 4;
		}
		this.method3399(arg0.method6138() == 1);
		super.aBoolean298 = arg0.method6138() == 1;
		super.aBoolean303 = arg0.method6138() == 1;
		super.aBoolean294 = arg0.method6138() == 1;
		super.anInt4215 = arg0.method6138() == 1 ? 1 : 0;
		super.aBoolean292 = arg0.method6138() == 1;
		super.aBoolean295 = arg0.method6138() == 1;
		super.aBoolean293 = arg0.method6138() == 1;
		super.anInt4198 = arg0.method6138();
		if (super.anInt4198 > 2) {
			super.anInt4198 = 2;
		}
		if (local19 >= 17) {
			super.anInt4194 = arg0.method6138();
		}
		if (local19 < 2) {
			super.aBoolean291 = arg0.method6138() == 1;
			arg0.method6138();
		} else {
			super.aBoolean291 = arg0.method6138() == 1;
			if (local19 >= 17) {
				super.aBoolean300 = arg0.method6138() == 1;
			}
		}
		super.aBoolean307 = arg0.method6138() == 1;
		super.aBoolean305 = arg0.method6138() == 1;
		super.anInt4196 = arg0.method6138();
		if (super.anInt4196 > 2) {
			super.anInt4196 = 2;
		}
		super.anInt4201 = super.anInt4196;
		super.aBoolean306 = arg0.method6138() == 1;
		super.anInt4205 = arg0.method6138();
		if (super.anInt4205 > 127) {
			super.anInt4205 = 127;
		}
		super.anInt4208 = arg0.method6138();
		super.anInt4202 = arg0.method6138();
		if (super.anInt4202 > 127) {
			super.anInt4202 = 127;
		}
		if (local19 >= 1) {
			super.anInt4212 = arg0.method6148();
			super.anInt4211 = arg0.method6148();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method6138();
		}
		@Pc(487) int local487;
		if (local19 >= 4) {
			local487 = arg0.method6138();
			if (local487 < 0 || local487 > 2) {
				local487 = 0;
			}
			if (Static170.anInt3068 < 96) {
				local487 = 0;
			}
			Static108.method1792(local487);
		}
		if (local19 >= 5) {
			super.anInt4197 = arg0.method6129();
		}
		local487 = 0;
		if (local19 >= 6) {
			super.anInt4206 = local487 = arg0.method6138();
		}
		if (super.anInt4206 != 1 && super.anInt4206 != 2) {
			super.anInt4206 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean302 = arg0.method6138() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean290 = arg0.method6138() == 1;
		}
		if (local19 >= 9) {
			super.anInt4200 = arg0.method6138();
		}
		if (super.anInt4200 < 0 || super.anInt4200 > Static278.method3967(Static170.anInt3068)) {
			super.anInt4200 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean296 = arg0.method6138() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean304 = arg0.method6138() != 0;
		}
		if (local19 >= 12) {
			super.anInt4215 = arg0.method6138();
		}
		if (super.anInt4215 < 0 || super.anInt4215 > 2) {
			super.anInt4215 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean301 = arg0.method6138() == 1;
		}
		if (local19 >= 14) {
			super.anInt4193 = arg0.method6138();
		} else if (local487 == 0) {
			super.anInt4193 = 2;
		} else {
			super.anInt4193 = 1;
		}
		if (super.anInt4193 < 0 || super.anInt4193 > 3) {
			super.anInt4193 = 2;
		}
		if (local19 >= 15) {
			super.anInt4214 = arg0.method6138();
			if (super.anInt4214 < 0 || super.anInt4214 > 4) {
				super.anInt4214 = Static323.anInt5773 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean297 = arg0.method6138() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean297 = false;
				}
			} catch (@Pc(747) Throwable local747) {
			}
		}
		if (local19 < 17 && super.anInt4193 == 0) {
			super.anInt4193 = 2;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)Z")
	public boolean method3395(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean299 : true;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Z")
	public boolean method3397(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean309 ? super.aBoolean299 : true;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)I")
	public int method3398(@OriginalArg(1) int arg0) {
		if (this.aBoolean308) {
			return 0;
		} else if (this.method3397(arg0)) {
			return super.aBoolean298 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZ)V")
	public void method3399(@OriginalArg(1) boolean arg0) {
		super.aBoolean299 = arg0;
		if (Static249.aClass39_2 != null) {
			Static249.aClass39_2.method745(!this.method3397(Static404.anInt2752));
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!pb;)V")
	public void method3400(@OriginalArg(1) Class194 arg0) {
		@Pc(7) Class213 local7 = null;
		try {
			@Pc(13) Class136 local13 = arg0.method4405(true, "");
			while (local13.anInt3418 == 0) {
				Static167.method6157(1L);
			}
			if (local13.anInt3418 == 1) {
				local7 = (Class213) local13.anObject10;
				@Pc(33) Class2_Sub17 local33 = this.method3393();
				local7.method4947(local33.anInt7523, local33.aByteArray94, 0);
			}
		} catch (@Pc(43) Exception local43) {
		}
		try {
			if (local7 != null) {
				local7.method4946();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}
}
