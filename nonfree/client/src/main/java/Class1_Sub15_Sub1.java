import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class1_Sub15_Sub1 extends Class1_Sub15 {

	@OriginalMember(owner = "client!ql", name = "wb", descriptor = "I")
	public int anInt7064;

	@OriginalMember(owner = "client!ql", name = "fb", descriptor = "Z")
	public boolean aBoolean538 = false;

	@OriginalMember(owner = "client!ql", name = "kb", descriptor = "Z")
	public boolean aBoolean539 = false;

	@OriginalMember(owner = "client!ql", name = "xb", descriptor = "Z")
	public boolean aBoolean542 = false;

	@OriginalMember(owner = "client!ql", name = "pb", descriptor = "Z")
	public boolean aBoolean540 = false;

	@OriginalMember(owner = "client!ql", name = "qb", descriptor = "Z")
	public boolean aBoolean541 = false;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class1_Sub15_Sub1(@OriginalArg(0) Class229 arg0) {
		super.anInt7045 = 3;
		super.anInt7048 = 3;
		this.method6380(true);
		super.anInt7029 = 0;
		super.anInt7038 = 0;
		super.anInt7049 = 2;
		super.anInt7030 = 127;
		super.anInt7035 = 0;
		super.aBoolean533 = true;
		super.anInt7032 = 0;
		super.aBoolean530 = true;
		super.anInt7037 = 127;
		super.anInt7042 = 127;
		super.aBoolean521 = true;
		super.aBoolean531 = true;
		super.aBoolean537 = true;
		super.anInt7034 = 1;
		super.aBoolean523 = true;
		super.aBoolean536 = true;
		super.aBoolean526 = false;
		super.aBoolean532 = true;
		super.aBoolean529 = true;
		super.aBoolean525 = true;
		super.anInt7041 = 0;
		if (Static520.anInt9181 >= 96) {
			Static511.method7828(2);
		} else {
			Static511.method7828(0);
		}
		super.aBoolean520 = false;
		super.aBoolean535 = true;
		super.anInt7051 = Static6.anInt163 == 1 ? 2 : 4;
		super.aBoolean528 = false;
		super.anInt7033 = 0;
		super.aBoolean522 = false;
		super.anInt7031 = 2;
		super.anInt7036 = 0;
		super.aBoolean534 = true;
		super.anInt7039 = 2;
		@Pc(139) Class208 local139 = null;
		try {
			@Pc(145) Class311 local145 = arg0.method6071("", true);
			while (local145.anInt9169 == 0) {
				Static265.method3147(1L);
			}
			if (local145.anInt9169 == 1) {
				local139 = (Class208) local145.anObject17;
				@Pc(170) byte[] local170 = new byte[(int) local139.method5702()];
				@Pc(185) int local185;
				for (@Pc(172) int local172 = 0; local172 < local170.length; local172 += local185) {
					local185 = local139.method5705(local170, local172, local170.length - local172);
					if (local185 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method6370(new Class1_Sub17(local170));
			}
		} catch (@Pc(211) Exception local211) {
		}
		try {
			if (local139 != null) {
				local139.method5704();
			}
		} catch (@Pc(218) Exception local218) {
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)I")
	public int method6364() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static380.anInt6743 != 3 && Static380.anInt6743 != 2) {
			if (Static380.aString170.startsWith("win")) {
				local11 = true;
				local9 = true;
				if (!Static380.aString165.startsWith("amd64") && !Static380.aString165.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean541) {
			local7 = false;
		}
		if (this.aBoolean540) {
			local9 = false;
		}
		if (this.aBoolean538) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method6377();
		}
		@Pc(76) int local76 = -1;
		@Pc(78) int local78 = -1;
		if (local7) {
			try {
				local76 = Static267.method4741(2, 1000);
			} catch (@Pc(87) Exception local87) {
			}
		}
		@Pc(90) int local90 = -1;
		if (local11) {
			try {
				local90 = Static267.method4741(3, 1000);
				if (Static449.anInt7876 == 3) {
					@Pc(105) Class98 local105 = Static455.aClass4_11.method7207();
					@Pc(110) long local110 = local105.aLong70 & 0xFFFFFFFFFFFFL;
					@Pc(113) int local113 = local105.anInt2591;
					if (local113 == 4318) {
						local9 &= local110 >= 64425238954L;
					} else if (local113 == 4098) {
						local9 &= local110 >= 60129613779L;
					}
				}
			} catch (@Pc(149) Exception local149) {
			}
		}
		if (local9) {
			try {
				local78 = Static267.method4741(1, 1000);
			} catch (@Pc(159) Exception local159) {
			}
		}
		if (local76 == -1 && local78 == -1 && local90 == -1) {
			return this.method6377();
		} else if (local90 < local76 && local78 < local76) {
			return this.method6366(local76);
		} else if (local90 <= local78) {
			return this.method6373(local78, 1);
		} else {
			return this.method6373(local90, 3);
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
	public void method6365() {
		this.method6380(false);
		super.aBoolean527 = false;
		super.aBoolean537 = false;
		super.aBoolean533 = false;
		super.aBoolean523 = false;
		super.anInt7034 = 0;
		super.anInt7029 = super.anInt7032 = 0;
		super.aBoolean536 = false;
		super.aBoolean525 = false;
		super.aBoolean530 = false;
		super.aBoolean526 = false;
		super.anInt7049 = super.anInt7041 = 0;
		super.aBoolean531 = false;
		super.aBoolean529 = false;
		super.aBoolean532 = false;
		Static511.method7828(0);
		super.aBoolean534 = false;
		super.anInt7036 = 0;
		super.aBoolean520 = false;
		this.method6372();
		super.anInt7048 = 1;
		Static449.method6959();
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(II)I")
	private int method6366(@OriginalArg(1) int arg0) {
		@Pc(24) byte local24;
		if (arg0 > 12000) {
			local24 = 4;
			this.method6382();
		} else if (arg0 > 5000) {
			this.method6368();
			local24 = 3;
		} else if (arg0 > 2000) {
			local24 = 2;
			this.method6374();
		} else {
			this.method6365();
			local24 = 1;
		}
		if (Static449.anInt7876 != 2) {
			super.anInt7039 = 2;
			Static124.method2356(2);
		}
		this.method6376(Static473.aClass229_14);
		return local24;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method6368() {
		this.method6380(true);
		super.aBoolean525 = true;
		super.anInt7049 = super.anInt7041 = 1;
		super.aBoolean523 = true;
		super.aBoolean532 = false;
		super.anInt7034 = 1;
		super.aBoolean537 = true;
		super.anInt7029 = super.anInt7032 = 0;
		super.aBoolean536 = true;
		super.aBoolean533 = true;
		super.aBoolean531 = true;
		super.aBoolean529 = true;
		super.aBoolean530 = true;
		super.aBoolean526 = false;
		super.aBoolean527 = true;
		if (Static520.anInt9181 <= 95) {
			Static511.method7828(0);
		} else {
			Static511.method7828(1);
		}
		super.aBoolean520 = false;
		super.anInt7036 = 0;
		super.aBoolean534 = true;
		this.method6372();
		super.anInt7048 = 3;
		Static449.method6959();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!os;)V")
	private void method6370(@OriginalArg(1) Class1_Sub17 arg0) {
		if (arg0.aByteArray58.length - arg0.anInt4872 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method4487();
		if (local19 < 0 || local19 > 18) {
			return;
		}
		@Pc(56) byte local56;
		if (local19 == 18) {
			local56 = 41;
		} else if (local19 == 17) {
			local56 = 40;
		} else if (local19 == 16) {
			local56 = 38;
		} else if (local19 == 15) {
			local56 = 37;
		} else if (local19 == 14) {
			local56 = 36;
		} else if (local19 == 13) {
			local56 = 35;
		} else if (local19 == 12) {
			local56 = 34;
		} else if (local19 == 11) {
			local56 = 33;
		} else if (local19 == 10) {
			local56 = 32;
		} else if (local19 == 9) {
			local56 = 31;
		} else if (local19 == 8) {
			local56 = 30;
		} else if (local19 == 7) {
			local56 = 29;
		} else if (local19 == 6) {
			local56 = 28;
		} else if (local19 == 5) {
			local56 = 28;
		} else if (local19 == 4) {
			local56 = 24;
		} else if (local19 == 3) {
			local56 = 23;
		} else if (local19 == 2) {
			local56 = 22;
		} else if (local19 == 1) {
			local56 = 23;
		} else {
			local56 = 19;
		}
		if (local56 > arg0.aByteArray58.length - arg0.anInt4872) {
			return;
		}
		super.anInt7045 = arg0.method4487();
		if (super.anInt7045 < 1) {
			super.anInt7045 = 1;
		} else if (super.anInt7045 > 4) {
			super.anInt7045 = 4;
		}
		this.method6380(arg0.method4487() == 1);
		super.aBoolean537 = arg0.method4487() == 1;
		super.aBoolean531 = arg0.method4487() == 1;
		super.aBoolean533 = arg0.method4487() == 1;
		super.anInt7034 = arg0.method4487() == 1 ? 1 : 0;
		super.aBoolean536 = arg0.method4487() == 1;
		super.aBoolean525 = arg0.method4487() == 1;
		super.aBoolean530 = arg0.method4487() == 1;
		super.anInt7049 = arg0.method4487();
		if (super.anInt7049 > 2) {
			super.anInt7049 = 2;
		}
		if (local19 >= 17) {
			super.anInt7041 = arg0.method4487();
		}
		if (local19 < 2) {
			super.aBoolean529 = arg0.method4487() == 1;
			arg0.method4487();
		} else {
			super.aBoolean529 = arg0.method4487() == 1;
			if (local19 >= 17) {
				super.aBoolean526 = arg0.method4487() == 1;
			}
		}
		super.aBoolean532 = arg0.method4487() == 1;
		super.aBoolean523 = arg0.method4487() == 1;
		super.anInt7029 = arg0.method4487();
		if (super.anInt7029 > 2) {
			super.anInt7029 = 2;
		}
		super.anInt7032 = super.anInt7029;
		super.aBoolean521 = arg0.method4487() == 1;
		super.anInt7030 = arg0.method4487();
		if (super.anInt7030 > 127) {
			super.anInt7030 = 127;
		}
		super.anInt7042 = arg0.method4487();
		super.anInt7037 = arg0.method4487();
		if (super.anInt7037 > 127) {
			super.anInt7037 = 127;
		}
		if (local19 >= 1) {
			super.anInt7035 = arg0.method4494();
			super.anInt7038 = arg0.method4494();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method4487();
		}
		@Pc(494) int local494;
		if (local19 >= 4) {
			local494 = arg0.method4487();
			if (local494 < 0 || local494 > 2) {
				local494 = 0;
			}
			if (Static520.anInt9181 < 96) {
				local494 = 0;
			}
			Static511.method7828(local494);
		}
		if (local19 >= 5) {
			super.anInt7033 = arg0.method4481();
		}
		local494 = 0;
		if (local19 >= 6) {
			super.anInt7031 = local494 = arg0.method4487();
		}
		if (super.anInt7031 != 1 && super.anInt7031 != 2) {
			super.anInt7031 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean522 = arg0.method4487() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean528 = arg0.method4487() == 1;
		}
		if (local19 >= 9) {
			super.anInt7036 = arg0.method4487();
		}
		if (super.anInt7036 < 0 || super.anInt7036 > Static427.method6649(Static520.anInt9181)) {
			super.anInt7036 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean520 = arg0.method4487() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean535 = arg0.method4487() != 0;
		}
		if (local19 >= 12) {
			super.anInt7034 = arg0.method4487();
		}
		if (super.anInt7034 < 0 || super.anInt7034 > 2) {
			super.anInt7034 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean534 = arg0.method4487() == 1;
		}
		if (local19 >= 14) {
			super.anInt7039 = arg0.method4487();
		} else if (local494 == 0) {
			super.anInt7039 = 2;
		} else {
			super.anInt7039 = 1;
		}
		if (super.anInt7039 < 0 || super.anInt7039 > 5) {
			super.anInt7039 = 2;
		}
		if (local19 >= 15) {
			super.anInt7051 = arg0.method4487();
			if (super.anInt7051 < 0 || super.anInt7051 > 4) {
				super.anInt7051 = Static6.anInt163 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean527 = arg0.method4487() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean527 = false;
				}
			} catch (@Pc(770) Throwable local770) {
			}
		}
		if (local19 < 17 && super.anInt7039 == 0) {
			super.anInt7039 = 2;
		}
		if (local19 >= 18) {
			super.anInt7048 = arg0.method4487();
			if (super.anInt7048 < 0 || super.anInt7048 > 4) {
				super.anInt7048 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(II)Z")
	public boolean method6371(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean524 : true;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	private void method6372() {
		if (Static6.anInt163 <= 1) {
			super.anInt7051 = 2;
		} else {
			super.anInt7051 = 4;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)I")
	private int method6373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) byte local15;
		if (arg0 > 20000) {
			this.method6382();
			local15 = 4;
		} else if (arg0 > 10000) {
			this.method6368();
			local15 = 3;
		} else if (arg0 > 5000) {
			this.method6374();
			local15 = 2;
		} else {
			this.method6365();
			local15 = 1;
		}
		if (Static449.anInt7876 != arg1) {
			super.anInt7039 = arg1;
			Static124.method2356(arg1);
		}
		this.method6376(Static473.aClass229_14);
		return local15;
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
	public void method6374() {
		this.method6380(true);
		super.aBoolean526 = false;
		super.aBoolean529 = false;
		super.aBoolean525 = false;
		super.anInt7049 = super.anInt7041 = 0;
		super.aBoolean523 = false;
		super.aBoolean533 = false;
		super.aBoolean530 = false;
		super.anInt7029 = super.anInt7032 = 0;
		super.aBoolean536 = false;
		super.aBoolean537 = false;
		super.aBoolean531 = false;
		super.aBoolean527 = false;
		super.aBoolean532 = false;
		super.anInt7034 = 0;
		Static511.method7828(0);
		super.aBoolean534 = true;
		super.anInt7036 = 0;
		super.aBoolean520 = false;
		this.method6372();
		super.anInt7048 = 2;
		Static449.method6959();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZLclient!pq;)V")
	public void method6376(@OriginalArg(1) Class229 arg0) {
		@Pc(7) Class208 local7 = null;
		try {
			@Pc(13) Class311 local13 = arg0.method6071("", true);
			while (local13.anInt9169 == 0) {
				Static265.method3147(1L);
			}
			if (local13.anInt9169 == 1) {
				local7 = (Class208) local13.anObject17;
				@Pc(40) Class1_Sub17 local40 = new Class1_Sub17(Static61.method1525());
				this.method6359(local40);
				local7.method5701(0, local40.aByteArray58, local40.anInt4872);
			}
		} catch (@Pc(54) Exception local54) {
		}
		try {
			if (local7 != null) {
				local7.method5704();
			}
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)I")
	private int method6377() {
		@Pc(24) byte local24;
		if (Static520.anInt9181 >= 96) {
			@Pc(16) int local16 = Static353.method5815();
			if (local16 <= 100) {
				this.method6382();
				local24 = 4;
			} else if (local16 <= 500) {
				local24 = 3;
				this.method6368();
			} else if (local16 <= 1000) {
				this.method6374();
				local24 = 2;
			} else {
				this.method6365();
				local24 = 1;
			}
		} else {
			local24 = 1;
			this.method6365();
		}
		if (Static449.anInt7876 != 0) {
			super.anInt7039 = 0;
			Static124.method2356(0);
		}
		this.method6376(Static473.aClass229_14);
		return local24;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I")
	public int method6378(@OriginalArg(1) int arg0) {
		if (this.aBoolean539) {
			return 0;
		} else if (this.method6381(arg0)) {
			return super.aBoolean537 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
	public void method6380(@OriginalArg(0) boolean arg0) {
		super.aBoolean524 = arg0;
		if (Static398.aClass18_4 != null) {
			Static398.aClass18_4.method605(!this.method6381(Static449.anInt7876));
		}
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(II)Z")
	public boolean method6381(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean542 ? super.aBoolean524 : true;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)V")
	public void method6382() {
		this.method6380(true);
		super.aBoolean527 = true;
		super.aBoolean533 = true;
		super.aBoolean531 = true;
		super.aBoolean525 = true;
		super.aBoolean523 = true;
		super.anInt7029 = super.anInt7032 = 0;
		super.aBoolean537 = true;
		super.anInt7034 = 1;
		super.aBoolean536 = true;
		super.aBoolean526 = true;
		super.aBoolean530 = true;
		super.aBoolean529 = true;
		super.anInt7049 = super.anInt7041 = 2;
		super.aBoolean532 = true;
		if (Static520.anInt9181 > 95) {
			Static511.method7828(2);
		} else {
			Static511.method7828(0);
		}
		super.aBoolean520 = false;
		super.aBoolean534 = true;
		super.anInt7036 = 0;
		this.method6372();
		super.anInt7048 = 4;
		Static449.method6959();
	}
}
