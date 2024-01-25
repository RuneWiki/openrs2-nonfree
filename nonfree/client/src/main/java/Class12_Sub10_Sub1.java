import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class12_Sub10_Sub1 extends Class12_Sub10 {

	@OriginalMember(owner = "client!dn", name = "zb", descriptor = "I")
	public int anInt2260;

	@OriginalMember(owner = "client!dn", name = "hb", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!dn", name = "nb", descriptor = "Z")
	public boolean aBoolean191 = false;

	@OriginalMember(owner = "client!dn", name = "Bb", descriptor = "Z")
	public boolean aBoolean193 = false;

	@OriginalMember(owner = "client!dn", name = "lb", descriptor = "Z")
	public boolean lb = false;

	@OriginalMember(owner = "client!dn", name = "xb", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!dj;)V")
	public Class12_Sub10_Sub1(@OriginalArg(0) Class71 arg0) {
		super.anInt2219 = 3;
		super.anInt2224 = 3;
		this.method2045(true);
		super.aBoolean173 = true;
		super.aBoolean181 = true;
		super.aBoolean183 = true;
		super.anInt2223 = 0;
		super.aBoolean174 = true;
		super.aBoolean179 = true;
		super.aBoolean175 = true;
		super.anInt2236 = 0;
		super.anInt2237 = 0;
		super.anInt2222 = 127;
		super.aBoolean178 = true;
		super.aBoolean176 = false;
		super.anInt2229 = 0;
		super.aBoolean188 = true;
		super.anInt2226 = 0;
		super.anInt2218 = 1;
		super.anInt2232 = 127;
		super.aBoolean187 = true;
		super.anInt2227 = 127;
		super.aBoolean182 = true;
		super.anInt2231 = 2;
		if (Static458.anInt8335 >= 96) {
			Static378.method6005(2);
		} else {
			Static378.method6005(0);
		}
		super.aBoolean189 = false;
		super.aBoolean184 = false;
		super.anInt2230 = 2;
		super.anInt2235 = 0;
		super.aBoolean186 = true;
		super.aBoolean172 = true;
		super.anInt2225 = 2;
		super.anInt2238 = 0;
		super.aBoolean177 = false;
		super.anInt2233 = Static52.anInt1395 == 1 ? 2 : 4;
		@Pc(143) Class308 local143 = null;
		try {
			@Pc(149) Class55 local149 = arg0.method1980("", true);
			while (local149.anInt1481 == 0) {
				Static17.method388(1L);
			}
			if (local149.anInt1481 == 1) {
				local143 = (Class308) local149.anObject5;
				@Pc(171) byte[] local171 = new byte[(int) local143.method7735()];
				@Pc(186) int local186;
				for (@Pc(173) int local173 = 0; local173 < local171.length; local173 += local186) {
					local186 = local143.method7737(local171, local171.length - local173, local173);
					if (local186 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2052(new Class12_Sub8(local171));
			}
		} catch (@Pc(215) Exception local215) {
		}
		try {
			if (local143 != null) {
				local143.method7739();
			}
		} catch (@Pc(222) Exception local222) {
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
	public void method2045(@OriginalArg(0) boolean arg0) {
		super.aBoolean185 = arg0;
		if (Static49.aClass155_2 != null) {
			Static49.aClass155_2.method4068(!this.method2057(Static148.anInt6867));
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
	public int method2046(@OriginalArg(0) int arg0) {
		if (this.lb) {
			return 0;
		} else if (this.method2057(arg0)) {
			return super.aBoolean173 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)I")
	private int method2049(@OriginalArg(1) int arg0) {
		@Pc(21) byte local21;
		if (arg0 > 12000) {
			this.method2051();
			local21 = 4;
		} else if (arg0 > 5000) {
			local21 = 3;
			this.method2053();
		} else if (arg0 <= 2000) {
			this.method2060();
			local21 = 1;
		} else {
			this.method2054();
			local21 = 2;
		}
		if (Static148.anInt6867 != 2) {
			super.anInt2230 = 2;
			Static201.method3814(2);
		}
		this.method2056(Static375.aClass71_3);
		return local21;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
	public void method2051() {
		this.method2045(true);
		super.anInt2231 = super.anInt2237 = 2;
		super.aBoolean179 = true;
		super.anInt2218 = 1;
		super.aBoolean182 = true;
		super.aBoolean187 = true;
		super.aBoolean174 = true;
		super.aBoolean188 = true;
		super.aBoolean176 = true;
		super.aBoolean178 = true;
		super.aBoolean175 = true;
		super.aBoolean180 = true;
		super.aBoolean173 = true;
		super.aBoolean183 = true;
		super.anInt2229 = super.anInt2226 = 0;
		if (Static458.anInt8335 > 95) {
			Static378.method6005(2);
		} else {
			Static378.method6005(0);
		}
		super.anInt2235 = 0;
		super.aBoolean177 = false;
		super.aBoolean186 = true;
		this.method2062();
		super.anInt2224 = 4;
		Static261.method4418();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!daa;)V")
	private void method2052(@OriginalArg(1) Class12_Sub8 arg0) {
		if (arg0.aByteArray82.length - arg0.anInt6217 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5216();
		if (local21 < 0 || local21 > 18) {
			return;
		}
		@Pc(32) byte local32;
		if (local21 == 18) {
			local32 = 41;
		} else if (local21 == 17) {
			local32 = 40;
		} else if (local21 == 16) {
			local32 = 38;
		} else if (local21 == 15) {
			local32 = 37;
		} else if (local21 == 14) {
			local32 = 36;
		} else if (local21 == 13) {
			local32 = 35;
		} else if (local21 == 12) {
			local32 = 34;
		} else if (local21 == 11) {
			local32 = 33;
		} else if (local21 == 10) {
			local32 = 32;
		} else if (local21 == 9) {
			local32 = 31;
		} else if (local21 == 8) {
			local32 = 30;
		} else if (local21 == 7) {
			local32 = 29;
		} else if (local21 == 6) {
			local32 = 28;
		} else if (local21 == 5) {
			local32 = 28;
		} else if (local21 == 4) {
			local32 = 24;
		} else if (local21 == 3) {
			local32 = 23;
		} else if (local21 == 2) {
			local32 = 22;
		} else if (local21 == 1) {
			local32 = 23;
		} else {
			local32 = 19;
		}
		if (arg0.aByteArray82.length - arg0.anInt6217 < local32) {
			return;
		}
		super.anInt2219 = arg0.method5216();
		if (super.anInt2219 < 1) {
			super.anInt2219 = 1;
		} else if (super.anInt2219 > 4) {
			super.anInt2219 = 4;
		}
		this.method2045(arg0.method5216() == 1);
		super.aBoolean173 = arg0.method5216() == 1;
		super.aBoolean183 = arg0.method5216() == 1;
		super.aBoolean187 = arg0.method5216() == 1;
		super.anInt2218 = arg0.method5216() == 1 ? 1 : 0;
		super.aBoolean179 = arg0.method5216() == 1;
		super.aBoolean188 = arg0.method5216() == 1;
		super.aBoolean182 = arg0.method5216() == 1;
		super.anInt2231 = arg0.method5216();
		if (super.anInt2231 > 2) {
			super.anInt2231 = 2;
		}
		if (local21 >= 17) {
			super.anInt2237 = arg0.method5216();
		}
		if (local21 >= 2) {
			super.aBoolean175 = arg0.method5216() == 1;
			if (local21 >= 17) {
				super.aBoolean176 = arg0.method5216() == 1;
			}
		} else {
			super.aBoolean175 = arg0.method5216() == 1;
			arg0.method5216();
		}
		super.aBoolean178 = arg0.method5216() == 1;
		super.aBoolean174 = arg0.method5216() == 1;
		super.anInt2229 = arg0.method5216();
		if (super.anInt2229 > 2) {
			super.anInt2229 = 2;
		}
		super.anInt2226 = super.anInt2229;
		super.aBoolean181 = arg0.method5216() == 1;
		super.anInt2232 = arg0.method5216();
		if (super.anInt2232 > 127) {
			super.anInt2232 = 127;
		}
		super.anInt2227 = arg0.method5216();
		super.anInt2222 = arg0.method5216();
		if (super.anInt2222 > 127) {
			super.anInt2222 = 127;
		}
		if (local21 >= 1) {
			super.anInt2236 = arg0.method5199();
			super.anInt2223 = arg0.method5199();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method5216();
		}
		@Pc(486) int local486;
		if (local21 >= 4) {
			local486 = arg0.method5216();
			if (local486 < 0 || local486 > 2) {
				local486 = 0;
			}
			if (Static458.anInt8335 < 96) {
				local486 = 0;
			}
			Static378.method6005(local486);
		}
		if (local21 >= 5) {
			super.anInt2238 = arg0.method5225();
		}
		local486 = 0;
		if (local21 >= 6) {
			super.anInt2225 = local486 = arg0.method5216();
		}
		if (super.anInt2225 != 1 && super.anInt2225 != 2) {
			super.anInt2225 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean189 = arg0.method5216() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean184 = arg0.method5216() == 1;
		}
		if (local21 >= 9) {
			super.anInt2235 = arg0.method5216();
		}
		if (super.anInt2235 < 0 || super.anInt2235 > Static305.method4965(Static458.anInt8335)) {
			super.anInt2235 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean177 = arg0.method5216() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean172 = arg0.method5216() != 0;
		}
		if (local21 >= 12) {
			super.anInt2218 = arg0.method5216();
		}
		if (super.anInt2218 < 0 || super.anInt2218 > 2) {
			super.anInt2218 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean186 = arg0.method5216() == 1;
		}
		if (local21 >= 14) {
			super.anInt2230 = arg0.method5216();
		} else if (local486 == 0) {
			super.anInt2230 = 2;
		} else {
			super.anInt2230 = 1;
		}
		if (super.anInt2230 < 0 || super.anInt2230 > 5) {
			super.anInt2230 = 2;
		}
		if (local21 >= 15) {
			super.anInt2233 = arg0.method5216();
			if (super.anInt2233 < 0 || super.anInt2233 > 4) {
				super.anInt2233 = Static52.anInt1395 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean180 = arg0.method5216() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean180 = false;
				}
			} catch (@Pc(752) Throwable local752) {
			}
		}
		if (local21 < 17 && super.anInt2230 == 0) {
			super.anInt2230 = 2;
		}
		if (local21 < 18) {
			return;
		}
		super.anInt2224 = arg0.method5216();
		if (super.anInt2224 < 0 || super.anInt2224 > 4) {
			super.anInt2224 = 0;
		}
		if (super.anInt2224 == 2) {
			super.aBoolean183 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	public void method2053() {
		this.method2045(true);
		super.aBoolean179 = true;
		super.aBoolean183 = true;
		super.aBoolean182 = true;
		super.anInt2229 = super.anInt2226 = 0;
		super.anInt2218 = 1;
		super.aBoolean174 = true;
		super.aBoolean187 = true;
		super.aBoolean173 = true;
		super.aBoolean180 = true;
		super.anInt2231 = super.anInt2237 = 1;
		super.aBoolean188 = true;
		super.aBoolean175 = true;
		super.aBoolean176 = false;
		super.aBoolean178 = false;
		if (Static458.anInt8335 <= 95) {
			Static378.method6005(0);
		} else {
			Static378.method6005(1);
		}
		super.aBoolean177 = false;
		super.anInt2235 = 0;
		super.aBoolean186 = true;
		this.method2062();
		super.anInt2224 = 3;
		Static261.method4418();
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
	public void method2054() {
		this.method2045(true);
		super.aBoolean188 = false;
		super.anInt2218 = 0;
		super.aBoolean174 = false;
		super.aBoolean183 = true;
		super.aBoolean173 = false;
		super.aBoolean180 = false;
		super.aBoolean187 = false;
		super.anInt2231 = super.anInt2237 = 0;
		super.aBoolean176 = false;
		super.aBoolean175 = false;
		super.aBoolean182 = false;
		super.anInt2229 = super.anInt2226 = 0;
		super.aBoolean179 = false;
		super.aBoolean178 = false;
		Static378.method6005(0);
		super.anInt2235 = 0;
		super.aBoolean186 = true;
		super.aBoolean177 = false;
		this.method2062();
		super.anInt2224 = 2;
		Static261.method4418();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)I")
	private int method2055() {
		@Pc(23) byte local23;
		if (Static458.anInt8335 >= 96) {
			@Pc(13) int local13 = Static187.method3648();
			if (local13 <= 100) {
				this.method2051();
				local23 = 4;
			} else if (local13 <= 500) {
				this.method2053();
				local23 = 3;
			} else if (local13 <= 1000) {
				this.method2054();
				local23 = 2;
			} else {
				local23 = 1;
				this.method2060();
			}
		} else {
			local23 = 1;
			this.method2060();
		}
		if (Static148.anInt6867 != 0) {
			super.anInt2230 = 0;
			Static201.method3814(0);
		}
		this.method2056(Static375.aClass71_3);
		return local23;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLclient!dj;)V")
	public void method2056(@OriginalArg(1) Class71 arg0) {
		@Pc(12) Class308 local12 = null;
		try {
			@Pc(18) Class55 local18 = arg0.method1980("", true);
			while (local18.anInt1481 == 0) {
				Static17.method388(1L);
			}
			if (local18.anInt1481 == 1) {
				local12 = (Class308) local18.anObject5;
				@Pc(40) Class12_Sub8 local40 = new Class12_Sub8(Static165.method3356());
				this.method2039(local40);
				local12.method7736(local40.anInt6217, local40.aByteArray82, 0);
			}
		} catch (@Pc(54) Exception local54) {
		}
		try {
			if (local12 != null) {
				local12.method7739();
			}
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(IB)Z")
	public boolean method2057(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean191 ? super.aBoolean185 : true;
	}

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "(I)I")
	public int method2058() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static92.anInt2161 != 3 && Static92.anInt2161 != 2) {
			if (Static92.aString17.startsWith("win")) {
				local11 = true;
				local9 = true;
				if (!Static92.aString18.startsWith("amd64") && !Static92.aString18.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean192) {
			local7 = false;
		}
		if (this.aBoolean190) {
			local9 = false;
		}
		if (this.aBoolean193) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method2055();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		@Pc(70) int local70 = -1;
		if (local7) {
			try {
				local66 = Static292.method4741(2, 1000);
			} catch (@Pc(81) Exception local81) {
			}
		}
		if (local11) {
			try {
				local70 = Static292.method4741(3, 1000);
				if (Static148.anInt6867 == 3) {
					@Pc(97) Class179 local97 = Static243.aClass42_4.method5828();
					@Pc(102) long local102 = local97.aLong148 & 0xFFFFFFFFFFFFL;
					@Pc(105) int local105 = local97.anInt5392;
					if (local105 == 4318) {
						local9 &= local102 >= 64425238954L;
					} else if (local105 == 4098) {
						local9 &= local102 >= 60129613779L;
					}
				}
			} catch (@Pc(141) Exception local141) {
			}
		}
		if (local9) {
			try {
				local68 = Static292.method4741(1, 1000);
			} catch (@Pc(151) Exception local151) {
			}
		}
		if (local66 == -1 && local68 == -1 && local70 == -1) {
			return this.method2055();
		} else if (local70 < local66 && local68 < local66) {
			return this.method2049(local66);
		} else if (local70 <= local68) {
			return this.method2064(1, local68);
		} else {
			return this.method2064(3, local70);
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)Z")
	public boolean method2059(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean185 : true;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V")
	public void method2060() {
		this.method2045(false);
		super.aBoolean180 = false;
		super.aBoolean173 = false;
		super.aBoolean175 = false;
		super.anInt2218 = 0;
		super.aBoolean179 = false;
		super.aBoolean183 = false;
		super.anInt2229 = super.anInt2226 = 0;
		super.anInt2231 = super.anInt2237 = 0;
		super.aBoolean188 = false;
		super.aBoolean176 = false;
		super.aBoolean178 = false;
		super.aBoolean182 = false;
		super.aBoolean187 = false;
		super.aBoolean174 = false;
		Static378.method6005(0);
		super.aBoolean186 = false;
		super.anInt2235 = 0;
		super.aBoolean177 = false;
		this.method2062();
		super.anInt2224 = 1;
		Static261.method4418();
	}

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "(I)V")
	private void method2062() {
		if (Static52.anInt1395 <= 1) {
			super.anInt2233 = 2;
		} else {
			super.anInt2233 = 4;
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(III)I")
	private int method2064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) byte local25;
		if (arg1 > 20000) {
			local25 = 4;
			this.method2051();
		} else if (arg1 > 10000) {
			this.method2053();
			local25 = 3;
		} else if (arg1 > 5000) {
			local25 = 2;
			this.method2054();
		} else {
			this.method2060();
			local25 = 1;
		}
		if (arg0 != Static148.anInt6867) {
			super.anInt2230 = arg0;
			Static201.method3814(arg0);
		}
		this.method2056(Static375.aClass71_3);
		return local25;
	}
}
