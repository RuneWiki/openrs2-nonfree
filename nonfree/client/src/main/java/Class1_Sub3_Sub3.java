import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "Z")
	private final boolean aBoolean461;

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!pp", name = "Q", descriptor = "S")
	private final short aShort72;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!pp", name = "T", descriptor = "Z")
	private final boolean aBoolean462;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "Z")
	private final boolean aBoolean460;

	@OriginalMember(owner = "client!pp", name = "K", descriptor = "Lclient!wp;")
	private Class49 aClass49_5;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "Lclient!qn;")
	private Class2_Sub9_Sub16 aClass2_Sub9_Sub16_4;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!dr;Lclient!fq;IIIIZIIIII)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static334.method5447(arg10, arg11));
		this.aBoolean461 = arg1.anInt2086 != 0 && !arg6;
		this.aByte60 = (byte) arg11;
		this.aByte58 = (byte) arg10;
		super.anInt5325 = (short) arg3;
		this.aShort72 = (short) arg1.anInt2071;
		this.aByte59 = (byte) arg2;
		super.anInt5321 = (short) arg5;
		this.aBoolean462 = arg6;
		this.aBoolean460 = arg0.method3645() && arg1.aBoolean194 && !this.aBoolean462 && Static222.anInt6836 != 0;
		@Pc(76) Class206 local76 = this.method4522(arg0, this.aBoolean460, 1024);
		if (local76 != null) {
			this.aClass49_5 = local76.aClass49_7;
			this.aClass2_Sub9_Sub16_4 = local76.aClass2_Sub9_Sub16_6;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.aByte58;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
		@Pc(25) Class2_Sub9_Sub16 local25;
		if (this.aClass2_Sub9_Sub16_4 == null && this.aBoolean460) {
			@Pc(18) Class206 local18 = this.method4522(arg0, true, 131072);
			local25 = local18 == null ? null : local18.aClass2_Sub9_Sub16_6;
		} else {
			local25 = this.aClass2_Sub9_Sub16_4;
			this.aClass2_Sub9_Sub16_4 = null;
		}
		if (local25 != null) {
			Static101.method2012(local25, this.aByte59, super.anInt5325, super.anInt5321, null);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILclient!dr;)Lclient!wp;")
	private Class49 method4519(@OriginalArg(0) int arg0, @OriginalArg(2) Class37 arg1) {
		if (this.aClass49_5 != null && arg1.method3686(this.aClass49_5.method5820(), arg0) == 0) {
			return this.aClass49_5;
		} else {
			@Pc(29) Class206 local29 = this.method4522(arg1, false, arg0);
			return local29 == null ? null : local29.aClass49_7;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)I")
	@Override
	public int method4509() {
		return this.aClass49_5 == null ? 0 : this.aClass49_5.method5842();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(15) Class49 local15 = this.method4519(65536, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class38 local20 = arg2.method3672();
			local20.method4474(super.anInt5325, super.anInt5320, super.anInt5321);
			return local15.method5816(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
		@Pc(14) Class2_Sub9_Sub16 local14;
		if (this.aClass2_Sub9_Sub16_4 == null && this.aBoolean460) {
			@Pc(25) Class206 local25 = this.method4522(arg0, true, 131072);
			local14 = local25 == null ? null : local25.aClass2_Sub9_Sub16_6;
		} else {
			local14 = this.aClass2_Sub9_Sub16_4;
			this.aClass2_Sub9_Sub16_4 = null;
		}
		if (local14 != null) {
			Static300.method5055(local14, this.aByte59, super.anInt5325, super.anInt5321, null);
		}
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		if (this.aClass49_5 == null) {
			return null;
		}
		@Pc(11) Class38 local11 = arg0.method3672();
		local11.method4474(super.anInt5318 + super.anInt5325, super.anInt5320, super.anInt5321 + super.anInt5322);
		@Pc(33) Class57_Sub5 local33 = null;
		if (this.aBoolean461) {
			local33 = Static116.method2281(1);
		}
		this.aClass49_5.method5825(local11, local33 == null ? null : local33.aClass57_Sub4Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
		if (this.aClass49_5 != null) {
			this.aClass49_5.method5840();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLclient!dr;ZI)Lclient!uq;")
	private Class206 method4522(@OriginalArg(1) Class37 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class74 local12 = Static228.method4210(this.aShort72 & 0xFFFF);
		@Pc(25) Class105 local25;
		@Pc(29) Class105 local29;
		if (this.aBoolean462) {
			local25 = Static121.aClass105Array3[this.aByte59];
			local29 = Static101.aClass105Array2[0];
		} else {
			if (this.aByte59 < 3) {
				local29 = Static101.aClass105Array2[this.aByte59 + 1];
			} else {
				local29 = null;
			}
			local25 = Static101.aClass105Array2[this.aByte59];
		}
		return local12.method1993(local29, super.anInt5321, this.aByte60, this.aByte58, local25, arg2, super.anInt5320, arg0, super.anInt5325, arg1);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return this.aBoolean460;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return this.aShort72 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return this.method4519(arg1, arg0);
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
	}
}
