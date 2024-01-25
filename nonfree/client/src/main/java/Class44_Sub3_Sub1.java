import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class44_Sub3_Sub1 extends Class44_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "S")
	private final short aShort29;

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "B")
	private final byte aByte33;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "Z")
	private final boolean aBoolean181;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "Z")
	private final boolean aBoolean184;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "Lclient!sr;")
	private Class6_Sub2_Sub17 aClass6_Sub2_Sub17_2;

	@OriginalMember(owner = "client!hf", name = "J", descriptor = "Lclient!rc;")
	private Class78 aClass78_2;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIZIZ)V")
	public Class44_Sub3_Sub1(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean104, arg1.aBoolean111);
		super.anInt4578 = (short) arg3;
		this.aBoolean183 = arg8;
		this.aBoolean182 = arg6;
		super.anInt4572 = (short) arg5;
		this.aShort29 = (short) arg1.anInt1497;
		this.aByte33 = (byte) arg2;
		this.aBoolean181 = arg1.anInt1476 != 0;
		this.aByte32 = (byte) arg7;
		this.aBoolean184 = arg0.method3011() && arg1.aBoolean108 && !this.aBoolean182 && Static282.anInt5340 != 0;
		@Pc(64) int local64 = 1024;
		if (this.aBoolean183) {
			local64 |= 0x8000;
		}
		@Pc(79) Class150 local79 = this.method2316(this.aBoolean184, local64, arg0);
		if (local79 != null) {
			this.aClass6_Sub2_Sub17_2 = local79.aClass6_Sub2_Sub17_4;
			this.aClass78_2 = local79.aClass78_5;
			if (this.aBoolean183) {
				this.aClass78_2 = this.aClass78_2.method4661((byte) 0, local64, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5798() {
		return this.aBoolean184;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	@Override
	public Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		return this.method2318(arg0, arg1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I")
	@Override
	public int method5793() {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIILclient!ja;)Lclient!ob;")
	private Class150 method2316(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class81 arg2) {
		@Pc(12) Class66 local12 = Static196.method3622(this.aShort29 & 0xFFFF);
		@Pc(24) Class106 local24;
		@Pc(19) Class106 local19;
		if (this.aBoolean182) {
			local19 = Static99.aClass106Array4[0];
			local24 = Static84.aClass106Array1[this.aByte33];
		} else {
			if (this.aByte33 >= 3) {
				local19 = null;
			} else {
				local19 = Static99.aClass106Array4[this.aByte33 + 1];
			}
			local24 = Static99.aClass106Array4[this.aByte33];
		}
		return local12.method1365(22, arg2, arg0, super.anInt4570, local19, super.anInt4578, this.aByte32, arg1, local24, super.anInt4572);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLclient!ja;)V")
	@Override
	public void method5794(@OriginalArg(1) Class81 arg0) {
		@Pc(25) Class6_Sub2_Sub17 local25;
		if (this.aClass6_Sub2_Sub17_2 == null && this.aBoolean184) {
			@Pc(18) Class150 local18 = this.method2316(true, 131072, arg0);
			local25 = local18 == null ? null : local18.aClass6_Sub2_Sub17_4;
		} else {
			local25 = this.aClass6_Sub2_Sub17_2;
			this.aClass6_Sub2_Sub17_2 = null;
		}
		if (local25 != null) {
			Static318.method5322(local25, this.aByte33, super.anInt4578, super.anInt4572, null);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return this.aBoolean183;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		if (arg4 instanceof Class44_Sub3_Sub1) {
			@Pc(5) Class44_Sub3_Sub1 local5 = (Class44_Sub3_Sub1) arg4;
			if (this.aClass78_2 != null && local5.aClass78_2 != null) {
				this.aClass78_2.method4627(local5.aClass78_2, arg2, arg0, arg3, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		this.aBoolean183 = false;
		if (this.aClass78_2 != null) {
			this.aClass78_2.method4624(this.aClass78_2.method4652() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	@Override
	public void method5797() {
		if (this.aClass78_2 != null) {
			this.aClass78_2.method4633();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ja;I)V")
	@Override
	public void method5796(@OriginalArg(0) Class81 arg0) {
		@Pc(14) Class6_Sub2_Sub17 local14;
		if (this.aClass6_Sub2_Sub17_2 == null && this.aBoolean184) {
			@Pc(25) Class150 local25 = this.method2316(true, 131072, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub17_4;
		} else {
			local14 = this.aClass6_Sub2_Sub17_2;
			this.aClass6_Sub2_Sub17_2 = null;
		}
		if (local14 != null) {
			Static203.method3663(local14, this.aByte33, super.anInt4578, super.anInt4572, null);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!ja;)Lclient!rc;")
	private Class78 method2318(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		if (this.aClass78_2 != null && arg1.method2958(this.aClass78_2.method4652(), arg0) == 0) {
			return this.aClass78_2;
		} else {
			@Pc(26) Class150 local26 = this.method2316(false, arg0, arg1);
			return local26 == null ? null : local26.aClass78_5;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)I")
	@Override
	public int method5795() {
		return 22;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)I")
	@Override
	public int method5799() {
		return this.aShort29 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		if (this.aClass78_2 == null) {
			return null;
		}
		@Pc(11) Class72 local11 = arg0.method2990();
		local11.method4067(super.anInt4578, super.anInt4570, super.anInt4572);
		@Pc(27) Class20_Sub6 local27 = null;
		if (this.aBoolean181) {
			local27 = Static208.method5776(1);
		}
		this.aClass78_2.method4649(local11, local27 == null ? null : local27.aClass20_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class78 local14 = this.method2318(65536, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class72 local19 = arg1.method2990();
			local19.method4067(super.anInt4578, super.anInt4570, super.anInt4572);
			return local14.method4644(arg2, arg0, local19, false);
		}
	}
}
