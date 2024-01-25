import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Z")
	private final boolean aBoolean239;

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "Z")
	private final boolean aBoolean241;

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "Z")
	private boolean aBoolean240;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "S")
	private final short aShort42;

	@OriginalMember(owner = "client!ig", name = "S", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!ig", name = "U", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "Lclient!ka;")
	private Class108 aClass108_4;

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "Lclient!ia;")
	private Class3_Sub3_Sub9 aClass3_Sub3_Sub9_4;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIZIZ)V")
	public Class1_Sub4_Sub2(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt787, arg1.aBoolean46, arg1.aBoolean41);
		this.aByte43 = (byte) arg7;
		this.aBoolean239 = arg1.anInt788 != 0 && !arg6;
		this.aBoolean241 = arg6;
		this.aBoolean240 = arg8;
		super.anInt4633 = arg3;
		this.aShort42 = (short) arg1.anInt791;
		super.anInt4639 = arg5;
		this.aByte44 = (byte) arg2;
		this.aBoolean242 = arg0.method5969() && arg1.aBoolean42 && !this.aBoolean241 && Static39.aClass79_Sub1_1.method1942(Static402.anInt6656) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean240) {
			local69 |= 0x10000;
		}
		@Pc(84) Class130 local84 = this.method2613(this.aBoolean242, arg0, local69);
		if (local84 != null) {
			this.aClass108_4 = local84.aClass108_6;
			this.aClass3_Sub3_Sub9_4 = local84.aClass3_Sub3_Sub9_5;
			if (this.aBoolean240) {
				this.aClass108_4 = this.aClass108_4.method4930((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
		@Pc(14) Class3_Sub3_Sub9 local14;
		if (this.aClass3_Sub3_Sub9_4 == null && this.aBoolean242) {
			@Pc(25) Class130 local25 = this.method2613(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass3_Sub3_Sub9_5;
		} else {
			local14 = this.aClass3_Sub3_Sub9_4;
			this.aClass3_Sub3_Sub9_4 = null;
		}
		if (local14 != null) {
			Static279.method3856(local14, this.aByte44, super.anInt4633, super.anInt4639, null);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(15) Class108 local15 = this.method2611(131072, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class11 local20 = arg2.method5989();
			local20.C(super.anInt4633, super.anInt4636, super.anInt4639);
			return local15.method4937(arg1, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return this.method2611(arg0, arg1);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return this.aBoolean242;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return this.aBoolean240;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		if (this.aClass108_4 == null) {
			return null;
		}
		@Pc(11) Class11 local11 = arg0.method5989();
		local11.C(super.anInt4633, super.anInt4636, super.anInt4639);
		@Pc(21) Class23_Sub5 local21 = null;
		if (this.aBoolean239) {
			local21 = Static217.method1031(1);
		}
		this.aClass108_4.method4931(local11, local21 == null ? null : local21.aClass23_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!qa;)Lclient!ka;")
	private Class108 method2611(@OriginalArg(1) int arg0, @OriginalArg(2) Class167 arg1) {
		if (this.aClass108_4 != null && arg1.method6006(this.aClass108_4.ma(), arg0) == 0) {
			return this.aClass108_4;
		} else {
			@Pc(31) Class130 local31 = this.method2613(false, arg1, arg0);
			return local31 == null ? null : local31.aClass108_6;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
		@Pc(30) Class3_Sub3_Sub9 local30;
		if (this.aClass3_Sub3_Sub9_4 == null && this.aBoolean242) {
			@Pc(23) Class130 local23 = this.method2613(true, arg0, 262144);
			local30 = local23 == null ? null : local23.aClass3_Sub3_Sub9_5;
		} else {
			local30 = this.aClass3_Sub3_Sub9_4;
			this.aClass3_Sub3_Sub9_4 = null;
		}
		if (local30 != null) {
			Static369.method5155(local30, this.aByte44, super.anInt4633, super.anInt4639, null);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		if (!(arg1 instanceof Class1_Sub4_Sub2)) {
			return;
		}
		@Pc(14) Class1_Sub4_Sub2 local14 = (Class1_Sub4_Sub2) arg1;
		if (this.aClass108_4 != null && local14.aClass108_4 != null) {
			this.aClass108_4.method4947(local14.aClass108_4, arg2, arg0, arg3, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
		if (this.aClass108_4 != null) {
			this.aClass108_4.method4945();
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.aShort42 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!qa;IB)Lclient!kj;")
	private Class130 method2613(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class31 local18 = Static9.aClass149_1.method3573(this.aShort42 & 0xFFFF);
		@Pc(30) Class55 local30;
		@Pc(25) Class55 local25;
		if (this.aBoolean241) {
			local25 = Static182.aClass55Array2[0];
			local30 = Static349.aClass55Array3[this.aByte44];
		} else {
			if (this.aByte44 >= 3) {
				local25 = null;
			} else {
				local25 = Static182.aClass55Array2[this.aByte44 + 1];
			}
			local30 = Static182.aClass55Array2[this.aByte44];
		}
		return local18.method874(local25, this.aByte43, super.anInt4636, arg2, arg1, arg0, 22, local30, super.anInt4639, super.anInt4633);
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		this.aBoolean240 = false;
		if (this.aClass108_4 != null) {
			this.aClass108_4.B(this.aClass108_4.ma() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return 22;
	}
}
