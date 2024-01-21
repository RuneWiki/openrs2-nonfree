import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
	public int anInt1678 = 5;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	public int anInt1684 = -1;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public int anInt1688 = -1;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
	public int anInt1693 = -1;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
	public int anInt1692 = 99;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	public int anInt1689 = 2;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
	public int anInt1696 = -1;

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
	public int anInt1694 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLclient!sa;I)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1071(@OriginalArg(1) Class2_Sub3_Sub5_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray109[arg1];
		@Pc(14) Class2_Sub3_Sub16 local14 = Static159.method2555(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2306(true);
		} else {
			@Pc(35) Class2_Sub3_Sub5_Sub7 local35 = arg0.method2306(!local14.method2620(local18));
			local35.method2303(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!sa;Lclient!ic;III)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1072(@OriginalArg(0) Class2_Sub3_Sub5_Sub7 arg0, @OriginalArg(1) Class2_Sub3_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray109[arg3];
		@Pc(14) Class2_Sub3_Sub16 local14 = Static159.method2555(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1073(arg0, arg2);
		}
		@Pc(31) int local31 = arg1.anIntArray109[arg2];
		@Pc(42) Class2_Sub3_Sub16 local42 = Static159.method2555(local31 >> 16);
		@Pc(46) int local46 = local31 & 0xFFFF;
		@Pc(59) Class2_Sub3_Sub5_Sub7 local59;
		if (local42 == null) {
			local59 = arg0.method2307(!local14.method2620(local18));
			local59.method2303(local14, local18);
			return local59;
		} else {
			local59 = arg0.method2307(!local14.method2620(local18) & !local42.method2620(local46));
			local59.method2311(local14, local18, local42, local46, this.anIntArray111);
			return local59;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!sa;I)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1073(@OriginalArg(1) Class2_Sub3_Sub5_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anIntArray109[arg1];
		@Pc(25) Class2_Sub3_Sub16 local25 = Static159.method2555(local13 >> 16);
		@Pc(29) int local29 = local13 & 0xFFFF;
		if (local25 == null) {
			return arg0.method2307(true);
		} else {
			@Pc(46) Class2_Sub3_Sub5_Sub7 local46 = arg0.method2307(!local25.method2620(local29));
			local46.method2303(local25, local29);
			return local46;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(BLclient!sa;I)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1074(@OriginalArg(1) Class2_Sub3_Sub5_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anIntArray109[arg1];
		@Pc(19) Class2_Sub3_Sub16 local19 = Static159.method2555(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method2307(true);
		}
		@Pc(31) int local31 = 0;
		@Pc(33) Class2_Sub3_Sub16 local33 = null;
		if (this.anIntArray108 != null && this.anIntArray108.length > arg1) {
			local31 = this.anIntArray108[arg1];
			local33 = Static159.method2555(local31 >> 16);
			local31 &= 0xFFFF;
		}
		@Pc(74) Class2_Sub3_Sub5_Sub7 local74;
		if (local33 == null || local31 == 65535) {
			local74 = arg0.method2307(!local19.method2620(local23));
			local74.method2303(local19, local23);
			return local74;
		} else {
			local74 = arg0.method2307(!local19.method2620(local23) & !local33.method2620(local31));
			local74.method2303(local19, local23);
			local74.method2303(local33, local31);
			return local74;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!me;)V")
	public void method1075(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1402();
			if (local5 == 0) {
				return;
			}
			this.method1079(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZLclient!sa;)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub3_Sub5_Sub7 arg2) {
		@Pc(10) int local10 = this.anIntArray109[arg0];
		@Pc(16) Class2_Sub3_Sub16 local16 = Static159.method2555(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method2307(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(41) Class2_Sub3_Sub5_Sub7 local41 = arg2.method2307(!local16.method2620(local20));
		if (local30 == 1) {
			local41.method2301();
		} else if (local30 == 2) {
			local41.method2299();
		} else if (local30 == 3) {
			local41.method2304();
		}
		local41.method2303(local16, local20);
		if (local30 == 1) {
			local41.method2304();
		} else if (local30 == 2) {
			local41.method2299();
		} else if (local30 == 3) {
			local41.method2301();
		}
		return local41;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public void method1078() {
		if (this.anInt1696 == -1) {
			if (this.anIntArray111 == null) {
				this.anInt1696 = 0;
			} else {
				this.anInt1696 = 2;
			}
		}
		if (this.anInt1688 != -1) {
			return;
		}
		if (this.anIntArray111 == null) {
			this.anInt1688 = 0;
		} else {
			this.anInt1688 = 2;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!me;IB)V")
	private void method1079(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(100) int local100;
		@Pc(106) int local106;
		@Pc(149) int local149;
		if (arg1 == 1) {
			local100 = arg0.method1397();
			this.anIntArray113 = new int[local100];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray113[local106] = arg0.method1397();
			}
			this.anIntArray109 = new int[local100];
			for (local149 = 0; local149 < local100; local149++) {
				this.anIntArray109[local149] = arg0.method1397();
			}
			for (@Pc(276) int local276 = 0; local276 < local100; local276++) {
				this.anIntArray109[local276] += arg0.method1397() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt1694 = arg0.method1397();
		} else if (arg1 == 3) {
			local100 = arg0.method1402();
			this.anIntArray111 = new int[local100 + 1];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray111[local106] = arg0.method1402();
			}
			this.anIntArray111[local100] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean62 = true;
		} else if (arg1 == 5) {
			this.anInt1678 = arg0.method1402();
		} else if (arg1 == 6) {
			this.anInt1684 = arg0.method1397();
		} else if (arg1 == 7) {
			this.anInt1693 = arg0.method1397();
		} else if (arg1 == 8) {
			this.anInt1692 = arg0.method1402();
		} else if (arg1 == 9) {
			this.anInt1696 = arg0.method1402();
		} else if (arg1 == 10) {
			this.anInt1688 = arg0.method1402();
		} else if (arg1 == 11) {
			this.anInt1689 = arg0.method1402();
		} else if (arg1 == 12) {
			local100 = arg0.method1402();
			this.anIntArray108 = new int[local100];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray108[local106] = arg0.method1397();
			}
			for (local149 = 0; local149 < local100; local149++) {
				this.anIntArray108[local149] = (arg0.method1397() << 16) + this.anIntArray108[local149];
			}
		} else if (arg1 == 13) {
			local100 = arg0.method1402();
			this.anIntArray112 = new int[local100];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray112[local106] = arg0.method1406();
			}
			return;
		}
	}
}
