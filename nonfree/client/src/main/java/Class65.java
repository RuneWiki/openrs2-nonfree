import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class65 {

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!te;")
	private Class2 aClass2_158;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!te;")
	public final Class2 aClass2_157 = new Class2();

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class65() {
		this.aClass2_157.aClass2_210 = this.aClass2_157;
		this.aClass2_157.aClass2_209 = this.aClass2_157;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lclient!te;")
	public Class2 method2112() {
		@Pc(6) Class2 local6 = this.aClass2_158;
		if (local6 == this.aClass2_157) {
			this.aClass2_158 = null;
			return null;
		} else {
			this.aClass2_158 = local6.aClass2_210;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method2113() {
		while (true) {
			@Pc(13) Class2 local13 = this.aClass2_157.aClass2_209;
			if (this.aClass2_157 == local13) {
				return;
			}
			local13.method2888();
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lclient!te;")
	public Class2 method2115() {
		@Pc(13) Class2 local13 = this.aClass2_157.aClass2_209;
		if (local13 == this.aClass2_157) {
			this.aClass2_158 = null;
			return null;
		} else {
			this.aClass2_158 = local13.aClass2_209;
			return local13;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!te;)V")
	public void method2116(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_210 != null) {
			arg0.method2888();
		}
		arg0.aClass2_209 = this.aClass2_157;
		arg0.aClass2_210 = this.aClass2_157.aClass2_210;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)Lclient!te;")
	public Class2 method2117() {
		@Pc(12) Class2 local12 = this.aClass2_158;
		if (this.aClass2_157 == local12) {
			this.aClass2_158 = null;
			return null;
		} else {
			this.aClass2_158 = local12.aClass2_209;
			return local12;
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)Lclient!te;")
	public Class2 method2118() {
		@Pc(3) Class2 local3 = this.aClass2_157.aClass2_209;
		if (this.aClass2_157 == local3) {
			return null;
		} else {
			local3.method2888();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(ILclient!te;)V")
	public void method2120(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_210 != null) {
			arg0.method2888();
		}
		arg0.aClass2_210 = this.aClass2_157;
		arg0.aClass2_209 = this.aClass2_157.aClass2_209;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!te;ILclient!te;)V")
	public void method2121(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_210 != null) {
			arg1.method2888();
		}
		arg1.aClass2_210 = arg0.aClass2_210;
		arg1.aClass2_209 = arg0;
		arg1.aClass2_210.aClass2_209 = arg1;
		arg1.aClass2_209.aClass2_210 = arg1;
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)Lclient!te;")
	public Class2 method2122() {
		@Pc(7) Class2 local7 = this.aClass2_157.aClass2_210;
		if (local7 == this.aClass2_157) {
			this.aClass2_158 = null;
			return null;
		} else {
			this.aClass2_158 = local7.aClass2_210;
			return local7;
		}
	}
}
