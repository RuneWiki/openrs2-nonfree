import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class210 {

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Lclient!ag;")
	private Class2 aClass2_200;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "Lclient!ag;")
	public final Class2 aClass2_199 = new Class2();

	static {
		new Class221("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class210() {
		this.aClass2_199.aClass2_243 = this.aClass2_199;
		this.aClass2_199.aClass2_244 = this.aClass2_199;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!sm;BLclient!ag;)V")
	private void method5031(@OriginalArg(0) Class210 arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_199.aClass2_243;
		this.aClass2_199.aClass2_243 = arg1.aClass2_243;
		arg1.aClass2_243.aClass2_244 = this.aClass2_199;
		if (arg1 != this.aClass2_199) {
			arg1.aClass2_243 = arg0.aClass2_199.aClass2_243;
			arg1.aClass2_243.aClass2_244 = arg1;
			local7.aClass2_244 = arg0.aClass2_199;
			arg0.aClass2_199.aClass2_243 = local7;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLclient!ag;)V")
	public void method5032(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_243 != null) {
			arg0.method5745();
		}
		arg0.aClass2_244 = this.aClass2_199.aClass2_244;
		arg0.aClass2_243 = this.aClass2_199;
		arg0.aClass2_243.aClass2_244 = arg0;
		arg0.aClass2_244.aClass2_243 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lclient!ag;")
	public Class2 method5034() {
		@Pc(11) Class2 local11 = this.aClass2_200;
		if (this.aClass2_199 == local11) {
			this.aClass2_200 = null;
			return null;
		} else {
			this.aClass2_200 = local11.aClass2_243;
			return local11;
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Lclient!ag;")
	public Class2 method5035() {
		@Pc(13) Class2 local13 = this.aClass2_199.aClass2_244;
		if (this.aClass2_199 == local13) {
			this.aClass2_200 = null;
			return null;
		} else {
			this.aClass2_200 = local13.aClass2_244;
			return local13;
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)Lclient!ag;")
	public Class2 method5036() {
		@Pc(7) Class2 local7 = this.aClass2_199.aClass2_243;
		if (local7 == this.aClass2_199) {
			this.aClass2_200 = null;
			return null;
		} else {
			this.aClass2_200 = local7.aClass2_243;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)Lclient!ag;")
	public Class2 method5037() {
		@Pc(6) Class2 local6 = this.aClass2_200;
		if (local6 == this.aClass2_199) {
			this.aClass2_200 = null;
			return null;
		} else {
			this.aClass2_200 = local6.aClass2_244;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)I")
	public int method5038() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class2 local18 = this.aClass2_199.aClass2_244; local18 != this.aClass2_199; local18 = local18.aClass2_244) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)Lclient!ag;")
	public Class2 method5039() {
		@Pc(12) Class2 local12 = this.aClass2_199.aClass2_244;
		if (local12 == this.aClass2_199) {
			return null;
		} else {
			local12.method5745();
			return local12;
		}
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)Z")
	public boolean method5040() {
		return this.aClass2_199 == this.aClass2_199.aClass2_244;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!sm;)V")
	public void method5041(@OriginalArg(1) Class210 arg0) {
		this.method5031(arg0, this.aClass2_199.aClass2_244);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	public void method5043() {
		while (true) {
			@Pc(5) Class2 local5 = this.aClass2_199.aClass2_244;
			if (this.aClass2_199 == local5) {
				this.aClass2_200 = null;
				return;
			}
			local5.method5745();
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(BLclient!ag;)V")
	public void method5044(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_243 != null) {
			arg0.method5745();
		}
		arg0.aClass2_244 = this.aClass2_199;
		arg0.aClass2_243 = this.aClass2_199.aClass2_243;
		arg0.aClass2_243.aClass2_244 = arg0;
		arg0.aClass2_244.aClass2_243 = arg0;
	}
}
