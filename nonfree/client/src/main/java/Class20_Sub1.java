import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!fb", name = "db", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!fb", name = "ib", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!li;)V")
	public Class20_Sub1(@OriginalArg(0) Class143 arg0) {
		super.anInt2346 = 3;
		this.method1819(true);
		super.aBoolean200 = true;
		super.aBoolean190 = true;
		super.aBoolean198 = true;
		super.aBoolean191 = true;
		super.anInt2351 = 0;
		super.aBoolean196 = true;
		super.anInt2356 = 2;
		super.anInt2349 = 127;
		super.anInt2343 = 0;
		super.aBoolean185 = true;
		super.aBoolean188 = false;
		super.anInt2359 = 0;
		super.aBoolean192 = true;
		super.anInt2341 = 255;
		super.aBoolean183 = true;
		super.anInt2360 = 127;
		super.anInt2344 = 0;
		super.anInt2342 = 1;
		super.aBoolean195 = true;
		super.aBoolean199 = true;
		super.anInt2350 = 0;
		if (Static286.anInt1448 >= 96) {
			Static82.method3177(2);
		} else {
			Static82.method3177(0);
		}
		super.anInt2347 = 2;
		super.aBoolean197 = false;
		super.aBoolean184 = true;
		super.anInt2353 = 2;
		super.anInt2354 = 0;
		super.anInt2352 = 0;
		super.aBoolean186 = false;
		super.aBoolean189 = false;
		super.anInt2357 = Static346.anInt5873 == 1 ? 2 : 4;
		super.aBoolean194 = true;
		@Pc(129) Class256 local129 = null;
		try {
			@Pc(134) Class43 local134 = arg0.method3394("");
			while (local134.anInt1521 == 0) {
				Static360.method4758(1L);
			}
			if (local134.anInt1521 == 1) {
				local129 = (Class256) local134.anObject3;
				@Pc(161) byte[] local161 = new byte[(int) local129.method5389()];
				@Pc(176) int local176;
				for (@Pc(163) int local163 = 0; local163 < local161.length; local163 += local176) {
					local176 = local129.method5387(local163, local161.length - local163, local161);
					if (local176 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method1807(new Class3_Sub7(local161));
			}
		} catch (@Pc(201) Exception local201) {
		}
		try {
			if (local129 != null) {
				local129.method5388();
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!cu;I)V")
	private void method1807(@OriginalArg(0) Class3_Sub7 arg0) {
		if (arg0.aByteArray46.length - arg0.anInt3235 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method2582();
		if (local19 < 0 || local19 > 17) {
			return;
		}
		@Pc(35) byte local35;
		if (local19 == 17) {
			local35 = 40;
		} else if (local19 == 16) {
			local35 = 38;
		} else if (local19 == 15) {
			local35 = 37;
		} else if (local19 == 14) {
			local35 = 36;
		} else if (local19 == 13) {
			local35 = 35;
		} else if (local19 == 12) {
			local35 = 34;
		} else if (local19 == 11) {
			local35 = 33;
		} else if (local19 == 10) {
			local35 = 32;
		} else if (local19 == 9) {
			local35 = 31;
		} else if (local19 == 8) {
			local35 = 30;
		} else if (local19 == 7) {
			local35 = 29;
		} else if (local19 == 6) {
			local35 = 28;
		} else if (local19 == 5) {
			local35 = 28;
		} else if (local19 == 4) {
			local35 = 24;
		} else if (local19 == 3) {
			local35 = 23;
		} else if (local19 == 2) {
			local35 = 22;
		} else if (local19 == 1) {
			local35 = 23;
		} else {
			local35 = 19;
		}
		if (arg0.aByteArray46.length - arg0.anInt3235 < local35) {
			return;
		}
		super.anInt2346 = arg0.method2582();
		if (super.anInt2346 < 1) {
			super.anInt2346 = 1;
		} else if (super.anInt2346 > 4) {
			super.anInt2346 = 4;
		}
		this.method1819(arg0.method2582() == 1);
		super.aBoolean199 = arg0.method2582() == 1;
		super.aBoolean183 = arg0.method2582() == 1;
		super.aBoolean195 = arg0.method2582() == 1;
		super.anInt2342 = arg0.method2582() == 1 ? 1 : 0;
		super.aBoolean185 = arg0.method2582() == 1;
		super.aBoolean200 = arg0.method2582() == 1;
		super.aBoolean191 = arg0.method2582() == 1;
		super.anInt2356 = arg0.method2582();
		if (super.anInt2356 > 2) {
			super.anInt2356 = 2;
		}
		if (local19 >= 17) {
			super.anInt2343 = arg0.method2582();
		}
		if (local19 >= 2) {
			super.aBoolean192 = arg0.method2582() == 1;
			if (local19 >= 17) {
				super.aBoolean188 = arg0.method2582() == 1;
			}
		} else {
			super.aBoolean192 = arg0.method2582() == 1;
			arg0.method2582();
		}
		super.aBoolean198 = arg0.method2582() == 1;
		super.aBoolean190 = arg0.method2582() == 1;
		super.anInt2351 = arg0.method2582();
		if (super.anInt2351 > 2) {
			super.anInt2351 = 2;
		}
		super.anInt2350 = super.anInt2351;
		super.aBoolean196 = arg0.method2582() == 1;
		super.anInt2360 = arg0.method2582();
		if (super.anInt2360 > 127) {
			super.anInt2360 = 127;
		}
		super.anInt2341 = arg0.method2582();
		super.anInt2349 = arg0.method2582();
		if (super.anInt2349 > 127) {
			super.anInt2349 = 127;
		}
		if (local19 >= 1) {
			super.anInt2344 = arg0.method2588();
			super.anInt2359 = arg0.method2588();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method2582();
		}
		@Pc(477) int local477;
		if (local19 >= 4) {
			local477 = arg0.method2582();
			if (local477 < 0 || local477 > 2) {
				local477 = 0;
			}
			if (Static286.anInt1448 < 96) {
				local477 = 0;
			}
			Static82.method3177(local477);
		}
		if (local19 >= 5) {
			super.anInt2354 = arg0.method2589();
		}
		local477 = 0;
		if (local19 >= 6) {
			super.anInt2353 = local477 = arg0.method2582();
		}
		if (super.anInt2353 != 1 && super.anInt2353 != 2) {
			super.anInt2353 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean189 = arg0.method2582() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean186 = arg0.method2582() == 1;
		}
		if (local19 >= 9) {
			super.anInt2352 = arg0.method2582();
		}
		if (super.anInt2352 < 0 || super.anInt2352 > Static242.method3661(Static286.anInt1448)) {
			super.anInt2352 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean197 = arg0.method2582() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean194 = arg0.method2582() != 0;
		}
		if (local19 >= 12) {
			super.anInt2342 = arg0.method2582();
		}
		if (super.anInt2342 < 0 || super.anInt2342 > 2) {
			super.anInt2342 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean184 = arg0.method2582() == 1;
		}
		if (local19 >= 14) {
			super.anInt2347 = arg0.method2582();
		} else if (local477 == 0) {
			super.anInt2347 = 2;
		} else {
			super.anInt2347 = 1;
		}
		if (super.anInt2347 < 0 || super.anInt2347 > 3) {
			super.anInt2347 = 2;
		}
		if (local19 >= 15) {
			super.anInt2357 = arg0.method2582();
			if (super.anInt2357 < 0 || super.anInt2357 > 4) {
				super.anInt2357 = Static346.anInt5873 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean193 = arg0.method2582() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean193 = false;
				}
			} catch (@Pc(751) Throwable local751) {
			}
		}
		if (local19 < 17 && super.anInt2347 == 0) {
			super.anInt2347 = 2;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)I")
	public int method1810(@OriginalArg(0) int arg0) {
		if (this.aBoolean201) {
			return 0;
		} else if (this.method1814(arg0)) {
			return super.aBoolean199 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)Z")
	public boolean method1814(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean202 ? super.aBoolean187 : true;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lclient!cu;")
	public Class3_Sub7 method1815() {
		@Pc(8) Class3_Sub7 local8 = new Class3_Sub7(41);
		local8.method2628(17);
		local8.method2628(super.anInt2346);
		local8.method2628(super.aBoolean187 ? 1 : 0);
		local8.method2628(super.aBoolean199 ? 1 : 0);
		local8.method2628(super.aBoolean183 ? 1 : 0);
		local8.method2628(super.aBoolean195 ? 1 : 0);
		local8.method2628(0);
		local8.method2628(super.aBoolean185 ? 1 : 0);
		local8.method2628(super.aBoolean200 ? 1 : 0);
		local8.method2628(super.aBoolean191 ? 1 : 0);
		local8.method2628(super.anInt2356);
		local8.method2628(super.anInt2343);
		local8.method2628(super.aBoolean192 ? 1 : 0);
		local8.method2628(super.aBoolean188 ? 1 : 0);
		local8.method2628(super.aBoolean198 ? 1 : 0);
		local8.method2628(super.aBoolean190 ? 1 : 0);
		local8.method2628(super.anInt2351);
		local8.method2628(super.aBoolean196 ? 1 : 0);
		local8.method2628(super.anInt2360);
		local8.method2628(super.anInt2341);
		local8.method2628(super.anInt2349);
		local8.method2613(super.anInt2344);
		local8.method2613(super.anInt2359);
		local8.method2628(Static309.method4305());
		local8.method2636(super.anInt2354);
		local8.method2628(super.anInt2353);
		local8.method2628(super.aBoolean189 ? 1 : 0);
		local8.method2628(super.aBoolean186 ? 1 : 0);
		local8.method2628(super.anInt2352);
		local8.method2628(super.aBoolean197 ? 1 : 0);
		local8.method2628(super.aBoolean194 ? 1 : 0);
		local8.method2628(super.anInt2342);
		local8.method2628(super.aBoolean184 ? 1 : 0);
		local8.method2628(super.anInt2347);
		local8.method2628(super.anInt2357);
		local8.method2628(super.aBoolean193 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(II)Z")
	public boolean method1817(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean187 : true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!li;I)V")
	public void method1818(@OriginalArg(0) Class143 arg0) {
		@Pc(9) Class256 local9 = null;
		try {
			@Pc(14) Class43 local14 = arg0.method3394("");
			while (local14.anInt1521 == 0) {
				Static360.method4758(1L);
			}
			if (local14.anInt1521 == 1) {
				local9 = (Class256) local14.anObject3;
				@Pc(40) Class3_Sub7 local40 = this.method1815();
				local9.method5391(local40.aByteArray46, 0, local40.anInt3235);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local9 != null) {
				local9.method5388();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZ)V")
	public void method1819(@OriginalArg(0) boolean arg0) {
		super.aBoolean187 = arg0;
		if (Static435.aClass30_4 != null) {
			Static435.aClass30_4.method767(!this.method1814(Static105.anInt2382));
		}
	}
}
