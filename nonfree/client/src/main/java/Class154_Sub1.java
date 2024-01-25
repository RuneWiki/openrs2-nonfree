import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "Z")
	public boolean aBoolean476 = false;

	@OriginalMember(owner = "client!vc", name = "V", descriptor = "Z")
	public boolean aBoolean477 = false;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class154_Sub1(@OriginalArg(0) Class156 arg0) {
		super.anInt6069 = 3;
		this.method5401(true);
		super.aBoolean462 = true;
		super.aBoolean474 = true;
		super.anInt6059 = 0;
		super.aBoolean459 = true;
		super.anInt6064 = 255;
		super.aBoolean473 = true;
		super.anInt6055 = 127;
		super.anInt6067 = 0;
		super.anInt6058 = 0;
		super.aBoolean461 = true;
		super.aBoolean471 = true;
		super.anInt6056 = 1;
		super.aBoolean467 = true;
		super.anInt6057 = 2;
		super.aBoolean475 = true;
		super.anInt6062 = 0;
		super.anInt6066 = 127;
		super.aBoolean464 = true;
		super.aBoolean463 = true;
		if (Static368.anInt6173 >= 96) {
			Static139.method2215(2);
		} else {
			Static139.method2215(0);
		}
		super.aBoolean470 = true;
		super.anInt6061 = Static393.anInt6478 == 1 ? 2 : 4;
		super.aBoolean460 = true;
		super.aBoolean465 = false;
		super.anInt6065 = 0;
		super.aBoolean472 = false;
		super.anInt6063 = 0;
		super.aBoolean466 = false;
		super.anInt6068 = 2;
		super.anInt6060 = 2;
		@Pc(125) Class106 local125 = null;
		try {
			@Pc(129) Class133 local129 = arg0.method3656();
			while (local129.anInt3257 == 0) {
				Static37.method613(1L);
			}
			if (local129.anInt3257 == 1) {
				local125 = (Class106) local129.anObject3;
				@Pc(154) byte[] local154 = new byte[(int) local125.method2292()];
				@Pc(169) int local169;
				for (@Pc(156) int local156 = 0; local156 < local154.length; local156 += local169) {
					local169 = local125.method2288(local154.length - local156, local156, local154);
					if (local169 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method5405(new Class3_Sub5(local154));
			}
		} catch (@Pc(195) Exception local195) {
		}
		try {
			if (local125 != null) {
				local125.method2290();
			}
		} catch (@Pc(202) Exception local202) {
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
	public boolean method5397(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean469 : true;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)Lclient!rp;")
	public Class3_Sub5 method5399() {
		@Pc(8) Class3_Sub5 local8 = new Class3_Sub5(39);
		local8.method2791(16);
		local8.method2791(super.anInt6069);
		local8.method2791(super.aBoolean469 ? 1 : 0);
		local8.method2791(super.aBoolean473 ? 1 : 0);
		local8.method2791(super.aBoolean475 ? 1 : 0);
		local8.method2791(super.aBoolean461 ? 1 : 0);
		local8.method2791(0);
		local8.method2791(super.aBoolean467 ? 1 : 0);
		local8.method2791(super.aBoolean464 ? 1 : 0);
		local8.method2791(super.aBoolean474 ? 1 : 0);
		local8.method2791(super.anInt6057);
		local8.method2791(super.aBoolean463 ? 1 : 0);
		local8.method2791(super.aBoolean471 ? 1 : 0);
		local8.method2791(super.aBoolean459 ? 1 : 0);
		local8.method2791(super.anInt6059);
		local8.method2791(super.aBoolean462 ? 1 : 0);
		local8.method2791(super.anInt6066);
		local8.method2791(super.anInt6064);
		local8.method2791(super.anInt6055);
		local8.method2749(super.anInt6067);
		local8.method2749(super.anInt6062);
		local8.method2791(Static287.method4504());
		local8.method2782(super.anInt6065);
		local8.method2791(super.anInt6068);
		local8.method2791(super.aBoolean465 ? 1 : 0);
		local8.method2791(super.aBoolean466 ? 1 : 0);
		local8.method2791(super.anInt6063);
		local8.method2791(super.aBoolean472 ? 1 : 0);
		local8.method2791(super.aBoolean470 ? 1 : 0);
		local8.method2791(super.anInt6056);
		local8.method2791(super.aBoolean460 ? 1 : 0);
		local8.method2791(super.anInt6060);
		local8.method2791(super.anInt6061);
		local8.method2791(super.aBoolean468 ? 0 : 1);
		return local8;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Z")
	public boolean method5400(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean476 ? super.aBoolean469 : true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZ)V")
	public void method5401(@OriginalArg(1) boolean arg0) {
		super.aBoolean469 = arg0;
		if (Static97.aClass217_4 != null) {
			Static97.aClass217_4.method5001(!this.method5400(Static2.anInt68));
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
	public int method5402(@OriginalArg(0) int arg0) {
		if (this.aBoolean477) {
			return 0;
		} else if (this.method5400(arg0)) {
			return super.aBoolean473 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!mj;B)V")
	public void method5403(@OriginalArg(0) Class156 arg0) {
		@Pc(7) Class106 local7 = null;
		try {
			@Pc(15) Class133 local15 = arg0.method3656();
			while (local15.anInt3257 == 0) {
				Static37.method613(1L);
			}
			if (local15.anInt3257 == 1) {
				local7 = (Class106) local15.anObject3;
				@Pc(40) Class3_Sub5 local40 = this.method5399();
				local7.method2289(local40.anInt3121, 0, local40.aByteArray42);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local7 != null) {
				local7.method2290();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!rp;I)V")
	private void method5405(@OriginalArg(0) Class3_Sub5 arg0) {
		if (arg0.aByteArray42.length - arg0.anInt3121 < 1) {
			return;
		}
		@Pc(23) int local23 = arg0.method2739();
		if (local23 < 0 || local23 > 16) {
			return;
		}
		@Pc(39) byte local39;
		if (local23 == 16) {
			local39 = 38;
		} else if (local23 == 15) {
			local39 = 37;
		} else if (local23 == 14) {
			local39 = 36;
		} else if (local23 == 13) {
			local39 = 35;
		} else if (local23 == 12) {
			local39 = 34;
		} else if (local23 == 11) {
			local39 = 33;
		} else if (local23 == 10) {
			local39 = 32;
		} else if (local23 == 9) {
			local39 = 31;
		} else if (local23 == 8) {
			local39 = 30;
		} else if (local23 == 7) {
			local39 = 29;
		} else if (local23 == 6) {
			local39 = 28;
		} else if (local23 == 5) {
			local39 = 28;
		} else if (local23 == 4) {
			local39 = 24;
		} else if (local23 == 3) {
			local39 = 23;
		} else if (local23 == 2) {
			local39 = 22;
		} else if (local23 == 1) {
			local39 = 23;
		} else {
			local39 = 19;
		}
		if (local39 > arg0.aByteArray42.length - arg0.anInt3121) {
			return;
		}
		super.anInt6069 = arg0.method2739();
		if (super.anInt6069 < 1) {
			super.anInt6069 = 1;
		} else if (super.anInt6069 > 4) {
			super.anInt6069 = 4;
		}
		this.method5401(arg0.method2739() == 1);
		super.aBoolean473 = arg0.method2739() == 1;
		super.aBoolean475 = arg0.method2739() == 1;
		super.aBoolean461 = arg0.method2739() == 1;
		super.anInt6056 = arg0.method2739() == 1 ? 1 : 0;
		super.aBoolean467 = arg0.method2739() == 1;
		super.aBoolean464 = arg0.method2739() == 1;
		super.aBoolean474 = arg0.method2739() == 1;
		super.anInt6057 = arg0.method2739();
		if (super.anInt6057 > 2) {
			super.anInt6057 = 2;
		}
		if (local23 >= 2) {
			super.aBoolean463 = arg0.method2739() == 1;
		} else {
			super.aBoolean463 = arg0.method2739() == 1;
			arg0.method2739();
		}
		super.aBoolean471 = arg0.method2739() == 1;
		super.aBoolean459 = arg0.method2739() == 1;
		super.anInt6059 = arg0.method2739();
		if (super.anInt6059 > 2) {
			super.anInt6059 = 2;
		}
		super.anInt6058 = super.anInt6059;
		super.aBoolean462 = arg0.method2739() == 1;
		super.anInt6066 = arg0.method2739();
		if (super.anInt6066 > 127) {
			super.anInt6066 = 127;
		}
		super.anInt6064 = arg0.method2739();
		super.anInt6055 = arg0.method2739();
		if (super.anInt6055 > 127) {
			super.anInt6055 = 127;
		}
		if (local23 >= 1) {
			super.anInt6067 = arg0.method2767();
			super.anInt6062 = arg0.method2767();
		}
		if (local23 >= 3 && local23 < 6) {
			arg0.method2739();
		}
		@Pc(461) int local461;
		if (local23 >= 4) {
			local461 = arg0.method2739();
			if (local461 < 0 || local461 > 2) {
				local461 = 0;
			}
			if (Static368.anInt6173 < 96) {
				local461 = 0;
			}
			Static139.method2215(local461);
		}
		if (local23 >= 5) {
			super.anInt6065 = arg0.method2726();
		}
		local461 = 0;
		if (local23 >= 6) {
			super.anInt6068 = local461 = arg0.method2739();
		}
		if (super.anInt6068 != 1 && super.anInt6068 != 2) {
			super.anInt6068 = 2;
		}
		if (local23 >= 7) {
			super.aBoolean465 = arg0.method2739() == 1;
		}
		if (local23 >= 8) {
			super.aBoolean466 = arg0.method2739() == 1;
		}
		if (local23 >= 9) {
			super.anInt6063 = arg0.method2739();
		}
		if (super.anInt6063 < 0 || super.anInt6063 > Static276.method4310(Static368.anInt6173)) {
			super.anInt6063 = 0;
		}
		if (local23 >= 10) {
			super.aBoolean472 = arg0.method2739() != 0;
		}
		if (local23 >= 11) {
			super.aBoolean470 = arg0.method2739() != 0;
		}
		if (local23 >= 12) {
			super.anInt6056 = arg0.method2739();
		}
		if (super.anInt6056 < 0 || super.anInt6056 > 2) {
			super.anInt6056 = 1;
		}
		if (local23 >= 13) {
			super.aBoolean460 = arg0.method2739() == 1;
		}
		if (local23 >= 14) {
			super.anInt6060 = arg0.method2739();
		} else if (local461 == 0) {
			super.anInt6060 = 2;
		} else {
			super.anInt6060 = 1;
		}
		if (super.anInt6060 < 0 || super.anInt6060 > 3) {
			super.anInt6060 = 2;
		}
		if (local23 >= 15) {
			super.anInt6061 = arg0.method2739();
			if (super.anInt6061 < 0 || super.anInt6061 > 4) {
				super.anInt6061 = Static393.anInt6478 == 1 ? 2 : 4;
			}
		}
		if (local23 >= 16) {
			super.aBoolean468 = arg0.method2739() != 1;
		}
	}
}
