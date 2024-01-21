import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class5_Sub2_Sub22 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!ta", name = "eb", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	public int anInt3646 = -1;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
	public int anInt3644 = -1;

	@OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
	public int anInt3654 = -1;

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
	public int anInt3652 = 5;

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
	public int anInt3657 = -1;

	@OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
	public int anInt3653 = 99;

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
	public int anInt3661 = -1;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
	public int anInt3662 = 2;

	@OriginalMember(owner = "client!ta", name = "fb", descriptor = "Z")
	public boolean aBoolean168 = false;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!a;IZ)Lclient!a;")
	public Class1_Sub1 method2752(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray374[arg1];
		@Pc(14) Class5_Sub2_Sub16 local14 = Static120.method1908(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method660(true, true);
		} else {
			@Pc(42) Class1_Sub1 local42 = arg0.method660(!local14.method2262(local18), !this.aBoolean167);
			local42.method675(local14, local18, this.aBoolean167);
			return local42;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBLclient!a;)Lclient!a;")
	public Class1_Sub1 method2755(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		@Pc(8) int local8 = this.anIntArray374[arg0];
		@Pc(21) Class5_Sub2_Sub16 local21 = Static120.method1908(local8 >> 16);
		@Pc(25) int local25 = local8 & 0xFFFF;
		if (local21 == null) {
			return arg1.method670(true, true);
		} else {
			@Pc(49) Class1_Sub1 local49 = arg1.method670(!local21.method2262(local25), !this.aBoolean167);
			local49.method675(local21, local25, this.aBoolean167);
			return local49;
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
	public void method2756() {
		if (this.anInt3654 == -1) {
			if (this.anIntArray378 == null) {
				this.anInt3654 = 0;
			} else {
				this.anInt3654 = 2;
			}
		}
		if (this.anInt3661 != -1) {
			return;
		}
		if (this.anIntArray378 == null) {
			this.anInt3661 = 0;
		} else {
			this.anInt3661 = 2;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!ce;)V")
	public void method2757(@OriginalArg(1) Class5_Sub6 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3062();
			if (local15 == 0) {
				return;
			}
			this.method2763(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!a;IB)Lclient!a;")
	public Class1_Sub1 method2759(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anIntArray374[arg1];
		@Pc(25) Class5_Sub2_Sub16 local25 = Static120.method1908(local15 >> 16);
		@Pc(29) int local29 = local15 & 0xFFFF;
		if (local25 == null) {
			return arg0.method670(true, true);
		}
		@Pc(38) int local38 = 0;
		@Pc(40) Class5_Sub2_Sub16 local40 = null;
		if (this.anIntArray377 != null && arg1 < this.anIntArray377.length) {
			local38 = this.anIntArray377[arg1];
			local40 = Static120.method1908(local38 >> 16);
			local38 &= 0xFFFF;
		}
		@Pc(91) Class1_Sub1 local91;
		if (local40 == null || local38 == 65535) {
			local91 = arg0.method670(!local25.method2262(local29), !this.aBoolean167);
			local91.method675(local25, local29, this.aBoolean167);
			return local91;
		} else {
			local91 = arg0.method670(!local25.method2262(local29) & !local40.method2262(local38), !this.aBoolean167);
			local91.method675(local25, local29, this.aBoolean167);
			local91.method675(local40, local38, this.aBoolean167);
			return local91;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBLclient!a;)Lclient!a;")
	public Class1_Sub1 method2760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1 arg2) {
		@Pc(10) int local10 = this.anIntArray374[arg1];
		@Pc(21) Class5_Sub2_Sub16 local21 = Static120.method1908(local10 >> 16);
		@Pc(25) int local25 = local10 & 0xFFFF;
		if (local21 == null) {
			return arg2.method670(true, true);
		}
		@Pc(49) Class1_Sub1 local49 = arg2.method670(!local21.method2262(local25), !this.aBoolean167);
		@Pc(53) int local53 = arg0 & 0x3;
		if (local53 == 1) {
			local49.method662();
		} else if (local53 == 2) {
			local49.method661();
		} else if (local53 == 3) {
			local49.method664();
		}
		local49.method675(local21, local25, this.aBoolean167);
		if (local53 == 1) {
			local49.method664();
		} else if (local53 == 2) {
			local49.method661();
		} else if (local53 == 3) {
			local49.method662();
		}
		return local49;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ta;ILclient!a;II)Lclient!a;")
	public Class1_Sub1 method2762(@OriginalArg(0) Class5_Sub2_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray374[arg3];
		@Pc(14) Class5_Sub2_Sub16 local14 = Static120.method1908(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2755(arg1, arg2);
		}
		@Pc(31) int local31 = arg0.anIntArray374[arg1];
		@Pc(37) Class5_Sub2_Sub16 local37 = Static120.method1908(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(60) Class1_Sub1 local60;
		if (local37 == null) {
			local60 = arg2.method670(!local14.method2262(local18), !this.aBoolean167);
			local60.method675(local14, local18, this.aBoolean167);
			return local60;
		} else {
			local60 = arg2.method670(!local14.method2262(local18) & !local37.method2262(local41), !arg0.aBoolean167 & !this.aBoolean167);
			local60.method658(local14, local18, local37, local41, this.anIntArray378, arg0.aBoolean167 | this.aBoolean167);
			return local60;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BILclient!ce;)V")
	private void method2763(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub6 arg1) {
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(185) int local185;
		if (arg0 == 1) {
			local30 = arg1.method3077();
			this.anIntArray375 = new int[local30];
			for (local38 = 0; local38 < local30; local38++) {
				this.anIntArray375[local38] = arg1.method3077();
			}
			this.anIntArray374 = new int[local30];
			for (local185 = 0; local185 < local30; local185++) {
				this.anIntArray374[local185] = arg1.method3077();
			}
			for (@Pc(274) int local274 = 0; local274 < local30; local274++) {
				this.anIntArray374[local274] = (arg1.method3077() << 16) + this.anIntArray374[local274];
			}
		} else if (arg0 == 2) {
			this.anInt3657 = arg1.method3077();
		} else if (arg0 == 3) {
			local30 = arg1.method3062();
			this.anIntArray378 = new int[local30 + 1];
			for (local38 = 0; local38 < local30; local38++) {
				this.anIntArray378[local38] = arg1.method3062();
			}
			this.anIntArray378[local30] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean168 = true;
		} else if (arg0 == 5) {
			this.anInt3652 = arg1.method3062();
		} else if (arg0 == 6) {
			this.anInt3644 = arg1.method3077();
		} else if (arg0 == 7) {
			this.anInt3646 = arg1.method3077();
		} else if (arg0 == 8) {
			this.anInt3653 = arg1.method3062();
		} else if (arg0 == 9) {
			this.anInt3661 = arg1.method3062();
		} else if (arg0 == 10) {
			this.anInt3654 = arg1.method3062();
		} else if (arg0 == 11) {
			this.anInt3662 = arg1.method3062();
		} else if (arg0 == 12) {
			local30 = arg1.method3062();
			this.anIntArray377 = new int[local30];
			for (local38 = 0; local38 < local30; local38++) {
				this.anIntArray377[local38] = arg1.method3077();
			}
			for (local185 = 0; local185 < local30; local185++) {
				this.anIntArray377[local185] += arg1.method3077() << 16;
			}
		} else if (arg0 == 13) {
			local30 = arg1.method3062();
			this.anIntArray376 = new int[local30];
			for (local38 = 0; local38 < local30; local38++) {
				this.anIntArray376[local38] = arg1.method3072();
			}
			return;
		} else if (arg0 == 14) {
			this.aBoolean167 = true;
			return;
		}
	}
}
