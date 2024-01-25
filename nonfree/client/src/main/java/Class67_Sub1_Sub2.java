import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class67_Sub1_Sub2 extends Class67_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!qq", name = "eb", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "Z")
	private final boolean aBoolean344;

	@OriginalMember(owner = "client!qq", name = "cb", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "Z")
	private final boolean aBoolean343;

	@OriginalMember(owner = "client!qq", name = "db", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "S")
	private final short aShort76;

	@OriginalMember(owner = "client!qq", name = "V", descriptor = "Z")
	private final boolean aBoolean345;

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "Lclient!mj;")
	private Class126 aClass126_5;

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "Lclient!mc;")
	private Class11_Sub4_Sub4 aClass11_Sub4_Sub4_4;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIZIIIII)V")
	public Class67_Sub1_Sub2(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static322.method5355(arg10, arg11));
		this.aByte67 = (byte) arg2;
		super.anInt5256 = (short) arg5;
		this.aBoolean344 = arg1.anInt2016 != 0 && !arg6;
		this.aByte65 = (byte) arg11;
		this.aBoolean343 = arg6;
		this.aByte66 = (byte) arg10;
		super.anInt5252 = (short) arg3;
		this.aShort76 = (short) arg1.anInt2012;
		this.aBoolean345 = arg0.method4935() && arg1.aBoolean135 && !this.aBoolean343 && Static103.anInt1883 != 0;
		@Pc(79) Class204 local79 = this.method4514(arg0, this.aBoolean345, 1024);
		if (local79 != null) {
			this.aClass126_5 = local79.aClass126_7;
			this.aClass11_Sub4_Sub4_4 = local79.aClass11_Sub4_Sub4_6;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!uo;BI)Lclient!mj;")
	private Class126 method4510(@OriginalArg(0) Class129 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass126_5 != null && arg0.method4938(this.aClass126_5.method3142(), arg1) == 0) {
			return this.aClass126_5;
		} else {
			@Pc(34) Class204 local34 = this.method4514(arg0, false, arg1);
			return local34 == null ? null : local34.aClass126_7;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aByte65;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
	@Override
	public int method5414() {
		return this.aByte66;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!uo;)V")
	@Override
	public void method5415(@OriginalArg(1) Class129 arg0) {
		@Pc(19) Class11_Sub4_Sub4 local19;
		if (this.aClass11_Sub4_Sub4_4 == null && this.aBoolean345) {
			@Pc(30) Class204 local30 = this.method4514(arg0, true, 131072);
			local19 = local30 == null ? null : local30.aClass11_Sub4_Sub4_6;
		} else {
			local19 = this.aClass11_Sub4_Sub4_4;
			this.aClass11_Sub4_Sub4_4 = null;
		}
		if (local19 != null) {
			Static134.method2077(local19, this.aByte67, super.anInt5252, super.anInt5256, null);
		}
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)I")
	@Override
	public int method4498() {
		return this.aClass126_5 == null ? 0 : this.aClass126_5.method3155();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5417(@OriginalArg(0) Class129 arg0) {
		@Pc(24) Class11_Sub4_Sub4 local24;
		if (this.aClass11_Sub4_Sub4_4 == null && this.aBoolean345) {
			@Pc(35) Class204 local35 = this.method4514(arg0, true, 131072);
			local24 = local35 == null ? null : local35.aClass11_Sub4_Sub4_6;
		} else {
			local24 = this.aClass11_Sub4_Sub4_4;
			this.aClass11_Sub4_Sub4_4 = null;
		}
		if (local24 != null) {
			Static328.method5390(local24, this.aByte67, super.anInt5252, super.anInt5256, null);
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	@Override
	public int method5410() {
		return this.aShort76 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	@Override
	public Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		return this.method4510(arg1, arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!uo;BZI)Lclient!vg;")
	private Class204 method4514(@OriginalArg(0) Class129 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class84 local12 = Static108.method1650(this.aShort76 & 0xFFFF);
		@Pc(25) Class77 local25;
		@Pc(29) Class77 local29;
		if (this.aBoolean343) {
			local25 = Static79.aClass77Array5[this.aByte67];
			local29 = Static129.aClass77Array3[0];
		} else {
			if (this.aByte67 >= 3) {
				local29 = null;
			} else {
				local29 = Static129.aClass77Array3[this.aByte67 + 1];
			}
			local25 = Static129.aClass77Array3[this.aByte67];
		}
		return local12.method1641(arg0, this.aByte65, super.anInt5252, this.aByte66, local25, super.anInt5243, local29, super.anInt5256, arg1, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		if (this.aClass126_5 == null) {
			return null;
		}
		@Pc(11) Class61 local11 = arg0.method4979();
		local11.method3666(super.anInt5255 + super.anInt5252, super.anInt5243, super.anInt5256 + super.anInt5247);
		@Pc(37) Class10_Sub1 local37 = null;
		if (this.aBoolean344) {
			local37 = Static55.method830(1);
		}
		this.aClass126_5.method3139(local11, local37 == null ? null : local37.aClass10_Sub8Array1[0], 0);
		return local37;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class126 local9 = this.method4510(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(21) Class61 local21 = arg1.method4979();
			local21.method3666(super.anInt5252, super.anInt5243, super.anInt5256);
			return local9.method3160(arg2, arg0, local21, false);
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5412() {
		return this.aBoolean345;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
	@Override
	public void method5416() {
		if (this.aClass126_5 != null) {
			this.aClass126_5.method3135();
		}
	}
}
