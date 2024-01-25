import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class1_Sub28_Sub1 extends Class1_Sub28 {

	@OriginalMember(owner = "client!kg", name = "sb", descriptor = "I")
	public int anInt4926;

	@OriginalMember(owner = "client!kg", name = "Z", descriptor = "Z")
	public boolean aBoolean333 = false;

	@OriginalMember(owner = "client!kg", name = "ab", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!kg", name = "hb", descriptor = "Z")
	public boolean aBoolean336 = false;

	@OriginalMember(owner = "client!kg", name = "gb", descriptor = "Z")
	public boolean aBoolean335 = false;

	@OriginalMember(owner = "client!kg", name = "rb", descriptor = "Z")
	public boolean aBoolean337 = false;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!lp;)V")
	public Class1_Sub28_Sub1(@OriginalArg(0) Class182 arg0) {
		super.anInt4903 = 3;
		super.anInt4908 = 3;
		this.method4279(true);
		super.aBoolean320 = true;
		super.aBoolean319 = true;
		super.aBoolean327 = false;
		super.aBoolean328 = true;
		super.anInt4899 = 127;
		super.aBoolean331 = true;
		super.aBoolean322 = true;
		super.aBoolean315 = true;
		super.anInt4913 = 127;
		super.aBoolean318 = true;
		super.anInt4910 = 2;
		super.anInt4895 = 0;
		super.anInt4894 = 127;
		super.anInt4890 = 0;
		super.anInt4907 = 0;
		super.anInt4909 = 0;
		super.anInt4893 = 0;
		super.aBoolean332 = true;
		super.aBoolean317 = true;
		super.anInt4892 = 1;
		super.aBoolean321 = true;
		if (Static318.anInt6040 >= 96) {
			Static438.method2402(2);
		} else {
			Static438.method2402(0);
		}
		super.anInt4904 = 2;
		super.aBoolean330 = false;
		super.anInt4912 = 2;
		super.anInt4905 = 0;
		super.aBoolean326 = false;
		super.anInt4911 = 0;
		super.aBoolean325 = true;
		super.aBoolean324 = false;
		super.anInt4901 = Static74.anInt2041 == 1 ? 2 : 4;
		super.aBoolean316 = true;
		@Pc(143) Class116 local143 = null;
		try {
			@Pc(149) Class243 local149 = arg0.method4814("", true);
			while (local149.anInt6905 == 0) {
				Static505.method7295(1L);
			}
			if (local149.anInt6905 == 1) {
				local143 = (Class116) local149.anObject12;
				@Pc(176) byte[] local176 = new byte[(int) local143.method3372()];
				@Pc(190) int local190;
				for (@Pc(178) int local178 = 0; local178 < local176.length; local178 += local190) {
					local190 = local143.method3369(local176.length - local178, local178, local176);
					if (local190 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4280(new Class1_Sub13(local176));
			}
		} catch (@Pc(216) Exception local216) {
		}
		try {
			if (local143 != null) {
				local143.method3371();
			}
		} catch (@Pc(223) Exception local223) {
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public void method4265() {
		this.method4279(true);
		super.aBoolean322 = true;
		super.anInt4910 = super.anInt4895 = 1;
		super.anInt4907 = super.anInt4890 = 0;
		super.aBoolean327 = false;
		super.aBoolean321 = true;
		super.aBoolean328 = true;
		super.anInt4892 = 1;
		super.aBoolean320 = true;
		super.aBoolean331 = true;
		super.aBoolean319 = true;
		super.aBoolean323 = true;
		super.aBoolean318 = true;
		super.aBoolean315 = false;
		super.aBoolean317 = true;
		if (Static318.anInt6040 > 95) {
			Static438.method2402(1);
		} else {
			Static438.method2402(0);
		}
		super.aBoolean325 = true;
		super.anInt4905 = 0;
		super.aBoolean330 = false;
		this.method4268();
		super.anInt4903 = 3;
		Static418.method6218();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Z")
	public boolean method4266(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean333 ? super.aBoolean329 : true;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)I")
	private int method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte local13;
		if (arg1 > 20000) {
			this.method4269();
			local13 = 4;
		} else if (arg1 > 10000) {
			this.method4265();
			local13 = 3;
		} else if (arg1 > 5000) {
			local13 = 2;
			this.method4278();
		} else {
			local13 = 1;
			this.method4272();
		}
		if (Static526.anInt8926 != arg0) {
			super.anInt4912 = arg0;
			Static508.method7307(arg0);
		}
		this.method4274(Static91.aClass182_2);
		return local13;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	private void method4268() {
		if (Static74.anInt2041 <= 1) {
			super.anInt4901 = 2;
		} else {
			super.anInt4901 = 4;
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
	public void method4269() {
		this.method4279(true);
		super.aBoolean318 = true;
		super.aBoolean331 = true;
		super.aBoolean322 = true;
		super.aBoolean323 = true;
		super.aBoolean327 = true;
		super.aBoolean321 = true;
		super.aBoolean328 = true;
		super.aBoolean315 = true;
		super.anInt4892 = 1;
		super.aBoolean319 = true;
		super.aBoolean320 = true;
		super.anInt4910 = super.anInt4895 = 2;
		super.anInt4907 = super.anInt4890 = 0;
		super.aBoolean317 = true;
		if (Static318.anInt6040 > 95) {
			Static438.method2402(2);
		} else {
			Static438.method2402(0);
		}
		super.anInt4905 = 0;
		super.aBoolean330 = false;
		super.aBoolean325 = true;
		this.method4268();
		super.anInt4903 = 4;
		Static418.method6218();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I")
	public int method4270() {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Static283.anInt5580 != 3 && Static283.anInt5580 != 2) {
			if (Static283.aString53.startsWith("win")) {
				if (!Static283.aString51.startsWith("amd64") && !Static283.aString51.startsWith("x86_64")) {
					local5 = true;
				}
				local9 = true;
				local7 = true;
			} else {
				local7 = true;
			}
		}
		if (this.aBoolean335) {
			local7 = false;
		}
		if (this.aBoolean337) {
			local9 = false;
		}
		if (this.aBoolean334) {
			local5 = false;
		}
		if (!local5 && !local7 && !local9) {
			return this.method4276();
		}
		@Pc(63) int local63 = -1;
		@Pc(65) int local65 = -1;
		if (local5) {
			try {
				local63 = Static410.method6138(2, 1000);
			} catch (@Pc(74) Exception local74) {
			}
		}
		@Pc(77) int local77 = -1;
		if (local9) {
			try {
				local77 = Static410.method6138(3, 1000);
				if (Static526.anInt8926 == 3) {
					@Pc(90) Class49 local90 = Static478.aClass9_10.method7626();
					@Pc(95) long local95 = local90.aLong47 & 0xFFFFFFFFFFFFL;
					@Pc(98) int local98 = local90.anInt1928;
					if (local98 == 4318) {
						local7 &= local95 >= 64425238954L;
					} else if (local98 == 4098) {
						local7 &= local95 >= 60129613779L;
					}
				}
			} catch (@Pc(130) Exception local130) {
			}
		}
		if (local7) {
			try {
				local65 = Static410.method6138(1, 1000);
			} catch (@Pc(148) Exception local148) {
			}
		}
		if (local63 == -1 && local65 == -1 && local77 == -1) {
			return this.method4276();
		} else if (local77 < local63 && local65 < local63) {
			return this.method4273(local63);
		} else if (local65 >= local77) {
			return this.method4267(1, local65);
		} else {
			return this.method4267(3, local77);
		}
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(II)I")
	public int method4271(@OriginalArg(0) int arg0) {
		if (this.aBoolean336) {
			return 0;
		} else if (this.method4266(arg0)) {
			return super.aBoolean328 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
	public void method4272() {
		this.method4279(false);
		super.aBoolean331 = false;
		super.aBoolean318 = false;
		super.aBoolean322 = false;
		super.aBoolean315 = false;
		super.aBoolean317 = false;
		super.aBoolean328 = false;
		super.aBoolean320 = false;
		super.anInt4892 = 0;
		super.aBoolean321 = false;
		super.aBoolean327 = false;
		super.anInt4907 = super.anInt4890 = 0;
		super.aBoolean319 = false;
		super.anInt4910 = super.anInt4895 = 0;
		super.aBoolean323 = false;
		Static438.method2402(0);
		super.aBoolean325 = false;
		super.anInt4905 = 0;
		super.aBoolean330 = false;
		this.method4268();
		super.anInt4903 = 1;
		Static418.method6218();
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(II)I")
	private int method4273(@OriginalArg(0) int arg0) {
		@Pc(13) byte local13;
		if (arg0 > 12000) {
			this.method4269();
			local13 = 4;
		} else if (arg0 > 5000) {
			this.method4265();
			local13 = 3;
		} else if (arg0 > 2000) {
			local13 = 2;
			this.method4278();
		} else {
			local13 = 1;
			this.method4272();
		}
		if (Static526.anInt8926 != 2) {
			super.anInt4912 = 2;
			Static508.method7307(2);
		}
		this.method4274(Static91.aClass182_2);
		return local13;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!lp;B)V")
	public void method4274(@OriginalArg(0) Class182 arg0) {
		@Pc(5) Class116 local5 = null;
		try {
			@Pc(11) Class243 local11 = arg0.method4814("", true);
			while (local11.anInt6905 == 0) {
				Static505.method7295(1L);
			}
			if (local11.anInt6905 == 1) {
				local5 = (Class116) local11.anObject12;
				@Pc(34) Class1_Sub13 local34 = new Class1_Sub13(Static81.method2029());
				this.method4263(local34);
				local5.method3368(local34.aByteArray45, local34.anInt3400, 0);
			}
		} catch (@Pc(48) Exception local48) {
		}
		try {
			if (local5 != null) {
				local5.method3371();
			}
		} catch (@Pc(63) Exception local63) {
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Z")
	public boolean method4275(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean329 : true;
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)I")
	private int method4276() {
		@Pc(25) byte local25;
		if (Static318.anInt6040 >= 96) {
			@Pc(15) int local15 = Static468.method6833();
			if (local15 <= 100) {
				local25 = 4;
				this.method4269();
			} else if (local15 <= 500) {
				local25 = 3;
				this.method4265();
			} else if (local15 > 1000) {
				this.method4272();
				local25 = 1;
			} else {
				local25 = 2;
				this.method4278();
			}
		} else {
			local25 = 1;
			this.method4272();
		}
		if (Static526.anInt8926 != 0) {
			super.anInt4912 = 0;
			Static508.method7307(0);
		}
		this.method4274(Static91.aClass182_2);
		return local25;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	public void method4278() {
		this.method4279(true);
		super.aBoolean320 = false;
		super.anInt4907 = super.anInt4890 = 0;
		super.anInt4892 = 0;
		super.aBoolean318 = false;
		super.aBoolean323 = false;
		super.aBoolean321 = false;
		super.aBoolean331 = false;
		super.aBoolean322 = false;
		super.anInt4910 = super.anInt4895 = 0;
		super.aBoolean317 = false;
		super.aBoolean315 = false;
		super.aBoolean319 = true;
		super.aBoolean327 = false;
		super.aBoolean328 = false;
		Static438.method2402(0);
		super.aBoolean325 = true;
		super.aBoolean330 = false;
		super.anInt4905 = 0;
		this.method4268();
		super.anInt4903 = 2;
		Static418.method6218();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZ)V")
	public void method4279(@OriginalArg(1) boolean arg0) {
		super.aBoolean329 = arg0;
		if (Static365.aClass194_6 != null) {
			Static365.aClass194_6.method5077(!this.method4266(Static526.anInt8926));
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!gw;Z)V")
	private void method4280(@OriginalArg(0) Class1_Sub13 arg0) {
		if (arg0.aByteArray45.length - arg0.anInt3400 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method3043();
		if (local20 < 0 || local20 > 18) {
			return;
		}
		@Pc(36) byte local36;
		if (local20 == 18) {
			local36 = 41;
		} else if (local20 == 17) {
			local36 = 40;
		} else if (local20 == 16) {
			local36 = 38;
		} else if (local20 == 15) {
			local36 = 37;
		} else if (local20 == 14) {
			local36 = 36;
		} else if (local20 == 13) {
			local36 = 35;
		} else if (local20 == 12) {
			local36 = 34;
		} else if (local20 == 11) {
			local36 = 33;
		} else if (local20 == 10) {
			local36 = 32;
		} else if (local20 == 9) {
			local36 = 31;
		} else if (local20 == 8) {
			local36 = 30;
		} else if (local20 == 7) {
			local36 = 29;
		} else if (local20 == 6) {
			local36 = 28;
		} else if (local20 == 5) {
			local36 = 28;
		} else if (local20 == 4) {
			local36 = 24;
		} else if (local20 == 3) {
			local36 = 23;
		} else if (local20 == 2) {
			local36 = 22;
		} else if (local20 == 1) {
			local36 = 23;
		} else {
			local36 = 19;
		}
		if (local36 > arg0.aByteArray45.length - arg0.anInt3400) {
			return;
		}
		super.anInt4908 = arg0.method3043();
		if (super.anInt4908 < 1) {
			super.anInt4908 = 1;
		} else if (super.anInt4908 > 4) {
			super.anInt4908 = 4;
		}
		this.method4279(arg0.method3043() == 1);
		super.aBoolean328 = arg0.method3043() == 1;
		super.aBoolean319 = arg0.method3043() == 1;
		super.aBoolean317 = arg0.method3043() == 1;
		super.anInt4892 = arg0.method3043() == 1 ? 1 : 0;
		super.aBoolean318 = arg0.method3043() == 1;
		super.aBoolean322 = arg0.method3043() == 1;
		super.aBoolean331 = arg0.method3043() == 1;
		super.anInt4910 = arg0.method3043();
		if (super.anInt4910 > 2) {
			super.anInt4910 = 2;
		}
		if (local20 >= 17) {
			super.anInt4895 = arg0.method3043();
		}
		if (local20 < 2) {
			super.aBoolean321 = arg0.method3043() == 1;
			arg0.method3043();
		} else {
			super.aBoolean321 = arg0.method3043() == 1;
			if (local20 >= 17) {
				super.aBoolean327 = arg0.method3043() == 1;
			}
		}
		super.aBoolean315 = arg0.method3043() == 1;
		super.aBoolean320 = arg0.method3043() == 1;
		super.anInt4907 = arg0.method3043();
		if (super.anInt4907 > 2) {
			super.anInt4907 = 2;
		}
		super.anInt4890 = super.anInt4907;
		super.aBoolean332 = arg0.method3043() == 1;
		super.anInt4894 = arg0.method3043();
		if (super.anInt4894 > 127) {
			super.anInt4894 = 127;
		}
		super.anInt4899 = arg0.method3043();
		super.anInt4913 = arg0.method3043();
		if (super.anInt4913 > 127) {
			super.anInt4913 = 127;
		}
		if (local20 >= 1) {
			super.anInt4893 = arg0.method3056();
			super.anInt4909 = arg0.method3056();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method3043();
		}
		@Pc(492) int local492;
		if (local20 >= 4) {
			local492 = arg0.method3043();
			if (local492 < 0 || local492 > 2) {
				local492 = 0;
			}
			if (Static318.anInt6040 < 96) {
				local492 = 0;
			}
			Static438.method2402(local492);
		}
		if (local20 >= 5) {
			super.anInt4911 = arg0.method3037();
		}
		local492 = 0;
		if (local20 >= 6) {
			super.anInt4904 = local492 = arg0.method3043();
		}
		if (super.anInt4904 != 1 && super.anInt4904 != 2) {
			super.anInt4904 = 2;
		}
		if (local20 >= 7) {
			super.aBoolean326 = arg0.method3043() == 1;
		}
		if (local20 >= 8) {
			super.aBoolean324 = arg0.method3043() == 1;
		}
		if (local20 >= 9) {
			super.anInt4905 = arg0.method3043();
		}
		if (super.anInt4905 < 0 || super.anInt4905 > Static309.method5133(Static318.anInt6040)) {
			super.anInt4905 = 0;
		}
		if (local20 >= 10) {
			super.aBoolean330 = arg0.method3043() != 0;
		}
		if (local20 >= 11) {
			super.aBoolean316 = arg0.method3043() != 0;
		}
		if (local20 >= 12) {
			super.anInt4892 = arg0.method3043();
		}
		if (super.anInt4892 < 0 || super.anInt4892 > 2) {
			super.anInt4892 = 1;
		}
		if (local20 >= 13) {
			super.aBoolean325 = arg0.method3043() == 1;
		}
		if (local20 >= 14) {
			super.anInt4912 = arg0.method3043();
		} else if (local492 == 0) {
			super.anInt4912 = 2;
		} else {
			super.anInt4912 = 1;
		}
		if (super.anInt4912 < 0 || super.anInt4912 > 5) {
			super.anInt4912 = 2;
		}
		if (local20 >= 15) {
			super.anInt4901 = arg0.method3043();
			if (super.anInt4901 < 0 || super.anInt4901 > 4) {
				super.anInt4901 = Static74.anInt2041 == 1 ? 2 : 4;
			}
		}
		if (local20 >= 16) {
			super.aBoolean323 = arg0.method3043() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean323 = false;
				}
			} catch (@Pc(744) Throwable local744) {
			}
		}
		if (local20 < 17 && super.anInt4912 == 0) {
			super.anInt4912 = 2;
		}
		if (local20 < 18) {
			return;
		}
		super.anInt4903 = arg0.method3043();
		if (super.anInt4903 < 0 || super.anInt4903 > 4) {
			super.anInt4903 = 0;
		}
		if (super.anInt4903 == 2) {
			super.aBoolean319 = true;
			return;
		}
	}
}
