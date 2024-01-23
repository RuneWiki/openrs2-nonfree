import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class52_Sub1 extends Class52 implements Interface5 {

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
	private int anInt1614 = 50;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "Lclient!nm;")
	private Class119 aClass119_29;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "Lclient!nm;")
	private Class119 aClass119_30;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "Lclient!mi;")
	private Class112 aClass112_8;

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "Lclient!mi;")
	private Class112 aClass112_9;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!nm;Lclient!nm;Lclient!nm;IZ)V")
	public Class52_Sub1(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aClass119_29 = arg0;
		this.aBoolean172 = arg4;
		this.aClass119_30 = arg2;
		this.anInt1614 = arg3;
		this.aClass112_8 = new Class112(this.anInt1614);
		if (Static71.aBoolean165) {
			this.aClass112_9 = new Class112(this.anInt1614);
		} else {
			this.aClass112_9 = null;
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1478(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub17 local8 = this.method1490(arg0);
		return local8 == null ? false : local8.method3515(this, this.aClass119_30);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public void method1488() {
		this.aClass112_8.method2959();
		if (this.aClass112_9 != null) {
			this.aClass112_9.method2959();
		}
		Static216.anIntArray455 = null;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(IB)Lclient!kg;")
	@Override
	protected Class1_Sub5_Sub10 method1452(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub17 local8 = this.method1490(arg0);
		return local8 == null ? null : local8.aClass1_Sub5_Sub10_1;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(BI)V")
	public void method1489(@OriginalArg(1) int arg0) {
		this.anInt1614 = arg0;
		this.aClass112_8 = new Class112(this.anInt1614);
		if (Static71.aBoolean165) {
			this.aClass112_9 = new Class112(this.anInt1614);
		} else {
			this.aClass112_9 = null;
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(II)I")
	@Override
	public int method1483(@OriginalArg(0) int arg0) {
		return this.method1449(arg0).aByte26 & 0xFF;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(BI)V")
	@Override
	public void method1480(@OriginalArg(1) int arg0) {
		this.method1485(arg0, this.aBoolean172 || this.method1449(arg0).aBoolean526 ? 64 : 128);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)Lclient!pk;")
	private Class1_Sub5_Sub17 method1490(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub5_Sub17 local11 = (Class1_Sub5_Sub17) this.aClass112_8.method2951((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28 = this.aClass119_29.method3235(0, arg0);
		if (local28 == null) {
			return null;
		} else {
			local11 = new Class1_Sub5_Sub17(new Class1_Sub13(local28));
			this.aClass112_8.method2950((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(ZI)Z")
	@Override
	public boolean method1473(@OriginalArg(1) int arg0) {
		return this.method1449(arg0).aBoolean521;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(BI)Z")
	@Override
	public boolean method1475(@OriginalArg(1) int arg0) {
		return this.aBoolean172 || this.method1449(arg0).aBoolean526;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IFI)[I")
	@Override
	public int[] method1479(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub5_Sub17 local13 = this.method1490(arg1);
		if (local13 == null) {
			return null;
		} else {
			local13.aBoolean362 = true;
			return local13.method3516(this, this.aClass119_30, arg0, this.aBoolean172 || this.method1449(arg1).aBoolean526);
		}
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(II)I")
	@Override
	public int method1486(@OriginalArg(0) int arg0) {
		return this.method1449(arg0).aShort51 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
	@Override
	public int method1474(@OriginalArg(1) int arg0) {
		return this.method1449(arg0).aByte25 & 0xFF;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IB)I")
	@Override
	public int method1484(@OriginalArg(0) int arg0) {
		return this.method1449(arg0).aByte24 & 0xFF;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIFBZ)Lclient!le;")
	@Override
	public Class1_Sub5_Sub6_Sub1 method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class1_Sub5_Sub17 local10 = this.method1490(arg1);
		if (local10 != null && local10.method3515(this, this.aClass119_30)) {
			return arg3 ? local10.aClass1_Sub5_Sub10_1.method2505(arg0, (double) arg2, arg0, this, this.aClass119_30) : local10.aClass1_Sub5_Sub10_1.method2499((double) arg2, this.aClass119_30, arg0, arg0, this);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(ZI)[I")
	@Override
	public int[] method1481(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub5_Sub17 local8 = this.method1490(arg0);
		return local8 == null ? null : local8.method3512(this, this.aClass119_30, this.aBoolean172 || this.method1449(arg0).aBoolean526);
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(II)Lclient!dg;")
	private Class1_Sub5_Sub5 method1492(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub5_Sub5 local11 = (Class1_Sub5_Sub5) this.aClass112_9.method2951((long) arg0);
		if (local11 == null) {
			local11 = new Class1_Sub5_Sub5(this.method1449(arg0).aShort51 & 0xFFFF);
			this.aClass112_9.method2950((long) arg0, local11);
			return local11;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)I")
	@Override
	public int method1482(@OriginalArg(1) int arg0) {
		return this.method1449(arg0).aByte23 & 0xFF;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(ZI)V")
	public void method1493(@OriginalArg(1) int arg0) {
		for (@Pc(13) Class1_Sub5_Sub17 local13 = (Class1_Sub5_Sub17) this.aClass112_8.method2955(); local13 != null; local13 = (Class1_Sub5_Sub17) this.aClass112_8.method2956()) {
			if (local13.aBoolean362) {
				local13.method3514(arg0);
				local13.aBoolean362 = false;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static165.method4612(this.method1449(arg0).aByte26 & 0xFF, this.method1449(arg0).aByte25 & 0xFF);
		@Pc(17) boolean local17 = false;
		@Pc(26) Class1_Sub5_Sub17 local26 = this.method1490(arg0);
		if (local26 != null) {
			local17 = local26.method3517(this, this.aClass119_30, arg1);
		}
		if (!local17) {
			@Pc(43) Class1_Sub5_Sub5 local43 = this.method1492(arg0);
			local43.method941();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method1472(@OriginalArg(1) int arg0) {
		return !this.method1449(arg0).aBoolean524;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method1477(@OriginalArg(0) int arg0) {
		return this.method1449(arg0).aBoolean522;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZZ)V")
	public void method1494(@OriginalArg(1) boolean arg0) {
		this.aBoolean172 = arg0;
		this.method1488();
	}
}
