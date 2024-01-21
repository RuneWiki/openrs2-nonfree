import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
	public int anInt3366;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	private int anInt3367;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	public int anInt3368;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Lclient!db;")
	private Class20 aClass20_10;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Lclient!jd;")
	private Class46 aClass46_1247 = Static89.aClass46_836;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)I")
	public int method2483(@OriginalArg(1) int arg0) {
		if (this.aClass20_10 == null) {
			return this.anInt3367;
		} else {
			@Pc(22) Class4_Sub18 local22 = (Class4_Sub18) this.aClass20_10.method505((long) arg0);
			return local22 == null ? this.anInt3367 : local22.anInt2869;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!h;)V")
	private void method2486(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3368 = arg1.method1253();
		} else if (arg0 == 2) {
			this.anInt3366 = arg1.method1253();
		} else if (arg0 == 3) {
			this.aClass46_1247 = arg1.method1247();
		} else if (arg0 == 4) {
			this.anInt3367 = arg1.method1263();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(51) int local51 = arg1.method1252();
			this.aClass20_10 = new Class20(Static117.method2132(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(67) int local67 = arg1.method1263();
				@Pc(77) Class4 local77;
				if (arg0 == 5) {
					local77 = new Class4_Sub22(arg1.method1247());
				} else {
					local77 = new Class4_Sub18(arg1.method1263());
				}
				this.aClass20_10.method499((long) local67, local77);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lclient!jd;")
	public Class46 method2487(@OriginalArg(0) int arg0) {
		if (this.aClass20_10 == null) {
			return this.aClass46_1247;
		} else {
			@Pc(17) Class4_Sub22 local17 = (Class4_Sub22) this.aClass20_10.method505((long) arg0);
			return local17 == null ? this.aClass46_1247 : local17.aClass46_1237;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!h;I)V")
	public void method2488(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1253();
			if (local16 == 0) {
				return;
			}
			this.method2486(local16, arg0);
		}
	}
}
