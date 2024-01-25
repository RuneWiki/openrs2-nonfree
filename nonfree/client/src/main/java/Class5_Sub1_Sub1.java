import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "B")
	private final byte aByte1;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Z")
	private final boolean aBoolean12;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "S")
	private final short aShort1;

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "Z")
	private final boolean aBoolean14;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "Lclient!qb;")
	private Class124 aClass124_1;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Lclient!c;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!tj;Lclient!qr;IIIIZIIIII)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static65.method1710(arg11, arg10));
		this.aByte1 = (byte) arg11;
		this.aByte3 = (byte) arg10;
		super.anInt3103 = (short) arg5;
		this.aBoolean12 = arg1.anInt5227 != 0;
		super.anInt3089 = (short) arg3;
		this.aBoolean11 = arg6;
		this.aByte2 = (byte) arg2;
		this.aShort1 = (short) arg1.anInt5232;
		this.aBoolean14 = arg0.method4804() && arg1.aBoolean312 && !this.aBoolean11 && Static77.anInt1520 != 0;
		@Pc(74) Class111 local74 = this.method93(arg0, this.aBoolean14, 1024);
		if (local74 != null) {
			this.aClass124_1 = local74.aClass124_3;
			this.aClass3_Sub7_Sub3_1 = local74.aClass3_Sub7_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5341(@OriginalArg(1) Class122 arg0) {
		@Pc(31) Class3_Sub7_Sub3 local31;
		if (this.aClass3_Sub7_Sub3_1 == null && this.aBoolean14) {
			@Pc(24) Class111 local24 = this.method93(arg0, true, 131072);
			local31 = local24 == null ? null : local24.aClass3_Sub7_Sub3_3;
		} else {
			local31 = this.aClass3_Sub7_Sub3_1;
			this.aClass3_Sub7_Sub3_1 = null;
		}
		if (local31 != null) {
			Static351.method5704(local31, this.aByte2, super.anInt3089, super.anInt3103, null);
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)I")
	@Override
	public int method2536() {
		return this.aClass124_1 == null ? 0 : this.aClass124_1.method4106();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!tj;II)Lclient!qb;")
	private Class124 method91(@OriginalArg(0) Class122 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass124_1 != null && arg0.method4766(this.aClass124_1.method4108(), arg1) == 0) {
			return this.aClass124_1;
		} else {
			@Pc(31) Class111 local31 = this.method93(arg0, false, arg1);
			return local31 == null ? null : local31.aClass124_3;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5338() {
		return this.aBoolean14;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
	@Override
	public int method5342() {
		return this.aByte3;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!tj;IB)Lclient!qb;")
	@Override
	public Class124 method5339(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		return this.method91(arg0, arg1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5340(@OriginalArg(1) Class122 arg0) {
		@Pc(25) Class3_Sub7_Sub3 local25;
		if (this.aClass3_Sub7_Sub3_1 == null && this.aBoolean14) {
			@Pc(18) Class111 local18 = this.method93(arg0, true, 131072);
			local25 = local18 == null ? null : local18.aClass3_Sub7_Sub3_3;
		} else {
			local25 = this.aClass3_Sub7_Sub3_1;
			this.aClass3_Sub7_Sub3_1 = null;
		}
		if (local25 != null) {
			Static103.method1738(local25, this.aByte2, super.anInt3089, super.anInt3103, null);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		if (this.aClass124_1 == null) {
			return null;
		}
		@Pc(19) Class56 local19 = arg0.method4739();
		local19.method4683(super.anInt3089 + super.anInt3101, super.anInt3095, super.anInt3099 + super.anInt3103);
		@Pc(36) Class8_Sub7 local36 = null;
		if (this.aBoolean12) {
			local36 = Static97.method1655(1);
		}
		this.aClass124_1.method4079(local19, local36 == null ? null : local36.aClass8_Sub2Array1[0], 0);
		return local36;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	@Override
	public int method5337() {
		return this.aByte1;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	@Override
	public void method5343() {
		if (this.aClass124_1 != null) {
			this.aClass124_1.method4104();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!tj;ZII)Lclient!jl;")
	private Class111 method93(@OriginalArg(0) Class122 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class170 local19 = Static268.method4553(this.aShort1 & 0xFFFF);
		@Pc(27) Class22 local27;
		@Pc(31) Class22 local31;
		if (this.aBoolean11) {
			local27 = Static182.aClass22Array2[this.aByte2];
			local31 = Static355.aClass22Array3[0];
		} else {
			if (this.aByte2 < 3) {
				local31 = Static355.aClass22Array3[this.aByte2 + 1];
			} else {
				local31 = null;
			}
			local27 = Static355.aClass22Array3[this.aByte2];
		}
		return local19.method4417(super.anInt3103, arg1, this.aByte1, arg2, this.aByte3, super.anInt3095, local31, arg0, local27, super.anInt3089);
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)I")
	@Override
	public int method5344() {
		return this.aShort1 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class124 local13 = this.method91(arg1, 65536);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class56 local18 = arg1.method4739();
			local18.method4683(super.anInt3089, super.anInt3095, super.anInt3103);
			return local13.method4116(arg2, arg0, local18, false);
		}
	}
}
