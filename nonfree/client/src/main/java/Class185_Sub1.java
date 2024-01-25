import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class185_Sub1 extends Class185 {

	@OriginalMember(owner = "client!p", name = "T", descriptor = "Z")
	public boolean aBoolean411 = false;

	@OriginalMember(owner = "client!p", name = "Z", descriptor = "Z")
	public boolean aBoolean412 = false;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!ul;)V")
	public Class185_Sub1(@OriginalArg(0) Class255 arg0) {
		super.anInt5565 = 3;
		this.method4634(true);
		super.aBoolean398 = true;
		super.anInt5570 = 0;
		super.anInt5566 = 2;
		super.aBoolean409 = true;
		super.anInt5555 = 127;
		super.aBoolean408 = true;
		super.aBoolean406 = true;
		super.anInt5563 = 0;
		super.aBoolean400 = true;
		super.aBoolean410 = true;
		super.anInt5567 = 127;
		super.anInt5571 = 1;
		super.anInt5572 = 0;
		super.aBoolean402 = true;
		super.aBoolean399 = false;
		super.anInt5554 = 127;
		super.anInt5575 = 0;
		super.aBoolean395 = true;
		super.aBoolean397 = true;
		super.aBoolean404 = true;
		super.anInt5574 = 0;
		if (Static263.anInt5007 >= 96) {
			Static49.method1089(2);
		} else {
			Static49.method1089(0);
		}
		super.anInt5561 = 0;
		super.aBoolean394 = false;
		super.anInt5564 = 0;
		super.aBoolean393 = false;
		super.aBoolean407 = true;
		super.aBoolean401 = false;
		super.aBoolean403 = true;
		super.anInt5573 = 2;
		super.anInt5562 = Static65.anInt1627 == 1 ? 2 : 4;
		super.anInt5557 = 2;
		@Pc(129) Class137 local129 = null;
		try {
			@Pc(135) Class87 local135 = arg0.method5847("", true);
			while (local135.anInt2679 == 0) {
				Static77.method1653(1L);
			}
			if (local135.anInt2679 == 1) {
				local129 = (Class137) local135.anObject3;
				@Pc(160) byte[] local160 = new byte[(int) local129.method3703()];
				@Pc(175) int local175;
				for (@Pc(162) int local162 = 0; local162 < local160.length; local162 += local175) {
					local175 = local129.method3704(local160, local160.length - local162, local162);
					if (local175 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4638(new Class4_Sub20(local160));
			}
		} catch (@Pc(204) Exception local204) {
		}
		try {
			if (local129 != null) {
				local129.method3708();
			}
		} catch (@Pc(211) Exception local211) {
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BZ)V")
	public void method4634(@OriginalArg(1) boolean arg0) {
		super.aBoolean396 = arg0;
		if (Static146.aClass228_1 != null) {
			Static146.aClass228_1.method5200(!this.method4639(Static192.anInt3828));
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ul;)V")
	public void method4635(@OriginalArg(1) Class255 arg0) {
		@Pc(7) Class137 local7 = null;
		try {
			@Pc(13) Class87 local13 = arg0.method5847("", true);
			while (local13.anInt2679 == 0) {
				Static77.method1653(1L);
			}
			if (local13.anInt2679 == 1) {
				local7 = (Class137) local13.anObject3;
				@Pc(33) Class4_Sub20 local33 = this.method4642();
				local7.method3706(local33.aByteArray77, local33.anInt5526, 0);
			}
		} catch (@Pc(43) Exception local43) {
		}
		try {
			if (local7 != null) {
				local7.method3708();
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Z")
	public boolean method4636(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean396 : true;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!wn;I)V")
	private void method4638(@OriginalArg(0) Class4_Sub20 arg0) {
		if (arg0.aByteArray77.length - arg0.anInt5526 < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method4614();
		if (local18 < 0 || local18 > 17) {
			return;
		}
		@Pc(36) byte local36;
		if (local18 == 17) {
			local36 = 40;
		} else if (local18 == 16) {
			local36 = 38;
		} else if (local18 == 15) {
			local36 = 37;
		} else if (local18 == 14) {
			local36 = 36;
		} else if (local18 == 13) {
			local36 = 35;
		} else if (local18 == 12) {
			local36 = 34;
		} else if (local18 == 11) {
			local36 = 33;
		} else if (local18 == 10) {
			local36 = 32;
		} else if (local18 == 9) {
			local36 = 31;
		} else if (local18 == 8) {
			local36 = 30;
		} else if (local18 == 7) {
			local36 = 29;
		} else if (local18 == 6) {
			local36 = 28;
		} else if (local18 == 5) {
			local36 = 28;
		} else if (local18 == 4) {
			local36 = 24;
		} else if (local18 == 3) {
			local36 = 23;
		} else if (local18 == 2) {
			local36 = 22;
		} else if (local18 == 1) {
			local36 = 23;
		} else {
			local36 = 19;
		}
		if (local36 > arg0.aByteArray77.length - arg0.anInt5526) {
			return;
		}
		super.anInt5565 = arg0.method4614();
		if (super.anInt5565 < 1) {
			super.anInt5565 = 1;
		} else if (super.anInt5565 > 4) {
			super.anInt5565 = 4;
		}
		this.method4634(arg0.method4614() == 1);
		super.aBoolean410 = arg0.method4614() == 1;
		super.aBoolean400 = arg0.method4614() == 1;
		super.aBoolean406 = arg0.method4614() == 1;
		super.anInt5571 = arg0.method4614() == 1 ? 1 : 0;
		super.aBoolean402 = arg0.method4614() == 1;
		super.aBoolean404 = arg0.method4614() == 1;
		super.aBoolean395 = arg0.method4614() == 1;
		super.anInt5566 = arg0.method4614();
		if (super.anInt5566 > 2) {
			super.anInt5566 = 2;
		}
		if (local18 >= 17) {
			super.anInt5570 = arg0.method4614();
		}
		if (local18 >= 2) {
			super.aBoolean409 = arg0.method4614() == 1;
			if (local18 >= 17) {
				super.aBoolean399 = arg0.method4614() == 1;
			}
		} else {
			super.aBoolean409 = arg0.method4614() == 1;
			arg0.method4614();
		}
		super.aBoolean397 = arg0.method4614() == 1;
		super.aBoolean398 = arg0.method4614() == 1;
		super.anInt5563 = arg0.method4614();
		if (super.anInt5563 > 2) {
			super.anInt5563 = 2;
		}
		super.anInt5572 = super.anInt5563;
		super.aBoolean408 = arg0.method4614() == 1;
		super.anInt5554 = arg0.method4614();
		if (super.anInt5554 > 127) {
			super.anInt5554 = 127;
		}
		super.anInt5567 = arg0.method4614();
		super.anInt5555 = arg0.method4614();
		if (super.anInt5555 > 127) {
			super.anInt5555 = 127;
		}
		if (local18 >= 1) {
			super.anInt5574 = arg0.method4560();
			super.anInt5575 = arg0.method4560();
		}
		if (local18 >= 3 && local18 < 6) {
			arg0.method4614();
		}
		@Pc(487) int local487;
		if (local18 >= 4) {
			local487 = arg0.method4614();
			if (local487 < 0 || local487 > 2) {
				local487 = 0;
			}
			if (Static263.anInt5007 < 96) {
				local487 = 0;
			}
			Static49.method1089(local487);
		}
		if (local18 >= 5) {
			super.anInt5561 = arg0.method4595();
		}
		local487 = 0;
		if (local18 >= 6) {
			super.anInt5573 = local487 = arg0.method4614();
		}
		if (super.anInt5573 != 1 && super.anInt5573 != 2) {
			super.anInt5573 = 2;
		}
		if (local18 >= 7) {
			super.aBoolean394 = arg0.method4614() == 1;
		}
		if (local18 >= 8) {
			super.aBoolean393 = arg0.method4614() == 1;
		}
		if (local18 >= 9) {
			super.anInt5564 = arg0.method4614();
		}
		if (super.anInt5564 < 0 || super.anInt5564 > Static109.method2170(Static263.anInt5007)) {
			super.anInt5564 = 0;
		}
		if (local18 >= 10) {
			super.aBoolean401 = arg0.method4614() != 0;
		}
		if (local18 >= 11) {
			super.aBoolean403 = arg0.method4614() != 0;
		}
		if (local18 >= 12) {
			super.anInt5571 = arg0.method4614();
		}
		if (super.anInt5571 < 0 || super.anInt5571 > 2) {
			super.anInt5571 = 1;
		}
		if (local18 >= 13) {
			super.aBoolean407 = arg0.method4614() == 1;
		}
		if (local18 >= 14) {
			super.anInt5557 = arg0.method4614();
		} else if (local487 == 0) {
			super.anInt5557 = 2;
		} else {
			super.anInt5557 = 1;
		}
		if (super.anInt5557 < 0 || super.anInt5557 > 3) {
			super.anInt5557 = 2;
		}
		if (local18 >= 15) {
			super.anInt5562 = arg0.method4614();
			if (super.anInt5562 < 0 || super.anInt5562 > 4) {
				super.anInt5562 = Static65.anInt1627 == 1 ? 2 : 4;
			}
		}
		if (local18 >= 16) {
			super.aBoolean405 = arg0.method4614() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean405 = false;
				}
			} catch (@Pc(749) Throwable local749) {
			}
		}
		if (local18 < 17 && super.anInt5557 == 0) {
			super.anInt5557 = 2;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(II)Z")
	public boolean method4639(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean412 ? super.aBoolean396 : true;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(II)I")
	public int method4641(@OriginalArg(1) int arg0) {
		if (this.aBoolean411) {
			return 0;
		} else if (this.method4639(arg0)) {
			return super.aBoolean410 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Lclient!wn;")
	public Class4_Sub20 method4642() {
		@Pc(8) Class4_Sub20 local8 = new Class4_Sub20(41);
		local8.method4590(17);
		local8.method4590(super.anInt5565);
		local8.method4590(super.aBoolean396 ? 1 : 0);
		local8.method4590(super.aBoolean410 ? 1 : 0);
		local8.method4590(super.aBoolean400 ? 1 : 0);
		local8.method4590(super.aBoolean406 ? 1 : 0);
		local8.method4590(0);
		local8.method4590(super.aBoolean402 ? 1 : 0);
		local8.method4590(super.aBoolean404 ? 1 : 0);
		local8.method4590(super.aBoolean395 ? 1 : 0);
		local8.method4590(super.anInt5566);
		local8.method4590(super.anInt5570);
		local8.method4590(super.aBoolean409 ? 1 : 0);
		local8.method4590(super.aBoolean399 ? 1 : 0);
		local8.method4590(super.aBoolean397 ? 1 : 0);
		local8.method4590(super.aBoolean398 ? 1 : 0);
		local8.method4590(super.anInt5563);
		local8.method4590(super.aBoolean408 ? 1 : 0);
		local8.method4590(super.anInt5554);
		local8.method4590(super.anInt5567);
		local8.method4590(super.anInt5555);
		local8.method4558(super.anInt5574);
		local8.method4558(super.anInt5575);
		local8.method4590(Static72.method1584());
		local8.method4561(super.anInt5561);
		local8.method4590(super.anInt5573);
		local8.method4590(super.aBoolean394 ? 1 : 0);
		local8.method4590(super.aBoolean393 ? 1 : 0);
		local8.method4590(super.anInt5564);
		local8.method4590(super.aBoolean401 ? 1 : 0);
		local8.method4590(super.aBoolean403 ? 1 : 0);
		local8.method4590(super.anInt5571);
		local8.method4590(super.aBoolean407 ? 1 : 0);
		local8.method4590(super.anInt5557);
		local8.method4590(super.anInt5562);
		local8.method4590(super.aBoolean405 ? 1 : 0);
		return local8;
	}
}
