import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class17_Sub4_Sub2 extends Class17_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!on", name = "D", descriptor = "Z")
	private final boolean aBoolean456;

	@OriginalMember(owner = "client!on", name = "I", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!on", name = "C", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "Z")
	private final boolean aBoolean455;

	@OriginalMember(owner = "client!on", name = "S", descriptor = "Z")
	private boolean aBoolean457;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "S")
	private final short aShort56;

	@OriginalMember(owner = "client!on", name = "M", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!on", name = "W", descriptor = "Z")
	private final boolean aBoolean458;

	@OriginalMember(owner = "client!on", name = "O", descriptor = "Lclient!gi;")
	private Class1_Sub4_Sub10 aClass1_Sub4_Sub10_4;

	@OriginalMember(owner = "client!on", name = "N", descriptor = "Lclient!ge;")
	public Class73 aClass73_5;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIZIIZ)V")
	public Class17_Sub4_Sub2(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static321.method5246(arg8, arg7));
		super.anInt4674 = (short) arg3;
		this.aBoolean456 = arg6;
		this.aByte41 = (byte) arg8;
		super.anInt4675 = (short) arg5;
		this.aByte40 = (byte) arg2;
		this.aBoolean455 = arg1.anInt4294 != 0 && !arg6;
		this.aBoolean457 = arg9;
		this.aShort56 = (short) arg1.anInt4281;
		this.aByte42 = (byte) arg7;
		this.aBoolean458 = arg0.method2160() && arg1.aBoolean402 && !this.aBoolean456 && Static163.anInt3549 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean457) {
			local67 |= 0x8000;
		}
		@Pc(82) Class26 local82 = this.method4219(arg0, this.aBoolean458, local67);
		if (local82 != null) {
			this.aClass1_Sub4_Sub10_4 = local82.aClass1_Sub4_Sub10_1;
			this.aClass73_5 = local82.aClass73_1;
			if (this.aBoolean457) {
				this.aClass73_5 = this.aClass73_5.method3306((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)I")
	@Override
	public int method4794() {
		return this.aByte42;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	@Override
	public void method4801() {
		if (this.aClass73_5 != null) {
			this.aClass73_5.method3321();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class73 local14 = this.method4222(arg0, 65536);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class109 local19 = arg0.method2194();
			local19.method3873(super.anInt4674, super.anInt4679, super.anInt4675);
			return local14.method3326(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!uo;ZIB)Lclient!cb;")
	private Class26 method4219(@OriginalArg(0) Class32 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class141 local12 = Static119.method2548(this.aShort56 & 0xFFFF);
		@Pc(29) Class53 local29;
		@Pc(24) Class53 local24;
		if (this.aBoolean456) {
			local24 = Static190.aClass53Array1[0];
			local29 = Static269.aClass53Array2[this.aByte40];
		} else {
			local29 = Static190.aClass53Array1[this.aByte40];
			if (this.aByte40 >= 3) {
				local24 = null;
			} else {
				local24 = Static190.aClass53Array1[this.aByte40 + 1];
			}
		}
		return local12.method3848(local24, this.aByte41, super.anInt4679, super.anInt4675, super.anInt4674, local29, this.aByte42, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4800(@OriginalArg(0) Class32 arg0) {
		@Pc(22) Class1_Sub4_Sub10 local22;
		if (this.aClass1_Sub4_Sub10_4 == null && this.aBoolean458) {
			@Pc(33) Class26 local33 = this.method4219(arg0, true, 131072);
			local22 = local33 == null ? null : local33.aClass1_Sub4_Sub10_1;
		} else {
			local22 = this.aClass1_Sub4_Sub10_4;
			this.aClass1_Sub4_Sub10_4 = null;
		}
		if (local22 != null) {
			Static75.method1716(local22, this.aByte40, super.anInt4674, super.anInt4675, null);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4795() {
		return this.aBoolean458;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		if (arg5 instanceof Class17_Sub4_Sub2) {
			@Pc(9) Class17_Sub4_Sub2 local9 = (Class17_Sub4_Sub2) arg5;
			if (this.aClass73_5 != null && local9.aClass73_5 != null) {
				this.aClass73_5.method3305(local9.aClass73_5, arg2, arg3, arg1, arg4);
			}
		} else if (arg5 instanceof Class17_Sub1_Sub5) {
			@Pc(32) Class17_Sub1_Sub5 local32 = (Class17_Sub1_Sub5) arg5;
			if (this.aClass73_5 != null && local32.aClass73_6 != null) {
				this.aClass73_5.method3305(local32.aClass73_6, arg2, arg3, arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		if (this.aClass73_5 == null) {
			return null;
		}
		@Pc(19) Class109 local19 = arg0.method2194();
		local19.method3873(super.anInt4674, super.anInt4679, super.anInt4675);
		@Pc(29) Class8_Sub5 local29 = null;
		if (this.aBoolean455) {
			local29 = Static239.method4367(1);
		}
		this.aClass73_5.method3322(local19, local29 == null ? null : local29.aClass8_Sub3Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	@Override
	public Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		return this.method4222(arg0, arg1);
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		this.aBoolean457 = false;
		if (this.aClass73_5 != null) {
			this.aClass73_5.method3287(this.aClass73_5.method3298() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)I")
	@Override
	public int method4797() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)I")
	@Override
	public int method4799() {
		return this.aShort56 & 0xFFFF;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return this.aBoolean457;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!uo;BI)Lclient!ge;")
	private Class73 method4222(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass73_5 != null && arg0.method2173(this.aClass73_5.method3298(), arg1) == 0) {
			return this.aClass73_5;
		} else {
			@Pc(31) Class26 local31 = this.method4219(arg0, false, arg1);
			return local31 == null ? null : local31.aClass73_1;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4796(@OriginalArg(0) Class32 arg0) {
		@Pc(31) Class1_Sub4_Sub10 local31;
		if (this.aClass1_Sub4_Sub10_4 == null && this.aBoolean458) {
			@Pc(24) Class26 local24 = this.method4219(arg0, true, 131072);
			local31 = local24 == null ? null : local24.aClass1_Sub4_Sub10_1;
		} else {
			local31 = this.aClass1_Sub4_Sub10_4;
			this.aClass1_Sub4_Sub10_4 = null;
		}
		if (local31 != null) {
			Static304.method5121(local31, this.aByte40, super.anInt4674, super.anInt4675, null);
		}
	}
}
