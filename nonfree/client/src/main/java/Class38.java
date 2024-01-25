import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class38 {

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "Lclient!cm;")
	private Class3_Sub3 aClass3_Sub3_21;

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "Lclient!cm;")
	private final Class3_Sub3 aClass3_Sub3_20 = new Class3_Sub3();

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V")
	public Class38() {
		this.aClass3_Sub3_20.aClass3_Sub3_62 = this.aClass3_Sub3_20;
		this.aClass3_Sub3_20.aClass3_Sub3_61 = this.aClass3_Sub3_20;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	public void method1067() {
		while (true) {
			@Pc(5) Class3_Sub3 local5 = this.aClass3_Sub3_20.aClass3_Sub3_61;
			if (this.aClass3_Sub3_20 == local5) {
				this.aClass3_Sub3_21 = null;
				return;
			}
			local5.method7720();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!cm;I)V")
	public void method1068(@OriginalArg(0) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_62 != null) {
			arg0.method7720();
		}
		arg0.aClass3_Sub3_61 = this.aClass3_Sub3_20.aClass3_Sub3_61;
		arg0.aClass3_Sub3_62 = this.aClass3_Sub3_20;
		arg0.aClass3_Sub3_62.aClass3_Sub3_61 = arg0;
		arg0.aClass3_Sub3_61.aClass3_Sub3_62 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BLclient!cm;)V")
	public void method1069(@OriginalArg(1) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub3_62 != null) {
			arg0.method7720();
		}
		arg0.aClass3_Sub3_62 = this.aClass3_Sub3_20.aClass3_Sub3_62;
		arg0.aClass3_Sub3_61 = this.aClass3_Sub3_20;
		arg0.aClass3_Sub3_62.aClass3_Sub3_61 = arg0;
		arg0.aClass3_Sub3_61.aClass3_Sub3_62 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)Lclient!cm;")
	public Class3_Sub3 method1070() {
		@Pc(7) Class3_Sub3 local7 = this.aClass3_Sub3_20.aClass3_Sub3_61;
		if (this.aClass3_Sub3_20 == local7) {
			this.aClass3_Sub3_21 = null;
			return null;
		} else {
			this.aClass3_Sub3_21 = local7.aClass3_Sub3_61;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)I")
	public int method1071() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class3_Sub3 local11 = this.aClass3_Sub3_20.aClass3_Sub3_61; local11 != this.aClass3_Sub3_20; local11 = local11.aClass3_Sub3_61) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)Lclient!cm;")
	public Class3_Sub3 method1072() {
		@Pc(10) Class3_Sub3 local10 = this.aClass3_Sub3_21;
		if (this.aClass3_Sub3_20 == local10) {
			this.aClass3_Sub3_21 = null;
			return null;
		} else {
			this.aClass3_Sub3_21 = local10.aClass3_Sub3_61;
			return local10;
		}
	}

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "(I)Lclient!cm;")
	public Class3_Sub3 method1073() {
		@Pc(11) Class3_Sub3 local11 = this.aClass3_Sub3_20.aClass3_Sub3_61;
		if (local11 == this.aClass3_Sub3_20) {
			return null;
		} else {
			local11.method7720();
			return local11;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)Lclient!cm;")
	public Class3_Sub3 method1074() {
		@Pc(7) Class3_Sub3 local7 = this.aClass3_Sub3_20.aClass3_Sub3_62;
		if (this.aClass3_Sub3_20 == local7) {
			return null;
		} else {
			local7.method7720();
			return local7;
		}
	}
}
