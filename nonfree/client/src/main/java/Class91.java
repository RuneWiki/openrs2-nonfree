import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class91 {

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Lclient!ej;")
	private Class5 aClass5_174;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Lclient!ej;")
	public final Class5 aClass5_173 = new Class5();

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class91() {
		this.aClass5_173.aClass5_209 = this.aClass5_173;
		this.aClass5_173.aClass5_210 = this.aClass5_173;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)Lclient!ej;")
	public Class5 method2678() {
		@Pc(6) Class5 local6 = this.aClass5_174;
		if (local6 == this.aClass5_173) {
			this.aClass5_174 = null;
			return null;
		} else {
			this.aClass5_174 = local6.aClass5_209;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ej;I)V")
	public void method2681(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_210 != null) {
			arg0.method3207();
		}
		arg0.aClass5_210 = this.aClass5_173;
		arg0.aClass5_209 = this.aClass5_173.aClass5_209;
		arg0.aClass5_210.aClass5_209 = arg0;
		arg0.aClass5_209.aClass5_210 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public void method2682() {
		while (true) {
			@Pc(12) Class5 local12 = this.aClass5_173.aClass5_209;
			if (this.aClass5_173 == local12) {
				return;
			}
			local12.method3207();
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)Lclient!ej;")
	public Class5 method2683() {
		@Pc(15) Class5 local15 = this.aClass5_173.aClass5_209;
		if (local15 == this.aClass5_173) {
			return null;
		} else {
			local15.method3207();
			return local15;
		}
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)Lclient!ej;")
	public Class5 method2684() {
		@Pc(3) Class5 local3 = this.aClass5_173.aClass5_209;
		if (local3 == this.aClass5_173) {
			this.aClass5_174 = null;
			return null;
		} else {
			this.aClass5_174 = local3.aClass5_209;
			return local3;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)Lclient!ej;")
	public Class5 method2685() {
		@Pc(2) Class5 local2 = this.aClass5_174;
		if (this.aClass5_173 == local2) {
			this.aClass5_174 = null;
			return null;
		} else {
			this.aClass5_174 = local2.aClass5_210;
			return local2;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!ej;)V")
	public void method2686(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_210 != null) {
			arg0.method3207();
		}
		arg0.aClass5_209 = this.aClass5_173;
		arg0.aClass5_210 = this.aClass5_173.aClass5_210;
		arg0.aClass5_210.aClass5_209 = arg0;
		arg0.aClass5_209.aClass5_210 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)Lclient!ej;")
	public Class5 method2687() {
		@Pc(7) Class5 local7 = this.aClass5_173.aClass5_210;
		if (local7 == this.aClass5_173) {
			this.aClass5_174 = null;
			return null;
		} else {
			this.aClass5_174 = local7.aClass5_210;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ej;ILclient!ej;)V")
	public void method2688(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_210 != null) {
			arg1.method3207();
		}
		arg1.aClass5_210 = arg0.aClass5_210;
		arg1.aClass5_209 = arg0;
		arg1.aClass5_210.aClass5_209 = arg1;
		arg1.aClass5_209.aClass5_210 = arg1;
	}
}
