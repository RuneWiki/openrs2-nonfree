import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 implements Interface5 {

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "Z")
	private final boolean aBoolean392;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "B")
	private final byte aByte55;

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "S")
	private final short aShort58;

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "Z")
	private final boolean aBoolean393;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Z")
	private final boolean aBoolean390;

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Lclient!jn;")
	private Class5 aClass5_6;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Lclient!ve;")
	private Class4_Sub1_Sub1 aClass4_Sub1_Sub1_4;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!vm;Lclient!ds;IIIIZIZ)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean115, arg1.aBoolean108);
		this.aBoolean392 = arg6;
		this.aBoolean391 = arg8;
		super.anInt5559 = (short) arg5;
		this.aByte55 = (byte) arg7;
		this.aShort58 = (short) arg1.anInt1346;
		super.anInt5558 = (short) arg3;
		this.aBoolean393 = arg1.anInt1336 != 0;
		this.aByte56 = (byte) arg2;
		this.aBoolean390 = arg0.method4534() && arg1.aBoolean111 && !this.aBoolean392 && Static192.anInt4154 != 0;
		@Pc(64) int local64 = 1024;
		if (this.aBoolean391) {
			local64 |= 0x8000;
		}
		@Pc(79) Class69 local79 = this.method3807(this.aBoolean390, arg0, local64);
		if (local79 != null) {
			this.aClass5_6 = local79.aClass5_2;
			this.aClass4_Sub1_Sub1_4 = local79.aClass4_Sub1_Sub1_1;
			if (this.aBoolean391) {
				this.aClass5_6 = this.aClass5_6.method4018((byte) 0, local64, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	@Override
	public int method4729() {
		return this.aShort58 & 0xFFFF;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		if (!(arg3 instanceof Class2_Sub5_Sub1)) {
			return;
		}
		@Pc(13) Class2_Sub5_Sub1 local13 = (Class2_Sub5_Sub1) arg3;
		if (this.aClass5_6 != null && local13.aClass5_6 != null) {
			this.aClass5_6.method4005(local13.aClass5_6, arg2, arg1, arg4, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	@Override
	public void method5408() {
		this.aBoolean391 = false;
		if (this.aClass5_6 != null) {
			this.aClass5_6.method3988(this.aClass5_6.method3992() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!vm;IB)Lclient!jn;")
	private Class5 method3804(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass5_6 != null && arg0.method4501(this.aClass5_6.method3992(), arg1) == 0) {
			return this.aClass5_6;
		} else {
			@Pc(30) Class69 local30 = this.method3807(false, arg0, arg1);
			return local30 == null ? null : local30.aClass5_2;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)I")
	@Override
	public int method4734() {
		return this.aByte55;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLclient!vm;)V")
	@Override
	public void method4732(@OriginalArg(1) Class92 arg0) {
		@Pc(34) Class4_Sub1_Sub1 local34;
		if (this.aClass4_Sub1_Sub1_4 == null && this.aBoolean390) {
			@Pc(27) Class69 local27 = this.method3807(true, arg0, 131072);
			local34 = local27 == null ? null : local27.aClass4_Sub1_Sub1_1;
		} else {
			local34 = this.aClass4_Sub1_Sub1_4;
			this.aClass4_Sub1_Sub1_4 = null;
		}
		if (local34 != null) {
			Static8.method239(local34, this.aByte56, super.anInt5558, super.anInt5559, null);
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5411() {
		return this.aBoolean391;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(9) Class5 local9 = this.method3804(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class23 local20 = arg2.method4466();
			local20.method5091(super.anInt5558, super.anInt5562, super.anInt5559);
			return local9.method3995(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	@Override
	public void method4731() {
		if (this.aClass5_6 != null) {
			this.aClass5_6.method4024();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!vm;II)Lclient!jn;")
	@Override
	public Class5 method4727(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		return this.method3804(arg0, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLclient!vm;IB)Lclient!f;")
	private Class69 method3807(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class56 local12 = Static320.method5290(this.aShort58 & 0xFFFF);
		@Pc(31) Class26 local31;
		@Pc(26) Class26 local26;
		if (this.aBoolean392) {
			local26 = Static310.aClass26Array4[0];
			local31 = Static5.aClass26Array1[this.aByte56];
		} else {
			local31 = Static310.aClass26Array4[this.aByte56];
			if (this.aByte56 < 3) {
				local26 = Static310.aClass26Array4[this.aByte56 + 1];
			} else {
				local26 = null;
			}
		}
		return local12.method1088(arg0, local31, super.anInt5562, local26, arg2, super.anInt5558, 22, arg1, this.aByte55, super.anInt5559);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4728() {
		return this.aBoolean390;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)I")
	@Override
	public int method4733() {
		return 22;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!vm;)V")
	@Override
	public void method4730(@OriginalArg(1) Class92 arg0) {
		@Pc(25) Class4_Sub1_Sub1 local25;
		if (this.aClass4_Sub1_Sub1_4 == null && this.aBoolean390) {
			@Pc(18) Class69 local18 = this.method3807(true, arg0, 131072);
			local25 = local18 == null ? null : local18.aClass4_Sub1_Sub1_1;
		} else {
			local25 = this.aClass4_Sub1_Sub1_4;
			this.aClass4_Sub1_Sub1_4 = null;
		}
		if (local25 != null) {
			Static333.method74(local25, this.aByte56, super.anInt5558, super.anInt5559, null);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		if (this.aClass5_6 == null) {
			return null;
		}
		@Pc(11) Class23 local11 = arg0.method4466();
		local11.method5091(super.anInt5558, super.anInt5562, super.anInt5559);
		@Pc(21) Class17_Sub2 local21 = null;
		if (this.aBoolean393) {
			local21 = Static238.method4100(1);
		}
		this.aClass5_6.method4029(local11, local21 == null ? null : local21.aClass17_Sub6Array1[0], 0);
		return local21;
	}
}
