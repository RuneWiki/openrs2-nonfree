import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class39 {

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "Lclient!sd;")
	private Class21_Sub3 aClass21_Sub3_2;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!sd;")
	public final Class21_Sub3 aClass21_Sub3_1 = new Class21_Sub3();

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class39() {
		this.aClass21_Sub3_1.aClass21_Sub3_9 = this.aClass21_Sub3_1;
		this.aClass21_Sub3_1.aClass21_Sub3_10 = this.aClass21_Sub3_1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Lclient!sd;")
	public Class21_Sub3 method1135() {
		@Pc(6) Class21_Sub3 local6 = this.aClass21_Sub3_2;
		if (local6 == this.aClass21_Sub3_1) {
			this.aClass21_Sub3_2 = null;
			return null;
		} else {
			this.aClass21_Sub3_2 = local6.aClass21_Sub3_9;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Lclient!sd;")
	public Class21_Sub3 method1136() {
		@Pc(7) Class21_Sub3 local7 = this.aClass21_Sub3_1.aClass21_Sub3_9;
		if (this.aClass21_Sub3_1 == local7) {
			this.aClass21_Sub3_2 = null;
			return null;
		} else {
			this.aClass21_Sub3_2 = local7.aClass21_Sub3_9;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)I")
	public int method1137() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class21_Sub3 local19 = this.aClass21_Sub3_1.aClass21_Sub3_9;
		while (local19 != this.aClass21_Sub3_1) {
			local19 = local19.aClass21_Sub3_9;
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V")
	public void method1141() {
		while (true) {
			@Pc(5) Class21_Sub3 local5 = this.aClass21_Sub3_1.aClass21_Sub3_9;
			if (local5 == this.aClass21_Sub3_1) {
				this.aClass21_Sub3_2 = null;
				return;
			}
			local5.method8248();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!sd;I)V")
	public void method1142(@OriginalArg(0) Class21_Sub3 arg0) {
		if (arg0.aClass21_Sub3_10 != null) {
			arg0.method8248();
		}
		arg0.aClass21_Sub3_9 = this.aClass21_Sub3_1;
		arg0.aClass21_Sub3_10 = this.aClass21_Sub3_1.aClass21_Sub3_10;
		arg0.aClass21_Sub3_10.aClass21_Sub3_9 = arg0;
		arg0.aClass21_Sub3_9.aClass21_Sub3_10 = arg0;
	}
}
