import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "S")
	private final short aShort71;

	@OriginalMember(owner = "client!qe", name = "J", descriptor = "Z")
	private final boolean aBoolean363;

	@OriginalMember(owner = "client!qe", name = "V", descriptor = "Z")
	private boolean aBoolean366;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "Z")
	private final boolean aBoolean364;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "B")
	private final byte aByte76;

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "B")
	private final byte aByte77;

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "B")
	private final byte aByte78;

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "Z")
	private final boolean aBoolean365;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "Lclient!e;")
	public Class57 aClass57_7;

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "Lclient!i;")
	private Class5_Sub2_Sub1 aClass5_Sub2_Sub1_6;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIIZIIIIIIZ)V")
	public Class2_Sub1_Sub4(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2983 == 1, Static60.method952(arg12, arg13));
		this.aShort71 = (short) arg1.anInt2994;
		this.aBoolean363 = arg7;
		this.aBoolean366 = arg14;
		this.aBoolean364 = arg1.anInt3001 != 0 && !arg7;
		this.aByte76 = (byte) arg13;
		this.aByte77 = (byte) arg3;
		this.aByte78 = (byte) arg12;
		this.aBoolean365 = arg0.method5821() && arg1.aBoolean192 && !this.aBoolean363 && Static216.aClass1_Sub1_1.method3580(Static146.anInt2644) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean366) {
			local74 |= 0x10000;
		}
		@Pc(89) Class108 local89 = this.method4157(local74, arg0, this.aBoolean365);
		if (local89 != null) {
			this.aClass57_7 = local89.aClass57_5;
			this.aClass5_Sub2_Sub1_6 = local89.aClass5_Sub2_Sub1_4;
			if (this.aBoolean366) {
				this.aClass57_7 = this.aClass57_7.method6066((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return this.method4159(arg0, arg1);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return this.aByte76;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return this.aBoolean365;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!za;ZZ)Lclient!hw;")
	private Class108 method4157(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class114 local18 = Static398.aClass256_4.method5782(this.aShort71 & 0xFFFF);
		@Pc(26) Class125 local26;
		@Pc(30) Class125 local30;
		if (this.aBoolean363) {
			local26 = Static408.aClass125Array2[this.aByte77];
			local30 = Static110.aClass125Array1[0];
		} else {
			local26 = Static110.aClass125Array1[this.aByte77];
			if (this.aByte77 >= 3) {
				local30 = null;
			} else {
				local30 = Static110.aClass125Array1[this.aByte77 + 1];
			}
		}
		return local18.method2407(local26, arg0, this.aByte78 == 11 ? 10 : this.aByte78, super.anInt7501, super.anInt7502, arg1, this.aByte78 == 11 ? this.aByte76 + 4 : this.aByte76, arg2, super.anInt7500, local30);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
		if (this.aClass57_7 != null) {
			this.aClass57_7.method6069();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class2_Sub4_Sub2) {
			@Pc(37) Class2_Sub4_Sub2 local37 = (Class2_Sub4_Sub2) arg3;
			if (this.aClass57_7 == null || local37.aClass57_6 == null) {
				return;
			}
			this.aClass57_7.method6063(local37.aClass57_6, arg2, arg1, arg4, arg5);
		} else if (arg3 instanceof Class2_Sub1_Sub4) {
			@Pc(18) Class2_Sub1_Sub4 local18 = (Class2_Sub1_Sub4) arg3;
			if (this.aClass57_7 != null && local18.aClass57_7 != null) {
				this.aClass57_7.method6063(local18.aClass57_7, arg2, arg1, arg4, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		if (this.aClass57_7 == null) {
			return null;
		}
		@Pc(11) Class29 local11 = arg0.method5866();
		local11.U(super.anInt7500, super.anInt7501, super.anInt7502);
		@Pc(21) Class88_Sub2 local21 = null;
		if (this.aBoolean364) {
			local21 = Static232.method3033(1);
		}
		this.aClass57_7.method6060(local11, local21 == null ? null : local21.aClass88_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)I")
	public int method4158() {
		return this.aClass57_7 == null ? 15 : this.aClass57_7.k() / 4;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		this.aBoolean366 = false;
		if (this.aClass57_7 != null) {
			this.aClass57_7.D(this.aClass57_7.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return this.aByte78;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return this.aShort71 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!za;II)Lclient!e;")
	private Class57 method4159(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass57_7 != null && arg0.method5860(this.aClass57_7.RA(), arg1) == 0) {
			return this.aClass57_7;
		} else {
			@Pc(32) Class108 local32 = this.method4157(arg1, arg0, false);
			return local32 == null ? null : local32.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class57 local14 = this.method4159(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class29 local19 = arg0.method5866();
			local19.U(super.anInt7500, super.anInt7501, super.anInt7502);
			return local14.method6071(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
		@Pc(18) Class5_Sub2_Sub1 local18;
		if (this.aClass5_Sub2_Sub1_6 == null && this.aBoolean365) {
			@Pc(29) Class108 local29 = this.method4157(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass5_Sub2_Sub1_4;
		} else {
			local18 = this.aClass5_Sub2_Sub1_6;
			this.aClass5_Sub2_Sub1_6 = null;
		}
		if (local18 != null) {
			Static79.method1162(local18, this.aByte77, super.anInt7500, super.anInt7502, null);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
		@Pc(31) Class5_Sub2_Sub1 local31;
		if (this.aClass5_Sub2_Sub1_6 == null && this.aBoolean365) {
			@Pc(24) Class108 local24 = this.method4157(262144, arg0, true);
			local31 = local24 == null ? null : local24.aClass5_Sub2_Sub1_4;
		} else {
			local31 = this.aClass5_Sub2_Sub1_6;
			this.aClass5_Sub2_Sub1_6 = null;
		}
		if (local31 != null) {
			Static107.method1478(local31, this.aByte77, super.anInt7500, super.anInt7502, null);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
	@Override
	public int method6031() {
		return this.aClass57_7 == null ? 0 : this.aClass57_7.B();
	}
}
