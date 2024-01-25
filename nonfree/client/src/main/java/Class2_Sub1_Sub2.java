import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!pg", name = "M", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!pg", name = "eb", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "Z")
	private final boolean aBoolean428;

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "Z")
	private final boolean aBoolean427;

	@OriginalMember(owner = "client!pg", name = "O", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "Lclient!jn;")
	private Class5 aClass5_7;

	@OriginalMember(owner = "client!pg", name = "R", descriptor = "Lclient!ve;")
	private Class4_Sub1_Sub1 aClass4_Sub1_Sub1_5;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!vm;Lclient!ds;IIIIZIIIII)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static330.method5398(arg10, arg11));
		this.aByte63 = (byte) arg11;
		this.aShort73 = (short) arg1.anInt1346;
		this.aBoolean428 = arg6;
		this.aBoolean427 = arg1.anInt1336 != 0;
		this.aByte64 = (byte) arg10;
		this.aByte62 = (byte) arg2;
		super.anInt5064 = (short) arg3;
		super.anInt5077 = (short) arg5;
		this.aBoolean426 = arg0.method4534() && arg1.aBoolean111 && !this.aBoolean428 && Static192.anInt4154 != 0;
		@Pc(74) Class69 local74 = this.method4208(1024, this.aBoolean426, arg0);
		if (local74 != null) {
			this.aClass5_7 = local74.aClass5_2;
			this.aClass4_Sub1_Sub1_5 = local74.aClass4_Sub1_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!vm;II)Lclient!jn;")
	@Override
	public Class5 method4727(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		return this.method4206(arg1, arg0);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	@Override
	public void method4731() {
		if (this.aClass5_7 != null) {
			this.aClass5_7.method4024();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)I")
	@Override
	public int method4194() {
		return this.aClass5_7 == null ? 0 : this.aClass5_7.method4020();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLclient!vm;)V")
	@Override
	public void method4732(@OriginalArg(1) Class92 arg0) {
		@Pc(31) Class4_Sub1_Sub1 local31;
		if (this.aClass4_Sub1_Sub1_5 == null && this.aBoolean426) {
			@Pc(24) Class69 local24 = this.method4208(131072, true, arg0);
			local31 = local24 == null ? null : local24.aClass4_Sub1_Sub1_1;
		} else {
			local31 = this.aClass4_Sub1_Sub1_5;
			this.aClass4_Sub1_Sub1_5 = null;
		}
		if (local31 != null) {
			Static8.method239(local31, this.aByte62, super.anInt5064, super.anInt5077, null);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!vm;)V")
	@Override
	public void method4730(@OriginalArg(1) Class92 arg0) {
		@Pc(29) Class4_Sub1_Sub1 local29;
		if (this.aClass4_Sub1_Sub1_5 == null && this.aBoolean426) {
			@Pc(22) Class69 local22 = this.method4208(131072, true, arg0);
			local29 = local22 == null ? null : local22.aClass4_Sub1_Sub1_1;
		} else {
			local29 = this.aClass4_Sub1_Sub1_5;
			this.aClass4_Sub1_Sub1_5 = null;
		}
		if (local29 != null) {
			Static333.method74(local29, this.aByte62, super.anInt5064, super.anInt5077, null);
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)I")
	@Override
	public int method4734() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4728() {
		return this.aBoolean426;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
	@Override
	public int method4729() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)I")
	@Override
	public int method4733() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!vm;Z)Lclient!jn;")
	private Class5 method4206(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1) {
		if (this.aClass5_7 != null && arg1.method4501(this.aClass5_7.method3992(), arg0) == 0) {
			return this.aClass5_7;
		} else {
			@Pc(23) Class69 local23 = this.method4208(arg0, false, arg1);
			return local23 == null ? null : local23.aClass5_2;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZLclient!vm;I)Lclient!f;")
	private Class69 method4208(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class92 arg2) {
		@Pc(17) Class56 local17 = Static320.method5290(this.aShort73 & 0xFFFF);
		@Pc(25) Class26 local25;
		@Pc(31) Class26 local31;
		if (this.aBoolean428) {
			local25 = Static5.aClass26Array1[this.aByte62];
			local31 = Static310.aClass26Array4[0];
		} else {
			local25 = Static310.aClass26Array4[this.aByte62];
			if (this.aByte62 >= 3) {
				local31 = null;
			} else {
				local31 = Static310.aClass26Array4[this.aByte62 + 1];
			}
		}
		return local17.method1088(arg1, local25, super.anInt5076, local31, arg0, super.anInt5064, this.aByte64, arg2, this.aByte63, super.anInt5077);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		if (this.aClass5_7 == null) {
			return null;
		}
		@Pc(11) Class23 local11 = arg0.method4466();
		local11.method5091(super.anInt5064 + super.anInt5065, super.anInt5076, super.anInt5077 + super.anInt5075);
		@Pc(33) Class17_Sub2 local33 = null;
		if (this.aBoolean427) {
			local33 = Static238.method4100(1);
		}
		this.aClass5_7.method4029(local11, local33 == null ? null : local33.aClass17_Sub6Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(9) Class5 local9 = this.method4206(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(24) Class23 local24 = arg2.method4466();
			local24.method5091(super.anInt5064, super.anInt5076, super.anInt5077);
			return local9.method3995(arg0, arg1, local24, false);
		}
	}
}
