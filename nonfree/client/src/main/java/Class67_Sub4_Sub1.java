import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class67_Sub4_Sub1 extends Class67_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!iq", name = "E", descriptor = "Z")
	private final boolean aBoolean166;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "Z")
	private final boolean aBoolean168;

	@OriginalMember(owner = "client!iq", name = "F", descriptor = "S")
	private final short aShort27;

	@OriginalMember(owner = "client!iq", name = "H", descriptor = "Z")
	private boolean aBoolean167;

	@OriginalMember(owner = "client!iq", name = "ab", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!iq", name = "bb", descriptor = "Z")
	private final boolean aBoolean169;

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "Lclient!mj;")
	private Class126 aClass126_4;

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "Lclient!mc;")
	private Class11_Sub4_Sub4 aClass11_Sub4_Sub4_3;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIZIZ)V")
	public Class67_Sub4_Sub1(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean126, arg1.aBoolean123);
		this.aBoolean166 = arg1.anInt2016 != 0 && !arg6;
		this.aByte21 = (byte) arg2;
		this.aBoolean168 = arg6;
		super.anInt5706 = (short) arg3;
		this.aShort27 = (short) arg1.anInt2012;
		this.aBoolean167 = arg8;
		super.anInt5712 = (short) arg5;
		this.aByte22 = (byte) arg7;
		this.aBoolean169 = arg0.method4935() && arg1.aBoolean135 && !this.aBoolean168 && Static103.anInt1883 != 0;
		@Pc(69) int local69 = 1024;
		if (this.aBoolean167) {
			local69 |= 0x8000;
		}
		@Pc(84) Class204 local84 = this.method2125(this.aBoolean169, arg0, local69);
		if (local84 != null) {
			this.aClass126_4 = local84.aClass126_7;
			this.aClass11_Sub4_Sub4_3 = local84.aClass11_Sub4_Sub4_6;
			if (this.aBoolean167) {
				this.aClass126_4 = this.aClass126_4.method3158((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	@Override
	public Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		return this.method2127(arg1, arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5417(@OriginalArg(0) Class129 arg0) {
		@Pc(18) Class11_Sub4_Sub4 local18;
		if (this.aClass11_Sub4_Sub4_3 == null && this.aBoolean169) {
			@Pc(29) Class204 local29 = this.method2125(true, arg0, 131072);
			local18 = local29 == null ? null : local29.aClass11_Sub4_Sub4_6;
		} else {
			local18 = this.aClass11_Sub4_Sub4_3;
			this.aClass11_Sub4_Sub4_3 = null;
		}
		if (local18 != null) {
			Static328.method5390(local18, this.aByte21, super.anInt5706, super.anInt5712, null);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZLclient!uo;I)Lclient!vg;")
	private Class204 method2125(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class84 local12 = Static108.method1650(this.aShort27 & 0xFFFF);
		@Pc(28) Class77 local28;
		@Pc(32) Class77 local32;
		if (this.aBoolean168) {
			local28 = Static79.aClass77Array5[this.aByte21];
			local32 = Static129.aClass77Array3[0];
		} else {
			if (this.aByte21 >= 3) {
				local32 = null;
			} else {
				local32 = Static129.aClass77Array3[this.aByte21 + 1];
			}
			local28 = Static129.aClass77Array3[this.aByte21];
		}
		return local12.method1641(arg1, this.aByte22, super.anInt5706, 22, local28, super.anInt5709, local32, super.anInt5712, arg0, arg2);
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		this.aBoolean167 = false;
		if (this.aClass126_4 != null) {
			this.aClass126_4.method3143(this.aClass126_4.method3142() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5412() {
		return this.aBoolean169;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class67_Sub4_Sub1) {
			@Pc(5) Class67_Sub4_Sub1 local5 = (Class67_Sub4_Sub1) arg3;
			if (this.aClass126_4 != null && local5.aClass126_4 != null) {
				this.aClass126_4.method3121(local5.aClass126_4, arg2, arg1, arg0, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	@Override
	public void method5416() {
		if (this.aClass126_4 != null) {
			this.aClass126_4.method3135();
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!uo;IZ)Lclient!mj;")
	private Class126 method2127(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass126_4 != null && arg0.method4938(this.aClass126_4.method3142(), arg1) == 0) {
			return this.aClass126_4;
		} else {
			@Pc(23) Class204 local23 = this.method2125(false, arg0, arg1);
			return local23 == null ? null : local23.aClass126_7;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!uo;)V")
	@Override
	public void method5415(@OriginalArg(1) Class129 arg0) {
		@Pc(23) Class11_Sub4_Sub4 local23;
		if (this.aClass11_Sub4_Sub4_3 == null && this.aBoolean169) {
			@Pc(34) Class204 local34 = this.method2125(true, arg0, 131072);
			local23 = local34 == null ? null : local34.aClass11_Sub4_Sub4_6;
		} else {
			local23 = this.aClass11_Sub4_Sub4_3;
			this.aClass11_Sub4_Sub4_3 = null;
		}
		if (local23 != null) {
			Static134.method2077(local23, this.aByte21, super.anInt5706, super.anInt5712, null);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I")
	@Override
	public int method5410() {
		return this.aShort27 & 0xFFFF;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)I")
	@Override
	public int method5414() {
		return 22;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		if (this.aClass126_4 == null) {
			return null;
		}
		@Pc(20) Class61 local20 = arg0.method4979();
		local20.method3666(super.anInt5706, super.anInt5709, super.anInt5712);
		@Pc(30) Class10_Sub1 local30 = null;
		if (this.aBoolean166) {
			local30 = Static55.method830(1);
		}
		this.aClass126_4.method3139(local20, local30 == null ? null : local30.aClass10_Sub8Array1[0], 0);
		return local30;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class126 local16 = this.method2127(arg1, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class61 local21 = arg1.method4979();
			local21.method3666(super.anInt5706, super.anInt5709, super.anInt5712);
			return local16.method3160(arg2, arg0, local21, false);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aByte22;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return this.aBoolean167;
	}
}
