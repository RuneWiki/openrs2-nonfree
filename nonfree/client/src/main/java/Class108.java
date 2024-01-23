import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class108 {

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Lclient!g;")
	private Class2 aClass2_214;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "Lclient!g;")
	public Class2 aClass2_213 = new Class2();

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class108() {
		this.aClass2_213.aClass2_212 = this.aClass2_213;
		this.aClass2_213.aClass2_211 = this.aClass2_213;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Lclient!g;")
	public Class2 method3322() {
		@Pc(12) Class2 local12 = this.aClass2_213.aClass2_212;
		if (this.aClass2_213 == local12) {
			this.aClass2_214 = null;
			return null;
		} else {
			this.aClass2_214 = local12.aClass2_212;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Lclient!g;")
	public Class2 method3324() {
		@Pc(3) Class2 local3 = this.aClass2_213.aClass2_211;
		if (local3 == this.aClass2_213) {
			this.aClass2_214 = null;
			return null;
		} else {
			this.aClass2_214 = local3.aClass2_211;
			return local3;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Lclient!g;")
	public Class2 method3325() {
		@Pc(15) Class2 local15 = this.aClass2_213.aClass2_212;
		if (local15 == this.aClass2_213) {
			return null;
		} else {
			local15.method3314();
			return local15;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!g;)V")
	public void method3327(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_211 != null) {
			arg0.method3314();
		}
		arg0.aClass2_212 = this.aClass2_213.aClass2_212;
		arg0.aClass2_211 = this.aClass2_213;
		arg0.aClass2_211.aClass2_212 = arg0;
		arg0.aClass2_212.aClass2_211 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public void method3328() {
		while (true) {
			@Pc(11) Class2 local11 = this.aClass2_213.aClass2_212;
			if (this.aClass2_213 == local11) {
				return;
			}
			local11.method3314();
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Lclient!g;")
	public Class2 method3329() {
		@Pc(7) Class2 local7 = this.aClass2_214;
		if (this.aClass2_213 == local7) {
			this.aClass2_214 = null;
			return null;
		} else {
			this.aClass2_214 = local7.aClass2_211;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Lclient!g;")
	public Class2 method3331() {
		@Pc(12) Class2 local12 = this.aClass2_214;
		if (this.aClass2_213 == local12) {
			this.aClass2_214 = null;
			return null;
		} else {
			this.aClass2_214 = local12.aClass2_212;
			return local12;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!g;BLclient!g;)V")
	public void method3332(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_211 != null) {
			arg0.method3314();
		}
		arg0.aClass2_211 = arg1.aClass2_211;
		arg0.aClass2_212 = arg1;
		arg0.aClass2_211.aClass2_212 = arg0;
		arg0.aClass2_212.aClass2_211 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!g;I)V")
	public void method3334(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_211 != null) {
			arg0.method3314();
		}
		arg0.aClass2_211 = this.aClass2_213.aClass2_211;
		arg0.aClass2_212 = this.aClass2_213;
		arg0.aClass2_211.aClass2_212 = arg0;
		arg0.aClass2_212.aClass2_211 = arg0;
	}
}
