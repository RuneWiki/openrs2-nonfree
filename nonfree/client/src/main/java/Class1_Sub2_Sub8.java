import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!fa", name = "fb", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!fa", name = "jb", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!fa", name = "mb", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
	public int anInt1508 = -1;

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
	public int anInt1509 = 2;

	@OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
	public int anInt1518 = 5;

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "I")
	public int anInt1520 = -1;

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
	public int anInt1513 = 99;

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "Z")
	public boolean aBoolean107 = false;

	@OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
	public int anInt1519 = -1;

	@OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
	public int anInt1517 = -1;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
	public int anInt1511 = -1;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ia;III)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method1201(@OriginalArg(0) Class1_Sub2_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = this.anIntArray157[arg1];
		@Pc(16) Class1_Sub2_Sub7 local16 = Static61.method1406(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg0.method2721(true);
		}
		@Pc(37) Class1_Sub2_Sub2_Sub5 local37 = arg0.method2721(!local16.method1189(local20));
		@Pc(50) int local50 = arg2 & 0x3;
		if (local50 == 1) {
			local37.method2726();
		} else if (local50 == 2) {
			local37.method2711();
		} else if (local50 == 3) {
			local37.method2718();
		}
		local37.method2720(local16, local20);
		if (local50 == 1) {
			local37.method2718();
		} else if (local50 == 2) {
			local37.method2711();
		} else if (local50 == 3) {
			local37.method2726();
		}
		return local37;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ia;I)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method1202(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub5 arg1) {
		@Pc(8) int local8 = this.anIntArray157[arg0];
		@Pc(14) Class1_Sub2_Sub7 local14 = Static61.method1406(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method2721(true);
		} else {
			@Pc(35) Class1_Sub2_Sub2_Sub5 local35 = arg1.method2721(!local14.method1189(local18));
			local35.method2720(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ce;)V")
	public void method1203(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1607();
			if (local13 == 0) {
				return;
			}
			this.method1207(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!ia;)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method1204(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub2_Sub5 arg1) {
		@Pc(13) int local13 = this.anIntArray157[arg0];
		@Pc(19) Class1_Sub2_Sub7 local19 = Static61.method1406(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method2721(true);
		}
		@Pc(31) Class1_Sub2_Sub7 local31 = null;
		@Pc(33) int local33 = 0;
		if (this.anIntArray158 != null && arg0 < this.anIntArray158.length) {
			local33 = this.anIntArray158[arg0];
			local31 = Static61.method1406(local33 >> 16);
			local33 &= 0xFFFF;
		}
		@Pc(76) Class1_Sub2_Sub2_Sub5 local76;
		if (local31 == null || local33 == 65535) {
			local76 = arg1.method2721(!local19.method1189(local23));
			local76.method2720(local19, local23);
			return local76;
		} else {
			local76 = arg1.method2721(!local19.method1189(local23) & !local31.method1189(local33));
			local76.method2720(local19, local23);
			local76.method2720(local31, local33);
			return local76;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ia;IILclient!fa;)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method1205(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub8 arg3) {
		@Pc(4) int local4 = this.anIntArray157[arg2];
		@Pc(14) Class1_Sub2_Sub7 local14 = Static61.method1406(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg3.method1202(arg0, arg1);
		}
		@Pc(36) int local36 = arg3.anIntArray157[arg0];
		@Pc(42) Class1_Sub2_Sub7 local42 = Static61.method1406(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(59) Class1_Sub2_Sub2_Sub5 local59;
		if (local42 == null) {
			local59 = arg1.method2721(!local14.method1189(local23));
			local59.method2720(local14, local23);
			return local59;
		} else {
			local59 = arg1.method2721(!local14.method1189(local23) & !local42.method1189(local46));
			local59.method2722(local14, local23, local42, local46, this.anIntArray156);
			return local59;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ce;I)V")
	private void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		@Pc(78) int local78;
		@Pc(84) int local84;
		@Pc(99) int local99;
		if (arg0 == 1) {
			local78 = arg1.method1642();
			this.anIntArray155 = new int[local78];
			for (local84 = 0; local84 < local78; local84++) {
				this.anIntArray155[local84] = arg1.method1642();
			}
			this.anIntArray157 = new int[local78];
			for (local99 = 0; local99 < local78; local99++) {
				this.anIntArray157[local99] = arg1.method1642();
			}
			for (@Pc(279) int local279 = 0; local279 < local78; local279++) {
				this.anIntArray157[local279] += arg1.method1642() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1520 = arg1.method1642();
		} else if (arg0 == 3) {
			local78 = arg1.method1607();
			this.anIntArray156 = new int[local78 + 1];
			for (local84 = 0; local84 < local78; local84++) {
				this.anIntArray156[local84] = arg1.method1607();
			}
			this.anIntArray156[local78] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean107 = true;
		} else if (arg0 == 5) {
			this.anInt1518 = arg1.method1607();
		} else if (arg0 == 6) {
			this.anInt1508 = arg1.method1642();
		} else if (arg0 == 7) {
			this.anInt1511 = arg1.method1642();
		} else if (arg0 == 8) {
			this.anInt1513 = arg1.method1607();
		} else if (arg0 == 9) {
			this.anInt1517 = arg1.method1607();
		} else if (arg0 == 10) {
			this.anInt1519 = arg1.method1607();
		} else if (arg0 == 11) {
			this.anInt1509 = arg1.method1607();
		} else if (arg0 == 12) {
			local78 = arg1.method1607();
			this.anIntArray158 = new int[local78];
			for (local84 = 0; local84 < local78; local84++) {
				this.anIntArray158[local84] = arg1.method1642();
			}
			for (local99 = 0; local99 < local78; local99++) {
				this.anIntArray158[local99] += arg1.method1642() << 16;
			}
		} else if (arg0 == 13) {
			local78 = arg1.method1607();
			this.anIntArray159 = new int[local78];
			for (local84 = 0; local84 < local78; local84++) {
				this.anIntArray159[local84] = arg1.method1618();
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(ILclient!ia;I)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method1208(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub5 arg1) {
		@Pc(4) int local4 = this.anIntArray157[arg0];
		@Pc(14) Class1_Sub2_Sub7 local14 = Static61.method1406(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method2713(true);
		} else {
			@Pc(35) Class1_Sub2_Sub2_Sub5 local35 = arg1.method2713(!local14.method1189(local18));
			local35.method2720(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
	public void method1209() {
		if (this.anInt1517 == -1) {
			if (this.anIntArray156 == null) {
				this.anInt1517 = 0;
			} else {
				this.anInt1517 = 2;
			}
		}
		if (this.anInt1519 != -1) {
			return;
		}
		if (this.anIntArray156 == null) {
			this.anInt1519 = 0;
		} else {
			this.anInt1519 = 2;
		}
	}
}
