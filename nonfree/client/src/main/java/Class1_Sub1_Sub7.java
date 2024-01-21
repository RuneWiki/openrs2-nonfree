import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!f", name = "U", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "[I")
	public int[] anIntArray151;

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!f", name = "kb", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!f", name = "rb", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
	public int anInt1038 = 5;

	@OriginalMember(owner = "client!f", name = "X", descriptor = "I")
	public int anInt1033 = -1;

	@OriginalMember(owner = "client!f", name = "T", descriptor = "I")
	public int anInt1031 = -1;

	@OriginalMember(owner = "client!f", name = "mb", descriptor = "I")
	public int anInt1042 = 99;

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
	public int anInt1034 = -1;

	@OriginalMember(owner = "client!f", name = "xb", descriptor = "I")
	public int anInt1050 = -1;

	@OriginalMember(owner = "client!f", name = "sb", descriptor = "I")
	public int anInt1047 = -1;

	@OriginalMember(owner = "client!f", name = "vb", descriptor = "I")
	public int anInt1049 = 2;

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "Z")
	public boolean aBoolean95 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!na;II)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method626(@OriginalArg(0) Class1_Sub1_Sub2_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray151[arg1];
		@Pc(14) Class1_Sub1_Sub13 local14 = Static2.method61(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1380(true);
		} else {
			@Pc(35) Class1_Sub1_Sub2_Sub7 local35 = arg0.method1380(!local14.method1722(local18));
			local35.method1384(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!qc;I)V")
	private void method627(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(39) int local39;
		if (arg1 == 1) {
			local10 = arg0.method2156();
			this.anIntArray149 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray149[local16] = arg0.method2156();
			}
			this.anIntArray151 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray151[local39] = arg0.method2156();
			}
			for (@Pc(58) int local58 = 0; local58 < local10; local58++) {
				this.anIntArray151[local58] += arg0.method2156() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt1047 = arg0.method2156();
		} else if (arg1 == 3) {
			local10 = arg0.method2169();
			this.anIntArray154 = new int[local10 + 1];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray154[local16] = arg0.method2169();
			}
			this.anIntArray154[local10] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean95 = true;
		} else if (arg1 == 5) {
			this.anInt1038 = arg0.method2169();
		} else if (arg1 == 6) {
			this.anInt1033 = arg0.method2156();
		} else if (arg1 == 7) {
			this.anInt1031 = arg0.method2156();
		} else if (arg1 == 8) {
			this.anInt1042 = arg0.method2169();
		} else if (arg1 == 9) {
			this.anInt1034 = arg0.method2169();
		} else if (arg1 == 10) {
			this.anInt1050 = arg0.method2169();
		} else if (arg1 == 11) {
			this.anInt1049 = arg0.method2169();
		} else if (arg1 == 12) {
			local10 = arg0.method2169();
			this.anIntArray153 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray153[local16] = arg0.method2156();
			}
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray153[local39] += arg0.method2156() << 16;
			}
		} else if (arg1 == 13) {
			local10 = arg0.method2169();
			this.anIntArray152 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray152[local16] = arg0.method2145();
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!f;ILclient!na;I)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method628(@OriginalArg(1) Class1_Sub1_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub7 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray151[arg1];
		@Pc(14) Class1_Sub1_Sub13 local14 = Static2.method61(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method626(arg2, arg3);
		}
		@Pc(31) int local31 = arg0.anIntArray151[arg3];
		@Pc(39) Class1_Sub1_Sub13 local39 = Static2.method61(local31 >> 16);
		@Pc(43) int local43 = local31 & 0xFFFF;
		@Pc(56) Class1_Sub1_Sub2_Sub7 local56;
		if (local39 == null) {
			local56 = arg2.method1380(!local14.method1722(local18));
			local56.method1384(local14, local18);
			return local56;
		} else {
			local56 = arg2.method1380(!local14.method1722(local18) & !local39.method1722(local43));
			local56.method1386(local14, local18, local39, local43, this.anIntArray154);
			return local56;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!na;I)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method629(@OriginalArg(1) Class1_Sub1_Sub2_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray151[arg1];
		@Pc(14) Class1_Sub1_Sub13 local14 = Static2.method61(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1379(true);
		} else {
			@Pc(41) Class1_Sub1_Sub2_Sub7 local41 = arg0.method1379(!local14.method1722(local18));
			local41.method1384(local14, local18);
			return local41;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILclient!na;)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub7 arg2) {
		@Pc(10) int local10 = this.anIntArray151[arg1];
		@Pc(16) Class1_Sub1_Sub13 local16 = Static2.method61(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method1380(true);
		}
		@Pc(45) Class1_Sub1_Sub2_Sub7 local45 = arg2.method1380(!local16.method1722(local20));
		@Pc(49) int local49 = arg0 & 0x3;
		if (local49 == 1) {
			local45.method1385();
		} else if (local49 == 2) {
			local45.method1372();
		} else if (local49 == 3) {
			local45.method1374();
		}
		local45.method1384(local16, local20);
		if (local49 == 1) {
			local45.method1374();
		} else if (local49 == 2) {
			local45.method1372();
		} else if (local49 == 3) {
			local45.method1385();
		}
		return local45;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public void method634() {
		if (this.anInt1050 == -1) {
			if (this.anIntArray154 == null) {
				this.anInt1050 = 0;
			} else {
				this.anInt1050 = 2;
			}
		}
		if (this.anInt1034 != -1) {
			return;
		}
		if (this.anIntArray154 == null) {
			this.anInt1034 = 0;
		} else {
			this.anInt1034 = 2;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!qc;)V")
	public void method635(@OriginalArg(1) Class1_Sub18 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method2169();
			if (local16 == 0) {
				return;
			}
			this.method627(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!na;IB)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method638(@OriginalArg(0) Class1_Sub1_Sub2_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray151[arg1];
		@Pc(14) Class1_Sub1_Sub13 local14 = Static2.method61(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1380(true);
		}
		@Pc(37) Class1_Sub1_Sub13 local37 = null;
		@Pc(39) int local39 = 0;
		if (this.anIntArray153 != null && this.anIntArray153.length > arg1) {
			local39 = this.anIntArray153[arg1];
			local37 = Static2.method61(local39 >> 16);
			local39 &= 0xFFFF;
		}
		@Pc(84) Class1_Sub1_Sub2_Sub7 local84;
		if (local37 == null || local39 == 65535) {
			local84 = arg0.method1380(!local14.method1722(local18));
			local84.method1384(local14, local18);
			return local84;
		} else {
			local84 = arg0.method1380(!local14.method1722(local18) & !local37.method1722(local39));
			local84.method1384(local14, local18);
			local84.method1384(local37, local39);
			return local84;
		}
	}
}
