import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "[I")
	public int[] anIntArray139;

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "[I")
	public int[] anIntArray140;

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!ca", name = "W", descriptor = "[I")
	public int[] anIntArray142;

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
	public int anInt532 = -1;

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
	public int anInt535 = 5;

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
	public int anInt533 = -1;

	@OriginalMember(owner = "client!ca", name = "Z", descriptor = "I")
	public int anInt543 = 99;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
	public int anInt536 = -1;

	@OriginalMember(owner = "client!ca", name = "hb", descriptor = "I")
	public int anInt548 = -1;

	@OriginalMember(owner = "client!ca", name = "ib", descriptor = "I")
	public int anInt549 = 2;

	@OriginalMember(owner = "client!ca", name = "gb", descriptor = "I")
	public int anInt547 = -1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!d;I)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method565(@OriginalArg(1) Class3_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray142[arg1];
		@Pc(14) Class3_Sub2_Sub13 local14 = Static86.method1987(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method194(true);
		} else {
			@Pc(40) Class3_Sub2_Sub1_Sub1 local40 = arg0.method194(!local14.method2093(local18));
			local40.method196(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!d;II)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method568(@OriginalArg(1) Class3_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray142[arg2];
		@Pc(16) Class3_Sub2_Sub13 local16 = Static86.method1987(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg0.method194(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(41) Class3_Sub2_Sub1_Sub1 local41 = arg0.method194(!local16.method2093(local20));
		if (local30 == 1) {
			local41.method204();
		} else if (local30 == 2) {
			local41.method201();
		} else if (local30 == 3) {
			local41.method190();
		}
		local41.method196(local16, local20);
		if (local30 == 1) {
			local41.method190();
		} else if (local30 == 2) {
			local41.method201();
		} else if (local30 == 3) {
			local41.method204();
		}
		return local41;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!d;ILclient!ca;I)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method569(@OriginalArg(1) Class3_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray142[arg3];
		@Pc(14) Class3_Sub2_Sub13 local14 = Static86.method1987(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method565(arg0, arg1);
		}
		@Pc(33) int local33 = arg2.anIntArray142[arg1];
		@Pc(39) Class3_Sub2_Sub13 local39 = Static86.method1987(local33 >> 16);
		@Pc(43) int local43 = local33 & 0xFFFF;
		@Pc(56) Class3_Sub2_Sub1_Sub1 local56;
		if (local39 == null) {
			local56 = arg0.method194(!local14.method2093(local18));
			local56.method196(local14, local18);
			return local56;
		} else {
			local56 = arg0.method194(!local14.method2093(local18) & !local39.method2093(local43));
			local56.method188(local14, local18, local39, local43, this.anIntArray141);
			return local56;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(ILclient!d;I)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method570(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub1_Sub1 arg1) {
		@Pc(4) int local4 = this.anIntArray142[arg0];
		@Pc(14) Class3_Sub2_Sub13 local14 = Static86.method1987(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method194(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class3_Sub2_Sub13 local28 = null;
		if (this.anIntArray143 != null && arg0 < this.anIntArray143.length) {
			local26 = this.anIntArray143[arg0];
			local28 = Static86.method1987(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(71) Class3_Sub2_Sub1_Sub1 local71;
		if (local28 == null || local26 == 65535) {
			local71 = arg1.method194(!local14.method2093(local18));
			local71.method196(local14, local18);
			return local71;
		} else {
			local71 = arg1.method194(!local14.method2093(local18) & !local28.method2093(local26));
			local71.method196(local14, local18);
			local71.method196(local28, local26);
			return local71;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!hd;Z)V")
	public void method572(@OriginalArg(0) Class3_Sub8 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1545();
			if (local3 == 0) {
				return;
			}
			this.method573(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!hd;II)V")
	private void method573(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(36) int local36;
		if (arg1 == 1) {
			local12 = arg0.method1510();
			this.anIntArray139 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray139[local18] = arg0.method1510();
			}
			this.anIntArray142 = new int[local12];
			for (local36 = 0; local36 < local12; local36++) {
				this.anIntArray142[local36] = arg0.method1510();
			}
			for (@Pc(50) int local50 = 0; local50 < local12; local50++) {
				this.anIntArray142[local50] = (arg0.method1510() << 16) + this.anIntArray142[local50];
			}
		} else if (arg1 == 2) {
			this.anInt533 = arg0.method1510();
		} else if (arg1 == 3) {
			local12 = arg0.method1545();
			this.anIntArray141 = new int[local12 + 1];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray141[local18] = arg0.method1545();
			}
			this.anIntArray141[local12] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean33 = true;
		} else if (arg1 == 5) {
			this.anInt535 = arg0.method1545();
		} else if (arg1 == 6) {
			this.anInt548 = arg0.method1510();
		} else if (arg1 == 7) {
			this.anInt532 = arg0.method1510();
		} else if (arg1 == 8) {
			this.anInt543 = arg0.method1545();
		} else if (arg1 == 9) {
			this.anInt547 = arg0.method1545();
		} else if (arg1 == 10) {
			this.anInt536 = arg0.method1545();
		} else if (arg1 == 11) {
			this.anInt549 = arg0.method1545();
		} else if (arg1 == 12) {
			local12 = arg0.method1545();
			this.anIntArray143 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray143[local18] = arg0.method1510();
			}
			for (local36 = 0; local36 < local12; local36++) {
				this.anIntArray143[local36] += arg0.method1510() << 16;
			}
			return;
		} else if (arg1 == 13) {
			local12 = arg0.method1545();
			this.anIntArray140 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray140[local18] = arg0.method1554();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBLclient!d;)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method574(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2_Sub1_Sub1 arg1) {
		@Pc(8) int local8 = this.anIntArray142[arg0];
		@Pc(14) Class3_Sub2_Sub13 local14 = Static86.method1987(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method199(true);
		} else {
			@Pc(41) Class3_Sub2_Sub1_Sub1 local41 = arg1.method199(!local14.method2093(local18));
			local41.method196(local14, local18);
			return local41;
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
	public void method575() {
		if (this.anInt536 == -1) {
			if (this.anIntArray141 == null) {
				this.anInt536 = 0;
			} else {
				this.anInt536 = 2;
			}
		}
		if (this.anInt547 != -1) {
			return;
		}
		if (this.anIntArray141 == null) {
			this.anInt547 = 0;
		} else {
			this.anInt547 = 2;
		}
	}
}
