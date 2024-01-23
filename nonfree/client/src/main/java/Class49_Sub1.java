import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class49_Sub1 extends Class49 implements Interface4 {

	@OriginalMember(owner = "client!fi", name = "J", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
	private int anInt1706 = 50;

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "Lclient!pk;")
	private Class132 aClass132_32;

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "Lclient!pk;")
	private Class132 aClass132_31;

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "Lclient!ok;")
	private Class125 aClass125_20;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "Lclient!ok;")
	private Class125 aClass125_21;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!pk;Lclient!pk;Lclient!pk;IZ)V")
	public Class49_Sub1(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aClass132_32 = arg0;
		this.anInt1706 = arg3;
		this.aBoolean121 = arg4;
		this.aClass132_31 = arg2;
		this.aClass125_20 = new Class125(this.anInt1706);
		if (Static116.aBoolean188) {
			this.aClass125_21 = new Class125(this.anInt1706);
		} else {
			this.aClass125_21 = null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(II)Z")
	@Override
	public boolean method1266(@OriginalArg(0) int arg0) {
		return this.method1235(arg0).aBoolean1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V")
	public void method1273(@OriginalArg(1) boolean arg0) {
		this.aBoolean121 = arg0;
		this.method1275();
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(II)[I")
	@Override
	public int[] method1264(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub1_Sub21 local8 = this.method1274(arg0);
		return local8 == null ? null : local8.method4032(this, this.aClass132_31, this.aBoolean121 || this.method1235(arg0).aBoolean3);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method1263(@OriginalArg(0) int arg0) {
		@Pc(8) Class8_Sub1_Sub21 local8 = this.method1274(arg0);
		return local8 == null ? false : local8.method4033(this, this.aClass132_31);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IFI)[I")
	@Override
	public int[] method1262(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class8_Sub1_Sub21 local16 = this.method1274(arg1);
		if (local16 == null) {
			return null;
		} else {
			local16.aBoolean447 = true;
			return local16.method4028(this, this.aClass132_31, arg0, this.aBoolean121 || this.method1235(arg1).aBoolean3);
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(BI)Lclient!be;")
	@Override
	protected Class8_Sub1_Sub1 method1238(@OriginalArg(1) int arg0) {
		@Pc(16) Class8_Sub1_Sub21 local16 = this.method1274(arg0);
		return local16 == null ? null : local16.aClass8_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "(II)Lclient!uh;")
	private Class8_Sub1_Sub21 method1274(@OriginalArg(0) int arg0) {
		@Pc(11) Class8_Sub1_Sub21 local11 = (Class8_Sub1_Sub21) this.aClass125_20.method2957((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(23) byte[] local23 = this.aClass132_32.method3194(arg0, 0);
		if (local23 == null) {
			return null;
		} else {
			local11 = new Class8_Sub1_Sub21(new Class8_Sub2(local23));
			this.aClass125_20.method2956((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "(II)Z")
	@Override
	public boolean method1272(@OriginalArg(1) int arg0) {
		return this.aBoolean121 || this.method1235(arg0).aBoolean3;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZFIII)Lclient!eg;")
	@Override
	public Class8_Sub1_Sub7_Sub1 method1260(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class8_Sub1_Sub21 local8 = this.method1274(arg3);
		if (local8 != null && local8.method4033(this, this.aClass132_31)) {
			return arg0 ? local8.aClass8_Sub1_Sub1_1.method370(this, arg2, this.aClass132_31, arg2, (double) arg1) : local8.aClass8_Sub1_Sub1_1.method356(this.aClass132_31, arg2, this, arg2, (double) arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "(II)Z")
	@Override
	public boolean method1270(@OriginalArg(1) int arg0) {
		return this.method1235(arg0).aBoolean2;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)I")
	@Override
	public int method1259(@OriginalArg(1) int arg0) {
		return this.method1235(arg0).aShort2 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(II)V")
	@Override
	public void method1267(@OriginalArg(0) int arg0) {
		this.method1269(arg0, this.aBoolean121 || this.method1235(arg0).aBoolean3 ? 64 : 128);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)I")
	@Override
	public int method1258(@OriginalArg(1) int arg0) {
		return this.method1235(arg0).aByte4 & 0xFF;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public void method1275() {
		this.aClass125_20.method2950();
		if (this.aClass125_21 != null) {
			this.aClass125_21.method2950();
		}
		Static268.anIntArray463 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)I")
	@Override
	public int method1268(@OriginalArg(0) int arg0) {
		return this.method1235(arg0).aByte2 & 0xFF;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(BI)V")
	public void method1276(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class8_Sub1_Sub21 local7 = (Class8_Sub1_Sub21) this.aClass125_20.method2954(); local7 != null; local7 = (Class8_Sub1_Sub21) this.aClass125_20.method2955()) {
			if (local7.aBoolean447) {
				local7.method4030(arg0);
				local7.aBoolean447 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "(II)V")
	public void method1278(@OriginalArg(1) int arg0) {
		this.anInt1706 = arg0;
		this.aClass125_20 = new Class125(this.anInt1706);
		if (Static116.aBoolean188) {
			this.aClass125_21 = new Class125(this.anInt1706);
		} else {
			this.aClass125_21 = null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)Lclient!ii;")
	private Class8_Sub1_Sub8 method1279(@OriginalArg(0) int arg0) {
		@Pc(17) Class8_Sub1_Sub8 local17 = (Class8_Sub1_Sub8) this.aClass125_21.method2957((long) arg0);
		if (local17 == null) {
			local17 = new Class8_Sub1_Sub8(this.method1235(arg0).aShort2 & 0xFFFF);
			this.aClass125_21.method2956((long) arg0, local17);
			return local17;
		} else {
			return local17;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(ZI)Z")
	@Override
	public boolean method1271(@OriginalArg(1) int arg0) {
		return !this.method1235(arg0).aBoolean5;
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(II)I")
	@Override
	public int method1265(@OriginalArg(0) int arg0) {
		return this.method1235(arg0).aByte3 & 0xFF;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)I")
	@Override
	public int method1261(@OriginalArg(1) int arg0) {
		return this.method1235(arg0).aByte1 & 0xFF;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(1) boolean local1 = false;
		Static108.method1772(this.method1235(arg0).aByte3 & 0xFF, this.method1235(arg0).aByte2 & 0xFF);
		@Pc(28) Class8_Sub1_Sub21 local28 = this.method1274(arg0);
		if (local28 != null) {
			local1 = local28.method4026(this, this.aClass132_31, arg1);
		}
		if (!local1) {
			@Pc(52) Class8_Sub1_Sub8 local52 = this.method1279(arg0);
			local52.method1836();
		}
	}
}
