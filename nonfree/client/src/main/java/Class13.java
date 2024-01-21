import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class13 {

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Lclient!nj;")
	private Class2 aClass2_20;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "Lclient!nj;")
	public final Class2 aClass2_19 = new Class2();

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class13() {
		this.aClass2_19.aClass2_210 = this.aClass2_19;
		this.aClass2_19.aClass2_209 = this.aClass2_19;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Lclient!nj;")
	public Class2 method301() {
		@Pc(3) Class2 local3 = this.aClass2_19.aClass2_209;
		if (local3 == this.aClass2_19) {
			return null;
		} else {
			local3.method3183();
			return local3;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lclient!nj;")
	public Class2 method303() {
		@Pc(3) Class2 local3 = this.aClass2_19.aClass2_209;
		if (this.aClass2_19 == local3) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local3.aClass2_209;
			return local3;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!nj;)V")
	public void method304(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_210 != null) {
			arg0.method3183();
		}
		arg0.aClass2_210 = this.aClass2_19.aClass2_210;
		arg0.aClass2_209 = this.aClass2_19;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!nj;Lclient!nj;B)V")
	public void method305(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_210 != null) {
			arg1.method3183();
		}
		arg1.aClass2_210 = arg0.aClass2_210;
		arg1.aClass2_209 = arg0;
		arg1.aClass2_210.aClass2_209 = arg1;
		arg1.aClass2_209.aClass2_210 = arg1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method306(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_210 != null) {
			arg0.method3183();
		}
		arg0.aClass2_209 = this.aClass2_19.aClass2_209;
		arg0.aClass2_210 = this.aClass2_19;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Lclient!nj;")
	public Class2 method308() {
		@Pc(3) Class2 local3 = this.aClass2_19.aClass2_210;
		if (local3 == this.aClass2_19) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local3.aClass2_210;
			return local3;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Lclient!nj;")
	public Class2 method309() {
		@Pc(6) Class2 local6 = this.aClass2_20;
		if (this.aClass2_19 == local6) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local6.aClass2_209;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)Lclient!nj;")
	public Class2 method313() {
		@Pc(6) Class2 local6 = this.aClass2_20;
		if (local6 == this.aClass2_19) {
			this.aClass2_20 = null;
			return null;
		} else {
			this.aClass2_20 = local6.aClass2_210;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
	public void method314() {
		while (true) {
			@Pc(13) Class2 local13 = this.aClass2_19.aClass2_209;
			if (this.aClass2_19 == local13) {
				return;
			}
			local13.method3183();
		}
	}
}
