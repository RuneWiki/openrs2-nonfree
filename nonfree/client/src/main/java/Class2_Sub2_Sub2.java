import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!cs", name = "N", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!cs", name = "T", descriptor = "Z")
	private boolean aBoolean88;

	@OriginalMember(owner = "client!cs", name = "H", descriptor = "Z")
	private final boolean aBoolean86;

	@OriginalMember(owner = "client!cs", name = "L", descriptor = "S")
	private final short aShort28;

	@OriginalMember(owner = "client!cs", name = "eb", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!cs", name = "I", descriptor = "Z")
	private final boolean aBoolean87;

	@OriginalMember(owner = "client!cs", name = "nb", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!cs", name = "gb", descriptor = "Z")
	private final boolean aBoolean89;

	@OriginalMember(owner = "client!cs", name = "lb", descriptor = "Lclient!ve;")
	private Class4_Sub1_Sub1 lb;

	@OriginalMember(owner = "client!cs", name = "R", descriptor = "Lclient!jn;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!vm;Lclient!ds;IIIIIZIIIIIIZ)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1354 == 1, Static166.method3157(arg12, arg13));
		this.aByte22 = (byte) arg12;
		this.aBoolean88 = arg14;
		this.aBoolean86 = arg7;
		this.aShort28 = (short) arg1.anInt1346;
		this.aByte23 = (byte) arg13;
		this.aBoolean87 = arg1.anInt1336 != 0;
		this.aByte24 = (byte) arg3;
		this.aBoolean89 = arg0.method4534() && arg1.aBoolean111 && !this.aBoolean86 && Static192.anInt4154 != 0;
		@Pc(75) int local75 = 1024;
		if (this.aBoolean88) {
			local75 |= 0x8000;
		}
		@Pc(90) Class69 local90 = this.method983(this.aBoolean89, local75, arg0);
		if (local90 != null) {
			this.lb = local90.aClass4_Sub1_Sub1_1;
			this.aClass5_1 = local90.aClass5_2;
			if (this.aBoolean88) {
				this.aClass5_1 = this.aClass5_1.method4018((byte) 0, local75, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
	@Override
	public int method4729() {
		return this.aShort28 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)I")
	@Override
	public int method4734() {
		return this.aByte23;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	@Override
	public int method4733() {
		return this.aByte22;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!vm;II)Lclient!jn;")
	@Override
	public Class5 method4727(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		return this.method986(arg0, arg1);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(9) Class5 local9 = this.method986(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class23 local20 = arg2.method4466();
			local20.method5091(super.anInt6465, super.anInt6464, super.anInt6466);
			return local9.method3995(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLclient!vm;)V")
	@Override
	public void method4730(@OriginalArg(1) Class92 arg0) {
		@Pc(32) Class4_Sub1_Sub1 local32;
		if (this.lb == null && this.aBoolean89) {
			@Pc(25) Class69 local25 = this.method983(true, 131072, arg0);
			local32 = local25 == null ? null : local25.aClass4_Sub1_Sub1_1;
		} else {
			local32 = this.lb;
			this.lb = null;
		}
		if (local32 != null) {
			Static333.method74(local32, this.aByte24, super.anInt6465, super.anInt6466, null);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4728() {
		return this.aBoolean89;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
	@Override
	public void method4731() {
		if (this.aClass5_1 != null) {
			this.aClass5_1.method4024();
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	@Override
	public void method5408() {
		this.aBoolean88 = false;
		if (this.aClass5_1 != null) {
			this.aClass5_1.method3988(this.aClass5_1.method3992() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZILclient!vm;I)Lclient!f;")
	private Class69 method983(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2) {
		@Pc(18) Class56 local18 = Static320.method5290(this.aShort28 & 0xFFFF);
		@Pc(43) Class26 local43;
		@Pc(29) Class26 local29;
		if (this.aBoolean86) {
			local29 = Static310.aClass26Array4[0];
			local43 = Static5.aClass26Array1[this.aByte24];
		} else {
			if (this.aByte24 >= 3) {
				local29 = null;
			} else {
				local29 = Static310.aClass26Array4[this.aByte24 + 1];
			}
			local43 = Static310.aClass26Array4[this.aByte24];
		}
		return local18.method1088(arg0, local43, super.anInt6464, local29, arg1, super.anInt6465, this.aByte22 == 11 ? 10 : this.aByte22, arg2, this.aByte22 == 11 ? this.aByte23 + 4 : this.aByte23, super.anInt6466);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
	}

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "(I)I")
	public int method985() {
		return this.aClass5_1 == null ? 15 : this.aClass5_1.method3983() / 4;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		if (arg3 instanceof Class2_Sub4_Sub1) {
			@Pc(16) Class2_Sub4_Sub1 local16 = (Class2_Sub4_Sub1) arg3;
			if (this.aClass5_1 != null && local16.aClass5_4 != null) {
				this.aClass5_1.method4005(local16.aClass5_4, arg2, arg1, arg4, arg0);
			}
		} else if (arg3 instanceof Class2_Sub2_Sub2) {
			@Pc(38) Class2_Sub2_Sub2 local38 = (Class2_Sub2_Sub2) arg3;
			if (this.aClass5_1 != null && local38.aClass5_1 != null) {
				this.aClass5_1.method4005(local38.aClass5_1, arg2, arg1, arg4, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		if (this.aClass5_1 == null) {
			return null;
		}
		@Pc(11) Class23 local11 = arg0.method4466();
		local11.method5091(super.anInt6465, super.anInt6464, super.anInt6466);
		@Pc(21) Class17_Sub2 local21 = null;
		if (this.aBoolean87) {
			local21 = Static238.method4100(1);
		}
		this.aClass5_1.method4029(local11, local21 == null ? null : local21.aClass17_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Lclient!vm;II)Lclient!jn;")
	private Class5 method986(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_1 != null && arg0.method4501(this.aClass5_1.method3992(), arg1) == 0) {
			return this.aClass5_1;
		} else {
			@Pc(30) Class69 local30 = this.method983(false, arg1, arg0);
			return local30 == null ? null : local30.aClass5_2;
		}
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)I")
	@Override
	public int method5416() {
		return this.aClass5_1 == null ? 0 : this.aClass5_1.method4020();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLclient!vm;)V")
	@Override
	public void method4732(@OriginalArg(1) Class92 arg0) {
		@Pc(18) Class4_Sub1_Sub1 local18;
		if (this.lb == null && this.aBoolean89) {
			@Pc(29) Class69 local29 = this.method983(true, 131072, arg0);
			local18 = local29 == null ? null : local29.aClass4_Sub1_Sub1_1;
		} else {
			local18 = this.lb;
			this.lb = null;
		}
		if (local18 != null) {
			Static8.method239(local18, this.aByte24, super.anInt6465, super.anInt6466, null);
		}
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5411() {
		return this.aBoolean88;
	}
}
