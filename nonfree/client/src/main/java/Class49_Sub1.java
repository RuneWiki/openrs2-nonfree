import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!iv", name = "Z", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!iv", name = "bb", descriptor = "Z")
	public boolean aBoolean249 = false;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class49_Sub1(@OriginalArg(0) Class196 arg0) {
		super.anInt3220 = 3;
		this.method2486(true);
		super.anInt3213 = 0;
		super.aBoolean243 = true;
		super.anInt3200 = 0;
		super.anInt3208 = 1;
		super.anInt3217 = 2;
		super.aBoolean242 = true;
		super.anInt3211 = 0;
		super.aBoolean232 = true;
		super.aBoolean240 = false;
		super.anInt3212 = 0;
		super.aBoolean241 = true;
		super.aBoolean236 = true;
		super.anInt3199 = 127;
		super.aBoolean246 = true;
		super.aBoolean231 = true;
		super.aBoolean233 = true;
		super.anInt3203 = 255;
		super.aBoolean235 = true;
		super.aBoolean234 = true;
		super.anInt3204 = 127;
		super.anInt3202 = 0;
		if (Static18.anInt296 >= 96) {
			Static420.method5669(2);
		} else {
			Static420.method5669(0);
		}
		super.aBoolean230 = false;
		super.aBoolean245 = false;
		super.anInt3207 = 2;
		super.aBoolean239 = false;
		super.aBoolean238 = true;
		super.aBoolean247 = true;
		super.anInt3218 = 0;
		super.anInt3201 = 0;
		super.anInt3216 = Static433.anInt7158 == 1 ? 2 : 4;
		super.anInt3221 = 2;
		@Pc(131) Class70 local131 = null;
		try {
			@Pc(137) Class45 local137 = arg0.method3908("", true);
			while (local137.anInt1129 == 0) {
				Static435.method5777(1L);
			}
			if (local137.anInt1129 == 1) {
				local131 = (Class70) local137.anObject5;
				@Pc(159) byte[] local159 = new byte[(int) local131.method1446()];
				@Pc(173) int local173;
				for (@Pc(161) int local161 = 0; local161 < local159.length; local161 += local173) {
					local173 = local131.method1445(local161, local159, local159.length - local161);
					if (local173 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2490(new Class4_Sub9(local159));
			}
		} catch (@Pc(198) Exception local198) {
		}
		try {
			if (local131 != null) {
				local131.method1443();
			}
		} catch (@Pc(205) Exception local205) {
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Z")
	public boolean method2482(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean244 : true;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLclient!pc;)V")
	public void method2483(@OriginalArg(1) Class196 arg0) {
		@Pc(7) Class70 local7 = null;
		try {
			@Pc(18) Class45 local18 = arg0.method3908("", true);
			while (local18.anInt1129 == 0) {
				Static435.method5777(1L);
			}
			if (local18.anInt1129 == 1) {
				local7 = (Class70) local18.anObject5;
				@Pc(43) Class4_Sub9 local43 = this.method2491();
				local7.method1441(local43.aByteArray81, local43.anInt6207, 0);
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			if (local7 != null) {
				local7.method1443();
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(IB)Z")
	public boolean method2485(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean249 ? super.aBoolean244 : true;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V")
	public void method2486(@OriginalArg(1) boolean arg0) {
		super.aBoolean244 = arg0;
		if (Static51.aClass151_1 != null) {
			Static51.aClass151_1.method2915(!this.method2485(Static341.anInt5549));
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(II)I")
	public int method2488(@OriginalArg(1) int arg0) {
		if (this.aBoolean248) {
			return 0;
		} else if (this.method2485(arg0)) {
			return super.aBoolean235 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!fh;B)V")
	private void method2490(@OriginalArg(0) Class4_Sub9 arg0) {
		if (arg0.aByteArray81.length - arg0.anInt6207 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5007();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(42) byte local42;
		if (local21 == 17) {
			local42 = 40;
		} else if (local21 == 16) {
			local42 = 38;
		} else if (local21 == 15) {
			local42 = 37;
		} else if (local21 == 14) {
			local42 = 36;
		} else if (local21 == 13) {
			local42 = 35;
		} else if (local21 == 12) {
			local42 = 34;
		} else if (local21 == 11) {
			local42 = 33;
		} else if (local21 == 10) {
			local42 = 32;
		} else if (local21 == 9) {
			local42 = 31;
		} else if (local21 == 8) {
			local42 = 30;
		} else if (local21 == 7) {
			local42 = 29;
		} else if (local21 == 6) {
			local42 = 28;
		} else if (local21 == 5) {
			local42 = 28;
		} else if (local21 == 4) {
			local42 = 24;
		} else if (local21 == 3) {
			local42 = 23;
		} else if (local21 == 2) {
			local42 = 22;
		} else if (local21 == 1) {
			local42 = 23;
		} else {
			local42 = 19;
		}
		if (local42 > arg0.aByteArray81.length - arg0.anInt6207) {
			return;
		}
		super.anInt3220 = arg0.method5007();
		if (super.anInt3220 < 1) {
			super.anInt3220 = 1;
		} else if (super.anInt3220 > 4) {
			super.anInt3220 = 4;
		}
		this.method2486(arg0.method5007() == 1);
		super.aBoolean235 = arg0.method5007() == 1;
		super.aBoolean233 = arg0.method5007() == 1;
		super.aBoolean241 = arg0.method5007() == 1;
		super.anInt3208 = arg0.method5007() == 1 ? 1 : 0;
		super.aBoolean246 = arg0.method5007() == 1;
		super.aBoolean232 = arg0.method5007() == 1;
		super.aBoolean231 = arg0.method5007() == 1;
		super.anInt3217 = arg0.method5007();
		if (super.anInt3217 > 2) {
			super.anInt3217 = 2;
		}
		if (local21 >= 17) {
			super.anInt3213 = arg0.method5007();
		}
		if (local21 >= 2) {
			super.aBoolean243 = arg0.method5007() == 1;
			if (local21 >= 17) {
				super.aBoolean240 = arg0.method5007() == 1;
			}
		} else {
			super.aBoolean243 = arg0.method5007() == 1;
			arg0.method5007();
		}
		super.aBoolean236 = arg0.method5007() == 1;
		super.aBoolean242 = arg0.method5007() == 1;
		super.anInt3202 = arg0.method5007();
		if (super.anInt3202 > 2) {
			super.anInt3202 = 2;
		}
		super.anInt3200 = super.anInt3202;
		super.aBoolean234 = arg0.method5007() == 1;
		super.anInt3199 = arg0.method5007();
		if (super.anInt3199 > 127) {
			super.anInt3199 = 127;
		}
		super.anInt3203 = arg0.method5007();
		super.anInt3204 = arg0.method5007();
		if (super.anInt3204 > 127) {
			super.anInt3204 = 127;
		}
		if (local21 >= 1) {
			super.anInt3211 = arg0.method5028();
			super.anInt3212 = arg0.method5028();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method5007();
		}
		@Pc(484) int local484;
		if (local21 >= 4) {
			local484 = arg0.method5007();
			if (local484 < 0 || local484 > 2) {
				local484 = 0;
			}
			if (Static18.anInt296 < 96) {
				local484 = 0;
			}
			Static420.method5669(local484);
		}
		if (local21 >= 5) {
			super.anInt3218 = arg0.method4997();
		}
		local484 = 0;
		if (local21 >= 6) {
			super.anInt3207 = local484 = arg0.method5007();
		}
		if (super.anInt3207 != 1 && super.anInt3207 != 2) {
			super.anInt3207 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean239 = arg0.method5007() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean230 = arg0.method5007() == 1;
		}
		if (local21 >= 9) {
			super.anInt3201 = arg0.method5007();
		}
		if (super.anInt3201 < 0 || super.anInt3201 > Static134.method1950(Static18.anInt296)) {
			super.anInt3201 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean245 = arg0.method5007() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean238 = arg0.method5007() != 0;
		}
		if (local21 >= 12) {
			super.anInt3208 = arg0.method5007();
		}
		if (super.anInt3208 < 0 || super.anInt3208 > 2) {
			super.anInt3208 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean247 = arg0.method5007() == 1;
		}
		if (local21 >= 14) {
			super.anInt3221 = arg0.method5007();
		} else if (local484 == 0) {
			super.anInt3221 = 2;
		} else {
			super.anInt3221 = 1;
		}
		if (super.anInt3221 < 0 || super.anInt3221 > 3) {
			super.anInt3221 = 2;
		}
		if (local21 >= 15) {
			super.anInt3216 = arg0.method5007();
			if (super.anInt3216 < 0 || super.anInt3216 > 4) {
				super.anInt3216 = Static433.anInt7158 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean237 = arg0.method5007() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean237 = false;
				}
			} catch (@Pc(734) Throwable local734) {
			}
		}
		if (local21 < 17 && super.anInt3221 == 0) {
			super.anInt3221 = 2;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)Lclient!fh;")
	public Class4_Sub9 method2491() {
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(41);
		local8.method4999(17);
		local8.method4999(super.anInt3220);
		local8.method4999(super.aBoolean244 ? 1 : 0);
		local8.method4999(super.aBoolean235 ? 1 : 0);
		local8.method4999(super.aBoolean233 ? 1 : 0);
		local8.method4999(super.aBoolean241 ? 1 : 0);
		local8.method4999(0);
		local8.method4999(super.aBoolean246 ? 1 : 0);
		local8.method4999(super.aBoolean232 ? 1 : 0);
		local8.method4999(super.aBoolean231 ? 1 : 0);
		local8.method4999(super.anInt3217);
		local8.method4999(super.anInt3213);
		local8.method4999(super.aBoolean243 ? 1 : 0);
		local8.method4999(super.aBoolean240 ? 1 : 0);
		local8.method4999(super.aBoolean236 ? 1 : 0);
		local8.method4999(super.aBoolean242 ? 1 : 0);
		local8.method4999(super.anInt3202);
		local8.method4999(super.aBoolean234 ? 1 : 0);
		local8.method4999(super.anInt3199);
		local8.method4999(super.anInt3203);
		local8.method4999(super.anInt3204);
		local8.method5029(super.anInt3211);
		local8.method5029(super.anInt3212);
		local8.method4999(Static370.method4889());
		local8.method5047(super.anInt3218);
		local8.method4999(super.anInt3207);
		local8.method4999(super.aBoolean239 ? 1 : 0);
		local8.method4999(super.aBoolean230 ? 1 : 0);
		local8.method4999(super.anInt3201);
		local8.method4999(super.aBoolean245 ? 1 : 0);
		local8.method4999(super.aBoolean238 ? 1 : 0);
		local8.method4999(super.anInt3208);
		local8.method4999(super.aBoolean247 ? 1 : 0);
		local8.method4999(super.anInt3221);
		local8.method4999(super.anInt3216);
		local8.method4999(super.aBoolean237 ? 1 : 0);
		return local8;
	}
}
