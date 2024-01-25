import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class47_Sub3_Sub3 extends Class47_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!th", name = "X", descriptor = "Lclient!pl;")
	private Class231 aClass231_6;

	@OriginalMember(owner = "client!th", name = "W", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!th", name = "V", descriptor = "Z")
	private final boolean aBoolean542;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "Z")
	private final boolean aBoolean540;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "S")
	private final short aShort113;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "Z")
	private final boolean aBoolean539;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "Lclient!r;")
	private Class19 aClass19_5;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIZIZ)V")
	public Class47_Sub3_Sub3(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt8321, arg1.aBoolean579, arg1.aBoolean567);
		this.aByte92 = (byte) arg7;
		this.aBoolean542 = arg6;
		this.aByte91 = (byte) arg2;
		this.aBoolean541 = arg8;
		super.anInt7956 = arg3;
		super.anInt7957 = arg5;
		this.aBoolean540 = arg1.anInt8338 != 0 && !arg6;
		this.aShort113 = (short) arg1.anInt8333;
		this.aBoolean539 = arg0.method7611() && arg1.aBoolean576 && !this.aBoolean542 && Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean541) {
			local69 |= 0x10000;
		}
		@Pc(84) Class139 local84 = this.method6778(local69, this.aBoolean539, arg0);
		if (local84 != null) {
			this.aClass1_Sub1_Sub4_5 = local84.aClass1_Sub1_Sub4_3;
			this.aClass19_5 = local84.aClass19_3;
			if (this.aBoolean541) {
				this.aClass19_5 = this.aClass19_5.method7260((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		if (!(arg5 instanceof Class47_Sub3_Sub3)) {
			return;
		}
		@Pc(15) Class47_Sub3_Sub3 local15 = (Class47_Sub3_Sub3) arg5;
		if (this.aClass19_5 != null && local15.aClass19_5 != null) {
			this.aClass19_5.method7263(local15.aClass19_5, arg3, arg1, arg4, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.method6781(arg1, arg0);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
		if (this.aClass19_5 != null) {
			this.aClass19_5.method7259();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return this.aShort113 & 0xFFFF;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		if (this.aClass19_5 == null) {
			return null;
		}
		@Pc(16) Class22 local16 = arg0.method7642();
		local16.oa(super.anInt7956, super.anInt7955, super.anInt7957);
		@Pc(26) Class2_Sub6 local26 = null;
		if (this.aBoolean540) {
			local26 = Static275.method4678(1);
		}
		this.aClass19_5.method7258(local16, local26 == null ? null : local26.aClass2_Sub7Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLclient!qa;B)Lclient!is;")
	private Class139 method6778(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class9 arg2) {
		@Pc(11) Class288 local11 = Static365.aClass194_6.method5084(this.aShort113 & 0xFFFF);
		@Pc(24) Class10 local24;
		@Pc(28) Class10 local28;
		if (this.aBoolean542) {
			local24 = Static106.aClass10Array5[this.aByte91];
			local28 = Static53.aClass10Array3[0];
		} else {
			local24 = Static53.aClass10Array3[this.aByte91];
			if (this.aByte91 >= 3) {
				local28 = null;
			} else {
				local28 = Static53.aClass10Array3[this.aByte91 + 1];
			}
		}
		return local11.method7071(super.anInt7956, 22, arg1, arg0, super.anInt7957, local28, local24, this.aByte92, arg2, super.anInt7955);
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		this.aBoolean541 = false;
		if (this.aClass19_5 != null) {
			this.aClass19_5.m(this.aClass19_5.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!qa;BI)Lclient!r;")
	private Class19 method6781(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass19_5 != null && arg0.method7607(this.aClass19_5.ba(), arg1) == 0) {
			return this.aClass19_5;
		} else {
			@Pc(23) Class139 local23 = this.method6778(arg1, false, arg0);
			return local23 == null ? null : local23.aClass19_3;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return 22;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class19 local15 = this.method6781(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class22 local20 = arg1.method7642();
			local20.oa(super.anInt7956, super.anInt7955, super.anInt7957);
			return local15.method7257(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return this.aBoolean539;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return this.aByte92;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
		@Pc(31) Class1_Sub1_Sub4 local31;
		if (this.aClass1_Sub1_Sub4_5 == null && this.aBoolean539) {
			@Pc(24) Class139 local24 = this.method6778(262144, true, arg0);
			local31 = local24 == null ? null : local24.aClass1_Sub1_Sub4_3;
		} else {
			local31 = this.aClass1_Sub1_Sub4_5;
			this.aClass1_Sub1_Sub4_5 = null;
		}
		if (local31 != null) {
			Static11.method241(local31, this.aByte91, super.anInt7956, super.anInt7957, null);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		if (this.aClass231_6 == null) {
			this.aClass231_6 = Static246.method4148(this.method6781(arg0, 0), super.anInt7956, super.anInt7957, super.anInt7955);
		}
		return this.aClass231_6;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
		@Pc(14) Class1_Sub1_Sub4 local14;
		if (this.aClass1_Sub1_Sub4_5 == null && this.aBoolean539) {
			@Pc(25) Class139 local25 = this.method6778(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass1_Sub1_Sub4_3;
		} else {
			local14 = this.aClass1_Sub1_Sub4_5;
			this.aClass1_Sub1_Sub4_5 = null;
		}
		if (local14 != null) {
			Static354.method5622(local14, this.aByte91, super.anInt7956, super.anInt7957, null);
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return this.aBoolean541;
	}
}
