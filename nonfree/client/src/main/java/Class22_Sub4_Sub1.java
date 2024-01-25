import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class22_Sub4_Sub1 extends Class22_Sub4 implements Interface1 {

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!cl", name = "eb", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!cl", name = "S", descriptor = "Z")
	private final boolean aBoolean90;

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "Z")
	private boolean aBoolean89;

	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "Z")
	private final boolean aBoolean92;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!cl", name = "V", descriptor = "Z")
	private final boolean aBoolean91;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "Lclient!ug;")
	private Class7_Sub1_Sub4 aClass7_Sub1_Sub4_1;

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "Lclient!sj;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!pe;Lclient!kk;IIIIZIIZ)V")
	public Class22_Sub4_Sub1(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static132.method2661(arg7, arg8));
		this.aByte21 = (byte) arg8;
		this.aByte23 = (byte) arg7;
		this.aByte22 = (byte) arg2;
		this.aBoolean90 = arg1.anInt3560 != 0;
		super.anInt6013 = (short) arg5;
		this.aBoolean89 = arg9;
		this.aBoolean92 = arg6;
		this.aShort33 = (short) arg1.anInt3534;
		super.anInt6009 = (short) arg3;
		this.aBoolean91 = arg0.method5418() && arg1.aBoolean274 && !this.aBoolean92 && Static336.anInt4180 != 0;
		@Pc(68) int local68 = 1024;
		if (this.aBoolean89) {
			local68 |= 0x8000;
		}
		@Pc(83) Class104 local83 = this.method983(arg0, local68, this.aBoolean91);
		if (local83 != null) {
			this.aClass7_Sub1_Sub4_1 = local83.aClass7_Sub1_Sub4_2;
			this.aClass31_1 = local83.aClass31_2;
			if (this.aBoolean89) {
				this.aClass31_1 = this.aClass31_1.method1917((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class22_Sub4_Sub1) {
			@Pc(5) Class22_Sub4_Sub1 local5 = (Class22_Sub4_Sub1) arg1;
			if (this.aClass31_1 != null && local5.aClass31_1 != null) {
				this.aClass31_1.method1914(local5.aClass31_1, arg4, arg3, arg5, arg0);
			}
		} else if (arg1 instanceof Class22_Sub2_Sub5) {
			@Pc(28) Class22_Sub2_Sub5 local28 = (Class22_Sub2_Sub5) arg1;
			if (this.aClass31_1 != null && local28.aClass31_7 != null) {
				this.aClass31_1.method1914(local28.aClass31_7, arg4, arg3, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5363() {
		return this.aBoolean91;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	@Override
	public void method5358() {
		if (this.aClass31_1 != null) {
			this.aClass31_1.method1921();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!pe;)Lclient!sj;")
	private Class31 method978(@OriginalArg(0) int arg0, @OriginalArg(2) Class89 arg1) {
		if (this.aClass31_1 != null && arg1.method5399(this.aClass31_1.method1912(), arg0) == 0) {
			return this.aClass31_1;
		} else {
			@Pc(33) Class104 local33 = this.method983(arg1, arg0, false);
			return local33 == null ? null : local33.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!pe;II)Lclient!sj;")
	@Override
	public Class31 method5364(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		return this.method978(arg1, arg0);
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return this.aBoolean89;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		@Pc(9) Class31 local9 = this.method978(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class70 local14 = arg2.method5427();
			local14.method3707(super.anInt6009, super.anInt6010, super.anInt6013);
			return local9.method1932(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)I")
	@Override
	public int method5362() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		if (this.aClass31_1 == null) {
			return null;
		}
		@Pc(11) Class70 local11 = arg0.method5427();
		local11.method3707(super.anInt6009, super.anInt6010, super.anInt6013);
		@Pc(26) Class36_Sub1 local26 = null;
		if (this.aBoolean90) {
			local26 = Static184.method3381(1);
		}
		this.aClass31_1.method1928(local11, local26 == null ? null : local26.aClass36_Sub6Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
	@Override
	public int method5360() {
		return this.aByte21;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
	@Override
	public int method5361() {
		return this.aByte23;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!pe;I)V")
	@Override
	public void method5359(@OriginalArg(0) Class89 arg0) {
		@Pc(20) Class7_Sub1_Sub4 local20;
		if (this.aClass7_Sub1_Sub4_1 == null && this.aBoolean91) {
			@Pc(33) Class104 local33 = this.method983(arg0, 131072, true);
			local20 = local33 == null ? null : local33.aClass7_Sub1_Sub4_2;
		} else {
			local20 = this.aClass7_Sub1_Sub4_1;
			this.aClass7_Sub1_Sub4_1 = null;
		}
		if (local20 != null) {
			Static86.method1826(local20, this.aByte22, super.anInt6009, super.anInt6013, null);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!pe;)V")
	@Override
	public void method5365(@OriginalArg(1) Class89 arg0) {
		@Pc(33) Class7_Sub1_Sub4 local33;
		if (this.aClass7_Sub1_Sub4_1 == null && this.aBoolean91) {
			@Pc(26) Class104 local26 = this.method983(arg0, 131072, true);
			local33 = local26 == null ? null : local26.aClass7_Sub1_Sub4_2;
		} else {
			local33 = this.aClass7_Sub1_Sub4_1;
			this.aClass7_Sub1_Sub4_1 = null;
		}
		if (local33 != null) {
			Static33.method687(local33, this.aByte22, super.anInt6009, super.anInt6013, null);
		}
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		this.aBoolean89 = false;
		if (this.aClass31_1 != null) {
			this.aClass31_1.method1908(this.aClass31_1.method1912() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!pe;IIZ)Lclient!il;")
	private Class104 method983(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class122 local10 = Static245.method4227(this.aShort33 & 0xFFFF);
		@Pc(23) Class8 local23;
		@Pc(34) Class8 local34;
		if (this.aBoolean92) {
			local34 = Static136.aClass8Array3[0];
			local23 = Static251.aClass8Array6[this.aByte22];
		} else {
			local23 = Static136.aClass8Array3[this.aByte22];
			if (this.aByte22 < 3) {
				local34 = Static136.aClass8Array3[this.aByte22 + 1];
			} else {
				local34 = null;
			}
		}
		return local10.method3229(super.anInt6013, this.aByte21, arg2, arg0, local23, local34, this.aByte23, super.anInt6010, arg1, super.anInt6009);
	}
}
