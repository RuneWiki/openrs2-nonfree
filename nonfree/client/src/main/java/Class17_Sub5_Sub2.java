import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class17_Sub5_Sub2 extends Class17_Sub5 implements Interface5 {

	@OriginalMember(owner = "client!om", name = "Z", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!om", name = "bb", descriptor = "Z")
	private final boolean aBoolean452;

	@OriginalMember(owner = "client!om", name = "S", descriptor = "S")
	private final short aShort55;

	@OriginalMember(owner = "client!om", name = "ab", descriptor = "Z")
	private final boolean aBoolean451;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "Z")
	private final boolean aBoolean449;

	@OriginalMember(owner = "client!om", name = "T", descriptor = "Lclient!gi;")
	private Class1_Sub4_Sub10 aClass1_Sub4_Sub10_3;

	@OriginalMember(owner = "client!om", name = "cb", descriptor = "Lclient!ge;")
	private Class73 aClass73_4;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIZIZ)V")
	public Class17_Sub5_Sub2(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean401, arg1.aBoolean407);
		this.aByte39 = (byte) arg7;
		this.aByte38 = (byte) arg2;
		this.aBoolean452 = arg1.anInt4294 != 0 && !arg6;
		this.aShort55 = (short) arg1.anInt4281;
		this.aBoolean451 = arg6;
		this.aBoolean450 = arg8;
		super.anInt4642 = (short) arg3;
		super.anInt4641 = (short) arg5;
		this.aBoolean449 = arg0.method2160() && arg1.aBoolean402 && !this.aBoolean451 && Static163.anInt3549 != 0;
		@Pc(63) int local63 = 1024;
		if (this.aBoolean450) {
			local63 |= 0x8000;
		}
		@Pc(78) Class26 local78 = this.method4194(arg0, this.aBoolean449, local63);
		if (local78 != null) {
			this.aClass1_Sub4_Sub10_3 = local78.aClass1_Sub4_Sub10_1;
			this.aClass73_4 = local78.aClass73_1;
			if (this.aBoolean450) {
				this.aClass73_4 = this.aClass73_4.method3306((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4796(@OriginalArg(0) Class32 arg0) {
		@Pc(25) Class1_Sub4_Sub10 local25;
		if (this.aClass1_Sub4_Sub10_3 == null && this.aBoolean449) {
			@Pc(18) Class26 local18 = this.method4194(arg0, true, 131072);
			local25 = local18 == null ? null : local18.aClass1_Sub4_Sub10_1;
		} else {
			local25 = this.aClass1_Sub4_Sub10_3;
			this.aClass1_Sub4_Sub10_3 = null;
		}
		if (local25 != null) {
			Static304.method5121(local25, this.aByte38, super.anInt4642, super.anInt4641, null);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	@Override
	public Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		return this.method4193(arg1, arg0);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)I")
	@Override
	public int method4799() {
		return this.aShort55 & 0xFFFF;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)I")
	@Override
	public int method4797() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
	@Override
	public int method4794() {
		return 22;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4795() {
		return this.aBoolean449;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4800(@OriginalArg(0) Class32 arg0) {
		@Pc(14) Class1_Sub4_Sub10 local14;
		if (this.aClass1_Sub4_Sub10_3 == null && this.aBoolean449) {
			@Pc(25) Class26 local25 = this.method4194(arg0, true, 131072);
			local14 = local25 == null ? null : local25.aClass1_Sub4_Sub10_1;
		} else {
			local14 = this.aClass1_Sub4_Sub10_3;
			this.aClass1_Sub4_Sub10_3 = null;
		}
		if (local14 != null) {
			Static75.method1716(local14, this.aByte38, super.anInt4642, super.anInt4641, null);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		if (!(arg5 instanceof Class17_Sub5_Sub2)) {
			return;
		}
		@Pc(15) Class17_Sub5_Sub2 local15 = (Class17_Sub5_Sub2) arg5;
		if (this.aClass73_4 != null && local15.aClass73_4 != null) {
			this.aClass73_4.method3305(local15.aClass73_4, arg2, arg3, arg1, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		if (this.aClass73_4 == null) {
			return null;
		}
		@Pc(11) Class109 local11 = arg0.method2194();
		local11.method3873(super.anInt4642, super.anInt4639, super.anInt4641);
		@Pc(29) Class8_Sub5 local29 = null;
		if (this.aBoolean452) {
			local29 = Static239.method4367(1);
		}
		this.aClass73_4.method3322(local11, local29 == null ? null : local29.aClass8_Sub3Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class73 local14 = this.method4193(65536, arg0);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class109 local19 = arg0.method2194();
			local19.method3873(super.anInt4642, super.anInt4639, super.anInt4641);
			return local14.method3326(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return this.aBoolean450;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	@Override
	public void method4801() {
		if (this.aClass73_4 != null) {
			this.aClass73_4.method3321();
		}
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		this.aBoolean450 = false;
		if (this.aClass73_4 != null) {
			this.aClass73_4.method3287(this.aClass73_4.method3298() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!uo;I)Lclient!ge;")
	private Class73 method4193(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1) {
		if (this.aClass73_4 != null && arg1.method2173(this.aClass73_4.method3298(), arg0) == 0) {
			return this.aClass73_4;
		} else {
			@Pc(31) Class26 local31 = this.method4194(arg1, false, arg0);
			return local31 == null ? null : local31.aClass73_1;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!uo;ZBI)Lclient!cb;")
	private Class26 method4194(@OriginalArg(0) Class32 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class141 local12 = Static119.method2548(this.aShort55 & 0xFFFF);
		@Pc(20) Class53 local20;
		@Pc(24) Class53 local24;
		if (this.aBoolean451) {
			local20 = Static269.aClass53Array2[this.aByte38];
			local24 = Static190.aClass53Array1[0];
		} else {
			local20 = Static190.aClass53Array1[this.aByte38];
			if (this.aByte38 >= 3) {
				local24 = null;
			} else {
				local24 = Static190.aClass53Array1[this.aByte38 + 1];
			}
		}
		return local12.method3848(local24, this.aByte39, super.anInt4639, super.anInt4641, super.anInt4642, local20, 22, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
	}
}
