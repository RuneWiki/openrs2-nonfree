import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class302 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!cv;")
	private Class63 aClass63_2;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!vo;")
	private final Class348 aClass348_115;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Lclient!vo;")
	private final Class348 aClass348_113;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;)V")
	public Class302(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1) {
		this.aClass348_115 = arg1;
		this.aClass348_113 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Lclient!cv;")
	private Class63 method6938() {
		if (this.aClass63_2 == null) {
			this.aClass63_2 = new Class63();
		}
		return this.aClass63_2;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!an;B)Lclient!gs;")
	public Interface9 method6941(@OriginalArg(0) Interface2 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class184 local11 = arg0.method7073();
		if (local11 == Static462.aClass184_12) {
			return new Class320((Class261) arg0);
		} else if (Static418.aClass184_11 == local11) {
			return new Class200(this.method6938(), (Class117) arg0);
		} else if (local11 == Static201.aClass184_6) {
			return new Class241(this.aClass348_113, (Class1) arg0);
		} else if (local11 == Static470.aClass184_13) {
			return new Class241_Sub1(this.aClass348_113, (Class1_Sub1) arg0);
		} else if (Static257.aClass184_8 == local11) {
			return new Class102_Sub2(this.aClass348_113, this.aClass348_115, (Class50_Sub1) arg0);
		} else if (Static360.aClass184_10 == local11) {
			return new Class102_Sub3(this.aClass348_113, this.aClass348_115, (Class50_Sub2) arg0);
		} else if (Static317.aClass184_9 == local11) {
			return new Class102_Sub1(this.aClass348_113, this.aClass348_115, (Class50_Sub3) arg0);
		} else if (Static198.aClass184_5 == local11) {
			return new Class339(this.aClass348_113, this.aClass348_115, (Class306) arg0);
		} else if (local11 == Static542.aClass184_14) {
			return new Class177(this.aClass348_113, (Class170) arg0);
		} else if (Static132.aClass184_3 == local11) {
			return new Class102_Sub1_Sub1(this.aClass348_113, this.aClass348_115, (Class50_Sub3_Sub1) arg0);
		} else {
			return null;
		}
	}
}
