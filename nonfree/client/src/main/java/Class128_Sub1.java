import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "[I")
	public static final int[] anIntArray292 = new int[99];

	@OriginalMember(owner = "client!jj", name = "X", descriptor = "Z")
	public boolean aBoolean247 = false;

	@OriginalMember(owner = "client!jj", name = "Y", descriptor = "Z")
	public boolean aBoolean248 = false;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray292[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!kj;)V")
	public Class128_Sub1(@OriginalArg(0) Class138 arg0) {
		super.anInt3562 = 3;
		this.method2985(true);
		super.anInt3576 = 0;
		super.aBoolean243 = true;
		super.aBoolean240 = true;
		super.aBoolean242 = true;
		super.anInt3567 = 2;
		super.anInt3565 = 127;
		super.anInt3560 = 0;
		super.anInt3570 = 0;
		super.anInt3569 = 1;
		super.aBoolean237 = true;
		super.anInt3561 = 0;
		super.aBoolean229 = true;
		super.aBoolean232 = true;
		super.anInt3573 = 127;
		super.anInt3575 = 0;
		super.aBoolean246 = true;
		super.aBoolean238 = true;
		super.aBoolean244 = false;
		super.aBoolean241 = true;
		super.anInt3559 = 255;
		super.aBoolean235 = true;
		if (Static113.anInt5764 >= 96) {
			Static374.method5136(2);
		} else {
			Static374.method5136(0);
		}
		super.anInt3572 = 2;
		super.aBoolean230 = true;
		super.anInt3574 = 0;
		super.aBoolean234 = true;
		super.aBoolean239 = false;
		super.aBoolean236 = false;
		super.anInt3563 = Static421.anInt7287 == 1 ? 2 : 4;
		super.aBoolean233 = false;
		super.anInt3558 = 0;
		super.anInt3566 = 2;
		@Pc(131) Class133 local131 = null;
		try {
			@Pc(136) Class100 local136 = arg0.method3216("");
			while (local136.anInt2365 == 0) {
				Static67.method1189(1L);
			}
			if (local136.anInt2365 == 1) {
				local131 = (Class133) local136.anObject4;
				@Pc(161) byte[] local161 = new byte[(int) local131.method3022()];
				@Pc(176) int local176;
				for (@Pc(163) int local163 = 0; local163 < local161.length; local163 += local176) {
					local176 = local131.method3024(local161, local161.length - local163, local163);
					if (local176 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2979(new Class1_Sub1(local161));
			}
		} catch (@Pc(202) Exception local202) {
		}
		try {
			if (local131 != null) {
				local131.method3023();
			}
		} catch (@Pc(209) Exception local209) {
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!lh;Z)V")
	private void method2979(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aByteArray66.length - arg0.anInt5056 < 1) {
			return;
		}
		@Pc(29) int local29 = arg0.method4130();
		if (local29 < 0 || local29 > 17) {
			return;
		}
		@Pc(45) byte local45;
		if (local29 == 17) {
			local45 = 40;
		} else if (local29 == 16) {
			local45 = 38;
		} else if (local29 == 15) {
			local45 = 37;
		} else if (local29 == 14) {
			local45 = 36;
		} else if (local29 == 13) {
			local45 = 35;
		} else if (local29 == 12) {
			local45 = 34;
		} else if (local29 == 11) {
			local45 = 33;
		} else if (local29 == 10) {
			local45 = 32;
		} else if (local29 == 9) {
			local45 = 31;
		} else if (local29 == 8) {
			local45 = 30;
		} else if (local29 == 7) {
			local45 = 29;
		} else if (local29 == 6) {
			local45 = 28;
		} else if (local29 == 5) {
			local45 = 28;
		} else if (local29 == 4) {
			local45 = 24;
		} else if (local29 == 3) {
			local45 = 23;
		} else if (local29 == 2) {
			local45 = 22;
		} else if (local29 == 1) {
			local45 = 23;
		} else {
			local45 = 19;
		}
		if (local45 > arg0.aByteArray66.length - arg0.anInt5056) {
			return;
		}
		super.anInt3562 = arg0.method4130();
		if (super.anInt3562 < 1) {
			super.anInt3562 = 1;
		} else if (super.anInt3562 > 4) {
			super.anInt3562 = 4;
		}
		this.method2985(arg0.method4130() == 1);
		super.aBoolean237 = arg0.method4130() == 1;
		super.aBoolean240 = arg0.method4130() == 1;
		super.aBoolean241 = arg0.method4130() == 1;
		super.anInt3569 = arg0.method4130() == 1 ? 1 : 0;
		super.aBoolean232 = arg0.method4130() == 1;
		super.aBoolean242 = arg0.method4130() == 1;
		super.aBoolean243 = arg0.method4130() == 1;
		super.anInt3567 = arg0.method4130();
		if (super.anInt3567 > 2) {
			super.anInt3567 = 2;
		}
		if (local29 >= 17) {
			super.anInt3575 = arg0.method4130();
		}
		if (local29 < 2) {
			super.aBoolean238 = arg0.method4130() == 1;
			arg0.method4130();
		} else {
			super.aBoolean238 = arg0.method4130() == 1;
			if (local29 >= 17) {
				super.aBoolean244 = arg0.method4130() == 1;
			}
		}
		super.aBoolean246 = arg0.method4130() == 1;
		super.aBoolean229 = arg0.method4130() == 1;
		super.anInt3561 = arg0.method4130();
		if (super.anInt3561 > 2) {
			super.anInt3561 = 2;
		}
		super.anInt3576 = super.anInt3561;
		super.aBoolean235 = arg0.method4130() == 1;
		super.anInt3565 = arg0.method4130();
		if (super.anInt3565 > 127) {
			super.anInt3565 = 127;
		}
		super.anInt3559 = arg0.method4130();
		super.anInt3573 = arg0.method4130();
		if (super.anInt3573 > 127) {
			super.anInt3573 = 127;
		}
		if (local29 >= 1) {
			super.anInt3570 = arg0.method4093();
			super.anInt3560 = arg0.method4093();
		}
		if (local29 >= 3 && local29 < 6) {
			arg0.method4130();
		}
		@Pc(485) int local485;
		if (local29 >= 4) {
			local485 = arg0.method4130();
			if (local485 < 0 || local485 > 2) {
				local485 = 0;
			}
			if (Static113.anInt5764 < 96) {
				local485 = 0;
			}
			Static374.method5136(local485);
		}
		if (local29 >= 5) {
			super.anInt3558 = arg0.method4087();
		}
		local485 = 0;
		if (local29 >= 6) {
			super.anInt3566 = local485 = arg0.method4130();
		}
		if (super.anInt3566 != 1 && super.anInt3566 != 2) {
			super.anInt3566 = 2;
		}
		if (local29 >= 7) {
			super.aBoolean236 = arg0.method4130() == 1;
		}
		if (local29 >= 8) {
			super.aBoolean233 = arg0.method4130() == 1;
		}
		if (local29 >= 9) {
			super.anInt3574 = arg0.method4130();
		}
		if (super.anInt3574 < 0 || super.anInt3574 > Static245.method3606(Static113.anInt5764)) {
			super.anInt3574 = 0;
		}
		if (local29 >= 10) {
			super.aBoolean239 = arg0.method4130() != 0;
		}
		if (local29 >= 11) {
			super.aBoolean234 = arg0.method4130() != 0;
		}
		if (local29 >= 12) {
			super.anInt3569 = arg0.method4130();
		}
		if (super.anInt3569 < 0 || super.anInt3569 > 2) {
			super.anInt3569 = 1;
		}
		if (local29 >= 13) {
			super.aBoolean230 = arg0.method4130() == 1;
		}
		if (local29 >= 14) {
			super.anInt3572 = arg0.method4130();
		} else if (local485 == 0) {
			super.anInt3572 = 2;
		} else {
			super.anInt3572 = 1;
		}
		if (super.anInt3572 < 0 || super.anInt3572 > 3) {
			super.anInt3572 = 2;
		}
		if (local29 >= 15) {
			super.anInt3563 = arg0.method4130();
			if (super.anInt3563 < 0 || super.anInt3563 > 4) {
				super.anInt3563 = Static421.anInt7287 == 1 ? 2 : 4;
			}
		}
		if (local29 >= 16) {
			super.aBoolean245 = arg0.method4130() == 1;
		}
		if (local29 < 17 && super.anInt3572 == 0) {
			super.anInt3572 = 2;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)Z")
	public boolean method2980(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean231 : true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!kj;B)V")
	public void method2981(@OriginalArg(0) Class138 arg0) {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(12) Class100 local12 = arg0.method3216("");
			while (local12.anInt2365 == 0) {
				Static67.method1189(1L);
			}
			if (local12.anInt2365 == 1) {
				local7 = (Class133) local12.anObject4;
				@Pc(34) Class1_Sub1 local34 = this.method2983();
				local7.method3021(0, local34.anInt5056, local34.aByteArray66);
			}
		} catch (@Pc(44) Exception local44) {
		}
		try {
			if (local7 != null) {
				local7.method3023();
			}
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)Lclient!lh;")
	public Class1_Sub1 method2983() {
		@Pc(8) Class1_Sub1 local8 = new Class1_Sub1(41);
		local8.method4115(17);
		local8.method4115(super.anInt3562);
		local8.method4115(super.aBoolean231 ? 1 : 0);
		local8.method4115(super.aBoolean237 ? 1 : 0);
		local8.method4115(super.aBoolean240 ? 1 : 0);
		local8.method4115(super.aBoolean241 ? 1 : 0);
		local8.method4115(0);
		local8.method4115(super.aBoolean232 ? 1 : 0);
		local8.method4115(super.aBoolean242 ? 1 : 0);
		local8.method4115(super.aBoolean243 ? 1 : 0);
		local8.method4115(super.anInt3567);
		local8.method4115(super.anInt3575);
		local8.method4115(super.aBoolean238 ? 1 : 0);
		local8.method4115(super.aBoolean244 ? 1 : 0);
		local8.method4115(super.aBoolean246 ? 1 : 0);
		local8.method4115(super.aBoolean229 ? 1 : 0);
		local8.method4115(super.anInt3561);
		local8.method4115(super.aBoolean235 ? 1 : 0);
		local8.method4115(super.anInt3565);
		local8.method4115(super.anInt3559);
		local8.method4115(super.anInt3573);
		local8.method4101(super.anInt3570);
		local8.method4101(super.anInt3560);
		local8.method4115(Static14.method305());
		local8.method4105(super.anInt3558);
		local8.method4115(super.anInt3566);
		local8.method4115(super.aBoolean236 ? 1 : 0);
		local8.method4115(super.aBoolean233 ? 1 : 0);
		local8.method4115(super.anInt3574);
		local8.method4115(super.aBoolean239 ? 1 : 0);
		local8.method4115(super.aBoolean234 ? 1 : 0);
		local8.method4115(super.anInt3569);
		local8.method4115(super.aBoolean230 ? 1 : 0);
		local8.method4115(super.anInt3572);
		local8.method4115(super.anInt3563);
		local8.method4115(super.aBoolean245 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Z")
	public boolean method2984(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean248 ? super.aBoolean231 : true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZB)V")
	public void method2985(@OriginalArg(0) boolean arg0) {
		super.aBoolean231 = arg0;
		if (Static71.aClass105_6 != null) {
			Static71.aClass105_6.method2340(!this.method2984(Static285.anInt7839));
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
	public int method2986(@OriginalArg(1) int arg0) {
		if (this.aBoolean247) {
			return 0;
		} else if (this.method2984(arg0)) {
			return super.aBoolean237 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
