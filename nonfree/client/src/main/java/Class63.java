import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class63 {

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!ce;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!ce;")
	public Class21 aClass21_3 = new Class21();

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class63() {
		this.aClass21_3.aClass21_11 = this.aClass21_3;
		this.aClass21_3.aClass21_12 = this.aClass21_3;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Lclient!ce;")
	public Class21 method1568() {
		@Pc(7) Class21 local7 = this.aClass21_3.aClass21_11;
		if (local7 == this.aClass21_3) {
			this.aClass21_4 = null;
			return null;
		} else {
			this.aClass21_4 = local7.aClass21_11;
			return local7;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
	public int method1569() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class21 local11 = this.aClass21_3.aClass21_11; local11 != this.aClass21_3; local11 = local11.aClass21_11) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lclient!ce;")
	public Class21 method1571() {
		@Pc(11) Class21 local11 = this.aClass21_4;
		if (local11 == this.aClass21_3) {
			this.aClass21_4 = null;
			return null;
		} else {
			this.aClass21_4 = local11.aClass21_11;
			return local11;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method1572(@OriginalArg(0) Class21 arg0) {
		if (arg0.aClass21_12 != null) {
			arg0.method4639();
		}
		arg0.aClass21_12 = this.aClass21_3.aClass21_12;
		arg0.aClass21_11 = this.aClass21_3;
		arg0.aClass21_12.aClass21_11 = arg0;
		arg0.aClass21_11.aClass21_12 = arg0;
	}
}
