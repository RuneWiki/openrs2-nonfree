import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "S")
	private final short aShort59;

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!jf", name = "P", descriptor = "Z")
	private final boolean aBoolean310;

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!jf", name = "L", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "Z")
	private final boolean aBoolean309;

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "Z")
	private final boolean aBoolean312;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!qn;")
	private Class2_Sub9_Sub16 aClass2_Sub9_Sub16_2;

	@OriginalMember(owner = "client!jf", name = "db", descriptor = "Lclient!wp;")
	public Class49 aClass49_3;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!dr;Lclient!fq;IIIIIZIIIIIIZ)V")
	public Class1_Sub2_Sub4(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.lb == 1, Static166.method3332(arg12, arg13));
		this.aShort59 = (short) arg1.anInt2071;
		this.aByte45 = (byte) arg13;
		this.aBoolean310 = arg1.anInt2086 != 0 && !arg7;
		this.aByte43 = (byte) arg12;
		this.aBoolean311 = arg14;
		this.aByte44 = (byte) arg3;
		this.aBoolean309 = arg7;
		this.aBoolean312 = arg0.method3645() && arg1.aBoolean194 && !this.aBoolean309 && Static222.anInt6836 != 0;
		@Pc(76) int local76 = 1024;
		if (this.aBoolean311) {
			local76 |= 0x8000;
		}
		@Pc(91) Class206 local91 = this.method3004(local76, arg0, this.aBoolean312);
		if (local91 != null) {
			this.aClass2_Sub9_Sub16_2 = local91.aClass2_Sub9_Sub16_6;
			this.aClass49_3 = local91.aClass49_7;
			if (this.aBoolean311) {
				this.aClass49_3 = this.aClass49_3.method5810((byte) 0, local76, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return this.aBoolean311;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(Z)I")
	public int method3002() {
		return this.aClass49_3 == null ? 15 : this.aClass49_3.method5859() / 4;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
		if (this.aClass49_3 != null) {
			this.aClass49_3.method5840();
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		if (this.aClass49_3 == null) {
			return null;
		}
		@Pc(18) Class38 local18 = arg0.method3672();
		local18.method4474(super.anInt6893, super.anInt6886, super.anInt6888);
		@Pc(28) Class57_Sub5 local28 = null;
		if (this.aBoolean310) {
			local28 = Static116.method2281(1);
		}
		this.aClass49_3.method5825(local18, local28 == null ? null : local28.aClass57_Sub4Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
		@Pc(31) Class2_Sub9_Sub16 local31;
		if (this.aClass2_Sub9_Sub16_2 == null && this.aBoolean312) {
			@Pc(24) Class206 local24 = this.method3004(131072, arg0, true);
			local31 = local24 == null ? null : local24.aClass2_Sub9_Sub16_6;
		} else {
			local31 = this.aClass2_Sub9_Sub16_2;
			this.aClass2_Sub9_Sub16_2 = null;
		}
		if (local31 != null) {
			Static300.method5055(local31, this.aByte44, super.anInt6893, super.anInt6888, null);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return this.aBoolean312;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!dr;I)Lclient!wp;")
	private Class49 method3003(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1) {
		if (this.aClass49_3 != null && arg1.method3686(this.aClass49_3.method5820(), arg0) == 0) {
			return this.aClass49_3;
		} else {
			@Pc(28) Class206 local28 = this.method3004(arg0, arg1, false);
			return local28 == null ? null : local28.aClass49_7;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILclient!dr;Z)Lclient!uq;")
	private Class206 method3004(@OriginalArg(1) int arg0, @OriginalArg(2) Class37 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class74 local12 = Static228.method4210(this.aShort59 & 0xFFFF);
		@Pc(43) Class105 local43;
		@Pc(34) Class105 local34;
		if (this.aBoolean309) {
			local43 = Static121.aClass105Array3[this.aByte44];
			local34 = Static101.aClass105Array2[0];
		} else {
			if (this.aByte44 < 3) {
				local34 = Static101.aClass105Array2[this.aByte44 + 1];
			} else {
				local34 = null;
			}
			local43 = Static101.aClass105Array2[this.aByte44];
		}
		return local12.method1993(local34, super.anInt6888, this.aByte43 == 11 ? this.aByte45 + 4 : this.aByte45, this.aByte43 == 11 ? 10 : this.aByte43, local43, arg0, super.anInt6886, arg1, super.anInt6893, arg2);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
		@Pc(18) Class2_Sub9_Sub16 local18;
		if (this.aClass2_Sub9_Sub16_2 == null && this.aBoolean312) {
			@Pc(29) Class206 local29 = this.method3004(131072, arg0, true);
			local18 = local29 == null ? null : local29.aClass2_Sub9_Sub16_6;
		} else {
			local18 = this.aClass2_Sub9_Sub16_2;
			this.aClass2_Sub9_Sub16_2 = null;
		}
		if (local18 != null) {
			Static101.method2012(local18, this.aByte44, super.anInt6893, super.anInt6888, null);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return this.aShort59 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		this.aBoolean311 = false;
		if (this.aClass49_3 != null) {
			this.aClass49_3.method5854(this.aClass49_3.method5820() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		if (arg1 instanceof Class1_Sub1_Sub2) {
			@Pc(5) Class1_Sub1_Sub2 local5 = (Class1_Sub1_Sub2) arg1;
			if (this.aClass49_3 != null && local5.aClass49_2 != null) {
				this.aClass49_3.method5831(local5.aClass49_2, arg2, arg3, arg4, arg0);
			}
		} else if (arg1 instanceof Class1_Sub2_Sub4) {
			@Pc(28) Class1_Sub2_Sub4 local28 = (Class1_Sub2_Sub4) arg1;
			if (this.aClass49_3 != null && local28.aClass49_3 != null) {
				this.aClass49_3.method5831(local28.aClass49_3, arg2, arg3, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(9) Class49 local9 = this.method3003(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class38 local19 = arg2.method3672();
			local19.method4474(super.anInt6893, super.anInt6886, super.anInt6888);
			return local9.method5816(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)I")
	@Override
	public int method5766() {
		return this.aClass49_3 == null ? 0 : this.aClass49_3.method5842();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return this.method3003(arg1, arg0);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.aByte43;
	}
}
