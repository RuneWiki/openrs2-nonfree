import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class5_Sub3_Sub2 extends Class5_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!ib", name = "bb", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "Z")
	private boolean aBoolean239;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "Z")
	private final boolean aBoolean238;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!ib", name = "ab", descriptor = "Z")
	private final boolean aBoolean241;

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "S")
	private final short aShort25;

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Lclient!hc;")
	public Class78 aClass78_4;

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "Lclient!ek;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_3;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!aa;Lclient!sk;IIIIIZIIIIIIZ)V")
	public Class5_Sub3_Sub2(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5522 == 1, Static170.method3407(arg13, arg12));
		this.aByte23 = (byte) arg3;
		this.aBoolean239 = arg14;
		this.aBoolean238 = arg1.anInt5546 != 0 && !arg7;
		this.aByte22 = (byte) arg12;
		this.aByte24 = (byte) arg13;
		this.aBoolean241 = arg7;
		this.aShort25 = (short) arg1.anInt5535;
		this.aBoolean240 = arg0.method3268() && arg1.aBoolean476 && !this.aBoolean241 && Static158.anInt3147 != 0;
		@Pc(76) int local76 = 1024;
		if (this.aBoolean239) {
			local76 |= 0x8000;
		}
		@Pc(91) Class212 local91 = this.method2518(arg0, this.aBoolean240, local76);
		if (local91 != null) {
			this.aClass78_4 = local91.aClass78_6;
			this.aClass1_Sub1_Sub8_3 = local91.aClass1_Sub1_Sub8_5;
			if (this.aBoolean239) {
				this.aClass78_4 = this.aClass78_4.method4394((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		@Pc(9) Class78 local9 = this.method2521(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class21 local14 = arg2.method3284();
			local14.method2814(super.anInt5050, super.anInt5046, super.anInt5047);
			return local9.method4381(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	@Override
	public void method5698() {
		if (this.aClass78_4 != null) {
			this.aClass78_4.method4359();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5696(@OriginalArg(0) Class2 arg0) {
		@Pc(20) Class1_Sub1_Sub8 local20;
		if (this.aClass1_Sub1_Sub8_3 == null && this.aBoolean240) {
			@Pc(31) Class212 local31 = this.method2518(arg0, true, 131072);
			local20 = local31 == null ? null : local31.aClass1_Sub1_Sub8_5;
		} else {
			local20 = this.aClass1_Sub1_Sub8_3;
			this.aClass1_Sub1_Sub8_3 = null;
		}
		if (local20 != null) {
			Static120.method2164(local20, this.aByte23, super.anInt5050, super.anInt5047, null);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5694(@OriginalArg(0) Class2 arg0) {
		@Pc(25) Class1_Sub1_Sub8 local25;
		if (this.aClass1_Sub1_Sub8_3 == null && this.aBoolean240) {
			@Pc(18) Class212 local18 = this.method2518(arg0, true, 131072);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub8_5;
		} else {
			local25 = this.aClass1_Sub1_Sub8_3;
			this.aClass1_Sub1_Sub8_3 = null;
		}
		if (local25 != null) {
			Static151.method3583(local25, this.aByte23, super.anInt5050, super.anInt5047, null);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!aa;ZII)Lclient!vn;")
	private Class212 method2518(@OriginalArg(0) Class2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class188 local12 = Static126.method2405(this.aShort25 & 0xFFFF);
		@Pc(25) Class41 local25;
		@Pc(33) Class41 local33;
		if (this.aBoolean241) {
			local25 = Static236.aClass41Array4[this.aByte23];
			local33 = Static288.aClass41Array5[0];
		} else {
			local25 = Static288.aClass41Array5[this.aByte23];
			if (this.aByte23 >= 3) {
				local33 = null;
			} else {
				local33 = Static288.aClass41Array5[this.aByte23 + 1];
			}
		}
		return local12.method4904(super.anInt5046, local25, this.aByte22 == 11 ? 10 : this.aByte22, arg0, this.aByte22 == 11 ? this.aByte24 + 4 : this.aByte24, local33, super.anInt5050, super.anInt5047, arg1, arg2);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		if (arg5 instanceof Class5_Sub1_Sub1) {
			@Pc(14) Class5_Sub1_Sub1 local14 = (Class5_Sub1_Sub1) arg5;
			if (this.aClass78_4 != null && local14.aClass78_1 != null) {
				this.aClass78_4.method4400(local14.aClass78_1, arg2, arg4, arg1, arg0);
			}
		} else if (arg5 instanceof Class5_Sub3_Sub2) {
			@Pc(36) Class5_Sub3_Sub2 local36 = (Class5_Sub3_Sub2) arg5;
			if (this.aClass78_4 != null && local36.aClass78_4 != null) {
				this.aClass78_4.method4400(local36.aClass78_4, arg2, arg4, arg1, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!aa;IB)Lclient!hc;")
	@Override
	public Class78 method5695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) {
		return this.method2521(arg0, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5700() {
		return this.aBoolean240;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(B)I")
	public int method2519() {
		return this.aClass78_4 == null ? 15 : this.aClass78_4.method4390() / 4;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I")
	@Override
	public int method5697() {
		return this.aShort25 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)I")
	@Override
	public int method4586() {
		return this.aClass78_4 == null ? 0 : this.aClass78_4.method4388();
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		this.aBoolean239 = false;
		if (this.aClass78_4 != null) {
			this.aClass78_4.method4373(this.aClass78_4.method4398() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)I")
	@Override
	public int method5701() {
		return this.aByte24;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!aa;I)Lclient!hc;")
	private Class78 method2521(@OriginalArg(1) Class2 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass78_4 != null && arg0.method3247(this.aClass78_4.method4398(), arg1) == 0) {
			return this.aClass78_4;
		} else {
			@Pc(28) Class212 local28 = this.method2518(arg0, false, arg1);
			return local28 == null ? null : local28.aClass78_6;
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return this.aBoolean239;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)I")
	@Override
	public int method5699() {
		return this.aByte22;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		if (this.aClass78_4 == null) {
			return null;
		}
		@Pc(11) Class21 local11 = arg0.method3284();
		local11.method2814(super.anInt5050, super.anInt5046, super.anInt5047);
		@Pc(21) Class15_Sub3 local21 = null;
		if (this.aBoolean238) {
			local21 = Static186.method3613(1);
		}
		this.aClass78_4.method4379(local11, local21 == null ? null : local21.aClass15_Sub2Array1[0], 0);
		return local21;
	}
}
