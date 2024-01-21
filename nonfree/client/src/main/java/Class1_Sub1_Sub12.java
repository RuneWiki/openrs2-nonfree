import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!pf", name = "fb", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!pf", name = "lb", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
	public int anInt3447 = -1;

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
	public int anInt3450 = 2;

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
	public int anInt3448 = -1;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
	public int anInt3458 = -1;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
	public int anInt3451 = 5;

	@OriginalMember(owner = "client!pf", name = "hb", descriptor = "I")
	public int anInt3461 = 99;

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
	public int anInt3462 = -1;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
	public int anInt3455 = -1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILclient!rg;)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method2399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub5_Sub4 arg2) {
		@Pc(6) int local6 = this.anIntArray307[arg0];
		@Pc(12) Class1_Sub1_Sub16 local12 = Static100.method2071(local6 >> 16);
		@Pc(16) int local16 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg2.method1012(true);
		}
		@Pc(39) int local39 = arg1 & 0x3;
		@Pc(50) Class1_Sub1_Sub5_Sub4 local50 = arg2.method1012(!local12.method2828(local16));
		if (local39 == 1) {
			local50.method1011();
		} else if (local39 == 2) {
			local50.method1009();
		} else if (local39 == 3) {
			local50.method1006();
		}
		local50.method1000(local12, local16);
		if (local39 == 1) {
			local50.method1006();
		} else if (local39 == 2) {
			local50.method1009();
		} else if (local39 == 3) {
			local50.method1011();
		}
		return local50;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!rg;IZ)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method2400(@OriginalArg(0) Class1_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray307[arg1];
		@Pc(23) Class1_Sub1_Sub16 local23 = Static100.method2071(local8 >> 16);
		@Pc(27) int local27 = local8 & 0xFFFF;
		if (local23 == null) {
			return arg0.method995(true);
		} else {
			@Pc(44) Class1_Sub1_Sub5_Sub4 local44 = arg0.method995(!local23.method2828(local27));
			local44.method1000(local23, local27);
			return local44;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!hc;I)V")
	public void method2401(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method544();
			if (local5 == 0) {
				return;
			}
			this.method2405(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "(I)V")
	public void method2404() {
		if (this.anInt3455 == -1) {
			if (this.anIntArray308 == null) {
				this.anInt3455 = 0;
			} else {
				this.anInt3455 = 2;
			}
		}
		if (this.anInt3447 != -1) {
			return;
		}
		if (this.anIntArray308 == null) {
			this.anInt3447 = 0;
		} else {
			this.anInt3447 = 2;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!hc;I)V")
	private void method2405(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		@Pc(105) int local105;
		@Pc(111) int local111;
		@Pc(153) int local153;
		if (arg0 == 1) {
			local105 = arg1.method546();
			this.anIntArray309 = new int[local105];
			for (local111 = 0; local111 < local105; local111++) {
				this.anIntArray309[local111] = arg1.method546();
			}
			this.anIntArray307 = new int[local105];
			for (local153 = 0; local153 < local105; local153++) {
				this.anIntArray307[local153] = arg1.method546();
			}
			for (@Pc(284) int local284 = 0; local284 < local105; local284++) {
				this.anIntArray307[local284] += arg1.method546() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3462 = arg1.method546();
		} else if (arg0 == 3) {
			local105 = arg1.method544();
			this.anIntArray308 = new int[local105 + 1];
			for (local111 = 0; local111 < local105; local111++) {
				this.anIntArray308[local111] = arg1.method544();
			}
			this.anIntArray308[local105] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean151 = true;
		} else if (arg0 == 5) {
			this.anInt3451 = arg1.method544();
		} else if (arg0 == 6) {
			this.anInt3458 = arg1.method546();
		} else if (arg0 == 7) {
			this.anInt3448 = arg1.method546();
		} else if (arg0 == 8) {
			this.anInt3461 = arg1.method544();
		} else if (arg0 == 9) {
			this.anInt3455 = arg1.method544();
		} else if (arg0 == 10) {
			this.anInt3447 = arg1.method544();
		} else if (arg0 == 11) {
			this.anInt3450 = arg1.method544();
		} else if (arg0 == 12) {
			local105 = arg1.method544();
			this.anIntArray305 = new int[local105];
			for (local111 = 0; local111 < local105; local111++) {
				this.anIntArray305[local111] = arg1.method546();
			}
			for (local153 = 0; local153 < local105; local153++) {
				this.anIntArray305[local153] = (arg1.method546() << 16) + this.anIntArray305[local153];
			}
		} else if (arg0 == 13) {
			local105 = arg1.method544();
			this.anIntArray306 = new int[local105];
			for (local111 = 0; local111 < local105; local111++) {
				this.anIntArray306[local111] = arg1.method501();
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!rg;BLclient!pf;I)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method2406(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub5_Sub4 arg1, @OriginalArg(3) Class1_Sub1_Sub12 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = this.anIntArray307[arg0];
		@Pc(22) Class1_Sub1_Sub16 local22 = Static100.method2071(local16 >> 16);
		@Pc(26) int local26 = local16 & 0xFFFF;
		if (local22 == null) {
			return arg2.method2409(arg1, arg3);
		}
		@Pc(39) int local39 = arg2.anIntArray307[arg3];
		@Pc(45) Class1_Sub1_Sub16 local45 = Static100.method2071(local39 >> 16);
		@Pc(49) int local49 = local39 & 0xFFFF;
		@Pc(62) Class1_Sub1_Sub5_Sub4 local62;
		if (local45 == null) {
			local62 = arg1.method1012(!local22.method2828(local26));
			local62.method1000(local22, local26);
			return local62;
		} else {
			local62 = arg1.method1012(!local22.method2828(local26) & !local45.method2828(local49));
			local62.method1004(local22, local26, local45, local49, this.anIntArray308);
			return local62;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!rg;I)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method2407(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub5_Sub4 arg1) {
		@Pc(4) int local4 = this.anIntArray307[arg0];
		@Pc(14) Class1_Sub1_Sub16 local14 = Static100.method2071(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1012(true);
		}
		@Pc(31) int local31 = 0;
		@Pc(33) Class1_Sub1_Sub16 local33 = null;
		if (this.anIntArray305 != null && arg0 < this.anIntArray305.length) {
			local31 = this.anIntArray305[arg0];
			local33 = Static100.method2071(local31 >> 16);
			local31 &= 0xFFFF;
		}
		@Pc(78) Class1_Sub1_Sub5_Sub4 local78;
		if (local33 == null || local31 == 65535) {
			local78 = arg1.method1012(!local14.method2828(local18));
			local78.method1000(local14, local18);
			return local78;
		} else {
			local78 = arg1.method1012(!local14.method2828(local18) & !local33.method2828(local31));
			local78.method1000(local14, local18);
			local78.method1000(local33, local31);
			return local78;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!rg;II)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method2409(@OriginalArg(0) Class1_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray307[arg1];
		@Pc(14) Class1_Sub1_Sub16 local14 = Static100.method2071(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1012(true);
		} else {
			@Pc(35) Class1_Sub1_Sub5_Sub4 local35 = arg0.method1012(!local14.method2828(local18));
			local35.method1000(local14, local18);
			return local35;
		}
	}
}
