import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class40_Sub1 extends Class40 implements Interface4 {

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
	private int anInt1216 = 50;

	@OriginalMember(owner = "client!dm", name = "X", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!dm", name = "r", descriptor = "Lclient!ak;")
	private Class7 aClass7_57;

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "Lclient!ak;")
	private Class7 aClass7_59;

	@OriginalMember(owner = "client!dm", name = "N", descriptor = "Lclient!gi;")
	private Class64 aClass64_9;

	@OriginalMember(owner = "client!dm", name = "U", descriptor = "Lclient!gi;")
	private Class64 aClass64_10;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!ak;Lclient!ak;Lclient!ak;IZ)V")
	public Class40_Sub1(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aBoolean98 = arg4;
		this.aClass7_57 = arg0;
		this.anInt1216 = arg3;
		this.aClass7_59 = arg2;
		this.aClass64_9 = new Class64(this.anInt1216);
		if (Static240.aBoolean369) {
			this.aClass64_10 = new Class64(this.anInt1216);
		} else {
			this.aClass64_10 = null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(ZI)I")
	@Override
	public int method994(@OriginalArg(1) int arg0) {
		return this.method959(arg0).aByte22 & 0xFF;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method983(@OriginalArg(0) int arg0) {
		return this.method959(arg0).aBoolean362;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	public void method996() {
		this.aClass64_9.method1463();
		if (this.aClass64_10 != null) {
			this.aClass64_10.method1463();
		}
		Static193.anIntArray437 = null;
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(II)V")
	public void method997(@OriginalArg(1) int arg0) {
		this.anInt1216 = arg0;
		this.aClass64_9 = new Class64(this.anInt1216);
		if (Static240.aBoolean369) {
			this.aClass64_10 = new Class64(this.anInt1216);
		} else {
			this.aClass64_10 = null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)I")
	@Override
	public int method985(@OriginalArg(0) int arg0) {
		return this.method959(arg0).aByte21 & 0xFF;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method986(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub14 local10 = this.method1005(arg0);
		return local10 == null ? null : local10.method2930(this, this.aClass7_59, this.aBoolean98 || this.method959(arg0).aBoolean364);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method987(@OriginalArg(1) int arg0) {
		return this.method959(arg0).aBoolean361;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)I")
	@Override
	public int method995(@OriginalArg(0) int arg0) {
		return this.method959(arg0).aByte24 & 0xFF;
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(II)I")
	@Override
	public int method991(@OriginalArg(0) int arg0) {
		return this.method959(arg0).aShort37 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
	@Override
	public void method992(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) boolean local5 = false;
		Static122.method1910(this.method959(arg0).aByte24 & 0xFF, this.method959(arg0).aByte21 & 0xFF);
		@Pc(28) Class1_Sub2_Sub14 local28 = this.method1005(arg0);
		if (local28 != null) {
			local5 = local28.method2931(this, this.aClass7_59, arg1);
		}
		if (!local5) {
			@Pc(46) Class1_Sub2_Sub19 local46 = this.method1002(arg0);
			local46.method4016();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method981(@OriginalArg(1) int arg0) {
		return this.aBoolean98 || this.method959(arg0).aBoolean364;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(BI)Lclient!tl;")
	private Class1_Sub2_Sub19 method1002(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub2_Sub19 local14 = (Class1_Sub2_Sub19) this.aClass64_10.method1471((long) arg0);
		if (local14 == null) {
			local14 = new Class1_Sub2_Sub19(this.method959(arg0).aShort37 & 0xFFFF);
			this.aClass64_10.method1466(local14, (long) arg0);
			return local14;
		} else {
			return local14;
		}
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(II)V")
	public void method1003(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1_Sub2_Sub14 local14 = (Class1_Sub2_Sub14) this.aClass64_9.method1473(); local14 != null; local14 = (Class1_Sub2_Sub14) this.aClass64_9.method1470()) {
			if (local14.aBoolean290) {
				local14.method2927(arg0);
				local14.aBoolean290 = false;
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(ZI)V")
	public void method1004(@OriginalArg(0) boolean arg0) {
		this.aBoolean98 = arg0;
		this.method996();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V")
	@Override
	public void method982(@OriginalArg(0) int arg0) {
		this.method992(arg0, this.aBoolean98 || this.method959(arg0).aBoolean364 ? 64 : 128);
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(II)I")
	@Override
	public int method993(@OriginalArg(0) int arg0) {
		return this.method959(arg0).aByte23 & 0xFF;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(ZI)Lclient!pk;")
	@Override
	protected Class1_Sub2_Sub15 method962(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub14 local8 = this.method1005(arg0);
		return local8 == null ? null : local8.aClass1_Sub2_Sub15_1;
	}

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "(II)Lclient!ok;")
	private Class1_Sub2_Sub14 method1005(@OriginalArg(0) int arg0) {
		@Pc(18) Class1_Sub2_Sub14 local18 = (Class1_Sub2_Sub14) this.aClass64_9.method1471((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(31) byte[] local31 = this.aClass7_57.method253(0, arg0);
		if (local31 == null) {
			return null;
		} else {
			local18 = new Class1_Sub2_Sub14(new Class1_Sub18(local31));
			this.aClass64_9.method1466(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IFIZI)Lclient!ek;")
	@Override
	public Class1_Sub2_Sub2_Sub1 method989(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(19) Class1_Sub2_Sub14 local19 = this.method1005(arg1);
		if (local19 != null && local19.method2924(this, this.aClass7_59)) {
			return arg2 ? local19.aClass1_Sub2_Sub15_1.method3215(this.aClass7_59, this, (double) arg0, arg3, arg3) : local19.aClass1_Sub2_Sub15_1.method3206((double) arg0, arg3, this, arg3, this.aClass7_59);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZI)Z")
	@Override
	public boolean method984(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub14 local4 = this.method1005(arg0);
		return local4 == null ? false : local4.method2924(this, this.aClass7_59);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(FII)[I")
	@Override
	public int[] method988(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub2_Sub14 local13 = this.method1005(arg1);
		if (local13 == null) {
			return null;
		} else {
			local13.aBoolean290 = true;
			return local13.method2925(this, this.aClass7_59, arg0, this.aBoolean98 || this.method959(arg1).aBoolean364);
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(ZI)Z")
	@Override
	public boolean method990(@OriginalArg(1) int arg0) {
		return !this.method959(arg0).aBoolean363;
	}
}
