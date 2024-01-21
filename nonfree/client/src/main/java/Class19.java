import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class19 {

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!ib;")
	private Class2 aClass2_48;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!ib;")
	public final Class2 aClass2_47 = new Class2();

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class19() {
		this.aClass2_47.aClass2_210 = this.aClass2_47;
		this.aClass2_47.aClass2_209 = this.aClass2_47;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Lclient!ib;")
	public Class2 method679() {
		@Pc(14) Class2 local14 = this.aClass2_47.aClass2_209;
		if (local14 == this.aClass2_47) {
			return null;
		} else {
			local14.method3254();
			return local14;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ib;Z)V")
	public void method682(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_210 != null) {
			arg0.method3254();
		}
		arg0.aClass2_210 = this.aClass2_47;
		arg0.aClass2_209 = this.aClass2_47.aClass2_209;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Lclient!ib;")
	public Class2 method683() {
		@Pc(7) Class2 local7 = this.aClass2_47.aClass2_210;
		if (local7 == this.aClass2_47) {
			this.aClass2_48 = null;
			return null;
		} else {
			this.aClass2_48 = local7.aClass2_210;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!ib;)V")
	public void method684(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_210 != null) {
			arg0.method3254();
		}
		arg0.aClass2_209 = this.aClass2_47;
		arg0.aClass2_210 = this.aClass2_47.aClass2_210;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
	public void method685() {
		while (true) {
			@Pc(15) Class2 local15 = this.aClass2_47.aClass2_209;
			if (this.aClass2_47 == local15) {
				return;
			}
			local15.method3254();
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lclient!ib;")
	public Class2 method686() {
		@Pc(6) Class2 local6 = this.aClass2_48;
		if (this.aClass2_47 == local6) {
			this.aClass2_48 = null;
			return null;
		} else {
			this.aClass2_48 = local6.aClass2_209;
			return local6;
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)Lclient!ib;")
	public Class2 method688() {
		@Pc(7) Class2 local7 = this.aClass2_48;
		if (local7 == this.aClass2_47) {
			this.aClass2_48 = null;
			return null;
		} else {
			this.aClass2_48 = local7.aClass2_210;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ib;Lclient!ib;I)V")
	public void method689(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg0.aClass2_210 != null) {
			arg0.method3254();
		}
		arg0.aClass2_209 = arg1;
		arg0.aClass2_210 = arg1.aClass2_210;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Lclient!ib;")
	public Class2 method691() {
		@Pc(12) Class2 local12 = this.aClass2_47.aClass2_209;
		if (local12 == this.aClass2_47) {
			this.aClass2_48 = null;
			return null;
		} else {
			this.aClass2_48 = local12.aClass2_209;
			return local12;
		}
	}
}
