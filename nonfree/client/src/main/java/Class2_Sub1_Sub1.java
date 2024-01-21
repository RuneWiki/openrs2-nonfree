import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!aa", name = "lb", descriptor = "[I")
	public int[] anIntArray7;

	@OriginalMember(owner = "client!aa", name = "ob", descriptor = "[I")
	public int[] anIntArray8;

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
	public int anInt69 = -1;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
	public int anInt67 = -1;

	@OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
	public int anInt76 = 99;

	@OriginalMember(owner = "client!aa", name = "nb", descriptor = "I")
	public int anInt80 = 2;

	@OriginalMember(owner = "client!aa", name = "mb", descriptor = "I")
	public int anInt79 = 5;

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
	public int anInt72 = -1;

	@OriginalMember(owner = "client!aa", name = "wb", descriptor = "I")
	public int anInt86 = -1;

	@OriginalMember(owner = "client!aa", name = "kb", descriptor = "Z")
	public boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "zb", descriptor = "I")
	public int anInt88 = -1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!g;)V")
	public void method53(@OriginalArg(1) Class2_Sub5 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1281();
			if (local3 == 0) {
				return;
			}
			this.method62(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ga;IBILclient!aa;)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method54(@OriginalArg(0) Class2_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub1 arg3) {
		@Pc(4) int local4 = this.anIntArray7[arg2];
		@Pc(14) Class2_Sub1_Sub16 local14 = Static77.method1515(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg3.method58(arg1, arg0);
		}
		@Pc(31) int local31 = arg3.anIntArray7[arg1];
		@Pc(42) Class2_Sub1_Sub16 local42 = Static77.method1515(local31 >> 16);
		@Pc(46) int local46 = local31 & 0xFFFF;
		@Pc(59) Class2_Sub1_Sub2_Sub2 local59;
		if (local42 == null) {
			local59 = arg0.method707(!local14.method1909(local18));
			local59.method715(local14, local18);
			return local59;
		} else {
			local59 = arg0.method707(!local14.method1909(local18) & !local42.method1909(local46));
			local59.method695(local14, local18, local42, local46, this.anIntArray5);
			return local59;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!ga;B)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method57(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2_Sub2 arg1) {
		@Pc(17) int local17 = this.anIntArray7[arg0];
		@Pc(23) Class2_Sub1_Sub16 local23 = Static77.method1515(local17 >> 16);
		@Pc(27) int local27 = local17 & 0xFFFF;
		if (local23 == null) {
			return arg1.method713(true);
		} else {
			@Pc(44) Class2_Sub1_Sub2_Sub2 local44 = arg1.method713(!local23.method1909(local27));
			local44.method715(local23, local27);
			return local44;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZILclient!ga;)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method58(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub2 arg1) {
		@Pc(10) int local10 = this.anIntArray7[arg0];
		@Pc(16) Class2_Sub1_Sub16 local16 = Static77.method1515(local10 >> 16);
		@Pc(24) int local24 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method707(true);
		} else {
			@Pc(41) Class2_Sub1_Sub2_Sub2 local41 = arg1.method707(!local16.method1909(local24));
			local41.method715(local16, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ga;IIB)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method60(@OriginalArg(0) Class2_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = this.anIntArray7[arg1];
		@Pc(16) Class2_Sub1_Sub16 local16 = Static77.method1515(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg0.method707(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(48) Class2_Sub1_Sub2_Sub2 local48 = arg0.method707(!local16.method1909(local20));
		if (local30 == 1) {
			local48.method702();
		} else if (local30 == 2) {
			local48.method701();
		} else if (local30 == 3) {
			local48.method694();
		}
		local48.method715(local16, local20);
		if (local30 == 1) {
			local48.method694();
		} else if (local30 == 2) {
			local48.method701();
		} else if (local30 == 3) {
			local48.method702();
		}
		return local48;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLclient!ga;)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method61(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub2 arg1) {
		@Pc(4) int local4 = this.anIntArray7[arg0];
		@Pc(14) Class2_Sub1_Sub16 local14 = Static77.method1515(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method707(true);
		}
		@Pc(26) Class2_Sub1_Sub16 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray6 != null && this.anIntArray6.length > arg0) {
			local28 = this.anIntArray6[arg0];
			local26 = Static77.method1515(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(67) Class2_Sub1_Sub2_Sub2 local67;
		if (local26 == null || local28 == 65535) {
			local67 = arg1.method707(!local14.method1909(local18));
			local67.method715(local14, local18);
			return local67;
		} else {
			local67 = arg1.method707(!local14.method1909(local18) & !local26.method1909(local28));
			local67.method715(local14, local18);
			local67.method715(local26, local28);
			return local67;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!g;BI)V")
	private void method62(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(141) int local141;
		if (arg1 == 1) {
			local22 = arg0.method1281();
			this.anIntArray8 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray8[local30] = arg0.method1273();
			}
			this.anIntArray7 = new int[local22];
			for (local141 = 0; local141 < local22; local141++) {
				this.anIntArray7[local141] = arg0.method1273();
			}
			for (@Pc(219) int local219 = 0; local219 < local22; local219++) {
				this.anIntArray7[local219] = (arg0.method1273() << 16) + this.anIntArray7[local219];
			}
		} else if (arg1 == 2) {
			this.anInt67 = arg0.method1273();
		} else if (arg1 == 3) {
			local22 = arg0.method1281();
			this.anIntArray5 = new int[local22 + 1];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray5[local30] = arg0.method1281();
			}
			this.anIntArray5[local22] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean1 = true;
		} else if (arg1 == 5) {
			this.anInt79 = arg0.method1281();
		} else if (arg1 == 6) {
			this.anInt72 = arg0.method1273();
		} else if (arg1 == 7) {
			this.anInt88 = arg0.method1273();
		} else if (arg1 == 8) {
			this.anInt76 = arg0.method1281();
		} else if (arg1 == 9) {
			this.anInt69 = arg0.method1281();
		} else if (arg1 == 10) {
			this.anInt86 = arg0.method1281();
		} else if (arg1 == 11) {
			this.anInt80 = arg0.method1281();
		} else if (arg1 == 12) {
			local22 = arg0.method1281();
			this.anIntArray6 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray6[local30] = arg0.method1273();
			}
			for (local141 = 0; local141 < local22; local141++) {
				this.anIntArray6[local141] += arg0.method1273() << 16;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
	public void method64() {
		if (this.anInt69 == -1) {
			if (this.anIntArray5 == null) {
				this.anInt69 = 0;
			} else {
				this.anInt69 = 2;
			}
		}
		if (this.anInt86 != -1) {
			return;
		}
		if (this.anIntArray5 == null) {
			this.anInt86 = 0;
		} else {
			this.anInt86 = 2;
		}
	}
}
