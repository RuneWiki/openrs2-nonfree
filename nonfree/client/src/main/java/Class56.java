import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class56 {

	@OriginalMember(owner = "client!er", name = "k", descriptor = "Lclient!ff;")
	private Class14_Sub2 aClass14_Sub2_14;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Lclient!ff;")
	private final Class14_Sub2 aClass14_Sub2_13 = new Class14_Sub2();

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class56() {
		this.aClass14_Sub2_13.aClass14_Sub2_62 = this.aClass14_Sub2_13;
		this.aClass14_Sub2_13.aClass14_Sub2_61 = this.aClass14_Sub2_13;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)I")
	public int method1915() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class14_Sub2 local11 = this.aClass14_Sub2_13.aClass14_Sub2_61; local11 != this.aClass14_Sub2_13; local11 = local11.aClass14_Sub2_61) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public void method1916() {
		while (true) {
			@Pc(17) Class14_Sub2 local17 = this.aClass14_Sub2_13.aClass14_Sub2_61;
			if (local17 == this.aClass14_Sub2_13) {
				this.aClass14_Sub2_14 = null;
				return;
			}
			local17.method5760();
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)Lclient!ff;")
	public Class14_Sub2 method1917() {
		@Pc(11) Class14_Sub2 local11 = this.aClass14_Sub2_13.aClass14_Sub2_61;
		if (this.aClass14_Sub2_13 == local11) {
			return null;
		} else {
			local11.method5760();
			return local11;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Lclient!ff;")
	public Class14_Sub2 method1920() {
		@Pc(11) Class14_Sub2 local11 = this.aClass14_Sub2_14;
		if (local11 == this.aClass14_Sub2_13) {
			this.aClass14_Sub2_14 = null;
			return null;
		} else {
			this.aClass14_Sub2_14 = local11.aClass14_Sub2_61;
			return local11;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLclient!ff;)V")
	public void method1922(@OriginalArg(1) Class14_Sub2 arg0) {
		if (arg0.aClass14_Sub2_62 != null) {
			arg0.method5760();
		}
		arg0.aClass14_Sub2_62 = this.aClass14_Sub2_13.aClass14_Sub2_62;
		arg0.aClass14_Sub2_61 = this.aClass14_Sub2_13;
		arg0.aClass14_Sub2_62.aClass14_Sub2_61 = arg0;
		arg0.aClass14_Sub2_61.aClass14_Sub2_62 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)Lclient!ff;")
	public Class14_Sub2 method1923() {
		@Pc(11) Class14_Sub2 local11 = this.aClass14_Sub2_13.aClass14_Sub2_61;
		if (local11 == this.aClass14_Sub2_13) {
			this.aClass14_Sub2_14 = null;
			return null;
		} else {
			this.aClass14_Sub2_14 = local11.aClass14_Sub2_61;
			return local11;
		}
	}
}
