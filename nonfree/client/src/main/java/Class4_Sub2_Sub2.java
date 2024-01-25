import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!kga", name = "U", descriptor = "Lclient!qt;")
	private Class277 aClass277_4;

	@OriginalMember(owner = "client!kga", name = "y", descriptor = "Z")
	private final boolean aBoolean351;

	@OriginalMember(owner = "client!kga", name = "x", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!kga", name = "B", descriptor = "Z")
	private final boolean aBoolean352;

	@OriginalMember(owner = "client!kga", name = "O", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!kga", name = "F", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!kga", name = "T", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!kga", name = "D", descriptor = "Z")
	private final boolean aBoolean353;

	@OriginalMember(owner = "client!kga", name = "N", descriptor = "Lclient!w;")
	private Class6_Sub2_Sub14 aClass6_Sub2_Sub14_3;

	@OriginalMember(owner = "client!kga", name = "L", descriptor = "Lclient!ba;")
	private Class20 aClass20_3;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIZIIIII)V")
	public Class4_Sub2_Sub2(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static100.method1795(arg11, arg10));
		super.anInt6695 = arg3;
		this.aBoolean351 = arg6;
		this.aByte43 = (byte) arg11;
		this.aBoolean352 = arg1.anInt6889 != 0 && !arg6;
		super.anInt6706 = arg5;
		this.aShort60 = (short) arg1.anInt6905;
		this.aByte44 = (byte) arg2;
		this.aByte45 = (byte) arg10;
		this.aBoolean353 = arg0.method6849() && arg1.aBoolean476 && !this.aBoolean351 && Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242) != 0;
		@Pc(77) Class202 local77 = this.method4372(2048, arg0, this.aBoolean353);
		if (local77 != null) {
			this.aClass6_Sub2_Sub14_3 = local77.aClass6_Sub2_Sub14_4;
			this.aClass20_3 = local77.aClass20_4;
		}
	}

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "(B)I")
	@Override
	public int method5640() {
		return this.aClass20_3 == null ? 0 : this.aClass20_3.DA();
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		if (this.aClass277_4 == null) {
			this.aClass277_4 = Static323.method5117(this.method4371(0, arg0), super.anInt6706, super.anInt6701, super.anInt6695);
		}
		return this.aClass277_4;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return this.method4371(arg1, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BILclient!oa;)Lclient!ba;")
	private Class20 method4371(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1) {
		if (this.aClass20_3 != null && arg1.method6884(this.aClass20_3.h(), arg0) == 0) {
			return this.aClass20_3;
		} else {
			@Pc(29) Class202 local29 = this.method4372(arg0, arg1, false);
			return local29 == null ? null : local29.aClass20_4;
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return this.aByte43;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
		@Pc(25) Class6_Sub2_Sub14 local25;
		if (this.aClass6_Sub2_Sub14_3 == null && this.aBoolean353) {
			@Pc(18) Class202 local18 = this.method4372(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass6_Sub2_Sub14_4;
		} else {
			local25 = this.aClass6_Sub2_Sub14_3;
			this.aClass6_Sub2_Sub14_3 = null;
		}
		if (local25 != null) {
			Static60.method1249(local25, this.aByte44, super.anInt6695, super.anInt6706, null);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		if (this.aClass20_3 == null) {
			return null;
		}
		@Pc(11) Class54 local11 = arg0.method6851();
		local11.GA(super.anInt6695 + super.anInt6699, super.anInt6701, super.anInt6696 + super.anInt6706);
		@Pc(37) Class98_Sub8 local37 = null;
		if (this.aBoolean352) {
			local37 = Static348.method5326(1);
		}
		this.aClass20_3.method7256(local11, local37 == null ? null : local37.aClass98_Sub5Array1[0], 0);
		return local37;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
		@Pc(33) Class6_Sub2_Sub14 local33;
		if (this.aClass6_Sub2_Sub14_3 == null && this.aBoolean353) {
			@Pc(26) Class202 local26 = this.method4372(262144, arg0, true);
			local33 = local26 == null ? null : local26.aClass6_Sub2_Sub14_4;
		} else {
			local33 = this.aClass6_Sub2_Sub14_3;
			this.aClass6_Sub2_Sub14_3 = null;
		}
		if (local33 != null) {
			Static272.method4497(local33, this.aByte44, super.anInt6695, super.anInt6706, null);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class20 local17 = this.method4371(131072, arg1);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class54 local22 = arg1.method6851();
			local22.GA(super.anInt6695, super.anInt6701, super.anInt6706);
			return local17.method7266(arg2, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILclient!oa;Z)Lclient!m;")
	private Class202 method4372(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class252 local19 = Static412.aClass307_4.method6636(this.aShort60 & 0xFFFF);
		@Pc(27) Class59 local27;
		@Pc(31) Class59 local31;
		if (this.aBoolean351) {
			local27 = Static49.aClass59Array2[this.aByte44];
			local31 = Static273.aClass59Array4[0];
		} else {
			if (this.aByte44 >= 3) {
				local31 = null;
			} else {
				local31 = Static273.aClass59Array4[this.aByte44 + 1];
			}
			local27 = Static273.aClass59Array4[this.aByte44];
		}
		return local19.method5785(local31, super.anInt6706, this.aByte43, super.anInt6695, arg0, local27, super.anInt6701, this.aByte45, arg2, arg1);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return this.aBoolean353;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
		if (this.aClass20_3 != null) {
			this.aClass20_3.method7271();
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return this.aByte45;
	}
}
