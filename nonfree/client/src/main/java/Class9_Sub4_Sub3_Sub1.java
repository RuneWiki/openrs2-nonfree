import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class9_Sub4_Sub3_Sub1 extends Class9_Sub4_Sub3 implements Interface22 {

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "Lclient!oia;")
	private Class243 aClass243_2;

	@OriginalMember(owner = "client!lo", name = "S", descriptor = "Z")
	private boolean aBoolean512;

	@OriginalMember(owner = "client!lo", name = "Y", descriptor = "S")
	private final short aShort76;

	@OriginalMember(owner = "client!lo", name = "db", descriptor = "Z")
	private final boolean aBoolean513;

	@OriginalMember(owner = "client!lo", name = "gb", descriptor = "Z")
	private final boolean aBoolean514;

	@OriginalMember(owner = "client!lo", name = "Z", descriptor = "B")
	private final byte aByte77;

	@OriginalMember(owner = "client!lo", name = "ib", descriptor = "Z")
	private final boolean aBoolean515;

	@OriginalMember(owner = "client!lo", name = "hb", descriptor = "Lclient!ka;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!lo", name = "cb", descriptor = "Lclient!r;")
	private Class6_Sub5_Sub10 aClass6_Sub5_Sub10_1;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ha;Lclient!vha;IIIIIZIZ)V")
	public Class9_Sub4_Sub3_Sub1(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt10216);
		this.aBoolean512 = arg9;
		this.aShort76 = (short) arg1.anInt10211;
		super.anInt10360 = arg4;
		this.aBoolean513 = arg7;
		this.aBoolean514 = arg1.anInt10253 != 0 && !arg7;
		super.anInt10357 = arg6;
		this.aByte77 = (byte) arg8;
		this.aBoolean515 = arg0.method6134() && arg1.aBoolean793 && !this.aBoolean513 && Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean512) {
			local63 |= 0x10000;
		}
		@Pc(78) Class307 local78 = this.method5483(arg0, this.aBoolean515, local63);
		if (local78 != null) {
			this.aClass92_1 = local78.aClass92_4;
			this.aClass6_Sub5_Sub10_1 = local78.aClass6_Sub5_Sub10_3;
			if (this.aBoolean512) {
				this.aClass92_1 = this.aClass92_1.method7069((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return this.aBoolean512;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8439(@OriginalArg(1) Class5 arg0) {
		@Pc(29) Class6_Sub5_Sub10 local29;
		if (this.aClass6_Sub5_Sub10_1 == null && this.aBoolean515) {
			@Pc(22) Class307 local22 = this.method5483(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass6_Sub5_Sub10_3;
		} else {
			local29 = this.aClass6_Sub5_Sub10_1;
			this.aClass6_Sub5_Sub10_1 = null;
		}
		if (local29 != null) {
			Static471.method4227(local29, super.aByte134, super.anInt10360, super.anInt10357, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	@Override
	public int method8436() {
		return this.aShort76 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I")
	@Override
	public int method8438() {
		return this.aByte77;
	}

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aClass92_1 == null ? false : this.aClass92_1.F();
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)I")
	@Override
	public int method8435() {
		return 22;
	}

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return this.aClass92_1 == null ? 0 : this.aClass92_1.fa();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLclient!ha;ZI)Lclient!sfa;")
	private Class307 method5483(@OriginalArg(1) Class5 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class356 local18 = Static249.aClass310_1.method7474(this.aShort76 & 0xFFFF);
		@Pc(26) Class245 local26;
		@Pc(37) Class245 local37;
		if (this.aBoolean513) {
			local26 = Static152.aClass245Array3[super.aByte134];
			local37 = Static150.aClass245Array2[0];
		} else {
			local26 = Static150.aClass245Array2[super.aByte134];
			if (super.aByte134 < 3) {
				local37 = Static150.aClass245Array2[super.aByte134 + 1];
			} else {
				local37 = null;
			}
		}
		return local18.method8321(super.anInt10357, local37, this.aByte77, super.anInt10365, arg1, super.anInt10360, arg2, (Class200) null, local26, arg0, 22);
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		if (this.aClass92_1 == null) {
			return true;
		} else {
			return !this.aClass92_1.r();
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class92 local14 = this.method5485(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class115 local19 = arg1.method6156();
			local19.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			return Static423.aBoolean622 ? local14.method7061(arg0, arg2, local19, false, 0, Static32.anInt849) : local14.method7067(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return 68;
		} else if (this.aClass92_1 == null) {
			return 0;
		} else {
			return this.aClass92_1.ma();
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		if (this.aClass243_2 == null) {
			this.aClass243_2 = Static126.method2627(super.anInt10365, super.anInt10360, this.method5485(0, arg0), super.anInt10357);
		}
		return this.aClass243_2;
	}

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		this.aBoolean512 = false;
		if (this.aClass92_1 != null) {
			this.aClass92_1.s(this.aClass92_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class92 method5485(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1) {
		if (this.aClass92_1 != null && arg1.method6147(this.aClass92_1.ua(), arg0) == 0) {
			return this.aClass92_1;
		} else {
			@Pc(26) Class307 local26 = this.method5483(arg1, false, arg0);
			return local26 == null ? null : local26.aClass92_4;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8434(@OriginalArg(0) Class5 arg0) {
		@Pc(34) Class6_Sub5_Sub10 local34;
		if (this.aClass6_Sub5_Sub10_1 == null && this.aBoolean515) {
			@Pc(27) Class307 local27 = this.method5483(arg0, true, 262144);
			local34 = local27 == null ? null : local27.aClass6_Sub5_Sub10_3;
		} else {
			local34 = this.aClass6_Sub5_Sub10_1;
			this.aClass6_Sub5_Sub10_1 = null;
		}
		if (local34 != null) {
			Static346.method5709(local34, super.aByte134, super.anInt10360, super.anInt10357, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8437() {
		return this.aBoolean515;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!(arg0 instanceof Class9_Sub4_Sub3_Sub1)) {
			return;
		}
		@Pc(17) Class9_Sub4_Sub3_Sub1 local17 = (Class9_Sub4_Sub3_Sub1) arg0;
		if (this.aClass92_1 != null && local17.aClass92_1 != null) {
			this.aClass92_1.method7060(local17.aClass92_1, arg2, arg4, arg5, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		if (this.aClass92_1 == null) {
			return null;
		}
		@Pc(17) Class115 local17 = arg0.method6156();
		local17.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
		@Pc(31) Class9_Sub2 local31 = Static167.method3172(1, this.aBoolean514);
		if (Static423.aBoolean622) {
			this.aClass92_1.method7057(local17, local31.aClass9_Sub6Array1[0], Static32.anInt849, 0);
		} else {
			this.aClass92_1.method7053(local17, local31.aClass9_Sub6Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	@Override
	public void method8433() {
		if (this.aClass92_1 != null) {
			this.aClass92_1.method7054();
		}
	}
}
