import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!ft", name = "S", descriptor = "Z")
	public boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ft", name = "eb", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!dq;)V")
	public Class79_Sub1(@OriginalArg(0) Class51 arg0) {
		super.anInt2153 = 3;
		this.method1952(true);
		super.anInt2152 = 1;
		super.aBoolean158 = true;
		super.aBoolean152 = true;
		super.aBoolean159 = true;
		super.anInt2162 = 0;
		super.aBoolean154 = true;
		super.anInt2147 = 127;
		super.anInt2163 = 127;
		super.anInt2148 = 0;
		super.aBoolean155 = true;
		super.anInt2145 = 0;
		super.aBoolean153 = false;
		super.aBoolean151 = true;
		super.anInt2157 = 0;
		super.aBoolean147 = true;
		super.anInt2155 = 2;
		super.anInt2158 = 127;
		super.aBoolean162 = true;
		super.anInt2146 = 0;
		super.aBoolean157 = true;
		super.aBoolean156 = true;
		if (Static61.anInt1155 < 96) {
			Static377.method5243(0);
		} else {
			Static377.method5243(2);
		}
		super.aBoolean150 = true;
		super.anInt2161 = 2;
		super.anInt2159 = 0;
		super.anInt2151 = 0;
		super.aBoolean160 = false;
		super.aBoolean149 = true;
		super.anInt2156 = Static358.anInt6108 == 1 ? 2 : 4;
		super.aBoolean148 = false;
		super.aBoolean146 = false;
		super.anInt2150 = 2;
		@Pc(127) Class220 local127 = null;
		try {
			@Pc(133) Class181 local133 = arg0.method1359(true, "");
			while (local133.anInt5298 == 0) {
				Static83.method1499(1L);
			}
			if (local133.anInt5298 == 1) {
				local127 = (Class220) local133.anObject7;
				@Pc(155) byte[] local155 = new byte[(int) local127.method5189()];
				@Pc(170) int local170;
				for (@Pc(157) int local157 = 0; local157 < local155.length; local157 += local170) {
					local170 = local127.method5186(local155.length - local157, local157, local155);
					if (local170 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method1946(new Class3_Sub25(local155));
			}
		} catch (@Pc(200) Exception local200) {
		}
		try {
			if (local127 != null) {
				local127.method5190();
			}
		} catch (@Pc(207) Exception local207) {
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!nj;I)V")
	private void method1946(@OriginalArg(0) Class3_Sub25 arg0) {
		if (arg0.aByteArray88.length - arg0.anInt4974 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method4096();
		if (local20 < 0 || local20 > 17) {
			return;
		}
		@Pc(35) byte local35;
		if (local20 == 17) {
			local35 = 40;
		} else if (local20 == 16) {
			local35 = 38;
		} else if (local20 == 15) {
			local35 = 37;
		} else if (local20 == 14) {
			local35 = 36;
		} else if (local20 == 13) {
			local35 = 35;
		} else if (local20 == 12) {
			local35 = 34;
		} else if (local20 == 11) {
			local35 = 33;
		} else if (local20 == 10) {
			local35 = 32;
		} else if (local20 == 9) {
			local35 = 31;
		} else if (local20 == 8) {
			local35 = 30;
		} else if (local20 == 7) {
			local35 = 29;
		} else if (local20 == 6) {
			local35 = 28;
		} else if (local20 == 5) {
			local35 = 28;
		} else if (local20 == 4) {
			local35 = 24;
		} else if (local20 == 3) {
			local35 = 23;
		} else if (local20 == 2) {
			local35 = 22;
		} else if (local20 == 1) {
			local35 = 23;
		} else {
			local35 = 19;
		}
		if (local35 > arg0.aByteArray88.length - arg0.anInt4974) {
			return;
		}
		super.anInt2153 = arg0.method4096();
		if (super.anInt2153 < 1) {
			super.anInt2153 = 1;
		} else if (super.anInt2153 > 4) {
			super.anInt2153 = 4;
		}
		this.method1952(arg0.method4096() == 1);
		super.aBoolean157 = arg0.method4096() == 1;
		super.aBoolean152 = arg0.method4096() == 1;
		super.aBoolean155 = arg0.method4096() == 1;
		super.anInt2152 = arg0.method4096() == 1 ? 1 : 0;
		super.aBoolean162 = arg0.method4096() == 1;
		super.aBoolean154 = arg0.method4096() == 1;
		super.aBoolean151 = arg0.method4096() == 1;
		super.anInt2155 = arg0.method4096();
		if (super.anInt2155 > 2) {
			super.anInt2155 = 2;
		}
		if (local20 >= 17) {
			super.anInt2162 = arg0.method4096();
		}
		if (local20 < 2) {
			super.aBoolean158 = arg0.method4096() == 1;
			arg0.method4096();
		} else {
			super.aBoolean158 = arg0.method4096() == 1;
			if (local20 >= 17) {
				super.aBoolean153 = arg0.method4096() == 1;
			}
		}
		super.aBoolean156 = arg0.method4096() == 1;
		super.aBoolean159 = arg0.method4096() == 1;
		super.anInt2157 = arg0.method4096();
		if (super.anInt2157 > 2) {
			super.anInt2157 = 2;
		}
		super.anInt2145 = super.anInt2157;
		super.aBoolean147 = arg0.method4096() == 1;
		super.anInt2158 = arg0.method4096();
		if (super.anInt2158 > 127) {
			super.anInt2158 = 127;
		}
		super.anInt2147 = arg0.method4096();
		super.anInt2163 = arg0.method4096();
		if (super.anInt2163 > 127) {
			super.anInt2163 = 127;
		}
		if (local20 >= 1) {
			super.anInt2148 = arg0.method4083();
			super.anInt2146 = arg0.method4083();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method4096();
		}
		@Pc(483) int local483;
		if (local20 >= 4) {
			local483 = arg0.method4096();
			if (local483 < 0 || local483 > 2) {
				local483 = 0;
			}
			if (Static61.anInt1155 < 96) {
				local483 = 0;
			}
			Static377.method5243(local483);
		}
		if (local20 >= 5) {
			super.anInt2151 = arg0.method4108();
		}
		local483 = 0;
		if (local20 >= 6) {
			super.anInt2150 = local483 = arg0.method4096();
		}
		if (super.anInt2150 != 1 && super.anInt2150 != 2) {
			super.anInt2150 = 2;
		}
		if (local20 >= 7) {
			super.aBoolean146 = arg0.method4096() == 1;
		}
		if (local20 >= 8) {
			super.aBoolean160 = arg0.method4096() == 1;
		}
		if (local20 >= 9) {
			super.anInt2159 = arg0.method4096();
		}
		if (super.anInt2159 < 0 || super.anInt2159 > Static141.method2175(Static61.anInt1155)) {
			super.anInt2159 = 0;
		}
		if (local20 >= 10) {
			super.aBoolean148 = arg0.method4096() != 0;
		}
		if (local20 >= 11) {
			super.aBoolean150 = arg0.method4096() != 0;
		}
		if (local20 >= 12) {
			super.anInt2152 = arg0.method4096();
		}
		if (super.anInt2152 < 0 || super.anInt2152 > 2) {
			super.anInt2152 = 1;
		}
		if (local20 >= 13) {
			super.aBoolean149 = arg0.method4096() == 1;
		}
		if (local20 >= 14) {
			super.anInt2161 = arg0.method4096();
		} else if (local483 == 0) {
			super.anInt2161 = 2;
		} else {
			super.anInt2161 = 1;
		}
		if (super.anInt2161 < 0 || super.anInt2161 > 3) {
			super.anInt2161 = 2;
		}
		if (local20 >= 15) {
			super.anInt2156 = arg0.method4096();
			if (super.anInt2156 < 0 || super.anInt2156 > 4) {
				super.anInt2156 = Static358.anInt6108 == 1 ? 2 : 4;
			}
		}
		if (local20 >= 16) {
			super.aBoolean161 = arg0.method4096() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean161 = false;
				}
			} catch (@Pc(750) Throwable local750) {
			}
		}
		if (local20 < 17 && super.anInt2161 == 0) {
			super.anInt2161 = 2;
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Lclient!nj;")
	public Class3_Sub25 method1947() {
		@Pc(8) Class3_Sub25 local8 = new Class3_Sub25(41);
		local8.method4081(17);
		local8.method4081(super.anInt2153);
		local8.method4081(super.aBoolean145 ? 1 : 0);
		local8.method4081(super.aBoolean157 ? 1 : 0);
		local8.method4081(super.aBoolean152 ? 1 : 0);
		local8.method4081(super.aBoolean155 ? 1 : 0);
		local8.method4081(0);
		local8.method4081(super.aBoolean162 ? 1 : 0);
		local8.method4081(super.aBoolean154 ? 1 : 0);
		local8.method4081(super.aBoolean151 ? 1 : 0);
		local8.method4081(super.anInt2155);
		local8.method4081(super.anInt2162);
		local8.method4081(super.aBoolean158 ? 1 : 0);
		local8.method4081(super.aBoolean153 ? 1 : 0);
		local8.method4081(super.aBoolean156 ? 1 : 0);
		local8.method4081(super.aBoolean159 ? 1 : 0);
		local8.method4081(super.anInt2157);
		local8.method4081(super.aBoolean147 ? 1 : 0);
		local8.method4081(super.anInt2158);
		local8.method4081(super.anInt2147);
		local8.method4081(super.anInt2163);
		local8.method4123(super.anInt2148);
		local8.method4123(super.anInt2146);
		local8.method4081(Static96.method1664());
		local8.method4082(super.anInt2151);
		local8.method4081(super.anInt2150);
		local8.method4081(super.aBoolean146 ? 1 : 0);
		local8.method4081(super.aBoolean160 ? 1 : 0);
		local8.method4081(super.anInt2159);
		local8.method4081(super.aBoolean148 ? 1 : 0);
		local8.method4081(super.aBoolean150 ? 1 : 0);
		local8.method4081(super.anInt2152);
		local8.method4081(super.aBoolean149 ? 1 : 0);
		local8.method4081(super.anInt2161);
		local8.method4081(super.anInt2156);
		local8.method4081(super.aBoolean161 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)Z")
	public boolean method1948(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean163 ? super.aBoolean145 : true;
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(II)I")
	public int method1949(@OriginalArg(0) int arg0) {
		if (this.aBoolean164) {
			return 0;
		} else if (this.method1948(arg0)) {
			return super.aBoolean157 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(II)Z")
	public boolean method1951(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean145 : true;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)V")
	public void method1952(@OriginalArg(0) boolean arg0) {
		super.aBoolean145 = arg0;
		if (Static9.aClass149_1 != null) {
			Static9.aClass149_1.method3568(!this.method1948(Static402.anInt6656));
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!dq;I)V")
	public void method1953(@OriginalArg(0) Class51 arg0) {
		@Pc(7) Class220 local7 = null;
		try {
			@Pc(15) Class181 local15 = arg0.method1359(true, "");
			while (local15.anInt5298 == 0) {
				Static83.method1499(1L);
			}
			if (local15.anInt5298 == 1) {
				local7 = (Class220) local15.anObject7;
				@Pc(35) Class3_Sub25 local35 = this.method1947();
				local7.method5187(local35.anInt4974, 0, local35.aByteArray88);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method5190();
			}
		} catch (@Pc(52) Exception local52) {
		}
	}
}
