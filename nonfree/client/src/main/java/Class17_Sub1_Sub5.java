import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class17_Sub1_Sub5 extends Class17_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "Z")
	private final boolean aBoolean501;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "S")
	private final short aShort78;

	@OriginalMember(owner = "client!qb", name = "fb", descriptor = "Z")
	private final boolean aBoolean503;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!qb", name = "eb", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "Z")
	private boolean aBoolean500;

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "Z")
	private final boolean aBoolean502;

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "Lclient!gi;")
	private Class1_Sub4_Sub10 aClass1_Sub4_Sub10_5;

	@OriginalMember(owner = "client!qb", name = "cb", descriptor = "Lclient!ge;")
	public Class73 aClass73_6;

	static {
		new Class34("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIIZIIIIIIZ)V")
	public Class17_Sub1_Sub5(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4283 == 1, Static67.method1612(arg13, arg12));
		this.aBoolean501 = arg7;
		this.aByte53 = (byte) arg3;
		this.aShort78 = (short) arg1.anInt4281;
		this.aBoolean503 = arg1.anInt4294 != 0 && !arg7;
		this.aByte52 = (byte) arg13;
		this.aByte54 = (byte) arg12;
		this.aBoolean500 = arg14;
		this.aBoolean502 = arg0.method2160() && arg1.aBoolean402 && !this.aBoolean501 && Static163.anInt3549 != 0;
		@Pc(73) int local73 = 1024;
		if (this.aBoolean500) {
			local73 |= 0x8000;
		}
		@Pc(88) Class26 local88 = this.method4503(arg0, this.aBoolean502, local73);
		if (local88 != null) {
			this.aClass1_Sub4_Sub10_5 = local88.aClass1_Sub4_Sub10_1;
			this.aClass73_6 = local88.aClass73_1;
			if (this.aBoolean500) {
				this.aClass73_6 = this.aClass73_6.method3306((byte) 0, local73, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)I")
	public int method4502() {
		return this.aClass73_6 == null ? 15 : this.aClass73_6.method3289() / 4;
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		this.aBoolean500 = false;
		if (this.aClass73_6 != null) {
			this.aClass73_6.method3287(this.aClass73_6.method3298() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return this.aBoolean500;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class73 local14 = this.method4504(65536, arg0);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class109 local19 = arg0.method2194();
			local19.method3873(super.anInt5109, super.anInt5112, super.anInt5108);
			return local14.method3326(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!uo;ZI)Lclient!cb;")
	private Class26 method4503(@OriginalArg(1) Class32 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class141 local12 = Static119.method2548(this.aShort78 & 0xFFFF);
		@Pc(27) Class53 local27;
		@Pc(35) Class53 local35;
		if (this.aBoolean501) {
			local35 = Static190.aClass53Array1[0];
			local27 = Static269.aClass53Array2[this.aByte53];
		} else {
			local27 = Static190.aClass53Array1[this.aByte53];
			if (this.aByte53 >= 3) {
				local35 = null;
			} else {
				local35 = Static190.aClass53Array1[this.aByte53 + 1];
			}
		}
		return local12.method3848(local35, this.aByte54 == 11 ? this.aByte52 + 4 : this.aByte52, super.anInt5112, super.anInt5108, super.anInt5109, local27, this.aByte54 == 11 ? 10 : this.aByte54, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		if (arg5 instanceof Class17_Sub4_Sub2) {
			@Pc(9) Class17_Sub4_Sub2 local9 = (Class17_Sub4_Sub2) arg5;
			if (this.aClass73_6 != null && local9.aClass73_5 != null) {
				this.aClass73_6.method3305(local9.aClass73_5, arg2, arg3, arg1, arg4);
			}
		} else if (arg5 instanceof Class17_Sub1_Sub5) {
			@Pc(32) Class17_Sub1_Sub5 local32 = (Class17_Sub1_Sub5) arg5;
			if (this.aClass73_6 != null && local32.aClass73_6 != null) {
				this.aClass73_6.method3305(local32.aClass73_6, arg2, arg3, arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4800(@OriginalArg(0) Class32 arg0) {
		@Pc(25) Class1_Sub4_Sub10 local25;
		if (this.aClass1_Sub4_Sub10_5 == null && this.aBoolean502) {
			@Pc(18) Class26 local18 = this.method4503(arg0, true, 131072);
			local25 = local18 == null ? null : local18.aClass1_Sub4_Sub10_1;
		} else {
			local25 = this.aClass1_Sub4_Sub10_5;
			this.aClass1_Sub4_Sub10_5 = null;
		}
		if (local25 != null) {
			Static75.method1716(local25, this.aByte53, super.anInt5109, super.anInt5108, null);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4795() {
		return this.aBoolean502;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
	@Override
	public int method4799() {
		return this.aShort78 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!uo;I)Lclient!ge;")
	private Class73 method4504(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1) {
		if (this.aClass73_6 != null && arg1.method2173(this.aClass73_6.method3298(), arg0) == 0) {
			return this.aClass73_6;
		} else {
			@Pc(33) Class26 local33 = this.method4503(arg1, false, arg0);
			return local33 == null ? null : local33.aClass73_1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I")
	@Override
	public int method4797() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		if (this.aClass73_6 == null) {
			return null;
		}
		@Pc(19) Class109 local19 = arg0.method2194();
		local19.method3873(super.anInt5109, super.anInt5112, super.anInt5108);
		@Pc(29) Class8_Sub5 local29 = null;
		if (this.aBoolean503) {
			local29 = Static239.method4367(1);
		}
		this.aClass73_6.method3322(local19, local29 == null ? null : local29.aClass8_Sub3Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	@Override
	public void method4801() {
		if (this.aClass73_6 != null) {
			this.aClass73_6.method3321();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
	@Override
	public int method4794() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4796(@OriginalArg(0) Class32 arg0) {
		@Pc(18) Class1_Sub4_Sub10 local18;
		if (this.aClass1_Sub4_Sub10_5 == null && this.aBoolean502) {
			@Pc(29) Class26 local29 = this.method4503(arg0, true, 131072);
			local18 = local29 == null ? null : local29.aClass1_Sub4_Sub10_1;
		} else {
			local18 = this.aClass1_Sub4_Sub10_5;
			this.aClass1_Sub4_Sub10_5 = null;
		}
		if (local18 != null) {
			Static304.method5121(local18, this.aByte53, super.anInt5109, super.anInt5108, null);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	@Override
	public Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		return this.method4504(arg1, arg0);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)I")
	@Override
	public int method4490() {
		return this.aClass73_6 == null ? 0 : this.aClass73_6.method3327();
	}
}
