import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class104_Sub1 extends Class104 implements Interface3 {

	@OriginalMember(owner = "client!sn", name = "N", descriptor = "Z")
	private boolean aBoolean347 = false;

	@OriginalMember(owner = "client!sn", name = "db", descriptor = "I")
	private int anInt5193 = 50;

	@OriginalMember(owner = "client!sn", name = "J", descriptor = "Lclient!ek;")
	private Class42 aClass42_87;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "Lclient!ek;")
	private Class42 aClass42_86;

	@OriginalMember(owner = "client!sn", name = "R", descriptor = "Lclient!lj;")
	private Class106 aClass106_12;

	@OriginalMember(owner = "client!sn", name = "K", descriptor = "Lclient!lj;")
	private Class106 aClass106_11;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ek;Lclient!ek;Lclient!ek;IZ)V")
	public Class104_Sub1(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aClass42_87 = arg0;
		this.anInt5193 = arg3;
		this.aBoolean347 = arg4;
		this.aClass42_86 = arg2;
		this.aClass106_12 = new Class106(this.anInt5193);
		if (Static116.aBoolean184) {
			this.aClass106_11 = new Class106(this.anInt5193);
		} else {
			this.aClass106_11 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(IB)I")
	@Override
	public int method4142(@OriginalArg(0) int arg0) {
		return this.method4105(arg0).aByte16 & 0xFF;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BIIFZ)Lclient!sc;")
	@Override
	public Class2_Sub8_Sub1_Sub1 method4139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class2_Sub8_Sub13 local8 = this.method4148(arg1);
		if (local8 != null && local8.method3116(this, this.aClass42_86)) {
			return arg3 ? local8.aClass2_Sub8_Sub18_1.method3634((double) arg2, arg0, this.aClass42_86, arg0, this) : local8.aClass2_Sub8_Sub18_1.method3636(arg0, (double) arg2, this, arg0, this.aClass42_86);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(II)I")
	@Override
	public int method4135(@OriginalArg(0) int arg0) {
		return this.method4105(arg0).aByte13 & 0xFF;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)I")
	@Override
	public int method4134(@OriginalArg(0) int arg0) {
		return this.method4105(arg0).aByte14 & 0xFF;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IFB)[I")
	@Override
	public int[] method4136(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(10) Class2_Sub8_Sub13 local10 = this.method4148(arg0);
		if (local10 == null) {
			return null;
		} else {
			local10.aBoolean255 = true;
			return local10.method3117(this, this.aClass42_86, arg1, this.aBoolean347 || this.method4105(arg0).aBoolean221);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
	@Override
	public void method4133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static118.method1991(this.method4105(arg0).aByte14 & 0xFF, this.method4105(arg0).aByte13 & 0xFF);
		@Pc(17) boolean local17 = false;
		@Pc(24) Class2_Sub8_Sub13 local24 = this.method4148(arg0);
		if (local24 != null) {
			local17 = local24.method3112(this, this.aClass42_86, arg1);
		}
		if (!local17) {
			@Pc(41) Class2_Sub8_Sub7 local41 = this.method4154(arg0);
			local41.method1436();
		}
	}

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "(II)Lclient!md;")
	private Class2_Sub8_Sub13 method4148(@OriginalArg(0) int arg0) {
		@Pc(7) Class2_Sub8_Sub13 local7 = (Class2_Sub8_Sub13) this.aClass106_12.method2986((long) arg0);
		if (local7 != null) {
			return local7;
		}
		@Pc(22) byte[] local22 = this.aClass42_87.method1256(arg0, 0);
		if (local22 == null) {
			return null;
		} else {
			local7 = new Class2_Sub8_Sub13(new Class2_Sub16(local22));
			this.aClass106_12.method2990((long) arg0, local7);
			return local7;
		}
	}

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "(II)Lclient!pl;")
	@Override
	protected Class2_Sub8_Sub18 method4110(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub8_Sub13 local16 = this.method4148(arg0);
		return local16 == null ? null : local16.aClass2_Sub8_Sub18_1;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(IZ)V")
	public void method4150(@OriginalArg(1) boolean arg0) {
		this.aBoolean347 = arg0;
		this.method4156();
	}

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "(II)V")
	public void method4151(@OriginalArg(0) int arg0) {
		this.anInt5193 = arg0;
		this.aClass106_12 = new Class106(this.anInt5193);
		if (Static116.aBoolean184) {
			this.aClass106_11 = new Class106(this.anInt5193);
		} else {
			this.aClass106_11 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method4141(@OriginalArg(0) int arg0) {
		return !this.method4105(arg0).aBoolean222;
	}

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "(II)V")
	public void method4152(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class2_Sub8_Sub13 local7 = (Class2_Sub8_Sub13) this.aClass106_12.method2984(); local7 != null; local7 = (Class2_Sub8_Sub13) this.aClass106_12.method2987()) {
			if (local7.aBoolean255) {
				local7.method3113(arg0);
				local7.aBoolean255 = false;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)V")
	@Override
	public void method4140(@OriginalArg(1) int arg0) {
		this.method4133(arg0, this.aBoolean347 || this.method4105(arg0).aBoolean221 ? 64 : 128);
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(BI)Lclient!fd;")
	private Class2_Sub8_Sub7 method4154(@OriginalArg(1) int arg0) {
		@Pc(19) Class2_Sub8_Sub7 local19 = (Class2_Sub8_Sub7) this.aClass106_11.method2986((long) arg0);
		if (local19 == null) {
			local19 = new Class2_Sub8_Sub7(this.method4105(arg0).aShort48 & 0xFFFF);
			this.aClass106_11.method2990((long) arg0, local19);
			return local19;
		} else {
			return local19;
		}
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(II)[I")
	@Override
	public int[] method4138(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub8_Sub13 local8 = this.method4148(arg0);
		return local8 == null ? null : local8.method3114(this, this.aClass42_86, this.aBoolean347 || this.method4105(arg0).aBoolean221);
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(II)I")
	@Override
	public int method4131(@OriginalArg(0) int arg0) {
		return this.method4105(arg0).aByte15 & 0xFF;
	}

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "(II)Z")
	@Override
	public boolean method4145(@OriginalArg(0) int arg0) {
		return this.method4105(arg0).aBoolean219;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method4156() {
		this.aClass106_12.method2985();
		if (this.aClass106_11 != null) {
			this.aClass106_11.method2985();
		}
		Static172.anIntArray370 = null;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method4144(@OriginalArg(1) int arg0) {
		return this.aBoolean347 || this.method4105(arg0).aBoolean221;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I")
	@Override
	public int method4132(@OriginalArg(0) int arg0) {
		return this.method4105(arg0).aShort48 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method4137(@OriginalArg(1) int arg0) {
		return this.method4105(arg0).aBoolean220;
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(II)Z")
	@Override
	public boolean method4143(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub8_Sub13 local8 = this.method4148(arg0);
		return local8 == null ? false : local8.method3116(this, this.aClass42_86);
	}
}
