import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class71 {

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Lclient!bd;")
	private Class2_Sub1 aClass2_Sub1_15;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Lclient!bd;")
	private final Class2_Sub1 aClass2_Sub1_14 = new Class2_Sub1();

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class71() {
		this.aClass2_Sub1_14.aClass2_Sub1_58 = this.aClass2_Sub1_14;
		this.aClass2_Sub1_14.aClass2_Sub1_57 = this.aClass2_Sub1_14;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Lclient!bd;")
	public Class2_Sub1 method1428() {
		@Pc(11) Class2_Sub1 local11 = this.aClass2_Sub1_15;
		if (local11 == this.aClass2_Sub1_14) {
			this.aClass2_Sub1_15 = null;
			return null;
		} else {
			this.aClass2_Sub1_15 = local11.aClass2_Sub1_57;
			return local11;
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	public void method1429() {
		while (true) {
			@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_14.aClass2_Sub1_57;
			if (local3 == this.aClass2_Sub1_14) {
				this.aClass2_Sub1_15 = null;
				return;
			}
			local3.method5838();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!bd;B)V")
	public void method1430(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_58 != null) {
			arg0.method5838();
		}
		arg0.aClass2_Sub1_58 = this.aClass2_Sub1_14.aClass2_Sub1_58;
		arg0.aClass2_Sub1_57 = this.aClass2_Sub1_14;
		arg0.aClass2_Sub1_58.aClass2_Sub1_57 = arg0;
		arg0.aClass2_Sub1_57.aClass2_Sub1_58 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Lclient!bd;")
	public Class2_Sub1 method1431() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_14.aClass2_Sub1_57;
		if (local7 == this.aClass2_Sub1_14) {
			this.aClass2_Sub1_15 = null;
			return null;
		} else {
			this.aClass2_Sub1_15 = local7.aClass2_Sub1_57;
			return local7;
		}
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(I)I")
	public int method1433() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub1 local11 = this.aClass2_Sub1_14.aClass2_Sub1_57;
		while (this.aClass2_Sub1_14 != local11) {
			local11 = local11.aClass2_Sub1_57;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lclient!bd;")
	public Class2_Sub1 method1434() {
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1_14.aClass2_Sub1_57;
		if (local12 == this.aClass2_Sub1_14) {
			return null;
		} else {
			local12.method5838();
			return local12;
		}
	}
}
