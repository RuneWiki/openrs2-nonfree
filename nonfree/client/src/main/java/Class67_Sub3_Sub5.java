import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class67_Sub3_Sub5 extends Class67_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!v", name = "V", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "B")
	private final byte aByte76;

	@OriginalMember(owner = "client!v", name = "O", descriptor = "S")
	private final short aShort94;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "Z")
	private final boolean aBoolean410;

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "Z")
	private final boolean aBoolean411;

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "Z")
	private final boolean aBoolean413;

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "Lclient!mj;")
	public Class126 aClass126_6;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "Lclient!mc;")
	private Class11_Sub4_Sub4 aClass11_Sub4_Sub4_5;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIIZIIIIIIZ)V")
	public Class67_Sub3_Sub5(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2031 == 1, Static182.method3089(arg12, arg13));
		this.aByte75 = (byte) arg12;
		this.aByte76 = (byte) arg3;
		this.aShort94 = (short) arg1.anInt2012;
		this.aByte74 = (byte) arg13;
		this.aBoolean410 = arg7;
		this.aBoolean412 = arg14;
		this.aBoolean411 = arg1.anInt2016 != 0 && !arg7;
		this.aBoolean413 = arg0.method4935() && arg1.aBoolean135 && !this.aBoolean410 && Static103.anInt1883 != 0;
		@Pc(73) int local73 = 1024;
		if (this.aBoolean412) {
			local73 |= 0x8000;
		}
		@Pc(88) Class204 local88 = this.method5420(this.aBoolean413, arg0, local73);
		if (local88 != null) {
			this.aClass126_6 = local88.aClass126_7;
			this.aClass11_Sub4_Sub4_5 = local88.aClass11_Sub4_Sub4_6;
			if (this.aBoolean412) {
				this.aClass126_6 = this.aClass126_6.method3158((byte) 0, local73, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return this.aBoolean412;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)I")
	public int method5419() {
		return this.aClass126_6 == null ? 15 : this.aClass126_6.method3140() / 4;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZILclient!uo;I)Lclient!vg;")
	private Class204 method5420(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class84 local12 = Static108.method1650(this.aShort94 & 0xFFFF);
		@Pc(29) Class77 local29;
		@Pc(24) Class77 local24;
		if (this.aBoolean410) {
			local24 = Static129.aClass77Array3[0];
			local29 = Static79.aClass77Array5[this.aByte76];
		} else {
			local29 = Static129.aClass77Array3[this.aByte76];
			if (this.aByte76 >= 3) {
				local24 = null;
			} else {
				local24 = Static129.aClass77Array3[this.aByte76 + 1];
			}
		}
		return local12.method1641(arg1, this.aByte75 == 11 ? this.aByte74 + 4 : this.aByte74, super.anInt6308, this.aByte75 == 11 ? 10 : this.aByte75, local29, super.anInt6313, local24, super.anInt6310, arg0, arg2);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!uo;)V")
	@Override
	public void method5415(@OriginalArg(1) Class129 arg0) {
		@Pc(25) Class11_Sub4_Sub4 local25;
		if (this.aClass11_Sub4_Sub4_5 == null && this.aBoolean413) {
			@Pc(18) Class204 local18 = this.method5420(true, arg0, 131072);
			local25 = local18 == null ? null : local18.aClass11_Sub4_Sub4_6;
		} else {
			local25 = this.aClass11_Sub4_Sub4_5;
			this.aClass11_Sub4_Sub4_5 = null;
		}
		if (local25 != null) {
			Static134.method2077(local25, this.aByte76, super.anInt6308, super.anInt6310, null);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class126 local9 = this.method5422(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class61 local14 = arg1.method4979();
			local14.method3666(super.anInt6308, super.anInt6313, super.anInt6310);
			return local9.method3160(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		if (this.aClass126_6 == null) {
			return null;
		}
		@Pc(11) Class61 local11 = arg0.method4979();
		local11.method3666(super.anInt6308, super.anInt6313, super.anInt6310);
		@Pc(21) Class10_Sub1 local21 = null;
		if (this.aBoolean411) {
			local21 = Static55.method830(1);
		}
		this.aClass126_6.method3139(local11, local21 == null ? null : local21.aClass10_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aByte74;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		this.aBoolean412 = false;
		if (this.aClass126_6 != null) {
			this.aClass126_6.method3143(this.aClass126_6.method3142() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)I")
	@Override
	public int method5408() {
		return this.aClass126_6 == null ? 0 : this.aClass126_6.method3155();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5417(@OriginalArg(0) Class129 arg0) {
		@Pc(19) Class11_Sub4_Sub4 local19;
		if (this.aClass11_Sub4_Sub4_5 == null && this.aBoolean413) {
			@Pc(30) Class204 local30 = this.method5420(true, arg0, 131072);
			local19 = local30 == null ? null : local30.aClass11_Sub4_Sub4_6;
		} else {
			local19 = this.aClass11_Sub4_Sub4_5;
			this.aClass11_Sub4_Sub4_5 = null;
		}
		if (local19 != null) {
			Static328.method5390(local19, this.aByte76, super.anInt6308, super.anInt6310, null);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	@Override
	public Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		return this.method5422(arg1, arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class67_Sub2_Sub1) {
			@Pc(36) Class67_Sub2_Sub1 local36 = (Class67_Sub2_Sub1) arg3;
			if (this.aClass126_6 == null || local36.aClass126_3 == null) {
				return;
			}
			this.aClass126_6.method3121(local36.aClass126_3, arg2, arg1, arg0, arg5);
		} else if (arg3 instanceof Class67_Sub3_Sub5) {
			@Pc(17) Class67_Sub3_Sub5 local17 = (Class67_Sub3_Sub5) arg3;
			if (this.aClass126_6 != null && local17.aClass126_6 != null) {
				this.aClass126_6.method3121(local17.aClass126_6, arg2, arg1, arg0, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
	@Override
	public int method5410() {
		return this.aShort94 & 0xFFFF;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)I")
	@Override
	public int method5414() {
		return this.aByte75;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	@Override
	public void method5416() {
		if (this.aClass126_6 != null) {
			this.aClass126_6.method3135();
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5412() {
		return this.aBoolean413;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!uo;II)Lclient!mj;")
	private Class126 method5422(@OriginalArg(0) Class129 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass126_6 != null && arg0.method4938(this.aClass126_6.method3142(), arg1) == 0) {
			return this.aClass126_6;
		} else {
			@Pc(26) Class204 local26 = this.method5420(false, arg0, arg1);
			return local26 == null ? null : local26.aClass126_7;
		}
	}
}
