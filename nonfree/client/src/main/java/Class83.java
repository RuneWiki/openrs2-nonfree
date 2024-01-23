import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class83 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	private int anInt2265;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	private int anInt2275;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	private int anInt2276;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/lang/String;")
	public String aString130;

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
	public int anInt2280;

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "Ljava/lang/String;")
	public String aString131;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
	private int anInt2285;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
	public int anInt2286;

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
	public int anInt2292;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
	private int anInt2271 = -1;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public int anInt2270 = 0;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	public int anInt2277 = -1;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray15 = new String[5];

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
	public int anInt2284 = -1;

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
	private int anInt2282 = -1;

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	private int anInt2267 = -1;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "I")
	private int anInt2294 = -1;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
	private int anInt2279 = -1;

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
	public int anInt2287 = -1;

	@OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
	public int anInt2291 = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method1807(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4666();
			if (local15 == 0) {
				return;
			}
			this.method1810(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Lclient!fe;")
	public Class56_Sub1 method1809() {
		@Pc(22) Class56_Sub1 local22 = (Class56_Sub1) Static125.aClass26_23.method518((long) (this.anInt2279 | 0x20000));
		if (local22 != null) {
			return local22;
		}
		Static135.aClass58_60.method1359(this.anInt2279);
		local22 = Static269.method3016(Static135.aClass58_60, this.anInt2279);
		if (local22 != null) {
			local22.anInt3412 = local22.anInt3408;
			local22.anInt3404 = 0;
			local22.anInt3410 = local22.anInt3413;
			local22.anInt3405 = 0;
			Static125.aClass26_23.method510(local22, (long) (this.anInt2279 | 0x20000));
		}
		return local22;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!fd;)V")
	private void method1810(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt2277 = arg1.method4653();
		} else if (arg0 == 2) {
			this.anInt2291 = arg1.method4653();
		} else if (arg0 == 3) {
			this.aString131 = arg1.method4630();
		} else if (arg0 == 4) {
			this.anInt2286 = arg1.method4655();
		} else if (arg0 == 5) {
			this.anInt2287 = arg1.method4655();
		} else if (arg0 == 6) {
			this.anInt2270 = arg1.method4666();
		} else {
			@Pc(262) int local262;
			if (arg0 == 7) {
				local262 = arg1.method4666();
				if ((local262 & 0x2) == 2) {
					this.aBoolean155 = true;
				}
				if ((local262 & 0x1) == 0) {
					this.aBoolean154 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean156 = arg1.method4666() == 1;
			} else if (arg0 == 9) {
				this.anInt2282 = arg1.method4653();
				if (this.anInt2282 == 65535) {
					this.anInt2282 = -1;
				}
				this.anInt2294 = arg1.method4653();
				if (this.anInt2294 == 65535) {
					this.anInt2294 = -1;
				}
				this.anInt2276 = arg1.method4632();
				this.anInt2275 = arg1.method4632();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray15[arg0 - 10] = arg1.method4630();
			} else if (arg0 == 15) {
				local262 = arg1.method4666();
				this.anIntArray188 = new int[local262 * 2];
				for (@Pc(270) int local270 = 0; local270 < local262 * 2; local270++) {
					this.anIntArray188[local270] = arg1.method4613();
				}
				this.anInt2266 = arg1.method4632();
				this.anInt2283 = arg1.method4632();
			} else if (arg0 == 16) {
				this.aBoolean157 = false;
			} else if (arg0 == 17) {
				this.aString130 = arg1.method4630();
			} else if (arg0 == 18) {
				this.anInt2279 = arg1.method4653();
			} else if (arg0 == 19) {
				this.anInt2284 = arg1.method4653();
			} else if (arg0 == 20) {
				this.anInt2267 = arg1.method4653();
				if (this.anInt2267 == 65535) {
					this.anInt2267 = -1;
				}
				this.anInt2271 = arg1.method4653();
				if (this.anInt2271 == 65535) {
					this.anInt2271 = -1;
				}
				this.anInt2285 = arg1.method4632();
				this.anInt2265 = arg1.method4632();
			} else if (arg0 == 21) {
				this.anInt2280 = arg1.method4632();
			} else if (arg0 == 22) {
				this.anInt2274 = arg1.method4632();
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Z")
	public boolean method1811() {
		if (this.anInt2294 == -1 && this.anInt2282 == -1) {
			return true;
		}
		@Pc(35) int local35;
		if (this.anInt2294 == -1) {
			local35 = Static281.method4348(this.anInt2282);
		} else {
			local35 = Static2.anIntArray2[this.anInt2294];
		}
		if (this.anInt2276 > local35 || this.anInt2275 < local35) {
			return false;
		} else if (this.anInt2271 == -1 && this.anInt2267 == -1) {
			return true;
		} else {
			if (this.anInt2271 == -1) {
				local35 = Static281.method4348(this.anInt2267);
			} else {
				local35 = Static2.anIntArray2[this.anInt2271];
			}
			return local35 >= this.anInt2285 && this.anInt2265 >= local35;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZZ)Lclient!ma;")
	public Class56 method1812(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg0 ? this.anInt2291 : this.anInt2277;
		@Pc(30) Class56 local30 = (Class56) Static125.aClass26_23.method518((long) (local17 | (arg0 ? 65536 : 0)));
		if (local30 != null) {
			return local30;
		} else if (Static135.aClass58_60.method1359(local17)) {
			@Pc(49) Class56_Sub1 local49 = Static269.method3016(Static135.aClass58_60, local17);
			if (Static94.aBoolean138 && !arg1) {
				local30 = new Class56_Sub2(local49);
			} else {
				local30 = local49;
			}
			if (local30 != null) {
				local30.anInt3410 = local30.anInt3413;
				local30.anInt3405 = 0;
				local30.anInt3412 = local30.anInt3408;
				local30.anInt3404 = 0;
				Static125.aClass26_23.method510(local30, (long) ((arg0 ? 65536 : 0) | local17));
			}
			return local30;
		} else {
			return null;
		}
	}
}
