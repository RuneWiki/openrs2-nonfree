import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class16_Sub2_Sub1 extends Class16_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "B")
	private final byte aByte6;

	@OriginalMember(owner = "client!bh", name = "db", descriptor = "S")
	private final short aShort10;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "Z")
	private final boolean aBoolean52;

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "Z")
	private final boolean aBoolean51;

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "Z")
	private final boolean aBoolean50;

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "Lclient!t;")
	private Class110 aClass110_2;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "Lclient!ba;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!ya;Lclient!rd;IIIIZIIIII)V")
	public Class16_Sub2_Sub1(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static348.method4695(arg10, arg11));
		this.aByte6 = (byte) arg11;
		this.aShort10 = (short) arg1.anInt5823;
		super.anInt4552 = arg5;
		this.aBoolean52 = arg6;
		super.anInt4566 = arg3;
		this.aByte7 = (byte) arg10;
		this.aBoolean51 = arg1.anInt5813 != 0 && !arg6;
		this.aByte8 = (byte) arg2;
		this.aBoolean50 = arg0.method4242() && arg1.aBoolean526 && !this.aBoolean52 && Static323.aClass50_Sub1_1.method2850(Static177.anInt2973) != 0;
		@Pc(77) Class149 local77 = this.method572(2048, this.aBoolean50, arg0);
		if (local77 != null) {
			this.aClass110_2 = local77.aClass110_5;
			this.aClass4_Sub1_Sub4_1 = local77.aClass4_Sub1_Sub4_4;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5349(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class4_Sub1_Sub4 local14;
		if (this.aClass4_Sub1_Sub4_1 == null && this.aBoolean50) {
			@Pc(25) Class149 local25 = this.method572(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass4_Sub1_Sub4_4;
		} else {
			local14 = this.aClass4_Sub1_Sub4_1;
			this.aClass4_Sub1_Sub4_1 = null;
		}
		if (local14 != null) {
			Static110.method2015(local14, this.aByte8, super.anInt4566, super.anInt4552, null);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZILclient!ya;)Lclient!mg;")
	private Class149 method572(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(18) Class202 local18 = Static267.aClass262_2.method5560(this.aShort10 & 0xFFFF);
		@Pc(26) Class65 local26;
		@Pc(30) Class65 local30;
		if (this.aBoolean52) {
			local26 = Static285.aClass65Array3[this.aByte8];
			local30 = Static67.aClass65Array1[0];
		} else {
			if (this.aByte8 >= 3) {
				local30 = null;
			} else {
				local30 = Static67.aClass65Array1[this.aByte8 + 1];
			}
			local26 = Static67.aClass65Array1[this.aByte8];
		}
		return local18.method4589(arg2, super.anInt4566, arg0, super.anInt4559, arg1, this.aByte6, local30, super.anInt4552, this.aByte7, local26);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	@Override
	public Class110 method5352(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return this.method574(arg1, arg0);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	@Override
	public void method5353() {
		if (this.aClass110_2 != null) {
			this.aClass110_2.method4886();
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)I")
	@Override
	public int method5354() {
		return this.aByte7;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5348(@OriginalArg(0) Class19 arg0) {
		@Pc(20) Class4_Sub1_Sub4 local20;
		if (this.aClass4_Sub1_Sub4_1 == null && this.aBoolean50) {
			@Pc(31) Class149 local31 = this.method572(262144, true, arg0);
			local20 = local31 == null ? null : local31.aClass4_Sub1_Sub4_4;
		} else {
			local20 = this.aClass4_Sub1_Sub4_1;
			this.aClass4_Sub1_Sub4_1 = null;
		}
		if (local20 != null) {
			Static52.method844(local20, this.aByte8, super.anInt4566, super.anInt4552, null);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return this.aByte6;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class110 local13 = this.method574(131072, arg1);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class31 local18 = arg1.method4289();
			local18.j(super.anInt4566, super.anInt4559, super.anInt4552);
			return local13.method4894(arg2, arg0, local18, false);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
	@Override
	public int method5350() {
		return this.aShort10 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)I")
	@Override
	public int method3583() {
		return this.aClass110_2 == null ? 0 : this.aClass110_2.MA();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5351() {
		return this.aBoolean50;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!ya;B)Lclient!t;")
	private Class110 method574(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1) {
		if (this.aClass110_2 != null && arg1.method4269(this.aClass110_2.P(), arg0) == 0) {
			return this.aClass110_2;
		} else {
			@Pc(33) Class149 local33 = this.method572(arg0, false, arg1);
			return local33 == null ? null : local33.aClass110_5;
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		if (this.aClass110_2 == null) {
			return null;
		}
		@Pc(16) Class31 local16 = arg0.method4289();
		local16.j(super.anInt4566 + super.anInt4550, super.anInt4559, super.anInt4551 + super.anInt4552);
		@Pc(32) Class3_Sub3 local32 = null;
		if (this.aBoolean51) {
			local32 = Static38.method672(1);
		}
		this.aClass110_2.method4889(local16, local32 == null ? null : local32.aClass3_Sub5Array1[0], 0);
		return local32;
	}
}
