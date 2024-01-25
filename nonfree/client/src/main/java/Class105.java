import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class105 {

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Lclient!gv;")
	private Class23 aClass23_22;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Lclient!gv;")
	private final Class23 aClass23_21 = new Class23();

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class105() {
		this.aClass23_21.aClass23_67 = this.aClass23_21;
		this.aClass23_21.aClass23_68 = this.aClass23_21;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lclient!gv;")
	public Class23 method2438() {
		@Pc(12) Class23 local12 = this.aClass23_21.aClass23_67;
		if (local12 == this.aClass23_21) {
			return null;
		} else {
			local12.method8588();
			return local12;
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(B)Z")
	public boolean method2440() {
		return this.aClass23_21.aClass23_67 == this.aClass23_21;
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(B)Lclient!gv;")
	public Class23 method2441() {
		@Pc(14) Class23 local14 = this.aClass23_21.aClass23_68;
		if (this.aClass23_21 == local14) {
			this.aClass23_22 = null;
			return null;
		} else {
			this.aClass23_22 = local14.aClass23_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I")
	public int method2443() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class23 local19 = this.aClass23_21.aClass23_67; local19 != this.aClass23_21; local19 = local19.aClass23_67) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(B)Lclient!gv;")
	public Class23 method2444() {
		@Pc(7) Class23 local7 = this.aClass23_21.aClass23_67;
		if (local7 == this.aClass23_21) {
			this.aClass23_22 = null;
			return null;
		} else {
			this.aClass23_22 = local7.aClass23_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!em", name = "e", descriptor = "(B)V")
	public void method2445() {
		while (true) {
			@Pc(11) Class23 local11 = this.aClass23_21.aClass23_67;
			if (local11 == this.aClass23_21) {
				this.aClass23_22 = null;
				return;
			}
			local11.method8588();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!gv;I)V")
	public void method2447(@OriginalArg(0) Class23 arg0) {
		if (arg0.aClass23_68 != null) {
			arg0.method8588();
		}
		arg0.aClass23_67 = this.aClass23_21;
		arg0.aClass23_68 = this.aClass23_21.aClass23_68;
		arg0.aClass23_68.aClass23_67 = arg0;
		arg0.aClass23_67.aClass23_68 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)Lclient!gv;")
	public Class23 method2448() {
		@Pc(6) Class23 local6 = this.aClass23_22;
		if (this.aClass23_21 == local6) {
			this.aClass23_22 = null;
			return null;
		} else {
			this.aClass23_22 = local6.aClass23_67;
			return local6;
		}
	}
}
