import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class162 {

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!ss;")
	private Class3_Sub7 aClass3_Sub7_36;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!ss;")
	private final Class3_Sub7 aClass3_Sub7_35 = new Class3_Sub7();

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class162() {
		this.aClass3_Sub7_35.aClass3_Sub7_54 = this.aClass3_Sub7_35;
		this.aClass3_Sub7_35.aClass3_Sub7_53 = this.aClass3_Sub7_35;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!ss;)V")
	public void method3729(@OriginalArg(1) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub7_53 != null) {
			arg0.method5673();
		}
		arg0.aClass3_Sub7_54 = this.aClass3_Sub7_35;
		arg0.aClass3_Sub7_53 = this.aClass3_Sub7_35.aClass3_Sub7_53;
		arg0.aClass3_Sub7_53.aClass3_Sub7_54 = arg0;
		arg0.aClass3_Sub7_54.aClass3_Sub7_53 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Lclient!ss;")
	public Class3_Sub7 method3730() {
		@Pc(6) Class3_Sub7 local6 = this.aClass3_Sub7_36;
		if (this.aClass3_Sub7_35 == local6) {
			this.aClass3_Sub7_36 = null;
			return null;
		} else {
			this.aClass3_Sub7_36 = local6.aClass3_Sub7_54;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I")
	public int method3732() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class3_Sub7 local19 = this.aClass3_Sub7_35.aClass3_Sub7_54;
		while (this.aClass3_Sub7_35 != local19) {
			local19 = local19.aClass3_Sub7_54;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
	public void method3733() {
		while (true) {
			@Pc(11) Class3_Sub7 local11 = this.aClass3_Sub7_35.aClass3_Sub7_54;
			if (local11 == this.aClass3_Sub7_35) {
				this.aClass3_Sub7_36 = null;
				return;
			}
			local11.method5673();
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(Z)Lclient!ss;")
	public Class3_Sub7 method3734() {
		@Pc(13) Class3_Sub7 local13 = this.aClass3_Sub7_35.aClass3_Sub7_54;
		if (this.aClass3_Sub7_35 == local13) {
			this.aClass3_Sub7_36 = null;
			return null;
		} else {
			this.aClass3_Sub7_36 = local13.aClass3_Sub7_54;
			return local13;
		}
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(Z)Lclient!ss;")
	public Class3_Sub7 method3735() {
		@Pc(7) Class3_Sub7 local7 = this.aClass3_Sub7_35.aClass3_Sub7_54;
		if (local7 == this.aClass3_Sub7_35) {
			return null;
		} else {
			local7.method5673();
			return local7;
		}
	}
}
