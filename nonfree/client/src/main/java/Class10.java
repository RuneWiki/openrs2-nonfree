import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	public int anInt147;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
	public int anInt159;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
	public int anInt163;

	@OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
	public int anInt164;

	@OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
	public int anInt167;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
	private int anInt180;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Z")
	public boolean aBoolean15 = true;

	@OriginalMember(owner = "client!aj", name = "F", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
	private int anInt162 = -1;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public int anInt155 = -1;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Z")
	public boolean aBoolean16 = true;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	public int anInt157 = -1;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
	public int anInt158 = -1;

	@OriginalMember(owner = "client!aj", name = "E", descriptor = "Z")
	public boolean aBoolean18 = true;

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "Z")
	public boolean aBoolean17 = false;

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
	public int anInt169 = 0;

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
	private int anInt177 = -1;

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
	private int anInt176 = -1;

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
	private int anInt166 = -1;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
	public int anInt173 = -1;

	@OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
	private int anInt178 = -1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLclient!oe;)V")
	public void method152(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2146();
			if (local12 == 0) {
				return;
			}
			this.method162(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Lclient!ka;")
	public Class93_Sub1 method153() {
		@Pc(13) Class93_Sub1 local13 = (Class93_Sub1) Static108.aClass157_23.method4031((long) (this.anInt177 | 0x20000));
		if (local13 != null) {
			return local13;
		}
		Static189.aClass42_57.method1253(this.anInt177);
		local13 = Static245.method3900(this.anInt177, Static189.aClass42_57);
		if (local13 != null) {
			local13.anInt4361 = local13.anInt4355;
			local13.anInt4356 = 0;
			local13.anInt4354 = local13.anInt4359;
			local13.anInt4360 = 0;
			Static108.aClass157_23.method4026((long) (this.anInt177 | 0x20000), local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZZ)Lclient!ob;")
	public Class93 method155(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt173 : this.anInt157;
		@Pc(26) Class93 local26 = (Class93) Static108.aClass157_23.method4031((long) (local11 | (arg0 ? 65536 : 0)));
		if (local26 != null) {
			return local26;
		} else if (Static189.aClass42_57.method1253(local11)) {
			@Pc(46) Class93_Sub1 local46 = Static245.method3900(local11, Static189.aClass42_57);
			if (Static116.aBoolean184 && !arg1) {
				local26 = new Class93_Sub2(local46);
			} else {
				local26 = local46;
			}
			if (local26 != null) {
				local26.anInt4360 = 0;
				local26.anInt4361 = local26.anInt4355;
				local26.anInt4356 = 0;
				local26.anInt4354 = local26.anInt4359;
				Static108.aClass157_23.method4026((long) ((arg0 ? 65536 : 0) | local11), local26);
			}
			return local26;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)Z")
	public boolean method157() {
		if (this.anInt162 == -1 && this.anInt178 == -1) {
			return true;
		}
		@Pc(34) int local34;
		if (this.anInt162 == -1) {
			local34 = Static191.method3295(this.anInt178);
		} else {
			local34 = Static64.anIntArray134[this.anInt162];
		}
		if (local34 < this.anInt149 || local34 > this.anInt153) {
			return false;
		} else if (this.anInt166 == -1 && this.anInt176 == -1) {
			return true;
		} else {
			if (this.anInt166 == -1) {
				local34 = Static191.method3295(this.anInt176);
			} else {
				local34 = Static64.anIntArray134[this.anInt166];
			}
			return local34 >= this.anInt172 && this.anInt180 >= local34;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BILclient!oe;)V")
	private void method162(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt157 = arg1.method2130();
		} else if (arg0 == 2) {
			this.anInt173 = arg1.method2130();
		} else if (arg0 == 3) {
			this.aString9 = arg1.method2158();
		} else if (arg0 == 4) {
			this.anInt147 = arg1.method2166();
		} else if (arg0 == 5) {
			this.anInt158 = arg1.method2166();
		} else if (arg0 == 6) {
			this.anInt169 = arg1.method2146();
		} else {
			@Pc(67) int local67;
			if (arg0 == 7) {
				local67 = arg1.method2146();
				if ((local67 & 0x2) == 2) {
					this.aBoolean17 = true;
				}
				if ((local67 & 0x1) == 0) {
					this.aBoolean18 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean16 = arg1.method2146() == 1;
			} else if (arg0 == 9) {
				this.anInt178 = arg1.method2130();
				if (this.anInt178 == 65535) {
					this.anInt178 = -1;
				}
				this.anInt162 = arg1.method2130();
				if (this.anInt162 == 65535) {
					this.anInt162 = -1;
				}
				this.anInt149 = arg1.method2145();
				this.anInt153 = arg1.method2145();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray1[arg0 - 10] = arg1.method2158();
			} else if (arg0 == 15) {
				local67 = arg1.method2146();
				this.anIntArray25 = new int[local67 * 2];
				for (@Pc(261) int local261 = 0; local261 < local67 * 2; local261++) {
					this.anIntArray25[local261] = arg1.method2191();
				}
				this.anInt159 = arg1.method2145();
				this.anInt164 = arg1.method2145();
			} else if (arg0 == 16) {
				this.aBoolean15 = false;
			} else if (arg0 == 17) {
				this.aString10 = arg1.method2158();
			} else if (arg0 == 18) {
				this.anInt177 = arg1.method2130();
			} else if (arg0 == 19) {
				this.anInt155 = arg1.method2130();
			} else if (arg0 == 20) {
				this.anInt176 = arg1.method2130();
				if (this.anInt176 == 65535) {
					this.anInt176 = -1;
				}
				this.anInt166 = arg1.method2130();
				if (this.anInt166 == 65535) {
					this.anInt166 = -1;
				}
				this.anInt172 = arg1.method2145();
				this.anInt180 = arg1.method2145();
			} else if (arg0 == 21) {
				this.anInt168 = arg1.method2145();
			} else if (arg0 == 22) {
				this.anInt163 = arg1.method2145();
			}
		}
	}
}
