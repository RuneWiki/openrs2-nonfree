import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class25_Sub4_Sub1 extends Class25_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "Z")
	private final boolean aBoolean216;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "S")
	private final short aShort54;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "B")
	private final byte aByte36;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "B")
	private final byte aByte37;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!hf", name = "H", descriptor = "Z")
	private final boolean aBoolean217;

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "Lclient!ns;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "Lclient!fq;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_2;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIZIZ)V")
	public Class25_Sub4_Sub1(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean543, arg1.aBoolean539);
		this.aBoolean216 = arg6;
		super.anInt5129 = (short) arg3;
		this.aShort54 = (short) arg1.anInt5911;
		this.aBoolean215 = arg1.anInt5915 != 0 && !arg6;
		this.aByte36 = (byte) arg2;
		super.anInt5127 = (short) arg5;
		this.aByte37 = (byte) arg7;
		this.aBoolean218 = arg8;
		this.aBoolean217 = arg0.method5394() && arg1.aBoolean553 && !this.aBoolean216 && Static188.aClass135_Sub1_1.anInt3384 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean218) {
			local67 |= 0x8000;
		}
		@Pc(82) Class201 local82 = this.method2028(local67, arg0, this.aBoolean217);
		if (local82 != null) {
			this.aClass22_2 = local82.aClass22_4;
			this.aClass1_Sub6_Sub5_2 = local82.aClass1_Sub6_Sub5_4;
			if (this.aBoolean218) {
				this.aClass22_2 = this.aClass22_2.method1598((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
		@Pc(31) Class1_Sub6_Sub5 local31;
		if (this.aClass1_Sub6_Sub5_2 == null && this.aBoolean217) {
			@Pc(24) Class201 local24 = this.method2028(131072, arg0, true);
			local31 = local24 == null ? null : local24.aClass1_Sub6_Sub5_4;
		} else {
			local31 = this.aClass1_Sub6_Sub5_2;
			this.aClass1_Sub6_Sub5_2 = null;
		}
		if (local31 != null) {
			Static331.method4786(local31, this.aByte36, super.anInt5129, super.anInt5127, null);
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return this.aBoolean218;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return this.aShort54 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		this.aBoolean218 = false;
		if (this.aClass22_2 != null) {
			this.aClass22_2.method1602(this.aClass22_2.method1563() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class22 local17 = this.method2030(arg0, 65536);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class127 local22 = arg0.method5378();
			local22.method5265(super.anInt5129, super.anInt5130, super.anInt5127);
			return local17.method1584(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		if (this.aClass22_2 == null) {
			return null;
		}
		@Pc(17) Class127 local17 = arg0.method5378();
		local17.method5265(super.anInt5129, super.anInt5130, super.anInt5127);
		@Pc(27) Class41_Sub1 local27 = null;
		if (this.aBoolean215) {
			local27 = Static277.method4255(1);
		}
		this.aClass22_2.method1565(local17, local27 == null ? null : local27.aClass41_Sub5Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class25_Sub4_Sub1) {
			@Pc(5) Class25_Sub4_Sub1 local5 = (Class25_Sub4_Sub1) arg2;
			if (this.aClass22_2 != null && local5.aClass22_2 != null) {
				this.aClass22_2.method1608(local5.aClass22_2, arg5, arg3, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!tq;Z)Lclient!ri;")
	private Class201 method2028(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class236 local13 = Static54.aClass153_1.method3081(this.aShort54 & 0xFFFF);
		@Pc(29) Class42 local29;
		@Pc(33) Class42 local33;
		if (this.aBoolean216) {
			local29 = Static77.aClass42Array2[this.aByte36];
			local33 = Static239.aClass42Array4[0];
		} else {
			local29 = Static239.aClass42Array4[this.aByte36];
			if (this.aByte36 >= 3) {
				local33 = null;
			} else {
				local33 = Static239.aClass42Array4[this.aByte36 + 1];
			}
		}
		return local13.method5088(arg0, super.anInt5127, local29, super.anInt5129, arg1, 22, arg2, local33, this.aByte37, super.anInt5130);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
		@Pc(37) Class1_Sub6_Sub5 local37;
		if (this.aClass1_Sub6_Sub5_2 == null && this.aBoolean217) {
			@Pc(30) Class201 local30 = this.method2028(131072, arg0, true);
			local37 = local30 == null ? null : local30.aClass1_Sub6_Sub5_4;
		} else {
			local37 = this.aClass1_Sub6_Sub5_2;
			this.aClass1_Sub6_Sub5_2 = null;
		}
		if (local37 != null) {
			Static148.method2206(local37, this.aByte36, super.anInt5129, super.anInt5127, null);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
		if (this.aClass22_2 != null) {
			this.aClass22_2.method1583();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return this.aByte37;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return 22;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return this.aBoolean217;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!tq;II)Lclient!ns;")
	private Class22 method2030(@OriginalArg(0) Class164 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass22_2 != null && arg0.method5396(this.aClass22_2.method1563(), arg1) == 0) {
			return this.aClass22_2;
		} else {
			@Pc(38) Class201 local38 = this.method2028(arg1, arg0, false);
			return local38 == null ? null : local38.aClass22_4;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return this.method2030(arg1, arg0);
	}
}
