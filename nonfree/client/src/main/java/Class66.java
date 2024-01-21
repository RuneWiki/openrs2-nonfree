import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class66 {

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!n;")
	private final Class4_Sub1 aClass4_Sub1_53 = new Class4_Sub1();

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!sf;")
	private final Class78 aClass78_1 = new Class78();

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
	private final int anInt2996;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	private int anInt2994;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!db;")
	private final Class20 aClass20_7;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
	public Class66(@OriginalArg(0) int arg0) {
		this.anInt2996 = arg0;
		this.anInt2994 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass20_7 = new Class20(local19);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lclient!wd;")
	public Class4 method2217() {
		return this.aClass20_7.method498();
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	public void method2218() {
		while (true) {
			@Pc(14) Class4_Sub1 local14 = this.aClass78_1.method2676();
			if (local14 == null) {
				this.anInt2994 = this.anInt2996;
				return;
			}
			local14.method3173();
			local14.method3176();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJ)V")
	public void method2220(@OriginalArg(1) long arg0) {
		@Pc(10) Class4_Sub1 local10 = (Class4_Sub1) this.aClass20_7.method505(arg0);
		if (local10 != null) {
			local10.method3173();
			local10.method3176();
			this.anInt2994++;
		}
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lclient!wd;")
	public Class4 method2221() {
		return this.aClass20_7.method504();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!n;J)V")
	public void method2222(@OriginalArg(1) Class4_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2994 == 0) {
			@Pc(19) Class4_Sub1 local19 = this.aClass78_1.method2676();
			local19.method3173();
			local19.method3176();
			if (this.aClass4_Sub1_53 == local19) {
				local19 = this.aClass78_1.method2676();
				local19.method3173();
				local19.method3176();
			}
		} else {
			this.anInt2994--;
		}
		this.aClass20_7.method499(arg1, arg0);
		this.aClass78_1.method2674(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IJ)Lclient!n;")
	public Class4_Sub1 method2225(@OriginalArg(1) long arg0) {
		@Pc(18) Class4_Sub1 local18 = (Class4_Sub1) this.aClass20_7.method505(arg0);
		if (local18 != null) {
			this.aClass78_1.method2674(local18);
		}
		return local18;
	}
}
