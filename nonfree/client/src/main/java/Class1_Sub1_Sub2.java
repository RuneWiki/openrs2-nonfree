import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!fm", name = "V", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "Z")
	private final boolean aBoolean184;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "Z")
	private final boolean aBoolean181;

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "S")
	private final short aShort34;

	@OriginalMember(owner = "client!fm", name = "N", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Z")
	private boolean aBoolean182;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "Z")
	private final boolean aBoolean183;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "Lclient!wp;")
	public Class49 aClass49_2;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "Lclient!qn;")
	private Class2_Sub9_Sub16 aClass2_Sub9_Sub16_1;

	static {
		new Class140("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!dr;Lclient!fq;IIIIZIIZ)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static282.method4801(arg7, arg8));
		this.aByte22 = (byte) arg7;
		this.aBoolean184 = arg1.anInt2086 != 0 && !arg6;
		super.anInt5238 = (short) arg3;
		this.aByte20 = (byte) arg2;
		this.aBoolean181 = arg6;
		this.aShort34 = (short) arg1.anInt2071;
		super.anInt5237 = (short) arg5;
		this.aByte21 = (byte) arg8;
		this.aBoolean182 = arg9;
		this.aBoolean183 = arg0.method3645() && arg1.aBoolean194 && !this.aBoolean181 && Static222.anInt6836 != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean182) {
			local70 |= 0x8000;
		}
		@Pc(85) Class206 local85 = this.method1970(arg0, this.aBoolean183, local70);
		if (local85 != null) {
			this.aClass49_2 = local85.aClass49_7;
			this.aClass2_Sub9_Sub16_1 = local85.aClass2_Sub9_Sub16_6;
			if (this.aBoolean182) {
				this.aClass49_2 = this.aClass49_2.method5810((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return this.method1969(arg1, arg0);
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		if (this.aClass49_2 == null) {
			return null;
		}
		@Pc(20) Class38 local20 = arg0.method3672();
		local20.method4474(super.anInt5238, super.anInt5241, super.anInt5237);
		@Pc(30) Class57_Sub5 local30 = null;
		if (this.aBoolean184) {
			local30 = Static116.method2281(1);
		}
		this.aClass49_2.method5825(local20, local30 == null ? null : local30.aClass57_Sub4Array1[0], 0);
		return local30;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.aByte22;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
		@Pc(19) Class2_Sub9_Sub16 local19;
		if (this.aClass2_Sub9_Sub16_1 == null && this.aBoolean183) {
			@Pc(30) Class206 local30 = this.method1970(arg0, true, 131072);
			local19 = local30 == null ? null : local30.aClass2_Sub9_Sub16_6;
		} else {
			local19 = this.aClass2_Sub9_Sub16_1;
			this.aClass2_Sub9_Sub16_1 = null;
		}
		if (local19 != null) {
			Static101.method2012(local19, this.aByte20, super.anInt5238, super.anInt5237, null);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILclient!dr;)Lclient!wp;")
	private Class49 method1969(@OriginalArg(1) int arg0, @OriginalArg(2) Class37 arg1) {
		if (this.aClass49_2 != null && arg1.method3686(this.aClass49_2.method5820(), arg0) == 0) {
			return this.aClass49_2;
		} else {
			@Pc(34) Class206 local34 = this.method1970(arg1, false, arg0);
			return local34 == null ? null : local34.aClass49_7;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return this.aShort34 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		if (arg1 instanceof Class1_Sub1_Sub2) {
			@Pc(12) Class1_Sub1_Sub2 local12 = (Class1_Sub1_Sub2) arg1;
			if (this.aClass49_2 != null && local12.aClass49_2 != null) {
				this.aClass49_2.method5831(local12.aClass49_2, arg2, arg3, arg4, arg0);
			}
		} else if (arg1 instanceof Class1_Sub2_Sub4) {
			@Pc(35) Class1_Sub2_Sub4 local35 = (Class1_Sub2_Sub4) arg1;
			if (this.aClass49_2 != null && local35.aClass49_3 != null) {
				this.aClass49_2.method5831(local35.aClass49_3, arg2, arg3, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return this.aBoolean182;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!dr;ZII)Lclient!uq;")
	private Class206 method1970(@OriginalArg(0) Class37 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class74 local17 = Static228.method4210(this.aShort34 & 0xFFFF);
		@Pc(29) Class105 local29;
		@Pc(24) Class105 local24;
		if (this.aBoolean181) {
			local24 = Static101.aClass105Array2[0];
			local29 = Static121.aClass105Array3[this.aByte20];
		} else {
			if (this.aByte20 >= 3) {
				local24 = null;
			} else {
				local24 = Static101.aClass105Array2[this.aByte20 + 1];
			}
			local29 = Static101.aClass105Array2[this.aByte20];
		}
		return local17.method1993(local24, super.anInt5237, this.aByte21, this.aByte22, local29, arg2, super.anInt5241, arg0, super.anInt5238, arg1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return this.aByte21;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		this.aBoolean182 = false;
		if (this.aClass49_2 != null) {
			this.aClass49_2.method5854(this.aClass49_2.method5820() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
		@Pc(14) Class2_Sub9_Sub16 local14;
		if (this.aClass2_Sub9_Sub16_1 == null && this.aBoolean183) {
			@Pc(27) Class206 local27 = this.method1970(arg0, true, 131072);
			local14 = local27 == null ? null : local27.aClass2_Sub9_Sub16_6;
		} else {
			local14 = this.aClass2_Sub9_Sub16_1;
			this.aClass2_Sub9_Sub16_1 = null;
		}
		if (local14 != null) {
			Static300.method5055(local14, this.aByte20, super.anInt5238, super.anInt5237, null);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(14) Class49 local14 = this.method1969(65536, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class38 local19 = arg2.method3672();
			local19.method4474(super.anInt5238, super.anInt5241, super.anInt5237);
			return local14.method5816(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return this.aBoolean183;
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
		if (this.aClass49_2 != null) {
			this.aClass49_2.method5840();
		}
	}
}
