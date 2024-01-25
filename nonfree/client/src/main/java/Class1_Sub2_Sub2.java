import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!ju", name = "Q", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!ju", name = "L", descriptor = "B")
	private final byte aByte28;

	@OriginalMember(owner = "client!ju", name = "cb", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!ju", name = "G", descriptor = "S")
	private final short aShort44;

	@OriginalMember(owner = "client!ju", name = "ib", descriptor = "Z")
	private boolean aBoolean266;

	@OriginalMember(owner = "client!ju", name = "U", descriptor = "Z")
	private final boolean aBoolean264;

	@OriginalMember(owner = "client!ju", name = "hb", descriptor = "Z")
	private final boolean aBoolean265;

	@OriginalMember(owner = "client!ju", name = "J", descriptor = "Z")
	private final boolean aBoolean263;

	@OriginalMember(owner = "client!ju", name = "W", descriptor = "Lclient!qh;")
	public Class159 aClass159_3;

	@OriginalMember(owner = "client!ju", name = "X", descriptor = "Lclient!ph;")
	private Class2_Sub7_Sub11 aClass2_Sub7_Sub11_3;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!oj;Lclient!cu;IIIIIZIIIIIIZ)V")
	public Class1_Sub2_Sub2(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1246 == 1, Static330.method5309(arg12, arg13));
		this.aByte29 = (byte) arg12;
		this.aByte28 = (byte) arg3;
		this.aByte30 = (byte) arg13;
		this.aShort44 = (short) arg1.anInt1234;
		this.aBoolean266 = arg14;
		this.aBoolean264 = arg1.anInt1274 != 0 && !arg7;
		this.aBoolean265 = arg7;
		this.aBoolean263 = arg0.method2476() && arg1.aBoolean100 && !this.aBoolean265 && Static266.anInt5047 != 0;
		@Pc(76) int local76 = 1024;
		if (this.aBoolean266) {
			local76 |= 0x8000;
		}
		@Pc(91) Class187 local91 = this.method3071(this.aBoolean263, local76, arg0);
		if (local91 != null) {
			this.aClass159_3 = local91.aClass159_5;
			this.aClass2_Sub7_Sub11_3 = local91.aClass2_Sub7_Sub11_4;
			if (this.aBoolean266) {
				this.aClass159_3 = this.aClass159_3.method4927((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
		@Pc(31) Class2_Sub7_Sub11 local31;
		if (this.aClass2_Sub7_Sub11_3 == null && this.aBoolean263) {
			@Pc(24) Class187 local24 = this.method3071(true, 131072, arg0);
			local31 = local24 == null ? null : local24.aClass2_Sub7_Sub11_4;
		} else {
			local31 = this.aClass2_Sub7_Sub11_3;
			this.aClass2_Sub7_Sub11_3 = null;
		}
		if (local31 != null) {
			Static78.method1356(local31, this.aByte28, super.anInt6800, super.anInt6798, null);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
		if (this.aClass159_3 != null) {
			this.aClass159_3.method4928();
		}
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		if (this.aClass159_3 == null) {
			return null;
		}
		@Pc(11) Class21 local11 = arg0.method2445();
		local11.method3711(super.anInt6800, super.anInt6797, super.anInt6798);
		@Pc(28) Class7_Sub5 local28 = null;
		if (this.aBoolean264) {
			local28 = Static234.method4211(1);
		}
		this.aClass159_3.method4952(local11, local28 == null ? null : local28.aClass7_Sub6Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		if (arg3 instanceof Class1_Sub5_Sub3) {
			@Pc(9) Class1_Sub5_Sub3 local9 = (Class1_Sub5_Sub3) arg3;
			if (this.aClass159_3 != null && local9.aClass159_6 != null) {
				this.aClass159_3.method4973(local9.aClass159_6, arg0, arg1, arg4, arg2);
			}
		} else if (arg3 instanceof Class1_Sub2_Sub2) {
			@Pc(32) Class1_Sub2_Sub2 local32 = (Class1_Sub2_Sub2) arg3;
			if (this.aClass159_3 != null && local32.aClass159_3 != null) {
				this.aClass159_3.method4973(local32.aClass159_3, arg0, arg1, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!oj;IB)Lclient!qh;")
	private Class159 method3067(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass159_3 != null && arg0.method2448(this.aClass159_3.method4951(), arg1) == 0) {
			return this.aClass159_3;
		} else {
			@Pc(28) Class187 local28 = this.method3071(false, arg1, arg0);
			return local28 == null ? null : local28.aClass159_5;
		}
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return this.aBoolean266;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return this.aByte29;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class159 local15 = this.method3067(arg1, 65536);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class21 local20 = arg1.method2445();
			local20.method3711(super.anInt6800, super.anInt6797, super.anInt6798);
			return local15.method4931(arg0, arg2, local20, false);
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
		@Pc(14) Class2_Sub7_Sub11 local14;
		if (this.aClass2_Sub7_Sub11_3 == null && this.aBoolean263) {
			@Pc(25) Class187 local25 = this.method3071(true, 131072, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub7_Sub11_4;
		} else {
			local14 = this.aClass2_Sub7_Sub11_3;
			this.aClass2_Sub7_Sub11_3 = null;
		}
		if (local14 != null) {
			Static169.method5042(local14, this.aByte28, super.anInt6800, super.anInt6798, null);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return this.aShort44 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return this.aBoolean263;
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZBILclient!oj;)Lclient!pr;")
	private Class187 method3071(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class48 arg2) {
		@Pc(13) Class47 local13 = Static230.aClass96_4.method2303(this.aShort44 & 0xFFFF);
		@Pc(29) Class149 local29;
		@Pc(33) Class149 local33;
		if (this.aBoolean265) {
			local29 = Static248.aClass149Array3[this.aByte28];
			local33 = Static210.aClass149Array5[0];
		} else {
			if (this.aByte28 < 3) {
				local33 = Static210.aClass149Array5[this.aByte28 + 1];
			} else {
				local33 = null;
			}
			local29 = Static210.aClass149Array5[this.aByte28];
		}
		return local13.method896(local29, local33, this.aByte29 == 11 ? 10 : this.aByte29, arg0, this.aByte29 == 11 ? this.aByte30 + 4 : this.aByte30, super.anInt6800, super.anInt6797, super.anInt6798, arg2, arg1);
	}

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		this.aBoolean266 = false;
		if (this.aClass159_3 != null) {
			this.aClass159_3.method4958(this.aClass159_3.method4951() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return this.method3067(arg1, arg0);
	}

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "(I)I")
	@Override
	public int method5894() {
		return this.aClass159_3 == null ? 0 : this.aClass159_3.method4941();
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)I")
	public int method3072() {
		return this.aClass159_3 == null ? 15 : this.aClass159_3.method4976() / 4;
	}
}
