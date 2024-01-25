import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class173_Sub1 extends Class173 {

	@OriginalMember(owner = "client!n", name = "O", descriptor = "Z")
	public boolean aBoolean318 = false;

	@OriginalMember(owner = "client!n", name = "T", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!hf;)V")
	public Class173_Sub1(@OriginalArg(0) Class103 arg0) {
		super.anInt4416 = 3;
		this.method3967(true);
		super.anInt4414 = 255;
		super.anInt4410 = 0;
		super.aBoolean304 = true;
		super.anInt4412 = 0;
		super.anInt4413 = 0;
		super.aBoolean303 = true;
		super.aBoolean314 = true;
		super.anInt4406 = 127;
		super.anInt4420 = 2;
		super.aBoolean307 = true;
		super.aBoolean302 = true;
		super.aBoolean309 = true;
		super.anInt4411 = 127;
		super.aBoolean317 = true;
		super.anInt4407 = 1;
		super.anInt4417 = 0;
		super.aBoolean312 = true;
		super.aBoolean313 = true;
		super.aBoolean301 = true;
		if (Static2.anInt8 >= 96) {
			Static165.method2690(2);
		} else {
			Static165.method2690(0);
		}
		super.anInt4409 = 2;
		super.aBoolean308 = false;
		super.anInt4405 = Static8.anInt160 == 1 ? 2 : 4;
		super.aBoolean305 = true;
		super.aBoolean310 = false;
		super.anInt4408 = 2;
		super.anInt4418 = 0;
		super.aBoolean306 = true;
		super.anInt4415 = 0;
		super.aBoolean311 = false;
		@Pc(123) Class142 local123 = null;
		try {
			@Pc(128) Class249 local128 = arg0.method2363("");
			while (local128.anInt6929 == 0) {
				Static170.method1617(1L);
			}
			if (local128.anInt6929 == 1) {
				local123 = (Class142) local128.anObject10;
				@Pc(150) byte[] local150 = new byte[(int) local123.method3270()];
				@Pc(165) int local165;
				for (@Pc(152) int local152 = 0; local152 < local150.length; local152 += local165) {
					local165 = local123.method3266(local150, local152, local150.length - local152);
					if (local165 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method3971(new Class6_Sub15(local150));
			}
		} catch (@Pc(190) Exception local190) {
		}
		try {
			if (local123 != null) {
				local123.method3267();
			}
		} catch (@Pc(197) Exception local197) {
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	public boolean method3965(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean319 ? super.aBoolean316 : true;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(ZB)V")
	public void method3967(@OriginalArg(0) boolean arg0) {
		super.aBoolean316 = arg0;
		if (Static113.aClass127_2 != null) {
			Static113.aClass127_2.method2822(!this.method3965(Static155.anInt2774));
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Z")
	public boolean method3968(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean316 : true;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!hf;B)V")
	public void method3970(@OriginalArg(0) Class103 arg0) {
		@Pc(15) Class142 local15 = null;
		try {
			@Pc(20) Class249 local20 = arg0.method2363("");
			while (local20.anInt6929 == 0) {
				Static170.method1617(1L);
			}
			if (local20.anInt6929 == 1) {
				local15 = (Class142) local20.anObject10;
				@Pc(45) Class6_Sub15 local45 = this.method3973();
				local15.method3268(local45.anInt3487, local45.aByteArray51, 0);
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			if (local15 != null) {
				local15.method3267();
			}
		} catch (@Pc(62) Exception local62) {
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!ha;)V")
	private void method3971(@OriginalArg(1) Class6_Sub15 arg0) {
		if (arg0.aByteArray51.length - arg0.anInt3487 < 1) {
			return;
		}
		@Pc(25) int local25 = arg0.method3111();
		if (local25 < 0 || local25 > 16) {
			return;
		}
		@Pc(38) byte local38;
		if (local25 == 16) {
			local38 = 38;
		} else if (local25 == 15) {
			local38 = 37;
		} else if (local25 == 14) {
			local38 = 36;
		} else if (local25 == 13) {
			local38 = 35;
		} else if (local25 == 12) {
			local38 = 34;
		} else if (local25 == 11) {
			local38 = 33;
		} else if (local25 == 10) {
			local38 = 32;
		} else if (local25 == 9) {
			local38 = 31;
		} else if (local25 == 8) {
			local38 = 30;
		} else if (local25 == 7) {
			local38 = 29;
		} else if (local25 == 6) {
			local38 = 28;
		} else if (local25 == 5) {
			local38 = 28;
		} else if (local25 == 4) {
			local38 = 24;
		} else if (local25 == 3) {
			local38 = 23;
		} else if (local25 == 2) {
			local38 = 22;
		} else if (local25 == 1) {
			local38 = 23;
		} else {
			local38 = 19;
		}
		if (arg0.aByteArray51.length - arg0.anInt3487 < local38) {
			return;
		}
		super.anInt4416 = arg0.method3111();
		if (super.anInt4416 < 1) {
			super.anInt4416 = 1;
		} else if (super.anInt4416 > 4) {
			super.anInt4416 = 4;
		}
		this.method3967(arg0.method3111() == 1);
		super.aBoolean313 = arg0.method3111() == 1;
		super.aBoolean302 = arg0.method3111() == 1;
		super.aBoolean312 = arg0.method3111() == 1;
		super.anInt4407 = arg0.method3111() == 1 ? 1 : 0;
		super.aBoolean314 = arg0.method3111() == 1;
		super.aBoolean304 = arg0.method3111() == 1;
		super.aBoolean307 = arg0.method3111() == 1;
		super.anInt4420 = arg0.method3111();
		if (super.anInt4420 > 2) {
			super.anInt4420 = 2;
		}
		if (local25 >= 2) {
			super.aBoolean317 = arg0.method3111() == 1;
		} else {
			super.aBoolean317 = arg0.method3111() == 1;
			arg0.method3111();
		}
		super.aBoolean301 = arg0.method3111() == 1;
		super.aBoolean303 = arg0.method3111() == 1;
		super.anInt4413 = arg0.method3111();
		if (super.anInt4413 > 2) {
			super.anInt4413 = 2;
		}
		super.anInt4417 = super.anInt4413;
		super.aBoolean309 = arg0.method3111() == 1;
		super.anInt4406 = arg0.method3111();
		if (super.anInt4406 > 127) {
			super.anInt4406 = 127;
		}
		super.anInt4414 = arg0.method3111();
		super.anInt4411 = arg0.method3111();
		if (super.anInt4411 > 127) {
			super.anInt4411 = 127;
		}
		if (local25 >= 1) {
			super.anInt4412 = arg0.method3108();
			super.anInt4410 = arg0.method3108();
		}
		if (local25 >= 3 && local25 < 6) {
			arg0.method3111();
		}
		@Pc(449) int local449;
		if (local25 >= 4) {
			local449 = arg0.method3111();
			if (local449 < 0 || local449 > 2) {
				local449 = 0;
			}
			if (Static2.anInt8 < 96) {
				local449 = 0;
			}
			Static165.method2690(local449);
		}
		if (local25 >= 5) {
			super.anInt4415 = arg0.method3109();
		}
		local449 = 0;
		if (local25 >= 6) {
			super.anInt4409 = local449 = arg0.method3111();
		}
		if (super.anInt4409 != 1 && super.anInt4409 != 2) {
			super.anInt4409 = 2;
		}
		if (local25 >= 7) {
			super.aBoolean310 = arg0.method3111() == 1;
		}
		if (local25 >= 8) {
			super.aBoolean311 = arg0.method3111() == 1;
		}
		if (local25 >= 9) {
			super.anInt4418 = arg0.method3111();
		}
		if (super.anInt4418 < 0 || super.anInt4418 > Static254.method3445(Static2.anInt8)) {
			super.anInt4418 = 0;
		}
		if (local25 >= 10) {
			super.aBoolean308 = arg0.method3111() != 0;
		}
		if (local25 >= 11) {
			super.aBoolean306 = arg0.method3111() != 0;
		}
		if (local25 >= 12) {
			super.anInt4407 = arg0.method3111();
		}
		if (super.anInt4407 < 0 || super.anInt4407 > 2) {
			super.anInt4407 = 1;
		}
		if (local25 >= 13) {
			super.aBoolean305 = arg0.method3111() == 1;
		}
		if (local25 >= 14) {
			super.anInt4408 = arg0.method3111();
		} else if (local449 == 0) {
			super.anInt4408 = 2;
		} else {
			super.anInt4408 = 1;
		}
		if (super.anInt4408 < 0 || super.anInt4408 > 3) {
			super.anInt4408 = 2;
		}
		if (local25 >= 15) {
			super.anInt4405 = arg0.method3111();
			if (super.anInt4405 < 0 || super.anInt4405 > 4) {
				super.anInt4405 = Static8.anInt160 == 1 ? 2 : 4;
			}
		}
		if (local25 >= 16) {
			super.aBoolean300 = arg0.method3111() != 1;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lclient!ha;")
	public Class6_Sub15 method3973() {
		@Pc(8) Class6_Sub15 local8 = new Class6_Sub15(39);
		local8.method3075(16);
		local8.method3075(super.anInt4416);
		local8.method3075(super.aBoolean316 ? 1 : 0);
		local8.method3075(super.aBoolean313 ? 1 : 0);
		local8.method3075(super.aBoolean302 ? 1 : 0);
		local8.method3075(super.aBoolean312 ? 1 : 0);
		local8.method3075(0);
		local8.method3075(super.aBoolean314 ? 1 : 0);
		local8.method3075(super.aBoolean304 ? 1 : 0);
		local8.method3075(super.aBoolean307 ? 1 : 0);
		local8.method3075(super.anInt4420);
		local8.method3075(super.aBoolean317 ? 1 : 0);
		local8.method3075(super.aBoolean301 ? 1 : 0);
		local8.method3075(super.aBoolean303 ? 1 : 0);
		local8.method3075(super.anInt4413);
		local8.method3075(super.aBoolean309 ? 1 : 0);
		local8.method3075(super.anInt4406);
		local8.method3075(super.anInt4414);
		local8.method3075(super.anInt4411);
		local8.method3100(super.anInt4412);
		local8.method3100(super.anInt4410);
		local8.method3075(Static171.method1545());
		local8.method3107(super.anInt4415);
		local8.method3075(super.anInt4409);
		local8.method3075(super.aBoolean310 ? 1 : 0);
		local8.method3075(super.aBoolean311 ? 1 : 0);
		local8.method3075(super.anInt4418);
		local8.method3075(super.aBoolean308 ? 1 : 0);
		local8.method3075(super.aBoolean306 ? 1 : 0);
		local8.method3075(super.anInt4407);
		local8.method3075(super.aBoolean305 ? 1 : 0);
		local8.method3075(super.anInt4408);
		local8.method3075(super.anInt4405);
		local8.method3075(super.aBoolean300 ? 0 : 1);
		return local8;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)I")
	public int method3974(@OriginalArg(0) int arg0) {
		if (this.aBoolean318) {
			return 0;
		} else if (this.method3965(arg0)) {
			return super.aBoolean313 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
