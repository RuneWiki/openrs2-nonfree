import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ns", name = "Y", descriptor = "Z")
	public boolean aBoolean315 = false;

	@OriginalMember(owner = "client!ns", name = "Z", descriptor = "Z")
	public boolean aBoolean316 = false;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class1_Sub1(@OriginalArg(0) Class93 arg0) {
		super.anInt4515 = 3;
		this.method3590(true);
		super.anInt4503 = 0;
		super.aBoolean314 = true;
		super.aBoolean299 = false;
		super.aBoolean306 = true;
		super.aBoolean311 = true;
		super.anInt4508 = 0;
		super.anInt4509 = 255;
		super.anInt4511 = 0;
		super.aBoolean310 = true;
		super.aBoolean303 = true;
		super.anInt4518 = 0;
		super.aBoolean298 = true;
		super.aBoolean305 = true;
		super.aBoolean313 = true;
		super.anInt4512 = 127;
		super.anInt4520 = 2;
		super.anInt4506 = 0;
		super.aBoolean308 = true;
		super.anInt4501 = 1;
		super.aBoolean300 = true;
		super.anInt4521 = 127;
		if (Static102.anInt1724 < 96) {
			Static353.method4571(0);
		} else {
			Static353.method4571(2);
		}
		super.anInt4514 = 2;
		super.anInt4516 = 2;
		super.anInt4502 = Static377.anInt6245 == 1 ? 2 : 4;
		super.aBoolean297 = false;
		super.anInt4517 = 0;
		super.aBoolean304 = false;
		super.anInt4510 = 0;
		super.aBoolean301 = true;
		super.aBoolean302 = true;
		super.aBoolean309 = false;
		@Pc(131) Class139 local131 = null;
		try {
			@Pc(137) Class268 local137 = arg0.method2100("", true);
			while (local137.anInt7420 == 0) {
				Static140.method2004(1L);
			}
			if (local137.anInt7420 == 1) {
				local131 = (Class139) local137.anObject10;
				@Pc(164) byte[] local164 = new byte[(int) local131.method2900()];
				@Pc(179) int local179;
				for (@Pc(166) int local166 = 0; local166 < local164.length; local166 += local179) {
					local179 = local131.method2898(local164.length - local166, local166, local164);
					if (local179 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method3591(new Class5_Sub15(local164));
			}
		} catch (@Pc(209) Exception local209) {
		}
		try {
			if (local131 != null) {
				local131.method2897();
			}
		} catch (@Pc(216) Exception local216) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)Z")
	public boolean method3585(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean307 : true;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)Z")
	public boolean method3587(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean316 ? super.aBoolean307 : true;
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(II)I")
	public int method3589(@OriginalArg(1) int arg0) {
		if (this.aBoolean315) {
			return 0;
		} else if (this.method3587(arg0)) {
			return super.aBoolean310 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
	public void method3590(@OriginalArg(0) boolean arg0) {
		super.aBoolean307 = arg0;
		if (Static398.aClass256_4 != null) {
			Static398.aClass256_4.method5779(!this.method3587(Static146.anInt2644));
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!fh;Z)V")
	private void method3591(@OriginalArg(0) Class5_Sub15 arg0) {
		if (arg0.aByteArray93.length - arg0.anInt7013 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5539();
		if (local19 < 0 || local19 > 17) {
			return;
		}
		@Pc(40) byte local40;
		if (local19 == 17) {
			local40 = 40;
		} else if (local19 == 16) {
			local40 = 38;
		} else if (local19 == 15) {
			local40 = 37;
		} else if (local19 == 14) {
			local40 = 36;
		} else if (local19 == 13) {
			local40 = 35;
		} else if (local19 == 12) {
			local40 = 34;
		} else if (local19 == 11) {
			local40 = 33;
		} else if (local19 == 10) {
			local40 = 32;
		} else if (local19 == 9) {
			local40 = 31;
		} else if (local19 == 8) {
			local40 = 30;
		} else if (local19 == 7) {
			local40 = 29;
		} else if (local19 == 6) {
			local40 = 28;
		} else if (local19 == 5) {
			local40 = 28;
		} else if (local19 == 4) {
			local40 = 24;
		} else if (local19 == 3) {
			local40 = 23;
		} else if (local19 == 2) {
			local40 = 22;
		} else if (local19 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (local40 > arg0.aByteArray93.length - arg0.anInt7013) {
			return;
		}
		super.anInt4515 = arg0.method5539();
		if (super.anInt4515 < 1) {
			super.anInt4515 = 1;
		} else if (super.anInt4515 > 4) {
			super.anInt4515 = 4;
		}
		this.method3590(arg0.method5539() == 1);
		super.aBoolean310 = arg0.method5539() == 1;
		super.aBoolean300 = arg0.method5539() == 1;
		super.aBoolean314 = arg0.method5539() == 1;
		super.anInt4501 = arg0.method5539() == 1 ? 1 : 0;
		super.aBoolean308 = arg0.method5539() == 1;
		super.aBoolean311 = arg0.method5539() == 1;
		super.aBoolean303 = arg0.method5539() == 1;
		super.anInt4520 = arg0.method5539();
		if (super.anInt4520 > 2) {
			super.anInt4520 = 2;
		}
		if (local19 >= 17) {
			super.anInt4511 = arg0.method5539();
		}
		if (local19 < 2) {
			super.aBoolean298 = arg0.method5539() == 1;
			arg0.method5539();
		} else {
			super.aBoolean298 = arg0.method5539() == 1;
			if (local19 >= 17) {
				super.aBoolean299 = arg0.method5539() == 1;
			}
		}
		super.aBoolean306 = arg0.method5539() == 1;
		super.aBoolean313 = arg0.method5539() == 1;
		super.anInt4503 = arg0.method5539();
		if (super.anInt4503 > 2) {
			super.anInt4503 = 2;
		}
		super.anInt4518 = super.anInt4503;
		super.aBoolean305 = arg0.method5539() == 1;
		super.anInt4512 = arg0.method5539();
		if (super.anInt4512 > 127) {
			super.anInt4512 = 127;
		}
		super.anInt4509 = arg0.method5539();
		super.anInt4521 = arg0.method5539();
		if (super.anInt4521 > 127) {
			super.anInt4521 = 127;
		}
		if (local19 >= 1) {
			super.anInt4506 = arg0.method5598();
			super.anInt4508 = arg0.method5598();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method5539();
		}
		@Pc(481) int local481;
		if (local19 >= 4) {
			local481 = arg0.method5539();
			if (local481 < 0 || local481 > 2) {
				local481 = 0;
			}
			if (Static102.anInt1724 < 96) {
				local481 = 0;
			}
			Static353.method4571(local481);
		}
		if (local19 >= 5) {
			super.anInt4517 = arg0.method5603();
		}
		local481 = 0;
		if (local19 >= 6) {
			super.anInt4516 = local481 = arg0.method5539();
		}
		if (super.anInt4516 != 1 && super.anInt4516 != 2) {
			super.anInt4516 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean309 = arg0.method5539() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean297 = arg0.method5539() == 1;
		}
		if (local19 >= 9) {
			super.anInt4510 = arg0.method5539();
		}
		if (super.anInt4510 < 0 || super.anInt4510 > Static163.method2301(Static102.anInt1724)) {
			super.anInt4510 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean304 = arg0.method5539() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean301 = arg0.method5539() != 0;
		}
		if (local19 >= 12) {
			super.anInt4501 = arg0.method5539();
		}
		if (super.anInt4501 < 0 || super.anInt4501 > 2) {
			super.anInt4501 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean302 = arg0.method5539() == 1;
		}
		if (local19 >= 14) {
			super.anInt4514 = arg0.method5539();
		} else if (local481 == 0) {
			super.anInt4514 = 2;
		} else {
			super.anInt4514 = 1;
		}
		if (super.anInt4514 < 0 || super.anInt4514 > 3) {
			super.anInt4514 = 2;
		}
		if (local19 >= 15) {
			super.anInt4502 = arg0.method5539();
			if (super.anInt4502 < 0 || super.anInt4502 > 4) {
				super.anInt4502 = Static377.anInt6245 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean312 = arg0.method5539() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean312 = false;
				}
			} catch (@Pc(742) Throwable local742) {
			}
		}
		if (local19 < 17 && super.anInt4514 == 0) {
			super.anInt4514 = 2;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!gt;I)V")
	public void method3593(@OriginalArg(0) Class93 arg0) {
		@Pc(7) Class139 local7 = null;
		try {
			@Pc(13) Class268 local13 = arg0.method2100("", true);
			while (local13.anInt7420 == 0) {
				Static140.method2004(1L);
			}
			if (local13.anInt7420 == 1) {
				local7 = (Class139) local13.anObject10;
				@Pc(36) Class5_Sub15 local36 = this.method3594();
				local7.method2902(local36.aByteArray93, 0, local36.anInt7013);
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			if (local7 != null) {
				local7.method2897();
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)Lclient!fh;")
	public Class5_Sub15 method3594() {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(41);
		local8.method5583(17);
		local8.method5583(super.anInt4515);
		local8.method5583(super.aBoolean307 ? 1 : 0);
		local8.method5583(super.aBoolean310 ? 1 : 0);
		local8.method5583(super.aBoolean300 ? 1 : 0);
		local8.method5583(super.aBoolean314 ? 1 : 0);
		local8.method5583(0);
		local8.method5583(super.aBoolean308 ? 1 : 0);
		local8.method5583(super.aBoolean311 ? 1 : 0);
		local8.method5583(super.aBoolean303 ? 1 : 0);
		local8.method5583(super.anInt4520);
		local8.method5583(super.anInt4511);
		local8.method5583(super.aBoolean298 ? 1 : 0);
		local8.method5583(super.aBoolean299 ? 1 : 0);
		local8.method5583(super.aBoolean306 ? 1 : 0);
		local8.method5583(super.aBoolean313 ? 1 : 0);
		local8.method5583(super.anInt4503);
		local8.method5583(super.aBoolean305 ? 1 : 0);
		local8.method5583(super.anInt4512);
		local8.method5583(super.anInt4509);
		local8.method5583(super.anInt4521);
		local8.method5566(super.anInt4506);
		local8.method5566(super.anInt4508);
		local8.method5583(Static163.method2299());
		local8.method5550(super.anInt4517);
		local8.method5583(super.anInt4516);
		local8.method5583(super.aBoolean309 ? 1 : 0);
		local8.method5583(super.aBoolean297 ? 1 : 0);
		local8.method5583(super.anInt4510);
		local8.method5583(super.aBoolean304 ? 1 : 0);
		local8.method5583(super.aBoolean301 ? 1 : 0);
		local8.method5583(super.anInt4501);
		local8.method5583(super.aBoolean302 ? 1 : 0);
		local8.method5583(super.anInt4514);
		local8.method5583(super.anInt4502);
		local8.method5583(super.aBoolean312 ? 1 : 0);
		return local8;
	}
}
