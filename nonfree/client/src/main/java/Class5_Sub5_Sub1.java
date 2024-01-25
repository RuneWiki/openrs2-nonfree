import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 implements Interface5 {

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "B")
	private final byte aByte48;

	@OriginalMember(owner = "client!qk", name = "P", descriptor = "Z")
	private final boolean aBoolean294;

	@OriginalMember(owner = "client!qk", name = "db", descriptor = "S")
	private final short aShort81;

	@OriginalMember(owner = "client!qk", name = "S", descriptor = "Z")
	private final boolean aBoolean295;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "B")
	private final byte aByte47;

	@OriginalMember(owner = "client!qk", name = "C", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!qk", name = "H", descriptor = "Z")
	private boolean aBoolean293;

	@OriginalMember(owner = "client!qk", name = "V", descriptor = "Z")
	private final boolean aBoolean296;

	@OriginalMember(owner = "client!qk", name = "B", descriptor = "Lclient!c;")
	private Class3_Sub7_Sub3 aClass3_Sub7_Sub3_4;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "Lclient!qb;")
	public Class124 aClass124_4;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!tj;Lclient!qr;IIIIZIIZ)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static76.method1151(arg7, arg8));
		this.aByte48 = (byte) arg7;
		super.anInt6288 = (short) arg3;
		this.aBoolean294 = arg6;
		this.aShort81 = (short) arg1.anInt5232;
		this.aBoolean295 = arg1.anInt5227 != 0;
		this.aByte47 = (byte) arg8;
		this.aByte49 = (byte) arg2;
		super.anInt6286 = (short) arg5;
		this.aBoolean293 = arg9;
		this.aBoolean296 = arg0.method4804() && arg1.aBoolean312 && !this.aBoolean294 && Static77.anInt1520 != 0;
		@Pc(68) int local68 = 1024;
		if (this.aBoolean293) {
			local68 |= 0x8000;
		}
		@Pc(83) Class111 local83 = this.method4303(this.aBoolean296, arg0, local68);
		if (local83 != null) {
			this.aClass3_Sub7_Sub3_4 = local83.aClass3_Sub7_Sub3_3;
			this.aClass124_4 = local83.aClass124_3;
			if (this.aBoolean293) {
				this.aClass124_4 = this.aClass124_4.method4094((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)I")
	@Override
	public int method5337() {
		return this.aByte47;
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		this.aBoolean293 = false;
		if (this.aClass124_4 != null) {
			this.aClass124_4.method4080(this.aClass124_4.method4108() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5338() {
		return this.aBoolean296;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!tj;B)Lclient!qb;")
	private Class124 method4296(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1) {
		if (this.aClass124_4 != null && arg1.method4766(this.aClass124_4.method4108(), arg0) == 0) {
			return this.aClass124_4;
		} else {
			@Pc(33) Class111 local33 = this.method4303(false, arg1, arg0);
			return local33 == null ? null : local33.aClass124_3;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!tj;IB)Lclient!qb;")
	@Override
	public Class124 method5339(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		return this.method4296(arg1, arg0);
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	@Override
	public void method5343() {
		if (this.aClass124_4 != null) {
			this.aClass124_4.method4104();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return this.aBoolean293;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)I")
	@Override
	public int method5344() {
		return this.aShort81 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5341(@OriginalArg(1) Class122 arg0) {
		@Pc(14) Class3_Sub7_Sub3 local14;
		if (this.aClass3_Sub7_Sub3_4 == null && this.aBoolean296) {
			@Pc(25) Class111 local25 = this.method4303(true, arg0, 131072);
			local14 = local25 == null ? null : local25.aClass3_Sub7_Sub3_3;
		} else {
			local14 = this.aClass3_Sub7_Sub3_4;
			this.aClass3_Sub7_Sub3_4 = null;
		}
		if (local14 != null) {
			Static351.method5704(local14, this.aByte49, super.anInt6288, super.anInt6286, null);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class124 local13 = this.method4296(65536, arg1);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class56 local18 = arg1.method4739();
			local18.method4683(super.anInt6288, super.anInt6284, super.anInt6286);
			return local13.method4116(arg2, arg0, local18, false);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		if (this.aClass124_4 == null) {
			return null;
		}
		@Pc(16) Class56 local16 = arg0.method4739();
		local16.method4683(super.anInt6288, super.anInt6284, super.anInt6286);
		@Pc(26) Class8_Sub7 local26 = null;
		if (this.aBoolean295) {
			local26 = Static97.method1655(1);
		}
		this.aClass124_4.method4079(local16, local26 == null ? null : local26.aClass8_Sub2Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
	@Override
	public int method5342() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class5_Sub5_Sub1) {
			@Pc(32) Class5_Sub5_Sub1 local32 = (Class5_Sub5_Sub1) arg4;
			if (this.aClass124_4 != null && local32.aClass124_4 != null) {
				this.aClass124_4.method4086(local32.aClass124_4, arg5, arg2, arg0, arg3);
			}
		} else if (arg4 instanceof Class5_Sub4_Sub5) {
			@Pc(12) Class5_Sub4_Sub5 local12 = (Class5_Sub4_Sub5) arg4;
			if (this.aClass124_4 != null && local12.aClass124_7 != null) {
				this.aClass124_4.method4086(local12.aClass124_7, arg5, arg2, arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!tj;)V")
	@Override
	public void method5340(@OriginalArg(1) Class122 arg0) {
		@Pc(21) Class3_Sub7_Sub3 local21;
		if (this.aClass3_Sub7_Sub3_4 == null && this.aBoolean296) {
			@Pc(32) Class111 local32 = this.method4303(true, arg0, 131072);
			local21 = local32 == null ? null : local32.aClass3_Sub7_Sub3_3;
		} else {
			local21 = this.aClass3_Sub7_Sub3_4;
			this.aClass3_Sub7_Sub3_4 = null;
		}
		if (local21 != null) {
			Static103.method1738(local21, this.aByte49, super.anInt6288, super.anInt6286, null);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLclient!tj;IB)Lclient!jl;")
	private Class111 method4303(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class170 local18 = Static268.method4553(this.aShort81 & 0xFFFF);
		@Pc(41) Class22 local41;
		@Pc(32) Class22 local32;
		if (this.aBoolean294) {
			local32 = Static355.aClass22Array3[0];
			local41 = Static182.aClass22Array2[this.aByte49];
		} else {
			if (this.aByte49 < 3) {
				local32 = Static355.aClass22Array3[this.aByte49 + 1];
			} else {
				local32 = null;
			}
			local41 = Static355.aClass22Array3[this.aByte49];
		}
		return local18.method4417(super.anInt6286, arg0, this.aByte47, arg2, this.aByte48, super.anInt6284, local32, arg1, local41, super.anInt6288);
	}
}
