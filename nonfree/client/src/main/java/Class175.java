import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class175 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	public int anInt5004;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	public int anInt5006;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	public int anInt5007;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public int anInt5009;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
	private int anInt5010;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Ljava/lang/String;")
	public String aString291;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public int anInt5014;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	private int anInt5017;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
	public int anInt5021;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "[I")
	public int[] anIntArray453;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
	private int anInt5022;

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
	private int anInt5023;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "Ljava/lang/String;")
	public String aString292;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Z")
	public boolean aBoolean342 = true;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
	public int anInt5020 = 0;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray37 = new String[5];

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	private int anInt5012 = -1;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public int anInt5015 = -1;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	public int anInt5011 = -1;

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
	private int anInt5024 = -1;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
	private int anInt5030 = -1;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	public int anInt5031 = -1;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
	public int anInt5028 = -1;

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
	private int anInt5026 = -1;

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "Z")
	public boolean aBoolean345 = true;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Z")
	public boolean aBoolean343 = true;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	private int anInt5005 = -1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Lclient!fe;")
	public Class23_Sub1 method4287() {
		@Pc(13) Class23_Sub1 local13 = (Class23_Sub1) Static182.aClass187_93.method4527((long) (this.anInt5005 | 0x20000));
		if (local13 != null) {
			return local13;
		}
		Static194.aClass121_86.method3140(this.anInt5005);
		local13 = Static125.method2196(Static194.aClass121_86, this.anInt5005);
		if (local13 != null) {
			local13.anInt4470 = 0;
			local13.anInt4468 = local13.anInt4469;
			local13.anInt4472 = 0;
			local13.anInt4476 = local13.anInt4473;
			Static182.aClass187_93.method4524((long) (this.anInt5005 | 0x20000), local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!lf;)V")
	public void method4288(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1378();
			if (local14 == 0) {
				return;
			}
			this.method4292(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBLclient!lf;)V")
	private void method4292(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt5031 = arg1.method1386();
		} else if (arg0 == 2) {
			this.anInt5015 = arg1.method1386();
		} else if (arg0 == 3) {
			this.aString291 = arg1.method1375();
		} else if (arg0 == 4) {
			this.anInt5009 = arg1.method1352();
		} else if (arg0 == 5) {
			this.anInt5028 = arg1.method1352();
		} else if (arg0 == 6) {
			this.anInt5020 = arg1.method1378();
		} else {
			@Pc(73) int local73;
			if (arg0 == 7) {
				local73 = arg1.method1378();
				if ((local73 & 0x1) == 0) {
					this.aBoolean345 = false;
				}
				if ((local73 & 0x2) == 2) {
					this.aBoolean344 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean343 = arg1.method1378() == 1;
			} else if (arg0 == 9) {
				this.anInt5030 = arg1.method1386();
				if (this.anInt5030 == 65535) {
					this.anInt5030 = -1;
				}
				this.anInt5012 = arg1.method1386();
				if (this.anInt5012 == 65535) {
					this.anInt5012 = -1;
				}
				this.anInt5023 = arg1.method1392();
				this.anInt5017 = arg1.method1392();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray37[arg0 - 10] = arg1.method1375();
			} else if (arg0 == 15) {
				local73 = arg1.method1378();
				this.anIntArray453 = new int[local73 * 2];
				for (@Pc(174) int local174 = 0; local174 < local73 * 2; local174++) {
					this.anIntArray453[local174] = arg1.method1356();
				}
				this.anInt5007 = arg1.method1392();
				this.anInt5014 = arg1.method1392();
			} else if (arg0 == 16) {
				this.aBoolean342 = false;
			} else if (arg0 == 17) {
				this.aString292 = arg1.method1375();
			} else if (arg0 == 18) {
				this.anInt5005 = arg1.method1386();
			} else if (arg0 == 19) {
				this.anInt5011 = arg1.method1386();
			} else if (arg0 == 20) {
				this.anInt5026 = arg1.method1386();
				if (this.anInt5026 == 65535) {
					this.anInt5026 = -1;
				}
				this.anInt5024 = arg1.method1386();
				if (this.anInt5024 == 65535) {
					this.anInt5024 = -1;
				}
				this.anInt5010 = arg1.method1392();
				this.anInt5022 = arg1.method1392();
			} else if (arg0 == 21) {
				this.anInt5021 = arg1.method1392();
			} else if (arg0 == 22) {
				this.anInt5004 = arg1.method1392();
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZBZ)Lclient!cf;")
	public Class23 method4293(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg1 ? this.anInt5015 : this.anInt5031;
		@Pc(28) Class23 local28 = (Class23) Static182.aClass187_93.method4527((long) ((arg1 ? 65536 : 0) | local15));
		if (local28 != null) {
			return local28;
		} else if (Static194.aClass121_86.method3140(local15)) {
			@Pc(51) Class23_Sub1 local51 = Static125.method2196(Static194.aClass121_86, local15);
			if (Static156.aBoolean211 && !arg0) {
				local28 = new Class23_Sub2(local51);
			} else {
				local28 = local51;
			}
			if (local28 != null) {
				local28.anInt4468 = local28.anInt4469;
				local28.anInt4470 = 0;
				local28.anInt4476 = local28.anInt4473;
				local28.anInt4472 = 0;
				Static182.aClass187_93.method4524((long) ((arg1 ? 65536 : 0) | local15), local28);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Z")
	public boolean method4294() {
		if (this.anInt5012 == -1 && this.anInt5030 == -1) {
			return true;
		}
		@Pc(32) int local32;
		if (this.anInt5012 == -1) {
			local32 = Static272.method4761(this.anInt5030);
		} else {
			local32 = Static55.anIntArray64[this.anInt5012];
		}
		if (local32 < this.anInt5023 || this.anInt5017 < local32) {
			return false;
		} else if (this.anInt5024 == -1 && this.anInt5026 == -1) {
			return true;
		} else {
			if (this.anInt5024 == -1) {
				local32 = Static272.method4761(this.anInt5026);
			} else {
				local32 = Static55.anIntArray64[this.anInt5024];
			}
			return local32 >= this.anInt5010 && this.anInt5022 >= local32;
		}
	}
}
