import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!uc", name = "eb", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!uc", name = "ob", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!uc", name = "tb", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!uc", name = "zb", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
	public int anInt3097 = -1;

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
	public int anInt3098 = 99;

	@OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
	public int anInt3102 = 2;

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
	public int anInt3101 = -1;

	@OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
	public int anInt3106 = -1;

	@OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
	public int anInt3108 = -1;

	@OriginalMember(owner = "client!uc", name = "qb", descriptor = "I")
	public int anInt3109 = -1;

	@OriginalMember(owner = "client!uc", name = "wb", descriptor = "I")
	public int anInt3113 = 5;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILclient!oa;)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method2117(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub5_Sub7 arg1) {
		@Pc(8) int local8 = this.anIntArray377[arg0];
		@Pc(22) Class3_Sub1_Sub14 local22 = Static122.method2171(local8 >> 16);
		@Pc(26) int local26 = local8 & 0xFFFF;
		if (local22 == null) {
			return arg1.method1481(true);
		} else {
			@Pc(43) Class3_Sub1_Sub5_Sub7 local43 = arg1.method1481(!local22.method1663(local26));
			local43.method1482(local22, local26);
			return local43;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!oa;IB)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method2118(@OriginalArg(0) Class3_Sub1_Sub5_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anIntArray377[arg1];
		@Pc(22) Class3_Sub1_Sub14 local22 = Static122.method2171(local16 >> 16);
		@Pc(26) int local26 = local16 & 0xFFFF;
		if (local22 == null) {
			return arg0.method1481(true);
		}
		@Pc(34) Class3_Sub1_Sub14 local34 = null;
		@Pc(36) int local36 = 0;
		if (this.anIntArray372 != null && this.anIntArray372.length > arg1) {
			local36 = this.anIntArray372[arg1];
			local34 = Static122.method2171(local36 >> 16);
			local36 &= 0xFFFF;
		}
		@Pc(79) Class3_Sub1_Sub5_Sub7 local79;
		if (local34 == null || local36 == 65535) {
			local79 = arg0.method1481(!local22.method1663(local26));
			local79.method1482(local22, local26);
			return local79;
		} else {
			local79 = arg0.method1481(!local22.method1663(local26) & !local34.method1663(local36));
			local79.method1482(local22, local26);
			local79.method1482(local34, local36);
			return local79;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!oa;ILclient!uc;II)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method2119(@OriginalArg(0) Class3_Sub1_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anIntArray377[arg3];
		@Pc(14) Class3_Sub1_Sub14 local14 = Static122.method2171(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg2.method2117(arg1, arg0);
		}
		@Pc(31) int local31 = arg2.anIntArray377[arg1];
		@Pc(37) Class3_Sub1_Sub14 local37 = Static122.method2171(local31 >> 16);
		@Pc(46) int local46 = local31 & 0xFFFF;
		@Pc(59) Class3_Sub1_Sub5_Sub7 local59;
		if (local37 == null) {
			local59 = arg0.method1481(!local14.method1663(local18));
			local59.method1482(local14, local18);
			return local59;
		} else {
			local59 = arg0.method1481(!local14.method1663(local18) & !local37.method1663(local46));
			local59.method1465(local14, local18, local37, local46, this.anIntArray375);
			return local59;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!oa;I)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub5_Sub7 arg2) {
		@Pc(10) int local10 = this.anIntArray377[arg0];
		@Pc(16) Class3_Sub1_Sub14 local16 = Static122.method2171(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method1481(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(47) Class3_Sub1_Sub5_Sub7 local47 = arg2.method1481(!local16.method1663(local20));
		if (local30 == 1) {
			local47.method1478();
		} else if (local30 == 2) {
			local47.method1469();
		} else if (local30 == 3) {
			local47.method1473();
		}
		local47.method1482(local16, local20);
		if (local30 == 1) {
			local47.method1473();
		} else if (local30 == 2) {
			local47.method1469();
		} else if (local30 == 3) {
			local47.method1478();
		}
		return local47;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	public void method2122() {
		if (this.anInt3097 == -1) {
			if (this.anIntArray375 == null) {
				this.anInt3097 = 0;
			} else {
				this.anInt3097 = 2;
			}
		}
		if (this.anInt3101 != -1) {
			return;
		}
		if (this.anIntArray375 == null) {
			this.anInt3101 = 0;
		} else {
			this.anInt3101 = 2;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(BILclient!oa;)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method2124(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub5_Sub7 arg1) {
		@Pc(4) int local4 = this.anIntArray377[arg0];
		@Pc(23) Class3_Sub1_Sub14 local23 = Static122.method2171(local4 >> 16);
		@Pc(27) int local27 = local4 & 0xFFFF;
		if (local23 == null) {
			return arg1.method1472(true);
		} else {
			@Pc(44) Class3_Sub1_Sub5_Sub7 local44 = arg1.method1472(!local23.method1663(local27));
			local44.method1482(local23, local27);
			return local44;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!m;)V")
	public void method2125(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(20) int local20 = arg0.method981();
			if (local20 == 0) {
				return;
			}
			this.method2127(local20, arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZLclient!m;)V")
	private void method2127(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(37) int local37;
		if (arg0 == 1) {
			local12 = arg1.method974();
			this.anIntArray374 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray374[local18] = arg1.method974();
			}
			this.anIntArray377 = new int[local12];
			for (local37 = 0; local37 < local12; local37++) {
				this.anIntArray377[local37] = arg1.method974();
			}
			for (@Pc(52) int local52 = 0; local52 < local12; local52++) {
				this.anIntArray377[local52] += arg1.method974() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3109 = arg1.method974();
		} else if (arg0 == 3) {
			local12 = arg1.method981();
			this.anIntArray375 = new int[local12 + 1];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray375[local18] = arg1.method981();
			}
			this.anIntArray375[local12] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean171 = true;
		} else if (arg0 == 5) {
			this.anInt3113 = arg1.method981();
		} else if (arg0 == 6) {
			this.anInt3106 = arg1.method974();
		} else if (arg0 == 7) {
			this.anInt3108 = arg1.method974();
		} else if (arg0 == 8) {
			this.anInt3098 = arg1.method981();
		} else if (arg0 == 9) {
			this.anInt3097 = arg1.method981();
		} else if (arg0 == 10) {
			this.anInt3101 = arg1.method981();
		} else if (arg0 == 11) {
			this.anInt3102 = arg1.method981();
		} else if (arg0 == 12) {
			local12 = arg1.method981();
			this.anIntArray372 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray372[local18] = arg1.method974();
			}
			for (local37 = 0; local37 < local12; local37++) {
				this.anIntArray372[local37] += arg1.method974() << 16;
			}
		} else if (arg0 == 13) {
			local12 = arg1.method981();
			this.anIntArray373 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray373[local18] = arg1.method1013();
			}
		}
	}
}
