import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class125 {

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "Lclient!fr;")
	private Class1_Sub6 aClass1_Sub6_15;

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "Lclient!fr;")
	private final Class1_Sub6 aClass1_Sub6_14 = new Class1_Sub6();

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class125() {
		this.aClass1_Sub6_14.aClass1_Sub6_61 = this.aClass1_Sub6_14;
		this.aClass1_Sub6_14.aClass1_Sub6_62 = this.aClass1_Sub6_14;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)I")
	public int method2419() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class1_Sub6 local16 = this.aClass1_Sub6_14.aClass1_Sub6_61; local16 != this.aClass1_Sub6_14; local16 = local16.aClass1_Sub6_61) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V")
	public void method2420() {
		while (true) {
			@Pc(9) Class1_Sub6 local9 = this.aClass1_Sub6_14.aClass1_Sub6_61;
			if (this.aClass1_Sub6_14 == local9) {
				this.aClass1_Sub6_15 = null;
				return;
			}
			local9.method7811();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)Lclient!fr;")
	public Class1_Sub6 method2421() {
		@Pc(11) Class1_Sub6 local11 = this.aClass1_Sub6_14.aClass1_Sub6_61;
		if (this.aClass1_Sub6_14 == local11) {
			return null;
		} else {
			local11.method7811();
			return local11;
		}
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Lclient!fr;")
	public Class1_Sub6 method2422() {
		@Pc(13) Class1_Sub6 local13 = this.aClass1_Sub6_14.aClass1_Sub6_62;
		if (local13 == this.aClass1_Sub6_14) {
			return null;
		} else {
			local13.method7811();
			return local13;
		}
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)Lclient!fr;")
	public Class1_Sub6 method2423() {
		@Pc(7) Class1_Sub6 local7 = this.aClass1_Sub6_14.aClass1_Sub6_61;
		if (local7 == this.aClass1_Sub6_14) {
			this.aClass1_Sub6_15 = null;
			return null;
		} else {
			this.aClass1_Sub6_15 = local7.aClass1_Sub6_61;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!fr;I)V")
	public void method2424(@OriginalArg(0) Class1_Sub6 arg0) {
		if (arg0.aClass1_Sub6_62 != null) {
			arg0.method7811();
		}
		arg0.aClass1_Sub6_62 = this.aClass1_Sub6_14;
		arg0.aClass1_Sub6_61 = this.aClass1_Sub6_14.aClass1_Sub6_61;
		arg0.aClass1_Sub6_62.aClass1_Sub6_61 = arg0;
		arg0.aClass1_Sub6_61.aClass1_Sub6_62 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZLclient!fr;)V")
	public void method2426(@OriginalArg(1) Class1_Sub6 arg0) {
		if (arg0.aClass1_Sub6_62 != null) {
			arg0.method7811();
		}
		arg0.aClass1_Sub6_62 = this.aClass1_Sub6_14.aClass1_Sub6_62;
		arg0.aClass1_Sub6_61 = this.aClass1_Sub6_14;
		arg0.aClass1_Sub6_62.aClass1_Sub6_61 = arg0;
		arg0.aClass1_Sub6_61.aClass1_Sub6_62 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)Lclient!fr;")
	public Class1_Sub6 method2428() {
		@Pc(6) Class1_Sub6 local6 = this.aClass1_Sub6_15;
		if (this.aClass1_Sub6_14 == local6) {
			this.aClass1_Sub6_15 = null;
			return null;
		} else {
			this.aClass1_Sub6_15 = local6.aClass1_Sub6_61;
			return local6;
		}
	}
}
