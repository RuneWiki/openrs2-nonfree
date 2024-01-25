import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class17_Sub3_Sub2 extends Class17_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!rm", name = "N", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!rm", name = "M", descriptor = "S")
	private final short aShort85;

	@OriginalMember(owner = "client!rm", name = "Z", descriptor = "Z")
	private final boolean aBoolean544;

	@OriginalMember(owner = "client!rm", name = "S", descriptor = "Z")
	private final boolean aBoolean543;

	@OriginalMember(owner = "client!rm", name = "ab", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!rm", name = "Y", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!rm", name = "H", descriptor = "Z")
	private final boolean aBoolean542;

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "Lclient!gi;")
	private Class1_Sub4_Sub10 aClass1_Sub4_Sub10_6;

	@OriginalMember(owner = "client!rm", name = "W", descriptor = "Lclient!ge;")
	private Class73 aClass73_7;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIZIIIII)V")
	public Class17_Sub3_Sub2(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static273.method4775(arg11, arg10));
		super.anInt5588 = (short) arg5;
		this.aByte60 = (byte) arg11;
		this.aShort85 = (short) arg1.anInt4281;
		super.anInt5586 = (short) arg3;
		this.aBoolean544 = arg1.anInt4294 != 0 && !arg6;
		this.aBoolean543 = arg6;
		this.aByte62 = (byte) arg2;
		this.aByte61 = (byte) arg10;
		this.aBoolean542 = arg0.method2160() && arg1.aBoolean402 && !this.aBoolean543 && Static163.anInt3549 != 0;
		@Pc(76) Class26 local76 = this.method4803(arg0, 1024, this.aBoolean542);
		if (local76 != null) {
			this.aClass1_Sub4_Sub10_6 = local76.aClass1_Sub4_Sub10_1;
			this.aClass73_7 = local76.aClass73_1;
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)I")
	@Override
	public int method4799() {
		return this.aShort85 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IILclient!uo;)Lclient!ge;")
	private Class73 method4802(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1) {
		if (this.aClass73_7 != null && arg1.method2173(this.aClass73_7.method3298(), arg0) == 0) {
			return this.aClass73_7;
		} else {
			@Pc(31) Class26 local31 = this.method4803(arg1, arg0, false);
			return local31 == null ? null : local31.aClass73_1;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4796(@OriginalArg(0) Class32 arg0) {
		@Pc(27) Class1_Sub4_Sub10 local27;
		if (this.aClass1_Sub4_Sub10_6 == null && this.aBoolean542) {
			@Pc(20) Class26 local20 = this.method4803(arg0, 131072, true);
			local27 = local20 == null ? null : local20.aClass1_Sub4_Sub10_1;
		} else {
			local27 = this.aClass1_Sub4_Sub10_6;
			this.aClass1_Sub4_Sub10_6 = null;
		}
		if (local27 != null) {
			Static304.method5121(local27, this.aByte62, super.anInt5586, super.anInt5588, null);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4795() {
		return this.aBoolean542;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!uo;IZ)Lclient!cb;")
	private Class26 method4803(@OriginalArg(1) Class32 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class141 local12 = Static119.method2548(this.aShort85 & 0xFFFF);
		@Pc(43) Class53 local43;
		@Pc(29) Class53 local29;
		if (this.aBoolean543) {
			local43 = Static269.aClass53Array2[this.aByte62];
			local29 = Static190.aClass53Array1[0];
		} else {
			if (this.aByte62 >= 3) {
				local29 = null;
			} else {
				local29 = Static190.aClass53Array1[this.aByte62 + 1];
			}
			local43 = Static190.aClass53Array1[this.aByte62];
		}
		return local12.method3848(local29, this.aByte60, super.anInt5583, super.anInt5588, super.anInt5586, local43, this.aByte61, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "(I)I")
	@Override
	public int method4792() {
		return this.aClass73_7 == null ? 0 : this.aClass73_7.method3327();
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)I")
	@Override
	public int method4797() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	@Override
	public Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		return this.method4802(arg1, arg0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I")
	@Override
	public int method4794() {
		return this.aByte61;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class73 local9 = this.method4802(65536, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class109 local19 = arg0.method2194();
			local19.method3873(super.anInt5586, super.anInt5583, super.anInt5588);
			return local9.method3326(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4800(@OriginalArg(0) Class32 arg0) {
		@Pc(14) Class1_Sub4_Sub10 local14;
		if (this.aClass1_Sub4_Sub10_6 == null && this.aBoolean542) {
			@Pc(25) Class26 local25 = this.method4803(arg0, 131072, true);
			local14 = local25 == null ? null : local25.aClass1_Sub4_Sub10_1;
		} else {
			local14 = this.aClass1_Sub4_Sub10_6;
			this.aClass1_Sub4_Sub10_6 = null;
		}
		if (local14 != null) {
			Static75.method1716(local14, this.aByte62, super.anInt5586, super.anInt5588, null);
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	@Override
	public void method4801() {
		if (this.aClass73_7 != null) {
			this.aClass73_7.method3321();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		if (this.aClass73_7 == null) {
			return null;
		}
		@Pc(11) Class109 local11 = arg0.method2194();
		local11.method3873(super.anInt5587 + super.anInt5586, super.anInt5583, super.anInt5581 + super.anInt5588);
		@Pc(35) Class8_Sub5 local35 = null;
		if (this.aBoolean544) {
			local35 = Static239.method4367(1);
		}
		this.aClass73_7.method3322(local11, local35 == null ? null : local35.aClass8_Sub3Array1[0], 0);
		return local35;
	}
}
