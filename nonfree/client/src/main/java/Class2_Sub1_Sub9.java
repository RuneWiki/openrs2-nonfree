import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!he", name = "ub", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!he", name = "Bb", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!he", name = "Hb", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!he", name = "Nb", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!he", name = "yb", descriptor = "I")
	public int anInt1430 = -1;

	@OriginalMember(owner = "client!he", name = "Eb", descriptor = "I")
	public int anInt1432 = -1;

	@OriginalMember(owner = "client!he", name = "Lb", descriptor = "I")
	public int anInt1436 = 2;

	@OriginalMember(owner = "client!he", name = "Fb", descriptor = "I")
	public int anInt1433 = -1;

	@OriginalMember(owner = "client!he", name = "Rb", descriptor = "I")
	public int anInt1438 = -1;

	@OriginalMember(owner = "client!he", name = "Wb", descriptor = "I")
	public int anInt1442 = 5;

	@OriginalMember(owner = "client!he", name = "Xb", descriptor = "I")
	public int anInt1443 = 99;

	@OriginalMember(owner = "client!he", name = "Zb", descriptor = "I")
	public int anInt1444 = -1;

	@OriginalMember(owner = "client!he", name = "Yb", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!pa;Lclient!he;IIB)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method977(@OriginalArg(0) Class2_Sub1_Sub1_Sub5 arg0, @OriginalArg(1) Class2_Sub1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anIntArray147[arg2];
		@Pc(14) Class2_Sub1_Sub16 local14 = Static90.method1572(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method986(arg3, arg0);
		}
		@Pc(31) int local31 = arg1.anIntArray147[arg3];
		@Pc(37) Class2_Sub1_Sub16 local37 = Static90.method1572(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class2_Sub1_Sub1_Sub5 local54;
		if (local37 == null) {
			local54 = arg0.method1418(!local14.method1613(local18));
			local54.method1426(local14, local18);
			return local54;
		} else {
			local54 = arg0.method1418(!local14.method1613(local18) & !local37.method1613(local41));
			local54.method1410(local14, local18, local37, local41, this.anIntArray145);
			return local54;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public void method978() {
		if (this.anInt1432 == -1) {
			if (this.anIntArray145 == null) {
				this.anInt1432 = 0;
			} else {
				this.anInt1432 = 2;
			}
		}
		if (this.anInt1430 != -1) {
			return;
		}
		if (this.anIntArray145 == null) {
			this.anInt1430 = 0;
		} else {
			this.anInt1430 = 2;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZLclient!pa;I)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method980(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub5 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray147[arg0];
		@Pc(16) Class2_Sub1_Sub16 local16 = Static90.method1572(local10 >> 16);
		@Pc(26) int local26 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1418(true);
		}
		@Pc(36) int local36 = arg2 & 0x3;
		@Pc(47) Class2_Sub1_Sub1_Sub5 local47 = arg1.method1418(!local16.method1613(local26));
		if (local36 == 1) {
			local47.method1425();
		} else if (local36 == 2) {
			local47.method1420();
		} else if (local36 == 3) {
			local47.method1414();
		}
		local47.method1426(local16, local26);
		if (local36 == 1) {
			local47.method1414();
		} else if (local36 == 2) {
			local47.method1420();
		} else if (local36 == 3) {
			local47.method1425();
		}
		return local47;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!ba;)V")
	public void method981(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method791();
			if (local9 == 0) {
				return;
			}
			this.method982(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!ba;)V")
	private void method982(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(49) int local49;
		if (arg0 == 1) {
			local20 = arg1.method791();
			this.anIntArray144 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray144[local26] = arg1.method792();
			}
			this.anIntArray147 = new int[local20];
			for (local49 = 0; local49 < local20; local49++) {
				this.anIntArray147[local49] = arg1.method792();
			}
			for (@Pc(68) int local68 = 0; local68 < local20; local68++) {
				this.anIntArray147[local68] += arg1.method792() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1444 = arg1.method792();
		} else if (arg0 == 3) {
			local20 = arg1.method791();
			this.anIntArray145 = new int[local20 + 1];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray145[local26] = arg1.method791();
			}
			this.anIntArray145[local20] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean71 = true;
		} else if (arg0 == 5) {
			this.anInt1442 = arg1.method791();
		} else if (arg0 == 6) {
			this.anInt1433 = arg1.method792();
		} else if (arg0 == 7) {
			this.anInt1438 = arg1.method792();
		} else if (arg0 == 8) {
			this.anInt1443 = arg1.method791();
		} else if (arg0 == 9) {
			this.anInt1430 = arg1.method791();
		} else if (arg0 == 10) {
			this.anInt1432 = arg1.method791();
		} else if (arg0 == 11) {
			this.anInt1436 = arg1.method791();
			return;
		} else if (arg0 == 12) {
			local20 = arg1.method791();
			this.anIntArray146 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray146[local26] = arg1.method792();
			}
			for (local49 = 0; local49 < local20; local49++) {
				this.anIntArray146[local49] += arg1.method792() << 16;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!pa;I)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method984(@OriginalArg(1) Class2_Sub1_Sub1_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray147[arg1];
		@Pc(14) Class2_Sub1_Sub16 local14 = Static90.method1572(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1407(true);
		} else {
			@Pc(40) Class2_Sub1_Sub1_Sub5 local40 = arg0.method1407(!local14.method1613(local18));
			local40.method1426(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!pa;Z)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method985(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub5 arg1) {
		@Pc(8) int local8 = this.anIntArray147[arg0];
		@Pc(14) Class2_Sub1_Sub16 local14 = Static90.method1572(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1418(true);
		}
		@Pc(33) Class2_Sub1_Sub16 local33 = null;
		@Pc(35) int local35 = 0;
		if (this.anIntArray146 != null && this.anIntArray146.length > arg0) {
			local35 = this.anIntArray146[arg0];
			local33 = Static90.method1572(local35 >> 16);
			local35 &= 0xFFFF;
		}
		@Pc(80) Class2_Sub1_Sub1_Sub5 local80;
		if (local33 == null || local35 == 65535) {
			local80 = arg1.method1418(!local14.method1613(local18));
			local80.method1426(local14, local18);
			return local80;
		} else {
			local80 = arg1.method1418(!local14.method1613(local18) & !local33.method1613(local35));
			local80.method1426(local14, local18);
			local80.method1426(local33, local35);
			return local80;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(ILclient!pa;Z)Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 method986(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub5 arg1) {
		@Pc(10) int local10 = this.anIntArray147[arg0];
		@Pc(20) Class2_Sub1_Sub16 local20 = Static90.method1572(local10 >> 16);
		@Pc(24) int local24 = local10 & 0xFFFF;
		if (local20 == null) {
			return arg1.method1418(true);
		} else {
			@Pc(41) Class2_Sub1_Sub1_Sub5 local41 = arg1.method1418(!local20.method1613(local24));
			local41.method1426(local20, local24);
			return local41;
		}
	}
}
