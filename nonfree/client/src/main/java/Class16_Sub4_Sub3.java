import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class16_Sub4_Sub3 extends Class16_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "Z")
	private boolean aBoolean338;

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "S")
	private final short aShort40;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "B")
	private final byte aByte26;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "Z")
	private final boolean aBoolean339;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!jp", name = "L", descriptor = "Z")
	private final boolean aBoolean341;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "Z")
	private final boolean aBoolean340;

	@OriginalMember(owner = "client!jp", name = "Q", descriptor = "Lclient!t;")
	private Class110 aClass110_4;

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "Lclient!ba;")
	private Class4_Sub1_Sub4 aClass4_Sub1_Sub4_3;

	static {
		new Class83(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!ya;Lclient!rd;IIIIZIZ)V")
	public Class16_Sub4_Sub3(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean527, arg1.aBoolean529);
		this.aBoolean338 = arg8;
		this.aShort40 = (short) arg1.anInt5823;
		this.aByte26 = (byte) arg7;
		this.aBoolean339 = arg1.anInt5813 != 0 && !arg6;
		this.aByte25 = (byte) arg2;
		this.aBoolean341 = arg6;
		super.anInt3646 = arg3;
		super.anInt3647 = arg5;
		this.aBoolean340 = arg0.method4242() && arg1.aBoolean526 && !this.aBoolean341 && Static323.aClass50_Sub1_1.method2850(Static177.anInt2973) != 0;
		@Pc(67) int local67 = 2048;
		if (this.aBoolean338) {
			local67 |= 0x10000;
		}
		@Pc(82) Class149 local82 = this.method3035(local67, this.aBoolean340, arg0);
		if (local82 != null) {
			this.aClass110_4 = local82.aClass110_5;
			this.aClass4_Sub1_Sub4_3 = local82.aClass4_Sub1_Sub4_4;
			if (this.aBoolean338) {
				this.aClass110_4 = this.aClass110_4.method4887((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	private Class110 method3033(@OriginalArg(0) Class19 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass110_4 != null && arg0.method4269(this.aClass110_4.P(), arg1) == 0) {
			return this.aClass110_4;
		} else {
			@Pc(28) Class149 local28 = this.method3035(arg1, false, arg0);
			return local28 == null ? null : local28.aClass110_5;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return this.aByte26;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZILclient!ya;)Lclient!mg;")
	private Class149 method3035(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(19) Class202 local19 = Static267.aClass262_2.method5560(this.aShort40 & 0xFFFF);
		@Pc(42) Class65 local42;
		@Pc(33) Class65 local33;
		if (this.aBoolean341) {
			local33 = Static67.aClass65Array1[0];
			local42 = Static285.aClass65Array3[this.aByte25];
		} else {
			if (this.aByte25 < 3) {
				local33 = Static67.aClass65Array1[this.aByte25 + 1];
			} else {
				local33 = null;
			}
			local42 = Static67.aClass65Array1[this.aByte25];
		}
		return local19.method4589(arg2, super.anInt3646, arg0, super.anInt3648, arg1, this.aByte26, local33, super.anInt3647, 22, local42);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		if (!(arg2 instanceof Class16_Sub4_Sub3)) {
			return;
		}
		@Pc(16) Class16_Sub4_Sub3 local16 = (Class16_Sub4_Sub3) arg2;
		if (this.aClass110_4 != null && local16.aClass110_4 != null) {
			this.aClass110_4.method4891(local16.aClass110_4, arg1, arg5, arg0, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	@Override
	public Class110 method5352(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return this.method3033(arg0, arg1);
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	@Override
	public void method5353() {
		if (this.aClass110_4 != null) {
			this.aClass110_4.method4886();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5348(@OriginalArg(0) Class19 arg0) {
		@Pc(20) Class4_Sub1_Sub4 local20;
		if (this.aClass4_Sub1_Sub4_3 == null && this.aBoolean340) {
			@Pc(33) Class149 local33 = this.method3035(262144, true, arg0);
			local20 = local33 == null ? null : local33.aClass4_Sub1_Sub4_4;
		} else {
			local20 = this.aClass4_Sub1_Sub4_3;
			this.aClass4_Sub1_Sub4_3 = null;
		}
		if (local20 != null) {
			Static52.method844(local20, this.aByte25, super.anInt3646, super.anInt3647, null);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5351() {
		return this.aBoolean340;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)I")
	@Override
	public int method5350() {
		return this.aShort40 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V")
	@Override
	public void method5333() {
		this.aBoolean338 = false;
		if (this.aClass110_4 != null) {
			this.aClass110_4.UA(this.aClass110_4.P() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class110 local15 = this.method3033(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class31 local20 = arg1.method4289();
			local20.j(super.anInt3646, super.anInt3648, super.anInt3647);
			return local15.method4894(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)I")
	@Override
	public int method5354() {
		return 22;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		if (this.aClass110_4 == null) {
			return null;
		}
		@Pc(18) Class31 local18 = arg0.method4289();
		local18.j(super.anInt3646, super.anInt3648, super.anInt3647);
		@Pc(28) Class3_Sub3 local28 = null;
		if (this.aBoolean339) {
			local28 = Static38.method672(1);
		}
		this.aClass110_4.method4889(local18, local28 == null ? null : local28.aClass3_Sub5Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5338() {
		return this.aBoolean338;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5349(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class4_Sub1_Sub4 local14;
		if (this.aClass4_Sub1_Sub4_3 == null && this.aBoolean340) {
			@Pc(25) Class149 local25 = this.method3035(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass4_Sub1_Sub4_4;
		} else {
			local14 = this.aClass4_Sub1_Sub4_3;
			this.aClass4_Sub1_Sub4_3 = null;
		}
		if (local14 != null) {
			Static110.method2015(local14, this.aByte25, super.anInt3646, super.anInt3647, null);
		}
	}
}
