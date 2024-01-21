import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class48 {

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "Lclient!cc;")
	private final Class4_Sub4 aClass4_Sub4_40 = new Class4_Sub4();

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "Lclient!ce;")
	private final Class13 aClass13_1 = new Class13();

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
	private int anInt1862;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
	private final int anInt1861;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "Lclient!sb;")
	private final Class66 aClass66_6;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V")
	public Class48(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		for (local13 = 1; local13 + local13 < arg0; local13 += local13) {
		}
		this.anInt1862 = arg0;
		this.anInt1861 = arg0;
		this.aClass66_6 = new Class66(local13);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IJ)V")
	public void method1389(@OriginalArg(1) long arg0) {
		@Pc(10) Class4_Sub4 local10 = (Class4_Sub4) this.aClass66_6.method1834(arg0);
		if (local10 != null) {
			local10.method2124();
			local10.method2094();
			this.anInt1862++;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(JB)Lclient!cc;")
	public Class4_Sub4 method1390(@OriginalArg(0) long arg0) {
		@Pc(6) Class4_Sub4 local6 = (Class4_Sub4) this.aClass66_6.method1834(arg0);
		if (local6 != null) {
			this.aClass13_1.method289(local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!cc;IJ)V")
	public void method1392(@OriginalArg(0) Class4_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1862 == 0) {
			@Pc(10) Class4_Sub4 local10 = this.aClass13_1.method292();
			local10.method2124();
			local10.method2094();
			if (this.aClass4_Sub4_40 == local10) {
				local10 = this.aClass13_1.method292();
				local10.method2124();
				local10.method2094();
			}
		} else {
			this.anInt1862--;
		}
		this.aClass66_6.method1830(arg0, arg1);
		this.aClass13_1.method289(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public void method1393() {
		while (true) {
			@Pc(18) Class4_Sub4 local18 = this.aClass13_1.method292();
			if (local18 == null) {
				this.anInt1862 = this.anInt1861;
				return;
			}
			local18.method2124();
			local18.method2094();
		}
	}
}
