import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class5_Sub28_Sub1 extends Class5_Sub28 {

	@OriginalMember(owner = "client!jq", name = "eb", descriptor = "I")
	public int anInt4895;

	@OriginalMember(owner = "client!jq", name = "nb", descriptor = "Z")
	public boolean aBoolean342 = false;

	@OriginalMember(owner = "client!jq", name = "qb", descriptor = "Z")
	public boolean aBoolean343 = false;

	@OriginalMember(owner = "client!jq", name = "wb", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!jq", name = "ub", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!jq", name = "Ab", descriptor = "Z")
	public boolean aBoolean346 = false;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class5_Sub28_Sub1(@OriginalArg(0) Class9 arg0) {
		super.anInt4878 = 3;
		super.anInt4874 = 3;
		this.method4135(true);
		super.anInt4877 = 1;
		super.aBoolean333 = true;
		super.anInt4873 = 0;
		super.anInt4876 = 2;
		super.anInt4888 = 0;
		super.aBoolean337 = true;
		super.anInt4871 = 127;
		super.aBoolean340 = true;
		super.aBoolean336 = true;
		super.anInt4889 = 127;
		super.aBoolean331 = false;
		super.aBoolean339 = true;
		super.aBoolean338 = true;
		super.anInt4882 = 0;
		super.anInt4890 = 0;
		super.aBoolean326 = true;
		super.aBoolean329 = true;
		super.aBoolean330 = true;
		super.aBoolean324 = true;
		super.anInt4870 = 127;
		super.anInt4872 = 0;
		if (Static193.anInt3735 < 96) {
			Static296.method4924(0);
		} else {
			Static296.method4924(2);
		}
		super.aBoolean334 = false;
		super.anInt4891 = 2;
		super.aBoolean332 = true;
		super.anInt4887 = 2;
		super.aBoolean341 = false;
		super.aBoolean328 = true;
		super.anInt4875 = 0;
		super.anInt4869 = 0;
		super.aBoolean335 = false;
		super.anInt4868 = Static397.anInt7131 == 1 ? 2 : 4;
		@Pc(143) Class97 local143 = null;
		try {
			@Pc(149) Class83 local149 = arg0.method293(true, "");
			while (local149.anInt2495 == 0) {
				Static213.method3465(1L);
			}
			if (local149.anInt2495 == 1) {
				local143 = (Class97) local149.anObject8;
				@Pc(171) byte[] local171 = new byte[(int) local143.method2500()];
				@Pc(186) int local186;
				for (@Pc(173) int local173 = 0; local173 < local171.length; local173 += local186) {
					local186 = local143.method2501(local171, local171.length - local173, local173);
					if (local186 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4131(new Class5_Sub3(local171));
			}
		} catch (@Pc(215) Exception local215) {
		}
		try {
			if (local143 != null) {
				local143.method2499();
			}
		} catch (@Pc(222) Exception local222) {
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)Z")
	public boolean method4118(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean344 ? super.aBoolean325 : true;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public void method4119() {
		this.method4135(true);
		super.aBoolean340 = true;
		super.aBoolean330 = false;
		super.aBoolean329 = true;
		super.anInt4876 = super.anInt4882 = 1;
		super.aBoolean324 = true;
		super.anInt4877 = 1;
		super.aBoolean339 = true;
		super.aBoolean326 = true;
		super.anInt4873 = super.anInt4872 = 0;
		super.aBoolean327 = true;
		super.aBoolean337 = true;
		super.aBoolean333 = true;
		super.aBoolean331 = false;
		super.aBoolean336 = true;
		if (Static193.anInt3735 <= 95) {
			Static296.method4924(0);
		} else {
			Static296.method4924(1);
		}
		super.aBoolean335 = false;
		super.aBoolean328 = true;
		super.anInt4869 = 0;
		this.method4130();
		super.anInt4874 = 3;
		Static507.method6976();
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(BI)Z")
	public boolean method4120(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean325 : true;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void method4122() {
		this.method4135(true);
		super.anInt4876 = super.anInt4882 = 2;
		super.anInt4877 = 1;
		super.aBoolean329 = true;
		super.aBoolean327 = true;
		super.aBoolean326 = true;
		super.anInt4873 = super.anInt4872 = 0;
		super.aBoolean340 = true;
		super.aBoolean336 = true;
		super.aBoolean330 = true;
		super.aBoolean331 = true;
		super.aBoolean337 = true;
		super.aBoolean324 = true;
		super.aBoolean339 = true;
		super.aBoolean333 = true;
		if (Static193.anInt3735 > 95) {
			Static296.method4924(2);
		} else {
			Static296.method4924(0);
		}
		super.aBoolean335 = false;
		super.aBoolean328 = true;
		super.anInt4869 = 0;
		this.method4130();
		super.anInt4874 = 4;
		Static507.method6976();
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
	public void method4124() {
		this.method4135(false);
		super.anInt4876 = super.anInt4882 = 0;
		super.aBoolean333 = false;
		super.aBoolean327 = false;
		super.aBoolean336 = false;
		super.aBoolean337 = false;
		super.aBoolean329 = false;
		super.aBoolean326 = false;
		super.aBoolean331 = false;
		super.anInt4877 = 0;
		super.aBoolean324 = false;
		super.aBoolean340 = false;
		super.aBoolean330 = false;
		super.aBoolean339 = false;
		super.anInt4873 = super.anInt4872 = 0;
		Static296.method4924(0);
		super.aBoolean335 = false;
		super.aBoolean328 = false;
		super.anInt4869 = 0;
		this.method4130();
		super.anInt4874 = 1;
		Static507.method6976();
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(II)I")
	private int method4125(@OriginalArg(0) int arg0) {
		@Pc(12) byte local12;
		if (arg0 > 12000) {
			local12 = 4;
			this.method4122();
		} else if (arg0 > 5000) {
			local12 = 3;
			this.method4119();
		} else if (arg0 <= 2000) {
			local12 = 1;
			this.method4124();
		} else {
			local12 = 2;
			this.method4127();
		}
		if (Static17.anInt459 != 2) {
			super.anInt4887 = 2;
			Static77.method4915(2);
		}
		this.method4132(Static159.aClass9_10);
		return local12;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
	private int method4126() {
		@Pc(30) byte local30;
		if (Static193.anInt3735 >= 96) {
			@Pc(15) int local15 = Static308.method5030();
			if (local15 <= 100) {
				this.method4122();
				local30 = 4;
			} else if (local15 <= 500) {
				this.method4119();
				local30 = 3;
			} else if (local15 > 1000) {
				local30 = 1;
				this.method4124();
			} else {
				local30 = 2;
				this.method4127();
			}
		} else {
			this.method4124();
			local30 = 1;
		}
		if (Static17.anInt459 != 0) {
			super.anInt4887 = 0;
			Static77.method4915(0);
		}
		this.method4132(Static159.aClass9_10);
		return local30;
	}

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V")
	public void method4127() {
		this.method4135(true);
		super.aBoolean324 = false;
		super.aBoolean340 = false;
		super.anInt4877 = 0;
		super.anInt4876 = super.anInt4882 = 0;
		super.aBoolean330 = false;
		super.aBoolean339 = false;
		super.aBoolean331 = false;
		super.aBoolean326 = false;
		super.aBoolean327 = false;
		super.aBoolean329 = false;
		super.aBoolean336 = false;
		super.anInt4873 = super.anInt4872 = 0;
		super.aBoolean333 = true;
		super.aBoolean337 = false;
		Static296.method4924(0);
		super.anInt4869 = 0;
		super.aBoolean328 = true;
		super.aBoolean335 = false;
		this.method4130();
		super.anInt4874 = 2;
		Static507.method6976();
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)I")
	private int method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(29) byte local29;
		if (arg1 > 20000) {
			local29 = 4;
			this.method4122();
		} else if (arg1 > 10000) {
			this.method4119();
			local29 = 3;
		} else if (arg1 <= 5000) {
			this.method4124();
			local29 = 1;
		} else {
			local29 = 2;
			this.method4127();
		}
		if (Static17.anInt459 != arg0) {
			super.anInt4887 = arg0;
			Static77.method4915(arg0);
		}
		this.method4132(Static159.aClass9_10);
		return local29;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)I")
	public int method4129(@OriginalArg(0) int arg0) {
		if (this.aBoolean342) {
			return 0;
		} else if (this.method4118(arg0)) {
			return super.aBoolean336 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)V")
	private void method4130() {
		if (Static397.anInt7131 > 1) {
			super.anInt4868 = 4;
		} else {
			super.anInt4868 = 2;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!co;B)V")
	private void method4131(@OriginalArg(0) Class5_Sub3 arg0) {
		if (arg0.aByteArray66.length - arg0.anInt4960 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method4220();
		if (local20 < 0 || local20 > 18) {
			return;
		}
		@Pc(34) byte local34;
		if (local20 == 18) {
			local34 = 41;
		} else if (local20 == 17) {
			local34 = 40;
		} else if (local20 == 16) {
			local34 = 38;
		} else if (local20 == 15) {
			local34 = 37;
		} else if (local20 == 14) {
			local34 = 36;
		} else if (local20 == 13) {
			local34 = 35;
		} else if (local20 == 12) {
			local34 = 34;
		} else if (local20 == 11) {
			local34 = 33;
		} else if (local20 == 10) {
			local34 = 32;
		} else if (local20 == 9) {
			local34 = 31;
		} else if (local20 == 8) {
			local34 = 30;
		} else if (local20 == 7) {
			local34 = 29;
		} else if (local20 == 6) {
			local34 = 28;
		} else if (local20 == 5) {
			local34 = 28;
		} else if (local20 == 4) {
			local34 = 24;
		} else if (local20 == 3) {
			local34 = 23;
		} else if (local20 == 2) {
			local34 = 22;
		} else if (local20 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.aByteArray66.length - arg0.anInt4960) {
			return;
		}
		super.anInt4878 = arg0.method4220();
		if (super.anInt4878 < 1) {
			super.anInt4878 = 1;
		} else if (super.anInt4878 > 4) {
			super.anInt4878 = 4;
		}
		this.method4135(arg0.method4220() == 1);
		super.aBoolean336 = arg0.method4220() == 1;
		super.aBoolean333 = arg0.method4220() == 1;
		super.aBoolean337 = arg0.method4220() == 1;
		super.anInt4877 = arg0.method4220() == 1 ? 1 : 0;
		super.aBoolean324 = arg0.method4220() == 1;
		super.aBoolean326 = arg0.method4220() == 1;
		super.aBoolean340 = arg0.method4220() == 1;
		super.anInt4876 = arg0.method4220();
		if (super.anInt4876 > 2) {
			super.anInt4876 = 2;
		}
		if (local20 >= 17) {
			super.anInt4882 = arg0.method4220();
		}
		if (local20 < 2) {
			super.aBoolean329 = arg0.method4220() == 1;
			arg0.method4220();
		} else {
			super.aBoolean329 = arg0.method4220() == 1;
			if (local20 >= 17) {
				super.aBoolean331 = arg0.method4220() == 1;
			}
		}
		super.aBoolean330 = arg0.method4220() == 1;
		super.aBoolean339 = arg0.method4220() == 1;
		super.anInt4873 = arg0.method4220();
		if (super.anInt4873 > 2) {
			super.anInt4873 = 2;
		}
		super.anInt4872 = super.anInt4873;
		super.aBoolean338 = arg0.method4220() == 1;
		super.anInt4871 = arg0.method4220();
		if (super.anInt4871 > 127) {
			super.anInt4871 = 127;
		}
		super.anInt4889 = arg0.method4220();
		super.anInt4870 = arg0.method4220();
		if (super.anInt4870 > 127) {
			super.anInt4870 = 127;
		}
		if (local20 >= 1) {
			super.anInt4888 = arg0.method4227();
			super.anInt4890 = arg0.method4227();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method4220();
		}
		@Pc(488) int local488;
		if (local20 >= 4) {
			local488 = arg0.method4220();
			if (local488 < 0 || local488 > 2) {
				local488 = 0;
			}
			if (Static193.anInt3735 < 96) {
				local488 = 0;
			}
			Static296.method4924(local488);
		}
		if (local20 >= 5) {
			super.anInt4875 = arg0.method4230();
		}
		local488 = 0;
		if (local20 >= 6) {
			super.anInt4891 = local488 = arg0.method4220();
		}
		if (super.anInt4891 != 1 && super.anInt4891 != 2) {
			super.anInt4891 = 2;
		}
		if (local20 >= 7) {
			super.aBoolean341 = arg0.method4220() == 1;
		}
		if (local20 >= 8) {
			super.aBoolean334 = arg0.method4220() == 1;
		}
		if (local20 >= 9) {
			super.anInt4869 = arg0.method4220();
		}
		if (super.anInt4869 < 0 || super.anInt4869 > Static509.method6985(Static193.anInt3735)) {
			super.anInt4869 = 0;
		}
		if (local20 >= 10) {
			super.aBoolean335 = arg0.method4220() != 0;
		}
		if (local20 >= 11) {
			super.aBoolean332 = arg0.method4220() != 0;
		}
		if (local20 >= 12) {
			super.anInt4877 = arg0.method4220();
		}
		if (super.anInt4877 < 0 || super.anInt4877 > 2) {
			super.anInt4877 = 1;
		}
		if (local20 >= 13) {
			super.aBoolean328 = arg0.method4220() == 1;
		}
		if (local20 >= 14) {
			super.anInt4887 = arg0.method4220();
		} else if (local488 == 0) {
			super.anInt4887 = 2;
		} else {
			super.anInt4887 = 1;
		}
		if (super.anInt4887 < 0 || super.anInt4887 > 5) {
			super.anInt4887 = 2;
		}
		if (local20 >= 15) {
			super.anInt4868 = arg0.method4220();
			if (super.anInt4868 < 0 || super.anInt4868 > 4) {
				super.anInt4868 = Static397.anInt7131 == 1 ? 2 : 4;
			}
		}
		if (local20 >= 16) {
			super.aBoolean327 = arg0.method4220() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean327 = false;
				}
			} catch (@Pc(764) Throwable local764) {
			}
		}
		if (local20 < 17 && super.anInt4887 == 0) {
			super.anInt4887 = 2;
		}
		if (local20 < 18) {
			return;
		}
		super.anInt4874 = arg0.method4220();
		if (super.anInt4874 < 0 || super.anInt4874 > 4) {
			super.anInt4874 = 0;
		}
		if (super.anInt4874 == 2) {
			super.aBoolean333 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!ae;)V")
	public void method4132(@OriginalArg(1) Class9 arg0) {
		@Pc(7) Class97 local7 = null;
		try {
			@Pc(13) Class83 local13 = arg0.method293(true, "");
			while (local13.anInt2495 == 0) {
				Static213.method3465(1L);
			}
			if (local13.anInt2495 == 1) {
				local7 = (Class97) local13.anObject8;
				@Pc(37) Class5_Sub3 local37 = new Class5_Sub3(Static430.method6133());
				this.method4114(local37);
				local7.method2497(local37.aByteArray66, 0, local37.anInt4960);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local7 != null) {
				local7.method2499();
			}
		} catch (@Pc(64) Exception local64) {
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)I")
	public int method4134() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static9.anInt148 != 3 && Static9.anInt148 != 2) {
			if (Static9.aString8.startsWith("win")) {
				local9 = true;
				if (!Static9.aString6.startsWith("amd64") && !Static9.aString6.startsWith("x86_64")) {
					local7 = true;
				}
				local11 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean345) {
			local7 = false;
		}
		if (this.aBoolean343) {
			local9 = false;
		}
		if (this.aBoolean346) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method4126();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		@Pc(70) int local70 = -1;
		if (local7) {
			try {
				local66 = Static261.method4376(2, 1000);
			} catch (@Pc(79) Exception local79) {
			}
		}
		if (local11) {
			try {
				local70 = Static261.method4376(3, 1000);
				if (Static17.anInt459 == 3) {
					@Pc(95) Class68 local95 = Static110.aClass62_15.method7016();
					@Pc(100) long local100 = local95.aLong62 & 0xFFFFFFFFFFFFL;
					@Pc(103) int local103 = local95.anInt2182;
					if (local103 == 4318) {
						local9 &= local100 >= 64425238954L;
					} else if (local103 == 4098) {
						local9 &= local100 >= 60129613779L;
					}
				}
			} catch (@Pc(139) Exception local139) {
			}
		}
		if (local9) {
			try {
				local68 = Static261.method4376(1, 1000);
			} catch (@Pc(149) Exception local149) {
			}
		}
		if (local66 == -1 && local68 == -1 && local70 == -1) {
			return this.method4126();
		} else if (local70 < local66 && local66 > local68) {
			return this.method4125(local66);
		} else if (local70 > local68) {
			return this.method4128(3, local70);
		} else {
			return this.method4128(1, local68);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V")
	public void method4135(@OriginalArg(1) boolean arg0) {
		super.aBoolean325 = arg0;
		if (Static453.aClass88_3 != null) {
			Static453.aClass88_3.method2291(!this.method4118(Static17.anInt459));
		}
	}
}
