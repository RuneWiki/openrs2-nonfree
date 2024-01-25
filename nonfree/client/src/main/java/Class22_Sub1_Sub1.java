import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class22_Sub1_Sub1 extends Class22_Sub1 implements Interface1 {

	@OriginalMember(owner = "client!ir", name = "I", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!ir", name = "M", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!ir", name = "E", descriptor = "S")
	private final short aShort52;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!ir", name = "Q", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!ir", name = "S", descriptor = "Z")
	private final boolean aBoolean234;

	@OriginalMember(owner = "client!ir", name = "P", descriptor = "Z")
	private final boolean aBoolean233;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "Lclient!ug;")
	private Class7_Sub1_Sub4 aClass7_Sub1_Sub4_3;

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "Lclient!sj;")
	private Class31 aClass31_3;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!pe;Lclient!kk;IIIIZIZ)V")
	public Class22_Sub1_Sub1(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean268, arg1.aBoolean263);
		this.aBoolean231 = arg8;
		this.aBoolean232 = arg6;
		this.aShort52 = (short) arg1.anInt3534;
		this.aByte39 = (byte) arg2;
		this.aByte40 = (byte) arg7;
		super.anInt5706 = (short) arg5;
		super.anInt5707 = (short) arg3;
		this.aBoolean234 = arg1.anInt3560 != 0;
		this.aBoolean233 = arg0.method5418() && arg1.aBoolean274 && !this.aBoolean232 && Static336.anInt4180 != 0;
		@Pc(64) int local64 = 1024;
		if (this.aBoolean231) {
			local64 |= 0x8000;
		}
		@Pc(79) Class104 local79 = this.method2853(this.aBoolean233, arg0, local64);
		if (local79 != null) {
			this.aClass7_Sub1_Sub4_3 = local79.aClass7_Sub1_Sub4_2;
			this.aClass31_3 = local79.aClass31_2;
			if (this.aBoolean231) {
				this.aClass31_3 = this.aClass31_3.method1917((byte) 0, local64, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5363() {
		return this.aBoolean233;
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return this.aBoolean231;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		@Pc(9) Class31 local9 = this.method2854(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class70 local14 = arg2.method5427();
			local14.method3707(super.anInt5707, super.anInt5705, super.anInt5706);
			return local9.method1932(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)I")
	@Override
	public int method5362() {
		return this.aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		if (this.aClass31_3 == null) {
			return null;
		}
		@Pc(11) Class70 local11 = arg0.method5427();
		local11.method3707(super.anInt5707, super.anInt5705, super.anInt5706);
		@Pc(21) Class36_Sub1 local21 = null;
		if (this.aBoolean234) {
			local21 = Static184.method3381(1);
		}
		this.aClass31_3.method1928(local11, local21 == null ? null : local21.aClass36_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
	@Override
	public int method5360() {
		return this.aByte40;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!pe;I)V")
	@Override
	public void method5359(@OriginalArg(0) Class89 arg0) {
		@Pc(18) Class7_Sub1_Sub4 local18;
		if (this.aClass7_Sub1_Sub4_3 == null && this.aBoolean233) {
			@Pc(29) Class104 local29 = this.method2853(true, arg0, 131072);
			local18 = local29 == null ? null : local29.aClass7_Sub1_Sub4_2;
		} else {
			local18 = this.aClass7_Sub1_Sub4_3;
			this.aClass7_Sub1_Sub4_3 = null;
		}
		if (local18 != null) {
			Static86.method1826(local18, this.aByte39, super.anInt5707, super.anInt5706, null);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class22_Sub1_Sub1) {
			@Pc(13) Class22_Sub1_Sub1 local13 = (Class22_Sub1_Sub1) arg1;
			if (this.aClass31_3 != null && local13.aClass31_3 != null) {
				this.aClass31_3.method1914(local13.aClass31_3, arg4, arg3, arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	@Override
	public void method5358() {
		if (this.aClass31_3 != null) {
			this.aClass31_3.method1921();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!pe;II)Lclient!sj;")
	@Override
	public Class31 method5364(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		return this.method2854(arg0, arg1);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I")
	@Override
	public int method5361() {
		return 22;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BZLclient!pe;I)Lclient!il;")
	private Class104 method2853(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class89 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class122 local10 = Static245.method4227(this.aShort52 & 0xFFFF);
		@Pc(25) Class8 local25;
		@Pc(33) Class8 local33;
		if (this.aBoolean232) {
			local25 = Static251.aClass8Array6[this.aByte39];
			local33 = Static136.aClass8Array3[0];
		} else {
			local25 = Static136.aClass8Array3[this.aByte39];
			if (this.aByte39 >= 3) {
				local33 = null;
			} else {
				local33 = Static136.aClass8Array3[this.aByte39 + 1];
			}
		}
		return local10.method3229(super.anInt5706, this.aByte40, arg0, arg1, local25, local33, 22, super.anInt5705, arg2, super.anInt5707);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!pe;IZ)Lclient!sj;")
	private Class31 method2854(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass31_3 != null && arg0.method5399(this.aClass31_3.method1912(), arg1) == 0) {
			return this.aClass31_3;
		} else {
			@Pc(26) Class104 local26 = this.method2853(false, arg0, arg1);
			return local26 == null ? null : local26.aClass31_2;
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		this.aBoolean231 = false;
		if (this.aClass31_3 != null) {
			this.aClass31_3.method1908(this.aClass31_3.method1912() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLclient!pe;)V")
	@Override
	public void method5365(@OriginalArg(1) Class89 arg0) {
		@Pc(22) Class7_Sub1_Sub4 local22;
		if (this.aClass7_Sub1_Sub4_3 == null && this.aBoolean233) {
			@Pc(33) Class104 local33 = this.method2853(true, arg0, 131072);
			local22 = local33 == null ? null : local33.aClass7_Sub1_Sub4_2;
		} else {
			local22 = this.aClass7_Sub1_Sub4_3;
			this.aClass7_Sub1_Sub4_3 = null;
		}
		if (local22 != null) {
			Static33.method687(local22, this.aByte39, super.anInt5707, super.anInt5706, null);
		}
	}
}
