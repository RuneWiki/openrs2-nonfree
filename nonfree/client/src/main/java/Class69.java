import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class69 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!q;")
	private Class4_Sub2 aClass4_Sub2_35 = new Class4_Sub2();

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Lclient!vm;")
	private Class177 aClass177_4 = new Class177();

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	private int anInt2472;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	private int anInt2473;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!lb;")
	private Class97 aClass97_10;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(I)V")
	public Class69(@OriginalArg(0) int arg0) {
		this.anInt2472 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt2473 = arg0;
		this.aClass97_10 = new Class97(local16);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Lclient!si;")
	public Class4 method1928() {
		return this.aClass97_10.method2363();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IJ)Lclient!q;")
	public Class4_Sub2 method1930(@OriginalArg(1) long arg0) {
		@Pc(11) Class4_Sub2 local11 = (Class4_Sub2) this.aClass97_10.method2360(arg0);
		if (local11 != null) {
			this.aClass177_4.method4274(local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public void method1932() {
		this.aClass177_4.method4270();
		this.aClass97_10.method2356();
		this.aClass4_Sub2_35 = new Class4_Sub2();
		this.anInt2472 = this.anInt2473;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(JLclient!q;B)V")
	public void method1933(@OriginalArg(0) long arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		if (this.anInt2472 == 0) {
			@Pc(24) Class4_Sub2 local24 = this.aClass177_4.method4273();
			local24.method4391();
			local24.method4396();
			if (this.aClass4_Sub2_35 == local24) {
				local24 = this.aClass177_4.method4273();
				local24.method4391();
				local24.method4396();
			}
		} else {
			this.anInt2472--;
		}
		this.aClass97_10.method2364(arg1, arg0);
		this.aClass177_4.method4274(arg1);
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Lclient!si;")
	public Class4 method1935() {
		return this.aClass97_10.method2367();
	}
}
