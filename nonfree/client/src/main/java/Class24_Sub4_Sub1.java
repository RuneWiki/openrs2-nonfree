import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class24_Sub4_Sub1 extends Class24_Sub4 implements Interface10 {

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "Z")
	private final boolean aBoolean298;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "S")
	private final short aShort71;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Z")
	private final boolean aBoolean296;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Z")
	private final boolean aBoolean295;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "Lclient!i;")
	private Class10_Sub1_Sub7 aClass10_Sub1_Sub7_2;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!e;")
	private Class63 aClass63_2;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIZIZ)V")
	public Class24_Sub4_Sub1(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt3796, arg1.aBoolean243, arg1.aBoolean252);
		super.anInt5734 = arg5;
		super.anInt5738 = arg3;
		this.aBoolean297 = arg8;
		this.aByte56 = (byte) arg7;
		this.aBoolean298 = arg6;
		this.aShort71 = (short) arg1.anInt3798;
		this.aBoolean296 = arg1.anInt3778 != 0 && !arg6;
		this.aByte57 = (byte) arg2;
		this.aBoolean295 = arg0.method5867() && arg1.aBoolean253 && !this.aBoolean298 && Static361.aClass85_Sub1_1.method2106(Static423.anInt7114) != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean297) {
			local66 |= 0x10000;
		}
		@Pc(81) Class210 local81 = this.method3586(local66, this.aBoolean295, arg0);
		if (local81 != null) {
			this.aClass10_Sub1_Sub7_2 = local81.aClass10_Sub1_Sub7_4;
			this.aClass63_2 = local81.aClass63_5;
			if (this.aBoolean297) {
				this.aClass63_2 = this.aClass63_2.method6093((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return this.aBoolean295;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		if (this.aClass63_2 == null) {
			return null;
		}
		@Pc(11) Class34 local11 = arg0.method5819();
		local11.U(super.anInt5738, super.anInt5733, super.anInt5734);
		@Pc(27) Class40_Sub5 local27 = null;
		if (this.aBoolean296) {
			local27 = Static171.method2916(1);
		}
		this.aClass63_2.method6090(local11, local27 == null ? null : local27.aClass40_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return 22;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return this.aShort71 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class63 local9 = this.method3585(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class34 local14 = arg0.method5819();
			local14.U(super.anInt5738, super.anInt5733, super.anInt5734);
			return local9.method6101(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
		@Pc(14) Class10_Sub1_Sub7 local14;
		if (this.aClass10_Sub1_Sub7_2 == null && this.aBoolean295) {
			@Pc(25) Class210 local25 = this.method3586(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass10_Sub1_Sub7_4;
		} else {
			local14 = this.aClass10_Sub1_Sub7_2;
			this.aClass10_Sub1_Sub7_2 = null;
		}
		if (local14 != null) {
			Static419.method5516(local14, this.aByte57, super.anInt5738, super.anInt5734, null);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return this.method3585(arg0, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
		@Pc(31) Class10_Sub1_Sub7 local31;
		if (this.aClass10_Sub1_Sub7_2 == null && this.aBoolean295) {
			@Pc(24) Class210 local24 = this.method3586(262144, true, arg0);
			local31 = local24 == null ? null : local24.aClass10_Sub1_Sub7_4;
		} else {
			local31 = this.aClass10_Sub1_Sub7_2;
			this.aClass10_Sub1_Sub7_2 = null;
		}
		if (local31 != null) {
			Static116.method2047(local31, this.aByte57, super.anInt5738, super.anInt5734, null);
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (!(arg2 instanceof Class24_Sub4_Sub1)) {
			return;
		}
		@Pc(21) Class24_Sub4_Sub1 local21 = (Class24_Sub4_Sub1) arg2;
		if (this.aClass63_2 != null && local21.aClass63_2 != null) {
			this.aClass63_2.method6086(local21.aClass63_2, arg1, arg0, arg5, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return this.aBoolean297;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		this.aBoolean297 = false;
		if (this.aClass63_2 != null) {
			this.aClass63_2.D(this.aClass63_2.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!za;IB)Lclient!e;")
	private Class63 method3585(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass63_2 != null && arg0.method5856(this.aClass63_2.RA(), arg1) == 0) {
			return this.aClass63_2;
		} else {
			@Pc(34) Class210 local34 = this.method3586(arg1, false, arg0);
			return local34 == null ? null : local34.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIZLclient!za;)Lclient!rn;")
	private Class210 method3586(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class50 arg2) {
		@Pc(19) Class126 local19 = Static342.aClass237_4.method5212(this.aShort71 & 0xFFFF);
		@Pc(27) Class154 local27;
		@Pc(33) Class154 local33;
		if (this.aBoolean298) {
			local33 = Static256.aClass154Array2[0];
			local27 = Static173.aClass154Array1[this.aByte57];
		} else {
			local27 = Static256.aClass154Array2[this.aByte57];
			if (this.aByte57 >= 3) {
				local33 = null;
			} else {
				local33 = Static256.aClass154Array2[this.aByte57 + 1];
			}
		}
		return local19.method3014(arg1, this.aByte56, super.anInt5738, super.anInt5734, super.anInt5733, arg0, local27, arg2, 22, local33);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
		if (this.aClass63_2 != null) {
			this.aClass63_2.method6089();
		}
	}
}
