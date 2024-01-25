import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class170 {

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!paa;")
	private Class1_Sub8 aClass1_Sub8_25;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!paa;")
	private final Class1_Sub8 aClass1_Sub8_24 = new Class1_Sub8();

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class170() {
		this.aClass1_Sub8_24.aClass1_Sub8_62 = this.aClass1_Sub8_24;
		this.aClass1_Sub8_24.aClass1_Sub8_61 = this.aClass1_Sub8_24;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lclient!paa;")
	public Class1_Sub8 method3543() {
		@Pc(13) Class1_Sub8 local13 = this.aClass1_Sub8_24.aClass1_Sub8_62;
		if (local13 == this.aClass1_Sub8_24) {
			return null;
		} else {
			local13.method7712();
			return local13;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lclient!paa;")
	public Class1_Sub8 method3544() {
		@Pc(6) Class1_Sub8 local6 = this.aClass1_Sub8_25;
		if (local6 == this.aClass1_Sub8_24) {
			this.aClass1_Sub8_25 = null;
			return null;
		} else {
			this.aClass1_Sub8_25 = local6.aClass1_Sub8_62;
			return local6;
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public void method3546() {
		while (true) {
			@Pc(11) Class1_Sub8 local11 = this.aClass1_Sub8_24.aClass1_Sub8_62;
			if (local11 == this.aClass1_Sub8_24) {
				this.aClass1_Sub8_25 = null;
				return;
			}
			local11.method7712();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!paa;B)V")
	public void method3549(@OriginalArg(0) Class1_Sub8 arg0) {
		if (arg0.aClass1_Sub8_61 != null) {
			arg0.method7712();
		}
		arg0.aClass1_Sub8_61 = this.aClass1_Sub8_24;
		arg0.aClass1_Sub8_62 = this.aClass1_Sub8_24.aClass1_Sub8_62;
		arg0.aClass1_Sub8_61.aClass1_Sub8_62 = arg0;
		arg0.aClass1_Sub8_62.aClass1_Sub8_61 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!paa;I)V")
	public void method3550(@OriginalArg(0) Class1_Sub8 arg0) {
		if (arg0.aClass1_Sub8_61 != null) {
			arg0.method7712();
		}
		arg0.aClass1_Sub8_61 = this.aClass1_Sub8_24.aClass1_Sub8_61;
		arg0.aClass1_Sub8_62 = this.aClass1_Sub8_24;
		arg0.aClass1_Sub8_61.aClass1_Sub8_62 = arg0;
		arg0.aClass1_Sub8_62.aClass1_Sub8_61 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Lclient!paa;")
	public Class1_Sub8 method3553() {
		@Pc(7) Class1_Sub8 local7 = this.aClass1_Sub8_24.aClass1_Sub8_62;
		if (local7 == this.aClass1_Sub8_24) {
			this.aClass1_Sub8_25 = null;
			return null;
		} else {
			this.aClass1_Sub8_25 = local7.aClass1_Sub8_62;
			return local7;
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)Lclient!paa;")
	public Class1_Sub8 method3554() {
		@Pc(12) Class1_Sub8 local12 = this.aClass1_Sub8_24.aClass1_Sub8_61;
		if (this.aClass1_Sub8_24 == local12) {
			return null;
		} else {
			local12.method7712();
			return local12;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)I")
	public int method3555() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub8 local11 = this.aClass1_Sub8_24.aClass1_Sub8_62;
		while (this.aClass1_Sub8_24 != local11) {
			local11 = local11.aClass1_Sub8_62;
			local7++;
		}
		return local7;
	}
}
