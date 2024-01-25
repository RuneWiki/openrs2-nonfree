import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!im", name = "F", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "Z")
	private final boolean aBoolean254;

	@OriginalMember(owner = "client!im", name = "K", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "Z")
	private final boolean aBoolean255;

	@OriginalMember(owner = "client!im", name = "y", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!im", name = "Z", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!im", name = "T", descriptor = "S")
	private final short aShort44;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "Z")
	private final boolean aBoolean253;

	@OriginalMember(owner = "client!im", name = "W", descriptor = "Lclient!ve;")
	private Class4_Sub1_Sub1 aClass4_Sub1_Sub1_3;

	@OriginalMember(owner = "client!im", name = "D", descriptor = "Lclient!jn;")
	public Class5 aClass5_4;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!vm;Lclient!ds;IIIIZIIZ)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static35.method650(arg7, arg8));
		super.anInt3993 = (short) arg3;
		this.aByte40 = (byte) arg8;
		this.aBoolean254 = arg6;
		this.aByte41 = (byte) arg7;
		this.aBoolean255 = arg1.anInt1336 != 0;
		this.aBoolean252 = arg9;
		super.anInt3992 = (short) arg5;
		this.aByte42 = (byte) arg2;
		this.aShort44 = (short) arg1.anInt1346;
		this.aBoolean253 = arg0.method4534() && arg1.aBoolean111 && !this.aBoolean254 && Static192.anInt4154 != 0;
		@Pc(71) int local71 = 1024;
		if (this.aBoolean252) {
			local71 |= 0x8000;
		}
		@Pc(86) Class69 local86 = this.method2676(this.aBoolean253, local71, arg0);
		if (local86 != null) {
			this.aClass4_Sub1_Sub1_3 = local86.aClass4_Sub1_Sub1_1;
			this.aClass5_4 = local86.aClass5_2;
			if (this.aBoolean252) {
				this.aClass5_4 = this.aClass5_4.method4018((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4728() {
		return this.aBoolean253;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5411() {
		return this.aBoolean252;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I")
	@Override
	public int method4729() {
		return this.aShort44 & 0xFFFF;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		if (this.aClass5_4 == null) {
			return null;
		}
		@Pc(17) Class23 local17 = arg0.method4466();
		local17.method5091(super.anInt3993, super.anInt3999, super.anInt3992);
		@Pc(27) Class17_Sub2 local27 = null;
		if (this.aBoolean255) {
			local27 = Static238.method4100(1);
		}
		this.aClass5_4.method4029(local17, local27 == null ? null : local27.aClass17_Sub6Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		if (arg3 instanceof Class2_Sub4_Sub1) {
			@Pc(28) Class2_Sub4_Sub1 local28 = (Class2_Sub4_Sub1) arg3;
			if (this.aClass5_4 != null && local28.aClass5_4 != null) {
				this.aClass5_4.method4005(local28.aClass5_4, arg2, arg1, arg4, arg0);
			}
		} else if (arg3 instanceof Class2_Sub2_Sub2) {
			@Pc(8) Class2_Sub2_Sub2 local8 = (Class2_Sub2_Sub2) arg3;
			if (this.aClass5_4 != null && local8.aClass5_1 != null) {
				this.aClass5_4.method4005(local8.aClass5_1, arg2, arg1, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZIILclient!vm;)Lclient!f;")
	private Class69 method2676(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(22) Class56 local22 = Static320.method5290(this.aShort44 & 0xFFFF);
		@Pc(30) Class26 local30;
		@Pc(43) Class26 local43;
		if (this.aBoolean254) {
			local30 = Static5.aClass26Array1[this.aByte42];
			local43 = Static310.aClass26Array4[0];
		} else {
			local30 = Static310.aClass26Array4[this.aByte42];
			if (this.aByte42 < 3) {
				local43 = Static310.aClass26Array4[this.aByte42 + 1];
			} else {
				local43 = null;
			}
		}
		return local22.method1088(arg0, local30, super.anInt3999, local43, arg1, super.anInt3993, this.aByte41, arg2, this.aByte40, super.anInt3992);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I")
	@Override
	public int method4733() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(B)I")
	@Override
	public int method4734() {
		return this.aByte40;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!vm;II)Lclient!jn;")
	@Override
	public Class5 method4727(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		return this.method2678(arg0, arg1);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!vm;)V")
	@Override
	public void method4730(@OriginalArg(1) Class92 arg0) {
		@Pc(27) Class4_Sub1_Sub1 local27;
		if (this.aClass4_Sub1_Sub1_3 == null && this.aBoolean253) {
			@Pc(20) Class69 local20 = this.method2676(true, 131072, arg0);
			local27 = local20 == null ? null : local20.aClass4_Sub1_Sub1_1;
		} else {
			local27 = this.aClass4_Sub1_Sub1_3;
			this.aClass4_Sub1_Sub1_3 = null;
		}
		if (local27 != null) {
			Static333.method74(local27, this.aByte42, super.anInt3993, super.anInt3992, null);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZLclient!vm;)V")
	@Override
	public void method4732(@OriginalArg(1) Class92 arg0) {
		@Pc(14) Class4_Sub1_Sub1 local14;
		if (this.aClass4_Sub1_Sub1_3 == null && this.aBoolean253) {
			@Pc(25) Class69 local25 = this.method2676(true, 131072, arg0);
			local14 = local25 == null ? null : local25.aClass4_Sub1_Sub1_1;
		} else {
			local14 = this.aClass4_Sub1_Sub1_3;
			this.aClass4_Sub1_Sub1_3 = null;
		}
		if (local14 != null) {
			Static8.method239(local14, this.aByte42, super.anInt3993, super.anInt3992, null);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(Lclient!vm;II)Lclient!jn;")
	private Class5 method2678(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass5_4 != null && arg0.method4501(this.aClass5_4.method3992(), arg1) == 0) {
			return this.aClass5_4;
		} else {
			@Pc(34) Class69 local34 = this.method2676(false, arg1, arg0);
			return local34 == null ? null : local34.aClass5_2;
		}
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
	@Override
	public void method5408() {
		this.aBoolean252 = false;
		if (this.aClass5_4 != null) {
			this.aClass5_4.method3988(this.aClass5_4.method3992() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
	@Override
	public void method4731() {
		if (this.aClass5_4 != null) {
			this.aClass5_4.method4024();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(11) Class5 local11 = this.method2678(arg2, 65536);
		if (local11 == null) {
			return false;
		} else {
			@Pc(16) Class23 local16 = arg2.method4466();
			local16.method5091(super.anInt3993, super.anInt3999, super.anInt3992);
			return local11.method3995(arg0, arg1, local16, false);
		}
	}
}
