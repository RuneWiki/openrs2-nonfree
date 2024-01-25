import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class2_Sub19_Sub1 extends Class2_Sub19 {

	@OriginalMember(owner = "client!en", name = "Fb", descriptor = "I")
	public int anInt2225;

	@OriginalMember(owner = "client!en", name = "gb", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!en", name = "pb", descriptor = "Z")
	public boolean aBoolean200 = false;

	@OriginalMember(owner = "client!en", name = "xb", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!en", name = "Ab", descriptor = "Z")
	public boolean aBoolean203 = false;

	@OriginalMember(owner = "client!en", name = "yb", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!uf;)V")
	public Class2_Sub19_Sub1(@OriginalArg(0) Class283 arg0) {
		super.anInt2194 = 3;
		super.anInt2195 = 3;
		this.method2142(true);
		super.aBoolean180 = false;
		super.aBoolean181 = true;
		super.anInt2192 = 0;
		super.aBoolean182 = true;
		super.aBoolean193 = true;
		super.anInt2191 = 1;
		super.aBoolean184 = true;
		super.anInt2193 = 2;
		super.aBoolean187 = true;
		super.aBoolean188 = true;
		super.anInt2202 = 127;
		super.anInt2181 = 0;
		super.aBoolean195 = true;
		super.aBoolean194 = true;
		super.aBoolean183 = true;
		super.anInt2190 = 127;
		super.anInt2182 = 0;
		super.anInt2201 = 0;
		super.anInt2187 = 127;
		super.aBoolean189 = true;
		super.anInt2197 = 0;
		if (Static78.anInt1651 < 96) {
			Static250.method3960(0);
		} else {
			Static250.method3960(2);
		}
		super.aBoolean197 = false;
		super.aBoolean192 = false;
		super.anInt2196 = 0;
		super.anInt2183 = Static423.anInt7844 == 1 ? 2 : 4;
		super.anInt2180 = 2;
		super.anInt2189 = 0;
		super.aBoolean190 = true;
		super.aBoolean191 = true;
		super.aBoolean196 = false;
		super.anInt2198 = 2;
		@Pc(141) Class133 local141 = null;
		try {
			@Pc(147) Class20 local147 = arg0.method7180("", true);
			while (local147.anInt593 == 0) {
				Static379.method5233(1L);
			}
			if (local147.anInt593 == 1) {
				local141 = (Class133) local147.anObject2;
				@Pc(169) byte[] local169 = new byte[(int) local141.method3311()];
				@Pc(183) int local183;
				for (@Pc(171) int local171 = 0; local171 < local169.length; local171 += local183) {
					local183 = local141.method3309(local169.length - local171, local169, local171);
					if (local183 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method2161(new Class2_Sub29(local169));
			}
		} catch (@Pc(208) Exception local208) {
		}
		try {
			if (local141 != null) {
				local141.method3306();
			}
		} catch (@Pc(215) Exception local215) {
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public void method2141() {
		this.method2142(true);
		super.aBoolean182 = true;
		super.anInt2191 = 1;
		super.aBoolean181 = true;
		super.aBoolean194 = true;
		super.aBoolean189 = true;
		super.aBoolean183 = true;
		super.aBoolean193 = true;
		super.aBoolean184 = true;
		super.anInt2193 = super.anInt2197 = 2;
		super.aBoolean179 = true;
		super.aBoolean180 = true;
		super.anInt2181 = super.anInt2192 = 0;
		super.aBoolean187 = true;
		super.aBoolean188 = true;
		if (Static78.anInt1651 <= 95) {
			Static250.method3960(0);
		} else {
			Static250.method3960(2);
		}
		super.aBoolean192 = false;
		super.anInt2189 = 0;
		super.aBoolean191 = true;
		this.method2152();
		super.anInt2195 = 4;
		Static436.method6681();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(ZI)V")
	public void method2142(@OriginalArg(0) boolean arg0) {
		super.aBoolean186 = arg0;
		if (Static505.aClass206_4 != null) {
			Static505.aClass206_4.method5329(!this.method2159(Static266.anInt4923));
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	public void method2144() {
		this.method2142(true);
		super.aBoolean187 = false;
		super.aBoolean183 = true;
		super.aBoolean180 = false;
		super.aBoolean189 = false;
		super.anInt2193 = super.anInt2197 = 0;
		super.anInt2181 = super.anInt2192 = 0;
		super.aBoolean194 = false;
		super.aBoolean188 = false;
		super.aBoolean182 = false;
		super.aBoolean181 = false;
		super.anInt2191 = 0;
		super.aBoolean193 = false;
		super.aBoolean184 = false;
		super.aBoolean179 = false;
		Static250.method3960(0);
		super.aBoolean191 = true;
		super.anInt2189 = 0;
		super.aBoolean192 = false;
		this.method2152();
		super.anInt2195 = 2;
		Static436.method6681();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!uf;I)V")
	public void method2145(@OriginalArg(0) Class283 arg0) {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(13) Class20 local13 = arg0.method7180("", true);
			while (local13.anInt593 == 0) {
				Static379.method5233(1L);
			}
			if (local13.anInt593 == 1) {
				local7 = (Class133) local13.anObject2;
				@Pc(35) Class2_Sub29 local35 = new Class2_Sub29(Static26.method600());
				this.method2139(local35);
				local7.method3307(0, local35.anInt6132, local35.aByteArray96);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local7 != null) {
				local7.method3306();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I")
	private int method2146(@OriginalArg(1) int arg0) {
		@Pc(23) byte local23;
		if (arg0 > 12000) {
			local23 = 4;
			this.method2141();
		} else if (arg0 > 5000) {
			local23 = 3;
			this.method2148();
		} else if (arg0 > 2000) {
			this.method2144();
			local23 = 2;
		} else {
			local23 = 1;
			this.method2150();
		}
		if (Static266.anInt4923 != 2) {
			super.anInt2180 = 2;
			Static233.method6719(2);
		}
		this.method2145(Static531.aClass283_6);
		return local23;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
	public void method2148() {
		this.method2142(true);
		super.anInt2191 = 1;
		super.anInt2193 = super.anInt2197 = 1;
		super.aBoolean193 = true;
		super.aBoolean194 = false;
		super.aBoolean183 = true;
		super.aBoolean187 = true;
		super.aBoolean182 = true;
		super.anInt2181 = super.anInt2192 = 0;
		super.aBoolean179 = true;
		super.aBoolean180 = false;
		super.aBoolean184 = true;
		super.aBoolean181 = true;
		super.aBoolean188 = true;
		super.aBoolean189 = true;
		if (Static78.anInt1651 > 95) {
			Static250.method3960(1);
		} else {
			Static250.method3960(0);
		}
		super.anInt2189 = 0;
		super.aBoolean192 = false;
		super.aBoolean191 = true;
		this.method2152();
		super.anInt2195 = 3;
		Static436.method6681();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)I")
	public int method2149() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static482.anInt8574 != 3 && Static482.anInt8574 != 2) {
			if (Static482.aString187.startsWith("win")) {
				local11 = true;
				local9 = true;
				if (!Static482.aString182.startsWith("amd64") && !Static482.aString182.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean200) {
			local9 = false;
		}
		if (this.aBoolean201) {
			local11 = false;
		}
		if (this.aBoolean202) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method2151();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		if (local7) {
			try {
				local66 = Static507.method2596(1000, 2);
			} catch (@Pc(77) Exception local77) {
			}
		}
		@Pc(85) int local85 = -1;
		if (local11) {
			try {
				local85 = Static507.method2596(1000, 3);
				if (Static266.anInt4923 == 3) {
					@Pc(100) Class254 local100 = Static103.aClass39_3.method6009();
					@Pc(105) long local105 = local100.aLong186 & 0xFFFFFFFFFFFFL;
					@Pc(108) int local108 = local100.anInt7849;
					if (local108 == 4318) {
						local9 &= local105 >= 64425238954L;
					} else if (local108 == 4098) {
						local9 &= local105 >= 60129613779L;
					}
				}
			} catch (@Pc(142) Exception local142) {
			}
		}
		if (local9) {
			try {
				local68 = Static507.method2596(1000, 1);
			} catch (@Pc(152) Exception local152) {
			}
		}
		if (local66 == -1 && local68 == -1 && local85 == -1) {
			return this.method2151();
		} else if (local85 < local66 && local68 < local66) {
			return this.method2146(local66);
		} else if (local85 <= local68) {
			return this.method2153(1, local68);
		} else {
			return this.method2153(3, local85);
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	public void method2150() {
		this.method2142(false);
		super.aBoolean188 = false;
		super.aBoolean194 = false;
		super.anInt2191 = 0;
		super.anInt2181 = super.anInt2192 = 0;
		super.aBoolean182 = false;
		super.aBoolean181 = false;
		super.aBoolean193 = false;
		super.aBoolean183 = false;
		super.aBoolean189 = false;
		super.aBoolean179 = false;
		super.aBoolean180 = false;
		super.aBoolean187 = false;
		super.anInt2193 = super.anInt2197 = 0;
		super.aBoolean184 = false;
		Static250.method3960(0);
		super.anInt2189 = 0;
		super.aBoolean192 = false;
		super.aBoolean191 = false;
		this.method2152();
		super.anInt2195 = 1;
		Static436.method6681();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)I")
	private int method2151() {
		@Pc(27) byte local27;
		if (Static78.anInt1651 >= 96) {
			@Pc(11) int local11 = Static222.method1471();
			if (local11 <= 100) {
				this.method2141();
				local27 = 4;
			} else if (local11 <= 500) {
				local27 = 3;
				this.method2148();
			} else if (local11 <= 1000) {
				this.method2144();
				local27 = 2;
			} else {
				local27 = 1;
				this.method2150();
			}
		} else {
			this.method2150();
			local27 = 1;
		}
		if (Static266.anInt4923 != 0) {
			super.anInt2180 = 0;
			Static233.method6719(0);
		}
		this.method2145(Static531.aClass283_6);
		return local27;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V")
	private void method2152() {
		if (Static423.anInt7844 <= 1) {
			super.anInt2183 = 2;
		} else {
			super.anInt2183 = 4;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(III)I")
	private int method2153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte local18;
		if (arg1 > 20000) {
			this.method2141();
			local18 = 4;
		} else if (arg1 > 10000) {
			local18 = 3;
			this.method2148();
		} else if (arg1 > 5000) {
			this.method2144();
			local18 = 2;
		} else {
			local18 = 1;
			this.method2150();
		}
		if (arg0 != Static266.anInt4923) {
			super.anInt2180 = arg0;
			Static233.method6719(arg0);
		}
		this.method2145(Static531.aClass283_6);
		return local18;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(ZI)Z")
	public boolean method2155(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean186 : true;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(II)Z")
	public boolean method2159(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean199 ? super.aBoolean186 : true;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(II)I")
	public int method2160(@OriginalArg(0) int arg0) {
		if (this.aBoolean203) {
			return 0;
		} else if (this.method2159(arg0)) {
			return super.aBoolean193 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ps;I)V")
	private void method2161(@OriginalArg(0) Class2_Sub29 arg0) {
		if (arg0.aByteArray96.length - arg0.anInt6132 < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method5170();
		if (local18 < 0 || local18 > 18) {
			return;
		}
		@Pc(34) byte local34;
		if (local18 == 18) {
			local34 = 41;
		} else if (local18 == 17) {
			local34 = 40;
		} else if (local18 == 16) {
			local34 = 38;
		} else if (local18 == 15) {
			local34 = 37;
		} else if (local18 == 14) {
			local34 = 36;
		} else if (local18 == 13) {
			local34 = 35;
		} else if (local18 == 12) {
			local34 = 34;
		} else if (local18 == 11) {
			local34 = 33;
		} else if (local18 == 10) {
			local34 = 32;
		} else if (local18 == 9) {
			local34 = 31;
		} else if (local18 == 8) {
			local34 = 30;
		} else if (local18 == 7) {
			local34 = 29;
		} else if (local18 == 6) {
			local34 = 28;
		} else if (local18 == 5) {
			local34 = 28;
		} else if (local18 == 4) {
			local34 = 24;
		} else if (local18 == 3) {
			local34 = 23;
		} else if (local18 == 2) {
			local34 = 22;
		} else if (local18 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (arg0.aByteArray96.length - arg0.anInt6132 < local34) {
			return;
		}
		super.anInt2194 = arg0.method5170();
		if (super.anInt2194 < 1) {
			super.anInt2194 = 1;
		} else if (super.anInt2194 > 4) {
			super.anInt2194 = 4;
		}
		this.method2142(arg0.method5170() == 1);
		super.aBoolean193 = arg0.method5170() == 1;
		super.aBoolean183 = arg0.method5170() == 1;
		super.aBoolean182 = arg0.method5170() == 1;
		super.anInt2191 = arg0.method5170() == 1 ? 1 : 0;
		super.aBoolean187 = arg0.method5170() == 1;
		super.aBoolean189 = arg0.method5170() == 1;
		super.aBoolean188 = arg0.method5170() == 1;
		super.anInt2193 = arg0.method5170();
		if (super.anInt2193 > 2) {
			super.anInt2193 = 2;
		}
		if (local18 >= 17) {
			super.anInt2197 = arg0.method5170();
		}
		if (local18 >= 2) {
			super.aBoolean184 = arg0.method5170() == 1;
			if (local18 >= 17) {
				super.aBoolean180 = arg0.method5170() == 1;
			}
		} else {
			super.aBoolean184 = arg0.method5170() == 1;
			arg0.method5170();
		}
		super.aBoolean194 = arg0.method5170() == 1;
		super.aBoolean181 = arg0.method5170() == 1;
		super.anInt2181 = arg0.method5170();
		if (super.anInt2181 > 2) {
			super.anInt2181 = 2;
		}
		super.anInt2192 = super.anInt2181;
		super.aBoolean195 = arg0.method5170() == 1;
		super.anInt2187 = arg0.method5170();
		if (super.anInt2187 > 127) {
			super.anInt2187 = 127;
		}
		super.anInt2190 = arg0.method5170();
		super.anInt2202 = arg0.method5170();
		if (super.anInt2202 > 127) {
			super.anInt2202 = 127;
		}
		if (local18 >= 1) {
			super.anInt2182 = arg0.method5229();
			super.anInt2201 = arg0.method5229();
		}
		if (local18 >= 3 && local18 < 6) {
			arg0.method5170();
		}
		@Pc(493) int local493;
		if (local18 >= 4) {
			local493 = arg0.method5170();
			if (local493 < 0 || local493 > 2) {
				local493 = 0;
			}
			if (Static78.anInt1651 < 96) {
				local493 = 0;
			}
			Static250.method3960(local493);
		}
		if (local18 >= 5) {
			super.anInt2196 = arg0.method5198();
		}
		local493 = 0;
		if (local18 >= 6) {
			super.anInt2198 = local493 = arg0.method5170();
		}
		if (super.anInt2198 != 1 && super.anInt2198 != 2) {
			super.anInt2198 = 2;
		}
		if (local18 >= 7) {
			super.aBoolean197 = arg0.method5170() == 1;
		}
		if (local18 >= 8) {
			super.aBoolean196 = arg0.method5170() == 1;
		}
		if (local18 >= 9) {
			super.anInt2189 = arg0.method5170();
		}
		if (super.anInt2189 < 0 || super.anInt2189 > Static58.method1074(Static78.anInt1651)) {
			super.anInt2189 = 0;
		}
		if (local18 >= 10) {
			super.aBoolean192 = arg0.method5170() != 0;
		}
		if (local18 >= 11) {
			super.aBoolean190 = arg0.method5170() != 0;
		}
		if (local18 >= 12) {
			super.anInt2191 = arg0.method5170();
		}
		if (super.anInt2191 < 0 || super.anInt2191 > 2) {
			super.anInt2191 = 1;
		}
		if (local18 >= 13) {
			super.aBoolean191 = arg0.method5170() == 1;
		}
		if (local18 >= 14) {
			super.anInt2180 = arg0.method5170();
		} else if (local493 == 0) {
			super.anInt2180 = 2;
		} else {
			super.anInt2180 = 1;
		}
		if (super.anInt2180 < 0 || super.anInt2180 > 5) {
			super.anInt2180 = 2;
		}
		if (local18 >= 15) {
			super.anInt2183 = arg0.method5170();
			if (super.anInt2183 < 0 || super.anInt2183 > 4) {
				super.anInt2183 = Static423.anInt7844 == 1 ? 2 : 4;
			}
		}
		if (local18 >= 16) {
			super.aBoolean179 = arg0.method5170() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean179 = false;
				}
			} catch (@Pc(763) Throwable local763) {
			}
		}
		if (local18 < 17 && super.anInt2180 == 0) {
			super.anInt2180 = 2;
		}
		if (local18 < 18) {
			return;
		}
		super.anInt2195 = arg0.method5170();
		if (super.anInt2195 < 0 || super.anInt2195 > 4) {
			super.anInt2195 = 0;
		}
		if (super.anInt2195 == 2) {
			super.aBoolean183 = true;
			return;
		}
	}
}
