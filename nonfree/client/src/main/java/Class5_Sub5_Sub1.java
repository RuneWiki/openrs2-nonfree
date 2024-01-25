import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 implements Interface8 {

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "S")
	private final short aShort91;

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "Z")
	private final boolean aBoolean579;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "Z")
	private final boolean aBoolean577;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "Z")
	private final boolean aBoolean578;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "Lclient!hc;")
	private Class78 aClass78_7;

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "Lclient!ek;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_6;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!aa;Lclient!sk;IIIIZIZ)V")
	public Class5_Sub5_Sub1(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean472, arg1.aBoolean486);
		this.aByte74 = (byte) arg7;
		this.aByte75 = (byte) arg2;
		this.aShort91 = (short) arg1.anInt5535;
		this.aBoolean579 = arg1.anInt5546 != 0 && !arg6;
		super.anInt6520 = (short) arg3;
		super.anInt6517 = (short) arg5;
		this.aBoolean577 = arg6;
		this.aBoolean580 = arg8;
		this.aBoolean578 = arg0.method3268() && arg1.aBoolean476 && !this.aBoolean577 && Static158.anInt3147 != 0;
		@Pc(69) int local69 = 1024;
		if (this.aBoolean580) {
			local69 |= 0x8000;
		}
		@Pc(84) Class212 local84 = this.method5644(arg0, local69, this.aBoolean578);
		if (local84 != null) {
			this.aClass78_7 = local84.aClass78_6;
			this.aClass1_Sub1_Sub8_6 = local84.aClass1_Sub1_Sub8_5;
			if (this.aBoolean580) {
				this.aClass78_7 = this.aClass78_7.method4394((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5694(@OriginalArg(0) Class2 arg0) {
		@Pc(25) Class1_Sub1_Sub8 local25;
		if (this.aClass1_Sub1_Sub8_6 == null && this.aBoolean578) {
			@Pc(18) Class212 local18 = this.method5644(arg0, 131072, true);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub8_5;
		} else {
			local25 = this.aClass1_Sub1_Sub8_6;
			this.aClass1_Sub1_Sub8_6 = null;
		}
		if (local25 != null) {
			Static151.method3583(local25, this.aByte75, super.anInt6520, super.anInt6517, null);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)I")
	@Override
	public int method5699() {
		return 22;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		if (arg5 instanceof Class5_Sub5_Sub1) {
			@Pc(9) Class5_Sub5_Sub1 local9 = (Class5_Sub5_Sub1) arg5;
			if (this.aClass78_7 != null && local9.aClass78_7 != null) {
				this.aClass78_7.method4400(local9.aClass78_7, arg2, arg4, arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		if (this.aClass78_7 == null) {
			return null;
		}
		@Pc(11) Class21 local11 = arg0.method3284();
		local11.method2814(super.anInt6520, super.anInt6522, super.anInt6517);
		@Pc(21) Class15_Sub3 local21 = null;
		if (this.aBoolean579) {
			local21 = Static186.method3613(1);
		}
		this.aClass78_7.method4379(local11, local21 == null ? null : local21.aClass15_Sub2Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)I")
	@Override
	public int method5701() {
		return this.aByte74;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5696(@OriginalArg(0) Class2 arg0) {
		@Pc(27) Class1_Sub1_Sub8 local27;
		if (this.aClass1_Sub1_Sub8_6 == null && this.aBoolean578) {
			@Pc(20) Class212 local20 = this.method5644(arg0, 131072, true);
			local27 = local20 == null ? null : local20.aClass1_Sub1_Sub8_5;
		} else {
			local27 = this.aClass1_Sub1_Sub8_6;
			this.aClass1_Sub1_Sub8_6 = null;
		}
		if (local27 != null) {
			Static120.method2164(local27, this.aByte75, super.anInt6520, super.anInt6517, null);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!aa;IZI)Lclient!vn;")
	private Class212 method5644(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class188 local12 = Static126.method2405(this.aShort91 & 0xFFFF);
		@Pc(37) Class41 local37;
		@Pc(23) Class41 local23;
		if (this.aBoolean577) {
			local23 = Static288.aClass41Array5[0];
			local37 = Static236.aClass41Array4[this.aByte75];
		} else {
			if (this.aByte75 >= 3) {
				local23 = null;
			} else {
				local23 = Static288.aClass41Array5[this.aByte75 + 1];
			}
			local37 = Static288.aClass41Array5[this.aByte75];
		}
		return local12.method4904(super.anInt6522, local37, 22, arg0, this.aByte74, local23, super.anInt6520, super.anInt6517, arg2, arg1);
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		this.aBoolean580 = false;
		if (this.aClass78_7 != null) {
			this.aClass78_7.method4373(this.aClass78_7.method4398() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
	@Override
	public int method5697() {
		return this.aShort91 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	@Override
	public void method5698() {
		if (this.aClass78_7 != null) {
			this.aClass78_7.method4359();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!aa;IB)Lclient!hc;")
	@Override
	public Class78 method5695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) {
		return this.method5646(arg0, arg1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		@Pc(13) Class78 local13 = this.method5646(arg2, 65536);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class21 local18 = arg2.method3284();
			local18.method2814(super.anInt6520, super.anInt6522, super.anInt6517);
			return local13.method4381(arg0, arg1, local18, false);
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5700() {
		return this.aBoolean578;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return this.aBoolean580;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!aa;II)Lclient!hc;")
	private Class78 method5646(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass78_7 != null && arg0.method3247(this.aClass78_7.method4398(), arg1) == 0) {
			return this.aClass78_7;
		} else {
			@Pc(28) Class212 local28 = this.method5644(arg0, arg1, false);
			return local28 == null ? null : local28.aClass78_6;
		}
	}
}
