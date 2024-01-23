import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class74_Sub1 extends Class74 implements Interface1 {

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	private int anInt1940 = 50;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "Lclient!ph;")
	private Class138 aClass138_34;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "Lclient!ph;")
	private Class138 aClass138_35;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "Lclient!g;")
	private Class58 aClass58_10;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "Lclient!g;")
	private Class58 aClass58_9;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ph;Lclient!ph;Lclient!ph;IZ)V")
	public Class74_Sub1(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class138 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.anInt1940 = arg3;
		this.aClass138_34 = arg2;
		this.aClass138_35 = arg0;
		this.aBoolean150 = arg4;
		this.aClass58_10 = new Class58(this.anInt1940);
		if (Static291.aBoolean404) {
			this.aClass58_9 = new Class58(this.anInt1940);
		} else {
			this.aClass58_9 = null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(II)I")
	@Override
	public int method1636(@OriginalArg(1) int arg0) {
		return this.method1620(arg0).aByte16 & 0xFF;
	}

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "(II)Z")
	@Override
	public boolean method1637(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub1_Sub5 local14 = this.method1651(arg0);
		return local14 == null ? false : local14.method506(this, this.aClass138_34);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	public void method1641() {
		this.aClass58_10.method1227();
		if (this.aClass58_9 != null) {
			this.aClass58_9.method1227();
		}
		Static28.anIntArray43 = null;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method1629(@OriginalArg(0) int arg0) {
		return !this.method1620(arg0).aBoolean272;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method1627(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub1_Sub5 local14 = this.method1651(arg0);
		return local14 == null ? null : local14.method502(this, this.aClass138_34, this.aBoolean150 || this.method1620(arg0).aBoolean275);
	}

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "(II)Z")
	@Override
	public boolean method1638(@OriginalArg(0) int arg0) {
		return this.aBoolean150 || this.method1620(arg0).aBoolean275;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIF)[I")
	@Override
	public int[] method1639(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(14) Class1_Sub1_Sub5 local14 = this.method1651(arg0);
		if (local14 == null) {
			return null;
		} else {
			local14.aBoolean36 = true;
			return local14.method501(this, this.aClass138_34, arg1, this.aBoolean150 || this.method1620(arg0).aBoolean275);
		}
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(II)Z")
	@Override
	public boolean method1632(@OriginalArg(1) int arg0) {
		return this.method1620(arg0).aBoolean276;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
	public void method1646(@OriginalArg(1) int arg0) {
		this.anInt1940 = arg0;
		this.aClass58_10 = new Class58(this.anInt1940);
		if (Static291.aBoolean404) {
			this.aClass58_9 = new Class58(this.anInt1940);
		} else {
			this.aClass58_9 = null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(II)Z")
	@Override
	public boolean method1634(@OriginalArg(1) int arg0) {
		return this.method1620(arg0).aBoolean274;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZFIIZ)Lclient!ln;")
	@Override
	public Class1_Sub1_Sub3_Sub2 method1628(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class1_Sub1_Sub5 local9 = this.method1651(arg2);
		if (local9 != null && local9.method506(this, this.aClass138_34)) {
			return arg0 ? local9.aClass1_Sub1_Sub23_1.method4219((double) arg1, this, arg3, this.aClass138_34, arg3) : local9.aClass1_Sub1_Sub23_1.method4212(this.aClass138_34, arg3, this, arg3, (double) arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(BI)Lclient!rj;")
	private Class1_Sub1_Sub19 method1647(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub1_Sub19 local19 = (Class1_Sub1_Sub19) this.aClass58_9.method1233((long) arg0);
		if (local19 == null) {
			local19 = new Class1_Sub1_Sub19(this.method1620(arg0).aShort22 & 0xFFFF);
			this.aClass58_9.method1229((long) arg0, local19);
			return local19;
		} else {
			return local19;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)I")
	@Override
	public int method1631(@OriginalArg(0) int arg0) {
		return this.method1620(arg0).aByte18 & 0xFF;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	@Override
	public void method1633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static207.method3280(this.method1620(arg0).aByte17 & 0xFF, this.method1620(arg0).aByte16 & 0xFF);
		@Pc(28) boolean local28 = false;
		@Pc(33) Class1_Sub1_Sub5 local33 = this.method1651(arg0);
		if (local33 != null) {
			local28 = local33.method503(this, this.aClass138_34, arg1);
		}
		if (!local28) {
			@Pc(50) Class1_Sub1_Sub19 local50 = this.method1647(arg0);
			local50.method3784();
		}
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(II)V")
	@Override
	public void method1630(@OriginalArg(0) int arg0) {
		this.method1633(arg0, this.aBoolean150 || this.method1620(arg0).aBoolean275 ? 64 : 128);
	}

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "(II)Lclient!ud;")
	@Override
	protected Class1_Sub1_Sub23 method1624(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub1_Sub5 local4 = this.method1651(arg0);
		return local4 == null ? null : local4.aClass1_Sub1_Sub23_1;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)I")
	@Override
	public int method1626(@OriginalArg(0) int arg0) {
		return this.method1620(arg0).aByte17 & 0xFF;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IB)Lclient!cb;")
	private Class1_Sub1_Sub5 method1651(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub1_Sub5 local19 = (Class1_Sub1_Sub5) this.aClass58_10.method1233((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(30) byte[] local30 = this.aClass138_35.method3346(arg0, 0);
		if (local30 == null) {
			return null;
		} else {
			local19 = new Class1_Sub1_Sub5(new Class1_Sub14(local30));
			this.aClass58_10.method1229((long) arg0, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	public void method1652(@OriginalArg(0) boolean arg0) {
		this.aBoolean150 = arg0;
		this.method1641();
	}

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "(II)V")
	public void method1653(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub1_Sub5 local16 = (Class1_Sub1_Sub5) this.aClass58_10.method1228(); local16 != null; local16 = (Class1_Sub1_Sub5) this.aClass58_10.method1232()) {
			if (local16.aBoolean36) {
				local16.method504(arg0);
				local16.aBoolean36 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
	@Override
	public int method1625(@OriginalArg(0) int arg0) {
		return this.method1620(arg0).aShort22 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(II)I")
	@Override
	public int method1635(@OriginalArg(0) int arg0) {
		return this.method1620(arg0).aByte19 & 0xFF;
	}
}
