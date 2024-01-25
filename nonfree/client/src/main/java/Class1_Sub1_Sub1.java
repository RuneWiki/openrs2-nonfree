import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "Z")
	private boolean aBoolean32;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "Z")
	private final boolean aBoolean31;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "S")
	private final short aShort3;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "Z")
	private final boolean aBoolean34;

	@OriginalMember(owner = "client!ao", name = "W", descriptor = "Z")
	private final boolean aBoolean35;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "Lclient!ph;")
	private Class2_Sub7_Sub11 aClass2_Sub7_Sub11_2;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "Lclient!qh;")
	private Class159 aClass159_2;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!oj;Lclient!cu;IIIIZIZ)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean96, arg1.aBoolean105);
		super.anInt4089 = (short) arg5;
		this.aBoolean32 = arg8;
		super.anInt4088 = (short) arg3;
		this.aBoolean31 = arg6;
		this.aByte7 = (byte) arg2;
		this.aByte8 = (byte) arg7;
		this.aShort3 = (short) arg1.anInt1234;
		this.aBoolean34 = arg1.anInt1274 != 0 && !arg6;
		this.aBoolean35 = arg0.method2476() && arg1.aBoolean100 && !this.aBoolean31 && Static266.anInt5047 != 0;
		@Pc(66) int local66 = 1024;
		if (this.aBoolean32) {
			local66 |= 0x8000;
		}
		@Pc(81) Class187 local81 = this.method171(arg0, this.aBoolean35, local66);
		if (local81 != null) {
			this.aClass2_Sub7_Sub11_2 = local81.aClass2_Sub7_Sub11_4;
			this.aClass159_2 = local81.aClass159_5;
			if (this.aBoolean32) {
				this.aClass159_2 = this.aClass159_2.method4927((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		if (this.aClass159_2 == null) {
			return null;
		}
		@Pc(11) Class21 local11 = arg0.method2445();
		local11.method3711(super.anInt4088, super.anInt4087, super.anInt4089);
		@Pc(27) Class7_Sub5 local27 = null;
		if (this.aBoolean34) {
			local27 = Static234.method4211(1);
		}
		this.aClass159_2.method4952(local11, local27 == null ? null : local27.aClass7_Sub6Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
		@Pc(31) Class2_Sub7_Sub11 local31;
		if (this.aClass2_Sub7_Sub11_2 == null && this.aBoolean35) {
			@Pc(24) Class187 local24 = this.method171(arg0, true, 131072);
			local31 = local24 == null ? null : local24.aClass2_Sub7_Sub11_4;
		} else {
			local31 = this.aClass2_Sub7_Sub11_2;
			this.aClass2_Sub7_Sub11_2 = null;
		}
		if (local31 != null) {
			Static78.method1356(local31, this.aByte7, super.anInt4088, super.anInt4089, null);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return 22;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return this.aBoolean32;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!oj;ZII)Lclient!pr;")
	private Class187 method171(@OriginalArg(0) Class48 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class47 local20 = Static230.aClass96_4.method2303(this.aShort3 & 0xFFFF);
		@Pc(28) Class149 local28;
		@Pc(32) Class149 local32;
		if (this.aBoolean31) {
			local28 = Static248.aClass149Array3[this.aByte7];
			local32 = Static210.aClass149Array5[0];
		} else {
			if (this.aByte7 < 3) {
				local32 = Static210.aClass149Array5[this.aByte7 + 1];
			} else {
				local32 = null;
			}
			local28 = Static210.aClass149Array5[this.aByte7];
		}
		return local20.method896(local28, local32, 22, arg1, this.aByte8, super.anInt4088, super.anInt4087, super.anInt4089, arg0, arg2);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return this.aBoolean35;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return this.method173(arg1, arg0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
		if (this.aClass159_2 != null) {
			this.aClass159_2.method4928();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class159 local21 = this.method173(arg1, 65536);
		if (local21 == null) {
			return false;
		} else {
			@Pc(26) Class21 local26 = arg1.method2445();
			local26.method3711(super.anInt4088, super.anInt4087, super.anInt4089);
			return local21.method4931(arg0, arg2, local26, false);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!oj;II)Lclient!qh;")
	private Class159 method173(@OriginalArg(0) Class48 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass159_2 != null && arg0.method2448(this.aClass159_2.method4951(), arg1) == 0) {
			return this.aClass159_2;
		} else {
			@Pc(30) Class187 local30 = this.method171(arg0, false, arg1);
			return local30 == null ? null : local30.aClass159_5;
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		this.aBoolean32 = false;
		if (this.aClass159_2 != null) {
			this.aClass159_2.method4958(this.aClass159_2.method4951() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return this.aShort3 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		if (arg3 instanceof Class1_Sub1_Sub1) {
			@Pc(13) Class1_Sub1_Sub1 local13 = (Class1_Sub1_Sub1) arg3;
			if (this.aClass159_2 != null && local13.aClass159_2 != null) {
				this.aClass159_2.method4973(local13.aClass159_2, arg0, arg1, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
		@Pc(33) Class2_Sub7_Sub11 local33;
		if (this.aClass2_Sub7_Sub11_2 == null && this.aBoolean35) {
			@Pc(26) Class187 local26 = this.method171(arg0, true, 131072);
			local33 = local26 == null ? null : local26.aClass2_Sub7_Sub11_4;
		} else {
			local33 = this.aClass2_Sub7_Sub11_2;
			this.aClass2_Sub7_Sub11_2 = null;
		}
		if (local33 != null) {
			Static169.method5042(local33, this.aByte7, super.anInt4088, super.anInt4089, null);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return this.aByte8;
	}
}
