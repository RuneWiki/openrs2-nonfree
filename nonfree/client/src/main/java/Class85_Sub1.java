import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class85_Sub1 extends Class85 implements Interface2 {

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private int anInt2931 = 50;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "Lclient!km;")
	private Class91 aClass91_108;

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "Lclient!km;")
	private Class91 aClass91_109;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Lclient!fm;")
	private Class49 aClass49_6;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "Lclient!fm;")
	private Class49 aClass49_7;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!km;Lclient!km;Lclient!km;IZ)V")
	public Class85_Sub1(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aClass91_108 = arg0;
		this.aClass91_109 = arg2;
		this.aBoolean219 = arg4;
		this.anInt2931 = arg3;
		this.aClass49_6 = new Class49(this.anInt2931);
		if (Static277.aBoolean412) {
			this.aClass49_7 = new Class49(this.anInt2931);
		} else {
			this.aClass49_7 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method2273(@OriginalArg(0) int arg0) {
		return this.method2255(arg0).aBoolean330;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I")
	@Override
	public int method2264(@OriginalArg(1) int arg0) {
		return this.method2255(arg0).aByte16 & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(BI)V")
	public void method2278(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class1_Sub2_Sub15 local19 = (Class1_Sub2_Sub15) this.aClass49_6.method1384(); local19 != null; local19 = (Class1_Sub2_Sub15) this.aClass49_6.method1382()) {
			if (local19.aBoolean273) {
				local19.method2953(arg0);
				local19.aBoolean273 = false;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)I")
	@Override
	public int method2266(@OriginalArg(0) int arg0) {
		return this.method2255(arg0).aShort28 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "(II)Lclient!wb;")
	@Override
	protected Class1_Sub2_Sub22 method2258(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub15 local10 = this.method2286(arg0);
		return local10 == null ? null : local10.aClass1_Sub2_Sub22_1;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(II)I")
	@Override
	public int method2271(@OriginalArg(1) int arg0) {
		return this.method2255(arg0).aByte19 & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)V")
	@Override
	public void method2269(@OriginalArg(0) int arg0) {
		this.method2265(this.aBoolean219 || this.method2255(arg0).aBoolean333 ? 64 : 128, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(BI)I")
	@Override
	public int method2274(@OriginalArg(1) int arg0) {
		return this.method2255(arg0).aByte17 & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BZ)V")
	public void method2280(@OriginalArg(1) boolean arg0) {
		this.aBoolean219 = arg0;
		this.method2284();
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "(II)Lclient!ai;")
	private Class1_Sub2_Sub3 method2281(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub3 local11 = (Class1_Sub2_Sub3) this.aClass49_7.method1381((long) arg0);
		if (local11 == null) {
			local11 = new Class1_Sub2_Sub3(this.method2255(arg0).aShort28 & 0xFFFF);
			this.aClass49_7.method1385(local11, (long) arg0);
			return local11;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method2262(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub15 local11 = this.method2286(arg0);
		return local11 == null ? false : local11.method2951(this, this.aClass91_109);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(BI)Z")
	@Override
	public boolean method2272(@OriginalArg(1) int arg0) {
		return this.method2255(arg0).aBoolean334;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
	@Override
	public int method2263(@OriginalArg(0) int arg0) {
		return this.method2255(arg0).aByte18 & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "(II)V")
	public void method2283(@OriginalArg(1) int arg0) {
		this.anInt2931 = arg0;
		this.aClass49_6 = new Class49(this.anInt2931);
		if (Static277.aBoolean412) {
			this.aClass49_7 = new Class49(this.anInt2931);
		} else {
			this.aClass49_7 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method2284() {
		this.aClass49_6.method1379();
		if (this.aClass49_7 != null) {
			this.aClass49_7.method1379();
		}
		Static173.anIntArray329 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IFB)[I")
	@Override
	public int[] method2270(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		@Pc(13) Class1_Sub2_Sub15 local13 = this.method2286(arg0);
		if (local13 == null) {
			return null;
		} else {
			local13.aBoolean273 = true;
			return local13.method2955(this, this.aClass91_109, arg1, this.aBoolean219 || this.method2255(arg0).aBoolean333);
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method2267(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub15 local15 = this.method2286(arg0);
		return local15 == null ? null : local15.method2956(this, this.aClass91_109, this.aBoolean219 || this.method2255(arg0).aBoolean333);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZIFI)Lclient!kn;")
	@Override
	public Class1_Sub2_Sub11_Sub2 method2276(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(8) Class1_Sub2_Sub15 local8 = this.method2286(arg2);
		if (local8 != null && local8.method2951(this, this.aClass91_109)) {
			return arg1 ? local8.aClass1_Sub2_Sub22_1.method4352(this.aClass91_109, this, (double) arg3, arg0, arg0) : local8.aClass1_Sub2_Sub22_1.method4351(arg0, arg0, (double) arg3, this.aClass91_109, this);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(BI)Lclient!nd;")
	private Class1_Sub2_Sub15 method2286(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub15 local11 = (Class1_Sub2_Sub15) this.aClass49_6.method1381((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(26) byte[] local26 = this.aClass91_108.method2495(arg0, 0);
		if (local26 == null) {
			return null;
		} else {
			local11 = new Class1_Sub2_Sub15(new Class1_Sub11(local26));
			this.aClass49_6.method1385(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static123.method2162(this.method2255(arg1).aByte17 & 0xFF, this.method2255(arg1).aByte16 & 0xFF);
		@Pc(21) boolean local21 = false;
		@Pc(32) Class1_Sub2_Sub15 local32 = this.method2286(arg1);
		if (local32 != null) {
			local21 = local32.method2957(this, this.aClass91_109, arg0);
		}
		if (!local21) {
			@Pc(48) Class1_Sub2_Sub3 local48 = this.method2281(arg1);
			local48.method237();
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(II)Z")
	@Override
	public boolean method2275(@OriginalArg(1) int arg0) {
		return !this.method2255(arg0).aBoolean332;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method2268(@OriginalArg(1) int arg0) {
		return this.aBoolean219 || this.method2255(arg0).aBoolean333;
	}
}
