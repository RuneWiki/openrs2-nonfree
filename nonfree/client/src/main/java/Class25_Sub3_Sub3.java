import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class25_Sub3_Sub3 extends Class25_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!rq", name = "I", descriptor = "Z")
	private final boolean aBoolean496;

	@OriginalMember(owner = "client!rq", name = "C", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!rq", name = "M", descriptor = "S")
	private final short aShort79;

	@OriginalMember(owner = "client!rq", name = "eb", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!rq", name = "J", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!rq", name = "Q", descriptor = "Z")
	private final boolean aBoolean497;

	@OriginalMember(owner = "client!rq", name = "X", descriptor = "Z")
	private final boolean aBoolean498;

	@OriginalMember(owner = "client!rq", name = "A", descriptor = "Lclient!ns;")
	private Class22 aClass22_5;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "Lclient!fq;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_5;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIZIIIII)V")
	public Class25_Sub3_Sub3(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static268.method4134(arg11, arg10));
		this.aBoolean496 = arg6;
		this.aByte64 = (byte) arg10;
		this.aShort79 = (short) arg1.anInt5911;
		this.aByte66 = (byte) arg2;
		super.anInt5261 = (short) arg3;
		this.aByte65 = (byte) arg11;
		super.anInt5257 = (short) arg5;
		this.aBoolean497 = arg1.anInt5915 != 0 && !arg6;
		this.aBoolean498 = arg0.method5394() && arg1.aBoolean553 && !this.aBoolean496 && Static188.aClass135_Sub1_1.anInt3384 != 0;
		@Pc(74) Class201 local74 = this.method4625(this.aBoolean498, arg0, 1024);
		if (local74 != null) {
			this.aClass22_5 = local74.aClass22_4;
			this.aClass1_Sub6_Sub5_5 = local74.aClass1_Sub6_Sub5_4;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
		@Pc(19) Class1_Sub6_Sub5 local19;
		if (this.aClass1_Sub6_Sub5_5 == null && this.aBoolean498) {
			@Pc(30) Class201 local30 = this.method4625(true, arg0, 131072);
			local19 = local30 == null ? null : local30.aClass1_Sub6_Sub5_4;
		} else {
			local19 = this.aClass1_Sub6_Sub5_5;
			this.aClass1_Sub6_Sub5_5 = null;
		}
		if (local19 != null) {
			Static331.method4786(local19, this.aByte66, super.anInt5261, super.anInt5257, null);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return this.method4624(arg0, arg1);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return this.aByte65;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return this.aBoolean498;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZILclient!tq;)Lclient!ns;")
	private Class22 method4624(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		if (this.aClass22_5 != null && arg1.method5396(this.aClass22_5.method1563(), arg0) == 0) {
			return this.aClass22_5;
		} else {
			@Pc(36) Class201 local36 = this.method4625(false, arg1, arg0);
			return local36 == null ? null : local36.aClass22_4;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
		@Pc(14) Class1_Sub6_Sub5 local14;
		if (this.aClass1_Sub6_Sub5_5 == null && this.aBoolean498) {
			@Pc(25) Class201 local25 = this.method4625(true, arg0, 131072);
			local14 = local25 == null ? null : local25.aClass1_Sub6_Sub5_4;
		} else {
			local14 = this.aClass1_Sub6_Sub5_5;
			this.aClass1_Sub6_Sub5_5 = null;
		}
		if (local14 != null) {
			Static148.method2206(local14, this.aByte66, super.anInt5261, super.anInt5257, null);
		}
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(B)I")
	@Override
	public int method4611() {
		return this.aClass22_5 == null ? 0 : this.aClass22_5.method1561();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZLclient!tq;II)Lclient!ri;")
	private Class201 method4625(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class236 local13 = Static54.aClass153_1.method3081(this.aShort79 & 0xFFFF);
		@Pc(42) Class42 local42;
		@Pc(33) Class42 local33;
		if (this.aBoolean496) {
			local42 = Static77.aClass42Array2[this.aByte66];
			local33 = Static239.aClass42Array4[0];
		} else {
			if (this.aByte66 < 3) {
				local33 = Static239.aClass42Array4[this.aByte66 + 1];
			} else {
				local33 = null;
			}
			local42 = Static239.aClass42Array4[this.aByte66];
		}
		return local13.method5088(arg2, super.anInt5257, local42, super.anInt5261, arg1, this.aByte64, arg0, local33, this.aByte65, super.anInt5248);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class22 local17 = this.method4624(65536, arg0);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class127 local22 = arg0.method5378();
			local22.method5265(super.anInt5261, super.anInt5248, super.anInt5257);
			return local17.method1584(arg1, arg2, local22, false);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
		if (this.aClass22_5 != null) {
			this.aClass22_5.method1583();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return this.aShort79 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		if (this.aClass22_5 == null) {
			return null;
		}
		@Pc(11) Class127 local11 = arg0.method5378();
		local11.method5265(super.anInt5261 + super.anInt5249, super.anInt5248, super.anInt5257 + super.anInt5255);
		@Pc(35) Class41_Sub1 local35 = null;
		if (this.aBoolean497) {
			local35 = Static277.method4255(1);
		}
		this.aClass22_5.method1565(local11, local35 == null ? null : local35.aClass41_Sub5Array1[0], 0);
		return local35;
	}
}
