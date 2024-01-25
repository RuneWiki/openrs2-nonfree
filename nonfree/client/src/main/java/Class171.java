import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class171 {

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!pp;")
	private Class2_Sub3 aClass2_Sub3_24;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!pp;")
	private final Class2_Sub3 aClass2_Sub3_23 = new Class2_Sub3();

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class171() {
		this.aClass2_Sub3_23.aClass2_Sub3_61 = this.aClass2_Sub3_23;
		this.aClass2_Sub3_23.aClass2_Sub3_62 = this.aClass2_Sub3_23;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lclient!pp;")
	public Class2_Sub3 method3786() {
		@Pc(11) Class2_Sub3 local11 = this.aClass2_Sub3_24;
		if (local11 == this.aClass2_Sub3_23) {
			this.aClass2_Sub3_24 = null;
			return null;
		} else {
			this.aClass2_Sub3_24 = local11.aClass2_Sub3_61;
			return local11;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lclient!pp;")
	public Class2_Sub3 method3787() {
		@Pc(7) Class2_Sub3 local7 = this.aClass2_Sub3_23.aClass2_Sub3_61;
		if (this.aClass2_Sub3_23 == local7) {
			return null;
		} else {
			local7.method7767();
			return local7;
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public void method3790() {
		while (true) {
			@Pc(13) Class2_Sub3 local13 = this.aClass2_Sub3_23.aClass2_Sub3_61;
			if (this.aClass2_Sub3_23 == local13) {
				this.aClass2_Sub3_24 = null;
				return;
			}
			local13.method7767();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!pp;)V")
	public void method3791(@OriginalArg(1) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub3_62 != null) {
			arg0.method7767();
		}
		arg0.aClass2_Sub3_61 = this.aClass2_Sub3_23;
		arg0.aClass2_Sub3_62 = this.aClass2_Sub3_23.aClass2_Sub3_62;
		arg0.aClass2_Sub3_62.aClass2_Sub3_61 = arg0;
		arg0.aClass2_Sub3_61.aClass2_Sub3_62 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!pp;)V")
	public void method3792(@OriginalArg(1) Class2_Sub3 arg0) {
		if (arg0.aClass2_Sub3_62 != null) {
			arg0.method7767();
		}
		arg0.aClass2_Sub3_61 = this.aClass2_Sub3_23.aClass2_Sub3_61;
		arg0.aClass2_Sub3_62 = this.aClass2_Sub3_23;
		arg0.aClass2_Sub3_62.aClass2_Sub3_61 = arg0;
		arg0.aClass2_Sub3_61.aClass2_Sub3_62 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I")
	public int method3793() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2_Sub3 local11 = this.aClass2_Sub3_23.aClass2_Sub3_61;
		while (local11 != this.aClass2_Sub3_23) {
			local11 = local11.aClass2_Sub3_61;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Lclient!pp;")
	public Class2_Sub3 method3794() {
		@Pc(7) Class2_Sub3 local7 = this.aClass2_Sub3_23.aClass2_Sub3_62;
		if (this.aClass2_Sub3_23 == local7) {
			return null;
		} else {
			local7.method7767();
			return local7;
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)Lclient!pp;")
	public Class2_Sub3 method3796() {
		@Pc(12) Class2_Sub3 local12 = this.aClass2_Sub3_23.aClass2_Sub3_61;
		if (local12 == this.aClass2_Sub3_23) {
			this.aClass2_Sub3_24 = null;
			return null;
		} else {
			this.aClass2_Sub3_24 = local12.aClass2_Sub3_61;
			return local12;
		}
	}
}
