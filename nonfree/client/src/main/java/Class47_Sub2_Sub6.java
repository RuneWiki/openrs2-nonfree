import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class47_Sub2_Sub6 extends Class47_Sub2 implements Interface17 {

	@OriginalMember(owner = "client!uc", name = "jb", descriptor = "Lclient!pl;")
	private Class231 aClass231_7;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!uc", name = "eb", descriptor = "B")
	private final byte aByte96;

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "Z")
	private boolean aBoolean554;

	@OriginalMember(owner = "client!uc", name = "kb", descriptor = "B")
	private final byte aByte97;

	@OriginalMember(owner = "client!uc", name = "hb", descriptor = "Z")
	private final boolean aBoolean557;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "B")
	private final byte aByte95;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "S")
	private final short aShort118;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "Z")
	private final boolean aBoolean556;

	@OriginalMember(owner = "client!uc", name = "fb", descriptor = "Lclient!r;")
	public Class19 aClass19_6;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_6;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIIZIIIIIIZ)V")
	public Class47_Sub2_Sub6(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8325 == 1, Static318.method5207(arg13, arg12));
		this.aBoolean555 = arg1.anInt8338 != 0 && !arg7;
		this.aByte96 = (byte) arg12;
		this.aBoolean554 = arg14;
		this.aByte97 = (byte) arg13;
		this.aBoolean557 = arg7;
		this.aByte95 = (byte) arg3;
		this.aShort118 = (short) arg1.anInt8333;
		this.aBoolean556 = arg0.method7611() && arg1.aBoolean576 && !this.aBoolean557 && Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926) != 0;
		@Pc(79) int local79 = 2048;
		if (this.aBoolean554) {
			local79 |= 0x10000;
		}
		@Pc(94) Class139 local94 = this.method6972(arg0, local79, this.aBoolean556);
		if (local94 != null) {
			this.aClass19_6 = local94.aClass19_3;
			this.aClass1_Sub1_Sub4_6 = local94.aClass1_Sub1_Sub4_3;
			if (this.aBoolean554) {
				this.aClass19_6 = this.aClass19_6.method7260((byte) 0, local79, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return this.aByte97;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class19 local9 = this.method6970(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class22 local14 = arg1.method7642();
			local14.oa(super.anInt8189, super.anInt8192, super.anInt8191);
			return local9.method7257(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
		if (this.aClass19_6 != null) {
			this.aClass19_6.method7259();
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return this.aByte96;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
		@Pc(25) Class1_Sub1_Sub4 local25;
		if (this.aClass1_Sub1_Sub4_6 == null && this.aBoolean556) {
			@Pc(18) Class139 local18 = this.method6972(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub4_3;
		} else {
			local25 = this.aClass1_Sub1_Sub4_6;
			this.aClass1_Sub1_Sub4_6 = null;
		}
		if (local25 != null) {
			Static354.method5622(local25, this.aByte95, super.anInt8189, super.anInt8191, null);
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)I")
	@Override
	public int method6953() {
		return this.aClass19_6 == null ? 0 : this.aClass19_6.TA();
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
		@Pc(27) Class1_Sub1_Sub4 local27;
		if (this.aClass1_Sub1_Sub4_6 == null && this.aBoolean556) {
			@Pc(20) Class139 local20 = this.method6972(arg0, 262144, true);
			local27 = local20 == null ? null : local20.aClass1_Sub1_Sub4_3;
		} else {
			local27 = this.aClass1_Sub1_Sub4_6;
			this.aClass1_Sub1_Sub4_6 = null;
		}
		if (local27 != null) {
			Static11.method241(local27, this.aByte95, super.anInt8189, super.anInt8191, null);
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		this.aBoolean554 = false;
		if (this.aClass19_6 != null) {
			this.aClass19_6.m(this.aClass19_6.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return this.aBoolean554;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		if (this.aClass19_6 == null) {
			return null;
		}
		@Pc(16) Class22 local16 = arg0.method7642();
		local16.oa(super.anInt8189, super.anInt8192, super.anInt8191);
		@Pc(26) Class2_Sub6 local26 = null;
		if (this.aBoolean555) {
			local26 = Static275.method4678(1);
		}
		this.aClass19_6.method7258(local16, local26 == null ? null : local26.aClass2_Sub7Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		if (arg5 instanceof Class47_Sub4_Sub1) {
			@Pc(9) Class47_Sub4_Sub1 local9 = (Class47_Sub4_Sub1) arg5;
			if (this.aClass19_6 != null && local9.aClass19_2 != null) {
				this.aClass19_6.method7263(local9.aClass19_2, arg3, arg1, arg4, arg2);
			}
		} else if (arg5 instanceof Class47_Sub2_Sub6) {
			@Pc(32) Class47_Sub2_Sub6 local32 = (Class47_Sub2_Sub6) arg5;
			if (this.aClass19_6 != null && local32.aClass19_6 != null) {
				this.aClass19_6.method7263(local32.aClass19_6, arg3, arg1, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return this.aShort118 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)I")
	public int method6969() {
		return this.aClass19_6 == null ? 15 : this.aClass19_6.e() / 4;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	private Class19 method6970(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass19_6 != null && arg0.method7607(this.aClass19_6.ba(), arg1) == 0) {
			return this.aClass19_6;
		} else {
			@Pc(34) Class139 local34 = this.method6972(arg0, arg1, false);
			return local34 == null ? null : local34.aClass19_3;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!qa;IZ)Lclient!is;")
	private Class139 method6972(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) Class288 local11 = Static365.aClass194_6.method5084(this.aShort118 & 0xFFFF);
		@Pc(30) Class10 local30;
		@Pc(25) Class10 local25;
		if (this.aBoolean557) {
			local25 = Static53.aClass10Array3[0];
			local30 = Static106.aClass10Array5[this.aByte95];
		} else {
			if (this.aByte95 < 3) {
				local25 = Static53.aClass10Array3[this.aByte95 + 1];
			} else {
				local25 = null;
			}
			local30 = Static53.aClass10Array3[this.aByte95];
		}
		return local11.method7071(super.anInt8189, this.aByte96 == 11 ? 10 : this.aByte96, arg2, arg1, super.anInt8191, local25, local30, this.aByte96 == 11 ? this.aByte97 + 4 : this.aByte97, arg0, super.anInt8192);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		if (this.aClass231_7 == null) {
			this.aClass231_7 = Static246.method4148(this.method6970(arg0, 0), super.anInt8189, super.anInt8191, super.anInt8192);
		}
		return this.aClass231_7;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.method6970(arg1, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return this.aBoolean556;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
	}
}
