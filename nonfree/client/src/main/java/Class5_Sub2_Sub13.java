import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class5_Sub2_Sub13 extends Class5_Sub2 {

	@OriginalMember(owner = "client!na", name = "D", descriptor = "Lclient!oa;")
	private Class75 aClass75_13;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "I")
	private int anInt2640;

	@OriginalMember(owner = "client!na", name = "T", descriptor = "I")
	public int anInt2644;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "Lclient!dc;")
	private Class20 aClass20_962 = Static144.aClass20_1126;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ce;II)V")
	private void method1963(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2644 = arg0.method3062();
		} else if (arg1 == 2) {
			this.anInt2635 = arg0.method3062();
		} else if (arg1 == 3) {
			this.aClass20_962 = arg0.method3027();
		} else if (arg1 == 4) {
			this.anInt2640 = arg0.method3073();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(38) int local38 = arg0.method3077();
			this.aClass75_13 = new Class75(Static213.method3129(local38));
			for (@Pc(48) int local48 = 0; local48 < local38; local48++) {
				@Pc(56) int local56 = arg0.method3073();
				@Pc(66) Class5 local66;
				if (arg1 == 5) {
					local66 = new Class5_Sub26(arg0.method3027());
				} else {
					local66 = new Class5_Sub20(arg0.method3073());
				}
				this.aClass75_13.method2069(local66, (long) local56);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)I")
	public int method1965(@OriginalArg(1) int arg0) {
		if (this.aClass75_13 == null) {
			return this.anInt2640;
		} else {
			@Pc(25) Class5_Sub20 local25 = (Class5_Sub20) this.aClass75_13.method2072((long) arg0);
			return local25 == null ? this.anInt2640 : local25.anInt2605;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!ce;)V")
	public void method1966(@OriginalArg(1) Class5_Sub6 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3062();
			if (local10 == 0) {
				return;
			}
			this.method1963(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!dc;")
	public Class20 method1969(@OriginalArg(0) int arg0) {
		if (this.aClass75_13 == null) {
			return this.aClass20_962;
		} else {
			@Pc(17) Class5_Sub26 local17 = (Class5_Sub26) this.aClass75_13.method2072((long) arg0);
			return local17 == null ? this.aClass20_962 : local17.aClass20_1432;
		}
	}
}
