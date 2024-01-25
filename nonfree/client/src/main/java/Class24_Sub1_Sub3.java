import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class24_Sub1_Sub3 extends Class24_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!ns", name = "ab", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "Z")
	private final boolean aBoolean331;

	@OriginalMember(owner = "client!ns", name = "K", descriptor = "S")
	private final short aShort73;

	@OriginalMember(owner = "client!ns", name = "C", descriptor = "Z")
	private final boolean aBoolean332;

	@OriginalMember(owner = "client!ns", name = "y", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!ns", name = "W", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!ns", name = "F", descriptor = "Z")
	private final boolean aBoolean333;

	@OriginalMember(owner = "client!ns", name = "N", descriptor = "Lclient!e;")
	private Class63 aClass63_4;

	@OriginalMember(owner = "client!ns", name = "U", descriptor = "Lclient!i;")
	private Class10_Sub1_Sub7 aClass10_Sub1_Sub7_3;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIZIIIII)V")
	public Class24_Sub1_Sub3(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static70.method1362(arg11, arg10));
		this.aByte60 = (byte) arg2;
		super.anInt4861 = arg3;
		this.aBoolean331 = arg6;
		this.aShort73 = (short) arg1.anInt3798;
		this.aBoolean332 = arg1.anInt3778 != 0 && !arg6;
		this.aByte58 = (byte) arg10;
		this.aByte59 = (byte) arg11;
		super.anInt4858 = arg5;
		this.aBoolean333 = arg0.method5867() && arg1.aBoolean253 && !this.aBoolean331 && Static361.aClass85_Sub1_1.method2106(Static423.anInt7114) != 0;
		@Pc(80) Class210 local80 = this.method3943(2048, this.aBoolean333, arg0);
		if (local80 != null) {
			this.aClass63_4 = local80.aClass63_5;
			this.aClass10_Sub1_Sub7_3 = local80.aClass10_Sub1_Sub7_4;
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return this.aByte59;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return this.method3942(arg0, arg1);
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)I")
	@Override
	public int method3930() {
		return this.aClass63_4 == null ? 0 : this.aClass63_4.B();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return this.aBoolean333;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLclient!za;I)Lclient!e;")
	private Class63 method3942(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass63_4 != null && arg0.method5856(this.aClass63_4.RA(), arg1) == 0) {
			return this.aClass63_4;
		} else {
			@Pc(34) Class210 local34 = this.method3943(arg1, false, arg0);
			return local34 == null ? null : local34.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
		if (this.aClass63_4 != null) {
			this.aClass63_4.method6089();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
		@Pc(14) Class10_Sub1_Sub7 local14;
		if (this.aClass10_Sub1_Sub7_3 == null && this.aBoolean333) {
			@Pc(25) Class210 local25 = this.method3943(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass10_Sub1_Sub7_4;
		} else {
			local14 = this.aClass10_Sub1_Sub7_3;
			this.aClass10_Sub1_Sub7_3 = null;
		}
		if (local14 != null) {
			Static116.method2047(local14, this.aByte60, super.anInt4861, super.anInt4858, null);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BIZLclient!za;)Lclient!rn;")
	private Class210 method3943(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class50 arg2) {
		@Pc(18) Class126 local18 = Static342.aClass237_4.method5212(this.aShort73 & 0xFFFF);
		@Pc(43) Class154 local43;
		@Pc(34) Class154 local34;
		if (this.aBoolean331) {
			local43 = Static173.aClass154Array1[this.aByte60];
			local34 = Static256.aClass154Array2[0];
		} else {
			if (this.aByte60 < 3) {
				local34 = Static256.aClass154Array2[this.aByte60 + 1];
			} else {
				local34 = null;
			}
			local43 = Static256.aClass154Array2[this.aByte60];
		}
		return local18.method3014(arg1, this.aByte59, super.anInt4861, super.anInt4858, super.anInt4859, arg0, local43, arg2, this.aByte58, local34);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
		@Pc(20) Class10_Sub1_Sub7 local20;
		if (this.aClass10_Sub1_Sub7_3 == null && this.aBoolean333) {
			@Pc(31) Class210 local31 = this.method3943(262144, true, arg0);
			local20 = local31 == null ? null : local31.aClass10_Sub1_Sub7_4;
		} else {
			local20 = this.aClass10_Sub1_Sub7_3;
			this.aClass10_Sub1_Sub7_3 = null;
		}
		if (local20 != null) {
			Static419.method5516(local20, this.aByte60, super.anInt4861, super.anInt4858, null);
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		if (this.aClass63_4 == null) {
			return null;
		}
		@Pc(11) Class34 local11 = arg0.method5819();
		local11.U(super.anInt4871 + super.anInt4861, super.anInt4859, super.anInt4858 + super.anInt4866);
		@Pc(34) Class40_Sub5 local34 = null;
		if (this.aBoolean332) {
			local34 = Static171.method2916(1);
		}
		this.aClass63_4.method6090(local11, local34 == null ? null : local34.aClass40_Sub8Array1[0], 0);
		return local34;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class63 local14 = this.method3942(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class34 local19 = arg0.method5819();
			local19.U(super.anInt4861, super.anInt4859, super.anInt4858);
			return local14.method6101(arg2, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return this.aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return this.aByte58;
	}
}
