import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "B")
	private final byte aByte69;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "S")
	private final short aShort86;

	@OriginalMember(owner = "client!uk", name = "J", descriptor = "Z")
	private boolean aBoolean571;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!uk", name = "B", descriptor = "Z")
	private final boolean aBoolean570;

	@OriginalMember(owner = "client!uk", name = "Q", descriptor = "Z")
	private final boolean aBoolean573;

	@OriginalMember(owner = "client!uk", name = "L", descriptor = "Z")
	private final boolean aBoolean572;

	@OriginalMember(owner = "client!uk", name = "Y", descriptor = "Lclient!wp;")
	private Class49 aClass49_6;

	@OriginalMember(owner = "client!uk", name = "T", descriptor = "Lclient!qn;")
	private Class2_Sub9_Sub16 aClass2_Sub9_Sub16_5;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!dr;Lclient!fq;IIIIZIZ)V")
	public Class1_Sub4_Sub2(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean201, arg1.aBoolean196);
		this.aByte69 = (byte) arg7;
		this.aShort86 = (short) arg1.anInt2071;
		this.aBoolean571 = arg8;
		this.aByte68 = (byte) arg2;
		super.anInt6539 = (short) arg5;
		super.anInt6534 = (short) arg3;
		this.aBoolean570 = arg1.anInt2086 != 0 && !arg6;
		this.aBoolean573 = arg6;
		this.aBoolean572 = arg0.method3645() && arg1.aBoolean194 && !this.aBoolean573 && Static222.anInt6836 != 0;
		@Pc(66) int local66 = 1024;
		if (this.aBoolean571) {
			local66 |= 0x8000;
		}
		@Pc(81) Class206 local81 = this.method5386(arg0, this.aBoolean572, local66);
		if (local81 != null) {
			this.aClass49_6 = local81.aClass49_7;
			this.aClass2_Sub9_Sub16_5 = local81.aClass2_Sub9_Sub16_6;
			if (this.aBoolean571) {
				this.aClass49_6 = this.aClass49_6.method5810((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		this.aBoolean571 = false;
		if (this.aClass49_6 != null) {
			this.aClass49_6.method5854(this.aClass49_6.method5820() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return this.method5381(arg0, arg1);
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	private Class49 method5381(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass49_6 != null && arg0.method3686(this.aClass49_6.method5820(), arg1) == 0) {
			return this.aClass49_6;
		} else {
			@Pc(36) Class206 local36 = this.method5386(arg0, false, arg1);
			return local36 == null ? null : local36.aClass49_7;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
		@Pc(18) Class2_Sub9_Sub16 local18;
		if (this.aClass2_Sub9_Sub16_5 == null && this.aBoolean572) {
			@Pc(29) Class206 local29 = this.method5386(arg0, true, 131072);
			local18 = local29 == null ? null : local29.aClass2_Sub9_Sub16_6;
		} else {
			local18 = this.aClass2_Sub9_Sub16_5;
			this.aClass2_Sub9_Sub16_5 = null;
		}
		if (local18 != null) {
			Static300.method5055(local18, this.aByte68, super.anInt6534, super.anInt6539, null);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		if (!(arg1 instanceof Class1_Sub4_Sub2)) {
			return;
		}
		@Pc(14) Class1_Sub4_Sub2 local14 = (Class1_Sub4_Sub2) arg1;
		if (this.aClass49_6 != null && local14.aClass49_6 != null) {
			this.aClass49_6.method5831(local14.aClass49_6, arg2, arg3, arg4, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return this.aBoolean571;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
		if (this.aClass49_6 != null) {
			this.aClass49_6.method5840();
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return this.aByte69;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return this.aShort86 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!dr;IZI)Lclient!uq;")
	private Class206 method5386(@OriginalArg(0) Class37 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class74 local12 = Static228.method4210(this.aShort86 & 0xFFFF);
		@Pc(24) Class105 local24;
		@Pc(19) Class105 local19;
		if (this.aBoolean573) {
			local19 = Static101.aClass105Array2[0];
			local24 = Static121.aClass105Array3[this.aByte68];
		} else {
			local24 = Static101.aClass105Array2[this.aByte68];
			if (this.aByte68 >= 3) {
				local19 = null;
			} else {
				local19 = Static101.aClass105Array2[this.aByte68 + 1];
			}
		}
		return local12.method1993(local19, super.anInt6539, this.aByte69, 22, local24, arg2, super.anInt6536, arg0, super.anInt6534, arg1);
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		if (this.aClass49_6 == null) {
			return null;
		}
		@Pc(17) Class38 local17 = arg0.method3672();
		local17.method4474(super.anInt6534, super.anInt6536, super.anInt6539);
		@Pc(27) Class57_Sub5 local27 = null;
		if (this.aBoolean570) {
			local27 = Static116.method2281(1);
		}
		this.aClass49_6.method5825(local17, local27 == null ? null : local27.aClass57_Sub4Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
		@Pc(20) Class2_Sub9_Sub16 local20;
		if (this.aClass2_Sub9_Sub16_5 == null && this.aBoolean572) {
			@Pc(31) Class206 local31 = this.method5386(arg0, true, 131072);
			local20 = local31 == null ? null : local31.aClass2_Sub9_Sub16_6;
		} else {
			local20 = this.aClass2_Sub9_Sub16_5;
			this.aClass2_Sub9_Sub16_5 = null;
		}
		if (local20 != null) {
			Static101.method2012(local20, this.aByte68, super.anInt6534, super.anInt6539, null);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(9) Class49 local9 = this.method5381(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class38 local20 = arg2.method3672();
			local20.method4474(super.anInt6534, super.anInt6536, super.anInt6539);
			return local9.method5816(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return this.aBoolean572;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return 22;
	}
}
